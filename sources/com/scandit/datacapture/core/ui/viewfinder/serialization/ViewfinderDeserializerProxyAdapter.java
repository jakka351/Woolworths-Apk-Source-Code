package com.scandit.datacapture.core.ui.viewfinder.serialization;

import com.scandit.datacapture.core.internal.module.serialization.NativeViewfinderDeserializer;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializerProxyAdapter;", "Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializerProxy;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeViewfinderDeserializer;", "_impl", "Lcom/scandit/datacapture/core/ui/viewfinder/serialization/ViewfinderDeserializerHelper;", "helper", "", "_setHelper", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "", "getWarnings", "()Ljava/util/List;", "warnings", "_NativeViewfinderDeserializer", "<init>", "(Lcom/scandit/datacapture/core/internal/module/serialization/NativeViewfinderDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class ViewfinderDeserializerProxyAdapter implements ViewfinderDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeViewfinderDeserializer f18975a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public ViewfinderDeserializerProxyAdapter(@NotNull NativeViewfinderDeserializer _NativeViewfinderDeserializer, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeViewfinderDeserializer, "_NativeViewfinderDeserializer");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18975a = _NativeViewfinderDeserializer;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.serialization.ViewfinderDeserializerProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeViewfinderDeserializer getF18975a() {
        return this.f18975a;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.serialization.ViewfinderDeserializerProxy
    public void _setHelper(@Nullable ViewfinderDeserializerHelper helper) {
        this.f18975a.setHelper(helper != null ? (ViewfinderDeserializerHelperReversedAdapter) this.proxyCache.getOrPut(Reflection.f24268a.b(ViewfinderDeserializerHelper.class), null, helper, new a(helper)) : null);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.serialization.ViewfinderDeserializerProxy
    @NotNull
    public List<String> getWarnings() {
        ArrayList<String> _0 = this.f18975a.getWarnings();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public /* synthetic */ ViewfinderDeserializerProxyAdapter(NativeViewfinderDeserializer nativeViewfinderDeserializer, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeViewfinderDeserializer, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
