package androidx.camera.view;

import android.content.Context;
import android.util.Range;
import android.util.Rational;
import androidx.annotation.RestrictTo;
import androidx.camera.core.Camera;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.Logger;
import androidx.camera.core.Preview;
import androidx.camera.core.ViewPort;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageAnalysisConfig;
import androidx.camera.core.impl.ImageCaptureConfig;
import androidx.camera.core.impl.ImageInputConfig;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.StreamSpec;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.CameraOrientationUtil;
import androidx.camera.core.impl.utils.ContextUtil;
import androidx.camera.core.impl.utils.Threads;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.ScreenFlashWrapper;
import androidx.camera.core.resolutionselector.AspectRatioStrategy;
import androidx.camera.core.resolutionselector.ResolutionSelector;
import androidx.camera.lifecycle.ProcessCameraProvider;
import androidx.camera.video.MediaSpec;
import androidx.camera.video.QualitySelector;
import androidx.camera.video.Recorder;
import androidx.camera.video.VideoCapture;
import androidx.camera.video.VideoRecordEvent;
import androidx.camera.video.VideoSpec;
import androidx.camera.video.impl.VideoCaptureConfig;
import androidx.camera.view.RotationProvider;
import androidx.camera.view.internal.ScreenFlashUiInfo;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import androidx.core.util.Consumer;
import androidx.core.util.Pair;
import androidx.core.util.Preconditions;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

/* loaded from: classes2.dex */
public abstract class CameraController {
    public static final ImageCapture.ScreenFlash z = new AnonymousClass1();

    /* renamed from: a, reason: collision with root package name */
    public final CameraSelector f641a;
    public Preview b;
    public ImageCapture c;
    public ImageAnalysis d;
    public VideoCapture e;
    public final QualitySelector f;
    public final DynamicRange g;
    public final DynamicRange h;
    public final Range i;
    public Camera j;
    public ProcessCameraProviderWrapper k;
    public ViewPort l;
    public Preview.SurfaceProvider m;
    public final RotationProvider n;
    public final e o;
    public final boolean p;
    public final boolean q;
    public final ForwardingLiveData r;
    public final ForwardingLiveData s;
    public final MutableLiveData t;
    public final PendingValue u;
    public final PendingValue v;
    public final PendingValue w;
    public final ListenableFuture x;
    public final HashMap y;

    /* renamed from: androidx.camera.view.CameraController$1, reason: invalid class name */
    public class AnonymousClass1 implements ImageCapture.ScreenFlash {
        @Override // androidx.camera.core.ImageCapture.ScreenFlash
        public final void a(long j, ImageCapture.ScreenFlashListener screenFlashListener) {
            screenFlashListener.onCompleted();
        }

        @Override // androidx.camera.core.ImageCapture.ScreenFlash
        public final void clear() {
        }
    }

    /* renamed from: androidx.camera.view.CameraController$2, reason: invalid class name */
    class AnonymousClass2 implements Consumer<VideoRecordEvent> {
        @Override // androidx.core.util.Consumer
        public final void accept(Object obj) {
            if (!(((VideoRecordEvent) obj) instanceof VideoRecordEvent.Finalize) || !Threads.b()) {
                throw null;
            }
            throw null;
        }
    }

    @Deprecated
    public static final class OutputSize {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface OutputAspectRatio {
        }

