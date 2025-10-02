package com.google.firebase.firestore;

import com.google.cloud.datastore.core.number.NumberComparisonHelper;
import com.google.firebase.firestore.util.Util;

/* loaded from: classes6.dex */
public class GeoPoint implements Comparable<GeoPoint> {
    public final double d;
    public final double e;

    public GeoPoint(double d, double d2) {
        if (Double.isNaN(d) || d < -90.0d || d > 90.0d) {
            throw new IllegalArgumentException("Latitude must be in the range of [-90, 90]");
        }
        if (Double.isNaN(d2) || d2 < -180.0d || d2 > 180.0d) {
            throw new IllegalArgumentException("Longitude must be in the range of [-180, 180]");
        }
        this.d = d;
        this.e = d2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(GeoPoint geoPoint) {
        GeoPoint geoPoint2 = geoPoint;
        double d = geoPoint2.d;
        int i = Util.f15603a;
        int iA = NumberComparisonHelper.a(this.d, d);
        return iA == 0 ? NumberComparisonHelper.a(this.e, geoPoint2.e) : iA;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof GeoPoint)) {
            return false;
        }
        GeoPoint geoPoint = (GeoPoint) obj;
        return this.d == geoPoint.d && this.e == geoPoint.e;
    }

    public final int hashCode() {
        long jDoubleToLongBits = Double.doubleToLongBits(this.d);
        int i = (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
        long jDoubleToLongBits2 = Double.doubleToLongBits(this.e);
        return (i * 31) + ((int) ((jDoubleToLongBits2 >>> 32) ^ jDoubleToLongBits2));
    }

    public final String toString() {
        return "GeoPoint { latitude=" + this.d + ", longitude=" + this.e + " }";
    }
}
