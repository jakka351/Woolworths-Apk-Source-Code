package ovh.plrapps.mapcompose.utils;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/utils/Point;", "", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class Point {

    /* renamed from: a, reason: collision with root package name */
    public final double f26966a;
    public final double b;

    public Point(double d, double d2) {
        this.f26966a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Point)) {
            return false;
        }
        Point point = (Point) obj;
        return Double.compare(this.f26966a, point.f26966a) == 0 && Double.compare(this.b, point.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.f26966a) * 31);
    }

    public final String toString() {
        StringBuilder sbN = a.n(this.f26966a, "Point(x=", ", y=");
        sbN.append(this.b);
        sbN.append(")");
        return sbN.toString();
    }
}
