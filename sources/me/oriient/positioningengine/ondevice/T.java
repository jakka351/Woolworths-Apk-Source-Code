package me.oriient.positioningengine.ondevice;

import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import me.oriient.positioningengine.ondevice.mappingData.MappingData;
import me.oriient.positioningengine.ondevice.models.Position;

/* loaded from: classes8.dex */
public final class T extends Lambda implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f26405a;
    public final /* synthetic */ X b;
    public final /* synthetic */ Position c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public T(String str, X x, Position position) {
        super(0);
        this.f26405a = str;
        this.b = x;
        this.c = position;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String buildingId;
        MappingData.Building.BuildingInfo buildingInfo;
        Pair pair = new Pair("restrictedAreaId", this.f26405a);
        MappingData.Building building = this.b.k;
        if (building == null || (buildingInfo = building.getBuildingInfo()) == null || (buildingId = buildingInfo.getBuildingId()) == null) {
            buildingId = "no buildingId";
        }
        Pair pair2 = new Pair("buildingId", buildingId);
        String floorId = this.c.getFloorId();
        if (floorId == null) {
            floorId = "no floorId";
        }
        Pair pair3 = new Pair("floorId", floorId);
        String mapId = this.c.getMapId();
        if (mapId == null) {
            mapId = "no mapId";
        }
        return MapsKt.j(pair, pair2, pair3, new Pair("mapId", mapId));
    }
}
