package me.oriient.internal.services.dataManager.mapGrid;

import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.Mapable;
import me.oriient.internal.services.dataModel.engine.MapGridType;

/* loaded from: classes7.dex */
public final class V implements Mapable {

    /* renamed from: a, reason: collision with root package name */
    public final String f25206a;
    public final String b;
    public final Integer c;
    public final MapGridType d;

    public V(String mapId, String engineVersion, Integer num, MapGridType mapGridType) {
        Intrinsics.h(mapId, "mapId");
        Intrinsics.h(engineVersion, "engineVersion");
        Intrinsics.h(mapGridType, "mapGridType");
        this.f25206a = mapId;
        this.b = engineVersion;
        this.c = num;
        this.d = mapGridType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v = (V) obj;
        return Intrinsics.c(this.f25206a, v.f25206a) && Intrinsics.c(this.b, v.b) && Intrinsics.c(this.c, v.c) && this.d == v.d;
    }

    public final int hashCode() {
        int iA = me.oriient.internal.infra.rest.a.a(this.b, this.f25206a.hashCode() * 31, 31);
        Integer num = this.c;
        return this.d.hashCode() + ((iA + (num == null ? 0 : num.hashCode())) * 31);
    }

    @Override // me.oriient.internal.infra.utils.core.Mapable
    public final Map toMap() {
        return MapsKt.j(new Pair("mapId", this.f25206a), new Pair("engineVersion", this.b), new Pair("mapGridVersion", this.c), new Pair("mapGridType", this.d.getRawValue()));
    }

    public final String toString() {
        return "MapGridUrlId(mapId=" + this.f25206a + ", engineVersion=" + this.b + ", mapGridVersion=" + this.c + ", mapGridType=" + this.d + ')';
    }
}
