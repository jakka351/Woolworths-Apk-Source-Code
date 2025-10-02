package com.scandit.datacapture.barcode.selection.capture;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.barcode.data.Barcode;
import com.scandit.datacapture.barcode.selection.feedback.BarcodeSelectionFeedback;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelection;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionLicenseInfo;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.DataCaptureMode;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureMode;
import com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback;
import com.scandit.datacapture.core.internal.sdk.common.async.NativeWrappedFuture;
import com.scandit.datacapture.core.internal.sdk.extensions.CollectionsExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.FeedbackExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.NativeExtensionsKt;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FocusGestureStrategy;
import com.scandit.datacapture.core.source.VideoResolution;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 I2\u00020\u00012\u00020\u0002:\u0002IJB\u0019\b\u0000\u0012\u0006\u0010E\u001a\u00020\u0005\u0012\u0006\u0010F\u001a\u00020!¢\u0006\u0004\bG\u0010HJ\t\u0010\u0004\u001a\u00020\u0003H\u0097\u0001J\t\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\t\u0010\b\u001a\u00020\u0007H\u0097\u0001J\u0011\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0097\u0001J\t\u0010\f\u001a\u00020\u0007H\u0097\u0001J\t\u0010\r\u001a\u00020\u0007H\u0097\u0001J\u0019\u0010\u0010\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u000eH\u0097\u0001J\t\u0010\u0011\u001a\u00020\u0007H\u0097\u0001J\u0011\u0010\u0012\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0097\u0001J\u0012\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u001c\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007J\u000e\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bJ\u000e\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\tJ\u0006\u0010\"\u001a\u00020!J\u0016\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u000eJ\u0014\u0010(\u001a\u00020\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020#0&J\u0014\u0010)\u001a\u00020\u00072\f\u0010'\u001a\b\u0012\u0004\u0012\u00020#0&J\u0006\u0010*\u001a\u00020\u0007R*\u00103\u001a\u00020+2\u0006\u0010,\u001a\u00020+8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R$\u00105\u001a\u00020\u000e2\u0006\u00104\u001a\u00020\u000e8W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b5\u00106\"\u0004\b7\u00108R(\u0010>\u001a\u0004\u0018\u0001092\b\u00104\u001a\u0004\u0018\u0001098W@WX\u0096\u000f¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0013\u0010D\u001a\u0004\u0018\u00010A8F¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006K"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelection;", "Lcom/scandit/datacapture/core/capture/DataCaptureMode;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionProxy;", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureMode;", "_dataCaptureModeImpl", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelection;", "_impl", "", "freezeCamera", "", "json", "increaseCountForBarcodesFromJsonString", "selectAimedBarcode", "selectUnselectedBarcodes", "", "enabled", "setSelectBarcodeEnabledFromJsonString", "unfreezeCamera", "unselectBarcodesFromJsonString", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "_setDataCaptureContext", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSettings;", "settings", "Ljava/lang/Runnable;", "whenDone", "applySettings", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addListener", "removeListener", "jsonData", "updateFromJson", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSession;", "_session", "Lcom/scandit/datacapture/barcode/data/Barcode;", "barcode", "setSelectBarcodeEnabled", "", "barcodes", "unselectBarcodes", "increaseCountForBarcodes", "reset", "Lcom/scandit/datacapture/barcode/selection/feedback/BarcodeSelectionFeedback;", "value", "d", "Lcom/scandit/datacapture/barcode/selection/feedback/BarcodeSelectionFeedback;", "getFeedback", "()Lcom/scandit/datacapture/barcode/selection/feedback/BarcodeSelectionFeedback;", "setFeedback", "(Lcom/scandit/datacapture/barcode/selection/feedback/BarcodeSelectionFeedback;)V", "feedback", "<set-?>", "isEnabled", "()Z", "setEnabled", "(Z)V", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "getPointOfInterest", "()Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "setPointOfInterest", "(Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;)V", "pointOfInterest", "getDataCaptureContext", "()Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionLicenseInfo;", "getBarcodeSelectionLicenseInfo", "()Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionLicenseInfo;", "barcodeSelectionLicenseInfo", "impl", "session", "<init>", "(Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelection;Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSession;)V", "Companion", "com/scandit/datacapture/barcode/selection/capture/c", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@Mockable
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class BarcodeSelection implements DataCaptureMode, BarcodeSelectionProxy {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeSelectionSession f18011a;
    private final /* synthetic */ BarcodeSelectionProxyAdapter b;
    private DataCaptureContext c;

    /* renamed from: d, reason: from kotlin metadata */
    private BarcodeSelectionFeedback feedback;
    private final CopyOnWriteArraySet e;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\bH\u0007J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007¨\u0006\r"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelection$Companion;", "", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionSettings;", "settings", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelection;", "forDataCaptureContext", "Lcom/scandit/datacapture/core/source/CameraSettings;", "createRecommendedCameraSettings", "", "jsonData", "fromJson", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
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
        public final BarcodeSelection forDataCaptureContext(@Nullable DataCaptureContext dataCaptureContext, @NotNull BarcodeSelectionSettings settings) {
            Intrinsics.h(settings, "settings");
            BarcodeSelection barcodeSelection = new BarcodeSelection(dataCaptureContext, settings, null);
            ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.f24268a.b(BarcodeSelection.class), null, barcodeSelection, new C0834b(barcodeSelection));
            if (dataCaptureContext != null) {
                dataCaptureContext.addMode(barcodeSelection);
            }
            return barcodeSelection;
        }

        @JvmStatic
        @NotNull
        public final BarcodeSelection fromJson(@NotNull DataCaptureContext dataCaptureContext, @NotNull String jsonData) {
            Intrinsics.h(dataCaptureContext, "dataCaptureContext");
            Intrinsics.h(jsonData, "jsonData");
            return new BarcodeSelectionDeserializer().modeFromJson(dataCaptureContext, jsonData);
        }

        private Companion() {
        }
    }

    public /* synthetic */ BarcodeSelection(DataCaptureContext dataCaptureContext, BarcodeSelectionSettings barcodeSelectionSettings, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataCaptureContext, barcodeSelectionSettings);
    }

    private final void a(final BarcodeSelectionFeedback barcodeSelectionFeedback) {
        getF18028a().setSelectionFeedback(new NativeFeedback() { // from class: com.scandit.datacapture.barcode.selection.capture.BarcodeSelection$setNativeFeedback$1
            @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
            public void emit() {
                barcodeSelectionFeedback.emitSelection$scandit_barcode_capture();
            }

            @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
            public void onFreeResources() {
                barcodeSelectionFeedback.getSelection().release();
            }

            @Override // com.scandit.datacapture.core.internal.sdk.capture.NativeFeedback
            public void onLoadResources() {
                FeedbackExtensionsKt.loadSoundResource(barcodeSelectionFeedback.getSelection());
            }
        });
    }

    public static /* synthetic */ void applySettings$default(BarcodeSelection barcodeSelection, BarcodeSelectionSettings barcodeSelectionSettings, Runnable runnable, int i, Object obj) {
        if ((i & 2) != 0) {
            runnable = null;
        }
        barcodeSelection.applySettings(barcodeSelectionSettings, runnable);
    }

    @JvmStatic
    @NotNull
    public static final CameraSettings createRecommendedCameraSettings() {
        return INSTANCE.createRecommendedCameraSettings();
    }

    @JvmStatic
    @NotNull
    public static final BarcodeSelection forDataCaptureContext(@Nullable DataCaptureContext dataCaptureContext, @NotNull BarcodeSelectionSettings barcodeSelectionSettings) {
        return INSTANCE.forDataCaptureContext(dataCaptureContext, barcodeSelectionSettings);
    }

    @JvmStatic
    @NotNull
    public static final BarcodeSelection fromJson(@NotNull DataCaptureContext dataCaptureContext, @NotNull String str) {
        return INSTANCE.fromJson(dataCaptureContext, str);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    @NativeImpl
    @NotNull
    /* renamed from: _dataCaptureModeImpl */
    public NativeDataCaptureMode getC() {
        return this.b.getC();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeSelection getF18028a() {
        return this.b.getF18028a();
    }

    @NotNull
    /* renamed from: _session, reason: from getter */
    public final BarcodeSelectionSession getF18011a() {
        return this.f18011a;
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode
    public void _setDataCaptureContext(@Nullable DataCaptureContext dataCaptureContext) {
        this.c = dataCaptureContext;
    }

    public final void addListener(@NotNull BarcodeSelectionListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.e.add(listener)) {
            listener.onObservationStarted(this);
        }
    }

    @JvmOverloads
    public final void applySettings(@NotNull BarcodeSelectionSettings settings) {
        Intrinsics.h(settings, "settings");
        applySettings$default(this, settings, null, 2, null);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionProxy
    @ProxyFunction
    public void freezeCamera() {
        this.b.freezeCamera();
    }

    @Nullable
    public final BarcodeSelectionLicenseInfo getBarcodeSelectionLicenseInfo() {
        NativeBarcodeSelectionLicenseInfo barcodeSelectionLicenseInfo = getF18028a().getBarcodeSelectionLicenseInfo();
        if (barcodeSelectionLicenseInfo != null) {
            return new BarcodeSelectionLicenseInfo(barcodeSelectionLicenseInfo);
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
    public final BarcodeSelectionFeedback getFeedback() {
        return this.feedback;
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionProxy
    @ProxyFunction(property = "pointOfInterest")
    @Nullable
    public PointWithUnit getPointOfInterest() {
        return this.b.getPointOfInterest();
    }

    public final void increaseCountForBarcodes(@NotNull List<Barcode> barcodes) {
        Intrinsics.h(barcodes, "barcodes");
        NativeBarcodeSelection nativeBarcodeSelection_impl = getF18028a();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(barcodes, 10));
        Iterator<T> it = barcodes.iterator();
        while (it.hasNext()) {
            arrayList.add(((Barcode) it.next()).getF17604a());
        }
        nativeBarcodeSelection_impl.increaseCountForBarcodes(CollectionsExtensionsKt.toArrayList(arrayList));
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionProxy
    @ProxyFunction
    public void increaseCountForBarcodesFromJsonString(@NotNull String json) {
        Intrinsics.h(json, "json");
        this.b.increaseCountForBarcodesFromJsonString(json);
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    @ProxyFunction(property = "isEnabled")
    public boolean isEnabled() {
        return this.b.isEnabled();
    }

    public final void removeListener(@NotNull BarcodeSelectionListener listener) {
        Intrinsics.h(listener, "listener");
        if (this.e.remove(listener)) {
            listener.onObservationStopped(this);
        }
    }

    public final void reset() {
        getF18028a().reset();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionProxy
    @ProxyFunction
    public void selectAimedBarcode() {
        this.b.selectAimedBarcode();
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionProxy
    @ProxyFunction(nativeName = "selectAllUnselectedBarcodes")
    public void selectUnselectedBarcodes() {
        this.b.selectUnselectedBarcodes();
    }

    @Override // com.scandit.datacapture.core.capture.DataCaptureMode, com.scandit.datacapture.barcode.capture.BarcodeCaptureProxy
    @ProxyFunction(property = "isEnabled")
    public void setEnabled(boolean z) {
        this.b.setEnabled(z);
    }

    public final void setFeedback(@NotNull BarcodeSelectionFeedback value) {
        Intrinsics.h(value, "value");
        this.feedback = value;
        a(value);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionProxy
    @ProxyFunction(property = "pointOfInterest")
    public void setPointOfInterest(@Nullable PointWithUnit pointWithUnit) {
        this.b.setPointOfInterest(pointWithUnit);
    }

    public final void setSelectBarcodeEnabled(@NotNull Barcode barcode, boolean enabled) {
        Intrinsics.h(barcode, "barcode");
        getF18028a().setSelectBarcodeEnabled(barcode.getF17604a(), enabled);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionProxy
    @ProxyFunction
    public void setSelectBarcodeEnabledFromJsonString(@NotNull String json, boolean enabled) {
        Intrinsics.h(json, "json");
        this.b.setSelectBarcodeEnabledFromJsonString(json, enabled);
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionProxy
    @ProxyFunction
    public void unfreezeCamera() {
        this.b.unfreezeCamera();
    }

    public final void unselectBarcodes(@NotNull List<Barcode> barcodes) {
        Intrinsics.h(barcodes, "barcodes");
        NativeBarcodeSelection nativeBarcodeSelection_impl = getF18028a();
        ArrayList arrayList = new ArrayList(CollectionsKt.s(barcodes, 10));
        Iterator<T> it = barcodes.iterator();
        while (it.hasNext()) {
            arrayList.add(((Barcode) it.next()).getF17604a());
        }
        nativeBarcodeSelection_impl.unselectBarcodes(CollectionsExtensionsKt.toArrayList(arrayList));
    }

    @Override // com.scandit.datacapture.barcode.selection.capture.BarcodeSelectionProxy
    @ProxyFunction
    public void unselectBarcodesFromJsonString(@NotNull String json) {
        Intrinsics.h(json, "json");
        this.b.unselectBarcodesFromJsonString(json);
    }

    public final void updateFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        new BarcodeSelectionDeserializer().updateModeFromJson(this, jsonData);
    }

    public BarcodeSelection(@NotNull NativeBarcodeSelection impl, @NotNull BarcodeSelectionSession session) {
        Intrinsics.h(impl, "impl");
        Intrinsics.h(session, "session");
        this.f18011a = session;
        this.b = new BarcodeSelectionProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
        BarcodeSelectionFeedback barcodeSelectionFeedbackDefaultFeedback = BarcodeSelectionFeedback.INSTANCE.defaultFeedback();
        a(barcodeSelectionFeedbackDefaultFeedback);
        this.feedback = barcodeSelectionFeedbackDefaultFeedback;
        this.e = new CopyOnWriteArraySet();
        getF18028a().addListenerAsync(new BarcodeSelectionListenerReversedAdapter(new C0835c(this), this, null, 4, null));
    }

    @JvmOverloads
    public final void applySettings(@NotNull BarcodeSelectionSettings settings, @Nullable Runnable whenDone) {
        Intrinsics.h(settings, "settings");
        NativeWrappedFuture nativeWrappedFutureApplySettingsWrapped = getF18028a().applySettingsWrapped(settings._impl());
        Intrinsics.g(nativeWrappedFutureApplySettingsWrapped, "_impl().applySettingsWrapped(settings._impl())");
        NativeExtensionsKt.andThen(nativeWrappedFutureApplySettingsWrapped, whenDone);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private BarcodeSelection(DataCaptureContext dataCaptureContext, BarcodeSelectionSettings barcodeSelectionSettings) {
        NativeBarcodeSelection nativeBarcodeSelectionCreate = NativeBarcodeSelection.create(dataCaptureContext != null ? dataCaptureContext._impl() : null, barcodeSelectionSettings._impl());
        Intrinsics.g(nativeBarcodeSelectionCreate, "create(dataCaptureContex…impl(), settings._impl())");
        this(nativeBarcodeSelectionCreate);
    }

    private BarcodeSelection(NativeBarcodeSelection nativeBarcodeSelection) {
        this(nativeBarcodeSelection, new BarcodeSelectionSession(new C0833a(nativeBarcodeSelection)));
    }
}
