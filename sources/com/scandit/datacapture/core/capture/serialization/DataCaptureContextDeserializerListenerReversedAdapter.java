package com.scandit.datacapture.core.capture.serialization;

import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializer;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerListener;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
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

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0017"}, d2 = {"Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerListenerReversedAdapter;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureContextDeserializerListener;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureContextDeserializer;", "deserializer", "Lcom/scandit/datacapture/core/internal/sdk/capture/NativeDataCaptureContext;", "context", "Lcom/scandit/datacapture/core/internal/sdk/json/NativeJsonValue;", "json", "", "onContextDeserializationStarted", "onContextDeserializationFinished", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerListener;", "_DataCaptureContextDeserializerListener", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializer;", "_DataCaptureContextDeserializer", "<init>", "(Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerListener;Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class DataCaptureContextDeserializerListenerReversedAdapter extends NativeDataCaptureContextDeserializerListener {

    /* renamed from: a, reason: collision with root package name */
    private final DataCaptureContextDeserializerListener f18450a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final WeakReference c;

    public /* synthetic */ DataCaptureContextDeserializerListenerReversedAdapter(DataCaptureContextDeserializerListener dataCaptureContextDeserializerListener, DataCaptureContextDeserializer dataCaptureContextDeserializer, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(dataCaptureContextDeserializerListener, dataCaptureContextDeserializer, (i & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerListener
    public void onContextDeserializationFinished(@NotNull NativeDataCaptureContextDeserializer deserializer, @NotNull NativeDataCaptureContext context, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(context, "context");
        Intrinsics.h(json, "json");
        DataCaptureContextDeserializer dataCaptureContextDeserializer = (DataCaptureContextDeserializer) this.c.get();
        if (dataCaptureContextDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeDataCaptureContextDeserializer.class), null, deserializer, new h(dataCaptureContextDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…hed(_0, _1, _2)\n        }");
            DataCaptureContext dataCaptureContext = (DataCaptureContext) this.proxyCache.getOrPut(reflectionFactory.b(NativeDataCaptureContext.class), null, context, new i(context));
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new j(json));
            this.f18450a.onContextDeserializationFinished((DataCaptureContextDeserializer) orPut, dataCaptureContext, jsonValue);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializerListener
    public void onContextDeserializationStarted(@NotNull NativeDataCaptureContextDeserializer deserializer, @NotNull NativeDataCaptureContext context, @NotNull NativeJsonValue json) {
        Intrinsics.h(deserializer, "deserializer");
        Intrinsics.h(context, "context");
        Intrinsics.h(json, "json");
        DataCaptureContextDeserializer dataCaptureContextDeserializer = (DataCaptureContextDeserializer) this.c.get();
        if (dataCaptureContextDeserializer != null) {
            ProxyCache proxyCache = this.proxyCache;
            ReflectionFactory reflectionFactory = Reflection.f24268a;
            Object orPut = proxyCache.getOrPut(reflectionFactory.b(NativeDataCaptureContextDeserializer.class), null, deserializer, new k(dataCaptureContextDeserializer));
            Intrinsics.g(orPut, "{\n            val _0 = p…ted(_0, _1, _2)\n        }");
            DataCaptureContext dataCaptureContext = (DataCaptureContext) this.proxyCache.getOrPut(reflectionFactory.b(NativeDataCaptureContext.class), null, context, new l(context));
            JsonValue jsonValue = (JsonValue) this.proxyCache.getOrPut(reflectionFactory.b(NativeJsonValue.class), null, json, new m(json));
            this.f18450a.onContextDeserializationStarted((DataCaptureContextDeserializer) orPut, dataCaptureContext, jsonValue);
        }
    }

    public DataCaptureContextDeserializerListenerReversedAdapter(@NotNull DataCaptureContextDeserializerListener _DataCaptureContextDeserializerListener, @NotNull DataCaptureContextDeserializer _DataCaptureContextDeserializer, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_DataCaptureContextDeserializerListener, "_DataCaptureContextDeserializerListener");
        Intrinsics.h(_DataCaptureContextDeserializer, "_DataCaptureContextDeserializer");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18450a = _DataCaptureContextDeserializerListener;
        this.proxyCache = proxyCache;
        this.c = new WeakReference(_DataCaptureContextDeserializer);
    }
}
