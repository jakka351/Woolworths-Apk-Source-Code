package me.oriient.internal.services.dataManager.buildingCoordinateConverter;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final String f25127a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public j(String floorId, float f, float f2, float f3, float f4, float f5) {
        Intrinsics.h(floorId, "floorId");
        this.f25127a = floorId;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.c(this.f25127a, jVar.f25127a) && Float.compare(this.b, jVar.b) == 0 && Float.compare(this.c, jVar.c) == 0 && Float.compare(this.d, jVar.d) == 0 && Float.compare(this.e, jVar.e) == 0 && Float.compare(this.f, jVar.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + android.support.v4.media.session.a.b(this.e, android.support.v4.media.session.a.b(this.d, android.support.v4.media.session.a.b(this.c, android.support.v4.media.session.a.b(this.b, this.f25127a.hashCode() * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FloorCoordinatesConverterData(floorId=");
        sb.append(this.f25127a);
        sb.append(", translationX=");
        sb.append(this.b);
        sb.append(", translationY=");
        sb.append(this.c);
        sb.append(", rotationDegrees=");
        sb.append(this.d);
        sb.append(", scaleX=");
        sb.append(this.e);
        sb.append(", scaleY=");
        return android.support.v4.media.session.a.r(sb, this.f, ')');
    }
}
