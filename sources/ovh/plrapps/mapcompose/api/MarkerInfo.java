package ovh.plrapps.mapcompose.api;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.DpOffset;
import kotlin.Metadata;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lovh/plrapps/mapcompose/api/MarkerInfo;", "", "mapcompose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class MarkerInfo {

    /* renamed from: a, reason: collision with root package name */
    public final String f26932a;
    public final double b;
    public final double c;
    public final long d;
    public final long e;
    public final float f;

    public MarkerInfo(String str, double d, double d2, long j, long j2, float f) {
        this.f26932a = str;
        this.b = d;
        this.c = d2;
        this.d = j;
        this.e = j2;
        this.f = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MarkerInfo) {
            MarkerInfo markerInfo = (MarkerInfo) obj;
            if (this.f26932a.equals(markerInfo.f26932a) && Double.compare(this.b, markerInfo.b) == 0 && Double.compare(this.c, markerInfo.c) == 0 && Offset.c(this.d, markerInfo.d) && this.e == markerInfo.e && Float.compare(this.f, markerInfo.f) == 0) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + b.b(b.b(a.a(this.c, a.a(this.b, this.f26932a.hashCode() * 31, 31), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        String strJ = Offset.j(this.d);
        String strC = DpOffset.c(this.e);
        StringBuilder sbR = au.com.woolworths.android.onesite.a.r(this.b, "MarkerInfo(id=", this.f26932a, ", x=");
        au.com.woolworths.android.onesite.a.z(sbR, ", y=", this.c, ", relativeOffset=");
        androidx.constraintlayout.core.state.a.B(sbR, strJ, ", absoluteOffset=", strC, ", zIndex=");
        return a.j(this.f, ")", sbR);
    }
}
