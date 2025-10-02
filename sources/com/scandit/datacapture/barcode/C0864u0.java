package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.find.capture.BarcodeFind;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindSettings;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFind;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSettings;
import com.scandit.datacapture.barcode.internal.module.find.serialization.BarcodeFindDeserializerHelper;
import com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializerHelper;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;

/* renamed from: com.scandit.datacapture.barcode.u0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C0864u0 extends NativeBarcodeFindDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeFindDeserializerHelper f18215a;
    private final ProxyCache b;

    public /* synthetic */ C0864u0(C0804r0 c0804r0) {
        this(c0804r0, ProxyCacheKt.getGlobalProxyCache());
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializerHelper
    public final void applySettings(NativeBarcodeFind mode, NativeBarcodeFindSettings settings) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(settings, "settings");
        ProxyCache proxyCache = this.b;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f18215a.a((BarcodeFind) proxyCache.require(reflectionFactory.b(NativeBarcodeFind.class), null, mode), (BarcodeFindSettings) this.b.require(reflectionFactory.b(NativeBarcodeFindSettings.class), null, settings));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializerHelper
    public final NativeBarcodeFind createMode() {
        BarcodeFind barcodeFindB = this.f18215a.b();
        NativeBarcodeFind nativeBarcodeFind_impl = barcodeFindB._impl();
        this.b.put(Reflection.f24268a.b(NativeBarcodeFind.class), null, nativeBarcodeFind_impl, barcodeFindB);
        return nativeBarcodeFind_impl;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializerHelper
    public final NativeBarcodeFindSettings createSettings() {
        BarcodeFindSettings barcodeFindSettingsCreateSettings = this.f18215a.createSettings();
        NativeBarcodeFindSettings nativeBarcodeFindSettings_impl = barcodeFindSettingsCreateSettings._impl();
        this.b.put(Reflection.f24268a.b(NativeBarcodeFindSettings.class), null, nativeBarcodeFindSettings_impl, barcodeFindSettingsCreateSettings);
        return nativeBarcodeFindSettings_impl;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializerHelper
    public final void updateModeFromJson(NativeBarcodeFind mode, NativeJsonValue json) {
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        ProxyCache proxyCache = this.b;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f18215a.a((BarcodeFind) proxyCache.require(reflectionFactory.b(NativeBarcodeFind.class), null, mode), (JsonValue) this.b.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new C0819s0(json)));
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializerHelper
    public final void updateSettingsFromJson(NativeBarcodeFindSettings settings, NativeJsonValue json) {
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        ProxyCache proxyCache = this.b;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        this.f18215a.a((BarcodeFindSettings) proxyCache.require(reflectionFactory.b(NativeBarcodeFindSettings.class), null, settings), (JsonValue) this.b.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new C0841t0(json)));
    }

    public C0864u0(C0804r0 _BarcodeFindDeserializerHelper, ProxyCache proxyCache) {
        Intrinsics.h(_BarcodeFindDeserializerHelper, "_BarcodeFindDeserializerHelper");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18215a = _BarcodeFindDeserializerHelper;
        this.b = proxyCache;
    }
}
