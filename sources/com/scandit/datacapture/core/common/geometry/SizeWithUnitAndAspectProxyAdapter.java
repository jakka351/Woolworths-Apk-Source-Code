package com.scandit.datacapture.core.common.geometry;

import com.scandit.datacapture.core.internal.sdk.common.geometry.NativeSizeWithUnitAndAspect;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/core/common/geometry/SizeWithUnitAndAspectProxyAdapter;", "Lcom/scandit/datacapture/core/common/geometry/SizeWithUnitAndAspectProxy;", "Lcom/scandit/datacapture/core/internal/sdk/common/geometry/NativeSizeWithUnitAndAspect;", "_impl", "", "toJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "_NativeSizeWithUnitAndAspect", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/common/geometry/NativeSizeWithUnitAndAspect;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SizeWithUnitAndAspectProxyAdapter implements SizeWithUnitAndAspectProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeSizeWithUnitAndAspect f18479a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public SizeWithUnitAndAspectProxyAdapter(@NotNull NativeSizeWithUnitAndAspect _NativeSizeWithUnitAndAspect, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeSizeWithUnitAndAspect, "_NativeSizeWithUnitAndAspect");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18479a = _NativeSizeWithUnitAndAspect;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.core.common.geometry.SizeWithUnitAndAspectProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeSizeWithUnitAndAspect getF18479a() {
        return this.f18479a;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.common.geometry.SizeWithUnitAndAspectProxy
    @NotNull
    public String toJson() {
        String _0 = this.f18479a.toJson();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public /* synthetic */ SizeWithUnitAndAspectProxyAdapter(NativeSizeWithUnitAndAspect nativeSizeWithUnitAndAspect, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeSizeWithUnitAndAspect, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