        public final String toString() {
            return "aspect ratio: 0 resolution: null";
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface UseCases {
    }

    public CameraController(Context context) {
        ProcessCameraProvider processCameraProvider = ProcessCameraProvider.h;
        ListenableFuture listenableFutureL = Futures.l(ProcessCameraProvider.Companion.a(context), new a(), CameraXExecutors.a());
        this.f641a = CameraSelector.c;
        new HashMap();
        this.f = Recorder.E;
        DynamicRange dynamicRange = DynamicRange.c;
        this.g = dynamicRange;
        this.h = dynamicRange;
        this.i = StreamSpec.f502a;
        this.p = true;
        this.q = true;
        this.r = new ForwardingLiveData();
        this.s = new ForwardingLiveData();
        this.t = new MutableLiveData(0);
        this.u = new PendingValue();
        this.v = new PendingValue();
        this.w = new PendingValue();
        new HashSet();
        this.y = new HashMap();
        Context contextA = ContextUtil.a(context);
        Preview.Builder builder = new Preview.Builder();
        c(builder);
        builder.f418a.G(ImageInputConfig.g, dynamicRange);
        this.b = builder.f();
        ImageCapture.Builder builder2 = new ImageCapture.Builder();
        c(builder2);
        this.c = builder2.f();
        this.d = d(null, null, null);
        this.e = e();
        LifecycleCameraController lifecycleCameraController = (LifecycleCameraController) this;
        this.x = Futures.l(listenableFutureL, new b(lifecycleCameraController, 0), CameraXExecutors.d());
        this.n = new RotationProvider(contextA);
        this.o = new e(lifecycleCameraController);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.camera.core.Preview.SurfaceProvider r6, androidx.camera.core.ViewPort r7) {
        /*
            r5 = this;
            androidx.camera.core.impl.utils.Threads.a()
            androidx.camera.core.Preview$SurfaceProvider r0 = r5.m
            if (r0 == r6) goto Le
            r5.m = r6
            androidx.camera.core.Preview r0 = r5.b
            r0.F(r6)
        Le:
            androidx.camera.core.ViewPort r6 = r5.l
            if (r6 == 0) goto L33
            int r6 = r5.g(r7)
            r0 = 0
            r1 = -1
            if (r6 == r1) goto L20
            androidx.camera.core.resolutionselector.AspectRatioStrategy r2 = new androidx.camera.core.resolutionselector.AspectRatioStrategy
            r2.<init>(r6)
            goto L21
        L20:
            r2 = r0
        L21:
            androidx.camera.core.ViewPort r6 = r5.l
            int r6 = r5.g(r6)
            if (r6 == r1) goto L2e
            androidx.camera.core.resolutionselector.AspectRatioStrategy r0 = new androidx.camera.core.resolutionselector.AspectRatioStrategy
            r0.<init>(r6)
        L2e:
            if (r2 == r0) goto L31
            goto L33
        L31:
            r6 = 0
            goto L34
        L33:
            r6 = 1
        L34:
            r5.l = r7
            androidx.camera.view.RotationProvider r7 = r5.n
            java.util.concurrent.ScheduledExecutorService r0 = androidx.camera.core.impl.utils.executor.CameraXExecutors.d()
            androidx.camera.view.e r1 = r5.o
            java.lang.Object r2 = r7.f653a
            monitor-enter(r2)
            android.view.OrientationEventListener r3 = r7.b     // Catch: java.lang.Throwable -> L4b
            boolean r3 = r3.canDetectOrientation()     // Catch: java.lang.Throwable -> L4b
            if (r3 != 0) goto L4d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            goto L5d
        L4b:
            r6 = move-exception
            goto L66
        L4d:
            java.util.HashMap r3 = r7.c     // Catch: java.lang.Throwable -> L4b
            androidx.camera.view.RotationProvider$ListenerWrapper r4 = new androidx.camera.view.RotationProvider$ListenerWrapper     // Catch: java.lang.Throwable -> L4b
            r4.<init>(r1, r0)     // Catch: java.lang.Throwable -> L4b
            r3.put(r1, r4)     // Catch: java.lang.Throwable -> L4b
            android.view.OrientationEventListener r7 = r7.b     // Catch: java.lang.Throwable -> L4b
            r7.enable()     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
        L5d:
            if (r6 == 0) goto L62
            r5.l()
        L62:
            r5.k()
            return
        L66:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.view.CameraController.a(androidx.camera.core.Preview$SurfaceProvider, androidx.camera.core.ViewPort):void");
    }

    public final void b() {
        Threads.a();
        ProcessCameraProviderWrapper processCameraProviderWrapper = this.k;
        if (processCameraProviderWrapper != null) {
            processCameraProviderWrapper.a(this.b, this.c, this.d, this.e);
        }
        this.b.F(null);
        this.j = null;
        this.m = null;
        this.l = null;
        RotationProvider rotationProvider = this.n;
        e eVar = this.o;
        synchronized (rotationProvider.f653a) {
            try {
                RotationProvider.ListenerWrapper listenerWrapper = (RotationProvider.ListenerWrapper) rotationProvider.c.get(eVar);
                if (listenerWrapper != null) {
                    listenerWrapper.c.set(false);
                    rotationProvider.c.remove(eVar);
                }
                if (rotationProvider.c.isEmpty()) {
                    rotationProvider.b.disable();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(ImageOutputConfig.Builder builder) {
        ViewPort viewPort = this.l;
        if (viewPort != null) {
            int iG = g(viewPort);
            AspectRatioStrategy aspectRatioStrategy = iG != -1 ? new AspectRatioStrategy(iG) : null;
            if (aspectRatioStrategy != null) {
                ResolutionSelector.Builder builder2 = new ResolutionSelector.Builder();
                builder2.f565a = aspectRatioStrategy;
                builder.c(builder2.a());
            }
        }
    }

    public final ImageAnalysis d(Integer num, Integer num2, Integer num3) {
        ImageAnalysis.Builder builder = new ImageAnalysis.Builder();
        MutableOptionsBundle mutableOptionsBundle = builder.f404a;
        if (num != null) {
            mutableOptionsBundle.G(ImageAnalysisConfig.H, num);
        }
        if (num2 != null) {
            mutableOptionsBundle.G(ImageAnalysisConfig.I, num2);
        }
        if (num3 != null) {
            mutableOptionsBundle.G(ImageAnalysisConfig.K, num3);
        }
        c(builder);
        ImageAnalysisConfig imageAnalysisConfig = new ImageAnalysisConfig(OptionsBundle.U(mutableOptionsBundle));
        ImageOutputConfig.J(imageAnalysisConfig);
        return new ImageAnalysis(imageAnalysisConfig);
    }

    public final VideoCapture e() {
        int iG;
        Recorder.Builder builder = new Recorder.Builder();
        QualitySelector qualitySelector = this.f;
        Preconditions.e(qualitySelector, "The specified quality selector can't be null.");
        MediaSpec.Builder builder2 = builder.f592a;
        VideoSpec.Builder builderF = builder2.b().f();
        builderF.c(qualitySelector);
        builder2.c(builderF.a());
        ViewPort viewPort = this.l;
        if (viewPort != null && qualitySelector == Recorder.E && (iG = g(viewPort)) != -1) {
            VideoSpec.Builder builderF2 = builder2.b().f();
            builderF2.b(iG);
            builder2.c(builderF2.a());
        }
        VideoCapture.Builder builder3 = new VideoCapture.Builder(new Recorder(builder2.a(), builder.b, builder.c));
        Range range = this.i;
        Config.Option option = UseCaseConfig.w;
        MutableOptionsBundle mutableOptionsBundle = builder3.f600a;
        mutableOptionsBundle.G(option, range);
        mutableOptionsBundle.G(ImageOutputConfig.k, 0);
        mutableOptionsBundle.G(ImageInputConfig.g, this.g);
        return new VideoCapture(new VideoCaptureConfig(OptionsBundle.U(mutableOptionsBundle)));
    }

    public final ScreenFlashUiInfo f() {
        HashMap map = this.y;
        ScreenFlashUiInfo.ProviderType providerType = ScreenFlashUiInfo.ProviderType.e;
        if (map.get(providerType) != null) {
            return (ScreenFlashUiInfo) map.get(providerType);
        }
        ScreenFlashUiInfo.ProviderType providerType2 = ScreenFlashUiInfo.ProviderType.d;
        if (map.get(providerType2) != null) {
            return (ScreenFlashUiInfo) map.get(providerType2);
        }
        return null;
    }

    public final int g(ViewPort viewPort) {
        int iB = viewPort == null ? 0 : CameraOrientationUtil.b(viewPort.c);
        ProcessCameraProviderWrapper processCameraProviderWrapper = this.k;
        CameraSelector cameraSelector = this.f641a;
        int i = processCameraProviderWrapper == null ? 0 : processCameraProviderWrapper.b(cameraSelector).f490a.i();
        ProcessCameraProviderWrapper processCameraProviderWrapper2 = this.k;
        int iA = CameraOrientationUtil.a(iB, i, processCameraProviderWrapper2 == null || processCameraProviderWrapper2.b(cameraSelector).f490a.d() == 1);
        Rational rational = viewPort.b;
        if (iA == 90 || iA == 270) {
            rational = new Rational(rational.getDenominator(), rational.getNumerator());
        }
        if (rational.equals(new Rational(4, 3))) {
            return 0;
        }
        return rational.equals(new Rational(16, 9)) ? 1 : -1;
    }

    public final boolean h() {
        return this.j != null;
    }

    public final ListenableFuture i(float f) {
        Threads.a();
        return !h() ? this.w.a(Float.valueOf(f)) : this.j.a().c(f);
    }

    public abstract void j();

    public final void k() {
        j();
        this.j = null;
        if (!h()) {
            Logger.a("CameraController", "Use cases not attached to camera.");
            return;
        }
        LiveData liveDataH = this.j.b().h();
        final ForwardingLiveData forwardingLiveData = this.r;
        LiveData liveData = forwardingLiveData.m;
        if (liveData != null) {
            forwardingLiveData.o(liveData);
        }
        forwardingLiveData.m = liveDataH;
        forwardingLiveData.n(liveDataH, new Observer() { // from class: androidx.camera.view.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                forwardingLiveData.m(obj);
            }
        });
        LiveData liveDataM = this.j.b().m();
        final ForwardingLiveData forwardingLiveData2 = this.s;
        LiveData liveData2 = forwardingLiveData2.m;
        if (liveData2 != null) {
            forwardingLiveData2.o(liveData2);
        }
        forwardingLiveData2.m = liveDataM;
        forwardingLiveData2.n(liveDataM, new Observer() { // from class: androidx.camera.view.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                forwardingLiveData2.m(obj);
            }
        });
        PendingValue pendingValue = this.u;
        pendingValue.getClass();
        Threads.a();
        Pair pair = pendingValue.f643a;
        if (pair != null) {
            Boolean bool = (Boolean) pair.b;
            boolean zBooleanValue = bool.booleanValue();
            Threads.a();
            ListenableFuture listenableFutureA = !h() ? pendingValue.a(bool) : this.j.a().d(zBooleanValue);
            CallbackToFutureAdapter.Completer completer = (CallbackToFutureAdapter.Completer) pendingValue.f643a.f2463a;
            Objects.requireNonNull(completer);
            Futures.i(completer, listenableFutureA);
            pendingValue.f643a = null;
        }
        PendingValue pendingValue2 = this.v;
        pendingValue2.getClass();
        Threads.a();
        Pair pair2 = pendingValue2.f643a;
        if (pair2 != null) {
            Float f = (Float) pair2.b;
            float fFloatValue = f.floatValue();
            Threads.a();
            ListenableFuture listenableFutureA2 = !h() ? pendingValue2.a(f) : this.j.a().b(fFloatValue);
            CallbackToFutureAdapter.Completer completer2 = (CallbackToFutureAdapter.Completer) pendingValue2.f643a.f2463a;
            Objects.requireNonNull(completer2);
            Futures.i(completer2, listenableFutureA2);
            pendingValue2.f643a = null;
        }
        PendingValue pendingValue3 = this.w;
        pendingValue3.getClass();
        Threads.a();
        Pair pair3 = pendingValue3.f643a;
        if (pair3 != null) {
            ListenableFuture listenableFutureI = i(((Float) pair3.b).floatValue());
            CallbackToFutureAdapter.Completer completer3 = (CallbackToFutureAdapter.Completer) pendingValue3.f643a.f2463a;
            Objects.requireNonNull(completer3);
            Futures.i(completer3, listenableFutureI);
            pendingValue3.f643a = null;
        }
    }

    public final void l() {
        ProcessCameraProviderWrapper processCameraProviderWrapper = this.k;
        if (processCameraProviderWrapper != null) {
            processCameraProviderWrapper.a(this.b);
        }
        Preview.Builder builder = new Preview.Builder();
        c(builder);
        builder.f418a.G(ImageInputConfig.g, this.h);
        Preview previewF = builder.f();
        this.b = previewF;
        Preview.SurfaceProvider surfaceProvider = this.m;
        if (surfaceProvider != null) {
            previewF.F(surfaceProvider);
        }
        Threads.a();
        Integer numValueOf = Integer.valueOf(this.c.p);
        ProcessCameraProviderWrapper processCameraProviderWrapper2 = this.k;
        if (processCameraProviderWrapper2 != null) {
            processCameraProviderWrapper2.a(this.c);
        }
        int iG = this.c.G();
        ImageCapture.Builder builder2 = new ImageCapture.Builder();
        builder2.f409a.G(ImageCaptureConfig.H, numValueOf);
        c(builder2);
        this.c = builder2.f();
        Threads.a();
        if (iG == 3) {
            Integer numB = this.f641a.b();
            if (numB != null && numB.intValue() != 0) {
                throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
            }
            m();
        }
        ImageCapture imageCapture = this.c;
        imageCapture.getClass();
        Logger.a("ImageCapture", "setFlashMode: flashMode = " + iG);
        if (iG != 0 && iG != 1 && iG != 2) {
            if (iG != 3) {
                throw new IllegalArgumentException(YU.a.d(iG, "Invalid flash mode: "));
            }
            if (imageCapture.u.f530a == null) {
                throw new IllegalArgumentException("ScreenFlash not set for FLASH_MODE_SCREEN");
            }
            if (imageCapture.b() != null) {
                CameraInternal cameraInternalB = imageCapture.b();
                if ((cameraInternalB != null ? cameraInternalB.b().d() : -1) != 0) {
                    throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN");
                }
            }
        }
        synchronized (imageCapture.q) {
            imageCapture.s = iG;
            imageCapture.I();
        }
        Integer num = (Integer) ((ImageAnalysisConfig) this.d.f).c(ImageAnalysisConfig.H, 0);
        num.intValue();
        Integer num2 = (Integer) ((ImageAnalysisConfig) this.d.f).c(ImageAnalysisConfig.I, 6);
        num2.intValue();
        Integer numValueOf2 = Integer.valueOf(this.d.F());
        Threads.a();
        ProcessCameraProviderWrapper processCameraProviderWrapper3 = this.k;
        if (processCameraProviderWrapper3 != null) {
            processCameraProviderWrapper3.a(this.d);
        }
        this.d = d(num, num2, numValueOf2);
        ProcessCameraProviderWrapper processCameraProviderWrapper4 = this.k;
        if (processCameraProviderWrapper4 != null) {
            processCameraProviderWrapper4.a(this.e);
        }
        this.e = e();
    }

    public final void m() {
        ScreenFlashUiInfo screenFlashUiInfoF = f();
        if (screenFlashUiInfoF == null) {
            Logger.a("CameraController", "No ScreenFlash instance set yet, need to wait for controller to be set to either ScreenFlashView or PreviewView");
            ImageCapture imageCapture = this.c;
            imageCapture.getClass();
            ScreenFlashWrapper screenFlashWrapper = new ScreenFlashWrapper(z);
            imageCapture.u = screenFlashWrapper;
            imageCapture.c().n(screenFlashWrapper);
            return;
        }
        ImageCapture imageCapture2 = this.c;
        ImageCapture.ScreenFlash screenFlash = screenFlashUiInfoF.b;
        imageCapture2.getClass();
        ScreenFlashWrapper screenFlashWrapper2 = new ScreenFlashWrapper(screenFlash);
        imageCapture2.u = screenFlashWrapper2;
        imageCapture2.c().n(screenFlashWrapper2);
        Logger.a("CameraController", "Set ScreenFlash instance to ImageCapture, provided by " + screenFlashUiInfoF.f662a.name());
    }
}
