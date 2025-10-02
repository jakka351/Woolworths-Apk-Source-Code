package com.scandit.datacapture.core.ui.gesture;

import com.scandit.datacapture.core.internal.module.ui.NativeZoomGesture;
import com.scandit.datacapture.core.internal.module.ui.NativeZoomGestureListener;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\f\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/core/ui/gesture/ZoomGestureListenerReversedAdapter;", "Lcom/scandit/datacapture/core/internal/module/ui/NativeZoomGestureListener;", "Lcom/scandit/datacapture/core/internal/module/ui/NativeZoomGesture;", "zoomGesture", "", "onZoomInGesture", "onZoomOutGesture", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/core/ui/gesture/ZoomGestureListener;", "_ZoomGestureListener", "Lcom/scandit/datacapture/core/ui/gesture/ZoomGesture;", "_ZoomGesture", "<init>", "(Lcom/scandit/datacapture/core/ui/gesture/ZoomGestureListener;Lcom/scandit/datacapture/core/ui/gesture/ZoomGesture;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class ZoomGestureListenerReversedAdapter extends NativeZoomGestureListener {

    /* renamed from: a, reason: collision with root package name */
    private final ZoomGestureListener f18928a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final WeakReference c;

    public /* synthetic */ ZoomGestureListenerReversedAdapter(ZoomGestureListener zoomGestureListener, ZoomGesture zoomGesture, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(zoomGestureListener, zoomGesture, (i & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativeZoomGestureListener
    public void onZoomInGesture(@NotNull NativeZoomGesture zoomGesture) {
        Intrinsics.h(zoomGesture, "zoomGesture");
        ZoomGesture zoomGesture2 = (ZoomGesture) this.c.get();
        if (zoomGesture2 != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.f24268a.b(NativeZoomGesture.class), null, zoomGesture, new d(zoomGesture2));
            Intrinsics.g(orPut, "{\n            val _0 = p…omInGesture(_0)\n        }");
            this.f18928a.onZoomInGesture((ZoomGesture) orPut);
        }
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativeZoomGestureListener
    public void onZoomOutGesture(@NotNull NativeZoomGesture zoomGesture) {
        Intrinsics.h(zoomGesture, "zoomGesture");
        ZoomGesture zoomGesture2 = (ZoomGesture) this.c.get();
        if (zoomGesture2 != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.f24268a.b(NativeZoomGesture.class), null, zoomGesture, new e(zoomGesture2));
            Intrinsics.g(orPut, "{\n            val _0 = p…mOutGesture(_0)\n        }");
            this.f18928a.onZoomOutGesture((ZoomGesture) orPut);
        }
    }

    public ZoomGestureListenerReversedAdapter(@NotNull ZoomGestureListener _ZoomGestureListener, @NotNull ZoomGesture _ZoomGesture, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_ZoomGestureListener, "_ZoomGestureListener");
        Intrinsics.h(_ZoomGesture, "_ZoomGesture");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18928a = _ZoomGestureListener;
        this.proxyCache = proxyCache;
        this.c = new WeakReference(_ZoomGesture);
    }
}
