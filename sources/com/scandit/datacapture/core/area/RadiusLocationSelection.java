package com.scandit.datacapture.core.area;

import com.scandit.datacapture.core.common.geometry.FloatWithUnit;
import com.scandit.datacapture.core.internal.sdk.annotations.Mockable;
import com.scandit.datacapture.core.internal.sdk.area.NativeLocationSelection;
import com.scandit.datacapture.core.internal.sdk.area.NativeRadiusLocationSelection;
import com.scandit.datacapture.tools.internal.sdk.NativeImpl;
import com.scandit.datacapture.tools.internal.sdk.ProxyFunction;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u000f\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000b\u001a\u00020\u0007H\u0097\u0001J\t\u0010\f\u001a\u00020\rH\u0097\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u0097\u0001R\u0014\u0010\u0003\u001a\u00020\u00048WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lcom/scandit/datacapture/core/area/RadiusLocationSelection;", "Lcom/scandit/datacapture/core/area/LocationSelection;", "Lcom/scandit/datacapture/core/area/RadiusLocationSelectionProxy;", "radius", "Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "(Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;)V", "impl", "Lcom/scandit/datacapture/core/internal/sdk/area/NativeRadiusLocationSelection;", "(Lcom/scandit/datacapture/core/internal/sdk/area/NativeRadiusLocationSelection;)V", "getRadius", "()Lcom/scandit/datacapture/core/common/geometry/FloatWithUnit;", "_impl", "_locationSelectionImpl", "Lcom/scandit/datacapture/core/internal/sdk/area/NativeLocationSelection;", "toJson", "", "scandit-capture-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Mockable
/* loaded from: classes6.dex */
public final class RadiusLocationSelection implements LocationSelection, RadiusLocationSelectionProxy {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ RadiusLocationSelectionProxyAdapter f18409a;

    public RadiusLocationSelection(@NotNull NativeRadiusLocationSelection impl) {
        Intrinsics.h(impl, "impl");
        this.f18409a = new RadiusLocationSelectionProxyAdapter(impl, null, 2, 0 == true ? 1 : 0);
    }

    @Override // com.scandit.datacapture.core.area.RadiusLocationSelectionProxy
    @NativeImpl
    @NotNull
    /* renamed from: _impl */
    public NativeRadiusLocationSelection getF18410a() {
        return this.f18409a.getF18410a();
    }

    @Override // com.scandit.datacapture.core.area.LocationSelection, com.scandit.datacapture.core.area.RadiusLocationSelectionProxy
    @NativeImpl
    @NotNull
    /* renamed from: _locationSelectionImpl */
    public NativeLocationSelection getC() {
        return this.f18409a.getC();
    }

    @Override // com.scandit.datacapture.core.area.RadiusLocationSelectionProxy
    @ProxyFunction(property = "radius")
    @NotNull
    public FloatWithUnit getRadius() {
        return this.f18409a.getRadius();
    }

    @Override // com.scandit.datacapture.core.area.LocationSelection, com.scandit.datacapture.core.area.RadiusLocationSelectionProxy
    @ProxyFunction(nativeName = "toJson")
    @NotNull
    public String toJson() {
        return this.f18409a.toJson();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public RadiusLocationSelection(@NotNull FloatWithUnit radius) {
        Intrinsics.h(radius, "radius");
        NativeRadiusLocationSelection nativeRadiusLocationSelectionCreate = NativeRadiusLocationSelection.create(radius);
        Intrinsics.g(nativeRadiusLocationSelectionCreate, "create(radius)");
        this(nativeRadiusLocationSelectionCreate);
    }
}
