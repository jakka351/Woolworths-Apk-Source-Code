package me.oriient.positioningengine.ondevice;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;

/* renamed from: me.oriient.positioningengine.ondevice.w, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1835w extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MappingData.Building f26491a;
    public final /* synthetic */ MappingData.Building.BuildingInfo.FloorMetadata b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1835w(MappingData.Building building, MappingData.Building.BuildingInfo.FloorMetadata floorMetadata) {
        super(0);
        this.f26491a = building;
        this.b = floorMetadata;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return MapsKt.j(new Pair("buildingId", this.f26491a.getBuildingInfo().getBuildingId()), new Pair("floorId", this.b.getFloorId()));
    }
}
