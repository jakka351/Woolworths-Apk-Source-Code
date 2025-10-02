package me.oriient.internal.services.dataManager.mapGrid;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.Mapable;
import me.oriient.internal.services.dataModel.engine.MapGridType;

/* renamed from: me.oriient.internal.services.dataManager.mapGrid.w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1324w implements Mapable {

    /* renamed from: a, reason: collision with root package name */
    public final String f25227a;
    public final String b;
    public final String c;
    public final MapGridType d;

    public C1324w(String buildingId, String floorId, String mapId, MapGridType mapGridType) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(mapId, "mapId");
        Intrinsics.h(mapGridType, "mapGridType");
        this.f25227a = buildingId;
        this.b = floorId;
        this.c = mapId;
        this.d = mapGridType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1324w)) {
            return false;
        }
        C1324w c1324w = (C1324w) obj;
        return Intrinsics.c(this.f25227a, c1324w.f25227a) && Intrinsics.c(this.b, c1324w.b) && Intrinsics.c(this.c, c1324w.c) && this.d == c1324w.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + me.oriient.internal.infra.rest.a.a(this.c, me.oriient.internal.infra.rest.a.a(this.b, this.f25227a.hashCode() * 31, 31), 31);
    }

    @Override // me.oriient.internal.infra.utils.core.Mapable
    public final Map toMap() {
        return MapsKt.j(new Pair("buildingId", this.f25227a), new Pair("floorId", this.b), new Pair("mapId", this.c), new Pair("mapGridType", this.d.getRawValue()));
    }

    public final String toString() {
        return "MapGridId(buildingId=" + this.f25227a + ", floorId=" + this.b + ", mapId=" + this.c + ", mapGridType=" + this.d + ')';
    }
}
