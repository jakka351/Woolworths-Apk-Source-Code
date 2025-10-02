package com.woolworths.shop.cart;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.graphql.type.BadgeType;
import au.com.woolworths.shop.graphql.type.ProductReviewAlternativeInput;
import au.com.woolworths.shop.graphql.type.adapter.ProductReviewAlternativeInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.cart.adapter.ProductReviewAlternativeQuery_ResponseAdapter;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\f\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/woolworths/shop/cart/ProductReviewAlternativeQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/cart/ProductReviewAlternativeQuery$Data;", "Data", "ProductReviewAlternative", "Product", "Badge", "QuantityInfo", "Alternative", "Info", "PrimaryCta", "OnCtaClickAnalytics", "InfoClickAnalytics", "PageImpressionAnalytics", "Companion", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ProductReviewAlternativeQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final ProductReviewAlternativeInput f21538a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final boolean f;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/ProductReviewAlternativeQuery$Alternative;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Alternative {

        /* renamed from: a, reason: collision with root package name */
        public final String f21539a;
        public final ProductCard b;

        public Alternative(String str, ProductCard productCard) {
            this.f21539a = str;
            this.b = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Alternative)) {
                return false;
            }
            Alternative alternative = (Alternative) obj;
            return Intrinsics.c(this.f21539a, alternative.f21539a) && Intrinsics.c(this.b, alternative.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21539a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("Alternative(__typename=", this.f21539a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/ProductReviewAlternativeQuery$Badge;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Badge {

        /* renamed from: a, reason: collision with root package name */
        public final String f21540a;
        public final BadgeType b;

        public Badge(String str, BadgeType badgeType) {
            this.f21540a = str;
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
            return Intrinsics.c(this.f21540a, badge.f21540a) && this.b == badge.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21540a.hashCode() * 31);
        }

        public final String toString() {
            return "Badge(label=" + this.f21540a + ", type=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/cart/ProductReviewAlternativeQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/ProductReviewAlternativeQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ProductReviewAlternative f21541a;

        public Data(ProductReviewAlternative productReviewAlternative) {
            this.f21541a = productReviewAlternative;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21541a, ((Data) obj).f21541a);
        }

        public final int hashCode() {
            return this.f21541a.hashCode();
        }

        public final String toString() {
            return "Data(productReviewAlternative=" + this.f21541a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/ProductReviewAlternativeQuery$Info;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Info {

        /* renamed from: a, reason: collision with root package name */
        public final String f21542a;
        public final String b;
        public final PrimaryCta c;
        public final InfoClickAnalytics d;

        public Info(String str, String str2, PrimaryCta primaryCta, InfoClickAnalytics infoClickAnalytics) {
            this.f21542a = str;
            this.b = str2;
            this.c = primaryCta;
            this.d = infoClickAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Info)) {
                return false;
            }
            Info info = (Info) obj;
            return Intrinsics.c(this.f21542a, info.f21542a) && Intrinsics.c(this.b, info.b) && Intrinsics.c(this.c, info.c) && Intrinsics.c(this.d, info.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + b.c(this.f21542a.hashCode() * 31, 31, this.b)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Info(bottomSheetTitle=", this.f21542a, ", bottomSheetBody=", this.b, ", primaryCta=");
            sbV.append(this.c);
            sbV.append(", infoClickAnalytics=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/ProductReviewAlternativeQuery$InfoClickAnalytics;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InfoClickAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f21543a;
        public final AnalyticsFields b;

        public InfoClickAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f21543a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InfoClickAnalytics)) {
                return false;
            }
            InfoClickAnalytics infoClickAnalytics = (InfoClickAnalytics) obj;
            return Intrinsics.c(this.f21543a, infoClickAnalytics.f21543a) && Intrinsics.c(this.b, infoClickAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21543a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("InfoClickAnalytics(__typename=", this.f21543a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/ProductReviewAlternativeQuery$OnCtaClickAnalytics;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCtaClickAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f21544a;
        public final AnalyticsFields b;

        public OnCtaClickAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f21544a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCtaClickAnalytics)) {
                return false;
            }
            OnCtaClickAnalytics onCtaClickAnalytics = (OnCtaClickAnalytics) obj;
            return Intrinsics.c(this.f21544a, onCtaClickAnalytics.f21544a) && Intrinsics.c(this.b, onCtaClickAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21544a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("OnCtaClickAnalytics(__typename=", this.f21544a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/ProductReviewAlternativeQuery$PageImpressionAnalytics;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PageImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f21545a;
        public final AnalyticsFields b;

        public PageImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f21545a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PageImpressionAnalytics)) {
                return false;
            }
            PageImpressionAnalytics pageImpressionAnalytics = (PageImpressionAnalytics) obj;
            return Intrinsics.c(this.f21545a, pageImpressionAnalytics.f21545a) && Intrinsics.c(this.b, pageImpressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21545a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("PageImpressionAnalytics(__typename=", this.f21545a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/ProductReviewAlternativeQuery$PrimaryCta;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrimaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f21546a;
        public final OnCtaClickAnalytics b;

        public PrimaryCta(String str, OnCtaClickAnalytics onCtaClickAnalytics) {
            this.f21546a = str;
            this.b = onCtaClickAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrimaryCta)) {
                return false;
            }
            PrimaryCta primaryCta = (PrimaryCta) obj;
            return Intrinsics.c(this.f21546a, primaryCta.f21546a) && Intrinsics.c(this.b, primaryCta.b);
        }

        public final int hashCode() {
            int iHashCode = this.f21546a.hashCode() * 31;
            OnCtaClickAnalytics onCtaClickAnalytics = this.b;
            return iHashCode + (onCtaClickAnalytics == null ? 0 : onCtaClickAnalytics.hashCode());
        }

        public final String toString() {
            return "PrimaryCta(label=" + this.f21546a + ", onCtaClickAnalytics=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/ProductReviewAlternativeQuery$Product;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Product {

        /* renamed from: a, reason: collision with root package name */
        public final String f21547a;
        public final String b;
        public final double c;
        public final String d;
        public final Badge e;
        public final QuantityInfo f;
        public final Integer g;
        public final String h;
        public final boolean i;

        public Product(String str, String str2, double d, String str3, Badge badge, QuantityInfo quantityInfo, Integer num, String str4, boolean z) {
            this.f21547a = str;
            this.b = str2;
            this.c = d;
            this.d = str3;
            this.e = badge;
            this.f = quantityInfo;
            this.g = num;
            this.h = str4;
            this.i = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return Intrinsics.c(this.f21547a, product.f21547a) && Intrinsics.c(this.b, product.b) && Double.compare(this.c, product.c) == 0 && Intrinsics.c(this.d, product.d) && Intrinsics.c(this.e, product.e) && Intrinsics.c(this.f, product.f) && Intrinsics.c(this.g, product.g) && Intrinsics.c(this.h, product.h) && this.i == product.i;
        }

        public final int hashCode() {
            int iC = b.c(android.support.v4.media.session.a.a(this.c, b.c(this.f21547a.hashCode() * 31, 31, this.b), 31), 31, this.d);
            Badge badge = this.e;
            int iHashCode = (iC + (badge == null ? 0 : badge.hashCode())) * 31;
            QuantityInfo quantityInfo = this.f;
            int iHashCode2 = (iHashCode + (quantityInfo == null ? 0 : quantityInfo.hashCode())) * 31;
            Integer num = this.g;
            int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.h;
            return Boolean.hashCode(this.i) + ((iHashCode3 + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Product(title=", this.f21547a, ", productId=", this.b, ", quantity=");
            sbV.append(this.c);
            sbV.append(", imageUrl=");
            sbV.append(this.d);
            sbV.append(", badge=");
            sbV.append(this.e);
            sbV.append(", quantityInfo=");
            sbV.append(this.f);
            sbV.append(", price=");
            sbV.append(this.g);
            sbV.append(", unitPrice=");
            sbV.append(this.h);
            sbV.append(", isAvailable=");
            sbV.append(this.i);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/ProductReviewAlternativeQuery$ProductReviewAlternative;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductReviewAlternative {

        /* renamed from: a, reason: collision with root package name */
        public final String f21548a;
        public final String b;
        public final String c;
        public final String d;
        public final Product e;
        public final ArrayList f;
        public final Info g;
        public final PageImpressionAnalytics h;

        public ProductReviewAlternative(String str, String str2, String str3, String str4, Product product, ArrayList arrayList, Info info, PageImpressionAnalytics pageImpressionAnalytics) {
            this.f21548a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = product;
            this.f = arrayList;
            this.g = info;
            this.h = pageImpressionAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductReviewAlternative)) {
                return false;
            }
            ProductReviewAlternative productReviewAlternative = (ProductReviewAlternative) obj;
            return this.f21548a.equals(productReviewAlternative.f21548a) && Intrinsics.c(this.b, productReviewAlternative.b) && Intrinsics.c(this.c, productReviewAlternative.c) && Intrinsics.c(this.d, productReviewAlternative.d) && this.e.equals(productReviewAlternative.e) && this.f.equals(productReviewAlternative.f) && this.g.equals(productReviewAlternative.g) && this.h.equals(productReviewAlternative.h);
        }

        public final int hashCode() {
            int iHashCode = this.f21548a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return this.h.hashCode() + ((this.g.hashCode() + androidx.compose.ui.input.pointer.a.b((this.e.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31)) * 31, 31, this.f)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("ProductReviewAlternative(searchHint=", this.f21548a, ", alternativesTitle=", this.b, ", errorMessage=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", errorActionTitle=", this.d, ", product=");
            sbV.append(this.e);
            sbV.append(", alternatives=");
            sbV.append(this.f);
            sbV.append(", info=");
            sbV.append(this.g);
            sbV.append(", pageImpressionAnalytics=");
            sbV.append(this.h);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/cart/ProductReviewAlternativeQuery$QuantityInfo;", "", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class QuantityInfo {

        /* renamed from: a, reason: collision with root package name */
        public final double f21549a;
        public final double b;
        public final double c;
        public final double d;
        public final String e;

        public QuantityInfo(double d, double d2, double d3, double d4, String str) {
            this.f21549a = d;
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
            return Double.compare(this.f21549a, quantityInfo.f21549a) == 0 && Double.compare(this.b, quantityInfo.b) == 0 && Double.compare(this.c, quantityInfo.c) == 0 && Double.compare(this.d, quantityInfo.d) == 0 && Intrinsics.c(this.e, quantityInfo.e);
        }

        public final int hashCode() {
            int iA = android.support.v4.media.session.a.a(this.d, android.support.v4.media.session.a.a(this.c, android.support.v4.media.session.a.a(this.b, Double.hashCode(this.f21549a) * 31, 31), 31), 31);
            String str = this.e;
            return iA + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sbN = androidx.constraintlayout.core.state.a.n(this.f21549a, "QuantityInfo(minimum=", ", maximum=");
            sbN.append(this.b);
            au.com.woolworths.android.onesite.a.z(sbN, ", increment=", this.c, ", defaultValue=");
            sbN.append(this.d);
            sbN.append(", unit=");
            sbN.append(this.e);
            sbN.append(")");
            return sbN.toString();
        }
    }

    public ProductReviewAlternativeQuery(ProductReviewAlternativeInput productReviewAlternativeInput, boolean z) {
        this.f21538a = productReviewAlternativeInput;
        Optional.Absent absent = Optional.Absent.f13523a;
        this.b = absent;
        this.c = absent;
        this.d = absent;
        this.e = absent;
        this.f = z;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(ProductReviewAlternativeQuery_ResponseAdapter.Data.f21599a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query ProductReviewAlternative($input: ProductReviewAlternativeInput!, $includeProductAvailabilityStates: Boolean! = false , $includeOfferMinimumSpend: Boolean! = false , $includeAvailabilityInfoStatus: Boolean! = false , $includePricingFootnote: Boolean! = false , $includeLowestPrice14Days: Boolean!) { productReviewAlternative(productReviewAlternativeInput: $input) { searchHint alternativesTitle errorMessage errorActionTitle product { title productId quantity imageUrl badge { label type } quantityInfo { minimum maximum increment defaultValue: default unit } price unitPrice isAvailable } alternatives { __typename ...productCard } info { bottomSheetTitle bottomSheetBody primaryCta { label onCtaClickAnalytics { __typename ...analyticsFields } } infoClickAnalytics { __typename ...analyticsFields } } pageImpressionAnalytics { __typename ...analyticsFields } } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductReviewAlternativeQuery)) {
            return false;
        }
        ProductReviewAlternativeQuery productReviewAlternativeQuery = (ProductReviewAlternativeQuery) obj;
        return Intrinsics.c(this.f21538a, productReviewAlternativeQuery.f21538a) && Intrinsics.c(this.b, productReviewAlternativeQuery.b) && Intrinsics.c(this.c, productReviewAlternativeQuery.c) && Intrinsics.c(this.d, productReviewAlternativeQuery.d) && Intrinsics.c(this.e, productReviewAlternativeQuery.e) && this.f == productReviewAlternativeQuery.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.e, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.d, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.c, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.b, this.f21538a.f11770a.hashCode() * 31, 31), 31), 31), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "c4a98cb942cfd6b75fc64cc8912c18c928a5828c8a40578fae70eeccf25e2113";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "ProductReviewAlternative";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("input");
        Adapters.c(ProductReviewAlternativeInput_InputAdapter.f12105a, false).toJson(jsonWriter, customScalarAdapters, this.f21538a);
        Optional optional = this.b;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("includeProductAvailabilityStates");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        } else if (z) {
            jsonWriter.F1("includeProductAvailabilityStates");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional2 = this.c;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("includeOfferMinimumSpend");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        } else if (z) {
            jsonWriter.F1("includeOfferMinimumSpend");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional3 = this.d;
        if (optional3 instanceof Optional.Present) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional3);
        } else if (z) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional4 = this.e;
        if (optional4 instanceof Optional.Present) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional4);
        } else if (z) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        jsonWriter.F1("includeLowestPrice14Days");
        Adapters.f.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.f));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductReviewAlternativeQuery(input=");
        sb.append(this.f21538a);
        sb.append(", includeProductAvailabilityStates=");
        sb.append(this.b);
        sb.append(", includeOfferMinimumSpend=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, this.c, ", includeAvailabilityInfoStatus=", this.d, ", includePricingFootnote=");
        sb.append(this.e);
        sb.append(", includeLowestPrice14Days=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
