package au.com.woolworths.shop.productcard.data;

import YU.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.product.models.ProductShoppingList;
import au.com.woolworths.sdui.model.action.ActionData;
import au.com.woolworths.shop.aem.components.model.link.TextWithAltData;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/productcard/data/ProductTile;", "", "productcard-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductTile {

    /* renamed from: a, reason: collision with root package name */
    public final String f12658a;
    public final String b;
    public final RoundelImage c;
    public final ProductMainImage d;
    public final List e;
    public final ProductPriceInfo f;
    public final List g;
    public final TextWithAltData h;
    public final ProductRatingsAndReviews i;
    public final ProductFooter j;
    public final ProductShoppingList k;
    public final List l;
    public final String m;
    public final ProductRewardsInfo n;
    public final List o;
    public final String p;
    public final ActionData q;
    public final InstoreLocationInfo r;
    public final MarketplaceInfo s;
    public final RestrictionInfo t;

    public ProductTile(String productId, String productName, RoundelImage roundelImage, ProductMainImage productMainImage, List list, ProductPriceInfo productPriceInfo, List list2, TextWithAltData textWithAltData, ProductRatingsAndReviews productRatingsAndReviews, ProductFooter productFooter, ProductShoppingList productShoppingList, List list3, String str, ProductRewardsInfo productRewardsInfo, List list4, String str2, ActionData actionData, InstoreLocationInfo instoreLocationInfo, MarketplaceInfo marketplaceInfo, RestrictionInfo restrictionInfo) {
        Intrinsics.h(productId, "productId");
        Intrinsics.h(productName, "productName");
        this.f12658a = productId;
        this.b = productName;
        this.c = roundelImage;
        this.d = productMainImage;
        this.e = list;
        this.f = productPriceInfo;
        this.g = list2;
        this.h = textWithAltData;
        this.i = productRatingsAndReviews;
        this.j = productFooter;
        this.k = productShoppingList;
        this.l = list3;
        this.m = str;
        this.n = productRewardsInfo;
        this.o = list4;
        this.p = str2;
        this.q = actionData;
        this.r = instoreLocationInfo;
        this.s = marketplaceInfo;
        this.t = restrictionInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductTile)) {
            return false;
        }
        ProductTile productTile = (ProductTile) obj;
        return Intrinsics.c(this.f12658a, productTile.f12658a) && Intrinsics.c(this.b, productTile.b) && Intrinsics.c(this.c, productTile.c) && Intrinsics.c(this.d, productTile.d) && Intrinsics.c(this.e, productTile.e) && Intrinsics.c(this.f, productTile.f) && Intrinsics.c(this.g, productTile.g) && Intrinsics.c(this.h, productTile.h) && Intrinsics.c(this.i, productTile.i) && Intrinsics.c(this.j, productTile.j) && Intrinsics.c(this.k, productTile.k) && Intrinsics.c(this.l, productTile.l) && Intrinsics.c(this.m, productTile.m) && Intrinsics.c(this.n, productTile.n) && Intrinsics.c(this.o, productTile.o) && Intrinsics.c(this.p, productTile.p) && Intrinsics.c(this.q, productTile.q) && Intrinsics.c(this.r, productTile.r) && Intrinsics.c(this.s, productTile.s) && Intrinsics.c(this.t, productTile.t);
    }

    public final int hashCode() {
        int iC = b.c(this.f12658a.hashCode() * 31, 31, this.b);
        RoundelImage roundelImage = this.c;
        int iD = b.d((iC + (roundelImage == null ? 0 : roundelImage.hashCode())) * 961, 31, this.e);
        ProductPriceInfo productPriceInfo = this.f;
        int iD2 = b.d((iD + (productPriceInfo == null ? 0 : productPriceInfo.hashCode())) * 31, 31, this.g);
        TextWithAltData textWithAltData = this.h;
        int iHashCode = (iD2 + (textWithAltData == null ? 0 : textWithAltData.hashCode())) * 31;
        ProductRatingsAndReviews productRatingsAndReviews = this.i;
        int iHashCode2 = (iHashCode + (productRatingsAndReviews == null ? 0 : productRatingsAndReviews.hashCode())) * 31;
        ProductFooter productFooter = this.j;
        int iD3 = b.d((this.k.hashCode() + ((iHashCode2 + (productFooter == null ? 0 : productFooter.hashCode())) * 31)) * 31, 31, this.l);
        String str = this.m;
        int iHashCode3 = (iD3 + (str == null ? 0 : str.hashCode())) * 31;
        ProductRewardsInfo productRewardsInfo = this.n;
        int iD4 = b.d((iHashCode3 + (productRewardsInfo == null ? 0 : productRewardsInfo.f12656a.hashCode())) * 31, 31, this.o);
        String str2 = this.p;
        int iHashCode4 = (iD4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ActionData actionData = this.q;
        int iHashCode5 = (iHashCode4 + (actionData == null ? 0 : actionData.hashCode())) * 31;
        InstoreLocationInfo instoreLocationInfo = this.r;
        int iHashCode6 = (iHashCode5 + (instoreLocationInfo == null ? 0 : instoreLocationInfo.hashCode())) * 31;
        MarketplaceInfo marketplaceInfo = this.s;
        int iHashCode7 = (iHashCode6 + (marketplaceInfo == null ? 0 : marketplaceInfo.hashCode())) * 31;
        RestrictionInfo restrictionInfo = this.t;
        return iHashCode7 + (restrictionInfo != null ? restrictionInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("ProductTile(productId=", this.f12658a, ", productName=", this.b, ", roundelImage=");
        sbV.append(this.c);
        sbV.append(", productMainImage=");
        sbV.append(this.d);
        sbV.append(", productTags=");
        sbV.append(this.e);
        sbV.append(", priceInfo=");
        sbV.append(this.f);
        sbV.append(", productStatuses=");
        sbV.append(this.g);
        sbV.append(", middleMessage=");
        sbV.append(this.h);
        sbV.append(", ratingsAndReviews=");
        sbV.append(this.i);
        sbV.append(", footer=");
        sbV.append(this.j);
        sbV.append(", list=");
        sbV.append(this.k);
        sbV.append(", trolleys=");
        sbV.append(this.l);
        sbV.append(", adId=");
        sbV.append(this.m);
        sbV.append(", rewardsOfferInfo=");
        sbV.append(this.n);
        sbV.append(", categories=");
        sbV.append(this.o);
        sbV.append(", source=");
        sbV.append(this.p);
        sbV.append(", productCardAction=");
        sbV.append(this.q);
        sbV.append(", inStoreInfo=");
        sbV.append(this.r);
        sbV.append(", marketplaceInfo=");
        sbV.append(this.s);
        sbV.append(", restrictionInfo=");
        sbV.append(this.t);
        sbV.append(")");
        return sbV.toString();
    }
}
