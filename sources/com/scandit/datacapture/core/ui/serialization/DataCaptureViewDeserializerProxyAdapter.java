package com.scandit.datacapture.core.ui.serialization;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.core.capture.DataCaptureContext;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureViewDeserializer;
import com.scandit.datacapture.core.internal.module.ui.NativeDataCaptureView;
import com.scandit.datacapture.core.internal.sdk.capture.NativeDataCaptureContext;
import com.scandit.datacapture.core.internal.sdk.json.NativeJsonValue;
import com.scandit.datacapture.core.json.JsonValue;
import com.scandit.datacapture.core.ui.DataCaptureView;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b#\u0010$J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016J\u0018\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\u0018\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u001a\u0010\u001c\u001a\u00020\u00178\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerProxyAdapter;", "Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerProxy;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureViewDeserializer;", "_impl", "Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializer;", "deserializer", "", "_setDeserializer", "_deserializer", "Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerHelper;", "helper", "_setHelper", "Lcom/scandit/datacapture/core/ui/serialization/DataCaptureViewDeserializerListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "_setListener", "Lcom/scandit/datacapture/core/capture/DataCaptureContext;", "dataCaptureContext", "Lcom/scandit/datacapture/core/json/JsonValue;", "json", "Lcom/scandit/datacapture/core/ui/DataCaptureView;", "_viewFromJson", "view", "_updateViewFromJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "", "getWarnings", "()Ljava/util/List;", "warnings", "_NativeDataCaptureViewDeserializer", "<init>", "(Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureViewDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class DataCaptureViewDeserializerProxyAdapter implements DataCaptureViewDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeDataCaptureViewDeserializer f18941a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private DataCaptureViewDeserializer c;

    public DataCaptureViewDeserializerProxyAdapter(@NotNull NativeDataCaptureViewDeserializer _NativeDataCaptureViewDeserializer, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeDataCaptureViewDeserializer, "_NativeDataCaptureViewDeserializer");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18941a = _NativeDataCaptureViewDeserializer;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerProxy
    @NotNull
    public DataCaptureViewDeserializer _deserializer() {
        DataCaptureViewDeserializer dataCaptureViewDeserializer = this.c;
        if (dataCaptureViewDeserializer != null) {
            return dataCaptureViewDeserializer;
        }
        Intrinsics.p("_setDeserializer_backing_field");
        throw null;
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeDataCaptureViewDeserializer getF18941a() {
        return this.f18941a;
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerProxy
    public void _setDeserializer(@NotNull DataCaptureViewDeserializer deserializer) {
        Intrinsics.h(deserializer, "deserializer");
        this.c = deserializer;
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerProxy
    public void _setHelper(@Nullable DataCaptureViewDeserializerHelper helper) {
        this.f18941a.setHelper(helper != null ? (DataCaptureViewDeserializerHelperReversedAdapter) this.proxyCache.getOrPut(Reflection.f24268a.b(DataCaptureViewDeserializerHelper.class), null, helper, new j(helper)) : null);
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerProxy
    public void _setListener(@Nullable DataCaptureViewDeserializerListener listener) {
        this.f18941a.setListener(listener != null ? (DataCaptureViewDeserializerListenerReversedAdapter) this.proxyCache.getOrPut(Reflection.f24268a.b(DataCaptureViewDeserializerListener.class), this, listener, new k(listener, this)) : null);
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerProxy
    @NotNull
    public DataCaptureView _updateViewFromJson(@NotNull DataCaptureView view, @NotNull JsonValue json) {
        Intrinsics.h(view, "view");
        Intrinsics.h(json, "json");
        NativeDataCaptureView nativeDataCaptureView_impl = view.getF18883a();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeDataCaptureView.class), null, nativeDataCaptureView_impl, view);
        NativeJsonValue f18778a = json.getF18778a();
        this.proxyCache.put(reflectionFactory.b(NativeJsonValue.class), null, f18778a, json);
        NativeDataCaptureView _2 = this.f18941a.updateViewFromJson(nativeDataCaptureView_impl, f18778a);
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeDataCaptureView.class);
        Intrinsics.g(_2, "_2");
        return (DataCaptureView) proxyCache2.require(kClassB, null, _2);
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerProxy
    @NotNull
    public DataCaptureView _viewFromJson(@NotNull DataCaptureContext dataCaptureContext, @NotNull JsonValue json) {
        Intrinsics.h(dataCaptureContext, "dataCaptureContext");
        Intrinsics.h(json, "json");
        NativeDataCaptureContext nativeDataCaptureContext_impl = dataCaptureContext.getF18429a();
        ProxyCache proxyCache = this.proxyCache;
        ReflectionFactory reflectionFactory = Reflection.f24268a;
        proxyCache.put(reflectionFactory.b(NativeDataCaptureContext.class), null, nativeDataCaptureContext_impl, dataCaptureContext);
        NativeJsonValue f18778a = json.getF18778a();
        this.proxyCache.put(reflectionFactory.b(NativeJsonValue.class), null, f18778a, json);
        NativeDataCaptureView _2 = this.f18941a.viewFromJson(nativeDataCaptureContext_impl, f18778a);
        ProxyCache proxyCache2 = this.proxyCache;
        KClass kClassB = reflectionFactory.b(NativeDataCaptureView.class);
        Intrinsics.g(_2, "_2");
        return (DataCaptureView) proxyCache2.require(kClassB, null, _2);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.ui.serialization.DataCaptureViewDeserializerProxy
    @NotNull
    public List<String> getWarnings() {
        ArrayList<String> _0 = this.f18941a.getWarnings();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public /* synthetic */ DataCaptureViewDeserializerProxyAdapter(NativeDataCaptureViewDeserializer nativeDataCaptureViewDeserializer, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeDataCaptureViewDeserializer, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
