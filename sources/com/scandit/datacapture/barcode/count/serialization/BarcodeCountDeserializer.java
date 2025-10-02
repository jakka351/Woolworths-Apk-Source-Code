package com.scandit.datacapture.barcode.count.serialization;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.capture.BarcodeCountSettings;
import com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializer;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.source.CameraSettings;
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

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u000256B\t\b\u0016¢\u0006\u0004\b3\u00104J\t\u0010\u0003\u001a\u00020\u0000H\u0097\u0001J\t\u0010\u0005\u001a\u00020\u0004H\u0097\u0001J\t\u0010\u0007\u001a\u00020\u0006H\u0097\u0001J\u0019\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0097\u0001J\u0019\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0097\u0001J\u0011\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0000H\u0097\u0001J\u0011\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0097\u0001J\u0019\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0097\u0001J\u0019\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0097\u0001J\u0019\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0097\u0001J\u0016\u0010\u001c\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\nJ!\u0010 \u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\"\u001a\u00020!H\u0016R$\u0010*\u001a\u0004\u0018\u00010#8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010.\u001a\u00020+8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-R\u001a\u00102\u001a\b\u0012\u0004\u0012\u00020\n0/8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101¨\u00067"}, d2 = {"Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializer;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureModeDeserializer;", "Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerProxy;", "_deserializer", "Lcom/scandit/datacapture/barcode/count/internal/module/serialization/NativeBarcodeCountDeserializer;", "_impl", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeDeserializerImpl", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "", "json", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;", "_modeFromJson", "mode", "jsonData", "Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;", "_overlayFromJson", "deserializer", "", "_setDeserializer", "Lcom/scandit/datacapture/barcode/count/capture/BarcodeCountSettings;", "_settingsFromJson", "overlay", "_updateOverlayFromJson", "updateModeFromJson", "settings", "updateSettingsFromJson", "modeFromJson", "settingsFromJson", "overlayFromJsonInternal$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/count/capture/BarcodeCount;Ljava/lang/String;)Lcom/scandit/datacapture/barcode/count/ui/overlay/BarcodeCountBasicOverlay;", "overlayFromJsonInternal", "Lcom/scandit/datacapture/core/source/CameraSettings;", "createRecommendedCameraSettings", "Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerListener;", "c", "Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerListener;", "getListener$scandit_barcode_capture", "()Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerListener;", "setListener$scandit_barcode_capture", "(Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerListener;)V", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerHelper;", "_helper", "", "getWarnings", "()Ljava/util/List;", "warnings", "<init>", "()V", "com/scandit/datacapture/barcode/count/serialization/b", "com/scandit/datacapture/barcode/count/serialization/c", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
@Mockable
/* loaded from: classes6.dex */
public final class BarcodeCountDeserializer implements DataCaptureModeDeserializer, BarcodeCountDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeCountDeserializerHelper f17523a;
    private final /* synthetic */ BarcodeCountDeserializerProxyAdapter b;

    /* renamed from: c, reason: from kotlin metadata */
    private BarcodeCountDeserializerListener listener;

    private BarcodeCountDeserializer(BarcodeCountDeserializerHelper barcodeCountDeserializerHelper, BarcodeCountDeserializerHelperReversedAdapter barcodeCountDeserializerHelperReversedAdapter, NativeBarcodeCountDeserializer nativeBarcodeCountDeserializer) {
        this.f17523a = barcodeCountDeserializerHelper;
        this.b = new BarcodeCountDeserializerProxyAdapter(nativeBarcodeCountDeserializer, null, 2, 0 == true ? 1 : 0);
        ProxyCacheKt.getGlobalProxyCache().getOrPut(Reflection.f24268a.b(BarcodeCountDeserializerHelper.class), null, barcodeCountDeserializerHelper, new a(barcodeCountDeserializerHelperReversedAdapter));
        _setDeserializer(this);
        nativeBarcodeCountDeserializer.setListener(new BarcodeCountDeserializerListenerReversedAdapter(new b(this), this, null, 4, null));
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @ProxyGetter(ProxyGetterKind.WITH_SETTER)
    @NotNull
    public BarcodeCountDeserializer _deserializer() {
        return this.b._deserializer();
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeBarcodeCountDeserializer getF17526a() {
        return this.b.getF17526a();
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NativeImpl
    @NotNull
    /* renamed from: _modeDeserializerImpl */
    public NativeDataCaptureModeDeserializer getC() {
        return this.b.getC();
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @ProxyFunction(nativeName = "barcodeCountFromJson")
    @NotNull
    public BarcodeCount _modeFromJson(@NotNull DataCaptureContext dataCaptureContext, @NotNull String json) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(json, "json");
        return this.b._modeFromJson(dataCaptureContext, json);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @ProxyFunction(nativeName = "barcodeCountBasicOverlayFromJson")
    @NotNull
    public BarcodeCountBasicOverlay _overlayFromJson(@NotNull BarcodeCount mode, @NotNull String jsonData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(jsonData, "jsonData");
        return this.b._overlayFromJson(mode, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @ProxySetter
    public void _setDeserializer(@NotNull BarcodeCountDeserializer deserializer) {
        Intrinsics.h(deserializer, "deserializer");
        this.b._setDeserializer(deserializer);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @ProxyFunction(nativeName = "settingsFromJson")
    @NotNull
    public BarcodeCountSettings _settingsFromJson(@NotNull String json) {
        Intrinsics.h(json, "json");
        return this.b._settingsFromJson(json);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @ProxyFunction(nativeName = "updateBarcodeCountBasicOverlayFromJson")
    @NotNull
    public BarcodeCountBasicOverlay _updateOverlayFromJson(@NotNull BarcodeCountBasicOverlay overlay, @NotNull String jsonData) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(jsonData, "jsonData");
        return this.b._updateOverlayFromJson(overlay, jsonData);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @NotNull
    public CameraSettings createRecommendedCameraSettings() {
        return BarcodeCount.INSTANCE.createRecommendedCameraSettings();
    }

    @Nullable
    /* renamed from: getListener$scandit_barcode_capture, reason: from getter */
    public final BarcodeCountDeserializerListener getListener() {
        return this.listener;
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @ProxyFunction(property = "warnings")
    @NotNull
    public List<String> getWarnings() {
        return this.b.getWarnings();
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @ProxyFunction(nativeName = "getHelper", property = "_helper")
    @NotNull
    public BarcodeCountDeserializerHelper get_helper() {
        return this.b.get_helper();
    }

    @NotNull
    public final BarcodeCount modeFromJson(@NotNull DataCaptureContext dataCaptureContext, @NotNull String json) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(json, "json");
        BarcodeCount barcodeCount_modeFromJson = _modeFromJson(dataCaptureContext, json);
        this.f17523a.clear();
        return barcodeCount_modeFromJson;
    }

    @Nullable
    public final BarcodeCountBasicOverlay overlayFromJsonInternal$scandit_barcode_capture(@NotNull BarcodeCount mode, @NotNull String jsonData) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(jsonData, "jsonData");
        BarcodeCountBasicOverlay barcodeCountBasicOverlay_overlayFromJson = _overlayFromJson(mode, jsonData);
        this.f17523a.clear();
        return barcodeCountBasicOverlay_overlayFromJson;
    }

    public final void setListener$scandit_barcode_capture(@Nullable BarcodeCountDeserializerListener barcodeCountDeserializerListener) {
        this.listener = barcodeCountDeserializerListener;
    }

    @NotNull
    public final BarcodeCountSettings settingsFromJson(@NotNull String json) {
        Intrinsics.h(json, "json");
        BarcodeCountSettings barcodeCountSettings_settingsFromJson = _settingsFromJson(json);
        this.f17523a.clear();
        return barcodeCountSettings_settingsFromJson;
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @ProxyFunction(nativeName = "updateBarcodeCountFromJson")
    @NotNull
    public BarcodeCount updateModeFromJson(@NotNull BarcodeCount mode, @NotNull String json) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        return this.b.updateModeFromJson(mode, json);
    }

    @Override // com.scandit.datacapture.barcode.count.serialization.BarcodeCountDeserializerProxy
    @ProxyFunction
    @NotNull
    public BarcodeCountSettings updateSettingsFromJson(@NotNull BarcodeCountSettings settings, @NotNull String json) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        return this.b.updateSettingsFromJson(settings, json);
    }

    public /* synthetic */ BarcodeCountDeserializer(BarcodeCountDeserializerHelper barcodeCountDeserializerHelper) {
        BarcodeCountDeserializerHelperReversedAdapter barcodeCountDeserializerHelperReversedAdapter = new BarcodeCountDeserializerHelperReversedAdapter(barcodeCountDeserializerHelper, null, 2, null);
        NativeBarcodeCountDeserializer nativeBarcodeCountDeserializerCreate = NativeBarcodeCountDeserializer.create(barcodeCountDeserializerHelperReversedAdapter);
        Intrinsics.g(nativeBarcodeCountDeserializerCreate, "create(adapter)");
        this(barcodeCountDeserializerHelper, barcodeCountDeserializerHelperReversedAdapter, nativeBarcodeCountDeserializerCreate);
    }

    public BarcodeCountDeserializer() {
        this(new c());
    }
}
