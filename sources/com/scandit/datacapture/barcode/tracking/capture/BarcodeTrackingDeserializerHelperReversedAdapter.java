package com.scandit.datacapture.barcode.tracking.capture;

import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.tracking.internal.module.capture.NativeBarcodeTracking;
import com.scandit.datacapture.barcode.tracking.internal.module.capture.NativeBarcodeTrackingSettings;
import com.scandit.datacapture.barcode.tracking.internal.module.data.NativeObjectTrackerScenario;
import com.scandit.datacapture.barcode.tracking.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper;
import com.scandit.datacapture.barcode.tracking.internal.module.ui.overlay.NativeBarcodeTrackingAdvancedOverlay;
import com.scandit.datacapture.barcode.tracking.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlay;
import com.scandit.datacapture.barcode.tracking.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlayStyle;
import com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingAdvancedOverlay;
import com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlay;
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

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010+\u001a\u00020*\u0012\b\b\u0002\u0010)\u001a\u00020$¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\u0010\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0018\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u001d\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0018\u0010 \u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u001e2\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010!\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u001e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010#\u001a\u00020\"H\u0016R\u001a\u0010)\u001a\u00020$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006."}, d2 = {"Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingDeserializerHelperReversedAdapter;", "Lcom/scandit/datacapture/barcode/tracking/internal/module/serialization/NativeBarcodeTrackingDeserializerHelper;", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;", "context", "Lcom/scandit/datacapture/barcode/tracking/internal/module/capture/NativeBarcodeTracking;", "createMode", "mode", "Lcom/scandit/datacapture/barcode/tracking/internal/module/capture/NativeBarcodeTrackingSettings;", "settings", "", "applySettings", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "json", "updateModeFromJson", "createSettings", "Lcom/scandit/datacapture/barcode/tracking/internal/module/data/NativeObjectTrackerScenario;", "scenario", "createSettingsForScenario", "updateSettingsFromJson", "Lcom/scandit/datacapture/barcode/tracking/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlayStyle;", "style", "Lcom/scandit/datacapture/barcode/tracking/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlay;", "createBasicOverlay", "overlay", "updateBasicOverlayFromJson", "Lcom/scandit/datacapture/core/internal/module/ui/NativeDataCaptureView;", "view", "", "added", "changeBasicOverlayAddedToView", "Lcom/scandit/datacapture/barcode/tracking/internal/module/ui/overlay/NativeBarcodeTrackingAdvancedOverlay;", "createAdvancedOverlay", "updateAdvancedOverlayFromJson", "changeAdvancedOverlayAddedToView", "Lcom/scandit/datacapture/core/internal/module/source/NativeCameraSettings;", "createRecommendedCameraSettings", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingDeserializerHelper;", "_BarcodeTrackingDeserializerHelper", "<init>", "(Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingDeserializerHelper;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeTrackingDeserializerHelperReversedAdapter extends NativeBarcodeTrackingDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeTrackingDeserializerHelper f18148a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeTrackingDeserializerHelperReversedAdapter(@NotNull BarcodeTrackingDeserializerHelper _BarcodeTrackingDeserializerHelper, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_BarcodeTrackingDeserializerHelper, "_BarcodeTrackingDeserializerHelper");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18148a = _BarcodeTrackingDeserializerHelper;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.tracking.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper
    public void applySettings(@NotNull NativeBarcodeTracking mode, @NotNull NativeBarcodeTrackingSettings settings) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(settings, "settings");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f18148a.applySettings((BarcodeTracking) proxyCache.require(reflectionFactory.b(NativeBarcodeTracking.class), null, mode), (BarcodeTrackingSettings) this.proxyCache.require(reflectionFactory.b(NativeBarcodeTrackingSettings.class), null, settings));
    }

    @Override // com.scandit.datacapture.barcode.tracking.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper
    public void changeAdvancedOverlayAddedToView(@NotNull NativeBarcodeTrackingAdvancedOverlay overlay, @NotNull NativeDataCaptureView view, boolean added) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(view, "view");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f18148a.changeAdvancedOverlayAddedToView((BarcodeTrackingAdvancedOverlay) proxyCache.require(reflectionFactory.b(NativeBarcodeTrackingAdvancedOverlay.class), null, overlay), (DataCaptureView) this.proxyCache.require(reflectionFactory.b(NativeDataCaptureView.class), null, view), added);
    }

    @Override // com.scandit.datacapture.barcode.tracking.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper
    public void changeBasicOverlayAddedToView(@NotNull NativeBarcodeTrackingBasicOverlay overlay, @NotNull NativeDataCaptureView view, boolean added) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(view, "view");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f18148a.changeBasicOverlayAddedToView((BarcodeTrackingBasicOverlay) proxyCache.require(reflectionFactory.b(NativeBarcodeTrackingBasicOverlay.class), null, overlay), (DataCaptureView) this.proxyCache.require(reflectionFactory.b(NativeDataCaptureView.class), null, view), added);
    }

    @Override // com.scandit.datacapture.barcode.tracking.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper
    @NotNull
    public NativeBarcodeTrackingAdvancedOverlay createAdvancedOverlay(@NotNull NativeBarcodeTracking mode) {
        Intrinsics.h(mode, "mode");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        BarcodeTrackingAdvancedOverlay barcodeTrackingAdvancedOverlayCreateAdvancedOverlay = this.f18148a.createAdvancedOverlay((BarcodeTracking) proxyCache.require(reflectionFactory.b(NativeBarcodeTracking.class), null, mode));
        this.proxyCache.put(reflectionFactory.b(BarcodeTrackingAdvancedOverlay.class), null, barcodeTrackingAdvancedOverlayCreateAdvancedOverlay, barcodeTrackingAdvancedOverlayCreateAdvancedOverlay.getB());
        NativeBarcodeTrackingAdvancedOverlay b = barcodeTrackingAdvancedOverlayCreateAdvancedOverlay.getB();
        this.proxyCache.put(reflectionFactory.b(NativeBarcodeTrackingAdvancedOverlay.class), null, b, barcodeTrackingAdvancedOverlayCreateAdvancedOverlay);
        return b;
    }

    @Override // com.scandit.datacapture.barcode.tracking.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper
    @NotNull
    public NativeBarcodeTrackingBasicOverlay createBasicOverlay(@NotNull NativeBarcodeTracking mode, @NotNull NativeBarcodeTrackingBasicOverlayStyle style) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(style, "style");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        BarcodeTrackingBasicOverlay barcodeTrackingBasicOverlayCreateBasicOverlay = this.f18148a.createBasicOverlay((BarcodeTracking) proxyCache.require(reflectionFactory.b(NativeBarcodeTracking.class), null, mode), BarcodeNativeTypeFactory.INSTANCE.convert(style));
        this.proxyCache.put(reflectionFactory.b(BarcodeTrackingBasicOverlay.class), null, barcodeTrackingBasicOverlayCreateBasicOverlay, barcodeTrackingBasicOverlayCreateBasicOverlay._impl());
        NativeBarcodeTrackingBasicOverlay nativeBarcodeTrackingBasicOverlay_impl = barcodeTrackingBasicOverlayCreateBasicOverlay._impl();
        this.proxyCache.put(reflectionFactory.b(NativeBarcodeTrackingBasicOverlay.class), null, nativeBarcodeTrackingBasicOverlay_impl, barcodeTrackingBasicOverlayCreateBasicOverlay);
        return nativeBarcodeTrackingBasicOverlay_impl;
    }

    @Override // com.scandit.datacapture.barcode.tracking.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper
    @NotNull
    public NativeBarcodeTracking createMode(@NotNull NativeDataCaptureContext context) {
        Intrinsics.h(context, "context");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        BarcodeTracking barcodeTrackingCreateMode = this.f18148a.createMode((DataCaptureContext) proxyCache.getOrPut(reflectionFactory.b(NativeDataCaptureContext.class), null, context, new C0861g(context)));
        this.proxyCache.put(reflectionFactory.b(BarcodeTracking.class), null, barcodeTrackingCreateMode, barcodeTrackingCreateMode._impl());
        NativeBarcodeTracking nativeBarcodeTracking_impl = barcodeTrackingCreateMode._impl();
        this.proxyCache.put(reflectionFactory.b(NativeBarcodeTracking.class), null, nativeBarcodeTracking_impl, barcodeTrackingCreateMode);
        return nativeBarcodeTracking_impl;
    }

    @Override // com.scandit.datacapture.barcode.tracking.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper
    @NotNull
    public NativeCameraSettings createRecommendedCameraSettings() {
        return CoreNativeTypeFactory.INSTANCE.convert(this.f18148a.createRecommendedCameraSettings());
    }

    @Override // com.scandit.datacapture.barcode.tracking.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper
    @NotNull
    public NativeBarcodeTrackingSettings createSettings() {
        BarcodeTrackingSettings barcodeTrackingSettingsCreateSettings = this.f18148a.createSettings();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(BarcodeTrackingSettings.class), null, barcodeTrackingSettingsCreateSettings, barcodeTrackingSettingsCreateSettings._impl());
        NativeBarcodeTrackingSettings nativeBarcodeTrackingSettings_impl = barcodeTrackingSettingsCreateSettings._impl();
        this.proxyCache.put(reflectionFactory.b(NativeBarcodeTrackingSettings.class), null, nativeBarcodeTrackingSettings_impl, barcodeTrackingSettingsCreateSettings);
        return nativeBarcodeTrackingSettings_impl;
    }

    @Override // com.scandit.datacapture.barcode.tracking.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper
    @NotNull
    public NativeBarcodeTrackingSettings createSettingsForScenario(@NotNull NativeObjectTrackerScenario scenario) {
        Intrinsics.h(scenario, "scenario");
        BarcodeTrackingSettings barcodeTrackingSettingsCreateSettingsForScenario = this.f18148a.createSettingsForScenario(scenario);
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(BarcodeTrackingSettings.class), null, barcodeTrackingSettingsCreateSettingsForScenario, barcodeTrackingSettingsCreateSettingsForScenario._impl());
        NativeBarcodeTrackingSettings nativeBarcodeTrackingSettings_impl = barcodeTrackingSettingsCreateSettingsForScenario._impl();
        this.proxyCache.put(reflectionFactory.b(NativeBarcodeTrackingSettings.class), null, nativeBarcodeTrackingSettings_impl, barcodeTrackingSettingsCreateSettingsForScenario);
        return nativeBarcodeTrackingSettings_impl;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.tracking.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper
    public void updateAdvancedOverlayFromJson(@NotNull NativeBarcodeTrackingAdvancedOverlay overlay, @NotNull NativeJsonValue json) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f18148a.updateAdvancedOverlayFromJson((BarcodeTrackingAdvancedOverlay) proxyCache.require(reflectionFactory.b(NativeBarcodeTrackingAdvancedOverlay.class), null, overlay), (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new C0862h(json)));
    }

    @Override // com.scandit.datacapture.barcode.tracking.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper
    public void updateBasicOverlayFromJson(@NotNull NativeBarcodeTrackingBasicOverlay overlay, @NotNull NativeJsonValue json) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f18148a.updateBasicOverlayFromJson((BarcodeTrackingBasicOverlay) proxyCache.require(reflectionFactory.b(NativeBarcodeTrackingBasicOverlay.class), null, overlay), (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new i(json)));
    }

    @Override // com.scandit.datacapture.barcode.tracking.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper
    public void updateModeFromJson(@NotNull NativeBarcodeTracking mode, @NotNull NativeJsonValue json) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f18148a.updateModeFromJson((BarcodeTracking) proxyCache.require(reflectionFactory.b(NativeBarcodeTracking.class), null, mode), (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new j(json)));
    }

    @Override // com.scandit.datacapture.barcode.tracking.internal.module.serialization.NativeBarcodeTrackingDeserializerHelper
    public void updateSettingsFromJson(@NotNull NativeBarcodeTrackingSettings settings, @NotNull NativeJsonValue json) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f18148a.updateSettingsFromJson((BarcodeTrackingSettings) proxyCache.require(reflectionFactory.b(NativeBarcodeTrackingSettings.class), null, settings), (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new k(json)));
    }

    public /* synthetic */ BarcodeTrackingDeserializerHelperReversedAdapter(BarcodeTrackingDeserializerHelper barcodeTrackingDeserializerHelper, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeTrackingDeserializerHelper, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
