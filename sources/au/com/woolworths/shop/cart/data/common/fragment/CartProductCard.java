package au.com.woolworths.shop.cart.data.common.fragment;

import androidx.camera.core.impl.b;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.graphql.type.BundleType;
import au.com.woolworths.shop.graphql.type.BuyMoreSaveMoreType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import com.apollographql.apollo.api.Fragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCard;", "Lcom/apollographql/apollo/api/Fragment$Data;", "QuantityInfo", "Disclaimer", "Marketplace", "MemberPricePromotionInfo", "SingleMemberPricePromotionInfo", "MultiBuyPromotionInfo", "CartProductInfo", "BundlePromotionInfo", "BuyMoreSaveMorePromotionInfo", "ClickAnalytics", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CartProductCard implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f10398a;
    public final String b;
    public final String c;
    public final double d;
    public final boolean e;
    public final Integer f;
    public final Integer g;
    public final QuantityInfo h;
    public final Disclaimer i;
    public final Marketplace j;
    public final String k;
    public final String l;
    public final MemberPricePromotionInfo m;
    public final SingleMemberPricePromotionInfo n;
    public final MultiBuyPromotionInfo o;
    public final CartProductInfo p;
    public final String q;
    public final BundlePromotionInfo r;
    public final BuyMoreSaveMorePromotionInfo s;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCard$BundlePromotionInfo;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BundlePromotionInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f10399a;
        public final boolean b;
        public final BundleType c;
        public final boolean d;

        public BundlePromotionInfo(String str, boolean z, BundleType bundleType, boolean z2) {
            this.f10399a = str;
            this.b = z;
            this.c = bundleType;
            this.d = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BundlePromotionInfo)) {
                return false;
            }
            BundlePromotionInfo bundlePromotionInfo = (BundlePromotionInfo) obj;
            return Intrinsics.c(this.f10399a, bundlePromotionInfo.f10399a) && this.b == bundlePromotionInfo.b && this.c == bundlePromotionInfo.c && this.d == bundlePromotionInfo.d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.d) + ((this.c.hashCode() + b.e(this.f10399a.hashCode() * 31, 31, this.b)) * 31);
        }

        public final String toString() {
            StringBuilder sbQ = a.q("BundlePromotionInfo(title=", this.f10399a, ", isApplied=", ", bundleType=", this.b);
            sbQ.append(this.c);
            sbQ.append(", isShowBanner=");
            sbQ.append(this.d);
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCard$BuyMoreSaveMorePromotionInfo;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BuyMoreSaveMorePromotionInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f10400a;
        public final String b;
        public final String c;
        public final boolean d;
        public final BuyMoreSaveMoreType e;
        public final ClickAnalytics f;

        public BuyMoreSaveMorePromotionInfo(String str, String str2, String str3, boolean z, BuyMoreSaveMoreType buyMoreSaveMoreType, ClickAnalytics clickAnalytics) {
            this.f10400a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
            this.e = buyMoreSaveMoreType;
            this.f = clickAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BuyMoreSaveMorePromotionInfo)) {
                return false;
            }
            BuyMoreSaveMorePromotionInfo buyMoreSaveMorePromotionInfo = (BuyMoreSaveMorePromotionInfo) obj;
            return Intrinsics.c(this.f10400a, buyMoreSaveMorePromotionInfo.f10400a) && Intrinsics.c(this.b, buyMoreSaveMorePromotionInfo.b) && Intrinsics.c(this.c, buyMoreSaveMorePromotionInfo.c) && this.d == buyMoreSaveMorePromotionInfo.d && this.e == buyMoreSaveMorePromotionInfo.e && Intrinsics.c(this.f, buyMoreSaveMorePromotionInfo.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + b.e(b.c(b.c(this.f10400a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("BuyMoreSaveMorePromotionInfo(offerId=", this.f10400a, ", title=", this.b, ", action=");
            d.A(this.c, ", isApplied=", ", type=", sbV, this.d);
            sbV.append(this.e);
            sbV.append(", clickAnalytics=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCard$CartProductInfo;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CartProductInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f10401a;
        public final String b;
        public final String c;

        public CartProductInfo(String str, String str2, String str3) {
            this.f10401a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CartProductInfo)) {
                return false;
            }
            CartProductInfo cartProductInfo = (CartProductInfo) obj;
            return Intrinsics.c(this.f10401a, cartProductInfo.f10401a) && Intrinsics.c(this.b, cartProductInfo.b) && Intrinsics.c(this.c, cartProductInfo.c);
        }

        public final int hashCode() {
            String str = this.f10401a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("CartProductInfo(totalPrice=", this.f10401a, ", totalOriginalPrice=", this.b, ", totalDiscount="), this.c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCard$ClickAnalytics;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ClickAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f10402a;
        public final AnalyticsFields b;

        public ClickAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f10402a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClickAnalytics)) {
                return false;
            }
            ClickAnalytics clickAnalytics = (ClickAnalytics) obj;
            return Intrinsics.c(this.f10402a, clickAnalytics.f10402a) && Intrinsics.c(this.b, clickAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10402a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ClickAnalytics(__typename=", this.f10402a, ", analyticsFields=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCard$Disclaimer;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Disclaimer {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f10403a;
        public final String b;
        public final String c;

        public Disclaimer(InsetBannerDisplayType insetBannerDisplayType, String str, String str2) {
            this.f10403a = insetBannerDisplayType;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Disclaimer)) {
                return false;
            }
            Disclaimer disclaimer = (Disclaimer) obj;
            return this.f10403a == disclaimer.f10403a && Intrinsics.c(this.b, disclaimer.b) && Intrinsics.c(this.c, disclaimer.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f10403a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return YU.a.o(d.u("Disclaimer(displayType=", this.f10403a, ", message=", this.b, ", bannerTitle="), this.c, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCard$Marketplace;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Marketplace {

        /* renamed from: a, reason: collision with root package name */
        public final String f10404a;
        public final String b;

        public Marketplace(String str, String str2) {
            this.f10404a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Marketplace)) {
                return false;
            }
            Marketplace marketplace = (Marketplace) obj;
            return Intrinsics.c(this.f10404a, marketplace.f10404a) && Intrinsics.c(this.b, marketplace.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f10404a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("Marketplace(sellerName=", this.f10404a, ", brandName=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCard$MemberPricePromotionInfo;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MemberPricePromotionInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f10405a;
        public final String b;
        public final boolean c;

        public MemberPricePromotionInfo(String str, String str2, boolean z) {
            this.f10405a = str;
            this.b = str2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MemberPricePromotionInfo)) {
                return false;
            }
            MemberPricePromotionInfo memberPricePromotionInfo = (MemberPricePromotionInfo) obj;
            return Intrinsics.c(this.f10405a, memberPricePromotionInfo.f10405a) && Intrinsics.c(this.b, memberPricePromotionInfo.b) && this.c == memberPricePromotionInfo.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + b.c(this.f10405a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.k(")", YU.a.v("MemberPricePromotionInfo(title=", this.f10405a, ", subtitle=", this.b, ", isApplied="), this.c);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCard$MultiBuyPromotionInfo;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MultiBuyPromotionInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f10406a;
        public final String b;
        public final boolean c;

        public MultiBuyPromotionInfo(String str, String str2, boolean z) {
            this.f10406a = str;
            this.b = str2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MultiBuyPromotionInfo)) {
                return false;
            }
            MultiBuyPromotionInfo multiBuyPromotionInfo = (MultiBuyPromotionInfo) obj;
            return Intrinsics.c(this.f10406a, multiBuyPromotionInfo.f10406a) && Intrinsics.c(this.b, multiBuyPromotionInfo.b) && this.c == multiBuyPromotionInfo.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + b.c(this.f10406a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.k(")", YU.a.v("MultiBuyPromotionInfo(title=", this.f10406a, ", subtitle=", this.b, ", isApplied="), this.c);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCard$QuantityInfo;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class QuantityInfo {

        /* renamed from: a, reason: collision with root package name */
        public final double f10407a;
        public final double b;
        public final double c;
        public final double d;
        public final String e;

        public QuantityInfo(double d, double d2, double d3, double d4, String str) {
            this.f10407a = d;
            this.b = d2;
            this.c = d3;
            this.d = d4;
            this.e = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof QuantityInfo)) {
                return false;
            }
            QuantityInfo quantityInfo = (QuantityInfo) obj;
            return Double.compare(this.f10407a, quantityInfo.f10407a) == 0 && Double.compare(this.b, quantityInfo.b) == 0 && Double.compare(this.c, quantityInfo.c) == 0 && Double.compare(this.d, quantityInfo.d) == 0 && Intrinsics.c(this.e, quantityInfo.e);
        }

        public final int hashCode() {
            int iA = android.support.v4.media.session.a.a(this.d, android.support.v4.media.session.a.a(this.c, android.support.v4.media.session.a.a(this.b, Double.hashCode(this.f10407a) * 31, 31), 31), 31);
            String str = this.e;
            return iA + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sbN = a.n(this.f10407a, "QuantityInfo(minimum=", ", maximum=");
            sbN.append(this.b);
            au.com.woolworths.android.onesite.a.z(sbN, ", increment=", this.c, ", defaultValue=");
            sbN.append(this.d);
            sbN.append(", unit=");
            sbN.append(this.e);
            sbN.append(")");
            return sbN.toString();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/cart/data/common/fragment/CartProductCard$SingleMemberPricePromotionInfo;", "", "cart-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SingleMemberPricePromotionInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f10408a;
        public final String b;
        public final boolean c;

        public SingleMemberPricePromotionInfo(String str, String str2, boolean z) {
            this.f10408a = str;
            this.b = str2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SingleMemberPricePromotionInfo)) {
                return false;
            }
            SingleMemberPricePromotionInfo singleMemberPricePromotionInfo = (SingleMemberPricePromotionInfo) obj;
            return Intrinsics.c(this.f10408a, singleMemberPricePromotionInfo.f10408a) && Intrinsics.c(this.b, singleMemberPricePromotionInfo.b) && this.c == singleMemberPricePromotionInfo.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + b.c(this.f10408a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.k(")", YU.a.v("SingleMemberPricePromotionInfo(title=", this.f10408a, ", subtitle=", this.b, ", isApplied="), this.c);
        }
    }

    public CartProductCard(String str, String str2, String str3, double d, boolean z, Integer num, Integer num2, QuantityInfo quantityInfo, Disclaimer disclaimer, Marketplace marketplace, String str4, String str5, MemberPricePromotionInfo memberPricePromotionInfo, SingleMemberPricePromotionInfo singleMemberPricePromotionInfo, MultiBuyPromotionInfo multiBuyPromotionInfo, CartProductInfo cartProductInfo, String str6, BundlePromotionInfo bundlePromotionInfo, BuyMoreSaveMorePromotionInfo buyMoreSaveMorePromotionInfo) {
        this.f10398a = str;
        this.b = str2;
        this.c = str3;
        this.d = d;
        this.e = z;
        this.f = num;
        this.g = num2;
        this.h = quantityInfo;
        this.i = disclaimer;
        this.j = marketplace;
        this.k = str4;
        this.l = str5;
        this.m = memberPricePromotionInfo;
        this.n = singleMemberPricePromotionInfo;
        this.o = multiBuyPromotionInfo;
        this.p = cartProductInfo;
        this.q = str6;
        this.r = bundlePromotionInfo;
        this.s = buyMoreSaveMorePromotionInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartProductCard)) {
            return false;
        }
        CartProductCard cartProductCard = (CartProductCard) obj;
        return Intrinsics.c(this.f10398a, cartProductCard.f10398a) && Intrinsics.c(this.b, cartProductCard.b) && Intrinsics.c(this.c, cartProductCard.c) && Double.compare(this.d, cartProductCard.d) == 0 && this.e == cartProductCard.e && Intrinsics.c(this.f, cartProductCard.f) && Intrinsics.c(this.g, cartProductCard.g) && Intrinsics.c(this.h, cartProductCard.h) && Intrinsics.c(this.i, cartProductCard.i) && Intrinsics.c(this.j, cartProductCard.j) && Intrinsics.c(this.k, cartProductCard.k) && Intrinsics.c(this.l, cartProductCard.l) && Intrinsics.c(this.m, cartProductCard.m) && Intrinsics.c(this.n, cartProductCard.n) && Intrinsics.c(this.o, cartProductCard.o) && Intrinsics.c(this.p, cartProductCard.p) && Intrinsics.c(this.q, cartProductCard.q) && Intrinsics.c(this.r, cartProductCard.r) && Intrinsics.c(this.s, cartProductCard.s);
    }

    public final int hashCode() {
        int iE = b.e(android.support.v4.media.session.a.a(this.d, b.c(b.c(this.f10398a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e);
        Integer num = this.f;
        int iHashCode = (iE + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.g;
        int iHashCode2 = (this.h.hashCode() + ((iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31;
        Disclaimer disclaimer = this.i;
        int iHashCode3 = (iHashCode2 + (disclaimer == null ? 0 : disclaimer.hashCode())) * 31;
        Marketplace marketplace = this.j;
        int iHashCode4 = (iHashCode3 + (marketplace == null ? 0 : marketplace.hashCode())) * 31;
        String str = this.k;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.l;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MemberPricePromotionInfo memberPricePromotionInfo = this.m;
        int iHashCode7 = (iHashCode6 + (memberPricePromotionInfo == null ? 0 : memberPricePromotionInfo.hashCode())) * 31;
        SingleMemberPricePromotionInfo singleMemberPricePromotionInfo = this.n;
        int iHashCode8 = (iHashCode7 + (singleMemberPricePromotionInfo == null ? 0 : singleMemberPricePromotionInfo.hashCode())) * 31;
        MultiBuyPromotionInfo multiBuyPromotionInfo = this.o;
        int iHashCode9 = (iHashCode8 + (multiBuyPromotionInfo == null ? 0 : multiBuyPromotionInfo.hashCode())) * 31;
        CartProductInfo cartProductInfo = this.p;
        int iHashCode10 = (iHashCode9 + (cartProductInfo == null ? 0 : cartProductInfo.hashCode())) * 31;
        String str3 = this.q;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BundlePromotionInfo bundlePromotionInfo = this.r;
        int iHashCode12 = (iHashCode11 + (bundlePromotionInfo == null ? 0 : bundlePromotionInfo.hashCode())) * 31;
        BuyMoreSaveMorePromotionInfo buyMoreSaveMorePromotionInfo = this.s;
        return iHashCode12 + (buyMoreSaveMorePromotionInfo != null ? buyMoreSaveMorePromotionInfo.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("CartProductCard(productId=", this.f10398a, ", title=", this.b, ", imageUrl=");
        sbV.append(this.c);
        sbV.append(", quantity=");
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
        a.B(sbV, ", saving=", this.k, ", wasPrice=", this.l);
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
}
