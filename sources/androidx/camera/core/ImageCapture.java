package androidx.camera.core;

import android.graphics.Rect;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.OptIn;
import androidx.annotation.RestrictTo;
import androidx.camera.core.imagecapture.ImageCaptureControl;
import androidx.camera.core.imagecapture.ImagePipeline;
import androidx.camera.core.imagecapture.TakePictureManager;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.IoConfig;
import androidx.camera.core.internal.ScreenFlashWrapper;
import androidx.camera.core.internal.SupportedOutputSizesSorter;
import androidx.camera.core.internal.TargetConfig;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.core.resolutionselector.ResolutionStrategy;
import androidx.core.util.Preconditions;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ImageCapture extends UseCase {
    public static final Defaults A = new Defaults();
    public final int p;
    public final AtomicReference q;
    public final int r;
    public int s;
    public Rational t;
    public ScreenFlashWrapper u;
    public SessionConfig.Builder v;
    public ImagePipeline w;
    public TakePictureManager x;
    public SessionConfig.CloseableErrorListener y;
    public final ImageCaptureControl z;

    public static final class Builder implements UseCaseConfig.Builder<ImageCapture, ImageCaptureConfig, Builder>, ImageOutputConfig.Builder<Builder>, IoConfig.Builder<Builder>, ImageInputConfig.Builder<Builder> {

        /* renamed from: a, reason: collision with root package name */
        public final MutableOptionsBundle f409a;

        public Builder() {
            this(MutableOptionsBundle.V());
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final Object a(int i) {
            this.f409a.G(ImageOutputConfig.i, Integer.valueOf(i));
            return this;
        }

        @Override // androidx.camera.core.ExtendableBuilder
        public final MutableConfig b() {
            return this.f409a;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final Object c(ResolutionSelector resolutionSelector) {
            this.f409a.G(ImageOutputConfig.p, resolutionSelector);
            return this;
        }

        @Override // androidx.camera.core.impl.ImageOutputConfig.Builder
        public final Object d(Size size) {
            this.f409a.G(ImageOutputConfig.l, size);
            return this;
        }

        @Override // androidx.camera.core.impl.UseCaseConfig.Builder
        public final UseCaseConfig e() {
            return new ImageCaptureConfig(OptionsBundle.U(this.f409a));
        }

        public final ImageCapture f() {
            Object objA;
            Object objA2;
            Config.Option option = ImageCaptureConfig.K;
            MutableOptionsBundle mutableOptionsBundle = this.f409a;
            mutableOptionsBundle.getClass();
            Object objA3 = null;
            try {
                objA = mutableOptionsBundle.a(option);
            } catch (IllegalArgumentException unused) {
                objA = null;
            }
            Integer num = (Integer) objA;
            if (num != null) {
                mutableOptionsBundle.G(ImageInputConfig.f, num);
            } else {
                Defaults defaults = ImageCapture.A;
                if (Objects.equals(mutableOptionsBundle.c(ImageCaptureConfig.L, null), 1)) {
                    mutableOptionsBundle.G(ImageInputConfig.f, 4101);
                    mutableOptionsBundle.G(ImageInputConfig.g, DynamicRange.c);
                } else {
                    mutableOptionsBundle.G(ImageInputConfig.f, 256);
                }
            }
            ImageCaptureConfig imageCaptureConfig = new ImageCaptureConfig(OptionsBundle.U(mutableOptionsBundle));
            ImageOutputConfig.J(imageCaptureConfig);
            ImageCapture imageCapture = new ImageCapture(imageCaptureConfig);
            try {
                objA2 = mutableOptionsBundle.a(ImageOutputConfig.l);
            } catch (IllegalArgumentException unused2) {
                objA2 = null;
            }
            Size size = (Size) objA2;
            if (size != null) {
                imageCapture.t = new Rational(size.getWidth(), size.getHeight());
            }
            Config.Option option2 = IoConfig.C;
            Object objC = CameraXExecutors.c();
            try {
                objC = mutableOptionsBundle.a(option2);
            } catch (IllegalArgumentException unused3) {
            }
            Preconditions.e((Executor) objC, "The IO executor can't be null");
            Config.Option option3 = ImageCaptureConfig.I;
            if (mutableOptionsBundle.G.containsKey(option3)) {
                Integer num2 = (Integer) mutableOptionsBundle.a(option3);
                if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
                }
                if (num2.intValue() == 3) {
                    try {
                        objA3 = mutableOptionsBundle.a(ImageCaptureConfig.P);
                    } catch (IllegalArgumentException unused4) {
                    }
                    if (objA3 == null) {
                        throw new IllegalArgumentException("The flash mode is not allowed to set to FLASH_MODE_SCREEN without setting ScreenFlash");
                    }
                }
            }
            return imageCapture;
        }

        public Builder(MutableOptionsBundle mutableOptionsBundle) {
            Object objA;
            this.f409a = mutableOptionsBundle;
            Object objA2 = null;
            try {
                objA = mutableOptionsBundle.a(TargetConfig.E);
            } catch (IllegalArgumentException unused) {
                objA = null;
            }
            Class cls = (Class) objA;
            if (cls != null && !cls.equals(ImageCapture.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            this.f409a.G(UseCaseConfig.z, UseCaseConfigFactory.CaptureType.d);
            MutableOptionsBundle mutableOptionsBundle2 = this.f409a;
            mutableOptionsBundle2.G(TargetConfig.E, ImageCapture.class);
            try {
                objA2 = mutableOptionsBundle2.a(TargetConfig.D);
            } catch (IllegalArgumentException unused2) {
            }
            if (objA2 == null) {
                this.f409a.G(TargetConfig.D, ImageCapture.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }
    }

    @OptIn
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface CaptureMode {
    }

    @OptIn
    @RestrictTo
    public static final class Defaults implements ConfigProvider<ImageCaptureConfig> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImageCaptureConfig f410a;

        static {
            ResolutionSelector.Builder builder = new ResolutionSelector.Builder();
            builder.f565a = AspectRatioStrategy.b;
            builder.b = ResolutionStrategy.c;
            ResolutionSelector resolutionSelectorA = builder.a();
            Builder builder2 = new Builder();
            Config.Option option = UseCaseConfig.v;
            MutableOptionsBundle mutableOptionsBundle = builder2.f409a;
            mutableOptionsBundle.G(option, 4);
            mutableOptionsBundle.G(ImageOutputConfig.h, 0);
            mutableOptionsBundle.G(ImageOutputConfig.p, resolutionSelectorA);
            mutableOptionsBundle.G(ImageCaptureConfig.L, 0);
            mutableOptionsBundle.G(ImageInputConfig.g, DynamicRange.d);
            f410a = new ImageCaptureConfig(OptionsBundle.U(mutableOptionsBundle));
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface FlashMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface FlashType {
    }

    public static class ImageCaptureCapabilitiesImpl implements ImageCaptureCapabilities {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface ImageCaptureError {
    }

    public static final class Metadata {
        public final String toString() {
            return "Metadata{mIsReversedHorizontal=false, mIsReversedVertical=false, mLocation=null}";
        }
    }

    public static abstract class OnImageCapturedCallback {
    }

    public interface OnImageSavedCallback {
    }

    public static final class OutputFileOptions {

        public static final class Builder {
        }

        public final String toString() {
            return "OutputFileOptions{mFile=null, mContentResolver=null, mSaveCollection=null, mContentValues=null, mOutputStream=null, mMetadata=null}";
        }
    }

    public static class OutputFileResults {
    }

    @Target({ElementType.TYPE_USE})
    @OptIn
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface OutputFormat {
    }

    public interface ScreenFlash {
        void a(long j, ScreenFlashListener screenFlashListener);

        void clear();
    }

    public interface ScreenFlashListener {
        void onCompleted();
    }

    public ImageCapture(ImageCaptureConfig imageCaptureConfig) {
        super(imageCaptureConfig);
        this.q = new AtomicReference(null);
        this.s = -1;
        this.t = null;
        this.z = new ImageCaptureControl() { // from class: androidx.camera.core.ImageCapture.1
            @Override // androidx.camera.core.imagecapture.ImageCaptureControl
            public final void a() {
                ImageCapture imageCapture = ImageCapture.this;
                synchronized (imageCapture.q) {
                    try {
                        if (imageCapture.q.get() != null) {
                            return;
                        }
                        imageCapture.q.set(Integer.valueOf(imageCapture.G()));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // androidx.camera.core.imagecapture.ImageCaptureControl
            public final void b() {
                ImageCapture imageCapture = ImageCapture.this;
                synchronized (imageCapture.q) {
                    try {
                        Integer num = (Integer) imageCapture.q.getAndSet(null);
                        if (num == null) {
                            return;
                        }
                        if (num.intValue() != imageCapture.G()) {
                            imageCapture.I();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // androidx.camera.core.imagecapture.ImageCaptureControl
            public final ListenableFuture c(ArrayList arrayList) {
                Threads.a();
                ImageCapture imageCapture = ImageCapture.this;
                return Futures.l(imageCapture.c().e(imageCapture.p, imageCapture.r, arrayList), new androidx.camera.camera2.internal.compat.workaround.b(1), CameraXExecutors.a());
            }
        };
        ImageCaptureConfig imageCaptureConfig2 = (ImageCaptureConfig) this.f;
        Config.Option option = ImageCaptureConfig.H;
        if (imageCaptureConfig2.d(option)) {
            this.p = ((Integer) imageCaptureConfig2.a(option)).intValue();
        } else {
            this.p = 1;
        }
        this.r = ((Integer) imageCaptureConfig2.c(ImageCaptureConfig.O, 0)).intValue();
        this.u = new ScreenFlashWrapper((ScreenFlash) imageCaptureConfig2.c(ImageCaptureConfig.P, null));
    }

    public static boolean H(int i, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i))) {
                return true;
            }
        }
        return false;
    }

    public final void E(boolean z) {
        TakePictureManager takePictureManager;
        Log.d("ImageCapture", "clearPipeline");
        Threads.a();
        SessionConfig.CloseableErrorListener closeableErrorListener = this.y;
        if (closeableErrorListener != null) {
            closeableErrorListener.b();
            this.y = null;
        }
        ImagePipeline imagePipeline = this.w;
        if (imagePipeline != null) {
            imagePipeline.a();
            this.w = null;
        }
        if (z || (takePictureManager = this.x) == null) {
            return;
        }
        takePictureManager.a();
        this.x = null;
    }

    public final SessionConfig.Builder F(String str, ImageCaptureConfig imageCaptureConfig, StreamSpec streamSpec) {
        Threads.a();
        Log.d("ImageCapture", String.format("createPipeline(cameraId: %s, streamSpec: %s)", str, streamSpec));
        Size sizeE = streamSpec.e();
        CameraInternal cameraInternalB = b();
        Objects.requireNonNull(cameraInternalB);
        boolean z = !cameraInternalB.p();
        Size size = null;
        if (this.w != null) {
            Preconditions.f(null, z);
            this.w.a();
        }
        int i = 35;
        if (((Boolean) this.f.c(ImageCaptureConfig.R, Boolean.FALSE)).booleanValue() && b().l().K() != null) {
            ResolutionSelector resolutionSelector = (ResolutionSelector) this.f.c(ImageCaptureConfig.Q, null);
            Map map = Collections.EMPTY_MAP;
            List list = (List) map.get(35);
            if (list == null || list.isEmpty()) {
                i = 256;
                list = (List) map.get(256);
            }
            List list2 = list;
            if (list2 != null && !list2.isEmpty()) {
                if (resolutionSelector != null) {
                    Collections.sort(list2, new CompareSizesByArea(true));
                    CameraInternal cameraInternalB2 = b();
                    Rect rectI = cameraInternalB2.k().i();
                    CameraInfoInternal cameraInfoInternalD = cameraInternalB2.d();
                    ArrayList arrayList = (ArrayList) SupportedOutputSizesSorter.e(resolutionSelector, list2, null, j(), new Rational(rectI.width(), rectI.height()), cameraInfoInternalD.i(), cameraInfoInternalD.d());
                    if (arrayList.isEmpty()) {
                        throw new IllegalArgumentException("The postview ResolutionSelector cannot select a valid size for the postview.");
                    }
                    size = (Size) arrayList.get(0);
                } else {
                    size = (Size) Collections.max(list2, new CompareSizesByArea(false));
                }
            }
        }
        this.w = new ImagePipeline(imageCaptureConfig, sizeE, this.m, z, size, i);
        if (this.x == null) {
            this.x = new TakePictureManager(this.z);
        }
        this.x.d(this.w);
        SessionConfig.Builder builderB = this.w.b(streamSpec.e());
        if (this.p == 2 && !streamSpec.f()) {
            c().l(builderB);
        }
        if (streamSpec.d() != null) {
            builderB.e(streamSpec.d());
        }
        SessionConfig.CloseableErrorListener closeableErrorListener = this.y;
        if (closeableErrorListener != null) {
            closeableErrorListener.b();
        }
        SessionConfig.CloseableErrorListener closeableErrorListener2 = new SessionConfig.CloseableErrorListener(new g(this, 1));
        this.y = closeableErrorListener2;
        builderB.o(closeableErrorListener2);
        return builderB;
    }

    public final int G() {
        int iIntValue;
        synchronized (this.q) {
            iIntValue = this.s;
            if (iIntValue == -1) {
                iIntValue = ((Integer) ((ImageCaptureConfig) this.f).c(ImageCaptureConfig.I, 2)).intValue();
            }
        }
        return iIntValue;
    }

    public final void I() {
        synchronized (this.q) {
            try {
                if (this.q.get() != null) {
                    return;
                }
                c().j(G());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig e(boolean z, UseCaseConfigFactory useCaseConfigFactory) {
        A.getClass();
        ImageCaptureConfig imageCaptureConfig = Defaults.f410a;
        Config configA = useCaseConfigFactory.a(imageCaptureConfig.Q(), this.p);
        if (z) {
            configA = Config.R(configA, imageCaptureConfig);
        }
        if (configA == null) {
            return null;
        }
        return new ImageCaptureConfig(OptionsBundle.U(((Builder) k(configA)).f409a));
    }

    @Override // androidx.camera.core.UseCase
    public final Set i() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig.Builder k(Config config) {
        return new Builder(MutableOptionsBundle.W(config));
    }

    @Override // androidx.camera.core.UseCase
    public final void r() {
        Preconditions.e(b(), "Attached camera cannot be null");
        if (G() == 3) {
            CameraInternal cameraInternalB = b();
            if ((cameraInternalB != null ? cameraInternalB.b().d() : -1) != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
            }
        }
    }

    @Override // androidx.camera.core.UseCase
    public final void s() {
        Logger.a("ImageCapture", "onCameraControlReady");
        I();
        c().n(this.u);
    }

    @Override // androidx.camera.core.UseCase
    public final UseCaseConfig t(CameraInfoInternal cameraInfoInternal, UseCaseConfig.Builder builder) {
        boolean z;
        if (cameraInfoInternal.j().a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            MutableConfig mutableConfigB = builder.b();
            Config.Option option = ImageCaptureConfig.N;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(mutableConfigB.c(option, bool2))) {
                Logger.e("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                if (Logger.d(4, "ImageCapture")) {
                    Log.i("ImageCapture", "Requesting software JPEG due to device quirk.");
                }
                builder.b().G(option, bool2);
            }
        }
        MutableConfig mutableConfigB2 = builder.b();
        Boolean bool3 = Boolean.TRUE;
        Config.Option option2 = ImageCaptureConfig.N;
        Boolean bool4 = Boolean.FALSE;
        boolean z2 = true;
        if (bool3.equals(mutableConfigB2.c(option2, bool4))) {
            if (b() == null || b().l().K() == null) {
                z = true;
            } else {
                Logger.e("ImageCapture", "Software JPEG cannot be used with Extensions.");
                z = false;
            }
            Integer num = (Integer) mutableConfigB2.c(ImageCaptureConfig.K, null);
            if (num != null && num.intValue() != 256) {
                Logger.e("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
                z = false;
            }
            if (!z) {
                Logger.e("ImageCapture", "Unable to support software JPEG. Disabling.");
                mutableConfigB2.G(option2, bool4);
            }
        } else {
            z = false;
        }
        Integer num2 = (Integer) builder.b().c(ImageCaptureConfig.K, null);
        if (num2 != null) {
            if (b() != null && b().l().K() != null && num2.intValue() != 256) {
                z2 = false;
            }
            Preconditions.a("Cannot set non-JPEG buffer format with Extensions enabled.", z2);
            builder.b().G(ImageInputConfig.f, Integer.valueOf(z ? 35 : num2.intValue()));
        } else if (Objects.equals(builder.b().c(ImageCaptureConfig.L, null), 1)) {
            builder.b().G(ImageInputConfig.f, 4101);
            builder.b().G(ImageInputConfig.g, DynamicRange.c);
        } else if (z) {
            builder.b().G(ImageInputConfig.f, 35);
        } else {
            List list = (List) builder.b().c(ImageOutputConfig.o, null);
            if (list == null || H(256, list)) {
                builder.b().G(ImageInputConfig.f, 256);
            } else if (H(35, list)) {
                builder.b().G(ImageInputConfig.f, 35);
            }
        }
        return builder.e();
    }

    public final String toString() {
        return "ImageCapture:".concat(f());
    }

    @Override // androidx.camera.core.UseCase
    public final void v() {
        ScreenFlashWrapper screenFlashWrapper = this.u;
        screenFlashWrapper.c();
        screenFlashWrapper.b();
        TakePictureManager takePictureManager = this.x;
        if (takePictureManager != null) {
            takePictureManager.a();
        }
    }

    @Override // androidx.camera.core.UseCase
    public final StreamSpec w(Config config) {
        this.v.e(config);
        Object[] objArr = {this.v.k()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        D(Collections.unmodifiableList(arrayList));
        StreamSpec.Builder builderG = this.g.g();
        builderG.d(config);
        return builderG.a();
    }

    @Override // androidx.camera.core.UseCase
    public final StreamSpec x(StreamSpec streamSpec, StreamSpec streamSpec2) {
        SessionConfig.Builder builderF = F(d(), (ImageCaptureConfig) this.f, streamSpec);
        this.v = builderF;
        Object[] objArr = {builderF.k()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        D(Collections.unmodifiableList(arrayList));
        o();
        return streamSpec;
    }

    @Override // androidx.camera.core.UseCase
    public final void y() {
        ScreenFlashWrapper screenFlashWrapper = this.u;
        screenFlashWrapper.c();
        screenFlashWrapper.b();
        TakePictureManager takePictureManager = this.x;
        if (takePictureManager != null) {
            takePictureManager.a();
        }
        E(false);
        c().n(null);
    }
}
