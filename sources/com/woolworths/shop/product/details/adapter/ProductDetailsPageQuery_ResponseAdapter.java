package com.woolworths.shop.product.details.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.graphql.TealiumAnalytics;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.graphql.common.fragment.ProductCardImpl_ResponseAdapter;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import au.com.woolworths.sdui.shop.fragment.BasicCoreRow;
import au.com.woolworths.sdui.shop.fragment.BasicCoreRowImpl_ResponseAdapter;
import au.com.woolworths.sdui.shop.fragment.CoreRowUI;
import au.com.woolworths.sdui.shop.fragment.CoreRowUIImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.CoreAlertStyle;
import au.com.woolworths.shop.graphql.type.CoreBroadcastBannerStyle;
import au.com.woolworths.shop.graphql.type.CouponBannerColorTheme;
import au.com.woolworths.shop.graphql.type.ParagraphTextItemType;
import au.com.woolworths.shop.graphql.type.RoundelImagePriority;
import au.com.woolworths.shop.graphql.type.adapter.ActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ButtonStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CardHeight_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CoreAlertStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CoreBroadcastBannerStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CouponBannerColorTheme_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ParagraphTextItemType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.RoundelImagePriority_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.Adapters$DoubleAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpression;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.woolworths.shop.product.details.ProductDetailsPageQuery;
import com.woolworths.shop.productcard.data.fragment.ProductTile;
import com.woolworths.shop.productcard.data.fragment.ProductTileImpl_ResponseAdapter;
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

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b^\bÇ\u0002\u0018\u00002\u00020\u0001:]\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^¨\u0006_"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter;", "", "Data", "ProductDetailsPage", "Analytics", "ImpressionAnalytics", "Item", "OnProductDetailsCouponBanner", "ProductDetailsCouponBanner", "CouponBannerTermsAndConditions", "OnActionableCard", "OnBasicCoreBroadcastBanner", "BroadcastBannerUI", "Icon", "OnHostedIcon", "BroadcastBannerAction", "Analytics1", "OnProductDetailsImages", "ProductImage", "ImageGalleryClickAnalytics", "ImageGalleryScrollAnalytics", "ImageGalleryCloseAnalytics", "ImageGalleryThumbnailClickAnalytics", "ProductDetailsThumbnailClickAnalytics", "RoundelImage", "OnBasicInsetAlert", "InsetAlertUI", "InsetAlertAction", "Analytics2", "OnProductDetailsProductPanel", "RatingsAndReviewsSummary", "OnProductRatingsAndReviewsSummary", "RatingText", "Cta", "CtaText", "Action", "Product", "OnProductCard", "OnProductOriginAndHealthInfo", "CountryOfOrigin", "OnProductDetailsRowAccordion", "OpenActionAnalytics", "CloseActionAnalytics", "RowUI", "LeadingAsset", "OnHostedIcon1", "OnCoreIcon", "ExpandedContent", "OnParagraphTextItem", "OnProductDetailsRowAccordionProductList", "ProductDetailsRowAccordionProductListTextItem", "OnParagraphTextItem1", "ProductDetailsRowAccordionProductListCta", "OnContentCta", "OnCtaClickAnalytics", "ProductDetailsRowAccordionProductList", "OnHorizontalList", "Item1", "OnProductCard1", "OnProductTile", "OnProductDetailsRowLink", "RowUI1", "LeadingAsset1", "OnHostedIcon2", "OnCoreIcon1", "LinkContent", "OnParagraphTextItem2", "OnProductNutritionInfo", "OnInfoSection", "Item2", "Footer", "OpenActionAnalytics1", "OnHorizontalList1", "Item3", "OnProductCard2", "OnProductTile1", "OnProductDetailsRatingsAndReviewsPreview", "RatingsAndReviewsPreview", "Section", "OnRatingsAndReviewsPreviewHeader", "OnRatingsAndReviewsRatingsDetails", "OnRatingsAndReviewsReviewDetails", "OnRatingsAndReviewsPreviewCta", "OnProductDetailsCoreRow", "RowDetails", "OnBasicCoreRow", "OnCoreRowUI", "OnChatEntryCardV3", "ChatEntryCardAction", "Analytics3", "Footer1", "FooterMessage", "ProductDetailsAction", "ButtonAction", "Analytics4", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProductDetailsPageQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$Action;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Action;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action implements Adapter<ProductDetailsPageQuery.Action> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action f23508a = new Action();
        public static final List b = CollectionsKt.R("type", UrlHandler.ACTION, "id");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActionType actionTypeA = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
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
                return new ProductDetailsPageQuery.Action(actionTypeA, str, str2);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.Action value = (ProductDetailsPageQuery.Action) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.f23409a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Analytics;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<ProductDetailsPageQuery.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f23509a = new Analytics();
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
                return new ProductDetailsPageQuery.Analytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.Analytics value = (ProductDetailsPageQuery.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23410a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$Analytics1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Analytics1;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics1 implements Adapter<ProductDetailsPageQuery.Analytics1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics1 f23510a = new Analytics1();
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
                return new ProductDetailsPageQuery.Analytics1(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.Analytics1 value = (ProductDetailsPageQuery.Analytics1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23411a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$Analytics2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Analytics2;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics2 implements Adapter<ProductDetailsPageQuery.Analytics2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics2 f23511a = new Analytics2();
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
                return new ProductDetailsPageQuery.Analytics2(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.Analytics2 value = (ProductDetailsPageQuery.Analytics2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23412a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$Analytics3;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Analytics3;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics3 implements Adapter<ProductDetailsPageQuery.Analytics3> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics3 f23512a = new Analytics3();
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
                return new ProductDetailsPageQuery.Analytics3(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.Analytics3 value = (ProductDetailsPageQuery.Analytics3) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23413a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$Analytics4;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Analytics4;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics4 implements Adapter<ProductDetailsPageQuery.Analytics4> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics4 f23513a = new Analytics4();
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
                return new ProductDetailsPageQuery.Analytics4(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.Analytics4 value = (ProductDetailsPageQuery.Analytics4) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23414a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$BroadcastBannerAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$BroadcastBannerAction;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BroadcastBannerAction implements Adapter<ProductDetailsPageQuery.BroadcastBannerAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final BroadcastBannerAction f23514a = new BroadcastBannerAction();
        public static final List b = CollectionsKt.R("id", "type", UrlHandler.ACTION, "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ActionType actionTypeA = null;
            String str2 = null;
            ProductDetailsPageQuery.Analytics1 analytics1 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    analytics1 = (ProductDetailsPageQuery.Analytics1) Adapters.b(Adapters.c(Analytics1.f23510a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str2 != null) {
                return new ProductDetailsPageQuery.BroadcastBannerAction(str, actionTypeA, str2, analytics1);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.BroadcastBannerAction value = (ProductDetailsPageQuery.BroadcastBannerAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.f23415a);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics1.f23510a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$BroadcastBannerUI;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$BroadcastBannerUI;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BroadcastBannerUI implements Adapter<ProductDetailsPageQuery.BroadcastBannerUI> {

        /* renamed from: a, reason: collision with root package name */
        public static final BroadcastBannerUI f23515a = new BroadcastBannerUI();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "style", BarcodePickDeserializer.FIELD_ICON);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            CoreBroadcastBannerStyle coreBroadcastBannerStyleA = null;
            ProductDetailsPageQuery.Icon icon = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    coreBroadcastBannerStyleA = CoreBroadcastBannerStyle_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    icon = (ProductDetailsPageQuery.Icon) Adapters.c(Icon.f23528a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (coreBroadcastBannerStyleA == null) {
                Assertions.a(reader, "style");
                throw null;
            }
            if (icon != null) {
                return new ProductDetailsPageQuery.BroadcastBannerUI(str, str2, coreBroadcastBannerStyleA, icon);
            }
            Assertions.a(reader, BarcodePickDeserializer.FIELD_ICON);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.BroadcastBannerUI value = (ProductDetailsPageQuery.BroadcastBannerUI) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23416a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            CoreBroadcastBannerStyle_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1(BarcodePickDeserializer.FIELD_ICON);
            Adapters.c(Icon.f23528a, true).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$ButtonAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ButtonAction;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonAction implements Adapter<ProductDetailsPageQuery.ButtonAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final ButtonAction f23516a = new ButtonAction();
        public static final List b = CollectionsKt.R("id", UrlHandler.ACTION, "type", "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ActionType actionTypeA = null;
            ProductDetailsPageQuery.Analytics4 analytics4 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    analytics4 = (ProductDetailsPageQuery.Analytics4) Adapters.b(Adapters.c(Analytics4.f23513a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 == null) {
                Assertions.a(reader, UrlHandler.ACTION);
                throw null;
            }
            if (actionTypeA != null) {
                return new ProductDetailsPageQuery.ButtonAction(str, str2, actionTypeA, analytics4);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.ButtonAction value = (ProductDetailsPageQuery.ButtonAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.f23417a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics4.f23513a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$ChatEntryCardAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ChatEntryCardAction;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ChatEntryCardAction implements Adapter<ProductDetailsPageQuery.ChatEntryCardAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final ChatEntryCardAction f23517a = new ChatEntryCardAction();
        public static final List b = CollectionsKt.R("id", UrlHandler.ACTION, "type", "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ActionType actionTypeA = null;
            ProductDetailsPageQuery.Analytics3 analytics3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    analytics3 = (ProductDetailsPageQuery.Analytics3) Adapters.b(Adapters.c(Analytics3.f23512a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 == null) {
                Assertions.a(reader, UrlHandler.ACTION);
                throw null;
            }
            if (actionTypeA != null) {
                return new ProductDetailsPageQuery.ChatEntryCardAction(str, str2, actionTypeA, analytics3);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.ChatEntryCardAction value = (ProductDetailsPageQuery.ChatEntryCardAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.f23418a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics3.f23512a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$CloseActionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$CloseActionAnalytics;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CloseActionAnalytics implements Adapter<ProductDetailsPageQuery.CloseActionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final CloseActionAnalytics f23518a = new CloseActionAnalytics();
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
                return new ProductDetailsPageQuery.CloseActionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.CloseActionAnalytics value = (ProductDetailsPageQuery.CloseActionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23419a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$CountryOfOrigin;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$CountryOfOrigin;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CountryOfOrigin implements Adapter<ProductDetailsPageQuery.CountryOfOrigin> {

        /* renamed from: a, reason: collision with root package name */
        public static final CountryOfOrigin f23519a = new CountryOfOrigin();
        public static final List b = CollectionsKt.R("url", TextBundle.TEXT_ENTRY, "altText");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
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
                return new ProductDetailsPageQuery.CountryOfOrigin(str, str2, str3);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.CountryOfOrigin value = (ProductDetailsPageQuery.CountryOfOrigin) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f23420a);
            writer.F1(TextBundle.TEXT_ENTRY);
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("altText");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$CouponBannerTermsAndConditions;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$CouponBannerTermsAndConditions;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CouponBannerTermsAndConditions implements Adapter<ProductDetailsPageQuery.CouponBannerTermsAndConditions> {

        /* renamed from: a, reason: collision with root package name */
        public static final CouponBannerTermsAndConditions f23520a = new CouponBannerTermsAndConditions();
        public static final List b = CollectionsKt.R("url", "title", "accessibilityLabel");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "url");
                throw null;
            }
            if (str2 != null) {
                return new ProductDetailsPageQuery.CouponBannerTermsAndConditions(str, str2, str3);
            }
            Assertions.a(reader, "title");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.CouponBannerTermsAndConditions value = (ProductDetailsPageQuery.CouponBannerTermsAndConditions) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23421a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("accessibilityLabel");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$Cta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Cta;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cta implements Adapter<ProductDetailsPageQuery.Cta> {

        /* renamed from: a, reason: collision with root package name */
        public static final Cta f23521a = new Cta();
        public static final List b = CollectionsKt.R("ctaText", UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductDetailsPageQuery.CtaText ctaText = null;
            ProductDetailsPageQuery.Action action = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    ctaText = (ProductDetailsPageQuery.CtaText) Adapters.c(CtaText.f23522a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    action = (ProductDetailsPageQuery.Action) Adapters.c(Action.f23508a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (ctaText == null) {
                Assertions.a(reader, "ctaText");
                throw null;
            }
            if (action != null) {
                return new ProductDetailsPageQuery.Cta(ctaText, action);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.Cta value = (ProductDetailsPageQuery.Cta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("ctaText");
            Adapters.c(CtaText.f23522a, false).toJson(writer, customScalarAdapters, value.f23422a);
            writer.F1(UrlHandler.ACTION);
            Adapters.c(Action.f23508a, false).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$CtaText;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$CtaText;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CtaText implements Adapter<ProductDetailsPageQuery.CtaText> {

        /* renamed from: a, reason: collision with root package name */
        public static final CtaText f23522a = new CtaText();
        public static final List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "altText");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
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
                return new ProductDetailsPageQuery.CtaText(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.CtaText value = (ProductDetailsPageQuery.CtaText) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23423a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Data;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<ProductDetailsPageQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f23523a = new Data();
        public static final List b = CollectionsKt.Q("productDetailsPage");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductDetailsPageQuery.ProductDetailsPage productDetailsPage = null;
            while (reader.o2(b) == 0) {
                productDetailsPage = (ProductDetailsPageQuery.ProductDetailsPage) Adapters.c(ProductDetailsPage.f23587a, false).fromJson(reader, customScalarAdapters);
            }
            if (productDetailsPage != null) {
                return new ProductDetailsPageQuery.Data(productDetailsPage);
            }
            Assertions.a(reader, "productDetailsPage");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.Data value = (ProductDetailsPageQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productDetailsPage");
            Adapters.c(ProductDetailsPage.f23587a, false).toJson(writer, customScalarAdapters, value.f23424a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$ExpandedContent;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ExpandedContent;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExpandedContent implements Adapter<ProductDetailsPageQuery.ExpandedContent> {

        /* renamed from: a, reason: collision with root package name */
        public static final ExpandedContent f23524a = new ExpandedContent();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ProductDetailsPageQuery.OnParagraphTextItem onParagraphTextItemA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ProductDetailsPageQuery.OnProductDetailsRowAccordionProductList onProductDetailsRowAccordionProductListA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ParagraphTextItem"))) {
                reader.o();
                onParagraphTextItemA = OnParagraphTextItem.a(reader, customScalarAdapters);
            } else {
                onParagraphTextItemA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductDetailsRowAccordionProductList"))) {
                reader.o();
                onProductDetailsRowAccordionProductListA = OnProductDetailsRowAccordionProductList.a(reader, customScalarAdapters);
            }
            return new ProductDetailsPageQuery.ExpandedContent(str, onParagraphTextItemA, onProductDetailsRowAccordionProductListA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.ExpandedContent value = (ProductDetailsPageQuery.ExpandedContent) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23425a);
            ProductDetailsPageQuery.OnParagraphTextItem onParagraphTextItem = value.b;
            if (onParagraphTextItem != null) {
                OnParagraphTextItem.b(writer, customScalarAdapters, onParagraphTextItem);
            }
            ProductDetailsPageQuery.OnProductDetailsRowAccordionProductList onProductDetailsRowAccordionProductList = value.c;
            if (onProductDetailsRowAccordionProductList != null) {
                OnProductDetailsRowAccordionProductList.b(writer, customScalarAdapters, onProductDetailsRowAccordionProductList);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$Footer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Footer;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Footer implements Adapter<ProductDetailsPageQuery.Footer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Footer f23525a = new Footer();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "linkUrl");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
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
                return new ProductDetailsPageQuery.Footer(str, str2, str3);
            }
            Assertions.a(reader, "linkUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.Footer value = (ProductDetailsPageQuery.Footer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23426a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("linkUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$Footer1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Footer1;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Footer1 implements Adapter<ProductDetailsPageQuery.Footer1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Footer1 f23526a = new Footer1();
        public static final List b = CollectionsKt.R("footerMessage", "productDetailsActions");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductDetailsPageQuery.FooterMessage footerMessage = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    footerMessage = (ProductDetailsPageQuery.FooterMessage) Adapters.b(Adapters.c(FooterMessage.f23527a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(ProductDetailsAction.f23585a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new ProductDetailsPageQuery.Footer1(footerMessage, arrayListFromJson);
            }
            Assertions.a(reader, "productDetailsActions");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.Footer1 value = (ProductDetailsPageQuery.Footer1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("footerMessage");
            Adapters.b(Adapters.c(FooterMessage.f23527a, false)).toJson(writer, customScalarAdapters, value.f23427a);
            writer.F1("productDetailsActions");
            Adapters.a(Adapters.c(ProductDetailsAction.f23585a, false)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$FooterMessage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$FooterMessage;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FooterMessage implements Adapter<ProductDetailsPageQuery.FooterMessage> {

        /* renamed from: a, reason: collision with root package name */
        public static final FooterMessage f23527a = new FooterMessage();
        public static final List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "altText");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
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
                return new ProductDetailsPageQuery.FooterMessage(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.FooterMessage value = (ProductDetailsPageQuery.FooterMessage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23428a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$Icon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Icon;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Icon implements Adapter<ProductDetailsPageQuery.Icon> {

        /* renamed from: a, reason: collision with root package name */
        public static final Icon f23528a = new Icon();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductDetailsPageQuery.OnHostedIcon onHostedIconA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("HostedIcon"))) {
                reader.o();
                onHostedIconA = OnHostedIcon.a(reader, customScalarAdapters);
            }
            return new ProductDetailsPageQuery.Icon(str, onHostedIconA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.Icon value = (ProductDetailsPageQuery.Icon) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23429a);
            ProductDetailsPageQuery.OnHostedIcon onHostedIcon = value.b;
            if (onHostedIcon != null) {
                OnHostedIcon.b(writer, customScalarAdapters, onHostedIcon);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$ImageGalleryClickAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ImageGalleryClickAnalytics;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImageGalleryClickAnalytics implements Adapter<ProductDetailsPageQuery.ImageGalleryClickAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImageGalleryClickAnalytics f23529a = new ImageGalleryClickAnalytics();
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
                return new ProductDetailsPageQuery.ImageGalleryClickAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.ImageGalleryClickAnalytics value = (ProductDetailsPageQuery.ImageGalleryClickAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23430a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$ImageGalleryCloseAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ImageGalleryCloseAnalytics;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImageGalleryCloseAnalytics implements Adapter<ProductDetailsPageQuery.ImageGalleryCloseAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImageGalleryCloseAnalytics f23530a = new ImageGalleryCloseAnalytics();
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
                return new ProductDetailsPageQuery.ImageGalleryCloseAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.ImageGalleryCloseAnalytics value = (ProductDetailsPageQuery.ImageGalleryCloseAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23431a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$ImageGalleryScrollAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ImageGalleryScrollAnalytics;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImageGalleryScrollAnalytics implements Adapter<ProductDetailsPageQuery.ImageGalleryScrollAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImageGalleryScrollAnalytics f23531a = new ImageGalleryScrollAnalytics();
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
                return new ProductDetailsPageQuery.ImageGalleryScrollAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.ImageGalleryScrollAnalytics value = (ProductDetailsPageQuery.ImageGalleryScrollAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23432a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$ImageGalleryThumbnailClickAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ImageGalleryThumbnailClickAnalytics;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImageGalleryThumbnailClickAnalytics implements Adapter<ProductDetailsPageQuery.ImageGalleryThumbnailClickAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImageGalleryThumbnailClickAnalytics f23532a = new ImageGalleryThumbnailClickAnalytics();
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
                return new ProductDetailsPageQuery.ImageGalleryThumbnailClickAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.ImageGalleryThumbnailClickAnalytics value = (ProductDetailsPageQuery.ImageGalleryThumbnailClickAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23433a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$ImpressionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ImpressionAnalytics;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImpressionAnalytics implements Adapter<ProductDetailsPageQuery.ImpressionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImpressionAnalytics f23533a = new ImpressionAnalytics();
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
                return new ProductDetailsPageQuery.ImpressionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.ImpressionAnalytics value = (ProductDetailsPageQuery.ImpressionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23434a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$InsetAlertAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$InsetAlertAction;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InsetAlertAction implements Adapter<ProductDetailsPageQuery.InsetAlertAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final InsetAlertAction f23534a = new InsetAlertAction();
        public static final List b = CollectionsKt.R("id", "type", UrlHandler.ACTION, "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ActionType actionTypeA = null;
            String str2 = null;
            ProductDetailsPageQuery.Analytics2 analytics2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    analytics2 = (ProductDetailsPageQuery.Analytics2) Adapters.b(Adapters.c(Analytics2.f23511a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str2 != null) {
                return new ProductDetailsPageQuery.InsetAlertAction(str, actionTypeA, str2, analytics2);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.InsetAlertAction value = (ProductDetailsPageQuery.InsetAlertAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.f23435a);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics2.f23511a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$InsetAlertUI;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$InsetAlertUI;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InsetAlertUI implements Adapter<ProductDetailsPageQuery.InsetAlertUI> {

        /* renamed from: a, reason: collision with root package name */
        public static final InsetAlertUI f23535a = new InsetAlertUI();
        public static final List b = CollectionsKt.R("title", lqlqqlq.mmm006Dm006Dm, "style");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            CoreAlertStyle coreAlertStyleA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    coreAlertStyleA = CoreAlertStyle_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (coreAlertStyleA != null) {
                return new ProductDetailsPageQuery.InsetAlertUI(coreAlertStyleA, str, str2);
            }
            Assertions.a(reader, "style");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.InsetAlertUI value = (ProductDetailsPageQuery.InsetAlertUI) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f23436a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            CoreAlertStyle_ResponseAdapter.b(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Item;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<ProductDetailsPageQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f23536a = new Item();
        public static final List b = CollectionsKt.Q("__typename");

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ProductDetailsPageQuery.OnProductDetailsCouponBanner onProductDetailsCouponBannerA;
            ProductDetailsPageQuery.OnActionableCard onActionableCardA;
            ProductDetailsPageQuery.OnBasicCoreBroadcastBanner onBasicCoreBroadcastBannerA;
            ProductDetailsPageQuery.OnProductDetailsImages onProductDetailsImagesA;
            ProductDetailsPageQuery.OnBasicInsetAlert onBasicInsetAlertA;
            ProductDetailsPageQuery.OnProductDetailsProductPanel onProductDetailsProductPanelA;
            ProductDetailsPageQuery.OnProductOriginAndHealthInfo onProductOriginAndHealthInfoA;
            ProductDetailsPageQuery.OnProductDetailsRowAccordion onProductDetailsRowAccordionA;
            ProductDetailsPageQuery.OnProductDetailsRowLink onProductDetailsRowLinkA;
            ProductDetailsPageQuery.OnHorizontalList1 onHorizontalList1A;
            ProductDetailsPageQuery.OnProductDetailsRatingsAndReviewsPreview onProductDetailsRatingsAndReviewsPreviewA;
            byte b2;
            ProductDetailsPageQuery.OnProductDetailsCoreRow onProductDetailsCoreRowA;
            ProductDetailsPageQuery.OnChatEntryCardV3 onChatEntryCardV3A;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("ProductDetailsCouponBanner"), BooleanExpressions.d("isEverydayMarketPdpUpliftEnabled")))) {
                reader.o();
                onProductDetailsCouponBannerA = OnProductDetailsCouponBanner.a(reader, customScalarAdapters);
            } else {
                onProductDetailsCouponBannerA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ActionableCard"))) {
                reader.o();
                onActionableCardA = OnActionableCard.a(reader, customScalarAdapters);
            } else {
                onActionableCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("BasicCoreBroadcastBanner"))) {
                reader.o();
                onBasicCoreBroadcastBannerA = OnBasicCoreBroadcastBanner.a(reader, customScalarAdapters);
            } else {
                onBasicCoreBroadcastBannerA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductDetailsImages"))) {
                reader.o();
                onProductDetailsImagesA = OnProductDetailsImages.a(reader, customScalarAdapters);
            } else {
                onProductDetailsImagesA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("BasicInsetAlert"))) {
                reader.o();
                onBasicInsetAlertA = OnBasicInsetAlert.a(reader, customScalarAdapters);
            } else {
                onBasicInsetAlertA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductDetailsProductPanel"))) {
                reader.o();
                onProductDetailsProductPanelA = OnProductDetailsProductPanel.a(reader, customScalarAdapters);
            } else {
                onProductDetailsProductPanelA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductOriginAndHealthInfo"))) {
                reader.o();
                onProductOriginAndHealthInfoA = OnProductOriginAndHealthInfo.a(reader, customScalarAdapters);
            } else {
                onProductOriginAndHealthInfoA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductDetailsRowAccordion"))) {
                reader.o();
                onProductDetailsRowAccordionA = OnProductDetailsRowAccordion.a(reader, customScalarAdapters);
            } else {
                onProductDetailsRowAccordionA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductDetailsRowLink"))) {
                reader.o();
                onProductDetailsRowLinkA = OnProductDetailsRowLink.a(reader, customScalarAdapters);
            } else {
                onProductDetailsRowLinkA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HorizontalList"))) {
                reader.o();
                onHorizontalList1A = OnHorizontalList1.a(reader, customScalarAdapters);
            } else {
                onHorizontalList1A = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("ProductDetailsRatingsAndReviewsPreview"), BooleanExpressions.d("isRatingsAndReviewsPreviewEnabled")))) {
                reader.o();
                onProductDetailsRatingsAndReviewsPreviewA = OnProductDetailsRatingsAndReviewsPreview.a(reader, customScalarAdapters);
            } else {
                onProductDetailsRatingsAndReviewsPreviewA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("ProductDetailsCoreRow"), BooleanExpressions.d("isEverydayMarketPdpUpliftEnabled")))) {
                reader.o();
                onProductDetailsCoreRowA = OnProductDetailsCoreRow.a(reader, customScalarAdapters);
                b2 = false;
            } else {
                b2 = false;
                onProductDetailsCoreRowA = null;
            }
            BooleanExpression.Element elementC = BooleanExpressions.c("ChatEntryCardV3");
            BooleanExpression.Element elementD = BooleanExpressions.d("includeChatEntryCard");
            byte b3 = b2;
            BooleanExpression[] booleanExpressionArr = new BooleanExpression[2];
            booleanExpressionArr[b3 == true ? 1 : 0] = elementC;
            booleanExpressionArr[1] = elementD;
            if (d.C(set2, set, null, str, BooleanExpressions.a(booleanExpressionArr))) {
                reader.o();
                onChatEntryCardV3A = OnChatEntryCardV3.a(reader, customScalarAdapters);
            } else {
                onChatEntryCardV3A = null;
            }
            return new ProductDetailsPageQuery.Item(str, onProductDetailsCouponBannerA, onActionableCardA, onBasicCoreBroadcastBannerA, onProductDetailsImagesA, onBasicInsetAlertA, onProductDetailsProductPanelA, onProductOriginAndHealthInfoA, onProductDetailsRowAccordionA, onProductDetailsRowLinkA, onHorizontalList1A, onProductDetailsRatingsAndReviewsPreviewA, onProductDetailsCoreRowA, onChatEntryCardV3A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.Item value = (ProductDetailsPageQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23437a);
            ProductDetailsPageQuery.OnProductDetailsCouponBanner onProductDetailsCouponBanner = value.b;
            if (onProductDetailsCouponBanner != null) {
                OnProductDetailsCouponBanner.b(writer, customScalarAdapters, onProductDetailsCouponBanner);
            }
            ProductDetailsPageQuery.OnActionableCard onActionableCard = value.c;
            if (onActionableCard != null) {
                OnActionableCard.b(writer, customScalarAdapters, onActionableCard);
            }
            ProductDetailsPageQuery.OnBasicCoreBroadcastBanner onBasicCoreBroadcastBanner = value.d;
            if (onBasicCoreBroadcastBanner != null) {
                OnBasicCoreBroadcastBanner.b(writer, customScalarAdapters, onBasicCoreBroadcastBanner);
            }
            ProductDetailsPageQuery.OnProductDetailsImages onProductDetailsImages = value.e;
            if (onProductDetailsImages != null) {
                OnProductDetailsImages.b(writer, customScalarAdapters, onProductDetailsImages);
            }
            ProductDetailsPageQuery.OnBasicInsetAlert onBasicInsetAlert = value.f;
            if (onBasicInsetAlert != null) {
                OnBasicInsetAlert.b(writer, customScalarAdapters, onBasicInsetAlert);
            }
            ProductDetailsPageQuery.OnProductDetailsProductPanel onProductDetailsProductPanel = value.g;
            if (onProductDetailsProductPanel != null) {
                OnProductDetailsProductPanel.b(writer, customScalarAdapters, onProductDetailsProductPanel);
            }
            ProductDetailsPageQuery.OnProductOriginAndHealthInfo onProductOriginAndHealthInfo = value.h;
            if (onProductOriginAndHealthInfo != null) {
                OnProductOriginAndHealthInfo.b(writer, customScalarAdapters, onProductOriginAndHealthInfo);
            }
            ProductDetailsPageQuery.OnProductDetailsRowAccordion onProductDetailsRowAccordion = value.i;
            if (onProductDetailsRowAccordion != null) {
                OnProductDetailsRowAccordion.b(writer, customScalarAdapters, onProductDetailsRowAccordion);
            }
            ProductDetailsPageQuery.OnProductDetailsRowLink onProductDetailsRowLink = value.j;
            if (onProductDetailsRowLink != null) {
                OnProductDetailsRowLink.b(writer, customScalarAdapters, onProductDetailsRowLink);
            }
            ProductDetailsPageQuery.OnHorizontalList1 onHorizontalList1 = value.k;
            if (onHorizontalList1 != null) {
                OnHorizontalList1.b(writer, customScalarAdapters, onHorizontalList1);
            }
            ProductDetailsPageQuery.OnProductDetailsRatingsAndReviewsPreview onProductDetailsRatingsAndReviewsPreview = value.l;
            if (onProductDetailsRatingsAndReviewsPreview != null) {
                OnProductDetailsRatingsAndReviewsPreview.b(writer, customScalarAdapters, onProductDetailsRatingsAndReviewsPreview);
            }
            ProductDetailsPageQuery.OnProductDetailsCoreRow onProductDetailsCoreRow = value.m;
            if (onProductDetailsCoreRow != null) {
                OnProductDetailsCoreRow.b(writer, customScalarAdapters, onProductDetailsCoreRow);
            }
            ProductDetailsPageQuery.OnChatEntryCardV3 onChatEntryCardV3 = value.n;
            if (onChatEntryCardV3 != null) {
                OnChatEntryCardV3.b(writer, customScalarAdapters, onChatEntryCardV3);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$Item1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Item1;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item1 implements Adapter<ProductDetailsPageQuery.Item1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item1 f23537a = new Item1();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ProductDetailsPageQuery.OnProductCard1 onProductCard1A;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ProductDetailsPageQuery.OnProductTile onProductTileA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("ProductCard"), new BooleanExpression.Not(BooleanExpressions.d("isProductTileUpliftEnabled"))))) {
                reader.o();
                onProductCard1A = OnProductCard1.a(reader, customScalarAdapters);
            } else {
                onProductCard1A = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("ProductTile"), BooleanExpressions.d("isProductTileUpliftEnabled")))) {
                reader.o();
                onProductTileA = OnProductTile.a(reader, customScalarAdapters);
            }
            return new ProductDetailsPageQuery.Item1(str, onProductCard1A, onProductTileA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.Item1 value = (ProductDetailsPageQuery.Item1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23438a);
            ProductDetailsPageQuery.OnProductCard1 onProductCard1 = value.b;
            if (onProductCard1 != null) {
                OnProductCard1.b(writer, customScalarAdapters, onProductCard1);
            }
            ProductDetailsPageQuery.OnProductTile onProductTile = value.c;
            if (onProductTile != null) {
                OnProductTile.b(writer, customScalarAdapters, onProductTile);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$Item2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Item2;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item2 implements Adapter<ProductDetailsPageQuery.Item2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item2 f23538a = new Item2();
        public static final List b = CollectionsKt.R("title", lqlqqlq.mmm006Dm006Dm, "imageUrl");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
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
                return new ProductDetailsPageQuery.Item2(str, str2, str3);
            }
            Assertions.a(reader, "imageUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.Item2 value = (ProductDetailsPageQuery.Item2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23439a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$Item3;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Item3;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item3 implements Adapter<ProductDetailsPageQuery.Item3> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item3 f23539a = new Item3();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ProductDetailsPageQuery.OnProductCard2 onProductCard2A;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ProductDetailsPageQuery.OnProductTile1 onProductTile1A = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("ProductCard"), new BooleanExpression.Not(BooleanExpressions.d("isProductTileUpliftEnabled"))))) {
                reader.o();
                onProductCard2A = OnProductCard2.a(reader, customScalarAdapters);
            } else {
                onProductCard2A = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("ProductTile"), BooleanExpressions.d("isProductTileUpliftEnabled")))) {
                reader.o();
                onProductTile1A = OnProductTile1.a(reader, customScalarAdapters);
            }
            return new ProductDetailsPageQuery.Item3(str, onProductCard2A, onProductTile1A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.Item3 value = (ProductDetailsPageQuery.Item3) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23440a);
            ProductDetailsPageQuery.OnProductCard2 onProductCard2 = value.b;
            if (onProductCard2 != null) {
                OnProductCard2.b(writer, customScalarAdapters, onProductCard2);
            }
            ProductDetailsPageQuery.OnProductTile1 onProductTile1 = value.c;
            if (onProductTile1 != null) {
                OnProductTile1.b(writer, customScalarAdapters, onProductTile1);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$LeadingAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$LeadingAsset;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LeadingAsset implements Adapter<ProductDetailsPageQuery.LeadingAsset> {

        /* renamed from: a, reason: collision with root package name */
        public static final LeadingAsset f23540a = new LeadingAsset();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ProductDetailsPageQuery.OnHostedIcon1 onHostedIcon1A;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ProductDetailsPageQuery.OnCoreIcon onCoreIconA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HostedIcon"))) {
                reader.o();
                onHostedIcon1A = OnHostedIcon1.a(reader, customScalarAdapters);
            } else {
                onHostedIcon1A = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CoreIcon"))) {
                reader.o();
                onCoreIconA = OnCoreIcon.a(reader, customScalarAdapters);
            }
            return new ProductDetailsPageQuery.LeadingAsset(str, onHostedIcon1A, onCoreIconA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.LeadingAsset value = (ProductDetailsPageQuery.LeadingAsset) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23441a);
            ProductDetailsPageQuery.OnHostedIcon1 onHostedIcon1 = value.b;
            if (onHostedIcon1 != null) {
                OnHostedIcon1.b(writer, customScalarAdapters, onHostedIcon1);
            }
            ProductDetailsPageQuery.OnCoreIcon onCoreIcon = value.c;
            if (onCoreIcon != null) {
                OnCoreIcon.b(writer, customScalarAdapters, onCoreIcon);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$LeadingAsset1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$LeadingAsset1;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LeadingAsset1 implements Adapter<ProductDetailsPageQuery.LeadingAsset1> {

        /* renamed from: a, reason: collision with root package name */
        public static final LeadingAsset1 f23541a = new LeadingAsset1();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ProductDetailsPageQuery.OnHostedIcon2 onHostedIcon2A;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ProductDetailsPageQuery.OnCoreIcon1 onCoreIcon1A = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HostedIcon"))) {
                reader.o();
                onHostedIcon2A = OnHostedIcon2.a(reader, customScalarAdapters);
            } else {
                onHostedIcon2A = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CoreIcon"))) {
                reader.o();
                onCoreIcon1A = OnCoreIcon1.a(reader, customScalarAdapters);
            }
            return new ProductDetailsPageQuery.LeadingAsset1(str, onHostedIcon2A, onCoreIcon1A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.LeadingAsset1 value = (ProductDetailsPageQuery.LeadingAsset1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23442a);
            ProductDetailsPageQuery.OnHostedIcon2 onHostedIcon2 = value.b;
            if (onHostedIcon2 != null) {
                OnHostedIcon2.b(writer, customScalarAdapters, onHostedIcon2);
            }
            ProductDetailsPageQuery.OnCoreIcon1 onCoreIcon1 = value.c;
            if (onCoreIcon1 != null) {
                OnCoreIcon1.b(writer, customScalarAdapters, onCoreIcon1);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$LinkContent;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$LinkContent;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkContent implements Adapter<ProductDetailsPageQuery.LinkContent> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkContent f23542a = new LinkContent();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ProductDetailsPageQuery.OnParagraphTextItem2 onParagraphTextItem2A;
            ProductDetailsPageQuery.OnProductNutritionInfo onProductNutritionInfoA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ProductDetailsPageQuery.OnInfoSection onInfoSectionA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ParagraphTextItem"))) {
                reader.o();
                onParagraphTextItem2A = OnParagraphTextItem2.a(reader, customScalarAdapters);
            } else {
                onParagraphTextItem2A = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductNutritionInfo"))) {
                reader.o();
                onProductNutritionInfoA = OnProductNutritionInfo.a(reader, customScalarAdapters);
            } else {
                onProductNutritionInfoA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("InfoSection"), BooleanExpressions.d("isEverydayMarketPdpUpliftEnabled")))) {
                reader.o();
                onInfoSectionA = OnInfoSection.a(reader, customScalarAdapters);
            }
            return new ProductDetailsPageQuery.LinkContent(str, onParagraphTextItem2A, onProductNutritionInfoA, onInfoSectionA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.LinkContent value = (ProductDetailsPageQuery.LinkContent) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23443a);
            ProductDetailsPageQuery.OnParagraphTextItem2 onParagraphTextItem2 = value.b;
            if (onParagraphTextItem2 != null) {
                OnParagraphTextItem2.b(writer, customScalarAdapters, onParagraphTextItem2);
            }
            ProductDetailsPageQuery.OnProductNutritionInfo onProductNutritionInfo = value.c;
            if (onProductNutritionInfo != null) {
                OnProductNutritionInfo.b(writer, customScalarAdapters, onProductNutritionInfo);
            }
            ProductDetailsPageQuery.OnInfoSection onInfoSection = value.d;
            if (onInfoSection != null) {
                OnInfoSection.b(writer, customScalarAdapters, onInfoSection);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnActionableCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnActionableCard;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnActionableCard implements Adapter<ProductDetailsPageQuery.OnActionableCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23543a = CollectionsKt.R("image", "altText", "cardHeight", "link", "analytics");

        public static ProductDetailsPageQuery.OnActionableCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            CardHeight cardHeightA = null;
            String str3 = null;
            TealiumAnalytics tealiumAnalytics = null;
            while (true) {
                int iO2 = reader.o2(f23543a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    cardHeightA = CardHeight_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    tealiumAnalytics = (TealiumAnalytics) d.k(customScalarAdapters, au.com.woolworths.shop.graphql.type.TealiumAnalytics.f11963a, reader, customScalarAdapters);
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
                return new ProductDetailsPageQuery.OnActionableCard(str, str2, cardHeightA, str3, tealiumAnalytics);
            }
            Assertions.a(reader, "link");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnActionableCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("image");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23444a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("cardHeight");
            CardHeight_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1("link");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("analytics");
            Adapters.b(customScalarAdapters.e(au.com.woolworths.shop.graphql.type.TealiumAnalytics.f11963a)).toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnActionableCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnBasicCoreBroadcastBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnBasicCoreBroadcastBanner;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBasicCoreBroadcastBanner implements Adapter<ProductDetailsPageQuery.OnBasicCoreBroadcastBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23544a = CollectionsKt.R("broadcastBannerUI", "broadcastBannerActionLabel", "broadcastBannerAction");

        public static ProductDetailsPageQuery.OnBasicCoreBroadcastBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductDetailsPageQuery.BroadcastBannerUI broadcastBannerUI = null;
            String str = null;
            ProductDetailsPageQuery.BroadcastBannerAction broadcastBannerAction = null;
            while (true) {
                int iO2 = reader.o2(f23544a);
                if (iO2 == 0) {
                    broadcastBannerUI = (ProductDetailsPageQuery.BroadcastBannerUI) Adapters.c(BroadcastBannerUI.f23515a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    broadcastBannerAction = (ProductDetailsPageQuery.BroadcastBannerAction) Adapters.b(Adapters.c(BroadcastBannerAction.f23514a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (broadcastBannerUI != null) {
                return new ProductDetailsPageQuery.OnBasicCoreBroadcastBanner(broadcastBannerUI, str, broadcastBannerAction);
            }
            Assertions.a(reader, "broadcastBannerUI");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnBasicCoreBroadcastBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("broadcastBannerUI");
            Adapters.c(BroadcastBannerUI.f23515a, false).toJson(writer, customScalarAdapters, value.f23445a);
            writer.F1("broadcastBannerActionLabel");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("broadcastBannerAction");
            Adapters.b(Adapters.c(BroadcastBannerAction.f23514a, false)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnBasicCoreBroadcastBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnBasicCoreRow;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnBasicCoreRow;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBasicCoreRow implements Adapter<ProductDetailsPageQuery.OnBasicCoreRow> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23545a = CollectionsKt.Q("__typename");

        public static ProductDetailsPageQuery.OnBasicCoreRow a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23545a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            BasicCoreRow basicCoreRowA = BasicCoreRowImpl_ResponseAdapter.BasicCoreRow.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductDetailsPageQuery.OnBasicCoreRow(str, basicCoreRowA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnBasicCoreRow value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23446a);
            List list = BasicCoreRowImpl_ResponseAdapter.BasicCoreRow.f10040a;
            BasicCoreRowImpl_ResponseAdapter.BasicCoreRow.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnBasicCoreRow) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnBasicInsetAlert;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnBasicInsetAlert;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBasicInsetAlert implements Adapter<ProductDetailsPageQuery.OnBasicInsetAlert> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23546a = CollectionsKt.R("insetAlertUI", "insetAlertAction", "insetAlertActionLabel");

        public static ProductDetailsPageQuery.OnBasicInsetAlert a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductDetailsPageQuery.InsetAlertUI insetAlertUI = null;
            ProductDetailsPageQuery.InsetAlertAction insetAlertAction = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(f23546a);
                if (iO2 == 0) {
                    insetAlertUI = (ProductDetailsPageQuery.InsetAlertUI) Adapters.c(InsetAlertUI.f23535a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    insetAlertAction = (ProductDetailsPageQuery.InsetAlertAction) Adapters.b(Adapters.c(InsetAlertAction.f23534a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (insetAlertUI != null) {
                return new ProductDetailsPageQuery.OnBasicInsetAlert(insetAlertUI, insetAlertAction, str);
            }
            Assertions.a(reader, "insetAlertUI");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnBasicInsetAlert value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("insetAlertUI");
            Adapters.c(InsetAlertUI.f23535a, false).toJson(writer, customScalarAdapters, value.f23447a);
            writer.F1("insetAlertAction");
            Adapters.b(Adapters.c(InsetAlertAction.f23534a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("insetAlertActionLabel");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnBasicInsetAlert) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnChatEntryCardV3;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnChatEntryCardV3;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnChatEntryCardV3 implements Adapter<ProductDetailsPageQuery.OnChatEntryCardV3> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23547a = CollectionsKt.R("chatEntryCardTitle", "chatEntryCardShowBeta", "chatEntryCardSuggestedPrompts", "chatEntryCardAction");

        public static ProductDetailsPageQuery.OnChatEntryCardV3 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Boolean bool = null;
            ArrayList arrayListFromJson = null;
            ProductDetailsPageQuery.ChatEntryCardAction chatEntryCardAction = null;
            while (true) {
                int iO2 = reader.o2(f23547a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    chatEntryCardAction = (ProductDetailsPageQuery.ChatEntryCardAction) Adapters.c(ChatEntryCardAction.f23517a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "chatEntryCardTitle");
                throw null;
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "chatEntryCardSuggestedPrompts");
                throw null;
            }
            if (chatEntryCardAction != null) {
                return new ProductDetailsPageQuery.OnChatEntryCardV3(str, bool, arrayListFromJson, chatEntryCardAction);
            }
            Assertions.a(reader, "chatEntryCardAction");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnChatEntryCardV3 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("chatEntryCardTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23448a);
            writer.F1("chatEntryCardShowBeta");
            Adapters.l.toJson(writer, customScalarAdapters, value.b);
            writer.F1("chatEntryCardSuggestedPrompts");
            Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.c);
            writer.F1("chatEntryCardAction");
            Adapters.c(ChatEntryCardAction.f23517a, false).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnChatEntryCardV3) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnContentCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnContentCta;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnContentCta implements Adapter<ProductDetailsPageQuery.OnContentCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23548a = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "url", "onCtaClickAnalytics");

        public static ProductDetailsPageQuery.OnContentCta a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ProductDetailsPageQuery.OnCtaClickAnalytics onCtaClickAnalytics = null;
            while (true) {
                int iO2 = reader.o2(f23548a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    onCtaClickAnalytics = (ProductDetailsPageQuery.OnCtaClickAnalytics) Adapters.b(Adapters.c(OnCtaClickAnalytics.f23552a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new ProductDetailsPageQuery.OnContentCta(str, str2, onCtaClickAnalytics);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnContentCta value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23449a);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("onCtaClickAnalytics");
            Adapters.b(Adapters.c(OnCtaClickAnalytics.f23552a, true)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnContentCta) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnCoreIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnCoreIcon;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCoreIcon implements Adapter<ProductDetailsPageQuery.OnCoreIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23549a = CollectionsKt.Q("coreIconName");

        public static ProductDetailsPageQuery.OnCoreIcon a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23549a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ProductDetailsPageQuery.OnCoreIcon(str);
            }
            Assertions.a(reader, "coreIconName");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnCoreIcon value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("coreIconName");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23450a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnCoreIcon) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnCoreIcon1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnCoreIcon1;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCoreIcon1 implements Adapter<ProductDetailsPageQuery.OnCoreIcon1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23550a = CollectionsKt.Q("coreIconName");

        public static ProductDetailsPageQuery.OnCoreIcon1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23550a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ProductDetailsPageQuery.OnCoreIcon1(str);
            }
            Assertions.a(reader, "coreIconName");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnCoreIcon1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("coreIconName");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23451a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnCoreIcon1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnCoreRowUI;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnCoreRowUI;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCoreRowUI implements Adapter<ProductDetailsPageQuery.OnCoreRowUI> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23551a = CollectionsKt.Q("__typename");

        public static ProductDetailsPageQuery.OnCoreRowUI a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23551a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            CoreRowUI coreRowUIA = CoreRowUIImpl_ResponseAdapter.CoreRowUI.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductDetailsPageQuery.OnCoreRowUI(str, coreRowUIA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnCoreRowUI value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23452a);
            List list = CoreRowUIImpl_ResponseAdapter.CoreRowUI.f10051a;
            CoreRowUIImpl_ResponseAdapter.CoreRowUI.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnCoreRowUI) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnCtaClickAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnCtaClickAnalytics;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCtaClickAnalytics implements Adapter<ProductDetailsPageQuery.OnCtaClickAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final OnCtaClickAnalytics f23552a = new OnCtaClickAnalytics();
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
                return new ProductDetailsPageQuery.OnCtaClickAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.OnCtaClickAnalytics value = (ProductDetailsPageQuery.OnCtaClickAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23453a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnHorizontalList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnHorizontalList;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHorizontalList implements Adapter<ProductDetailsPageQuery.OnHorizontalList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23553a = CollectionsKt.R("id", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "actionTitle", "deepLink", "actionPath", "nodeId", "items");

        public static ProductDetailsPageQuery.OnHorizontalList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                switch (reader.o2(f23553a)) {
                    case 0:
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str6 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str7 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        arrayListFromJson = Adapters.a(Adapters.c(Item1.f23537a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str2 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (arrayListFromJson != null) {
                            return new ProductDetailsPageQuery.OnHorizontalList(str, str2, str3, str4, str5, str6, str7, arrayListFromJson);
                        }
                        Assertions.a(reader, "items");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnHorizontalList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f23454a);
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("actionTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("deepLink");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("actionPath");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1("nodeId");
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
            writer.F1("items");
            Adapters.a(Adapters.c(Item1.f23537a, true)).toJson(writer, customScalarAdapters, value.h);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnHorizontalList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnHorizontalList1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnHorizontalList1;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHorizontalList1 implements Adapter<ProductDetailsPageQuery.OnHorizontalList1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23554a = CollectionsKt.R("id", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "actionTitle", "deepLink", "actionPath", "nodeId", "items");

        public static ProductDetailsPageQuery.OnHorizontalList1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                switch (reader.o2(f23554a)) {
                    case 0:
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str6 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str7 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        arrayListFromJson = Adapters.a(Adapters.c(Item3.f23539a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str2 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (arrayListFromJson != null) {
                            return new ProductDetailsPageQuery.OnHorizontalList1(str, str2, str3, str4, str5, str6, str7, arrayListFromJson);
                        }
                        Assertions.a(reader, "items");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnHorizontalList1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f23455a);
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("actionTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("deepLink");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("actionPath");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1("nodeId");
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
            writer.F1("items");
            Adapters.a(Adapters.c(Item3.f23539a, true)).toJson(writer, customScalarAdapters, value.h);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnHorizontalList1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnHostedIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnHostedIcon;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon implements Adapter<ProductDetailsPageQuery.OnHostedIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23555a = CollectionsKt.Q("url");

        public static ProductDetailsPageQuery.OnHostedIcon a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23555a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ProductDetailsPageQuery.OnHostedIcon(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnHostedIcon value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23456a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnHostedIcon) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnHostedIcon1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnHostedIcon1;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon1 implements Adapter<ProductDetailsPageQuery.OnHostedIcon1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23556a = CollectionsKt.Q("url");

        public static ProductDetailsPageQuery.OnHostedIcon1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23556a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ProductDetailsPageQuery.OnHostedIcon1(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnHostedIcon1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23457a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnHostedIcon1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnHostedIcon2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnHostedIcon2;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon2 implements Adapter<ProductDetailsPageQuery.OnHostedIcon2> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23557a = CollectionsKt.Q("url");

        public static ProductDetailsPageQuery.OnHostedIcon2 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23557a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ProductDetailsPageQuery.OnHostedIcon2(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnHostedIcon2 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23458a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnHostedIcon2) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnInfoSection;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnInfoSection;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnInfoSection implements Adapter<ProductDetailsPageQuery.OnInfoSection> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23558a = CollectionsKt.R("title", "items", "footer");

        public static ProductDetailsPageQuery.OnInfoSection a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            ProductDetailsPageQuery.Footer footer = null;
            while (true) {
                int iO2 = reader.o2(f23558a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(Item2.f23538a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    footer = (ProductDetailsPageQuery.Footer) Adapters.b(Adapters.c(Footer.f23525a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new ProductDetailsPageQuery.OnInfoSection(str, arrayListFromJson, footer);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnInfoSection value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23459a);
            writer.F1("items");
            Adapters.a(Adapters.c(Item2.f23538a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("footer");
            Adapters.b(Adapters.c(Footer.f23525a, false)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnInfoSection) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnParagraphTextItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnParagraphTextItem;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnParagraphTextItem implements Adapter<ProductDetailsPageQuery.OnParagraphTextItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23559a = CollectionsKt.R("__typename", "content", "type");

        public static ProductDetailsPageQuery.OnParagraphTextItem a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ParagraphTextItemType paragraphTextItemTypeA = null;
            while (true) {
                int iO2 = reader.o2(f23559a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    paragraphTextItemTypeA = ParagraphTextItemType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "content");
                throw null;
            }
            if (paragraphTextItemTypeA != null) {
                return new ProductDetailsPageQuery.OnParagraphTextItem(str, str2, paragraphTextItemTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnParagraphTextItem value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23460a);
            writer.F1("content");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            ParagraphTextItemType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnParagraphTextItem) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnParagraphTextItem1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnParagraphTextItem1;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnParagraphTextItem1 implements Adapter<ProductDetailsPageQuery.OnParagraphTextItem1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23560a = CollectionsKt.R("__typename", "content", "type");

        public static ProductDetailsPageQuery.OnParagraphTextItem1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ParagraphTextItemType paragraphTextItemTypeA = null;
            while (true) {
                int iO2 = reader.o2(f23560a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    paragraphTextItemTypeA = ParagraphTextItemType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "content");
                throw null;
            }
            if (paragraphTextItemTypeA != null) {
                return new ProductDetailsPageQuery.OnParagraphTextItem1(str, str2, paragraphTextItemTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnParagraphTextItem1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23461a);
            writer.F1("content");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            ParagraphTextItemType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnParagraphTextItem1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnParagraphTextItem2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnParagraphTextItem2;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnParagraphTextItem2 implements Adapter<ProductDetailsPageQuery.OnParagraphTextItem2> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23561a = CollectionsKt.R("content", "type");

        public static ProductDetailsPageQuery.OnParagraphTextItem2 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ParagraphTextItemType paragraphTextItemTypeA = null;
            while (true) {
                int iO2 = reader.o2(f23561a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    paragraphTextItemTypeA = ParagraphTextItemType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "content");
                throw null;
            }
            if (paragraphTextItemTypeA != null) {
                return new ProductDetailsPageQuery.OnParagraphTextItem2(paragraphTextItemTypeA, str);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnParagraphTextItem2 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("content");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23462a);
            writer.F1("type");
            ParagraphTextItemType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnParagraphTextItem2) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnProductCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductCard;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard implements Adapter<ProductDetailsPageQuery.OnProductCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23562a = CollectionsKt.Q("__typename");

        public static ProductDetailsPageQuery.OnProductCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23562a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductDetailsPageQuery.OnProductCard(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnProductCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23463a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnProductCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnProductCard1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductCard1;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard1 implements Adapter<ProductDetailsPageQuery.OnProductCard1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23563a = CollectionsKt.Q("__typename");

        public static ProductDetailsPageQuery.OnProductCard1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23563a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductDetailsPageQuery.OnProductCard1(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnProductCard1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23464a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnProductCard1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnProductCard2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductCard2;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard2 implements Adapter<ProductDetailsPageQuery.OnProductCard2> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23564a = CollectionsKt.Q("__typename");

        public static ProductDetailsPageQuery.OnProductCard2 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23564a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductDetailsPageQuery.OnProductCard2(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnProductCard2 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23465a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnProductCard2) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnProductDetailsCoreRow;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductDetailsCoreRow;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductDetailsCoreRow implements Adapter<ProductDetailsPageQuery.OnProductDetailsCoreRow> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23565a = CollectionsKt.R("hasTopSeparator", "rowDetails");

        public static ProductDetailsPageQuery.OnProductDetailsCoreRow a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            ProductDetailsPageQuery.RowDetails rowDetails = null;
            while (true) {
                int iO2 = reader.o2(f23565a);
                if (iO2 == 0) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    rowDetails = (ProductDetailsPageQuery.RowDetails) Adapters.c(RowDetails.f23597a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (bool == null) {
                Assertions.a(reader, "hasTopSeparator");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (rowDetails != null) {
                return new ProductDetailsPageQuery.OnProductDetailsCoreRow(zBooleanValue, rowDetails);
            }
            Assertions.a(reader, "rowDetails");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnProductDetailsCoreRow value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("hasTopSeparator");
            d.B(value.f23466a, Adapters.f, writer, customScalarAdapters, "rowDetails");
            Adapters.c(RowDetails.f23597a, true).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnProductDetailsCoreRow) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnProductDetailsCouponBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductDetailsCouponBanner;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductDetailsCouponBanner implements Adapter<ProductDetailsPageQuery.OnProductDetailsCouponBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23566a = CollectionsKt.Q("productDetailsCouponBanner");

        public static ProductDetailsPageQuery.OnProductDetailsCouponBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductDetailsPageQuery.ProductDetailsCouponBanner productDetailsCouponBanner = null;
            while (reader.o2(f23566a) == 0) {
                productDetailsCouponBanner = (ProductDetailsPageQuery.ProductDetailsCouponBanner) Adapters.b(Adapters.c(ProductDetailsCouponBanner.f23586a, false)).fromJson(reader, customScalarAdapters);
            }
            return new ProductDetailsPageQuery.OnProductDetailsCouponBanner(productDetailsCouponBanner);
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnProductDetailsCouponBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productDetailsCouponBanner");
            Adapters.b(Adapters.c(ProductDetailsCouponBanner.f23586a, false)).toJson(writer, customScalarAdapters, value.f23467a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnProductDetailsCouponBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnProductDetailsImages;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductDetailsImages;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductDetailsImages implements Adapter<ProductDetailsPageQuery.OnProductDetailsImages> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23567a = CollectionsKt.R("productImages", "roundelImages");

        public static ProductDetailsPageQuery.OnProductDetailsImages a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            ArrayList arrayListFromJson2 = null;
            while (true) {
                int iO2 = reader.o2(f23567a);
                if (iO2 == 0) {
                    arrayListFromJson = Adapters.a(Adapters.c(ProductImage.f23592a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson2 = Adapters.a(Adapters.c(RoundelImage.f23596a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "productImages");
                throw null;
            }
            if (arrayListFromJson2 != null) {
                return new ProductDetailsPageQuery.OnProductDetailsImages(arrayListFromJson, arrayListFromJson2);
            }
            Assertions.a(reader, "roundelImages");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnProductDetailsImages value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productImages");
            Adapters.a(Adapters.c(ProductImage.f23592a, false)).toJson(writer, customScalarAdapters, value.f23468a);
            writer.F1("roundelImages");
            Adapters.a(Adapters.c(RoundelImage.f23596a, false)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnProductDetailsImages) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnProductDetailsProductPanel;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductDetailsProductPanel;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductDetailsProductPanel implements Adapter<ProductDetailsPageQuery.OnProductDetailsProductPanel> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23568a = CollectionsKt.R("ratingsAndReviewsSummary", "product");

        public static ProductDetailsPageQuery.OnProductDetailsProductPanel a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductDetailsPageQuery.RatingsAndReviewsSummary ratingsAndReviewsSummary = null;
            ProductDetailsPageQuery.Product product = null;
            while (true) {
                int iO2 = reader.o2(f23568a);
                if (iO2 == 0) {
                    ratingsAndReviewsSummary = (ProductDetailsPageQuery.RatingsAndReviewsSummary) Adapters.b(Adapters.c(RatingsAndReviewsSummary.f23595a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    product = (ProductDetailsPageQuery.Product) Adapters.c(Product.f23584a, true).fromJson(reader, customScalarAdapters);
                }
            }
            if (product != null) {
                return new ProductDetailsPageQuery.OnProductDetailsProductPanel(ratingsAndReviewsSummary, product);
            }
            Assertions.a(reader, "product");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnProductDetailsProductPanel value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("ratingsAndReviewsSummary");
            Adapters.b(Adapters.c(RatingsAndReviewsSummary.f23595a, true)).toJson(writer, customScalarAdapters, value.f23469a);
            writer.F1("product");
            Adapters.c(Product.f23584a, true).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnProductDetailsProductPanel) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnProductDetailsRatingsAndReviewsPreview;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductDetailsRatingsAndReviewsPreview;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductDetailsRatingsAndReviewsPreview implements Adapter<ProductDetailsPageQuery.OnProductDetailsRatingsAndReviewsPreview> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23569a = CollectionsKt.Q("ratingsAndReviewsPreview");

        public static ProductDetailsPageQuery.OnProductDetailsRatingsAndReviewsPreview a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductDetailsPageQuery.RatingsAndReviewsPreview ratingsAndReviewsPreview = null;
            while (reader.o2(f23569a) == 0) {
                ratingsAndReviewsPreview = (ProductDetailsPageQuery.RatingsAndReviewsPreview) Adapters.b(Adapters.c(RatingsAndReviewsPreview.f23594a, false)).fromJson(reader, customScalarAdapters);
            }
            return new ProductDetailsPageQuery.OnProductDetailsRatingsAndReviewsPreview(ratingsAndReviewsPreview);
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnProductDetailsRatingsAndReviewsPreview value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("ratingsAndReviewsPreview");
            Adapters.b(Adapters.c(RatingsAndReviewsPreview.f23594a, false)).toJson(writer, customScalarAdapters, value.f23470a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnProductDetailsRatingsAndReviewsPreview) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnProductDetailsRowAccordion;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductDetailsRowAccordion;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductDetailsRowAccordion implements Adapter<ProductDetailsPageQuery.OnProductDetailsRowAccordion> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23570a = CollectionsKt.R("openActionAnalytics", "closeActionAnalytics", "rowUI", "isExpanded", "hasTopSeparator", "expandedContent");

        public static ProductDetailsPageQuery.OnProductDetailsRowAccordion a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            ProductDetailsPageQuery.OpenActionAnalytics openActionAnalytics = null;
            ProductDetailsPageQuery.CloseActionAnalytics closeActionAnalytics = null;
            ProductDetailsPageQuery.RowUI rowUI = null;
            Boolean bool3 = null;
            ProductDetailsPageQuery.ExpandedContent expandedContent = null;
            while (true) {
                int iO2 = reader.o2(f23570a);
                if (iO2 == 0) {
                    bool = bool2;
                    openActionAnalytics = (ProductDetailsPageQuery.OpenActionAnalytics) Adapters.b(Adapters.c(OpenActionAnalytics.f23582a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = bool2;
                    closeActionAnalytics = (ProductDetailsPageQuery.CloseActionAnalytics) Adapters.b(Adapters.c(CloseActionAnalytics.f23518a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool = bool2;
                    rowUI = (ProductDetailsPageQuery.RowUI) Adapters.c(RowUI.f23598a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    bool = bool2;
                    bool3 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    bool = bool2;
                    expandedContent = (ProductDetailsPageQuery.ExpandedContent) Adapters.c(ExpandedContent.f23524a, true).fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool4 = bool2;
            if (rowUI == null) {
                Assertions.a(reader, "rowUI");
                throw null;
            }
            if (bool4 == null) {
                Assertions.a(reader, "isExpanded");
                throw null;
            }
            Boolean bool5 = bool3;
            boolean zBooleanValue = bool4.booleanValue();
            if (bool5 == null) {
                Assertions.a(reader, "hasTopSeparator");
                throw null;
            }
            boolean zBooleanValue2 = bool5.booleanValue();
            if (expandedContent != null) {
                return new ProductDetailsPageQuery.OnProductDetailsRowAccordion(openActionAnalytics, closeActionAnalytics, rowUI, zBooleanValue, zBooleanValue2, expandedContent);
            }
            Assertions.a(reader, "expandedContent");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnProductDetailsRowAccordion value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("openActionAnalytics");
            Adapters.b(Adapters.c(OpenActionAnalytics.f23582a, true)).toJson(writer, customScalarAdapters, value.f23471a);
            writer.F1("closeActionAnalytics");
            Adapters.b(Adapters.c(CloseActionAnalytics.f23518a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("rowUI");
            Adapters.c(RowUI.f23598a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("isExpanded");
            Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
            d.B(value.d, adapters$BooleanAdapter$1, writer, customScalarAdapters, "hasTopSeparator");
            d.B(value.e, adapters$BooleanAdapter$1, writer, customScalarAdapters, "expandedContent");
            Adapters.c(ExpandedContent.f23524a, true).toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnProductDetailsRowAccordion) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnProductDetailsRowAccordionProductList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductDetailsRowAccordionProductList;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductDetailsRowAccordionProductList implements Adapter<ProductDetailsPageQuery.OnProductDetailsRowAccordionProductList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23571a = CollectionsKt.R("__typename", "productDetailsRowAccordionProductListTextItem", "productDetailsRowAccordionProductListCta", "productDetailsRowAccordionProductList");

        public static ProductDetailsPageQuery.OnProductDetailsRowAccordionProductList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ProductDetailsPageQuery.ProductDetailsRowAccordionProductListTextItem productDetailsRowAccordionProductListTextItem = null;
            ProductDetailsPageQuery.ProductDetailsRowAccordionProductListCta productDetailsRowAccordionProductListCta = null;
            ProductDetailsPageQuery.ProductDetailsRowAccordionProductList productDetailsRowAccordionProductList = null;
            while (true) {
                int iO2 = reader.o2(f23571a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    productDetailsRowAccordionProductListTextItem = (ProductDetailsPageQuery.ProductDetailsRowAccordionProductListTextItem) Adapters.c(ProductDetailsRowAccordionProductListTextItem.f23590a, true).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    productDetailsRowAccordionProductListCta = (ProductDetailsPageQuery.ProductDetailsRowAccordionProductListCta) Adapters.c(ProductDetailsRowAccordionProductListCta.f23589a, true).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    productDetailsRowAccordionProductList = (ProductDetailsPageQuery.ProductDetailsRowAccordionProductList) Adapters.b(Adapters.c(ProductDetailsRowAccordionProductList.f23588a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (productDetailsRowAccordionProductListTextItem == null) {
                Assertions.a(reader, "productDetailsRowAccordionProductListTextItem");
                throw null;
            }
            if (productDetailsRowAccordionProductListCta != null) {
                return new ProductDetailsPageQuery.OnProductDetailsRowAccordionProductList(str, productDetailsRowAccordionProductListTextItem, productDetailsRowAccordionProductListCta, productDetailsRowAccordionProductList);
            }
            Assertions.a(reader, "productDetailsRowAccordionProductListCta");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnProductDetailsRowAccordionProductList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23472a);
            writer.F1("productDetailsRowAccordionProductListTextItem");
            Adapters.c(ProductDetailsRowAccordionProductListTextItem.f23590a, true).toJson(writer, customScalarAdapters, value.b);
            writer.F1("productDetailsRowAccordionProductListCta");
            Adapters.c(ProductDetailsRowAccordionProductListCta.f23589a, true).toJson(writer, customScalarAdapters, value.c);
            writer.F1("productDetailsRowAccordionProductList");
            Adapters.b(Adapters.c(ProductDetailsRowAccordionProductList.f23588a, true)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnProductDetailsRowAccordionProductList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnProductDetailsRowLink;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductDetailsRowLink;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductDetailsRowLink implements Adapter<ProductDetailsPageQuery.OnProductDetailsRowLink> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23572a = CollectionsKt.R("rowUI", "linkContent", "hasTopSeparator", "openActionAnalytics");

        public static ProductDetailsPageQuery.OnProductDetailsRowLink a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductDetailsPageQuery.RowUI1 rowUI1 = null;
            ProductDetailsPageQuery.LinkContent linkContent = null;
            Boolean bool = null;
            ProductDetailsPageQuery.OpenActionAnalytics1 openActionAnalytics1 = null;
            while (true) {
                int iO2 = reader.o2(f23572a);
                if (iO2 == 0) {
                    rowUI1 = (ProductDetailsPageQuery.RowUI1) Adapters.c(RowUI1.f23599a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    linkContent = (ProductDetailsPageQuery.LinkContent) Adapters.c(LinkContent.f23542a, true).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    openActionAnalytics1 = (ProductDetailsPageQuery.OpenActionAnalytics1) Adapters.b(Adapters.c(OpenActionAnalytics1.f23583a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (rowUI1 == null) {
                Assertions.a(reader, "rowUI");
                throw null;
            }
            if (linkContent == null) {
                Assertions.a(reader, "linkContent");
                throw null;
            }
            if (bool != null) {
                return new ProductDetailsPageQuery.OnProductDetailsRowLink(rowUI1, linkContent, bool.booleanValue(), openActionAnalytics1);
            }
            Assertions.a(reader, "hasTopSeparator");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnProductDetailsRowLink value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("rowUI");
            Adapters.c(RowUI1.f23599a, false).toJson(writer, customScalarAdapters, value.f23473a);
            writer.F1("linkContent");
            Adapters.c(LinkContent.f23542a, true).toJson(writer, customScalarAdapters, value.b);
            writer.F1("hasTopSeparator");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, "openActionAnalytics");
            Adapters.b(Adapters.c(OpenActionAnalytics1.f23583a, true)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnProductDetailsRowLink) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnProductNutritionInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductNutritionInfo;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductNutritionInfo implements Adapter<ProductDetailsPageQuery.OnProductNutritionInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23573a = CollectionsKt.R("productNutritionTitle", "servingsPerPack", "servingSize", "servingsHeader", "servingsRow", "bottomCaption", "tableHeaderRow", "tableRows");

        public static ProductDetailsPageQuery.OnProductNutritionInfo a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayListFromJson = null;
            ArrayList arrayListFromJson2 = null;
            String str4 = null;
            ArrayList arrayListFromJson3 = null;
            ArrayList arrayListFromJson4 = null;
            while (true) {
                switch (reader.o2(f23573a)) {
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
                        arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        arrayListFromJson2 = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        arrayListFromJson3 = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        arrayListFromJson4 = Adapters.a(Adapters.a(Adapters.f13493a)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
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
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "servingsHeader");
                            throw null;
                        }
                        if (arrayListFromJson2 == null) {
                            Assertions.a(reader, "servingsRow");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "bottomCaption");
                            throw null;
                        }
                        if (arrayListFromJson3 == null) {
                            Assertions.a(reader, "tableHeaderRow");
                            throw null;
                        }
                        if (arrayListFromJson4 != null) {
                            return new ProductDetailsPageQuery.OnProductNutritionInfo(str, str2, str3, arrayListFromJson, arrayListFromJson2, str4, arrayListFromJson3, arrayListFromJson4);
                        }
                        Assertions.a(reader, "tableRows");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnProductNutritionInfo value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productNutritionTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23474a);
            writer.F1("servingsPerPack");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("servingSize");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("servingsHeader");
            Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.d);
            writer.F1("servingsRow");
            Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.e);
            writer.F1("bottomCaption");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("tableHeaderRow");
            Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.g);
            writer.F1("tableRows");
            Adapters.a(Adapters.a(adapters$StringAdapter$1)).toJson(writer, customScalarAdapters, value.h);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnProductNutritionInfo) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnProductOriginAndHealthInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductOriginAndHealthInfo;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductOriginAndHealthInfo implements Adapter<ProductDetailsPageQuery.OnProductOriginAndHealthInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23574a = CollectionsKt.Q("countryOfOrigin");

        public static ProductDetailsPageQuery.OnProductOriginAndHealthInfo a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductDetailsPageQuery.CountryOfOrigin countryOfOrigin = null;
            while (reader.o2(f23574a) == 0) {
                countryOfOrigin = (ProductDetailsPageQuery.CountryOfOrigin) Adapters.b(Adapters.c(CountryOfOrigin.f23519a, false)).fromJson(reader, customScalarAdapters);
            }
            return new ProductDetailsPageQuery.OnProductOriginAndHealthInfo(countryOfOrigin);
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnProductOriginAndHealthInfo value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("countryOfOrigin");
            Adapters.b(Adapters.c(CountryOfOrigin.f23519a, false)).toJson(writer, customScalarAdapters, value.f23475a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnProductOriginAndHealthInfo) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnProductRatingsAndReviewsSummary;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductRatingsAndReviewsSummary;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductRatingsAndReviewsSummary implements Adapter<ProductDetailsPageQuery.OnProductRatingsAndReviewsSummary> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23575a = CollectionsKt.R("averageRatings", "displayRatings", "maximumRating", "ratingText", "cta");

        public static ProductDetailsPageQuery.OnProductRatingsAndReviewsSummary a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Double d = null;
            Double d2 = null;
            Integer num = null;
            ProductDetailsPageQuery.RatingText ratingText = null;
            ProductDetailsPageQuery.Cta cta = null;
            while (true) {
                int iO2 = reader.o2(f23575a);
                if (iO2 == 0) {
                    d = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    d2 = (Double) Adapters.c.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    ratingText = (ProductDetailsPageQuery.RatingText) Adapters.c(RatingText.f23593a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    cta = (ProductDetailsPageQuery.Cta) Adapters.b(Adapters.c(Cta.f23521a, false)).fromJson(reader, customScalarAdapters);
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
                return new ProductDetailsPageQuery.OnProductRatingsAndReviewsSummary(dDoubleValue, dDoubleValue2, iIntValue, ratingText, cta);
            }
            Assertions.a(reader, "ratingText");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnProductRatingsAndReviewsSummary value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("averageRatings");
            Adapters$DoubleAdapter$1 adapters$DoubleAdapter$1 = Adapters.c;
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.f23476a));
            writer.F1("displayRatings");
            adapters$DoubleAdapter$1.toJson(writer, customScalarAdapters, Double.valueOf(value.b));
            writer.F1("maximumRating");
            d.y(value.c, Adapters.b, writer, customScalarAdapters, "ratingText");
            Adapters.c(RatingText.f23593a, false).toJson(writer, customScalarAdapters, value.d);
            writer.F1("cta");
            Adapters.b(Adapters.c(Cta.f23521a, false)).toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnProductRatingsAndReviewsSummary) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnProductTile;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductTile;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductTile implements Adapter<ProductDetailsPageQuery.OnProductTile> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23576a = CollectionsKt.Q("__typename");

        public static ProductDetailsPageQuery.OnProductTile a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23576a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductTile productTileA = ProductTileImpl_ResponseAdapter.ProductTile.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductDetailsPageQuery.OnProductTile(str, productTileA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnProductTile value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23477a);
            List list = ProductTileImpl_ResponseAdapter.ProductTile.f23692a;
            ProductTileImpl_ResponseAdapter.ProductTile.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnProductTile) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnProductTile1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductTile1;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductTile1 implements Adapter<ProductDetailsPageQuery.OnProductTile1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23577a = CollectionsKt.Q("__typename");

        public static ProductDetailsPageQuery.OnProductTile1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23577a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductTile productTileA = ProductTileImpl_ResponseAdapter.ProductTile.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductDetailsPageQuery.OnProductTile1(str, productTileA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnProductTile1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23478a);
            List list = ProductTileImpl_ResponseAdapter.ProductTile.f23692a;
            ProductTileImpl_ResponseAdapter.ProductTile.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnProductTile1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnRatingsAndReviewsPreviewCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnRatingsAndReviewsPreviewCta;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRatingsAndReviewsPreviewCta implements Adapter<ProductDetailsPageQuery.OnRatingsAndReviewsPreviewCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23578a = CollectionsKt.Q("__typename");

        public static ProductDetailsPageQuery.OnRatingsAndReviewsPreviewCta a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23578a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            RatingsAndReviewsPreviewCta ratingsAndReviewsPreviewCtaA = RatingsAndReviewsPreviewCtaImpl_ResponseAdapter.RatingsAndReviewsPreviewCta.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductDetailsPageQuery.OnRatingsAndReviewsPreviewCta(str, ratingsAndReviewsPreviewCtaA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnRatingsAndReviewsPreviewCta value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23479a);
            List list = RatingsAndReviewsPreviewCtaImpl_ResponseAdapter.RatingsAndReviewsPreviewCta.f23790a;
            RatingsAndReviewsPreviewCtaImpl_ResponseAdapter.RatingsAndReviewsPreviewCta.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnRatingsAndReviewsPreviewCta) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnRatingsAndReviewsPreviewHeader;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnRatingsAndReviewsPreviewHeader;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRatingsAndReviewsPreviewHeader implements Adapter<ProductDetailsPageQuery.OnRatingsAndReviewsPreviewHeader> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23579a = CollectionsKt.Q("__typename");

        public static ProductDetailsPageQuery.OnRatingsAndReviewsPreviewHeader a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23579a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            RatingsAndReviewsPreviewHeader ratingsAndReviewsPreviewHeaderA = RatingsAndReviewsPreviewHeaderImpl_ResponseAdapter.RatingsAndReviewsPreviewHeader.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductDetailsPageQuery.OnRatingsAndReviewsPreviewHeader(str, ratingsAndReviewsPreviewHeaderA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnRatingsAndReviewsPreviewHeader value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23480a);
            List list = RatingsAndReviewsPreviewHeaderImpl_ResponseAdapter.RatingsAndReviewsPreviewHeader.f23792a;
            RatingsAndReviewsPreviewHeaderImpl_ResponseAdapter.RatingsAndReviewsPreviewHeader.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnRatingsAndReviewsPreviewHeader) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnRatingsAndReviewsRatingsDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnRatingsAndReviewsRatingsDetails;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRatingsAndReviewsRatingsDetails implements Adapter<ProductDetailsPageQuery.OnRatingsAndReviewsRatingsDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23580a = CollectionsKt.Q("__typename");

        public static ProductDetailsPageQuery.OnRatingsAndReviewsRatingsDetails a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23580a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            RatingsAndReviewsRatingsDetails ratingsAndReviewsRatingsDetailsA = RatingsAndReviewsRatingsDetailsImpl_ResponseAdapter.RatingsAndReviewsRatingsDetails.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductDetailsPageQuery.OnRatingsAndReviewsRatingsDetails(str, ratingsAndReviewsRatingsDetailsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnRatingsAndReviewsRatingsDetails value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23481a);
            List list = RatingsAndReviewsRatingsDetailsImpl_ResponseAdapter.RatingsAndReviewsRatingsDetails.f23815a;
            RatingsAndReviewsRatingsDetailsImpl_ResponseAdapter.RatingsAndReviewsRatingsDetails.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnRatingsAndReviewsRatingsDetails) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OnRatingsAndReviewsReviewDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnRatingsAndReviewsReviewDetails;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRatingsAndReviewsReviewDetails implements Adapter<ProductDetailsPageQuery.OnRatingsAndReviewsReviewDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23581a = CollectionsKt.Q("__typename");

        public static ProductDetailsPageQuery.OnRatingsAndReviewsReviewDetails a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23581a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            RatingsAndReviewsReviewDetails ratingsAndReviewsReviewDetailsA = RatingsAndReviewsReviewDetailsImpl_ResponseAdapter.RatingsAndReviewsReviewDetails.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductDetailsPageQuery.OnRatingsAndReviewsReviewDetails(str, ratingsAndReviewsReviewDetailsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductDetailsPageQuery.OnRatingsAndReviewsReviewDetails value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23482a);
            List list = RatingsAndReviewsReviewDetailsImpl_ResponseAdapter.RatingsAndReviewsReviewDetails.f23831a;
            RatingsAndReviewsReviewDetailsImpl_ResponseAdapter.RatingsAndReviewsReviewDetails.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductDetailsPageQuery.OnRatingsAndReviewsReviewDetails) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OpenActionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OpenActionAnalytics;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OpenActionAnalytics implements Adapter<ProductDetailsPageQuery.OpenActionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final OpenActionAnalytics f23582a = new OpenActionAnalytics();
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
                return new ProductDetailsPageQuery.OpenActionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.OpenActionAnalytics value = (ProductDetailsPageQuery.OpenActionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23483a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$OpenActionAnalytics1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OpenActionAnalytics1;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OpenActionAnalytics1 implements Adapter<ProductDetailsPageQuery.OpenActionAnalytics1> {

        /* renamed from: a, reason: collision with root package name */
        public static final OpenActionAnalytics1 f23583a = new OpenActionAnalytics1();
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
                return new ProductDetailsPageQuery.OpenActionAnalytics1(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.OpenActionAnalytics1 value = (ProductDetailsPageQuery.OpenActionAnalytics1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23484a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$Product;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Product;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Product implements Adapter<ProductDetailsPageQuery.Product> {

        /* renamed from: a, reason: collision with root package name */
        public static final Product f23584a = new Product();
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
            ProductDetailsPageQuery.OnProductCard onProductCardA = OnProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductDetailsPageQuery.Product(str, onProductCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.Product value = (ProductDetailsPageQuery.Product) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23485a);
            List list = OnProductCard.f23562a;
            OnProductCard.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$ProductDetailsAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ProductDetailsAction;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductDetailsAction implements Adapter<ProductDetailsPageQuery.ProductDetailsAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductDetailsAction f23585a = new ProductDetailsAction();
        public static final List b = CollectionsKt.R("altText", AnnotatedPrivateKey.LABEL, "enabled", "buttonAction", "buttonId", "iconUrl", "style");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            ProductDetailsPageQuery.ButtonAction buttonAction = null;
            String str3 = null;
            String str4 = null;
            ButtonStyle buttonStyle = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        bool = bool2;
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool = bool2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 3:
                        bool = bool2;
                        buttonAction = (ProductDetailsPageQuery.ButtonAction) Adapters.b(Adapters.c(ButtonAction.f23516a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool = bool2;
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool = bool2;
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = bool2;
                        buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool3 = bool2;
                        if (str2 == null) {
                            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                            throw null;
                        }
                        if (bool3 != null) {
                            return new ProductDetailsPageQuery.ProductDetailsAction(str, str2, bool3.booleanValue(), buttonAction, str3, str4, buttonStyle);
                        }
                        Assertions.a(reader, "enabled");
                        throw null;
                }
                bool2 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.ProductDetailsAction value = (ProductDetailsPageQuery.ProductDetailsAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("altText");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f23486a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("enabled");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, "buttonAction");
            Adapters.b(Adapters.c(ButtonAction.f23516a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("buttonId");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("iconUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$ProductDetailsCouponBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ProductDetailsCouponBanner;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductDetailsCouponBanner implements Adapter<ProductDetailsPageQuery.ProductDetailsCouponBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductDetailsCouponBanner f23586a = new ProductDetailsCouponBanner();
        public static final List b = CollectionsKt.R("couponBannerColorTheme", "couponBannerCouponCode", "couponBannerDescription", "couponBannerMinimumSpend", "couponBannerCouponCodeAccessibilityLabel", "couponBannerDescriptionAccessibilityLabel", "couponBannerTermsAndConditions");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            CouponBannerColorTheme couponBannerColorThemeA = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            ProductDetailsPageQuery.CouponBannerTermsAndConditions couponBannerTermsAndConditions = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        couponBannerColorThemeA = CouponBannerColorTheme_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 1:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        couponBannerTermsAndConditions = (ProductDetailsPageQuery.CouponBannerTermsAndConditions) Adapters.c(CouponBannerTermsAndConditions.f23520a, false).fromJson(reader, customScalarAdapters);
                        break;
                    default:
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
                        if (str3 == null) {
                            Assertions.a(reader, "couponBannerMinimumSpend");
                            throw null;
                        }
                        if (couponBannerTermsAndConditions != null) {
                            return new ProductDetailsPageQuery.ProductDetailsCouponBanner(couponBannerColorThemeA, str, str2, str3, str4, str5, couponBannerTermsAndConditions);
                        }
                        Assertions.a(reader, "couponBannerTermsAndConditions");
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.ProductDetailsCouponBanner value = (ProductDetailsPageQuery.ProductDetailsCouponBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("couponBannerColorTheme");
            CouponBannerColorTheme_ResponseAdapter.b(writer, customScalarAdapters, value.f23487a);
            writer.F1("couponBannerCouponCode");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("couponBannerDescription");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("couponBannerMinimumSpend");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("couponBannerCouponCodeAccessibilityLabel");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("couponBannerDescriptionAccessibilityLabel");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1("couponBannerTermsAndConditions");
            Adapters.c(CouponBannerTermsAndConditions.f23520a, false).toJson(writer, customScalarAdapters, value.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$ProductDetailsPage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ProductDetailsPage;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductDetailsPage implements Adapter<ProductDetailsPageQuery.ProductDetailsPage> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductDetailsPage f23587a = new ProductDetailsPage();
        public static final List b = CollectionsKt.R("analytics", "impressionAnalytics", "items", "footer");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductDetailsPageQuery.Analytics analytics = null;
            ProductDetailsPageQuery.ImpressionAnalytics impressionAnalytics = null;
            ArrayList arrayListFromJson = null;
            ProductDetailsPageQuery.Footer1 footer1 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    analytics = (ProductDetailsPageQuery.Analytics) Adapters.b(Adapters.c(Analytics.f23509a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    impressionAnalytics = (ProductDetailsPageQuery.ImpressionAnalytics) Adapters.b(Adapters.c(ImpressionAnalytics.f23533a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.b(Adapters.c(Item.f23536a, true))).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    footer1 = (ProductDetailsPageQuery.Footer1) Adapters.b(Adapters.c(Footer1.f23526a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new ProductDetailsPageQuery.ProductDetailsPage(analytics, impressionAnalytics, arrayListFromJson, footer1);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.ProductDetailsPage value = (ProductDetailsPageQuery.ProductDetailsPage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics.f23509a, true)).toJson(writer, customScalarAdapters, value.f23488a);
            writer.F1("impressionAnalytics");
            Adapters.b(Adapters.c(ImpressionAnalytics.f23533a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("items");
            Adapters.a(Adapters.b(Adapters.c(Item.f23536a, true))).toJson(writer, customScalarAdapters, value.c);
            writer.F1("footer");
            Adapters.b(Adapters.c(Footer1.f23526a, false)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$ProductDetailsRowAccordionProductList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ProductDetailsRowAccordionProductList;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductDetailsRowAccordionProductList implements Adapter<ProductDetailsPageQuery.ProductDetailsRowAccordionProductList> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductDetailsRowAccordionProductList f23588a = new ProductDetailsRowAccordionProductList();
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
            ProductDetailsPageQuery.OnHorizontalList onHorizontalListA = OnHorizontalList.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductDetailsPageQuery.ProductDetailsRowAccordionProductList(str, onHorizontalListA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.ProductDetailsRowAccordionProductList value = (ProductDetailsPageQuery.ProductDetailsRowAccordionProductList) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23489a);
            List list = OnHorizontalList.f23553a;
            OnHorizontalList.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$ProductDetailsRowAccordionProductListCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ProductDetailsRowAccordionProductListCta;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductDetailsRowAccordionProductListCta implements Adapter<ProductDetailsPageQuery.ProductDetailsRowAccordionProductListCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductDetailsRowAccordionProductListCta f23589a = new ProductDetailsRowAccordionProductListCta();
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
            ProductDetailsPageQuery.OnContentCta onContentCtaA = OnContentCta.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductDetailsPageQuery.ProductDetailsRowAccordionProductListCta(str, onContentCtaA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.ProductDetailsRowAccordionProductListCta value = (ProductDetailsPageQuery.ProductDetailsRowAccordionProductListCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23490a);
            List list = OnContentCta.f23548a;
            OnContentCta.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$ProductDetailsRowAccordionProductListTextItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ProductDetailsRowAccordionProductListTextItem;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductDetailsRowAccordionProductListTextItem implements Adapter<ProductDetailsPageQuery.ProductDetailsRowAccordionProductListTextItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductDetailsRowAccordionProductListTextItem f23590a = new ProductDetailsRowAccordionProductListTextItem();
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
            ProductDetailsPageQuery.OnParagraphTextItem1 onParagraphTextItem1A = OnParagraphTextItem1.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductDetailsPageQuery.ProductDetailsRowAccordionProductListTextItem(str, onParagraphTextItem1A);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.ProductDetailsRowAccordionProductListTextItem value = (ProductDetailsPageQuery.ProductDetailsRowAccordionProductListTextItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23491a);
            List list = OnParagraphTextItem1.f23560a;
            OnParagraphTextItem1.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$ProductDetailsThumbnailClickAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ProductDetailsThumbnailClickAnalytics;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductDetailsThumbnailClickAnalytics implements Adapter<ProductDetailsPageQuery.ProductDetailsThumbnailClickAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductDetailsThumbnailClickAnalytics f23591a = new ProductDetailsThumbnailClickAnalytics();
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
                return new ProductDetailsPageQuery.ProductDetailsThumbnailClickAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.ProductDetailsThumbnailClickAnalytics value = (ProductDetailsPageQuery.ProductDetailsThumbnailClickAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23492a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$ProductImage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ProductImage;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductImage implements Adapter<ProductDetailsPageQuery.ProductImage> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductImage f23592a = new ProductImage();
        public static final List b = CollectionsKt.R("largeUrl", "altText", "imageGalleryClickAnalytics", "imageGalleryScrollAnalytics", "imageGalleryCloseAnalytics", "imageGalleryThumbnailClickAnalytics", "productDetailsThumbnailClickAnalytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ProductDetailsPageQuery.ImageGalleryClickAnalytics imageGalleryClickAnalytics = null;
            ProductDetailsPageQuery.ImageGalleryScrollAnalytics imageGalleryScrollAnalytics = null;
            ProductDetailsPageQuery.ImageGalleryCloseAnalytics imageGalleryCloseAnalytics = null;
            ProductDetailsPageQuery.ImageGalleryThumbnailClickAnalytics imageGalleryThumbnailClickAnalytics = null;
            ProductDetailsPageQuery.ProductDetailsThumbnailClickAnalytics productDetailsThumbnailClickAnalytics = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        imageGalleryClickAnalytics = (ProductDetailsPageQuery.ImageGalleryClickAnalytics) Adapters.b(Adapters.c(ImageGalleryClickAnalytics.f23529a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        imageGalleryScrollAnalytics = (ProductDetailsPageQuery.ImageGalleryScrollAnalytics) Adapters.b(Adapters.c(ImageGalleryScrollAnalytics.f23531a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        imageGalleryCloseAnalytics = (ProductDetailsPageQuery.ImageGalleryCloseAnalytics) Adapters.b(Adapters.c(ImageGalleryCloseAnalytics.f23530a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        imageGalleryThumbnailClickAnalytics = (ProductDetailsPageQuery.ImageGalleryThumbnailClickAnalytics) Adapters.b(Adapters.c(ImageGalleryThumbnailClickAnalytics.f23532a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        productDetailsThumbnailClickAnalytics = (ProductDetailsPageQuery.ProductDetailsThumbnailClickAnalytics) Adapters.b(Adapters.c(ProductDetailsThumbnailClickAnalytics.f23591a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        return new ProductDetailsPageQuery.ProductImage(str, str2, imageGalleryClickAnalytics, imageGalleryScrollAnalytics, imageGalleryCloseAnalytics, imageGalleryThumbnailClickAnalytics, productDetailsThumbnailClickAnalytics);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.ProductImage value = (ProductDetailsPageQuery.ProductImage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("largeUrl");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f23493a);
            writer.F1("altText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("imageGalleryClickAnalytics");
            Adapters.b(Adapters.c(ImageGalleryClickAnalytics.f23529a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("imageGalleryScrollAnalytics");
            Adapters.b(Adapters.c(ImageGalleryScrollAnalytics.f23531a, true)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("imageGalleryCloseAnalytics");
            Adapters.b(Adapters.c(ImageGalleryCloseAnalytics.f23530a, true)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("imageGalleryThumbnailClickAnalytics");
            Adapters.b(Adapters.c(ImageGalleryThumbnailClickAnalytics.f23532a, true)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("productDetailsThumbnailClickAnalytics");
            Adapters.b(Adapters.c(ProductDetailsThumbnailClickAnalytics.f23591a, true)).toJson(writer, customScalarAdapters, value.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$RatingText;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$RatingText;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RatingText implements Adapter<ProductDetailsPageQuery.RatingText> {

        /* renamed from: a, reason: collision with root package name */
        public static final RatingText f23593a = new RatingText();
        public static final List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "altText");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
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
                return new ProductDetailsPageQuery.RatingText(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.RatingText value = (ProductDetailsPageQuery.RatingText) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23494a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$RatingsAndReviewsPreview;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$RatingsAndReviewsPreview;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RatingsAndReviewsPreview implements Adapter<ProductDetailsPageQuery.RatingsAndReviewsPreview> {

        /* renamed from: a, reason: collision with root package name */
        public static final RatingsAndReviewsPreview f23594a = new RatingsAndReviewsPreview();
        public static final List b = CollectionsKt.Q("sections");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(b) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Section.f23600a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new ProductDetailsPageQuery.RatingsAndReviewsPreview(arrayListFromJson);
            }
            Assertions.a(reader, "sections");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.RatingsAndReviewsPreview value = (ProductDetailsPageQuery.RatingsAndReviewsPreview) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("sections");
            Adapters.a(Adapters.c(Section.f23600a, true)).toJson(writer, customScalarAdapters, value.f23495a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$RatingsAndReviewsSummary;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$RatingsAndReviewsSummary;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RatingsAndReviewsSummary implements Adapter<ProductDetailsPageQuery.RatingsAndReviewsSummary> {

        /* renamed from: a, reason: collision with root package name */
        public static final RatingsAndReviewsSummary f23595a = new RatingsAndReviewsSummary();
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
            ProductDetailsPageQuery.OnProductRatingsAndReviewsSummary onProductRatingsAndReviewsSummaryA = OnProductRatingsAndReviewsSummary.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductDetailsPageQuery.RatingsAndReviewsSummary(str, onProductRatingsAndReviewsSummaryA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.RatingsAndReviewsSummary value = (ProductDetailsPageQuery.RatingsAndReviewsSummary) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23496a);
            List list = OnProductRatingsAndReviewsSummary.f23575a;
            OnProductRatingsAndReviewsSummary.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$RoundelImage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$RoundelImage;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RoundelImage implements Adapter<ProductDetailsPageQuery.RoundelImage> {

        /* renamed from: a, reason: collision with root package name */
        public static final RoundelImage f23596a = new RoundelImage();
        public static final List b = CollectionsKt.R("url", "altText", "priority");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            RoundelImagePriority roundelImagePriorityA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    roundelImagePriorityA = RoundelImagePriority_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "url");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "altText");
                throw null;
            }
            if (roundelImagePriorityA != null) {
                return new ProductDetailsPageQuery.RoundelImage(str, str2, roundelImagePriorityA);
            }
            Assertions.a(reader, "priority");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.RoundelImage value = (ProductDetailsPageQuery.RoundelImage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f23497a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("priority");
            RoundelImagePriority_ResponseAdapter.b(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$RowDetails;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$RowDetails;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RowDetails implements Adapter<ProductDetailsPageQuery.RowDetails> {

        /* renamed from: a, reason: collision with root package name */
        public static final RowDetails f23597a = new RowDetails();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ProductDetailsPageQuery.OnBasicCoreRow onBasicCoreRowA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ProductDetailsPageQuery.OnCoreRowUI onCoreRowUIA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("BasicCoreRow"))) {
                reader.o();
                onBasicCoreRowA = OnBasicCoreRow.a(reader, customScalarAdapters);
            } else {
                onBasicCoreRowA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CoreRowUI"))) {
                reader.o();
                onCoreRowUIA = OnCoreRowUI.a(reader, customScalarAdapters);
            }
            return new ProductDetailsPageQuery.RowDetails(str, onBasicCoreRowA, onCoreRowUIA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.RowDetails value = (ProductDetailsPageQuery.RowDetails) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23498a);
            ProductDetailsPageQuery.OnBasicCoreRow onBasicCoreRow = value.b;
            if (onBasicCoreRow != null) {
                OnBasicCoreRow.b(writer, customScalarAdapters, onBasicCoreRow);
            }
            ProductDetailsPageQuery.OnCoreRowUI onCoreRowUI = value.c;
            if (onCoreRowUI != null) {
                OnCoreRowUI.b(writer, customScalarAdapters, onCoreRowUI);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$RowUI;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$RowUI;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RowUI implements Adapter<ProductDetailsPageQuery.RowUI> {

        /* renamed from: a, reason: collision with root package name */
        public static final RowUI f23598a = new RowUI();
        public static final List b = CollectionsKt.R("leadingAsset", lqlqqlq.mmm006Dm006Dm, AnnotatedPrivateKey.LABEL);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductDetailsPageQuery.LeadingAsset leadingAsset = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    leadingAsset = (ProductDetailsPageQuery.LeadingAsset) Adapters.b(Adapters.c(LeadingAsset.f23540a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 != null) {
                return new ProductDetailsPageQuery.RowUI(leadingAsset, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.RowUI value = (ProductDetailsPageQuery.RowUI) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("leadingAsset");
            Adapters.b(Adapters.c(LeadingAsset.f23540a, true)).toJson(writer, customScalarAdapters, value.f23499a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$RowUI1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$RowUI1;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RowUI1 implements Adapter<ProductDetailsPageQuery.RowUI1> {

        /* renamed from: a, reason: collision with root package name */
        public static final RowUI1 f23599a = new RowUI1();
        public static final List b = CollectionsKt.R("leadingAsset", lqlqqlq.mmm006Dm006Dm, AnnotatedPrivateKey.LABEL);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductDetailsPageQuery.LeadingAsset1 leadingAsset1 = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    leadingAsset1 = (ProductDetailsPageQuery.LeadingAsset1) Adapters.b(Adapters.c(LeadingAsset1.f23541a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 != null) {
                return new ProductDetailsPageQuery.RowUI1(leadingAsset1, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.RowUI1 value = (ProductDetailsPageQuery.RowUI1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("leadingAsset");
            Adapters.b(Adapters.c(LeadingAsset1.f23541a, true)).toJson(writer, customScalarAdapters, value.f23500a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/product/details/adapter/ProductDetailsPageQuery_ResponseAdapter$Section;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Section;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Section implements Adapter<ProductDetailsPageQuery.Section> {

        /* renamed from: a, reason: collision with root package name */
        public static final Section f23600a = new Section();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ProductDetailsPageQuery.OnRatingsAndReviewsPreviewHeader onRatingsAndReviewsPreviewHeaderA;
            ProductDetailsPageQuery.OnRatingsAndReviewsRatingsDetails onRatingsAndReviewsRatingsDetailsA;
            ProductDetailsPageQuery.OnRatingsAndReviewsReviewDetails onRatingsAndReviewsReviewDetailsA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ProductDetailsPageQuery.OnRatingsAndReviewsPreviewCta onRatingsAndReviewsPreviewCtaA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RatingsAndReviewsPreviewHeader"))) {
                reader.o();
                onRatingsAndReviewsPreviewHeaderA = OnRatingsAndReviewsPreviewHeader.a(reader, customScalarAdapters);
            } else {
                onRatingsAndReviewsPreviewHeaderA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RatingsAndReviewsRatingsDetails"))) {
                reader.o();
                onRatingsAndReviewsRatingsDetailsA = OnRatingsAndReviewsRatingsDetails.a(reader, customScalarAdapters);
            } else {
                onRatingsAndReviewsRatingsDetailsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RatingsAndReviewsReviewDetails"))) {
                reader.o();
                onRatingsAndReviewsReviewDetailsA = OnRatingsAndReviewsReviewDetails.a(reader, customScalarAdapters);
            } else {
                onRatingsAndReviewsReviewDetailsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RatingsAndReviewsPreviewCta"))) {
                reader.o();
                onRatingsAndReviewsPreviewCtaA = OnRatingsAndReviewsPreviewCta.a(reader, customScalarAdapters);
            }
            return new ProductDetailsPageQuery.Section(str, onRatingsAndReviewsPreviewHeaderA, onRatingsAndReviewsRatingsDetailsA, onRatingsAndReviewsReviewDetailsA, onRatingsAndReviewsPreviewCtaA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductDetailsPageQuery.Section value = (ProductDetailsPageQuery.Section) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f23501a);
            ProductDetailsPageQuery.OnRatingsAndReviewsPreviewHeader onRatingsAndReviewsPreviewHeader = value.b;
            if (onRatingsAndReviewsPreviewHeader != null) {
                OnRatingsAndReviewsPreviewHeader.b(writer, customScalarAdapters, onRatingsAndReviewsPreviewHeader);
            }
            ProductDetailsPageQuery.OnRatingsAndReviewsRatingsDetails onRatingsAndReviewsRatingsDetails = value.c;
            if (onRatingsAndReviewsRatingsDetails != null) {
                OnRatingsAndReviewsRatingsDetails.b(writer, customScalarAdapters, onRatingsAndReviewsRatingsDetails);
            }
            ProductDetailsPageQuery.OnRatingsAndReviewsReviewDetails onRatingsAndReviewsReviewDetails = value.d;
            if (onRatingsAndReviewsReviewDetails != null) {
                OnRatingsAndReviewsReviewDetails.b(writer, customScalarAdapters, onRatingsAndReviewsReviewDetails);
            }
            ProductDetailsPageQuery.OnRatingsAndReviewsPreviewCta onRatingsAndReviewsPreviewCta = value.e;
            if (onRatingsAndReviewsPreviewCta != null) {
                OnRatingsAndReviewsPreviewCta.b(writer, customScalarAdapters, onRatingsAndReviewsPreviewCta);
            }
        }
    }
}
