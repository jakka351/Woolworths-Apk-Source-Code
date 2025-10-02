package com.woolworths.shop.homepage;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.graphql.TealiumAnalytics;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragment;
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
import au.com.woolworths.shop.graphql.type.HomePageInput;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.OrderStatus;
import au.com.woolworths.shop.graphql.type.ShoppingModeType;
import au.com.woolworths.shop.graphql.type.adapter.HomePageInput_InputAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ShoppingModeType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.homepage.adapter.HomeContentPageQuery_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0003\b\u0086\u0001\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u008d\u0001\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001\u0084\u0001\u0085\u0001\u0086\u0001\u0087\u0001¨\u0006\u0088\u0001"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/homepage/HomeContentPageQuery$Data;", "Data", "Home", "HeaderItem", "OnHomeFulfilmentWindowBanner", "FulfilmentWindowStateSubtitle", "FulfilmentWindowStateButton", "OnHomeFulfilmentWindowContainer", "Button", "DeliveryNowBanner", "OnHomeModeSelectorContainer", "FulfilmentWindowTile", "Title", "Subtitle", "Analytics", "OnlineShoppingModeVariantTile", "Title1", "Subtitle1", "Analytics1", "Divider", "DeliveryNowBanner1", "OnHomeDeliveryNowBottomBanner", "BannerAsset", "PrimaryCta", "SecondaryCta", "OnHomeDeliveryNowBanner", "InStoreDetailsCard", "StoreName", "StoreTime", "DeliveryNow", "UnreadChatbotMsg", "HomePage", "Analytics2", "ImpressionAnalytics", "Item", "OnRegistrationCard", "OnActionableCard", "ActionableCardImpressionAnalytics", "ActionableCardClickAnalytics", "OnInsetBanner", "Action", "OnBasicCoreBroadcastBanner", "ImpressionAnalytics1", "BroadcastBannerDismissAnalytics", "BroadcastBannerUI", "Icon", "OnCoreIcon", "OnHostedIcon", "BroadcastBannerAction", "Analytics3", "OnRewardsBalanceCard", "OffersAlertIndicator", "PointsAlertIndicator", "OnBroadcastBanner", "OnMyShoppingLists", "OnCarousel", "CarouselItem", "OnHeroBanner", "HeroBannerAction", "Analytics4", "HeroBannerAnalytics", "ExtraContent", "HeroBannerImpressionAnalytics", "HeroBannerBody", "OnHeroBannerBodyText", "OnHeroBannerPromoBody", "HeroBannerBrandsLogo", "HeroBannerGraphic", "HeroBannerImage", "HeroBannerTermsAndConditions", "HeroBannerTermsAndConditionAction", "Analytics5", "OnBoosterHorizontalList", "Item1", "OnProductCard", "OnVideoAdUnit", "VideoAdUnitVideoAd", "FallbackImage", "Transcript", "ImpressionAnalytics2", "TermsAndConditions", "ImpressionAnalytics3", "Analytics6", "EventAnalytics", "Impression", "VideoPlay", "VideoPause", "VideoErrorImpression", "VideoAdUnitCarousel", "Item2", "OnProductCard1", "VideoAdUnitBottomLink", "LinkTextWithAlt", "LinkAction", "Analytics7", "OnHorizontalList", "HorizontalListTrailingLink", "LinkTextWithAlt1", "LinkAction1", "Analytics8", "HorizontalListAnalytics", "HorizontalListImpressionAnalytics", "Item3", "OnProductCard2", "OnOrderCard", "FulfilmentStatusBanner", "OrderCardAction", "Analytics9", "OnQuickLinkCard", "LinkCardAction", "Analytics10", "LinkCardAnimation", "OnRecipeSummaryCard", "OnRecipeMoreCard", "ActionMetadatum", "OnRecipeTagList", "OnRecipeSource", "OnContentCard", "ContentCardAction", "Analytics11", "ContentCardFooter", "Logo", "ContentCardBrandImage", "OnPromotionCard", "PromotionCardProduct", "Analytics12", "ImpressionAnalytics4", "OnChatEntryCardV2", "ChatEntryCardCta", "ChatEntryCardContext", "Data1", "ChatEntryCardAction", "Analytics13", "Companion", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HomeContentPageQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final HomePageInput f22779a;
    public final ShoppingModeType b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final Optional j;
    public final Optional k;
    public final Optional l;
    public final Optional m;
    public final boolean n;
    public final boolean o;
    public final boolean p;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Action;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerActionPlacement f22780a;
        public final InsetBannerActionType b;
        public final String c;
        public final String d;

        public Action(InsetBannerActionPlacement insetBannerActionPlacement, InsetBannerActionType insetBannerActionType, String str, String str2) {
            this.f22780a = insetBannerActionPlacement;
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
            return this.f22780a == action.f22780a && this.b == action.b && Intrinsics.c(this.c, action.c) && Intrinsics.c(this.d, action.d);
        }

        public final int hashCode() {
            int iC = b.c(d.c(this.b, this.f22780a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.l(d.t("Action(placement=", this.f22780a, ", type=", this.b, ", label="), this.c, ", url=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$ActionMetadatum;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActionMetadatum {

        /* renamed from: a, reason: collision with root package name */
        public final String f22781a;
        public final OnRecipeTagList b;
        public final OnRecipeSource c;

        public ActionMetadatum(String __typename, OnRecipeTagList onRecipeTagList, OnRecipeSource onRecipeSource) {
            Intrinsics.h(__typename, "__typename");
            this.f22781a = __typename;
            this.b = onRecipeTagList;
            this.c = onRecipeSource;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionMetadatum)) {
                return false;
            }
            ActionMetadatum actionMetadatum = (ActionMetadatum) obj;
            return Intrinsics.c(this.f22781a, actionMetadatum.f22781a) && Intrinsics.c(this.b, actionMetadatum.b) && Intrinsics.c(this.c, actionMetadatum.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22781a.hashCode() * 31;
            OnRecipeTagList onRecipeTagList = this.b;
            int iHashCode2 = (iHashCode + (onRecipeTagList == null ? 0 : onRecipeTagList.f22887a.hashCode())) * 31;
            OnRecipeSource onRecipeSource = this.c;
            return iHashCode2 + (onRecipeSource != null ? onRecipeSource.f22885a.hashCode() : 0);
        }

        public final String toString() {
            return "ActionMetadatum(__typename=" + this.f22781a + ", onRecipeTagList=" + this.b + ", onRecipeSource=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$ActionableCardClickAnalytics;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActionableCardClickAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f22782a;
        public final AnalyticsFields b;

        public ActionableCardClickAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f22782a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionableCardClickAnalytics)) {
                return false;
            }
            ActionableCardClickAnalytics actionableCardClickAnalytics = (ActionableCardClickAnalytics) obj;
            return Intrinsics.c(this.f22782a, actionableCardClickAnalytics.f22782a) && Intrinsics.c(this.b, actionableCardClickAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22782a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ActionableCardClickAnalytics(__typename=", this.f22782a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$ActionableCardImpressionAnalytics;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActionableCardImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f22783a;
        public final AnalyticsFields b;

        public ActionableCardImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f22783a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionableCardImpressionAnalytics)) {
                return false;
            }
            ActionableCardImpressionAnalytics actionableCardImpressionAnalytics = (ActionableCardImpressionAnalytics) obj;
            return Intrinsics.c(this.f22783a, actionableCardImpressionAnalytics.f22783a) && Intrinsics.c(this.b, actionableCardImpressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22783a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ActionableCardImpressionAnalytics(__typename=", this.f22783a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f22784a;

        public Analytics(String str) {
            this.f22784a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Analytics) && Intrinsics.c(this.f22784a, ((Analytics) obj).f22784a);
        }

        public final int hashCode() {
            return this.f22784a.hashCode();
        }

        public final String toString() {
            return YU.a.h("Analytics(label=", this.f22784a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics1;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22785a;

        public Analytics1(String str) {
            this.f22785a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Analytics1) && Intrinsics.c(this.f22785a, ((Analytics1) obj).f22785a);
        }

        public final int hashCode() {
            return this.f22785a.hashCode();
        }

        public final String toString() {
            return YU.a.h("Analytics1(label=", this.f22785a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics10;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics10 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22786a;
        public final AnalyticsFields b;

        public Analytics10(String str, AnalyticsFields analyticsFields) {
            this.f22786a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics10)) {
                return false;
            }
            Analytics10 analytics10 = (Analytics10) obj;
            return Intrinsics.c(this.f22786a, analytics10.f22786a) && Intrinsics.c(this.b, analytics10.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22786a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics10(__typename=", this.f22786a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics11;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics11 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22787a;
        public final AnalyticsFields b;

        public Analytics11(String str, AnalyticsFields analyticsFields) {
            this.f22787a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics11)) {
                return false;
            }
            Analytics11 analytics11 = (Analytics11) obj;
            return Intrinsics.c(this.f22787a, analytics11.f22787a) && Intrinsics.c(this.b, analytics11.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22787a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics11(__typename=", this.f22787a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics12;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics12 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22788a;
        public final AnalyticsFields b;

        public Analytics12(String str, AnalyticsFields analyticsFields) {
            this.f22788a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics12)) {
                return false;
            }
            Analytics12 analytics12 = (Analytics12) obj;
            return Intrinsics.c(this.f22788a, analytics12.f22788a) && Intrinsics.c(this.b, analytics12.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22788a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics12(__typename=", this.f22788a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics13;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics13 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22789a;
        public final AnalyticsFields b;

        public Analytics13(String str, AnalyticsFields analyticsFields) {
            this.f22789a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics13)) {
                return false;
            }
            Analytics13 analytics13 = (Analytics13) obj;
            return Intrinsics.c(this.f22789a, analytics13.f22789a) && Intrinsics.c(this.b, analytics13.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22789a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics13(__typename=", this.f22789a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics2;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22790a;
        public final AnalyticsFields b;

        public Analytics2(String str, AnalyticsFields analyticsFields) {
            this.f22790a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics2)) {
                return false;
            }
            Analytics2 analytics2 = (Analytics2) obj;
            return Intrinsics.c(this.f22790a, analytics2.f22790a) && Intrinsics.c(this.b, analytics2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22790a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics2(__typename=", this.f22790a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics3;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22791a;
        public final AnalyticsFields b;

        public Analytics3(String str, AnalyticsFields analyticsFields) {
            this.f22791a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics3)) {
                return false;
            }
            Analytics3 analytics3 = (Analytics3) obj;
            return Intrinsics.c(this.f22791a, analytics3.f22791a) && Intrinsics.c(this.b, analytics3.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22791a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics3(__typename=", this.f22791a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics4;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics4 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22792a;
        public final AnalyticsFields b;

        public Analytics4(String str, AnalyticsFields analyticsFields) {
            this.f22792a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics4)) {
                return false;
            }
            Analytics4 analytics4 = (Analytics4) obj;
            return Intrinsics.c(this.f22792a, analytics4.f22792a) && Intrinsics.c(this.b, analytics4.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22792a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics4(__typename=", this.f22792a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics5;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics5 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22793a;
        public final AnalyticsFields b;

        public Analytics5(String str, AnalyticsFields analyticsFields) {
            this.f22793a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics5)) {
                return false;
            }
            Analytics5 analytics5 = (Analytics5) obj;
            return Intrinsics.c(this.f22793a, analytics5.f22793a) && Intrinsics.c(this.b, analytics5.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22793a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics5(__typename=", this.f22793a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics6;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics6 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22794a;
        public final AnalyticsFields b;

        public Analytics6(String str, AnalyticsFields analyticsFields) {
            this.f22794a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics6)) {
                return false;
            }
            Analytics6 analytics6 = (Analytics6) obj;
            return Intrinsics.c(this.f22794a, analytics6.f22794a) && Intrinsics.c(this.b, analytics6.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22794a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics6(__typename=", this.f22794a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics7;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics7 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22795a;
        public final AnalyticsFields b;

        public Analytics7(String str, AnalyticsFields analyticsFields) {
            this.f22795a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics7)) {
                return false;
            }
            Analytics7 analytics7 = (Analytics7) obj;
            return Intrinsics.c(this.f22795a, analytics7.f22795a) && Intrinsics.c(this.b, analytics7.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22795a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics7(__typename=", this.f22795a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics8;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics8 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22796a;
        public final AnalyticsFields b;

        public Analytics8(String str, AnalyticsFields analyticsFields) {
            this.f22796a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics8)) {
                return false;
            }
            Analytics8 analytics8 = (Analytics8) obj;
            return Intrinsics.c(this.f22796a, analytics8.f22796a) && Intrinsics.c(this.b, analytics8.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22796a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics8(__typename=", this.f22796a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Analytics9;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics9 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22797a;
        public final AnalyticsFields b;

        public Analytics9(String str, AnalyticsFields analyticsFields) {
            this.f22797a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics9)) {
                return false;
            }
            Analytics9 analytics9 = (Analytics9) obj;
            return Intrinsics.c(this.f22797a, analytics9.f22797a) && Intrinsics.c(this.b, analytics9.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22797a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics9(__typename=", this.f22797a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$BannerAsset;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BannerAsset {

        /* renamed from: a, reason: collision with root package name */
        public final DownloadableAssetType f22798a;
        public final String b;
        public final int c;
        public final int d;
        public final DownloadableAssetFit e;
        public final String f;

        public BannerAsset(DownloadableAssetType downloadableAssetType, String str, int i, int i2, DownloadableAssetFit downloadableAssetFit, String str2) {
            this.f22798a = downloadableAssetType;
            this.b = str;
            this.c = i;
            this.d = i2;
            this.e = downloadableAssetFit;
            this.f = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BannerAsset)) {
                return false;
            }
            BannerAsset bannerAsset = (BannerAsset) obj;
            return this.f22798a == bannerAsset.f22798a && Intrinsics.c(this.b, bannerAsset.b) && this.c == bannerAsset.c && this.d == bannerAsset.d && this.e == bannerAsset.e && Intrinsics.c(this.f, bannerAsset.f);
        }

        public final int hashCode() {
            int iA = b.a(this.d, b.a(this.c, b.c(this.f22798a.hashCode() * 31, 31, this.b), 31), 31);
            DownloadableAssetFit downloadableAssetFit = this.e;
            int iHashCode = (iA + (downloadableAssetFit == null ? 0 : downloadableAssetFit.hashCode())) * 31;
            String str = this.f;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BannerAsset(assetType=");
            sb.append(this.f22798a);
            sb.append(", assetUrl=");
            sb.append(this.b);
            sb.append(", assetWidth=");
            YU.a.w(this.c, this.d, ", assetHeight=", ", fit=", sb);
            sb.append(this.e);
            sb.append(", altText=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$BroadcastBannerAction;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BroadcastBannerAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f22799a;
        public final String b;
        public final ActionType c;
        public final Analytics3 d;

        public BroadcastBannerAction(String str, String str2, ActionType actionType, Analytics3 analytics3) {
            this.f22799a = str;
            this.b = str2;
            this.c = actionType;
            this.d = analytics3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BroadcastBannerAction)) {
                return false;
            }
            BroadcastBannerAction broadcastBannerAction = (BroadcastBannerAction) obj;
            return Intrinsics.c(this.f22799a, broadcastBannerAction.f22799a) && Intrinsics.c(this.b, broadcastBannerAction.b) && this.c == broadcastBannerAction.c && Intrinsics.c(this.d, broadcastBannerAction.d);
        }

        public final int hashCode() {
            int iHashCode = this.f22799a.hashCode() * 31;
            String str = this.b;
            int iA = d.a(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            Analytics3 analytics3 = this.d;
            return iA + (analytics3 != null ? analytics3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("BroadcastBannerAction(action=", this.f22799a, ", id=", this.b, ", type=");
            sbV.append(this.c);
            sbV.append(", analytics=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$BroadcastBannerDismissAnalytics;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BroadcastBannerDismissAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f22800a;
        public final AnalyticsFields b;

        public BroadcastBannerDismissAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f22800a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BroadcastBannerDismissAnalytics)) {
                return false;
            }
            BroadcastBannerDismissAnalytics broadcastBannerDismissAnalytics = (BroadcastBannerDismissAnalytics) obj;
            return Intrinsics.c(this.f22800a, broadcastBannerDismissAnalytics.f22800a) && Intrinsics.c(this.b, broadcastBannerDismissAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22800a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("BroadcastBannerDismissAnalytics(__typename=", this.f22800a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$BroadcastBannerUI;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BroadcastBannerUI {

        /* renamed from: a, reason: collision with root package name */
        public final String f22801a;
        public final String b;
        public final CoreBroadcastBannerStyle c;
        public final Icon d;

        public BroadcastBannerUI(String str, String str2, CoreBroadcastBannerStyle coreBroadcastBannerStyle, Icon icon) {
            this.f22801a = str;
            this.b = str2;
            this.c = coreBroadcastBannerStyle;
            this.d = icon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BroadcastBannerUI)) {
                return false;
            }
            BroadcastBannerUI broadcastBannerUI = (BroadcastBannerUI) obj;
            return Intrinsics.c(this.f22801a, broadcastBannerUI.f22801a) && Intrinsics.c(this.b, broadcastBannerUI.b) && this.c == broadcastBannerUI.c && Intrinsics.c(this.d, broadcastBannerUI.d);
        }

        public final int hashCode() {
            int iHashCode = this.f22801a.hashCode() * 31;
            String str = this.b;
            return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("BroadcastBannerUI(title=", this.f22801a, ", subtitle=", this.b, ", style=");
            sbV.append(this.c);
            sbV.append(", icon=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Button;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        public final String f22802a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;
        public final String e;
        public final String f;

        public Button(ButtonStyle buttonStyle, String str, String str2, String str3, String str4, boolean z) {
            this.f22802a = str;
            this.b = str2;
            this.c = buttonStyle;
            this.d = z;
            this.e = str3;
            this.f = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return Intrinsics.c(this.f22802a, button.f22802a) && Intrinsics.c(this.b, button.b) && this.c == button.c && this.d == button.d && Intrinsics.c(this.e, button.e) && Intrinsics.c(this.f, button.f);
        }

        public final int hashCode() {
            int iC = b.c(this.f22802a.hashCode() * 31, 31, this.b);
            ButtonStyle buttonStyle = this.c;
            int iE = b.e((iC + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31, 31, this.d);
            String str = this.e;
            int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("Button(__typename=", this.f22802a, ", label=", this.b, ", style=");
            sbV.append(this.c);
            sbV.append(", enabled=");
            sbV.append(this.d);
            sbV.append(", action=");
            return a.l(sbV, this.e, ", url=", this.f, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$CarouselItem;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CarouselItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f22803a;
        public final OnHeroBanner b;

        public CarouselItem(String __typename, OnHeroBanner onHeroBanner) {
            Intrinsics.h(__typename, "__typename");
            this.f22803a = __typename;
            this.b = onHeroBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CarouselItem)) {
                return false;
            }
            CarouselItem carouselItem = (CarouselItem) obj;
            return Intrinsics.c(this.f22803a, carouselItem.f22803a) && Intrinsics.c(this.b, carouselItem.b);
        }

        public final int hashCode() {
            int iHashCode = this.f22803a.hashCode() * 31;
            OnHeroBanner onHeroBanner = this.b;
            return iHashCode + (onHeroBanner == null ? 0 : onHeroBanner.hashCode());
        }

        public final String toString() {
            return "CarouselItem(__typename=" + this.f22803a + ", onHeroBanner=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$ChatEntryCardAction;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChatEntryCardAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f22804a;
        public final String b;
        public final ActionType c;
        public final Analytics13 d;

        public ChatEntryCardAction(String str, String str2, ActionType actionType, Analytics13 analytics13) {
            this.f22804a = str;
            this.b = str2;
            this.c = actionType;
            this.d = analytics13;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChatEntryCardAction)) {
                return false;
            }
            ChatEntryCardAction chatEntryCardAction = (ChatEntryCardAction) obj;
            return Intrinsics.c(this.f22804a, chatEntryCardAction.f22804a) && Intrinsics.c(this.b, chatEntryCardAction.b) && this.c == chatEntryCardAction.c && Intrinsics.c(this.d, chatEntryCardAction.d);
        }

        public final int hashCode() {
            String str = this.f22804a;
            int iA = d.a(this.c, b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31);
            Analytics13 analytics13 = this.d;
            return iA + (analytics13 != null ? analytics13.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("ChatEntryCardAction(id=", this.f22804a, ", action=", this.b, ", type=");
            sbV.append(this.c);
            sbV.append(", analytics=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$ChatEntryCardContext;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChatEntryCardContext {

        /* renamed from: a, reason: collision with root package name */
        public final String f22805a;
        public final List b;

        public ChatEntryCardContext(String str, List list) {
            this.f22805a = str;
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChatEntryCardContext)) {
                return false;
            }
            ChatEntryCardContext chatEntryCardContext = (ChatEntryCardContext) obj;
            return Intrinsics.c(this.f22805a, chatEntryCardContext.f22805a) && Intrinsics.c(this.b, chatEntryCardContext.b);
        }

        public final int hashCode() {
            int iHashCode = this.f22805a.hashCode() * 31;
            List list = this.b;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.i("ChatEntryCardContext(source=", this.f22805a, ", data=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$ChatEntryCardCta;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChatEntryCardCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f22806a;
        public final List b;
        public final ChatEntryCardElement c;
        public final ChatEntryCardContext d;
        public final ChatEntryCardAction e;

        public ChatEntryCardCta(String str, List list, ChatEntryCardElement chatEntryCardElement, ChatEntryCardContext chatEntryCardContext, ChatEntryCardAction chatEntryCardAction) {
            this.f22806a = str;
            this.b = list;
            this.c = chatEntryCardElement;
            this.d = chatEntryCardContext;
            this.e = chatEntryCardAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChatEntryCardCta)) {
                return false;
            }
            ChatEntryCardCta chatEntryCardCta = (ChatEntryCardCta) obj;
            return Intrinsics.c(this.f22806a, chatEntryCardCta.f22806a) && Intrinsics.c(this.b, chatEntryCardCta.b) && this.c == chatEntryCardCta.c && Intrinsics.c(this.d, chatEntryCardCta.d) && Intrinsics.c(this.e, chatEntryCardCta.e);
        }

        public final int hashCode() {
            String str = this.f22806a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List list = this.b;
            return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbS = au.com.woolworths.android.onesite.a.s("ChatEntryCardCta(chatEntryCardCtaIconUrl=", this.f22806a, ", chatEntryCardPrompts=", ", chatEntryCardElement=", this.b);
            sbS.append(this.c);
            sbS.append(", chatEntryCardContext=");
            sbS.append(this.d);
            sbS.append(", chatEntryCardAction=");
            sbS.append(this.e);
            sbS.append(")");
            return sbS.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$ContentCardAction;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ContentCardAction {

        /* renamed from: a, reason: collision with root package name */
        public final ActionType f22807a;
        public final String b;
        public final Analytics11 c;

        public ContentCardAction(ActionType actionType, String str, Analytics11 analytics11) {
            this.f22807a = actionType;
            this.b = str;
            this.c = analytics11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentCardAction)) {
                return false;
            }
            ContentCardAction contentCardAction = (ContentCardAction) obj;
            return this.f22807a == contentCardAction.f22807a && Intrinsics.c(this.b, contentCardAction.b) && Intrinsics.c(this.c, contentCardAction.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f22807a.hashCode() * 31, 31, this.b);
            Analytics11 analytics11 = this.c;
            return iC + (analytics11 == null ? 0 : analytics11.hashCode());
        }

        public final String toString() {
            StringBuilder sbS = d.s("ContentCardAction(type=", this.f22807a, ", action=", this.b, ", analytics=");
            sbS.append(this.c);
            sbS.append(")");
            return sbS.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$ContentCardBrandImage;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ContentCardBrandImage {

        /* renamed from: a, reason: collision with root package name */
        public final String f22808a;
        public final String b;

        public ContentCardBrandImage(String str, String str2) {
            this.f22808a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentCardBrandImage)) {
                return false;
            }
            ContentCardBrandImage contentCardBrandImage = (ContentCardBrandImage) obj;
            return Intrinsics.c(this.f22808a, contentCardBrandImage.f22808a) && Intrinsics.c(this.b, contentCardBrandImage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22808a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("ContentCardBrandImage(imageUrl=", this.f22808a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$ContentCardFooter;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ContentCardFooter {

        /* renamed from: a, reason: collision with root package name */
        public final FooterStyle f22809a;
        public final String b;
        public final Logo c;

        public ContentCardFooter(FooterStyle footerStyle, String str, Logo logo) {
            this.f22809a = footerStyle;
            this.b = str;
            this.c = logo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentCardFooter)) {
                return false;
            }
            ContentCardFooter contentCardFooter = (ContentCardFooter) obj;
            return this.f22809a == contentCardFooter.f22809a && Intrinsics.c(this.b, contentCardFooter.b) && Intrinsics.c(this.c, contentCardFooter.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22809a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Logo logo = this.c;
            return iHashCode2 + (logo != null ? logo.hashCode() : 0);
        }

        public final String toString() {
            return "ContentCardFooter(style=" + this.f22809a + ", text=" + this.b + ", logo=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final Home f22810a;
        public final HomePage b;

        public Data(Home home, HomePage homePage) {
            this.f22810a = home;
            this.b = homePage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return Intrinsics.c(this.f22810a, data.f22810a) && Intrinsics.c(this.b, data.b);
        }

        public final int hashCode() {
            Home home = this.f22810a;
            return this.b.hashCode() + ((home == null ? 0 : home.hashCode()) * 31);
        }

        public final String toString() {
            return "Data(home=" + this.f22810a + ", homePage=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Data1;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22811a;
        public final String b;

        public Data1(String str, String str2) {
            this.f22811a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data1)) {
                return false;
            }
            Data1 data1 = (Data1) obj;
            return Intrinsics.c(this.f22811a, data1.f22811a) && Intrinsics.c(this.b, data1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22811a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("Data1(key=", this.f22811a, ", value=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$DeliveryNow;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeliveryNow {

        /* renamed from: a, reason: collision with root package name */
        public final String f22812a;
        public final Integer b;

        public DeliveryNow(String str, Integer num) {
            this.f22812a = str;
            this.b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeliveryNow)) {
                return false;
            }
            DeliveryNow deliveryNow = (DeliveryNow) obj;
            return Intrinsics.c(this.f22812a, deliveryNow.f22812a) && Intrinsics.c(this.b, deliveryNow.b);
        }

        public final int hashCode() {
            int iHashCode = this.f22812a.hashCode() * 31;
            Integer num = this.b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return "DeliveryNow(status=" + this.f22812a + ", expressDeliveryStoreId=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$DeliveryNowBanner;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeliveryNowBanner {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f22813a;

        public DeliveryNowBanner(Boolean bool) {
            this.f22813a = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeliveryNowBanner) && Intrinsics.c(this.f22813a, ((DeliveryNowBanner) obj).f22813a);
        }

        public final int hashCode() {
            Boolean bool = this.f22813a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            return androidx.compose.ui.input.pointer.a.k(this.f22813a, "DeliveryNowBanner(_excluded=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$DeliveryNowBanner1;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeliveryNowBanner1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22814a;
        public final OnHomeDeliveryNowBottomBanner b;
        public final OnHomeDeliveryNowBanner c;

        public DeliveryNowBanner1(String __typename, OnHomeDeliveryNowBottomBanner onHomeDeliveryNowBottomBanner, OnHomeDeliveryNowBanner onHomeDeliveryNowBanner) {
            Intrinsics.h(__typename, "__typename");
            this.f22814a = __typename;
            this.b = onHomeDeliveryNowBottomBanner;
            this.c = onHomeDeliveryNowBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DeliveryNowBanner1)) {
                return false;
            }
            DeliveryNowBanner1 deliveryNowBanner1 = (DeliveryNowBanner1) obj;
            return Intrinsics.c(this.f22814a, deliveryNowBanner1.f22814a) && Intrinsics.c(this.b, deliveryNowBanner1.b) && Intrinsics.c(this.c, deliveryNowBanner1.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22814a.hashCode() * 31;
            OnHomeDeliveryNowBottomBanner onHomeDeliveryNowBottomBanner = this.b;
            int iHashCode2 = (iHashCode + (onHomeDeliveryNowBottomBanner == null ? 0 : onHomeDeliveryNowBottomBanner.hashCode())) * 31;
            OnHomeDeliveryNowBanner onHomeDeliveryNowBanner = this.c;
            return iHashCode2 + (onHomeDeliveryNowBanner != null ? onHomeDeliveryNowBanner.hashCode() : 0);
        }

        public final String toString() {
            return "DeliveryNowBanner1(__typename=" + this.f22814a + ", onHomeDeliveryNowBottomBanner=" + this.b + ", onHomeDeliveryNowBanner=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Divider;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Divider {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f22815a;

        public Divider(Boolean bool) {
            this.f22815a = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Divider) && Intrinsics.c(this.f22815a, ((Divider) obj).f22815a);
        }

        public final int hashCode() {
            Boolean bool = this.f22815a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            return androidx.compose.ui.input.pointer.a.k(this.f22815a, "Divider(_excluded=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$EventAnalytics;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EventAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final Impression f22816a;
        public final VideoPlay b;
        public final VideoPause c;
        public final VideoErrorImpression d;

        public EventAnalytics(Impression impression, VideoPlay videoPlay, VideoPause videoPause, VideoErrorImpression videoErrorImpression) {
            this.f22816a = impression;
            this.b = videoPlay;
            this.c = videoPause;
            this.d = videoErrorImpression;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EventAnalytics)) {
                return false;
            }
            EventAnalytics eventAnalytics = (EventAnalytics) obj;
            return Intrinsics.c(this.f22816a, eventAnalytics.f22816a) && Intrinsics.c(this.b, eventAnalytics.b) && Intrinsics.c(this.c, eventAnalytics.c) && Intrinsics.c(this.d, eventAnalytics.d);
        }

        public final int hashCode() {
            Impression impression = this.f22816a;
            int iHashCode = (impression == null ? 0 : impression.hashCode()) * 31;
            VideoPlay videoPlay = this.b;
            int iHashCode2 = (iHashCode + (videoPlay == null ? 0 : videoPlay.hashCode())) * 31;
            VideoPause videoPause = this.c;
            int iHashCode3 = (iHashCode2 + (videoPause == null ? 0 : videoPause.hashCode())) * 31;
            VideoErrorImpression videoErrorImpression = this.d;
            return iHashCode3 + (videoErrorImpression != null ? videoErrorImpression.hashCode() : 0);
        }

        public final String toString() {
            return "EventAnalytics(impression=" + this.f22816a + ", videoPlay=" + this.b + ", videoPause=" + this.c + ", videoErrorImpression=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$ExtraContent;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ExtraContent {

        /* renamed from: a, reason: collision with root package name */
        public final String f22817a;
        public final String b;

        public ExtraContent(String str, String str2) {
            this.f22817a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExtraContent)) {
                return false;
            }
            ExtraContent extraContent = (ExtraContent) obj;
            return Intrinsics.c(this.f22817a, extraContent.f22817a) && Intrinsics.c(this.b, extraContent.b);
        }

        public final int hashCode() {
            int iHashCode = this.f22817a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return YU.a.j("ExtraContent(key=", this.f22817a, ", value=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$FallbackImage;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FallbackImage {

        /* renamed from: a, reason: collision with root package name */
        public final String f22818a;
        public final String b;

        public FallbackImage(String str, String str2) {
            this.f22818a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FallbackImage)) {
                return false;
            }
            FallbackImage fallbackImage = (FallbackImage) obj;
            return Intrinsics.c(this.f22818a, fallbackImage.f22818a) && Intrinsics.c(this.b, fallbackImage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22818a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("FallbackImage(imageUrl=", this.f22818a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$FulfilmentStatusBanner;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FulfilmentStatusBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f22819a;
        public final String b;

        public FulfilmentStatusBanner(String str, String str2) {
            this.f22819a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FulfilmentStatusBanner)) {
                return false;
            }
            FulfilmentStatusBanner fulfilmentStatusBanner = (FulfilmentStatusBanner) obj;
            return Intrinsics.c(this.f22819a, fulfilmentStatusBanner.f22819a) && Intrinsics.c(this.b, fulfilmentStatusBanner.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22819a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("FulfilmentStatusBanner(text=", this.f22819a, ", buttonLabel=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$FulfilmentWindowStateButton;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FulfilmentWindowStateButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f22820a;
        public final ButtonStyle b;
        public final boolean c;
        public final String d;
        public final String e;

        public FulfilmentWindowStateButton(String str, ButtonStyle buttonStyle, boolean z, String str2, String str3) {
            this.f22820a = str;
            this.b = buttonStyle;
            this.c = z;
            this.d = str2;
            this.e = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FulfilmentWindowStateButton)) {
                return false;
            }
            FulfilmentWindowStateButton fulfilmentWindowStateButton = (FulfilmentWindowStateButton) obj;
            return Intrinsics.c(this.f22820a, fulfilmentWindowStateButton.f22820a) && this.b == fulfilmentWindowStateButton.b && this.c == fulfilmentWindowStateButton.c && Intrinsics.c(this.d, fulfilmentWindowStateButton.d) && Intrinsics.c(this.e, fulfilmentWindowStateButton.e);
        }

        public final int hashCode() {
            int iHashCode = this.f22820a.hashCode() * 31;
            ButtonStyle buttonStyle = this.b;
            int iE = b.e((iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31, 31, this.c);
            String str = this.d;
            int iHashCode2 = (iE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbQ = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.q("FulfilmentWindowStateButton(label=", this.f22820a, ", style=", this.b, ", enabled=");
            au.com.woolworths.android.onesite.a.y(", action=", this.d, ", url=", sbQ, this.c);
            return YU.a.o(sbQ, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$FulfilmentWindowStateSubtitle;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FulfilmentWindowStateSubtitle {

        /* renamed from: a, reason: collision with root package name */
        public final String f22821a;
        public final String b;

        public FulfilmentWindowStateSubtitle(String str, String str2) {
            this.f22821a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FulfilmentWindowStateSubtitle)) {
                return false;
            }
            FulfilmentWindowStateSubtitle fulfilmentWindowStateSubtitle = (FulfilmentWindowStateSubtitle) obj;
            return Intrinsics.c(this.f22821a, fulfilmentWindowStateSubtitle.f22821a) && Intrinsics.c(this.b, fulfilmentWindowStateSubtitle.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22821a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("FulfilmentWindowStateSubtitle(text=", this.f22821a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$FulfilmentWindowTile;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FulfilmentWindowTile {

        /* renamed from: a, reason: collision with root package name */
        public final HomeFulfilmentWindowTileStyle f22822a;
        public final String b;
        public final String c;
        public final Title d;
        public final Subtitle e;
        public final Analytics f;

        public FulfilmentWindowTile(HomeFulfilmentWindowTileStyle homeFulfilmentWindowTileStyle, String str, String str2, Title title, Subtitle subtitle, Analytics analytics) {
            this.f22822a = homeFulfilmentWindowTileStyle;
            this.b = str;
            this.c = str2;
            this.d = title;
            this.e = subtitle;
            this.f = analytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FulfilmentWindowTile)) {
                return false;
            }
            FulfilmentWindowTile fulfilmentWindowTile = (FulfilmentWindowTile) obj;
            return this.f22822a == fulfilmentWindowTile.f22822a && Intrinsics.c(this.b, fulfilmentWindowTile.b) && Intrinsics.c(this.c, fulfilmentWindowTile.c) && Intrinsics.c(this.d, fulfilmentWindowTile.d) && Intrinsics.c(this.e, fulfilmentWindowTile.e) && Intrinsics.c(this.f, fulfilmentWindowTile.f);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + b.c(b.c(this.f22822a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
            Subtitle subtitle = this.e;
            return this.f.f22784a.hashCode() + ((iHashCode + (subtitle == null ? 0 : subtitle.hashCode())) * 31);
        }

        public final String toString() {
            return "FulfilmentWindowTile(style=" + this.f22822a + ", iconUrl=" + this.b + ", url=" + this.c + ", title=" + this.d + ", subtitle=" + this.e + ", analytics=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$HeaderItem;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeaderItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f22823a;
        public final OnHomeFulfilmentWindowBanner b;
        public final OnHomeFulfilmentWindowContainer c;
        public final OnHomeModeSelectorContainer d;

        public HeaderItem(String __typename, OnHomeFulfilmentWindowBanner onHomeFulfilmentWindowBanner, OnHomeFulfilmentWindowContainer onHomeFulfilmentWindowContainer, OnHomeModeSelectorContainer onHomeModeSelectorContainer) {
            Intrinsics.h(__typename, "__typename");
            this.f22823a = __typename;
            this.b = onHomeFulfilmentWindowBanner;
            this.c = onHomeFulfilmentWindowContainer;
            this.d = onHomeModeSelectorContainer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeaderItem)) {
                return false;
            }
            HeaderItem headerItem = (HeaderItem) obj;
            return Intrinsics.c(this.f22823a, headerItem.f22823a) && Intrinsics.c(this.b, headerItem.b) && Intrinsics.c(this.c, headerItem.c) && Intrinsics.c(this.d, headerItem.d);
        }

        public final int hashCode() {
            int iHashCode = this.f22823a.hashCode() * 31;
            OnHomeFulfilmentWindowBanner onHomeFulfilmentWindowBanner = this.b;
            int iHashCode2 = (iHashCode + (onHomeFulfilmentWindowBanner == null ? 0 : onHomeFulfilmentWindowBanner.hashCode())) * 31;
            OnHomeFulfilmentWindowContainer onHomeFulfilmentWindowContainer = this.c;
            int iHashCode3 = (iHashCode2 + (onHomeFulfilmentWindowContainer == null ? 0 : onHomeFulfilmentWindowContainer.hashCode())) * 31;
            OnHomeModeSelectorContainer onHomeModeSelectorContainer = this.d;
            return iHashCode3 + (onHomeModeSelectorContainer != null ? onHomeModeSelectorContainer.hashCode() : 0);
        }

        public final String toString() {
            return "HeaderItem(__typename=" + this.f22823a + ", onHomeFulfilmentWindowBanner=" + this.b + ", onHomeFulfilmentWindowContainer=" + this.c + ", onHomeModeSelectorContainer=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$HeroBannerAction;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeroBannerAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f22824a;
        public final Analytics4 b;
        public final ActionType c;

        public HeroBannerAction(String str, Analytics4 analytics4, ActionType actionType) {
            this.f22824a = str;
            this.b = analytics4;
            this.c = actionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeroBannerAction)) {
                return false;
            }
            HeroBannerAction heroBannerAction = (HeroBannerAction) obj;
            return Intrinsics.c(this.f22824a, heroBannerAction.f22824a) && Intrinsics.c(this.b, heroBannerAction.b) && this.c == heroBannerAction.c;
        }

        public final int hashCode() {
            int iHashCode = this.f22824a.hashCode() * 31;
            Analytics4 analytics4 = this.b;
            return this.c.hashCode() + ((iHashCode + (analytics4 == null ? 0 : analytics4.hashCode())) * 31);
        }

        public final String toString() {
            return "HeroBannerAction(action=" + this.f22824a + ", analytics=" + this.b + ", type=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$HeroBannerAnalytics;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeroBannerAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f22825a;
        public final List b;
        public final AnalyticsFields c;

        public HeroBannerAnalytics(String str, List list, AnalyticsFields analyticsFields) {
            this.f22825a = str;
            this.b = list;
            this.c = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeroBannerAnalytics)) {
                return false;
            }
            HeroBannerAnalytics heroBannerAnalytics = (HeroBannerAnalytics) obj;
            return Intrinsics.c(this.f22825a, heroBannerAnalytics.f22825a) && Intrinsics.c(this.b, heroBannerAnalytics.b) && Intrinsics.c(this.c, heroBannerAnalytics.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22825a.hashCode() * 31;
            List list = this.b;
            return this.c.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbS = au.com.woolworths.android.onesite.a.s("HeroBannerAnalytics(__typename=", this.f22825a, ", extraContent=", ", analyticsFields=", this.b);
            sbS.append(this.c);
            sbS.append(")");
            return sbS.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$HeroBannerBody;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeroBannerBody {

        /* renamed from: a, reason: collision with root package name */
        public final String f22826a;
        public final OnHeroBannerBodyText b;
        public final OnHeroBannerPromoBody c;

        public HeroBannerBody(String __typename, OnHeroBannerBodyText onHeroBannerBodyText, OnHeroBannerPromoBody onHeroBannerPromoBody) {
            Intrinsics.h(__typename, "__typename");
            this.f22826a = __typename;
            this.b = onHeroBannerBodyText;
            this.c = onHeroBannerPromoBody;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeroBannerBody)) {
                return false;
            }
            HeroBannerBody heroBannerBody = (HeroBannerBody) obj;
            return Intrinsics.c(this.f22826a, heroBannerBody.f22826a) && Intrinsics.c(this.b, heroBannerBody.b) && Intrinsics.c(this.c, heroBannerBody.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22826a.hashCode() * 31;
            OnHeroBannerBodyText onHeroBannerBodyText = this.b;
            int iHashCode2 = (iHashCode + (onHeroBannerBodyText == null ? 0 : onHeroBannerBodyText.f22867a.hashCode())) * 31;
            OnHeroBannerPromoBody onHeroBannerPromoBody = this.c;
            return iHashCode2 + (onHeroBannerPromoBody != null ? onHeroBannerPromoBody.hashCode() : 0);
        }

        public final String toString() {
            return "HeroBannerBody(__typename=" + this.f22826a + ", onHeroBannerBodyText=" + this.b + ", onHeroBannerPromoBody=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$HeroBannerBrandsLogo;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeroBannerBrandsLogo {

        /* renamed from: a, reason: collision with root package name */
        public final String f22827a;
        public final String b;

        public HeroBannerBrandsLogo(String str, String str2) {
            this.f22827a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeroBannerBrandsLogo)) {
                return false;
            }
            HeroBannerBrandsLogo heroBannerBrandsLogo = (HeroBannerBrandsLogo) obj;
            return Intrinsics.c(this.f22827a, heroBannerBrandsLogo.f22827a) && Intrinsics.c(this.b, heroBannerBrandsLogo.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22827a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("HeroBannerBrandsLogo(imageUrl=", this.f22827a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$HeroBannerGraphic;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeroBannerGraphic {

        /* renamed from: a, reason: collision with root package name */
        public final String f22828a;
        public final String b;

        public HeroBannerGraphic(String str, String str2) {
            this.f22828a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeroBannerGraphic)) {
                return false;
            }
            HeroBannerGraphic heroBannerGraphic = (HeroBannerGraphic) obj;
            return Intrinsics.c(this.f22828a, heroBannerGraphic.f22828a) && Intrinsics.c(this.b, heroBannerGraphic.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22828a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("HeroBannerGraphic(imageUrl=", this.f22828a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$HeroBannerImage;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeroBannerImage {

        /* renamed from: a, reason: collision with root package name */
        public final String f22829a;
        public final String b;

        public HeroBannerImage(String str, String str2) {
            this.f22829a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeroBannerImage)) {
                return false;
            }
            HeroBannerImage heroBannerImage = (HeroBannerImage) obj;
            return Intrinsics.c(this.f22829a, heroBannerImage.f22829a) && Intrinsics.c(this.b, heroBannerImage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22829a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("HeroBannerImage(imageUrl=", this.f22829a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$HeroBannerImpressionAnalytics;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeroBannerImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f22830a;
        public final AnalyticsFields b;

        public HeroBannerImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f22830a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeroBannerImpressionAnalytics)) {
                return false;
            }
            HeroBannerImpressionAnalytics heroBannerImpressionAnalytics = (HeroBannerImpressionAnalytics) obj;
            return Intrinsics.c(this.f22830a, heroBannerImpressionAnalytics.f22830a) && Intrinsics.c(this.b, heroBannerImpressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22830a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("HeroBannerImpressionAnalytics(__typename=", this.f22830a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$HeroBannerTermsAndConditionAction;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeroBannerTermsAndConditionAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f22831a;
        public final ActionType b;
        public final String c;
        public final Analytics5 d;

        public HeroBannerTermsAndConditionAction(String str, ActionType actionType, String str2, Analytics5 analytics5) {
            this.f22831a = str;
            this.b = actionType;
            this.c = str2;
            this.d = analytics5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeroBannerTermsAndConditionAction)) {
                return false;
            }
            HeroBannerTermsAndConditionAction heroBannerTermsAndConditionAction = (HeroBannerTermsAndConditionAction) obj;
            return Intrinsics.c(this.f22831a, heroBannerTermsAndConditionAction.f22831a) && this.b == heroBannerTermsAndConditionAction.b && Intrinsics.c(this.c, heroBannerTermsAndConditionAction.c) && Intrinsics.c(this.d, heroBannerTermsAndConditionAction.d);
        }

        public final int hashCode() {
            int iA = d.a(this.b, this.f22831a.hashCode() * 31, 31);
            String str = this.c;
            int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
            Analytics5 analytics5 = this.d;
            return iHashCode + (analytics5 != null ? analytics5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbW = d.w("HeroBannerTermsAndConditionAction(action=", this.f22831a, ", type=", this.b, ", id=");
            sbW.append(this.c);
            sbW.append(", analytics=");
            sbW.append(this.d);
            sbW.append(")");
            return sbW.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$HeroBannerTermsAndConditions;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeroBannerTermsAndConditions {

        /* renamed from: a, reason: collision with root package name */
        public final String f22832a;
        public final HeroBannerTermsAndConditionAction b;

        public HeroBannerTermsAndConditions(String str, HeroBannerTermsAndConditionAction heroBannerTermsAndConditionAction) {
            this.f22832a = str;
            this.b = heroBannerTermsAndConditionAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeroBannerTermsAndConditions)) {
                return false;
            }
            HeroBannerTermsAndConditions heroBannerTermsAndConditions = (HeroBannerTermsAndConditions) obj;
            return Intrinsics.c(this.f22832a, heroBannerTermsAndConditions.f22832a) && Intrinsics.c(this.b, heroBannerTermsAndConditions.b);
        }

        public final int hashCode() {
            int iHashCode = this.f22832a.hashCode() * 31;
            HeroBannerTermsAndConditionAction heroBannerTermsAndConditionAction = this.b;
            return iHashCode + (heroBannerTermsAndConditionAction == null ? 0 : heroBannerTermsAndConditionAction.hashCode());
        }

        public final String toString() {
            return "HeroBannerTermsAndConditions(text=" + this.f22832a + ", heroBannerTermsAndConditionAction=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Home;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Home {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f22833a;
        public final DeliveryNow b;
        public final UnreadChatbotMsg c;

        public Home(ArrayList arrayList, DeliveryNow deliveryNow, UnreadChatbotMsg unreadChatbotMsg) {
            this.f22833a = arrayList;
            this.b = deliveryNow;
            this.c = unreadChatbotMsg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Home)) {
                return false;
            }
            Home home = (Home) obj;
            return this.f22833a.equals(home.f22833a) && Intrinsics.c(this.b, home.b) && Intrinsics.c(this.c, home.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22833a.hashCode() * 31;
            DeliveryNow deliveryNow = this.b;
            int iHashCode2 = (iHashCode + (deliveryNow == null ? 0 : deliveryNow.hashCode())) * 31;
            UnreadChatbotMsg unreadChatbotMsg = this.c;
            return iHashCode2 + (unreadChatbotMsg != null ? Integer.hashCode(unreadChatbotMsg.f22905a) : 0);
        }

        public final String toString() {
            return "Home(headerItems=" + this.f22833a + ", deliveryNow=" + this.b + ", unreadChatbotMsg=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$HomePage;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HomePage {

        /* renamed from: a, reason: collision with root package name */
        public final Analytics2 f22834a;
        public final ImpressionAnalytics b;
        public final ArrayList c;

        public HomePage(Analytics2 analytics2, ImpressionAnalytics impressionAnalytics, ArrayList arrayList) {
            this.f22834a = analytics2;
            this.b = impressionAnalytics;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HomePage)) {
                return false;
            }
            HomePage homePage = (HomePage) obj;
            return Intrinsics.c(this.f22834a, homePage.f22834a) && Intrinsics.c(this.b, homePage.b) && this.c.equals(homePage.c);
        }

        public final int hashCode() {
            Analytics2 analytics2 = this.f22834a;
            int iHashCode = (analytics2 == null ? 0 : analytics2.hashCode()) * 31;
            ImpressionAnalytics impressionAnalytics = this.b;
            return this.c.hashCode() + ((iHashCode + (impressionAnalytics != null ? impressionAnalytics.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HomePage(analytics=");
            sb.append(this.f22834a);
            sb.append(", impressionAnalytics=");
            sb.append(this.b);
            sb.append(", items=");
            return android.support.v4.media.session.a.q(")", sb, this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$HorizontalListAnalytics;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HorizontalListAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f22835a;
        public final AnalyticsFields b;

        public HorizontalListAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f22835a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HorizontalListAnalytics)) {
                return false;
            }
            HorizontalListAnalytics horizontalListAnalytics = (HorizontalListAnalytics) obj;
            return Intrinsics.c(this.f22835a, horizontalListAnalytics.f22835a) && Intrinsics.c(this.b, horizontalListAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22835a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("HorizontalListAnalytics(__typename=", this.f22835a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$HorizontalListImpressionAnalytics;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HorizontalListImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f22836a;
        public final AnalyticsFields b;

        public HorizontalListImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f22836a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HorizontalListImpressionAnalytics)) {
                return false;
            }
            HorizontalListImpressionAnalytics horizontalListImpressionAnalytics = (HorizontalListImpressionAnalytics) obj;
            return Intrinsics.c(this.f22836a, horizontalListImpressionAnalytics.f22836a) && Intrinsics.c(this.b, horizontalListImpressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22836a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("HorizontalListImpressionAnalytics(__typename=", this.f22836a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$HorizontalListTrailingLink;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HorizontalListTrailingLink {

        /* renamed from: a, reason: collision with root package name */
        public final LinkTextWithAlt1 f22837a;
        public final String b;
        public final LinkAction1 c;

        public HorizontalListTrailingLink(LinkTextWithAlt1 linkTextWithAlt1, String str, LinkAction1 linkAction1) {
            this.f22837a = linkTextWithAlt1;
            this.b = str;
            this.c = linkAction1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HorizontalListTrailingLink)) {
                return false;
            }
            HorizontalListTrailingLink horizontalListTrailingLink = (HorizontalListTrailingLink) obj;
            return Intrinsics.c(this.f22837a, horizontalListTrailingLink.f22837a) && Intrinsics.c(this.b, horizontalListTrailingLink.b) && Intrinsics.c(this.c, horizontalListTrailingLink.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22837a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return "HorizontalListTrailingLink(linkTextWithAlt=" + this.f22837a + ", linkId=" + this.b + ", linkAction=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Icon;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Icon {

        /* renamed from: a, reason: collision with root package name */
        public final String f22838a;
        public final OnCoreIcon b;
        public final OnHostedIcon c;

        public Icon(String __typename, OnCoreIcon onCoreIcon, OnHostedIcon onHostedIcon) {
            Intrinsics.h(__typename, "__typename");
            this.f22838a = __typename;
            this.b = onCoreIcon;
            this.c = onHostedIcon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) obj;
            return Intrinsics.c(this.f22838a, icon.f22838a) && Intrinsics.c(this.b, icon.b) && Intrinsics.c(this.c, icon.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22838a.hashCode() * 31;
            OnCoreIcon onCoreIcon = this.b;
            int iHashCode2 = (iHashCode + (onCoreIcon == null ? 0 : onCoreIcon.f22865a.hashCode())) * 31;
            OnHostedIcon onHostedIcon = this.c;
            return iHashCode2 + (onHostedIcon != null ? onHostedIcon.f22875a.hashCode() : 0);
        }

        public final String toString() {
            return "Icon(__typename=" + this.f22838a + ", onCoreIcon=" + this.b + ", onHostedIcon=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Impression;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Impression {

        /* renamed from: a, reason: collision with root package name */
        public final String f22839a;
        public final AnalyticsFields b;

        public Impression(String str, AnalyticsFields analyticsFields) {
            this.f22839a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impression)) {
                return false;
            }
            Impression impression = (Impression) obj;
            return Intrinsics.c(this.f22839a, impression.f22839a) && Intrinsics.c(this.b, impression.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22839a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Impression(__typename=", this.f22839a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$ImpressionAnalytics;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f22840a;
        public final AnalyticsFields b;

        public ImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f22840a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImpressionAnalytics)) {
                return false;
            }
            ImpressionAnalytics impressionAnalytics = (ImpressionAnalytics) obj;
            return Intrinsics.c(this.f22840a, impressionAnalytics.f22840a) && Intrinsics.c(this.b, impressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22840a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytics(__typename=", this.f22840a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$ImpressionAnalytics1;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22841a;
        public final AnalyticsFields b;

        public ImpressionAnalytics1(String str, AnalyticsFields analyticsFields) {
            this.f22841a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImpressionAnalytics1)) {
                return false;
            }
            ImpressionAnalytics1 impressionAnalytics1 = (ImpressionAnalytics1) obj;
            return Intrinsics.c(this.f22841a, impressionAnalytics1.f22841a) && Intrinsics.c(this.b, impressionAnalytics1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22841a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytics1(__typename=", this.f22841a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$ImpressionAnalytics2;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22842a;
        public final AnalyticsFields b;

        public ImpressionAnalytics2(String str, AnalyticsFields analyticsFields) {
            this.f22842a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImpressionAnalytics2)) {
                return false;
            }
            ImpressionAnalytics2 impressionAnalytics2 = (ImpressionAnalytics2) obj;
            return Intrinsics.c(this.f22842a, impressionAnalytics2.f22842a) && Intrinsics.c(this.b, impressionAnalytics2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22842a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytics2(__typename=", this.f22842a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$ImpressionAnalytics3;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22843a;
        public final AnalyticsFields b;

        public ImpressionAnalytics3(String str, AnalyticsFields analyticsFields) {
            this.f22843a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImpressionAnalytics3)) {
                return false;
            }
            ImpressionAnalytics3 impressionAnalytics3 = (ImpressionAnalytics3) obj;
            return Intrinsics.c(this.f22843a, impressionAnalytics3.f22843a) && Intrinsics.c(this.b, impressionAnalytics3.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22843a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytics3(__typename=", this.f22843a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$ImpressionAnalytics4;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics4 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22844a;
        public final AnalyticsFields b;

        public ImpressionAnalytics4(String str, AnalyticsFields analyticsFields) {
            this.f22844a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImpressionAnalytics4)) {
                return false;
            }
            ImpressionAnalytics4 impressionAnalytics4 = (ImpressionAnalytics4) obj;
            return Intrinsics.c(this.f22844a, impressionAnalytics4.f22844a) && Intrinsics.c(this.b, impressionAnalytics4.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22844a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytics4(__typename=", this.f22844a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$InStoreDetailsCard;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InStoreDetailsCard {

        /* renamed from: a, reason: collision with root package name */
        public final StoreName f22845a;
        public final StoreTime b;
        public final Boolean c;

        public InStoreDetailsCard(StoreName storeName, StoreTime storeTime, Boolean bool) {
            this.f22845a = storeName;
            this.b = storeTime;
            this.c = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InStoreDetailsCard)) {
                return false;
            }
            InStoreDetailsCard inStoreDetailsCard = (InStoreDetailsCard) obj;
            return Intrinsics.c(this.f22845a, inStoreDetailsCard.f22845a) && Intrinsics.c(this.b, inStoreDetailsCard.b) && Intrinsics.c(this.c, inStoreDetailsCard.c);
        }

        public final int hashCode() {
            StoreName storeName = this.f22845a;
            int iHashCode = (storeName == null ? 0 : storeName.hashCode()) * 31;
            StoreTime storeTime = this.b;
            int iHashCode2 = (iHashCode + (storeTime == null ? 0 : storeTime.hashCode())) * 31;
            Boolean bool = this.c;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InStoreDetailsCard(storeName=");
            sb.append(this.f22845a);
            sb.append(", storeTime=");
            sb.append(this.b);
            sb.append(", isLocationMapped=");
            return au.com.woolworths.android.onesite.a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Item;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f22846a;
        public final OnRegistrationCard b;
        public final OnActionableCard c;
        public final OnInsetBanner d;
        public final OnBasicCoreBroadcastBanner e;
        public final OnRewardsBalanceCard f;
        public final OnBroadcastBanner g;
        public final OnMyShoppingLists h;
        public final OnCarousel i;
        public final OnBoosterHorizontalList j;
        public final OnVideoAdUnit k;
        public final OnHorizontalList l;
        public final OnChatEntryCardV2 m;

        public Item(String __typename, OnRegistrationCard onRegistrationCard, OnActionableCard onActionableCard, OnInsetBanner onInsetBanner, OnBasicCoreBroadcastBanner onBasicCoreBroadcastBanner, OnRewardsBalanceCard onRewardsBalanceCard, OnBroadcastBanner onBroadcastBanner, OnMyShoppingLists onMyShoppingLists, OnCarousel onCarousel, OnBoosterHorizontalList onBoosterHorizontalList, OnVideoAdUnit onVideoAdUnit, OnHorizontalList onHorizontalList, OnChatEntryCardV2 onChatEntryCardV2) {
            Intrinsics.h(__typename, "__typename");
            this.f22846a = __typename;
            this.b = onRegistrationCard;
            this.c = onActionableCard;
            this.d = onInsetBanner;
            this.e = onBasicCoreBroadcastBanner;
            this.f = onRewardsBalanceCard;
            this.g = onBroadcastBanner;
            this.h = onMyShoppingLists;
            this.i = onCarousel;
            this.j = onBoosterHorizontalList;
            this.k = onVideoAdUnit;
            this.l = onHorizontalList;
            this.m = onChatEntryCardV2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f22846a, item.f22846a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c) && Intrinsics.c(this.d, item.d) && Intrinsics.c(this.e, item.e) && Intrinsics.c(this.f, item.f) && Intrinsics.c(this.g, item.g) && Intrinsics.c(this.h, item.h) && Intrinsics.c(this.i, item.i) && Intrinsics.c(this.j, item.j) && Intrinsics.c(this.k, item.k) && Intrinsics.c(this.l, item.l) && Intrinsics.c(this.m, item.m);
        }

        public final int hashCode() {
            int iHashCode = this.f22846a.hashCode() * 31;
            OnRegistrationCard onRegistrationCard = this.b;
            int iHashCode2 = (iHashCode + (onRegistrationCard == null ? 0 : onRegistrationCard.hashCode())) * 31;
            OnActionableCard onActionableCard = this.c;
            int iHashCode3 = (iHashCode2 + (onActionableCard == null ? 0 : onActionableCard.hashCode())) * 31;
            OnInsetBanner onInsetBanner = this.d;
            int iHashCode4 = (iHashCode3 + (onInsetBanner == null ? 0 : onInsetBanner.hashCode())) * 31;
            OnBasicCoreBroadcastBanner onBasicCoreBroadcastBanner = this.e;
            int iHashCode5 = (iHashCode4 + (onBasicCoreBroadcastBanner == null ? 0 : onBasicCoreBroadcastBanner.hashCode())) * 31;
            OnRewardsBalanceCard onRewardsBalanceCard = this.f;
            int iHashCode6 = (iHashCode5 + (onRewardsBalanceCard == null ? 0 : onRewardsBalanceCard.hashCode())) * 31;
            OnBroadcastBanner onBroadcastBanner = this.g;
            int iHashCode7 = (iHashCode6 + (onBroadcastBanner == null ? 0 : onBroadcastBanner.hashCode())) * 31;
            OnMyShoppingLists onMyShoppingLists = this.h;
            int iHashCode8 = (iHashCode7 + (onMyShoppingLists == null ? 0 : onMyShoppingLists.hashCode())) * 31;
            OnCarousel onCarousel = this.i;
            int iHashCode9 = (iHashCode8 + (onCarousel == null ? 0 : onCarousel.f22862a.hashCode())) * 31;
            OnBoosterHorizontalList onBoosterHorizontalList = this.j;
            int iHashCode10 = (iHashCode9 + (onBoosterHorizontalList == null ? 0 : onBoosterHorizontalList.hashCode())) * 31;
            OnVideoAdUnit onVideoAdUnit = this.k;
            int iHashCode11 = (iHashCode10 + (onVideoAdUnit == null ? 0 : onVideoAdUnit.hashCode())) * 31;
            OnHorizontalList onHorizontalList = this.l;
            int iHashCode12 = (iHashCode11 + (onHorizontalList == null ? 0 : onHorizontalList.hashCode())) * 31;
            OnChatEntryCardV2 onChatEntryCardV2 = this.m;
            return iHashCode12 + (onChatEntryCardV2 != null ? onChatEntryCardV2.hashCode() : 0);
        }

        public final String toString() {
            return "Item(__typename=" + this.f22846a + ", onRegistrationCard=" + this.b + ", onActionableCard=" + this.c + ", onInsetBanner=" + this.d + ", onBasicCoreBroadcastBanner=" + this.e + ", onRewardsBalanceCard=" + this.f + ", onBroadcastBanner=" + this.g + ", onMyShoppingLists=" + this.h + ", onCarousel=" + this.i + ", onBoosterHorizontalList=" + this.j + ", onVideoAdUnit=" + this.k + ", onHorizontalList=" + this.l + ", onChatEntryCardV2=" + this.m + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Item1;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22847a;
        public final OnProductCard b;

        public Item1(String __typename, OnProductCard onProductCard) {
            Intrinsics.h(__typename, "__typename");
            this.f22847a = __typename;
            this.b = onProductCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item1)) {
                return false;
            }
            Item1 item1 = (Item1) obj;
            return Intrinsics.c(this.f22847a, item1.f22847a) && Intrinsics.c(this.b, item1.b);
        }

        public final int hashCode() {
            int iHashCode = this.f22847a.hashCode() * 31;
            OnProductCard onProductCard = this.b;
            return iHashCode + (onProductCard == null ? 0 : onProductCard.hashCode());
        }

        public final String toString() {
            return "Item1(__typename=" + this.f22847a + ", onProductCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Item2;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22848a;
        public final OnProductCard1 b;

        public Item2(String __typename, OnProductCard1 onProductCard1) {
            Intrinsics.h(__typename, "__typename");
            this.f22848a = __typename;
            this.b = onProductCard1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item2)) {
                return false;
            }
            Item2 item2 = (Item2) obj;
            return Intrinsics.c(this.f22848a, item2.f22848a) && Intrinsics.c(this.b, item2.b);
        }

        public final int hashCode() {
            int iHashCode = this.f22848a.hashCode() * 31;
            OnProductCard1 onProductCard1 = this.b;
            return iHashCode + (onProductCard1 == null ? 0 : onProductCard1.hashCode());
        }

        public final String toString() {
            return "Item2(__typename=" + this.f22848a + ", onProductCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Item3;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22849a;
        public final OnProductCard2 b;
        public final OnOrderCard c;
        public final OnQuickLinkCard d;
        public final OnRecipeSummaryCard e;
        public final OnRecipeMoreCard f;
        public final OnContentCard g;
        public final OnPromotionCard h;

        public Item3(String __typename, OnProductCard2 onProductCard2, OnOrderCard onOrderCard, OnQuickLinkCard onQuickLinkCard, OnRecipeSummaryCard onRecipeSummaryCard, OnRecipeMoreCard onRecipeMoreCard, OnContentCard onContentCard, OnPromotionCard onPromotionCard) {
            Intrinsics.h(__typename, "__typename");
            this.f22849a = __typename;
            this.b = onProductCard2;
            this.c = onOrderCard;
            this.d = onQuickLinkCard;
            this.e = onRecipeSummaryCard;
            this.f = onRecipeMoreCard;
            this.g = onContentCard;
            this.h = onPromotionCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item3)) {
                return false;
            }
            Item3 item3 = (Item3) obj;
            return Intrinsics.c(this.f22849a, item3.f22849a) && Intrinsics.c(this.b, item3.b) && Intrinsics.c(this.c, item3.c) && Intrinsics.c(this.d, item3.d) && Intrinsics.c(this.e, item3.e) && Intrinsics.c(this.f, item3.f) && Intrinsics.c(this.g, item3.g) && Intrinsics.c(this.h, item3.h);
        }

        public final int hashCode() {
            int iHashCode = this.f22849a.hashCode() * 31;
            OnProductCard2 onProductCard2 = this.b;
            int iHashCode2 = (iHashCode + (onProductCard2 == null ? 0 : onProductCard2.hashCode())) * 31;
            OnOrderCard onOrderCard = this.c;
            int iHashCode3 = (iHashCode2 + (onOrderCard == null ? 0 : onOrderCard.hashCode())) * 31;
            OnQuickLinkCard onQuickLinkCard = this.d;
            int iHashCode4 = (iHashCode3 + (onQuickLinkCard == null ? 0 : onQuickLinkCard.hashCode())) * 31;
            OnRecipeSummaryCard onRecipeSummaryCard = this.e;
            int iHashCode5 = (iHashCode4 + (onRecipeSummaryCard == null ? 0 : onRecipeSummaryCard.hashCode())) * 31;
            OnRecipeMoreCard onRecipeMoreCard = this.f;
            int iHashCode6 = (iHashCode5 + (onRecipeMoreCard == null ? 0 : onRecipeMoreCard.f22884a.hashCode())) * 31;
            OnContentCard onContentCard = this.g;
            int iHashCode7 = (iHashCode6 + (onContentCard == null ? 0 : onContentCard.hashCode())) * 31;
            OnPromotionCard onPromotionCard = this.h;
            return iHashCode7 + (onPromotionCard != null ? onPromotionCard.hashCode() : 0);
        }

        public final String toString() {
            return "Item3(__typename=" + this.f22849a + ", onProductCard=" + this.b + ", onOrderCard=" + this.c + ", onQuickLinkCard=" + this.d + ", onRecipeSummaryCard=" + this.e + ", onRecipeMoreCard=" + this.f + ", onContentCard=" + this.g + ", onPromotionCard=" + this.h + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$LinkAction;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f22850a;
        public final ActionType b;
        public final String c;
        public final Analytics7 d;
        public final String e;

        public LinkAction(String str, ActionType actionType, String str2, Analytics7 analytics7, String str3) {
            this.f22850a = str;
            this.b = actionType;
            this.c = str2;
            this.d = analytics7;
            this.e = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkAction)) {
                return false;
            }
            LinkAction linkAction = (LinkAction) obj;
            return Intrinsics.c(this.f22850a, linkAction.f22850a) && this.b == linkAction.b && Intrinsics.c(this.c, linkAction.c) && Intrinsics.c(this.d, linkAction.d) && Intrinsics.c(this.e, linkAction.e);
        }

        public final int hashCode() {
            int iC = b.c(d.a(this.b, this.f22850a.hashCode() * 31, 31), 31, this.c);
            Analytics7 analytics7 = this.d;
            int iHashCode = (iC + (analytics7 == null ? 0 : analytics7.hashCode())) * 31;
            String str = this.e;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbW = d.w("LinkAction(__typename=", this.f22850a, ", type=", this.b, ", action=");
            sbW.append(this.c);
            sbW.append(", analytics=");
            sbW.append(this.d);
            sbW.append(", id=");
            return YU.a.o(sbW, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$LinkAction1;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkAction1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22851a;
        public final String b;
        public final Analytics8 c;
        public final ActionType d;

        public LinkAction1(String str, String str2, Analytics8 analytics8, ActionType actionType) {
            this.f22851a = str;
            this.b = str2;
            this.c = analytics8;
            this.d = actionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkAction1)) {
                return false;
            }
            LinkAction1 linkAction1 = (LinkAction1) obj;
            return Intrinsics.c(this.f22851a, linkAction1.f22851a) && Intrinsics.c(this.b, linkAction1.b) && Intrinsics.c(this.c, linkAction1.c) && this.d == linkAction1.d;
        }

        public final int hashCode() {
            String str = this.f22851a;
            int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            Analytics8 analytics8 = this.c;
            return this.d.hashCode() + ((iC + (analytics8 != null ? analytics8.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("LinkAction1(id=", this.f22851a, ", action=", this.b, ", analytics=");
            sbV.append(this.c);
            sbV.append(", type=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$LinkCardAction;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkCardAction {

        /* renamed from: a, reason: collision with root package name */
        public final ActionType f22852a;
        public final String b;
        public final Analytics10 c;

        public LinkCardAction(ActionType actionType, String str, Analytics10 analytics10) {
            this.f22852a = actionType;
            this.b = str;
            this.c = analytics10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkCardAction)) {
                return false;
            }
            LinkCardAction linkCardAction = (LinkCardAction) obj;
            return this.f22852a == linkCardAction.f22852a && Intrinsics.c(this.b, linkCardAction.b) && Intrinsics.c(this.c, linkCardAction.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f22852a.hashCode() * 31, 31, this.b);
            Analytics10 analytics10 = this.c;
            return iC + (analytics10 == null ? 0 : analytics10.hashCode());
        }

        public final String toString() {
            StringBuilder sbS = d.s("LinkCardAction(type=", this.f22852a, ", action=", this.b, ", analytics=");
            sbS.append(this.c);
            sbS.append(")");
            return sbS.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$LinkCardAnimation;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkCardAnimation {

        /* renamed from: a, reason: collision with root package name */
        public final String f22853a;
        public final int b;

        public LinkCardAnimation(String str, int i) {
            this.f22853a = str;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkCardAnimation)) {
                return false;
            }
            LinkCardAnimation linkCardAnimation = (LinkCardAnimation) obj;
            return Intrinsics.c(this.f22853a, linkCardAnimation.f22853a) && this.b == linkCardAnimation.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.f22853a.hashCode() * 31);
        }

        public final String toString() {
            return android.support.v4.media.session.a.p("LinkCardAnimation(source=", this.b, this.f22853a, ", playCount=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$LinkTextWithAlt;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkTextWithAlt {

        /* renamed from: a, reason: collision with root package name */
        public final String f22854a;
        public final String b;
        public final String c;

        public LinkTextWithAlt(String str, String str2, String str3) {
            this.f22854a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkTextWithAlt)) {
                return false;
            }
            LinkTextWithAlt linkTextWithAlt = (LinkTextWithAlt) obj;
            return Intrinsics.c(this.f22854a, linkTextWithAlt.f22854a) && Intrinsics.c(this.b, linkTextWithAlt.b) && Intrinsics.c(this.c, linkTextWithAlt.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f22854a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("LinkTextWithAlt(__typename=", this.f22854a, ", text=", this.b, ", altText="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$LinkTextWithAlt1;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkTextWithAlt1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22855a;
        public final String b;

        public LinkTextWithAlt1(String str, String str2) {
            this.f22855a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkTextWithAlt1)) {
                return false;
            }
            LinkTextWithAlt1 linkTextWithAlt1 = (LinkTextWithAlt1) obj;
            return Intrinsics.c(this.f22855a, linkTextWithAlt1.f22855a) && Intrinsics.c(this.b, linkTextWithAlt1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22855a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("LinkTextWithAlt1(altText=", this.f22855a, ", text=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Logo;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Logo {

        /* renamed from: a, reason: collision with root package name */
        public final String f22856a;
        public final String b;

        public Logo(String str, String str2) {
            this.f22856a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Logo)) {
                return false;
            }
            Logo logo = (Logo) obj;
            return Intrinsics.c(this.f22856a, logo.f22856a) && Intrinsics.c(this.b, logo.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22856a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("Logo(imageUrl=", this.f22856a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OffersAlertIndicator;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OffersAlertIndicator {

        /* renamed from: a, reason: collision with root package name */
        public final AlertIndicatorType f22857a;
        public final String b;

        public OffersAlertIndicator(AlertIndicatorType alertIndicatorType, String str) {
            this.f22857a = alertIndicatorType;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OffersAlertIndicator)) {
                return false;
            }
            OffersAlertIndicator offersAlertIndicator = (OffersAlertIndicator) obj;
            return this.f22857a == offersAlertIndicator.f22857a && Intrinsics.c(this.b, offersAlertIndicator.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22857a.hashCode() * 31);
        }

        public final String toString() {
            return "OffersAlertIndicator(indicatorType=" + this.f22857a + ", message=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnActionableCard;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnActionableCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f22858a;
        public final String b;
        public final CardHeight c;
        public final String d;
        public final Boolean e;
        public final TealiumAnalytics f;
        public final ActionableCardImpressionAnalytics g;
        public final ActionableCardClickAnalytics h;

        public OnActionableCard(String str, String str2, CardHeight cardHeight, String str3, Boolean bool, TealiumAnalytics tealiumAnalytics, ActionableCardImpressionAnalytics actionableCardImpressionAnalytics, ActionableCardClickAnalytics actionableCardClickAnalytics) {
            this.f22858a = str;
            this.b = str2;
            this.c = cardHeight;
            this.d = str3;
            this.e = bool;
            this.f = tealiumAnalytics;
            this.g = actionableCardImpressionAnalytics;
            this.h = actionableCardClickAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnActionableCard)) {
                return false;
            }
            OnActionableCard onActionableCard = (OnActionableCard) obj;
            return Intrinsics.c(this.f22858a, onActionableCard.f22858a) && Intrinsics.c(this.b, onActionableCard.b) && this.c == onActionableCard.c && Intrinsics.c(this.d, onActionableCard.d) && Intrinsics.c(this.e, onActionableCard.e) && Intrinsics.c(this.f, onActionableCard.f) && Intrinsics.c(this.g, onActionableCard.g) && Intrinsics.c(this.h, onActionableCard.h);
        }

        public final int hashCode() {
            int iC = b.c(d.b(this.c, b.c(this.f22858a.hashCode() * 31, 31, this.b), 31), 31, this.d);
            Boolean bool = this.e;
            int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
            TealiumAnalytics tealiumAnalytics = this.f;
            int iHashCode2 = (iHashCode + (tealiumAnalytics == null ? 0 : tealiumAnalytics.hashCode())) * 31;
            ActionableCardImpressionAnalytics actionableCardImpressionAnalytics = this.g;
            int iHashCode3 = (iHashCode2 + (actionableCardImpressionAnalytics == null ? 0 : actionableCardImpressionAnalytics.hashCode())) * 31;
            ActionableCardClickAnalytics actionableCardClickAnalytics = this.h;
            return iHashCode3 + (actionableCardClickAnalytics != null ? actionableCardClickAnalytics.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnActionableCard(link=", this.f22858a, ", image=", this.b, ", cardHeight=");
            sbV.append(this.c);
            sbV.append(", altText=");
            sbV.append(this.d);
            sbV.append(", _excluded=");
            sbV.append(this.e);
            sbV.append(", analytics=");
            sbV.append(this.f);
            sbV.append(", actionableCardImpressionAnalytics=");
            sbV.append(this.g);
            sbV.append(", actionableCardClickAnalytics=");
            sbV.append(this.h);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnBasicCoreBroadcastBanner;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBasicCoreBroadcastBanner {

        /* renamed from: a, reason: collision with root package name */
        public final ImpressionAnalytics1 f22859a;
        public final BroadcastBannerDismissAnalytics b;
        public final BroadcastBannerUI c;
        public final BroadcastBannerAction d;
        public final String e;
        public final String f;
        public final boolean g;

        public OnBasicCoreBroadcastBanner(ImpressionAnalytics1 impressionAnalytics1, BroadcastBannerDismissAnalytics broadcastBannerDismissAnalytics, BroadcastBannerUI broadcastBannerUI, BroadcastBannerAction broadcastBannerAction, String str, String str2, boolean z) {
            this.f22859a = impressionAnalytics1;
            this.b = broadcastBannerDismissAnalytics;
            this.c = broadcastBannerUI;
            this.d = broadcastBannerAction;
            this.e = str;
            this.f = str2;
            this.g = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBasicCoreBroadcastBanner)) {
                return false;
            }
            OnBasicCoreBroadcastBanner onBasicCoreBroadcastBanner = (OnBasicCoreBroadcastBanner) obj;
            return Intrinsics.c(this.f22859a, onBasicCoreBroadcastBanner.f22859a) && Intrinsics.c(this.b, onBasicCoreBroadcastBanner.b) && Intrinsics.c(this.c, onBasicCoreBroadcastBanner.c) && Intrinsics.c(this.d, onBasicCoreBroadcastBanner.d) && Intrinsics.c(this.e, onBasicCoreBroadcastBanner.e) && Intrinsics.c(this.f, onBasicCoreBroadcastBanner.f) && this.g == onBasicCoreBroadcastBanner.g;
        }

        public final int hashCode() {
            ImpressionAnalytics1 impressionAnalytics1 = this.f22859a;
            int iHashCode = (impressionAnalytics1 == null ? 0 : impressionAnalytics1.hashCode()) * 31;
            BroadcastBannerDismissAnalytics broadcastBannerDismissAnalytics = this.b;
            int iHashCode2 = (this.c.hashCode() + ((iHashCode + (broadcastBannerDismissAnalytics == null ? 0 : broadcastBannerDismissAnalytics.hashCode())) * 31)) * 31;
            BroadcastBannerAction broadcastBannerAction = this.d;
            int iHashCode3 = (iHashCode2 + (broadcastBannerAction == null ? 0 : broadcastBannerAction.hashCode())) * 31;
            String str = this.e;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            return Boolean.hashCode(this.g) + ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnBasicCoreBroadcastBanner(impressionAnalytics=");
            sb.append(this.f22859a);
            sb.append(", broadcastBannerDismissAnalytics=");
            sb.append(this.b);
            sb.append(", broadcastBannerUI=");
            sb.append(this.c);
            sb.append(", broadcastBannerAction=");
            sb.append(this.d);
            sb.append(", broadcastBannerActionLabel=");
            a.B(sb, this.e, ", broadcastBannerId=", this.f, ", broadcastBannerDismissible=");
            return YU.a.k(")", sb, this.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnBoosterHorizontalList;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBoosterHorizontalList {

        /* renamed from: a, reason: collision with root package name */
        public final String f22860a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final ArrayList f;
        public final ArrayList g;

        public OnBoosterHorizontalList(String str, String str2, String str3, String str4, String str5, ArrayList arrayList, ArrayList arrayList2) {
            this.f22860a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = arrayList;
            this.g = arrayList2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBoosterHorizontalList)) {
                return false;
            }
            OnBoosterHorizontalList onBoosterHorizontalList = (OnBoosterHorizontalList) obj;
            return this.f22860a.equals(onBoosterHorizontalList.f22860a) && this.b.equals(onBoosterHorizontalList.b) && Intrinsics.c(this.c, onBoosterHorizontalList.c) && Intrinsics.c(this.d, onBoosterHorizontalList.d) && Intrinsics.c(this.e, onBoosterHorizontalList.e) && this.f.equals(onBoosterHorizontalList.f) && this.g.equals(onBoosterHorizontalList.g);
        }

        public final int hashCode() {
            int iC = b.c(this.f22860a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            return this.g.hashCode() + androidx.compose.ui.input.pointer.a.b((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.f);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnBoosterHorizontalList(__typename=", this.f22860a, ", title=", this.b, ", subtitle=");
            a.B(sbV, this.c, ", actionTitle=", this.d, ", deepLink=");
            sbV.append(this.e);
            sbV.append(", tigerOfferIds=");
            sbV.append(this.f);
            sbV.append(", items=");
            return android.support.v4.media.session.a.q(")", sbV, this.g);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnBroadcastBanner;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBroadcastBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f22861a;
        public final String b;
        public final String c;
        public final BroadcastBannerType d;
        public final String e;
        public final String f;
        public final String g;
        public final Boolean h;
        public final String i;

        public OnBroadcastBanner(String str, String str2, String str3, BroadcastBannerType broadcastBannerType, String str4, String str5, String str6, Boolean bool, String str7) {
            this.f22861a = str;
            this.b = str2;
            this.c = str3;
            this.d = broadcastBannerType;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = bool;
            this.i = str7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBroadcastBanner)) {
                return false;
            }
            OnBroadcastBanner onBroadcastBanner = (OnBroadcastBanner) obj;
            return Intrinsics.c(this.f22861a, onBroadcastBanner.f22861a) && Intrinsics.c(this.b, onBroadcastBanner.b) && Intrinsics.c(this.c, onBroadcastBanner.c) && this.d == onBroadcastBanner.d && Intrinsics.c(this.e, onBroadcastBanner.e) && Intrinsics.c(this.f, onBroadcastBanner.f) && Intrinsics.c(this.g, onBroadcastBanner.g) && Intrinsics.c(this.h, onBroadcastBanner.h) && Intrinsics.c(this.i, onBroadcastBanner.i);
        }

        public final int hashCode() {
            int iHashCode = this.f22861a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iC = b.c((this.d.hashCode() + ((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.e);
            String str3 = this.f;
            int iHashCode3 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.g;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            Boolean bool = this.h;
            int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
            String str5 = this.i;
            return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnBroadcastBanner(title=", this.f22861a, ", subtitle=", this.b, ", deeplink=");
            sbV.append(this.c);
            sbV.append(", type=");
            sbV.append(this.d);
            sbV.append(", imageUrl=");
            a.B(sbV, this.e, ", actionLabel=", this.f, ", analyticsLabel=");
            au.com.woolworths.android.onesite.a.A(sbV, this.g, ", dismissible=", this.h, ", bannerId=");
            return YU.a.o(sbV, this.i, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnCarousel;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCarousel {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f22862a;

        public OnCarousel(ArrayList arrayList) {
            this.f22862a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCarousel) && this.f22862a.equals(((OnCarousel) obj).f22862a);
        }

        public final int hashCode() {
            return this.f22862a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("OnCarousel(carouselItems=", ")", this.f22862a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnChatEntryCardV2;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnChatEntryCardV2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22863a;
        public final String b;
        public final Boolean c;
        public final String d;
        public final ArrayList e;

        public OnChatEntryCardV2(Boolean bool, String str, String str2, String str3, ArrayList arrayList) {
            this.f22863a = str;
            this.b = str2;
            this.c = bool;
            this.d = str3;
            this.e = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnChatEntryCardV2)) {
                return false;
            }
            OnChatEntryCardV2 onChatEntryCardV2 = (OnChatEntryCardV2) obj;
            return this.f22863a.equals(onChatEntryCardV2.f22863a) && this.b.equals(onChatEntryCardV2.b) && Intrinsics.c(this.c, onChatEntryCardV2.c) && this.d.equals(onChatEntryCardV2.d) && this.e.equals(onChatEntryCardV2.e);
        }

        public final int hashCode() {
            int iC = b.c(this.f22863a.hashCode() * 31, 31, this.b);
            Boolean bool = this.c;
            return this.e.hashCode() + b.c((iC + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnChatEntryCardV2(chatEntryCardTitle=", this.f22863a, ", chatEntryCardSubtitle=", this.b, ", chatEntryCardShowBeta=");
            sbV.append(this.c);
            sbV.append(", chatEntryCardImageUrl=");
            sbV.append(this.d);
            sbV.append(", chatEntryCardCtas=");
            return android.support.v4.media.session.a.q(")", sbV, this.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnContentCard;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnContentCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f22864a;
        public final String b;
        public final String c;
        public final String d;
        public final ContentCardAction e;
        public final ContentCardFooter f;
        public final ContentCardBrandImage g;
        public final Boolean h;
        public final ContentCardSize i;

        public OnContentCard(String str, String str2, String str3, String str4, ContentCardAction contentCardAction, ContentCardFooter contentCardFooter, ContentCardBrandImage contentCardBrandImage, Boolean bool, ContentCardSize contentCardSize) {
            this.f22864a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = contentCardAction;
            this.f = contentCardFooter;
            this.g = contentCardBrandImage;
            this.h = bool;
            this.i = contentCardSize;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnContentCard)) {
                return false;
            }
            OnContentCard onContentCard = (OnContentCard) obj;
            return Intrinsics.c(this.f22864a, onContentCard.f22864a) && Intrinsics.c(this.b, onContentCard.b) && Intrinsics.c(this.c, onContentCard.c) && Intrinsics.c(this.d, onContentCard.d) && Intrinsics.c(this.e, onContentCard.e) && Intrinsics.c(this.f, onContentCard.f) && Intrinsics.c(this.g, onContentCard.g) && Intrinsics.c(this.h, onContentCard.h) && this.i == onContentCard.i;
        }

        public final int hashCode() {
            String str = this.f22864a;
            int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            String str2 = this.c;
            int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            ContentCardAction contentCardAction = this.e;
            int iHashCode3 = (iHashCode2 + (contentCardAction == null ? 0 : contentCardAction.hashCode())) * 31;
            ContentCardFooter contentCardFooter = this.f;
            int iHashCode4 = (iHashCode3 + (contentCardFooter == null ? 0 : contentCardFooter.hashCode())) * 31;
            ContentCardBrandImage contentCardBrandImage = this.g;
            int iHashCode5 = (iHashCode4 + (contentCardBrandImage == null ? 0 : contentCardBrandImage.hashCode())) * 31;
            Boolean bool = this.h;
            int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            ContentCardSize contentCardSize = this.i;
            return iHashCode6 + (contentCardSize != null ? contentCardSize.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnContentCard(contentCardId=", this.f22864a, ", contentCardImageUrl=", this.b, ", contentCardTitle=");
            a.B(sbV, this.c, ", contentCardDescription=", this.d, ", contentCardAction=");
            sbV.append(this.e);
            sbV.append(", contentCardFooter=");
            sbV.append(this.f);
            sbV.append(", contentCardBrandImage=");
            sbV.append(this.g);
            sbV.append(", contentCardIsVideoAvailable=");
            sbV.append(this.h);
            sbV.append(", contentCardSize=");
            sbV.append(this.i);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnCoreIcon;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCoreIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f22865a;

        public OnCoreIcon(String str) {
            this.f22865a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCoreIcon) && Intrinsics.c(this.f22865a, ((OnCoreIcon) obj).f22865a);
        }

        public final int hashCode() {
            return this.f22865a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnCoreIcon(coreIconName=", this.f22865a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnHeroBanner;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHeroBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f22866a;
        public final HeroBannerAction b;
        public final HeroBannerAnalytics c;
        public final HeroBannerImpressionAnalytics d;
        public final String e;
        public final String f;
        public final HeroBannerBody g;
        public final HeroBannerBrandsLogo h;
        public final List i;
        public final ArrayList j;
        public final HeroBannerTermsAndConditions k;
        public final String l;
        public final HeroBannerTitleSize m;

        public OnHeroBanner(String str, HeroBannerAction heroBannerAction, HeroBannerAnalytics heroBannerAnalytics, HeroBannerImpressionAnalytics heroBannerImpressionAnalytics, String str2, String str3, HeroBannerBody heroBannerBody, HeroBannerBrandsLogo heroBannerBrandsLogo, List list, ArrayList arrayList, HeroBannerTermsAndConditions heroBannerTermsAndConditions, String str4, HeroBannerTitleSize heroBannerTitleSize) {
            this.f22866a = str;
            this.b = heroBannerAction;
            this.c = heroBannerAnalytics;
            this.d = heroBannerImpressionAnalytics;
            this.e = str2;
            this.f = str3;
            this.g = heroBannerBody;
            this.h = heroBannerBrandsLogo;
            this.i = list;
            this.j = arrayList;
            this.k = heroBannerTermsAndConditions;
            this.l = str4;
            this.m = heroBannerTitleSize;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnHeroBanner)) {
                return false;
            }
            OnHeroBanner onHeroBanner = (OnHeroBanner) obj;
            return this.f22866a.equals(onHeroBanner.f22866a) && this.b.equals(onHeroBanner.b) && this.c.equals(onHeroBanner.c) && this.d.equals(onHeroBanner.d) && this.e.equals(onHeroBanner.e) && Intrinsics.c(this.f, onHeroBanner.f) && Intrinsics.c(this.g, onHeroBanner.g) && Intrinsics.c(this.h, onHeroBanner.h) && Intrinsics.c(this.i, onHeroBanner.i) && this.j.equals(onHeroBanner.j) && Intrinsics.c(this.k, onHeroBanner.k) && this.l.equals(onHeroBanner.l) && this.m == onHeroBanner.m;
        }

        public final int hashCode() {
            int iC = b.c((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f22866a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
            String str = this.f;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            HeroBannerBody heroBannerBody = this.g;
            int iHashCode2 = (iHashCode + (heroBannerBody == null ? 0 : heroBannerBody.hashCode())) * 31;
            HeroBannerBrandsLogo heroBannerBrandsLogo = this.h;
            int iHashCode3 = (iHashCode2 + (heroBannerBrandsLogo == null ? 0 : heroBannerBrandsLogo.hashCode())) * 31;
            List list = this.i;
            int iB = androidx.compose.ui.input.pointer.a.b((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.j);
            HeroBannerTermsAndConditions heroBannerTermsAndConditions = this.k;
            return this.m.hashCode() + b.c((iB + (heroBannerTermsAndConditions != null ? heroBannerTermsAndConditions.hashCode() : 0)) * 31, 31, this.l);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnHeroBanner(heroBannerId=");
            sb.append(this.f22866a);
            sb.append(", heroBannerAction=");
            sb.append(this.b);
            sb.append(", heroBannerAnalytics=");
            sb.append(this.c);
            sb.append(", heroBannerImpressionAnalytics=");
            sb.append(this.d);
            sb.append(", heroBannerBackgroundColour=");
            a.B(sb, this.e, ", heroBannerTextColour=", this.f, ", heroBannerBody=");
            sb.append(this.g);
            sb.append(", heroBannerBrandsLogo=");
            sb.append(this.h);
            sb.append(", heroBannerGraphics=");
            sb.append(this.i);
            sb.append(", heroBannerImages=");
            sb.append(this.j);
            sb.append(", heroBannerTermsAndConditions=");
            sb.append(this.k);
            sb.append(", heroBannerTitle=");
            sb.append(this.l);
            sb.append(", heroBannerTitleSize=");
            sb.append(this.m);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnHeroBannerBodyText;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHeroBannerBodyText {

        /* renamed from: a, reason: collision with root package name */
        public final String f22867a;

        public OnHeroBannerBodyText(String str) {
            this.f22867a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHeroBannerBodyText) && Intrinsics.c(this.f22867a, ((OnHeroBannerBodyText) obj).f22867a);
        }

        public final int hashCode() {
            return this.f22867a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnHeroBannerBodyText(text=", this.f22867a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnHeroBannerPromoBody;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHeroBannerPromoBody {

        /* renamed from: a, reason: collision with root package name */
        public final String f22868a;
        public final String b;

        public OnHeroBannerPromoBody(String str, String str2) {
            this.f22868a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnHeroBannerPromoBody)) {
                return false;
            }
            OnHeroBannerPromoBody onHeroBannerPromoBody = (OnHeroBannerPromoBody) obj;
            return Intrinsics.c(this.f22868a, onHeroBannerPromoBody.f22868a) && Intrinsics.c(this.b, onHeroBannerPromoBody.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22868a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("OnHeroBannerPromoBody(code=", this.f22868a, ", text=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnHomeDeliveryNowBanner;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHomeDeliveryNowBanner {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f22869a;

        public OnHomeDeliveryNowBanner(Boolean bool) {
            this.f22869a = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHomeDeliveryNowBanner) && Intrinsics.c(this.f22869a, ((OnHomeDeliveryNowBanner) obj).f22869a);
        }

        public final int hashCode() {
            Boolean bool = this.f22869a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            return androidx.compose.ui.input.pointer.a.k(this.f22869a, "OnHomeDeliveryNowBanner(_excluded=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnHomeDeliveryNowBottomBanner;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHomeDeliveryNowBottomBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f22870a;
        public final String b;
        public final String c;
        public final Boolean d;
        public final BannerAsset e;
        public final PrimaryCta f;
        public final SecondaryCta g;

        public OnHomeDeliveryNowBottomBanner(String str, String str2, String str3, Boolean bool, BannerAsset bannerAsset, PrimaryCta primaryCta, SecondaryCta secondaryCta) {
            this.f22870a = str;
            this.b = str2;
            this.c = str3;
            this.d = bool;
            this.e = bannerAsset;
            this.f = primaryCta;
            this.g = secondaryCta;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnHomeDeliveryNowBottomBanner)) {
                return false;
            }
            OnHomeDeliveryNowBottomBanner onHomeDeliveryNowBottomBanner = (OnHomeDeliveryNowBottomBanner) obj;
            return Intrinsics.c(this.f22870a, onHomeDeliveryNowBottomBanner.f22870a) && Intrinsics.c(this.b, onHomeDeliveryNowBottomBanner.b) && Intrinsics.c(this.c, onHomeDeliveryNowBottomBanner.c) && Intrinsics.c(this.d, onHomeDeliveryNowBottomBanner.d) && Intrinsics.c(this.e, onHomeDeliveryNowBottomBanner.e) && Intrinsics.c(this.f, onHomeDeliveryNowBottomBanner.f) && Intrinsics.c(this.g, onHomeDeliveryNowBottomBanner.g);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f22870a.hashCode() * 31, 31, this.b), 31, this.c);
            Boolean bool = this.d;
            int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
            BannerAsset bannerAsset = this.e;
            int iHashCode2 = (iHashCode + (bannerAsset == null ? 0 : bannerAsset.hashCode())) * 31;
            PrimaryCta primaryCta = this.f;
            int iHashCode3 = (iHashCode2 + (primaryCta == null ? 0 : primaryCta.hashCode())) * 31;
            SecondaryCta secondaryCta = this.g;
            return iHashCode3 + (secondaryCta != null ? secondaryCta.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnHomeDeliveryNowBottomBanner(__typename=", this.f22870a, ", bottomSheetTitle=", this.b, ", bottomSheetBody=");
            au.com.woolworths.android.onesite.a.A(sbV, this.c, ", showOnceOnly=", this.d, ", bannerAsset=");
            sbV.append(this.e);
            sbV.append(", primaryCta=");
            sbV.append(this.f);
            sbV.append(", secondaryCta=");
            sbV.append(this.g);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnHomeFulfilmentWindowBanner;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHomeFulfilmentWindowBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f22871a;
        public final FulfilmentWindowStateSubtitle b;
        public final FulfilmentWindowStateButton c;

        public OnHomeFulfilmentWindowBanner(String str, FulfilmentWindowStateSubtitle fulfilmentWindowStateSubtitle, FulfilmentWindowStateButton fulfilmentWindowStateButton) {
            this.f22871a = str;
            this.b = fulfilmentWindowStateSubtitle;
            this.c = fulfilmentWindowStateButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnHomeFulfilmentWindowBanner)) {
                return false;
            }
            OnHomeFulfilmentWindowBanner onHomeFulfilmentWindowBanner = (OnHomeFulfilmentWindowBanner) obj;
            return Intrinsics.c(this.f22871a, onHomeFulfilmentWindowBanner.f22871a) && Intrinsics.c(this.b, onHomeFulfilmentWindowBanner.b) && Intrinsics.c(this.c, onHomeFulfilmentWindowBanner.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22871a.hashCode() * 31;
            FulfilmentWindowStateSubtitle fulfilmentWindowStateSubtitle = this.b;
            return this.c.hashCode() + ((iHashCode + (fulfilmentWindowStateSubtitle == null ? 0 : fulfilmentWindowStateSubtitle.hashCode())) * 31);
        }

        public final String toString() {
            return "OnHomeFulfilmentWindowBanner(fulfilmentWindowStateTitle=" + this.f22871a + ", fulfilmentWindowStateSubtitle=" + this.b + ", fulfilmentWindowStateButton=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnHomeFulfilmentWindowContainer;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHomeFulfilmentWindowContainer {

        /* renamed from: a, reason: collision with root package name */
        public final Button f22872a;
        public final DeliveryNowBanner b;
        public final HomeFulfilmentWindowContainerOrientation c;

        public OnHomeFulfilmentWindowContainer(Button button, DeliveryNowBanner deliveryNowBanner, HomeFulfilmentWindowContainerOrientation homeFulfilmentWindowContainerOrientation) {
            this.f22872a = button;
            this.b = deliveryNowBanner;
            this.c = homeFulfilmentWindowContainerOrientation;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnHomeFulfilmentWindowContainer)) {
                return false;
            }
            OnHomeFulfilmentWindowContainer onHomeFulfilmentWindowContainer = (OnHomeFulfilmentWindowContainer) obj;
            return Intrinsics.c(this.f22872a, onHomeFulfilmentWindowContainer.f22872a) && Intrinsics.c(this.b, onHomeFulfilmentWindowContainer.b) && this.c == onHomeFulfilmentWindowContainer.c;
        }

        public final int hashCode() {
            int iHashCode = this.f22872a.hashCode() * 31;
            DeliveryNowBanner deliveryNowBanner = this.b;
            return this.c.hashCode() + ((iHashCode + (deliveryNowBanner == null ? 0 : deliveryNowBanner.hashCode())) * 31);
        }

        public final String toString() {
            return "OnHomeFulfilmentWindowContainer(button=" + this.f22872a + ", deliveryNowBanner=" + this.b + ", orientation=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnHomeModeSelectorContainer;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHomeModeSelectorContainer {

        /* renamed from: a, reason: collision with root package name */
        public final FulfilmentWindowTile f22873a;
        public final OnlineShoppingModeVariantTile b;
        public final Divider c;
        public final DeliveryNowBanner1 d;
        public final InStoreDetailsCard e;

        public OnHomeModeSelectorContainer(FulfilmentWindowTile fulfilmentWindowTile, OnlineShoppingModeVariantTile onlineShoppingModeVariantTile, Divider divider, DeliveryNowBanner1 deliveryNowBanner1, InStoreDetailsCard inStoreDetailsCard) {
            this.f22873a = fulfilmentWindowTile;
            this.b = onlineShoppingModeVariantTile;
            this.c = divider;
            this.d = deliveryNowBanner1;
            this.e = inStoreDetailsCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnHomeModeSelectorContainer)) {
                return false;
            }
            OnHomeModeSelectorContainer onHomeModeSelectorContainer = (OnHomeModeSelectorContainer) obj;
            return Intrinsics.c(this.f22873a, onHomeModeSelectorContainer.f22873a) && Intrinsics.c(this.b, onHomeModeSelectorContainer.b) && Intrinsics.c(this.c, onHomeModeSelectorContainer.c) && Intrinsics.c(this.d, onHomeModeSelectorContainer.d) && Intrinsics.c(this.e, onHomeModeSelectorContainer.e);
        }

        public final int hashCode() {
            FulfilmentWindowTile fulfilmentWindowTile = this.f22873a;
            int iHashCode = (fulfilmentWindowTile == null ? 0 : fulfilmentWindowTile.hashCode()) * 31;
            OnlineShoppingModeVariantTile onlineShoppingModeVariantTile = this.b;
            int iHashCode2 = (iHashCode + (onlineShoppingModeVariantTile == null ? 0 : onlineShoppingModeVariantTile.hashCode())) * 31;
            Divider divider = this.c;
            int iHashCode3 = (iHashCode2 + (divider == null ? 0 : divider.hashCode())) * 31;
            DeliveryNowBanner1 deliveryNowBanner1 = this.d;
            int iHashCode4 = (iHashCode3 + (deliveryNowBanner1 == null ? 0 : deliveryNowBanner1.hashCode())) * 31;
            InStoreDetailsCard inStoreDetailsCard = this.e;
            return iHashCode4 + (inStoreDetailsCard != null ? inStoreDetailsCard.hashCode() : 0);
        }

        public final String toString() {
            return "OnHomeModeSelectorContainer(fulfilmentWindowTile=" + this.f22873a + ", onlineShoppingModeVariantTile=" + this.b + ", divider=" + this.c + ", deliveryNowBanner=" + this.d + ", inStoreDetailsCard=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnHorizontalList;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHorizontalList {

        /* renamed from: a, reason: collision with root package name */
        public final String f22874a;
        public final HorizontalListTrailingLink b;
        public final HorizontalListAnalytics c;
        public final HorizontalListImpressionAnalytics d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final ArrayList i;

        public OnHorizontalList(String str, HorizontalListTrailingLink horizontalListTrailingLink, HorizontalListAnalytics horizontalListAnalytics, HorizontalListImpressionAnalytics horizontalListImpressionAnalytics, String str2, String str3, String str4, String str5, ArrayList arrayList) {
            this.f22874a = str;
            this.b = horizontalListTrailingLink;
            this.c = horizontalListAnalytics;
            this.d = horizontalListImpressionAnalytics;
            this.e = str2;
            this.f = str3;
            this.g = str4;
            this.h = str5;
            this.i = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnHorizontalList)) {
                return false;
            }
            OnHorizontalList onHorizontalList = (OnHorizontalList) obj;
            return Intrinsics.c(this.f22874a, onHorizontalList.f22874a) && Intrinsics.c(this.b, onHorizontalList.b) && Intrinsics.c(this.c, onHorizontalList.c) && Intrinsics.c(this.d, onHorizontalList.d) && Intrinsics.c(this.e, onHorizontalList.e) && this.f.equals(onHorizontalList.f) && Intrinsics.c(this.g, onHorizontalList.g) && Intrinsics.c(this.h, onHorizontalList.h) && this.i.equals(onHorizontalList.i);
        }

        public final int hashCode() {
            String str = this.f22874a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            HorizontalListTrailingLink horizontalListTrailingLink = this.b;
            int iHashCode2 = (iHashCode + (horizontalListTrailingLink == null ? 0 : horizontalListTrailingLink.hashCode())) * 31;
            HorizontalListAnalytics horizontalListAnalytics = this.c;
            int iHashCode3 = (iHashCode2 + (horizontalListAnalytics == null ? 0 : horizontalListAnalytics.hashCode())) * 31;
            HorizontalListImpressionAnalytics horizontalListImpressionAnalytics = this.d;
            int iHashCode4 = (iHashCode3 + (horizontalListImpressionAnalytics == null ? 0 : horizontalListImpressionAnalytics.hashCode())) * 31;
            String str2 = this.e;
            int iC = b.c((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
            String str3 = this.g;
            int iHashCode5 = (iC + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.h;
            return this.i.hashCode() + ((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnHorizontalList(actionTitle=");
            sb.append(this.f22874a);
            sb.append(", horizontalListTrailingLink=");
            sb.append(this.b);
            sb.append(", horizontalListAnalytics=");
            sb.append(this.c);
            sb.append(", horizontalListImpressionAnalytics=");
            sb.append(this.d);
            sb.append(", id=");
            a.B(sb, this.e, ", title=", this.f, ", subtitle=");
            a.B(sb, this.g, ", deepLink=", this.h, ", items=");
            return android.support.v4.media.session.a.q(")", sb, this.i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnHostedIcon;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f22875a;

        public OnHostedIcon(String str) {
            this.f22875a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon) && Intrinsics.c(this.f22875a, ((OnHostedIcon) obj).f22875a);
        }

        public final int hashCode() {
            return this.f22875a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnHostedIcon(url=", this.f22875a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnInsetBanner;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnInsetBanner {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f22876a;
        public final String b;
        public final String c;
        public final Action d;

        public OnInsetBanner(InsetBannerDisplayType insetBannerDisplayType, String str, String str2, Action action) {
            this.f22876a = insetBannerDisplayType;
            this.b = str;
            this.c = str2;
            this.d = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnInsetBanner)) {
                return false;
            }
            OnInsetBanner onInsetBanner = (OnInsetBanner) obj;
            return this.f22876a == onInsetBanner.f22876a && Intrinsics.c(this.b, onInsetBanner.b) && Intrinsics.c(this.c, onInsetBanner.c) && Intrinsics.c(this.d, onInsetBanner.d);
        }

        public final int hashCode() {
            int iC = b.c(this.f22876a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Action action = this.d;
            return iHashCode + (action != null ? action.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbU = d.u("OnInsetBanner(displayType=", this.f22876a, ", message=", this.b, ", bannerTitle=");
            sbU.append(this.c);
            sbU.append(", action=");
            sbU.append(this.d);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnMyShoppingLists;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMyShoppingLists {

        /* renamed from: a, reason: collision with root package name */
        public final String f22877a;
        public final String b;
        public final String c;
        public final String d;

        public OnMyShoppingLists(String str, String str2, String str3, String str4) {
            this.f22877a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMyShoppingLists)) {
                return false;
            }
            OnMyShoppingLists onMyShoppingLists = (OnMyShoppingLists) obj;
            return Intrinsics.c(this.f22877a, onMyShoppingLists.f22877a) && Intrinsics.c(this.b, onMyShoppingLists.b) && Intrinsics.c(this.c, onMyShoppingLists.c) && Intrinsics.c(this.d, onMyShoppingLists.d);
        }

        public final int hashCode() {
            int iHashCode = this.f22877a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return a.l(YU.a.v("OnMyShoppingLists(myListTitle=", this.f22877a, ", myListSubtitle=", this.b, ", myListActionTitle="), this.c, ", myListDeepLink=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnOrderCard;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOrderCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f22878a;
        public final String b;
        public final String c;
        public final OrderStatus d;
        public final int e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final FulfilmentStatusBanner j;
        public final OrderCardAction k;

        public OnOrderCard(String str, String str2, String str3, OrderStatus orderStatus, int i, String str4, String str5, String str6, String str7, FulfilmentStatusBanner fulfilmentStatusBanner, OrderCardAction orderCardAction) {
            this.f22878a = str;
            this.b = str2;
            this.c = str3;
            this.d = orderStatus;
            this.e = i;
            this.f = str4;
            this.g = str5;
            this.h = str6;
            this.i = str7;
            this.j = fulfilmentStatusBanner;
            this.k = orderCardAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOrderCard)) {
                return false;
            }
            OnOrderCard onOrderCard = (OnOrderCard) obj;
            return Intrinsics.c(this.f22878a, onOrderCard.f22878a) && Intrinsics.c(this.b, onOrderCard.b) && Intrinsics.c(this.c, onOrderCard.c) && this.d == onOrderCard.d && this.e == onOrderCard.e && Intrinsics.c(this.f, onOrderCard.f) && Intrinsics.c(this.g, onOrderCard.g) && Intrinsics.c(this.h, onOrderCard.h) && Intrinsics.c(this.i, onOrderCard.i) && Intrinsics.c(this.j, onOrderCard.j) && Intrinsics.c(this.k, onOrderCard.k);
        }

        public final int hashCode() {
            int iC = b.c(b.c(b.c(b.c(b.a(this.e, (this.d.hashCode() + b.c(b.c(this.f22878a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
            FulfilmentStatusBanner fulfilmentStatusBanner = this.j;
            return this.k.hashCode() + ((iC + (fulfilmentStatusBanner == null ? 0 : fulfilmentStatusBanner.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnOrderCard(__typename=", this.f22878a, ", title=", this.b, ", subtitle=");
            sbV.append(this.c);
            sbV.append(", status=");
            sbV.append(this.d);
            sbV.append(", orderCardId=");
            androidx.compose.ui.input.pointer.a.u(this.e, ", total=", this.f, ", timeLabel=", sbV);
            a.B(sbV, this.g, ", timeValue=", this.h, ", date=");
            sbV.append(this.i);
            sbV.append(", fulfilmentStatusBanner=");
            sbV.append(this.j);
            sbV.append(", orderCardAction=");
            sbV.append(this.k);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnProductCard;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f22879a;
        public final ProductCard b;

        public OnProductCard(String str, ProductCard productCard) {
            this.f22879a = str;
            this.b = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductCard)) {
                return false;
            }
            OnProductCard onProductCard = (OnProductCard) obj;
            return Intrinsics.c(this.f22879a, onProductCard.f22879a) && Intrinsics.c(this.b, onProductCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22879a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OnProductCard(__typename=", this.f22879a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnProductCard1;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22880a;
        public final ProductCard b;

        public OnProductCard1(String str, ProductCard productCard) {
            this.f22880a = str;
            this.b = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductCard1)) {
                return false;
            }
            OnProductCard1 onProductCard1 = (OnProductCard1) obj;
            return Intrinsics.c(this.f22880a, onProductCard1.f22880a) && Intrinsics.c(this.b, onProductCard1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22880a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OnProductCard1(__typename=", this.f22880a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnProductCard2;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22881a;
        public final ProductCard b;

        public OnProductCard2(String str, ProductCard productCard) {
            this.f22881a = str;
            this.b = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductCard2)) {
                return false;
            }
            OnProductCard2 onProductCard2 = (OnProductCard2) obj;
            return Intrinsics.c(this.f22881a, onProductCard2.f22881a) && Intrinsics.c(this.b, onProductCard2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22881a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OnProductCard2(__typename=", this.f22881a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnPromotionCard;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPromotionCard {

        /* renamed from: a, reason: collision with root package name */
        public final PromotionCardProduct f22882a;
        public final String b;
        public final Analytics12 c;
        public final ImpressionAnalytics4 d;

        public OnPromotionCard(PromotionCardProduct promotionCardProduct, String str, Analytics12 analytics12, ImpressionAnalytics4 impressionAnalytics4) {
            this.f22882a = promotionCardProduct;
            this.b = str;
            this.c = analytics12;
            this.d = impressionAnalytics4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPromotionCard)) {
                return false;
            }
            OnPromotionCard onPromotionCard = (OnPromotionCard) obj;
            return Intrinsics.c(this.f22882a, onPromotionCard.f22882a) && Intrinsics.c(this.b, onPromotionCard.b) && Intrinsics.c(this.c, onPromotionCard.c) && Intrinsics.c(this.d, onPromotionCard.d);
        }

        public final int hashCode() {
            int iHashCode = this.f22882a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Analytics12 analytics12 = this.c;
            int iHashCode3 = (iHashCode2 + (analytics12 == null ? 0 : analytics12.hashCode())) * 31;
            ImpressionAnalytics4 impressionAnalytics4 = this.d;
            return iHashCode3 + (impressionAnalytics4 != null ? impressionAnalytics4.hashCode() : 0);
        }

        public final String toString() {
            return "OnPromotionCard(promotionCardProduct=" + this.f22882a + ", promotionCardOfferId=" + this.b + ", analytics=" + this.c + ", impressionAnalytics=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnQuickLinkCard;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnQuickLinkCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f22883a;
        public final String b;
        public final String c;
        public final String d;
        public final LinkCardAction e;
        public final LinkCardAnimation f;
        public final Boolean g;

        public OnQuickLinkCard(String str, String str2, String str3, String str4, LinkCardAction linkCardAction, LinkCardAnimation linkCardAnimation, Boolean bool) {
            this.f22883a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = linkCardAction;
            this.f = linkCardAnimation;
            this.g = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnQuickLinkCard)) {
                return false;
            }
            OnQuickLinkCard onQuickLinkCard = (OnQuickLinkCard) obj;
            return Intrinsics.c(this.f22883a, onQuickLinkCard.f22883a) && Intrinsics.c(this.b, onQuickLinkCard.b) && Intrinsics.c(this.c, onQuickLinkCard.c) && Intrinsics.c(this.d, onQuickLinkCard.d) && Intrinsics.c(this.e, onQuickLinkCard.e) && Intrinsics.c(this.f, onQuickLinkCard.f) && Intrinsics.c(this.g, onQuickLinkCard.g);
        }

        public final int hashCode() {
            int iC = b.c(this.f22883a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode2 = (this.e.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            LinkCardAnimation linkCardAnimation = this.f;
            int iHashCode3 = (iHashCode2 + (linkCardAnimation == null ? 0 : linkCardAnimation.hashCode())) * 31;
            Boolean bool = this.g;
            return iHashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnQuickLinkCard(__typename=", this.f22883a, ", linkCardTitle=", this.b, ", linkCardSubtitle=");
            a.B(sbV, this.c, ", linkCardImage=", this.d, ", linkCardAction=");
            sbV.append(this.e);
            sbV.append(", linkCardAnimation=");
            sbV.append(this.f);
            sbV.append(", isQuickLinkView=");
            return au.com.woolworths.android.onesite.a.o(sbV, this.g, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnRecipeMoreCard;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRecipeMoreCard {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f22884a;

        public OnRecipeMoreCard(ArrayList arrayList) {
            this.f22884a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRecipeMoreCard) && this.f22884a.equals(((OnRecipeMoreCard) obj).f22884a);
        }

        public final int hashCode() {
            return this.f22884a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("OnRecipeMoreCard(actionMetadata=", ")", this.f22884a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnRecipeSource;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRecipeSource {

        /* renamed from: a, reason: collision with root package name */
        public final String f22885a;

        public OnRecipeSource(String str) {
            this.f22885a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRecipeSource) && Intrinsics.c(this.f22885a, ((OnRecipeSource) obj).f22885a);
        }

        public final int hashCode() {
            return this.f22885a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnRecipeSource(source=", this.f22885a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnRecipeSummaryCard;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRecipeSummaryCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f22886a;
        public final RecipeSummaryCardFragment b;

        public OnRecipeSummaryCard(String str, RecipeSummaryCardFragment recipeSummaryCardFragment) {
            this.f22886a = str;
            this.b = recipeSummaryCardFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnRecipeSummaryCard)) {
                return false;
            }
            OnRecipeSummaryCard onRecipeSummaryCard = (OnRecipeSummaryCard) obj;
            return Intrinsics.c(this.f22886a, onRecipeSummaryCard.f22886a) && Intrinsics.c(this.b, onRecipeSummaryCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22886a.hashCode() * 31);
        }

        public final String toString() {
            return "OnRecipeSummaryCard(__typename=" + this.f22886a + ", recipeSummaryCardFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnRecipeTagList;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRecipeTagList {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f22887a;

        public OnRecipeTagList(ArrayList arrayList) {
            this.f22887a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRecipeTagList) && this.f22887a.equals(((OnRecipeTagList) obj).f22887a);
        }

        public final int hashCode() {
            return this.f22887a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("OnRecipeTagList(tags=", ")", this.f22887a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnRegistrationCard;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRegistrationCard {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f22888a;

        public OnRegistrationCard(Boolean bool) {
            this.f22888a = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRegistrationCard) && Intrinsics.c(this.f22888a, ((OnRegistrationCard) obj).f22888a);
        }

        public final int hashCode() {
            Boolean bool = this.f22888a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            return androidx.compose.ui.input.pointer.a.k(this.f22888a, "OnRegistrationCard(_excluded=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnRewardsBalanceCard;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRewardsBalanceCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f22889a;
        public final String b;
        public final String c;
        public final int d;
        public final int e;
        public final String f;
        public final String g;
        public final ArrayList h;
        public final String i;
        public final OffersAlertIndicator j;
        public final PointsAlertIndicator k;

        public OnRewardsBalanceCard(String str, String str2, String str3, int i, int i2, String str4, String str5, ArrayList arrayList, String str6, OffersAlertIndicator offersAlertIndicator, PointsAlertIndicator pointsAlertIndicator) {
            this.f22889a = str;
            this.b = str2;
            this.c = str3;
            this.d = i;
            this.e = i2;
            this.f = str4;
            this.g = str5;
            this.h = arrayList;
            this.i = str6;
            this.j = offersAlertIndicator;
            this.k = pointsAlertIndicator;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnRewardsBalanceCard)) {
                return false;
            }
            OnRewardsBalanceCard onRewardsBalanceCard = (OnRewardsBalanceCard) obj;
            return this.f22889a.equals(onRewardsBalanceCard.f22889a) && this.b.equals(onRewardsBalanceCard.b) && this.c.equals(onRewardsBalanceCard.c) && this.d == onRewardsBalanceCard.d && this.e == onRewardsBalanceCard.e && this.f.equals(onRewardsBalanceCard.f) && this.g.equals(onRewardsBalanceCard.g) && this.h.equals(onRewardsBalanceCard.h) && this.i.equals(onRewardsBalanceCard.i) && Intrinsics.c(this.j, onRewardsBalanceCard.j) && Intrinsics.c(this.k, onRewardsBalanceCard.k);
        }

        public final int hashCode() {
            int iC = b.c(androidx.compose.ui.input.pointer.a.b(b.c(b.c(b.a(this.e, b.a(this.d, b.c(b.c(this.f22889a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
            OffersAlertIndicator offersAlertIndicator = this.j;
            int iHashCode = (iC + (offersAlertIndicator == null ? 0 : offersAlertIndicator.hashCode())) * 31;
            PointsAlertIndicator pointsAlertIndicator = this.k;
            return iHashCode + (pointsAlertIndicator != null ? pointsAlertIndicator.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnRewardsBalanceCard(edrNumber=", this.f22889a, ", rewardsState=", this.b, ", offersTitle=");
            YU.a.x(this.d, this.c, ", currentBalance=", ", goalBalance=", sbV);
            androidx.compose.ui.input.pointer.a.u(this.e, ", actionUrl=", this.f, ", pointsDescriptionFormat=", sbV);
            sbV.append(this.g);
            sbV.append(", pointsDescriptionReplacements=");
            sbV.append(this.h);
            sbV.append(", altText=");
            sbV.append(this.i);
            sbV.append(", offersAlertIndicator=");
            sbV.append(this.j);
            sbV.append(", pointsAlertIndicator=");
            sbV.append(this.k);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnVideoAdUnit;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnVideoAdUnit {

        /* renamed from: a, reason: collision with root package name */
        public final String f22890a;
        public final VideoAdUnitVideoAd b;
        public final VideoAdUnitCarousel c;
        public final VideoAdUnitBottomLink d;

        public OnVideoAdUnit(String str, VideoAdUnitVideoAd videoAdUnitVideoAd, VideoAdUnitCarousel videoAdUnitCarousel, VideoAdUnitBottomLink videoAdUnitBottomLink) {
            this.f22890a = str;
            this.b = videoAdUnitVideoAd;
            this.c = videoAdUnitCarousel;
            this.d = videoAdUnitBottomLink;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnVideoAdUnit)) {
                return false;
            }
            OnVideoAdUnit onVideoAdUnit = (OnVideoAdUnit) obj;
            return Intrinsics.c(this.f22890a, onVideoAdUnit.f22890a) && Intrinsics.c(this.b, onVideoAdUnit.b) && Intrinsics.c(this.c, onVideoAdUnit.c) && Intrinsics.c(this.d, onVideoAdUnit.d);
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.f22890a.hashCode() * 31)) * 31;
            VideoAdUnitCarousel videoAdUnitCarousel = this.c;
            int iHashCode2 = (iHashCode + (videoAdUnitCarousel == null ? 0 : videoAdUnitCarousel.hashCode())) * 31;
            VideoAdUnitBottomLink videoAdUnitBottomLink = this.d;
            return iHashCode2 + (videoAdUnitBottomLink != null ? videoAdUnitBottomLink.hashCode() : 0);
        }

        public final String toString() {
            return "OnVideoAdUnit(__typename=" + this.f22890a + ", videoAdUnitVideoAd=" + this.b + ", videoAdUnitCarousel=" + this.c + ", videoAdUnitBottomLink=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OnlineShoppingModeVariantTile;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnlineShoppingModeVariantTile {

        /* renamed from: a, reason: collision with root package name */
        public final String f22891a;
        public final Title1 b;
        public final Subtitle1 c;
        public final Analytics1 d;

        public OnlineShoppingModeVariantTile(String str, Title1 title1, Subtitle1 subtitle1, Analytics1 analytics1) {
            this.f22891a = str;
            this.b = title1;
            this.c = subtitle1;
            this.d = analytics1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnlineShoppingModeVariantTile)) {
                return false;
            }
            OnlineShoppingModeVariantTile onlineShoppingModeVariantTile = (OnlineShoppingModeVariantTile) obj;
            return Intrinsics.c(this.f22891a, onlineShoppingModeVariantTile.f22891a) && Intrinsics.c(this.b, onlineShoppingModeVariantTile.b) && Intrinsics.c(this.c, onlineShoppingModeVariantTile.c) && Intrinsics.c(this.d, onlineShoppingModeVariantTile.d);
        }

        public final int hashCode() {
            int iHashCode = this.f22891a.hashCode() * 31;
            Title1 title1 = this.b;
            int iHashCode2 = (iHashCode + (title1 == null ? 0 : title1.hashCode())) * 31;
            Subtitle1 subtitle1 = this.c;
            return this.d.f22785a.hashCode() + ((iHashCode2 + (subtitle1 != null ? subtitle1.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "OnlineShoppingModeVariantTile(url=" + this.f22891a + ", title=" + this.b + ", subtitle=" + this.c + ", analytics=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$OrderCardAction;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OrderCardAction {

        /* renamed from: a, reason: collision with root package name */
        public final ActionType f22892a;
        public final String b;
        public final Analytics9 c;

        public OrderCardAction(ActionType actionType, String str, Analytics9 analytics9) {
            this.f22892a = actionType;
            this.b = str;
            this.c = analytics9;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderCardAction)) {
                return false;
            }
            OrderCardAction orderCardAction = (OrderCardAction) obj;
            return this.f22892a == orderCardAction.f22892a && Intrinsics.c(this.b, orderCardAction.b) && Intrinsics.c(this.c, orderCardAction.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f22892a.hashCode() * 31, 31, this.b);
            Analytics9 analytics9 = this.c;
            return iC + (analytics9 == null ? 0 : analytics9.hashCode());
        }

        public final String toString() {
            StringBuilder sbS = d.s("OrderCardAction(type=", this.f22892a, ", action=", this.b, ", analytics=");
            sbS.append(this.c);
            sbS.append(")");
            return sbS.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$PointsAlertIndicator;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PointsAlertIndicator {

        /* renamed from: a, reason: collision with root package name */
        public final AlertIndicatorType f22893a;
        public final String b;

        public PointsAlertIndicator(AlertIndicatorType alertIndicatorType, String str) {
            this.f22893a = alertIndicatorType;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PointsAlertIndicator)) {
                return false;
            }
            PointsAlertIndicator pointsAlertIndicator = (PointsAlertIndicator) obj;
            return this.f22893a == pointsAlertIndicator.f22893a && Intrinsics.c(this.b, pointsAlertIndicator.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22893a.hashCode() * 31);
        }

        public final String toString() {
            return "PointsAlertIndicator(indicatorType=" + this.f22893a + ", message=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$PrimaryCta;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrimaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f22894a;
        public final String b;

        public PrimaryCta(String str, String str2) {
            this.f22894a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrimaryCta)) {
                return false;
            }
            PrimaryCta primaryCta = (PrimaryCta) obj;
            return Intrinsics.c(this.f22894a, primaryCta.f22894a) && Intrinsics.c(this.b, primaryCta.b);
        }

        public final int hashCode() {
            int iHashCode = this.f22894a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return YU.a.j("PrimaryCta(label=", this.f22894a, ", url=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$PromotionCardProduct;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PromotionCardProduct {

        /* renamed from: a, reason: collision with root package name */
        public final String f22895a;
        public final ProductCard b;

        public PromotionCardProduct(String str, ProductCard productCard) {
            this.f22895a = str;
            this.b = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromotionCardProduct)) {
                return false;
            }
            PromotionCardProduct promotionCardProduct = (PromotionCardProduct) obj;
            return Intrinsics.c(this.f22895a, promotionCardProduct.f22895a) && Intrinsics.c(this.b, promotionCardProduct.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22895a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("PromotionCardProduct(__typename=", this.f22895a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$SecondaryCta;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SecondaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f22896a;
        public final String b;

        public SecondaryCta(String str, String str2) {
            this.f22896a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SecondaryCta)) {
                return false;
            }
            SecondaryCta secondaryCta = (SecondaryCta) obj;
            return Intrinsics.c(this.f22896a, secondaryCta.f22896a) && Intrinsics.c(this.b, secondaryCta.b);
        }

        public final int hashCode() {
            int iHashCode = this.f22896a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return YU.a.j("SecondaryCta(label=", this.f22896a, ", url=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$StoreName;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StoreName {

        /* renamed from: a, reason: collision with root package name */
        public final String f22897a;
        public final String b;

        public StoreName(String str, String str2) {
            this.f22897a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StoreName)) {
                return false;
            }
            StoreName storeName = (StoreName) obj;
            return Intrinsics.c(this.f22897a, storeName.f22897a) && Intrinsics.c(this.b, storeName.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22897a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("StoreName(label=", this.f22897a, ", url=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$StoreTime;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StoreTime {

        /* renamed from: a, reason: collision with root package name */
        public final String f22898a;
        public final String b;

        public StoreTime(String str, String str2) {
            this.f22898a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StoreTime)) {
                return false;
            }
            StoreTime storeTime = (StoreTime) obj;
            return Intrinsics.c(this.f22898a, storeTime.f22898a) && Intrinsics.c(this.b, storeTime.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22898a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("StoreTime(label=", this.f22898a, ", url=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Subtitle;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Subtitle {

        /* renamed from: a, reason: collision with root package name */
        public final String f22899a;
        public final String b;

        public Subtitle(String str, String str2) {
            this.f22899a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Subtitle)) {
                return false;
            }
            Subtitle subtitle = (Subtitle) obj;
            return Intrinsics.c(this.f22899a, subtitle.f22899a) && Intrinsics.c(this.b, subtitle.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22899a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("Subtitle(text=", this.f22899a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Subtitle1;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Subtitle1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22900a;
        public final String b;

        public Subtitle1(String str, String str2) {
            this.f22900a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Subtitle1)) {
                return false;
            }
            Subtitle1 subtitle1 = (Subtitle1) obj;
            return Intrinsics.c(this.f22900a, subtitle1.f22900a) && Intrinsics.c(this.b, subtitle1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22900a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("Subtitle1(text=", this.f22900a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$TermsAndConditions;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TermsAndConditions {

        /* renamed from: a, reason: collision with root package name */
        public final String f22901a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final ImpressionAnalytics3 f;

        public TermsAndConditions(String str, String str2, String str3, String str4, String str5, ImpressionAnalytics3 impressionAnalytics3) {
            this.f22901a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = impressionAnalytics3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TermsAndConditions)) {
                return false;
            }
            TermsAndConditions termsAndConditions = (TermsAndConditions) obj;
            return Intrinsics.c(this.f22901a, termsAndConditions.f22901a) && Intrinsics.c(this.b, termsAndConditions.b) && Intrinsics.c(this.c, termsAndConditions.c) && Intrinsics.c(this.d, termsAndConditions.d) && Intrinsics.c(this.e, termsAndConditions.e) && Intrinsics.c(this.f, termsAndConditions.f);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f22901a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            int iC2 = b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
            ImpressionAnalytics3 impressionAnalytics3 = this.f;
            return iC2 + (impressionAnalytics3 != null ? impressionAnalytics3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("TermsAndConditions(__typename=", this.f22901a, ", contentMarkdown=", this.b, ", title=");
            a.B(sbV, this.c, ", buttonText=", this.d, ", accessibilityText=");
            sbV.append(this.e);
            sbV.append(", impressionAnalytics=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Title;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Title {

        /* renamed from: a, reason: collision with root package name */
        public final String f22902a;
        public final String b;

        public Title(String str, String str2) {
            this.f22902a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Title)) {
                return false;
            }
            Title title = (Title) obj;
            return Intrinsics.c(this.f22902a, title.f22902a) && Intrinsics.c(this.b, title.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22902a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("Title(text=", this.f22902a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Title1;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Title1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22903a;
        public final String b;

        public Title1(String str, String str2) {
            this.f22903a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Title1)) {
                return false;
            }
            Title1 title1 = (Title1) obj;
            return Intrinsics.c(this.f22903a, title1.f22903a) && Intrinsics.c(this.b, title1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22903a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("Title1(text=", this.f22903a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$Transcript;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Transcript {

        /* renamed from: a, reason: collision with root package name */
        public final String f22904a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final ImpressionAnalytics2 f;

        public Transcript(String str, String str2, String str3, String str4, String str5, ImpressionAnalytics2 impressionAnalytics2) {
            this.f22904a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = impressionAnalytics2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Transcript)) {
                return false;
            }
            Transcript transcript = (Transcript) obj;
            return Intrinsics.c(this.f22904a, transcript.f22904a) && Intrinsics.c(this.b, transcript.b) && Intrinsics.c(this.c, transcript.c) && Intrinsics.c(this.d, transcript.d) && Intrinsics.c(this.e, transcript.e) && Intrinsics.c(this.f, transcript.f);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f22904a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            int iC2 = b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
            ImpressionAnalytics2 impressionAnalytics2 = this.f;
            return iC2 + (impressionAnalytics2 != null ? impressionAnalytics2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("Transcript(__typename=", this.f22904a, ", contentMarkdown=", this.b, ", title=");
            a.B(sbV, this.c, ", buttonText=", this.d, ", accessibilityText=");
            sbV.append(this.e);
            sbV.append(", impressionAnalytics=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$UnreadChatbotMsg;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnreadChatbotMsg {

        /* renamed from: a, reason: collision with root package name */
        public final int f22905a;

        public UnreadChatbotMsg(int i) {
            this.f22905a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnreadChatbotMsg) && this.f22905a == ((UnreadChatbotMsg) obj).f22905a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f22905a);
        }

        public final String toString() {
            return YU.a.e(this.f22905a, "UnreadChatbotMsg(count=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$VideoAdUnitBottomLink;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VideoAdUnitBottomLink {

        /* renamed from: a, reason: collision with root package name */
        public final String f22906a;
        public final String b;
        public final LinkTextWithAlt c;
        public final LinkAction d;

        public VideoAdUnitBottomLink(String str, String str2, LinkTextWithAlt linkTextWithAlt, LinkAction linkAction) {
            this.f22906a = str;
            this.b = str2;
            this.c = linkTextWithAlt;
            this.d = linkAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoAdUnitBottomLink)) {
                return false;
            }
            VideoAdUnitBottomLink videoAdUnitBottomLink = (VideoAdUnitBottomLink) obj;
            return Intrinsics.c(this.f22906a, videoAdUnitBottomLink.f22906a) && Intrinsics.c(this.b, videoAdUnitBottomLink.b) && Intrinsics.c(this.c, videoAdUnitBottomLink.c) && Intrinsics.c(this.d, videoAdUnitBottomLink.d);
        }

        public final int hashCode() {
            int iHashCode = this.f22906a.hashCode() * 31;
            String str = this.b;
            return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("VideoAdUnitBottomLink(__typename=", this.f22906a, ", linkId=", this.b, ", linkTextWithAlt=");
            sbV.append(this.c);
            sbV.append(", linkAction=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$VideoAdUnitCarousel;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VideoAdUnitCarousel {

        /* renamed from: a, reason: collision with root package name */
        public final String f22907a;
        public final ArrayList b;

        public VideoAdUnitCarousel(String str, ArrayList arrayList) {
            this.f22907a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoAdUnitCarousel)) {
                return false;
            }
            VideoAdUnitCarousel videoAdUnitCarousel = (VideoAdUnitCarousel) obj;
            return this.f22907a.equals(videoAdUnitCarousel.f22907a) && this.b.equals(videoAdUnitCarousel.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22907a.hashCode() * 31);
        }

        public final String toString() {
            return d.q("VideoAdUnitCarousel(__typename=", this.f22907a, ", items=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$VideoAdUnitVideoAd;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VideoAdUnitVideoAd {

        /* renamed from: a, reason: collision with root package name */
        public final String f22908a;
        public final String b;
        public final FallbackImage c;
        public final int d;
        public final Transcript e;
        public final TermsAndConditions f;
        public final Analytics6 g;
        public final EventAnalytics h;

        public VideoAdUnitVideoAd(String str, String str2, FallbackImage fallbackImage, int i, Transcript transcript, TermsAndConditions termsAndConditions, Analytics6 analytics6, EventAnalytics eventAnalytics) {
            this.f22908a = str;
            this.b = str2;
            this.c = fallbackImage;
            this.d = i;
            this.e = transcript;
            this.f = termsAndConditions;
            this.g = analytics6;
            this.h = eventAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoAdUnitVideoAd)) {
                return false;
            }
            VideoAdUnitVideoAd videoAdUnitVideoAd = (VideoAdUnitVideoAd) obj;
            return Intrinsics.c(this.f22908a, videoAdUnitVideoAd.f22908a) && Intrinsics.c(this.b, videoAdUnitVideoAd.b) && Intrinsics.c(this.c, videoAdUnitVideoAd.c) && this.d == videoAdUnitVideoAd.d && Intrinsics.c(this.e, videoAdUnitVideoAd.e) && Intrinsics.c(this.f, videoAdUnitVideoAd.f) && Intrinsics.c(this.g, videoAdUnitVideoAd.g) && Intrinsics.c(this.h, videoAdUnitVideoAd.h);
        }

        public final int hashCode() {
            int iC = b.c(this.f22908a.hashCode() * 31, 31, this.b);
            FallbackImage fallbackImage = this.c;
            int iA = b.a(this.d, (iC + (fallbackImage == null ? 0 : fallbackImage.hashCode())) * 31, 31);
            Transcript transcript = this.e;
            int iHashCode = (iA + (transcript == null ? 0 : transcript.hashCode())) * 31;
            TermsAndConditions termsAndConditions = this.f;
            int iHashCode2 = (iHashCode + (termsAndConditions == null ? 0 : termsAndConditions.hashCode())) * 31;
            Analytics6 analytics6 = this.g;
            int iHashCode3 = (iHashCode2 + (analytics6 == null ? 0 : analytics6.hashCode())) * 31;
            EventAnalytics eventAnalytics = this.h;
            return iHashCode3 + (eventAnalytics != null ? eventAnalytics.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("VideoAdUnitVideoAd(__typename=", this.f22908a, ", url=", this.b, ", fallbackImage=");
            sbV.append(this.c);
            sbV.append(", duration=");
            sbV.append(this.d);
            sbV.append(", transcript=");
            sbV.append(this.e);
            sbV.append(", termsAndConditions=");
            sbV.append(this.f);
            sbV.append(", analytics=");
            sbV.append(this.g);
            sbV.append(", eventAnalytics=");
            sbV.append(this.h);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$VideoErrorImpression;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VideoErrorImpression {

        /* renamed from: a, reason: collision with root package name */
        public final String f22909a;
        public final AnalyticsFields b;

        public VideoErrorImpression(String str, AnalyticsFields analyticsFields) {
            this.f22909a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoErrorImpression)) {
                return false;
            }
            VideoErrorImpression videoErrorImpression = (VideoErrorImpression) obj;
            return Intrinsics.c(this.f22909a, videoErrorImpression.f22909a) && Intrinsics.c(this.b, videoErrorImpression.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22909a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("VideoErrorImpression(__typename=", this.f22909a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$VideoPause;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VideoPause {

        /* renamed from: a, reason: collision with root package name */
        public final String f22910a;
        public final AnalyticsFields b;

        public VideoPause(String str, AnalyticsFields analyticsFields) {
            this.f22910a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoPause)) {
                return false;
            }
            VideoPause videoPause = (VideoPause) obj;
            return Intrinsics.c(this.f22910a, videoPause.f22910a) && Intrinsics.c(this.b, videoPause.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22910a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("VideoPause(__typename=", this.f22910a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeContentPageQuery$VideoPlay;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VideoPlay {

        /* renamed from: a, reason: collision with root package name */
        public final String f22911a;
        public final AnalyticsFields b;

        public VideoPlay(String str, AnalyticsFields analyticsFields) {
            this.f22911a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoPlay)) {
                return false;
            }
            VideoPlay videoPlay = (VideoPlay) obj;
            return Intrinsics.c(this.f22911a, videoPlay.f22911a) && Intrinsics.c(this.b, videoPlay.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22911a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("VideoPlay(__typename=", this.f22911a, ", analyticsFields=", this.b, ")");
        }
    }

    public HomeContentPageQuery(HomePageInput homePageInput, ShoppingModeType shoppingModeType, Optional optional, Optional optional2, Optional optional3, boolean z, boolean z2, boolean z3, boolean z4, Optional optional4, boolean z5, boolean z6, boolean z7) {
        this.f22779a = homePageInput;
        this.b = shoppingModeType;
        this.c = optional;
        this.d = optional2;
        this.e = optional3;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        Optional.Absent absent = Optional.Absent.f13523a;
        this.j = absent;
        this.k = absent;
        this.l = absent;
        this.m = optional4;
        this.n = z5;
        this.o = z6;
        this.p = z7;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(HomeContentPageQuery_ResponseAdapter.Data.f23032a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query HomeContentPage($homePageInput: HomePageInput!, $mode: ShoppingModeType!, $storeId: String, $supportedLinks: [String!], $catalogueStoreId: String, $includeCatalogueCard: Boolean!, $includeProductAvailabilityStates: Boolean!, $includeBroadcastBanner: Boolean!, $includeOfferMinimumSpend: Boolean!, $isWiFiProfileInstalled: Boolean!, $includeVideoAdUnit: Boolean!, $includeAvailabilityInfoStatus: Boolean! = false , $includeCartProductInfo: Boolean! = false , $isVideoTagOnRecipeCardEnabled: Boolean! = false , $includePricingFootnote: Boolean! = false , $includeLowestPrice14Days: Boolean!, $includeCampaignAnimation: Boolean!, $includeChatEntryCard: Boolean!) { home(mode: $mode, catalogueStoreId: $catalogueStoreId, storeId: $storeId, supportedLinks: $supportedLinks, isWiFiProfileInstalled: $isWiFiProfileInstalled) { headerItems { __typename ... on HomeFulfilmentWindowBanner { fulfilmentWindowStateTitle fulfilmentWindowStateSubtitle { text altText } fulfilmentWindowStateButton { label style enabled action url } } ... on HomeFulfilmentWindowContainer { button { __typename label style enabled action url } deliveryNowBanner { _excluded: _ } orientation } ... on HomeModeSelectorContainer { fulfilmentWindowTile { style iconUrl url title { text altText } subtitle { text altText } analytics { label } } onlineShoppingModeVariantTile { url title { text altText } subtitle { text altText } analytics { label } } divider { _excluded: _ } deliveryNowBanner { __typename ... on HomeDeliveryNowBottomBanner { __typename bottomSheetTitle bottomSheetBody showOnceOnly bannerAsset { assetType assetUrl assetWidth assetHeight fit altText } primaryCta { label url } secondaryCta { label url } } ... on HomeDeliveryNowBanner { _excluded: _ } } inStoreDetailsCard { storeName { label url } storeTime { label url } isLocationMapped } } } deliveryNow { status expressDeliveryStoreId } unreadChatbotMsg { count } } homePage(homePageInput: $homePageInput) { analytics { __typename ...analyticsFields } impressionAnalytics { __typename ...analyticsFields } items { __typename ... on RegistrationCard { _excluded } ... on ActionableCard { link image cardHeight altText _excluded analytics actionableCardImpressionAnalytics { __typename ...analyticsFields } actionableCardClickAnalytics { __typename ...analyticsFields } } ... on InsetBanner { displayType message bannerTitle: title action { placement type label url } } ... on BasicCoreBroadcastBanner { impressionAnalytics { __typename ...analyticsFields } broadcastBannerDismissAnalytics { __typename ...analyticsFields } broadcastBannerUI { title subtitle style icon { __typename ... on CoreIcon { coreIconName } ... on HostedIcon { url } } } broadcastBannerAction { action id type analytics { __typename ...analyticsFields } } broadcastBannerActionLabel broadcastBannerId broadcastBannerDismissible } ... on RewardsBalanceCard { edrNumber rewardsState offersTitle currentBalance goalBalance actionUrl pointsDescriptionFormat pointsDescriptionReplacements altText offersAlertIndicator { indicatorType message } pointsAlertIndicator { indicatorType message } } ... on BroadcastBanner { title subtitle deeplink type imageUrl actionLabel analyticsLabel dismissible bannerId } ... on MyShoppingLists { myListTitle myListSubtitle myListActionTitle myListDeepLink } ... on Carousel { carouselItems { __typename ... on HeroBanner { heroBannerId heroBannerAction { action analytics { __typename ...analyticsFields } type } heroBannerAnalytics { __typename ...analyticsFields extraContent { key value } } heroBannerImpressionAnalytics { __typename ...analyticsFields } heroBannerBackgroundColour heroBannerTextColour heroBannerBody { __typename ... on HeroBannerBodyText { text } ... on HeroBannerPromoBody { code text } } heroBannerBrandsLogo { imageUrl altText } heroBannerGraphics { imageUrl altText } heroBannerImages { imageUrl altText } heroBannerTermsAndConditions { text heroBannerTermsAndConditionAction: action { action type id analytics { __typename ...analyticsFields } } } heroBannerTitle heroBannerTitleSize } } } ... on RegistrationCard { _excluded } ... on BoosterHorizontalList { __typename title subtitle actionTitle deepLink tigerOfferIds items { __typename ... on ProductCard { __typename ...productCard } } } ... on VideoAdUnit @include(if: $includeVideoAdUnit) { __typename videoAdUnitVideoAd { __typename url fallbackImage { imageUrl altText } duration transcript { __typename contentMarkdown title buttonText accessibilityText impressionAnalytics { __typename ...analyticsFields } } termsAndConditions { __typename contentMarkdown title buttonText accessibilityText impressionAnalytics { __typename ...analyticsFields } } analytics { __typename ...analyticsFields } eventAnalytics { impression { __typename ...analyticsFields } videoPlay { __typename ...analyticsFields } videoPause { __typename ...analyticsFields } videoErrorImpression { __typename ...analyticsFields } } } videoAdUnitCarousel { __typename items { __typename ... on ProductCard { __typename ...productCard } } } videoAdUnitBottomLink { __typename linkId linkTextWithAlt { __typename text altText } linkAction { __typename type action analytics { __typename ...analyticsFields } id } } } ... on HorizontalList { actionTitle horizontalListTrailingLink { linkTextWithAlt { altText text } linkId linkAction { id action analytics { __typename ...analyticsFields } type } } horizontalListAnalytics { __typename ...analyticsFields } horizontalListImpressionAnalytics { __typename ...analyticsFields } id title subtitle actionTitle deepLink items { __typename ... on ProductCard { __typename ...productCard } ... on OrderCard { __typename title subtitle status orderCardId total timeLabel timeValue date fulfilmentStatusBanner { text buttonLabel } orderCardAction { type action analytics { __typename ...analyticsFields } } } ... on QuickLinkCard { __typename linkCardTitle linkCardSubtitle linkCardImage linkCardAction { type action analytics { __typename ...analyticsFields } } linkCardAnimation @include(if: $includeCampaignAnimation) { source playCount } isQuickLinkView } ... on RecipeSummaryCard { __typename ...recipeSummaryCardFragment } ... on RecipeMoreCard { actionMetadata { __typename ... on RecipeTagList { tags } ... on RecipeSource { source } } } ... on ContentCard { contentCardId contentCardImageUrl contentCardTitle contentCardDescription contentCardAction { type action analytics { __typename ...analyticsFields } } contentCardFooter { style text logo { imageUrl altText } } contentCardBrandImage { imageUrl altText } contentCardIsVideoAvailable contentCardSize } ... on PromotionCard { promotionCardProduct { __typename ...productCard } promotionCardOfferId analytics { __typename ...analyticsFields } impressionAnalytics { __typename ...analyticsFields } } } } ... on ChatEntryCardV2 @include(if: $includeChatEntryCard) { chatEntryCardTitle chatEntryCardSubtitle chatEntryCardShowBeta chatEntryCardImageUrl chatEntryCardCtas { chatEntryCardCtaIconUrl chatEntryCardPrompts chatEntryCardElement chatEntryCardContext { source data { key value } } chatEntryCardAction { id action type analytics { __typename ...analyticsFields } } } } } } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }  fragment recipeSummaryCardFragment on RecipeSummaryCard { title image id tags sourceName isVideoAvailable @include(if: $isVideoTagOnRecipeCardEnabled) recipePrepDuration { duration altText } recipeCookDuration { duration altText } recipeCostPerServe { recipeCostPerServePrice } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeContentPageQuery)) {
            return false;
        }
        HomeContentPageQuery homeContentPageQuery = (HomeContentPageQuery) obj;
        return this.f22779a.equals(homeContentPageQuery.f22779a) && this.b == homeContentPageQuery.b && this.c.equals(homeContentPageQuery.c) && this.d.equals(homeContentPageQuery.d) && this.e.equals(homeContentPageQuery.e) && this.f == homeContentPageQuery.f && this.g == homeContentPageQuery.g && this.h == homeContentPageQuery.h && this.i == homeContentPageQuery.i && this.j.equals(homeContentPageQuery.j) && this.k.equals(homeContentPageQuery.k) && this.l.equals(homeContentPageQuery.l) && this.m.equals(homeContentPageQuery.m) && this.n == homeContentPageQuery.n && this.o == homeContentPageQuery.o && this.p == homeContentPageQuery.p;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.p) + b.e(b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.m, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.l, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.k, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.j, b.e(b.e(b.e(b.e(b.e(b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.e, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.d, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.c, (this.b.hashCode() + (this.f22779a.hashCode() * 31)) * 31, 31), 31), 31), 31, this.f), 31, false), 31, this.g), 31, true), 31, this.h), 31, this.i), 31), 31), 31), 31), 31, this.n), 31, this.o);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "5425d980e4e84bf089e0082e9bb423eee44c80063490ff4704d5b6e64d7e08da";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "HomeContentPage";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("homePageInput");
        Adapters.c(HomePageInput_InputAdapter.f12079a, false).toJson(jsonWriter, customScalarAdapters, this.f22779a);
        jsonWriter.F1("mode");
        ShoppingModeType_ResponseAdapter.b(jsonWriter, customScalarAdapters, this.b);
        Optional optional = this.c;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("storeId");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
        Optional optional2 = this.d;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("supportedLinks");
            Adapters.d(Adapters.b(Adapters.a(Adapters.f13493a))).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        }
        Optional optional3 = this.e;
        if (optional3 instanceof Optional.Present) {
            jsonWriter.F1("catalogueStoreId");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional3);
        }
        jsonWriter.F1("includeCatalogueCard");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        d.B(this.f, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeProductAvailabilityStates");
        Boolean bool = Boolean.FALSE;
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, bool);
        jsonWriter.F1("includeBroadcastBanner");
        d.B(this.g, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeOfferMinimumSpend");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.TRUE);
        jsonWriter.F1("isWiFiProfileInstalled");
        d.B(this.h, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeVideoAdUnit");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.i));
        Optional optional4 = this.j;
        if (optional4 instanceof Optional.Present) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional4);
        } else if (z) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, bool);
        }
        Optional optional5 = this.k;
        if (optional5 instanceof Optional.Present) {
            jsonWriter.F1("includeCartProductInfo");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional5);
        } else if (z) {
            jsonWriter.F1("includeCartProductInfo");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, bool);
        }
        Optional optional6 = this.l;
        if (optional6 instanceof Optional.Present) {
            jsonWriter.F1("isVideoTagOnRecipeCardEnabled");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional6);
        } else if (z) {
            jsonWriter.F1("isVideoTagOnRecipeCardEnabled");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, bool);
        }
        Optional optional7 = this.m;
        if (optional7 instanceof Optional.Present) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional7);
        } else if (z) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, bool);
        }
        jsonWriter.F1("includeLowestPrice14Days");
        d.B(this.n, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeCampaignAnimation");
        d.B(this.o, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeChatEntryCard");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.p));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeContentPageQuery(homePageInput=");
        sb.append(this.f22779a);
        sb.append(", mode=");
        sb.append(this.b);
        sb.append(", storeId=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, this.c, ", supportedLinks=", this.d, ", catalogueStoreId=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.y(sb, this.e, ", includeCatalogueCard=", this.f, ", includeProductAvailabilityStates=false, includeBroadcastBanner=");
        au.com.woolworths.android.onesite.a.D(sb, this.g, ", includeOfferMinimumSpend=true, isWiFiProfileInstalled=", this.h, ", includeVideoAdUnit=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.z(sb, this.i, ", includeAvailabilityInfoStatus=", this.j, ", includeCartProductInfo=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, this.k, ", isVideoTagOnRecipeCardEnabled=", this.l, ", includePricingFootnote=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.y(sb, this.m, ", includeLowestPrice14Days=", this.n, ", includeCampaignAnimation=");
        return au.com.woolworths.android.onesite.a.q(sb, this.o, ", includeChatEntryCard=", this.p, ")");
    }
}
