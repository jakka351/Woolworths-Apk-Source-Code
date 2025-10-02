package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeCombinedViewfinder;
import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeViewfinder;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u001a\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\bH\u0016R\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/CombinedViewfinderProxyAdapter;", "Lcom/scandit/datacapture/core/ui/viewfinder/CombinedViewfinderProxy;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeCombinedViewfinder;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeViewfinder;", "_viewfinderImpl", "Lcom/scandit/datacapture/core/ui/viewfinder/Viewfinder;", "viewfinder", "", "addViewfinder", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "pointOfInterest", "removeViewfinder", "removeAll", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "_NativeCombinedViewfinder", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeCombinedViewfinder;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class CombinedViewfinderProxyAdapter implements CombinedViewfinderProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeCombinedViewfinder f18957a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeViewfinder c;

    public CombinedViewfinderProxyAdapter(@NotNull NativeCombinedViewfinder _NativeCombinedViewfinder, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeCombinedViewfinder, "_NativeCombinedViewfinder");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18957a = _NativeCombinedViewfinder;
        this.proxyCache = proxyCache;
        NativeViewfinder nativeViewfinderAsViewfinder = _NativeCombinedViewfinder.asViewfinder();
        Intrinsics.g(nativeViewfinderAsViewfinder, "_NativeCombinedViewfinder.asViewfinder()");
        this.c = nativeViewfinderAsViewfinder;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.CombinedViewfinderProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeCombinedViewfinder getF18957a() {
        return this.f18957a;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.CombinedViewfinderProxy, com.scandit.datacapture.core.ui.viewfinder.Viewfinder
    @NotNull
    /* renamed from: _viewfinderImpl, reason: from getter */
    public NativeViewfinder getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.CombinedViewfinderProxy
    public void addViewfinder(@NotNull Viewfinder viewfinder) {
        Intrinsics.h(viewfinder, "viewfinder");
        addViewfinder(viewfinder, null);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.CombinedViewfinderProxy
    public void removeAll() {
        this.f18957a.removeAll();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.CombinedViewfinderProxy
    public void removeViewfinder(@NotNull Viewfinder viewfinder) {
        Intrinsics.h(viewfinder, "viewfinder");
        this.f18957a.removeViewfinder(viewfinder.getC());
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.CombinedViewfinderProxy
    public void addViewfinder(@NotNull Viewfinder viewfinder, @Nullable PointWithUnit pointOfInterest) {
        Intrinsics.h(viewfinder, "viewfinder");
        this.f18957a.addViewfinder(viewfinder.getC(), pointOfInterest);
    }

    public /* synthetic */ CombinedViewfinderProxyAdapter(NativeCombinedViewfinder nativeCombinedViewfinder, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeCombinedViewfinder, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
