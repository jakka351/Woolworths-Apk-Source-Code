package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanStateManager;
import com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager;
import com.scandit.datacapture.barcode.spark.ui.SparkScanScanningMode;
import com.scandit.datacapture.barcode.spark.ui.SparkScanView$sparkScanCameraStartListener$1;
import com.scandit.datacapture.barcode.spark.ui.SparkScanViewSettings;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureContextListener;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.common.ContextStatus;
import com.scandit.datacapture.core.common.async.Callback;
import com.scandit.datacapture.core.extensions.LambdaExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.battery.BatterySavingHandlerImpl;
import com.scandit.datacapture.core.internal.sdk.battery.BatterySavingManager;
import com.scandit.datacapture.core.source.BatterySavingMode;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.CameraPosition;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.core.source.FrameSourceState;
import com.scandit.datacapture.core.source.TorchState;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.scandit.datacapture.barcode.bc, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0540bc implements SparkScanViewCameraManager, DataCaptureContextListener {
    private static final Semaphore k;
    private static final Lazy l;
    private static final Lazy m;
    private static final Lazy n;
    public static final /* synthetic */ int o = 0;

    /* renamed from: a, reason: collision with root package name */
    private final DataCaptureContext f17390a;
    private final SparkScanStateManager b;
    private final SparkScanViewSettings c;
    private Camera d;
    private Camera e;
    private Camera f;
    private volatile InterfaceC0799qa g;
    private final ExecutorService h;
    private BatterySavingMode i;
    private final BatterySavingHandlerImpl j;

    static {
        new Ab(0);
        k = new Semaphore(1, true);
        l = LazyKt.b(C0920xb.f18264a);
        m = LazyKt.b(C0950zb.f18290a);
        n = LazyKt.b(C0935yb.f18275a);
    }

    public C0540bc(DataCaptureContext dataCaptureContext, SparkScanStateManager stateManager, BatterySavingManager batterySavingManager, SparkScanViewSettings settings, int i) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(stateManager, "stateManager");
        Intrinsics.h(batterySavingManager, "batterySavingManager");
        Intrinsics.h(settings, "settings");
        this.f17390a = dataCaptureContext;
        this.b = stateManager;
        this.c = settings;
        this.h = Executors.newSingleThreadExecutor();
        this.i = BatterySavingMode.OFF;
        Cb cb = new Cb(this);
        BatterySavingHandlerImpl batterySavingHandlerImpl = new BatterySavingHandlerImpl(batterySavingManager);
        batterySavingHandlerImpl.setListener(cb);
        this.j = batterySavingHandlerImpl;
        Camera.Companion companion = Camera.INSTANCE;
        CameraPosition cameraPosition = CameraPosition.WORLD_FACING;
        this.e = companion.getCamera(cameraPosition, a(stateManager.m(), cameraPosition));
        CameraPosition cameraPosition2 = CameraPosition.USER_FACING;
        this.f = companion.getCamera(cameraPosition2, a(stateManager.m(), cameraPosition2));
        dataCaptureContext.addListener(this);
        if (Bb.f17109a[settings.getDefaultCameraPosition().ordinal()] == 1) {
            a(this, this.f);
        } else {
            a(this, this.e);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final void c(Function0 onDone) {
        Intrinsics.h(onDone, "onDone");
        b((Callback) null);
        d(new Qb(this, onDone));
    }

    public final Camera g() {
        return this.d;
    }

    public final DataCaptureContext h() {
        return this.f17390a;
    }

    public final InterfaceC0799qa i() {
        return this.g;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final boolean isTorchAvailable() {
        Camera camera = this.d;
        return camera != null && camera.isTorchAvailable();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
    public final void onFrameSourceChanged(DataCaptureContext dataCaptureContext, FrameSource frameSource) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Camera camera = frameSource instanceof Camera ? (Camera) frameSource : null;
        if (Intrinsics.c(camera, this.e) || Intrinsics.c(camera, this.f)) {
            this.d = camera;
        }
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
    public final void onModeAdded(DataCaptureContext dataCaptureContext, DataCaptureMode dataCaptureMode) {
        DataCaptureContextListener.DefaultImpls.onModeAdded(this, dataCaptureContext, dataCaptureMode);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
    public final void onModeRemoved(DataCaptureContext dataCaptureContext, DataCaptureMode dataCaptureMode) {
        DataCaptureContextListener.DefaultImpls.onModeRemoved(this, dataCaptureContext, dataCaptureMode);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
    public final void onObservationStarted(DataCaptureContext dataCaptureContext) {
        DataCaptureContextListener.DefaultImpls.onObservationStarted(this, dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
    public final void onObservationStopped(DataCaptureContext dataCaptureContext) {
        DataCaptureContextListener.DefaultImpls.onObservationStopped(this, dataCaptureContext);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
    public final void onStatusChanged(DataCaptureContext dataCaptureContext, ContextStatus contextStatus) {
        DataCaptureContextListener.DefaultImpls.onStatusChanged(this, dataCaptureContext, contextStatus);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final void release() {
        this.f17390a.removeListener(this);
        setBatterySavingMode(BatterySavingMode.OFF);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final void setBatterySavingMode(BatterySavingMode batterySavingMode) {
        Intrinsics.h(batterySavingMode, "batterySavingMode");
        this.i = batterySavingMode;
        this.j.setBatterySavingMode(batterySavingMode);
    }

    private final void d(Function0 function0) {
        this.h.submit(new af(4, function0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Function0 block) throws InterruptedException {
        Intrinsics.h(block, "$block");
        k.acquire();
        block.invoke();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final void b(Function0 whenDone) {
        Intrinsics.h(whenDone, "whenDone");
        d(new Gb(this, whenDone));
    }

    public static final void a(C0540bc c0540bc, Function0 function0) {
        c0540bc.getClass();
        function0.invoke();
        k.release();
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final void b(Callback callback) {
        d(new Ub(this, callback));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final void b() {
        d(new C0524ac(this));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final Camera a() {
        return this.d;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final void a(SparkScanView$sparkScanCameraStartListener$1 sparkScanView$sparkScanCameraStartListener$1) {
        this.g = sparkScanView$sparkScanCameraStartListener$1;
    }

    public static final void a(C0540bc c0540bc, Camera camera, Runnable runnable) {
        c0540bc.onFrameSourceChanged(c0540bc.f17390a, camera);
        c0540bc.f17390a.setFrameSource(camera, runnable);
    }

    public static void a(C0540bc c0540bc, Camera camera) {
        c0540bc.onFrameSourceChanged(c0540bc.f17390a, camera);
        c0540bc.f17390a.setFrameSource(camera, null);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final void a(Callback callback) {
        d(new Zb(this, callback));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final void a(TorchState torchState, Function0 whenDone) {
        Intrinsics.h(torchState, "torchState");
        Intrinsics.h(whenDone, "whenDone");
        d(new Mb(this, torchState, whenDone));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final void a(SparkScanScanningMode scanningMode) {
        InterfaceC0799qa interfaceC0799qa;
        Intrinsics.h(scanningMode, "scanningMode");
        Camera camera = this.d;
        if ((camera != null ? camera.getCurrentState() : null) == FrameSourceState.ON && (interfaceC0799qa = this.g) != null) {
            interfaceC0799qa.onCameraOnStart();
        }
        b(LambdaExtensionsKt.Callback(new Vb(this, scanningMode)));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.spark.data.SparkScanViewCameraManager
    public final void a(Function0 whenDone) {
        Intrinsics.h(whenDone, "whenDone");
        d(new Kb(this));
        b((Callback) null);
        d(new Ob(this, whenDone));
        setBatterySavingMode(this.i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0540bc(DataCaptureContext dataCaptureContext, SparkScanStateManager stateManager, BatterySavingManager batterySavingManager, SparkScanViewSettings settings) {
        this(dataCaptureContext, stateManager, batterySavingManager, settings, 0);
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(stateManager, "stateManager");
        Intrinsics.h(batterySavingManager, "batterySavingManager");
        Intrinsics.h(settings, "settings");
    }

    public static final void a(C0540bc c0540bc, TorchState torchState, Function0 function0) {
        Unit unit;
        Camera camera = c0540bc.d;
        if (camera != null) {
            camera._switchToDesiredTorchState(torchState, function0);
            unit = Unit.f24250a;
        } else {
            unit = null;
        }
        if (unit == null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CameraSettings a(SparkScanScanningMode sparkScanScanningMode, CameraPosition cameraPosition) {
        CameraSettings cameraSettings;
        float zoomFactorOut;
        if (sparkScanScanningMode instanceof SparkScanScanningMode.Default) {
            cameraSettings = (CameraSettings) l.getD();
        } else if (sparkScanScanningMode instanceof SparkScanScanningMode.Target) {
            int i = Bb.f17109a[cameraPosition.ordinal()];
            cameraSettings = i != 1 ? i != 2 ? (CameraSettings) m.getD() : (CameraSettings) m.getD() : (CameraSettings) n.getD();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (this.b.u()) {
            zoomFactorOut = this.c.getZoomFactorIn();
        } else {
            zoomFactorOut = this.c.getZoomFactorOut();
        }
        cameraSettings.setZoomFactor(zoomFactorOut);
        return cameraSettings;
    }
}
