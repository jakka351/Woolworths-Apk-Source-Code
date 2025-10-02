package com.scandit.datacapture.barcode.tracking.capture;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.barcode.C0619f7;
import com.scandit.datacapture.barcode.tracking.internal.module.capture.NativeBarcodeTracking;
import com.scandit.datacapture.barcode.tracking.internal.module.capture.NativeBarcodeTrackingLicenseInfo;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeExtensionsKt;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FocusGestureStrategy;
import com.scandit.datacapture.core.source.VideoResolution;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 22\u00020\u00012\u00020\u0002:\u000223B\u0019\b\u0000\u0012\u0006\u0010.\u001a\u00020\t\u0012\u0006\u0010/\u001a\u00020\u001a¢\u0006\u0004\b0\u00101J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\t\u0010\b\u001a\u00020\u0007H\u0097\u0001J\t\u0010\n\u001a\u00020\tH\u0097\u0001J\t\u0010\u000b\u001a\u00020\u0005H\u0097\u0001J\u0012\u0010\u000e\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0003J\u001c\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u001b\u001a\u00020\u001aR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00160\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R$\u0010$\u001a\u00020\"2\u0006\u0010#\u001a\u00020\"8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u0016\u0010\r\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0013\u0010-\u001a\u0004\u0018\u00010*8F¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00064"}, d2 = {"Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTracking;", "Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingProxy;", "", "identifier", "", "_activateState", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureMode;", "_dataCaptureModeImpl", "Lcom/scandit/datacapture/barcode/tracking/internal/module/capture/NativeBarcodeTracking;", "_impl", "reset", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "_setDataCaptureContext", "jsonData", "updateFromJson", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingSettings;", "settings", "Ljava/lang/Runnable;", "whenDone", "applySettings", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "removeListener", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingSession;", "_session", "Ljava/util/concurrent/CopyOnWriteArrayList;", "e", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getListeners$scandit_barcode_capture", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "", "<set-?>", "isEnabled", "()Z", "setEnabled", "(Z)V", "getDataCaptureContext", "()Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingLicenseInfo;", "getBarcodeTrackingLicenseInfo", "()Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingLicenseInfo;", "barcodeTrackingLicenseInfo", "impl", "session", "<init>", "(Lcom/scandit/datacapture/barcode/tracking/internal/module/capture/NativeBarcodeTracking;Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingSession;)V", "Companion", "com/scandit/datacapture/barcode/tracking/capture/c", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class BarcodeTracking implements DataCaptureMode, BarcodeTrackingProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeTrackingSession f18146a;
    private final /* synthetic */ BarcodeTrackingProxyAdapter b;
    private DataCaptureContext c;
    private C0619f7 d;

    /* renamed from: e, reason: from kotlin metadata */
    private final CopyOnWriteArrayList listeners;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0007J\b\u0010\f\u001a\u00020\u000bH\u0007¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTracking$Companion;", "", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingSettings;", "settings", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTracking;", "forDataCaptureContext", "", "jsonData", "fromJson", "Lcom/scandit/datacapture/core/source/CameraSettings;", "createRecommendedCameraSettings", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        public final CameraSettings createRecommendedCameraSettings() {
            CameraSettings cameraSettings = new CameraSettings();
            cameraSettings.setShouldPreferSmoothAutoFocus(true);
            cameraSettings.setFocusGestureStrategy(FocusGestureStrategy.NONE);
            cameraSettings.setPreferredResolution(VideoResolution.FULL_HD);
            cameraSettings.setZoomGestureZoomFactor(1.0f);
            return cameraSettings;
        }

        @JvmStatic
        @NotNull
        public final BarcodeTracking forDataCaptureContext(@Nullable DataCaptureContext dataCaptureContext, @NotNull BarcodeTrackingSettings settings) {
            Intrinsics.h(settings, "settings");
            BarcodeTracking barcodeTracking = new BarcodeTracking(dataCaptureContext, settings, null);
            ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.f24268a.b(BarcodeTracking.class), null, barcodeTracking, new C0856b(barcodeTracking));
            if (dataCaptureContext != null) {
                dataCaptureContext.addMode(barcodeTracking);
            }
            BarcodeTracking.access$updateFreezeIndicator(barcodeTracking, settings);
            return barcodeTracking;
        }

        @JvmStatic
        @NotNull
        public final BarcodeTracking fromJson(@NotNull DataCaptureContext dataCaptureContext, @NotNull String jsonData) {
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            Intrinsics.h(jsonData, "jsonData");
            return new BarcodeTrackingDeserializer().modeFromJson(dataCaptureContext, jsonData);
        }

        private Companion() {
        }
    }

    public /* synthetic */ BarcodeTracking(DataCaptureContext dataCaptureContext, BarcodeTrackingSettings barcodeTrackingSettings, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataCaptureContext, barcodeTrackingSettings);
    }

    public static final void access$updateFreezeIndicator(BarcodeTracking barcodeTracking, BarcodeTrackingSettings barcodeTrackingSettings) {
        C0619f7 c0619f7 = barcodeTracking.d;
        if (c0619f7 != null) {
            barcodeTracking.removeListener(c0619f7);
        }
        Object property = barcodeTrackingSettings.getProperty("freezeIndicator");
        C0619f7 c0619f72 = null;
        C0619f7 c0619f73 = property instanceof C0619f7 ? (C0619f7) property : null;
        if (c0619f73 != null) {
            barcodeTracking.addListener(c0619f73);
            c0619f72 = c0619f73;
        }
        barcodeTracking.d = c0619f72;
    }

    public static /* synthetic */ void applySettings$default(BarcodeTracking barcodeTracking, BarcodeTrackingSettings barcodeTrackingSettings, Runnable runnable, int i, Object obj) {
        if ((i & 2) != 0) {
            runnable = null;
        }
        barcodeTracking.applySettings(barcodeTrackingSettings, runnable);
    }

    @JvmStatic
    @NotNull
    public static final CameraSettings createRecommendedCameraSettings() {
        return INSTANCE.createRecommendedCameraSettings();
    }

    @JvmStatic
    @NotNull
    public static final BarcodeTracking forDataCaptureContext(@Nullable DataCaptureContext dataCaptureContext, @NotNull BarcodeTrackingSettings barcodeTrackingSettings) {
        return INSTANCE.forDataCaptureContext(dataCaptureContext, barcodeTrackingSettings);
    }

    @JvmStatic
    @NotNull
    public static final BarcodeTracking fromJson(@NotNull DataCaptureContext dataCaptureContext, @NotNull String str) {
        return INSTANCE.fromJson(dataCaptureContext, str);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingProxy
    @ProxyFunction(nativeName = "activateState")
    public void _activateState(@NotNull String identifier) {
        Intrinsics.h(identifier, "identifier");
        this.b._activateState(identifier);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    @NativeImpl
    @NotNull
    public NativeDataCaptureMode _dataCaptureModeImpl() {
        return this.b.getC();
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeTracking getF18153a() {
        return this.b.getF18153a();
    }

    @NotNull
    /* renamed from: _session, reason: from getter */
    public final BarcodeTrackingSession getF18146a() {
        return this.f18146a;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    public void _setDataCaptureContext(@Nullable DataCaptureContext dataCaptureContext) {
        this.c = dataCaptureContext;
    }

    public final void addListener(@NotNull BarcodeTrackingListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.listeners.contains(listener)) {
            return;
        }
        this.listeners.add(listener);
        listener.onObservationStarted(this);
    }

    @JvmOverloads
    public final void applySettings(@NotNull BarcodeTrackingSettings settings) {
        Intrinsics.h(settings, "settings");
        applySettings$default(this, settings, null, 2, null);
    }

    @Nullable
    public final BarcodeTrackingLicenseInfo getBarcodeTrackingLicenseInfo() {
        NativeBarcodeTrackingLicenseInfo barcodeTrackingLicenseInfo = getF18153a().getBarcodeTrackingLicenseInfo();
        if (barcodeTrackingLicenseInfo != null) {
            return new BarcodeTrackingLicenseInfo(barcodeTrackingLicenseInfo);
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
    public final CopyOnWriteArrayList<BarcodeTrackingListener> getListeners$scandit_barcode_capture() {
        return this.listeners;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    @ProxyFunction(property = "isEnabled")
    public boolean isEnabled() {
        return this.b.isEnabled();
    }

    public final void removeListener(@NotNull BarcodeTrackingListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.listeners.remove(listener)) {
            listener.onObservationStopped(this);
        }
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingProxy
    @ProxyFunction(nativeName = "clear")
    public void reset() {
        this.b.reset();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    @ProxyFunction(property = "isEnabled")
    public void setEnabled(boolean z) {
        this.b.setEnabled(z);
    }

    public final void updateFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        new BarcodeTrackingDeserializer().updateModeFromJson(this, jsonData);
    }

    public BarcodeTracking(@NotNull NativeBarcodeTracking impl, @NotNull BarcodeTrackingSession session) {
        Intrinsics.h(impl, "impl");
        Intrinsics.h(session, "session");
        this.f18146a = session;
        this.b = new BarcodeTrackingProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        this.listeners = new CopyOnWriteArrayList();
        impl.addListenerAsync(new BarcodeTrackingListenerReversedAdapter(new C0857c(this), this, null, 4, null), 1);
    }

    @JvmOverloads
    public final void applySettings(@NotNull BarcodeTrackingSettings settings, @Nullable Runnable whenDone) {
        Intrinsics.h(settings, "settings");
        NativeWrappedFuture nativeWrappedFutureApplySettingsWrapped = getF18153a().applySettingsWrapped(settings._impl());
        Intrinsics.g(nativeWrappedFutureApplySettingsWrapped, "_impl().applySettingsWrapped(settings._impl())");
        NativeExtensionsKt.andThen(nativeWrappedFutureApplySettingsWrapped, whenDone);
        C0619f7 c0619f7 = this.d;
        if (c0619f7 != null) {
            removeListener(c0619f7);
        }
        Object property = settings.getProperty("freezeIndicator");
        C0619f7 c0619f72 = null;
        C0619f7 c0619f73 = property instanceof C0619f7 ? (C0619f7) property : null;
        if (c0619f73 != null) {
            addListener(c0619f73);
            c0619f72 = c0619f73;
        }
        this.d = c0619f72;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private BarcodeTracking(DataCaptureContext dataCaptureContext, BarcodeTrackingSettings barcodeTrackingSettings) {
        NativeBarcodeTracking nativeBarcodeTrackingCreate = NativeBarcodeTracking.create(dataCaptureContext != null ? dataCaptureContext._impl() : null, barcodeTrackingSettings._impl());
        Intrinsics.g(nativeBarcodeTrackingCreate, "create(dataCaptureContex…impl(), settings._impl())");
        this(nativeBarcodeTrackingCreate);
    }

    private BarcodeTracking(NativeBarcodeTracking nativeBarcodeTracking) {
        this(nativeBarcodeTracking, new BarcodeTrackingSession(new C0855a(nativeBarcodeTracking)));
    }
}
