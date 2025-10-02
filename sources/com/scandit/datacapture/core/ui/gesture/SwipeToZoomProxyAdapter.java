package com.scandit.datacapture.core.ui.gesture;

import com.scandit.datacapture.core.internal.module.ui.NativeSwipeToZoom;
import com.scandit.datacapture.core.internal.module.ui.NativeZoomGesture;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u001a\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/core/ui/gesture/SwipeToZoomProxyAdapter;", "Lcom/scandit/datacapture/core/ui/gesture/SwipeToZoomProxy;", "Lcom/scandit/datacapture/core/internal/module/ui/NativeSwipeToZoom;", "_impl", "Lcom/scandit/datacapture/core/internal/module/ui/NativeZoomGesture;", "_zoomGestureImpl", "", "triggerZoomIn", "triggerZoomOut", "", "toJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "_NativeSwipeToZoom", "<init>", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeSwipeToZoom;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class SwipeToZoomProxyAdapter implements SwipeToZoomProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeSwipeToZoom f18925a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeZoomGesture c;

    public SwipeToZoomProxyAdapter(@NotNull NativeSwipeToZoom _NativeSwipeToZoom, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeSwipeToZoom, "_NativeSwipeToZoom");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18925a = _NativeSwipeToZoom;
        this.proxyCache = proxyCache;
        NativeZoomGesture nativeZoomGestureAsZoomGesture = _NativeSwipeToZoom.asZoomGesture();
        Intrinsics.g(nativeZoomGestureAsZoomGesture, "_NativeSwipeToZoom.asZoomGesture()");
        this.c = nativeZoomGestureAsZoomGesture;
    }

    @Override // com.scandit.datacapture.core.ui.gesture.SwipeToZoomProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeSwipeToZoom getF18925a() {
        return this.f18925a;
    }

    @Override // com.scandit.datacapture.core.ui.gesture.SwipeToZoomProxy
    @NotNull
    /* renamed from: _zoomGestureImpl, reason: from getter */
    public NativeZoomGesture getC() {
        return this.c;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.ui.gesture.SwipeToZoomProxy
    @NotNull
    public String toJson() {
        String _0 = this.f18925a.toJson();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.core.ui.gesture.SwipeToZoomProxy
    public void triggerZoomIn() {
        this.f18925a.triggerZoomIn();
    }

    @Override // com.scandit.datacapture.core.ui.gesture.SwipeToZoomProxy
    public void triggerZoomOut() {
        this.f18925a.triggerZoomOut();
    }

    public /* synthetic */ SwipeToZoomProxyAdapter(NativeSwipeToZoom nativeSwipeToZoom, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeSwipeToZoom, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
