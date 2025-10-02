package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageWriter;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.OptIn;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat;
import androidx.camera.camera2.internal.compat.workaround.AeFpsRange;
import androidx.camera.camera2.internal.compat.workaround.AutoFlashAEModeDisabler;
import androidx.camera.camera2.internal.compat.workaround.OverrideAeModeForStillCapture;
import androidx.camera.camera2.interop.Camera2CameraControl;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.CameraControl;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.ImageCapture;
import androidx.camera.core.ImageInfo;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.Logger;
import androidx.camera.core.MetadataImageReader;
import androidx.camera.core.SafeCloseImageReaderProxy;
import androidx.camera.core.ZoomState;
import androidx.camera.core.impl.CameraCaptureCallback;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.ImmediateSurface;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.UseCaseAttachState;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.utils.CompareSizesByArea;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.camera.core.impl.utils.futures.AsyncFunction;
import androidx.camera.core.impl.utils.futures.FutureChain;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.core.internal.CameraCaptureResultImageInfo;
import androidx.camera.core.internal.ImmutableZoomState;
import androidx.camera.core.internal.utils.ZslRingBuffer;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;

@OptIn
/* loaded from: classes2.dex */
public class Camera2CameraControlImpl implements CameraControlInternal {
    public final CameraControlSessionCallback b;
    public final Executor c;
    public final Object d = new Object();
    public final CameraCharacteristicsCompat e;
    public final CameraControlInternal.ControlUpdateCallback f;
    public final SessionConfig.Builder g;
    public final FocusMeteringControl h;
    public final ZoomControl i;
    public final TorchControl j;
    public final ExposureControl k;
    public final ZslControlImpl l;
    public final Camera2CameraControl m;
    public final Camera2CapturePipeline n;
    public final VideoUsageControl o;
    public int p;
    public ImageCapture.ScreenFlash q;
    public volatile boolean r;
    public volatile int s;
    public final AeFpsRange t;
    public final AutoFlashAEModeDisabler u;
    public final AtomicLong v;
    public volatile ListenableFuture w;
    public int x;
    public long y;
    public final CameraCaptureCallbackSet z;

    public static final class CameraCaptureCallbackSet extends CameraCaptureCallback {

