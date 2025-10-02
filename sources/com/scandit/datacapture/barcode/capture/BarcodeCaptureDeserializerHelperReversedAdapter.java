package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings;
import com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializerHelper;
import com.scandit.datacapture.barcode.internal.module.ui.NativeBarcodeCaptureOverlay;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlay;
import com.scandit.datacapture.barcode.ui.overlay.NativeBarcodeCaptureOverlayStyle;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.source.NativeCameraSettings;
import com.scandit.datacapture.core.internal.module.ui.NativeDataCaptureView;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010$\u001a\u00020#\u0012\b\b\u0002\u0010\"\u001a\u00020\u001d¢\u0006\u0004\b%\u0010&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\u0018\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u001a\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016R\u001a\u0010\"\u001a\u00020\u001d8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006'"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerHelperReversedAdapter;", "Lcom/scandit/datacapture/barcode/internal/module/serialization/NativeBarcodeCaptureDeserializerHelper;", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;", "context", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCapture;", "createMode", "mode", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCaptureSettings;", "settings", "", "applySettings", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "json", "updateModeFromJson", "createSettings", "updateSettingsFromJson", "Lcom/scandit/datacapture/barcode/ui/overlay/NativeBarcodeCaptureOverlayStyle;", "style", "Lcom/scandit/datacapture/barcode/internal/module/ui/NativeBarcodeCaptureOverlay;", "createOverlay", "overlay", "updateOverlayFromJson", "Lcom/scandit/datacapture/core/internal/module/ui/NativeDataCaptureView;", "view", "", "added", "changeOverlayAddedToView", "Lcom/scandit/datacapture/core/internal/module/source/NativeCameraSettings;", "createRecommendedCameraSettings", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerHelper;", "_BarcodeCaptureDeserializerHelper", "<init>", "(Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerHelper;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCaptureDeserializerHelperReversedAdapter extends NativeBarcodeCaptureDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeCaptureDeserializerHelper f17408a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeCaptureDeserializerHelperReversedAdapter(@NotNull BarcodeCaptureDeserializerHelper _BarcodeCaptureDeserializerHelper, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_BarcodeCaptureDeserializerHelper, "_BarcodeCaptureDeserializerHelper");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17408a = _BarcodeCaptureDeserializerHelper;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializerHelper
    public void applySettings(@NotNull NativeBarcodeCapture mode, @NotNull NativeBarcodeCaptureSettings settings) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(settings, "settings");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f17408a.applySettings((BarcodeCapture) proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCapture.class), null, mode, new C0561g(mode)), (BarcodeCaptureSettings) this.proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCaptureSettings.class), null, settings, new C0562h(settings)));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializerHelper
    public void changeOverlayAddedToView(@NotNull NativeBarcodeCaptureOverlay overlay, @NotNull NativeDataCaptureView view, boolean added) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(view, "view");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f17408a.changeOverlayAddedToView((BarcodeCaptureOverlay) proxyCache.require(reflectionFactory.b(NativeBarcodeCaptureOverlay.class), null, overlay), (DataCaptureView) this.proxyCache.require(reflectionFactory.b(NativeDataCaptureView.class), null, view), added);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializerHelper
    @NotNull
    public NativeBarcodeCapture createMode(@NotNull NativeDataCaptureContext context) {
        Intrinsics.h(context, "context");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        BarcodeCapture barcodeCaptureCreateMode = this.f17408a.createMode((DataCaptureContext) proxyCache.getOrPut(reflectionFactory.b(NativeDataCaptureContext.class), null, context, new C0563i(context)));
        this.proxyCache.put(reflectionFactory.b(BarcodeCapture.class), null, barcodeCaptureCreateMode, barcodeCaptureCreateMode._impl());
        NativeBarcodeCapture nativeBarcodeCapture_impl = barcodeCaptureCreateMode._impl();
        this.proxyCache.put(reflectionFactory.b(NativeBarcodeCapture.class), null, nativeBarcodeCapture_impl, barcodeCaptureCreateMode);
        return nativeBarcodeCapture_impl;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializerHelper
    @NotNull
    public NativeBarcodeCaptureOverlay createOverlay(@NotNull NativeBarcodeCapture mode, @NotNull NativeBarcodeCaptureOverlayStyle style) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(style, "style");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        BarcodeCaptureOverlay barcodeCaptureOverlayCreateOverlay = this.f17408a.createOverlay((BarcodeCapture) proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCapture.class), null, mode, new C0564j(mode)), BarcodeNativeTypeFactory.INSTANCE.convert(style));
        this.proxyCache.put(reflectionFactory.b(BarcodeCaptureOverlay.class), null, barcodeCaptureOverlayCreateOverlay, barcodeCaptureOverlayCreateOverlay._impl());
        NativeBarcodeCaptureOverlay nativeBarcodeCaptureOverlay_impl = barcodeCaptureOverlayCreateOverlay._impl();
        this.proxyCache.put(reflectionFactory.b(NativeBarcodeCaptureOverlay.class), null, nativeBarcodeCaptureOverlay_impl, barcodeCaptureOverlayCreateOverlay);
        return nativeBarcodeCaptureOverlay_impl;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializerHelper
    @NotNull
    public NativeCameraSettings createRecommendedCameraSettings() {
        return CoreNativeTypeFactory.INSTANCE.convert(this.f17408a.createRecommendedCameraSettings());
    }

    @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializerHelper
    @NotNull
    public NativeBarcodeCaptureSettings createSettings() {
        BarcodeCaptureSettings barcodeCaptureSettingsCreateSettings = this.f17408a.createSettings();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(BarcodeCaptureSettings.class), null, barcodeCaptureSettingsCreateSettings, barcodeCaptureSettingsCreateSettings._impl());
        NativeBarcodeCaptureSettings nativeBarcodeCaptureSettings_impl = barcodeCaptureSettingsCreateSettings._impl();
        this.proxyCache.put(reflectionFactory.b(NativeBarcodeCaptureSettings.class), null, nativeBarcodeCaptureSettings_impl, barcodeCaptureSettingsCreateSettings);
        return nativeBarcodeCaptureSettings_impl;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializerHelper
    public void updateModeFromJson(@NotNull NativeBarcodeCapture mode, @NotNull NativeJsonValue json) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f17408a.updateModeFromJson((BarcodeCapture) proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCapture.class), null, mode, new C0565k(mode)), (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new C0566l(json)));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializerHelper
    public void updateOverlayFromJson(@NotNull NativeBarcodeCaptureOverlay overlay, @NotNull NativeJsonValue json) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f17408a.updateOverlayFromJson((BarcodeCaptureOverlay) proxyCache.require(reflectionFactory.b(NativeBarcodeCaptureOverlay.class), null, overlay), (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new C0567m(json)));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializerHelper
    public void updateSettingsFromJson(@NotNull NativeBarcodeCaptureSettings settings, @NotNull NativeJsonValue json) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f17408a.updateSettingsFromJson((BarcodeCaptureSettings) proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCaptureSettings.class), null, settings, new C0568n(settings)), (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new C0569o(json)));
    }

    public /* synthetic */ BarcodeCaptureDeserializerHelperReversedAdapter(BarcodeCaptureDeserializerHelper barcodeCaptureDeserializerHelper, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeCaptureDeserializerHelper, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
