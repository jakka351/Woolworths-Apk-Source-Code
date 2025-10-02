package au.com.woolworths.feature.shop.instore.navigation.map.data;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/OriientPosition;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OriientPosition {

    /* renamed from: a, reason: collision with root package name */
    public final OriientMetersCoordinate f7345a;
    public final OriientHeading b;
    public final OriientHeading c;
    public final double d;
    public final boolean e;
    public final double f;
    public final String g;
    public final int h;

    public OriientPosition(OriientMetersCoordinate oriientMetersCoordinate, OriientHeading oriientHeading, OriientHeading oriientHeading2, double d, boolean z, double d2, String str, int i) {
        this.f7345a = oriientMetersCoordinate;
        this.b = oriientHeading;
        this.c = oriientHeading2;
        this.d = d;
        this.e = z;
        this.f = d2;
        this.g = str;
        this.h = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriientPosition)) {
            return false;
        }
        OriientPosition oriientPosition = (OriientPosition) obj;
        return Intrinsics.c(this.f7345a, oriientPosition.f7345a) && Intrinsics.c(this.b, oriientPosition.b) && Intrinsics.c(this.c, oriientPosition.c) && Double.compare(this.d, oriientPosition.d) == 0 && this.e == oriientPosition.e && Double.compare(this.f, oriientPosition.f) == 0 && Intrinsics.c(this.g, oriientPosition.g) && this.h == oriientPosition.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + b.c(a.a(this.f, b.e(a.a(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.f7345a.hashCode() * 31)) * 31)) * 31, 31), 31, this.e), 31), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OriientPosition(coordinate=");
        sb.append(this.f7345a);
        sb.append(", heading=");
        sb.append(this.b);
        sb.append(", mainOrientation=");
        sb.append(this.c);
        sb.append(", accuracy=");
        sb.append(this.d);
        sb.append(", isLocked=");
        sb.append(this.e);
        sb.append(", lockProgressPercent=");
        sb.append(this.f);
        sb.append(", floorId=");
        sb.append(this.g);
        return androidx.constraintlayout.core.state.a.k(sb, ", floorOrder=", this.h, ")");
    }
}
