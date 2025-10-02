package com.scandit.datacapture.core.ui.gesture;

import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.module.ui.NativeFocusGesture;
import com.scandit.datacapture.core.internal.module.ui.NativeFocusGestureListener;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/scandit/datacapture/core/ui/gesture/FocusGestureListenerReversedAdapter;", "Lcom/scandit/datacapture/core/internal/module/ui/NativeFocusGestureListener;", "Lcom/scandit/datacapture/core/internal/module/ui/NativeFocusGesture;", "focusGesture", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "point", "", "onFocusGesture", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/core/ui/gesture/FocusGestureListener;", "_FocusGestureListener", "Lcom/scandit/datacapture/core/ui/gesture/FocusGesture;", "_FocusGesture", "<init>", "(Lcom/scandit/datacapture/core/ui/gesture/FocusGestureListener;Lcom/scandit/datacapture/core/ui/gesture/FocusGesture;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class FocusGestureListenerReversedAdapter extends NativeFocusGestureListener {

    /* renamed from: a, reason: collision with root package name */
    private final FocusGestureListener f18923a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final WeakReference c;

    public /* synthetic */ FocusGestureListenerReversedAdapter(FocusGestureListener focusGestureListener, FocusGesture focusGesture, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(focusGestureListener, focusGesture, (i & 4) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.module.ui.NativeFocusGestureListener
    public void onFocusGesture(@NotNull NativeFocusGesture focusGesture, @NotNull PointWithUnit point) {
        Intrinsics.h(focusGesture, "focusGesture");
        Intrinsics.h(point, "point");
        FocusGesture focusGesture2 = (FocusGesture) this.c.get();
        if (focusGesture2 != null) {
            Object orPut = this.proxyCache.getOrPut(Reflection.f24268a.b(NativeFocusGesture.class), null, focusGesture, new a(focusGesture2));
            Intrinsics.g(orPut, "{\n            val _0 = p…ture(_0, point)\n        }");
            this.f18923a.onFocusGesture((FocusGesture) orPut, point);
        }
    }

    public FocusGestureListenerReversedAdapter(@NotNull FocusGestureListener _FocusGestureListener, @NotNull FocusGesture _FocusGesture, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_FocusGestureListener, "_FocusGestureListener");
        Intrinsics.h(_FocusGesture, "_FocusGesture");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18923a = _FocusGestureListener;
        this.proxyCache = proxyCache;
        this.c = new WeakReference(_FocusGesture);
    }
}
