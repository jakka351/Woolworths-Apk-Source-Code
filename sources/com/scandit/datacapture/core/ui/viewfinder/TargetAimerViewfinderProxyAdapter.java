package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeTargetAimerViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeViewfinder;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/TargetAimerViewfinderProxyAdapter;", "Lcom/scandit/datacapture/core/ui/viewfinder/TargetAimerViewfinderProxy;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeTargetAimerViewfinder;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeViewfinder;", "_viewfinderImpl", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "_NativeTargetAimerViewfinder", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeTargetAimerViewfinder;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class TargetAimerViewfinderProxyAdapter implements TargetAimerViewfinderProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeTargetAimerViewfinder f18970a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeViewfinder c;

    public TargetAimerViewfinderProxyAdapter(@NotNull NativeTargetAimerViewfinder _NativeTargetAimerViewfinder, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeTargetAimerViewfinder, "_NativeTargetAimerViewfinder");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18970a = _NativeTargetAimerViewfinder;
        this.proxyCache = proxyCache;
        NativeViewfinder nativeViewfinderAsViewfinder = _NativeTargetAimerViewfinder.asViewfinder();
        Intrinsics.g(nativeViewfinderAsViewfinder, "_NativeTargetAimerViewfinder.asViewfinder()");
        this.c = nativeViewfinderAsViewfinder;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.TargetAimerViewfinderProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeTargetAimerViewfinder getF18970a() {
        return this.f18970a;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.TargetAimerViewfinderProxy, com.scandit.datacapture.core.ui.viewfinder.Viewfinder
    @NotNull
    /* renamed from: _viewfinderImpl, reason: from getter */
    public NativeViewfinder getC() {
        return this.c;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    public /* synthetic */ TargetAimerViewfinderProxyAdapter(NativeTargetAimerViewfinder nativeTargetAimerViewfinder, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeTargetAimerViewfinder, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
