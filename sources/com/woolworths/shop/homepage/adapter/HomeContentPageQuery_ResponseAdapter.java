package com.woolworths.shop.homepage.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.graphql.TealiumAnalytics;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.graphql.common.fragment.ProductCardImpl_ResponseAdapter;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragment;
import au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragmentImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.AlertIndicatorType;
import au.com.woolworths.shop.graphql.type.BroadcastBannerType;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.ChatEntryCardElement;
import au.com.woolworths.shop.graphql.type.ContentCardSize;
import au.com.woolworths.shop.graphql.type.CoreBroadcastBannerStyle;
import au.com.woolworths.shop.graphql.type.DownloadableAssetFit;
import au.com.woolworths.shop.graphql.type.DownloadableAssetType;
import au.com.woolworths.shop.graphql.type.FooterStyle;
import au.com.woolworths.shop.graphql.type.HeroBannerTitleSize;
import au.com.woolworths.shop.graphql.type.HomeFulfilmentWindowContainerOrientation;
import au.com.woolworths.shop.graphql.type.HomeFulfilmentWindowTileStyle;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.OrderStatus;
import au.com.woolworths.shop.graphql.type.adapter.ActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.AlertIndicatorType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.BroadcastBannerType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ButtonStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CardHeight_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ChatEntryCardElement_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ContentCardSize_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CoreBroadcastBannerStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.DownloadableAssetFit_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.DownloadableAssetType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.FooterStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.HeroBannerTitleSize_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.HomeFulfilmentWindowContainerOrientation_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.HomeFulfilmentWindowTileStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionPlacement_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.InsetBannerDisplayType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.OrderStatus_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$IntAdapter$1;
import com.apollographql.apollo.api.Adapters$StringAdapter$1;
import com.apollographql.apollo.api.Assertions;
import com.apollographql.apollo.api.BooleanExpression;
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.storage.db.k;
import com.scandit.datacapture.barcode.pick.serialization.BarcodePickDeserializer;
import com.woolworths.shop.homepage.HomeContentPageQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0003\b\u0085\u0001\bÇ\u0002\u0018\u00002\u00020\u0001:\u008a\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001¨\u0006\u0086\u0001"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter;", "", "Data", "Home", "HeaderItem", "OnHomeFulfilmentWindowBanner", "FulfilmentWindowStateSubtitle", "FulfilmentWindowStateButton", "OnHomeFulfilmentWindowContainer", "Button", "DeliveryNowBanner", "OnHomeModeSelectorContainer", "FulfilmentWindowTile", "Title", "Subtitle", "Analytics", "OnlineShoppingModeVariantTile", "Title1", "Subtitle1", "Analytics1", "Divider", "DeliveryNowBanner1", "OnHomeDeliveryNowBottomBanner", "BannerAsset", "PrimaryCta", "SecondaryCta", "OnHomeDeliveryNowBanner", "InStoreDetailsCard", "StoreName", "StoreTime", "DeliveryNow", "UnreadChatbotMsg", "HomePage", "Analytics2", "ImpressionAnalytics", "Item", "OnRegistrationCard", "OnActionableCard", "ActionableCardImpressionAnalytics", "ActionableCardClickAnalytics", "OnInsetBanner", "Action", "OnBasicCoreBroadcastBanner", "ImpressionAnalytics1", "BroadcastBannerDismissAnalytics", "BroadcastBannerUI", "Icon", "OnCoreIcon", "OnHostedIcon", "BroadcastBannerAction", "Analytics3", "OnRewardsBalanceCard", "OffersAlertIndicator", "PointsAlertIndicator", "OnBroadcastBanner", "OnMyShoppingLists", "OnCarousel", "CarouselItem", "OnHeroBanner", "HeroBannerAction", "Analytics4", "HeroBannerAnalytics", "ExtraContent", "HeroBannerImpressionAnalytics", "HeroBannerBody", "OnHeroBannerBodyText", "OnHeroBannerPromoBody", "HeroBannerBrandsLogo", "HeroBannerGraphic", "HeroBannerImage", "HeroBannerTermsAndConditions", "HeroBannerTermsAndConditionAction", "Analytics5", "OnBoosterHorizontalList", "Item1", "OnProductCard", "OnVideoAdUnit", "VideoAdUnitVideoAd", "FallbackImage", "Transcript", "ImpressionAnalytics2", "TermsAndConditions", "ImpressionAnalytics3", "Analytics6", "EventAnalytics", "Impression", "VideoPlay", "VideoPause", "VideoErrorImpression", "VideoAdUnitCarousel", "Item2", "OnProductCard1", "VideoAdUnitBottomLink", "LinkTextWithAlt", "LinkAction", "Analytics7", "OnHorizontalList", "HorizontalListTrailingLink", "LinkTextWithAlt1", "LinkAction1", "Analytics8", "HorizontalListAnalytics", "HorizontalListImpressionAnalytics", "Item3", "OnProductCard2", "OnOrderCard", "FulfilmentStatusBanner", "OrderCardAction", "Analytics9", "OnQuickLinkCard", "LinkCardAction", "Analytics10", "LinkCardAnimation", "OnRecipeSummaryCard", "OnRecipeMoreCard", "ActionMetadatum", "OnRecipeTagList", "OnRecipeSource", "OnContentCard", "ContentCardAction", "Analytics11", "ContentCardFooter", "Logo", "ContentCardBrandImage", "OnPromotionCard", "PromotionCardProduct", "Analytics12", "ImpressionAnalytics4", "OnChatEntryCardV2", "ChatEntryCardCta", "ChatEntryCardContext", "Data1", "ChatEntryCardAction", "Analytics13", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HomeContentPageQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Action;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Action;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action implements Adapter<HomeContentPageQuery.Action> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action f23002a = new Action();
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
                return new HomeContentPageQuery.Action(insetBannerActionPlacementA, insetBannerActionTypeA, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Action value = (HomeContentPageQuery.Action) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("placement");
            InsetBannerActionPlacement_ResponseAdapter.b(writer, customScalarAdapters, value.f22780a);
            writer.F1("type");
            InsetBannerActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$ActionMetadatum;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$ActionMetadatum;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActionMetadatum implements Adapter<HomeContentPageQuery.ActionMetadatum> {

        /* renamed from: a, reason: collision with root package name */
        public static final ActionMetadatum f23003a = new ActionMetadatum();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            HomeContentPageQuery.OnRecipeTagList onRecipeTagListA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            HomeContentPageQuery.OnRecipeSource onRecipeSourceA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RecipeTagList"))) {
                reader.o();
                onRecipeTagListA = OnRecipeTagList.a(reader, customScalarAdapters);
            } else {
                onRecipeTagListA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RecipeSource"))) {
                reader.o();
                onRecipeSourceA = OnRecipeSource.a(reader, customScalarAdapters);
            }
            return new HomeContentPageQuery.ActionMetadatum(str, onRecipeTagListA, onRecipeSourceA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.ActionMetadatum value = (HomeContentPageQuery.ActionMetadatum) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22781a);
            HomeContentPageQuery.OnRecipeTagList onRecipeTagList = value.b;
            if (onRecipeTagList != null) {
                OnRecipeTagList.b(writer, customScalarAdapters, onRecipeTagList);
            }
            HomeContentPageQuery.OnRecipeSource onRecipeSource = value.c;
            if (onRecipeSource != null) {
                OnRecipeSource.b(writer, customScalarAdapters, onRecipeSource);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$ActionableCardClickAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$ActionableCardClickAnalytics;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActionableCardClickAnalytics implements Adapter<HomeContentPageQuery.ActionableCardClickAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ActionableCardClickAnalytics f23004a = new ActionableCardClickAnalytics();
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
                return new HomeContentPageQuery.ActionableCardClickAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.ActionableCardClickAnalytics value = (HomeContentPageQuery.ActionableCardClickAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22782a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$ActionableCardImpressionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$ActionableCardImpressionAnalytics;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActionableCardImpressionAnalytics implements Adapter<HomeContentPageQuery.ActionableCardImpressionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ActionableCardImpressionAnalytics f23005a = new ActionableCardImpressionAnalytics();
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
                return new HomeContentPageQuery.ActionableCardImpressionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.ActionableCardImpressionAnalytics value = (HomeContentPageQuery.ActionableCardImpressionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22783a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<HomeContentPageQuery.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f23006a = new Analytics();
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
                return new HomeContentPageQuery.Analytics(str);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Analytics value = (HomeContentPageQuery.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22784a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Analytics1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics1;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics1 implements Adapter<HomeContentPageQuery.Analytics1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics1 f23007a = new Analytics1();
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
                return new HomeContentPageQuery.Analytics1(str);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Analytics1 value = (HomeContentPageQuery.Analytics1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22785a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Analytics10;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics10;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics10 implements Adapter<HomeContentPageQuery.Analytics10> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics10 f23008a = new Analytics10();
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
                return new HomeContentPageQuery.Analytics10(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Analytics10 value = (HomeContentPageQuery.Analytics10) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22786a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Analytics11;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics11;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics11 implements Adapter<HomeContentPageQuery.Analytics11> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics11 f23009a = new Analytics11();
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
                return new HomeContentPageQuery.Analytics11(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Analytics11 value = (HomeContentPageQuery.Analytics11) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22787a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Analytics12;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics12;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics12 implements Adapter<HomeContentPageQuery.Analytics12> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics12 f23010a = new Analytics12();
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
                return new HomeContentPageQuery.Analytics12(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Analytics12 value = (HomeContentPageQuery.Analytics12) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22788a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Analytics13;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics13;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics13 implements Adapter<HomeContentPageQuery.Analytics13> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics13 f23011a = new Analytics13();
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
                return new HomeContentPageQuery.Analytics13(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Analytics13 value = (HomeContentPageQuery.Analytics13) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22789a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Analytics2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics2;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics2 implements Adapter<HomeContentPageQuery.Analytics2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics2 f23012a = new Analytics2();
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
                return new HomeContentPageQuery.Analytics2(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Analytics2 value = (HomeContentPageQuery.Analytics2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22790a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Analytics3;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics3;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics3 implements Adapter<HomeContentPageQuery.Analytics3> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics3 f23013a = new Analytics3();
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
                return new HomeContentPageQuery.Analytics3(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Analytics3 value = (HomeContentPageQuery.Analytics3) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22791a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Analytics4;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics4;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics4 implements Adapter<HomeContentPageQuery.Analytics4> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics4 f23014a = new Analytics4();
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
                return new HomeContentPageQuery.Analytics4(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Analytics4 value = (HomeContentPageQuery.Analytics4) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22792a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Analytics5;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics5;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics5 implements Adapter<HomeContentPageQuery.Analytics5> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics5 f23015a = new Analytics5();
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
                return new HomeContentPageQuery.Analytics5(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Analytics5 value = (HomeContentPageQuery.Analytics5) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22793a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Analytics6;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics6;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics6 implements Adapter<HomeContentPageQuery.Analytics6> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics6 f23016a = new Analytics6();
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
                return new HomeContentPageQuery.Analytics6(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Analytics6 value = (HomeContentPageQuery.Analytics6) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22794a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Analytics7;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics7;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics7 implements Adapter<HomeContentPageQuery.Analytics7> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics7 f23017a = new Analytics7();
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
                return new HomeContentPageQuery.Analytics7(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Analytics7 value = (HomeContentPageQuery.Analytics7) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22795a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Analytics8;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics8;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics8 implements Adapter<HomeContentPageQuery.Analytics8> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics8 f23018a = new Analytics8();
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
                return new HomeContentPageQuery.Analytics8(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Analytics8 value = (HomeContentPageQuery.Analytics8) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22796a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Analytics9;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics9;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics9 implements Adapter<HomeContentPageQuery.Analytics9> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics9 f23019a = new Analytics9();
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
                return new HomeContentPageQuery.Analytics9(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Analytics9 value = (HomeContentPageQuery.Analytics9) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22797a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$BannerAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$BannerAsset;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BannerAsset implements Adapter<HomeContentPageQuery.BannerAsset> {

        /* renamed from: a, reason: collision with root package name */
        public static final BannerAsset f23020a = new BannerAsset();
        public static final List b = CollectionsKt.R("assetType", "assetUrl", "assetWidth", "assetHeight", "fit", "altText");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            DownloadableAssetType downloadableAssetTypeA = null;
            String str = null;
            Integer num3 = null;
            DownloadableAssetFit downloadableAssetFit = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 != 0) {
                    if (iO2 == 1) {
                        num = num2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                    } else if (iO2 == 2) {
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                    } else if (iO2 == 3) {
                        num = num2;
                        num3 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                    } else if (iO2 == 4) {
                        num = num2;
                        downloadableAssetFit = (DownloadableAssetFit) Adapters.b(DownloadableAssetFit_ResponseAdapter.f12070a).fromJson(reader, customScalarAdapters);
                    } else {
                        if (iO2 != 5) {
                            break;
                        }
                        num = num2;
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                    }
                    num2 = num;
                } else {
                    downloadableAssetTypeA = DownloadableAssetType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            Integer num4 = num2;
            if (downloadableAssetTypeA == null) {
                Assertions.a(reader, "assetType");
                throw null;
            }
            if (str == null) {
                Assertions.a(reader, "assetUrl");
                throw null;
            }
            if (num4 == null) {
                Assertions.a(reader, "assetWidth");
                throw null;
            }
            Integer num5 = num3;
            int iIntValue = num4.intValue();
            if (num5 != null) {
                return new HomeContentPageQuery.BannerAsset(downloadableAssetTypeA, str, iIntValue, num5.intValue(), downloadableAssetFit, str2);
            }
            Assertions.a(reader, "assetHeight");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.BannerAsset value = (HomeContentPageQuery.BannerAsset) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("assetType");
            DownloadableAssetType_ResponseAdapter.b(writer, customScalarAdapters, value.f22798a);
            writer.F1("assetUrl");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("assetWidth");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.c, adapters$IntAdapter$1, writer, customScalarAdapters, "assetHeight");
            d.y(value.d, adapters$IntAdapter$1, writer, customScalarAdapters, "fit");
            Adapters.b(DownloadableAssetFit_ResponseAdapter.f12070a).toJson(writer, customScalarAdapters, value.e);
            writer.F1("altText");
            Adapters.i.toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$BroadcastBannerAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$BroadcastBannerAction;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BroadcastBannerAction implements Adapter<HomeContentPageQuery.BroadcastBannerAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final BroadcastBannerAction f23021a = new BroadcastBannerAction();
        public static final List b = CollectionsKt.R(UrlHandler.ACTION, "id", "type", "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ActionType actionTypeA = null;
            HomeContentPageQuery.Analytics3 analytics3 = null;
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
                    analytics3 = (HomeContentPageQuery.Analytics3) Adapters.b(Adapters.c(Analytics3.f23013a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, UrlHandler.ACTION);
                throw null;
            }
            if (actionTypeA != null) {
                return new HomeContentPageQuery.BroadcastBannerAction(str, str2, actionTypeA, analytics3);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.BroadcastBannerAction value = (HomeContentPageQuery.BroadcastBannerAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22799a);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics3.f23013a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$BroadcastBannerDismissAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$BroadcastBannerDismissAnalytics;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BroadcastBannerDismissAnalytics implements Adapter<HomeContentPageQuery.BroadcastBannerDismissAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final BroadcastBannerDismissAnalytics f23022a = new BroadcastBannerDismissAnalytics();
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
                return new HomeContentPageQuery.BroadcastBannerDismissAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.BroadcastBannerDismissAnalytics value = (HomeContentPageQuery.BroadcastBannerDismissAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22800a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$BroadcastBannerUI;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$BroadcastBannerUI;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BroadcastBannerUI implements Adapter<HomeContentPageQuery.BroadcastBannerUI> {

        /* renamed from: a, reason: collision with root package name */
        public static final BroadcastBannerUI f23023a = new BroadcastBannerUI();
        public static final List b = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "style", BarcodePickDeserializer.FIELD_ICON);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            CoreBroadcastBannerStyle coreBroadcastBannerStyleA = null;
            HomeContentPageQuery.Icon icon = null;
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
                    icon = (HomeContentPageQuery.Icon) Adapters.c(Icon.f23060a, true).fromJson(reader, customScalarAdapters);
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
                return new HomeContentPageQuery.BroadcastBannerUI(str, str2, coreBroadcastBannerStyleA, icon);
            }
            Assertions.a(reader, BarcodePickDeserializer.FIELD_ICON);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.BroadcastBannerUI value = (HomeContentPageQuery.BroadcastBannerUI) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22801a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            CoreBroadcastBannerStyle_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1(BarcodePickDeserializer.FIELD_ICON);
            Adapters.c(Icon.f23060a, true).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Button;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Button;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button implements Adapter<HomeContentPageQuery.Button> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button f23024a = new Button();
        public static final List b = CollectionsKt.R("__typename", AnnotatedPrivateKey.LABEL, "style", "enabled", UrlHandler.ACTION, "url");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            ButtonStyle buttonStyle = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
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
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    bool = bool2;
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    bool = bool2;
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool3 = bool2;
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool3 != null) {
                return new HomeContentPageQuery.Button(buttonStyle, str, str2, str3, str4, bool3.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Button value = (HomeContentPageQuery.Button) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22802a);
            writer.F1(AnnotatedPrivateKey.LABEL);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.c);
            writer.F1("enabled");
            d.B(value.d, Adapters.f, writer, customScalarAdapters, UrlHandler.ACTION);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("url");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$CarouselItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$CarouselItem;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CarouselItem implements Adapter<HomeContentPageQuery.CarouselItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final CarouselItem f23025a = new CarouselItem();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            HomeContentPageQuery.OnHeroBanner onHeroBannerA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("HeroBanner"))) {
                reader.o();
                onHeroBannerA = OnHeroBanner.a(reader, customScalarAdapters);
            }
            return new HomeContentPageQuery.CarouselItem(str, onHeroBannerA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.CarouselItem value = (HomeContentPageQuery.CarouselItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22803a);
            HomeContentPageQuery.OnHeroBanner onHeroBanner = value.b;
            if (onHeroBanner != null) {
                OnHeroBanner.b(writer, customScalarAdapters, onHeroBanner);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$ChatEntryCardAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$ChatEntryCardAction;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ChatEntryCardAction implements Adapter<HomeContentPageQuery.ChatEntryCardAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final ChatEntryCardAction f23026a = new ChatEntryCardAction();
        public static final List b = CollectionsKt.R("id", UrlHandler.ACTION, "type", "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            ActionType actionTypeA = null;
            HomeContentPageQuery.Analytics13 analytics13 = null;
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
                    analytics13 = (HomeContentPageQuery.Analytics13) Adapters.b(Adapters.c(Analytics13.f23011a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str2 == null) {
                Assertions.a(reader, UrlHandler.ACTION);
                throw null;
            }
            if (actionTypeA != null) {
                return new HomeContentPageQuery.ChatEntryCardAction(str, str2, actionTypeA, analytics13);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.ChatEntryCardAction value = (HomeContentPageQuery.ChatEntryCardAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.f22804a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics13.f23011a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$ChatEntryCardContext;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$ChatEntryCardContext;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ChatEntryCardContext implements Adapter<HomeContentPageQuery.ChatEntryCardContext> {

        /* renamed from: a, reason: collision with root package name */
        public static final ChatEntryCardContext f23027a = new ChatEntryCardContext();
        public static final List b = CollectionsKt.R("source", "data");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            List list = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    list = (List) Adapters.b(Adapters.a(Adapters.c(Data1.f23033a, false))).fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new HomeContentPageQuery.ChatEntryCardContext(str, list);
            }
            Assertions.a(reader, "source");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.ChatEntryCardContext value = (HomeContentPageQuery.ChatEntryCardContext) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("source");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22805a);
            writer.F1("data");
            Adapters.b(Adapters.a(Adapters.c(Data1.f23033a, false))).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$ChatEntryCardCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$ChatEntryCardCta;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ChatEntryCardCta implements Adapter<HomeContentPageQuery.ChatEntryCardCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final ChatEntryCardCta f23028a = new ChatEntryCardCta();
        public static final List b = CollectionsKt.R("chatEntryCardCtaIconUrl", "chatEntryCardPrompts", "chatEntryCardElement", "chatEntryCardContext", "chatEntryCardAction");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            List list = null;
            ChatEntryCardElement chatEntryCardElementA = null;
            HomeContentPageQuery.ChatEntryCardContext chatEntryCardContext = null;
            HomeContentPageQuery.ChatEntryCardAction chatEntryCardAction = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    list = (List) Adapters.b(Adapters.a(Adapters.f13493a)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    chatEntryCardElementA = ChatEntryCardElement_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    chatEntryCardContext = (HomeContentPageQuery.ChatEntryCardContext) Adapters.c(ChatEntryCardContext.f23027a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    chatEntryCardAction = (HomeContentPageQuery.ChatEntryCardAction) Adapters.c(ChatEntryCardAction.f23026a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (chatEntryCardElementA == null) {
                Assertions.a(reader, "chatEntryCardElement");
                throw null;
            }
            if (chatEntryCardContext == null) {
                Assertions.a(reader, "chatEntryCardContext");
                throw null;
            }
            if (chatEntryCardAction != null) {
                return new HomeContentPageQuery.ChatEntryCardCta(str, list, chatEntryCardElementA, chatEntryCardContext, chatEntryCardAction);
            }
            Assertions.a(reader, "chatEntryCardAction");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.ChatEntryCardCta value = (HomeContentPageQuery.ChatEntryCardCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("chatEntryCardCtaIconUrl");
            Adapters.i.toJson(writer, customScalarAdapters, value.f22806a);
            writer.F1("chatEntryCardPrompts");
            Adapters.b(Adapters.a(Adapters.f13493a)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("chatEntryCardElement");
            writer.v0(value.c.d);
            writer.F1("chatEntryCardContext");
            Adapters.c(ChatEntryCardContext.f23027a, false).toJson(writer, customScalarAdapters, value.d);
            writer.F1("chatEntryCardAction");
            Adapters.c(ChatEntryCardAction.f23026a, false).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$ContentCardAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$ContentCardAction;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentCardAction implements Adapter<HomeContentPageQuery.ContentCardAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final ContentCardAction f23029a = new ContentCardAction();
        public static final List b = CollectionsKt.R("type", UrlHandler.ACTION, "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActionType actionTypeA = null;
            String str = null;
            HomeContentPageQuery.Analytics11 analytics11 = null;
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
                    analytics11 = (HomeContentPageQuery.Analytics11) Adapters.b(Adapters.c(Analytics11.f23009a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new HomeContentPageQuery.ContentCardAction(actionTypeA, str, analytics11);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.ContentCardAction value = (HomeContentPageQuery.ContentCardAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.f22807a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics11.f23009a, true)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$ContentCardBrandImage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$ContentCardBrandImage;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentCardBrandImage implements Adapter<HomeContentPageQuery.ContentCardBrandImage> {

        /* renamed from: a, reason: collision with root package name */
        public static final ContentCardBrandImage f23030a = new ContentCardBrandImage();
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
                return new HomeContentPageQuery.ContentCardBrandImage(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.ContentCardBrandImage value = (HomeContentPageQuery.ContentCardBrandImage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22808a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$ContentCardFooter;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$ContentCardFooter;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContentCardFooter implements Adapter<HomeContentPageQuery.ContentCardFooter> {

        /* renamed from: a, reason: collision with root package name */
        public static final ContentCardFooter f23031a = new ContentCardFooter();
        public static final List b = CollectionsKt.R("style", TextBundle.TEXT_ENTRY, "logo");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            FooterStyle footerStyleA = null;
            String str = null;
            HomeContentPageQuery.Logo logo = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    footerStyleA = FooterStyle_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    logo = (HomeContentPageQuery.Logo) Adapters.b(Adapters.c(Logo.f23078a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (footerStyleA != null) {
                return new HomeContentPageQuery.ContentCardFooter(footerStyleA, str, logo);
            }
            Assertions.a(reader, "style");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.ContentCardFooter value = (HomeContentPageQuery.ContentCardFooter) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("style");
            FooterStyle_ResponseAdapter.b(writer, customScalarAdapters, value.f22809a);
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("logo");
            Adapters.b(Adapters.c(Logo.f23078a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Data;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<HomeContentPageQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f23032a = new Data();
        public static final List b = CollectionsKt.R("home", "homePage");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            HomeContentPageQuery.Home home = null;
            HomeContentPageQuery.HomePage homePage = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    home = (HomeContentPageQuery.Home) Adapters.b(Adapters.c(Home.f23055a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    homePage = (HomeContentPageQuery.HomePage) Adapters.c(HomePage.f23056a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (homePage != null) {
                return new HomeContentPageQuery.Data(home, homePage);
            }
            Assertions.a(reader, "homePage");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Data value = (HomeContentPageQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("home");
            Adapters.b(Adapters.c(Home.f23055a, false)).toJson(writer, customScalarAdapters, value.f22810a);
            writer.F1("homePage");
            Adapters.c(HomePage.f23056a, false).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Data1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Data1;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data1 implements Adapter<HomeContentPageQuery.Data1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data1 f23033a = new Data1();
        public static final List b = CollectionsKt.R("key", "value");

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
                Assertions.a(reader, "key");
                throw null;
            }
            if (str2 != null) {
                return new HomeContentPageQuery.Data1(str, str2);
            }
            Assertions.a(reader, "value");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Data1 value = (HomeContentPageQuery.Data1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("key");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22811a);
            writer.F1("value");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$DeliveryNow;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$DeliveryNow;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryNow implements Adapter<HomeContentPageQuery.DeliveryNow> {

        /* renamed from: a, reason: collision with root package name */
        public static final DeliveryNow f23034a = new DeliveryNow();
        public static final List b = CollectionsKt.R("status", "expressDeliveryStoreId");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Integer num = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    num = (Integer) Adapters.k.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new HomeContentPageQuery.DeliveryNow(str, num);
            }
            Assertions.a(reader, "status");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.DeliveryNow value = (HomeContentPageQuery.DeliveryNow) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("status");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22812a);
            writer.F1("expressDeliveryStoreId");
            Adapters.k.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$DeliveryNowBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$DeliveryNowBanner;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryNowBanner implements Adapter<HomeContentPageQuery.DeliveryNowBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final DeliveryNowBanner f23035a = new DeliveryNowBanner();
        public static final List b = CollectionsKt.Q("_excluded");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            while (reader.o2(b) == 0) {
                bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
            }
            return new HomeContentPageQuery.DeliveryNowBanner(bool);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.DeliveryNowBanner value = (HomeContentPageQuery.DeliveryNowBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.f22813a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$DeliveryNowBanner1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$DeliveryNowBanner1;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryNowBanner1 implements Adapter<HomeContentPageQuery.DeliveryNowBanner1> {

        /* renamed from: a, reason: collision with root package name */
        public static final DeliveryNowBanner1 f23036a = new DeliveryNowBanner1();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            HomeContentPageQuery.OnHomeDeliveryNowBottomBanner onHomeDeliveryNowBottomBannerA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            HomeContentPageQuery.OnHomeDeliveryNowBanner onHomeDeliveryNowBannerA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HomeDeliveryNowBottomBanner"))) {
                reader.o();
                onHomeDeliveryNowBottomBannerA = OnHomeDeliveryNowBottomBanner.a(reader, customScalarAdapters);
            } else {
                onHomeDeliveryNowBottomBannerA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HomeDeliveryNowBanner"))) {
                reader.o();
                onHomeDeliveryNowBannerA = OnHomeDeliveryNowBanner.a(reader, customScalarAdapters);
            }
            return new HomeContentPageQuery.DeliveryNowBanner1(str, onHomeDeliveryNowBottomBannerA, onHomeDeliveryNowBannerA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.DeliveryNowBanner1 value = (HomeContentPageQuery.DeliveryNowBanner1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22814a);
            HomeContentPageQuery.OnHomeDeliveryNowBottomBanner onHomeDeliveryNowBottomBanner = value.b;
            if (onHomeDeliveryNowBottomBanner != null) {
                OnHomeDeliveryNowBottomBanner.b(writer, customScalarAdapters, onHomeDeliveryNowBottomBanner);
            }
            HomeContentPageQuery.OnHomeDeliveryNowBanner onHomeDeliveryNowBanner = value.c;
            if (onHomeDeliveryNowBanner != null) {
                List list = OnHomeDeliveryNowBanner.f23091a;
                writer.F1("_excluded");
                Adapters.l.toJson(writer, customScalarAdapters, onHomeDeliveryNowBanner.f22869a);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Divider;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Divider;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Divider implements Adapter<HomeContentPageQuery.Divider> {

        /* renamed from: a, reason: collision with root package name */
        public static final Divider f23037a = new Divider();
        public static final List b = CollectionsKt.Q("_excluded");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            while (reader.o2(b) == 0) {
                bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
            }
            return new HomeContentPageQuery.Divider(bool);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Divider value = (HomeContentPageQuery.Divider) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.f22815a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$EventAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$EventAnalytics;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EventAnalytics implements Adapter<HomeContentPageQuery.EventAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final EventAnalytics f23038a = new EventAnalytics();
        public static final List b = CollectionsKt.R("impression", "videoPlay", "videoPause", "videoErrorImpression");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            HomeContentPageQuery.Impression impression = null;
            HomeContentPageQuery.VideoPlay videoPlay = null;
            HomeContentPageQuery.VideoPause videoPause = null;
            HomeContentPageQuery.VideoErrorImpression videoErrorImpression = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    impression = (HomeContentPageQuery.Impression) Adapters.b(Adapters.c(Impression.f23061a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    videoPlay = (HomeContentPageQuery.VideoPlay) Adapters.b(Adapters.c(VideoPlay.f23133a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    videoPause = (HomeContentPageQuery.VideoPause) Adapters.b(Adapters.c(VideoPause.f23132a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        return new HomeContentPageQuery.EventAnalytics(impression, videoPlay, videoPause, videoErrorImpression);
                    }
                    videoErrorImpression = (HomeContentPageQuery.VideoErrorImpression) Adapters.b(Adapters.c(VideoErrorImpression.f23131a, true)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.EventAnalytics value = (HomeContentPageQuery.EventAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("impression");
            Adapters.b(Adapters.c(Impression.f23061a, true)).toJson(writer, customScalarAdapters, value.f22816a);
            writer.F1("videoPlay");
            Adapters.b(Adapters.c(VideoPlay.f23133a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("videoPause");
            Adapters.b(Adapters.c(VideoPause.f23132a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("videoErrorImpression");
            Adapters.b(Adapters.c(VideoErrorImpression.f23131a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$ExtraContent;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$ExtraContent;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExtraContent implements Adapter<HomeContentPageQuery.ExtraContent> {

        /* renamed from: a, reason: collision with root package name */
        public static final ExtraContent f23039a = new ExtraContent();
        public static final List b = CollectionsKt.R("key", "value");

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
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new HomeContentPageQuery.ExtraContent(str, str2);
            }
            Assertions.a(reader, "key");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.ExtraContent value = (HomeContentPageQuery.ExtraContent) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("key");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22817a);
            writer.F1("value");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$FallbackImage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$FallbackImage;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FallbackImage implements Adapter<HomeContentPageQuery.FallbackImage> {

        /* renamed from: a, reason: collision with root package name */
        public static final FallbackImage f23040a = new FallbackImage();
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
                return new HomeContentPageQuery.FallbackImage(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.FallbackImage value = (HomeContentPageQuery.FallbackImage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22818a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$FulfilmentStatusBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$FulfilmentStatusBanner;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FulfilmentStatusBanner implements Adapter<HomeContentPageQuery.FulfilmentStatusBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final FulfilmentStatusBanner f23041a = new FulfilmentStatusBanner();
        public static final List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "buttonLabel");

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
                return new HomeContentPageQuery.FulfilmentStatusBanner(str, str2);
            }
            Assertions.a(reader, "buttonLabel");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.FulfilmentStatusBanner value = (HomeContentPageQuery.FulfilmentStatusBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22819a);
            writer.F1("buttonLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$FulfilmentWindowStateButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$FulfilmentWindowStateButton;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FulfilmentWindowStateButton implements Adapter<HomeContentPageQuery.FulfilmentWindowStateButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final FulfilmentWindowStateButton f23042a = new FulfilmentWindowStateButton();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "style", "enabled", UrlHandler.ACTION, "url");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            String str = null;
            ButtonStyle buttonStyle = null;
            String str2 = null;
            String str3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    bool = bool2;
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    bool = bool2;
                    buttonStyle = (ButtonStyle) Adapters.b(ButtonStyle_ResponseAdapter.f12040a).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    bool = bool2;
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    bool = bool2;
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
                bool2 = bool;
            }
            Boolean bool3 = bool2;
            if (str == null) {
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (bool3 != null) {
                return new HomeContentPageQuery.FulfilmentWindowStateButton(str, buttonStyle, bool3.booleanValue(), str2, str3);
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.FulfilmentWindowStateButton value = (HomeContentPageQuery.FulfilmentWindowStateButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22820a);
            writer.F1("style");
            Adapters.b(ButtonStyle_ResponseAdapter.f12040a).toJson(writer, customScalarAdapters, value.b);
            writer.F1("enabled");
            d.B(value.c, Adapters.f, writer, customScalarAdapters, UrlHandler.ACTION);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("url");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$FulfilmentWindowStateSubtitle;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$FulfilmentWindowStateSubtitle;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FulfilmentWindowStateSubtitle implements Adapter<HomeContentPageQuery.FulfilmentWindowStateSubtitle> {

        /* renamed from: a, reason: collision with root package name */
        public static final FulfilmentWindowStateSubtitle f23043a = new FulfilmentWindowStateSubtitle();
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
                return new HomeContentPageQuery.FulfilmentWindowStateSubtitle(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.FulfilmentWindowStateSubtitle value = (HomeContentPageQuery.FulfilmentWindowStateSubtitle) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22821a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$FulfilmentWindowTile;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$FulfilmentWindowTile;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FulfilmentWindowTile implements Adapter<HomeContentPageQuery.FulfilmentWindowTile> {

        /* renamed from: a, reason: collision with root package name */
        public static final FulfilmentWindowTile f23044a = new FulfilmentWindowTile();
        public static final List b = CollectionsKt.R("style", "iconUrl", "url", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            HomeFulfilmentWindowTileStyle homeFulfilmentWindowTileStyleA = null;
            String str = null;
            String str2 = null;
            HomeContentPageQuery.Title title = null;
            HomeContentPageQuery.Subtitle subtitle = null;
            HomeContentPageQuery.Analytics analytics = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    homeFulfilmentWindowTileStyleA = HomeFulfilmentWindowTileStyle_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    title = (HomeContentPageQuery.Title) Adapters.c(Title.f23124a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    subtitle = (HomeContentPageQuery.Subtitle) Adapters.b(Adapters.c(Subtitle.f23121a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    analytics = (HomeContentPageQuery.Analytics) Adapters.c(Analytics.f23006a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (homeFulfilmentWindowTileStyleA == null) {
                Assertions.a(reader, "style");
                throw null;
            }
            if (str == null) {
                Assertions.a(reader, "iconUrl");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "url");
                throw null;
            }
            if (title == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (analytics != null) {
                return new HomeContentPageQuery.FulfilmentWindowTile(homeFulfilmentWindowTileStyleA, str, str2, title, subtitle, analytics);
            }
            Assertions.a(reader, "analytics");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.FulfilmentWindowTile value = (HomeContentPageQuery.FulfilmentWindowTile) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("style");
            HomeFulfilmentWindowTileStyle_ResponseAdapter.b(writer, customScalarAdapters, value.f22822a);
            writer.F1("iconUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("url");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("title");
            Adapters.c(Title.f23124a, false).toJson(writer, customScalarAdapters, value.d);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.b(Adapters.c(Subtitle.f23121a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("analytics");
            Adapters.c(Analytics.f23006a, false).toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$HeaderItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$HeaderItem;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeaderItem implements Adapter<HomeContentPageQuery.HeaderItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final HeaderItem f23045a = new HeaderItem();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            HomeContentPageQuery.OnHomeFulfilmentWindowBanner onHomeFulfilmentWindowBannerA;
            HomeContentPageQuery.OnHomeFulfilmentWindowContainer onHomeFulfilmentWindowContainerA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            HomeContentPageQuery.OnHomeModeSelectorContainer onHomeModeSelectorContainerA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HomeFulfilmentWindowBanner"))) {
                reader.o();
                onHomeFulfilmentWindowBannerA = OnHomeFulfilmentWindowBanner.a(reader, customScalarAdapters);
            } else {
                onHomeFulfilmentWindowBannerA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HomeFulfilmentWindowContainer"))) {
                reader.o();
                onHomeFulfilmentWindowContainerA = OnHomeFulfilmentWindowContainer.a(reader, customScalarAdapters);
            } else {
                onHomeFulfilmentWindowContainerA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HomeModeSelectorContainer"))) {
                reader.o();
                onHomeModeSelectorContainerA = OnHomeModeSelectorContainer.a(reader, customScalarAdapters);
            }
            return new HomeContentPageQuery.HeaderItem(str, onHomeFulfilmentWindowBannerA, onHomeFulfilmentWindowContainerA, onHomeModeSelectorContainerA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.HeaderItem value = (HomeContentPageQuery.HeaderItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22823a);
            HomeContentPageQuery.OnHomeFulfilmentWindowBanner onHomeFulfilmentWindowBanner = value.b;
            if (onHomeFulfilmentWindowBanner != null) {
                OnHomeFulfilmentWindowBanner.b(writer, customScalarAdapters, onHomeFulfilmentWindowBanner);
            }
            HomeContentPageQuery.OnHomeFulfilmentWindowContainer onHomeFulfilmentWindowContainer = value.c;
            if (onHomeFulfilmentWindowContainer != null) {
                OnHomeFulfilmentWindowContainer.b(writer, customScalarAdapters, onHomeFulfilmentWindowContainer);
            }
            HomeContentPageQuery.OnHomeModeSelectorContainer onHomeModeSelectorContainer = value.d;
            if (onHomeModeSelectorContainer != null) {
                OnHomeModeSelectorContainer.b(writer, customScalarAdapters, onHomeModeSelectorContainer);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$HeroBannerAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$HeroBannerAction;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeroBannerAction implements Adapter<HomeContentPageQuery.HeroBannerAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final HeroBannerAction f23046a = new HeroBannerAction();
        public static final List b = CollectionsKt.R(UrlHandler.ACTION, "analytics", "type");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            HomeContentPageQuery.Analytics4 analytics4 = null;
            ActionType actionTypeA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    analytics4 = (HomeContentPageQuery.Analytics4) Adapters.b(Adapters.c(Analytics4.f23014a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, UrlHandler.ACTION);
                throw null;
            }
            if (actionTypeA != null) {
                return new HomeContentPageQuery.HeroBannerAction(str, analytics4, actionTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.HeroBannerAction value = (HomeContentPageQuery.HeroBannerAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22824a);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics4.f23014a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$HeroBannerAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$HeroBannerAnalytics;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeroBannerAnalytics implements Adapter<HomeContentPageQuery.HeroBannerAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final HeroBannerAnalytics f23047a = new HeroBannerAnalytics();
        public static final List b = CollectionsKt.R("__typename", "extraContent");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            List list = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    list = (List) Adapters.b(Adapters.a(Adapters.c(ExtraContent.f23039a, false))).fromJson(reader, customScalarAdapters);
                }
            }
            reader.o();
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new HomeContentPageQuery.HeroBannerAnalytics(str, list, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.HeroBannerAnalytics value = (HomeContentPageQuery.HeroBannerAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22825a);
            writer.F1("extraContent");
            Adapters.b(Adapters.a(Adapters.c(ExtraContent.f23039a, false))).toJson(writer, customScalarAdapters, value.b);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$HeroBannerBody;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$HeroBannerBody;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeroBannerBody implements Adapter<HomeContentPageQuery.HeroBannerBody> {

        /* renamed from: a, reason: collision with root package name */
        public static final HeroBannerBody f23048a = new HeroBannerBody();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            HomeContentPageQuery.OnHeroBannerBodyText onHeroBannerBodyTextA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            HomeContentPageQuery.OnHeroBannerPromoBody onHeroBannerPromoBodyA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HeroBannerBodyText"))) {
                reader.o();
                onHeroBannerBodyTextA = OnHeroBannerBodyText.a(reader, customScalarAdapters);
            } else {
                onHeroBannerBodyTextA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HeroBannerPromoBody"))) {
                reader.o();
                onHeroBannerPromoBodyA = OnHeroBannerPromoBody.a(reader, customScalarAdapters);
            }
            return new HomeContentPageQuery.HeroBannerBody(str, onHeroBannerBodyTextA, onHeroBannerPromoBodyA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.HeroBannerBody value = (HomeContentPageQuery.HeroBannerBody) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22826a);
            HomeContentPageQuery.OnHeroBannerBodyText onHeroBannerBodyText = value.b;
            if (onHeroBannerBodyText != null) {
                OnHeroBannerBodyText.b(writer, customScalarAdapters, onHeroBannerBodyText);
            }
            HomeContentPageQuery.OnHeroBannerPromoBody onHeroBannerPromoBody = value.c;
            if (onHeroBannerPromoBody != null) {
                OnHeroBannerPromoBody.b(writer, customScalarAdapters, onHeroBannerPromoBody);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$HeroBannerBrandsLogo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$HeroBannerBrandsLogo;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeroBannerBrandsLogo implements Adapter<HomeContentPageQuery.HeroBannerBrandsLogo> {

        /* renamed from: a, reason: collision with root package name */
        public static final HeroBannerBrandsLogo f23049a = new HeroBannerBrandsLogo();
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
                return new HomeContentPageQuery.HeroBannerBrandsLogo(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.HeroBannerBrandsLogo value = (HomeContentPageQuery.HeroBannerBrandsLogo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22827a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$HeroBannerGraphic;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$HeroBannerGraphic;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeroBannerGraphic implements Adapter<HomeContentPageQuery.HeroBannerGraphic> {

        /* renamed from: a, reason: collision with root package name */
        public static final HeroBannerGraphic f23050a = new HeroBannerGraphic();
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
                return new HomeContentPageQuery.HeroBannerGraphic(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.HeroBannerGraphic value = (HomeContentPageQuery.HeroBannerGraphic) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22828a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$HeroBannerImage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$HeroBannerImage;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeroBannerImage implements Adapter<HomeContentPageQuery.HeroBannerImage> {

        /* renamed from: a, reason: collision with root package name */
        public static final HeroBannerImage f23051a = new HeroBannerImage();
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
                return new HomeContentPageQuery.HeroBannerImage(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.HeroBannerImage value = (HomeContentPageQuery.HeroBannerImage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22829a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$HeroBannerImpressionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$HeroBannerImpressionAnalytics;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeroBannerImpressionAnalytics implements Adapter<HomeContentPageQuery.HeroBannerImpressionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final HeroBannerImpressionAnalytics f23052a = new HeroBannerImpressionAnalytics();
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
                return new HomeContentPageQuery.HeroBannerImpressionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.HeroBannerImpressionAnalytics value = (HomeContentPageQuery.HeroBannerImpressionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22830a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$HeroBannerTermsAndConditionAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$HeroBannerTermsAndConditionAction;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeroBannerTermsAndConditionAction implements Adapter<HomeContentPageQuery.HeroBannerTermsAndConditionAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final HeroBannerTermsAndConditionAction f23053a = new HeroBannerTermsAndConditionAction();
        public static final List b = CollectionsKt.R(UrlHandler.ACTION, "type", "id", "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ActionType actionTypeA = null;
            String str2 = null;
            HomeContentPageQuery.Analytics5 analytics5 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    analytics5 = (HomeContentPageQuery.Analytics5) Adapters.b(Adapters.c(Analytics5.f23015a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, UrlHandler.ACTION);
                throw null;
            }
            if (actionTypeA != null) {
                return new HomeContentPageQuery.HeroBannerTermsAndConditionAction(str, actionTypeA, str2, analytics5);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.HeroBannerTermsAndConditionAction value = (HomeContentPageQuery.HeroBannerTermsAndConditionAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22831a);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics5.f23015a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$HeroBannerTermsAndConditions;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$HeroBannerTermsAndConditions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeroBannerTermsAndConditions implements Adapter<HomeContentPageQuery.HeroBannerTermsAndConditions> {

        /* renamed from: a, reason: collision with root package name */
        public static final HeroBannerTermsAndConditions f23054a = new HeroBannerTermsAndConditions();
        public static final List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "heroBannerTermsAndConditionAction");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            HomeContentPageQuery.HeroBannerTermsAndConditionAction heroBannerTermsAndConditionAction = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    heroBannerTermsAndConditionAction = (HomeContentPageQuery.HeroBannerTermsAndConditionAction) Adapters.b(Adapters.c(HeroBannerTermsAndConditionAction.f23053a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new HomeContentPageQuery.HeroBannerTermsAndConditions(str, heroBannerTermsAndConditionAction);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.HeroBannerTermsAndConditions value = (HomeContentPageQuery.HeroBannerTermsAndConditions) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22832a);
            writer.F1("heroBannerTermsAndConditionAction");
            Adapters.b(Adapters.c(HeroBannerTermsAndConditionAction.f23053a, false)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Home;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Home;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Home implements Adapter<HomeContentPageQuery.Home> {

        /* renamed from: a, reason: collision with root package name */
        public static final Home f23055a = new Home();
        public static final List b = CollectionsKt.R("headerItems", "deliveryNow", "unreadChatbotMsg");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            HomeContentPageQuery.DeliveryNow deliveryNow = null;
            HomeContentPageQuery.UnreadChatbotMsg unreadChatbotMsg = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    arrayListFromJson = Adapters.a(Adapters.b(Adapters.c(HeaderItem.f23045a, true))).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    deliveryNow = (HomeContentPageQuery.DeliveryNow) Adapters.b(Adapters.c(DeliveryNow.f23034a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    unreadChatbotMsg = (HomeContentPageQuery.UnreadChatbotMsg) Adapters.b(Adapters.c(UnreadChatbotMsg.f23127a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new HomeContentPageQuery.Home(arrayListFromJson, deliveryNow, unreadChatbotMsg);
            }
            Assertions.a(reader, "headerItems");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Home value = (HomeContentPageQuery.Home) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("headerItems");
            Adapters.a(Adapters.b(Adapters.c(HeaderItem.f23045a, true))).toJson(writer, customScalarAdapters, value.f22833a);
            writer.F1("deliveryNow");
            Adapters.b(Adapters.c(DeliveryNow.f23034a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("unreadChatbotMsg");
            Adapters.b(Adapters.c(UnreadChatbotMsg.f23127a, false)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$HomePage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$HomePage;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HomePage implements Adapter<HomeContentPageQuery.HomePage> {

        /* renamed from: a, reason: collision with root package name */
        public static final HomePage f23056a = new HomePage();
        public static final List b = CollectionsKt.R("analytics", "impressionAnalytics", "items");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            HomeContentPageQuery.Analytics2 analytics2 = null;
            HomeContentPageQuery.ImpressionAnalytics impressionAnalytics = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    analytics2 = (HomeContentPageQuery.Analytics2) Adapters.b(Adapters.c(Analytics2.f23012a, true)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    impressionAnalytics = (HomeContentPageQuery.ImpressionAnalytics) Adapters.b(Adapters.c(ImpressionAnalytics.f23062a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.b(Adapters.c(Item.f23068a, true))).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson != null) {
                return new HomeContentPageQuery.HomePage(analytics2, impressionAnalytics, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.HomePage value = (HomeContentPageQuery.HomePage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics2.f23012a, true)).toJson(writer, customScalarAdapters, value.f22834a);
            writer.F1("impressionAnalytics");
            Adapters.b(Adapters.c(ImpressionAnalytics.f23062a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("items");
            Adapters.a(Adapters.b(Adapters.c(Item.f23068a, true))).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$HorizontalListAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$HorizontalListAnalytics;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HorizontalListAnalytics implements Adapter<HomeContentPageQuery.HorizontalListAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final HorizontalListAnalytics f23057a = new HorizontalListAnalytics();
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
                return new HomeContentPageQuery.HorizontalListAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.HorizontalListAnalytics value = (HomeContentPageQuery.HorizontalListAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22835a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$HorizontalListImpressionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$HorizontalListImpressionAnalytics;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HorizontalListImpressionAnalytics implements Adapter<HomeContentPageQuery.HorizontalListImpressionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final HorizontalListImpressionAnalytics f23058a = new HorizontalListImpressionAnalytics();
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
                return new HomeContentPageQuery.HorizontalListImpressionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.HorizontalListImpressionAnalytics value = (HomeContentPageQuery.HorizontalListImpressionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22836a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$HorizontalListTrailingLink;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$HorizontalListTrailingLink;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HorizontalListTrailingLink implements Adapter<HomeContentPageQuery.HorizontalListTrailingLink> {

        /* renamed from: a, reason: collision with root package name */
        public static final HorizontalListTrailingLink f23059a = new HorizontalListTrailingLink();
        public static final List b = CollectionsKt.R("linkTextWithAlt", "linkId", "linkAction");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            HomeContentPageQuery.LinkTextWithAlt1 linkTextWithAlt1 = null;
            String str = null;
            HomeContentPageQuery.LinkAction1 linkAction1 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    linkTextWithAlt1 = (HomeContentPageQuery.LinkTextWithAlt1) Adapters.c(LinkTextWithAlt1.f23077a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    linkAction1 = (HomeContentPageQuery.LinkAction1) Adapters.c(LinkAction1.f23073a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (linkTextWithAlt1 == null) {
                Assertions.a(reader, "linkTextWithAlt");
                throw null;
            }
            if (linkAction1 != null) {
                return new HomeContentPageQuery.HorizontalListTrailingLink(linkTextWithAlt1, str, linkAction1);
            }
            Assertions.a(reader, "linkAction");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.HorizontalListTrailingLink value = (HomeContentPageQuery.HorizontalListTrailingLink) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("linkTextWithAlt");
            Adapters.c(LinkTextWithAlt1.f23077a, false).toJson(writer, customScalarAdapters, value.f22837a);
            writer.F1("linkId");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("linkAction");
            Adapters.c(LinkAction1.f23073a, false).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Icon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Icon;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Icon implements Adapter<HomeContentPageQuery.Icon> {

        /* renamed from: a, reason: collision with root package name */
        public static final Icon f23060a = new Icon();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            HomeContentPageQuery.OnCoreIcon onCoreIconA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            HomeContentPageQuery.OnHostedIcon onHostedIconA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("CoreIcon"))) {
                reader.o();
                onCoreIconA = OnCoreIcon.a(reader, customScalarAdapters);
            } else {
                onCoreIconA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("HostedIcon"))) {
                reader.o();
                onHostedIconA = OnHostedIcon.a(reader, customScalarAdapters);
            }
            return new HomeContentPageQuery.Icon(str, onCoreIconA, onHostedIconA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Icon value = (HomeContentPageQuery.Icon) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22838a);
            HomeContentPageQuery.OnCoreIcon onCoreIcon = value.b;
            if (onCoreIcon != null) {
                OnCoreIcon.b(writer, customScalarAdapters, onCoreIcon);
            }
            HomeContentPageQuery.OnHostedIcon onHostedIcon = value.c;
            if (onHostedIcon != null) {
                OnHostedIcon.b(writer, customScalarAdapters, onHostedIcon);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Impression;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Impression;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Impression implements Adapter<HomeContentPageQuery.Impression> {

        /* renamed from: a, reason: collision with root package name */
        public static final Impression f23061a = new Impression();
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
                return new HomeContentPageQuery.Impression(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Impression value = (HomeContentPageQuery.Impression) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22839a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$ImpressionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$ImpressionAnalytics;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImpressionAnalytics implements Adapter<HomeContentPageQuery.ImpressionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImpressionAnalytics f23062a = new ImpressionAnalytics();
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
                return new HomeContentPageQuery.ImpressionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.ImpressionAnalytics value = (HomeContentPageQuery.ImpressionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22840a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$ImpressionAnalytics1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$ImpressionAnalytics1;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImpressionAnalytics1 implements Adapter<HomeContentPageQuery.ImpressionAnalytics1> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImpressionAnalytics1 f23063a = new ImpressionAnalytics1();
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
                return new HomeContentPageQuery.ImpressionAnalytics1(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.ImpressionAnalytics1 value = (HomeContentPageQuery.ImpressionAnalytics1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22841a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$ImpressionAnalytics2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$ImpressionAnalytics2;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImpressionAnalytics2 implements Adapter<HomeContentPageQuery.ImpressionAnalytics2> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImpressionAnalytics2 f23064a = new ImpressionAnalytics2();
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
                return new HomeContentPageQuery.ImpressionAnalytics2(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.ImpressionAnalytics2 value = (HomeContentPageQuery.ImpressionAnalytics2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22842a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$ImpressionAnalytics3;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$ImpressionAnalytics3;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImpressionAnalytics3 implements Adapter<HomeContentPageQuery.ImpressionAnalytics3> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImpressionAnalytics3 f23065a = new ImpressionAnalytics3();
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
                return new HomeContentPageQuery.ImpressionAnalytics3(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.ImpressionAnalytics3 value = (HomeContentPageQuery.ImpressionAnalytics3) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22843a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$ImpressionAnalytics4;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$ImpressionAnalytics4;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ImpressionAnalytics4 implements Adapter<HomeContentPageQuery.ImpressionAnalytics4> {

        /* renamed from: a, reason: collision with root package name */
        public static final ImpressionAnalytics4 f23066a = new ImpressionAnalytics4();
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
                return new HomeContentPageQuery.ImpressionAnalytics4(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.ImpressionAnalytics4 value = (HomeContentPageQuery.ImpressionAnalytics4) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22844a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$InStoreDetailsCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$InStoreDetailsCard;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InStoreDetailsCard implements Adapter<HomeContentPageQuery.InStoreDetailsCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final InStoreDetailsCard f23067a = new InStoreDetailsCard();
        public static final List b = CollectionsKt.R("storeName", "storeTime", "isLocationMapped");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            HomeContentPageQuery.StoreName storeName = null;
            HomeContentPageQuery.StoreTime storeTime = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    storeName = (HomeContentPageQuery.StoreName) Adapters.b(Adapters.c(StoreName.f23119a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    storeTime = (HomeContentPageQuery.StoreTime) Adapters.b(Adapters.c(StoreTime.f23120a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        return new HomeContentPageQuery.InStoreDetailsCard(storeName, storeTime, bool);
                    }
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.InStoreDetailsCard value = (HomeContentPageQuery.InStoreDetailsCard) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("storeName");
            Adapters.b(Adapters.c(StoreName.f23119a, false)).toJson(writer, customScalarAdapters, value.f22845a);
            writer.F1("storeTime");
            Adapters.b(Adapters.c(StoreTime.f23120a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("isLocationMapped");
            Adapters.l.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Item;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<HomeContentPageQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f23068a = new Item();
        public static final List b = CollectionsKt.Q("__typename");

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            HomeContentPageQuery.OnRegistrationCard onRegistrationCardA;
            HomeContentPageQuery.OnActionableCard onActionableCardA;
            HomeContentPageQuery.OnInsetBanner onInsetBannerA;
            HomeContentPageQuery.OnBasicCoreBroadcastBanner onBasicCoreBroadcastBannerA;
            HomeContentPageQuery.OnRewardsBalanceCard onRewardsBalanceCardA;
            HomeContentPageQuery.OnBroadcastBanner onBroadcastBannerA;
            HomeContentPageQuery.OnMyShoppingLists onMyShoppingListsA;
            HomeContentPageQuery.OnCarousel onCarouselA;
            HomeContentPageQuery.OnBoosterHorizontalList onBoosterHorizontalListA;
            byte b2;
            HomeContentPageQuery.OnVideoAdUnit onVideoAdUnitA;
            HomeContentPageQuery.OnHorizontalList onHorizontalListA;
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
            if (a.C(set2, set, null, str, BooleanExpressions.c("RegistrationCard"))) {
                reader.o();
                onRegistrationCardA = OnRegistrationCard.a(reader, customScalarAdapters);
            } else {
                onRegistrationCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ActionableCard"))) {
                reader.o();
                onActionableCardA = OnActionableCard.a(reader, customScalarAdapters);
            } else {
                onActionableCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("InsetBanner"))) {
                reader.o();
                onInsetBannerA = OnInsetBanner.a(reader, customScalarAdapters);
            } else {
                onInsetBannerA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("BasicCoreBroadcastBanner"))) {
                reader.o();
                onBasicCoreBroadcastBannerA = OnBasicCoreBroadcastBanner.a(reader, customScalarAdapters);
            } else {
                onBasicCoreBroadcastBannerA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RewardsBalanceCard"))) {
                reader.o();
                onRewardsBalanceCardA = OnRewardsBalanceCard.a(reader, customScalarAdapters);
            } else {
                onRewardsBalanceCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("BroadcastBanner"))) {
                reader.o();
                onBroadcastBannerA = OnBroadcastBanner.a(reader, customScalarAdapters);
            } else {
                onBroadcastBannerA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("MyShoppingLists"))) {
                reader.o();
                onMyShoppingListsA = OnMyShoppingLists.a(reader, customScalarAdapters);
            } else {
                onMyShoppingListsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("Carousel"))) {
                reader.o();
                onCarouselA = OnCarousel.a(reader, customScalarAdapters);
            } else {
                onCarouselA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("BoosterHorizontalList"))) {
                reader.o();
                onBoosterHorizontalListA = OnBoosterHorizontalList.a(reader, customScalarAdapters);
            } else {
                onBoosterHorizontalListA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("VideoAdUnit"), BooleanExpressions.d("includeVideoAdUnit")))) {
                reader.o();
                b2 = true;
                onVideoAdUnitA = OnVideoAdUnit.a(reader, customScalarAdapters);
            } else {
                b2 = true;
                onVideoAdUnitA = null;
            }
            byte b3 = b2;
            if (a.C(set2, set, null, str, BooleanExpressions.c("HorizontalList"))) {
                reader.o();
                onHorizontalListA = OnHorizontalList.a(reader, customScalarAdapters);
            } else {
                onHorizontalListA = null;
            }
            BooleanExpression.Element elementC = BooleanExpressions.c("ChatEntryCardV2");
            BooleanExpression.Element elementD = BooleanExpressions.d("includeChatEntryCard");
            BooleanExpression[] booleanExpressionArr = new BooleanExpression[2];
            booleanExpressionArr[0] = elementC;
            booleanExpressionArr[b3 == true ? 1 : 0] = elementD;
            BooleanExpression.And andA = BooleanExpressions.a(booleanExpressionArr);
            HomeContentPageQuery.OnChatEntryCardV2 onChatEntryCardV2A = null;
            if (d.C(set2, set, null, str, andA)) {
                reader.o();
                onChatEntryCardV2A = OnChatEntryCardV2.a(reader, customScalarAdapters);
            }
            return new HomeContentPageQuery.Item(str, onRegistrationCardA, onActionableCardA, onInsetBannerA, onBasicCoreBroadcastBannerA, onRewardsBalanceCardA, onBroadcastBannerA, onMyShoppingListsA, onCarouselA, onBoosterHorizontalListA, onVideoAdUnitA, onHorizontalListA, onChatEntryCardV2A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Item value = (HomeContentPageQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22846a);
            HomeContentPageQuery.OnRegistrationCard onRegistrationCard = value.b;
            if (onRegistrationCard != null) {
                List list = OnRegistrationCard.f23110a;
                writer.F1("_excluded");
                Adapters.l.toJson(writer, customScalarAdapters, onRegistrationCard.f22888a);
            }
            HomeContentPageQuery.OnActionableCard onActionableCard = value.c;
            if (onActionableCard != null) {
                OnActionableCard.b(writer, customScalarAdapters, onActionableCard);
            }
            HomeContentPageQuery.OnInsetBanner onInsetBanner = value.d;
            if (onInsetBanner != null) {
                OnInsetBanner.b(writer, customScalarAdapters, onInsetBanner);
            }
            HomeContentPageQuery.OnBasicCoreBroadcastBanner onBasicCoreBroadcastBanner = value.e;
            if (onBasicCoreBroadcastBanner != null) {
                OnBasicCoreBroadcastBanner.b(writer, customScalarAdapters, onBasicCoreBroadcastBanner);
            }
            HomeContentPageQuery.OnRewardsBalanceCard onRewardsBalanceCard = value.f;
            if (onRewardsBalanceCard != null) {
                OnRewardsBalanceCard.b(writer, customScalarAdapters, onRewardsBalanceCard);
            }
            HomeContentPageQuery.OnBroadcastBanner onBroadcastBanner = value.g;
            if (onBroadcastBanner != null) {
                OnBroadcastBanner.b(writer, customScalarAdapters, onBroadcastBanner);
            }
            HomeContentPageQuery.OnMyShoppingLists onMyShoppingLists = value.h;
            if (onMyShoppingLists != null) {
                OnMyShoppingLists.b(writer, customScalarAdapters, onMyShoppingLists);
            }
            HomeContentPageQuery.OnCarousel onCarousel = value.i;
            if (onCarousel != null) {
                OnCarousel.b(writer, customScalarAdapters, onCarousel);
            }
            HomeContentPageQuery.OnBoosterHorizontalList onBoosterHorizontalList = value.j;
            if (onBoosterHorizontalList != null) {
                OnBoosterHorizontalList.b(writer, customScalarAdapters, onBoosterHorizontalList);
            }
            HomeContentPageQuery.OnVideoAdUnit onVideoAdUnit = value.k;
            if (onVideoAdUnit != null) {
                OnVideoAdUnit.b(writer, customScalarAdapters, onVideoAdUnit);
            }
            HomeContentPageQuery.OnHorizontalList onHorizontalList = value.l;
            if (onHorizontalList != null) {
                OnHorizontalList.b(writer, customScalarAdapters, onHorizontalList);
            }
            HomeContentPageQuery.OnChatEntryCardV2 onChatEntryCardV2 = value.m;
            if (onChatEntryCardV2 != null) {
                OnChatEntryCardV2.b(writer, customScalarAdapters, onChatEntryCardV2);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Item1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Item1;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item1 implements Adapter<HomeContentPageQuery.Item1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item1 f23069a = new Item1();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            HomeContentPageQuery.OnProductCard onProductCardA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("ProductCard"))) {
                reader.o();
                onProductCardA = OnProductCard.a(reader, customScalarAdapters);
            }
            return new HomeContentPageQuery.Item1(str, onProductCardA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Item1 value = (HomeContentPageQuery.Item1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22847a);
            HomeContentPageQuery.OnProductCard onProductCard = value.b;
            if (onProductCard != null) {
                OnProductCard.b(writer, customScalarAdapters, onProductCard);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Item2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Item2;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item2 implements Adapter<HomeContentPageQuery.Item2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item2 f23070a = new Item2();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            HomeContentPageQuery.OnProductCard1 onProductCard1A = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("ProductCard"))) {
                reader.o();
                onProductCard1A = OnProductCard1.a(reader, customScalarAdapters);
            }
            return new HomeContentPageQuery.Item2(str, onProductCard1A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Item2 value = (HomeContentPageQuery.Item2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22848a);
            HomeContentPageQuery.OnProductCard1 onProductCard1 = value.b;
            if (onProductCard1 != null) {
                OnProductCard1.b(writer, customScalarAdapters, onProductCard1);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Item3;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Item3;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item3 implements Adapter<HomeContentPageQuery.Item3> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item3 f23071a = new Item3();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            HomeContentPageQuery.OnProductCard2 onProductCard2A;
            HomeContentPageQuery.OnOrderCard onOrderCardA;
            HomeContentPageQuery.OnQuickLinkCard onQuickLinkCardA;
            HomeContentPageQuery.OnRecipeSummaryCard onRecipeSummaryCardA;
            HomeContentPageQuery.OnRecipeMoreCard onRecipeMoreCardA;
            HomeContentPageQuery.OnContentCard onContentCardA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            HomeContentPageQuery.OnPromotionCard onPromotionCardA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductCard"))) {
                reader.o();
                onProductCard2A = OnProductCard2.a(reader, customScalarAdapters);
            } else {
                onProductCard2A = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("OrderCard"))) {
                reader.o();
                onOrderCardA = OnOrderCard.a(reader, customScalarAdapters);
            } else {
                onOrderCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("QuickLinkCard"))) {
                reader.o();
                onQuickLinkCardA = OnQuickLinkCard.a(reader, customScalarAdapters);
            } else {
                onQuickLinkCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RecipeSummaryCard"))) {
                reader.o();
                onRecipeSummaryCardA = OnRecipeSummaryCard.a(reader, customScalarAdapters);
            } else {
                onRecipeSummaryCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RecipeMoreCard"))) {
                reader.o();
                onRecipeMoreCardA = OnRecipeMoreCard.a(reader, customScalarAdapters);
            } else {
                onRecipeMoreCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ContentCard"))) {
                reader.o();
                onContentCardA = OnContentCard.a(reader, customScalarAdapters);
            } else {
                onContentCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("PromotionCard"))) {
                reader.o();
                onPromotionCardA = OnPromotionCard.a(reader, customScalarAdapters);
            }
            return new HomeContentPageQuery.Item3(str, onProductCard2A, onOrderCardA, onQuickLinkCardA, onRecipeSummaryCardA, onRecipeMoreCardA, onContentCardA, onPromotionCardA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Item3 value = (HomeContentPageQuery.Item3) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22849a);
            HomeContentPageQuery.OnProductCard2 onProductCard2 = value.b;
            if (onProductCard2 != null) {
                OnProductCard2.b(writer, customScalarAdapters, onProductCard2);
            }
            HomeContentPageQuery.OnOrderCard onOrderCard = value.c;
            if (onOrderCard != null) {
                OnOrderCard.b(writer, customScalarAdapters, onOrderCard);
            }
            HomeContentPageQuery.OnQuickLinkCard onQuickLinkCard = value.d;
            if (onQuickLinkCard != null) {
                OnQuickLinkCard.b(writer, customScalarAdapters, onQuickLinkCard);
            }
            HomeContentPageQuery.OnRecipeSummaryCard onRecipeSummaryCard = value.e;
            if (onRecipeSummaryCard != null) {
                OnRecipeSummaryCard.b(writer, customScalarAdapters, onRecipeSummaryCard);
            }
            HomeContentPageQuery.OnRecipeMoreCard onRecipeMoreCard = value.f;
            if (onRecipeMoreCard != null) {
                OnRecipeMoreCard.b(writer, customScalarAdapters, onRecipeMoreCard);
            }
            HomeContentPageQuery.OnContentCard onContentCard = value.g;
            if (onContentCard != null) {
                OnContentCard.b(writer, customScalarAdapters, onContentCard);
            }
            HomeContentPageQuery.OnPromotionCard onPromotionCard = value.h;
            if (onPromotionCard != null) {
                OnPromotionCard.b(writer, customScalarAdapters, onPromotionCard);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$LinkAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$LinkAction;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkAction implements Adapter<HomeContentPageQuery.LinkAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkAction f23072a = new LinkAction();
        public static final List b = CollectionsKt.R("__typename", "type", UrlHandler.ACTION, "analytics", "id");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ActionType actionTypeA = null;
            String str2 = null;
            HomeContentPageQuery.Analytics7 analytics7 = null;
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
                    analytics7 = (HomeContentPageQuery.Analytics7) Adapters.b(Adapters.c(Analytics7.f23017a, true)).fromJson(reader, customScalarAdapters);
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
                return new HomeContentPageQuery.LinkAction(str, actionTypeA, str2, analytics7, str3);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.LinkAction value = (HomeContentPageQuery.LinkAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22850a);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1(UrlHandler.ACTION);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics7.f23017a, true)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$LinkAction1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$LinkAction1;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkAction1 implements Adapter<HomeContentPageQuery.LinkAction1> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkAction1 f23073a = new LinkAction1();
        public static final List b = CollectionsKt.R("id", UrlHandler.ACTION, "analytics", "type");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            HomeContentPageQuery.Analytics8 analytics8 = null;
            ActionType actionTypeA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    analytics8 = (HomeContentPageQuery.Analytics8) Adapters.b(Adapters.c(Analytics8.f23018a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (str2 == null) {
                Assertions.a(reader, UrlHandler.ACTION);
                throw null;
            }
            if (actionTypeA != null) {
                return new HomeContentPageQuery.LinkAction1(str, str2, analytics8, actionTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.LinkAction1 value = (HomeContentPageQuery.LinkAction1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.f22851a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics8.f23018a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$LinkCardAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$LinkCardAction;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkCardAction implements Adapter<HomeContentPageQuery.LinkCardAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkCardAction f23074a = new LinkCardAction();
        public static final List b = CollectionsKt.R("type", UrlHandler.ACTION, "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActionType actionTypeA = null;
            String str = null;
            HomeContentPageQuery.Analytics10 analytics10 = null;
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
                    analytics10 = (HomeContentPageQuery.Analytics10) Adapters.b(Adapters.c(Analytics10.f23008a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new HomeContentPageQuery.LinkCardAction(actionTypeA, str, analytics10);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.LinkCardAction value = (HomeContentPageQuery.LinkCardAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.f22852a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics10.f23008a, true)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$LinkCardAnimation;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$LinkCardAnimation;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkCardAnimation implements Adapter<HomeContentPageQuery.LinkCardAnimation> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkCardAnimation f23075a = new LinkCardAnimation();
        public static final List b = CollectionsKt.R("source", "playCount");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            Integer num = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "source");
                throw null;
            }
            if (num != null) {
                return new HomeContentPageQuery.LinkCardAnimation(str, num.intValue());
            }
            Assertions.a(reader, "playCount");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.LinkCardAnimation value = (HomeContentPageQuery.LinkCardAnimation) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("source");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22853a);
            writer.F1("playCount");
            Adapters.b.toJson(writer, customScalarAdapters, Integer.valueOf(value.b));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$LinkTextWithAlt;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$LinkTextWithAlt;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkTextWithAlt implements Adapter<HomeContentPageQuery.LinkTextWithAlt> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkTextWithAlt f23076a = new LinkTextWithAlt();
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
                return new HomeContentPageQuery.LinkTextWithAlt(str, str2, str3);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.LinkTextWithAlt value = (HomeContentPageQuery.LinkTextWithAlt) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22854a);
            writer.F1(TextBundle.TEXT_ENTRY);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$LinkTextWithAlt1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$LinkTextWithAlt1;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkTextWithAlt1 implements Adapter<HomeContentPageQuery.LinkTextWithAlt1> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkTextWithAlt1 f23077a = new LinkTextWithAlt1();
        public static final List b = CollectionsKt.R("altText", TextBundle.TEXT_ENTRY);

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
                Assertions.a(reader, "altText");
                throw null;
            }
            if (str2 != null) {
                return new HomeContentPageQuery.LinkTextWithAlt1(str, str2);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.LinkTextWithAlt1 value = (HomeContentPageQuery.LinkTextWithAlt1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("altText");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22855a);
            writer.F1(TextBundle.TEXT_ENTRY);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Logo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Logo;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Logo implements Adapter<HomeContentPageQuery.Logo> {

        /* renamed from: a, reason: collision with root package name */
        public static final Logo f23078a = new Logo();
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
                return new HomeContentPageQuery.Logo(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Logo value = (HomeContentPageQuery.Logo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22856a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OffersAlertIndicator;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OffersAlertIndicator;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OffersAlertIndicator implements Adapter<HomeContentPageQuery.OffersAlertIndicator> {

        /* renamed from: a, reason: collision with root package name */
        public static final OffersAlertIndicator f23079a = new OffersAlertIndicator();
        public static final List b = CollectionsKt.R("indicatorType", "message");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            AlertIndicatorType alertIndicatorTypeA = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    alertIndicatorTypeA = AlertIndicatorType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (alertIndicatorTypeA == null) {
                Assertions.a(reader, "indicatorType");
                throw null;
            }
            if (str != null) {
                return new HomeContentPageQuery.OffersAlertIndicator(alertIndicatorTypeA, str);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.OffersAlertIndicator value = (HomeContentPageQuery.OffersAlertIndicator) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("indicatorType");
            AlertIndicatorType_ResponseAdapter.b(writer, customScalarAdapters, value.f22857a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnActionableCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnActionableCard;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnActionableCard implements Adapter<HomeContentPageQuery.OnActionableCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23080a = CollectionsKt.R("link", "image", "cardHeight", "altText", "_excluded", "analytics", "actionableCardImpressionAnalytics", "actionableCardClickAnalytics");

        public static HomeContentPageQuery.OnActionableCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            CardHeight cardHeightA = null;
            String str3 = null;
            Boolean bool = null;
            TealiumAnalytics tealiumAnalytics = null;
            HomeContentPageQuery.ActionableCardImpressionAnalytics actionableCardImpressionAnalytics = null;
            HomeContentPageQuery.ActionableCardClickAnalytics actionableCardClickAnalytics = null;
            while (true) {
                switch (reader.o2(f23080a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        cardHeightA = CardHeight_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 3:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        tealiumAnalytics = (TealiumAnalytics) d.k(customScalarAdapters, au.com.woolworths.shop.graphql.type.TealiumAnalytics.f11963a, reader, customScalarAdapters);
                        break;
                    case 6:
                        actionableCardImpressionAnalytics = (HomeContentPageQuery.ActionableCardImpressionAnalytics) Adapters.b(Adapters.c(ActionableCardImpressionAnalytics.f23005a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        actionableCardClickAnalytics = (HomeContentPageQuery.ActionableCardClickAnalytics) Adapters.b(Adapters.c(ActionableCardClickAnalytics.f23004a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "link");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "image");
                            throw null;
                        }
                        if (cardHeightA == null) {
                            Assertions.a(reader, "cardHeight");
                            throw null;
                        }
                        if (str3 != null) {
                            return new HomeContentPageQuery.OnActionableCard(str, str2, cardHeightA, str3, bool, tealiumAnalytics, actionableCardImpressionAnalytics, actionableCardClickAnalytics);
                        }
                        Assertions.a(reader, "altText");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnActionableCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("link");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22858a);
            writer.F1("image");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("cardHeight");
            CardHeight_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.e);
            writer.F1("analytics");
            Adapters.b(customScalarAdapters.e(au.com.woolworths.shop.graphql.type.TealiumAnalytics.f11963a)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("actionableCardImpressionAnalytics");
            Adapters.b(Adapters.c(ActionableCardImpressionAnalytics.f23005a, true)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("actionableCardClickAnalytics");
            Adapters.b(Adapters.c(ActionableCardClickAnalytics.f23004a, true)).toJson(writer, customScalarAdapters, value.h);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnActionableCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnBasicCoreBroadcastBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnBasicCoreBroadcastBanner;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBasicCoreBroadcastBanner implements Adapter<HomeContentPageQuery.OnBasicCoreBroadcastBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23081a = CollectionsKt.R("impressionAnalytics", "broadcastBannerDismissAnalytics", "broadcastBannerUI", "broadcastBannerAction", "broadcastBannerActionLabel", "broadcastBannerId", "broadcastBannerDismissible");

        public static HomeContentPageQuery.OnBasicCoreBroadcastBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Boolean bool;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool2 = null;
            HomeContentPageQuery.ImpressionAnalytics1 impressionAnalytics1 = null;
            HomeContentPageQuery.BroadcastBannerDismissAnalytics broadcastBannerDismissAnalytics = null;
            HomeContentPageQuery.BroadcastBannerUI broadcastBannerUI = null;
            HomeContentPageQuery.BroadcastBannerAction broadcastBannerAction = null;
            String str = null;
            String str2 = null;
            while (true) {
                switch (reader.o2(f23081a)) {
                    case 0:
                        bool = bool2;
                        impressionAnalytics1 = (HomeContentPageQuery.ImpressionAnalytics1) Adapters.b(Adapters.c(ImpressionAnalytics1.f23063a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        bool = bool2;
                        broadcastBannerDismissAnalytics = (HomeContentPageQuery.BroadcastBannerDismissAnalytics) Adapters.b(Adapters.c(BroadcastBannerDismissAnalytics.f23022a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        bool = bool2;
                        broadcastBannerUI = (HomeContentPageQuery.BroadcastBannerUI) Adapters.c(BroadcastBannerUI.f23023a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        bool = bool2;
                        broadcastBannerAction = (HomeContentPageQuery.BroadcastBannerAction) Adapters.b(Adapters.c(BroadcastBannerAction.f23021a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bool = bool2;
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        bool = bool2;
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        bool2 = (Boolean) Adapters.f.fromJson(reader, customScalarAdapters);
                        continue;
                    default:
                        Boolean bool3 = bool2;
                        if (broadcastBannerUI == null) {
                            Assertions.a(reader, "broadcastBannerUI");
                            throw null;
                        }
                        if (bool3 != null) {
                            return new HomeContentPageQuery.OnBasicCoreBroadcastBanner(impressionAnalytics1, broadcastBannerDismissAnalytics, broadcastBannerUI, broadcastBannerAction, str, str2, bool3.booleanValue());
                        }
                        Assertions.a(reader, "broadcastBannerDismissible");
                        throw null;
                }
                bool2 = bool;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnBasicCoreBroadcastBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("impressionAnalytics");
            Adapters.b(Adapters.c(ImpressionAnalytics1.f23063a, true)).toJson(writer, customScalarAdapters, value.f22859a);
            writer.F1("broadcastBannerDismissAnalytics");
            Adapters.b(Adapters.c(BroadcastBannerDismissAnalytics.f23022a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("broadcastBannerUI");
            Adapters.c(BroadcastBannerUI.f23023a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("broadcastBannerAction");
            Adapters.b(Adapters.c(BroadcastBannerAction.f23021a, false)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("broadcastBannerActionLabel");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("broadcastBannerId");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1("broadcastBannerDismissible");
            Adapters.f.toJson(writer, customScalarAdapters, Boolean.valueOf(value.g));
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnBasicCoreBroadcastBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnBoosterHorizontalList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnBoosterHorizontalList;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBoosterHorizontalList implements Adapter<HomeContentPageQuery.OnBoosterHorizontalList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23082a = CollectionsKt.R("__typename", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "actionTitle", "deepLink", "tigerOfferIds", "items");

        public static HomeContentPageQuery.OnBoosterHorizontalList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            ArrayList arrayListFromJson = null;
            ArrayList arrayListFromJson2 = null;
            while (true) {
                switch (reader.o2(f23082a)) {
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
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        arrayListFromJson2 = Adapters.a(Adapters.c(Item1.f23069a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "tigerOfferIds");
                            throw null;
                        }
                        if (arrayListFromJson2 != null) {
                            return new HomeContentPageQuery.OnBoosterHorizontalList(str, str2, str3, str4, str5, arrayListFromJson, arrayListFromJson2);
                        }
                        Assertions.a(reader, "items");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnBoosterHorizontalList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22860a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("actionTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("deepLink");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("tigerOfferIds");
            Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.f);
            writer.F1("items");
            Adapters.a(Adapters.c(Item1.f23069a, true)).toJson(writer, customScalarAdapters, value.g);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnBoosterHorizontalList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnBroadcastBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnBroadcastBanner;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBroadcastBanner implements Adapter<HomeContentPageQuery.OnBroadcastBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23083a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "deeplink", "type", "imageUrl", "actionLabel", "analyticsLabel", "dismissible", "bannerId");

        public static HomeContentPageQuery.OnBroadcastBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            BroadcastBannerType broadcastBannerTypeA = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            Boolean bool = null;
            String str7 = null;
            while (true) {
                switch (reader.o2(f23083a)) {
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
                        broadcastBannerTypeA = BroadcastBannerType_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    case 4:
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str6 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        str7 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (broadcastBannerTypeA == null) {
                            Assertions.a(reader, "type");
                            throw null;
                        }
                        if (str4 != null) {
                            return new HomeContentPageQuery.OnBroadcastBanner(str, str2, str3, broadcastBannerTypeA, str4, str5, str6, bool, str7);
                        }
                        Assertions.a(reader, "imageUrl");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnBroadcastBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22861a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("deeplink");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("type");
            BroadcastBannerType_ResponseAdapter.b(writer, customScalarAdapters, value.d);
            writer.F1("imageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("actionLabel");
            nullableAdapter.toJson(writer, customScalarAdapters, value.f);
            writer.F1("analyticsLabel");
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
            writer.F1("dismissible");
            Adapters.l.toJson(writer, customScalarAdapters, value.h);
            writer.F1("bannerId");
            nullableAdapter.toJson(writer, customScalarAdapters, value.i);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnBroadcastBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnCarousel;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnCarousel;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCarousel implements Adapter<HomeContentPageQuery.OnCarousel> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23084a = CollectionsKt.Q("carouselItems");

        public static HomeContentPageQuery.OnCarousel a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f23084a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(CarouselItem.f23025a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new HomeContentPageQuery.OnCarousel(arrayListFromJson);
            }
            Assertions.a(reader, "carouselItems");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnCarousel value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("carouselItems");
            Adapters.a(Adapters.c(CarouselItem.f23025a, true)).toJson(writer, customScalarAdapters, value.f22862a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnCarousel) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnChatEntryCardV2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnChatEntryCardV2;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnChatEntryCardV2 implements Adapter<HomeContentPageQuery.OnChatEntryCardV2> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23085a = CollectionsKt.R("chatEntryCardTitle", "chatEntryCardSubtitle", "chatEntryCardShowBeta", "chatEntryCardImageUrl", "chatEntryCardCtas");

        public static HomeContentPageQuery.OnChatEntryCardV2 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f23085a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(ChatEntryCardCta.f23028a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "chatEntryCardTitle");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "chatEntryCardSubtitle");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "chatEntryCardImageUrl");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new HomeContentPageQuery.OnChatEntryCardV2(bool, str, str2, str3, arrayListFromJson);
            }
            Assertions.a(reader, "chatEntryCardCtas");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnChatEntryCardV2 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("chatEntryCardTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22863a);
            writer.F1("chatEntryCardSubtitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("chatEntryCardShowBeta");
            Adapters.l.toJson(writer, customScalarAdapters, value.c);
            writer.F1("chatEntryCardImageUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.d);
            writer.F1("chatEntryCardCtas");
            Adapters.a(Adapters.c(ChatEntryCardCta.f23028a, false)).toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnChatEntryCardV2) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnContentCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnContentCard;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnContentCard implements Adapter<HomeContentPageQuery.OnContentCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23086a = CollectionsKt.R("contentCardId", "contentCardImageUrl", "contentCardTitle", "contentCardDescription", "contentCardAction", "contentCardFooter", "contentCardBrandImage", "contentCardIsVideoAvailable", "contentCardSize");

        public static HomeContentPageQuery.OnContentCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            HomeContentPageQuery.ContentCardAction contentCardAction = null;
            HomeContentPageQuery.ContentCardFooter contentCardFooter = null;
            HomeContentPageQuery.ContentCardBrandImage contentCardBrandImage = null;
            Boolean bool = null;
            ContentCardSize contentCardSize = null;
            while (true) {
                switch (reader.o2(f23086a)) {
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
                        contentCardAction = (HomeContentPageQuery.ContentCardAction) Adapters.b(Adapters.c(ContentCardAction.f23029a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        contentCardFooter = (HomeContentPageQuery.ContentCardFooter) Adapters.b(Adapters.c(ContentCardFooter.f23031a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        contentCardBrandImage = (HomeContentPageQuery.ContentCardBrandImage) Adapters.b(Adapters.c(ContentCardBrandImage.f23030a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        contentCardSize = (ContentCardSize) Adapters.b(ContentCardSize_ResponseAdapter.f12057a).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str2 != null) {
                            return new HomeContentPageQuery.OnContentCard(str, str2, str3, str4, contentCardAction, contentCardFooter, contentCardBrandImage, bool, contentCardSize);
                        }
                        Assertions.a(reader, "contentCardImageUrl");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnContentCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("contentCardId");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f22864a);
            writer.F1("contentCardImageUrl");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("contentCardTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("contentCardDescription");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("contentCardAction");
            Adapters.b(Adapters.c(ContentCardAction.f23029a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("contentCardFooter");
            Adapters.b(Adapters.c(ContentCardFooter.f23031a, false)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("contentCardBrandImage");
            Adapters.b(Adapters.c(ContentCardBrandImage.f23030a, false)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("contentCardIsVideoAvailable");
            Adapters.l.toJson(writer, customScalarAdapters, value.h);
            writer.F1("contentCardSize");
            Adapters.b(ContentCardSize_ResponseAdapter.f12057a).toJson(writer, customScalarAdapters, value.i);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnContentCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnCoreIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnCoreIcon;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCoreIcon implements Adapter<HomeContentPageQuery.OnCoreIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23087a = CollectionsKt.Q("coreIconName");

        public static HomeContentPageQuery.OnCoreIcon a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23087a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new HomeContentPageQuery.OnCoreIcon(str);
            }
            Assertions.a(reader, "coreIconName");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnCoreIcon value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("coreIconName");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22865a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnCoreIcon) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnHeroBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnHeroBanner;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHeroBanner implements Adapter<HomeContentPageQuery.OnHeroBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23088a = CollectionsKt.R("heroBannerId", "heroBannerAction", "heroBannerAnalytics", "heroBannerImpressionAnalytics", "heroBannerBackgroundColour", "heroBannerTextColour", "heroBannerBody", "heroBannerBrandsLogo", "heroBannerGraphics", "heroBannerImages", "heroBannerTermsAndConditions", "heroBannerTitle", "heroBannerTitleSize");

        public static HomeContentPageQuery.OnHeroBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            HomeContentPageQuery.HeroBannerAction heroBannerAction = null;
            HomeContentPageQuery.HeroBannerAnalytics heroBannerAnalytics = null;
            HomeContentPageQuery.HeroBannerImpressionAnalytics heroBannerImpressionAnalytics = null;
            String str2 = null;
            String str3 = null;
            HomeContentPageQuery.HeroBannerBody heroBannerBody = null;
            HomeContentPageQuery.HeroBannerBrandsLogo heroBannerBrandsLogo = null;
            List list = null;
            ArrayList arrayListFromJson = null;
            HomeContentPageQuery.HeroBannerTermsAndConditions heroBannerTermsAndConditions = null;
            String str4 = null;
            HeroBannerTitleSize heroBannerTitleSizeA = null;
            while (true) {
                switch (reader.o2(f23088a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        heroBannerAction = (HomeContentPageQuery.HeroBannerAction) Adapters.c(HeroBannerAction.f23046a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        heroBannerAnalytics = (HomeContentPageQuery.HeroBannerAnalytics) Adapters.c(HeroBannerAnalytics.f23047a, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        heroBannerImpressionAnalytics = (HomeContentPageQuery.HeroBannerImpressionAnalytics) Adapters.c(HeroBannerImpressionAnalytics.f23052a, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        heroBannerBody = (HomeContentPageQuery.HeroBannerBody) Adapters.b(Adapters.c(HeroBannerBody.f23048a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        heroBannerBrandsLogo = (HomeContentPageQuery.HeroBannerBrandsLogo) Adapters.b(Adapters.c(HeroBannerBrandsLogo.f23049a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        list = (List) Adapters.b(Adapters.a(Adapters.c(HeroBannerGraphic.f23050a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        arrayListFromJson = Adapters.a(Adapters.c(HeroBannerImage.f23051a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        heroBannerTermsAndConditions = (HomeContentPageQuery.HeroBannerTermsAndConditions) Adapters.b(Adapters.c(HeroBannerTermsAndConditions.f23054a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 11:
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 12:
                        heroBannerTitleSizeA = HeroBannerTitleSize_ResponseAdapter.a(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "heroBannerId");
                            throw null;
                        }
                        if (heroBannerAction == null) {
                            Assertions.a(reader, "heroBannerAction");
                            throw null;
                        }
                        if (heroBannerAnalytics == null) {
                            Assertions.a(reader, "heroBannerAnalytics");
                            throw null;
                        }
                        if (heroBannerImpressionAnalytics == null) {
                            Assertions.a(reader, "heroBannerImpressionAnalytics");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "heroBannerBackgroundColour");
                            throw null;
                        }
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "heroBannerImages");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "heroBannerTitle");
                            throw null;
                        }
                        if (heroBannerTitleSizeA != null) {
                            return new HomeContentPageQuery.OnHeroBanner(str, heroBannerAction, heroBannerAnalytics, heroBannerImpressionAnalytics, str2, str3, heroBannerBody, heroBannerBrandsLogo, list, arrayListFromJson, heroBannerTermsAndConditions, str4, heroBannerTitleSizeA);
                        }
                        Assertions.a(reader, "heroBannerTitleSize");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnHeroBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("heroBannerId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22866a);
            writer.F1("heroBannerAction");
            Adapters.c(HeroBannerAction.f23046a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("heroBannerAnalytics");
            Adapters.c(HeroBannerAnalytics.f23047a, true).toJson(writer, customScalarAdapters, value.c);
            writer.F1("heroBannerImpressionAnalytics");
            Adapters.c(HeroBannerImpressionAnalytics.f23052a, true).toJson(writer, customScalarAdapters, value.d);
            writer.F1("heroBannerBackgroundColour");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("heroBannerTextColour");
            Adapters.i.toJson(writer, customScalarAdapters, value.f);
            writer.F1("heroBannerBody");
            Adapters.b(Adapters.c(HeroBannerBody.f23048a, true)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("heroBannerBrandsLogo");
            Adapters.b(Adapters.c(HeroBannerBrandsLogo.f23049a, false)).toJson(writer, customScalarAdapters, value.h);
            writer.F1("heroBannerGraphics");
            Adapters.b(Adapters.a(Adapters.c(HeroBannerGraphic.f23050a, false))).toJson(writer, customScalarAdapters, value.i);
            writer.F1("heroBannerImages");
            Adapters.a(Adapters.c(HeroBannerImage.f23051a, false)).toJson(writer, customScalarAdapters, value.j);
            writer.F1("heroBannerTermsAndConditions");
            Adapters.b(Adapters.c(HeroBannerTermsAndConditions.f23054a, false)).toJson(writer, customScalarAdapters, value.k);
            writer.F1("heroBannerTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.l);
            writer.F1("heroBannerTitleSize");
            HeroBannerTitleSize_ResponseAdapter.b(writer, customScalarAdapters, value.m);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnHeroBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnHeroBannerBodyText;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnHeroBannerBodyText;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHeroBannerBodyText implements Adapter<HomeContentPageQuery.OnHeroBannerBodyText> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23089a = CollectionsKt.Q(TextBundle.TEXT_ENTRY);

        public static HomeContentPageQuery.OnHeroBannerBodyText a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23089a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new HomeContentPageQuery.OnHeroBannerBodyText(str);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnHeroBannerBodyText value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22867a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnHeroBannerBodyText) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnHeroBannerPromoBody;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnHeroBannerPromoBody;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHeroBannerPromoBody implements Adapter<HomeContentPageQuery.OnHeroBannerPromoBody> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23090a = CollectionsKt.R("code", TextBundle.TEXT_ENTRY);

        public static HomeContentPageQuery.OnHeroBannerPromoBody a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f23090a);
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
                Assertions.a(reader, "code");
                throw null;
            }
            if (str2 != null) {
                return new HomeContentPageQuery.OnHeroBannerPromoBody(str, str2);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnHeroBannerPromoBody value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("code");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22868a);
            writer.F1(TextBundle.TEXT_ENTRY);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnHeroBannerPromoBody) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnHomeDeliveryNowBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnHomeDeliveryNowBanner;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHomeDeliveryNowBanner implements Adapter<HomeContentPageQuery.OnHomeDeliveryNowBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23091a = CollectionsKt.Q("_excluded");

        public static HomeContentPageQuery.OnHomeDeliveryNowBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            while (reader.o2(f23091a) == 0) {
                bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
            }
            return new HomeContentPageQuery.OnHomeDeliveryNowBanner(bool);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.OnHomeDeliveryNowBanner value = (HomeContentPageQuery.OnHomeDeliveryNowBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.f22869a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnHomeDeliveryNowBottomBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnHomeDeliveryNowBottomBanner;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHomeDeliveryNowBottomBanner implements Adapter<HomeContentPageQuery.OnHomeDeliveryNowBottomBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23092a = CollectionsKt.R("__typename", "bottomSheetTitle", "bottomSheetBody", "showOnceOnly", "bannerAsset", "primaryCta", "secondaryCta");

        public static HomeContentPageQuery.OnHomeDeliveryNowBottomBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            HomeContentPageQuery.BannerAsset bannerAsset = null;
            HomeContentPageQuery.PrimaryCta primaryCta = null;
            HomeContentPageQuery.SecondaryCta secondaryCta = null;
            while (true) {
                switch (reader.o2(f23092a)) {
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
                        bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        bannerAsset = (HomeContentPageQuery.BannerAsset) Adapters.b(Adapters.c(BannerAsset.f23020a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        primaryCta = (HomeContentPageQuery.PrimaryCta) Adapters.b(Adapters.c(PrimaryCta.f23116a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        secondaryCta = (HomeContentPageQuery.SecondaryCta) Adapters.b(Adapters.c(SecondaryCta.f23118a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str == null) {
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "bottomSheetTitle");
                            throw null;
                        }
                        if (str3 != null) {
                            return new HomeContentPageQuery.OnHomeDeliveryNowBottomBanner(str, str2, str3, bool, bannerAsset, primaryCta, secondaryCta);
                        }
                        Assertions.a(reader, "bottomSheetBody");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnHomeDeliveryNowBottomBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22870a);
            writer.F1("bottomSheetTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("bottomSheetBody");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("showOnceOnly");
            Adapters.l.toJson(writer, customScalarAdapters, value.d);
            writer.F1("bannerAsset");
            Adapters.b(Adapters.c(BannerAsset.f23020a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("primaryCta");
            Adapters.b(Adapters.c(PrimaryCta.f23116a, false)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("secondaryCta");
            Adapters.b(Adapters.c(SecondaryCta.f23118a, false)).toJson(writer, customScalarAdapters, value.g);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnHomeDeliveryNowBottomBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnHomeFulfilmentWindowBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnHomeFulfilmentWindowBanner;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHomeFulfilmentWindowBanner implements Adapter<HomeContentPageQuery.OnHomeFulfilmentWindowBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23093a = CollectionsKt.R("fulfilmentWindowStateTitle", "fulfilmentWindowStateSubtitle", "fulfilmentWindowStateButton");

        public static HomeContentPageQuery.OnHomeFulfilmentWindowBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            HomeContentPageQuery.FulfilmentWindowStateSubtitle fulfilmentWindowStateSubtitle = null;
            HomeContentPageQuery.FulfilmentWindowStateButton fulfilmentWindowStateButton = null;
            while (true) {
                int iO2 = reader.o2(f23093a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    fulfilmentWindowStateSubtitle = (HomeContentPageQuery.FulfilmentWindowStateSubtitle) Adapters.b(Adapters.c(FulfilmentWindowStateSubtitle.f23043a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    fulfilmentWindowStateButton = (HomeContentPageQuery.FulfilmentWindowStateButton) Adapters.c(FulfilmentWindowStateButton.f23042a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "fulfilmentWindowStateTitle");
                throw null;
            }
            if (fulfilmentWindowStateButton != null) {
                return new HomeContentPageQuery.OnHomeFulfilmentWindowBanner(str, fulfilmentWindowStateSubtitle, fulfilmentWindowStateButton);
            }
            Assertions.a(reader, "fulfilmentWindowStateButton");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnHomeFulfilmentWindowBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("fulfilmentWindowStateTitle");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22871a);
            writer.F1("fulfilmentWindowStateSubtitle");
            Adapters.b(Adapters.c(FulfilmentWindowStateSubtitle.f23043a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("fulfilmentWindowStateButton");
            Adapters.c(FulfilmentWindowStateButton.f23042a, false).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnHomeFulfilmentWindowBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnHomeFulfilmentWindowContainer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnHomeFulfilmentWindowContainer;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHomeFulfilmentWindowContainer implements Adapter<HomeContentPageQuery.OnHomeFulfilmentWindowContainer> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23094a = CollectionsKt.R("button", "deliveryNowBanner", "orientation");

        public static HomeContentPageQuery.OnHomeFulfilmentWindowContainer a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            HomeContentPageQuery.Button button = null;
            HomeContentPageQuery.DeliveryNowBanner deliveryNowBanner = null;
            HomeFulfilmentWindowContainerOrientation homeFulfilmentWindowContainerOrientationA = null;
            while (true) {
                int iO2 = reader.o2(f23094a);
                if (iO2 == 0) {
                    button = (HomeContentPageQuery.Button) Adapters.c(Button.f23024a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    deliveryNowBanner = (HomeContentPageQuery.DeliveryNowBanner) Adapters.b(Adapters.c(DeliveryNowBanner.f23035a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    homeFulfilmentWindowContainerOrientationA = HomeFulfilmentWindowContainerOrientation_ResponseAdapter.a(reader, customScalarAdapters);
                }
            }
            if (button == null) {
                Assertions.a(reader, "button");
                throw null;
            }
            if (homeFulfilmentWindowContainerOrientationA != null) {
                return new HomeContentPageQuery.OnHomeFulfilmentWindowContainer(button, deliveryNowBanner, homeFulfilmentWindowContainerOrientationA);
            }
            Assertions.a(reader, "orientation");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnHomeFulfilmentWindowContainer value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("button");
            Adapters.c(Button.f23024a, false).toJson(writer, customScalarAdapters, value.f22872a);
            writer.F1("deliveryNowBanner");
            Adapters.b(Adapters.c(DeliveryNowBanner.f23035a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("orientation");
            HomeFulfilmentWindowContainerOrientation_ResponseAdapter.b(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnHomeFulfilmentWindowContainer) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnHomeModeSelectorContainer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnHomeModeSelectorContainer;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHomeModeSelectorContainer implements Adapter<HomeContentPageQuery.OnHomeModeSelectorContainer> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23095a = CollectionsKt.R("fulfilmentWindowTile", "onlineShoppingModeVariantTile", "divider", "deliveryNowBanner", "inStoreDetailsCard");

        public static HomeContentPageQuery.OnHomeModeSelectorContainer a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            HomeContentPageQuery.FulfilmentWindowTile fulfilmentWindowTile = null;
            HomeContentPageQuery.OnlineShoppingModeVariantTile onlineShoppingModeVariantTile = null;
            HomeContentPageQuery.Divider divider = null;
            HomeContentPageQuery.DeliveryNowBanner1 deliveryNowBanner1 = null;
            HomeContentPageQuery.InStoreDetailsCard inStoreDetailsCard = null;
            while (true) {
                int iO2 = reader.o2(f23095a);
                if (iO2 == 0) {
                    fulfilmentWindowTile = (HomeContentPageQuery.FulfilmentWindowTile) Adapters.b(Adapters.c(FulfilmentWindowTile.f23044a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    onlineShoppingModeVariantTile = (HomeContentPageQuery.OnlineShoppingModeVariantTile) Adapters.b(Adapters.c(OnlineShoppingModeVariantTile.f23113a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    divider = (HomeContentPageQuery.Divider) Adapters.b(Adapters.c(Divider.f23037a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    deliveryNowBanner1 = (HomeContentPageQuery.DeliveryNowBanner1) Adapters.b(Adapters.c(DeliveryNowBanner1.f23036a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        return new HomeContentPageQuery.OnHomeModeSelectorContainer(fulfilmentWindowTile, onlineShoppingModeVariantTile, divider, deliveryNowBanner1, inStoreDetailsCard);
                    }
                    inStoreDetailsCard = (HomeContentPageQuery.InStoreDetailsCard) Adapters.b(Adapters.c(InStoreDetailsCard.f23067a, false)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnHomeModeSelectorContainer value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("fulfilmentWindowTile");
            Adapters.b(Adapters.c(FulfilmentWindowTile.f23044a, false)).toJson(writer, customScalarAdapters, value.f22873a);
            writer.F1("onlineShoppingModeVariantTile");
            Adapters.b(Adapters.c(OnlineShoppingModeVariantTile.f23113a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("divider");
            Adapters.b(Adapters.c(Divider.f23037a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("deliveryNowBanner");
            Adapters.b(Adapters.c(DeliveryNowBanner1.f23036a, true)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("inStoreDetailsCard");
            Adapters.b(Adapters.c(InStoreDetailsCard.f23067a, false)).toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnHomeModeSelectorContainer) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnHorizontalList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnHorizontalList;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHorizontalList implements Adapter<HomeContentPageQuery.OnHorizontalList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23096a = CollectionsKt.R("actionTitle", "horizontalListTrailingLink", "horizontalListAnalytics", "horizontalListImpressionAnalytics", "id", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "deepLink", "items");

        public static HomeContentPageQuery.OnHorizontalList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            HomeContentPageQuery.HorizontalListTrailingLink horizontalListTrailingLink = null;
            HomeContentPageQuery.HorizontalListAnalytics horizontalListAnalytics = null;
            HomeContentPageQuery.HorizontalListImpressionAnalytics horizontalListImpressionAnalytics = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                switch (reader.o2(f23096a)) {
                    case 0:
                        str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        horizontalListTrailingLink = (HomeContentPageQuery.HorizontalListTrailingLink) Adapters.b(Adapters.c(HorizontalListTrailingLink.f23059a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        horizontalListAnalytics = (HomeContentPageQuery.HorizontalListAnalytics) Adapters.b(Adapters.c(HorizontalListAnalytics.f23057a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        horizontalListImpressionAnalytics = (HomeContentPageQuery.HorizontalListImpressionAnalytics) Adapters.b(Adapters.c(HorizontalListImpressionAnalytics.f23058a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        arrayListFromJson = Adapters.a(Adapters.c(Item3.f23071a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        if (str3 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (arrayListFromJson != null) {
                            return new HomeContentPageQuery.OnHorizontalList(str, horizontalListTrailingLink, horizontalListAnalytics, horizontalListImpressionAnalytics, str2, str3, str4, str5, arrayListFromJson);
                        }
                        Assertions.a(reader, "items");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnHorizontalList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("actionTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f22874a);
            writer.F1("horizontalListTrailingLink");
            Adapters.b(Adapters.c(HorizontalListTrailingLink.f23059a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("horizontalListAnalytics");
            Adapters.b(Adapters.c(HorizontalListAnalytics.f23057a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("horizontalListImpressionAnalytics");
            Adapters.b(Adapters.c(HorizontalListImpressionAnalytics.f23058a, true)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("id");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            nullableAdapter.toJson(writer, customScalarAdapters, value.g);
            writer.F1("deepLink");
            nullableAdapter.toJson(writer, customScalarAdapters, value.h);
            writer.F1("items");
            Adapters.a(Adapters.c(Item3.f23071a, true)).toJson(writer, customScalarAdapters, value.i);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnHorizontalList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnHostedIcon;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnHostedIcon;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHostedIcon implements Adapter<HomeContentPageQuery.OnHostedIcon> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23097a = CollectionsKt.Q("url");

        public static HomeContentPageQuery.OnHostedIcon a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23097a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new HomeContentPageQuery.OnHostedIcon(str);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnHostedIcon value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22875a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnHostedIcon) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnInsetBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnInsetBanner;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnInsetBanner implements Adapter<HomeContentPageQuery.OnInsetBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23098a = CollectionsKt.R("displayType", "message", "bannerTitle", UrlHandler.ACTION);

        public static HomeContentPageQuery.OnInsetBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            String str2 = null;
            HomeContentPageQuery.Action action = null;
            while (true) {
                int iO2 = reader.o2(f23098a);
                if (iO2 == 0) {
                    insetBannerDisplayTypeA = InsetBannerDisplayType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    action = (HomeContentPageQuery.Action) Adapters.b(Adapters.c(Action.f23002a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new HomeContentPageQuery.OnInsetBanner(insetBannerDisplayTypeA, str, str2, action);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnInsetBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.f22876a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("bannerTitle");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1(UrlHandler.ACTION);
            Adapters.b(Adapters.c(Action.f23002a, false)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnInsetBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnMyShoppingLists;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnMyShoppingLists;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMyShoppingLists implements Adapter<HomeContentPageQuery.OnMyShoppingLists> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23099a = CollectionsKt.R("myListTitle", "myListSubtitle", "myListActionTitle", "myListDeepLink");

        public static HomeContentPageQuery.OnMyShoppingLists a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(f23099a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new HomeContentPageQuery.OnMyShoppingLists(str, str2, str3, str4);
            }
            Assertions.a(reader, "myListTitle");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnMyShoppingLists value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("myListTitle");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22877a);
            writer.F1("myListSubtitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("myListActionTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("myListDeepLink");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnMyShoppingLists) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnOrderCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnOrderCard;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOrderCard implements Adapter<HomeContentPageQuery.OnOrderCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23100a = CollectionsKt.R("__typename", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "status", "orderCardId", "total", "timeLabel", "timeValue", "date", "fulfilmentStatusBanner", "orderCardAction");

        public static HomeContentPageQuery.OnOrderCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            OrderStatus orderStatusA = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            String str7 = null;
            HomeContentPageQuery.FulfilmentStatusBanner fulfilmentStatusBanner = null;
            HomeContentPageQuery.OrderCardAction orderCardAction = null;
            while (true) {
                switch (reader.o2(f23100a)) {
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
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        orderStatusA = OrderStatus_ResponseAdapter.a(reader, customScalarAdapters);
                        continue;
                    case 4:
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 5:
                        num = num2;
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        num = num2;
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        num = num2;
                        str6 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        num = num2;
                        str7 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        num = num2;
                        fulfilmentStatusBanner = (HomeContentPageQuery.FulfilmentStatusBanner) Adapters.b(Adapters.c(FulfilmentStatusBanner.f23041a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        num = num2;
                        orderCardAction = (HomeContentPageQuery.OrderCardAction) Adapters.c(OrderCardAction.f23114a, false).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Integer num3 = num2;
                        if (str == null) {
                            Assertions.a(reader, "__typename");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, NotificationMessage.NOTIF_KEY_SUB_TITLE);
                            throw null;
                        }
                        if (orderStatusA == null) {
                            Assertions.a(reader, "status");
                            throw null;
                        }
                        if (num3 == null) {
                            Assertions.a(reader, "orderCardId");
                            throw null;
                        }
                        int iIntValue = num3.intValue();
                        if (str4 == null) {
                            Assertions.a(reader, "total");
                            throw null;
                        }
                        if (str5 == null) {
                            Assertions.a(reader, "timeLabel");
                            throw null;
                        }
                        if (str6 == null) {
                            Assertions.a(reader, "timeValue");
                            throw null;
                        }
                        if (str7 == null) {
                            Assertions.a(reader, "date");
                            throw null;
                        }
                        if (orderCardAction != null) {
                            return new HomeContentPageQuery.OnOrderCard(str, str2, str3, orderStatusA, iIntValue, str4, str5, str6, str7, fulfilmentStatusBanner, orderCardAction);
                        }
                        Assertions.a(reader, "orderCardAction");
                        throw null;
                }
                num2 = num;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnOrderCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22878a);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("status");
            OrderStatus_ResponseAdapter.b(writer, customScalarAdapters, value.d);
            writer.F1("orderCardId");
            d.y(value.e, Adapters.b, writer, customScalarAdapters, "total");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("timeLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
            writer.F1("timeValue");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.h);
            writer.F1("date");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.i);
            writer.F1("fulfilmentStatusBanner");
            Adapters.b(Adapters.c(FulfilmentStatusBanner.f23041a, false)).toJson(writer, customScalarAdapters, value.j);
            writer.F1("orderCardAction");
            Adapters.c(OrderCardAction.f23114a, false).toJson(writer, customScalarAdapters, value.k);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnOrderCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnProductCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnProductCard;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard implements Adapter<HomeContentPageQuery.OnProductCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23101a = CollectionsKt.Q("__typename");

        public static HomeContentPageQuery.OnProductCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23101a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new HomeContentPageQuery.OnProductCard(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnProductCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22879a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnProductCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnProductCard1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnProductCard1;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard1 implements Adapter<HomeContentPageQuery.OnProductCard1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23102a = CollectionsKt.Q("__typename");

        public static HomeContentPageQuery.OnProductCard1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23102a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new HomeContentPageQuery.OnProductCard1(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnProductCard1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22880a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnProductCard1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnProductCard2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnProductCard2;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard2 implements Adapter<HomeContentPageQuery.OnProductCard2> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23103a = CollectionsKt.Q("__typename");

        public static HomeContentPageQuery.OnProductCard2 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23103a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new HomeContentPageQuery.OnProductCard2(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnProductCard2 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22881a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnProductCard2) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnPromotionCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnPromotionCard;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnPromotionCard implements Adapter<HomeContentPageQuery.OnPromotionCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23104a = CollectionsKt.R("promotionCardProduct", "promotionCardOfferId", "analytics", "impressionAnalytics");

        public static HomeContentPageQuery.OnPromotionCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            HomeContentPageQuery.PromotionCardProduct promotionCardProduct = null;
            String str = null;
            HomeContentPageQuery.Analytics12 analytics12 = null;
            HomeContentPageQuery.ImpressionAnalytics4 impressionAnalytics4 = null;
            while (true) {
                int iO2 = reader.o2(f23104a);
                if (iO2 == 0) {
                    promotionCardProduct = (HomeContentPageQuery.PromotionCardProduct) Adapters.c(PromotionCardProduct.f23117a, true).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    analytics12 = (HomeContentPageQuery.Analytics12) Adapters.b(Adapters.c(Analytics12.f23010a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    impressionAnalytics4 = (HomeContentPageQuery.ImpressionAnalytics4) Adapters.b(Adapters.c(ImpressionAnalytics4.f23066a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (promotionCardProduct != null) {
                return new HomeContentPageQuery.OnPromotionCard(promotionCardProduct, str, analytics12, impressionAnalytics4);
            }
            Assertions.a(reader, "promotionCardProduct");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnPromotionCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("promotionCardProduct");
            Adapters.c(PromotionCardProduct.f23117a, true).toJson(writer, customScalarAdapters, value.f22882a);
            writer.F1("promotionCardOfferId");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics12.f23010a, true)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("impressionAnalytics");
            Adapters.b(Adapters.c(ImpressionAnalytics4.f23066a, true)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnPromotionCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnQuickLinkCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnQuickLinkCard;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnQuickLinkCard implements Adapter<HomeContentPageQuery.OnQuickLinkCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23105a = CollectionsKt.R("__typename", "linkCardTitle", "linkCardSubtitle", "linkCardImage", "linkCardAction", "linkCardAnimation", "isQuickLinkView");

        public static HomeContentPageQuery.OnQuickLinkCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            HomeContentPageQuery.LinkCardAction linkCardAction = null;
            HomeContentPageQuery.LinkCardAnimation linkCardAnimation = null;
            Boolean bool = null;
            while (true) {
                switch (reader.o2(f23105a)) {
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
                        str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        linkCardAction = (HomeContentPageQuery.LinkCardAction) Adapters.c(LinkCardAction.f23074a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        linkCardAnimation = (HomeContentPageQuery.LinkCardAnimation) Adapters.b(Adapters.c(LinkCardAnimation.f23075a, false)).fromJson(reader, customScalarAdapters);
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
                            Assertions.a(reader, "linkCardTitle");
                            throw null;
                        }
                        if (linkCardAction != null) {
                            return new HomeContentPageQuery.OnQuickLinkCard(str, str2, str3, str4, linkCardAction, linkCardAnimation, bool);
                        }
                        Assertions.a(reader, "linkCardAction");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnQuickLinkCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22883a);
            writer.F1("linkCardTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("linkCardSubtitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("linkCardImage");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("linkCardAction");
            Adapters.c(LinkCardAction.f23074a, false).toJson(writer, customScalarAdapters, value.e);
            writer.F1("linkCardAnimation");
            Adapters.b(Adapters.c(LinkCardAnimation.f23075a, false)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("isQuickLinkView");
            Adapters.l.toJson(writer, customScalarAdapters, value.g);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnQuickLinkCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnRecipeMoreCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnRecipeMoreCard;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRecipeMoreCard implements Adapter<HomeContentPageQuery.OnRecipeMoreCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23106a = CollectionsKt.Q("actionMetadata");

        public static HomeContentPageQuery.OnRecipeMoreCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f23106a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(ActionMetadatum.f23003a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new HomeContentPageQuery.OnRecipeMoreCard(arrayListFromJson);
            }
            Assertions.a(reader, "actionMetadata");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnRecipeMoreCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("actionMetadata");
            Adapters.a(Adapters.c(ActionMetadatum.f23003a, true)).toJson(writer, customScalarAdapters, value.f22884a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnRecipeMoreCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnRecipeSource;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnRecipeSource;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRecipeSource implements Adapter<HomeContentPageQuery.OnRecipeSource> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23107a = CollectionsKt.Q("source");

        public static HomeContentPageQuery.OnRecipeSource a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23107a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new HomeContentPageQuery.OnRecipeSource(str);
            }
            Assertions.a(reader, "source");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnRecipeSource value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("source");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22885a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnRecipeSource) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnRecipeSummaryCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnRecipeSummaryCard;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRecipeSummaryCard implements Adapter<HomeContentPageQuery.OnRecipeSummaryCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23108a = CollectionsKt.Q("__typename");

        public static HomeContentPageQuery.OnRecipeSummaryCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23108a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            RecipeSummaryCardFragment recipeSummaryCardFragmentA = RecipeSummaryCardFragmentImpl_ResponseAdapter.RecipeSummaryCardFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new HomeContentPageQuery.OnRecipeSummaryCard(str, recipeSummaryCardFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnRecipeSummaryCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22886a);
            List list = RecipeSummaryCardFragmentImpl_ResponseAdapter.RecipeSummaryCardFragment.f10207a;
            RecipeSummaryCardFragmentImpl_ResponseAdapter.RecipeSummaryCardFragment.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnRecipeSummaryCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnRecipeTagList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnRecipeTagList;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRecipeTagList implements Adapter<HomeContentPageQuery.OnRecipeTagList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23109a = CollectionsKt.Q(k.a.g);

        public static HomeContentPageQuery.OnRecipeTagList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f23109a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new HomeContentPageQuery.OnRecipeTagList(arrayListFromJson);
            }
            Assertions.a(reader, k.a.g);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnRecipeTagList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(k.a.g);
            Adapters.a(Adapters.f13493a).toJson(writer, customScalarAdapters, value.f22887a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnRecipeTagList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnRegistrationCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnRegistrationCard;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRegistrationCard implements Adapter<HomeContentPageQuery.OnRegistrationCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23110a = CollectionsKt.Q("_excluded");

        public static HomeContentPageQuery.OnRegistrationCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            while (reader.o2(f23110a) == 0) {
                bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
            }
            return new HomeContentPageQuery.OnRegistrationCard(bool);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.OnRegistrationCard value = (HomeContentPageQuery.OnRegistrationCard) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.f22888a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnRewardsBalanceCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnRewardsBalanceCard;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRewardsBalanceCard implements Adapter<HomeContentPageQuery.OnRewardsBalanceCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23111a = CollectionsKt.R("edrNumber", "rewardsState", "offersTitle", "currentBalance", "goalBalance", "actionUrl", "pointsDescriptionFormat", "pointsDescriptionReplacements", "altText", "offersAlertIndicator", "pointsAlertIndicator");

        public static HomeContentPageQuery.OnRewardsBalanceCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            Integer num3 = null;
            String str4 = null;
            String str5 = null;
            ArrayList arrayListFromJson = null;
            String str6 = null;
            HomeContentPageQuery.OffersAlertIndicator offersAlertIndicator = null;
            HomeContentPageQuery.PointsAlertIndicator pointsAlertIndicator = null;
            while (true) {
                switch (reader.o2(f23111a)) {
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
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        num = num2;
                        num3 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        num = num2;
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        num = num2;
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        num = num2;
                        arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        num = num2;
                        str6 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        num = num2;
                        offersAlertIndicator = (HomeContentPageQuery.OffersAlertIndicator) Adapters.b(Adapters.c(OffersAlertIndicator.f23079a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        num = num2;
                        pointsAlertIndicator = (HomeContentPageQuery.PointsAlertIndicator) Adapters.b(Adapters.c(PointsAlertIndicator.f23115a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Integer num4 = num2;
                        if (str == null) {
                            Assertions.a(reader, "edrNumber");
                            throw null;
                        }
                        if (str2 == null) {
                            Assertions.a(reader, "rewardsState");
                            throw null;
                        }
                        if (str3 == null) {
                            Assertions.a(reader, "offersTitle");
                            throw null;
                        }
                        if (num4 == null) {
                            Assertions.a(reader, "currentBalance");
                            throw null;
                        }
                        Integer num5 = num3;
                        int iIntValue = num4.intValue();
                        if (num5 == null) {
                            Assertions.a(reader, "goalBalance");
                            throw null;
                        }
                        int iIntValue2 = num5.intValue();
                        if (str4 == null) {
                            Assertions.a(reader, "actionUrl");
                            throw null;
                        }
                        if (str5 == null) {
                            Assertions.a(reader, "pointsDescriptionFormat");
                            throw null;
                        }
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "pointsDescriptionReplacements");
                            throw null;
                        }
                        if (str6 != null) {
                            return new HomeContentPageQuery.OnRewardsBalanceCard(str, str2, str3, iIntValue, iIntValue2, str4, str5, arrayListFromJson, str6, offersAlertIndicator, pointsAlertIndicator);
                        }
                        Assertions.a(reader, "altText");
                        throw null;
                }
                num2 = num;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnRewardsBalanceCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("edrNumber");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22889a);
            writer.F1("rewardsState");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("offersTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("currentBalance");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.d, adapters$IntAdapter$1, writer, customScalarAdapters, "goalBalance");
            d.y(value.e, adapters$IntAdapter$1, writer, customScalarAdapters, "actionUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("pointsDescriptionFormat");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
            writer.F1("pointsDescriptionReplacements");
            Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.h);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.i);
            writer.F1("offersAlertIndicator");
            Adapters.b(Adapters.c(OffersAlertIndicator.f23079a, false)).toJson(writer, customScalarAdapters, value.j);
            writer.F1("pointsAlertIndicator");
            Adapters.b(Adapters.c(PointsAlertIndicator.f23115a, false)).toJson(writer, customScalarAdapters, value.k);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnRewardsBalanceCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnVideoAdUnit;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnVideoAdUnit;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnVideoAdUnit implements Adapter<HomeContentPageQuery.OnVideoAdUnit> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23112a = CollectionsKt.R("__typename", "videoAdUnitVideoAd", "videoAdUnitCarousel", "videoAdUnitBottomLink");

        public static HomeContentPageQuery.OnVideoAdUnit a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            HomeContentPageQuery.VideoAdUnitVideoAd videoAdUnitVideoAd = null;
            HomeContentPageQuery.VideoAdUnitCarousel videoAdUnitCarousel = null;
            HomeContentPageQuery.VideoAdUnitBottomLink videoAdUnitBottomLink = null;
            while (true) {
                int iO2 = reader.o2(f23112a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    videoAdUnitVideoAd = (HomeContentPageQuery.VideoAdUnitVideoAd) Adapters.c(VideoAdUnitVideoAd.f23130a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    videoAdUnitCarousel = (HomeContentPageQuery.VideoAdUnitCarousel) Adapters.b(Adapters.c(VideoAdUnitCarousel.f23129a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    videoAdUnitBottomLink = (HomeContentPageQuery.VideoAdUnitBottomLink) Adapters.b(Adapters.c(VideoAdUnitBottomLink.f23128a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (videoAdUnitVideoAd != null) {
                return new HomeContentPageQuery.OnVideoAdUnit(str, videoAdUnitVideoAd, videoAdUnitCarousel, videoAdUnitBottomLink);
            }
            Assertions.a(reader, "videoAdUnitVideoAd");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeContentPageQuery.OnVideoAdUnit value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22890a);
            writer.F1("videoAdUnitVideoAd");
            Adapters.c(VideoAdUnitVideoAd.f23130a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("videoAdUnitCarousel");
            Adapters.b(Adapters.c(VideoAdUnitCarousel.f23129a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("videoAdUnitBottomLink");
            Adapters.b(Adapters.c(VideoAdUnitBottomLink.f23128a, false)).toJson(writer, customScalarAdapters, value.d);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeContentPageQuery.OnVideoAdUnit) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OnlineShoppingModeVariantTile;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnlineShoppingModeVariantTile;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnlineShoppingModeVariantTile implements Adapter<HomeContentPageQuery.OnlineShoppingModeVariantTile> {

        /* renamed from: a, reason: collision with root package name */
        public static final OnlineShoppingModeVariantTile f23113a = new OnlineShoppingModeVariantTile();
        public static final List b = CollectionsKt.R("url", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            HomeContentPageQuery.Title1 title1 = null;
            HomeContentPageQuery.Subtitle1 subtitle1 = null;
            HomeContentPageQuery.Analytics1 analytics1 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    title1 = (HomeContentPageQuery.Title1) Adapters.b(Adapters.c(Title1.f23125a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    subtitle1 = (HomeContentPageQuery.Subtitle1) Adapters.b(Adapters.c(Subtitle1.f23122a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    analytics1 = (HomeContentPageQuery.Analytics1) Adapters.c(Analytics1.f23007a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "url");
                throw null;
            }
            if (analytics1 != null) {
                return new HomeContentPageQuery.OnlineShoppingModeVariantTile(str, title1, subtitle1, analytics1);
            }
            Assertions.a(reader, "analytics");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.OnlineShoppingModeVariantTile value = (HomeContentPageQuery.OnlineShoppingModeVariantTile) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22891a);
            writer.F1("title");
            Adapters.b(Adapters.c(Title1.f23125a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.b(Adapters.c(Subtitle1.f23122a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.c(Analytics1.f23007a, false).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$OrderCardAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$OrderCardAction;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OrderCardAction implements Adapter<HomeContentPageQuery.OrderCardAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final OrderCardAction f23114a = new OrderCardAction();
        public static final List b = CollectionsKt.R("type", UrlHandler.ACTION, "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActionType actionTypeA = null;
            String str = null;
            HomeContentPageQuery.Analytics9 analytics9 = null;
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
                    analytics9 = (HomeContentPageQuery.Analytics9) Adapters.b(Adapters.c(Analytics9.f23019a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new HomeContentPageQuery.OrderCardAction(actionTypeA, str, analytics9);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.OrderCardAction value = (HomeContentPageQuery.OrderCardAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.f22892a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics9.f23019a, true)).toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$PointsAlertIndicator;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$PointsAlertIndicator;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PointsAlertIndicator implements Adapter<HomeContentPageQuery.PointsAlertIndicator> {

        /* renamed from: a, reason: collision with root package name */
        public static final PointsAlertIndicator f23115a = new PointsAlertIndicator();
        public static final List b = CollectionsKt.R("indicatorType", "message");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            AlertIndicatorType alertIndicatorTypeA = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    alertIndicatorTypeA = AlertIndicatorType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (alertIndicatorTypeA == null) {
                Assertions.a(reader, "indicatorType");
                throw null;
            }
            if (str != null) {
                return new HomeContentPageQuery.PointsAlertIndicator(alertIndicatorTypeA, str);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.PointsAlertIndicator value = (HomeContentPageQuery.PointsAlertIndicator) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("indicatorType");
            AlertIndicatorType_ResponseAdapter.b(writer, customScalarAdapters, value.f22893a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$PrimaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$PrimaryCta;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrimaryCta implements Adapter<HomeContentPageQuery.PrimaryCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final PrimaryCta f23116a = new PrimaryCta();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "url");

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
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new HomeContentPageQuery.PrimaryCta(str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.PrimaryCta value = (HomeContentPageQuery.PrimaryCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22894a);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$PromotionCardProduct;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$PromotionCardProduct;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PromotionCardProduct implements Adapter<HomeContentPageQuery.PromotionCardProduct> {

        /* renamed from: a, reason: collision with root package name */
        public static final PromotionCardProduct f23117a = new PromotionCardProduct();
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
                return new HomeContentPageQuery.PromotionCardProduct(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.PromotionCardProduct value = (HomeContentPageQuery.PromotionCardProduct) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22895a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$SecondaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$SecondaryCta;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SecondaryCta implements Adapter<HomeContentPageQuery.SecondaryCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final SecondaryCta f23118a = new SecondaryCta();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "url");

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
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new HomeContentPageQuery.SecondaryCta(str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.SecondaryCta value = (HomeContentPageQuery.SecondaryCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22896a);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$StoreName;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$StoreName;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StoreName implements Adapter<HomeContentPageQuery.StoreName> {

        /* renamed from: a, reason: collision with root package name */
        public static final StoreName f23119a = new StoreName();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "url");

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
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (str2 != null) {
                return new HomeContentPageQuery.StoreName(str, str2);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.StoreName value = (HomeContentPageQuery.StoreName) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22897a);
            writer.F1("url");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$StoreTime;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$StoreTime;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StoreTime implements Adapter<HomeContentPageQuery.StoreTime> {

        /* renamed from: a, reason: collision with root package name */
        public static final StoreTime f23120a = new StoreTime();
        public static final List b = CollectionsKt.R(AnnotatedPrivateKey.LABEL, "url");

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
                Assertions.a(reader, AnnotatedPrivateKey.LABEL);
                throw null;
            }
            if (str2 != null) {
                return new HomeContentPageQuery.StoreTime(str, str2);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.StoreTime value = (HomeContentPageQuery.StoreTime) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22898a);
            writer.F1("url");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Subtitle;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Subtitle;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Subtitle implements Adapter<HomeContentPageQuery.Subtitle> {

        /* renamed from: a, reason: collision with root package name */
        public static final Subtitle f23121a = new Subtitle();
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
                return new HomeContentPageQuery.Subtitle(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Subtitle value = (HomeContentPageQuery.Subtitle) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22899a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Subtitle1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Subtitle1;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Subtitle1 implements Adapter<HomeContentPageQuery.Subtitle1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Subtitle1 f23122a = new Subtitle1();
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
                return new HomeContentPageQuery.Subtitle1(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Subtitle1 value = (HomeContentPageQuery.Subtitle1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22900a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$TermsAndConditions;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$TermsAndConditions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class TermsAndConditions implements Adapter<HomeContentPageQuery.TermsAndConditions> {

        /* renamed from: a, reason: collision with root package name */
        public static final TermsAndConditions f23123a = new TermsAndConditions();
        public static final List b = CollectionsKt.R("__typename", "contentMarkdown", "title", "buttonText", "accessibilityText", "impressionAnalytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            HomeContentPageQuery.ImpressionAnalytics3 impressionAnalytics3 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    impressionAnalytics3 = (HomeContentPageQuery.ImpressionAnalytics3) Adapters.b(Adapters.c(ImpressionAnalytics3.f23065a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "contentMarkdown");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str5 != null) {
                return new HomeContentPageQuery.TermsAndConditions(str, str2, str3, str4, str5, impressionAnalytics3);
            }
            Assertions.a(reader, "accessibilityText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.TermsAndConditions value = (HomeContentPageQuery.TermsAndConditions) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22901a);
            writer.F1("contentMarkdown");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("buttonText");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
            writer.F1("accessibilityText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("impressionAnalytics");
            Adapters.b(Adapters.c(ImpressionAnalytics3.f23065a, true)).toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Title;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Title;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Title implements Adapter<HomeContentPageQuery.Title> {

        /* renamed from: a, reason: collision with root package name */
        public static final Title f23124a = new Title();
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
                return new HomeContentPageQuery.Title(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Title value = (HomeContentPageQuery.Title) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22902a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Title1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Title1;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Title1 implements Adapter<HomeContentPageQuery.Title1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Title1 f23125a = new Title1();
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
                return new HomeContentPageQuery.Title1(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Title1 value = (HomeContentPageQuery.Title1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22903a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$Transcript;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Transcript;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Transcript implements Adapter<HomeContentPageQuery.Transcript> {

        /* renamed from: a, reason: collision with root package name */
        public static final Transcript f23126a = new Transcript();
        public static final List b = CollectionsKt.R("__typename", "contentMarkdown", "title", "buttonText", "accessibilityText", "impressionAnalytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            HomeContentPageQuery.ImpressionAnalytics2 impressionAnalytics2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    impressionAnalytics2 = (HomeContentPageQuery.ImpressionAnalytics2) Adapters.b(Adapters.c(ImpressionAnalytics2.f23064a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "contentMarkdown");
                throw null;
            }
            if (str3 == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str5 != null) {
                return new HomeContentPageQuery.Transcript(str, str2, str3, str4, str5, impressionAnalytics2);
            }
            Assertions.a(reader, "accessibilityText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.Transcript value = (HomeContentPageQuery.Transcript) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22904a);
            writer.F1("contentMarkdown");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("title");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("buttonText");
            Adapters.i.toJson(writer, customScalarAdapters, value.d);
            writer.F1("accessibilityText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("impressionAnalytics");
            Adapters.b(Adapters.c(ImpressionAnalytics2.f23064a, true)).toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$UnreadChatbotMsg;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$UnreadChatbotMsg;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnreadChatbotMsg implements Adapter<HomeContentPageQuery.UnreadChatbotMsg> {

        /* renamed from: a, reason: collision with root package name */
        public static final UnreadChatbotMsg f23127a = new UnreadChatbotMsg();
        public static final List b = CollectionsKt.Q("count");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            while (reader.o2(b) == 0) {
                num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
            }
            if (num != null) {
                return new HomeContentPageQuery.UnreadChatbotMsg(num.intValue());
            }
            Assertions.a(reader, "count");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.UnreadChatbotMsg value = (HomeContentPageQuery.UnreadChatbotMsg) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("count");
            Adapters.b.toJson(writer, customScalarAdapters, Integer.valueOf(value.f22905a));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$VideoAdUnitBottomLink;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$VideoAdUnitBottomLink;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VideoAdUnitBottomLink implements Adapter<HomeContentPageQuery.VideoAdUnitBottomLink> {

        /* renamed from: a, reason: collision with root package name */
        public static final VideoAdUnitBottomLink f23128a = new VideoAdUnitBottomLink();
        public static final List b = CollectionsKt.R("__typename", "linkId", "linkTextWithAlt", "linkAction");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            HomeContentPageQuery.LinkTextWithAlt linkTextWithAlt = null;
            HomeContentPageQuery.LinkAction linkAction = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    linkTextWithAlt = (HomeContentPageQuery.LinkTextWithAlt) Adapters.c(LinkTextWithAlt.f23076a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    linkAction = (HomeContentPageQuery.LinkAction) Adapters.c(LinkAction.f23072a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (linkTextWithAlt == null) {
                Assertions.a(reader, "linkTextWithAlt");
                throw null;
            }
            if (linkAction != null) {
                return new HomeContentPageQuery.VideoAdUnitBottomLink(str, str2, linkTextWithAlt, linkAction);
            }
            Assertions.a(reader, "linkAction");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.VideoAdUnitBottomLink value = (HomeContentPageQuery.VideoAdUnitBottomLink) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22906a);
            writer.F1("linkId");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
            writer.F1("linkTextWithAlt");
            Adapters.c(LinkTextWithAlt.f23076a, false).toJson(writer, customScalarAdapters, value.c);
            writer.F1("linkAction");
            Adapters.c(LinkAction.f23072a, false).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$VideoAdUnitCarousel;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$VideoAdUnitCarousel;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VideoAdUnitCarousel implements Adapter<HomeContentPageQuery.VideoAdUnitCarousel> {

        /* renamed from: a, reason: collision with root package name */
        public static final VideoAdUnitCarousel f23129a = new VideoAdUnitCarousel();
        public static final List b = CollectionsKt.R("__typename", "items");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    arrayListFromJson = Adapters.a(Adapters.c(Item2.f23070a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "__typename");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new HomeContentPageQuery.VideoAdUnitCarousel(str, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.VideoAdUnitCarousel value = (HomeContentPageQuery.VideoAdUnitCarousel) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22907a);
            writer.F1("items");
            Adapters.a(Adapters.c(Item2.f23070a, true)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$VideoAdUnitVideoAd;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$VideoAdUnitVideoAd;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VideoAdUnitVideoAd implements Adapter<HomeContentPageQuery.VideoAdUnitVideoAd> {

        /* renamed from: a, reason: collision with root package name */
        public static final VideoAdUnitVideoAd f23130a = new VideoAdUnitVideoAd();
        public static final List b = CollectionsKt.R("__typename", "url", "fallbackImage", "duration", "transcript", "termsAndConditions", "analytics", "eventAnalytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            String str2 = null;
            HomeContentPageQuery.FallbackImage fallbackImage = null;
            HomeContentPageQuery.Transcript transcript = null;
            HomeContentPageQuery.TermsAndConditions termsAndConditions = null;
            HomeContentPageQuery.Analytics6 analytics6 = null;
            HomeContentPageQuery.EventAnalytics eventAnalytics = null;
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
                        fallbackImage = (HomeContentPageQuery.FallbackImage) Adapters.b(Adapters.c(FallbackImage.f23040a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        num = num2;
                        transcript = (HomeContentPageQuery.Transcript) Adapters.b(Adapters.c(Transcript.f23126a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        num = num2;
                        termsAndConditions = (HomeContentPageQuery.TermsAndConditions) Adapters.b(Adapters.c(TermsAndConditions.f23123a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        num = num2;
                        analytics6 = (HomeContentPageQuery.Analytics6) Adapters.b(Adapters.c(Analytics6.f23016a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        num = num2;
                        eventAnalytics = (HomeContentPageQuery.EventAnalytics) Adapters.b(Adapters.c(EventAnalytics.f23038a, false)).fromJson(reader, customScalarAdapters);
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
                            return new HomeContentPageQuery.VideoAdUnitVideoAd(str, str2, fallbackImage, num3.intValue(), transcript, termsAndConditions, analytics6, eventAnalytics);
                        }
                        Assertions.a(reader, "duration");
                        throw null;
                }
                num2 = num;
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.VideoAdUnitVideoAd value = (HomeContentPageQuery.VideoAdUnitVideoAd) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22908a);
            writer.F1("url");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("fallbackImage");
            Adapters.b(Adapters.c(FallbackImage.f23040a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("duration");
            d.y(value.d, Adapters.b, writer, customScalarAdapters, "transcript");
            Adapters.b(Adapters.c(Transcript.f23126a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("termsAndConditions");
            Adapters.b(Adapters.c(TermsAndConditions.f23123a, false)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics6.f23016a, true)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("eventAnalytics");
            Adapters.b(Adapters.c(EventAnalytics.f23038a, false)).toJson(writer, customScalarAdapters, value.h);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$VideoErrorImpression;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$VideoErrorImpression;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VideoErrorImpression implements Adapter<HomeContentPageQuery.VideoErrorImpression> {

        /* renamed from: a, reason: collision with root package name */
        public static final VideoErrorImpression f23131a = new VideoErrorImpression();
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
                return new HomeContentPageQuery.VideoErrorImpression(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.VideoErrorImpression value = (HomeContentPageQuery.VideoErrorImpression) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22909a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$VideoPause;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$VideoPause;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VideoPause implements Adapter<HomeContentPageQuery.VideoPause> {

        /* renamed from: a, reason: collision with root package name */
        public static final VideoPause f23132a = new VideoPause();
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
                return new HomeContentPageQuery.VideoPause(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.VideoPause value = (HomeContentPageQuery.VideoPause) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22910a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeContentPageQuery_ResponseAdapter$VideoPlay;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$VideoPlay;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VideoPlay implements Adapter<HomeContentPageQuery.VideoPlay> {

        /* renamed from: a, reason: collision with root package name */
        public static final VideoPlay f23133a = new VideoPlay();
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
                return new HomeContentPageQuery.VideoPlay(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeContentPageQuery.VideoPlay value = (HomeContentPageQuery.VideoPlay) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22911a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }
}
