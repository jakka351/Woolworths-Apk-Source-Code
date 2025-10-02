package com.scandit.datacapture.barcode.count.serialization;

import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.capture.BarcodeCountSettings;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlayStyle;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings;
import com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializerHelper;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.ui.NativeDataCaptureView;
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

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010 \u001a\u00020\u001b¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0018\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\n\u001a\u00020\tH\u0016J \u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016R\u001a\u0010 \u001a\u00020\u001b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerHelperReversedAdapter;", "Lcom/scandit/datacapture/barcode/count/internal/module/serialization/NativeBarcodeCountDeserializerHelper;", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountSettings;", "createSettings", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;", "context", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCount;", "createMode", "settings", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "json", "", "updateSettingsFromJson", "mode", "applySettings", "updateModeFromJson", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlayStyle;", "style", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlay;", "createBasicOverlay", "overlay", "updateBasicOverlayFromJson", "Lcom/scandit/datacapture/core/internal/module/ui/NativeDataCaptureView;", "view", "", "added", "changeBasicOverlayAddedToView", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerHelper;", "_BarcodeCountDeserializerHelper", "<init>", "(Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerHelper;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCountDeserializerHelperReversedAdapter extends NativeBarcodeCountDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeCountDeserializerHelper f17524a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public BarcodeCountDeserializerHelperReversedAdapter(@NotNull BarcodeCountDeserializerHelper _BarcodeCountDeserializerHelper, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_BarcodeCountDeserializerHelper, "_BarcodeCountDeserializerHelper");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17524a = _BarcodeCountDeserializerHelper;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializerHelper
    public void applySettings(@NotNull NativeBarcodeCount mode, @NotNull NativeBarcodeCountSettings settings) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(settings, "settings");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f17524a.applySettings((BarcodeCount) proxyCache.require(reflectionFactory.b(NativeBarcodeCount.class), null, mode), (BarcodeCountSettings) this.proxyCache.require(reflectionFactory.b(NativeBarcodeCountSettings.class), null, settings));
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializerHelper
    public void changeBasicOverlayAddedToView(@NotNull NativeBarcodeCountBasicOverlay overlay, @NotNull NativeDataCaptureView view, boolean added) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(view, "view");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f17524a.changeBasicOverlayAddedToView((BarcodeCountBasicOverlay) proxyCache.require(reflectionFactory.b(NativeBarcodeCountBasicOverlay.class), null, overlay), (DataCaptureView) this.proxyCache.require(reflectionFactory.b(NativeDataCaptureView.class), null, view), added);
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializerHelper
    @NotNull
    public NativeBarcodeCountBasicOverlay createBasicOverlay(@NotNull NativeBarcodeCount mode, @NotNull NativeBarcodeCountBasicOverlayStyle style) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(style, "style");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        BarcodeCountBasicOverlay barcodeCountBasicOverlayCreateBasicOverlay = this.f17524a.createBasicOverlay((BarcodeCount) proxyCache.require(reflectionFactory.b(NativeBarcodeCount.class), null, mode), BarcodeNativeTypeFactory.INSTANCE.convert(style));
        NativeBarcodeCountBasicOverlay nativeBarcodeCountBasicOverlay_impl = barcodeCountBasicOverlayCreateBasicOverlay._impl();
        this.proxyCache.put(reflectionFactory.b(NativeBarcodeCountBasicOverlay.class), null, nativeBarcodeCountBasicOverlay_impl, barcodeCountBasicOverlayCreateBasicOverlay);
        return nativeBarcodeCountBasicOverlay_impl;
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializerHelper
    @NotNull
    public NativeBarcodeCount createMode(@NotNull NativeDataCaptureContext context) {
        Intrinsics.h(context, "context");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        BarcodeCount barcodeCountCreateMode = this.f17524a.createMode((DataCaptureContext) proxyCache.getOrPut(reflectionFactory.b(NativeDataCaptureContext.class), null, context, new d(context)));
        this.proxyCache.put(reflectionFactory.b(BarcodeCount.class), null, barcodeCountCreateMode, barcodeCountCreateMode._impl());
        NativeBarcodeCount nativeBarcodeCount_impl = barcodeCountCreateMode._impl();
        this.proxyCache.put(reflectionFactory.b(NativeBarcodeCount.class), null, nativeBarcodeCount_impl, barcodeCountCreateMode);
        return nativeBarcodeCount_impl;
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializerHelper
    @NotNull
    public NativeBarcodeCountSettings createSettings() {
        BarcodeCountSettings barcodeCountSettingsCreateSettings = this.f17524a.createSettings();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(BarcodeCountSettings.class), null, barcodeCountSettingsCreateSettings, barcodeCountSettingsCreateSettings._impl());
        NativeBarcodeCountSettings nativeBarcodeCountSettings_impl = barcodeCountSettingsCreateSettings._impl();
        this.proxyCache.put(reflectionFactory.b(NativeBarcodeCountSettings.class), null, nativeBarcodeCountSettings_impl, barcodeCountSettingsCreateSettings);
        return nativeBarcodeCountSettings_impl;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializerHelper
    public void updateBasicOverlayFromJson(@NotNull NativeBarcodeCountBasicOverlay overlay, @NotNull NativeJsonValue json) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f17524a.updateBasicOverlayFromJson((BarcodeCountBasicOverlay) proxyCache.require(reflectionFactory.b(NativeBarcodeCountBasicOverlay.class), null, overlay), (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new e(json)));
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializerHelper
    public void updateModeFromJson(@NotNull NativeBarcodeCount mode, @NotNull NativeJsonValue json) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f17524a.updateModeFromJson((BarcodeCount) proxyCache.require(reflectionFactory.b(NativeBarcodeCount.class), null, mode), (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new f(json)));
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializerHelper
    public void updateSettingsFromJson(@NotNull NativeBarcodeCountSettings settings, @NotNull NativeJsonValue json) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f17524a.updateSettingsFromJson((BarcodeCountSettings) proxyCache.require(reflectionFactory.b(NativeBarcodeCountSettings.class), null, settings), (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new g(json)));
    }

    public /* synthetic */ BarcodeCountDeserializerHelperReversedAdapter(BarcodeCountDeserializerHelper barcodeCountDeserializerHelper, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeCountDeserializerHelper, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
