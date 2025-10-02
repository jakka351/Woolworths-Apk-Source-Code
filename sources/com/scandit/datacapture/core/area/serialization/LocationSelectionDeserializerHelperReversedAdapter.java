package com.scandit.datacapture.core.area.serialization;

import com.scandit.datacapture.core.area.RadiusLocationSelection;
import com.scandit.datacapture.core.area.RectangularLocationSelection;
import com.scandit.datacapture.core.internal.module.serialization.NativeLocationSelectionDeserializerHelper;
import com.scandit.datacapture.core.internal.sdk.area.NativeNoLocationSelection;
import com.scandit.datacapture.core.internal.sdk.area.NativeRadiusLocationSelection;
import com.scandit.datacapture.core.internal.sdk.area.NativeRectangularLocationSelection;
import com.scandit.datacapture.core.internal.sdk.area.NoLocationSelection;
import com.scandit.datacapture.tools.internal.sdk.ProxyCache;
import com.scandit.datacapture.tools.internal.sdk.ProxyCacheKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0012"}, d2 = {"Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializerHelperReversedAdapter;", "Lcom/scandit/datacapture/core/internal/module/serialization/NativeLocationSelectionDeserializerHelper;", "Lcom/scandit/datacapture/core/internal/sdk/area/NativeNoLocationSelection;", "createNoLocationSelection", "Lcom/scandit/datacapture/core/internal/sdk/area/NativeRadiusLocationSelection;", "createRadiusLocationSelection", "Lcom/scandit/datacapture/core/internal/sdk/area/NativeRectangularLocationSelection;", "createRectangularLocationSelection", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "b", "Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "getProxyCache$scandit_capture_core", "()Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;", "proxyCache", "Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializerHelper;", "_LocationSelectionDeserializerHelper", "<init>", "(Lcom/scandit/datacapture/core/area/serialization/LocationSelectionDeserializerHelper;Lcom/scandit/datacapture/tools/internal/sdk/ProxyCache;)V", "scandit-capture-core"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes6.dex */
public final class LocationSelectionDeserializerHelperReversedAdapter extends NativeLocationSelectionDeserializerHelper {

    /* renamed from: a, reason: collision with root package name */
    private final LocationSelectionDeserializerHelper f18415a;

    /* renamed from: b, reason: from kotlin metadata */
    private final ProxyCache proxyCache;

    public LocationSelectionDeserializerHelperReversedAdapter(@NotNull LocationSelectionDeserializerHelper _LocationSelectionDeserializerHelper, @NotNull ProxyCache proxyCache) {
        Intrinsics.h(_LocationSelectionDeserializerHelper, "_LocationSelectionDeserializerHelper");
        Intrinsics.h(proxyCache, "proxyCache");
        this.f18415a = _LocationSelectionDeserializerHelper;
        this.proxyCache = proxyCache;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeLocationSelectionDeserializerHelper
    @NotNull
    public NativeNoLocationSelection createNoLocationSelection() {
        NoLocationSelection noLocationSelectionCreateNoLocationSelectionFromJson = this.f18415a.createNoLocationSelectionFromJson();
        NativeNoLocationSelection nativeNoLocationSelection_impl = noLocationSelectionCreateNoLocationSelectionFromJson._impl();
        this.proxyCache.put(Reflection.f24268a.b(NativeNoLocationSelection.class), null, nativeNoLocationSelection_impl, noLocationSelectionCreateNoLocationSelectionFromJson);
        return nativeNoLocationSelection_impl;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeLocationSelectionDeserializerHelper
    @NotNull
    public NativeRadiusLocationSelection createRadiusLocationSelection() {
        RadiusLocationSelection radiusLocationSelectionCreateRadiusLocationSelectionFromJson = this.f18415a.createRadiusLocationSelectionFromJson();
        NativeRadiusLocationSelection nativeRadiusLocationSelection_impl = radiusLocationSelectionCreateRadiusLocationSelectionFromJson._impl();
        this.proxyCache.put(Reflection.f24268a.b(NativeRadiusLocationSelection.class), null, nativeRadiusLocationSelection_impl, radiusLocationSelectionCreateRadiusLocationSelectionFromJson);
        return nativeRadiusLocationSelection_impl;
    }

    @Override // com.scandit.datacapture.core.internal.module.serialization.NativeLocationSelectionDeserializerHelper
    @NotNull
    public NativeRectangularLocationSelection createRectangularLocationSelection() {
        RectangularLocationSelection rectangularLocationSelectionCreateRectangularLocationSelectionFromJson = this.f18415a.createRectangularLocationSelectionFromJson();
        NativeRectangularLocationSelection nativeRectangularLocationSelection_impl = rectangularLocationSelectionCreateRectangularLocationSelectionFromJson._impl();
        this.proxyCache.put(Reflection.f24268a.b(NativeRectangularLocationSelection.class), null, nativeRectangularLocationSelection_impl, rectangularLocationSelectionCreateRectangularLocationSelectionFromJson);
        return nativeRectangularLocationSelection_impl;
    }

    @NotNull
    /* renamed from: getProxyCache$scandit_capture_core, reason: from getter */
    public final ProxyCache getProxyCache() {
        return this.proxyCache;
    }

    public /* synthetic */ LocationSelectionDeserializerHelperReversedAdapter(LocationSelectionDeserializerHelper locationSelectionDeserializerHelper, ProxyCache proxyCache, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(locationSelectionDeserializerHelper, (i & 2) != 0 ? ProxyCacheKt.getGlobalProxyCache() : proxyCache);
    }
}
