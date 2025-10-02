package com.scandit.datacapture.core.ui.viewfinder;

import com.scandit.datacapture.core.internal.sdk.ui.viewfinder.NativeRectangularViewfinderAnimation;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\r\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderAnimationProxyAdapter;", "Lcom/scandit/datacapture/core/ui/viewfinder/RectangularViewfinderAnimationProxy;", "Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinderAnimation;", "_impl", "", "toJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "isLooping", "()Z", "_NativeRectangularViewfinderAnimation", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/viewfinder/NativeRectangularViewfinderAnimation;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class RectangularViewfinderAnimationProxyAdapter implements RectangularViewfinderAnimationProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeRectangularViewfinderAnimation f18963a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public RectangularViewfinderAnimationProxyAdapter(@NotNull NativeRectangularViewfinderAnimation _NativeRectangularViewfinderAnimation, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeRectangularViewfinderAnimation, "_NativeRectangularViewfinderAnimation");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18963a = _NativeRectangularViewfinderAnimation;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderAnimationProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeRectangularViewfinderAnimation getF18963a() {
        return this.f18963a;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderAnimationProxy
    public boolean isLooping() {
        return this.f18963a.isLooping();
    }

    @Override // com.scandit.datacapture.core.ui.viewfinder.RectangularViewfinderAnimationProxy
    @NotNull
    public String toJson() {
        String _0 = this.f18963a.toJson();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public /* synthetic */ RectangularViewfinderAnimationProxyAdapter(NativeRectangularViewfinderAnimation nativeRectangularViewfinderAnimation, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeRectangularViewfinderAnimation, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
