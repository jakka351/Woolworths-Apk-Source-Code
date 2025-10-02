package au.com.woolworths.feature.product.list.v2.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.graphql.TealiumAnalytics;
import au.com.woolworths.android.onesite.graphql.GoogleAdCustomTargeting;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.product.list.v2.ProductListQuery;
import au.com.woolworths.feature.product.list.v2.fragment.InsetBanner;
import au.com.woolworths.feature.product.list.v2.fragment.InsetBannerImpl_ResponseAdapter;
import au.com.woolworths.feature.product.list.v2.fragment.VideoAdBottomSheet;
import au.com.woolworths.feature.product.list.v2.fragment.VideoAdBottomSheetImpl_ResponseAdapter;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.graphql.common.fragment.ProductCardImpl_ResponseAdapter;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.AdBannerNativeSize;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.adapter.ActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.AdBannerNativeSize_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ButtonStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CardHeight_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionPlacement_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerDisplayType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpression;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.lqlqqlq;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b_\bÇ\u0002\u0018\u00002\u00020\u0001:^\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_¨\u0006`"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter;", "", "Data", "ProductList", "Analytic", "OnAdobeTargetAnalytics", "ProductsFeed", "OnActionableCard", "OnGoogleAdBannerCard", "OnUniversalInventoryContainer", "GoogleAdBannerCard", "NextBestAction", "OnActionableCard1", "OnEdrOfferBanner", "BannerButtonAction", "Analytics", "BannerButtonLabel", "BannerAction", "Analytics1", "BannerAnalytics", "BannerImpressionAnalytics", "CommonAnalytics", "OnPersonalisedProductsBanner", "BannerImage", "Product", "BannerAction1", "Analytics2", "BannerAnalytics1", "BannerImpressionAnalytics1", "OnHorizontalList", "Item", "OnProductCard", "OnMerchCardFullImage", "MerchCardFullImageAction", "MerchCardFullImageBackgroundImageWithAlt", "MerchCardFullImageButton", "ButtonAction", "OnVideoAdUnit", "VideoAdUnitVideoAd", "FallbackImage", "Transcript", "TermsAndConditions", "Analytics3", "EventAnalytics", "Impression", "VideoPlay", "VideoPause", "VideoErrorImpression", "VideoAdUnitProductCard", "OnMerchCard", "MerchCardGridImageWithAlt", "MerchCardListImageWithAlt", "MerchCardButton", "ButtonAction1", "Analytics4", "MerchCardAction", "Analytics5", "MerchCardAnalytics", "MerchCardImpressionAnalytics", "OnInsetBanner", "Action", "OnProductCard1", "Filter", "FilterItem", "Banner", "Action1", "SortOption", "SortOptionsBanner", "MarketplaceFilterSwitch", "ButtonCta", "MarketplaceInfo", "Item1", "Footer", "MarketplaceBottomSheet", "PrimaryCta", "SecondaryCta", "Chip", "Text", "FacetChip", "Text1", "ZeroResult", "OnProductListZeroResult", "Item2", "OnZeroResultProductCategories", "ZeroResultProductCategoriesItem", "ProductCategoryTileAction", "OnHorizontalList1", "Item3", "OnProductCard2", "OnProductListFullScreenError", "Analytics6", "ImpressionAnalytics", "Cta", "LinkTextWithAlt", "LinkAction", "Analytics7", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ProductListQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$Action;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Action;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action implements Adapter<ProductListQuery.Action> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action f5526a = new Action();
        public static final List b = CollectionsKt.R("placement", "type", AnnotatedPrivateKey.LABEL, "url");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerActionPlacement insetBannerActionPlacementA = null;
            InsetBannerActionType insetBannerActionTypeA = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
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
                return new ProductListQuery.Action(insetBannerActionPlacementA, insetBannerActionTypeA, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.Action value = (ProductListQuery.Action) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("placement");
            InsetBannerActionPlacement_ResponseAdapter.b(writer, customScalarAdapters, value.f5404a);
            writer.F1("type");
            InsetBannerActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$Action1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Action1;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action1 implements Adapter<ProductListQuery.Action1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action1 f5527a = new Action1();
        public static final List b = CollectionsKt.R("placement", "type", AnnotatedPrivateKey.LABEL, "url");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerActionPlacement insetBannerActionPlacementA = null;
            InsetBannerActionType insetBannerActionTypeA = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
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
                return new ProductListQuery.Action1(insetBannerActionPlacementA, insetBannerActionTypeA, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.Action1 value = (ProductListQuery.Action1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("placement");
            InsetBannerActionPlacement_ResponseAdapter.b(writer, customScalarAdapters, value.f5405a);
            writer.F1("type");
            InsetBannerActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$Analytic;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Analytic;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytic implements Adapter<ProductListQuery.Analytic> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytic f5528a = new Analytic();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductListQuery.OnAdobeTargetAnalytics onAdobeTargetAnalyticsA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("AdobeTargetAnalytics"))) {
                reader.o();
                onAdobeTargetAnalyticsA = OnAdobeTargetAnalytics.a(reader, customScalarAdapters);
            }
            return new ProductListQuery.Analytic(str, onAdobeTargetAnalyticsA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.Analytic value = (ProductListQuery.Analytic) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5406a);
            ProductListQuery.OnAdobeTargetAnalytics onAdobeTargetAnalytics = value.b;
            if (onAdobeTargetAnalytics != null) {
                OnAdobeTargetAnalytics.b(writer, customScalarAdapters, onAdobeTargetAnalytics);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Analytics;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<ProductListQuery.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f5529a = new Analytics();
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
                return new ProductListQuery.Analytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.Analytics value = (ProductListQuery.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5407a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$Analytics1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Analytics1;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics1 implements Adapter<ProductListQuery.Analytics1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics1 f5530a = new Analytics1();
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
                return new ProductListQuery.Analytics1(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.Analytics1 value = (ProductListQuery.Analytics1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5408a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$Analytics2;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Analytics2;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics2 implements Adapter<ProductListQuery.Analytics2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics2 f5531a = new Analytics2();
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
                return new ProductListQuery.Analytics2(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.Analytics2 value = (ProductListQuery.Analytics2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5409a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$Analytics3;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Analytics3;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics3 implements Adapter<ProductListQuery.Analytics3> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics3 f5532a = new Analytics3();
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
                return new ProductListQuery.Analytics3(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.Analytics3 value = (ProductListQuery.Analytics3) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5410a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$Analytics4;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Analytics4;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics4 implements Adapter<ProductListQuery.Analytics4> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics4 f5533a = new Analytics4();
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
                return new ProductListQuery.Analytics4(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.Analytics4 value = (ProductListQuery.Analytics4) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5411a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$Analytics5;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Analytics5;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics5 implements Adapter<ProductListQuery.Analytics5> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics5 f5534a = new Analytics5();
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
                return new ProductListQuery.Analytics5(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.Analytics5 value = (ProductListQuery.Analytics5) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5412a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$Analytics6;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Analytics6;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics6 implements Adapter<ProductListQuery.Analytics6> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics6 f5535a = new Analytics6();
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
                return new ProductListQuery.Analytics6(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.Analytics6 value = (ProductListQuery.Analytics6) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5413a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$Analytics7;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Analytics7;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics7 implements Adapter<ProductListQuery.Analytics7> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics7 f5536a = new Analytics7();
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
                return new ProductListQuery.Analytics7(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.Analytics7 value = (ProductListQuery.Analytics7) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5414a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$Banner;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Banner;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Banner implements Adapter<ProductListQuery.Banner> {

        /* renamed from: a, reason: collision with root package name */
        public static final Banner f5537a = new Banner();
        public static final List b = CollectionsKt.R("displayType", "message", "iconUrl", UrlHandler.ACTION, "bannerTitle");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            String str2 = null;
            ProductListQuery.Action1 action1 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    insetBannerDisplayTypeA = InsetBannerDisplayType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    action1 = (ProductListQuery.Action1) Adapters.b(Adapters.c(Action1.f5527a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new ProductListQuery.Banner(insetBannerDisplayTypeA, str, str2, action1, str3);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.Banner value = (ProductListQuery.Banner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f5415a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("iconUrl");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1(UrlHandler.ACTION);
            Adapters.b(Adapters.c(Action1.f5527a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("bannerTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$BannerAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$BannerAction;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BannerAction implements Adapter<ProductListQuery.BannerAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final BannerAction f5538a = new BannerAction();
        public static final List b = CollectionsKt.R("__typename", "type", UrlHandler.ACTION, "analytics", "id");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ActionType actionTypeA = null;
            String str2 = null;
            ProductListQuery.Analytics1 analytics1 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    analytics1 = (ProductListQuery.Analytics1) Adapters.b(Adapters.c(Analytics1.f5530a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str2 != null) {
                return new ProductListQuery.BannerAction(str, actionTypeA, str2, analytics1, str3);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.BannerAction value = (ProductListQuery.BannerAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5416a);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics1.f5530a, true)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$BannerAction1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$BannerAction1;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BannerAction1 implements Adapter<ProductListQuery.BannerAction1> {

        /* renamed from: a, reason: collision with root package name */
        public static final BannerAction1 f5539a = new BannerAction1();
        public static final List b = CollectionsKt.R("__typename", "type", UrlHandler.ACTION, "analytics", "id");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ActionType actionTypeA = null;
            String str2 = null;
            ProductListQuery.Analytics2 analytics2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    analytics2 = (ProductListQuery.Analytics2) Adapters.b(Adapters.c(Analytics2.f5531a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str2 != null) {
                return new ProductListQuery.BannerAction1(str, actionTypeA, str2, analytics2, str3);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.BannerAction1 value = (ProductListQuery.BannerAction1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5417a);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics2.f5531a, true)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$BannerAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$BannerAnalytics;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BannerAnalytics implements Adapter<ProductListQuery.BannerAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final BannerAnalytics f5540a = new BannerAnalytics();
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
                return new ProductListQuery.BannerAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.BannerAnalytics value = (ProductListQuery.BannerAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5418a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$BannerAnalytics1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$BannerAnalytics1;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BannerAnalytics1 implements Adapter<ProductListQuery.BannerAnalytics1> {

        /* renamed from: a, reason: collision with root package name */
        public static final BannerAnalytics1 f5541a = new BannerAnalytics1();
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
                return new ProductListQuery.BannerAnalytics1(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.BannerAnalytics1 value = (ProductListQuery.BannerAnalytics1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5419a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$BannerButtonAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$BannerButtonAction;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BannerButtonAction implements Adapter<ProductListQuery.BannerButtonAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final BannerButtonAction f5542a = new BannerButtonAction();
        public static final List b = CollectionsKt.R("__typename", "type", UrlHandler.ACTION, "analytics", "id");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ActionType actionTypeA = null;
            String str2 = null;
            ProductListQuery.Analytics analytics = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    analytics = (ProductListQuery.Analytics) Adapters.b(Adapters.c(Analytics.f5529a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str2 != null) {
                return new ProductListQuery.BannerButtonAction(str, actionTypeA, str2, analytics, str3);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.BannerButtonAction value = (ProductListQuery.BannerButtonAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5420a);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics.f5529a, true)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$BannerButtonLabel;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$BannerButtonLabel;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BannerButtonLabel implements Adapter<ProductListQuery.BannerButtonLabel> {

        /* renamed from: a, reason: collision with root package name */
        public static final BannerButtonLabel f5543a = new BannerButtonLabel();
        public static final List b = CollectionsKt.R("__typename", TextBundle.TEXT_ENTRY, "altText");

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
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, TextBundle.TEXT_ENTRY);
                throw null;
            }
            if (str3 != null) {
                return new ProductListQuery.BannerButtonLabel(str, str2, str3);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.BannerButtonLabel value = (ProductListQuery.BannerButtonLabel) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5421a);
            writer.F1(TextBundle.TEXT_ENTRY);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$BannerImage;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$BannerImage;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BannerImage implements Adapter<ProductListQuery.BannerImage> {

        /* renamed from: a, reason: collision with root package name */
        public static final BannerImage f5544a = new BannerImage();
        public static final List b = CollectionsKt.R("__typename", "imageUrl", "altText");

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
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "imageUrl");
                throw null;
            }
            if (str3 != null) {
                return new ProductListQuery.BannerImage(str, str2, str3);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.BannerImage value = (ProductListQuery.BannerImage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5422a);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$BannerImpressionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$BannerImpressionAnalytics;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BannerImpressionAnalytics implements Adapter<ProductListQuery.BannerImpressionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final BannerImpressionAnalytics f5545a = new BannerImpressionAnalytics();
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
                return new ProductListQuery.BannerImpressionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.BannerImpressionAnalytics value = (ProductListQuery.BannerImpressionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5423a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$BannerImpressionAnalytics1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$BannerImpressionAnalytics1;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BannerImpressionAnalytics1 implements Adapter<ProductListQuery.BannerImpressionAnalytics1> {

        /* renamed from: a, reason: collision with root package name */
        public static final BannerImpressionAnalytics1 f5546a = new BannerImpressionAnalytics1();
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
                return new ProductListQuery.BannerImpressionAnalytics1(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.BannerImpressionAnalytics1 value = (ProductListQuery.BannerImpressionAnalytics1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5424a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$ButtonAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$ButtonAction;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonAction implements Adapter<ProductListQuery.ButtonAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final ButtonAction f5547a = new ButtonAction();
        public static final List b = CollectionsKt.R("__typename", "type", UrlHandler.ACTION, "id");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ActionType actionTypeA = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str2 != null) {
                return new ProductListQuery.ButtonAction(str, actionTypeA, str2, str3);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.ButtonAction value = (ProductListQuery.ButtonAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5425a);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$ButtonAction1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$ButtonAction1;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonAction1 implements Adapter<ProductListQuery.ButtonAction1> {

        /* renamed from: a, reason: collision with root package name */
        public static final ButtonAction1 f5548a = new ButtonAction1();
        public static final List b = CollectionsKt.R("__typename", "type", UrlHandler.ACTION, "id", "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ActionType actionTypeA = null;
            String str2 = null;
            String str3 = null;
            ProductListQuery.Analytics4 analytics4 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    analytics4 = (ProductListQuery.Analytics4) Adapters.b(Adapters.c(Analytics4.f5533a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str2 != null) {
                return new ProductListQuery.ButtonAction1(str, actionTypeA, str2, str3, analytics4);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.ButtonAction1 value = (ProductListQuery.ButtonAction1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5426a);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics4.f5533a, true)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$ButtonCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$ButtonCta;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ButtonCta implements Adapter<ProductListQuery.ButtonCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final ButtonCta f5549a = new ButtonCta();
        public static final List b = CollectionsKt.Q(AnnotatedPrivateKey.LABEL);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ProductListQuery.ButtonCta(str);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.ButtonCta value = (ProductListQuery.ButtonCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5427a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$Chip;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Chip;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Chip implements Adapter<ProductListQuery.Chip> {

        /* renamed from: a, reason: collision with root package name */
        public static final Chip f5550a = new Chip();
        public static final List b = CollectionsKt.R("id", "isSelected", TextBundle.TEXT_ENTRY, "persistentId");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Boolean bool = null;
            ProductListQuery.Text text = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    text = (ProductListQuery.Text) Adapters.c(Text.f5610a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (bool == null) {
                Assertions.a(reader, "isSelected");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (text != null) {
                return new ProductListQuery.Chip(str, zBooleanValue, text, str2);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.Chip value = (ProductListQuery.Chip) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5428a);
            writer.F1("isSelected");
            d.B(value.b, Adapters.f, writer, customScalarAdapters, TextBundle.TEXT_ENTRY);
            Adapters.c(Text.f5610a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("persistentId");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$CommonAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$CommonAnalytics;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CommonAnalytics implements Adapter<ProductListQuery.CommonAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final CommonAnalytics f5551a = new CommonAnalytics();
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
                return new ProductListQuery.CommonAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.CommonAnalytics value = (ProductListQuery.CommonAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5429a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$Cta;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Cta;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Cta implements Adapter<ProductListQuery.Cta> {

        /* renamed from: a, reason: collision with root package name */
        public static final Cta f5552a = new Cta();
        public static final List b = CollectionsKt.R("linkId", "linkTextWithAlt", "linkAction");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ProductListQuery.LinkTextWithAlt linkTextWithAlt = null;
            ProductListQuery.LinkAction linkAction = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    linkTextWithAlt = (ProductListQuery.LinkTextWithAlt) Adapters.c(LinkTextWithAlt.f5568a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    linkAction = (ProductListQuery.LinkAction) Adapters.c(LinkAction.f5567a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (linkTextWithAlt == null) {
                Assertions.a(reader, "linkTextWithAlt");
                throw null;
            }
            if (linkAction != null) {
                return new ProductListQuery.Cta(str, linkTextWithAlt, linkAction);
            }
            Assertions.a(reader, "linkAction");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.Cta value = (ProductListQuery.Cta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("linkId");
            Adapters.i.toJson(writer, customScalarAdapters, value.f5430a);
            writer.F1("linkTextWithAlt");
            Adapters.c(LinkTextWithAlt.f5568a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("linkAction");
            Adapters.c(LinkAction.f5567a, false).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Data;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<ProductListQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f5553a = new Data();
        public static final List b = CollectionsKt.Q("productList");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductListQuery.ProductList productList = null;
            while (reader.o2(b) == 0) {
                productList = (ProductListQuery.ProductList) Adapters.c(ProductList.f5604a, false).fromJson(reader, customScalarAdapters);
            }
            if (productList != null) {
                return new ProductListQuery.Data(productList);
            }
            Assertions.a(reader, "productList");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.Data value = (ProductListQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productList");
            Adapters.c(ProductList.f5604a, false).toJson(writer, customScalarAdapters, value.f5431a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$EventAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$EventAnalytics;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EventAnalytics implements Adapter<ProductListQuery.EventAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final EventAnalytics f5554a = new EventAnalytics();
        public static final List b = CollectionsKt.R("impression", "videoPlay", "videoPause", "videoErrorImpression");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductListQuery.Impression impression = null;
            ProductListQuery.VideoPlay videoPlay = null;
            ProductListQuery.VideoPause videoPause = null;
            ProductListQuery.VideoErrorImpression videoErrorImpression = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    impression = (ProductListQuery.Impression) Adapters.b(Adapters.c(Impression.f5561a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    videoPlay = (ProductListQuery.VideoPlay) Adapters.b(Adapters.c(VideoPlay.f5617a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    videoPause = (ProductListQuery.VideoPause) Adapters.b(Adapters.c(VideoPause.f5616a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        return new ProductListQuery.EventAnalytics(impression, videoPlay, videoPause, videoErrorImpression);
                    }
                    videoErrorImpression = (ProductListQuery.VideoErrorImpression) Adapters.b(Adapters.c(VideoErrorImpression.f5615a, true)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.EventAnalytics value = (ProductListQuery.EventAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("impression");
            Adapters.b(Adapters.c(Impression.f5561a, true)).toJson(writer, customScalarAdapters, value.f5432a);
            writer.F1("videoPlay");
            Adapters.b(Adapters.c(VideoPlay.f5617a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("videoPause");
            Adapters.b(Adapters.c(VideoPause.f5616a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("videoErrorImpression");
            Adapters.b(Adapters.c(VideoErrorImpression.f5615a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$FacetChip;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$FacetChip;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FacetChip implements Adapter<ProductListQuery.FacetChip> {

        /* renamed from: a, reason: collision with root package name */
        public static final FacetChip f5555a = new FacetChip();
        public static final List b = CollectionsKt.R("id", "isSelected", TextBundle.TEXT_ENTRY);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Boolean bool = null;
            ProductListQuery.Text1 text1 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    text1 = (ProductListQuery.Text1) Adapters.c(Text1.f5611a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "id");
                throw null;
            }
            if (bool == null) {
                Assertions.a(reader, "isSelected");
                throw null;
            }
            boolean zBooleanValue = bool.booleanValue();
            if (text1 != null) {
                return new ProductListQuery.FacetChip(str, zBooleanValue, text1);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.FacetChip value = (ProductListQuery.FacetChip) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5433a);
            writer.F1("isSelected");
            d.B(value.b, Adapters.f, writer, customScalarAdapters, TextBundle.TEXT_ENTRY);
            Adapters.c(Text1.f5611a, false).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$FallbackImage;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$FallbackImage;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FallbackImage implements Adapter<ProductListQuery.FallbackImage> {

        /* renamed from: a, reason: collision with root package name */
        public static final FallbackImage f5556a = new FallbackImage();
        public static final List b = CollectionsKt.R("imageUrl", "altText");

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
                Assertions.a(reader, "imageUrl");
                throw null;
            }
            if (str2 != null) {
                return new ProductListQuery.FallbackImage(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.FallbackImage value = (ProductListQuery.FallbackImage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5434a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$Filter;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Filter;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Filter implements Adapter<ProductListQuery.Filter> {

        /* renamed from: a, reason: collision with root package name */
        public static final Filter f5557a = new Filter();
        public static final List b = CollectionsKt.R("headerKey", "headerTitle", "filterItems", "banner");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            ProductListQuery.Banner banner = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    arrayListFromJson = Adapters.a(Adapters.c(FilterItem.f5558a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    banner = (ProductListQuery.Banner) Adapters.b(Adapters.c(Banner.f5537a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "headerKey");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "headerTitle");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new ProductListQuery.Filter(str, str2, arrayListFromJson, banner);
            }
            Assertions.a(reader, "filterItems");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.Filter value = (ProductListQuery.Filter) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("headerKey");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5435a);
            writer.F1("headerTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("filterItems");
            Adapters.a(Adapters.c(FilterItem.f5558a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("banner");
            Adapters.b(Adapters.c(Banner.f5537a, false)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$FilterItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$FilterItem;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FilterItem implements Adapter<ProductListQuery.FilterItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final FilterItem f5558a = new FilterItem();
        public static final List b = CollectionsKt.R("key", "title", AnnotatedPrivateKey.LABEL, "parentKey", "hasChildren", "isApplied");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            Boolean bool3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = bool2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = bool2;
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool = bool2;
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool = bool2;
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    bool = bool2;
                    bool3 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool4 = bool2;
            if (str == null) {
                Assertions.a(reader, "key");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool4 == null) {
                Assertions.a(reader, "hasChildren");
                throw null;
            }
            Boolean bool5 = bool3;
            boolean zBooleanValue = bool4.booleanValue();
            if (bool5 != null) {
                return new ProductListQuery.FilterItem(str, str2, str3, str4, zBooleanValue, bool5.booleanValue());
            }
            Assertions.a(reader, "isApplied");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.FilterItem value = (ProductListQuery.FilterItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("key");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5436a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("parentKey");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
            writer.F1("hasChildren");
            Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
            d.B(value.e, adapters$BooleanAdapter$1, writer, customScalarAdapters, "isApplied");
            adapters$BooleanAdapter$1.toJson(writer, customScalarAdapters, Boolean.valueOf(value.f));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$Footer;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Footer;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Footer implements Adapter<ProductListQuery.Footer> {

        /* renamed from: a, reason: collision with root package name */
        public static final Footer f5559a = new Footer();
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
                return new ProductListQuery.Footer(str, str2, str3);
            }
            Assertions.a(reader, "linkUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.Footer value = (ProductListQuery.Footer) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5437a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("linkUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$GoogleAdBannerCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$GoogleAdBannerCard;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class GoogleAdBannerCard implements Adapter<ProductListQuery.GoogleAdBannerCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final GoogleAdBannerCard f5560a = new GoogleAdBannerCard();
        public static final List b = CollectionsKt.R(OutOfContextTestingActivity.AD_UNIT_KEY, "nativeCustomTemplateId", "iabSpec", "iabSize", "height", "targeting", "correlator", "_excluded");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            AdBannerNativeSize adBannerNativeSizeA = null;
            GoogleAdCustomTargeting googleAdCustomTargeting = null;
            String str4 = null;
            Boolean bool3 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        bool = bool2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
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
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        adBannerNativeSizeA = AdBannerNativeSize_ResponseAdapter.a(reader, customScalarAdapters);
                        continue;
                    case 5:
                        bool = bool2;
                        googleAdCustomTargeting = (GoogleAdCustomTargeting) d.k(customScalarAdapters, au.com.woolworths.shop.graphql.type.GoogleAdCustomTargeting.f11436a, reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = bool2;
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = bool2;
                        bool3 = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool4 = bool2;
                        if (str == null) {
                            Assertions.a(reader, OutOfContextTestingActivity.AD_UNIT_KEY);
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "nativeCustomTemplateId");
                            throw null;
                        }
                        if (bool4 == null) {
                            Assertions.a(reader, "iabSpec");
                            throw null;
                        }
                        boolean zBooleanValue = bool4.booleanValue();
                        if (adBannerNativeSizeA != null) {
                            return new ProductListQuery.GoogleAdBannerCard(str, str2, zBooleanValue, str3, adBannerNativeSizeA, googleAdCustomTargeting, str4, bool3);
                        }
                        Assertions.a(reader, "height");
                        throw null;
                }
                bool2 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.GoogleAdBannerCard value = (ProductListQuery.GoogleAdBannerCard) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(OutOfContextTestingActivity.AD_UNIT_KEY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5438a);
            writer.F1("nativeCustomTemplateId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("iabSpec");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, "iabSize");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("height");
            AdBannerNativeSize_ResponseAdapter.b(writer, customScalarAdapters, value.e);
            writer.F1("targeting");
            Adapters.b(customScalarAdapters.e(au.com.woolworths.shop.graphql.type.GoogleAdCustomTargeting.f11436a)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("correlator");
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.h);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$Impression;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Impression;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Impression implements Adapter<ProductListQuery.Impression> {

        /* renamed from: a, reason: collision with root package name */
        public static final Impression f5561a = new Impression();
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
                return new ProductListQuery.Impression(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.Impression value = (ProductListQuery.Impression) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5439a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$ImpressionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$ImpressionAnalytics;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImpressionAnalytics implements Adapter<ProductListQuery.ImpressionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImpressionAnalytics f5562a = new ImpressionAnalytics();
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
                return new ProductListQuery.ImpressionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.ImpressionAnalytics value = (ProductListQuery.ImpressionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5440a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Item;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<ProductListQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f5563a = new Item();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ProductListQuery.OnProductCard onProductCardA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ProductListQuery.OnMerchCardFullImage onMerchCardFullImageA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductCard"))) {
                reader.o();
                onProductCardA = OnProductCard.a(reader, customScalarAdapters);
            } else {
                onProductCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("MerchCardFullImage"))) {
                reader.o();
                onMerchCardFullImageA = OnMerchCardFullImage.a(reader, customScalarAdapters);
            }
            return new ProductListQuery.Item(str, onProductCardA, onMerchCardFullImageA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.Item value = (ProductListQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5441a);
            ProductListQuery.OnProductCard onProductCard = value.b;
            if (onProductCard != null) {
                OnProductCard.b(writer, customScalarAdapters, onProductCard);
            }
            ProductListQuery.OnMerchCardFullImage onMerchCardFullImage = value.c;
            if (onMerchCardFullImage != null) {
                OnMerchCardFullImage.b(writer, customScalarAdapters, onMerchCardFullImage);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$Item1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Item1;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item1 implements Adapter<ProductListQuery.Item1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item1 f5564a = new Item1();
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
                return new ProductListQuery.Item1(str, str2, str3);
            }
            Assertions.a(reader, "imageUrl");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.Item1 value = (ProductListQuery.Item1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5442a);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$Item2;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Item2;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item2 implements Adapter<ProductListQuery.Item2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item2 f5565a = new Item2();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ProductListQuery.OnZeroResultProductCategories onZeroResultProductCategoriesA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ProductListQuery.OnHorizontalList1 onHorizontalList1A = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ZeroResultProductCategories"))) {
                reader.o();
                onZeroResultProductCategoriesA = OnZeroResultProductCategories.a(reader, customScalarAdapters);
            } else {
                onZeroResultProductCategoriesA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HorizontalList"))) {
                reader.o();
                onHorizontalList1A = OnHorizontalList1.a(reader, customScalarAdapters);
            }
            return new ProductListQuery.Item2(str, onZeroResultProductCategoriesA, onHorizontalList1A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.Item2 value = (ProductListQuery.Item2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5443a);
            ProductListQuery.OnZeroResultProductCategories onZeroResultProductCategories = value.b;
            if (onZeroResultProductCategories != null) {
                OnZeroResultProductCategories.b(writer, customScalarAdapters, onZeroResultProductCategories);
            }
            ProductListQuery.OnHorizontalList1 onHorizontalList1 = value.c;
            if (onHorizontalList1 != null) {
                OnHorizontalList1.b(writer, customScalarAdapters, onHorizontalList1);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$Item3;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Item3;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item3 implements Adapter<ProductListQuery.Item3> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item3 f5566a = new Item3();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductListQuery.OnProductCard2 onProductCard2A = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("ProductCard"))) {
                reader.o();
                onProductCard2A = OnProductCard2.a(reader, customScalarAdapters);
            }
            return new ProductListQuery.Item3(str, onProductCard2A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.Item3 value = (ProductListQuery.Item3) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5444a);
            ProductListQuery.OnProductCard2 onProductCard2 = value.b;
            if (onProductCard2 != null) {
                OnProductCard2.b(writer, customScalarAdapters, onProductCard2);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$LinkAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$LinkAction;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkAction implements Adapter<ProductListQuery.LinkAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkAction f5567a = new LinkAction();
        public static final List b = CollectionsKt.R(UrlHandler.ACTION, "id", "type", "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ActionType actionTypeA = null;
            ProductListQuery.Analytics7 analytics7 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    analytics7 = (ProductListQuery.Analytics7) Adapters.b(Adapters.c(Analytics7.f5536a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, UrlHandler.ACTION);
                throw null;
            }
            if (actionTypeA != null) {
                return new ProductListQuery.LinkAction(str, str2, actionTypeA, analytics7);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.LinkAction value = (ProductListQuery.LinkAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5445a);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics7.f5536a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$LinkTextWithAlt;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$LinkTextWithAlt;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkTextWithAlt implements Adapter<ProductListQuery.LinkTextWithAlt> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkTextWithAlt f5568a = new LinkTextWithAlt();
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
                return new ProductListQuery.LinkTextWithAlt(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.LinkTextWithAlt value = (ProductListQuery.LinkTextWithAlt) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5446a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$MarketplaceBottomSheet;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$MarketplaceBottomSheet;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MarketplaceBottomSheet implements Adapter<ProductListQuery.MarketplaceBottomSheet> {

        /* renamed from: a, reason: collision with root package name */
        public static final MarketplaceBottomSheet f5569a = new MarketplaceBottomSheet();
        public static final List b = CollectionsKt.R("bottomSheetTitle", "bottomSheetBody", "primaryCta", "secondaryCta", "showOnceOnly");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ProductListQuery.PrimaryCta primaryCta = null;
            ProductListQuery.SecondaryCta secondaryCta = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    primaryCta = (ProductListQuery.PrimaryCta) Adapters.b(Adapters.c(PrimaryCta.f5601a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    secondaryCta = (ProductListQuery.SecondaryCta) Adapters.b(Adapters.c(SecondaryCta.f5606a, false)).fromJson(reader, customScalarAdapters);
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
                return new ProductListQuery.MarketplaceBottomSheet(str, str2, primaryCta, secondaryCta, bool);
            }
            Assertions.a(reader, "bottomSheetBody");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.MarketplaceBottomSheet value = (ProductListQuery.MarketplaceBottomSheet) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("bottomSheetTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5447a);
            writer.F1("bottomSheetBody");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("primaryCta");
            Adapters.b(Adapters.c(PrimaryCta.f5601a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("secondaryCta");
            Adapters.b(Adapters.c(SecondaryCta.f5606a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("showOnceOnly");
            Adapters.l.toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$MarketplaceFilterSwitch;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$MarketplaceFilterSwitch;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MarketplaceFilterSwitch implements Adapter<ProductListQuery.MarketplaceFilterSwitch> {

        /* renamed from: a, reason: collision with root package name */
        public static final MarketplaceFilterSwitch f5570a = new MarketplaceFilterSwitch();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "imageUrl", "buttonCta", "value");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            ProductListQuery.ButtonCta buttonCta = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = bool2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = bool2;
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool = bool2;
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool = bool2;
                    buttonCta = (ProductListQuery.ButtonCta) Adapters.b(Adapters.c(ButtonCta.f5549a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool3 = bool2;
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (bool3 != null) {
                return new ProductListQuery.MarketplaceFilterSwitch(str, str2, str3, buttonCta, bool3.booleanValue());
            }
            Assertions.a(reader, "value");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.MarketplaceFilterSwitch value = (ProductListQuery.MarketplaceFilterSwitch) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5448a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("imageUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("buttonCta");
            Adapters.b(Adapters.c(ButtonCta.f5549a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("value");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.e));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$MarketplaceInfo;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$MarketplaceInfo;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MarketplaceInfo implements Adapter<ProductListQuery.MarketplaceInfo> {

        /* renamed from: a, reason: collision with root package name */
        public static final MarketplaceInfo f5571a = new MarketplaceInfo();
        public static final List b = CollectionsKt.R("title", "items", "footer");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            ProductListQuery.Footer footer = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson = Adapters.a(Adapters.c(Item1.f5564a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    footer = (ProductListQuery.Footer) Adapters.b(Adapters.c(Footer.f5559a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new ProductListQuery.MarketplaceInfo(str, arrayListFromJson, footer);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.MarketplaceInfo value = (ProductListQuery.MarketplaceInfo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5449a);
            writer.F1("items");
            Adapters.a(Adapters.c(Item1.f5564a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("footer");
            Adapters.b(Adapters.c(Footer.f5559a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$MerchCardAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$MerchCardAction;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MerchCardAction implements Adapter<ProductListQuery.MerchCardAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final MerchCardAction f5572a = new MerchCardAction();
        public static final List b = CollectionsKt.R("__typename", "type", UrlHandler.ACTION, "id", "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ActionType actionTypeA = null;
            String str2 = null;
            String str3 = null;
            ProductListQuery.Analytics5 analytics5 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    analytics5 = (ProductListQuery.Analytics5) Adapters.b(Adapters.c(Analytics5.f5534a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str2 != null) {
                return new ProductListQuery.MerchCardAction(str, actionTypeA, str2, str3, analytics5);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.MerchCardAction value = (ProductListQuery.MerchCardAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5450a);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics5.f5534a, true)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$MerchCardAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$MerchCardAnalytics;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MerchCardAnalytics implements Adapter<ProductListQuery.MerchCardAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final MerchCardAnalytics f5573a = new MerchCardAnalytics();
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
                return new ProductListQuery.MerchCardAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.MerchCardAnalytics value = (ProductListQuery.MerchCardAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5451a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$MerchCardButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$MerchCardButton;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MerchCardButton implements Adapter<ProductListQuery.MerchCardButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final MerchCardButton f5574a = new MerchCardButton();
        public static final List b = CollectionsKt.R("__typename", "buttonId", AnnotatedPrivateKey.LABEL, "style", "enabled", "iconUrl", "altText", "buttonAction");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            ButtonStyle buttonStyle = null;
            String str4 = null;
            String str5 = null;
            ProductListQuery.ButtonAction1 buttonAction1 = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        bool = bool2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool = bool2;
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool = bool2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool = bool2;
                        buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 5:
                        bool = bool2;
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = bool2;
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = bool2;
                        buttonAction1 = (ProductListQuery.ButtonAction1) Adapters.b(Adapters.c(ButtonAction1.f5548a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool3 = bool2;
                        if (str == null) {
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                            throw null;
                        }
                        if (bool3 != null) {
                            return new ProductListQuery.MerchCardButton(str, str2, str3, buttonStyle, bool3.booleanValue(), str4, str5, buttonAction1);
                        }
                        Assertions.a(reader, "enabled");
                        throw null;
                }
                bool2 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.MerchCardButton value = (ProductListQuery.MerchCardButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5452a);
            writer.F1("buttonId");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.d);
            writer.F1("enabled");
            d.B(value.e, Adapters.f, writer, customScalarAdapters, "iconUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1("altText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
            writer.F1("buttonAction");
            Adapters.b(Adapters.c(ButtonAction1.f5548a, false)).toJson(writer, customScalarAdapters, value.h);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$MerchCardFullImageAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$MerchCardFullImageAction;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MerchCardFullImageAction implements Adapter<ProductListQuery.MerchCardFullImageAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final MerchCardFullImageAction f5575a = new MerchCardFullImageAction();
        public static final List b = CollectionsKt.R("__typename", "type", UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ActionType actionTypeA = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str2 != null) {
                return new ProductListQuery.MerchCardFullImageAction(str, actionTypeA, str2);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.MerchCardFullImageAction value = (ProductListQuery.MerchCardFullImageAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5453a);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$MerchCardFullImageBackgroundImageWithAlt;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$MerchCardFullImageBackgroundImageWithAlt;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MerchCardFullImageBackgroundImageWithAlt implements Adapter<ProductListQuery.MerchCardFullImageBackgroundImageWithAlt> {

        /* renamed from: a, reason: collision with root package name */
        public static final MerchCardFullImageBackgroundImageWithAlt f5576a = new MerchCardFullImageBackgroundImageWithAlt();
        public static final List b = CollectionsKt.R("__typename", "imageUrl", "altText");

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
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "imageUrl");
                throw null;
            }
            if (str3 != null) {
                return new ProductListQuery.MerchCardFullImageBackgroundImageWithAlt(str, str2, str3);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.MerchCardFullImageBackgroundImageWithAlt value = (ProductListQuery.MerchCardFullImageBackgroundImageWithAlt) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5454a);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$MerchCardFullImageButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$MerchCardFullImageButton;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MerchCardFullImageButton implements Adapter<ProductListQuery.MerchCardFullImageButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final MerchCardFullImageButton f5577a = new MerchCardFullImageButton();
        public static final List b = CollectionsKt.R("__typename", "buttonId", AnnotatedPrivateKey.LABEL, "style", "enabled", "iconUrl", "altText", "buttonAction");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            ButtonStyle buttonStyle = null;
            String str4 = null;
            String str5 = null;
            ProductListQuery.ButtonAction buttonAction = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        bool = bool2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool = bool2;
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool = bool2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool = bool2;
                        buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    case 5:
                        bool = bool2;
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = bool2;
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = bool2;
                        buttonAction = (ProductListQuery.ButtonAction) Adapters.b(Adapters.c(ButtonAction.f5547a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Boolean bool3 = bool2;
                        if (str == null) {
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                            throw null;
                        }
                        if (bool3 != null) {
                            return new ProductListQuery.MerchCardFullImageButton(str, str2, str3, buttonStyle, bool3.booleanValue(), str4, str5, buttonAction);
                        }
                        Assertions.a(reader, "enabled");
                        throw null;
                }
                bool2 = bool;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.MerchCardFullImageButton value = (ProductListQuery.MerchCardFullImageButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5455a);
            writer.F1("buttonId");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.d);
            writer.F1("enabled");
            d.B(value.e, Adapters.f, writer, customScalarAdapters, "iconUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1("altText");
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
            writer.F1("buttonAction");
            Adapters.b(Adapters.c(ButtonAction.f5547a, false)).toJson(writer, customScalarAdapters, value.h);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$MerchCardGridImageWithAlt;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$MerchCardGridImageWithAlt;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MerchCardGridImageWithAlt implements Adapter<ProductListQuery.MerchCardGridImageWithAlt> {

        /* renamed from: a, reason: collision with root package name */
        public static final MerchCardGridImageWithAlt f5578a = new MerchCardGridImageWithAlt();
        public static final List b = CollectionsKt.R("__typename", "imageUrl", "altText");

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
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "imageUrl");
                throw null;
            }
            if (str3 != null) {
                return new ProductListQuery.MerchCardGridImageWithAlt(str, str2, str3);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.MerchCardGridImageWithAlt value = (ProductListQuery.MerchCardGridImageWithAlt) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5456a);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$MerchCardImpressionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$MerchCardImpressionAnalytics;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MerchCardImpressionAnalytics implements Adapter<ProductListQuery.MerchCardImpressionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final MerchCardImpressionAnalytics f5579a = new MerchCardImpressionAnalytics();
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
                return new ProductListQuery.MerchCardImpressionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.MerchCardImpressionAnalytics value = (ProductListQuery.MerchCardImpressionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5457a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$MerchCardListImageWithAlt;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$MerchCardListImageWithAlt;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class MerchCardListImageWithAlt implements Adapter<ProductListQuery.MerchCardListImageWithAlt> {

        /* renamed from: a, reason: collision with root package name */
        public static final MerchCardListImageWithAlt f5580a = new MerchCardListImageWithAlt();
        public static final List b = CollectionsKt.R("__typename", "imageUrl", "altText");

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
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "imageUrl");
                throw null;
            }
            if (str3 != null) {
                return new ProductListQuery.MerchCardListImageWithAlt(str, str2, str3);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.MerchCardListImageWithAlt value = (ProductListQuery.MerchCardListImageWithAlt) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5458a);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$NextBestAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$NextBestAction;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class NextBestAction implements Adapter<ProductListQuery.NextBestAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final NextBestAction f5581a = new NextBestAction();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ProductListQuery.OnActionableCard1 onActionableCard1A;
            ProductListQuery.OnEdrOfferBanner onEdrOfferBannerA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ProductListQuery.OnPersonalisedProductsBanner onPersonalisedProductsBannerA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ActionableCard"))) {
                reader.o();
                onActionableCard1A = OnActionableCard1.a(reader, customScalarAdapters);
            } else {
                onActionableCard1A = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("EdrOfferBanner"), BooleanExpressions.d("includeNhpEdrBanner")))) {
                reader.o();
                onEdrOfferBannerA = OnEdrOfferBanner.a(reader, customScalarAdapters);
            } else {
                onEdrOfferBannerA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("PersonalisedProductsBanner"), BooleanExpressions.d("includeNhpPersonalisedProductsBanner")))) {
                reader.o();
                onPersonalisedProductsBannerA = OnPersonalisedProductsBanner.a(reader, customScalarAdapters);
            }
            return new ProductListQuery.NextBestAction(str, onActionableCard1A, onEdrOfferBannerA, onPersonalisedProductsBannerA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.NextBestAction value = (ProductListQuery.NextBestAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5459a);
            ProductListQuery.OnActionableCard1 onActionableCard1 = value.b;
            if (onActionableCard1 != null) {
                OnActionableCard1.b(writer, customScalarAdapters, onActionableCard1);
            }
            ProductListQuery.OnEdrOfferBanner onEdrOfferBanner = value.c;
            if (onEdrOfferBanner != null) {
                OnEdrOfferBanner.b(writer, customScalarAdapters, onEdrOfferBanner);
            }
            ProductListQuery.OnPersonalisedProductsBanner onPersonalisedProductsBanner = value.d;
            if (onPersonalisedProductsBanner != null) {
                OnPersonalisedProductsBanner.b(writer, customScalarAdapters, onPersonalisedProductsBanner);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$OnActionableCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnActionableCard;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnActionableCard implements Adapter<ProductListQuery.OnActionableCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5582a = CollectionsKt.R("image", "altText", "cardHeight", "link", "analytics", "_excluded");

        public static ProductListQuery.OnActionableCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            CardHeight cardHeightA = null;
            String str3 = null;
            TealiumAnalytics tealiumAnalytics = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(f5582a);
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
                return new ProductListQuery.OnActionableCard(str, str2, cardHeightA, str3, tealiumAnalytics, bool);
            }
            Assertions.a(reader, "link");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductListQuery.OnActionableCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("image");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5460a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("cardHeight");
            CardHeight_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1("link");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("analytics");
            Adapters.b(customScalarAdapters.e(au.com.woolworths.shop.graphql.type.TealiumAnalytics.f11963a)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductListQuery.OnActionableCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$OnActionableCard1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnActionableCard1;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnActionableCard1 implements Adapter<ProductListQuery.OnActionableCard1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5583a = CollectionsKt.R("__typename", "link", "image", "altText", "cardHeight", "analytics", "_excluded");

        public static ProductListQuery.OnActionableCard1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            CardHeight cardHeightA = null;
            TealiumAnalytics tealiumAnalytics = null;
            Boolean bool = null;
            while (true) {
                switch (reader.o2(f5583a)) {
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
                        cardHeightA = CardHeight_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 5:
                        tealiumAnalytics = (TealiumAnalytics) d.k(customScalarAdapters, au.com.woolworths.shop.graphql.type.TealiumAnalytics.f11963a, reader, customScalarAdapters);
                        break;
                    case 6:
                        bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "link");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "image");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "altText");
                            throw null;
                        }
                        if (cardHeightA != null) {
                            return new ProductListQuery.OnActionableCard1(str, str2, str3, str4, cardHeightA, tealiumAnalytics, bool);
                        }
                        Assertions.a(reader, "cardHeight");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductListQuery.OnActionableCard1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5461a);
            writer.F1("link");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("image");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("cardHeight");
            CardHeight_ResponseAdapter.b(writer, customScalarAdapters, value.e);
            writer.F1("analytics");
            Adapters.b(customScalarAdapters.e(au.com.woolworths.shop.graphql.type.TealiumAnalytics.f11963a)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.g);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductListQuery.OnActionableCard1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$OnAdobeTargetAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnAdobeTargetAnalytics;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAdobeTargetAnalytics implements Adapter<ProductListQuery.OnAdobeTargetAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5584a = CollectionsKt.R("tnta", "pe");

        public static ProductListQuery.OnAdobeTargetAnalytics a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f5584a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new ProductListQuery.OnAdobeTargetAnalytics(str, str2);
                    }
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductListQuery.OnAdobeTargetAnalytics value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("tnta");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f5462a);
            writer.F1("pe");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductListQuery.OnAdobeTargetAnalytics) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$OnEdrOfferBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnEdrOfferBanner;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnEdrOfferBanner implements Adapter<ProductListQuery.OnEdrOfferBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5585a = CollectionsKt.R("__typename", "offerId", "offerIdV1", "linkedEdrHashCrn", "bannerTitle", "bannerDescription", "bannerIconUrl", "bannerButtonAction", "bannerButtonLabel", "bannerAction", "bannerAnalytics", "bannerImpressionAnalytics", "commonAnalytics");

        public static ProductListQuery.OnEdrOfferBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            ProductListQuery.BannerButtonAction bannerButtonAction = null;
            ProductListQuery.BannerButtonLabel bannerButtonLabel = null;
            ProductListQuery.BannerAction bannerAction = null;
            ProductListQuery.BannerAnalytics bannerAnalytics = null;
            ProductListQuery.BannerImpressionAnalytics bannerImpressionAnalytics = null;
            ProductListQuery.CommonAnalytics commonAnalytics = null;
            while (true) {
                switch (reader.o2(f5585a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
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
                        bannerButtonAction = (ProductListQuery.BannerButtonAction) Adapters.b(Adapters.c(BannerButtonAction.f5542a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        bannerButtonLabel = (ProductListQuery.BannerButtonLabel) Adapters.b(Adapters.c(BannerButtonLabel.f5543a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        bannerAction = (ProductListQuery.BannerAction) Adapters.b(Adapters.c(BannerAction.f5538a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        bannerAnalytics = (ProductListQuery.BannerAnalytics) Adapters.b(Adapters.c(BannerAnalytics.f5540a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        bannerImpressionAnalytics = (ProductListQuery.BannerImpressionAnalytics) Adapters.b(Adapters.c(BannerImpressionAnalytics.f5545a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 12:
                        commonAnalytics = (ProductListQuery.CommonAnalytics) Adapters.b(Adapters.c(CommonAnalytics.f5551a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "offerId");
                            throw null;
                        }
                        if (str4 != null) {
                            return new ProductListQuery.OnEdrOfferBanner(str, str2, str3, str4, str5, str6, str7, bannerButtonAction, bannerButtonLabel, bannerAction, bannerAnalytics, bannerImpressionAnalytics, commonAnalytics);
                        }
                        Assertions.a(reader, "linkedEdrHashCrn");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductListQuery.OnEdrOfferBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5463a);
            writer.F1("offerId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("offerIdV1");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("linkedEdrHashCrn");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("bannerTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("bannerDescription");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1("bannerIconUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
            writer.F1("bannerButtonAction");
            Adapters.b(Adapters.c(BannerButtonAction.f5542a, false)).toJson(writer, customScalarAdapters, value.h);
            writer.F1("bannerButtonLabel");
            Adapters.b(Adapters.c(BannerButtonLabel.f5543a, false)).toJson(writer, customScalarAdapters, value.i);
            writer.F1("bannerAction");
            Adapters.b(Adapters.c(BannerAction.f5538a, false)).toJson(writer, customScalarAdapters, value.j);
            writer.F1("bannerAnalytics");
            Adapters.b(Adapters.c(BannerAnalytics.f5540a, true)).toJson(writer, customScalarAdapters, value.k);
            writer.F1("bannerImpressionAnalytics");
            Adapters.b(Adapters.c(BannerImpressionAnalytics.f5545a, true)).toJson(writer, customScalarAdapters, value.l);
            writer.F1("commonAnalytics");
            Adapters.b(Adapters.c(CommonAnalytics.f5551a, true)).toJson(writer, customScalarAdapters, value.m);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductListQuery.OnEdrOfferBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$OnGoogleAdBannerCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnGoogleAdBannerCard;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnGoogleAdBannerCard implements Adapter<ProductListQuery.OnGoogleAdBannerCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5586a = CollectionsKt.R(OutOfContextTestingActivity.AD_UNIT_KEY, "nativeCustomTemplateId", "targeting", "iabSize", "correlator");

        public static ProductListQuery.OnGoogleAdBannerCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            GoogleAdCustomTargeting googleAdCustomTargeting = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(f5586a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    googleAdCustomTargeting = (GoogleAdCustomTargeting) d.k(customScalarAdapters, au.com.woolworths.shop.graphql.type.GoogleAdCustomTargeting.f11436a, reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, OutOfContextTestingActivity.AD_UNIT_KEY);
                throw null;
            }
            if (str2 != null) {
                return new ProductListQuery.OnGoogleAdBannerCard(str, str2, googleAdCustomTargeting, str3, str4);
            }
            Assertions.a(reader, "nativeCustomTemplateId");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductListQuery.OnGoogleAdBannerCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(OutOfContextTestingActivity.AD_UNIT_KEY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5464a);
            writer.F1("nativeCustomTemplateId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("targeting");
            Adapters.b(customScalarAdapters.e(au.com.woolworths.shop.graphql.type.GoogleAdCustomTargeting.f11436a)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("iabSize");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("correlator");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductListQuery.OnGoogleAdBannerCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$OnHorizontalList;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnHorizontalList;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHorizontalList implements Adapter<ProductListQuery.OnHorizontalList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5587a = CollectionsKt.R("__typename", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "actionTitle", "deepLink", "items");

        public static ProductListQuery.OnHorizontalList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f5587a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Item.f5563a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new ProductListQuery.OnHorizontalList(str, str2, str3, str4, str5, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductListQuery.OnHorizontalList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5465a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("actionTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("deepLink");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("items");
            Adapters.a(Adapters.c(Item.f5563a, true)).toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductListQuery.OnHorizontalList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$OnHorizontalList1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnHorizontalList1;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHorizontalList1 implements Adapter<ProductListQuery.OnHorizontalList1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5588a = CollectionsKt.R("title", "items");

        public static ProductListQuery.OnHorizontalList1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f5588a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Item3.f5566a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new ProductListQuery.OnHorizontalList1(str, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductListQuery.OnHorizontalList1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5466a);
            writer.F1("items");
            Adapters.a(Adapters.c(Item3.f5566a, true)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductListQuery.OnHorizontalList1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$OnInsetBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnInsetBanner;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnInsetBanner implements Adapter<ProductListQuery.OnInsetBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5589a = CollectionsKt.R("displayType", "message", "bannerTitle", "iconUrl", UrlHandler.ACTION);

        public static ProductListQuery.OnInsetBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            ProductListQuery.Action action = null;
            while (true) {
                int iO2 = reader.o2(f5589a);
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
                    action = (ProductListQuery.Action) Adapters.b(Adapters.c(Action.f5526a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new ProductListQuery.OnInsetBanner(insetBannerDisplayTypeA, str, str2, str3, action);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductListQuery.OnInsetBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f5467a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("bannerTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("iconUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1(UrlHandler.ACTION);
            Adapters.b(Adapters.c(Action.f5526a, false)).toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductListQuery.OnInsetBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$OnMerchCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnMerchCard;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMerchCard implements Adapter<ProductListQuery.OnMerchCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5590a = CollectionsKt.R("__typename", "merchCardGridImageWithAlt", "merchCardListImageWithAlt", "merchCardTitle", "merchCardDescription", "merchCardButton", "merchCardAction", "merchCardAnalytics", "merchCardImpressionAnalytics");

        public static ProductListQuery.OnMerchCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ProductListQuery.MerchCardGridImageWithAlt merchCardGridImageWithAlt = null;
            ProductListQuery.MerchCardListImageWithAlt merchCardListImageWithAlt = null;
            String str2 = null;
            String str3 = null;
            ProductListQuery.MerchCardButton merchCardButton = null;
            ProductListQuery.MerchCardAction merchCardAction = null;
            ProductListQuery.MerchCardAnalytics merchCardAnalytics = null;
            ProductListQuery.MerchCardImpressionAnalytics merchCardImpressionAnalytics = null;
            while (true) {
                switch (reader.o2(f5590a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        merchCardGridImageWithAlt = (ProductListQuery.MerchCardGridImageWithAlt) Adapters.c(MerchCardGridImageWithAlt.f5578a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        merchCardListImageWithAlt = (ProductListQuery.MerchCardListImageWithAlt) Adapters.c(MerchCardListImageWithAlt.f5580a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        merchCardButton = (ProductListQuery.MerchCardButton) Adapters.b(Adapters.c(MerchCardButton.f5574a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        merchCardAction = (ProductListQuery.MerchCardAction) Adapters.b(Adapters.c(MerchCardAction.f5572a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        merchCardAnalytics = (ProductListQuery.MerchCardAnalytics) Adapters.b(Adapters.c(MerchCardAnalytics.f5573a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        merchCardImpressionAnalytics = (ProductListQuery.MerchCardImpressionAnalytics) Adapters.b(Adapters.c(MerchCardImpressionAnalytics.f5579a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (merchCardGridImageWithAlt == null) {
                            Assertions.a(reader, "merchCardGridImageWithAlt");
                            throw null;
                        }
                        if (merchCardListImageWithAlt == null) {
                            Assertions.a(reader, "merchCardListImageWithAlt");
                            throw null;
                        }
                        if (str2 != null) {
                            return new ProductListQuery.OnMerchCard(str, merchCardGridImageWithAlt, merchCardListImageWithAlt, str2, str3, merchCardButton, merchCardAction, merchCardAnalytics, merchCardImpressionAnalytics);
                        }
                        Assertions.a(reader, "merchCardTitle");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductListQuery.OnMerchCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5468a);
            writer.F1("merchCardGridImageWithAlt");
            Adapters.c(MerchCardGridImageWithAlt.f5578a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("merchCardListImageWithAlt");
            Adapters.c(MerchCardListImageWithAlt.f5580a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("merchCardTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("merchCardDescription");
            Adapters.i.toJson(writer, customScalarAdapters, value.e);
            writer.F1("merchCardButton");
            Adapters.b(Adapters.c(MerchCardButton.f5574a, false)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("merchCardAction");
            Adapters.b(Adapters.c(MerchCardAction.f5572a, false)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("merchCardAnalytics");
            Adapters.b(Adapters.c(MerchCardAnalytics.f5573a, true)).toJson(writer, customScalarAdapters, value.h);
            writer.F1("merchCardImpressionAnalytics");
            Adapters.b(Adapters.c(MerchCardImpressionAnalytics.f5579a, true)).toJson(writer, customScalarAdapters, value.i);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductListQuery.OnMerchCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$OnMerchCardFullImage;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnMerchCardFullImage;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMerchCardFullImage implements Adapter<ProductListQuery.OnMerchCardFullImage> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5591a = CollectionsKt.R("__typename", "merchCardFullImageAction", "merchCardFullImageBackgroundImageWithAlt", "merchCardFullImageButton", "merchCardFullImageTitle", "merchCardFullImageDescription");

        public static ProductListQuery.OnMerchCardFullImage a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ProductListQuery.MerchCardFullImageAction merchCardFullImageAction = null;
            ProductListQuery.MerchCardFullImageBackgroundImageWithAlt merchCardFullImageBackgroundImageWithAlt = null;
            ProductListQuery.MerchCardFullImageButton merchCardFullImageButton = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(f5591a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    merchCardFullImageAction = (ProductListQuery.MerchCardFullImageAction) Adapters.b(Adapters.c(MerchCardFullImageAction.f5575a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    merchCardFullImageBackgroundImageWithAlt = (ProductListQuery.MerchCardFullImageBackgroundImageWithAlt) Adapters.c(MerchCardFullImageBackgroundImageWithAlt.f5576a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    merchCardFullImageButton = (ProductListQuery.MerchCardFullImageButton) Adapters.b(Adapters.c(MerchCardFullImageButton.f5577a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (merchCardFullImageBackgroundImageWithAlt != null) {
                return new ProductListQuery.OnMerchCardFullImage(str, merchCardFullImageAction, merchCardFullImageBackgroundImageWithAlt, merchCardFullImageButton, str2, str3);
            }
            Assertions.a(reader, "merchCardFullImageBackgroundImageWithAlt");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductListQuery.OnMerchCardFullImage value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5469a);
            writer.F1("merchCardFullImageAction");
            Adapters.b(Adapters.c(MerchCardFullImageAction.f5575a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("merchCardFullImageBackgroundImageWithAlt");
            Adapters.c(MerchCardFullImageBackgroundImageWithAlt.f5576a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("merchCardFullImageButton");
            Adapters.b(Adapters.c(MerchCardFullImageButton.f5577a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("merchCardFullImageTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("merchCardFullImageDescription");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductListQuery.OnMerchCardFullImage) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$OnPersonalisedProductsBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnPersonalisedProductsBanner;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPersonalisedProductsBanner implements Adapter<ProductListQuery.OnPersonalisedProductsBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5592a = CollectionsKt.R("__typename", "bannerTitle", "bannerForegroundColour", "bannerBackgroundColour", "bannerImage", "products", "bannerAction", "bannerAnalytics", "bannerImpressionAnalytics");

        public static ProductListQuery.OnPersonalisedProductsBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ProductListQuery.BannerImage bannerImage = null;
            List list = null;
            ProductListQuery.BannerAction1 bannerAction1 = null;
            ProductListQuery.BannerAnalytics1 bannerAnalytics1 = null;
            ProductListQuery.BannerImpressionAnalytics1 bannerImpressionAnalytics1 = null;
            while (true) {
                switch (reader.o2(f5592a)) {
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
                        bannerImage = (ProductListQuery.BannerImage) Adapters.b(Adapters.c(BannerImage.f5544a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        list = (List) Adapters.b(Adapters.a(Adapters.c(Product.f5602a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bannerAction1 = (ProductListQuery.BannerAction1) Adapters.b(Adapters.c(BannerAction1.f5539a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bannerAnalytics1 = (ProductListQuery.BannerAnalytics1) Adapters.b(Adapters.c(BannerAnalytics1.f5541a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        bannerImpressionAnalytics1 = (ProductListQuery.BannerImpressionAnalytics1) Adapters.b(Adapters.c(BannerImpressionAnalytics1.f5546a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str != null) {
                            return new ProductListQuery.OnPersonalisedProductsBanner(str, str2, str3, str4, bannerImage, list, bannerAction1, bannerAnalytics1, bannerImpressionAnalytics1);
                        }
                        Assertions.a(reader, "__typename");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductListQuery.OnPersonalisedProductsBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5470a);
            writer.F1("bannerTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("bannerForegroundColour");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("bannerBackgroundColour");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("bannerImage");
            Adapters.b(Adapters.c(BannerImage.f5544a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("products");
            Adapters.b(Adapters.a(Adapters.c(Product.f5602a, false))).toJson(writer, customScalarAdapters, value.f);
            writer.F1("bannerAction");
            Adapters.b(Adapters.c(BannerAction1.f5539a, false)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("bannerAnalytics");
            Adapters.b(Adapters.c(BannerAnalytics1.f5541a, true)).toJson(writer, customScalarAdapters, value.h);
            writer.F1("bannerImpressionAnalytics");
            Adapters.b(Adapters.c(BannerImpressionAnalytics1.f5546a, true)).toJson(writer, customScalarAdapters, value.i);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductListQuery.OnPersonalisedProductsBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$OnProductCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnProductCard;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard implements Adapter<ProductListQuery.OnProductCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5593a = CollectionsKt.Q("__typename");

        public static ProductListQuery.OnProductCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f5593a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductListQuery.OnProductCard(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductListQuery.OnProductCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5471a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductListQuery.OnProductCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$OnProductCard1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnProductCard1;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard1 implements Adapter<ProductListQuery.OnProductCard1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5594a = CollectionsKt.Q("__typename");

        public static ProductListQuery.OnProductCard1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f5594a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductListQuery.OnProductCard1(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductListQuery.OnProductCard1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5472a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductListQuery.OnProductCard1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$OnProductCard2;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnProductCard2;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard2 implements Adapter<ProductListQuery.OnProductCard2> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5595a = CollectionsKt.Q("__typename");

        public static ProductListQuery.OnProductCard2 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f5595a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductListQuery.OnProductCard2(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductListQuery.OnProductCard2 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5473a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductListQuery.OnProductCard2) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$OnProductListFullScreenError;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnProductListFullScreenError;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductListFullScreenError implements Adapter<ProductListQuery.OnProductListFullScreenError> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5596a = CollectionsKt.R("analytics", "impressionAnalytics", "image", "title", lqlqqlq.mmm006Dm006Dm, "cta");

        public static ProductListQuery.OnProductListFullScreenError a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductListQuery.Analytics6 analytics6 = null;
            ProductListQuery.ImpressionAnalytics impressionAnalytics = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            ProductListQuery.Cta cta = null;
            while (true) {
                int iO2 = reader.o2(f5596a);
                if (iO2 == 0) {
                    analytics6 = (ProductListQuery.Analytics6) Adapters.b(Adapters.c(Analytics6.f5535a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    impressionAnalytics = (ProductListQuery.ImpressionAnalytics) Adapters.b(Adapters.c(ImpressionAnalytics.f5562a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        return new ProductListQuery.OnProductListFullScreenError(analytics6, impressionAnalytics, str, str2, str3, cta);
                    }
                    cta = (ProductListQuery.Cta) Adapters.b(Adapters.c(Cta.f5552a, false)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductListQuery.OnProductListFullScreenError value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics6.f5535a, true)).toJson(writer, customScalarAdapters, value.f5474a);
            writer.F1("impressionAnalytics");
            Adapters.b(Adapters.c(ImpressionAnalytics.f5562a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("image");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("title");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1(lqlqqlq.mmm006Dm006Dm);
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("cta");
            Adapters.b(Adapters.c(Cta.f5552a, false)).toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductListQuery.OnProductListFullScreenError) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$OnProductListZeroResult;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnProductListZeroResult;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductListZeroResult implements Adapter<ProductListQuery.OnProductListZeroResult> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5597a = CollectionsKt.R("title", "message", "items");

        public static ProductListQuery.OnProductListZeroResult a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f5597a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Item2.f5565a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new ProductListQuery.OnProductListZeroResult(str, str2, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductListQuery.OnProductListZeroResult value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f5475a);
            writer.F1("message");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("items");
            Adapters.a(Adapters.c(Item2.f5565a, true)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductListQuery.OnProductListZeroResult) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$OnUniversalInventoryContainer;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnUniversalInventoryContainer;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnUniversalInventoryContainer implements Adapter<ProductListQuery.OnUniversalInventoryContainer> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5598a = CollectionsKt.R("googleAdBannerCard", "nextBestAction");

        public static ProductListQuery.OnUniversalInventoryContainer a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductListQuery.GoogleAdBannerCard googleAdBannerCard = null;
            ProductListQuery.NextBestAction nextBestAction = null;
            while (true) {
                int iO2 = reader.o2(f5598a);
                if (iO2 == 0) {
                    googleAdBannerCard = (ProductListQuery.GoogleAdBannerCard) Adapters.b(Adapters.c(GoogleAdBannerCard.f5560a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        return new ProductListQuery.OnUniversalInventoryContainer(googleAdBannerCard, nextBestAction);
                    }
                    nextBestAction = (ProductListQuery.NextBestAction) Adapters.b(Adapters.c(NextBestAction.f5581a, true)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductListQuery.OnUniversalInventoryContainer value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("googleAdBannerCard");
            Adapters.b(Adapters.c(GoogleAdBannerCard.f5560a, false)).toJson(writer, customScalarAdapters, value.f5476a);
            writer.F1("nextBestAction");
            Adapters.b(Adapters.c(NextBestAction.f5581a, true)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductListQuery.OnUniversalInventoryContainer) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$OnVideoAdUnit;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnVideoAdUnit;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnVideoAdUnit implements Adapter<ProductListQuery.OnVideoAdUnit> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5599a = CollectionsKt.R("__typename", "videoAdUnitVideoAd", "videoAdUnitProductCard");

        public static ProductListQuery.OnVideoAdUnit a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ProductListQuery.VideoAdUnitVideoAd videoAdUnitVideoAd = null;
            ProductListQuery.VideoAdUnitProductCard videoAdUnitProductCard = null;
            while (true) {
                int iO2 = reader.o2(f5599a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    videoAdUnitVideoAd = (ProductListQuery.VideoAdUnitVideoAd) Adapters.c(VideoAdUnitVideoAd.f5614a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    videoAdUnitProductCard = (ProductListQuery.VideoAdUnitProductCard) Adapters.b(Adapters.c(VideoAdUnitProductCard.f5613a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (videoAdUnitVideoAd != null) {
                return new ProductListQuery.OnVideoAdUnit(str, videoAdUnitVideoAd, videoAdUnitProductCard);
            }
            Assertions.a(reader, "videoAdUnitVideoAd");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductListQuery.OnVideoAdUnit value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5477a);
            writer.F1("videoAdUnitVideoAd");
            Adapters.c(VideoAdUnitVideoAd.f5614a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("videoAdUnitProductCard");
            Adapters.b(Adapters.c(VideoAdUnitProductCard.f5613a, true)).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductListQuery.OnVideoAdUnit) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$OnZeroResultProductCategories;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnZeroResultProductCategories;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnZeroResultProductCategories implements Adapter<ProductListQuery.OnZeroResultProductCategories> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f5600a = CollectionsKt.R("zeroResultProductCategoriesTitle", "zeroResultProductCategoriesItems");

        public static ProductListQuery.OnZeroResultProductCategories a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f5600a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(ZeroResultProductCategoriesItem.f5619a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new ProductListQuery.OnZeroResultProductCategories(str, arrayListFromJson);
            }
            Assertions.a(reader, "zeroResultProductCategoriesItems");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, ProductListQuery.OnZeroResultProductCategories value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("zeroResultProductCategoriesTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.f5478a);
            writer.F1("zeroResultProductCategoriesItems");
            Adapters.a(Adapters.c(ZeroResultProductCategoriesItem.f5619a, false)).toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (ProductListQuery.OnZeroResultProductCategories) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$PrimaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$PrimaryCta;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrimaryCta implements Adapter<ProductListQuery.PrimaryCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final PrimaryCta f5601a = new PrimaryCta();
        public static final List b = CollectionsKt.Q(AnnotatedPrivateKey.LABEL);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ProductListQuery.PrimaryCta(str);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.PrimaryCta value = (ProductListQuery.PrimaryCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5479a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$Product;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Product;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Product implements Adapter<ProductListQuery.Product> {

        /* renamed from: a, reason: collision with root package name */
        public static final Product f5602a = new Product();
        public static final List b = CollectionsKt.R("__typename", "productId", AppMeasurementSdk.ConditionalUserProperty.NAME, "productImage");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "productId");
                throw null;
            }
            if (str3 != null) {
                return new ProductListQuery.Product(str, str2, str3, str4);
            }
            Assertions.a(reader, AppMeasurementSdk.ConditionalUserProperty.NAME);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.Product value = (ProductListQuery.Product) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5480a);
            writer.F1("productId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(AppMeasurementSdk.ConditionalUserProperty.NAME);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("productImage");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$ProductCategoryTileAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$ProductCategoryTileAction;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductCategoryTileAction implements Adapter<ProductListQuery.ProductCategoryTileAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductCategoryTileAction f5603a = new ProductCategoryTileAction();
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
                return new ProductListQuery.ProductCategoryTileAction(actionTypeA, str, str2);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.ProductCategoryTileAction value = (ProductListQuery.ProductCategoryTileAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.f5481a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$ProductList;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$ProductList;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductList implements Adapter<ProductListQuery.ProductList> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductList f5604a = new ProductList();
        public static final List b = CollectionsKt.R("totalNumberOfProducts", "nextPage", "pageTitle", "analytics", "productsFeed", "filters", "sortOptions", "sortOptionsBanner", "marketplaceFilterSwitch", "marketplaceInfo", "marketplaceBottomSheet", "chips", "facetChips", "zeroResult");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Integer num2 = null;
            String str = null;
            List list = null;
            ArrayList arrayListFromJson = null;
            ArrayList arrayListFromJson2 = null;
            ArrayList arrayListFromJson3 = null;
            ProductListQuery.SortOptionsBanner sortOptionsBanner = null;
            ProductListQuery.MarketplaceFilterSwitch marketplaceFilterSwitch = null;
            ProductListQuery.MarketplaceInfo marketplaceInfo = null;
            ProductListQuery.MarketplaceBottomSheet marketplaceBottomSheet = null;
            List list2 = null;
            List list3 = null;
            ProductListQuery.ZeroResult zeroResult = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        num2 = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        list = (List) Adapters.b(Adapters.a(Adapters.c(Analytic.f5528a, true))).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        arrayListFromJson = Adapters.a(Adapters.c(ProductsFeed.f5605a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        arrayListFromJson2 = Adapters.a(Adapters.c(Filter.f5557a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        arrayListFromJson3 = Adapters.a(Adapters.c(SortOption.f5607a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        sortOptionsBanner = (ProductListQuery.SortOptionsBanner) Adapters.b(Adapters.c(SortOptionsBanner.f5608a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        marketplaceFilterSwitch = (ProductListQuery.MarketplaceFilterSwitch) Adapters.b(Adapters.c(MarketplaceFilterSwitch.f5570a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        marketplaceInfo = (ProductListQuery.MarketplaceInfo) Adapters.b(Adapters.c(MarketplaceInfo.f5571a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        marketplaceBottomSheet = (ProductListQuery.MarketplaceBottomSheet) Adapters.b(Adapters.c(MarketplaceBottomSheet.f5569a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        list2 = (List) Adapters.b(Adapters.a(Adapters.c(Chip.f5550a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 12:
                        list3 = (List) Adapters.b(Adapters.a(Adapters.c(FacetChip.f5555a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 13:
                        zeroResult = (ProductListQuery.ZeroResult) Adapters.b(Adapters.c(ZeroResult.f5618a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "productsFeed");
                            throw null;
                        }
                        if (arrayListFromJson2 == null) {
                            Assertions.a(reader, "filters");
                            throw null;
                        }
                        if (arrayListFromJson3 != null) {
                            return new ProductListQuery.ProductList(num, num2, str, list, arrayListFromJson, arrayListFromJson2, arrayListFromJson3, sortOptionsBanner, marketplaceFilterSwitch, marketplaceInfo, marketplaceBottomSheet, list2, list3, zeroResult);
                        }
                        Assertions.a(reader, "sortOptions");
                        throw null;
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.ProductList value = (ProductListQuery.ProductList) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("totalNumberOfProducts");
            NullableAdapter nullableAdapter = Adapters.k;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f5482a);
            writer.F1("nextPage");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("pageTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.b(Adapters.a(Adapters.c(Analytic.f5528a, true))).toJson(writer, customScalarAdapters, value.d);
            writer.F1("productsFeed");
            Adapters.a(Adapters.c(ProductsFeed.f5605a, true)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("filters");
            Adapters.a(Adapters.c(Filter.f5557a, false)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("sortOptions");
            Adapters.a(Adapters.c(SortOption.f5607a, false)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("sortOptionsBanner");
            Adapters.b(Adapters.c(SortOptionsBanner.f5608a, true)).toJson(writer, customScalarAdapters, value.h);
            writer.F1("marketplaceFilterSwitch");
            Adapters.b(Adapters.c(MarketplaceFilterSwitch.f5570a, false)).toJson(writer, customScalarAdapters, value.i);
            writer.F1("marketplaceInfo");
            Adapters.b(Adapters.c(MarketplaceInfo.f5571a, false)).toJson(writer, customScalarAdapters, value.j);
            writer.F1("marketplaceBottomSheet");
            Adapters.b(Adapters.c(MarketplaceBottomSheet.f5569a, false)).toJson(writer, customScalarAdapters, value.k);
            writer.F1("chips");
            Adapters.b(Adapters.a(Adapters.c(Chip.f5550a, false))).toJson(writer, customScalarAdapters, value.l);
            writer.F1("facetChips");
            Adapters.b(Adapters.a(Adapters.c(FacetChip.f5555a, false))).toJson(writer, customScalarAdapters, value.m);
            writer.F1("zeroResult");
            Adapters.b(Adapters.c(ZeroResult.f5618a, true)).toJson(writer, customScalarAdapters, value.n);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$ProductsFeed;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$ProductsFeed;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ProductsFeed implements Adapter<ProductListQuery.ProductsFeed> {

        /* renamed from: a, reason: collision with root package name */
        public static final ProductsFeed f5605a = new ProductsFeed();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ProductListQuery.OnActionableCard onActionableCardA;
            ProductListQuery.OnGoogleAdBannerCard onGoogleAdBannerCardA;
            ProductListQuery.OnUniversalInventoryContainer onUniversalInventoryContainerA;
            ProductListQuery.OnHorizontalList onHorizontalListA;
            ProductListQuery.OnVideoAdUnit onVideoAdUnitA;
            ProductListQuery.OnMerchCard onMerchCardA;
            ProductListQuery.OnInsetBanner onInsetBannerA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ProductListQuery.OnProductCard1 onProductCard1A = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ActionableCard"))) {
                reader.o();
                onActionableCardA = OnActionableCard.a(reader, customScalarAdapters);
            } else {
                onActionableCardA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("GoogleAdBannerCard"), new BooleanExpression.Not(BooleanExpressions.d("includeUniversalInventoryFallback"))))) {
                reader.o();
                onGoogleAdBannerCardA = OnGoogleAdBannerCard.a(reader, customScalarAdapters);
            } else {
                onGoogleAdBannerCardA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("UniversalInventoryContainer"), BooleanExpressions.d("includeUniversalInventoryFallback")))) {
                reader.o();
                onUniversalInventoryContainerA = OnUniversalInventoryContainer.a(reader, customScalarAdapters);
            } else {
                onUniversalInventoryContainerA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("HorizontalList"), BooleanExpressions.d("includeHorizontalList")))) {
                reader.o();
                onHorizontalListA = OnHorizontalList.a(reader, customScalarAdapters);
            } else {
                onHorizontalListA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("VideoAdUnit"), BooleanExpressions.d("includeVideoAdUnit")))) {
                reader.o();
                onVideoAdUnitA = OnVideoAdUnit.a(reader, customScalarAdapters);
            } else {
                onVideoAdUnitA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("MerchCard"), BooleanExpressions.d("includeMerchCard")))) {
                reader.o();
                onMerchCardA = OnMerchCard.a(reader, customScalarAdapters);
            } else {
                onMerchCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("InsetBanner"))) {
                reader.o();
                onInsetBannerA = OnInsetBanner.a(reader, customScalarAdapters);
            } else {
                onInsetBannerA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductCard"))) {
                reader.o();
                onProductCard1A = OnProductCard1.a(reader, customScalarAdapters);
            }
            return new ProductListQuery.ProductsFeed(str, onActionableCardA, onGoogleAdBannerCardA, onUniversalInventoryContainerA, onHorizontalListA, onVideoAdUnitA, onMerchCardA, onInsetBannerA, onProductCard1A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.ProductsFeed value = (ProductListQuery.ProductsFeed) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5483a);
            ProductListQuery.OnActionableCard onActionableCard = value.b;
            if (onActionableCard != null) {
                OnActionableCard.b(writer, customScalarAdapters, onActionableCard);
            }
            ProductListQuery.OnGoogleAdBannerCard onGoogleAdBannerCard = value.c;
            if (onGoogleAdBannerCard != null) {
                OnGoogleAdBannerCard.b(writer, customScalarAdapters, onGoogleAdBannerCard);
            }
            ProductListQuery.OnUniversalInventoryContainer onUniversalInventoryContainer = value.d;
            if (onUniversalInventoryContainer != null) {
                OnUniversalInventoryContainer.b(writer, customScalarAdapters, onUniversalInventoryContainer);
            }
            ProductListQuery.OnHorizontalList onHorizontalList = value.e;
            if (onHorizontalList != null) {
                OnHorizontalList.b(writer, customScalarAdapters, onHorizontalList);
            }
            ProductListQuery.OnVideoAdUnit onVideoAdUnit = value.f;
            if (onVideoAdUnit != null) {
                OnVideoAdUnit.b(writer, customScalarAdapters, onVideoAdUnit);
            }
            ProductListQuery.OnMerchCard onMerchCard = value.g;
            if (onMerchCard != null) {
                OnMerchCard.b(writer, customScalarAdapters, onMerchCard);
            }
            ProductListQuery.OnInsetBanner onInsetBanner = value.h;
            if (onInsetBanner != null) {
                OnInsetBanner.b(writer, customScalarAdapters, onInsetBanner);
            }
            ProductListQuery.OnProductCard1 onProductCard1 = value.i;
            if (onProductCard1 != null) {
                OnProductCard1.b(writer, customScalarAdapters, onProductCard1);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$SecondaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$SecondaryCta;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SecondaryCta implements Adapter<ProductListQuery.SecondaryCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final SecondaryCta f5606a = new SecondaryCta();
        public static final List b = CollectionsKt.Q(AnnotatedPrivateKey.LABEL);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new ProductListQuery.SecondaryCta(str);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.SecondaryCta value = (ProductListQuery.SecondaryCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5484a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$SortOption;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$SortOption;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SortOption implements Adapter<ProductListQuery.SortOption> {

        /* renamed from: a, reason: collision with root package name */
        public static final SortOption f5607a = new SortOption();
        public static final List b = CollectionsKt.R("key", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "isApplied");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
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
                Assertions.a(reader, "key");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (bool != null) {
                return new ProductListQuery.SortOption(str, str2, str3, bool.booleanValue());
            }
            Assertions.a(reader, "isApplied");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.SortOption value = (ProductListQuery.SortOption) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("key");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5485a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("isApplied");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.d));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$SortOptionsBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$SortOptionsBanner;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SortOptionsBanner implements Adapter<ProductListQuery.SortOptionsBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final SortOptionsBanner f5608a = new SortOptionsBanner();
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
            InsetBanner insetBannerA = InsetBannerImpl_ResponseAdapter.InsetBanner.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductListQuery.SortOptionsBanner(str, insetBannerA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.SortOptionsBanner value = (ProductListQuery.SortOptionsBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5486a);
            List list = InsetBannerImpl_ResponseAdapter.InsetBanner.f5633a;
            InsetBannerImpl_ResponseAdapter.InsetBanner.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$TermsAndConditions;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$TermsAndConditions;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TermsAndConditions implements Adapter<ProductListQuery.TermsAndConditions> {

        /* renamed from: a, reason: collision with root package name */
        public static final TermsAndConditions f5609a = new TermsAndConditions();
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
            VideoAdBottomSheet videoAdBottomSheetA = VideoAdBottomSheetImpl_ResponseAdapter.VideoAdBottomSheet.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductListQuery.TermsAndConditions(str, videoAdBottomSheetA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.TermsAndConditions value = (ProductListQuery.TermsAndConditions) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5487a);
            List list = VideoAdBottomSheetImpl_ResponseAdapter.VideoAdBottomSheet.f5637a;
            VideoAdBottomSheetImpl_ResponseAdapter.VideoAdBottomSheet.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$Text;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Text;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Text implements Adapter<ProductListQuery.Text> {

        /* renamed from: a, reason: collision with root package name */
        public static final Text f5610a = new Text();
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
                return new ProductListQuery.Text(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.Text value = (ProductListQuery.Text) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5488a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$Text1;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Text1;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Text1 implements Adapter<ProductListQuery.Text1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Text1 f5611a = new Text1();
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
                return new ProductListQuery.Text1(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.Text1 value = (ProductListQuery.Text1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5489a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$Transcript;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Transcript;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Transcript implements Adapter<ProductListQuery.Transcript> {

        /* renamed from: a, reason: collision with root package name */
        public static final Transcript f5612a = new Transcript();
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
            VideoAdBottomSheet videoAdBottomSheetA = VideoAdBottomSheetImpl_ResponseAdapter.VideoAdBottomSheet.a(reader, customScalarAdapters);
            if (str != null) {
                return new ProductListQuery.Transcript(str, videoAdBottomSheetA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.Transcript value = (ProductListQuery.Transcript) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5490a);
            List list = VideoAdBottomSheetImpl_ResponseAdapter.VideoAdBottomSheet.f5637a;
            VideoAdBottomSheetImpl_ResponseAdapter.VideoAdBottomSheet.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$VideoAdUnitProductCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$VideoAdUnitProductCard;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VideoAdUnitProductCard implements Adapter<ProductListQuery.VideoAdUnitProductCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final VideoAdUnitProductCard f5613a = new VideoAdUnitProductCard();
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
                return new ProductListQuery.VideoAdUnitProductCard(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.VideoAdUnitProductCard value = (ProductListQuery.VideoAdUnitProductCard) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5491a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$VideoAdUnitVideoAd;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$VideoAdUnitVideoAd;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VideoAdUnitVideoAd implements Adapter<ProductListQuery.VideoAdUnitVideoAd> {

        /* renamed from: a, reason: collision with root package name */
        public static final VideoAdUnitVideoAd f5614a = new VideoAdUnitVideoAd();
        public static final List b = CollectionsKt.R("__typename", "url", "fallbackImage", "duration", "transcript", "termsAndConditions", "analytics", "eventAnalytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            String str2 = null;
            ProductListQuery.FallbackImage fallbackImage = null;
            ProductListQuery.Transcript transcript = null;
            ProductListQuery.TermsAndConditions termsAndConditions = null;
            ProductListQuery.Analytics3 analytics3 = null;
            ProductListQuery.EventAnalytics eventAnalytics = null;
            while (true) {
                switch (reader.o2(b)) {
                    case 0:
                        num = num2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        num = num2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        num = num2;
                        fallbackImage = (ProductListQuery.FallbackImage) Adapters.b(Adapters.c(FallbackImage.f5556a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        num = num2;
                        transcript = (ProductListQuery.Transcript) Adapters.b(Adapters.c(Transcript.f5612a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        num = num2;
                        termsAndConditions = (ProductListQuery.TermsAndConditions) Adapters.b(Adapters.c(TermsAndConditions.f5609a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        num = num2;
                        analytics3 = (ProductListQuery.Analytics3) Adapters.b(Adapters.c(Analytics3.f5532a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        num = num2;
                        eventAnalytics = (ProductListQuery.EventAnalytics) Adapters.b(Adapters.c(EventAnalytics.f5554a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Integer num3 = num2;
                        if (str == null) {
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "url");
                            throw null;
                        }
                        if (num3 != null) {
                            return new ProductListQuery.VideoAdUnitVideoAd(str, str2, fallbackImage, num3.intValue(), transcript, termsAndConditions, analytics3, eventAnalytics);
                        }
                        Assertions.a(reader, "duration");
                        throw null;
                }
                num2 = num;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.VideoAdUnitVideoAd value = (ProductListQuery.VideoAdUnitVideoAd) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f5492a);
            writer.F1("url");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("fallbackImage");
            Adapters.b(Adapters.c(FallbackImage.f5556a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("duration");
            d.y(value.d, Adapters.b, writer, customScalarAdapters, "transcript");
            Adapters.b(Adapters.c(Transcript.f5612a, true)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("termsAndConditions");
            Adapters.b(Adapters.c(TermsAndConditions.f5609a, true)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics3.f5532a, true)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("eventAnalytics");
            Adapters.b(Adapters.c(EventAnalytics.f5554a, false)).toJson(writer, customScalarAdapters, value.h);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$VideoErrorImpression;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$VideoErrorImpression;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VideoErrorImpression implements Adapter<ProductListQuery.VideoErrorImpression> {

        /* renamed from: a, reason: collision with root package name */
        public static final VideoErrorImpression f5615a = new VideoErrorImpression();
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
                return new ProductListQuery.VideoErrorImpression(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.VideoErrorImpression value = (ProductListQuery.VideoErrorImpression) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5493a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$VideoPause;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$VideoPause;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VideoPause implements Adapter<ProductListQuery.VideoPause> {

        /* renamed from: a, reason: collision with root package name */
        public static final VideoPause f5616a = new VideoPause();
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
                return new ProductListQuery.VideoPause(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.VideoPause value = (ProductListQuery.VideoPause) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5494a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$VideoPlay;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$VideoPlay;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VideoPlay implements Adapter<ProductListQuery.VideoPlay> {

        /* renamed from: a, reason: collision with root package name */
        public static final VideoPlay f5617a = new VideoPlay();
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
                return new ProductListQuery.VideoPlay(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.VideoPlay value = (ProductListQuery.VideoPlay) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5495a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$ZeroResult;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$ZeroResult;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ZeroResult implements Adapter<ProductListQuery.ZeroResult> {

        /* renamed from: a, reason: collision with root package name */
        public static final ZeroResult f5618a = new ZeroResult();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            ProductListQuery.OnProductListZeroResult onProductListZeroResultA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            ProductListQuery.OnProductListFullScreenError onProductListFullScreenErrorA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductListZeroResult"))) {
                reader.o();
                onProductListZeroResultA = OnProductListZeroResult.a(reader, customScalarAdapters);
            } else {
                onProductListZeroResultA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductListFullScreenError"))) {
                reader.o();
                onProductListFullScreenErrorA = OnProductListFullScreenError.a(reader, customScalarAdapters);
            }
            return new ProductListQuery.ZeroResult(str, onProductListZeroResultA, onProductListFullScreenErrorA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.ZeroResult value = (ProductListQuery.ZeroResult) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f5496a);
            ProductListQuery.OnProductListZeroResult onProductListZeroResult = value.b;
            if (onProductListZeroResult != null) {
                OnProductListZeroResult.b(writer, customScalarAdapters, onProductListZeroResult);
            }
            ProductListQuery.OnProductListFullScreenError onProductListFullScreenError = value.c;
            if (onProductListFullScreenError != null) {
                OnProductListFullScreenError.b(writer, customScalarAdapters, onProductListFullScreenError);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/adapter/ProductListQuery_ResponseAdapter$ZeroResultProductCategoriesItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$ZeroResultProductCategoriesItem;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ZeroResultProductCategoriesItem implements Adapter<ProductListQuery.ZeroResultProductCategoriesItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final ZeroResultProductCategoriesItem f5619a = new ZeroResultProductCategoriesItem();
        public static final List b = CollectionsKt.R("productCategoryTileAction", "productCategoryTileImageUrl", "productCategoryTileLabel");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ProductListQuery.ProductCategoryTileAction productCategoryTileAction = null;
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    productCategoryTileAction = (ProductListQuery.ProductCategoryTileAction) Adapters.c(ProductCategoryTileAction.f5603a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (productCategoryTileAction == null) {
                Assertions.a(reader, "productCategoryTileAction");
                throw null;
            }
            if (str == null) {
                Assertions.a(reader, "productCategoryTileImageUrl");
                throw null;
            }
            if (str2 != null) {
                return new ProductListQuery.ZeroResultProductCategoriesItem(productCategoryTileAction, str, str2);
            }
            Assertions.a(reader, "productCategoryTileLabel");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            ProductListQuery.ZeroResultProductCategoriesItem value = (ProductListQuery.ZeroResultProductCategoriesItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("productCategoryTileAction");
            Adapters.c(ProductCategoryTileAction.f5603a, false).toJson(writer, customScalarAdapters, value.f5497a);
            writer.F1("productCategoryTileImageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("productCategoryTileLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }
}
