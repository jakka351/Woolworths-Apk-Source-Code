package au.com.woolworths.feature.shop.catalogue.listing.promotion.details.model;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/listing/promotion/details/model/PromotionHeader;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PromotionHeader {

    /* renamed from: a, reason: collision with root package name */
    public final String f6901a;
    public final String b;
    public final String c;
    public final String d;

    public PromotionHeader(String title, String str, String str2, String str3) {
        Intrinsics.h(title, "title");
        this.f6901a = title;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PromotionHeader)) {
            return false;
        }
        PromotionHeader promotionHeader = (PromotionHeader) obj;
        return Intrinsics.c(this.f6901a, promotionHeader.f6901a) && Intrinsics.c(this.b, promotionHeader.b) && Intrinsics.c(this.c, promotionHeader.c) && Intrinsics.c(this.d, promotionHeader.d);
    }

    public final int hashCode() {
        int iHashCode = this.f6901a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        return a.l(YU.a.v("PromotionHeader(title=", this.f6901a, ", titleColor=", this.b, ", subtitle="), this.c, ", imageUrl=", this.d, ")");
    }
}
