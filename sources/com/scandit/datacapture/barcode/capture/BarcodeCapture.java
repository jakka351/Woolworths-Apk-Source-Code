package com.scandit.datacapture.barcode.capture;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.barcode.feedback.BarcodeCaptureFeedback;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureLicenseInfo;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureContextListener;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.common.ContextStatus;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.battery.BatterySavingHandler;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.extensions.FeedbackExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.source.NativeAndroidCamera;
import com.scandit.datacapture.core.source.BatterySavingMode;
import com.scandit.datacapture.core.source.Camera;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FocusGestureStrategy;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u0002:;B\u0019\b\u0000\u0012\u0006\u00104\u001a\u00020\u0005\u0012\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00108B#\b\u0010\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u00106\u001a\u000205¢\u0006\u0004\b7\u00109J\t\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\t\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\u0012\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\u000e\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bJ\u001c\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007J\u0006\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u0015R*\u0010!\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010-\u001a\u0004\u0018\u00010(2\b\u0010#\u001a\u0004\u0018\u00010(8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0013\u00103\u001a\u0004\u0018\u0001008F¢\u0006\u0006\u001a\u0004\b1\u00102¨\u0006<"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;", "Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureProxy;", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureMode;", "_dataCaptureModeImpl", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCapture;", "_impl", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "", "_setDataCaptureContext", "", "jsonData", "updateFromJson", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;", "settings", "Ljava/lang/Runnable;", "whenDone", "applySettings", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSession;", "_session", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "removeListener", "Lcom/scandit/datacapture/barcode/feedback/BarcodeCaptureFeedback;", "value", "e", "Lcom/scandit/datacapture/barcode/feedback/BarcodeCaptureFeedback;", "getFeedback", "()Lcom/scandit/datacapture/barcode/feedback/BarcodeCaptureFeedback;", "setFeedback", "(Lcom/scandit/datacapture/barcode/feedback/BarcodeCaptureFeedback;)V", "feedback", "", "<set-?>", "isEnabled", "()Z", "setEnabled", "(Z)V", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "getPointOfInterest", "()Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "setPointOfInterest", "(Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;)V", "pointOfInterest", "getDataCaptureContext", "()Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureLicenseInfo;", "getBarcodeCaptureLicenseInfo", "()Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureLicenseInfo;", "barcodeCaptureLicenseInfo", "impl", "Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingHandler;", "batterySavingHandler", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCapture;Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingHandler;)V", "(Lcom/scandit/datacapture/core/capture/DataCaptureContext;Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;Lcom/scandit/datacapture/core/internal/sdk/battery/BatterySavingHandler;)V", "Companion", "com/scandit/datacapture/barcode/capture/b", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class BarcodeCapture implements DataCaptureMode, BarcodeCaptureProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final BatterySavingHandler f17404a;
    private final /* synthetic */ BarcodeCaptureProxyAdapter b;
    private DataCaptureContext c;
    private final BarcodeCapture$dataCaptureContextListener$1 d;

    /* renamed from: e, reason: from kotlin metadata */
    private BarcodeCaptureFeedback feedback;
    private final CopyOnWriteArraySet f;
    private final BarcodeCaptureSession g;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCapture$Companion;", "", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureSettings;", "settings", "Lcom/scandit/datacapture/barcode/capture/BarcodeCapture;", "forDataCaptureContext", "", "jsonData", "fromJson", "Lcom/scandit/datacapture/core/source/CameraSettings;", "createRecommendedCameraSettings", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CameraSettings createRecommendedCameraSettings() {
            CameraSettings cameraSettings = new CameraSettings();
            cameraSettings.setFocusGestureStrategy(FocusGestureStrategy.MANUAL_UNTIL_CAPTURE);
            return cameraSettings;
        }

        @JvmStatic
        @NotNull
        public final BarcodeCapture forDataCaptureContext(@Nullable DataCaptureContext dataCaptureContext, @NotNull BarcodeCaptureSettings settings) {
            Intrinsics.h(settings, "settings");
            BarcodeCapture barcodeCapture = new BarcodeCapture(dataCaptureContext, settings, BatterySavingHandler.INSTANCE.defaultHandler(AppAndroidEnvironment.INSTANCE.getApplicationContext()));
            if (dataCaptureContext != null) {
                dataCaptureContext.addMode(barcodeCapture);
            }
            return barcodeCapture;
        }

        @JvmStatic
        @NotNull
        public final BarcodeCapture fromJson(@NotNull DataCaptureContext dataCaptureContext, @NotNull String jsonData) {
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            Intrinsics.h(jsonData, "jsonData");
            return new BarcodeCaptureDeserializer().modeFromJson(dataCaptureContext, jsonData);
        }

        private Companion() {
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [com.scandit.datacapture.barcode.capture.BarcodeCapture$dataCaptureContextListener$1] */
    public BarcodeCapture(@NotNull NativeBarcodeCapture impl, @NotNull BatterySavingHandler batterySavingHandler) {
        Intrinsics.h(impl, "impl");
        Intrinsics.h(batterySavingHandler, "batterySavingHandler");
        this.f17404a = batterySavingHandler;
        this.b = new BarcodeCaptureProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        batterySavingHandler.setListener(new C0555a(this));
        this.d = new DataCaptureContextListener() { // from class: com.scandit.datacapture.barcode.capture.BarcodeCapture$dataCaptureContextListener$1
            @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
            public void onFrameSourceChanged(@NotNull DataCaptureContext dataCaptureContext, @Nullable FrameSource frameSource) {
                Intrinsics.h(dataCaptureContext, "dataCaptureContext");
                BarcodeCapture barcodeCapture = this.f17405a;
                BarcodeCapture.access$applyBatterySavingMode(barcodeCapture, dataCaptureContext, barcodeCapture.f17404a.getShouldSaveBattery());
            }

            @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
            public void onModeAdded(@NotNull DataCaptureContext dataCaptureContext, @NotNull DataCaptureMode dataCaptureMode) {
                DataCaptureContextListener.DefaultImpls.onModeAdded(this, dataCaptureContext, dataCaptureMode);
            }

            @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
            public void onModeRemoved(@NotNull DataCaptureContext dataCaptureContext, @NotNull DataCaptureMode dataCaptureMode) {
                DataCaptureContextListener.DefaultImpls.onModeRemoved(this, dataCaptureContext, dataCaptureMode);
            }

            @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
            public void onObservationStarted(@NotNull DataCaptureContext dataCaptureContext) {
                DataCaptureContextListener.DefaultImpls.onObservationStarted(this, dataCaptureContext);
            }

            @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
            public void onObservationStopped(@NotNull DataCaptureContext dataCaptureContext) {
                DataCaptureContextListener.DefaultImpls.onObservationStopped(this, dataCaptureContext);
            }

            @Override // com.scandit.datacapture.core.capture.DataCaptureContextListener
            public void onStatusChanged(@NotNull DataCaptureContext dataCaptureContext, @NotNull ContextStatus contextStatus) {
                DataCaptureContextListener.DefaultImpls.onStatusChanged(this, dataCaptureContext, contextStatus);
            }
        };
        BarcodeCaptureFeedback barcodeCaptureFeedbackDefaultFeedback = BarcodeCaptureFeedback.INSTANCE.defaultFeedback();
        a(barcodeCaptureFeedbackDefaultFeedback);
        this.feedback = barcodeCaptureFeedbackDefaultFeedback;
        this.f = new CopyOnWriteArraySet();
        getF17413a().addListenerAsync(new BarcodeCaptureListenerReversedAdapter(new C0556b(this), this, null, 4, null));
        BatterySavingMode batterySavingMode = getF17413a().getSettings().getBatterySavingMode();
        Intrinsics.g(batterySavingMode, "_impl().settings.batterySavingMode");
        batterySavingHandler.setBatterySavingMode(batterySavingMode);
        this.g = new BarcodeCaptureSession(new C0557c(impl));
    }

    private final void a(final BarcodeCaptureFeedback barcodeCaptureFeedback) {
        getF17413a().setSuccessFeedback(new NativeFeedback() { // from class: com.scandit.datacapture.barcode.capture.BarcodeCapture$setNativeFeedback$1
            @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
            public void emit() {
                barcodeCaptureFeedback.onScannedSuccessfully$scandit_barcode_capture();
            }

            @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
            public void onFreeResources() {
                barcodeCaptureFeedback.getSuccess().release();
            }

            @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
            public void onLoadResources() {
                FeedbackExtensionsKt.loadSoundResource(barcodeCaptureFeedback.getSuccess());
            }
        });
    }

    public static final void access$applyBatterySavingMode(BarcodeCapture barcodeCapture, DataCaptureContext dataCaptureContext, boolean z) {
        barcodeCapture.getClass();
        FrameSource frameSource = dataCaptureContext != null ? dataCaptureContext.get_frameSource() : null;
        Camera camera = frameSource instanceof Camera ? (Camera) frameSource : null;
        NativeAndroidCamera f18831a = camera != null ? camera.getF18831a() : null;
        if (f18831a != null) {
            f18831a.setBatterySavingMode(z);
        }
    }

    public static /* synthetic */ void applySettings$default(BarcodeCapture barcodeCapture, BarcodeCaptureSettings barcodeCaptureSettings, Runnable runnable, int i, Object obj) {
        if ((i & 2) != 0) {
            runnable = null;
        }
        barcodeCapture.applySettings(barcodeCaptureSettings, runnable);
    }

    @JvmStatic
    @NotNull
    public static final CameraSettings createRecommendedCameraSettings() {
        return INSTANCE.createRecommendedCameraSettings();
    }

    @JvmStatic
    @NotNull
    public static final BarcodeCapture forDataCaptureContext(@Nullable DataCaptureContext dataCaptureContext, @NotNull BarcodeCaptureSettings barcodeCaptureSettings) {
        return INSTANCE.forDataCaptureContext(dataCaptureContext, barcodeCaptureSettings);
    }

    @JvmStatic
    @NotNull
    public static final BarcodeCapture fromJson(@NotNull DataCaptureContext dataCaptureContext, @NotNull String str) {
        return INSTANCE.fromJson(dataCaptureContext, str);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    @NativeImpl
    @NotNull
    /* renamed from: _dataCaptureModeImpl */
    public NativeDataCaptureMode getC() {
        return this.b.getC();
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeCapture getF17413a() {
        return this.b.getF17413a();
    }

    @NotNull
    /* renamed from: _session, reason: from getter */
    public final BarcodeCaptureSession getG() {
        return this.g;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    public void _setDataCaptureContext(@Nullable DataCaptureContext dataCaptureContext) {
        DataCaptureContext dataCaptureContext2 = this.c;
        FrameSource frameSource = dataCaptureContext2 != null ? dataCaptureContext2.get_frameSource() : null;
        Camera camera = frameSource instanceof Camera ? (Camera) frameSource : null;
        NativeAndroidCamera f18831a = camera != null ? camera.getF18831a() : null;
        if (f18831a != null) {
            f18831a.setBatterySavingMode(false);
        }
        DataCaptureContext dataCaptureContext3 = this.c;
        if (dataCaptureContext3 != null) {
            dataCaptureContext3.removeListener(this.d);
        }
        this.c = dataCaptureContext;
        if (dataCaptureContext != null) {
            dataCaptureContext.addListener(this.d);
        }
        boolean shouldSaveBattery = this.f17404a.getShouldSaveBattery();
        FrameSource frameSource2 = dataCaptureContext != null ? dataCaptureContext.get_frameSource() : null;
        Camera camera2 = frameSource2 instanceof Camera ? (Camera) frameSource2 : null;
        NativeAndroidCamera f18831a2 = camera2 != null ? camera2.getF18831a() : null;
        if (f18831a2 != null) {
            f18831a2.setBatterySavingMode(shouldSaveBattery);
        }
    }

    public final void addListener(@NotNull BarcodeCaptureListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.f.add(listener)) {
            listener.onObservationStarted(this);
        }
    }

    @JvmOverloads
    public final void applySettings(@NotNull BarcodeCaptureSettings settings) {
        Intrinsics.h(settings, "settings");
        applySettings$default(this, settings, null, 2, null);
    }

    @Nullable
    public final BarcodeCaptureLicenseInfo getBarcodeCaptureLicenseInfo() {
        NativeBarcodeCaptureLicenseInfo barcodeCaptureLicenseInfo = getF17413a().getBarcodeCaptureLicenseInfo();
        if (barcodeCaptureLicenseInfo != null) {
            return new BarcodeCaptureLicenseInfo(barcodeCaptureLicenseInfo);
        }
        return null;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    @Nullable
    /* renamed from: getDataCaptureContext, reason: from getter */
    public DataCaptureContext getC() {
        return this.c;
    }

    @NotNull
    public final BarcodeCaptureFeedback getFeedback() {
        return this.feedback;
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    @ProxyFunction(property = "pointOfInterest")
    @Nullable
    public PointWithUnit getPointOfInterest() {
        return this.b.getPointOfInterest();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    @ProxyFunction(property = "isEnabled")
    public boolean isEnabled() {
        return this.b.isEnabled();
    }

    public final void removeListener(@NotNull BarcodeCaptureListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.f.remove(listener)) {
            listener.onObservationStopped(this);
        }
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    @ProxyFunction(property = "isEnabled")
    public void setEnabled(boolean z) {
        this.b.setEnabled(z);
    }

    public final void setFeedback(@NotNull BarcodeCaptureFeedback value) {
        Intrinsics.h(value, "value");
        this.feedback = value;
        a(value);
    }

    @Override // com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    @ProxyFunction(property = "pointOfInterest")
    public void setPointOfInterest(@Nullable PointWithUnit pointWithUnit) {
        this.b.setPointOfInterest(pointWithUnit);
    }

    public final void updateFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        new BarcodeCaptureDeserializer().updateModeFromJson(this, jsonData);
    }

    @JvmOverloads
    public final void applySettings(@NotNull BarcodeCaptureSettings settings, @Nullable Runnable whenDone) {
        Intrinsics.h(settings, "settings");
        this.f17404a.setBatterySavingMode(settings.getBatterySaving());
        NativeWrappedFuture nativeWrappedFutureApplySettingsWrapped = getF17413a().applySettingsWrapped(settings._impl());
        Intrinsics.g(nativeWrappedFutureApplySettingsWrapped, "_impl().applySettingsWrapped(settings._impl())");
        NativeExtensionsKt.andThen(nativeWrappedFutureApplySettingsWrapped, whenDone);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BarcodeCapture(@Nullable DataCaptureContext dataCaptureContext, @NotNull BarcodeCaptureSettings settings, @NotNull BatterySavingHandler batterySavingHandler) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(batterySavingHandler, "batterySavingHandler");
        NativeBarcodeCapture nativeBarcodeCaptureCreate = NativeBarcodeCapture.create(dataCaptureContext != null ? dataCaptureContext._impl() : null, settings._impl());
        Intrinsics.g(nativeBarcodeCaptureCreate, "create(\n            data…ettings._impl()\n        )");
        this(nativeBarcodeCaptureCreate, batterySavingHandler);
    }
}
