package com.scandit.datacapture.barcode.selection.capture;

import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelection;
import com.scandit.datacapture.barcode.selection.internal.module.capture.NativeBarcodeSelectionSettings;
import com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializer;
import com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerListener;
import com.scandit.datacapture.barcode.selection.internal.module.ui.overlay.NativeBarcodeSelectionBasicOverlay;
import com.scandit.datacapture.barcode.selection.ui.overlay.BarcodeSelectionBasicOverlay;
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

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\u0018\u001a\u00020\u00138\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001f"}, d2 = {"Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerListenerReversedAdapter;", "Lcom/scandit/datacapture/barcode/selection/internal/module/serialization/NativeBarcodeSelectionDeserializerListener;", "Lcom/scandit/datacapture/barcode/selection/internal/module/serialization/NativeBarcodeSelectionDeserializer;", "deserializer", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelection;", "mode", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "json", "", "onModeDeserializationStarted", "onModeDeserializationFinished", "Lcom/scandit/datacapture/barcode/selection/internal/module/capture/NativeBarcodeSelectionSettings;", "settings", "onSettingsDeserializationStarted", "onSettingsDeserializationFinished", "Lcom/scandit/datacapture/barcode/selection/internal/module/ui/overlay/NativeBarcodeSelectionBasicOverlay;", "overlay", "onBasicOverlayDeserializationStarted", "onBasicOverlayDeserializationFinished", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_barcode_capture", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerListener;", "_BarcodeSelectionDeserializerListener", "Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializer;", "_BarcodeSelectionDeserializer", "<init>", "(Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializerListener;Lcom/scandit/datacapture/barcode/selection/capture/BarcodeSelectionDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-barcode-capture"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class BarcodeSelectionDeserializerListenerReversedAdapter extends NativeBarcodeSelectionDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    private final BarcodeSelectionDeserializerListener f18021a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final WeakReference c;

    public /* synthetic */ BarcodeSelectionDeserializerListenerReversedAdapter(BarcodeSelectionDeserializerListener barcodeSelectionDeserializerListener, BarcodeSelectionDeserializer barcodeSelectionDeserializer, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(barcodeSelectionDeserializerListener, barcodeSelectionDeserializer, (i & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_barcode_capture, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerListener
    public void onBasicOverlayDeserializationFinished(@NotNull NativeBarcodeSelectionDeserializer deserializer, @NotNull NativeBarcodeSelectionBasicOverlay overlay, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        BarcodeSelectionDeserializer barcodeSelectionDeserializer = (BarcodeSelectionDeserializer) this.c.get();
        if (barcodeSelectionDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeSelectionDeserializer.class), null, deserializer, new l(barcodeSelectionDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…hed(_0, _1, _2)\n        }");
            BarcodeSelectionBasicOverlay barcodeSelectionBasicOverlay = (BarcodeSelectionBasicOverlay) this.proxyCache.require(reflectionFactory.b(NativeBarcodeSelectionBasicOverlay.class), null, overlay);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new m(json));
            this.f18021a.onBasicOverlayDeserializationFinished((BarcodeSelectionDeserializer) orPut, barcodeSelectionBasicOverlay, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerListener
    public void onBasicOverlayDeserializationStarted(@NotNull NativeBarcodeSelectionDeserializer deserializer, @NotNull NativeBarcodeSelectionBasicOverlay overlay, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(overlay, "overlay");
        Intrinsics.h(json, "json");
        BarcodeSelectionDeserializer barcodeSelectionDeserializer = (BarcodeSelectionDeserializer) this.c.get();
        if (barcodeSelectionDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeSelectionDeserializer.class), null, deserializer, new n(barcodeSelectionDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…ted(_0, _1, _2)\n        }");
            BarcodeSelectionBasicOverlay barcodeSelectionBasicOverlay = (BarcodeSelectionBasicOverlay) this.proxyCache.require(reflectionFactory.b(NativeBarcodeSelectionBasicOverlay.class), null, overlay);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new o(json));
            this.f18021a.onBasicOverlayDeserializationStarted((BarcodeSelectionDeserializer) orPut, barcodeSelectionBasicOverlay, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerListener
    public void onModeDeserializationFinished(@NotNull NativeBarcodeSelectionDeserializer deserializer, @NotNull NativeBarcodeSelection mode, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        BarcodeSelectionDeserializer barcodeSelectionDeserializer = (BarcodeSelectionDeserializer) this.c.get();
        if (barcodeSelectionDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeSelectionDeserializer.class), null, deserializer, new p(barcodeSelectionDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…hed(_0, _1, _2)\n        }");
            BarcodeSelection barcodeSelection = (BarcodeSelection) this.proxyCache.require(reflectionFactory.b(NativeBarcodeSelection.class), null, mode);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new q(json));
            this.f18021a.onModeDeserializationFinished((BarcodeSelectionDeserializer) orPut, barcodeSelection, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerListener
    public void onModeDeserializationStarted(@NotNull NativeBarcodeSelectionDeserializer deserializer, @NotNull NativeBarcodeSelection mode, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(mode, "mode");
        Intrinsics.h(json, "json");
        BarcodeSelectionDeserializer barcodeSelectionDeserializer = (BarcodeSelectionDeserializer) this.c.get();
        if (barcodeSelectionDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeSelectionDeserializer.class), null, deserializer, new r(barcodeSelectionDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…ted(_0, _1, _2)\n        }");
            BarcodeSelection barcodeSelection = (BarcodeSelection) this.proxyCache.require(reflectionFactory.b(NativeBarcodeSelection.class), null, mode);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new s(json));
            this.f18021a.onModeDeserializationStarted((BarcodeSelectionDeserializer) orPut, barcodeSelection, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerListener
    public void onSettingsDeserializationFinished(@NotNull NativeBarcodeSelectionDeserializer deserializer, @NotNull NativeBarcodeSelectionSettings settings, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        BarcodeSelectionDeserializer barcodeSelectionDeserializer = (BarcodeSelectionDeserializer) this.c.get();
        if (barcodeSelectionDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeSelectionDeserializer.class), null, deserializer, new t(barcodeSelectionDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…hed(_0, _1, _2)\n        }");
            BarcodeSelectionSettings barcodeSelectionSettings = (BarcodeSelectionSettings) this.proxyCache.require(reflectionFactory.b(NativeBarcodeSelectionSettings.class), null, settings);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new u(json));
            this.f18021a.onSettingsDeserializationFinished((BarcodeSelectionDeserializer) orPut, barcodeSelectionSettings, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.barcode.selection.internal.module.serialization.NativeBarcodeSelectionDeserializerListener
    public void onSettingsDeserializationStarted(@NotNull NativeBarcodeSelectionDeserializer deserializer, @NotNull NativeBarcodeSelectionSettings settings, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        BarcodeSelectionDeserializer barcodeSelectionDeserializer = (BarcodeSelectionDeserializer) this.c.get();
        if (barcodeSelectionDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeBarcodeSelectionDeserializer.class), null, deserializer, new v(barcodeSelectionDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…ted(_0, _1, _2)\n        }");
            BarcodeSelectionSettings barcodeSelectionSettings = (BarcodeSelectionSettings) this.proxyCache.require(reflectionFactory.b(NativeBarcodeSelectionSettings.class), null, settings);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new w(json));
            this.f18021a.onSettingsDeserializationStarted((BarcodeSelectionDeserializer) orPut, barcodeSelectionSettings, jsonValue);
        }
    }

    public BarcodeSelectionDeserializerListenerReversedAdapter(@NotNull BarcodeSelectionDeserializerListener _BarcodeSelectionDeserializerListener, @NotNull BarcodeSelectionDeserializer _BarcodeSelectionDeserializer, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_BarcodeSelectionDeserializerListener, "_BarcodeSelectionDeserializerListener");
        Intrinsics.h(_BarcodeSelectionDeserializer, "_BarcodeSelectionDeserializer");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18021a = _BarcodeSelectionDeserializerListener;
        this.proxyCache = proxyCache;
        this.c = new WeakReference(_BarcodeSelectionDeserializer);
    }
}
