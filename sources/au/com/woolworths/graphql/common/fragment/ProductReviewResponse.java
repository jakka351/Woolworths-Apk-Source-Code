package au.com.woolworths.graphql.common.fragment;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.graphql.type.BadgeType;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.ProductReviewAlternativeType;
import au.com.woolworths.shop.graphql.type.ProductReviewGroupType;
import com.apollographql.apollo.api.Fragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductReviewResponse;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Feed", "Analytic", "OnProductReviewGroup", "Banner", "Action", "Product", "Badge", "QuantityInfo", "Alternative", "Analytics", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class ProductReviewResponse implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f9003a;
    public final ArrayList b;
    public final ArrayList c;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductReviewResponse$Action;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerActionPlacement f9004a;
        public final InsetBannerActionType b;
        public final String c;
        public final String d;

        public Action(InsetBannerActionPlacement insetBannerActionPlacement, InsetBannerActionType insetBannerActionType, String str, String str2) {
            this.f9004a = insetBannerActionPlacement;
            this.b = insetBannerActionType;
            this.c = str;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return this.f9004a == action.f9004a && this.b == action.b && Intrinsics.c(this.c, action.c) && Intrinsics.c(this.d, action.d);
        }

        public final int hashCode() {
            int iC = b.c(d.c(this.b, this.f9004a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.l(d.t("Action(placement=", this.f9004a, ", type=", this.b, ", label="), this.c, ", url=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductReviewResponse$Alternative;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Alternative {

        /* renamed from: a, reason: collision with root package name */
        public final String f9005a;
        public final ProductReviewAlternativeType b;

        public Alternative(String str, ProductReviewAlternativeType productReviewAlternativeType) {
            this.f9005a = str;
            this.b = productReviewAlternativeType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Alternative)) {
                return false;
            }
            Alternative alternative = (Alternative) obj;
            return Intrinsics.c(this.f9005a, alternative.f9005a) && this.b == alternative.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f9005a.hashCode() * 31);
        }

        public final String toString() {
            return "Alternative(title=" + this.f9005a + ", type=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductReviewResponse$Analytic;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytic {

        /* renamed from: a, reason: collision with root package name */
        public final String f9006a;
        public final AnalyticsFields b;

        public Analytic(String str, AnalyticsFields analyticsFields) {
            this.f9006a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytic)) {
                return false;
            }
            Analytic analytic = (Analytic) obj;
            return Intrinsics.c(this.f9006a, analytic.f9006a) && Intrinsics.c(this.b, analytic.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f9006a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytic(__typename=", this.f9006a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductReviewResponse$Analytics;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f9007a;
        public final AnalyticsFields b;

        public Analytics(String str, AnalyticsFields analyticsFields) {
            this.f9007a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics)) {
                return false;
            }
            Analytics analytics = (Analytics) obj;
            return Intrinsics.c(this.f9007a, analytics.f9007a) && Intrinsics.c(this.b, analytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f9007a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics(__typename=", this.f9007a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductReviewResponse$Badge;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Badge {

        /* renamed from: a, reason: collision with root package name */
        public final String f9008a;
        public final BadgeType b;

        public Badge(String str, BadgeType badgeType) {
            this.f9008a = str;
            this.b = badgeType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Badge)) {
                return false;
            }
            Badge badge = (Badge) obj;
            return Intrinsics.c(this.f9008a, badge.f9008a) && this.b == badge.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f9008a.hashCode() * 31);
        }

        public final String toString() {
            return "Badge(label=" + this.f9008a + ", type=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductReviewResponse$Banner;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Banner {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f9009a;
        public final String b;
        public final String c;
        public final String d;
        public final Action e;

        public Banner(InsetBannerDisplayType insetBannerDisplayType, String str, String str2, String str3, Action action) {
            this.f9009a = insetBannerDisplayType;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) obj;
            return this.f9009a == banner.f9009a && Intrinsics.c(this.b, banner.b) && Intrinsics.c(this.c, banner.c) && Intrinsics.c(this.d, banner.d) && Intrinsics.c(this.e, banner.e);
        }

        public final int hashCode() {
            int iC = b.c(this.f9009a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Action action = this.e;
            return iHashCode2 + (action != null ? action.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbU = d.u("Banner(displayType=", this.f9009a, ", message=", this.b, ", iconUrl=");
            a.B(sbU, this.c, ", bannerTitle=", this.d, ", action=");
            sbU.append(this.e);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductReviewResponse$Feed;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Feed {

        /* renamed from: a, reason: collision with root package name */
        public final String f9010a;
        public final OnProductReviewGroup b;

        public Feed(String __typename, OnProductReviewGroup onProductReviewGroup) {
            Intrinsics.h(__typename, "__typename");
            this.f9010a = __typename;
            this.b = onProductReviewGroup;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Feed)) {
                return false;
            }
            Feed feed = (Feed) obj;
            return Intrinsics.c(this.f9010a, feed.f9010a) && Intrinsics.c(this.b, feed.b);
        }

        public final int hashCode() {
            int iHashCode = this.f9010a.hashCode() * 31;
            OnProductReviewGroup onProductReviewGroup = this.b;
            return iHashCode + (onProductReviewGroup == null ? 0 : onProductReviewGroup.hashCode());
        }

        public final String toString() {
            return "Feed(__typename=" + this.f9010a + ", onProductReviewGroup=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductReviewResponse$OnProductReviewGroup;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductReviewGroup {

        /* renamed from: a, reason: collision with root package name */
        public final Banner f9011a;
        public final ProductReviewGroupType b;
        public final ArrayList c;
        public final Analytics d;

        public OnProductReviewGroup(Banner banner, ProductReviewGroupType productReviewGroupType, ArrayList arrayList, Analytics analytics) {
            this.f9011a = banner;
            this.b = productReviewGroupType;
            this.c = arrayList;
            this.d = analytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductReviewGroup)) {
                return false;
            }
            OnProductReviewGroup onProductReviewGroup = (OnProductReviewGroup) obj;
            return this.f9011a.equals(onProductReviewGroup.f9011a) && this.b == onProductReviewGroup.b && this.c.equals(onProductReviewGroup.c) && this.d.equals(onProductReviewGroup.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + androidx.compose.ui.input.pointer.a.b((this.b.hashCode() + (this.f9011a.hashCode() * 31)) * 31, 31, this.c);
        }

        public final String toString() {
            return "OnProductReviewGroup(banner=" + this.f9011a + ", type=" + this.b + ", products=" + this.c + ", analytics=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductReviewResponse$Product;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Product {

        /* renamed from: a, reason: collision with root package name */
        public final String f9012a;
        public final String b;
        public final double c;
        public final String d;
        public final Badge e;
        public final QuantityInfo f;
        public final Integer g;
        public final boolean h;
        public final Alternative i;
        public final String j;

        public Product(String str, String str2, double d, String str3, Badge badge, QuantityInfo quantityInfo, Integer num, boolean z, Alternative alternative, String str4) {
            this.f9012a = str;
            this.b = str2;
            this.c = d;
            this.d = str3;
            this.e = badge;
            this.f = quantityInfo;
            this.g = num;
            this.h = z;
            this.i = alternative;
            this.j = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return Intrinsics.c(this.f9012a, product.f9012a) && Intrinsics.c(this.b, product.b) && Double.compare(this.c, product.c) == 0 && Intrinsics.c(this.d, product.d) && Intrinsics.c(this.e, product.e) && Intrinsics.c(this.f, product.f) && Intrinsics.c(this.g, product.g) && this.h == product.h && Intrinsics.c(this.i, product.i) && Intrinsics.c(this.j, product.j);
        }

        public final int hashCode() {
            int iC = b.c(android.support.v4.media.session.a.a(this.c, b.c(this.f9012a.hashCode() * 31, 31, this.b), 31), 31, this.d);
            Badge badge = this.e;
            int iHashCode = (iC + (badge == null ? 0 : badge.hashCode())) * 31;
            QuantityInfo quantityInfo = this.f;
            int iHashCode2 = (iHashCode + (quantityInfo == null ? 0 : quantityInfo.hashCode())) * 31;
            Integer num = this.g;
            int iE = b.e((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31, 31, this.h);
            Alternative alternative = this.i;
            int iHashCode3 = (iE + (alternative == null ? 0 : alternative.hashCode())) * 31;
            String str = this.j;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("Product(title=", this.f9012a, ", productId=", this.b, ", quantity=");
            sbV.append(this.c);
            sbV.append(", imageUrl=");
            sbV.append(this.d);
            sbV.append(", badge=");
            sbV.append(this.e);
            sbV.append(", quantityInfo=");
            sbV.append(this.f);
            sbV.append(", price=");
            sbV.append(this.g);
            sbV.append(", isAvailable=");
            sbV.append(this.h);
            sbV.append(", alternative=");
            sbV.append(this.i);
            sbV.append(", availableLimit=");
            sbV.append(this.j);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/graphql/common/fragment/ProductReviewResponse$QuantityInfo;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class QuantityInfo {

        /* renamed from: a, reason: collision with root package name */
        public final double f9013a;
        public final double b;
        public final double c;
        public final double d;
        public final String e;

        public QuantityInfo(double d, double d2, double d3, double d4, String str) {
            this.f9013a = d;
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
            return Double.compare(this.f9013a, quantityInfo.f9013a) == 0 && Double.compare(this.b, quantityInfo.b) == 0 && Double.compare(this.c, quantityInfo.c) == 0 && Double.compare(this.d, quantityInfo.d) == 0 && Intrinsics.c(this.e, quantityInfo.e);
        }

        public final int hashCode() {
            int iA = android.support.v4.media.session.a.a(this.d, android.support.v4.media.session.a.a(this.c, android.support.v4.media.session.a.a(this.b, Double.hashCode(this.f9013a) * 31, 31), 31), 31);
            String str = this.e;
            return iA + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sbN = a.n(this.f9013a, "QuantityInfo(minimum=", ", maximum=");
            sbN.append(this.b);
            au.com.woolworths.android.onesite.a.z(sbN, ", increment=", this.c, ", defaultValue=");
            sbN.append(this.d);
            sbN.append(", unit=");
            sbN.append(this.e);
            sbN.append(")");
            return sbN.toString();
        }
    }

    public ProductReviewResponse(String str, ArrayList arrayList, ArrayList arrayList2) {
        this.f9003a = str;
        this.b = arrayList;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductReviewResponse)) {
            return false;
        }
        ProductReviewResponse productReviewResponse = (ProductReviewResponse) obj;
        return this.f9003a.equals(productReviewResponse.f9003a) && this.b.equals(productReviewResponse.b) && this.c.equals(productReviewResponse.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + androidx.compose.ui.input.pointer.a.b(this.f9003a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return android.support.v4.media.session.a.q(")", d.x("ProductReviewResponse(message=", this.f9003a, ", feed=", ", analytics=", this.b), this.c);
    }
}
