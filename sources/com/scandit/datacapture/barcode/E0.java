package com.scandit.datacapture.barcode;

import com.scandit.datacapture.barcode.find.capture.BarcodeFind;
import com.scandit.datacapture.barcode.find.capture.BarcodeFindSettings;
import com.scandit.datacapture.barcode.find.serialization.BarcodeFindDeserializer;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFind;
import com.scandit.datacapture.barcode.internal.module.find.capture.NativeBarcodeFindSettings;
import com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializer;
import com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializerListener;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;

/* loaded from: classes6.dex */
public final class E0 extends NativeBarcodeFindDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC0879v0 f17143a;
    private final ProxyCache b;
    private final WeakReference c;

    public /* synthetic */ E0(InterfaceC0879v0 interfaceC0879v0, BarcodeFindDeserializer barcodeFindDeserializer) {
        this(interfaceC0879v0, barcodeFindDeserializer, ProxyCacheKt.getGlobalProxyCache());
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializerListener
    public final void onModeDeserializationFinished(NativeBarcodeFindDeserializer deserializer, NativeBarcodeFind mode, NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        BarcodeFindDeserializer barcodeFindDeserializer = (BarcodeFindDeserializer) this.c.get();
        if (barcodeFindDeserializer != null) {
            ProxyCache proxyCache = this.b;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeFindDeserializer.class), null, deserializer, new C0894w0(barcodeFindDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…hed(_0, _1, _2)\n        }");
            BarcodeFind barcodeFind = (BarcodeFind) this.b.require(reflectionFactory.b(NativeBarcodeFind.class), null, mode);
            JsonValue jsonValue = (JsonValue) this.b.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new C0909x0(json));
            this.f17143a.onModeDeserializationFinished((BarcodeFindDeserializer) orPut, barcodeFind, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializerListener
    public final void onModeDeserializationStarted(NativeBarcodeFindDeserializer deserializer, NativeBarcodeFind mode, NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        BarcodeFindDeserializer barcodeFindDeserializer = (BarcodeFindDeserializer) this.c.get();
        if (barcodeFindDeserializer != null) {
            ProxyCache proxyCache = this.b;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeFindDeserializer.class), null, deserializer, new C0924y0(barcodeFindDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…ted(_0, _1, _2)\n        }");
            BarcodeFind barcodeFind = (BarcodeFind) this.b.require(reflectionFactory.b(NativeBarcodeFind.class), null, mode);
            JsonValue jsonValue = (JsonValue) this.b.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new C0939z0(json));
            this.f17143a.onModeDeserializationStarted((BarcodeFindDeserializer) orPut, barcodeFind, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializerListener
    public final void onSettingsDeserializationFinished(NativeBarcodeFindDeserializer deserializer, NativeBarcodeFindSettings settings, NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        BarcodeFindDeserializer barcodeFindDeserializer = (BarcodeFindDeserializer) this.c.get();
        if (barcodeFindDeserializer != null) {
            ProxyCache proxyCache = this.b;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeFindDeserializer.class), null, deserializer, new A0(barcodeFindDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…hed(_0, _1, _2)\n        }");
            BarcodeFindSettings barcodeFindSettings = (BarcodeFindSettings) this.b.require(reflectionFactory.b(NativeBarcodeFindSettings.class), null, settings);
            JsonValue jsonValue = (JsonValue) this.b.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new B0(json));
            this.f17143a.onSettingsDeserializationFinished((BarcodeFindDeserializer) orPut, barcodeFindSettings, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.find.serialization.NativeBarcodeFindDeserializerListener
    public final void onSettingsDeserializationStarted(NativeBarcodeFindDeserializer deserializer, NativeBarcodeFindSettings settings, NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        BarcodeFindDeserializer barcodeFindDeserializer = (BarcodeFindDeserializer) this.c.get();
        if (barcodeFindDeserializer != null) {
            ProxyCache proxyCache = this.b;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeFindDeserializer.class), null, deserializer, new C0(barcodeFindDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…ted(_0, _1, _2)\n        }");
            BarcodeFindSettings barcodeFindSettings = (BarcodeFindSettings) this.b.require(reflectionFactory.b(NativeBarcodeFindSettings.class), null, settings);
            JsonValue jsonValue = (JsonValue) this.b.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new D0(json));
            this.f17143a.onSettingsDeserializationStarted((BarcodeFindDeserializer) orPut, barcodeFindSettings, jsonValue);
        }
    }

    public E0(InterfaceC0879v0 _BarcodeFindDeserializerInternalListener, BarcodeFindDeserializer _BarcodeFindDeserializer, ProxyCache proxyCache) {
        Intrinsics.h(_BarcodeFindDeserializerInternalListener, "_BarcodeFindDeserializerInternalListener");
        Intrinsics.h(_BarcodeFindDeserializer, "_BarcodeFindDeserializer");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17143a = _BarcodeFindDeserializerInternalListener;
        this.b = proxyCache;
        this.c = new WeakReference(_BarcodeFindDeserializer);
    }
}
