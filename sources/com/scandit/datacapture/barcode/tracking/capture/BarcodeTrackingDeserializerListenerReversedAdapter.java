package com.scandit.datacapture.barcode.tracking.capture;

import com.scandit.datacapture.barcode.tracking.internal.module.capture.NativeBarcodeTracking;
import com.scandit.datacapture.barcode.tracking.internal.module.capture.NativeBarcodeTrackingSettings;
import com.scandit.datacapture.barcode.tracking.internal.module.serialization.NativeBarcodeTrackingDeserializer;
import com.scandit.datacapture.barcode.tracking.internal.module.serialization.NativeBarcodeTrackingDeserializerListener;
import com.scandit.datacapture.barcode.tracking.internal.module.ui.overlay.NativeBarcodeTrackingAdvancedOverlay;
import com.scandit.datacapture.barcode.tracking.internal.module.ui.overlay.NativeBarcodeTrackingBasicOverlay;
import com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingAdvancedOverlay;
import com.scandit.datacapture.barcode.tracking.ui.overlay.BarcodeTrackingBasicOverlay;
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

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b \u0010!J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u0013\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u0015\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\u001b\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\""}, d2 = {"Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingDeserializerListenerReversedAdapter;", "Lcom/scandit/datacapture/barcode/tracking/internal/module/serialization/NativeBarcodeTrackingDeserializerListener;", "Lcom/scandit/datacapture/barcode/tracking/internal/module/serialization/NativeBarcodeTrackingDeserializer;", "deserializer", "Lcom/scandit/datacapture/barcode/tracking/internal/module/capture/NativeBarcodeTracking;", "mode", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "json", "", "onModeDeserializationStarted", "Lcom/scandit/datacapture/barcode/tracking/internal/module/capture/NativeBarcodeTrackingSettings;", "settings", "onSettingsDeserializationStarted", "onSettingsDeserializationFinished", "Lcom/scandit/datacapture/barcode/tracking/internal/module/ui/overlay/NativeBarcodeTrackingBasicOverlay;", "overlay", "onBasicOverlayDeserializationStarted", "onBasicOverlayDeserializationFinished", "Lcom/scandit/datacapture/barcode/tracking/internal/module/ui/overlay/NativeBarcodeTrackingAdvancedOverlay;", "onAdvancedOverlayDeserializationStarted", "onAdvancedOverlayDeserializationFinished", "onModeDeserializationFinished", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingDeserializerListener;", "_BarcodeTrackingDeserializerListener", "Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingDeserializer;", "_BarcodeTrackingDeserializer", "<init>", "(Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingDeserializerListener;Lcom/scandit/datacapture/barcode/tracking/capture/BarcodeTrackingDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeTrackingDeserializerListenerReversedAdapter extends NativeBarcodeTrackingDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeTrackingDeserializerListener f18149a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final WeakReference c;

    public /* synthetic */ BarcodeTrackingDeserializerListenerReversedAdapter(BarcodeTrackingDeserializerListener barcodeTrackingDeserializerListener, BarcodeTrackingDeserializer barcodeTrackingDeserializer, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeTrackingDeserializerListener, barcodeTrackingDeserializer, (i & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.tracking.internal.module.serialization.NativeBarcodeTrackingDeserializerListener
    public void onAdvancedOverlayDeserializationFinished(@NotNull NativeBarcodeTrackingDeserializer deserializer, @NotNull NativeBarcodeTrackingAdvancedOverlay overlay, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        BarcodeTrackingDeserializer barcodeTrackingDeserializer = (BarcodeTrackingDeserializer) this.c.get();
        if (barcodeTrackingDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeTrackingDeserializer.class), null, deserializer, new l(barcodeTrackingDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…            _2)\n        }");
            BarcodeTrackingAdvancedOverlay barcodeTrackingAdvancedOverlay = (BarcodeTrackingAdvancedOverlay) this.proxyCache.require(reflectionFactory.b(NativeBarcodeTrackingAdvancedOverlay.class), null, overlay);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new m(json));
            this.f18149a.onAdvancedOverlayDeserializationFinished((BarcodeTrackingDeserializer) orPut, barcodeTrackingAdvancedOverlay, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.tracking.internal.module.serialization.NativeBarcodeTrackingDeserializerListener
    public void onAdvancedOverlayDeserializationStarted(@NotNull NativeBarcodeTrackingDeserializer deserializer, @NotNull NativeBarcodeTrackingAdvancedOverlay overlay, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        BarcodeTrackingDeserializer barcodeTrackingDeserializer = (BarcodeTrackingDeserializer) this.c.get();
        if (barcodeTrackingDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeTrackingDeserializer.class), null, deserializer, new n(barcodeTrackingDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…ted(_0, _1, _2)\n        }");
            BarcodeTrackingAdvancedOverlay barcodeTrackingAdvancedOverlay = (BarcodeTrackingAdvancedOverlay) this.proxyCache.require(reflectionFactory.b(NativeBarcodeTrackingAdvancedOverlay.class), null, overlay);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new o(json));
            this.f18149a.onAdvancedOverlayDeserializationStarted((BarcodeTrackingDeserializer) orPut, barcodeTrackingAdvancedOverlay, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.tracking.internal.module.serialization.NativeBarcodeTrackingDeserializerListener
    public void onBasicOverlayDeserializationFinished(@NotNull NativeBarcodeTrackingDeserializer deserializer, @NotNull NativeBarcodeTrackingBasicOverlay overlay, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        BarcodeTrackingDeserializer barcodeTrackingDeserializer = (BarcodeTrackingDeserializer) this.c.get();
        if (barcodeTrackingDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeTrackingDeserializer.class), null, deserializer, new p(barcodeTrackingDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…hed(_0, _1, _2)\n        }");
            BarcodeTrackingBasicOverlay barcodeTrackingBasicOverlay = (BarcodeTrackingBasicOverlay) this.proxyCache.require(reflectionFactory.b(NativeBarcodeTrackingBasicOverlay.class), null, overlay);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new q(json));
            this.f18149a.onBasicOverlayDeserializationFinished((BarcodeTrackingDeserializer) orPut, barcodeTrackingBasicOverlay, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.tracking.internal.module.serialization.NativeBarcodeTrackingDeserializerListener
    public void onBasicOverlayDeserializationStarted(@NotNull NativeBarcodeTrackingDeserializer deserializer, @NotNull NativeBarcodeTrackingBasicOverlay overlay, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        BarcodeTrackingDeserializer barcodeTrackingDeserializer = (BarcodeTrackingDeserializer) this.c.get();
        if (barcodeTrackingDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeTrackingDeserializer.class), null, deserializer, new r(barcodeTrackingDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…ted(_0, _1, _2)\n        }");
            BarcodeTrackingBasicOverlay barcodeTrackingBasicOverlay = (BarcodeTrackingBasicOverlay) this.proxyCache.require(reflectionFactory.b(NativeBarcodeTrackingBasicOverlay.class), null, overlay);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new s(json));
            this.f18149a.onBasicOverlayDeserializationStarted((BarcodeTrackingDeserializer) orPut, barcodeTrackingBasicOverlay, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.tracking.internal.module.serialization.NativeBarcodeTrackingDeserializerListener
    public void onModeDeserializationFinished(@NotNull NativeBarcodeTrackingDeserializer deserializer, @NotNull NativeBarcodeTracking mode, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        BarcodeTrackingDeserializer barcodeTrackingDeserializer = (BarcodeTrackingDeserializer) this.c.get();
        if (barcodeTrackingDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeTrackingDeserializer.class), null, deserializer, new t(barcodeTrackingDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…hed(_0, _1, _2)\n        }");
            BarcodeTracking barcodeTracking = (BarcodeTracking) this.proxyCache.require(reflectionFactory.b(NativeBarcodeTracking.class), null, mode);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new u(json));
            this.f18149a.onModeDeserializationFinished((BarcodeTrackingDeserializer) orPut, barcodeTracking, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.tracking.internal.module.serialization.NativeBarcodeTrackingDeserializerListener
    public void onModeDeserializationStarted(@NotNull NativeBarcodeTrackingDeserializer deserializer, @NotNull NativeBarcodeTracking mode, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        BarcodeTrackingDeserializer barcodeTrackingDeserializer = (BarcodeTrackingDeserializer) this.c.get();
        if (barcodeTrackingDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeTrackingDeserializer.class), null, deserializer, new v(barcodeTrackingDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…ted(_0, _1, _2)\n        }");
            BarcodeTracking barcodeTracking = (BarcodeTracking) this.proxyCache.require(reflectionFactory.b(NativeBarcodeTracking.class), null, mode);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new w(json));
            this.f18149a.onModeDeserializationStarted((BarcodeTrackingDeserializer) orPut, barcodeTracking, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.tracking.internal.module.serialization.NativeBarcodeTrackingDeserializerListener
    public void onSettingsDeserializationFinished(@NotNull NativeBarcodeTrackingDeserializer deserializer, @NotNull NativeBarcodeTrackingSettings settings, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        BarcodeTrackingDeserializer barcodeTrackingDeserializer = (BarcodeTrackingDeserializer) this.c.get();
        if (barcodeTrackingDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeTrackingDeserializer.class), null, deserializer, new x(barcodeTrackingDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…hed(_0, _1, _2)\n        }");
            BarcodeTrackingSettings barcodeTrackingSettings = (BarcodeTrackingSettings) this.proxyCache.require(reflectionFactory.b(NativeBarcodeTrackingSettings.class), null, settings);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new y(json));
            this.f18149a.onSettingsDeserializationFinished((BarcodeTrackingDeserializer) orPut, barcodeTrackingSettings, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.tracking.internal.module.serialization.NativeBarcodeTrackingDeserializerListener
    public void onSettingsDeserializationStarted(@NotNull NativeBarcodeTrackingDeserializer deserializer, @NotNull NativeBarcodeTrackingSettings settings, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        BarcodeTrackingDeserializer barcodeTrackingDeserializer = (BarcodeTrackingDeserializer) this.c.get();
        if (barcodeTrackingDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeTrackingDeserializer.class), null, deserializer, new z(barcodeTrackingDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…ted(_0, _1, _2)\n        }");
            BarcodeTrackingSettings barcodeTrackingSettings = (BarcodeTrackingSettings) this.proxyCache.require(reflectionFactory.b(NativeBarcodeTrackingSettings.class), null, settings);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new A(json));
            this.f18149a.onSettingsDeserializationStarted((BarcodeTrackingDeserializer) orPut, barcodeTrackingSettings, jsonValue);
        }
    }

    public BarcodeTrackingDeserializerListenerReversedAdapter(@NotNull BarcodeTrackingDeserializerListener _BarcodeTrackingDeserializerListener, @NotNull BarcodeTrackingDeserializer _BarcodeTrackingDeserializer, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_BarcodeTrackingDeserializerListener, "_BarcodeTrackingDeserializerListener");
        Intrinsics.h(_BarcodeTrackingDeserializer, "_BarcodeTrackingDeserializer");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18149a = _BarcodeTrackingDeserializerListener;
        this.proxyCache = proxyCache;
        this.c = new WeakReference(_BarcodeTrackingDeserializer);
    }
}
