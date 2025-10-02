package com.scandit.datacapture.barcode.pick.serialization;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePick;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeProductProvider;
import com.scandit.datacapture.barcode.internal.module.pick.data.NativeBarcodePickProduct;
import com.scandit.datacapture.barcode.internal.module.pick.serialization.BarcodePickDeserializerHelper;
import com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializer;
import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickSettings;
import com.scandit.datacapture.barcode.pick.data.BarcodePickProduct;
import com.scandit.datacapture.barcode.pick.data.BarcodePickProductProvider;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureModeDeserializer;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.internal.sdk.ui.overlay.NativeDataCaptureOverlay;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010.\u001a\u00020\u0002\u0012\b\b\u0002\u0010)\u001a\u00020$¢\u0006\u0004\b/\u00100J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0006H\u0016J \u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u001cH\u0016J\u0018\u0010 \u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0010\u001a\u00020\u001cH\u0016J\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\u0010\u001a\u00020\u001cH\u0016R\u001a\u0010)\u001a\u00020$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0014\u0010-\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00061"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializerProxyAdapter;", "Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializerProxy;", "Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/NativeBarcodePickDeserializer;", "_impl", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureModeDeserializer;", "_modeDeserializerImpl", "Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializer;", "deserializerProxy", "", "_setDeserializer", "_deserializer", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "context", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProductProvider;", "productProvider", "", "json", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePick;", "_modeFromJson", "mode", "updateModeFromJson", "Lcom/scandit/datacapture/barcode/pick/capture/BarcodePickSettings;", "_settingsFromJson", "settings", "updateSettingsFromJson", "Lcom/scandit/datacapture/barcode/pick/ui/BarcodePickViewSettings;", "_viewSettingsFromJson", "_updateViewSettingsFromJson", "Lcom/scandit/datacapture/core/json/JsonValue;", "Lcom/scandit/datacapture/barcode/internal/module/pick/ui/BarcodePickBasicOverlay;", "_overlayFromJson", "overlay", "_updateOverlayFromJson", "", "Lcom/scandit/datacapture/barcode/pick/data/BarcodePickProduct;", "_productsFromJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/BarcodePickDeserializerHelper;", "get_helper", "()Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/BarcodePickDeserializerHelper;", "_helper", "_NativeBarcodePickDeserializer", "<init>", "(Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/NativeBarcodePickDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodePickDeserializerProxyAdapter implements BarcodePickDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeBarcodePickDeserializer f17919a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeDataCaptureModeDeserializer c;
    private BarcodePickDeserializer d;

    public BarcodePickDeserializerProxyAdapter(@NotNull NativeBarcodePickDeserializer _NativeBarcodePickDeserializer, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeBarcodePickDeserializer, "_NativeBarcodePickDeserializer");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17919a = _NativeBarcodePickDeserializer;
        this.proxyCache = proxyCache;
        NativeDataCaptureModeDeserializer nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer = _NativeBarcodePickDeserializer.asDataCaptureModeDeserializer();
        Intrinsics.g(nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer, "_NativeBarcodePickDeseri…CaptureModeDeserializer()");
        this.c = nativeDataCaptureModeDeserializerAsDataCaptureModeDeserializer;
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @NotNull
    public BarcodePickDeserializer _deserializer() {
        BarcodePickDeserializer barcodePickDeserializer = this.d;
        if (barcodePickDeserializer != null) {
            return barcodePickDeserializer;
        }
        Intrinsics.p("_setDeserializer_backing_field");
        throw null;
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeBarcodePickDeserializer getF17919a() {
        return this.f17919a;
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy, com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NotNull
    /* renamed from: _modeDeserializerImpl, reason: from getter */
    public NativeDataCaptureModeDeserializer getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @NotNull
    public BarcodePick _modeFromJson(@NotNull DataCaptureContext context, @NotNull BarcodePickProductProvider productProvider, @NotNull String json) {
        Intrinsics.h(context, "context");
        Intrinsics.h(productProvider, "productProvider");
        Intrinsics.h(json, "json");
        NativeDataCaptureContext nativeDataCaptureContext_impl = context.getF18429a();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeDataCaptureContext.class), null, nativeDataCaptureContext_impl, context);
        NativeProductProvider nativeProductProvider_productProviderImpl = productProvider.getC();
        this.proxyCache.put(reflectionFactory.b(NativeProductProvider.class), null, nativeProductProvider_productProviderImpl, productProvider);
        NativeBarcodePick _3 = this.f17919a.barcodePickFromJson(nativeDataCaptureContext_impl, nativeProductProvider_productProviderImpl, CoreNativeTypeFactory.INSTANCE.convert(json));
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(_3, "_3");
        return barcodeNativeTypeFactory.convert(_3);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @NotNull
    public BarcodePickBasicOverlay _overlayFromJson(@NotNull BarcodePick mode, @NotNull JsonValue json) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        NativeBarcodePick nativeBarcodePickConvert = BarcodeNativeTypeFactory.INSTANCE.convert(mode);
        NativeJsonValue f18778a = json.getF18778a();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeJsonValue.class), null, f18778a, json);
        NativeDataCaptureOverlay _2 = this.f17919a.overlayFromJson(nativeBarcodePickConvert, f18778a);
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeDataCaptureOverlay.class);
        Intrinsics.g(_2, "_2");
        return (BarcodePickBasicOverlay) proxyCache2.require(kClassB, null, _2);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @NotNull
    public List<BarcodePickProduct> _productsFromJson(@NotNull JsonValue json) {
        Intrinsics.h(json, "json");
        NativeJsonValue f18778a = json.getF18778a();
        this.proxyCache.put(Reflection.f24268a.b(NativeJsonValue.class), null, f18778a, json);
        ArrayList<NativeBarcodePickProduct> _1 = this.f17919a.barcodePickProductsFromJson(f18778a);
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        Intrinsics.g(_1, "_1");
        return barcodeNativeTypeFactory.convertBarcodePickProductFromNativeImpl(_1);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    public void _setDeserializer(@NotNull BarcodePickDeserializer deserializerProxy) {
        Intrinsics.h(deserializerProxy, "deserializerProxy");
        this.d = deserializerProxy;
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @NotNull
    public BarcodePickSettings _settingsFromJson(@NotNull String json) {
        Intrinsics.h(json, "json");
        NativeBarcodePickSettings _1 = this.f17919a.settingsFromJson(CoreNativeTypeFactory.INSTANCE.convert(json));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.f24268a.b(NativeBarcodePickSettings.class);
        Intrinsics.g(_1, "_1");
        return (BarcodePickSettings) proxyCache.require(kClassB, null, _1);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @NotNull
    public BarcodePickBasicOverlay _updateOverlayFromJson(@NotNull BarcodePickBasicOverlay overlay, @NotNull JsonValue json) {
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        NativeDataCaptureOverlay d = overlay.getD();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeDataCaptureOverlay.class), null, d, overlay);
        NativeJsonValue f18778a = json.getF18778a();
        this.proxyCache.put(reflectionFactory.b(NativeJsonValue.class), null, f18778a, json);
        NativeDataCaptureOverlay _2 = this.f17919a.updateOverlayFromJson(d, f18778a);
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeDataCaptureOverlay.class);
        Intrinsics.g(_2, "_2");
        return (BarcodePickBasicOverlay) proxyCache2.require(kClassB, null, _2);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @NotNull
    public BarcodePickViewSettings _updateViewSettingsFromJson(@NotNull BarcodePickViewSettings settings, @NotNull String json) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        NativeBarcodePickViewSettings f17954a = settings.getF17954a();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeBarcodePickViewSettings.class), null, f17954a, settings);
        NativeBarcodePickViewSettings _2 = this.f17919a.updateViewSettingsFromJson(f17954a, CoreNativeTypeFactory.INSTANCE.convert(json));
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeBarcodePickViewSettings.class);
        Intrinsics.g(_2, "_2");
        return (BarcodePickViewSettings) proxyCache2.require(kClassB, null, _2);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @NotNull
    public BarcodePickViewSettings _viewSettingsFromJson(@NotNull String json) {
        Intrinsics.h(json, "json");
        NativeBarcodePickViewSettings _1 = this.f17919a.viewSettingsFromJson(CoreNativeTypeFactory.INSTANCE.convert(json));
        ProxyCache proxyCache = this.proxyCache;
        KClass kClassB = Reflection.f24268a.b(NativeBarcodePickViewSettings.class);
        Intrinsics.g(_1, "_1");
        return (BarcodePickViewSettings) proxyCache.require(kClassB, null, _1);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @NotNull
    public BarcodePick updateModeFromJson(@NotNull BarcodePick mode, @NotNull String json) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        BarcodeNativeTypeFactory barcodeNativeTypeFactory = BarcodeNativeTypeFactory.INSTANCE;
        NativeBarcodePick _2 = this.f17919a.updateBarcodePickFromJson(barcodeNativeTypeFactory.convert(mode), CoreNativeTypeFactory.INSTANCE.convert(json));
        Intrinsics.g(_2, "_2");
        return barcodeNativeTypeFactory.convert(_2);
    }

    @Override // com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializerProxy
    @NotNull
    public BarcodePickSettings updateSettingsFromJson(@NotNull BarcodePickSettings settings, @NotNull String json) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        NativeBarcodePickSettings nativeBarcodePickSettings_impl = settings.getF17899a();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeBarcodePickSettings.class), null, nativeBarcodePickSettings_impl, settings);
        NativeBarcodePickSettings _2 = this.f17919a.updateSettingsFromJson(nativeBarcodePickSettings_impl, CoreNativeTypeFactory.INSTANCE.convert(json));
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeBarcodePickSettings.class);
        Intrinsics.g(_2, "_2");
        return (BarcodePickSettings) proxyCache2.require(kClassB, null, _2);
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureModeDeserializer, com.scandit.datacapture.barcode.capture.BarcodeCaptureDeserializerProxy
    @NotNull
    public BarcodePickDeserializerHelper get_helper() {
        return (BarcodePickDeserializerHelper) this.proxyCache.requireByValue(Reflection.f24268a.b(BarcodePickDeserializerHelper.class), this.f17919a.getHelper());
    }

    public /* synthetic */ BarcodePickDeserializerProxyAdapter(NativeBarcodePickDeserializer nativeBarcodePickDeserializer, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeBarcodePickDeserializer, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
