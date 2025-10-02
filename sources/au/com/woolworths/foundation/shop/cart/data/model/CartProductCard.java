package au.com.woolworths.foundation.shop.cart.data.model;

import android.support.v4.media.session.a;
import androidx.camera.core.impl.b;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.base.shopapp.data.models.CartProductInfo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/shop/cart/data/model/CartProductCard;", "Lau/com/woolworths/foundation/shop/cart/data/model/CartProductFeed;", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CartProductCard implements CartProductFeed {

    /* renamed from: a, reason: collision with root package name */
    public final String f8679a;
    public final String b;
    public final String c;
    public final double d;
    public final boolean e;
    public final Integer f;
    public final Integer g;
    public final CartProductQuantityInfo h;
    public final InsetBannerApiData i;
    public final MarketplaceProductInfo j;
    public final String k;
    public final String l;
    public final MemberPricePromotionInfo m;
    public final MemberPricePromotionInfo n;
    public final MultiBuyPromotionInfo o;
    public final CartProductInfo p;
    public final String q;
    public final BundlePromotionInfo r;
    public final BuyMoreSaveMorePromotionInfo s;

    public CartProductCard(String productId, String title, String str, double d, boolean z, Integer num, Integer num2, CartProductQuantityInfo cartProductQuantityInfo, InsetBannerApiData insetBannerApiData, MarketplaceProductInfo marketplaceProductInfo, String str2, String str3, MemberPricePromotionInfo memberPricePromotionInfo, MemberPricePromotionInfo memberPricePromotionInfo2, MultiBuyPromotionInfo multiBuyPromotionInfo, CartProductInfo cartProductInfo, String str4, BundlePromotionInfo bundlePromotionInfo, BuyMoreSaveMorePromotionInfo buyMoreSaveMorePromotionInfo) {
        Intrinsics.h(productId, "productId");
        Intrinsics.h(title, "title");
        this.f8679a = productId;
        this.b = title;
        this.c = str;
        this.d = d;
        this.e = z;
        this.f = num;
        this.g = num2;
        this.h = cartProductQuantityInfo;
        this.i = insetBannerApiData;
        this.j = marketplaceProductInfo;
        this.k = str2;
        this.l = str3;
        this.m = memberPricePromotionInfo;
        this.n = memberPricePromotionInfo2;
        this.o = multiBuyPromotionInfo;
        this.p = cartProductInfo;
        this.q = str4;
        this.r = bundlePromotionInfo;
        this.s = buyMoreSaveMorePromotionInfo;
    }

    /* renamed from: a, reason: from getter */
    public final double getD() {
        return this.d;
    }

    /* renamed from: b, reason: from getter */
    public final MarketplaceProductInfo getJ() {
        return this.j;
    }

    /* renamed from: c, reason: from getter */
    public final String getF8679a() {
        return this.f8679a;
    }

    /* renamed from: d, reason: from getter */
    public final String getB() {
        return this.b;
    }

    /* renamed from: e, reason: from getter */
    public final Integer getG() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartProductCard)) {
            return false;
        }
        CartProductCard cartProductCard = (CartProductCard) obj;
        return Intrinsics.c(this.f8679a, cartProductCard.f8679a) && Intrinsics.c(this.b, cartProductCard.b) && Intrinsics.c(this.c, cartProductCard.c) && Double.compare(this.d, cartProductCard.d) == 0 && this.e == cartProductCard.e && Intrinsics.c(this.f, cartProductCard.f) && Intrinsics.c(this.g, cartProductCard.g) && Intrinsics.c(this.h, cartProductCard.h) && Intrinsics.c(this.i, cartProductCard.i) && Intrinsics.c(this.j, cartProductCard.j) && Intrinsics.c(this.k, cartProductCard.k) && Intrinsics.c(this.l, cartProductCard.l) && Intrinsics.c(this.m, cartProductCard.m) && Intrinsics.c(this.n, cartProductCard.n) && Intrinsics.c(this.o, cartProductCard.o) && Intrinsics.c(this.p, cartProductCard.p) && Intrinsics.c(this.q, cartProductCard.q) && Intrinsics.c(this.r, cartProductCard.r) && Intrinsics.c(this.s, cartProductCard.s);
    }

    /* renamed from: f, reason: from getter */
    public final Integer getF() {
        return this.f;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getE() {
        return this.e;
    }

    public final int hashCode() {
        int iC = b.c(this.f8679a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iE = b.e(a.a(this.d, (iC + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.e);
        Integer num = this.f;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.g;
        int iHashCode2 = (this.h.hashCode() + ((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31;
        InsetBannerApiData insetBannerApiData = this.i;
        int iHashCode3 = (iHashCode2 + (insetBannerApiData == null ? 0 : insetBannerApiData.hashCode())) * 31;
        MarketplaceProductInfo marketplaceProductInfo = this.j;
        int iHashCode4 = (iHashCode3 + (marketplaceProductInfo == null ? 0 : marketplaceProductInfo.hashCode())) * 31;
        String str2 = this.k;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.l;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MemberPricePromotionInfo memberPricePromotionInfo = this.m;
        int iHashCode7 = (iHashCode6 + (memberPricePromotionInfo == null ? 0 : memberPricePromotionInfo.hashCode())) * 31;
        MemberPricePromotionInfo memberPricePromotionInfo2 = this.n;
        int iHashCode8 = (iHashCode7 + (memberPricePromotionInfo2 == null ? 0 : memberPricePromotionInfo2.hashCode())) * 31;
        MultiBuyPromotionInfo multiBuyPromotionInfo = this.o;
        int iHashCode9 = (iHashCode8 + (multiBuyPromotionInfo == null ? 0 : multiBuyPromotionInfo.hashCode())) * 31;
        CartProductInfo cartProductInfo = this.p;
        int iHashCode10 = (iHashCode9 + (cartProductInfo == null ? 0 : cartProductInfo.hashCode())) * 31;
        String str4 = this.q;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        BundlePromotionInfo bundlePromotionInfo = this.r;
        int iHashCode12 = (iHashCode11 + (bundlePromotionInfo == null ? 0 : bundlePromotionInfo.hashCode())) * 31;
        BuyMoreSaveMorePromotionInfo buyMoreSaveMorePromotionInfo = this.s;
        return iHashCode12 + (buyMoreSaveMorePromotionInfo != null ? buyMoreSaveMorePromotionInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("CartProductCard(productId=", this.f8679a, ", title=", this.b, ", imageUrl=");
        sbV.append(this.c);
        sbV.append(", inCartQuantity=");
        sbV.append(this.d);
        sbV.append(", isAvailable=");
        sbV.append(this.e);
        sbV.append(", unitPrice=");
        sbV.append(this.f);
        sbV.append(", totalPrice=");
        sbV.append(this.g);
        sbV.append(", quantityInfo=");
        sbV.append(this.h);
        sbV.append(", disclaimer=");
        sbV.append(this.i);
        sbV.append(", marketplace=");
        sbV.append(this.j);
        androidx.constraintlayout.core.state.a.B(sbV, ", saving=", this.k, ", wasPrice=", this.l);
        sbV.append(", memberPricePromotionInfo=");
        sbV.append(this.m);
        sbV.append(", singleMemberPricePromotionInfo=");
        sbV.append(this.n);
        sbV.append(", multiBuyPromotionInfo=");
        sbV.append(this.o);
        sbV.append(", cartProductInfo=");
        sbV.append(this.p);
        sbV.append(", availableLimit=");
        sbV.append(this.q);
        sbV.append(", bundlePromotionInfo=");
        sbV.append(this.r);
        sbV.append(", buyMoreSaveMorePromotionInfo=");
        sbV.append(this.s);
        sbV.append(")");
        return sbV.toString();
    }

    public /* synthetic */ CartProductCard(boolean z, CartProductQuantityInfo cartProductQuantityInfo, String str, MemberPricePromotionInfo memberPricePromotionInfo, MemberPricePromotionInfo memberPricePromotionInfo2, MultiBuyPromotionInfo multiBuyPromotionInfo, String str2, BundlePromotionInfo bundlePromotionInfo, BuyMoreSaveMorePromotionInfo buyMoreSaveMorePromotionInfo, int i) {
        this("1", "Providore Sugo Basilico Tomato Sauce 500g", null, 1.0d, z, null, (i & 64) != 0 ? null : 42069, cartProductQuantityInfo, null, null, (i & 1024) != 0 ? null : "Save $4.20", (i & 2048) != 0 ? null : str, (i & 4096) != 0 ? null : memberPricePromotionInfo, (i & 8192) != 0 ? null : memberPricePromotionInfo2, (i & 16384) != 0 ? null : multiBuyPromotionInfo, null, (65536 & i) != 0 ? null : str2, (131072 & i) != 0 ? null : bundlePromotionInfo, (i & 262144) != 0 ? null : buyMoreSaveMorePromotionInfo);
    }
}
