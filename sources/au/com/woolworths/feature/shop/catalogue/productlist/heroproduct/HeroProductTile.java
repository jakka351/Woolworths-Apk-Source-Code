package au.com.woolworths.feature.shop.catalogue.productlist.heroproduct;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.product.models.MemberPriceInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/catalogue/productlist/heroproduct/HeroProductTile;", "", "catalogue_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HeroProductTile {

    /* renamed from: a, reason: collision with root package name */
    public final ProductBasicInfo f6937a;
    public final ProductPriceInfo b;
    public final ProductUnitPriceInfo c;
    public final ProductOfferInfo d;
    public final ProductAisleInfo e;
    public final MemberPriceInfo f;
    public final boolean g;
    public final boolean h;

    static {
        int i = MemberPriceInfo.$stable;
    }

    public HeroProductTile(ProductBasicInfo productBasicInfo, ProductPriceInfo productPriceInfo, ProductUnitPriceInfo productUnitPriceInfo, ProductOfferInfo productOfferInfo, ProductAisleInfo productAisleInfo, MemberPriceInfo memberPriceInfo) {
        this.f6937a = productBasicInfo;
        this.b = productPriceInfo;
        this.c = productUnitPriceInfo;
        this.d = productOfferInfo;
        this.e = productAisleInfo;
        this.f = memberPriceInfo;
        Boolean bool = productOfferInfo.d;
        this.g = (bool != null ? bool.booleanValue() : false) && memberPriceInfo == null;
        this.h = memberPriceInfo != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HeroProductTile)) {
            return false;
        }
        HeroProductTile heroProductTile = (HeroProductTile) obj;
        return Intrinsics.c(this.f6937a, heroProductTile.f6937a) && Intrinsics.c(this.b, heroProductTile.b) && Intrinsics.c(this.c, heroProductTile.c) && Intrinsics.c(this.d, heroProductTile.d) && Intrinsics.c(this.e, heroProductTile.e) && Intrinsics.c(this.f, heroProductTile.f);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f6937a.hashCode() * 31)) * 31)) * 31)) * 31;
        ProductAisleInfo productAisleInfo = this.e;
        int iHashCode2 = (iHashCode + (productAisleInfo == null ? 0 : productAisleInfo.hashCode())) * 31;
        MemberPriceInfo memberPriceInfo = this.f;
        return iHashCode2 + (memberPriceInfo != null ? memberPriceInfo.hashCode() : 0);
    }

    public final String toString() {
        return "HeroProductTile(basicInfo=" + this.f6937a + ", priceInfo=" + this.b + ", priceUnitPriceInfo=" + this.c + ", priceOfferInfo=" + this.d + ", productAisleInfo=" + this.e + ", memberPriceInfo=" + this.f + ")";
    }
}
