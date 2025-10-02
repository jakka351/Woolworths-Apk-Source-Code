package au.com.woolworths.feature.shop.catalogue.home.model;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/model/SneakPeek;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SneakPeek {

    /* renamed from: a, reason: collision with root package name */
    public final String f6858a;
    public final String b;
    public final String c;
    public final String d;

    public SneakPeek(String str, String str2, String str3) {
        this.f6858a = str;
        this.b = str2;
        this.c = str3;
        this.d = a.j(str, ", ", str2, " ", str3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SneakPeek)) {
            return false;
        }
        SneakPeek sneakPeek = (SneakPeek) obj;
        return Intrinsics.c(this.f6858a, sneakPeek.f6858a) && Intrinsics.c(this.b, sneakPeek.b) && Intrinsics.c(this.c, sneakPeek.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.c(this.f6858a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return YU.a.o(YU.a.v("SneakPeek(title=", this.f6858a, ", subtitle=", this.b, ", dateDisplay="), this.c, ")");
    }
}
