package me.oriient.internal.services.dataManager.obstacles;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final String f25264a;
    public final String b;
    public final String c;
    public final Obstacles d;

    public w(String spaceId, String buildingId, String floorId, Obstacles data) {
        Intrinsics.h(spaceId, "spaceId");
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        Intrinsics.h(data, "data");
        this.f25264a = spaceId;
        this.b = buildingId;
        this.c = floorId;
        this.d = data;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.c(this.f25264a, wVar.f25264a) && Intrinsics.c(this.b, wVar.b) && Intrinsics.c(this.c, wVar.c) && Intrinsics.c(this.d, wVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + me.oriient.internal.infra.rest.a.a(this.c, me.oriient.internal.infra.rest.a.a(this.b, this.f25264a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "ObstaclesRecord(spaceId=" + this.f25264a + ", buildingId=" + this.b + ", floorId=" + this.c + ", data=" + this.d + ')';
    }
}
