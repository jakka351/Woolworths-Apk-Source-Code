package com.woolworths.shop.cart.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.graphql.common.fragment.ProductCardImpl_ResponseAdapter;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.BadgeType;
import au.com.woolworths.shop.graphql.type.adapter.BadgeType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$DoubleAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.cart.ProductReviewAlternativeQuery;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/woolworths/shop/cart/adapter/ProductReviewAlternativeQuery_ResponseAdapter;", "", "Data", "ProductReviewAlternative", "Product", "Badge", "QuantityInfo", "Alternative", "Info", "PrimaryCta", "OnCtaClickAnalytics", "InfoClickAnalytics", "PageImpressionAnalytics", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductReviewAlternativeQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/ProductReviewAlternativeQuery_ResponseAdapter$Alternative;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/ProductReviewAlternativeQuery$Alternative;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Alternative implements Adapter<ProductReviewAlternativeQuery.Alternative> {

        /* renamed from: a, reason: collision with root package name */
        public static final Alternative f21597a = new Alternative();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductReviewAlternativeQuery.Alternative(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductReviewAlternativeQuery.Alternative value = (ProductReviewAlternativeQuery.Alternative) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21539a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/ProductReviewAlternativeQuery_ResponseAdapter$Badge;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/ProductReviewAlternativeQuery$Badge;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Badge implements Adapter<ProductReviewAlternativeQuery.Badge> {

        /* renamed from: a, reason: collision with root package name */
        public static final Badge f21598a = new Badge();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "type");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            BadgeType badgeTypeA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    badgeTypeA = BadgeType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (badgeTypeA != null) {
                return new ProductReviewAlternativeQuery.Badge(str, badgeTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductReviewAlternativeQuery.Badge value = (ProductReviewAlternativeQuery.Badge) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21540a);
            writer.F1("type");
            BadgeType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/ProductReviewAlternativeQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/ProductReviewAlternativeQuery$Data;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<ProductReviewAlternativeQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f21599a = new Data();
        public static final List b = CollectionsKt.Q("productReviewAlternative");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductReviewAlternativeQuery.ProductReviewAlternative productReviewAlternative = null;
            while (reader.o2(b) == 0) {
                productReviewAlternative = (ProductReviewAlternativeQuery.ProductReviewAlternative) Adapters.c(ProductReviewAlternative.f21606a, false).fromJson(reader, customScalarAdapters);
            }
            if (productReviewAlternative != null) {
                return new ProductReviewAlternativeQuery.Data(productReviewAlternative);
            }
            Assertions.a(reader, "productReviewAlternative");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductReviewAlternativeQuery.Data value = (ProductReviewAlternativeQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productReviewAlternative");
            Adapters.c(ProductReviewAlternative.f21606a, false).toJson(writer, customScalarAdapters, value.f21541a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/ProductReviewAlternativeQuery_ResponseAdapter$Info;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/ProductReviewAlternativeQuery$Info;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Info implements Adapter<ProductReviewAlternativeQuery.Info> {

        /* renamed from: a, reason: collision with root package name */
        public static final Info f21600a = new Info();
        public static final List b = CollectionsKt.R("bottomSheetTitle", "bottomSheetBody", "primaryCta", "infoClickAnalytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ProductReviewAlternativeQuery.PrimaryCta primaryCta = null;
            ProductReviewAlternativeQuery.InfoClickAnalytics infoClickAnalytics = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    primaryCta = (ProductReviewAlternativeQuery.PrimaryCta) Adapters.c(PrimaryCta.f21604a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    infoClickAnalytics = (ProductReviewAlternativeQuery.InfoClickAnalytics) Adapters.c(InfoClickAnalytics.f21601a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "bottomSheetTitle");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "bottomSheetBody");
                throw null;
            }
            if (primaryCta == null) {
                Assertions.a(reader, "primaryCta");
                throw null;
            }
            if (infoClickAnalytics != null) {
                return new ProductReviewAlternativeQuery.Info(str, str2, primaryCta, infoClickAnalytics);
            }
            Assertions.a(reader, "infoClickAnalytics");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductReviewAlternativeQuery.Info value = (ProductReviewAlternativeQuery.Info) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("bottomSheetTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21542a);
            writer.F1("bottomSheetBody");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("primaryCta");
            Adapters.c(PrimaryCta.f21604a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("infoClickAnalytics");
            Adapters.c(InfoClickAnalytics.f21601a, true).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/ProductReviewAlternativeQuery_ResponseAdapter$InfoClickAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/ProductReviewAlternativeQuery$InfoClickAnalytics;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InfoClickAnalytics implements Adapter<ProductReviewAlternativeQuery.InfoClickAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final InfoClickAnalytics f21601a = new InfoClickAnalytics();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductReviewAlternativeQuery.InfoClickAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductReviewAlternativeQuery.InfoClickAnalytics value = (ProductReviewAlternativeQuery.InfoClickAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21543a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/ProductReviewAlternativeQuery_ResponseAdapter$OnCtaClickAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/ProductReviewAlternativeQuery$OnCtaClickAnalytics;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCtaClickAnalytics implements Adapter<ProductReviewAlternativeQuery.OnCtaClickAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final OnCtaClickAnalytics f21602a = new OnCtaClickAnalytics();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductReviewAlternativeQuery.OnCtaClickAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductReviewAlternativeQuery.OnCtaClickAnalytics value = (ProductReviewAlternativeQuery.OnCtaClickAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21544a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/ProductReviewAlternativeQuery_ResponseAdapter$PageImpressionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/ProductReviewAlternativeQuery$PageImpressionAnalytics;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PageImpressionAnalytics implements Adapter<ProductReviewAlternativeQuery.PageImpressionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final PageImpressionAnalytics f21603a = new PageImpressionAnalytics();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductReviewAlternativeQuery.PageImpressionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductReviewAlternativeQuery.PageImpressionAnalytics value = (ProductReviewAlternativeQuery.PageImpressionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21545a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/ProductReviewAlternativeQuery_ResponseAdapter$PrimaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/ProductReviewAlternativeQuery$PrimaryCta;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrimaryCta implements Adapter<ProductReviewAlternativeQuery.PrimaryCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final PrimaryCta f21604a = new PrimaryCta();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "onCtaClickAnalytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ProductReviewAlternativeQuery.OnCtaClickAnalytics onCtaClickAnalytics = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    onCtaClickAnalytics = (ProductReviewAlternativeQuery.OnCtaClickAnalytics) Adapters.b(Adapters.c(OnCtaClickAnalytics.f21602a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new ProductReviewAlternativeQuery.PrimaryCta(str, onCtaClickAnalytics);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductReviewAlternativeQuery.PrimaryCta value = (ProductReviewAlternativeQuery.PrimaryCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21546a);
            writer.F1("onCtaClickAnalytics");
            Adapters.b(Adapters.c(OnCtaClickAnalytics.f21602a, true)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/ProductReviewAlternativeQuery_ResponseAdapter$Product;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/ProductReviewAlternativeQuery$Product;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Product implements Adapter<ProductReviewAlternativeQuery.Product> {

        /* renamed from: a, reason: collision with root package name */
        public static final Product f21605a = new Product();
        public static final List b = CollectionsKt.R("title", "productId", "quantity", "imageUrl", "badge", "quantityInfo", "price", "unitPrice", "isAvailable");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Double d;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d2 = null;
            String str = null;
            String str2 = null;
            Boolean bool = null;
            String str3 = null;
            ProductReviewAlternativeQuery.Badge badge = null;
            ProductReviewAlternativeQuery.QuantityInfo quantityInfo = null;
            Integer num = null;
            String str4 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        d = d2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        d = d2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        d2 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                        continue;
                    case 3:
                        d = d2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        d = d2;
                        badge = (ProductReviewAlternativeQuery.Badge) Adapters.b(Adapters.c(Badge.f21598a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        d = d2;
                        quantityInfo = (ProductReviewAlternativeQuery.QuantityInfo) Adapters.b(Adapters.c(QuantityInfo.f21607a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        d = d2;
                        num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        d = d2;
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        d = d2;
                        bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Double d3 = d2;
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "productId");
                            throw null;
                        }
                        if (d3 == null) {
                            Assertions.a(reader, "quantity");
                            throw null;
                        }
                        Boolean bool2 = bool;
                        double dDoubleValue = d3.doubleValue();
                        if (str3 == null) {
                            Assertions.a(reader, "imageUrl");
                            throw null;
                        }
                        if (bool2 != null) {
                            return new ProductReviewAlternativeQuery.Product(str, str2, dDoubleValue, str3, badge, quantityInfo, num, str4, bool2.booleanValue());
                        }
                        Assertions.a(reader, "isAvailable");
                        throw null;
                }
                d2 = d;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductReviewAlternativeQuery.Product value = (ProductReviewAlternativeQuery.Product) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f21547a);
            writer.F1("productId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("quantity");
            Adapters.c.toJson(writer, customScalarAdapters, Double.valueOf(value.c));
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("badge");
            Adapters.b(Adapters.c(Badge.f21598a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("quantityInfo");
            Adapters.b(Adapters.c(QuantityInfo.f21607a, false)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("price");
            Adapters.k.toJson(writer, customScalarAdapters, value.g);
            writer.F1("unitPrice");
            Adapters.i.toJson(writer, customScalarAdapters, value.h);
            writer.F1("isAvailable");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.i));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/ProductReviewAlternativeQuery_ResponseAdapter$ProductReviewAlternative;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/ProductReviewAlternativeQuery$ProductReviewAlternative;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductReviewAlternative implements Adapter<ProductReviewAlternativeQuery.ProductReviewAlternative> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductReviewAlternative f21606a = new ProductReviewAlternative();
        public static final List b = CollectionsKt.R("searchHint", "alternativesTitle", "errorMessage", "errorActionTitle", "product", "alternatives", "info", "pageImpressionAnalytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ProductReviewAlternativeQuery.Product product = null;
            ArrayList arrayListFromJson = null;
            ProductReviewAlternativeQuery.Info info = null;
            ProductReviewAlternativeQuery.PageImpressionAnalytics pageImpressionAnalytics = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        product = (ProductReviewAlternativeQuery.Product) Adapters.c(Product.f21605a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        arrayListFromJson = Adapters.a(Adapters.c(Alternative.f21597a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        info = (ProductReviewAlternativeQuery.Info) Adapters.c(Info.f21600a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        pageImpressionAnalytics = (ProductReviewAlternativeQuery.PageImpressionAnalytics) Adapters.c(PageImpressionAnalytics.f21603a, true).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "searchHint");
                            throw null;
                        }
                        if (product == null) {
                            Assertions.a(reader, "product");
                            throw null;
                        }
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "alternatives");
                            throw null;
                        }
                        if (info == null) {
                            Assertions.a(reader, "info");
                            throw null;
                        }
                        if (pageImpressionAnalytics != null) {
                            return new ProductReviewAlternativeQuery.ProductReviewAlternative(str, str2, str3, str4, product, arrayListFromJson, info, pageImpressionAnalytics);
                        }
                        Assertions.a(reader, "pageImpressionAnalytics");
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductReviewAlternativeQuery.ProductReviewAlternative value = (ProductReviewAlternativeQuery.ProductReviewAlternative) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("searchHint");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f21548a);
            writer.F1("alternativesTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("errorMessage");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("errorActionTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("product");
            Adapters.c(Product.f21605a, false).toJson(writer, customScalarAdapters, value.e);
            writer.F1("alternatives");
            Adapters.a(Adapters.c(Alternative.f21597a, true)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("info");
            Adapters.c(Info.f21600a, false).toJson(writer, customScalarAdapters, value.g);
            writer.F1("pageImpressionAnalytics");
            Adapters.c(PageImpressionAnalytics.f21603a, true).toJson(writer, customScalarAdapters, value.h);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/cart/adapter/ProductReviewAlternativeQuery_ResponseAdapter$QuantityInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/cart/ProductReviewAlternativeQuery$QuantityInfo;", "shop-cart_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class QuantityInfo implements Adapter<ProductReviewAlternativeQuery.QuantityInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final QuantityInfo f21607a = new QuantityInfo();
        public static final List b = CollectionsKt.R("minimum", "maximum", "increment", "defaultValue", "unit");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d = null;
            Double d2 = null;
            Double d3 = null;
            Double d4 = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    d = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    d2 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    d3 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    d4 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (d == null) {
                Assertions.a(reader, "minimum");
                throw null;
            }
            double dDoubleValue = d.doubleValue();
            if (d2 == null) {
                Assertions.a(reader, "maximum");
                throw null;
            }
            double dDoubleValue2 = d2.doubleValue();
            if (d3 == null) {
                Assertions.a(reader, "increment");
                throw null;
            }
            double dDoubleValue3 = d3.doubleValue();
            if (d4 != null) {
                return new ProductReviewAlternativeQuery.QuantityInfo(dDoubleValue, dDoubleValue2, dDoubleValue3, d4.doubleValue(), str);
            }
            Assertions.a(reader, "defaultValue");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductReviewAlternativeQuery.QuantityInfo value = (ProductReviewAlternativeQuery.QuantityInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("minimum");
            Adapters$DoubleAdapter$1 adapters$DoubleAdapter$1 = Adapters.c;
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.f21549a));
            writer.F1("maximum");
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.b));
            writer.F1("increment");
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.c));
            writer.F1("defaultValue");
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.d));
            writer.F1("unit");
            Adapters.i.toJson(writer, customScalarAdapters, value.e);
        }
    }
}
