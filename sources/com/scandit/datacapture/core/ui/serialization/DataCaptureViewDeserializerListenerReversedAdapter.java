package com.scandit.datacapture.core.ui.serialization;

import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureViewDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureViewDeserializerListener;
import com.scandit.datacapture.core.internal.module.ui.NativeDataCaptureView;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerListenerReversedAdapter;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureViewDeserializerListener;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureViewDeserializer;", "deserializer", "Lcom/scandit/datacapture/core/internal/module/ui/NativeDataCaptureView;", "view", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "json", "", "onViewDeserializationStarted", "onViewDeserializationFinished", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerListener;", "_DataCaptureViewDeserializerListener", "Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializer;", "_DataCaptureViewDeserializer", "<init>", "(Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerListener;Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class DataCaptureViewDeserializerListenerReversedAdapter extends NativeDataCaptureViewDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    private final DataCaptureViewDeserializerListener f18940a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final WeakReference c;

    public /* synthetic */ DataCaptureViewDeserializerListenerReversedAdapter(DataCaptureViewDeserializerListener dataCaptureViewDeserializerListener, DataCaptureViewDeserializer dataCaptureViewDeserializer, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataCaptureViewDeserializerListener, dataCaptureViewDeserializer, (i & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureViewDeserializerListener
    public void onViewDeserializationFinished(@NotNull NativeDataCaptureViewDeserializer deserializer, @NotNull NativeDataCaptureView view, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(view, "view");
        Intrinsics.h(json, "json");
        DataCaptureViewDeserializer dataCaptureViewDeserializer = (DataCaptureViewDeserializer) this.c.get();
        if (dataCaptureViewDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeDataCaptureViewDeserializer.class), null, deserializer, new f(dataCaptureViewDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…hed(_0, _1, _2)\n        }");
            DataCaptureView dataCaptureView = (DataCaptureView) this.proxyCache.require(reflectionFactory.b(NativeDataCaptureView.class), null, view);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new g(json));
            this.f18940a.onViewDeserializationFinished((DataCaptureViewDeserializer) orPut, dataCaptureView, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureViewDeserializerListener
    public void onViewDeserializationStarted(@NotNull NativeDataCaptureViewDeserializer deserializer, @NotNull NativeDataCaptureView view, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(view, "view");
        Intrinsics.h(json, "json");
        DataCaptureViewDeserializer dataCaptureViewDeserializer = (DataCaptureViewDeserializer) this.c.get();
        if (dataCaptureViewDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeDataCaptureViewDeserializer.class), null, deserializer, new h(dataCaptureViewDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…ted(_0, _1, _2)\n        }");
            DataCaptureView dataCaptureView = (DataCaptureView) this.proxyCache.require(reflectionFactory.b(NativeDataCaptureView.class), null, view);
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new i(json));
            this.f18940a.onViewDeserializationStarted((DataCaptureViewDeserializer) orPut, dataCaptureView, jsonValue);
        }
    }

    public DataCaptureViewDeserializerListenerReversedAdapter(@NotNull DataCaptureViewDeserializerListener _DataCaptureViewDeserializerListener, @NotNull DataCaptureViewDeserializer _DataCaptureViewDeserializer, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_DataCaptureViewDeserializerListener, "_DataCaptureViewDeserializerListener");
        Intrinsics.h(_DataCaptureViewDeserializer, "_DataCaptureViewDeserializer");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18940a = _DataCaptureViewDeserializerListener;
        this.proxyCache = proxyCache;
        this.c = new WeakReference(_DataCaptureViewDeserializer);
    }
}
