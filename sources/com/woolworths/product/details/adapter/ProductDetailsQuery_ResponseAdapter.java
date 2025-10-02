package com.woolworths.product.details.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.graphql.TealiumAnalytics;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCardImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.CouponBannerColorTheme;
import au.com.woolworths.shop.graphql.type.FormattedBannerStyle;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.ProductListChannelType;
import au.com.woolworths.shop.graphql.type.ProductListFacetType;
import au.com.woolworths.shop.graphql.type.adapter.ActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ButtonStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CardHeight_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CouponBannerColorTheme_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.FormattedBannerStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionPlacement_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerDisplayType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ProductListChannelType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ProductListFacetType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$DoubleAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.woolworths.product.details.ProductDetailsQuery;
import fragment.RatingsAndReviewsPreviewCta;
import fragment.RatingsAndReviewsPreviewCtaImpl_ResponseAdapter;
import fragment.RatingsAndReviewsPreviewHeader;
import fragment.RatingsAndReviewsPreviewHeaderImpl_ResponseAdapter;
import fragment.RatingsAndReviewsRatingsDetails;
import fragment.RatingsAndReviewsRatingsDetailsImpl_ResponseAdapter;
import fragment.RatingsAndReviewsReviewDetails;
import fragment.RatingsAndReviewsReviewDetailsImpl_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b7\bÇ\u0002\u0018\u00002\u00020\u0001:4\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./01234567B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u00068"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter;", "", "<init>", "()V", "Data", ProductDetailsQuery.OPERATION_NAME, "Feed", "OnActionableCard", "OnCouponBanner", "CouponBannerTermsAndConditions", "OnFormattedBanner", "OnProductCard", "OnInsetBanner", "Action", "OnProductRatingsAndReviewsSummary", "RatingText", "Cta", "CtaText", "Action1", "OnPromotionBanner", "Banner", "Action2", "PromotionContent", "OnPromotionMarkdownContent", "OnFormattedContent", "OnProductDisclaimer", "OnProductOriginAndHealthInfo", "CountryOfOrigin", "HealthStarRating", "OnProductNutritionInfo", "OnProductDetailsMarketplace", "Info", "Item", "Footer", "BottomSheet", "PrimaryCta", "SecondaryCta", "OnHealthierHorizontalList", "LinkedInfo", "Link", "HealthierOption", "ProductCard", "HealthStarRating1", "OnDividerCard", "OnFooter", "Button", "OnProductHorizontalList", "Item1", "OnProductCard1", "ImageList", "ProductRatingsAndReviewsPreview", "Section", "OnRatingsAndReviewsPreviewHeader", "OnRatingsAndReviewsRatingsDetails", "OnRatingsAndReviewsReviewDetails", "OnRatingsAndReviewsPreviewCta", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductDetailsQuery_ResponseAdapter {
    public static final int $stable = 0;

    @NotNull
    public static final ProductDetailsQuery_ResponseAdapter INSTANCE = new ProductDetailsQuery_ResponseAdapter();

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$Action;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$Action;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action implements Adapter<ProductDetailsQuery.Action> {

        @NotNull
        public static final Action INSTANCE = new Action();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("placement", "type", AnnotatedPrivateKey.LABEL, "url");
        public static final int $stable = 8;

        private Action() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.Action fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerActionPlacement insetBannerActionPlacementA = null;
            InsetBannerActionType insetBannerActionTypeA = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    insetBannerActionPlacementA = InsetBannerActionPlacement_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    insetBannerActionTypeA = InsetBannerActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerActionPlacementA == null) {
                Assertions.a(reader, "placement");
                throw null;
            }
            if (insetBannerActionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new ProductDetailsQuery.Action(insetBannerActionPlacementA, insetBannerActionTypeA, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.Action value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("placement");
            InsetBannerActionPlacement_ResponseAdapter.b(writer, customScalarAdapters, value.getPlacement());
            writer.F1("type");
            InsetBannerActionType_ResponseAdapter.b(writer, customScalarAdapters, value.getType());
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getLabel());
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.getUrl());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$Action1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$Action1;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action1 implements Adapter<ProductDetailsQuery.Action1> {

        @NotNull
        public static final Action1 INSTANCE = new Action1();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("type", UrlHandler.ACTION, "id");
        public static final int $stable = 8;

        private Action1() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.Action1 fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActionType actionTypeA = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new ProductDetailsQuery.Action1(actionTypeA, str, str2);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.Action1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.getType());
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getAction());
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.getId());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$Action2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$Action2;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action2 implements Adapter<ProductDetailsQuery.Action2> {

        @NotNull
        public static final Action2 INSTANCE = new Action2();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("placement", "type", AnnotatedPrivateKey.LABEL, "url");
        public static final int $stable = 8;

        private Action2() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.Action2 fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerActionPlacement insetBannerActionPlacementA = null;
            InsetBannerActionType insetBannerActionTypeA = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    insetBannerActionPlacementA = InsetBannerActionPlacement_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    insetBannerActionTypeA = InsetBannerActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerActionPlacementA == null) {
                Assertions.a(reader, "placement");
                throw null;
            }
            if (insetBannerActionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new ProductDetailsQuery.Action2(insetBannerActionPlacementA, insetBannerActionTypeA, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.Action2 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("placement");
            InsetBannerActionPlacement_ResponseAdapter.b(writer, customScalarAdapters, value.getPlacement());
            writer.F1("type");
            InsetBannerActionType_ResponseAdapter.b(writer, customScalarAdapters, value.getType());
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getLabel());
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.getUrl());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$Banner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$Banner;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Banner implements Adapter<ProductDetailsQuery.Banner> {

        @NotNull
        public static final Banner INSTANCE = new Banner();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("displayType", "message", "iconUrl", "bannerTitle", UrlHandler.ACTION);
        public static final int $stable = 8;

        private Banner() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.Banner fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            ProductDetailsQuery.Action2 action2 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    insetBannerDisplayTypeA = InsetBannerDisplayType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    action2 = (ProductDetailsQuery.Action2) Adapters.b(Adapters.c(Action2.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new ProductDetailsQuery.Banner(insetBannerDisplayTypeA, str, str2, str3, action2);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.Banner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.getDisplayType());
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getMessage());
            writer.F1("iconUrl");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.getIconUrl());
            writer.F1("bannerTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.getBannerTitle());
            writer.F1(UrlHandler.ACTION);
            Adapters.b(Adapters.c(Action2.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getAction());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$BottomSheet;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$BottomSheet;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BottomSheet implements Adapter<ProductDetailsQuery.BottomSheet> {

        @NotNull
        public static final BottomSheet INSTANCE = new BottomSheet();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("bottomSheetTitle", "bottomSheetBody", "primaryCta", "secondaryCta", "showOnceOnly");
        public static final int $stable = 8;

        private BottomSheet() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.BottomSheet fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ProductDetailsQuery.PrimaryCta primaryCta = null;
            ProductDetailsQuery.SecondaryCta secondaryCta = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    primaryCta = (ProductDetailsQuery.PrimaryCta) Adapters.b(Adapters.c(PrimaryCta.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    secondaryCta = (ProductDetailsQuery.SecondaryCta) Adapters.b(Adapters.c(SecondaryCta.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "bottomSheetTitle");
                throw null;
            }
            if (str2 != null) {
                return new ProductDetailsQuery.BottomSheet(str, str2, primaryCta, secondaryCta, bool);
            }
            Assertions.a(reader, "bottomSheetBody");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.BottomSheet value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("bottomSheetTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getBottomSheetTitle());
            writer.F1("bottomSheetBody");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getBottomSheetBody());
            writer.F1("primaryCta");
            Adapters.b(Adapters.c(PrimaryCta.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getPrimaryCta());
            writer.F1("secondaryCta");
            Adapters.b(Adapters.c(SecondaryCta.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getSecondaryCta());
            writer.F1("showOnceOnly");
            Adapters.l.toJson(writer, customScalarAdapters, value.getShowOnceOnly());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$Button;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$Button;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button implements Adapter<ProductDetailsQuery.Button> {

        @NotNull
        public static final Button INSTANCE = new Button();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R(AnnotatedPrivateKey.LABEL, UrlHandler.ACTION, "style", "enabled");
        public static final int $stable = 8;

        private Button() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.Button fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ButtonStyle buttonStyle = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool != null) {
                return new ProductDetailsQuery.Button(str, str2, buttonStyle, bool.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.Button value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getLabel());
            writer.F1(UrlHandler.ACTION);
            Adapters.i.toJson(writer, customScalarAdapters, value.getAction());
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.getStyle());
            writer.F1("enabled");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.getEnabled()));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$CountryOfOrigin;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$CountryOfOrigin;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CountryOfOrigin implements Adapter<ProductDetailsQuery.CountryOfOrigin> {

        @NotNull
        public static final CountryOfOrigin INSTANCE = new CountryOfOrigin();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("url", TextBundle.TEXT_ENTRY, "altText");
        public static final int $stable = 8;

        private CountryOfOrigin() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.CountryOfOrigin fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str3 != null) {
                return new ProductDetailsQuery.CountryOfOrigin(str, str2, str3);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.CountryOfOrigin value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.getUrl());
            writer.F1(TextBundle.TEXT_ENTRY);
            nullableAdapter.toJson(writer, customScalarAdapters, value.getText());
            writer.F1("altText");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getAltText());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$CouponBannerTermsAndConditions;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$CouponBannerTermsAndConditions;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CouponBannerTermsAndConditions implements Adapter<ProductDetailsQuery.CouponBannerTermsAndConditions> {

        @NotNull
        public static final CouponBannerTermsAndConditions INSTANCE = new CouponBannerTermsAndConditions();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("url", "title");
        public static final int $stable = 8;

        private CouponBannerTermsAndConditions() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.CouponBannerTermsAndConditions fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "url");
                throw null;
            }
            if (str2 != null) {
                return new ProductDetailsQuery.CouponBannerTermsAndConditions(str, str2);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.CouponBannerTermsAndConditions value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getUrl());
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getTitle());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$Cta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$Cta;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cta implements Adapter<ProductDetailsQuery.Cta> {

        @NotNull
        public static final Cta INSTANCE = new Cta();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("ctaText", UrlHandler.ACTION);
        public static final int $stable = 8;

        private Cta() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.Cta fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductDetailsQuery.CtaText ctaText = null;
            ProductDetailsQuery.Action1 action1 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    ctaText = (ProductDetailsQuery.CtaText) Adapters.c(CtaText.INSTANCE, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    action1 = (ProductDetailsQuery.Action1) Adapters.c(Action1.INSTANCE, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (ctaText == null) {
                Assertions.a(reader, "ctaText");
                throw null;
            }
            if (action1 != null) {
                return new ProductDetailsQuery.Cta(ctaText, action1);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.Cta value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("ctaText");
            Adapters.c(CtaText.INSTANCE, false).toJson(writer, customScalarAdapters, value.getCtaText());
            writer.F1(UrlHandler.ACTION);
            Adapters.c(Action1.INSTANCE, false).toJson(writer, customScalarAdapters, value.getAction());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$CtaText;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$CtaText;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CtaText implements Adapter<ProductDetailsQuery.CtaText> {

        @NotNull
        public static final CtaText INSTANCE = new CtaText();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R(TextBundle.TEXT_ENTRY, "altText");
        public static final int $stable = 8;

        private CtaText() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.CtaText fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, TextBundle.TEXT_ENTRY);
                throw null;
            }
            if (str2 != null) {
                return new ProductDetailsQuery.CtaText(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.CtaText value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getText());
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getAltText());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$Data;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<ProductDetailsQuery.Data> {

        @NotNull
        public static final Data INSTANCE = new Data();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("productDetails", "productRatingsAndReviewsPreview");
        public static final int $stable = 8;

        private Data() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.Data fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductDetailsQuery.ProductDetails productDetails = null;
            ProductDetailsQuery.ProductRatingsAndReviewsPreview productRatingsAndReviewsPreview = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    productDetails = (ProductDetailsQuery.ProductDetails) Adapters.b(Adapters.c(ProductDetails.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new ProductDetailsQuery.Data(productDetails, productRatingsAndReviewsPreview);
                    }
                    productRatingsAndReviewsPreview = (ProductDetailsQuery.ProductRatingsAndReviewsPreview) Adapters.b(Adapters.c(ProductRatingsAndReviewsPreview.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.Data value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productDetails");
            Adapters.b(Adapters.c(ProductDetails.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getProductDetails());
            writer.F1("productRatingsAndReviewsPreview");
            Adapters.b(Adapters.c(ProductRatingsAndReviewsPreview.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getProductRatingsAndReviewsPreview());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$Feed;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$Feed;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Feed implements Adapter<ProductDetailsQuery.Feed> {

        @NotNull
        public static final Feed INSTANCE = new Feed();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("__typename");
        public static final int $stable = 8;

        private Feed() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.Feed fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            ProductDetailsQuery.OnActionableCard onActionableCardFromJson;
            ProductDetailsQuery.OnCouponBanner onCouponBannerFromJson;
            ProductDetailsQuery.OnFormattedBanner onFormattedBannerFromJson;
            ProductDetailsQuery.OnProductCard onProductCardFromJson;
            ProductDetailsQuery.OnInsetBanner onInsetBannerFromJson;
            ProductDetailsQuery.OnProductRatingsAndReviewsSummary onProductRatingsAndReviewsSummaryFromJson;
            ProductDetailsQuery.OnPromotionBanner onPromotionBannerFromJson;
            ProductDetailsQuery.OnFormattedContent onFormattedContentFromJson;
            ProductDetailsQuery.OnProductDisclaimer onProductDisclaimerFromJson;
            ProductDetailsQuery.OnProductOriginAndHealthInfo onProductOriginAndHealthInfoFromJson;
            ProductDetailsQuery.OnProductNutritionInfo onProductNutritionInfoFromJson;
            ProductDetailsQuery.OnProductDetailsMarketplace onProductDetailsMarketplaceFromJson;
            ProductDetailsQuery.OnHealthierHorizontalList onHealthierHorizontalListFromJson;
            ProductDetailsQuery.OnDividerCard onDividerCardFromJson;
            ProductDetailsQuery.OnFooter onFooterFromJson;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ProductDetailsQuery.OnProductHorizontalList onProductHorizontalListFromJson = null;
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("ActionableCard"), BooleanExpressions.d("includeActionableCard")))) {
                reader.o();
                onActionableCardFromJson = OnActionableCard.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onActionableCardFromJson = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CouponBanner"))) {
                reader.o();
                onCouponBannerFromJson = OnCouponBanner.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onCouponBannerFromJson = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("FormattedBanner"))) {
                reader.o();
                onFormattedBannerFromJson = OnFormattedBanner.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onFormattedBannerFromJson = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductCard"))) {
                reader.o();
                onProductCardFromJson = OnProductCard.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onProductCardFromJson = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("InsetBanner"))) {
                reader.o();
                onInsetBannerFromJson = OnInsetBanner.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onInsetBannerFromJson = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("ProductRatingsAndReviewsSummary"), BooleanExpressions.d("isRatingsAndReviewsSummaryEnabled")))) {
                reader.o();
                onProductRatingsAndReviewsSummaryFromJson = OnProductRatingsAndReviewsSummary.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onProductRatingsAndReviewsSummaryFromJson = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("PromotionBanner"))) {
                reader.o();
                onPromotionBannerFromJson = OnPromotionBanner.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onPromotionBannerFromJson = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("FormattedContent"))) {
                reader.o();
                onFormattedContentFromJson = OnFormattedContent.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onFormattedContentFromJson = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductDisclaimer"))) {
                reader.o();
                onProductDisclaimerFromJson = OnProductDisclaimer.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onProductDisclaimerFromJson = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductOriginAndHealthInfo"))) {
                reader.o();
                onProductOriginAndHealthInfoFromJson = OnProductOriginAndHealthInfo.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onProductOriginAndHealthInfoFromJson = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductNutritionInfo"))) {
                reader.o();
                onProductNutritionInfoFromJson = OnProductNutritionInfo.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onProductNutritionInfoFromJson = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductDetailsMarketplace"))) {
                reader.o();
                onProductDetailsMarketplaceFromJson = OnProductDetailsMarketplace.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onProductDetailsMarketplaceFromJson = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HealthierHorizontalList"))) {
                reader.o();
                onHealthierHorizontalListFromJson = OnHealthierHorizontalList.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onHealthierHorizontalListFromJson = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("DividerCard"))) {
                reader.o();
                onDividerCardFromJson = OnDividerCard.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onDividerCardFromJson = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("Footer"))) {
                reader.o();
                onFooterFromJson = OnFooter.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onFooterFromJson = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductHorizontalList"))) {
                reader.o();
                onProductHorizontalListFromJson = OnProductHorizontalList.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new ProductDetailsQuery.Feed(str, onActionableCardFromJson, onCouponBannerFromJson, onFormattedBannerFromJson, onProductCardFromJson, onInsetBannerFromJson, onProductRatingsAndReviewsSummaryFromJson, onPromotionBannerFromJson, onFormattedContentFromJson, onProductDisclaimerFromJson, onProductOriginAndHealthInfoFromJson, onProductNutritionInfoFromJson, onProductDetailsMarketplaceFromJson, onHealthierHorizontalListFromJson, onDividerCardFromJson, onFooterFromJson, onProductHorizontalListFromJson);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.Feed value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnActionableCard() != null) {
                OnActionableCard.INSTANCE.toJson(writer, customScalarAdapters, value.getOnActionableCard());
            }
            if (value.getOnCouponBanner() != null) {
                OnCouponBanner.INSTANCE.toJson(writer, customScalarAdapters, value.getOnCouponBanner());
            }
            if (value.getOnFormattedBanner() != null) {
                OnFormattedBanner.INSTANCE.toJson(writer, customScalarAdapters, value.getOnFormattedBanner());
            }
            if (value.getOnProductCard() != null) {
                OnProductCard.INSTANCE.toJson(writer, customScalarAdapters, value.getOnProductCard());
            }
            if (value.getOnInsetBanner() != null) {
                OnInsetBanner.INSTANCE.toJson(writer, customScalarAdapters, value.getOnInsetBanner());
            }
            if (value.getOnProductRatingsAndReviewsSummary() != null) {
                OnProductRatingsAndReviewsSummary.INSTANCE.toJson(writer, customScalarAdapters, value.getOnProductRatingsAndReviewsSummary());
            }
            if (value.getOnPromotionBanner() != null) {
                OnPromotionBanner.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPromotionBanner());
            }
            if (value.getOnFormattedContent() != null) {
                OnFormattedContent.INSTANCE.toJson(writer, customScalarAdapters, value.getOnFormattedContent());
            }
            if (value.getOnProductDisclaimer() != null) {
                OnProductDisclaimer.INSTANCE.toJson(writer, customScalarAdapters, value.getOnProductDisclaimer());
            }
            if (value.getOnProductOriginAndHealthInfo() != null) {
                OnProductOriginAndHealthInfo.INSTANCE.toJson(writer, customScalarAdapters, value.getOnProductOriginAndHealthInfo());
            }
            if (value.getOnProductNutritionInfo() != null) {
                OnProductNutritionInfo.INSTANCE.toJson(writer, customScalarAdapters, value.getOnProductNutritionInfo());
            }
            if (value.getOnProductDetailsMarketplace() != null) {
                OnProductDetailsMarketplace.INSTANCE.toJson(writer, customScalarAdapters, value.getOnProductDetailsMarketplace());
            }
            if (value.getOnHealthierHorizontalList() != null) {
                OnHealthierHorizontalList.INSTANCE.toJson(writer, customScalarAdapters, value.getOnHealthierHorizontalList());
            }
            if (value.getOnDividerCard() != null) {
                OnDividerCard.INSTANCE.toJson(writer, customScalarAdapters, value.getOnDividerCard());
            }
            if (value.getOnFooter() != null) {
                OnFooter.INSTANCE.toJson(writer, customScalarAdapters, value.getOnFooter());
            }
            if (value.getOnProductHorizontalList() != null) {
                OnProductHorizontalList.INSTANCE.toJson(writer, customScalarAdapters, value.getOnProductHorizontalList());
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$Footer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$Footer;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Footer implements Adapter<ProductDetailsQuery.Footer> {

        @NotNull
        public static final Footer INSTANCE = new Footer();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "linkUrl");
        public static final int $stable = 8;

        private Footer() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.Footer fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                throw null;
            }
            if (str3 != null) {
                return new ProductDetailsQuery.Footer(str, str2, str3);
            }
            Assertions.a(reader, "linkUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.Footer value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getTitle());
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getSubtitle());
            writer.F1("linkUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getLinkUrl());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$HealthStarRating;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$HealthStarRating;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HealthStarRating implements Adapter<ProductDetailsQuery.HealthStarRating> {

        @NotNull
        public static final HealthStarRating INSTANCE = new HealthStarRating();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("url", TextBundle.TEXT_ENTRY, "altText");
        public static final int $stable = 8;

        private HealthStarRating() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.HealthStarRating fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str3 != null) {
                return new ProductDetailsQuery.HealthStarRating(str, str2, str3);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.HealthStarRating value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.getUrl());
            writer.F1(TextBundle.TEXT_ENTRY);
            nullableAdapter.toJson(writer, customScalarAdapters, value.getText());
            writer.F1("altText");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getAltText());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$HealthStarRating1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$HealthStarRating1;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HealthStarRating1 implements Adapter<ProductDetailsQuery.HealthStarRating1> {

        @NotNull
        public static final HealthStarRating1 INSTANCE = new HealthStarRating1();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("url", TextBundle.TEXT_ENTRY, "altText");
        public static final int $stable = 8;

        private HealthStarRating1() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.HealthStarRating1 fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str3 != null) {
                return new ProductDetailsQuery.HealthStarRating1(str, str2, str3);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.HealthStarRating1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.getUrl());
            writer.F1(TextBundle.TEXT_ENTRY);
            nullableAdapter.toJson(writer, customScalarAdapters, value.getText());
            writer.F1("altText");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getAltText());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$HealthierOption;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$HealthierOption;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HealthierOption implements Adapter<ProductDetailsQuery.HealthierOption> {

        @NotNull
        public static final HealthierOption INSTANCE = new HealthierOption();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("productCard", "healthStarRating");
        public static final int $stable = 8;

        private HealthierOption() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.HealthierOption fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductDetailsQuery.ProductCard productCard = null;
            ProductDetailsQuery.HealthStarRating1 healthStarRating1 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    productCard = (ProductDetailsQuery.ProductCard) Adapters.c(ProductCard.INSTANCE, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    healthStarRating1 = (ProductDetailsQuery.HealthStarRating1) Adapters.b(Adapters.c(HealthStarRating1.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (productCard != null) {
                return new ProductDetailsQuery.HealthierOption(productCard, healthStarRating1);
            }
            Assertions.a(reader, "productCard");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.HealthierOption value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productCard");
            Adapters.c(ProductCard.INSTANCE, true).toJson(writer, customScalarAdapters, value.getProductCard());
            writer.F1("healthStarRating");
            Adapters.b(Adapters.c(HealthStarRating1.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getHealthStarRating());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$ImageList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$ImageList;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImageList implements Adapter<ProductDetailsQuery.ImageList> {

        @NotNull
        public static final ImageList INSTANCE = new ImageList();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("largeUrl", "altText");
        public static final int $stable = 8;

        private ImageList() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.ImageList fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new ProductDetailsQuery.ImageList(str, str2);
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.ImageList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("largeUrl");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.getLargeUrl());
            writer.F1("altText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.getAltText());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$Info;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$Info;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Info implements Adapter<ProductDetailsQuery.Info> {

        @NotNull
        public static final Info INSTANCE = new Info();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("title", "items", "footer");
        public static final int $stable = 8;

        private Info() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.Info fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            ProductDetailsQuery.Footer footer = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(Item.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    footer = (ProductDetailsQuery.Footer) Adapters.b(Adapters.c(Footer.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new ProductDetailsQuery.Info(str, arrayListFromJson, footer);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.Info value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getTitle());
            writer.F1("items");
            Adapters.a(Adapters.c(Item.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getItems());
            writer.F1("footer");
            Adapters.b(Adapters.c(Footer.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getFooter());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$Item;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<ProductDetailsQuery.Item> {

        @NotNull
        public static final Item INSTANCE = new Item();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("title", lqlqqlq.mmm006Dm006Dm, "imageUrl");
        public static final int $stable = 8;

        private Item() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.Item fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, lqlqqlq.mmm006Dm006Dm);
                throw null;
            }
            if (str3 != null) {
                return new ProductDetailsQuery.Item(str, str2, str3);
            }
            Assertions.a(reader, "imageUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.Item value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getTitle());
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getDescription());
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getImageUrl());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$Item1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$Item1;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item1 implements Adapter<ProductDetailsQuery.Item1> {

        @NotNull
        public static final Item1 INSTANCE = new Item1();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("__typename");
        public static final int $stable = 8;

        private Item1() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.Item1 fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductDetailsQuery.OnProductCard1 onProductCard1FromJson = null;
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("ProductCard"))) {
                reader.o();
                onProductCard1FromJson = OnProductCard1.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new ProductDetailsQuery.Item1(str, onProductCard1FromJson);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.Item1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnProductCard() != null) {
                OnProductCard1.INSTANCE.toJson(writer, customScalarAdapters, value.getOnProductCard());
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$Link;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$Link;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Link implements Adapter<ProductDetailsQuery.Link> {

        @NotNull
        public static final Link INSTANCE = new Link();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("url", TextBundle.TEXT_ENTRY);
        public static final int $stable = 8;

        private Link() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.Link fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "url");
                throw null;
            }
            if (str2 != null) {
                return new ProductDetailsQuery.Link(str, str2);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.Link value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getUrl());
            writer.F1(TextBundle.TEXT_ENTRY);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getText());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$LinkedInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$LinkedInfo;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkedInfo implements Adapter<ProductDetailsQuery.LinkedInfo> {

        @NotNull
        public static final LinkedInfo INSTANCE = new LinkedInfo();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("buttonLabel", "title", "content", "markdownContent", "links");
        public static final int $stable = 8;

        private LinkedInfo() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.LinkedInfo fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Link.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "buttonLabel");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "content");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new ProductDetailsQuery.LinkedInfo(str, str2, str3, str4, arrayListFromJson);
            }
            Assertions.a(reader, "links");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.LinkedInfo value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("buttonLabel");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getButtonLabel());
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getTitle());
            writer.F1("content");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getContent());
            writer.F1("markdownContent");
            Adapters.i.toJson(writer, customScalarAdapters, value.getMarkdownContent());
            writer.F1("links");
            Adapters.a(Adapters.c(Link.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getLinks());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$OnActionableCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnActionableCard;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnActionableCard implements Adapter<ProductDetailsQuery.OnActionableCard> {

        @NotNull
        public static final OnActionableCard INSTANCE = new OnActionableCard();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("image", "altText", "cardHeight", "link", "analytics", "_excluded");
        public static final int $stable = 8;

        private OnActionableCard() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.OnActionableCard fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            CardHeight cardHeightA = null;
            String str3 = null;
            TealiumAnalytics tealiumAnalytics = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    cardHeightA = CardHeight_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    tealiumAnalytics = (TealiumAnalytics) d.k(customScalarAdapters, au.com.woolworths.shop.graphql.type.TealiumAnalytics.f11963a, reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "image");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "altText");
                throw null;
            }
            if (cardHeightA == null) {
                Assertions.a(reader, "cardHeight");
                throw null;
            }
            if (str3 != null) {
                return new ProductDetailsQuery.OnActionableCard(str, str2, cardHeightA, str3, tealiumAnalytics, bool);
            }
            Assertions.a(reader, "link");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.OnActionableCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("image");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getImage());
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getAltText());
            writer.F1("cardHeight");
            CardHeight_ResponseAdapter.b(writer, customScalarAdapters, value.getCardHeight());
            writer.F1("link");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getLink());
            writer.F1("analytics");
            Adapters.b(customScalarAdapters.e(au.com.woolworths.shop.graphql.type.TealiumAnalytics.f11963a)).toJson(writer, customScalarAdapters, value.getAnalytics());
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.get_excluded());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$OnCouponBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnCouponBanner;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCouponBanner implements Adapter<ProductDetailsQuery.OnCouponBanner> {

        @NotNull
        public static final OnCouponBanner INSTANCE = new OnCouponBanner();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("couponBannerColorTheme", "couponBannerCouponCode", "couponBannerDescription", "couponBannerImage", "couponBannerMinimumSpend", "couponBannerTermsAndConditions");
        public static final int $stable = 8;

        private OnCouponBanner() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.OnCouponBanner fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CouponBannerColorTheme couponBannerColorThemeA = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ProductDetailsQuery.CouponBannerTermsAndConditions couponBannerTermsAndConditions = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    couponBannerColorThemeA = CouponBannerColorTheme_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    couponBannerTermsAndConditions = (ProductDetailsQuery.CouponBannerTermsAndConditions) Adapters.c(CouponBannerTermsAndConditions.INSTANCE, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (couponBannerColorThemeA == null) {
                Assertions.a(reader, "couponBannerColorTheme");
                throw null;
            }
            if (str == null) {
                Assertions.a(reader, "couponBannerCouponCode");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "couponBannerDescription");
                throw null;
            }
            if (str4 == null) {
                Assertions.a(reader, "couponBannerMinimumSpend");
                throw null;
            }
            if (couponBannerTermsAndConditions != null) {
                return new ProductDetailsQuery.OnCouponBanner(couponBannerColorThemeA, str, str2, str3, str4, couponBannerTermsAndConditions);
            }
            Assertions.a(reader, "couponBannerTermsAndConditions");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.OnCouponBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("couponBannerColorTheme");
            CouponBannerColorTheme_ResponseAdapter.b(writer, customScalarAdapters, value.getCouponBannerColorTheme());
            writer.F1("couponBannerCouponCode");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getCouponBannerCouponCode());
            writer.F1("couponBannerDescription");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getCouponBannerDescription());
            writer.F1("couponBannerImage");
            Adapters.i.toJson(writer, customScalarAdapters, value.getCouponBannerImage());
            writer.F1("couponBannerMinimumSpend");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getCouponBannerMinimumSpend());
            writer.F1("couponBannerTermsAndConditions");
            Adapters.c(CouponBannerTermsAndConditions.INSTANCE, false).toJson(writer, customScalarAdapters, value.getCouponBannerTermsAndConditions());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$OnDividerCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnDividerCard;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnDividerCard implements Adapter<ProductDetailsQuery.OnDividerCard> {

        @NotNull
        public static final OnDividerCard INSTANCE = new OnDividerCard();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("ignored");
        public static final int $stable = 8;

        private OnDividerCard() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.OnDividerCard fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
            }
            return new ProductDetailsQuery.OnDividerCard(bool);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.OnDividerCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("ignored");
            Adapters.l.toJson(writer, customScalarAdapters, value.getIgnored());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$OnFooter;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnFooter;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnFooter implements Adapter<ProductDetailsQuery.OnFooter> {

        @NotNull
        public static final OnFooter INSTANCE = new OnFooter();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("buttons");
        public static final int $stable = 8;

        private OnFooter() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.OnFooter fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                arrayListFromJson = Adapters.a(Adapters.b(Adapters.c(Button.INSTANCE, false))).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new ProductDetailsQuery.OnFooter(arrayListFromJson);
            }
            Assertions.a(reader, "buttons");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.OnFooter value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("buttons");
            Adapters.a(Adapters.b(Adapters.c(Button.INSTANCE, false))).toJson(writer, customScalarAdapters, value.getButtons());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$OnFormattedBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnFormattedBanner;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnFormattedBanner implements Adapter<ProductDetailsQuery.OnFormattedBanner> {

        @NotNull
        public static final OnFormattedBanner INSTANCE = new OnFormattedBanner();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("hasIcon", "content", "style");
        public static final int $stable = 8;

        private OnFormattedBanner() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.OnFormattedBanner fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            String str = null;
            FormattedBannerStyle formattedBannerStyleA = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    formattedBannerStyleA = FormattedBannerStyle_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (bool == null) {
                Assertions.a(reader, "hasIcon");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (str == null) {
                Assertions.a(reader, "content");
                throw null;
            }
            if (formattedBannerStyleA != null) {
                return new ProductDetailsQuery.OnFormattedBanner(zBooleanValue, str, formattedBannerStyleA);
            }
            Assertions.a(reader, "style");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.OnFormattedBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("hasIcon");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.getHasIcon()));
            writer.F1("content");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getContent());
            writer.F1("style");
            FormattedBannerStyle value2 = value.getStyle();
            Intrinsics.h(value2, "value");
            writer.v0(value2.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$OnFormattedContent;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnFormattedContent;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnFormattedContent implements Adapter<ProductDetailsQuery.OnFormattedContent> {

        @NotNull
        public static final OnFormattedContent INSTANCE = new OnFormattedContent();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("formattedContentTitle", "content", "framedContent", "isCollapsable");
        public static final int $stable = 8;

        private OnFormattedContent() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.OnFormattedContent fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "formattedContentTitle");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "content");
                throw null;
            }
            if (bool != null) {
                return new ProductDetailsQuery.OnFormattedContent(str, str2, str3, bool.booleanValue());
            }
            Assertions.a(reader, "isCollapsable");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.OnFormattedContent value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("formattedContentTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getFormattedContentTitle());
            writer.F1("content");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getContent());
            writer.F1("framedContent");
            Adapters.i.toJson(writer, customScalarAdapters, value.getFramedContent());
            writer.F1("isCollapsable");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.isCollapsable()));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$OnHealthierHorizontalList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnHealthierHorizontalList;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHealthierHorizontalList implements Adapter<ProductDetailsQuery.OnHealthierHorizontalList> {

        @NotNull
        public static final OnHealthierHorizontalList INSTANCE = new OnHealthierHorizontalList();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "linkedInfo", "healthierOptions");
        public static final int $stable = 8;

        private OnHealthierHorizontalList() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.OnHealthierHorizontalList fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ProductDetailsQuery.LinkedInfo linkedInfo = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    linkedInfo = (ProductDetailsQuery.LinkedInfo) Adapters.b(Adapters.c(LinkedInfo.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(HealthierOption.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new ProductDetailsQuery.OnHealthierHorizontalList(str, str2, linkedInfo, arrayListFromJson);
            }
            Assertions.a(reader, "healthierOptions");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.OnHealthierHorizontalList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getTitle());
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.getSubtitle());
            writer.F1("linkedInfo");
            Adapters.b(Adapters.c(LinkedInfo.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getLinkedInfo());
            writer.F1("healthierOptions");
            Adapters.a(Adapters.c(HealthierOption.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getHealthierOptions());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$OnInsetBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnInsetBanner;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnInsetBanner implements Adapter<ProductDetailsQuery.OnInsetBanner> {

        @NotNull
        public static final OnInsetBanner INSTANCE = new OnInsetBanner();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("displayType", "message", "bannerTitle", "iconUrl", UrlHandler.ACTION);
        public static final int $stable = 8;

        private OnInsetBanner() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.OnInsetBanner fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            ProductDetailsQuery.Action action = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    insetBannerDisplayTypeA = InsetBannerDisplayType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    action = (ProductDetailsQuery.Action) Adapters.b(Adapters.c(Action.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new ProductDetailsQuery.OnInsetBanner(insetBannerDisplayTypeA, str, str2, str3, action);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.OnInsetBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.getDisplayType());
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getMessage());
            writer.F1("bannerTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.getBannerTitle());
            writer.F1("iconUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.getIconUrl());
            writer.F1(UrlHandler.ACTION);
            Adapters.b(Adapters.c(Action.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getAction());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$OnProductCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnProductCard;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard implements Adapter<ProductDetailsQuery.OnProductCard> {

        @NotNull
        public static final OnProductCard INSTANCE = new OnProductCard();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("__typename");
        public static final int $stable = 8;

        private OnProductCard() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.OnProductCard fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            au.com.woolworths.graphql.common.fragment.ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductDetailsQuery.OnProductCard(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.OnProductCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.get__typename());
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.getProductCard());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$OnProductCard1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnProductCard1;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard1 implements Adapter<ProductDetailsQuery.OnProductCard1> {

        @NotNull
        public static final OnProductCard1 INSTANCE = new OnProductCard1();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("__typename");
        public static final int $stable = 8;

        private OnProductCard1() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.OnProductCard1 fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            au.com.woolworths.graphql.common.fragment.ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductDetailsQuery.OnProductCard1(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.OnProductCard1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.get__typename());
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.getProductCard());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$OnProductDetailsMarketplace;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnProductDetailsMarketplace;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductDetailsMarketplace implements Adapter<ProductDetailsQuery.OnProductDetailsMarketplace> {

        @NotNull
        public static final OnProductDetailsMarketplace INSTANCE = new OnProductDetailsMarketplace();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("imageUrl", "marketplaceTitle", "dispatchNote", "sellerName", "brandName", "channel", "facet", "info", "bottomSheet");
        public static final int $stable = 8;

        private OnProductDetailsMarketplace() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.OnProductDetailsMarketplace fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            ProductListChannelType productListChannelTypeA = null;
            ProductListFacetType productListFacetTypeA = null;
            ProductDetailsQuery.Info info = null;
            ProductDetailsQuery.BottomSheet bottomSheet = null;
            while (true) {
                switch (reader.o2(RESPONSE_NAMES)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        productListChannelTypeA = ProductListChannelType_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 6:
                        productListFacetTypeA = ProductListFacetType_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 7:
                        info = (ProductDetailsQuery.Info) Adapters.b(Adapters.c(Info.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        bottomSheet = (ProductDetailsQuery.BottomSheet) Adapters.b(Adapters.c(BottomSheet.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "imageUrl");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "marketplaceTitle");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "dispatchNote");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "sellerName");
                            throw null;
                        }
                        if (str5 == null) {
                            Assertions.a(reader, "brandName");
                            throw null;
                        }
                        if (productListChannelTypeA == null) {
                            Assertions.a(reader, "channel");
                            throw null;
                        }
                        if (productListFacetTypeA != null) {
                            return new ProductDetailsQuery.OnProductDetailsMarketplace(str, str2, str3, str4, str5, productListChannelTypeA, productListFacetTypeA, info, bottomSheet);
                        }
                        Assertions.a(reader, "facet");
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.OnProductDetailsMarketplace value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getImageUrl());
            writer.F1("marketplaceTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getMarketplaceTitle());
            writer.F1("dispatchNote");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getDispatchNote());
            writer.F1("sellerName");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getSellerName());
            writer.F1("brandName");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getBrandName());
            writer.F1("channel");
            ProductListChannelType_ResponseAdapter.b(writer, customScalarAdapters, value.getChannel());
            writer.F1("facet");
            ProductListFacetType_ResponseAdapter.b(writer, customScalarAdapters, value.getFacet());
            writer.F1("info");
            Adapters.b(Adapters.c(Info.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getInfo());
            writer.F1("bottomSheet");
            Adapters.b(Adapters.c(BottomSheet.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getBottomSheet());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$OnProductDisclaimer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnProductDisclaimer;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductDisclaimer implements Adapter<ProductDetailsQuery.OnProductDisclaimer> {

        @NotNull
        public static final OnProductDisclaimer INSTANCE = new OnProductDisclaimer();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("content");
        public static final int $stable = 8;

        private OnProductDisclaimer() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.OnProductDisclaimer fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ProductDetailsQuery.OnProductDisclaimer(str);
            }
            Assertions.a(reader, "content");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.OnProductDisclaimer value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("content");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getContent());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$OnProductHorizontalList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnProductHorizontalList;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductHorizontalList implements Adapter<ProductDetailsQuery.OnProductHorizontalList> {

        @NotNull
        public static final OnProductHorizontalList INSTANCE = new OnProductHorizontalList();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "deepLink", "actionTitle", "items");
        public static final int $stable = 8;

        private OnProductHorizontalList() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.OnProductHorizontalList fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Item1.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new ProductDetailsQuery.OnProductHorizontalList(str, str2, str3, str4, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.OnProductHorizontalList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getTitle());
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.getSubtitle());
            writer.F1("deepLink");
            nullableAdapter.toJson(writer, customScalarAdapters, value.getDeepLink());
            writer.F1("actionTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.getActionTitle());
            writer.F1("items");
            Adapters.a(Adapters.c(Item1.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getItems());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$OnProductNutritionInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnProductNutritionInfo;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductNutritionInfo implements Adapter<ProductDetailsQuery.OnProductNutritionInfo> {

        @NotNull
        public static final OnProductNutritionInfo INSTANCE = new OnProductNutritionInfo();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("productNutritionTitle", "servingsPerPack", "servingSize", "bottomCaption", "tableHeaderRow", "tableRows");
        public static final int $stable = 8;

        private OnProductNutritionInfo() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.OnProductNutritionInfo fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ArrayList arrayListFromJson = null;
            ArrayList arrayListFromJson2 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    arrayListFromJson2 = Adapters.a(Adapters.a(Adapters.f13493a)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "productNutritionTitle");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "servingsPerPack");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "servingSize");
                throw null;
            }
            if (str4 == null) {
                Assertions.a(reader, "bottomCaption");
                throw null;
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "tableHeaderRow");
                throw null;
            }
            if (arrayListFromJson2 != null) {
                return new ProductDetailsQuery.OnProductNutritionInfo(str, str2, str3, str4, arrayListFromJson, arrayListFromJson2);
            }
            Assertions.a(reader, "tableRows");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.OnProductNutritionInfo value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productNutritionTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getProductNutritionTitle());
            writer.F1("servingsPerPack");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getServingsPerPack());
            writer.F1("servingSize");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getServingSize());
            writer.F1("bottomCaption");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getBottomCaption());
            writer.F1("tableHeaderRow");
            Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.getTableHeaderRow());
            writer.F1("tableRows");
            Adapters.a(Adapters.a(adapters$StringAdapter$1)).toJson(writer, customScalarAdapters, value.getTableRows());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$OnProductOriginAndHealthInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnProductOriginAndHealthInfo;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductOriginAndHealthInfo implements Adapter<ProductDetailsQuery.OnProductOriginAndHealthInfo> {

        @NotNull
        public static final OnProductOriginAndHealthInfo INSTANCE = new OnProductOriginAndHealthInfo();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("countryOfOrigin", "healthStarRating");
        public static final int $stable = 8;

        private OnProductOriginAndHealthInfo() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.OnProductOriginAndHealthInfo fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductDetailsQuery.CountryOfOrigin countryOfOrigin = null;
            ProductDetailsQuery.HealthStarRating healthStarRating = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    countryOfOrigin = (ProductDetailsQuery.CountryOfOrigin) Adapters.b(Adapters.c(CountryOfOrigin.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new ProductDetailsQuery.OnProductOriginAndHealthInfo(countryOfOrigin, healthStarRating);
                    }
                    healthStarRating = (ProductDetailsQuery.HealthStarRating) Adapters.b(Adapters.c(HealthStarRating.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.OnProductOriginAndHealthInfo value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("countryOfOrigin");
            Adapters.b(Adapters.c(CountryOfOrigin.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getCountryOfOrigin());
            writer.F1("healthStarRating");
            Adapters.b(Adapters.c(HealthStarRating.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getHealthStarRating());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$OnProductRatingsAndReviewsSummary;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnProductRatingsAndReviewsSummary;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductRatingsAndReviewsSummary implements Adapter<ProductDetailsQuery.OnProductRatingsAndReviewsSummary> {

        @NotNull
        public static final OnProductRatingsAndReviewsSummary INSTANCE = new OnProductRatingsAndReviewsSummary();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("averageRatings", "displayRatings", "maximumRating", "ratingText", "cta");
        public static final int $stable = 8;

        private OnProductRatingsAndReviewsSummary() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.OnProductRatingsAndReviewsSummary fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d = null;
            Double d2 = null;
            Integer num = null;
            ProductDetailsQuery.RatingText ratingText = null;
            ProductDetailsQuery.Cta cta = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    d = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    d2 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    ratingText = (ProductDetailsQuery.RatingText) Adapters.c(RatingText.INSTANCE, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    cta = (ProductDetailsQuery.Cta) Adapters.b(Adapters.c(Cta.INSTANCE, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (d == null) {
                Assertions.a(reader, "averageRatings");
                throw null;
            }
            double dDoubleValue = d.doubleValue();
            if (d2 == null) {
                Assertions.a(reader, "displayRatings");
                throw null;
            }
            double dDoubleValue2 = d2.doubleValue();
            if (num == null) {
                Assertions.a(reader, "maximumRating");
                throw null;
            }
            int iIntValue = num.intValue();
            if (ratingText != null) {
                return new ProductDetailsQuery.OnProductRatingsAndReviewsSummary(dDoubleValue, dDoubleValue2, iIntValue, ratingText, cta);
            }
            Assertions.a(reader, "ratingText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.OnProductRatingsAndReviewsSummary value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("averageRatings");
            Adapters$DoubleAdapter$1 adapters$DoubleAdapter$1 = Adapters.c;
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.getAverageRatings()));
            writer.F1("displayRatings");
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.getDisplayRatings()));
            writer.F1("maximumRating");
            Adapters.b.toJson(writer, customScalarAdapters, Integer.valueOf(value.getMaximumRating()));
            writer.F1("ratingText");
            Adapters.c(RatingText.INSTANCE, false).toJson(writer, customScalarAdapters, value.getRatingText());
            writer.F1("cta");
            Adapters.b(Adapters.c(Cta.INSTANCE, false)).toJson(writer, customScalarAdapters, value.getCta());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$OnPromotionBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnPromotionBanner;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPromotionBanner implements Adapter<ProductDetailsQuery.OnPromotionBanner> {

        @NotNull
        public static final OnPromotionBanner INSTANCE = new OnPromotionBanner();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("banner", "promotionContent");
        public static final int $stable = 8;

        private OnPromotionBanner() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.OnPromotionBanner fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductDetailsQuery.Banner banner = null;
            ProductDetailsQuery.PromotionContent promotionContent = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    banner = (ProductDetailsQuery.Banner) Adapters.c(Banner.INSTANCE, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    promotionContent = (ProductDetailsQuery.PromotionContent) Adapters.b(Adapters.c(PromotionContent.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (banner != null) {
                return new ProductDetailsQuery.OnPromotionBanner(banner, promotionContent);
            }
            Assertions.a(reader, "banner");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.OnPromotionBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("banner");
            Adapters.c(Banner.INSTANCE, false).toJson(writer, customScalarAdapters, value.getBanner());
            writer.F1("promotionContent");
            Adapters.b(Adapters.c(PromotionContent.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getPromotionContent());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$OnPromotionMarkdownContent;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnPromotionMarkdownContent;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPromotionMarkdownContent implements Adapter<ProductDetailsQuery.OnPromotionMarkdownContent> {

        @NotNull
        public static final OnPromotionMarkdownContent INSTANCE = new OnPromotionMarkdownContent();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("promotionMarkdownTitle", "promotionMarkdownText");
        public static final int $stable = 8;

        private OnPromotionMarkdownContent() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.OnPromotionMarkdownContent fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "promotionMarkdownTitle");
                throw null;
            }
            if (str2 != null) {
                return new ProductDetailsQuery.OnPromotionMarkdownContent(str, str2);
            }
            Assertions.a(reader, "promotionMarkdownText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.OnPromotionMarkdownContent value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("promotionMarkdownTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getPromotionMarkdownTitle());
            writer.F1("promotionMarkdownText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getPromotionMarkdownText());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$OnRatingsAndReviewsPreviewCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnRatingsAndReviewsPreviewCta;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRatingsAndReviewsPreviewCta implements Adapter<ProductDetailsQuery.OnRatingsAndReviewsPreviewCta> {

        @NotNull
        public static final OnRatingsAndReviewsPreviewCta INSTANCE = new OnRatingsAndReviewsPreviewCta();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("__typename");
        public static final int $stable = 8;

        private OnRatingsAndReviewsPreviewCta() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.OnRatingsAndReviewsPreviewCta fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            RatingsAndReviewsPreviewCta ratingsAndReviewsPreviewCtaA = RatingsAndReviewsPreviewCtaImpl_ResponseAdapter.RatingsAndReviewsPreviewCta.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductDetailsQuery.OnRatingsAndReviewsPreviewCta(str, ratingsAndReviewsPreviewCtaA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.OnRatingsAndReviewsPreviewCta value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.get__typename());
            List list = RatingsAndReviewsPreviewCtaImpl_ResponseAdapter.RatingsAndReviewsPreviewCta.f23790a;
            RatingsAndReviewsPreviewCtaImpl_ResponseAdapter.RatingsAndReviewsPreviewCta.b(writer, customScalarAdapters, value.getRatingsAndReviewsPreviewCta());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$OnRatingsAndReviewsPreviewHeader;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnRatingsAndReviewsPreviewHeader;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRatingsAndReviewsPreviewHeader implements Adapter<ProductDetailsQuery.OnRatingsAndReviewsPreviewHeader> {

        @NotNull
        public static final OnRatingsAndReviewsPreviewHeader INSTANCE = new OnRatingsAndReviewsPreviewHeader();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("__typename");
        public static final int $stable = 8;

        private OnRatingsAndReviewsPreviewHeader() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.OnRatingsAndReviewsPreviewHeader fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            RatingsAndReviewsPreviewHeader ratingsAndReviewsPreviewHeaderA = RatingsAndReviewsPreviewHeaderImpl_ResponseAdapter.RatingsAndReviewsPreviewHeader.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductDetailsQuery.OnRatingsAndReviewsPreviewHeader(str, ratingsAndReviewsPreviewHeaderA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.OnRatingsAndReviewsPreviewHeader value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.get__typename());
            List list = RatingsAndReviewsPreviewHeaderImpl_ResponseAdapter.RatingsAndReviewsPreviewHeader.f23792a;
            RatingsAndReviewsPreviewHeaderImpl_ResponseAdapter.RatingsAndReviewsPreviewHeader.b(writer, customScalarAdapters, value.getRatingsAndReviewsPreviewHeader());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$OnRatingsAndReviewsRatingsDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnRatingsAndReviewsRatingsDetails;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRatingsAndReviewsRatingsDetails implements Adapter<ProductDetailsQuery.OnRatingsAndReviewsRatingsDetails> {

        @NotNull
        public static final OnRatingsAndReviewsRatingsDetails INSTANCE = new OnRatingsAndReviewsRatingsDetails();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("__typename");
        public static final int $stable = 8;

        private OnRatingsAndReviewsRatingsDetails() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.OnRatingsAndReviewsRatingsDetails fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            RatingsAndReviewsRatingsDetails ratingsAndReviewsRatingsDetailsA = RatingsAndReviewsRatingsDetailsImpl_ResponseAdapter.RatingsAndReviewsRatingsDetails.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductDetailsQuery.OnRatingsAndReviewsRatingsDetails(str, ratingsAndReviewsRatingsDetailsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.OnRatingsAndReviewsRatingsDetails value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.get__typename());
            List list = RatingsAndReviewsRatingsDetailsImpl_ResponseAdapter.RatingsAndReviewsRatingsDetails.f23815a;
            RatingsAndReviewsRatingsDetailsImpl_ResponseAdapter.RatingsAndReviewsRatingsDetails.b(writer, customScalarAdapters, value.getRatingsAndReviewsRatingsDetails());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$OnRatingsAndReviewsReviewDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$OnRatingsAndReviewsReviewDetails;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRatingsAndReviewsReviewDetails implements Adapter<ProductDetailsQuery.OnRatingsAndReviewsReviewDetails> {

        @NotNull
        public static final OnRatingsAndReviewsReviewDetails INSTANCE = new OnRatingsAndReviewsReviewDetails();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("__typename");
        public static final int $stable = 8;

        private OnRatingsAndReviewsReviewDetails() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.OnRatingsAndReviewsReviewDetails fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            RatingsAndReviewsReviewDetails ratingsAndReviewsReviewDetailsA = RatingsAndReviewsReviewDetailsImpl_ResponseAdapter.RatingsAndReviewsReviewDetails.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductDetailsQuery.OnRatingsAndReviewsReviewDetails(str, ratingsAndReviewsReviewDetailsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.OnRatingsAndReviewsReviewDetails value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.get__typename());
            List list = RatingsAndReviewsReviewDetailsImpl_ResponseAdapter.RatingsAndReviewsReviewDetails.f23831a;
            RatingsAndReviewsReviewDetailsImpl_ResponseAdapter.RatingsAndReviewsReviewDetails.b(writer, customScalarAdapters, value.getRatingsAndReviewsReviewDetails());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$PrimaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$PrimaryCta;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrimaryCta implements Adapter<ProductDetailsQuery.PrimaryCta> {

        @NotNull
        public static final PrimaryCta INSTANCE = new PrimaryCta();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q(AnnotatedPrivateKey.LABEL);
        public static final int $stable = 8;

        private PrimaryCta() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.PrimaryCta fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ProductDetailsQuery.PrimaryCta(str);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.PrimaryCta value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getLabel());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$ProductCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$ProductCard;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductCard implements Adapter<ProductDetailsQuery.ProductCard> {

        @NotNull
        public static final ProductCard INSTANCE = new ProductCard();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("__typename");
        public static final int $stable = 8;

        private ProductCard() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.ProductCard fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            au.com.woolworths.graphql.common.fragment.ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductDetailsQuery.ProductCard(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.ProductCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.get__typename());
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.getProductCard());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$ProductDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$ProductDetails;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductDetails implements Adapter<ProductDetailsQuery.ProductDetails> {

        @NotNull
        public static final ProductDetails INSTANCE = new ProductDetails();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R("feed", "imageList");
        public static final int $stable = 8;

        private ProductDetails() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.ProductDetails fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            ArrayList arrayListFromJson2 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    arrayListFromJson = Adapters.a(Adapters.c(Feed.INSTANCE, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson2 = Adapters.a(Adapters.b(Adapters.c(ImageList.INSTANCE, false))).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "feed");
                throw null;
            }
            if (arrayListFromJson2 != null) {
                return new ProductDetailsQuery.ProductDetails(arrayListFromJson, arrayListFromJson2);
            }
            Assertions.a(reader, "imageList");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.ProductDetails value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("feed");
            Adapters.a(Adapters.c(Feed.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getFeed());
            writer.F1("imageList");
            Adapters.a(Adapters.b(Adapters.c(ImageList.INSTANCE, false))).toJson(writer, customScalarAdapters, value.getImageList());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$ProductRatingsAndReviewsPreview;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$ProductRatingsAndReviewsPreview;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductRatingsAndReviewsPreview implements Adapter<ProductDetailsQuery.ProductRatingsAndReviewsPreview> {

        @NotNull
        public static final ProductRatingsAndReviewsPreview INSTANCE = new ProductRatingsAndReviewsPreview();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("sections");
        public static final int $stable = 8;

        private ProductRatingsAndReviewsPreview() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.ProductRatingsAndReviewsPreview fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Section.INSTANCE, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new ProductDetailsQuery.ProductRatingsAndReviewsPreview(arrayListFromJson);
            }
            Assertions.a(reader, "sections");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.ProductRatingsAndReviewsPreview value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("sections");
            Adapters.a(Adapters.c(Section.INSTANCE, true)).toJson(writer, customScalarAdapters, value.getSections());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$PromotionContent;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$PromotionContent;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PromotionContent implements Adapter<ProductDetailsQuery.PromotionContent> {

        @NotNull
        public static final PromotionContent INSTANCE = new PromotionContent();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("__typename");
        public static final int $stable = 8;

        private PromotionContent() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.PromotionContent fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductDetailsQuery.OnPromotionMarkdownContent onPromotionMarkdownContentFromJson = null;
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("PromotionMarkdownContent"))) {
                reader.o();
                onPromotionMarkdownContentFromJson = OnPromotionMarkdownContent.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new ProductDetailsQuery.PromotionContent(str, onPromotionMarkdownContentFromJson);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.PromotionContent value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnPromotionMarkdownContent() != null) {
                OnPromotionMarkdownContent.INSTANCE.toJson(writer, customScalarAdapters, value.getOnPromotionMarkdownContent());
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$RatingText;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$RatingText;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RatingText implements Adapter<ProductDetailsQuery.RatingText> {

        @NotNull
        public static final RatingText INSTANCE = new RatingText();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.R(TextBundle.TEXT_ENTRY, "altText");
        public static final int $stable = 8;

        private RatingText() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.RatingText fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(RESPONSE_NAMES);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, TextBundle.TEXT_ENTRY);
                throw null;
            }
            if (str2 != null) {
                return new ProductDetailsQuery.RatingText(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.RatingText value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getText());
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.getAltText());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$SecondaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$SecondaryCta;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SecondaryCta implements Adapter<ProductDetailsQuery.SecondaryCta> {

        @NotNull
        public static final SecondaryCta INSTANCE = new SecondaryCta();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q(AnnotatedPrivateKey.LABEL);
        public static final int $stable = 8;

        private SecondaryCta() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.SecondaryCta fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ProductDetailsQuery.SecondaryCta(str);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.SecondaryCta value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.getLabel());
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/woolworths/product/details/adapter/ProductDetailsQuery_ResponseAdapter$Section;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/product/details/ProductDetailsQuery$Section;", "<init>", "()V", "RESPONSE_NAMES", "", "", "getRESPONSE_NAMES", "()Ljava/util/List;", "fromJson", "reader", "Lcom/apollographql/apollo/api/json/JsonReader;", "customScalarAdapters", "Lcom/apollographql/apollo/api/CustomScalarAdapters;", "toJson", "", "writer", "Lcom/apollographql/apollo/api/json/JsonWriter;", "value", "shop-product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Section implements Adapter<ProductDetailsQuery.Section> {

        @NotNull
        public static final Section INSTANCE = new Section();

        @NotNull
        private static final List<String> RESPONSE_NAMES = CollectionsKt.Q("__typename");
        public static final int $stable = 8;

        private Section() {
        }

        @NotNull
        public final List<String> getRESPONSE_NAMES() {
            return RESPONSE_NAMES;
        }

        @Override // com.apollographql.apollo.api.Adapter
        @NotNull
        public ProductDetailsQuery.Section fromJson(@NotNull JsonReader reader, @NotNull CustomScalarAdapters customScalarAdapters) {
            ProductDetailsQuery.OnRatingsAndReviewsPreviewHeader onRatingsAndReviewsPreviewHeaderFromJson;
            ProductDetailsQuery.OnRatingsAndReviewsRatingsDetails onRatingsAndReviewsRatingsDetailsFromJson;
            ProductDetailsQuery.OnRatingsAndReviewsReviewDetails onRatingsAndReviewsReviewDetailsFromJson;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ProductDetailsQuery.OnRatingsAndReviewsPreviewCta onRatingsAndReviewsPreviewCtaFromJson = null;
            String str = null;
            while (reader.o2(RESPONSE_NAMES) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RatingsAndReviewsPreviewHeader"))) {
                reader.o();
                onRatingsAndReviewsPreviewHeaderFromJson = OnRatingsAndReviewsPreviewHeader.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onRatingsAndReviewsPreviewHeaderFromJson = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RatingsAndReviewsRatingsDetails"))) {
                reader.o();
                onRatingsAndReviewsRatingsDetailsFromJson = OnRatingsAndReviewsRatingsDetails.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onRatingsAndReviewsRatingsDetailsFromJson = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RatingsAndReviewsReviewDetails"))) {
                reader.o();
                onRatingsAndReviewsReviewDetailsFromJson = OnRatingsAndReviewsReviewDetails.INSTANCE.fromJson(reader, customScalarAdapters);
            } else {
                onRatingsAndReviewsReviewDetailsFromJson = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RatingsAndReviewsPreviewCta"))) {
                reader.o();
                onRatingsAndReviewsPreviewCtaFromJson = OnRatingsAndReviewsPreviewCta.INSTANCE.fromJson(reader, customScalarAdapters);
            }
            return new ProductDetailsQuery.Section(str, onRatingsAndReviewsPreviewHeaderFromJson, onRatingsAndReviewsRatingsDetailsFromJson, onRatingsAndReviewsReviewDetailsFromJson, onRatingsAndReviewsPreviewCtaFromJson);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public void toJson(@NotNull JsonWriter writer, @NotNull CustomScalarAdapters customScalarAdapters, @NotNull ProductDetailsQuery.Section value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.get__typename());
            if (value.getOnRatingsAndReviewsPreviewHeader() != null) {
                OnRatingsAndReviewsPreviewHeader.INSTANCE.toJson(writer, customScalarAdapters, value.getOnRatingsAndReviewsPreviewHeader());
            }
            if (value.getOnRatingsAndReviewsRatingsDetails() != null) {
                OnRatingsAndReviewsRatingsDetails.INSTANCE.toJson(writer, customScalarAdapters, value.getOnRatingsAndReviewsRatingsDetails());
            }
            if (value.getOnRatingsAndReviewsReviewDetails() != null) {
                OnRatingsAndReviewsReviewDetails.INSTANCE.toJson(writer, customScalarAdapters, value.getOnRatingsAndReviewsReviewDetails());
            }
            if (value.getOnRatingsAndReviewsPreviewCta() != null) {
                OnRatingsAndReviewsPreviewCta.INSTANCE.toJson(writer, customScalarAdapters, value.getOnRatingsAndReviewsPreviewCta());
            }
        }
    }

    private ProductDetailsQuery_ResponseAdapter() {
    }
}
