package com.scandit.datacapture.core.area.serialization;

import com.scandit.datacapture.core.internal.module.serialization.NativeLocationSelectionDeserializer;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016R\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializerProxyAdapter;", "Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializerProxy;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeLocationSelectionDeserializer;", "_impl", "Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializerHelper;", "helper", "", "_setHelper", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "", "", "getWarnings", "()Ljava/util/List;", "warnings", "_NativeLocationSelectionDeserializer", "<init>", "(Lcom/scandit/datacapture/core/internal/module/serialization/NativeLocationSelectionDeserializer;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class LocationSelectionDeserializerProxyAdapter implements LocationSelectionDeserializerProxy {

    /* renamed from: a, reason: collision with root package name */
    private final NativeLocationSelectionDeserializer f18416a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public LocationSelectionDeserializerProxyAdapter(@NotNull NativeLocationSelectionDeserializer _NativeLocationSelectionDeserializer, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_NativeLocationSelectionDeserializer, "_NativeLocationSelectionDeserializer");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18416a = _NativeLocationSelectionDeserializer;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.core.area.serialization.LocationSelectionDeserializerProxy
    @NotNull
    /* renamed from: _impl, reason: from getter */
    public NativeLocationSelectionDeserializer getF18416a() {
        return this.f18416a;
    }

    @Override // com.scandit.datacapture.core.area.serialization.LocationSelectionDeserializerProxy
    public void _setHelper(@Nullable LocationSelectionDeserializerHelper helper) {
        this.f18416a.setHelper(helper != null ? (LocationSelectionDeserializerHelperReversedAdapter) this.proxyCache.getOrPut(Reflection.f24268a.b(LocationSelectionDeserializerHelper.class), null, helper, new a(helper)) : null);
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    @Override // com.scandit.datacapture.core.area.serialization.LocationSelectionDeserializerProxy
    @NotNull
    public List<String> getWarnings() {
        ArrayList<String> _0 = this.f18416a.getWarnings();
        Intrinsics.g(_0, "_0");
        return _0;
    }

    public /* synthetic */ LocationSelectionDeserializerProxyAdapter(NativeLocationSelectionDeserializer nativeLocationSelectionDeserializer, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(nativeLocationSelectionDeserializer, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
