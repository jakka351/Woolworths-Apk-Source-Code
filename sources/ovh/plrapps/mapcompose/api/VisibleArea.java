package ovh.plrapps.mapcompose.api;

import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/api/VisibleArea;", "", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class VisibleArea {

    /* renamed from: a, reason: collision with root package name */
    public double f26933a;
    public double b;
    public double c;
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisibleArea)) {
            return false;
        }
        VisibleArea visibleArea = (VisibleArea) obj;
        return Double.compare(this.f26933a, visibleArea.f26933a) == 0 && Double.compare(this.b, visibleArea.b) == 0 && Double.compare(this.c, visibleArea.c) == 0 && Double.compare(this.d, visibleArea.d) == 0 && Double.compare(this.e, visibleArea.e) == 0 && Double.compare(this.f, visibleArea.f) == 0 && Double.compare(this.g, visibleArea.g) == 0 && Double.compare(this.h, visibleArea.h) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.h) + a.a(this.g, a.a(this.f, a.a(this.e, a.a(this.d, a.a(this.c, a.a(this.b, Double.hashCode(this.f26933a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        double d = this.f26933a;
        double d2 = this.b;
        double d3 = this.c;
        double d4 = this.d;
        double d5 = this.e;
        double d6 = this.f;
        double d7 = this.g;
        double d8 = this.h;
        StringBuilder sbN = androidx.constraintlayout.core.state.a.n(d, "VisibleArea(_p1x=", ", _p1y=");
        sbN.append(d2);
        au.com.woolworths.android.onesite.a.z(sbN, ", _p2x=", d3, ", _p2y=");
        sbN.append(d4);
        au.com.woolworths.android.onesite.a.z(sbN, ", _p3x=", d5, ", _p3y=");
        sbN.append(d6);
        au.com.woolworths.android.onesite.a.z(sbN, ", _p4x=", d7, ", _p4y=");
        sbN.append(d8);
        sbN.append(")");
        return sbN.toString();
    }
}