        /* renamed from: a, reason: collision with root package name */
        public HashSet f228a;
        public ArrayMap b;

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void a(int i) {
            Iterator it = this.f228a.iterator();
            while (it.hasNext()) {
                CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) it.next();
                try {
                    ((Executor) this.b.get(cameraCaptureCallback)).execute(new c0(i, 1, cameraCaptureCallback));
                } catch (RejectedExecutionException e) {
                    Logger.c("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e);
                }
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void b(int i, CameraCaptureResult cameraCaptureResult) {
            Iterator it = this.f228a.iterator();
            while (it.hasNext()) {
                CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) it.next();
                try {
                    ((Executor) this.b.get(cameraCaptureCallback)).execute(new h(cameraCaptureCallback, i, cameraCaptureResult, 1));
                } catch (RejectedExecutionException e) {
                    Logger.c("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e);
                }
            }
        }

        @Override // androidx.camera.core.impl.CameraCaptureCallback
        public final void c(int i, CameraCaptureFailure cameraCaptureFailure) {
            Iterator it = this.f228a.iterator();
            while (it.hasNext()) {
                CameraCaptureCallback cameraCaptureCallback = (CameraCaptureCallback) it.next();
                try {
                    ((Executor) this.b.get(cameraCaptureCallback)).execute(new h(cameraCaptureCallback, i, cameraCaptureFailure, 0));
                } catch (RejectedExecutionException e) {
                    Logger.c("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e);
                }
            }
        }
    }

    public static final class CameraControlSessionCallback extends CameraCaptureSession.CaptureCallback {
        public static final /* synthetic */ int c = 0;

        /* renamed from: a, reason: collision with root package name */
        public final HashSet f229a = new HashSet();
        public final Executor b;

        public CameraControlSessionCallback(Executor executor) {
            this.b = executor;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            this.b.execute(new b(1, this, totalCaptureResult));
        }
    }

    public interface CaptureResultListener {
        boolean a(TotalCaptureResult totalCaptureResult);
    }

    public Camera2CameraControlImpl(CameraCharacteristicsCompat cameraCharacteristicsCompat, ScheduledExecutorService scheduledExecutorService, Executor executor, CameraControlInternal.ControlUpdateCallback controlUpdateCallback, Quirks quirks) {
        SessionConfig.Builder builder = new SessionConfig.Builder();
        this.g = builder;
        this.p = 0;
        this.r = false;
        this.s = 2;
        this.v = new AtomicLong(0L);
        this.w = Futures.g(null);
        this.x = 1;
        this.y = 0L;
        CameraCaptureCallbackSet cameraCaptureCallbackSet = new CameraCaptureCallbackSet();
        cameraCaptureCallbackSet.f228a = new HashSet();
        cameraCaptureCallbackSet.b = new ArrayMap();
        this.z = cameraCaptureCallbackSet;
        this.e = cameraCharacteristicsCompat;
        this.f = controlUpdateCallback;
        this.c = executor;
        this.o = new VideoUsageControl(executor);
        CameraControlSessionCallback cameraControlSessionCallback = new CameraControlSessionCallback(executor);
        this.b = cameraControlSessionCallback;
        builder.u(this.x);
        builder.g(new CaptureCallbackContainer(cameraControlSessionCallback));
        builder.g(cameraCaptureCallbackSet);
        this.k = new ExposureControl(this, executor);
        this.h = new FocusMeteringControl(this, scheduledExecutorService, executor, quirks);
        this.i = new ZoomControl(this, cameraCharacteristicsCompat, executor);
        this.j = new TorchControl(this, cameraCharacteristicsCompat, executor);
        this.l = new ZslControlImpl(cameraCharacteristicsCompat);
        this.t = new AeFpsRange(quirks);
        this.u = new AutoFlashAEModeDisabler(quirks);
        this.m = new Camera2CameraControl(this, executor);
        this.n = new Camera2CapturePipeline(this, cameraCharacteristicsCompat, quirks, executor, scheduledExecutorService);
    }

    public static int t(CameraCharacteristicsCompat cameraCharacteristicsCompat, int i) {
        int[] iArr = (int[]) cameraCharacteristicsCompat.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        return w(i, iArr) ? i : w(1, iArr) ? 1 : 0;
    }

    public static boolean w(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public static boolean x(TotalCaptureResult totalCaptureResult, long j) {
        Long l;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof TagBundle) && (l = (Long) ((TagBundle) tag).f504a.get("CameraControlSessionUpdateId")) != null && l.longValue() >= j;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void a() {
        VideoUsageControl videoUsageControl = this.o;
        videoUsageControl.f291a.execute(new o0(videoUsageControl, 0));
    }

    @Override // androidx.camera.core.CameraControl
    public final ListenableFuture b(float f) {
        ListenableFuture listenableFutureE;
        ZoomState zoomStateF;
        if (!v()) {
            return Futures.e(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        ZoomControl zoomControl = this.i;
        synchronized (zoomControl.c) {
            try {
                zoomControl.c.e(f);
                zoomStateF = ImmutableZoomState.f(zoomControl.c);
            } catch (IllegalArgumentException e) {
                listenableFutureE = Futures.e(e);
            }
        }
        zoomControl.c(zoomStateF);
        listenableFutureE = CallbackToFutureAdapter.a(new p0(zoomControl, zoomStateF, 1));
        return Futures.h(listenableFutureE);
    }

    @Override // androidx.camera.core.CameraControl
    public final ListenableFuture c(float f) {
        ListenableFuture listenableFutureE;
        ZoomState zoomStateF;
        if (!v()) {
            return Futures.e(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        ZoomControl zoomControl = this.i;
        synchronized (zoomControl.c) {
            try {
                zoomControl.c.f(f);
                zoomStateF = ImmutableZoomState.f(zoomControl.c);
            } catch (IllegalArgumentException e) {
                listenableFutureE = Futures.e(e);
            }
        }
        zoomControl.c(zoomStateF);
        listenableFutureE = CallbackToFutureAdapter.a(new p0(zoomControl, zoomStateF, 0));
        return Futures.h(listenableFutureE);
    }

    @Override // androidx.camera.core.CameraControl
    public final ListenableFuture d(boolean z) {
        ListenableFuture listenableFutureA;
        if (!v()) {
            return Futures.e(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        TorchControl torchControl = this.j;
        if (torchControl.c) {
            TorchControl.b(torchControl.b, Integer.valueOf(z ? 1 : 0));
            listenableFutureA = CallbackToFutureAdapter.a(new g0(torchControl, z, 1));
        } else {
            Logger.a("TorchControl", "Unable to enableTorch due to there is no flash unit.");
            listenableFutureA = Futures.e(new IllegalStateException("No flash unit"));
        }
        return Futures.h(listenableFutureA);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final ListenableFuture e(final int i, final int i2, final ArrayList arrayList) {
        if (v()) {
            final int i3 = this.s;
            return (FutureChain) Futures.m(FutureChain.a(Futures.h(this.w)), new AsyncFunction() { // from class: androidx.camera.camera2.internal.c
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    Camera2CapturePipeline camera2CapturePipeline = this.d.n;
                    int i4 = i;
                    final int i5 = i3;
                    final Camera2CapturePipeline.Pipeline pipelineA = camera2CapturePipeline.a(i4, i5, i2);
                    FutureChain futureChainA = FutureChain.a(pipelineA.a(i5));
                    final ArrayList arrayList2 = arrayList;
                    AsyncFunction asyncFunction = new AsyncFunction() { // from class: androidx.camera.camera2.internal.r
                        @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                        public final ListenableFuture apply(Object obj2) {
                            int iC;
                            int iB;
                            CameraCaptureResult cameraCaptureResult;
                            ImageProxy imageProxy;
                            Camera2CapturePipeline.Pipeline pipeline = pipelineA;
                            Camera2CameraControlImpl camera2CameraControlImpl = pipeline.d;
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList<CaptureConfig> arrayList4 = new ArrayList();
                            Iterator it = arrayList2.iterator();
                            while (true) {
                                CameraCaptureResult cameraCaptureResult2 = null;
                                if (!it.hasNext()) {
                                    break;
                                }
                                CaptureConfig captureConfig = (CaptureConfig) it.next();
                                CaptureConfig.Builder builder = new CaptureConfig.Builder(captureConfig);
                                int i6 = captureConfig.c;
                                if (i6 == 5) {
                                    ZslControlImpl zslControlImpl = camera2CameraControlImpl.l;
                                    if (!zslControlImpl.d && !zslControlImpl.c) {
                                        try {
                                            imageProxy = (ImageProxy) zslControlImpl.b.a();
                                        } catch (NoSuchElementException unused) {
                                            Logger.b("ZslControlImpl", "dequeueImageFromBuffer no such element");
                                            imageProxy = null;
                                        }
                                        if (imageProxy != null) {
                                            ZslControlImpl zslControlImpl2 = camera2CameraControlImpl.l;
                                            zslControlImpl2.getClass();
                                            Image image = imageProxy.getImage();
                                            ImageWriter imageWriter = zslControlImpl2.j;
                                            if (imageWriter != null && image != null) {
                                                try {
                                                    imageWriter.queueInputImage(image);
                                                    ImageInfo imageInfoM0 = imageProxy.M0();
                                                    if (imageInfoM0 instanceof CameraCaptureResultImageInfo) {
                                                        cameraCaptureResult2 = ((CameraCaptureResultImageInfo) imageInfoM0).f528a;
                                                    }
                                                } catch (IllegalStateException e) {
                                                    Logger.b("ZslControlImpl", "enqueueImageToImageWriter throws IllegalStateException = " + e.getMessage());
                                                }
                                            }
                                        }
                                    }
                                }
                                if (cameraCaptureResult2 != null) {
                                    builder.h = cameraCaptureResult2;
                                } else {
                                    int i7 = (pipeline.f248a != 3 || pipeline.f) ? (i6 == -1 || i6 == 5) ? 2 : -1 : 4;
                                    if (i7 != -1) {
                                        builder.c = i7;
                                    }
                                }
                                OverrideAeModeForStillCapture overrideAeModeForStillCapture = pipeline.e;
                                if (overrideAeModeForStillCapture.b && i5 == 0 && overrideAeModeForStillCapture.f358a) {
                                    Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
                                    builder2.c(CaptureRequest.CONTROL_AE_MODE, 3);
                                    builder.c(builder2.a());
                                }
                                arrayList3.add(CallbackToFutureAdapter.a(new q(pipeline, builder)));
                                arrayList4.add(builder.d());
                            }
                            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
                            ArrayList arrayList5 = new ArrayList();
                            for (CaptureConfig captureConfig2 : arrayList4) {
                                CaptureConfig.Builder builder3 = new CaptureConfig.Builder(captureConfig2);
                                if (captureConfig2.c == 5 && (cameraCaptureResult = captureConfig2.h) != null) {
                                    builder3.h = cameraCaptureResult;
                                }
                                if (Collections.unmodifiableList(captureConfig2.f482a).isEmpty() && captureConfig2.f) {
                                    HashSet hashSet = builder3.f483a;
                                    if (hashSet.isEmpty()) {
                                        UseCaseAttachState useCaseAttachState = camera2CameraImpl.d;
                                        useCaseAttachState.getClass();
                                        ArrayList arrayList6 = new ArrayList();
                                        for (Map.Entry entry : useCaseAttachState.b.entrySet()) {
                                            UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo = (UseCaseAttachState.UseCaseAttachInfo) entry.getValue();
                                            if (useCaseAttachInfo.f && useCaseAttachInfo.e) {
                                                arrayList6.add(((UseCaseAttachState.UseCaseAttachInfo) entry.getValue()).f506a);
                                            }
                                        }
                                        Iterator it2 = Collections.unmodifiableCollection(arrayList6).iterator();
                                        while (it2.hasNext()) {
                                            CaptureConfig captureConfig3 = ((SessionConfig) it2.next()).g;
                                            List listUnmodifiableList = Collections.unmodifiableList(captureConfig3.f482a);
                                            if (!listUnmodifiableList.isEmpty()) {
                                                if (captureConfig3.b() != 0 && (iB = captureConfig3.b()) != 0) {
                                                    builder3.b.G(UseCaseConfig.A, Integer.valueOf(iB));
                                                }
                                                if (captureConfig3.c() != 0 && (iC = captureConfig3.c()) != 0) {
                                                    builder3.b.G(UseCaseConfig.B, Integer.valueOf(iC));
                                                }
                                                Iterator it3 = listUnmodifiableList.iterator();
                                                while (it3.hasNext()) {
                                                    hashSet.add((DeferrableSurface) it3.next());
                                                }
                                            }
                                        }
                                        if (hashSet.isEmpty()) {
                                            Logger.e("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
                                        }
                                    } else {
                                        Logger.e("Camera2CameraImpl", "The capture config builder already has surface inside.");
                                    }
                                }
                                arrayList5.add(builder3.d());
                            }
                            camera2CameraImpl.v("Issue capture request", null);
                            camera2CameraImpl.p.e(arrayList5);
                            return Futures.b(arrayList3);
                        }
                    };
                    Executor executor = pipelineA.b;
                    FutureChain futureChain = (FutureChain) Futures.m(futureChainA, asyncFunction, executor);
                    futureChain.addListener(new m(pipelineA, 2), executor);
                    return Futures.h(futureChain);
                }
            }, this.c);
        }
        Logger.e("Camera2CameraControlImp", "Camera is not active.");
        return Futures.e(new CameraControl.OperationCanceledException("Camera is not active."));
    }

    @Override // androidx.camera.core.CameraControl
    public final ListenableFuture f(FocusMeteringAction focusMeteringAction) {
        if (!v()) {
            return Futures.e(new CameraControl.OperationCanceledException("Camera is not active."));
        }
        FocusMeteringControl focusMeteringControl = this.h;
        focusMeteringControl.getClass();
        return Futures.h(CallbackToFutureAdapter.a(new l(3, focusMeteringControl, focusMeteringAction)));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void g() {
        VideoUsageControl videoUsageControl = this.o;
        videoUsageControl.f291a.execute(new o0(videoUsageControl, 1));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void h(Config config) {
        Camera2CameraControl camera2CameraControl = this.m;
        CaptureRequestOptions captureRequestOptionsA = CaptureRequestOptions.Builder.c(config).a();
        synchronized (camera2CameraControl.e) {
            Camera2ImplConfig.Builder builder = camera2CameraControl.f;
            builder.getClass();
            Config.OptionPriority optionPriority = Config.OptionPriority.g;
            for (Config.Option option : captureRequestOptionsA.f()) {
                builder.f223a.X(option, optionPriority, captureRequestOptionsA.a(option));
            }
        }
        Futures.h(CallbackToFutureAdapter.a(new androidx.camera.camera2.interop.a(camera2CameraControl, 0))).addListener(new u(1), CameraXExecutors.a());
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final Rect i() {
        Rect rect = (Rect) this.e.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS);
        }
        rect.getClass();
        return rect;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void j(int i) {
        if (!v()) {
            Logger.e("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.s = i;
        Logger.a("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.s);
        ZslControlImpl zslControlImpl = this.l;
        boolean z = true;
        if (this.s != 1 && this.s != 0) {
            z = false;
        }
        zslControlImpl.d = z;
        this.w = Futures.h(CallbackToFutureAdapter.a(new q(this, 8)));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final Config k() {
        Camera2ImplConfig camera2ImplConfigA;
        Camera2CameraControl camera2CameraControl = this.m;
        synchronized (camera2CameraControl.e) {
            camera2ImplConfigA = camera2CameraControl.f.a();
        }
        return camera2ImplConfigA;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void l(SessionConfig.Builder builder) throws Exception {
        HashMap map;
        StreamConfigurationMap streamConfigurationMap;
        int[] validOutputFormatsForInput;
        final ZslControlImpl zslControlImpl = this.l;
        CameraCharacteristicsCompat cameraCharacteristicsCompat = zslControlImpl.f295a;
        ZslRingBuffer zslRingBuffer = zslControlImpl.b;
        while (!zslRingBuffer.b()) {
            ((ImageProxy) zslRingBuffer.a()).close();
        }
        ImmediateSurface immediateSurface = zslControlImpl.i;
        StreamConfigurationMap streamConfigurationMap2 = null;
        if (immediateSurface != null) {
            SafeCloseImageReaderProxy safeCloseImageReaderProxy = zslControlImpl.g;
            if (safeCloseImageReaderProxy != null) {
                Futures.h(immediateSurface.e).addListener(new m(safeCloseImageReaderProxy, 11), CameraXExecutors.d());
                zslControlImpl.g = null;
            }
            immediateSurface.a();
            zslControlImpl.i = null;
        }
        ImageWriter imageWriter = zslControlImpl.j;
        if (imageWriter != null) {
            imageWriter.close();
            zslControlImpl.j = null;
        }
        if (zslControlImpl.c) {
            builder.u(1);
            return;
        }
        if (zslControlImpl.f) {
            builder.u(1);
            return;
        }
        try {
            streamConfigurationMap2 = (StreamConfigurationMap) cameraCharacteristicsCompat.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        } catch (AssertionError e) {
            Logger.b("ZslControlImpl", "Failed to retrieve StreamConfigurationMap, error = " + e.getMessage());
        }
        if (streamConfigurationMap2 == null || streamConfigurationMap2.getInputFormats() == null) {
            map = new HashMap();
        } else {
            map = new HashMap();
            for (int i : streamConfigurationMap2.getInputFormats()) {
                Size[] inputSizes = streamConfigurationMap2.getInputSizes(i);
                if (inputSizes != null) {
                    Arrays.sort(inputSizes, new CompareSizesByArea(true));
                    map.put(Integer.valueOf(i), inputSizes[0]);
                }
            }
        }
        if (zslControlImpl.e && !map.isEmpty() && map.containsKey(34) && (streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristicsCompat.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)) != null && (validOutputFormatsForInput = streamConfigurationMap.getValidOutputFormatsForInput(34)) != null) {
            for (int i2 : validOutputFormatsForInput) {
                if (i2 == 256) {
                    Size size = (Size) map.get(34);
                    MetadataImageReader metadataImageReader = new MetadataImageReader(size.getWidth(), size.getHeight(), 34, 9);
                    zslControlImpl.h = metadataImageReader.b;
                    zslControlImpl.g = new SafeCloseImageReaderProxy(metadataImageReader);
                    metadataImageReader.f(new q(zslControlImpl, 7), CameraXExecutors.c());
                    ImmediateSurface immediateSurface2 = new ImmediateSurface(zslControlImpl.g.getSurface(), new Size(zslControlImpl.g.getWidth(), zslControlImpl.g.getHeight()), 34);
                    zslControlImpl.i = immediateSurface2;
                    SafeCloseImageReaderProxy safeCloseImageReaderProxy2 = zslControlImpl.g;
                    ListenableFuture listenableFutureH = Futures.h(immediateSurface2.e);
                    Objects.requireNonNull(safeCloseImageReaderProxy2);
                    listenableFutureH.addListener(new m(safeCloseImageReaderProxy2, 11), CameraXExecutors.d());
                    builder.i(zslControlImpl.i, DynamicRange.d, -1);
                    builder.c(zslControlImpl.h);
                    builder.h(new CameraCaptureSession.StateCallback() { // from class: androidx.camera.camera2.internal.ZslControlImpl.1
                        public AnonymousClass1() {
                        }

                        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                        }

                        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
                        public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
                            Surface inputSurface = cameraCaptureSession.getInputSurface();
                            if (inputSurface != null) {
                                ZslControlImpl.this.j = ImageWriter.newInstance(inputSurface, 1);
                            }
                        }
                    });
                    builder.r(new InputConfiguration(zslControlImpl.g.getWidth(), zslControlImpl.g.getHeight(), zslControlImpl.g.a()));
                    return;
                }
            }
        }
        builder.u(1);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final ListenableFuture m(final int i, final int i2) {
        if (v()) {
            final int i3 = this.s;
            return (FutureChain) Futures.m(FutureChain.a(Futures.h(this.w)), new AsyncFunction() { // from class: androidx.camera.camera2.internal.g
                @Override // androidx.camera.core.impl.utils.futures.AsyncFunction
                public final ListenableFuture apply(Object obj) {
                    Camera2CapturePipeline camera2CapturePipeline = this.d.n;
                    int i4 = i;
                    int i5 = i3;
                    return Futures.g(new Camera2CapturePipeline.CameraCapturePipelineImpl(camera2CapturePipeline.a(i4, i5, i2), camera2CapturePipeline.e, i5));
                }
            }, this.c);
        }
        Logger.e("Camera2CameraControlImp", "Camera is not active.");
        return Futures.e(new CameraControl.OperationCanceledException("Camera is not active."));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void n(ImageCapture.ScreenFlash screenFlash) {
        this.q = screenFlash;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public final void o() {
        Camera2CameraControl camera2CameraControl = this.m;
        synchronized (camera2CameraControl.e) {
            camera2CameraControl.f = new Camera2ImplConfig.Builder();
        }
        Futures.h(CallbackToFutureAdapter.a(new androidx.camera.camera2.interop.a(camera2CameraControl, 1))).addListener(new u(1), CameraXExecutors.a());
    }

    public final void p(CaptureResultListener captureResultListener) {
        this.b.f229a.add(captureResultListener);
    }

    public final void q() {
        synchronized (this.d) {
            try {
                int i = this.p;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.p = i - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r(boolean z) {
        int iC;
        int iB;
        CameraCaptureResult cameraCaptureResult;
        this.r = z;
        if (!z) {
            CaptureConfig.Builder builder = new CaptureConfig.Builder();
            builder.c = this.x;
            builder.f = true;
            Camera2ImplConfig.Builder builder2 = new Camera2ImplConfig.Builder();
            builder2.c(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(t(this.e, 1)));
            builder2.c(CaptureRequest.FLASH_MODE, 0);
            builder.c(builder2.a());
            List<CaptureConfig> listSingletonList = Collections.singletonList(builder.d());
            Camera2CameraImpl camera2CameraImpl = Camera2CameraImpl.this;
            listSingletonList.getClass();
            ArrayList arrayList = new ArrayList();
            for (CaptureConfig captureConfig : listSingletonList) {
                CaptureConfig.Builder builder3 = new CaptureConfig.Builder(captureConfig);
                HashSet hashSet = builder3.f483a;
                if (captureConfig.c == 5 && (cameraCaptureResult = captureConfig.h) != null) {
                    builder3.h = cameraCaptureResult;
                }
                if (Collections.unmodifiableList(captureConfig.f482a).isEmpty() && captureConfig.f) {
                    if (hashSet.isEmpty()) {
                        UseCaseAttachState useCaseAttachState = camera2CameraImpl.d;
                        useCaseAttachState.getClass();
                        ArrayList arrayList2 = new ArrayList();
                        for (Map.Entry entry : useCaseAttachState.b.entrySet()) {
                            UseCaseAttachState.UseCaseAttachInfo useCaseAttachInfo = (UseCaseAttachState.UseCaseAttachInfo) entry.getValue();
                            if (useCaseAttachInfo.f && useCaseAttachInfo.e) {
                                arrayList2.add(((UseCaseAttachState.UseCaseAttachInfo) entry.getValue()).f506a);
                            }
                        }
                        Iterator it = Collections.unmodifiableCollection(arrayList2).iterator();
                        while (it.hasNext()) {
                            CaptureConfig captureConfig2 = ((SessionConfig) it.next()).g;
                            List listUnmodifiableList = Collections.unmodifiableList(captureConfig2.f482a);
                            if (!listUnmodifiableList.isEmpty()) {
                                if (captureConfig2.b() != 0 && (iB = captureConfig2.b()) != 0) {
                                    builder3.b.G(UseCaseConfig.A, Integer.valueOf(iB));
                                }
                                if (captureConfig2.c() != 0 && (iC = captureConfig2.c()) != 0) {
                                    builder3.b.G(UseCaseConfig.B, Integer.valueOf(iC));
                                }
                                Iterator it2 = listUnmodifiableList.iterator();
                                while (it2.hasNext()) {
                                    hashSet.add((DeferrableSurface) it2.next());
                                }
                            }
                        }
                        if (hashSet.isEmpty()) {
                            Logger.e("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
                        }
                    } else {
                        Logger.e("Camera2CameraImpl", "The capture config builder already has surface inside.");
                    }
                }
                arrayList.add(builder3.d());
            }
            camera2CameraImpl.v("Issue capture request", null);
            camera2CameraImpl.p.e(arrayList);
        }
        z();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.camera.core.impl.SessionConfig s() {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.camera2.internal.Camera2CameraControlImpl.s():androidx.camera.core.impl.SessionConfig");
    }

    public final int u(int i) {
        int[] iArr = (int[]) this.e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (w(i, iArr)) {
            return i;
        }
        if (w(4, iArr)) {
            return 4;
        }
        return w(1, iArr) ? 1 : 0;
    }

    public final boolean v() {
        int i;
        synchronized (this.d) {
            i = this.p;
        }
        return i > 0;
    }

    public final void y(boolean z) {
        ZoomState zoomStateF;
        Logger.a("Camera2CameraControlImp", "setActive: isActive = " + z);
        FocusMeteringControl focusMeteringControl = this.h;
        if (z != focusMeteringControl.d) {
            focusMeteringControl.d = z;
            if (!focusMeteringControl.d) {
                focusMeteringControl.b();
            }
        }
        ZoomControl zoomControl = this.i;
        if (zoomControl.f != z) {
            zoomControl.f = z;
            if (!z) {
                synchronized (zoomControl.c) {
                    zoomControl.c.f(1.0f);
                    zoomStateF = ImmutableZoomState.f(zoomControl.c);
                }
                zoomControl.c(zoomStateF);
                zoomControl.e.f();
                zoomControl.f292a.z();
            }
        }
        TorchControl torchControl = this.j;
        if (torchControl.e != z) {
            torchControl.e = z;
            if (!z) {
                if (torchControl.g) {
                    torchControl.g = false;
                    torchControl.f290a.r(false);
                    TorchControl.b(torchControl.b, 0);
                }
                CallbackToFutureAdapter.Completer completer = torchControl.f;
                if (completer != null) {
                    completer.d(new CameraControl.OperationCanceledException("Camera is not active."));
                    torchControl.f = null;
                }
            }
        }
        ExposureControl exposureControl = this.k;
        if (z != exposureControl.c) {
            exposureControl.c = z;
            if (!z) {
                synchronized (exposureControl.f273a.f274a) {
                }
            }
        }
        Camera2CameraControl camera2CameraControl = this.m;
        camera2CameraControl.d.execute(new androidx.camera.camera2.interop.b(camera2CameraControl, z, 0));
        if (z) {
            return;
        }
        this.q = null;
        this.o.b.set(0);
        Logger.a("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }

    public final long z() {
        this.y = this.v.getAndIncrement();
        Camera2CameraImpl.this.M();
        return this.y;
    }
}
