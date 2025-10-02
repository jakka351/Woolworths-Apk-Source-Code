package au.com.woolworths.feature.shop.instore.navigation.map.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/data/Floor;", "", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Floor {

    /* renamed from: a, reason: collision with root package name */
    public final String f7335a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;
    public final Entrance f;

    public Floor(String str, String str2, String str3, int i, String str4, Entrance entrance) {
        this.f7335a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = str4;
        this.f = entrance;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Floor)) {
            return false;
        }
        Floor floor = (Floor) obj;
        return Intrinsics.c(this.f7335a, floor.f7335a) && Intrinsics.c(this.b, floor.b) && Intrinsics.c(this.c, floor.c) && this.d == floor.d && Intrinsics.c(this.e, floor.e) && Intrinsics.c(this.f, floor.f);
    }

    public final int hashCode() {
        int iC = b.c(b.a(this.d, b.c(b.c(this.f7335a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
        Entrance entrance = this.f;
        return iC + (entrance == null ? 0 : entrance.hashCode());
    }

    public final String toString() {
        StringBuilder sbV = a.v("Floor(id=", this.f7335a, ", name=", this.b, ", shortName=");
        a.x(this.d, this.c, ", order=", ", mapId=", sbV);
        sbV.append(this.e);
        sbV.append(", entrance=");
        sbV.append(this.f);
        sbV.append(")");
        return sbV.toString();
    }
}
