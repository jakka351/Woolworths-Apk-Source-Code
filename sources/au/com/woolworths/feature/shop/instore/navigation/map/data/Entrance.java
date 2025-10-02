package au.com.woolworths.feature.shop.instore.navigation.map.data;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/Entrance;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Entrance {

    /* renamed from: a, reason: collision with root package name */
    public final String f7334a;
    public final boolean b;
    public final double c;
    public final double d;

    public Entrance(String str, boolean z, double d, double d2) {
        this.f7334a = str;
        this.b = z;
        this.c = d;
        this.d = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Entrance)) {
            return false;
        }
        Entrance entrance = (Entrance) obj;
        return Intrinsics.c(this.f7334a, entrance.f7334a) && this.b == entrance.b && Double.compare(this.c, entrance.c) == 0 && Double.compare(this.d, entrance.d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.d) + a.a(this.c, b.e(this.f7334a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbQ = androidx.constraintlayout.core.state.a.q("Entrance(id=", this.f7334a, ", isMain=", ", x=", this.b);
        sbQ.append(this.c);
        sbQ.append(", y=");
        sbQ.append(this.d);
        sbQ.append(")");
        return sbQ.toString();
    }
}
