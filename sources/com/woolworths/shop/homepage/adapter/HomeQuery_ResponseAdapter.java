package com.woolworths.shop.homepage.adapter;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.graphql.TealiumAnalytics;
import au.com.woolworths.android.onesite.graphql.GoogleAdCustomTargeting;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.graphql.common.fragment.ProductCardImpl_ResponseAdapter;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFieldsImpl_ResponseAdapter;
import au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragment;
import au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragmentImpl_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.AdBannerNativeSize;
import au.com.woolworths.shop.graphql.type.AlertIndicatorType;
import au.com.woolworths.shop.graphql.type.BroadcastBannerType;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.DownloadableAssetFit;
import au.com.woolworths.shop.graphql.type.DownloadableAssetType;
import au.com.woolworths.shop.graphql.type.HeroBannerTitleSize;
import au.com.woolworths.shop.graphql.type.HomeFulfilmentWindowContainerOrientation;
import au.com.woolworths.shop.graphql.type.HomeFulfilmentWindowTileStyle;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.OrderStatus;
import au.com.woolworths.shop.graphql.type.adapter.ActionType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.AdBannerNativeSize_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.AlertIndicatorType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.BroadcastBannerType_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ButtonStyle_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.CardHeight_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.DownloadableAssetFit_ResponseAdapter;
import au.com.woolworths.shop.graphql.type.adapter.DownloadableAssetType_ResponseAdapter;
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
import com.apollographql.apollo.api.BooleanExpressions;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.NullableAdapter;
import com.apollographql.apollo.api.json.JsonReader;
import com.apollographql.apollo.api.json.JsonWriter;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.salesforce.marketingcloud.UrlHandler;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import com.salesforce.marketingcloud.storage.db.k;
import com.woolworths.shop.homepage.HomeQuery;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\bX\bÇ\u0002\u0018\u00002\u00020\u0001:W\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWX¨\u0006Y"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter;", "", "Data", "Home", "HeaderItem", "OnHomeFulfilmentWindowBanner", "FulfilmentWindowStateSubtitle", "FulfilmentWindowStateButton", "OnHomeFulfilmentWindowContainer", "Button", "DeliveryNowBanner", "OnHomeModeSelectorContainer", "FulfilmentWindowTile", "Title", "Subtitle", "Analytics", "OnlineShoppingModeVariantTile", "Title1", "Subtitle1", "Analytics1", "Divider", "DeliveryNowBanner1", "OnHomeDeliveryNowBottomBanner", "BannerAsset", "PrimaryCta", "SecondaryCta", "OnHomeDeliveryNowBanner", "InStoreDetailsCard", "StoreName", "StoreTime", "Analytic", "OnAdobeTargetAnalytics", "OnOrderAnalytics", "DeliveryNow", "Item", "OnCarousel", "CarouselItem", "OnHeroBanner", "HeroBannerAction", "Analytics2", "HeroBannerAnalytics", "ExtraContent", "HeroBannerImpressionAnalytics", "HeroBannerBody", "OnHeroBannerBodyText", "OnHeroBannerPromoBody", "HeroBannerBrandsLogo", "HeroBannerGraphic", "HeroBannerImage", "HeroBannerTermsAndConditions", "HeroBannerTermsAndConditionAction", "Analytics3", "OnRegistrationCard", "OnRewardsBalanceCard", "OffersAlertIndicator", "PointsAlertIndicator", "OnAddRewardsCard", "OnBroadcastBanner", "OnDividerCard", "OnInsetBanner", "Action", "OnCatalogueCard", "OnMarketplaceCard", "OnQuickLinkHorizontalList", "Item1", "OnQuickLinkCard", "LinkCardAction", "LinkCardAnimation", "OnMyShoppingLists", "OnActionableCard", "OnGoogleAdBannerCard", "OnRecipeHorizontalList", "Item2", "OnRecipeSummaryCard", "OnRecipeMoreCard", "ActionMetadatum", "OnRecipeTagList", "OnRecipeSource", "OnOrderHorizontalList", "Item3", "OnOrderCard", "FulfilmentStatusBanner", "OnProductHorizontalList", "Item4", "OnProductCard", "OnBoosterHorizontalList", "Item5", "OnProductCard1", "UnreadChatbotMsg", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HomeQuery_ResponseAdapter {

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$Action;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$Action;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Action implements Adapter<HomeQuery.Action> {

        /* renamed from: a, reason: collision with root package name */
        public static final Action f23134a = new Action();
        public static final List b = CollectionsKt.R("url", "type", "placement", AnnotatedPrivateKey.LABEL);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            InsetBannerActionType insetBannerActionTypeA = null;
            InsetBannerActionPlacement insetBannerActionPlacementA = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    insetBannerActionTypeA = InsetBannerActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    insetBannerActionPlacementA = InsetBannerActionPlacement_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerActionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (insetBannerActionPlacementA == null) {
                Assertions.a(reader, "placement");
                throw null;
            }
            if (str2 != null) {
                return new HomeQuery.Action(insetBannerActionPlacementA, insetBannerActionTypeA, str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.Action value = (HomeQuery.Action) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.f22913a);
            writer.F1("type");
            InsetBannerActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("placement");
            InsetBannerActionPlacement_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$ActionMetadatum;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$ActionMetadatum;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ActionMetadatum implements Adapter<HomeQuery.ActionMetadatum> {

        /* renamed from: a, reason: collision with root package name */
        public static final ActionMetadatum f23135a = new ActionMetadatum();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            HomeQuery.OnRecipeTagList onRecipeTagListA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            HomeQuery.OnRecipeSource onRecipeSourceA = null;
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
            return new HomeQuery.ActionMetadatum(str, onRecipeTagListA, onRecipeSourceA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.ActionMetadatum value = (HomeQuery.ActionMetadatum) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22914a);
            HomeQuery.OnRecipeTagList onRecipeTagList = value.b;
            if (onRecipeTagList != null) {
                OnRecipeTagList.b(writer, customScalarAdapters, onRecipeTagList);
            }
            HomeQuery.OnRecipeSource onRecipeSource = value.c;
            if (onRecipeSource != null) {
                OnRecipeSource.b(writer, customScalarAdapters, onRecipeSource);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$Analytic;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$Analytic;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytic implements Adapter<HomeQuery.Analytic> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytic f23136a = new Analytic();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            HomeQuery.OnAdobeTargetAnalytics onAdobeTargetAnalyticsA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            HomeQuery.OnOrderAnalytics onOrderAnalyticsA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("AdobeTargetAnalytics"))) {
                reader.o();
                onAdobeTargetAnalyticsA = OnAdobeTargetAnalytics.a(reader, customScalarAdapters);
            } else {
                onAdobeTargetAnalyticsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("OrderAnalytics"))) {
                reader.o();
                onOrderAnalyticsA = OnOrderAnalytics.a(reader, customScalarAdapters);
            }
            return new HomeQuery.Analytic(str, onAdobeTargetAnalyticsA, onOrderAnalyticsA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.Analytic value = (HomeQuery.Analytic) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22915a);
            HomeQuery.OnAdobeTargetAnalytics onAdobeTargetAnalytics = value.b;
            if (onAdobeTargetAnalytics != null) {
                OnAdobeTargetAnalytics.b(writer, customScalarAdapters, onAdobeTargetAnalytics);
            }
            HomeQuery.OnOrderAnalytics onOrderAnalytics = value.c;
            if (onOrderAnalytics != null) {
                OnOrderAnalytics.b(writer, customScalarAdapters, onOrderAnalytics);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$Analytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$Analytics;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics implements Adapter<HomeQuery.Analytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics f23137a = new Analytics();
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
                return new HomeQuery.Analytics(str);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.Analytics value = (HomeQuery.Analytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22916a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$Analytics1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$Analytics1;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics1 implements Adapter<HomeQuery.Analytics1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics1 f23138a = new Analytics1();
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
                return new HomeQuery.Analytics1(str);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.Analytics1 value = (HomeQuery.Analytics1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22917a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$Analytics2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$Analytics2;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics2 implements Adapter<HomeQuery.Analytics2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics2 f23139a = new Analytics2();
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
                return new HomeQuery.Analytics2(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.Analytics2 value = (HomeQuery.Analytics2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22918a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$Analytics3;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$Analytics3;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Analytics3 implements Adapter<HomeQuery.Analytics3> {

        /* renamed from: a, reason: collision with root package name */
        public static final Analytics3 f23140a = new Analytics3();
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
                return new HomeQuery.Analytics3(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.Analytics3 value = (HomeQuery.Analytics3) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22919a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$BannerAsset;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$BannerAsset;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BannerAsset implements Adapter<HomeQuery.BannerAsset> {

        /* renamed from: a, reason: collision with root package name */
        public static final BannerAsset f23141a = new BannerAsset();
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
                return new HomeQuery.BannerAsset(downloadableAssetTypeA, str, iIntValue, num5.intValue(), downloadableAssetFit, str2);
            }
            Assertions.a(reader, "assetHeight");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.BannerAsset value = (HomeQuery.BannerAsset) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("assetType");
            DownloadableAssetType_ResponseAdapter.b(writer, customScalarAdapters, value.f22920a);
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
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$Button;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$Button;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Button implements Adapter<HomeQuery.Button> {

        /* renamed from: a, reason: collision with root package name */
        public static final Button f23142a = new Button();
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
                return new HomeQuery.Button(buttonStyle, str, str2, str3, str4, bool3.booleanValue());
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.Button value = (HomeQuery.Button) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22921a);
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
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$CarouselItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$CarouselItem;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class CarouselItem implements Adapter<HomeQuery.CarouselItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final CarouselItem f23143a = new CarouselItem();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            HomeQuery.OnHeroBanner onHeroBannerA = null;
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
            return new HomeQuery.CarouselItem(str, onHeroBannerA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.CarouselItem value = (HomeQuery.CarouselItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22922a);
            HomeQuery.OnHeroBanner onHeroBanner = value.b;
            if (onHeroBanner != null) {
                OnHeroBanner.b(writer, customScalarAdapters, onHeroBanner);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$Data;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$Data;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Data implements Adapter<HomeQuery.Data> {

        /* renamed from: a, reason: collision with root package name */
        public static final Data f23144a = new Data();
        public static final List b = CollectionsKt.Q("home");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            HomeQuery.Home home = null;
            while (reader.o2(b) == 0) {
                home = (HomeQuery.Home) Adapters.b(Adapters.c(Home.f23164a, false)).fromJson(reader, customScalarAdapters);
            }
            return new HomeQuery.Data(home);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.Data value = (HomeQuery.Data) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("home");
            Adapters.b(Adapters.c(Home.f23164a, false)).toJson(writer, customScalarAdapters, value.f22923a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$DeliveryNow;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$DeliveryNow;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryNow implements Adapter<HomeQuery.DeliveryNow> {

        /* renamed from: a, reason: collision with root package name */
        public static final DeliveryNow f23145a = new DeliveryNow();
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
                return new HomeQuery.DeliveryNow(str, num);
            }
            Assertions.a(reader, "status");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.DeliveryNow value = (HomeQuery.DeliveryNow) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("status");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22924a);
            writer.F1("expressDeliveryStoreId");
            Adapters.k.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$DeliveryNowBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$DeliveryNowBanner;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryNowBanner implements Adapter<HomeQuery.DeliveryNowBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final DeliveryNowBanner f23146a = new DeliveryNowBanner();
        public static final List b = CollectionsKt.Q("_excluded");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            while (reader.o2(b) == 0) {
                bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
            }
            return new HomeQuery.DeliveryNowBanner(bool);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.DeliveryNowBanner value = (HomeQuery.DeliveryNowBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.f22925a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$DeliveryNowBanner1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$DeliveryNowBanner1;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DeliveryNowBanner1 implements Adapter<HomeQuery.DeliveryNowBanner1> {

        /* renamed from: a, reason: collision with root package name */
        public static final DeliveryNowBanner1 f23147a = new DeliveryNowBanner1();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            HomeQuery.OnHomeDeliveryNowBottomBanner onHomeDeliveryNowBottomBannerA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            HomeQuery.OnHomeDeliveryNowBanner onHomeDeliveryNowBannerA = null;
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
            return new HomeQuery.DeliveryNowBanner1(str, onHomeDeliveryNowBottomBannerA, onHomeDeliveryNowBannerA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.DeliveryNowBanner1 value = (HomeQuery.DeliveryNowBanner1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22926a);
            HomeQuery.OnHomeDeliveryNowBottomBanner onHomeDeliveryNowBottomBanner = value.b;
            if (onHomeDeliveryNowBottomBanner != null) {
                OnHomeDeliveryNowBottomBanner.b(writer, customScalarAdapters, onHomeDeliveryNowBottomBanner);
            }
            HomeQuery.OnHomeDeliveryNowBanner onHomeDeliveryNowBanner = value.c;
            if (onHomeDeliveryNowBanner != null) {
                List list = OnHomeDeliveryNowBanner.f23187a;
                writer.F1("_excluded");
                Adapters.l.toJson(writer, customScalarAdapters, onHomeDeliveryNowBanner.f22966a);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$Divider;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$Divider;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Divider implements Adapter<HomeQuery.Divider> {

        /* renamed from: a, reason: collision with root package name */
        public static final Divider f23148a = new Divider();
        public static final List b = CollectionsKt.Q("_excluded");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            while (reader.o2(b) == 0) {
                bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
            }
            return new HomeQuery.Divider(bool);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.Divider value = (HomeQuery.Divider) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.f22927a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$ExtraContent;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$ExtraContent;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExtraContent implements Adapter<HomeQuery.ExtraContent> {

        /* renamed from: a, reason: collision with root package name */
        public static final ExtraContent f23149a = new ExtraContent();
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
                return new HomeQuery.ExtraContent(str, str2);
            }
            Assertions.a(reader, "key");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.ExtraContent value = (HomeQuery.ExtraContent) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("key");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22928a);
            writer.F1("value");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$FulfilmentStatusBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$FulfilmentStatusBanner;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FulfilmentStatusBanner implements Adapter<HomeQuery.FulfilmentStatusBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final FulfilmentStatusBanner f23150a = new FulfilmentStatusBanner();
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
                return new HomeQuery.FulfilmentStatusBanner(str, str2);
            }
            Assertions.a(reader, "buttonLabel");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.FulfilmentStatusBanner value = (HomeQuery.FulfilmentStatusBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22929a);
            writer.F1("buttonLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$FulfilmentWindowStateButton;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$FulfilmentWindowStateButton;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FulfilmentWindowStateButton implements Adapter<HomeQuery.FulfilmentWindowStateButton> {

        /* renamed from: a, reason: collision with root package name */
        public static final FulfilmentWindowStateButton f23151a = new FulfilmentWindowStateButton();
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
                return new HomeQuery.FulfilmentWindowStateButton(str, buttonStyle, bool3.booleanValue(), str2, str3);
            }
            Assertions.a(reader, "enabled");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.FulfilmentWindowStateButton value = (HomeQuery.FulfilmentWindowStateButton) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22930a);
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
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$FulfilmentWindowStateSubtitle;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$FulfilmentWindowStateSubtitle;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FulfilmentWindowStateSubtitle implements Adapter<HomeQuery.FulfilmentWindowStateSubtitle> {

        /* renamed from: a, reason: collision with root package name */
        public static final FulfilmentWindowStateSubtitle f23152a = new FulfilmentWindowStateSubtitle();
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
                return new HomeQuery.FulfilmentWindowStateSubtitle(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.FulfilmentWindowStateSubtitle value = (HomeQuery.FulfilmentWindowStateSubtitle) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22931a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$FulfilmentWindowTile;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$FulfilmentWindowTile;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FulfilmentWindowTile implements Adapter<HomeQuery.FulfilmentWindowTile> {

        /* renamed from: a, reason: collision with root package name */
        public static final FulfilmentWindowTile f23153a = new FulfilmentWindowTile();
        public static final List b = CollectionsKt.R("style", "iconUrl", "url", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            HomeFulfilmentWindowTileStyle homeFulfilmentWindowTileStyleA = null;
            String str = null;
            String str2 = null;
            HomeQuery.Title title = null;
            HomeQuery.Subtitle subtitle = null;
            HomeQuery.Analytics analytics = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    homeFulfilmentWindowTileStyleA = HomeFulfilmentWindowTileStyle_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    title = (HomeQuery.Title) Adapters.c(Title.f23218a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    subtitle = (HomeQuery.Subtitle) Adapters.b(Adapters.c(Subtitle.f23216a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    analytics = (HomeQuery.Analytics) Adapters.c(Analytics.f23137a, false).fromJson(reader, customScalarAdapters);
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
                return new HomeQuery.FulfilmentWindowTile(homeFulfilmentWindowTileStyleA, str, str2, title, subtitle, analytics);
            }
            Assertions.a(reader, "analytics");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.FulfilmentWindowTile value = (HomeQuery.FulfilmentWindowTile) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("style");
            HomeFulfilmentWindowTileStyle_ResponseAdapter.b(writer, customScalarAdapters, value.f22932a);
            writer.F1("iconUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("url");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("title");
            Adapters.c(Title.f23218a, false).toJson(writer, customScalarAdapters, value.d);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.b(Adapters.c(Subtitle.f23216a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("analytics");
            Adapters.c(Analytics.f23137a, false).toJson(writer, customScalarAdapters, value.f);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$HeaderItem;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$HeaderItem;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeaderItem implements Adapter<HomeQuery.HeaderItem> {

        /* renamed from: a, reason: collision with root package name */
        public static final HeaderItem f23154a = new HeaderItem();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            HomeQuery.OnHomeFulfilmentWindowBanner onHomeFulfilmentWindowBannerA;
            HomeQuery.OnHomeFulfilmentWindowContainer onHomeFulfilmentWindowContainerA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            HomeQuery.OnHomeModeSelectorContainer onHomeModeSelectorContainerA = null;
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
            return new HomeQuery.HeaderItem(str, onHomeFulfilmentWindowBannerA, onHomeFulfilmentWindowContainerA, onHomeModeSelectorContainerA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.HeaderItem value = (HomeQuery.HeaderItem) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22933a);
            HomeQuery.OnHomeFulfilmentWindowBanner onHomeFulfilmentWindowBanner = value.b;
            if (onHomeFulfilmentWindowBanner != null) {
                OnHomeFulfilmentWindowBanner.b(writer, customScalarAdapters, onHomeFulfilmentWindowBanner);
            }
            HomeQuery.OnHomeFulfilmentWindowContainer onHomeFulfilmentWindowContainer = value.c;
            if (onHomeFulfilmentWindowContainer != null) {
                OnHomeFulfilmentWindowContainer.b(writer, customScalarAdapters, onHomeFulfilmentWindowContainer);
            }
            HomeQuery.OnHomeModeSelectorContainer onHomeModeSelectorContainer = value.d;
            if (onHomeModeSelectorContainer != null) {
                OnHomeModeSelectorContainer.b(writer, customScalarAdapters, onHomeModeSelectorContainer);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$HeroBannerAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$HeroBannerAction;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeroBannerAction implements Adapter<HomeQuery.HeroBannerAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final HeroBannerAction f23155a = new HeroBannerAction();
        public static final List b = CollectionsKt.R(UrlHandler.ACTION, "analytics", "type");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            HomeQuery.Analytics2 analytics2 = null;
            ActionType actionTypeA = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    analytics2 = (HomeQuery.Analytics2) Adapters.b(Adapters.c(Analytics2.f23139a, true)).fromJson(reader, customScalarAdapters);
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
                return new HomeQuery.HeroBannerAction(str, analytics2, actionTypeA);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.HeroBannerAction value = (HomeQuery.HeroBannerAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22934a);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics2.f23139a, true)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$HeroBannerAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$HeroBannerAnalytics;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeroBannerAnalytics implements Adapter<HomeQuery.HeroBannerAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final HeroBannerAnalytics f23156a = new HeroBannerAnalytics();
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
                    list = (List) Adapters.b(Adapters.a(Adapters.c(ExtraContent.f23149a, false))).fromJson(reader, customScalarAdapters);
                }
            }
            reader.o();
            AnalyticsFields analyticsFieldsA = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.a(reader, customScalarAdapters);
            if (str != null) {
                return new HomeQuery.HeroBannerAnalytics(str, list, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.HeroBannerAnalytics value = (HomeQuery.HeroBannerAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22935a);
            writer.F1("extraContent");
            Adapters.b(Adapters.a(Adapters.c(ExtraContent.f23149a, false))).toJson(writer, customScalarAdapters, value.b);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$HeroBannerBody;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$HeroBannerBody;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeroBannerBody implements Adapter<HomeQuery.HeroBannerBody> {

        /* renamed from: a, reason: collision with root package name */
        public static final HeroBannerBody f23157a = new HeroBannerBody();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            HomeQuery.OnHeroBannerBodyText onHeroBannerBodyTextA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            HomeQuery.OnHeroBannerPromoBody onHeroBannerPromoBodyA = null;
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
            return new HomeQuery.HeroBannerBody(str, onHeroBannerBodyTextA, onHeroBannerPromoBodyA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.HeroBannerBody value = (HomeQuery.HeroBannerBody) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22936a);
            HomeQuery.OnHeroBannerBodyText onHeroBannerBodyText = value.b;
            if (onHeroBannerBodyText != null) {
                OnHeroBannerBodyText.b(writer, customScalarAdapters, onHeroBannerBodyText);
            }
            HomeQuery.OnHeroBannerPromoBody onHeroBannerPromoBody = value.c;
            if (onHeroBannerPromoBody != null) {
                OnHeroBannerPromoBody.b(writer, customScalarAdapters, onHeroBannerPromoBody);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$HeroBannerBrandsLogo;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$HeroBannerBrandsLogo;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeroBannerBrandsLogo implements Adapter<HomeQuery.HeroBannerBrandsLogo> {

        /* renamed from: a, reason: collision with root package name */
        public static final HeroBannerBrandsLogo f23158a = new HeroBannerBrandsLogo();
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
                return new HomeQuery.HeroBannerBrandsLogo(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.HeroBannerBrandsLogo value = (HomeQuery.HeroBannerBrandsLogo) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22937a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$HeroBannerGraphic;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$HeroBannerGraphic;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeroBannerGraphic implements Adapter<HomeQuery.HeroBannerGraphic> {

        /* renamed from: a, reason: collision with root package name */
        public static final HeroBannerGraphic f23159a = new HeroBannerGraphic();
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
                return new HomeQuery.HeroBannerGraphic(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.HeroBannerGraphic value = (HomeQuery.HeroBannerGraphic) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22938a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$HeroBannerImage;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$HeroBannerImage;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeroBannerImage implements Adapter<HomeQuery.HeroBannerImage> {

        /* renamed from: a, reason: collision with root package name */
        public static final HeroBannerImage f23160a = new HeroBannerImage();
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
                return new HomeQuery.HeroBannerImage(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.HeroBannerImage value = (HomeQuery.HeroBannerImage) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("imageUrl");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22939a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$HeroBannerImpressionAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$HeroBannerImpressionAnalytics;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeroBannerImpressionAnalytics implements Adapter<HomeQuery.HeroBannerImpressionAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final HeroBannerImpressionAnalytics f23161a = new HeroBannerImpressionAnalytics();
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
                return new HomeQuery.HeroBannerImpressionAnalytics(str, analyticsFieldsA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.HeroBannerImpressionAnalytics value = (HomeQuery.HeroBannerImpressionAnalytics) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22940a);
            List list = AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.f10034a;
            AnalyticsFieldsImpl_ResponseAdapter.AnalyticsFields.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$HeroBannerTermsAndConditionAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$HeroBannerTermsAndConditionAction;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeroBannerTermsAndConditionAction implements Adapter<HomeQuery.HeroBannerTermsAndConditionAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final HeroBannerTermsAndConditionAction f23162a = new HeroBannerTermsAndConditionAction();
        public static final List b = CollectionsKt.R(UrlHandler.ACTION, "type", "id", "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            ActionType actionTypeA = null;
            String str2 = null;
            HomeQuery.Analytics3 analytics3 = null;
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
                    analytics3 = (HomeQuery.Analytics3) Adapters.b(Adapters.c(Analytics3.f23140a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, UrlHandler.ACTION);
                throw null;
            }
            if (actionTypeA != null) {
                return new HomeQuery.HeroBannerTermsAndConditionAction(str, actionTypeA, str2, analytics3);
            }
            Assertions.a(reader, "type");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.HeroBannerTermsAndConditionAction value = (HomeQuery.HeroBannerTermsAndConditionAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22941a);
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("id");
            Adapters.i.toJson(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.b(Adapters.c(Analytics3.f23140a, true)).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$HeroBannerTermsAndConditions;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$HeroBannerTermsAndConditions;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class HeroBannerTermsAndConditions implements Adapter<HomeQuery.HeroBannerTermsAndConditions> {

        /* renamed from: a, reason: collision with root package name */
        public static final HeroBannerTermsAndConditions f23163a = new HeroBannerTermsAndConditions();
        public static final List b = CollectionsKt.R(TextBundle.TEXT_ENTRY, "heroBannerTermsAndConditionAction");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            HomeQuery.HeroBannerTermsAndConditionAction heroBannerTermsAndConditionAction = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    heroBannerTermsAndConditionAction = (HomeQuery.HeroBannerTermsAndConditionAction) Adapters.b(Adapters.c(HeroBannerTermsAndConditionAction.f23162a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str != null) {
                return new HomeQuery.HeroBannerTermsAndConditions(str, heroBannerTermsAndConditionAction);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.HeroBannerTermsAndConditions value = (HomeQuery.HeroBannerTermsAndConditions) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22942a);
            writer.F1("heroBannerTermsAndConditionAction");
            Adapters.b(Adapters.c(HeroBannerTermsAndConditionAction.f23162a, false)).toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$Home;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$Home;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Home implements Adapter<HomeQuery.Home> {

        /* renamed from: a, reason: collision with root package name */
        public static final Home f23164a = new Home();
        public static final List b = CollectionsKt.R("headerItems", "analytics", "deliveryNow", "items", "unreadChatbotMsg");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            ArrayList arrayListFromJson2 = null;
            HomeQuery.DeliveryNow deliveryNow = null;
            ArrayList arrayListFromJson3 = null;
            HomeQuery.UnreadChatbotMsg unreadChatbotMsg = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    arrayListFromJson = Adapters.a(Adapters.b(Adapters.c(HeaderItem.f23154a, true))).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    arrayListFromJson2 = Adapters.a(Adapters.b(Adapters.c(Analytic.f23136a, true))).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    deliveryNow = (HomeQuery.DeliveryNow) Adapters.b(Adapters.c(DeliveryNow.f23145a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    arrayListFromJson3 = Adapters.a(Adapters.b(Adapters.c(Item.f23166a, true))).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    unreadChatbotMsg = (HomeQuery.UnreadChatbotMsg) Adapters.b(Adapters.c(UnreadChatbotMsg.f23220a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "headerItems");
                throw null;
            }
            if (arrayListFromJson2 == null) {
                Assertions.a(reader, "analytics");
                throw null;
            }
            if (arrayListFromJson3 != null) {
                return new HomeQuery.Home(arrayListFromJson, arrayListFromJson2, deliveryNow, arrayListFromJson3, unreadChatbotMsg);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.Home value = (HomeQuery.Home) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("headerItems");
            Adapters.a(Adapters.b(Adapters.c(HeaderItem.f23154a, true))).toJson(writer, customScalarAdapters, value.f22943a);
            writer.F1("analytics");
            Adapters.a(Adapters.b(Adapters.c(Analytic.f23136a, true))).toJson(writer, customScalarAdapters, value.b);
            writer.F1("deliveryNow");
            Adapters.b(Adapters.c(DeliveryNow.f23145a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("items");
            Adapters.a(Adapters.b(Adapters.c(Item.f23166a, true))).toJson(writer, customScalarAdapters, value.d);
            writer.F1("unreadChatbotMsg");
            Adapters.b(Adapters.c(UnreadChatbotMsg.f23220a, false)).toJson(writer, customScalarAdapters, value.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$InStoreDetailsCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$InStoreDetailsCard;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class InStoreDetailsCard implements Adapter<HomeQuery.InStoreDetailsCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final InStoreDetailsCard f23165a = new InStoreDetailsCard();
        public static final List b = CollectionsKt.R("storeName", "storeTime", "isLocationMapped");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            HomeQuery.StoreName storeName = null;
            HomeQuery.StoreTime storeTime = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    storeName = (HomeQuery.StoreName) Adapters.b(Adapters.c(StoreName.f23214a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    storeTime = (HomeQuery.StoreTime) Adapters.b(Adapters.c(StoreTime.f23215a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        return new HomeQuery.InStoreDetailsCard(storeName, storeTime, bool);
                    }
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                }
            }
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.InStoreDetailsCard value = (HomeQuery.InStoreDetailsCard) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("storeName");
            Adapters.b(Adapters.c(StoreName.f23214a, false)).toJson(writer, customScalarAdapters, value.f22944a);
            writer.F1("storeTime");
            Adapters.b(Adapters.c(StoreTime.f23215a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("isLocationMapped");
            Adapters.l.toJson(writer, customScalarAdapters, value.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$Item;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$Item;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item implements Adapter<HomeQuery.Item> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item f23166a = new Item();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            HomeQuery.OnCarousel onCarouselA;
            HomeQuery.OnRegistrationCard onRegistrationCardA;
            HomeQuery.OnRewardsBalanceCard onRewardsBalanceCardA;
            HomeQuery.OnAddRewardsCard onAddRewardsCardA;
            HomeQuery.OnBroadcastBanner onBroadcastBannerA;
            HomeQuery.OnDividerCard onDividerCardA;
            HomeQuery.OnInsetBanner onInsetBannerA;
            HomeQuery.OnCatalogueCard onCatalogueCardA;
            HomeQuery.OnMarketplaceCard onMarketplaceCardA;
            HomeQuery.OnQuickLinkHorizontalList onQuickLinkHorizontalListA;
            HomeQuery.OnMyShoppingLists onMyShoppingListsA;
            HomeQuery.OnActionableCard onActionableCardA;
            HomeQuery.OnGoogleAdBannerCard onGoogleAdBannerCardA;
            HomeQuery.OnRecipeHorizontalList onRecipeHorizontalListA;
            HomeQuery.OnOrderHorizontalList onOrderHorizontalListA;
            HomeQuery.OnProductHorizontalList onProductHorizontalListA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            HomeQuery.OnBoosterHorizontalList onBoosterHorizontalListA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("Carousel"))) {
                reader.o();
                onCarouselA = OnCarousel.a(reader, customScalarAdapters);
            } else {
                onCarouselA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RegistrationCard"))) {
                reader.o();
                onRegistrationCardA = OnRegistrationCard.a(reader, customScalarAdapters);
            } else {
                onRegistrationCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RewardsBalanceCard"))) {
                reader.o();
                onRewardsBalanceCardA = OnRewardsBalanceCard.a(reader, customScalarAdapters);
            } else {
                onRewardsBalanceCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("AddRewardsCard"))) {
                reader.o();
                onAddRewardsCardA = OnAddRewardsCard.a(reader, customScalarAdapters);
            } else {
                onAddRewardsCardA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("BroadcastBanner"), BooleanExpressions.d("includeBroadcastBanner")))) {
                reader.o();
                onBroadcastBannerA = OnBroadcastBanner.a(reader, customScalarAdapters);
            } else {
                onBroadcastBannerA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("DividerCard"))) {
                reader.o();
                onDividerCardA = OnDividerCard.a(reader, customScalarAdapters);
            } else {
                onDividerCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("InsetBanner"))) {
                reader.o();
                onInsetBannerA = OnInsetBanner.a(reader, customScalarAdapters);
            } else {
                onInsetBannerA = null;
            }
            if (d.C(set2, set, null, str, BooleanExpressions.a(BooleanExpressions.c("CatalogueCard"), BooleanExpressions.d("includeCatalogueCard")))) {
                reader.o();
                onCatalogueCardA = OnCatalogueCard.a(reader, customScalarAdapters);
            } else {
                onCatalogueCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("MarketplaceCard"))) {
                reader.o();
                onMarketplaceCardA = OnMarketplaceCard.a(reader, customScalarAdapters);
            } else {
                onMarketplaceCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("QuickLinkHorizontalList"))) {
                reader.o();
                onQuickLinkHorizontalListA = OnQuickLinkHorizontalList.a(reader, customScalarAdapters);
            } else {
                onQuickLinkHorizontalListA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("MyShoppingLists"))) {
                reader.o();
                onMyShoppingListsA = OnMyShoppingLists.a(reader, customScalarAdapters);
            } else {
                onMyShoppingListsA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ActionableCard"))) {
                reader.o();
                onActionableCardA = OnActionableCard.a(reader, customScalarAdapters);
            } else {
                onActionableCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("GoogleAdBannerCard"))) {
                reader.o();
                onGoogleAdBannerCardA = OnGoogleAdBannerCard.a(reader, customScalarAdapters);
            } else {
                onGoogleAdBannerCardA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("RecipeHorizontalList"))) {
                reader.o();
                onRecipeHorizontalListA = OnRecipeHorizontalList.a(reader, customScalarAdapters);
            } else {
                onRecipeHorizontalListA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("OrderHorizontalList"))) {
                reader.o();
                onOrderHorizontalListA = OnOrderHorizontalList.a(reader, customScalarAdapters);
            } else {
                onOrderHorizontalListA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("ProductHorizontalList"))) {
                reader.o();
                onProductHorizontalListA = OnProductHorizontalList.a(reader, customScalarAdapters);
            } else {
                onProductHorizontalListA = null;
            }
            if (a.C(set2, set, null, str, BooleanExpressions.c("BoosterHorizontalList"))) {
                reader.o();
                onBoosterHorizontalListA = OnBoosterHorizontalList.a(reader, customScalarAdapters);
            }
            return new HomeQuery.Item(str, onCarouselA, onRegistrationCardA, onRewardsBalanceCardA, onAddRewardsCardA, onBroadcastBannerA, onDividerCardA, onInsetBannerA, onCatalogueCardA, onMarketplaceCardA, onQuickLinkHorizontalListA, onMyShoppingListsA, onActionableCardA, onGoogleAdBannerCardA, onRecipeHorizontalListA, onOrderHorizontalListA, onProductHorizontalListA, onBoosterHorizontalListA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.Item value = (HomeQuery.Item) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22945a);
            HomeQuery.OnCarousel onCarousel = value.b;
            if (onCarousel != null) {
                OnCarousel.b(writer, customScalarAdapters, onCarousel);
            }
            HomeQuery.OnRegistrationCard onRegistrationCard = value.c;
            if (onRegistrationCard != null) {
                List list = OnRegistrationCard.f23208a;
                writer.F1("_excluded");
                Adapters.l.toJson(writer, customScalarAdapters, onRegistrationCard.f22987a);
            }
            HomeQuery.OnRewardsBalanceCard onRewardsBalanceCard = value.d;
            if (onRewardsBalanceCard != null) {
                OnRewardsBalanceCard.b(writer, customScalarAdapters, onRewardsBalanceCard);
            }
            HomeQuery.OnAddRewardsCard onAddRewardsCard = value.e;
            if (onAddRewardsCard != null) {
                OnAddRewardsCard.b(writer, customScalarAdapters, onAddRewardsCard);
            }
            HomeQuery.OnBroadcastBanner onBroadcastBanner = value.f;
            if (onBroadcastBanner != null) {
                OnBroadcastBanner.b(writer, customScalarAdapters, onBroadcastBanner);
            }
            HomeQuery.OnDividerCard onDividerCard = value.g;
            if (onDividerCard != null) {
                List list2 = OnDividerCard.f23182a;
                writer.F1("_excluded");
                Adapters.l.toJson(writer, customScalarAdapters, onDividerCard.f22961a);
            }
            HomeQuery.OnInsetBanner onInsetBanner = value.h;
            if (onInsetBanner != null) {
                OnInsetBanner.b(writer, customScalarAdapters, onInsetBanner);
            }
            HomeQuery.OnCatalogueCard onCatalogueCard = value.i;
            if (onCatalogueCard != null) {
                OnCatalogueCard.b(writer, customScalarAdapters, onCatalogueCard);
            }
            HomeQuery.OnMarketplaceCard onMarketplaceCard = value.j;
            if (onMarketplaceCard != null) {
                OnMarketplaceCard.b(writer, customScalarAdapters, onMarketplaceCard);
            }
            HomeQuery.OnQuickLinkHorizontalList onQuickLinkHorizontalList = value.k;
            if (onQuickLinkHorizontalList != null) {
                OnQuickLinkHorizontalList.b(writer, customScalarAdapters, onQuickLinkHorizontalList);
            }
            HomeQuery.OnMyShoppingLists onMyShoppingLists = value.l;
            if (onMyShoppingLists != null) {
                OnMyShoppingLists.b(writer, customScalarAdapters, onMyShoppingLists);
            }
            HomeQuery.OnActionableCard onActionableCard = value.m;
            if (onActionableCard != null) {
                OnActionableCard.b(writer, customScalarAdapters, onActionableCard);
            }
            HomeQuery.OnGoogleAdBannerCard onGoogleAdBannerCard = value.n;
            if (onGoogleAdBannerCard != null) {
                OnGoogleAdBannerCard.b(writer, customScalarAdapters, onGoogleAdBannerCard);
            }
            HomeQuery.OnRecipeHorizontalList onRecipeHorizontalList = value.o;
            if (onRecipeHorizontalList != null) {
                OnRecipeHorizontalList.b(writer, customScalarAdapters, onRecipeHorizontalList);
            }
            HomeQuery.OnOrderHorizontalList onOrderHorizontalList = value.p;
            if (onOrderHorizontalList != null) {
                OnOrderHorizontalList.b(writer, customScalarAdapters, onOrderHorizontalList);
            }
            HomeQuery.OnProductHorizontalList onProductHorizontalList = value.q;
            if (onProductHorizontalList != null) {
                OnProductHorizontalList.b(writer, customScalarAdapters, onProductHorizontalList);
            }
            HomeQuery.OnBoosterHorizontalList onBoosterHorizontalList = value.r;
            if (onBoosterHorizontalList != null) {
                OnBoosterHorizontalList.b(writer, customScalarAdapters, onBoosterHorizontalList);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$Item1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$Item1;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item1 implements Adapter<HomeQuery.Item1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item1 f23167a = new Item1();
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
            HomeQuery.OnQuickLinkCard onQuickLinkCardA = OnQuickLinkCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new HomeQuery.Item1(str, onQuickLinkCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.Item1 value = (HomeQuery.Item1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22946a);
            List list = OnQuickLinkCard.f23201a;
            OnQuickLinkCard.b(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$Item2;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$Item2;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item2 implements Adapter<HomeQuery.Item2> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item2 f23168a = new Item2();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            HomeQuery.OnRecipeSummaryCard onRecipeSummaryCardA;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Set set = customScalarAdapters.b;
            Set set2 = customScalarAdapters.f13510a;
            HomeQuery.OnRecipeMoreCard onRecipeMoreCardA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
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
            }
            return new HomeQuery.Item2(str, onRecipeSummaryCardA, onRecipeMoreCardA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.Item2 value = (HomeQuery.Item2) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22947a);
            HomeQuery.OnRecipeSummaryCard onRecipeSummaryCard = value.b;
            if (onRecipeSummaryCard != null) {
                OnRecipeSummaryCard.b(writer, customScalarAdapters, onRecipeSummaryCard);
            }
            HomeQuery.OnRecipeMoreCard onRecipeMoreCard = value.c;
            if (onRecipeMoreCard != null) {
                OnRecipeMoreCard.b(writer, customScalarAdapters, onRecipeMoreCard);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$Item3;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$Item3;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item3 implements Adapter<HomeQuery.Item3> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item3 f23169a = new Item3();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            HomeQuery.OnOrderCard onOrderCardA = null;
            String str = null;
            while (reader.o2(b) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str == null) {
                throw new IllegalStateException("__typename was not found");
            }
            if (a.C(customScalarAdapters.f13510a, customScalarAdapters.b, null, str, BooleanExpressions.c("OrderCard"))) {
                reader.o();
                onOrderCardA = OnOrderCard.a(reader, customScalarAdapters);
            }
            return new HomeQuery.Item3(str, onOrderCardA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.Item3 value = (HomeQuery.Item3) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22948a);
            HomeQuery.OnOrderCard onOrderCard = value.b;
            if (onOrderCard != null) {
                OnOrderCard.b(writer, customScalarAdapters, onOrderCard);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$Item4;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$Item4;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item4 implements Adapter<HomeQuery.Item4> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item4 f23170a = new Item4();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            HomeQuery.OnProductCard onProductCardA = null;
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
            return new HomeQuery.Item4(str, onProductCardA);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.Item4 value = (HomeQuery.Item4) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22949a);
            HomeQuery.OnProductCard onProductCard = value.b;
            if (onProductCard != null) {
                OnProductCard.b(writer, customScalarAdapters, onProductCard);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$Item5;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$Item5;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Item5 implements Adapter<HomeQuery.Item5> {

        /* renamed from: a, reason: collision with root package name */
        public static final Item5 f23171a = new Item5();
        public static final List b = CollectionsKt.Q("__typename");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            HomeQuery.OnProductCard1 onProductCard1A = null;
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
            return new HomeQuery.Item5(str, onProductCard1A);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.Item5 value = (HomeQuery.Item5) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22950a);
            HomeQuery.OnProductCard1 onProductCard1 = value.b;
            if (onProductCard1 != null) {
                OnProductCard1.b(writer, customScalarAdapters, onProductCard1);
            }
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$LinkCardAction;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$LinkCardAction;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkCardAction implements Adapter<HomeQuery.LinkCardAction> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkCardAction f23172a = new LinkCardAction();
        public static final List b = CollectionsKt.R("type", UrlHandler.ACTION);

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ActionType actionTypeA = null;
            String str = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    actionTypeA = ActionType_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                }
            }
            if (actionTypeA == null) {
                Assertions.a(reader, "type");
                throw null;
            }
            if (str != null) {
                return new HomeQuery.LinkCardAction(actionTypeA, str);
            }
            Assertions.a(reader, UrlHandler.ACTION);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.LinkCardAction value = (HomeQuery.LinkCardAction) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("type");
            ActionType_ResponseAdapter.b(writer, customScalarAdapters, value.f22951a);
            writer.F1(UrlHandler.ACTION);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$LinkCardAnimation;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$LinkCardAnimation;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LinkCardAnimation implements Adapter<HomeQuery.LinkCardAnimation> {

        /* renamed from: a, reason: collision with root package name */
        public static final LinkCardAnimation f23173a = new LinkCardAnimation();
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
                return new HomeQuery.LinkCardAnimation(str, num.intValue());
            }
            Assertions.a(reader, "playCount");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.LinkCardAnimation value = (HomeQuery.LinkCardAnimation) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("source");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22952a);
            writer.F1("playCount");
            Adapters.b.toJson(writer, customScalarAdapters, Integer.valueOf(value.b));
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OffersAlertIndicator;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OffersAlertIndicator;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OffersAlertIndicator implements Adapter<HomeQuery.OffersAlertIndicator> {

        /* renamed from: a, reason: collision with root package name */
        public static final OffersAlertIndicator f23174a = new OffersAlertIndicator();
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
                return new HomeQuery.OffersAlertIndicator(alertIndicatorTypeA, str);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.OffersAlertIndicator value = (HomeQuery.OffersAlertIndicator) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("indicatorType");
            AlertIndicatorType_ResponseAdapter.b(writer, customScalarAdapters, value.f22953a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnActionableCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnActionableCard;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnActionableCard implements Adapter<HomeQuery.OnActionableCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23175a = CollectionsKt.R("image", "altText", "cardHeight", "link", "analytics", "_excluded");

        public static HomeQuery.OnActionableCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            CardHeight cardHeightA = null;
            String str3 = null;
            TealiumAnalytics tealiumAnalytics = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(f23175a);
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
                return new HomeQuery.OnActionableCard(str, str2, cardHeightA, str3, tealiumAnalytics, bool);
            }
            Assertions.a(reader, "link");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnActionableCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("image");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22954a);
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
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnActionableCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnAddRewardsCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnAddRewardsCard;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAddRewardsCard implements Adapter<HomeQuery.OnAddRewardsCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23176a = CollectionsKt.R("addRewardsCardTitle", "addRewardsCardSubtitle");

        public static HomeQuery.OnAddRewardsCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f23176a);
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
                Assertions.a(reader, "addRewardsCardTitle");
                throw null;
            }
            if (str2 != null) {
                return new HomeQuery.OnAddRewardsCard(str, str2);
            }
            Assertions.a(reader, "addRewardsCardSubtitle");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnAddRewardsCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("addRewardsCardTitle");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22955a);
            writer.F1("addRewardsCardSubtitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnAddRewardsCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnAdobeTargetAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnAdobeTargetAnalytics;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnAdobeTargetAnalytics implements Adapter<HomeQuery.OnAdobeTargetAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23177a = CollectionsKt.R("tnta", "pe", "_excluded");

        public static HomeQuery.OnAdobeTargetAnalytics a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(f23177a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        return new HomeQuery.OnAdobeTargetAnalytics(bool, str, str2);
                    }
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnAdobeTargetAnalytics value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("tnta");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f22956a);
            writer.F1("pe");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnAdobeTargetAnalytics) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnBoosterHorizontalList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnBoosterHorizontalList;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBoosterHorizontalList implements Adapter<HomeQuery.OnBoosterHorizontalList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23178a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "deepLink", "actionTitle", "tigerOfferIds", "items");

        public static HomeQuery.OnBoosterHorizontalList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ArrayList arrayListFromJson = null;
            ArrayList arrayListFromJson2 = null;
            while (true) {
                int iO2 = reader.o2(f23178a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    arrayListFromJson2 = Adapters.a(Adapters.c(Item5.f23171a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson == null) {
                Assertions.a(reader, "tigerOfferIds");
                throw null;
            }
            if (arrayListFromJson2 != null) {
                return new HomeQuery.OnBoosterHorizontalList(str, str2, str3, str4, arrayListFromJson, arrayListFromJson2);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnBoosterHorizontalList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22957a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("deepLink");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("actionTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("tigerOfferIds");
            Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.e);
            writer.F1("items");
            Adapters.a(Adapters.c(Item5.f23171a, true)).toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnBoosterHorizontalList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnBroadcastBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnBroadcastBanner;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnBroadcastBanner implements Adapter<HomeQuery.OnBroadcastBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23179a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "deeplink", "type", "imageUrl", "actionLabel", "analyticsLabel", "dismissible", "bannerId");

        public static HomeQuery.OnBroadcastBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
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
                switch (reader.o2(f23179a)) {
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
                            return new HomeQuery.OnBroadcastBanner(str, str2, str3, broadcastBannerTypeA, str4, str5, str6, bool, str7);
                        }
                        Assertions.a(reader, "imageUrl");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnBroadcastBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22958a);
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
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnBroadcastBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnCarousel;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnCarousel;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCarousel implements Adapter<HomeQuery.OnCarousel> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23180a = CollectionsKt.Q("carouselItems");

        public static HomeQuery.OnCarousel a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f23180a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(CarouselItem.f23143a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new HomeQuery.OnCarousel(arrayListFromJson);
            }
            Assertions.a(reader, "carouselItems");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnCarousel value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("carouselItems");
            Adapters.a(Adapters.c(CarouselItem.f23143a, true)).toJson(writer, customScalarAdapters, value.f22959a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnCarousel) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnCatalogueCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnCatalogueCard;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnCatalogueCard implements Adapter<HomeQuery.OnCatalogueCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23181a = CollectionsKt.R("title", "catalogueCardSubtitle", "imageLeft", "imageRight", "imageBackground");

        public static HomeQuery.OnCatalogueCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            while (true) {
                int iO2 = reader.o2(f23181a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str4 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    str5 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (str2 != null) {
                return new HomeQuery.OnCatalogueCard(str, str2, str3, str4, str5);
            }
            Assertions.a(reader, "catalogueCardSubtitle");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnCatalogueCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22960a);
            writer.F1("catalogueCardSubtitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("imageLeft");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("imageRight");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("imageBackground");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnCatalogueCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnDividerCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnDividerCard;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnDividerCard implements Adapter<HomeQuery.OnDividerCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23182a = CollectionsKt.Q("_excluded");

        public static HomeQuery.OnDividerCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            while (reader.o2(f23182a) == 0) {
                bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
            }
            return new HomeQuery.OnDividerCard(bool);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.OnDividerCard value = (HomeQuery.OnDividerCard) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.f22961a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnGoogleAdBannerCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnGoogleAdBannerCard;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnGoogleAdBannerCard implements Adapter<HomeQuery.OnGoogleAdBannerCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23183a = CollectionsKt.R(OutOfContextTestingActivity.AD_UNIT_KEY, "nativeCustomTemplateId", "targeting", "height", "_excluded");

        public static HomeQuery.OnGoogleAdBannerCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            GoogleAdCustomTargeting googleAdCustomTargeting = null;
            AdBannerNativeSize adBannerNativeSizeA = null;
            Boolean bool = null;
            while (true) {
                int iO2 = reader.o2(f23183a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    googleAdCustomTargeting = (GoogleAdCustomTargeting) d.k(customScalarAdapters, au.com.woolworths.shop.graphql.type.GoogleAdCustomTargeting.f11436a, reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    adBannerNativeSizeA = AdBannerNativeSize_ResponseAdapter.a(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, OutOfContextTestingActivity.AD_UNIT_KEY);
                throw null;
            }
            if (str2 == null) {
                Assertions.a(reader, "nativeCustomTemplateId");
                throw null;
            }
            if (adBannerNativeSizeA != null) {
                return new HomeQuery.OnGoogleAdBannerCard(str, str2, googleAdCustomTargeting, adBannerNativeSizeA, bool);
            }
            Assertions.a(reader, "height");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnGoogleAdBannerCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(OutOfContextTestingActivity.AD_UNIT_KEY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22962a);
            writer.F1("nativeCustomTemplateId");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("targeting");
            Adapters.b(customScalarAdapters.e(au.com.woolworths.shop.graphql.type.GoogleAdCustomTargeting.f11436a)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("height");
            AdBannerNativeSize_ResponseAdapter.b(writer, customScalarAdapters, value.d);
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnGoogleAdBannerCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnHeroBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnHeroBanner;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHeroBanner implements Adapter<HomeQuery.OnHeroBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23184a = CollectionsKt.R("heroBannerId", "heroBannerAction", "heroBannerAnalytics", "heroBannerImpressionAnalytics", "heroBannerBackgroundColour", "heroBannerTextColour", "heroBannerBody", "heroBannerBrandsLogo", "heroBannerGraphics", "heroBannerImages", "heroBannerTermsAndConditions", "heroBannerTitle", "heroBannerTitleSize");

        public static HomeQuery.OnHeroBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            HomeQuery.HeroBannerAction heroBannerAction = null;
            HomeQuery.HeroBannerAnalytics heroBannerAnalytics = null;
            HomeQuery.HeroBannerImpressionAnalytics heroBannerImpressionAnalytics = null;
            String str2 = null;
            String str3 = null;
            HomeQuery.HeroBannerBody heroBannerBody = null;
            HomeQuery.HeroBannerBrandsLogo heroBannerBrandsLogo = null;
            List list = null;
            ArrayList arrayListFromJson = null;
            HomeQuery.HeroBannerTermsAndConditions heroBannerTermsAndConditions = null;
            String str4 = null;
            HeroBannerTitleSize heroBannerTitleSizeA = null;
            while (true) {
                switch (reader.o2(f23184a)) {
                    case 0:
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        heroBannerAction = (HomeQuery.HeroBannerAction) Adapters.c(HeroBannerAction.f23155a, false).fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        heroBannerAnalytics = (HomeQuery.HeroBannerAnalytics) Adapters.c(HeroBannerAnalytics.f23156a, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 3:
                        heroBannerImpressionAnalytics = (HomeQuery.HeroBannerImpressionAnalytics) Adapters.c(HeroBannerImpressionAnalytics.f23161a, true).fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        heroBannerBody = (HomeQuery.HeroBannerBody) Adapters.b(Adapters.c(HeroBannerBody.f23157a, true)).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        heroBannerBrandsLogo = (HomeQuery.HeroBannerBrandsLogo) Adapters.b(Adapters.c(HeroBannerBrandsLogo.f23158a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        list = (List) Adapters.b(Adapters.a(Adapters.c(HeroBannerGraphic.f23159a, false))).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        arrayListFromJson = Adapters.a(Adapters.c(HeroBannerImage.f23160a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        heroBannerTermsAndConditions = (HomeQuery.HeroBannerTermsAndConditions) Adapters.b(Adapters.c(HeroBannerTermsAndConditions.f23163a, false)).fromJson(reader, customScalarAdapters);
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
                            return new HomeQuery.OnHeroBanner(str, heroBannerAction, heroBannerAnalytics, heroBannerImpressionAnalytics, str2, str3, heroBannerBody, heroBannerBrandsLogo, list, arrayListFromJson, heroBannerTermsAndConditions, str4, heroBannerTitleSizeA);
                        }
                        Assertions.a(reader, "heroBannerTitleSize");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnHeroBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("heroBannerId");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22963a);
            writer.F1("heroBannerAction");
            Adapters.c(HeroBannerAction.f23155a, false).toJson(writer, customScalarAdapters, value.b);
            writer.F1("heroBannerAnalytics");
            Adapters.c(HeroBannerAnalytics.f23156a, true).toJson(writer, customScalarAdapters, value.c);
            writer.F1("heroBannerImpressionAnalytics");
            Adapters.c(HeroBannerImpressionAnalytics.f23161a, true).toJson(writer, customScalarAdapters, value.d);
            writer.F1("heroBannerBackgroundColour");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("heroBannerTextColour");
            Adapters.i.toJson(writer, customScalarAdapters, value.f);
            writer.F1("heroBannerBody");
            Adapters.b(Adapters.c(HeroBannerBody.f23157a, true)).toJson(writer, customScalarAdapters, value.g);
            writer.F1("heroBannerBrandsLogo");
            Adapters.b(Adapters.c(HeroBannerBrandsLogo.f23158a, false)).toJson(writer, customScalarAdapters, value.h);
            writer.F1("heroBannerGraphics");
            Adapters.b(Adapters.a(Adapters.c(HeroBannerGraphic.f23159a, false))).toJson(writer, customScalarAdapters, value.i);
            writer.F1("heroBannerImages");
            Adapters.a(Adapters.c(HeroBannerImage.f23160a, false)).toJson(writer, customScalarAdapters, value.j);
            writer.F1("heroBannerTermsAndConditions");
            Adapters.b(Adapters.c(HeroBannerTermsAndConditions.f23163a, false)).toJson(writer, customScalarAdapters, value.k);
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
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnHeroBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnHeroBannerBodyText;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnHeroBannerBodyText;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHeroBannerBodyText implements Adapter<HomeQuery.OnHeroBannerBodyText> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23185a = CollectionsKt.Q(TextBundle.TEXT_ENTRY);

        public static HomeQuery.OnHeroBannerBodyText a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23185a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new HomeQuery.OnHeroBannerBodyText(str);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnHeroBannerBodyText value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22964a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnHeroBannerBodyText) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnHeroBannerPromoBody;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnHeroBannerPromoBody;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHeroBannerPromoBody implements Adapter<HomeQuery.OnHeroBannerPromoBody> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23186a = CollectionsKt.R("code", TextBundle.TEXT_ENTRY);

        public static HomeQuery.OnHeroBannerPromoBody a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f23186a);
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
                return new HomeQuery.OnHeroBannerPromoBody(str, str2);
            }
            Assertions.a(reader, TextBundle.TEXT_ENTRY);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnHeroBannerPromoBody value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("code");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22965a);
            writer.F1(TextBundle.TEXT_ENTRY);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnHeroBannerPromoBody) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnHomeDeliveryNowBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnHomeDeliveryNowBanner;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHomeDeliveryNowBanner implements Adapter<HomeQuery.OnHomeDeliveryNowBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23187a = CollectionsKt.Q("_excluded");

        public static HomeQuery.OnHomeDeliveryNowBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            while (reader.o2(f23187a) == 0) {
                bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
            }
            return new HomeQuery.OnHomeDeliveryNowBanner(bool);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.OnHomeDeliveryNowBanner value = (HomeQuery.OnHomeDeliveryNowBanner) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.f22966a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnHomeDeliveryNowBottomBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnHomeDeliveryNowBottomBanner;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHomeDeliveryNowBottomBanner implements Adapter<HomeQuery.OnHomeDeliveryNowBottomBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23188a = CollectionsKt.R("__typename", "bottomSheetTitle", "bottomSheetBody", "showOnceOnly", "bannerAsset", "primaryCta", "secondaryCta");

        public static HomeQuery.OnHomeDeliveryNowBottomBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            Boolean bool = null;
            HomeQuery.BannerAsset bannerAsset = null;
            HomeQuery.PrimaryCta primaryCta = null;
            HomeQuery.SecondaryCta secondaryCta = null;
            while (true) {
                switch (reader.o2(f23188a)) {
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
                        bannerAsset = (HomeQuery.BannerAsset) Adapters.b(Adapters.c(BannerAsset.f23141a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        primaryCta = (HomeQuery.PrimaryCta) Adapters.b(Adapters.c(PrimaryCta.f23212a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        secondaryCta = (HomeQuery.SecondaryCta) Adapters.b(Adapters.c(SecondaryCta.f23213a, false)).fromJson(reader, customScalarAdapters);
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
                            return new HomeQuery.OnHomeDeliveryNowBottomBanner(str, str2, str3, bool, bannerAsset, primaryCta, secondaryCta);
                        }
                        Assertions.a(reader, "bottomSheetBody");
                        throw null;
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnHomeDeliveryNowBottomBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22967a);
            writer.F1("bottomSheetTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("bottomSheetBody");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.c);
            writer.F1("showOnceOnly");
            Adapters.l.toJson(writer, customScalarAdapters, value.d);
            writer.F1("bannerAsset");
            Adapters.b(Adapters.c(BannerAsset.f23141a, false)).toJson(writer, customScalarAdapters, value.e);
            writer.F1("primaryCta");
            Adapters.b(Adapters.c(PrimaryCta.f23212a, false)).toJson(writer, customScalarAdapters, value.f);
            writer.F1("secondaryCta");
            Adapters.b(Adapters.c(SecondaryCta.f23213a, false)).toJson(writer, customScalarAdapters, value.g);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnHomeDeliveryNowBottomBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnHomeFulfilmentWindowBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnHomeFulfilmentWindowBanner;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHomeFulfilmentWindowBanner implements Adapter<HomeQuery.OnHomeFulfilmentWindowBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23189a = CollectionsKt.R("fulfilmentWindowStateTitle", "fulfilmentWindowStateSubtitle", "fulfilmentWindowStateButton");

        public static HomeQuery.OnHomeFulfilmentWindowBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            HomeQuery.FulfilmentWindowStateSubtitle fulfilmentWindowStateSubtitle = null;
            HomeQuery.FulfilmentWindowStateButton fulfilmentWindowStateButton = null;
            while (true) {
                int iO2 = reader.o2(f23189a);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    fulfilmentWindowStateSubtitle = (HomeQuery.FulfilmentWindowStateSubtitle) Adapters.b(Adapters.c(FulfilmentWindowStateSubtitle.f23152a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 2) {
                        break;
                    }
                    fulfilmentWindowStateButton = (HomeQuery.FulfilmentWindowStateButton) Adapters.c(FulfilmentWindowStateButton.f23151a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "fulfilmentWindowStateTitle");
                throw null;
            }
            if (fulfilmentWindowStateButton != null) {
                return new HomeQuery.OnHomeFulfilmentWindowBanner(str, fulfilmentWindowStateSubtitle, fulfilmentWindowStateButton);
            }
            Assertions.a(reader, "fulfilmentWindowStateButton");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnHomeFulfilmentWindowBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("fulfilmentWindowStateTitle");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22968a);
            writer.F1("fulfilmentWindowStateSubtitle");
            Adapters.b(Adapters.c(FulfilmentWindowStateSubtitle.f23152a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("fulfilmentWindowStateButton");
            Adapters.c(FulfilmentWindowStateButton.f23151a, false).toJson(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnHomeFulfilmentWindowBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnHomeFulfilmentWindowContainer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnHomeFulfilmentWindowContainer;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHomeFulfilmentWindowContainer implements Adapter<HomeQuery.OnHomeFulfilmentWindowContainer> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23190a = CollectionsKt.R("button", "deliveryNowBanner", "orientation");

        public static HomeQuery.OnHomeFulfilmentWindowContainer a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            HomeQuery.Button button = null;
            HomeQuery.DeliveryNowBanner deliveryNowBanner = null;
            HomeFulfilmentWindowContainerOrientation homeFulfilmentWindowContainerOrientationA = null;
            while (true) {
                int iO2 = reader.o2(f23190a);
                if (iO2 == 0) {
                    button = (HomeQuery.Button) Adapters.c(Button.f23142a, false).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    deliveryNowBanner = (HomeQuery.DeliveryNowBanner) Adapters.b(Adapters.c(DeliveryNowBanner.f23146a, false)).fromJson(reader, customScalarAdapters);
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
                return new HomeQuery.OnHomeFulfilmentWindowContainer(button, deliveryNowBanner, homeFulfilmentWindowContainerOrientationA);
            }
            Assertions.a(reader, "orientation");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnHomeFulfilmentWindowContainer value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("button");
            Adapters.c(Button.f23142a, false).toJson(writer, customScalarAdapters, value.f22969a);
            writer.F1("deliveryNowBanner");
            Adapters.b(Adapters.c(DeliveryNowBanner.f23146a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("orientation");
            HomeFulfilmentWindowContainerOrientation_ResponseAdapter.b(writer, customScalarAdapters, value.c);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnHomeFulfilmentWindowContainer) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnHomeModeSelectorContainer;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnHomeModeSelectorContainer;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnHomeModeSelectorContainer implements Adapter<HomeQuery.OnHomeModeSelectorContainer> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23191a = CollectionsKt.R("fulfilmentWindowTile", "onlineShoppingModeVariantTile", "divider", "deliveryNowBanner", "inStoreDetailsCard");

        public static HomeQuery.OnHomeModeSelectorContainer a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            HomeQuery.FulfilmentWindowTile fulfilmentWindowTile = null;
            HomeQuery.OnlineShoppingModeVariantTile onlineShoppingModeVariantTile = null;
            HomeQuery.Divider divider = null;
            HomeQuery.DeliveryNowBanner1 deliveryNowBanner1 = null;
            HomeQuery.InStoreDetailsCard inStoreDetailsCard = null;
            while (true) {
                int iO2 = reader.o2(f23191a);
                if (iO2 == 0) {
                    fulfilmentWindowTile = (HomeQuery.FulfilmentWindowTile) Adapters.b(Adapters.c(FulfilmentWindowTile.f23153a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    onlineShoppingModeVariantTile = (HomeQuery.OnlineShoppingModeVariantTile) Adapters.b(Adapters.c(OnlineShoppingModeVariantTile.f23210a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    divider = (HomeQuery.Divider) Adapters.b(Adapters.c(Divider.f23148a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    deliveryNowBanner1 = (HomeQuery.DeliveryNowBanner1) Adapters.b(Adapters.c(DeliveryNowBanner1.f23147a, true)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        return new HomeQuery.OnHomeModeSelectorContainer(fulfilmentWindowTile, onlineShoppingModeVariantTile, divider, deliveryNowBanner1, inStoreDetailsCard);
                    }
                    inStoreDetailsCard = (HomeQuery.InStoreDetailsCard) Adapters.b(Adapters.c(InStoreDetailsCard.f23165a, false)).fromJson(reader, customScalarAdapters);
                }
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnHomeModeSelectorContainer value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("fulfilmentWindowTile");
            Adapters.b(Adapters.c(FulfilmentWindowTile.f23153a, false)).toJson(writer, customScalarAdapters, value.f22970a);
            writer.F1("onlineShoppingModeVariantTile");
            Adapters.b(Adapters.c(OnlineShoppingModeVariantTile.f23210a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1("divider");
            Adapters.b(Adapters.c(Divider.f23148a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("deliveryNowBanner");
            Adapters.b(Adapters.c(DeliveryNowBanner1.f23147a, true)).toJson(writer, customScalarAdapters, value.d);
            writer.F1("inStoreDetailsCard");
            Adapters.b(Adapters.c(InStoreDetailsCard.f23165a, false)).toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnHomeModeSelectorContainer) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnInsetBanner;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnInsetBanner;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnInsetBanner implements Adapter<HomeQuery.OnInsetBanner> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23192a = CollectionsKt.R("_excluded", "displayType", "message", "bannerTitle", "iconUrl", UrlHandler.ACTION);

        public static HomeQuery.OnInsetBanner a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            InsetBannerDisplayType insetBannerDisplayTypeA = null;
            String str = null;
            String str2 = null;
            String str3 = null;
            HomeQuery.Action action = null;
            while (true) {
                int iO2 = reader.o2(f23192a);
                if (iO2 == 0) {
                    bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    insetBannerDisplayTypeA = InsetBannerDisplayType_ResponseAdapter.a(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 4) {
                    str3 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 5) {
                        break;
                    }
                    action = (HomeQuery.Action) Adapters.b(Adapters.c(Action.f23134a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (insetBannerDisplayTypeA == null) {
                Assertions.a(reader, "displayType");
                throw null;
            }
            if (str != null) {
                return new HomeQuery.OnInsetBanner(bool, insetBannerDisplayTypeA, str, str2, str3, action);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnInsetBanner value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.f22971a);
            writer.F1("displayType");
            InsetBannerDisplayType_ResponseAdapter.b(writer, customScalarAdapters, value.b);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1("bannerTitle");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("iconUrl");
            nullableAdapter.toJson(writer, customScalarAdapters, value.e);
            writer.F1(UrlHandler.ACTION);
            Adapters.b(Adapters.c(Action.f23134a, false)).toJson(writer, customScalarAdapters, value.f);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnInsetBanner) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnMarketplaceCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnMarketplaceCard;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMarketplaceCard implements Adapter<HomeQuery.OnMarketplaceCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23193a = CollectionsKt.R("marketplaceCardBannerImage", "marketplaceCardBannerAltText");

        public static HomeQuery.OnMarketplaceCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            while (true) {
                int iO2 = reader.o2(f23193a);
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
                Assertions.a(reader, "marketplaceCardBannerImage");
                throw null;
            }
            if (str2 != null) {
                return new HomeQuery.OnMarketplaceCard(str, str2);
            }
            Assertions.a(reader, "marketplaceCardBannerAltText");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnMarketplaceCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("marketplaceCardBannerImage");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22972a);
            writer.F1("marketplaceCardBannerAltText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnMarketplaceCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnMyShoppingLists;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnMyShoppingLists;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnMyShoppingLists implements Adapter<HomeQuery.OnMyShoppingLists> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23194a = CollectionsKt.R("myListTitle", "myListSubtitle", "myListActionTitle", "myListDeepLink");

        public static HomeQuery.OnMyShoppingLists a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            while (true) {
                int iO2 = reader.o2(f23194a);
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
                return new HomeQuery.OnMyShoppingLists(str, str2, str3, str4);
            }
            Assertions.a(reader, "myListTitle");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnMyShoppingLists value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("myListTitle");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22973a);
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
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnMyShoppingLists) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnOrderAnalytics;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnOrderAnalytics;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOrderAnalytics implements Adapter<HomeQuery.OnOrderAnalytics> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23195a = CollectionsKt.R("marketplaceOrderCount", "woolworthsOrderCount");

        public static HomeQuery.OnOrderAnalytics a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num = null;
            Integer num2 = null;
            while (true) {
                int iO2 = reader.o2(f23195a);
                if (iO2 == 0) {
                    num = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 1) {
                        break;
                    }
                    num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                }
            }
            if (num == null) {
                Assertions.a(reader, "marketplaceOrderCount");
                throw null;
            }
            int iIntValue = num.intValue();
            if (num2 != null) {
                return new HomeQuery.OnOrderAnalytics(iIntValue, num2.intValue());
            }
            Assertions.a(reader, "woolworthsOrderCount");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnOrderAnalytics value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("marketplaceOrderCount");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.f22974a, adapters$IntAdapter$1, writer, customScalarAdapters, "woolworthsOrderCount");
            adapters$IntAdapter$1.toJson(writer, customScalarAdapters, Integer.valueOf(value.b));
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnOrderAnalytics) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnOrderCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnOrderCard;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOrderCard implements Adapter<HomeQuery.OnOrderCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23196a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "status", "orderCardId", "total", "timeLabel", "timeValue", "date", "fulfilmentStatusBanner");

        public static HomeQuery.OnOrderCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            String str2 = null;
            OrderStatus orderStatusA = null;
            String str3 = null;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            HomeQuery.FulfilmentStatusBanner fulfilmentStatusBanner = null;
            while (true) {
                switch (reader.o2(f23196a)) {
                    case 0:
                        num = num2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        num = num2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        orderStatusA = OrderStatus_ResponseAdapter.a(reader, customScalarAdapters);
                        continue;
                    case 3:
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 4:
                        num = num2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
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
                        str6 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        num = num2;
                        fulfilmentStatusBanner = (HomeQuery.FulfilmentStatusBanner) Adapters.b(Adapters.c(FulfilmentStatusBanner.f23150a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Integer num3 = num2;
                        if (str == null) {
                            Assertions.a(reader, "title");
                            throw null;
                        }
                        if (str2 == null) {
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
                        if (str3 == null) {
                            Assertions.a(reader, "total");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "timeLabel");
                            throw null;
                        }
                        if (str5 == null) {
                            Assertions.a(reader, "timeValue");
                            throw null;
                        }
                        if (str6 != null) {
                            return new HomeQuery.OnOrderCard(str, str2, orderStatusA, iIntValue, str3, str4, str5, str6, fulfilmentStatusBanner);
                        }
                        Assertions.a(reader, "date");
                        throw null;
                }
                num2 = num;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnOrderCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22975a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("status");
            OrderStatus_ResponseAdapter.b(writer, customScalarAdapters, value.c);
            writer.F1("orderCardId");
            d.y(value.d, Adapters.b, writer, customScalarAdapters, "total");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("timeLabel");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("timeValue");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.g);
            writer.F1("date");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.h);
            writer.F1("fulfilmentStatusBanner");
            Adapters.b(Adapters.c(FulfilmentStatusBanner.f23150a, false)).toJson(writer, customScalarAdapters, value.i);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnOrderCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnOrderHorizontalList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnOrderHorizontalList;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnOrderHorizontalList implements Adapter<HomeQuery.OnOrderHorizontalList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23197a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "deepLink", "actionTitle", "items");

        public static HomeQuery.OnOrderHorizontalList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f23197a);
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
                    arrayListFromJson = Adapters.a(Adapters.c(Item3.f23169a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new HomeQuery.OnOrderHorizontalList(str, str2, str3, str4, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnOrderHorizontalList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22976a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("deepLink");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("actionTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("items");
            Adapters.a(Adapters.c(Item3.f23169a, true)).toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnOrderHorizontalList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnProductCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnProductCard;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard implements Adapter<HomeQuery.OnProductCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23198a = CollectionsKt.Q("__typename");

        public static HomeQuery.OnProductCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23198a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new HomeQuery.OnProductCard(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnProductCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22977a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnProductCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnProductCard1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnProductCard1;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductCard1 implements Adapter<HomeQuery.OnProductCard1> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23199a = CollectionsKt.Q("__typename");

        public static HomeQuery.OnProductCard1 a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23199a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            ProductCard productCardA = ProductCardImpl_ResponseAdapter.ProductCard.a(reader, customScalarAdapters);
            if (str != null) {
                return new HomeQuery.OnProductCard1(str, productCardA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnProductCard1 value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22978a);
            List list = ProductCardImpl_ResponseAdapter.ProductCard.f8994a;
            ProductCardImpl_ResponseAdapter.ProductCard.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnProductCard1) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnProductHorizontalList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnProductHorizontalList;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnProductHorizontalList implements Adapter<HomeQuery.OnProductHorizontalList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23200a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "deepLink", "actionTitle", "items");

        public static HomeQuery.OnProductHorizontalList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f23200a);
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
                    arrayListFromJson = Adapters.a(Adapters.c(Item4.f23170a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new HomeQuery.OnProductHorizontalList(str, str2, str3, str4, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnProductHorizontalList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22979a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("deepLink");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("actionTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("items");
            Adapters.a(Adapters.c(Item4.f23170a, true)).toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnProductHorizontalList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnQuickLinkCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnQuickLinkCard;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnQuickLinkCard implements Adapter<HomeQuery.OnQuickLinkCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23201a = CollectionsKt.R("linkCardImage", "linkCardSubtitle", "linkCardTitle", "linkCardAction", "linkCardAnimation");

        public static HomeQuery.OnQuickLinkCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            HomeQuery.LinkCardAction linkCardAction = null;
            HomeQuery.LinkCardAnimation linkCardAnimation = null;
            while (true) {
                int iO2 = reader.o2(f23201a);
                if (iO2 == 0) {
                    str = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    str2 = (String) Adapters.i.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 3) {
                    linkCardAction = (HomeQuery.LinkCardAction) Adapters.c(LinkCardAction.f23172a, false).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 4) {
                        break;
                    }
                    linkCardAnimation = (HomeQuery.LinkCardAnimation) Adapters.b(Adapters.c(LinkCardAnimation.f23173a, false)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str3 == null) {
                Assertions.a(reader, "linkCardTitle");
                throw null;
            }
            if (linkCardAction != null) {
                return new HomeQuery.OnQuickLinkCard(str, str2, str3, linkCardAction, linkCardAnimation);
            }
            Assertions.a(reader, "linkCardAction");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnQuickLinkCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("linkCardImage");
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.f22980a);
            writer.F1("linkCardSubtitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("linkCardTitle");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.c);
            writer.F1("linkCardAction");
            Adapters.c(LinkCardAction.f23172a, false).toJson(writer, customScalarAdapters, value.d);
            writer.F1("linkCardAnimation");
            Adapters.b(Adapters.c(LinkCardAnimation.f23173a, false)).toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnQuickLinkCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnQuickLinkHorizontalList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnQuickLinkHorizontalList;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnQuickLinkHorizontalList implements Adapter<HomeQuery.OnQuickLinkHorizontalList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23202a = CollectionsKt.Q("items");

        public static HomeQuery.OnQuickLinkHorizontalList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f23202a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(Item1.f23167a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new HomeQuery.OnQuickLinkHorizontalList(arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnQuickLinkHorizontalList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("items");
            Adapters.a(Adapters.c(Item1.f23167a, true)).toJson(writer, customScalarAdapters, value.f22981a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnQuickLinkHorizontalList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnRecipeHorizontalList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnRecipeHorizontalList;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRecipeHorizontalList implements Adapter<HomeQuery.OnRecipeHorizontalList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23203a = CollectionsKt.R("title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "deepLink", "actionTitle", "items");

        public static HomeQuery.OnRecipeHorizontalList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            String str2 = null;
            String str3 = null;
            String str4 = null;
            ArrayList arrayListFromJson = null;
            while (true) {
                int iO2 = reader.o2(f23203a);
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
                    arrayListFromJson = Adapters.a(Adapters.c(Item2.f23168a, true)).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "title");
                throw null;
            }
            if (arrayListFromJson != null) {
                return new HomeQuery.OnRecipeHorizontalList(str, str2, str3, str4, arrayListFromJson);
            }
            Assertions.a(reader, "items");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnRecipeHorizontalList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("title");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22982a);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            NullableAdapter nullableAdapter = Adapters.i;
            nullableAdapter.toJson(writer, customScalarAdapters, value.b);
            writer.F1("deepLink");
            nullableAdapter.toJson(writer, customScalarAdapters, value.c);
            writer.F1("actionTitle");
            nullableAdapter.toJson(writer, customScalarAdapters, value.d);
            writer.F1("items");
            Adapters.a(Adapters.c(Item2.f23168a, true)).toJson(writer, customScalarAdapters, value.e);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnRecipeHorizontalList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnRecipeMoreCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnRecipeMoreCard;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRecipeMoreCard implements Adapter<HomeQuery.OnRecipeMoreCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23204a = CollectionsKt.Q("actionMetadata");

        public static HomeQuery.OnRecipeMoreCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f23204a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.c(ActionMetadatum.f23135a, true)).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new HomeQuery.OnRecipeMoreCard(arrayListFromJson);
            }
            Assertions.a(reader, "actionMetadata");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnRecipeMoreCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("actionMetadata");
            Adapters.a(Adapters.c(ActionMetadatum.f23135a, true)).toJson(writer, customScalarAdapters, value.f22983a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnRecipeMoreCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnRecipeSource;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnRecipeSource;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRecipeSource implements Adapter<HomeQuery.OnRecipeSource> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23205a = CollectionsKt.Q("source");

        public static HomeQuery.OnRecipeSource a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23205a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            if (str != null) {
                return new HomeQuery.OnRecipeSource(str);
            }
            Assertions.a(reader, "source");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnRecipeSource value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("source");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22984a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnRecipeSource) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnRecipeSummaryCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnRecipeSummaryCard;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRecipeSummaryCard implements Adapter<HomeQuery.OnRecipeSummaryCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23206a = CollectionsKt.Q("__typename");

        public static HomeQuery.OnRecipeSummaryCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            while (reader.o2(f23206a) == 0) {
                str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
            }
            reader.o();
            RecipeSummaryCardFragment recipeSummaryCardFragmentA = RecipeSummaryCardFragmentImpl_ResponseAdapter.RecipeSummaryCardFragment.a(reader, customScalarAdapters);
            if (str != null) {
                return new HomeQuery.OnRecipeSummaryCard(str, recipeSummaryCardFragmentA);
            }
            Assertions.a(reader, "__typename");
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnRecipeSummaryCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("__typename");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22985a);
            List list = RecipeSummaryCardFragmentImpl_ResponseAdapter.RecipeSummaryCardFragment.f10207a;
            RecipeSummaryCardFragmentImpl_ResponseAdapter.RecipeSummaryCardFragment.b(writer, customScalarAdapters, value.b);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnRecipeSummaryCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnRecipeTagList;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnRecipeTagList;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRecipeTagList implements Adapter<HomeQuery.OnRecipeTagList> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23207a = CollectionsKt.Q(k.a.g);

        public static HomeQuery.OnRecipeTagList a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            ArrayList arrayListFromJson = null;
            while (reader.o2(f23207a) == 0) {
                arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
            }
            if (arrayListFromJson != null) {
                return new HomeQuery.OnRecipeTagList(arrayListFromJson);
            }
            Assertions.a(reader, k.a.g);
            throw null;
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnRecipeTagList value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(k.a.g);
            Adapters.a(Adapters.f13493a).toJson(writer, customScalarAdapters, value.f22986a);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnRecipeTagList) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnRegistrationCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnRegistrationCard;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRegistrationCard implements Adapter<HomeQuery.OnRegistrationCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23208a = CollectionsKt.Q("_excluded");

        public static HomeQuery.OnRegistrationCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Boolean bool = null;
            while (reader.o2(f23208a) == 0) {
                bool = (Boolean) Adapters.l.fromJson(reader, customScalarAdapters);
            }
            return new HomeQuery.OnRegistrationCard(bool);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.OnRegistrationCard value = (HomeQuery.OnRegistrationCard) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("_excluded");
            Adapters.l.toJson(writer, customScalarAdapters, value.f22987a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnRewardsBalanceCard;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnRewardsBalanceCard;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnRewardsBalanceCard implements Adapter<HomeQuery.OnRewardsBalanceCard> {

        /* renamed from: a, reason: collision with root package name */
        public static final List f23209a = CollectionsKt.R("edrNumber", "offersTitle", "currentBalance", "goalBalance", "actionUrl", "pointsDescriptionFormat", "pointsDescriptionReplacements", "altText", "offersAlertIndicator", "pointsAlertIndicator", "rewardsState");

        public static HomeQuery.OnRewardsBalanceCard a(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Integer num;
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Integer num2 = null;
            String str = null;
            String str2 = null;
            Integer num3 = null;
            String str3 = null;
            String str4 = null;
            ArrayList arrayListFromJson = null;
            String str5 = null;
            HomeQuery.OffersAlertIndicator offersAlertIndicator = null;
            HomeQuery.PointsAlertIndicator pointsAlertIndicator = null;
            String str6 = null;
            while (true) {
                switch (reader.o2(f23209a)) {
                    case 0:
                        num = num2;
                        str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 1:
                        num = num2;
                        str2 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 2:
                        num2 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        continue;
                    case 3:
                        num = num2;
                        num3 = (Integer) Adapters.b.fromJson(reader, customScalarAdapters);
                        break;
                    case 4:
                        num = num2;
                        str3 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 5:
                        num = num2;
                        str4 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 6:
                        num = num2;
                        arrayListFromJson = Adapters.a(Adapters.f13493a).fromJson(reader, customScalarAdapters);
                        break;
                    case 7:
                        num = num2;
                        str5 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    case 8:
                        num = num2;
                        offersAlertIndicator = (HomeQuery.OffersAlertIndicator) Adapters.b(Adapters.c(OffersAlertIndicator.f23174a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 9:
                        num = num2;
                        pointsAlertIndicator = (HomeQuery.PointsAlertIndicator) Adapters.b(Adapters.c(PointsAlertIndicator.f23211a, false)).fromJson(reader, customScalarAdapters);
                        break;
                    case 10:
                        num = num2;
                        str6 = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                        break;
                    default:
                        Integer num4 = num2;
                        if (str == null) {
                            Assertions.a(reader, "edrNumber");
                            throw null;
                        }
                        if (str2 == null) {
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
                        if (str3 == null) {
                            Assertions.a(reader, "actionUrl");
                            throw null;
                        }
                        if (str4 == null) {
                            Assertions.a(reader, "pointsDescriptionFormat");
                            throw null;
                        }
                        if (arrayListFromJson == null) {
                            Assertions.a(reader, "pointsDescriptionReplacements");
                            throw null;
                        }
                        if (str5 == null) {
                            Assertions.a(reader, "altText");
                            throw null;
                        }
                        if (str6 != null) {
                            return new HomeQuery.OnRewardsBalanceCard(str, str2, iIntValue, iIntValue2, str3, str4, arrayListFromJson, str5, offersAlertIndicator, pointsAlertIndicator, str6);
                        }
                        Assertions.a(reader, "rewardsState");
                        throw null;
                }
                num2 = num;
            }
        }

        public static void b(JsonWriter writer, CustomScalarAdapters customScalarAdapters, HomeQuery.OnRewardsBalanceCard value) {
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("edrNumber");
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22988a);
            writer.F1("offersTitle");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
            writer.F1("currentBalance");
            Adapters$IntAdapter$1 adapters$IntAdapter$1 = Adapters.b;
            d.y(value.c, adapters$IntAdapter$1, writer, customScalarAdapters, "goalBalance");
            d.y(value.d, adapters$IntAdapter$1, writer, customScalarAdapters, "actionUrl");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.e);
            writer.F1("pointsDescriptionFormat");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f);
            writer.F1("pointsDescriptionReplacements");
            Adapters.a(adapters$StringAdapter$1).toJson(writer, customScalarAdapters, value.g);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.h);
            writer.F1("offersAlertIndicator");
            Adapters.b(Adapters.c(OffersAlertIndicator.f23174a, false)).toJson(writer, customScalarAdapters, value.i);
            writer.F1("pointsAlertIndicator");
            Adapters.b(Adapters.c(PointsAlertIndicator.f23211a, false)).toJson(writer, customScalarAdapters, value.j);
            writer.F1("rewardsState");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.k);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ Object fromJson(JsonReader jsonReader, CustomScalarAdapters customScalarAdapters) {
            return a(jsonReader, customScalarAdapters);
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final /* bridge */ /* synthetic */ void toJson(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, Object obj) {
            b(jsonWriter, customScalarAdapters, (HomeQuery.OnRewardsBalanceCard) obj);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$OnlineShoppingModeVariantTile;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$OnlineShoppingModeVariantTile;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class OnlineShoppingModeVariantTile implements Adapter<HomeQuery.OnlineShoppingModeVariantTile> {

        /* renamed from: a, reason: collision with root package name */
        public static final OnlineShoppingModeVariantTile f23210a = new OnlineShoppingModeVariantTile();
        public static final List b = CollectionsKt.R("url", "title", NotificationMessage.NOTIF_KEY_SUB_TITLE, "analytics");

        @Override // com.apollographql.apollo.api.Adapter
        public final Object fromJson(JsonReader reader, CustomScalarAdapters customScalarAdapters) {
            Intrinsics.h(reader, "reader");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            String str = null;
            HomeQuery.Title1 title1 = null;
            HomeQuery.Subtitle1 subtitle1 = null;
            HomeQuery.Analytics1 analytics1 = null;
            while (true) {
                int iO2 = reader.o2(b);
                if (iO2 == 0) {
                    str = (String) Adapters.f13493a.fromJson(reader, customScalarAdapters);
                } else if (iO2 == 1) {
                    title1 = (HomeQuery.Title1) Adapters.b(Adapters.c(Title1.f23219a, false)).fromJson(reader, customScalarAdapters);
                } else if (iO2 == 2) {
                    subtitle1 = (HomeQuery.Subtitle1) Adapters.b(Adapters.c(Subtitle1.f23217a, false)).fromJson(reader, customScalarAdapters);
                } else {
                    if (iO2 != 3) {
                        break;
                    }
                    analytics1 = (HomeQuery.Analytics1) Adapters.c(Analytics1.f23138a, false).fromJson(reader, customScalarAdapters);
                }
            }
            if (str == null) {
                Assertions.a(reader, "url");
                throw null;
            }
            if (analytics1 != null) {
                return new HomeQuery.OnlineShoppingModeVariantTile(str, title1, subtitle1, analytics1);
            }
            Assertions.a(reader, "analytics");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.OnlineShoppingModeVariantTile value = (HomeQuery.OnlineShoppingModeVariantTile) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("url");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22989a);
            writer.F1("title");
            Adapters.b(Adapters.c(Title1.f23219a, false)).toJson(writer, customScalarAdapters, value.b);
            writer.F1(NotificationMessage.NOTIF_KEY_SUB_TITLE);
            Adapters.b(Adapters.c(Subtitle1.f23217a, false)).toJson(writer, customScalarAdapters, value.c);
            writer.F1("analytics");
            Adapters.c(Analytics1.f23138a, false).toJson(writer, customScalarAdapters, value.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$PointsAlertIndicator;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$PointsAlertIndicator;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PointsAlertIndicator implements Adapter<HomeQuery.PointsAlertIndicator> {

        /* renamed from: a, reason: collision with root package name */
        public static final PointsAlertIndicator f23211a = new PointsAlertIndicator();
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
                return new HomeQuery.PointsAlertIndicator(alertIndicatorTypeA, str);
            }
            Assertions.a(reader, "message");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.PointsAlertIndicator value = (HomeQuery.PointsAlertIndicator) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("indicatorType");
            AlertIndicatorType_ResponseAdapter.b(writer, customScalarAdapters, value.f22990a);
            writer.F1("message");
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$PrimaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$PrimaryCta;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class PrimaryCta implements Adapter<HomeQuery.PrimaryCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final PrimaryCta f23212a = new PrimaryCta();
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
                return new HomeQuery.PrimaryCta(str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.PrimaryCta value = (HomeQuery.PrimaryCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22991a);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$SecondaryCta;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$SecondaryCta;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SecondaryCta implements Adapter<HomeQuery.SecondaryCta> {

        /* renamed from: a, reason: collision with root package name */
        public static final SecondaryCta f23213a = new SecondaryCta();
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
                return new HomeQuery.SecondaryCta(str, str2);
            }
            Assertions.a(reader, AnnotatedPrivateKey.LABEL);
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.SecondaryCta value = (HomeQuery.SecondaryCta) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters.f13493a.toJson(writer, customScalarAdapters, value.f22992a);
            writer.F1("url");
            Adapters.i.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$StoreName;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$StoreName;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StoreName implements Adapter<HomeQuery.StoreName> {

        /* renamed from: a, reason: collision with root package name */
        public static final StoreName f23214a = new StoreName();
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
                return new HomeQuery.StoreName(str, str2);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.StoreName value = (HomeQuery.StoreName) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22993a);
            writer.F1("url");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$StoreTime;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$StoreTime;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StoreTime implements Adapter<HomeQuery.StoreTime> {

        /* renamed from: a, reason: collision with root package name */
        public static final StoreTime f23215a = new StoreTime();
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
                return new HomeQuery.StoreTime(str, str2);
            }
            Assertions.a(reader, "url");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.StoreTime value = (HomeQuery.StoreTime) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(AnnotatedPrivateKey.LABEL);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22994a);
            writer.F1("url");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$Subtitle;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$Subtitle;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Subtitle implements Adapter<HomeQuery.Subtitle> {

        /* renamed from: a, reason: collision with root package name */
        public static final Subtitle f23216a = new Subtitle();
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
                return new HomeQuery.Subtitle(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.Subtitle value = (HomeQuery.Subtitle) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22995a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$Subtitle1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$Subtitle1;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Subtitle1 implements Adapter<HomeQuery.Subtitle1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Subtitle1 f23217a = new Subtitle1();
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
                return new HomeQuery.Subtitle1(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.Subtitle1 value = (HomeQuery.Subtitle1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22996a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$Title;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$Title;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Title implements Adapter<HomeQuery.Title> {

        /* renamed from: a, reason: collision with root package name */
        public static final Title f23218a = new Title();
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
                return new HomeQuery.Title(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.Title value = (HomeQuery.Title) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22997a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$Title1;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$Title1;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Title1 implements Adapter<HomeQuery.Title1> {

        /* renamed from: a, reason: collision with root package name */
        public static final Title1 f23219a = new Title1();
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
                return new HomeQuery.Title1(str, str2);
            }
            Assertions.a(reader, "altText");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.Title1 value = (HomeQuery.Title1) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1(TextBundle.TEXT_ENTRY);
            Adapters$StringAdapter$1 adapters$StringAdapter$1 = Adapters.f13493a;
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.f22998a);
            writer.F1("altText");
            adapters$StringAdapter$1.toJson(writer, customScalarAdapters, value.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/woolworths/shop/homepage/adapter/HomeQuery_ResponseAdapter$UnreadChatbotMsg;", "Lcom/apollographql/apollo/api/Adapter;", "Lcom/woolworths/shop/homepage/HomeQuery$UnreadChatbotMsg;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class UnreadChatbotMsg implements Adapter<HomeQuery.UnreadChatbotMsg> {

        /* renamed from: a, reason: collision with root package name */
        public static final UnreadChatbotMsg f23220a = new UnreadChatbotMsg();
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
                return new HomeQuery.UnreadChatbotMsg(num.intValue());
            }
            Assertions.a(reader, "count");
            throw null;
        }

        @Override // com.apollographql.apollo.api.Adapter
        public final void toJson(JsonWriter writer, CustomScalarAdapters customScalarAdapters, Object obj) {
            HomeQuery.UnreadChatbotMsg value = (HomeQuery.UnreadChatbotMsg) obj;
            Intrinsics.h(writer, "writer");
            Intrinsics.h(customScalarAdapters, "customScalarAdapters");
            Intrinsics.h(value, "value");
            writer.F1("count");
            Adapters.b.toJson(writer, customScalarAdapters, Integer.valueOf(value.f22999a));
        }
    }
}
