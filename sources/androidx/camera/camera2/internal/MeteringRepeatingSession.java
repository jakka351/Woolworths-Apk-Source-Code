package androidx.camera.camera2.internal;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.MeteringRepeatingSession;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.SupportedRepeatingSurfaceSize;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.Logger;
import androidx.camera.core.UseCase;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.FutureCallback;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.TargetConfig;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* loaded from: classes2.dex */
class MeteringRepeatingSession {

    /* renamed from: a, reason: collision with root package name */
    public ImmediateSurface f277a;
    public SessionConfig b;
    public final MeteringRepeatingConfig c;
    public final Size d;
    public final k e;
    public SessionConfig.CloseableErrorListener f;

    public static class MeteringRepeatingConfig implements UseCaseConfig<UseCase> {
        public final MutableOptionsBundle G;

        public MeteringRepeatingConfig() {
            MutableOptionsBundle mutableOptionsBundleV = MutableOptionsBundle.V();
            mutableOptionsBundleV.G(UseCaseConfig.t, new Camera2SessionOptionUnpacker());
            mutableOptionsBundleV.G(ImageInputConfig.f, 34);
            mutableOptionsBundleV.G(TargetConfig.E, MeteringRepeatingSession.class);
            mutableOptionsBundleV.G(TargetConfig.D, MeteringRepeatingSession.class.getCanonicalName() + "-" + UUID.randomUUID());
            this.G = mutableOptionsBundleV;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig
        public final UseCaseConfigFactory.CaptureType Q() {
            return UseCaseConfigFactory.CaptureType.i;
        }

        @Override // androidx.camera.core.impl.ReadableConfig
        public final Config getConfig() {
            return this.G;
        }
    }

    public interface SurfaceResetCallback {
    }

    public MeteringRepeatingSession(CameraCharacteristicsCompat cameraCharacteristicsCompat, DisplayInfoManager displayInfoManager, k kVar) {
        Size size;
        SupportedRepeatingSurfaceSize supportedRepeatingSurfaceSize = new SupportedRepeatingSurfaceSize();
        Size size2 = null;
        this.f = null;
        this.c = new MeteringRepeatingConfig();
        this.e = kVar;
        Size[] sizeArrB = cameraCharacteristicsCompat.b().b(34);
        if (sizeArrB == null) {
            Logger.b("MeteringRepeating", "Can not get output size list.");
            size = new Size(0, 0);
        } else {
            if (supportedRepeatingSurfaceSize.f365a != null && "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL)) {
                ArrayList arrayList = new ArrayList();
                for (Size size3 : sizeArrB) {
                    if (SupportedRepeatingSurfaceSize.c.compare(size3, SupportedRepeatingSurfaceSize.b) >= 0) {
                        arrayList.add(size3);
                    }
                }
                sizeArrB = (Size[]) arrayList.toArray(new Size[0]);
            }
            List listAsList = Arrays.asList(sizeArrB);
            Collections.sort(listAsList, new j0());
            Size sizeE = displayInfoManager.e();
            long jMin = Math.min(sizeE.getWidth() * sizeE.getHeight(), 307200L);
            int length = sizeArrB.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Size size4 = sizeArrB[i];
                long width = size4.getWidth() * size4.getHeight();
                if (width == jMin) {
                    size = size4;
                    break;
                } else if (width <= jMin) {
                    i++;
                    size2 = size4;
                } else if (size2 != null) {
                    size = size2;
                }
            }
            size = (Size) listAsList.get(0);
        }
        this.d = size;
        Logger.a("MeteringRepeating", "MeteringSession SurfaceTexture size: " + size);
        this.b = a();
    }

    public final SessionConfig a() {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        Size size = this.d;
        surfaceTexture.setDefaultBufferSize(size.getWidth(), size.getHeight());
        final Surface surface = new Surface(surfaceTexture);
        SessionConfig.Builder builderM = SessionConfig.Builder.m(this.c, size);
        builderM.u(1);
        ImmediateSurface immediateSurface = new ImmediateSurface(surface);
        this.f277a = immediateSurface;
        Futures.a(Futures.h(immediateSurface.e), new FutureCallback<Void>() { // from class: androidx.camera.camera2.internal.MeteringRepeatingSession.1
            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onFailure(Throwable th) {
                throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th);
            }

            @Override // androidx.camera.core.impl.utils.futures.FutureCallback
            public final void onSuccess(Object obj) {
                surface.release();
                surfaceTexture.release();
            }
        }, CameraXExecutors.a());
        builderM.i(this.f277a, DynamicRange.d, -1);
        SessionConfig.CloseableErrorListener closeableErrorListener = this.f;
        if (closeableErrorListener != null) {
            closeableErrorListener.b();
        }
        SessionConfig.CloseableErrorListener closeableErrorListener2 = new SessionConfig.CloseableErrorListener(new SessionConfig.ErrorListener() { // from class: androidx.camera.camera2.internal.i0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // androidx.camera.core.impl.SessionConfig.ErrorListener
            public final void a(SessionConfig sessionConfig) {
                MeteringRepeatingSession meteringRepeatingSession = this.f375a;
                meteringRepeatingSession.b = meteringRepeatingSession.a();
                k kVar = meteringRepeatingSession.e;
                if (kVar != null) {
                    Camera2CameraImpl camera2CameraImpl = kVar.e;
                    try {
                        if (((Boolean) CallbackToFutureAdapter.a(new k(camera2CameraImpl, 2)).get()).booleanValue()) {
                            MeteringRepeatingSession meteringRepeatingSession2 = camera2CameraImpl.A;
                            SessionConfig sessionConfig2 = meteringRepeatingSession2.b;
                            MeteringRepeatingSession.MeteringRepeatingConfig meteringRepeatingConfig = meteringRepeatingSession2.c;
                            camera2CameraImpl.f.execute(new i(camera2CameraImpl, Camera2CameraImpl.y(meteringRepeatingSession2), sessionConfig2, meteringRepeatingConfig, null, Collections.singletonList(UseCaseConfigFactory.CaptureType.i), 0));
                        }
                    } catch (InterruptedException | ExecutionException e) {
                        throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e);
                    }
                }
            }
        });
        this.f = closeableErrorListener2;
        builderM.o(closeableErrorListener2);
        return builderM.k();
    }
}
