package com.scandit.datacapture.barcode.pick.serialization;

import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePick;
import com.scandit.datacapture.barcode.internal.module.pick.capture.NativeBarcodePickSettings;
import com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializer;
import com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerListener;
import com.scandit.datacapture.barcode.internal.sdk.BarcodeNativeTypeFactory;
import com.scandit.datacapture.barcode.pick.capture.BarcodePick;
import com.scandit.datacapture.barcode.pick.capture.BarcodePickSettings;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializerListenerReversedAdapter;", "Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/NativeBarcodePickDeserializerListener;", "Lcom/scandit/datacapture/barcode/internal/module/pick/serialization/NativeBarcodePickDeserializer;", "deserializer", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePick;", "mode", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "json", "", "onModeDeserializationStarted", "Lcom/scandit/datacapture/barcode/internal/module/pick/capture/NativeBarcodePickSettings;", "settings", "onSettingsDeserializationStarted", "onSettingsDeserializationFinished", "onModeDeserializationFinished", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializerListener;", "_BarcodePickDeserializerListener", "Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializer;", "_BarcodePickDeserializer", "<init>", "(Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializerListener;Lcom/scandit/datacapture/barcode/pick/serialization/BarcodePickDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodePickDeserializerListenerReversedAdapter extends NativeBarcodePickDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodePickDeserializerListener f17918a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final WeakReference c;

    public /* synthetic */ BarcodePickDeserializerListenerReversedAdapter(BarcodePickDeserializerListener barcodePickDeserializerListener, BarcodePickDeserializer barcodePickDeserializer, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodePickDeserializerListener, barcodePickDeserializer, (i & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerListener
    public void onModeDeserializationFinished(@NotNull NativeBarcodePickDeserializer deserializer, @NotNull NativeBarcodePick mode, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        BarcodePickDeserializer barcodePickDeserializer = (BarcodePickDeserializer) this.c.get();
        if (barcodePickDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodePickDeserializer.class), null, deserializer, new h(barcodePickDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…hed(_0, _1, _2)\n        }");
            BarcodePick barcodePickConvert = BarcodeNativeTypeFactory.INSTANCE.convert(mode);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new i(json));
            this.f17918a.onModeDeserializationFinished((BarcodePickDeserializer) orPut, barcodePickConvert, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerListener
    public void onModeDeserializationStarted(@NotNull NativeBarcodePickDeserializer deserializer, @NotNull NativeBarcodePick mode, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        BarcodePickDeserializer barcodePickDeserializer = (BarcodePickDeserializer) this.c.get();
        if (barcodePickDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodePickDeserializer.class), null, deserializer, new j(barcodePickDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…ted(_0, _1, _2)\n        }");
            BarcodePick barcodePickConvert = BarcodeNativeTypeFactory.INSTANCE.convert(mode);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new k(json));
            this.f17918a.onModeDeserializationStarted((BarcodePickDeserializer) orPut, barcodePickConvert, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerListener
    public void onSettingsDeserializationFinished(@NotNull NativeBarcodePickDeserializer deserializer, @NotNull NativeBarcodePickSettings settings, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        BarcodePickDeserializer barcodePickDeserializer = (BarcodePickDeserializer) this.c.get();
        if (barcodePickDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodePickDeserializer.class), null, deserializer, new l(barcodePickDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…hed(_0, _1, _2)\n        }");
            BarcodePickSettings barcodePickSettings = (BarcodePickSettings) this.proxyCache.require(reflectionFactory.b(NativeBarcodePickSettings.class), null, settings);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new m(json));
            this.f17918a.onSettingsDeserializationFinished((BarcodePickDeserializer) orPut, barcodePickSettings, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.pick.serialization.NativeBarcodePickDeserializerListener
    public void onSettingsDeserializationStarted(@NotNull NativeBarcodePickDeserializer deserializer, @NotNull NativeBarcodePickSettings settings, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        BarcodePickDeserializer barcodePickDeserializer = (BarcodePickDeserializer) this.c.get();
        if (barcodePickDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodePickDeserializer.class), null, deserializer, new n(barcodePickDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…ted(_0, _1, _2)\n        }");
            BarcodePickSettings barcodePickSettings = (BarcodePickSettings) this.proxyCache.require(reflectionFactory.b(NativeBarcodePickSettings.class), null, settings);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new o(json));
            this.f17918a.onSettingsDeserializationStarted((BarcodePickDeserializer) orPut, barcodePickSettings, jsonValue);
        }
    }

    public BarcodePickDeserializerListenerReversedAdapter(@NotNull BarcodePickDeserializerListener _BarcodePickDeserializerListener, @NotNull BarcodePickDeserializer _BarcodePickDeserializer, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_BarcodePickDeserializerListener, "_BarcodePickDeserializerListener");
        Intrinsics.h(_BarcodePickDeserializer, "_BarcodePickDeserializer");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17918a = _BarcodePickDeserializerListener;
        this.proxyCache = proxyCache;
        this.c = new WeakReference(_BarcodePickDeserializer);
    }
}
