package com.scandit.datacapture.barcode.capture;

import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCapture;
import com.scandit.datacapture.barcode.internal.module.capture.NativeBarcodeCaptureSettings;
import com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializer;
import com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializerListener;
import com.scandit.datacapture.barcode.internal.module.ui.NativeBarcodeCaptureOverlay;
import com.scandit.datacapture.barcode.ui.overlay.BarcodeCaptureOverlay;
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

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\u0018\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerListenerReversedAdapter;", "Lcom/scandit/datacapture/barcode/internal/module/serialization/NativeBarcodeCaptureDeserializerListener;", "Lcom/scandit/datacapture/barcode/internal/module/serialization/NativeBarcodeCaptureDeserializer;", "deserializer", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCapture;", "mode", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "json", "", "onModeDeserializationStarted", "Lcom/scandit/datacapture/barcode/internal/module/capture/NativeBarcodeCaptureSettings;", "settings", "onSettingsDeserializationStarted", "onSettingsDeserializationFinished", "Lcom/scandit/datacapture/barcode/internal/module/ui/NativeBarcodeCaptureOverlay;", "overlay", "onOverlayDeserializationStarted", "onOverlayDeserializationFinished", "onModeDeserializationFinished", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerListener;", "_BarcodeCaptureDeserializerListener", "Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializer;", "_BarcodeCaptureDeserializer", "<init>", "(Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializerListener;Lcom/scandit/datacapture/barcode/capture/BarcodeCaptureDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeCaptureDeserializerListenerReversedAdapter extends NativeBarcodeCaptureDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeCaptureDeserializerListener f17409a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final WeakReference c;

    public /* synthetic */ BarcodeCaptureDeserializerListenerReversedAdapter(BarcodeCaptureDeserializerListener barcodeCaptureDeserializerListener, BarcodeCaptureDeserializer barcodeCaptureDeserializer, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeCaptureDeserializerListener, barcodeCaptureDeserializer, (i & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializerListener
    public void onModeDeserializationFinished(@NotNull NativeBarcodeCaptureDeserializer deserializer, @NotNull NativeBarcodeCapture mode, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        BarcodeCaptureDeserializer barcodeCaptureDeserializer = (BarcodeCaptureDeserializer) this.c.get();
        if (barcodeCaptureDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCaptureDeserializer.class), null, deserializer, new C0570p(barcodeCaptureDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…hed(_0, _1, _2)\n        }");
            BarcodeCapture barcodeCapture = (BarcodeCapture) this.proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCapture.class), null, mode, new C0571q(mode));
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new r(json));
            this.f17409a.onModeDeserializationFinished((BarcodeCaptureDeserializer) orPut, barcodeCapture, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializerListener
    public void onModeDeserializationStarted(@NotNull NativeBarcodeCaptureDeserializer deserializer, @NotNull NativeBarcodeCapture mode, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        BarcodeCaptureDeserializer barcodeCaptureDeserializer = (BarcodeCaptureDeserializer) this.c.get();
        if (barcodeCaptureDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCaptureDeserializer.class), null, deserializer, new C0572s(barcodeCaptureDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…ted(_0, _1, _2)\n        }");
            BarcodeCapture barcodeCapture = (BarcodeCapture) this.proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCapture.class), null, mode, new C0573t(mode));
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new C0574u(json));
            this.f17409a.onModeDeserializationStarted((BarcodeCaptureDeserializer) orPut, barcodeCapture, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializerListener
    public void onOverlayDeserializationFinished(@NotNull NativeBarcodeCaptureDeserializer deserializer, @NotNull NativeBarcodeCaptureOverlay overlay, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        BarcodeCaptureDeserializer barcodeCaptureDeserializer = (BarcodeCaptureDeserializer) this.c.get();
        if (barcodeCaptureDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCaptureDeserializer.class), null, deserializer, new v(barcodeCaptureDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…hed(_0, _1, _2)\n        }");
            BarcodeCaptureOverlay barcodeCaptureOverlay = (BarcodeCaptureOverlay) this.proxyCache.require(reflectionFactory.b(NativeBarcodeCaptureOverlay.class), null, overlay);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new w(json));
            this.f17409a.onOverlayDeserializationFinished((BarcodeCaptureDeserializer) orPut, barcodeCaptureOverlay, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializerListener
    public void onOverlayDeserializationStarted(@NotNull NativeBarcodeCaptureDeserializer deserializer, @NotNull NativeBarcodeCaptureOverlay overlay, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        BarcodeCaptureDeserializer barcodeCaptureDeserializer = (BarcodeCaptureDeserializer) this.c.get();
        if (barcodeCaptureDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCaptureDeserializer.class), null, deserializer, new x(barcodeCaptureDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…ted(_0, _1, _2)\n        }");
            BarcodeCaptureOverlay barcodeCaptureOverlay = (BarcodeCaptureOverlay) this.proxyCache.require(reflectionFactory.b(NativeBarcodeCaptureOverlay.class), null, overlay);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new y(json));
            this.f17409a.onOverlayDeserializationStarted((BarcodeCaptureDeserializer) orPut, barcodeCaptureOverlay, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializerListener
    public void onSettingsDeserializationFinished(@NotNull NativeBarcodeCaptureDeserializer deserializer, @NotNull NativeBarcodeCaptureSettings settings, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        BarcodeCaptureDeserializer barcodeCaptureDeserializer = (BarcodeCaptureDeserializer) this.c.get();
        if (barcodeCaptureDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCaptureDeserializer.class), null, deserializer, new z(barcodeCaptureDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…hed(_0, _1, _2)\n        }");
            BarcodeCaptureSettings barcodeCaptureSettings = (BarcodeCaptureSettings) this.proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCaptureSettings.class), null, settings, new A(settings));
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new B(json));
            this.f17409a.onSettingsDeserializationFinished((BarcodeCaptureDeserializer) orPut, barcodeCaptureSettings, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.internal.module.serialization.NativeBarcodeCaptureDeserializerListener
    public void onSettingsDeserializationStarted(@NotNull NativeBarcodeCaptureDeserializer deserializer, @NotNull NativeBarcodeCaptureSettings settings, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        BarcodeCaptureDeserializer barcodeCaptureDeserializer = (BarcodeCaptureDeserializer) this.c.get();
        if (barcodeCaptureDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCaptureDeserializer.class), null, deserializer, new C(barcodeCaptureDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…ted(_0, _1, _2)\n        }");
            BarcodeCaptureSettings barcodeCaptureSettings = (BarcodeCaptureSettings) this.proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeCaptureSettings.class), null, settings, new D(settings));
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new E(json));
            this.f17409a.onSettingsDeserializationStarted((BarcodeCaptureDeserializer) orPut, barcodeCaptureSettings, jsonValue);
        }
    }

    public BarcodeCaptureDeserializerListenerReversedAdapter(@NotNull BarcodeCaptureDeserializerListener _BarcodeCaptureDeserializerListener, @NotNull BarcodeCaptureDeserializer _BarcodeCaptureDeserializer, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_BarcodeCaptureDeserializerListener, "_BarcodeCaptureDeserializerListener");
        Intrinsics.h(_BarcodeCaptureDeserializer, "_BarcodeCaptureDeserializer");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f17409a = _BarcodeCaptureDeserializerListener;
        this.proxyCache = proxyCache;
        this.c = new WeakReference(_BarcodeCaptureDeserializer);
    }
}
