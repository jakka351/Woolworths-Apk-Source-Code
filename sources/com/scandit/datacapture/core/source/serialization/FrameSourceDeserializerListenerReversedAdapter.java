package com.scandit.datacapture.core.source.serialization;

import com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializerListener;
import com.scandit.datacapture.core.internal.module.source.NativeCameraSettings;
import com.scandit.datacapture.core.internal.module.source.NativeFrameSource;
import com.scandit.datacapture.core.internal.sdk.CoreNativeTypeFactory;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.source.CameraSettings;
import com.scandit.datacapture.core.source.FrameSource;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, d2 = {"Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerListenerReversedAdapter;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeFrameSourceDeserializerListener;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeFrameSourceDeserializer;", "deserializer", "Lcom/scandit/datacapture/core/internal/module/source/NativeFrameSource;", "frameSource", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "json", "", "onFrameSourceDeserializationStarted", "Lcom/scandit/datacapture/core/internal/module/source/NativeCameraSettings;", "settings", "onCameraSettingsDeserializationStarted", "onCameraSettingsDeserializationFinished", "onFrameSourceDeserializationFinished", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerListener;", "_FrameSourceDeserializerListener", "Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer;", "_FrameSourceDeserializer", "<init>", "(Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializerListener;Lcom/scandit/datacapture/core/source/serialization/FrameSourceDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class FrameSourceDeserializerListenerReversedAdapter extends NativeFrameSourceDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    private final FrameSourceDeserializerListener f18859a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final WeakReference c;

    public /* synthetic */ FrameSourceDeserializerListenerReversedAdapter(FrameSourceDeserializerListener frameSourceDeserializerListener, FrameSourceDeserializer frameSourceDeserializer, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(frameSourceDeserializerListener, frameSourceDeserializer, (i & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializerListener
    public void onCameraSettingsDeserializationFinished(@NotNull NativeFrameSourceDeserializer deserializer, @NotNull NativeCameraSettings settings, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        FrameSourceDeserializer frameSourceDeserializer = (FrameSourceDeserializer) this.c.get();
        if (frameSourceDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeFrameSourceDeserializer.class), null, deserializer, new b(frameSourceDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…hed(_0, _1, _2)\n        }");
            CameraSettings cameraSettingsConvert = CoreNativeTypeFactory.INSTANCE.convert(settings);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new c(json));
            this.f18859a.onCameraSettingsDeserializationFinished((FrameSourceDeserializer) orPut, cameraSettingsConvert, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializerListener
    public void onCameraSettingsDeserializationStarted(@NotNull NativeFrameSourceDeserializer deserializer, @NotNull NativeCameraSettings settings, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(settings, "settings");
        Intrinsics.h(json, "json");
        FrameSourceDeserializer frameSourceDeserializer = (FrameSourceDeserializer) this.c.get();
        if (frameSourceDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeFrameSourceDeserializer.class), null, deserializer, new d(frameSourceDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…ted(_0, _1, _2)\n        }");
            CameraSettings cameraSettingsConvert = CoreNativeTypeFactory.INSTANCE.convert(settings);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new e(json));
            this.f18859a.onCameraSettingsDeserializationStarted((FrameSourceDeserializer) orPut, cameraSettingsConvert, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializerListener
    public void onFrameSourceDeserializationFinished(@NotNull NativeFrameSourceDeserializer deserializer, @NotNull NativeFrameSource frameSource, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(frameSource, "frameSource");
        Intrinsics.h(json, "json");
        FrameSourceDeserializer frameSourceDeserializer = (FrameSourceDeserializer) this.c.get();
        if (frameSourceDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeFrameSourceDeserializer.class), null, deserializer, new f(frameSourceDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…hed(_0, _1, _2)\n        }");
            FrameSource frameSource2 = (FrameSource) this.proxyCache.require(reflectionFactory.b(NativeFrameSource.class), null, frameSource);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new g(json));
            this.f18859a.onFrameSourceDeserializationFinished((FrameSourceDeserializer) orPut, frameSource2, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeFrameSourceDeserializerListener
    public void onFrameSourceDeserializationStarted(@NotNull NativeFrameSourceDeserializer deserializer, @NotNull NativeFrameSource frameSource, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(frameSource, "frameSource");
        Intrinsics.h(json, "json");
        FrameSourceDeserializer frameSourceDeserializer = (FrameSourceDeserializer) this.c.get();
        if (frameSourceDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeFrameSourceDeserializer.class), null, deserializer, new h(frameSourceDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…ted(_0, _1, _2)\n        }");
            FrameSource frameSource2 = (FrameSource) this.proxyCache.require(reflectionFactory.b(NativeFrameSource.class), null, frameSource);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new i(json));
            this.f18859a.onFrameSourceDeserializationStarted((FrameSourceDeserializer) orPut, frameSource2, jsonValue);
        }
    }

    public FrameSourceDeserializerListenerReversedAdapter(@NotNull FrameSourceDeserializerListener _FrameSourceDeserializerListener, @NotNull FrameSourceDeserializer _FrameSourceDeserializer, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_FrameSourceDeserializerListener, "_FrameSourceDeserializerListener");
        Intrinsics.h(_FrameSourceDeserializer, "_FrameSourceDeserializer");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18859a = _FrameSourceDeserializerListener;
        this.proxyCache = proxyCache;
        this.c = new WeakReference(_FrameSourceDeserializer);
    }
}
