package me.oriient.internal.services.dataManager.obstacles;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.Mapable;

/* renamed from: me.oriient.internal.services.dataManager.obstacles.u, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1349u implements Mapable {

    /* renamed from: a, reason: collision with root package name */
    public final String f25263a;
    public final String b;

    public C1349u(String buildingId, String floorId) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        this.f25263a = buildingId;
        this.b = floorId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1349u)) {
            return false;
        }
        C1349u c1349u = (C1349u) obj;
        return Intrinsics.c(this.f25263a, c1349u.f25263a) && Intrinsics.c(this.b, c1349u.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25263a.hashCode() * 31);
    }

    @Override // me.oriient.internal.infra.utils.core.Mapable
    public final Map toMap() {
        return MapsKt.j(new Pair("buildingId", this.f25263a), new Pair("floorId", this.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ObstaclesId(buildingId=");
        sb.append(this.f25263a);
        sb.append(", floorId=");
        return me.oriient.internal.infra.rest.e.a(sb, this.b, ')');
    }
}
