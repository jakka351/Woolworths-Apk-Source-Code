package me.oriient.positioningengine.support;

import kotlin.jvm.internal.Intrinsics;
import me.oriient.positioningengine.common.models.IndoorCoordinate;

/* renamed from: me.oriient.positioningengine.support.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1839a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f26517a;
    public final long b;
    public final Integer c;
    public final IndoorCoordinate d;
    public final Double e;
    public final Double f;

    public C1839a(boolean z, long j, Integer num, IndoorCoordinate indoorCoordinate, Double d, Double d2) {
        this.f26517a = z;
        this.b = j;
        this.c = num;
        this.d = indoorCoordinate;
        this.e = d;
        this.f = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1839a)) {
            return false;
        }
        C1839a c1839a = (C1839a) obj;
        return this.f26517a == c1839a.f26517a && this.b == c1839a.b && Intrinsics.c(this.c, c1839a.c) && Intrinsics.c(this.d, c1839a.d) && Intrinsics.c(this.e, c1839a.e) && Intrinsics.c(this.f, c1839a.f);
    }

    public final int hashCode() {
        int iA = me.oriient.positioningengine.common.w.a(this.b, Boolean.hashCode(this.f26517a) * 31, 31);
        Integer num = this.c;
        int iHashCode = (iA + (num == null ? 0 : num.hashCode())) * 31;
        IndoorCoordinate indoorCoordinate = this.d;
        int iHashCode2 = (iHashCode + (indoorCoordinate == null ? 0 : indoorCoordinate.hashCode())) * 31;
        Double d = this.e;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.f;
        return iHashCode3 + (d2 != null ? d2.hashCode() : 0);
    }

    public final String toString() {
        return "ChargingStateUpdate(isConnectedToCharger=" + this.f26517a + ", timestamp=" + this.b + ", floorOrder=" + this.c + ", location=" + this.d + ", accuracy=" + this.e + ", lockProgress=" + this.f + ')';
    }
}
