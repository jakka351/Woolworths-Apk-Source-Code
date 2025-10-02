package me.oriient.internal.services.dataManager.buildingCoordinateConverter;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f25121a;
    public final ArrayList b;

    public a(String buildingId, ArrayList floorCoordinatesConverters) {
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(floorCoordinatesConverters, "floorCoordinatesConverters");
        this.f25121a = buildingId;
        this.b = floorCoordinatesConverters;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.c(this.f25121a, aVar.f25121a) && Intrinsics.c(this.b, aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f25121a.hashCode() * 31);
    }

    public final String toString() {
        return "BuildingCoordinateConverterData(buildingId=" + this.f25121a + ", floorCoordinatesConverters=" + this.b + ')';
    }
}
