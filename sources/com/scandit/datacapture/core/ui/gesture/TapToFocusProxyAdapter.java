package com.scandit.datacapture.core.ui.gesture;

import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.internal.module.ui.NativeFocusGesture;
import com.scandit.datacapture.core.internal.module.ui.NativeTapToFocus;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016R\u001a\u0010\u0011\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Lcom/scandit/datacapture/core/ui/gesture/TapToFocusProxyAdapter;", "Lcom/scandit/datacapture/core/ui/gesture/TapToFocusProxy;", "Lcom/scandit/datacapture/core/internal/module/ui/NativeTapToFocus;", "_impl", "Lcom/scandit/datacapture/core/internal/module/ui/NativeFocusGesture;", "_focusGestureImpl", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "point", "", "triggerFocus", "", "toJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "_NativeTapToFocus", "<init>", "(Lcom/scandit/datacapture/core/internal/module/ui/NativeTapToFocus;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class TapToFocusProxyAdapter implements TapToFocusProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeTapToFocus f18927a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeFocusGesture c;

    public TapToFocusProxyAdapter(@NotNull NativeTapToFocus _NativeTapToFocus, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeTapToFocus, "_NativeTapToFocus");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18927a = _NativeTapToFocus;
        this.proxyCache = proxyCache;
        NativeFocusGesture nativeFocusGestureAsFocusGesture = _NativeTapToFocus.asFocusGesture();
        Intrinsics.g(nativeFocusGestureAsFocusGesture, "_NativeTapToFocus.asFocusGesture()");
        this.c = nativeFocusGestureAsFocusGesture;
    }

    @Override // com.scandit.datacapture.core.ui.gesture.TapToFocusProxy
    @NotNull
    /* renamed from: _focusGestureImpl, reason: from getter */
    public NativeFocusGesture getC() {
        return this.c;
    }

    @Override // com.scandit.datacapture.core.ui.gesture.TapToFocusProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeTapToFocus getF18927a() {
        return this.f18927a;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.ui.gesture.TapToFocusProxy
    @NotNull
    public String toJson() {
        String _0 = this.f18927a.toJson();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    @Override // com.scandit.datacapture.core.ui.gesture.TapToFocusProxy
    public void triggerFocus(@NotNull PointWithUnit point) {
        Intrinsics.h(point, "point");
        this.f18927a.triggerFocus(point);
    }

    public /* synthetic */ TapToFocusProxyAdapter(NativeTapToFocus nativeTapToFocus, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeTapToFocus, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
