package me.oriient.navigation.ondevice.navgraph;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.Mapable;

/* loaded from: classes8.dex */
public final class w implements Mapable {

    /* renamed from: a, reason: collision with root package name */
    public final String f26327a;
    public final String b;

    public w(String buildingId, String floorId) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorId, "floorId");
        this.f26327a = buildingId;
        this.b = floorId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Intrinsics.c(this.f26327a, wVar.f26327a) && Intrinsics.c(this.b, wVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26327a.hashCode() * 31);
    }

    @Override // me.oriient.internal.infra.utils.core.Mapable
    public final Map toMap() {
        return MapsKt.j(new Pair("buildingId", this.f26327a), new Pair("floorId", this.b));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavGraphId(buildingId=");
        sb.append(this.f26327a);
        sb.append(", floorId=");
        return androidx.camera.core.impl.b.r(sb, this.b, ')');
    }
}
