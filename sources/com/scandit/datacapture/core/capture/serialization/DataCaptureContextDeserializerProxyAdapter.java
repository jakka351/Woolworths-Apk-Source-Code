package com.scandit.datacapture.core.capture.serialization;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scandit.datacapture.core.internal.module.serialization.NativeDataCaptureContextDeserializer;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u001a\u0010\u0014\u001a\u00020\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001f"}, d2 = {"Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerProxyAdapter;", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerProxy;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureContextDeserializer;", "_impl", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializer;", "deserializer", "", "_setDeserializer", "_deserializer", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerHelper;", "helper", "_setHelper", "Lcom/scandit/datacapture/core/capture/serialization/DataCaptureContextDeserializerListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "_setListener", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "p0", "getAvoidThreadDependencies", "()Z", "setAvoidThreadDependencies", "(Z)V", "avoidThreadDependencies", "_NativeDataCaptureContextDeserializer", "<init>", "(Lcom/scandit/datacapture/core/internal/module/serialization/NativeDataCaptureContextDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class DataCaptureContextDeserializerProxyAdapter implements DataCaptureContextDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeDataCaptureContextDeserializer f18451a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private DataCaptureContextDeserializer c;

    public DataCaptureContextDeserializerProxyAdapter(@NotNull NativeDataCaptureContextDeserializer _NativeDataCaptureContextDeserializer, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeDataCaptureContextDeserializer, "_NativeDataCaptureContextDeserializer");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18451a = _NativeDataCaptureContextDeserializer;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    @NotNull
    public DataCaptureContextDeserializer _deserializer() {
        DataCaptureContextDeserializer dataCaptureContextDeserializer = this.c;
        if (dataCaptureContextDeserializer != null) {
            return dataCaptureContextDeserializer;
        }
        Intrinsics.p("_setDeserializer_backing_field");
        throw null;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeDataCaptureContextDeserializer getF18451a() {
        return this.f18451a;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    public void _setDeserializer(@NotNull DataCaptureContextDeserializer deserializer) {
        Intrinsics.h(deserializer, "deserializer");
        this.c = deserializer;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    public void _setHelper(@Nullable DataCaptureContextDeserializerHelper helper) {
        this.f18451a.setHelper(helper != null ? (DataCaptureContextDeserializerHelperReversedAdapter) this.proxyCache.getOrPut(Reflection.f24268a.b(DataCaptureContextDeserializerHelper.class), null, helper, new n(helper)) : null);
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    public void _setListener(@Nullable DataCaptureContextDeserializerListener listener) {
        this.f18451a.setListener(listener != null ? (DataCaptureContextDeserializerListenerReversedAdapter) this.proxyCache.getOrPut(Reflection.f24268a.b(DataCaptureContextDeserializerListener.class), this, listener, new o(listener, this)) : null);
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    public boolean getAvoidThreadDependencies() {
        return this.f18451a.getAvoidThreadDependencies();
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.capture.serialization.DataCaptureContextDeserializerProxy
    public void setAvoidThreadDependencies(boolean z) {
        this.f18451a.setAvoidThreadDependencies(z);
    }

    public /* synthetic */ DataCaptureContextDeserializerProxyAdapter(NativeDataCaptureContextDeserializer nativeDataCaptureContextDeserializer, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeDataCaptureContextDeserializer, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
