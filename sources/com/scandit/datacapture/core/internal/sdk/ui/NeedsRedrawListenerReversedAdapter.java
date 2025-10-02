package com.scandit.datacapture.core.internal.sdk.ui;

import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/ui/NeedsRedrawListenerReversedAdapter;", "Lcom/scandit/datacapture/core/internal/sdk/ui/NativeNeedsRedrawDelegate;", "", "millis", "", "setNeedsRedrawIn", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/core/internal/sdk/ui/NeedsRedrawListener;", "_NeedsRedrawListener", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/ui/NeedsRedrawListener;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class NeedsRedrawListenerReversedAdapter extends NativeNeedsRedrawDelegate {

    /* renamed from: a, reason: collision with root package name */
    private final NeedsRedrawListener f18724a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public /* synthetic */ NeedsRedrawListenerReversedAdapter(NeedsRedrawListener needsRedrawListener, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(needsRedrawListener, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.ui.NativeNeedsRedrawDelegate
    public void setNeedsRedrawIn(int millis) {
        this.f18724a.setNeedsRedrawInMillis(millis);
    }

    public NeedsRedrawListenerReversedAdapter(@NotNull NeedsRedrawListener _NeedsRedrawListener, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NeedsRedrawListener, "_NeedsRedrawListener");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18724a = _NeedsRedrawListener;
        this.proxyCache = proxyCache;
    }
}
