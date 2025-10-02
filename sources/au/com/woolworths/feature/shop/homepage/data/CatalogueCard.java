package au.com.woolworths.feature.shop.homepage.data;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/homepage/data/CatalogueCard;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CatalogueCard {

    /* renamed from: a, reason: collision with root package name */
    public final String f7180a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public CatalogueCard(String str, String str2, String str3, String str4, String str5) {
        this.f7180a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogueCard)) {
            return false;
        }
        CatalogueCard catalogueCard = (CatalogueCard) obj;
        return Intrinsics.c(this.f7180a, catalogueCard.f7180a) && Intrinsics.c(this.b, catalogueCard.b) && Intrinsics.c(this.c, catalogueCard.c) && Intrinsics.c(this.d, catalogueCard.d) && Intrinsics.c(this.e, catalogueCard.e);
    }

    public final int hashCode() {
        int iC = b.c(this.f7180a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("CatalogueCard(title=", this.f7180a, ", subtitle=", this.b, ", imageBackground=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", imageLeft=", this.d, ", imageRight=");
        return a.o(sbV, this.e, ")");
    }
}
