package com.scandit.datacapture.barcode.count.serialization;

import com.scandit.datacapture.barcode.count.capture.BarcodeCount;
import com.scandit.datacapture.barcode.count.capture.BarcodeCountSettings;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCount;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountBasicOverlay;
import com.scandit.datacapture.barcode.count.internal.module.capture.NativeBarcodeCountSettings;
import com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializer;
import com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializerListener;
import com.scandit.datacapture.barcode.count.ui.overlay.BarcodeCountBasicOverlay;
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

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\u0018\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerListenerReversedAdapter;", "Lcom/scandit/datacapture/barcode/count/internal/module/serialization/NativeBarcodeCountDeserializerListener;", "Lcom/scandit/datacapture/barcode/count/internal/module/serialization/NativeBarcodeCountDeserializer;", "deserializer", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCount;", "mode", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "json", "", "onModeDeserializationStarted", "onModeDeserializationFinished", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountSettings;", "settings", "onSettingsDeserializationStarted", "onSettingsDeserializationFinished", "Lcom/scandit/datacapture/barcode/count/internal/module/capture/NativeBarcodeCountBasicOverlay;", "overlay", "onBasicOverlayDeserializationStarted", "onBasicOverlayDeserializationFinished", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerListener;", "_BarcodeCountDeserializerListener", "Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializer;", "_BarcodeCountDeserializer", "<init>", "(Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializerListener;Lcom/scandit/datacapture/barcode/count/serialization/BarcodeCountDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCountDeserializerListenerReversedAdapter extends NativeBarcodeCountDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeCountDeserializerListener f17525a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final WeakReference c;

    public /* synthetic */ BarcodeCountDeserializerListenerReversedAdapter(BarcodeCountDeserializerListener barcodeCountDeserializerListener, BarcodeCountDeserializer barcodeCountDeserializer, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeCountDeserializerListener, barcodeCountDeserializer, (i & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializerListener
    public void onBasicOverlayDeserializationFinished(@NotNull NativeBarcodeCountDeserializer deserializer, @NotNull NativeBarcodeCountBasicOverlay overlay, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        BarcodeCountDeserializer barcodeCountDeserializer = (BarcodeCountDeserializer) this.c.get();
        if (barcodeCountDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCountDeserializer.class), null, deserializer, new h(barcodeCountDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…hed(_0, _1, _2)\n        }");
            BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.proxyCache.require(reflectionFactory.b(NativeBarcodeCountBasicOverlay.class), null, overlay);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new i(json));
            this.f17525a.onBasicOverlayDeserializationFinished((BarcodeCountDeserializer) orPut, barcodeCountBasicOverlay, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializerListener
    public void onBasicOverlayDeserializationStarted(@NotNull NativeBarcodeCountDeserializer deserializer, @NotNull NativeBarcodeCountBasicOverlay overlay, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        BarcodeCountDeserializer barcodeCountDeserializer = (BarcodeCountDeserializer) this.c.get();
        if (barcodeCountDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCountDeserializer.class), null, deserializer, new j(barcodeCountDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…ted(_0, _1, _2)\n        }");
            BarcodeCountBasicOverlay barcodeCountBasicOverlay = (BarcodeCountBasicOverlay) this.proxyCache.require(reflectionFactory.b(NativeBarcodeCountBasicOverlay.class), null, overlay);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new k(json));
            this.f17525a.onBasicOverlayDeserializationStarted((BarcodeCountDeserializer) orPut, barcodeCountBasicOverlay, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializerListener
    public void onModeDeserializationFinished(@NotNull NativeBarcodeCountDeserializer deserializer, @NotNull NativeBarcodeCount mode, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        BarcodeCountDeserializer barcodeCountDeserializer = (BarcodeCountDeserializer) this.c.get();
        if (barcodeCountDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCountDeserializer.class), null, deserializer, new l(barcodeCountDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…hed(_0, _1, _2)\n        }");
            BarcodeCount barcodeCount = (BarcodeCount) this.proxyCache.require(reflectionFactory.b(NativeBarcodeCount.class), null, mode);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new m(json));
            this.f17525a.onModeDeserializationFinished((BarcodeCountDeserializer) orPut, barcodeCount, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializerListener
    public void onModeDeserializationStarted(@NotNull NativeBarcodeCountDeserializer deserializer, @NotNull NativeBarcodeCount mode, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        BarcodeCountDeserializer barcodeCountDeserializer = (BarcodeCountDeserializer) this.c.get();
        if (barcodeCountDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCountDeserializer.class), null, deserializer, new n(barcodeCountDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…ted(_0, _1, _2)\n        }");
            BarcodeCount barcodeCount = (BarcodeCount) this.proxyCache.require(reflectionFactory.b(NativeBarcodeCount.class), null, mode);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new o(json));
            this.f17525a.onModeDeserializationStarted((BarcodeCountDeserializer) orPut, barcodeCount, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializerListener
    public void onSettingsDeserializationFinished(@NotNull NativeBarcodeCountDeserializer deserializer, @NotNull NativeBarcodeCountSettings settings, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        BarcodeCountDeserializer barcodeCountDeserializer = (BarcodeCountDeserializer) this.c.get();
        if (barcodeCountDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCountDeserializer.class), null, deserializer, new p(barcodeCountDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…hed(_0, _1, _2)\n        }");
            BarcodeCountSettings barcodeCountSettings = (BarcodeCountSettings) this.proxyCache.require(reflectionFactory.b(NativeBarcodeCountSettings.class), null, settings);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new q(json));
            this.f17525a.onSettingsDeserializationFinished((BarcodeCountDeserializer) orPut, barcodeCountSettings, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.count.internal.module.serialization.NativeBarcodeCountDeserializerListener
    public void onSettingsDeserializationStarted(@NotNull NativeBarcodeCountDeserializer deserializer, @NotNull NativeBarcodeCountSettings settings, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        BarcodeCountDeserializer barcodeCountDeserializer = (BarcodeCountDeserializer) this.c.get();
        if (barcodeCountDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCountDeserializer.class), null, deserializer, new r(barcodeCountDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…ted(_0, _1, _2)\n        }");
            BarcodeCountSettings barcodeCountSettings = (BarcodeCountSettings) this.proxyCache.require(reflectionFactory.b(NativeBarcodeCountSettings.class), null, settings);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new s(json));
            this.f17525a.onSettingsDeserializationStarted((BarcodeCountDeserializer) orPut, barcodeCountSettings, jsonValue);
        }
    }

    public BarcodeCountDeserializerListenerReversedAdapter(@NotNull BarcodeCountDeserializerListener _BarcodeCountDeserializerListener, @NotNull BarcodeCountDeserializer _BarcodeCountDeserializer, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_BarcodeCountDeserializerListener, "_BarcodeCountDeserializerListener");
        Intrinsics.h(_BarcodeCountDeserializer, "_BarcodeCountDeserializer");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17525a = _BarcodeCountDeserializerListener;
        this.proxyCache = proxyCache;
        this.c = new WeakReference(_BarcodeCountDeserializer);
    }
}
