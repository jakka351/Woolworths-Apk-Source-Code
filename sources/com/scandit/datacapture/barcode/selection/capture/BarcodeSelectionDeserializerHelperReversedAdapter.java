package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeAimerSelection;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeAutoSelectionStrategy;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelection;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeManualSelectionStrategy;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeTapSelection;
import com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerHelper;
import com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay;
import com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlay;
import com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlayStyle;
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

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010,\u001a\u00020+\u0012\b\b\u0002\u0010*\u001a\u00020%¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\u0018\u0010\u0017\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u0018\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\u0018\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\"\u001a\u00020\t2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H\u0016J\b\u0010$\u001a\u00020#H\u0016R\u001a\u0010*\u001a\u00020%8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006/"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerHelperReversedAdapter;", "Lcom/scandit/datacapture/barcode/selection/internal/module/serialization/NativeBarcodeSelectionDeserializerHelper;", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;", "context", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelection;", "createMode", "mode", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelectionSettings;", "settings", "", "applySettings", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "json", "updateModeFromJson", "createSettings", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeTapSelection;", "createTapSelection", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeAimerSelection;", "createAimerSelection", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeAutoSelectionStrategy;", "createAutoSelectionStrategy", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeManualSelectionStrategy;", "createManualSelectionStrategy", "updateSettingsFromJson", "Lcom/scandit/datacapture/barcode/selection/ui/overlay/BarcodeSelectionBasicOverlayStyle;", "style", "Lcom/scandit/datacapture/barcode/selection/internal/module/ui/overlay/NativeBarcodeSelectionBasicOverlay;", "createBasicOverlay", "overlay", "updateBasicOverlayFromJson", "Lcom/scandit/datacapture/core/internal/module/ui/NativeDataCaptureView;", "view", "", "added", "changeBasicOverlayAddedToView", "Lcom/scandit/datacapture/core/internal/module/source/NativeCameraSettings;", "createRecommendedCameraSettings", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerHelper;", "_BarcodeSelectionDeserializerHelper", "<init>", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerHelper;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeSelectionDeserializerHelperReversedAdapter extends NativeBarcodeSelectionDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeSelectionDeserializerHelper f18020a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeSelectionDeserializerHelperReversedAdapter(@NotNull BarcodeSelectionDeserializerHelper _BarcodeSelectionDeserializerHelper, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_BarcodeSelectionDeserializerHelper, "_BarcodeSelectionDeserializerHelper");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18020a = _BarcodeSelectionDeserializerHelper;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerHelper
    public void applySettings(@NotNull NativeBarcodeSelection mode, @NotNull NativeBarcodeSelectionSettings settings) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(settings, "settings");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f18020a.applySettings((BarcodeSelection) proxyCache.require(reflectionFactory.b(NativeBarcodeSelection.class), null, mode), (BarcodeSelectionSettings) this.proxyCache.require(reflectionFactory.b(NativeBarcodeSelectionSettings.class), null, settings));
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerHelper
    public void changeBasicOverlayAddedToView(@NotNull NativeBarcodeSelectionBasicOverlay overlay, @NotNull NativeDataCaptureView view, boolean added) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(view, "view");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f18020a.changeBasicOverlayAddedToView((BarcodeSelectionBasicOverlay) proxyCache.require(reflectionFactory.b(NativeBarcodeSelectionBasicOverlay.class), null, overlay), (DataCaptureView) this.proxyCache.require(reflectionFactory.b(NativeDataCaptureView.class), null, view), added);
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerHelper
    @NotNull
    public NativeAimerSelection createAimerSelection() {
        BarcodeSelectionAimerSelection barcodeSelectionAimerSelectionCreateAimerSelection = this.f18020a.createAimerSelection();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(BarcodeSelectionAimerSelection.class), null, barcodeSelectionAimerSelectionCreateAimerSelection, barcodeSelectionAimerSelectionCreateAimerSelection.getF18015a());
        NativeAimerSelection f18015a = barcodeSelectionAimerSelectionCreateAimerSelection.getF18015a();
        this.proxyCache.put(reflectionFactory.b(NativeAimerSelection.class), null, f18015a, barcodeSelectionAimerSelectionCreateAimerSelection);
        return f18015a;
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerHelper
    @NotNull
    public NativeAutoSelectionStrategy createAutoSelectionStrategy() {
        BarcodeSelectionAutoSelectionStrategy barcodeSelectionAutoSelectionStrategyCreateAutoSelectionStrategy = this.f18020a.createAutoSelectionStrategy();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(BarcodeSelectionAutoSelectionStrategy.class), null, barcodeSelectionAutoSelectionStrategyCreateAutoSelectionStrategy, barcodeSelectionAutoSelectionStrategyCreateAutoSelectionStrategy.getF18017a());
        NativeAutoSelectionStrategy f18017a = barcodeSelectionAutoSelectionStrategyCreateAutoSelectionStrategy.getF18017a();
        this.proxyCache.put(reflectionFactory.b(NativeAutoSelectionStrategy.class), null, f18017a, barcodeSelectionAutoSelectionStrategyCreateAutoSelectionStrategy);
        return f18017a;
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerHelper
    @NotNull
    public NativeBarcodeSelectionBasicOverlay createBasicOverlay(@NotNull NativeBarcodeSelection mode, @NotNull BarcodeSelectionBasicOverlayStyle style) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(style, "style");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        BarcodeSelectionBasicOverlay barcodeSelectionBasicOverlayCreateBasicOverlay = this.f18020a.createBasicOverlay((BarcodeSelection) proxyCache.require(reflectionFactory.b(NativeBarcodeSelection.class), null, mode), style);
        this.proxyCache.put(reflectionFactory.b(BarcodeSelectionBasicOverlay.class), null, barcodeSelectionBasicOverlayCreateBasicOverlay, barcodeSelectionBasicOverlayCreateBasicOverlay._impl());
        NativeBarcodeSelectionBasicOverlay nativeBarcodeSelectionBasicOverlay_impl = barcodeSelectionBasicOverlayCreateBasicOverlay._impl();
        this.proxyCache.put(reflectionFactory.b(NativeBarcodeSelectionBasicOverlay.class), null, nativeBarcodeSelectionBasicOverlay_impl, barcodeSelectionBasicOverlayCreateBasicOverlay);
        return nativeBarcodeSelectionBasicOverlay_impl;
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerHelper
    @NotNull
    public NativeManualSelectionStrategy createManualSelectionStrategy() {
        BarcodeSelectionManualSelectionStrategy barcodeSelectionManualSelectionStrategyCreateManualSelectionStrategy = this.f18020a.createManualSelectionStrategy();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(BarcodeSelectionManualSelectionStrategy.class), null, barcodeSelectionManualSelectionStrategyCreateManualSelectionStrategy, barcodeSelectionManualSelectionStrategyCreateManualSelectionStrategy.getF18027a());
        NativeManualSelectionStrategy f18027a = barcodeSelectionManualSelectionStrategyCreateManualSelectionStrategy.getF18027a();
        this.proxyCache.put(reflectionFactory.b(NativeManualSelectionStrategy.class), null, f18027a, barcodeSelectionManualSelectionStrategyCreateManualSelectionStrategy);
        return f18027a;
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerHelper
    @NotNull
    public NativeBarcodeSelection createMode(@NotNull NativeDataCaptureContext context) {
        Intrinsics.h(context, "context");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        BarcodeSelection barcodeSelectionCreateMode = this.f18020a.createMode((DataCaptureContext) proxyCache.getOrPut(reflectionFactory.b(NativeDataCaptureContext.class), null, context, new h(context)));
        this.proxyCache.put(reflectionFactory.b(BarcodeSelection.class), null, barcodeSelectionCreateMode, barcodeSelectionCreateMode._impl());
        NativeBarcodeSelection nativeBarcodeSelection_impl = barcodeSelectionCreateMode._impl();
        this.proxyCache.put(reflectionFactory.b(NativeBarcodeSelection.class), null, nativeBarcodeSelection_impl, barcodeSelectionCreateMode);
        return nativeBarcodeSelection_impl;
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerHelper
    @NotNull
    public NativeCameraSettings createRecommendedCameraSettings() {
        return CoreNativeTypeFactory.INSTANCE.convert(this.f18020a.createRecommendedCameraSettings());
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerHelper
    @NotNull
    public NativeBarcodeSelectionSettings createSettings() {
        BarcodeSelectionSettings barcodeSelectionSettingsCreateSettings = this.f18020a.createSettings();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(BarcodeSelectionSettings.class), null, barcodeSelectionSettingsCreateSettings, barcodeSelectionSettingsCreateSettings._impl());
        NativeBarcodeSelectionSettings nativeBarcodeSelectionSettings_impl = barcodeSelectionSettingsCreateSettings._impl();
        this.proxyCache.put(reflectionFactory.b(NativeBarcodeSelectionSettings.class), null, nativeBarcodeSelectionSettings_impl, barcodeSelectionSettingsCreateSettings);
        return nativeBarcodeSelectionSettings_impl;
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerHelper
    @NotNull
    public NativeTapSelection createTapSelection() {
        BarcodeSelectionTapSelection barcodeSelectionTapSelectionCreateTapSelection = this.f18020a.createTapSelection();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(BarcodeSelectionTapSelection.class), null, barcodeSelectionTapSelectionCreateTapSelection, barcodeSelectionTapSelectionCreateTapSelection._impl());
        NativeTapSelection nativeTapSelection_impl = barcodeSelectionTapSelectionCreateTapSelection._impl();
        this.proxyCache.put(reflectionFactory.b(NativeTapSelection.class), null, nativeTapSelection_impl, barcodeSelectionTapSelectionCreateTapSelection);
        return nativeTapSelection_impl;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerHelper
    public void updateBasicOverlayFromJson(@NotNull NativeBarcodeSelectionBasicOverlay overlay, @NotNull NativeJsonValue json) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f18020a.updateBasicOverlayFromJson((BarcodeSelectionBasicOverlay) proxyCache.require(reflectionFactory.b(NativeBarcodeSelectionBasicOverlay.class), null, overlay), (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new i(json)));
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerHelper
    public void updateModeFromJson(@NotNull NativeBarcodeSelection mode, @NotNull NativeJsonValue json) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f18020a.updateModeFromJson((BarcodeSelection) proxyCache.require(reflectionFactory.b(NativeBarcodeSelection.class), null, mode), (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new j(json)));
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerHelper
    public void updateSettingsFromJson(@NotNull NativeBarcodeSelectionSettings settings, @NotNull NativeJsonValue json) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f18020a.updateSettingsFromJson((BarcodeSelectionSettings) proxyCache.require(reflectionFactory.b(NativeBarcodeSelectionSettings.class), null, settings), (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new k(json)));
    }

    public /* synthetic */ BarcodeSelectionDeserializerHelperReversedAdapter(BarcodeSelectionDeserializerHelper barcodeSelectionDeserializerHelper, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeSelectionDeserializerHelper, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
