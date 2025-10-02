package com.scandit.datacapture.barcode.tracking.capture;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.barcode.tracking.internal.module.serialization.NativeBarcodeTrackingDeserializer;
import com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingAdvancedOverlay;
import com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlay;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetter;
import com.scandit.datacapture.tools.internal.sdk.ProxyGetterKind;
import com.scandit.datacapture.tools.internal.sdk.ProxySetter;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u000245B\t\b\u0016¢\u0006\u0004\b2\u00103J\u0019\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\u0019\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\t\u0010\u000b\u001a\u00020\u0000H\u0097\u0001J\t\u0010\r\u001a\u00020\fH\u0097\u0001J\t\u0010\u000f\u001a\u00020\u000eH\u0097\u0001J\u0019\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\u0011\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0000H\u0097\u0001J\u0011\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\u0019\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\u0019\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\u0019\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\u0019\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005H\u0097\u0001J\u0016\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010 \u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010!\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005R$\u0010)\u001a\u0004\u0018\u00010\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b+\u0010,R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050.8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00066"}, d2 = {"Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingDeserializer;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureModeDeserializer;", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingDeserializerProxy;", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTracking;", "mode", "", "jsonData", "Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingAdvancedOverlay;", "_advancedOverlayFromJson", "Lcom/scandit/datacapture/barcode/tracking/ui/overlay/BarcodeTrackingBasicOverlay;", "_basicOverlayFromJson", "_deserializer", "Lcom/scandit/datacapture/barcode/tracking/internal/module/serialization/NativeBarcodeTrackingDeserializer;", "_impl", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeDeserializerImpl", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "_modeFromJson", "deserializer", "", "_setDeserializer", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingSettings;", "_settingsFromJson", "overlay", "updateAdvancedOverlayFromJson", "updateBasicOverlayFromJson", "updateModeFromJson", "settings", "updateSettingsFromJson", "modeFromJson", "settingsFromJson", "basicOverlayFromJson", "advancedOverlayFromJson", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingDeserializerListener;", "c", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingDeserializerListener;", "getListener", "()Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingDeserializerListener;", "setListener", "(Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingDeserializerListener;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingDeserializerHelper;", "_helper", "", "getWarnings", "()Ljava/util/List;", "warnings", "<init>", "()V", "com/scandit/datacapture/barcode/tracking/capture/e", "com/scandit/datacapture/barcode/tracking/capture/f", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@Mockable
/* loaded from: classes6.dex */
public final class BarcodeTrackingDeserializer implements DataCaptureModeDeserializer, BarcodeTrackingDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeTrackingDeserializerHelper f18147a;
    private final /* synthetic */ BarcodeTrackingDeserializerProxyAdapter b;

    /* renamed from: c, reason: from kotlin metadata */
    private BarcodeTrackingDeserializerListener listener;

    private BarcodeTrackingDeserializer(BarcodeTrackingDeserializerHelper barcodeTrackingDeserializerHelper, BarcodeTrackingDeserializerHelperReversedAdapter barcodeTrackingDeserializerHelperReversedAdapter, NativeBarcodeTrackingDeserializer nativeBarcodeTrackingDeserializer) {
        this.f18147a = barcodeTrackingDeserializerHelper;
        this.b = new BarcodeTrackingDeserializerProxyAdapter(nativeBarcodeTrackingDeserializer, null, 2, 0 == true ? 1 : 0);
        ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.f24268a.b(BarcodeTrackingDeserializerHelper.class), null, barcodeTrackingDeserializerHelper, new C0858d(barcodeTrackingDeserializerHelperReversedAdapter));
        _setDeserializer(this);
        nativeBarcodeTrackingDeserializer.setListener(new BarcodeTrackingDeserializerListenerReversedAdapter(new C0859e(this), this, null, 4, null));
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerProxy
    @ProxyFunction(nativeName = "barcodeTrackingAdvancedOverlayFromJson")
    @NotNull
    public BarcodeTrackingAdvancedOverlay _advancedOverlayFromJson(@NotNull BarcodeTracking mode, @NotNull String jsonData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(jsonData, "jsonData");
        return this.b._advancedOverlayFromJson(mode, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerProxy
    @ProxyFunction(nativeName = "barcodeTrackingBasicOverlayFromJson")
    @NotNull
    public BarcodeTrackingBasicOverlay _basicOverlayFromJson(@NotNull BarcodeTracking mode, @NotNull String jsonData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(jsonData, "jsonData");
        return this.b._basicOverlayFromJson(mode, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerProxy
    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    @NotNull
    public BarcodeTrackingDeserializer _deserializer() {
        return this.b._deserializer();
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeTrackingDeserializer getF18150a() {
        return this.b.getF18150a();
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NativeImpl
    @NotNull
    /* renamed from: _modeDeserializerImpl */
    public NativeDataCaptureModeDeserializer getC() {
        return this.b.getC();
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerProxy
    @ProxyFunction(nativeName = "barcodeTrackingFromJson")
    @NotNull
    public BarcodeTracking _modeFromJson(@NotNull DataCaptureContext dataCaptureContext, @NotNull String jsonData) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(jsonData, "jsonData");
        return this.b._modeFromJson(dataCaptureContext, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerProxy
    @ProxySetter
    public void _setDeserializer(@NotNull BarcodeTrackingDeserializer deserializer) {
        Intrinsics.h(deserializer, "deserializer");
        this.b._setDeserializer(deserializer);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerProxy
    @ProxyFunction(nativeName = "settingsFromJson")
    @NotNull
    public BarcodeTrackingSettings _settingsFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        return this.b._settingsFromJson(jsonData);
    }

    @NotNull
    public final BarcodeTrackingAdvancedOverlay advancedOverlayFromJson(@NotNull BarcodeTracking mode, @NotNull String jsonData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(jsonData, "jsonData");
        BarcodeTrackingAdvancedOverlay barcodeTrackingAdvancedOverlay_advancedOverlayFromJson = _advancedOverlayFromJson(mode, jsonData);
        this.f18147a.clear();
        return barcodeTrackingAdvancedOverlay_advancedOverlayFromJson;
    }

    @NotNull
    public final BarcodeTrackingBasicOverlay basicOverlayFromJson(@NotNull BarcodeTracking mode, @NotNull String jsonData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(jsonData, "jsonData");
        BarcodeTrackingBasicOverlay barcodeTrackingBasicOverlay_basicOverlayFromJson = _basicOverlayFromJson(mode, jsonData);
        this.f18147a.clear();
        return barcodeTrackingBasicOverlay_basicOverlayFromJson;
    }

    @Nullable
    public final BarcodeTrackingDeserializerListener getListener() {
        return this.listener;
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerProxy
    @ProxyFunction(property = "warnings")
    @NotNull
    public List<String> getWarnings() {
        return this.b.getWarnings();
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @ProxyFunction(nativeName = "getHelper", property = "_helper")
    @NotNull
    public BarcodeTrackingDeserializerHelper get_helper() {
        return this.b.get_helper();
    }

    @NotNull
    public final BarcodeTracking modeFromJson(@NotNull DataCaptureContext dataCaptureContext, @NotNull String jsonData) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(jsonData, "jsonData");
        BarcodeTracking barcodeTracking_modeFromJson = _modeFromJson(dataCaptureContext, jsonData);
        this.f18147a.clear();
        return barcodeTracking_modeFromJson;
    }

    public final void setListener(@Nullable BarcodeTrackingDeserializerListener barcodeTrackingDeserializerListener) {
        this.listener = barcodeTrackingDeserializerListener;
    }

    @NotNull
    public final BarcodeTrackingSettings settingsFromJson(@NotNull String jsonData) {
        Intrinsics.h(jsonData, "jsonData");
        BarcodeTrackingSettings barcodeTrackingSettings_settingsFromJson = _settingsFromJson(jsonData);
        this.f18147a.clear();
        return barcodeTrackingSettings_settingsFromJson;
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerProxy
    @ProxyFunction(nativeName = "updateBarcodeTrackingAdvancedOverlayFromJson")
    @NotNull
    public BarcodeTrackingAdvancedOverlay updateAdvancedOverlayFromJson(@NotNull BarcodeTrackingAdvancedOverlay overlay, @NotNull String jsonData) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(jsonData, "jsonData");
        return this.b.updateAdvancedOverlayFromJson(overlay, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerProxy
    @ProxyFunction(nativeName = "updateBarcodeTrackingBasicOverlayFromJson")
    @NotNull
    public BarcodeTrackingBasicOverlay updateBasicOverlayFromJson(@NotNull BarcodeTrackingBasicOverlay overlay, @NotNull String jsonData) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(jsonData, "jsonData");
        return this.b.updateBasicOverlayFromJson(overlay, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerProxy
    @ProxyFunction(nativeName = "updateBarcodeTrackingFromJson")
    @NotNull
    public BarcodeTracking updateModeFromJson(@NotNull BarcodeTracking mode, @NotNull String jsonData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(jsonData, "jsonData");
        return this.b.updateModeFromJson(mode, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.tracking.capture.BarcodeTrackingDeserializerProxy
    @ProxyFunction
    @NotNull
    public BarcodeTrackingSettings updateSettingsFromJson(@NotNull BarcodeTrackingSettings settings, @NotNull String jsonData) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(jsonData, "jsonData");
        return this.b.updateSettingsFromJson(settings, jsonData);
    }

    public /* synthetic */ BarcodeTrackingDeserializer(BarcodeTrackingDeserializerHelper barcodeTrackingDeserializerHelper) {
        BarcodeTrackingDeserializerHelperReversedAdapter barcodeTrackingDeserializerHelperReversedAdapter = new BarcodeTrackingDeserializerHelperReversedAdapter(barcodeTrackingDeserializerHelper, null, 2, null);
        NativeBarcodeTrackingDeserializer nativeBarcodeTrackingDeserializerCreate = NativeBarcodeTrackingDeserializer.create(barcodeTrackingDeserializerHelperReversedAdapter);
        Intrinsics.g(nativeBarcodeTrackingDeserializerCreate, "create(adapter)");
        this(barcodeTrackingDeserializerHelper, barcodeTrackingDeserializerHelperReversedAdapter, nativeBarcodeTrackingDeserializerCreate);
    }

    public BarcodeTrackingDeserializer() {
        this(new C0860f());
    }
}
