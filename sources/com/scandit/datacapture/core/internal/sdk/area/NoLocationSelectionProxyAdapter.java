package com.scandit.datacapture.core.internal.sdk.area;

import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/area/NoLocationSelectionProxyAdapter;", "Lcom/scandit/datacapture/core/internal/sdk/area/NoLocationSelectionProxy;", "Lcom/scandit/datacapture/core/internal/sdk/area/NativeNoLocationSelection;", "_impl", "Lcom/scandit/datacapture/core/internal/sdk/area/NativeLocationSelection;", "_locationSelectionImpl", "", "toJson", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "_NativeNoLocationSelection", "<init>", "(Lcom/scandit/datacapture/core/internal/sdk/area/NativeNoLocationSelection;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class NoLocationSelectionProxyAdapter implements NoLocationSelectionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeNoLocationSelection f18654a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;
    private final NativeLocationSelection c;

    public NoLocationSelectionProxyAdapter(@NotNull NativeNoLocationSelection _NativeNoLocationSelection, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeNoLocationSelection, "_NativeNoLocationSelection");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18654a = _NativeNoLocationSelection;
        this.proxyCache = proxyCache;
        NativeLocationSelection nativeLocationSelectionAsLocationSelection = _NativeNoLocationSelection.asLocationSelection();
        Intrinsics.g(nativeLocationSelectionAsLocationSelection, "_NativeNoLocationSelection.asLocationSelection()");
        this.c = nativeLocationSelectionAsLocationSelection;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.area.NoLocationSelectionProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeNoLocationSelection getF18654a() {
        return this.f18654a;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.area.NoLocationSelectionProxy, com.scandit.datacapture.core.area.LocationSelection, com.scandit.datacapture.core.area.RadiusLocationSelectionProxy
    @NotNull
    /* renamed from: _locationSelectionImpl, reason: from getter */
    public NativeLocationSelection getC() {
        return this.c;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.sdk.area.NoLocationSelectionProxy, com.scandit.datacapture.core.area.LocationSelection, com.scandit.datacapture.core.area.RadiusLocationSelectionProxy
    @NotNull
    public String toJson() {
        String _0 = this.f18654a.toJson();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public /* synthetic */ NoLocationSelectionProxyAdapter(NativeNoLocationSelection nativeNoLocationSelection, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeNoLocationSelection, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
