package au.com.woolworths.feature.shop.catalogue.home.model;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/home/model/CatalogueCard;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CatalogueCard {

    /* renamed from: a, reason: collision with root package name */
    public final String f6855a;
    public final String b;
    public final String c;
    public final String d;
    public final SneakPeek e;
    public final CatalogueTracking f;
    public final String g;
    public final String h;

    public CatalogueCard(String str, String str2, String str3, String str4, SneakPeek sneakPeek, CatalogueTracking catalogueTracking, String str5) {
        this.f6855a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = sneakPeek;
        this.f = catalogueTracking;
        this.g = str5;
        String str6 = (sneakPeek == null || (str6 = sneakPeek.d) == null) ? "" : str6;
        this.h = str6 + " " + str3 + ", " + catalogueTracking.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CatalogueCard)) {
            return false;
        }
        CatalogueCard catalogueCard = (CatalogueCard) obj;
        return Intrinsics.c(this.f6855a, catalogueCard.f6855a) && Intrinsics.c(this.b, catalogueCard.b) && Intrinsics.c(this.c, catalogueCard.c) && Intrinsics.c(this.d, catalogueCard.d) && Intrinsics.c(this.e, catalogueCard.e) && Intrinsics.c(this.f, catalogueCard.f) && Intrinsics.c(this.g, catalogueCard.g);
    }

    public final int hashCode() {
        int iC = b.c(b.c(b.c(this.f6855a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        SneakPeek sneakPeek = this.e;
        int iHashCode = (this.f.hashCode() + ((iC + (sneakPeek == null ? 0 : sneakPeek.hashCode())) * 31)) * 31;
        String str = this.g;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("CatalogueCard(id=", this.f6855a, ", image=", this.b, ", title=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", dateDisplay=", this.d, ", sneakPeek=");
        sbV.append(this.e);
        sbV.append(", tracking=");
        sbV.append(this.f);
        sbV.append(", pagePath=");
        return a.o(sbV, this.g, ")");
    }
}
