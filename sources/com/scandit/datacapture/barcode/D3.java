package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePick;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeProductProvider;
import com.scandit.datacapture.barcode.internal.module.pick.serialization.BarcodePickDeserializerHelper;
import com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerHelper;
import com.scandit.datacapture.barcode.internal.module.pick.ui.BarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickBasicOverlay;
import com.scandit.datacapture.barcode.internal.module.pick.ui.NativeBarcodePickViewSettings;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickSettings;
import com.scandit.datacapture.barcode.pick.data.BarcodePickProductProvider;
import com.scandit.datacapture.barcode.pick.ui.BarcodePickViewSettings;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;

/* loaded from: classes6.dex */
public final class D3 extends NativeBarcodePickDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodePickDeserializerHelper f17131a;
    private final ProxyCache b;

    public /* synthetic */ D3(BarcodePickDeserializerHelper barcodePickDeserializerHelper) {
        this(barcodePickDeserializerHelper, ProxyCacheKt.getGlobalProxyCache());
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerHelper
    public final void applySettings(NativeBarcodePick mode, NativeBarcodePickSettings settings) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(settings, "settings");
        this.f17131a.a(BarcodeNativeTypeFactory.INSTANCE.convert(mode), (BarcodePickSettings) this.b.require(Reflection.f24268a.b(NativeBarcodePickSettings.class), null, settings));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerHelper
    public final NativeBarcodePickBasicOverlay createBasicOverlay(NativeBarcodePick mode, NativeBarcodePickViewSettings viewSettings) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(viewSettings, "viewSettings");
        BarcodePick barcodePickConvert = BarcodeNativeTypeFactory.INSTANCE.convert(mode);
        ProxyCache proxyCache = this.b;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        BarcodePickBasicOverlay barcodePickBasicOverlayA = this.f17131a.a(barcodePickConvert, (BarcodePickViewSettings) proxyCache.require(reflectionFactory.b(NativeBarcodePickViewSettings.class), null, viewSettings));
        NativeBarcodePickBasicOverlay nativeBarcodePickBasicOverlayA = barcodePickBasicOverlayA.a();
        this.b.put(reflectionFactory.b(NativeBarcodePickBasicOverlay.class), null, nativeBarcodePickBasicOverlayA, barcodePickBasicOverlayA);
        return nativeBarcodePickBasicOverlayA;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerHelper
    public final NativeBarcodePick createMode(NativeDataCaptureContext context, NativeProductProvider provider) {
        Intrinsics.h(context, "context");
        Intrinsics.h(provider, "provider");
        ProxyCache proxyCache = this.b;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        BarcodePick barcodePickA = this.f17131a.a((DataCaptureContext) proxyCache.getOrPut(reflectionFactory.b(NativeDataCaptureContext.class), null, context, new C0942z3(context)), (BarcodePickProductProvider) this.b.require(reflectionFactory.b(NativeProductProvider.class), null, provider));
        this.b.put(reflectionFactory.b(BarcodePick.class), null, barcodePickA, barcodePickA._impl$scandit_barcode_capture());
        return BarcodeNativeTypeFactory.INSTANCE.convert(barcodePickA);
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerHelper
    public final NativeBarcodePickSettings createSettings() {
        BarcodePickSettings barcodePickSettingsCreateSettings = this.f17131a.createSettings();
        ProxyCache proxyCache = this.b;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(BarcodePickSettings.class), null, barcodePickSettingsCreateSettings, barcodePickSettingsCreateSettings._impl());
        NativeBarcodePickSettings nativeBarcodePickSettings_impl = barcodePickSettingsCreateSettings._impl();
        this.b.put(reflectionFactory.b(NativeBarcodePickSettings.class), null, nativeBarcodePickSettings_impl, barcodePickSettingsCreateSettings);
        return nativeBarcodePickSettings_impl;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerHelper
    public final NativeBarcodePickViewSettings createViewSettings() {
        BarcodePickViewSettings barcodePickViewSettingsA = this.f17131a.a();
        ProxyCache proxyCache = this.b;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(BarcodePickViewSettings.class), null, barcodePickViewSettingsA, barcodePickViewSettingsA.getF17954a());
        NativeBarcodePickViewSettings f17954a = barcodePickViewSettingsA.getF17954a();
        this.b.put(reflectionFactory.b(NativeBarcodePickViewSettings.class), null, f17954a, barcodePickViewSettingsA);
        return f17954a;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerHelper
    public final void updateModeFromJson(NativeBarcodePick mode, NativeJsonValue json) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        this.f17131a.a(BarcodeNativeTypeFactory.INSTANCE.convert(mode), (JsonValue) this.b.getOrPut(Reflection.f24268a.b(NativeJsonValue.class), null, json, new A3(json)));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerHelper
    public final void updateSettingsFromJson(NativeBarcodePickSettings settings, NativeJsonValue json) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        ProxyCache proxyCache = this.b;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f17131a.a((BarcodePickSettings) proxyCache.require(reflectionFactory.b(NativeBarcodePickSettings.class), null, settings), (JsonValue) this.b.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new B3(json)));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerHelper
    public final void updateViewSettingsFromJson(NativeBarcodePickViewSettings viewSettings, NativeJsonValue json) {
        Intrinsics.h(viewSettings, "viewSettings");
        Intrinsics.h(json, "json");
        ProxyCache proxyCache = this.b;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f17131a.a((BarcodePickViewSettings) proxyCache.require(reflectionFactory.b(NativeBarcodePickViewSettings.class), null, viewSettings), (JsonValue) this.b.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new C3(json)));
    }

    public D3(BarcodePickDeserializerHelper _BarcodePickDeserializerHelper, ProxyCache proxyCache) {
        Intrinsics.h(_BarcodePickDeserializerHelper, "_BarcodePickDeserializerHelper");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17131a = _BarcodePickDeserializerHelper;
        this.b = proxyCache;
    }
}
