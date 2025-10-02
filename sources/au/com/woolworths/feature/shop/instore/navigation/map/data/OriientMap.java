package au.com.woolworths.feature.shop.instore.navigation.map.data;

import android.graphics.Bitmap;
import android.support.v4.media.session.a;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/OriientMap;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OriientMap {

    /* renamed from: a, reason: collision with root package name */
    public final String f7341a;
    public final Bitmap b;
    public final double c;
    public final double d;
    public final double e;
    public final OriientMapOffset f;

    public OriientMap(String str, Bitmap bitmap, double d, double d2, double d3, OriientMapOffset oriientMapOffset) {
        this.f7341a = str;
        this.b = bitmap;
        this.c = d;
        this.d = d2;
        this.e = d3;
        this.f = oriientMapOffset;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OriientMap)) {
            return false;
        }
        OriientMap oriientMap = (OriientMap) obj;
        return Intrinsics.c(this.f7341a, oriientMap.f7341a) && Intrinsics.c(this.b, oriientMap.b) && Double.compare(this.c, oriientMap.c) == 0 && Double.compare(this.d, oriientMap.d) == 0 && Double.compare(this.e, oriientMap.e) == 0 && Intrinsics.c(this.f, oriientMap.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + a.a(this.e, a.a(this.d, a.a(this.c, (this.b.hashCode() + (this.f7341a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OriientMap(name=");
        sb.append(this.f7341a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", pixelToMeter=");
        sb.append(this.c);
        au.com.woolworths.android.onesite.a.z(sb, ", widthMeters=", this.d, ", heightMeters=");
        sb.append(this.e);
        sb.append(", offset=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
