package com.woolworths.shop.homepage;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.graphql.TealiumAnalytics;
import au.com.woolworths.android.onesite.graphql.GoogleAdCustomTargeting;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragment;
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
import au.com.woolworths.shop.graphql.type.ShoppingModeType;
import au.com.woolworths.shop.graphql.type.adapter.ShoppingModeType_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.homepage.adapter.HomeQuery_ResponseAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bY\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:X\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ¨\u0006["}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/homepage/HomeQuery$Data;", "Data", "Home", "HeaderItem", "OnHomeFulfilmentWindowBanner", "FulfilmentWindowStateSubtitle", "FulfilmentWindowStateButton", "OnHomeFulfilmentWindowContainer", "Button", "DeliveryNowBanner", "OnHomeModeSelectorContainer", "FulfilmentWindowTile", "Title", "Subtitle", "Analytics", "OnlineShoppingModeVariantTile", "Title1", "Subtitle1", "Analytics1", "Divider", "DeliveryNowBanner1", "OnHomeDeliveryNowBottomBanner", "BannerAsset", "PrimaryCta", "SecondaryCta", "OnHomeDeliveryNowBanner", "InStoreDetailsCard", "StoreName", "StoreTime", "Analytic", "OnAdobeTargetAnalytics", "OnOrderAnalytics", "DeliveryNow", "Item", "OnCarousel", "CarouselItem", "OnHeroBanner", "HeroBannerAction", "Analytics2", "HeroBannerAnalytics", "ExtraContent", "HeroBannerImpressionAnalytics", "HeroBannerBody", "OnHeroBannerBodyText", "OnHeroBannerPromoBody", "HeroBannerBrandsLogo", "HeroBannerGraphic", "HeroBannerImage", "HeroBannerTermsAndConditions", "HeroBannerTermsAndConditionAction", "Analytics3", "OnRegistrationCard", "OnRewardsBalanceCard", "OffersAlertIndicator", "PointsAlertIndicator", "OnAddRewardsCard", "OnBroadcastBanner", "OnDividerCard", "OnInsetBanner", "Action", "OnCatalogueCard", "OnMarketplaceCard", "OnQuickLinkHorizontalList", "Item1", "OnQuickLinkCard", "LinkCardAction", "LinkCardAnimation", "OnMyShoppingLists", "OnActionableCard", "OnGoogleAdBannerCard", "OnRecipeHorizontalList", "Item2", "OnRecipeSummaryCard", "OnRecipeMoreCard", "ActionMetadatum", "OnRecipeTagList", "OnRecipeSource", "OnOrderHorizontalList", "Item3", "OnOrderCard", "FulfilmentStatusBanner", "OnProductHorizontalList", "Item4", "OnProductCard", "OnBoosterHorizontalList", "Item5", "OnProductCard1", "UnreadChatbotMsg", "Companion", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HomeQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final ShoppingModeType f22912a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final boolean e;
    public final boolean f;
    public final Optional g;
    public final boolean h;
    public final Optional i;
    public final Optional j;
    public final Optional k;
    public final boolean l;
    public final Optional m;
    public final boolean n;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$Action;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: a, reason: collision with root package name */
        public final String f22913a;
        public final InsetBannerActionType b;
        public final InsetBannerActionPlacement c;
        public final String d;

        public Action(InsetBannerActionPlacement insetBannerActionPlacement, InsetBannerActionType insetBannerActionType, String str, String str2) {
            this.f22913a = str;
            this.b = insetBannerActionType;
            this.c = insetBannerActionPlacement;
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
            return Intrinsics.c(this.f22913a, action.f22913a) && this.b == action.b && this.c == action.c && Intrinsics.c(this.d, action.d);
        }

        public final int hashCode() {
            String str = this.f22913a;
            return this.d.hashCode() + ((this.c.hashCode() + d.c(this.b, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31);
        }

        public final String toString() {
            return "Action(url=" + this.f22913a + ", type=" + this.b + ", placement=" + this.c + ", label=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$ActionMetadatum;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActionMetadatum {

        /* renamed from: a, reason: collision with root package name */
        public final String f22914a;
        public final OnRecipeTagList b;
        public final OnRecipeSource c;

        public ActionMetadatum(String __typename, OnRecipeTagList onRecipeTagList, OnRecipeSource onRecipeSource) {
            Intrinsics.h(__typename, "__typename");
            this.f22914a = __typename;
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
            return Intrinsics.c(this.f22914a, actionMetadatum.f22914a) && Intrinsics.c(this.b, actionMetadatum.b) && Intrinsics.c(this.c, actionMetadatum.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22914a.hashCode() * 31;
            OnRecipeTagList onRecipeTagList = this.b;
            int iHashCode2 = (iHashCode + (onRecipeTagList == null ? 0 : onRecipeTagList.f22986a.hashCode())) * 31;
            OnRecipeSource onRecipeSource = this.c;
            return iHashCode2 + (onRecipeSource != null ? onRecipeSource.f22984a.hashCode() : 0);
        }

        public final String toString() {
            return "ActionMetadatum(__typename=" + this.f22914a + ", onRecipeTagList=" + this.b + ", onRecipeSource=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$Analytic;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytic {

        /* renamed from: a, reason: collision with root package name */
        public final String f22915a;
        public final OnAdobeTargetAnalytics b;
        public final OnOrderAnalytics c;

        public Analytic(String __typename, OnAdobeTargetAnalytics onAdobeTargetAnalytics, OnOrderAnalytics onOrderAnalytics) {
            Intrinsics.h(__typename, "__typename");
            this.f22915a = __typename;
            this.b = onAdobeTargetAnalytics;
            this.c = onOrderAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytic)) {
                return false;
            }
            Analytic analytic = (Analytic) obj;
            return Intrinsics.c(this.f22915a, analytic.f22915a) && Intrinsics.c(this.b, analytic.b) && Intrinsics.c(this.c, analytic.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22915a.hashCode() * 31;
            OnAdobeTargetAnalytics onAdobeTargetAnalytics = this.b;
            int iHashCode2 = (iHashCode + (onAdobeTargetAnalytics == null ? 0 : onAdobeTargetAnalytics.hashCode())) * 31;
            OnOrderAnalytics onOrderAnalytics = this.c;
            return iHashCode2 + (onOrderAnalytics != null ? onOrderAnalytics.hashCode() : 0);
        }

        public final String toString() {
            return "Analytic(__typename=" + this.f22915a + ", onAdobeTargetAnalytics=" + this.b + ", onOrderAnalytics=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$Analytics;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f22916a;

        public Analytics(String str) {
            this.f22916a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Analytics) && Intrinsics.c(this.f22916a, ((Analytics) obj).f22916a);
        }

        public final int hashCode() {
            return this.f22916a.hashCode();
        }

        public final String toString() {
            return a.h("Analytics(label=", this.f22916a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$Analytics1;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22917a;

        public Analytics1(String str) {
            this.f22917a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Analytics1) && Intrinsics.c(this.f22917a, ((Analytics1) obj).f22917a);
        }

        public final int hashCode() {
            return this.f22917a.hashCode();
        }

        public final String toString() {
            return a.h("Analytics1(label=", this.f22917a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$Analytics2;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22918a;
        public final AnalyticsFields b;

        public Analytics2(String str, AnalyticsFields analyticsFields) {
            this.f22918a = str;
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
            return Intrinsics.c(this.f22918a, analytics2.f22918a) && Intrinsics.c(this.b, analytics2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22918a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics2(__typename=", this.f22918a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$Analytics3;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22919a;
        public final AnalyticsFields b;

        public Analytics3(String str, AnalyticsFields analyticsFields) {
            this.f22919a = str;
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
            return Intrinsics.c(this.f22919a, analytics3.f22919a) && Intrinsics.c(this.b, analytics3.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22919a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics3(__typename=", this.f22919a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$BannerAsset;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BannerAsset {

        /* renamed from: a, reason: collision with root package name */
        public final DownloadableAssetType f22920a;
        public final String b;
        public final int c;
        public final int d;
        public final DownloadableAssetFit e;
        public final String f;

        public BannerAsset(DownloadableAssetType downloadableAssetType, String str, int i, int i2, DownloadableAssetFit downloadableAssetFit, String str2) {
            this.f22920a = downloadableAssetType;
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
            return this.f22920a == bannerAsset.f22920a && Intrinsics.c(this.b, bannerAsset.b) && this.c == bannerAsset.c && this.d == bannerAsset.d && this.e == bannerAsset.e && Intrinsics.c(this.f, bannerAsset.f);
        }

        public final int hashCode() {
            int iA = b.a(this.d, b.a(this.c, b.c(this.f22920a.hashCode() * 31, 31, this.b), 31), 31);
            DownloadableAssetFit downloadableAssetFit = this.e;
            int iHashCode = (iA + (downloadableAssetFit == null ? 0 : downloadableAssetFit.hashCode())) * 31;
            String str = this.f;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BannerAsset(assetType=");
            sb.append(this.f22920a);
            sb.append(", assetUrl=");
            sb.append(this.b);
            sb.append(", assetWidth=");
            a.w(this.c, this.d, ", assetHeight=", ", fit=", sb);
            sb.append(this.e);
            sb.append(", altText=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$Button;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Button {

        /* renamed from: a, reason: collision with root package name */
        public final String f22921a;
        public final String b;
        public final ButtonStyle c;
        public final boolean d;
        public final String e;
        public final String f;

        public Button(ButtonStyle buttonStyle, String str, String str2, String str3, String str4, boolean z) {
            this.f22921a = str;
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
            return Intrinsics.c(this.f22921a, button.f22921a) && Intrinsics.c(this.b, button.b) && this.c == button.c && this.d == button.d && Intrinsics.c(this.e, button.e) && Intrinsics.c(this.f, button.f);
        }

        public final int hashCode() {
            int iC = b.c(this.f22921a.hashCode() * 31, 31, this.b);
            ButtonStyle buttonStyle = this.c;
            int iE = b.e((iC + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31, 31, this.d);
            String str = this.e;
            int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Button(__typename=", this.f22921a, ", label=", this.b, ", style=");
            sbV.append(this.c);
            sbV.append(", enabled=");
            sbV.append(this.d);
            sbV.append(", action=");
            return androidx.constraintlayout.core.state.a.l(sbV, this.e, ", url=", this.f, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$CarouselItem;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CarouselItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f22922a;
        public final OnHeroBanner b;

        public CarouselItem(String __typename, OnHeroBanner onHeroBanner) {
            Intrinsics.h(__typename, "__typename");
            this.f22922a = __typename;
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
            return Intrinsics.c(this.f22922a, carouselItem.f22922a) && Intrinsics.c(this.b, carouselItem.b);
        }

        public final int hashCode() {
            int iHashCode = this.f22922a.hashCode() * 31;
            OnHeroBanner onHeroBanner = this.b;
            return iHashCode + (onHeroBanner == null ? 0 : onHeroBanner.hashCode());
        }

        public final String toString() {
            return "CarouselItem(__typename=" + this.f22922a + ", onHeroBanner=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final Home f22923a;

        public Data(Home home) {
            this.f22923a = home;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f22923a, ((Data) obj).f22923a);
        }

        public final int hashCode() {
            Home home = this.f22923a;
            if (home == null) {
                return 0;
            }
            return home.hashCode();
        }

        public final String toString() {
            return "Data(home=" + this.f22923a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$DeliveryNow;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeliveryNow {

        /* renamed from: a, reason: collision with root package name */
        public final String f22924a;
        public final Integer b;

        public DeliveryNow(String str, Integer num) {
            this.f22924a = str;
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
            return Intrinsics.c(this.f22924a, deliveryNow.f22924a) && Intrinsics.c(this.b, deliveryNow.b);
        }

        public final int hashCode() {
            int iHashCode = this.f22924a.hashCode() * 31;
            Integer num = this.b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return "DeliveryNow(status=" + this.f22924a + ", expressDeliveryStoreId=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$DeliveryNowBanner;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeliveryNowBanner {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f22925a;

        public DeliveryNowBanner(Boolean bool) {
            this.f22925a = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DeliveryNowBanner) && Intrinsics.c(this.f22925a, ((DeliveryNowBanner) obj).f22925a);
        }

        public final int hashCode() {
            Boolean bool = this.f22925a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            return androidx.compose.ui.input.pointer.a.k(this.f22925a, "DeliveryNowBanner(_excluded=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$DeliveryNowBanner1;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DeliveryNowBanner1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22926a;
        public final OnHomeDeliveryNowBottomBanner b;
        public final OnHomeDeliveryNowBanner c;

        public DeliveryNowBanner1(String __typename, OnHomeDeliveryNowBottomBanner onHomeDeliveryNowBottomBanner, OnHomeDeliveryNowBanner onHomeDeliveryNowBanner) {
            Intrinsics.h(__typename, "__typename");
            this.f22926a = __typename;
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
            return Intrinsics.c(this.f22926a, deliveryNowBanner1.f22926a) && Intrinsics.c(this.b, deliveryNowBanner1.b) && Intrinsics.c(this.c, deliveryNowBanner1.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22926a.hashCode() * 31;
            OnHomeDeliveryNowBottomBanner onHomeDeliveryNowBottomBanner = this.b;
            int iHashCode2 = (iHashCode + (onHomeDeliveryNowBottomBanner == null ? 0 : onHomeDeliveryNowBottomBanner.hashCode())) * 31;
            OnHomeDeliveryNowBanner onHomeDeliveryNowBanner = this.c;
            return iHashCode2 + (onHomeDeliveryNowBanner != null ? onHomeDeliveryNowBanner.hashCode() : 0);
        }

        public final String toString() {
            return "DeliveryNowBanner1(__typename=" + this.f22926a + ", onHomeDeliveryNowBottomBanner=" + this.b + ", onHomeDeliveryNowBanner=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$Divider;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Divider {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f22927a;

        public Divider(Boolean bool) {
            this.f22927a = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Divider) && Intrinsics.c(this.f22927a, ((Divider) obj).f22927a);
        }

        public final int hashCode() {
            Boolean bool = this.f22927a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            return androidx.compose.ui.input.pointer.a.k(this.f22927a, "Divider(_excluded=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$ExtraContent;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ExtraContent {

        /* renamed from: a, reason: collision with root package name */
        public final String f22928a;
        public final String b;

        public ExtraContent(String str, String str2) {
            this.f22928a = str;
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
            return Intrinsics.c(this.f22928a, extraContent.f22928a) && Intrinsics.c(this.b, extraContent.b);
        }

        public final int hashCode() {
            int iHashCode = this.f22928a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("ExtraContent(key=", this.f22928a, ", value=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$FulfilmentStatusBanner;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FulfilmentStatusBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f22929a;
        public final String b;

        public FulfilmentStatusBanner(String str, String str2) {
            this.f22929a = str;
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
            return Intrinsics.c(this.f22929a, fulfilmentStatusBanner.f22929a) && Intrinsics.c(this.b, fulfilmentStatusBanner.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22929a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("FulfilmentStatusBanner(text=", this.f22929a, ", buttonLabel=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$FulfilmentWindowStateButton;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FulfilmentWindowStateButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f22930a;
        public final ButtonStyle b;
        public final boolean c;
        public final String d;
        public final String e;

        public FulfilmentWindowStateButton(String str, ButtonStyle buttonStyle, boolean z, String str2, String str3) {
            this.f22930a = str;
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
            return Intrinsics.c(this.f22930a, fulfilmentWindowStateButton.f22930a) && this.b == fulfilmentWindowStateButton.b && this.c == fulfilmentWindowStateButton.c && Intrinsics.c(this.d, fulfilmentWindowStateButton.d) && Intrinsics.c(this.e, fulfilmentWindowStateButton.e);
        }

        public final int hashCode() {
            int iHashCode = this.f22930a.hashCode() * 31;
            ButtonStyle buttonStyle = this.b;
            int iE = b.e((iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31, 31, this.c);
            String str = this.d;
            int iHashCode2 = (iE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbQ = au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.q("FulfilmentWindowStateButton(label=", this.f22930a, ", style=", this.b, ", enabled=");
            au.com.woolworths.android.onesite.a.y(", action=", this.d, ", url=", sbQ, this.c);
            return a.o(sbQ, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$FulfilmentWindowStateSubtitle;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FulfilmentWindowStateSubtitle {

        /* renamed from: a, reason: collision with root package name */
        public final String f22931a;
        public final String b;

        public FulfilmentWindowStateSubtitle(String str, String str2) {
            this.f22931a = str;
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
            return Intrinsics.c(this.f22931a, fulfilmentWindowStateSubtitle.f22931a) && Intrinsics.c(this.b, fulfilmentWindowStateSubtitle.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22931a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("FulfilmentWindowStateSubtitle(text=", this.f22931a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$FulfilmentWindowTile;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FulfilmentWindowTile {

        /* renamed from: a, reason: collision with root package name */
        public final HomeFulfilmentWindowTileStyle f22932a;
        public final String b;
        public final String c;
        public final Title d;
        public final Subtitle e;
        public final Analytics f;

        public FulfilmentWindowTile(HomeFulfilmentWindowTileStyle homeFulfilmentWindowTileStyle, String str, String str2, Title title, Subtitle subtitle, Analytics analytics) {
            this.f22932a = homeFulfilmentWindowTileStyle;
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
            return this.f22932a == fulfilmentWindowTile.f22932a && Intrinsics.c(this.b, fulfilmentWindowTile.b) && Intrinsics.c(this.c, fulfilmentWindowTile.c) && Intrinsics.c(this.d, fulfilmentWindowTile.d) && Intrinsics.c(this.e, fulfilmentWindowTile.e) && Intrinsics.c(this.f, fulfilmentWindowTile.f);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + b.c(b.c(this.f22932a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
            Subtitle subtitle = this.e;
            return this.f.f22916a.hashCode() + ((iHashCode + (subtitle == null ? 0 : subtitle.hashCode())) * 31);
        }

        public final String toString() {
            return "FulfilmentWindowTile(style=" + this.f22932a + ", iconUrl=" + this.b + ", url=" + this.c + ", title=" + this.d + ", subtitle=" + this.e + ", analytics=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$HeaderItem;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeaderItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f22933a;
        public final OnHomeFulfilmentWindowBanner b;
        public final OnHomeFulfilmentWindowContainer c;
        public final OnHomeModeSelectorContainer d;

        public HeaderItem(String __typename, OnHomeFulfilmentWindowBanner onHomeFulfilmentWindowBanner, OnHomeFulfilmentWindowContainer onHomeFulfilmentWindowContainer, OnHomeModeSelectorContainer onHomeModeSelectorContainer) {
            Intrinsics.h(__typename, "__typename");
            this.f22933a = __typename;
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
            return Intrinsics.c(this.f22933a, headerItem.f22933a) && Intrinsics.c(this.b, headerItem.b) && Intrinsics.c(this.c, headerItem.c) && Intrinsics.c(this.d, headerItem.d);
        }

        public final int hashCode() {
            int iHashCode = this.f22933a.hashCode() * 31;
            OnHomeFulfilmentWindowBanner onHomeFulfilmentWindowBanner = this.b;
            int iHashCode2 = (iHashCode + (onHomeFulfilmentWindowBanner == null ? 0 : onHomeFulfilmentWindowBanner.hashCode())) * 31;
            OnHomeFulfilmentWindowContainer onHomeFulfilmentWindowContainer = this.c;
            int iHashCode3 = (iHashCode2 + (onHomeFulfilmentWindowContainer == null ? 0 : onHomeFulfilmentWindowContainer.hashCode())) * 31;
            OnHomeModeSelectorContainer onHomeModeSelectorContainer = this.d;
            return iHashCode3 + (onHomeModeSelectorContainer != null ? onHomeModeSelectorContainer.hashCode() : 0);
        }

        public final String toString() {
            return "HeaderItem(__typename=" + this.f22933a + ", onHomeFulfilmentWindowBanner=" + this.b + ", onHomeFulfilmentWindowContainer=" + this.c + ", onHomeModeSelectorContainer=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$HeroBannerAction;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeroBannerAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f22934a;
        public final Analytics2 b;
        public final ActionType c;

        public HeroBannerAction(String str, Analytics2 analytics2, ActionType actionType) {
            this.f22934a = str;
            this.b = analytics2;
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
            return Intrinsics.c(this.f22934a, heroBannerAction.f22934a) && Intrinsics.c(this.b, heroBannerAction.b) && this.c == heroBannerAction.c;
        }

        public final int hashCode() {
            int iHashCode = this.f22934a.hashCode() * 31;
            Analytics2 analytics2 = this.b;
            return this.c.hashCode() + ((iHashCode + (analytics2 == null ? 0 : analytics2.hashCode())) * 31);
        }

        public final String toString() {
            return "HeroBannerAction(action=" + this.f22934a + ", analytics=" + this.b + ", type=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$HeroBannerAnalytics;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeroBannerAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f22935a;
        public final List b;
        public final AnalyticsFields c;

        public HeroBannerAnalytics(String str, List list, AnalyticsFields analyticsFields) {
            this.f22935a = str;
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
            return Intrinsics.c(this.f22935a, heroBannerAnalytics.f22935a) && Intrinsics.c(this.b, heroBannerAnalytics.b) && Intrinsics.c(this.c, heroBannerAnalytics.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22935a.hashCode() * 31;
            List list = this.b;
            return this.c.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbS = au.com.woolworths.android.onesite.a.s("HeroBannerAnalytics(__typename=", this.f22935a, ", extraContent=", ", analyticsFields=", this.b);
            sbS.append(this.c);
            sbS.append(")");
            return sbS.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$HeroBannerBody;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeroBannerBody {

        /* renamed from: a, reason: collision with root package name */
        public final String f22936a;
        public final OnHeroBannerBodyText b;
        public final OnHeroBannerPromoBody c;

        public HeroBannerBody(String __typename, OnHeroBannerBodyText onHeroBannerBodyText, OnHeroBannerPromoBody onHeroBannerPromoBody) {
            Intrinsics.h(__typename, "__typename");
            this.f22936a = __typename;
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
            return Intrinsics.c(this.f22936a, heroBannerBody.f22936a) && Intrinsics.c(this.b, heroBannerBody.b) && Intrinsics.c(this.c, heroBannerBody.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22936a.hashCode() * 31;
            OnHeroBannerBodyText onHeroBannerBodyText = this.b;
            int iHashCode2 = (iHashCode + (onHeroBannerBodyText == null ? 0 : onHeroBannerBodyText.f22964a.hashCode())) * 31;
            OnHeroBannerPromoBody onHeroBannerPromoBody = this.c;
            return iHashCode2 + (onHeroBannerPromoBody != null ? onHeroBannerPromoBody.hashCode() : 0);
        }

        public final String toString() {
            return "HeroBannerBody(__typename=" + this.f22936a + ", onHeroBannerBodyText=" + this.b + ", onHeroBannerPromoBody=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$HeroBannerBrandsLogo;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeroBannerBrandsLogo {

        /* renamed from: a, reason: collision with root package name */
        public final String f22937a;
        public final String b;

        public HeroBannerBrandsLogo(String str, String str2) {
            this.f22937a = str;
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
            return Intrinsics.c(this.f22937a, heroBannerBrandsLogo.f22937a) && Intrinsics.c(this.b, heroBannerBrandsLogo.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22937a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("HeroBannerBrandsLogo(imageUrl=", this.f22937a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$HeroBannerGraphic;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeroBannerGraphic {

        /* renamed from: a, reason: collision with root package name */
        public final String f22938a;
        public final String b;

        public HeroBannerGraphic(String str, String str2) {
            this.f22938a = str;
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
            return Intrinsics.c(this.f22938a, heroBannerGraphic.f22938a) && Intrinsics.c(this.b, heroBannerGraphic.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22938a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("HeroBannerGraphic(imageUrl=", this.f22938a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$HeroBannerImage;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeroBannerImage {

        /* renamed from: a, reason: collision with root package name */
        public final String f22939a;
        public final String b;

        public HeroBannerImage(String str, String str2) {
            this.f22939a = str;
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
            return Intrinsics.c(this.f22939a, heroBannerImage.f22939a) && Intrinsics.c(this.b, heroBannerImage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22939a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("HeroBannerImage(imageUrl=", this.f22939a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$HeroBannerImpressionAnalytics;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeroBannerImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f22940a;
        public final AnalyticsFields b;

        public HeroBannerImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f22940a = str;
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
            return Intrinsics.c(this.f22940a, heroBannerImpressionAnalytics.f22940a) && Intrinsics.c(this.b, heroBannerImpressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22940a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("HeroBannerImpressionAnalytics(__typename=", this.f22940a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$HeroBannerTermsAndConditionAction;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeroBannerTermsAndConditionAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f22941a;
        public final ActionType b;
        public final String c;
        public final Analytics3 d;

        public HeroBannerTermsAndConditionAction(String str, ActionType actionType, String str2, Analytics3 analytics3) {
            this.f22941a = str;
            this.b = actionType;
            this.c = str2;
            this.d = analytics3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeroBannerTermsAndConditionAction)) {
                return false;
            }
            HeroBannerTermsAndConditionAction heroBannerTermsAndConditionAction = (HeroBannerTermsAndConditionAction) obj;
            return Intrinsics.c(this.f22941a, heroBannerTermsAndConditionAction.f22941a) && this.b == heroBannerTermsAndConditionAction.b && Intrinsics.c(this.c, heroBannerTermsAndConditionAction.c) && Intrinsics.c(this.d, heroBannerTermsAndConditionAction.d);
        }

        public final int hashCode() {
            int iA = d.a(this.b, this.f22941a.hashCode() * 31, 31);
            String str = this.c;
            int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
            Analytics3 analytics3 = this.d;
            return iHashCode + (analytics3 != null ? analytics3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbW = d.w("HeroBannerTermsAndConditionAction(action=", this.f22941a, ", type=", this.b, ", id=");
            sbW.append(this.c);
            sbW.append(", analytics=");
            sbW.append(this.d);
            sbW.append(")");
            return sbW.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$HeroBannerTermsAndConditions;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeroBannerTermsAndConditions {

        /* renamed from: a, reason: collision with root package name */
        public final String f22942a;
        public final HeroBannerTermsAndConditionAction b;

        public HeroBannerTermsAndConditions(String str, HeroBannerTermsAndConditionAction heroBannerTermsAndConditionAction) {
            this.f22942a = str;
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
            return Intrinsics.c(this.f22942a, heroBannerTermsAndConditions.f22942a) && Intrinsics.c(this.b, heroBannerTermsAndConditions.b);
        }

        public final int hashCode() {
            int iHashCode = this.f22942a.hashCode() * 31;
            HeroBannerTermsAndConditionAction heroBannerTermsAndConditionAction = this.b;
            return iHashCode + (heroBannerTermsAndConditionAction == null ? 0 : heroBannerTermsAndConditionAction.hashCode());
        }

        public final String toString() {
            return "HeroBannerTermsAndConditions(text=" + this.f22942a + ", heroBannerTermsAndConditionAction=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$Home;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Home {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f22943a;
        public final ArrayList b;
        public final DeliveryNow c;
        public final ArrayList d;
        public final UnreadChatbotMsg e;

        public Home(ArrayList arrayList, ArrayList arrayList2, DeliveryNow deliveryNow, ArrayList arrayList3, UnreadChatbotMsg unreadChatbotMsg) {
            this.f22943a = arrayList;
            this.b = arrayList2;
            this.c = deliveryNow;
            this.d = arrayList3;
            this.e = unreadChatbotMsg;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Home)) {
                return false;
            }
            Home home = (Home) obj;
            return this.f22943a.equals(home.f22943a) && this.b.equals(home.b) && Intrinsics.c(this.c, home.c) && this.d.equals(home.d) && Intrinsics.c(this.e, home.e);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(this.f22943a.hashCode() * 31, 31, this.b);
            DeliveryNow deliveryNow = this.c;
            int iB2 = androidx.compose.ui.input.pointer.a.b((iB + (deliveryNow == null ? 0 : deliveryNow.hashCode())) * 31, 31, this.d);
            UnreadChatbotMsg unreadChatbotMsg = this.e;
            return iB2 + (unreadChatbotMsg != null ? Integer.hashCode(unreadChatbotMsg.f22999a) : 0);
        }

        public final String toString() {
            return "Home(headerItems=" + this.f22943a + ", analytics=" + this.b + ", deliveryNow=" + this.c + ", items=" + this.d + ", unreadChatbotMsg=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$InStoreDetailsCard;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InStoreDetailsCard {

        /* renamed from: a, reason: collision with root package name */
        public final StoreName f22944a;
        public final StoreTime b;
        public final Boolean c;

        public InStoreDetailsCard(StoreName storeName, StoreTime storeTime, Boolean bool) {
            this.f22944a = storeName;
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
            return Intrinsics.c(this.f22944a, inStoreDetailsCard.f22944a) && Intrinsics.c(this.b, inStoreDetailsCard.b) && Intrinsics.c(this.c, inStoreDetailsCard.c);
        }

        public final int hashCode() {
            StoreName storeName = this.f22944a;
            int iHashCode = (storeName == null ? 0 : storeName.hashCode()) * 31;
            StoreTime storeTime = this.b;
            int iHashCode2 = (iHashCode + (storeTime == null ? 0 : storeTime.hashCode())) * 31;
            Boolean bool = this.c;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InStoreDetailsCard(storeName=");
            sb.append(this.f22944a);
            sb.append(", storeTime=");
            sb.append(this.b);
            sb.append(", isLocationMapped=");
            return au.com.woolworths.android.onesite.a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$Item;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f22945a;
        public final OnCarousel b;
        public final OnRegistrationCard c;
        public final OnRewardsBalanceCard d;
        public final OnAddRewardsCard e;
        public final OnBroadcastBanner f;
        public final OnDividerCard g;
        public final OnInsetBanner h;
        public final OnCatalogueCard i;
        public final OnMarketplaceCard j;
        public final OnQuickLinkHorizontalList k;
        public final OnMyShoppingLists l;
        public final OnActionableCard m;
        public final OnGoogleAdBannerCard n;
        public final OnRecipeHorizontalList o;
        public final OnOrderHorizontalList p;
        public final OnProductHorizontalList q;
        public final OnBoosterHorizontalList r;

        public Item(String __typename, OnCarousel onCarousel, OnRegistrationCard onRegistrationCard, OnRewardsBalanceCard onRewardsBalanceCard, OnAddRewardsCard onAddRewardsCard, OnBroadcastBanner onBroadcastBanner, OnDividerCard onDividerCard, OnInsetBanner onInsetBanner, OnCatalogueCard onCatalogueCard, OnMarketplaceCard onMarketplaceCard, OnQuickLinkHorizontalList onQuickLinkHorizontalList, OnMyShoppingLists onMyShoppingLists, OnActionableCard onActionableCard, OnGoogleAdBannerCard onGoogleAdBannerCard, OnRecipeHorizontalList onRecipeHorizontalList, OnOrderHorizontalList onOrderHorizontalList, OnProductHorizontalList onProductHorizontalList, OnBoosterHorizontalList onBoosterHorizontalList) {
            Intrinsics.h(__typename, "__typename");
            this.f22945a = __typename;
            this.b = onCarousel;
            this.c = onRegistrationCard;
            this.d = onRewardsBalanceCard;
            this.e = onAddRewardsCard;
            this.f = onBroadcastBanner;
            this.g = onDividerCard;
            this.h = onInsetBanner;
            this.i = onCatalogueCard;
            this.j = onMarketplaceCard;
            this.k = onQuickLinkHorizontalList;
            this.l = onMyShoppingLists;
            this.m = onActionableCard;
            this.n = onGoogleAdBannerCard;
            this.o = onRecipeHorizontalList;
            this.p = onOrderHorizontalList;
            this.q = onProductHorizontalList;
            this.r = onBoosterHorizontalList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f22945a, item.f22945a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c) && Intrinsics.c(this.d, item.d) && Intrinsics.c(this.e, item.e) && Intrinsics.c(this.f, item.f) && Intrinsics.c(this.g, item.g) && Intrinsics.c(this.h, item.h) && Intrinsics.c(this.i, item.i) && Intrinsics.c(this.j, item.j) && Intrinsics.c(this.k, item.k) && Intrinsics.c(this.l, item.l) && Intrinsics.c(this.m, item.m) && Intrinsics.c(this.n, item.n) && Intrinsics.c(this.o, item.o) && Intrinsics.c(this.p, item.p) && Intrinsics.c(this.q, item.q) && Intrinsics.c(this.r, item.r);
        }

        public final int hashCode() {
            int iHashCode = this.f22945a.hashCode() * 31;
            OnCarousel onCarousel = this.b;
            int iHashCode2 = (iHashCode + (onCarousel == null ? 0 : onCarousel.f22959a.hashCode())) * 31;
            OnRegistrationCard onRegistrationCard = this.c;
            int iHashCode3 = (iHashCode2 + (onRegistrationCard == null ? 0 : onRegistrationCard.hashCode())) * 31;
            OnRewardsBalanceCard onRewardsBalanceCard = this.d;
            int iHashCode4 = (iHashCode3 + (onRewardsBalanceCard == null ? 0 : onRewardsBalanceCard.hashCode())) * 31;
            OnAddRewardsCard onAddRewardsCard = this.e;
            int iHashCode5 = (iHashCode4 + (onAddRewardsCard == null ? 0 : onAddRewardsCard.hashCode())) * 31;
            OnBroadcastBanner onBroadcastBanner = this.f;
            int iHashCode6 = (iHashCode5 + (onBroadcastBanner == null ? 0 : onBroadcastBanner.hashCode())) * 31;
            OnDividerCard onDividerCard = this.g;
            int iHashCode7 = (iHashCode6 + (onDividerCard == null ? 0 : onDividerCard.hashCode())) * 31;
            OnInsetBanner onInsetBanner = this.h;
            int iHashCode8 = (iHashCode7 + (onInsetBanner == null ? 0 : onInsetBanner.hashCode())) * 31;
            OnCatalogueCard onCatalogueCard = this.i;
            int iHashCode9 = (iHashCode8 + (onCatalogueCard == null ? 0 : onCatalogueCard.hashCode())) * 31;
            OnMarketplaceCard onMarketplaceCard = this.j;
            int iHashCode10 = (iHashCode9 + (onMarketplaceCard == null ? 0 : onMarketplaceCard.hashCode())) * 31;
            OnQuickLinkHorizontalList onQuickLinkHorizontalList = this.k;
            int iHashCode11 = (iHashCode10 + (onQuickLinkHorizontalList == null ? 0 : onQuickLinkHorizontalList.f22981a.hashCode())) * 31;
            OnMyShoppingLists onMyShoppingLists = this.l;
            int iHashCode12 = (iHashCode11 + (onMyShoppingLists == null ? 0 : onMyShoppingLists.hashCode())) * 31;
            OnActionableCard onActionableCard = this.m;
            int iHashCode13 = (iHashCode12 + (onActionableCard == null ? 0 : onActionableCard.hashCode())) * 31;
            OnGoogleAdBannerCard onGoogleAdBannerCard = this.n;
            int iHashCode14 = (iHashCode13 + (onGoogleAdBannerCard == null ? 0 : onGoogleAdBannerCard.hashCode())) * 31;
            OnRecipeHorizontalList onRecipeHorizontalList = this.o;
            int iHashCode15 = (iHashCode14 + (onRecipeHorizontalList == null ? 0 : onRecipeHorizontalList.hashCode())) * 31;
            OnOrderHorizontalList onOrderHorizontalList = this.p;
            int iHashCode16 = (iHashCode15 + (onOrderHorizontalList == null ? 0 : onOrderHorizontalList.hashCode())) * 31;
            OnProductHorizontalList onProductHorizontalList = this.q;
            int iHashCode17 = (iHashCode16 + (onProductHorizontalList == null ? 0 : onProductHorizontalList.hashCode())) * 31;
            OnBoosterHorizontalList onBoosterHorizontalList = this.r;
            return iHashCode17 + (onBoosterHorizontalList != null ? onBoosterHorizontalList.hashCode() : 0);
        }

        public final String toString() {
            return "Item(__typename=" + this.f22945a + ", onCarousel=" + this.b + ", onRegistrationCard=" + this.c + ", onRewardsBalanceCard=" + this.d + ", onAddRewardsCard=" + this.e + ", onBroadcastBanner=" + this.f + ", onDividerCard=" + this.g + ", onInsetBanner=" + this.h + ", onCatalogueCard=" + this.i + ", onMarketplaceCard=" + this.j + ", onQuickLinkHorizontalList=" + this.k + ", onMyShoppingLists=" + this.l + ", onActionableCard=" + this.m + ", onGoogleAdBannerCard=" + this.n + ", onRecipeHorizontalList=" + this.o + ", onOrderHorizontalList=" + this.p + ", onProductHorizontalList=" + this.q + ", onBoosterHorizontalList=" + this.r + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$Item1;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22946a;
        public final OnQuickLinkCard b;

        public Item1(String str, OnQuickLinkCard onQuickLinkCard) {
            this.f22946a = str;
            this.b = onQuickLinkCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item1)) {
                return false;
            }
            Item1 item1 = (Item1) obj;
            return Intrinsics.c(this.f22946a, item1.f22946a) && Intrinsics.c(this.b, item1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22946a.hashCode() * 31);
        }

        public final String toString() {
            return "Item1(__typename=" + this.f22946a + ", onQuickLinkCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$Item2;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22947a;
        public final OnRecipeSummaryCard b;
        public final OnRecipeMoreCard c;

        public Item2(String __typename, OnRecipeSummaryCard onRecipeSummaryCard, OnRecipeMoreCard onRecipeMoreCard) {
            Intrinsics.h(__typename, "__typename");
            this.f22947a = __typename;
            this.b = onRecipeSummaryCard;
            this.c = onRecipeMoreCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item2)) {
                return false;
            }
            Item2 item2 = (Item2) obj;
            return Intrinsics.c(this.f22947a, item2.f22947a) && Intrinsics.c(this.b, item2.b) && Intrinsics.c(this.c, item2.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22947a.hashCode() * 31;
            OnRecipeSummaryCard onRecipeSummaryCard = this.b;
            int iHashCode2 = (iHashCode + (onRecipeSummaryCard == null ? 0 : onRecipeSummaryCard.hashCode())) * 31;
            OnRecipeMoreCard onRecipeMoreCard = this.c;
            return iHashCode2 + (onRecipeMoreCard != null ? onRecipeMoreCard.f22983a.hashCode() : 0);
        }

        public final String toString() {
            return "Item2(__typename=" + this.f22947a + ", onRecipeSummaryCard=" + this.b + ", onRecipeMoreCard=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$Item3;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22948a;
        public final OnOrderCard b;

        public Item3(String __typename, OnOrderCard onOrderCard) {
            Intrinsics.h(__typename, "__typename");
            this.f22948a = __typename;
            this.b = onOrderCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item3)) {
                return false;
            }
            Item3 item3 = (Item3) obj;
            return Intrinsics.c(this.f22948a, item3.f22948a) && Intrinsics.c(this.b, item3.b);
        }

        public final int hashCode() {
            int iHashCode = this.f22948a.hashCode() * 31;
            OnOrderCard onOrderCard = this.b;
            return iHashCode + (onOrderCard == null ? 0 : onOrderCard.hashCode());
        }

        public final String toString() {
            return "Item3(__typename=" + this.f22948a + ", onOrderCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$Item4;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item4 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22949a;
        public final OnProductCard b;

        public Item4(String __typename, OnProductCard onProductCard) {
            Intrinsics.h(__typename, "__typename");
            this.f22949a = __typename;
            this.b = onProductCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item4)) {
                return false;
            }
            Item4 item4 = (Item4) obj;
            return Intrinsics.c(this.f22949a, item4.f22949a) && Intrinsics.c(this.b, item4.b);
        }

        public final int hashCode() {
            int iHashCode = this.f22949a.hashCode() * 31;
            OnProductCard onProductCard = this.b;
            return iHashCode + (onProductCard == null ? 0 : onProductCard.hashCode());
        }

        public final String toString() {
            return "Item4(__typename=" + this.f22949a + ", onProductCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$Item5;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item5 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22950a;
        public final OnProductCard1 b;

        public Item5(String __typename, OnProductCard1 onProductCard1) {
            Intrinsics.h(__typename, "__typename");
            this.f22950a = __typename;
            this.b = onProductCard1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item5)) {
                return false;
            }
            Item5 item5 = (Item5) obj;
            return Intrinsics.c(this.f22950a, item5.f22950a) && Intrinsics.c(this.b, item5.b);
        }

        public final int hashCode() {
            int iHashCode = this.f22950a.hashCode() * 31;
            OnProductCard1 onProductCard1 = this.b;
            return iHashCode + (onProductCard1 == null ? 0 : onProductCard1.hashCode());
        }

        public final String toString() {
            return "Item5(__typename=" + this.f22950a + ", onProductCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$LinkCardAction;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkCardAction {

        /* renamed from: a, reason: collision with root package name */
        public final ActionType f22951a;
        public final String b;

        public LinkCardAction(ActionType actionType, String str) {
            this.f22951a = actionType;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkCardAction)) {
                return false;
            }
            LinkCardAction linkCardAction = (LinkCardAction) obj;
            return this.f22951a == linkCardAction.f22951a && Intrinsics.c(this.b, linkCardAction.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22951a.hashCode() * 31);
        }

        public final String toString() {
            return "LinkCardAction(type=" + this.f22951a + ", action=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$LinkCardAnimation;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkCardAnimation {

        /* renamed from: a, reason: collision with root package name */
        public final String f22952a;
        public final int b;

        public LinkCardAnimation(String str, int i) {
            this.f22952a = str;
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
            return Intrinsics.c(this.f22952a, linkCardAnimation.f22952a) && this.b == linkCardAnimation.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.f22952a.hashCode() * 31);
        }

        public final String toString() {
            return android.support.v4.media.session.a.p("LinkCardAnimation(source=", this.b, this.f22952a, ", playCount=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OffersAlertIndicator;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OffersAlertIndicator {

        /* renamed from: a, reason: collision with root package name */
        public final AlertIndicatorType f22953a;
        public final String b;

        public OffersAlertIndicator(AlertIndicatorType alertIndicatorType, String str) {
            this.f22953a = alertIndicatorType;
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
            return this.f22953a == offersAlertIndicator.f22953a && Intrinsics.c(this.b, offersAlertIndicator.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22953a.hashCode() * 31);
        }

        public final String toString() {
            return "OffersAlertIndicator(indicatorType=" + this.f22953a + ", message=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnActionableCard;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnActionableCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f22954a;
        public final String b;
        public final CardHeight c;
        public final String d;
        public final TealiumAnalytics e;
        public final Boolean f;

        public OnActionableCard(String str, String str2, CardHeight cardHeight, String str3, TealiumAnalytics tealiumAnalytics, Boolean bool) {
            this.f22954a = str;
            this.b = str2;
            this.c = cardHeight;
            this.d = str3;
            this.e = tealiumAnalytics;
            this.f = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnActionableCard)) {
                return false;
            }
            OnActionableCard onActionableCard = (OnActionableCard) obj;
            return Intrinsics.c(this.f22954a, onActionableCard.f22954a) && Intrinsics.c(this.b, onActionableCard.b) && this.c == onActionableCard.c && Intrinsics.c(this.d, onActionableCard.d) && Intrinsics.c(this.e, onActionableCard.e) && Intrinsics.c(this.f, onActionableCard.f);
        }

        public final int hashCode() {
            int iC = b.c(d.b(this.c, b.c(this.f22954a.hashCode() * 31, 31, this.b), 31), 31, this.d);
            TealiumAnalytics tealiumAnalytics = this.e;
            int iHashCode = (iC + (tealiumAnalytics == null ? 0 : tealiumAnalytics.hashCode())) * 31;
            Boolean bool = this.f;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnActionableCard(image=", this.f22954a, ", altText=", this.b, ", cardHeight=");
            sbV.append(this.c);
            sbV.append(", link=");
            sbV.append(this.d);
            sbV.append(", analytics=");
            sbV.append(this.e);
            sbV.append(", _excluded=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnAddRewardsCard;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAddRewardsCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f22955a;
        public final String b;

        public OnAddRewardsCard(String str, String str2) {
            this.f22955a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnAddRewardsCard)) {
                return false;
            }
            OnAddRewardsCard onAddRewardsCard = (OnAddRewardsCard) obj;
            return Intrinsics.c(this.f22955a, onAddRewardsCard.f22955a) && Intrinsics.c(this.b, onAddRewardsCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22955a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OnAddRewardsCard(addRewardsCardTitle=", this.f22955a, ", addRewardsCardSubtitle=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnAdobeTargetAnalytics;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAdobeTargetAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f22956a;
        public final String b;
        public final Boolean c;

        public OnAdobeTargetAnalytics(Boolean bool, String str, String str2) {
            this.f22956a = str;
            this.b = str2;
            this.c = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnAdobeTargetAnalytics)) {
                return false;
            }
            OnAdobeTargetAnalytics onAdobeTargetAnalytics = (OnAdobeTargetAnalytics) obj;
            return Intrinsics.c(this.f22956a, onAdobeTargetAnalytics.f22956a) && Intrinsics.c(this.b, onAdobeTargetAnalytics.b) && Intrinsics.c(this.c, onAdobeTargetAnalytics.c);
        }

        public final int hashCode() {
            String str = this.f22956a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.c;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.o(a.v("OnAdobeTargetAnalytics(tnta=", this.f22956a, ", pe=", this.b, ", _excluded="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnBoosterHorizontalList;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBoosterHorizontalList {

        /* renamed from: a, reason: collision with root package name */
        public final String f22957a;
        public final String b;
        public final String c;
        public final String d;
        public final ArrayList e;
        public final ArrayList f;

        public OnBoosterHorizontalList(String str, String str2, String str3, String str4, ArrayList arrayList, ArrayList arrayList2) {
            this.f22957a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = arrayList;
            this.f = arrayList2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBoosterHorizontalList)) {
                return false;
            }
            OnBoosterHorizontalList onBoosterHorizontalList = (OnBoosterHorizontalList) obj;
            return this.f22957a.equals(onBoosterHorizontalList.f22957a) && Intrinsics.c(this.b, onBoosterHorizontalList.b) && Intrinsics.c(this.c, onBoosterHorizontalList.c) && Intrinsics.c(this.d, onBoosterHorizontalList.d) && this.e.equals(onBoosterHorizontalList.e) && this.f.equals(onBoosterHorizontalList.f);
        }

        public final int hashCode() {
            int iHashCode = this.f22957a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return this.f.hashCode() + androidx.compose.ui.input.pointer.a.b((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.e);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnBoosterHorizontalList(title=", this.f22957a, ", subtitle=", this.b, ", deepLink=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", actionTitle=", this.d, ", tigerOfferIds=");
            sbV.append(this.e);
            sbV.append(", items=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnBroadcastBanner;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBroadcastBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f22958a;
        public final String b;
        public final String c;
        public final BroadcastBannerType d;
        public final String e;
        public final String f;
        public final String g;
        public final Boolean h;
        public final String i;

        public OnBroadcastBanner(String str, String str2, String str3, BroadcastBannerType broadcastBannerType, String str4, String str5, String str6, Boolean bool, String str7) {
            this.f22958a = str;
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
            return Intrinsics.c(this.f22958a, onBroadcastBanner.f22958a) && Intrinsics.c(this.b, onBroadcastBanner.b) && Intrinsics.c(this.c, onBroadcastBanner.c) && this.d == onBroadcastBanner.d && Intrinsics.c(this.e, onBroadcastBanner.e) && Intrinsics.c(this.f, onBroadcastBanner.f) && Intrinsics.c(this.g, onBroadcastBanner.g) && Intrinsics.c(this.h, onBroadcastBanner.h) && Intrinsics.c(this.i, onBroadcastBanner.i);
        }

        public final int hashCode() {
            int iHashCode = this.f22958a.hashCode() * 31;
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
            StringBuilder sbV = a.v("OnBroadcastBanner(title=", this.f22958a, ", subtitle=", this.b, ", deeplink=");
            sbV.append(this.c);
            sbV.append(", type=");
            sbV.append(this.d);
            sbV.append(", imageUrl=");
            androidx.constraintlayout.core.state.a.B(sbV, this.e, ", actionLabel=", this.f, ", analyticsLabel=");
            au.com.woolworths.android.onesite.a.A(sbV, this.g, ", dismissible=", this.h, ", bannerId=");
            return a.o(sbV, this.i, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnCarousel;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCarousel {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f22959a;

        public OnCarousel(ArrayList arrayList) {
            this.f22959a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCarousel) && this.f22959a.equals(((OnCarousel) obj).f22959a);
        }

        public final int hashCode() {
            return this.f22959a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("OnCarousel(carouselItems=", ")", this.f22959a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnCatalogueCard;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCatalogueCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f22960a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public OnCatalogueCard(String str, String str2, String str3, String str4, String str5) {
            this.f22960a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCatalogueCard)) {
                return false;
            }
            OnCatalogueCard onCatalogueCard = (OnCatalogueCard) obj;
            return Intrinsics.c(this.f22960a, onCatalogueCard.f22960a) && Intrinsics.c(this.b, onCatalogueCard.b) && Intrinsics.c(this.c, onCatalogueCard.c) && Intrinsics.c(this.d, onCatalogueCard.d) && Intrinsics.c(this.e, onCatalogueCard.e);
        }

        public final int hashCode() {
            int iC = b.c(this.f22960a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnCatalogueCard(title=", this.f22960a, ", catalogueCardSubtitle=", this.b, ", imageLeft=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", imageRight=", this.d, ", imageBackground=");
            return a.o(sbV, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnDividerCard;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnDividerCard {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f22961a;

        public OnDividerCard(Boolean bool) {
            this.f22961a = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnDividerCard) && Intrinsics.c(this.f22961a, ((OnDividerCard) obj).f22961a);
        }

        public final int hashCode() {
            Boolean bool = this.f22961a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            return androidx.compose.ui.input.pointer.a.k(this.f22961a, "OnDividerCard(_excluded=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnGoogleAdBannerCard;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnGoogleAdBannerCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f22962a;
        public final String b;
        public final GoogleAdCustomTargeting c;
        public final AdBannerNativeSize d;
        public final Boolean e;

        public OnGoogleAdBannerCard(String str, String str2, GoogleAdCustomTargeting googleAdCustomTargeting, AdBannerNativeSize adBannerNativeSize, Boolean bool) {
            this.f22962a = str;
            this.b = str2;
            this.c = googleAdCustomTargeting;
            this.d = adBannerNativeSize;
            this.e = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnGoogleAdBannerCard)) {
                return false;
            }
            OnGoogleAdBannerCard onGoogleAdBannerCard = (OnGoogleAdBannerCard) obj;
            return Intrinsics.c(this.f22962a, onGoogleAdBannerCard.f22962a) && Intrinsics.c(this.b, onGoogleAdBannerCard.b) && Intrinsics.c(this.c, onGoogleAdBannerCard.c) && this.d == onGoogleAdBannerCard.d && Intrinsics.c(this.e, onGoogleAdBannerCard.e);
        }

        public final int hashCode() {
            int iC = b.c(this.f22962a.hashCode() * 31, 31, this.b);
            GoogleAdCustomTargeting googleAdCustomTargeting = this.c;
            int iHashCode = (this.d.hashCode() + ((iC + (googleAdCustomTargeting == null ? 0 : googleAdCustomTargeting.hashCode())) * 31)) * 31;
            Boolean bool = this.e;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnGoogleAdBannerCard(adUnit=", this.f22962a, ", nativeCustomTemplateId=", this.b, ", targeting=");
            sbV.append(this.c);
            sbV.append(", height=");
            sbV.append(this.d);
            sbV.append(", _excluded=");
            return au.com.woolworths.android.onesite.a.o(sbV, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnHeroBanner;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHeroBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f22963a;
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
            this.f22963a = str;
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
            return this.f22963a.equals(onHeroBanner.f22963a) && this.b.equals(onHeroBanner.b) && this.c.equals(onHeroBanner.c) && this.d.equals(onHeroBanner.d) && this.e.equals(onHeroBanner.e) && Intrinsics.c(this.f, onHeroBanner.f) && Intrinsics.c(this.g, onHeroBanner.g) && Intrinsics.c(this.h, onHeroBanner.h) && Intrinsics.c(this.i, onHeroBanner.i) && this.j.equals(onHeroBanner.j) && Intrinsics.c(this.k, onHeroBanner.k) && this.l.equals(onHeroBanner.l) && this.m == onHeroBanner.m;
        }

        public final int hashCode() {
            int iC = b.c((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f22963a.hashCode() * 31)) * 31)) * 31)) * 31, 31, this.e);
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
            sb.append(this.f22963a);
            sb.append(", heroBannerAction=");
            sb.append(this.b);
            sb.append(", heroBannerAnalytics=");
            sb.append(this.c);
            sb.append(", heroBannerImpressionAnalytics=");
            sb.append(this.d);
            sb.append(", heroBannerBackgroundColour=");
            androidx.constraintlayout.core.state.a.B(sb, this.e, ", heroBannerTextColour=", this.f, ", heroBannerBody=");
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnHeroBannerBodyText;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHeroBannerBodyText {

        /* renamed from: a, reason: collision with root package name */
        public final String f22964a;

        public OnHeroBannerBodyText(String str) {
            this.f22964a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHeroBannerBodyText) && Intrinsics.c(this.f22964a, ((OnHeroBannerBodyText) obj).f22964a);
        }

        public final int hashCode() {
            return this.f22964a.hashCode();
        }

        public final String toString() {
            return a.h("OnHeroBannerBodyText(text=", this.f22964a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnHeroBannerPromoBody;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHeroBannerPromoBody {

        /* renamed from: a, reason: collision with root package name */
        public final String f22965a;
        public final String b;

        public OnHeroBannerPromoBody(String str, String str2) {
            this.f22965a = str;
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
            return Intrinsics.c(this.f22965a, onHeroBannerPromoBody.f22965a) && Intrinsics.c(this.b, onHeroBannerPromoBody.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22965a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OnHeroBannerPromoBody(code=", this.f22965a, ", text=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnHomeDeliveryNowBanner;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHomeDeliveryNowBanner {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f22966a;

        public OnHomeDeliveryNowBanner(Boolean bool) {
            this.f22966a = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHomeDeliveryNowBanner) && Intrinsics.c(this.f22966a, ((OnHomeDeliveryNowBanner) obj).f22966a);
        }

        public final int hashCode() {
            Boolean bool = this.f22966a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            return androidx.compose.ui.input.pointer.a.k(this.f22966a, "OnHomeDeliveryNowBanner(_excluded=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnHomeDeliveryNowBottomBanner;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHomeDeliveryNowBottomBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f22967a;
        public final String b;
        public final String c;
        public final Boolean d;
        public final BannerAsset e;
        public final PrimaryCta f;
        public final SecondaryCta g;

        public OnHomeDeliveryNowBottomBanner(String str, String str2, String str3, Boolean bool, BannerAsset bannerAsset, PrimaryCta primaryCta, SecondaryCta secondaryCta) {
            this.f22967a = str;
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
            return Intrinsics.c(this.f22967a, onHomeDeliveryNowBottomBanner.f22967a) && Intrinsics.c(this.b, onHomeDeliveryNowBottomBanner.b) && Intrinsics.c(this.c, onHomeDeliveryNowBottomBanner.c) && Intrinsics.c(this.d, onHomeDeliveryNowBottomBanner.d) && Intrinsics.c(this.e, onHomeDeliveryNowBottomBanner.e) && Intrinsics.c(this.f, onHomeDeliveryNowBottomBanner.f) && Intrinsics.c(this.g, onHomeDeliveryNowBottomBanner.g);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f22967a.hashCode() * 31, 31, this.b), 31, this.c);
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
            StringBuilder sbV = a.v("OnHomeDeliveryNowBottomBanner(__typename=", this.f22967a, ", bottomSheetTitle=", this.b, ", bottomSheetBody=");
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnHomeFulfilmentWindowBanner;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHomeFulfilmentWindowBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f22968a;
        public final FulfilmentWindowStateSubtitle b;
        public final FulfilmentWindowStateButton c;

        public OnHomeFulfilmentWindowBanner(String str, FulfilmentWindowStateSubtitle fulfilmentWindowStateSubtitle, FulfilmentWindowStateButton fulfilmentWindowStateButton) {
            this.f22968a = str;
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
            return Intrinsics.c(this.f22968a, onHomeFulfilmentWindowBanner.f22968a) && Intrinsics.c(this.b, onHomeFulfilmentWindowBanner.b) && Intrinsics.c(this.c, onHomeFulfilmentWindowBanner.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22968a.hashCode() * 31;
            FulfilmentWindowStateSubtitle fulfilmentWindowStateSubtitle = this.b;
            return this.c.hashCode() + ((iHashCode + (fulfilmentWindowStateSubtitle == null ? 0 : fulfilmentWindowStateSubtitle.hashCode())) * 31);
        }

        public final String toString() {
            return "OnHomeFulfilmentWindowBanner(fulfilmentWindowStateTitle=" + this.f22968a + ", fulfilmentWindowStateSubtitle=" + this.b + ", fulfilmentWindowStateButton=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnHomeFulfilmentWindowContainer;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHomeFulfilmentWindowContainer {

        /* renamed from: a, reason: collision with root package name */
        public final Button f22969a;
        public final DeliveryNowBanner b;
        public final HomeFulfilmentWindowContainerOrientation c;

        public OnHomeFulfilmentWindowContainer(Button button, DeliveryNowBanner deliveryNowBanner, HomeFulfilmentWindowContainerOrientation homeFulfilmentWindowContainerOrientation) {
            this.f22969a = button;
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
            return Intrinsics.c(this.f22969a, onHomeFulfilmentWindowContainer.f22969a) && Intrinsics.c(this.b, onHomeFulfilmentWindowContainer.b) && this.c == onHomeFulfilmentWindowContainer.c;
        }

        public final int hashCode() {
            int iHashCode = this.f22969a.hashCode() * 31;
            DeliveryNowBanner deliveryNowBanner = this.b;
            return this.c.hashCode() + ((iHashCode + (deliveryNowBanner == null ? 0 : deliveryNowBanner.hashCode())) * 31);
        }

        public final String toString() {
            return "OnHomeFulfilmentWindowContainer(button=" + this.f22969a + ", deliveryNowBanner=" + this.b + ", orientation=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnHomeModeSelectorContainer;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHomeModeSelectorContainer {

        /* renamed from: a, reason: collision with root package name */
        public final FulfilmentWindowTile f22970a;
        public final OnlineShoppingModeVariantTile b;
        public final Divider c;
        public final DeliveryNowBanner1 d;
        public final InStoreDetailsCard e;

        public OnHomeModeSelectorContainer(FulfilmentWindowTile fulfilmentWindowTile, OnlineShoppingModeVariantTile onlineShoppingModeVariantTile, Divider divider, DeliveryNowBanner1 deliveryNowBanner1, InStoreDetailsCard inStoreDetailsCard) {
            this.f22970a = fulfilmentWindowTile;
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
            return Intrinsics.c(this.f22970a, onHomeModeSelectorContainer.f22970a) && Intrinsics.c(this.b, onHomeModeSelectorContainer.b) && Intrinsics.c(this.c, onHomeModeSelectorContainer.c) && Intrinsics.c(this.d, onHomeModeSelectorContainer.d) && Intrinsics.c(this.e, onHomeModeSelectorContainer.e);
        }

        public final int hashCode() {
            FulfilmentWindowTile fulfilmentWindowTile = this.f22970a;
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
            return "OnHomeModeSelectorContainer(fulfilmentWindowTile=" + this.f22970a + ", onlineShoppingModeVariantTile=" + this.b + ", divider=" + this.c + ", deliveryNowBanner=" + this.d + ", inStoreDetailsCard=" + this.e + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnInsetBanner;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnInsetBanner {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f22971a;
        public final InsetBannerDisplayType b;
        public final String c;
        public final String d;
        public final String e;
        public final Action f;

        public OnInsetBanner(Boolean bool, InsetBannerDisplayType insetBannerDisplayType, String str, String str2, String str3, Action action) {
            this.f22971a = bool;
            this.b = insetBannerDisplayType;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnInsetBanner)) {
                return false;
            }
            OnInsetBanner onInsetBanner = (OnInsetBanner) obj;
            return Intrinsics.c(this.f22971a, onInsetBanner.f22971a) && this.b == onInsetBanner.b && Intrinsics.c(this.c, onInsetBanner.c) && Intrinsics.c(this.d, onInsetBanner.d) && Intrinsics.c(this.e, onInsetBanner.e) && Intrinsics.c(this.f, onInsetBanner.f);
        }

        public final int hashCode() {
            Boolean bool = this.f22971a;
            int iC = b.c((this.b.hashCode() + ((bool == null ? 0 : bool.hashCode()) * 31)) * 31, 31, this.c);
            String str = this.d;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Action action = this.f;
            return iHashCode2 + (action != null ? action.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnInsetBanner(_excluded=");
            sb.append(this.f22971a);
            sb.append(", displayType=");
            sb.append(this.b);
            sb.append(", message=");
            androidx.constraintlayout.core.state.a.B(sb, this.c, ", bannerTitle=", this.d, ", iconUrl=");
            sb.append(this.e);
            sb.append(", action=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnMarketplaceCard;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMarketplaceCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f22972a;
        public final String b;

        public OnMarketplaceCard(String str, String str2) {
            this.f22972a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMarketplaceCard)) {
                return false;
            }
            OnMarketplaceCard onMarketplaceCard = (OnMarketplaceCard) obj;
            return Intrinsics.c(this.f22972a, onMarketplaceCard.f22972a) && Intrinsics.c(this.b, onMarketplaceCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22972a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OnMarketplaceCard(marketplaceCardBannerImage=", this.f22972a, ", marketplaceCardBannerAltText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnMyShoppingLists;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMyShoppingLists {

        /* renamed from: a, reason: collision with root package name */
        public final String f22973a;
        public final String b;
        public final String c;
        public final String d;

        public OnMyShoppingLists(String str, String str2, String str3, String str4) {
            this.f22973a = str;
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
            return Intrinsics.c(this.f22973a, onMyShoppingLists.f22973a) && Intrinsics.c(this.b, onMyShoppingLists.b) && Intrinsics.c(this.c, onMyShoppingLists.c) && Intrinsics.c(this.d, onMyShoppingLists.d);
        }

        public final int hashCode() {
            int iHashCode = this.f22973a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(a.v("OnMyShoppingLists(myListTitle=", this.f22973a, ", myListSubtitle=", this.b, ", myListActionTitle="), this.c, ", myListDeepLink=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnOrderAnalytics;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOrderAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final int f22974a;
        public final int b;

        public OnOrderAnalytics(int i, int i2) {
            this.f22974a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOrderAnalytics)) {
                return false;
            }
            OnOrderAnalytics onOrderAnalytics = (OnOrderAnalytics) obj;
            return this.f22974a == onOrderAnalytics.f22974a && this.b == onOrderAnalytics.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.f22974a) * 31);
        }

        public final String toString() {
            return b.j(this.f22974a, this.b, "OnOrderAnalytics(marketplaceOrderCount=", ", woolworthsOrderCount=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnOrderCard;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOrderCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f22975a;
        public final String b;
        public final OrderStatus c;
        public final int d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final FulfilmentStatusBanner i;

        public OnOrderCard(String str, String str2, OrderStatus orderStatus, int i, String str3, String str4, String str5, String str6, FulfilmentStatusBanner fulfilmentStatusBanner) {
            this.f22975a = str;
            this.b = str2;
            this.c = orderStatus;
            this.d = i;
            this.e = str3;
            this.f = str4;
            this.g = str5;
            this.h = str6;
            this.i = fulfilmentStatusBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOrderCard)) {
                return false;
            }
            OnOrderCard onOrderCard = (OnOrderCard) obj;
            return Intrinsics.c(this.f22975a, onOrderCard.f22975a) && Intrinsics.c(this.b, onOrderCard.b) && this.c == onOrderCard.c && this.d == onOrderCard.d && Intrinsics.c(this.e, onOrderCard.e) && Intrinsics.c(this.f, onOrderCard.f) && Intrinsics.c(this.g, onOrderCard.g) && Intrinsics.c(this.h, onOrderCard.h) && Intrinsics.c(this.i, onOrderCard.i);
        }

        public final int hashCode() {
            int iC = b.c(b.c(b.c(b.c(b.a(this.d, (this.c.hashCode() + b.c(this.f22975a.hashCode() * 31, 31, this.b)) * 31, 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
            FulfilmentStatusBanner fulfilmentStatusBanner = this.i;
            return iC + (fulfilmentStatusBanner == null ? 0 : fulfilmentStatusBanner.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnOrderCard(title=", this.f22975a, ", subtitle=", this.b, ", status=");
            sbV.append(this.c);
            sbV.append(", orderCardId=");
            sbV.append(this.d);
            sbV.append(", total=");
            androidx.constraintlayout.core.state.a.B(sbV, this.e, ", timeLabel=", this.f, ", timeValue=");
            androidx.constraintlayout.core.state.a.B(sbV, this.g, ", date=", this.h, ", fulfilmentStatusBanner=");
            sbV.append(this.i);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnOrderHorizontalList;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOrderHorizontalList {

        /* renamed from: a, reason: collision with root package name */
        public final String f22976a;
        public final String b;
        public final String c;
        public final String d;
        public final ArrayList e;

        public OnOrderHorizontalList(String str, String str2, String str3, String str4, ArrayList arrayList) {
            this.f22976a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOrderHorizontalList)) {
                return false;
            }
            OnOrderHorizontalList onOrderHorizontalList = (OnOrderHorizontalList) obj;
            return this.f22976a.equals(onOrderHorizontalList.f22976a) && Intrinsics.c(this.b, onOrderHorizontalList.b) && Intrinsics.c(this.c, onOrderHorizontalList.c) && Intrinsics.c(this.d, onOrderHorizontalList.d) && this.e.equals(onOrderHorizontalList.e);
        }

        public final int hashCode() {
            int iHashCode = this.f22976a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return this.e.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnOrderHorizontalList(title=", this.f22976a, ", subtitle=", this.b, ", deepLink=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", actionTitle=", this.d, ", items=");
            return android.support.v4.media.session.a.q(")", sbV, this.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnProductCard;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f22977a;
        public final ProductCard b;

        public OnProductCard(String str, ProductCard productCard) {
            this.f22977a = str;
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
            return Intrinsics.c(this.f22977a, onProductCard.f22977a) && Intrinsics.c(this.b, onProductCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22977a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OnProductCard(__typename=", this.f22977a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnProductCard1;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22978a;
        public final ProductCard b;

        public OnProductCard1(String str, ProductCard productCard) {
            this.f22978a = str;
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
            return Intrinsics.c(this.f22978a, onProductCard1.f22978a) && Intrinsics.c(this.b, onProductCard1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22978a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OnProductCard1(__typename=", this.f22978a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnProductHorizontalList;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductHorizontalList {

        /* renamed from: a, reason: collision with root package name */
        public final String f22979a;
        public final String b;
        public final String c;
        public final String d;
        public final ArrayList e;

        public OnProductHorizontalList(String str, String str2, String str3, String str4, ArrayList arrayList) {
            this.f22979a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductHorizontalList)) {
                return false;
            }
            OnProductHorizontalList onProductHorizontalList = (OnProductHorizontalList) obj;
            return this.f22979a.equals(onProductHorizontalList.f22979a) && Intrinsics.c(this.b, onProductHorizontalList.b) && Intrinsics.c(this.c, onProductHorizontalList.c) && Intrinsics.c(this.d, onProductHorizontalList.d) && this.e.equals(onProductHorizontalList.e);
        }

        public final int hashCode() {
            int iHashCode = this.f22979a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return this.e.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnProductHorizontalList(title=", this.f22979a, ", subtitle=", this.b, ", deepLink=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", actionTitle=", this.d, ", items=");
            return android.support.v4.media.session.a.q(")", sbV, this.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnQuickLinkCard;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnQuickLinkCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f22980a;
        public final String b;
        public final String c;
        public final LinkCardAction d;
        public final LinkCardAnimation e;

        public OnQuickLinkCard(String str, String str2, String str3, LinkCardAction linkCardAction, LinkCardAnimation linkCardAnimation) {
            this.f22980a = str;
            this.b = str2;
            this.c = str3;
            this.d = linkCardAction;
            this.e = linkCardAnimation;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnQuickLinkCard)) {
                return false;
            }
            OnQuickLinkCard onQuickLinkCard = (OnQuickLinkCard) obj;
            return Intrinsics.c(this.f22980a, onQuickLinkCard.f22980a) && Intrinsics.c(this.b, onQuickLinkCard.b) && Intrinsics.c(this.c, onQuickLinkCard.c) && Intrinsics.c(this.d, onQuickLinkCard.d) && Intrinsics.c(this.e, onQuickLinkCard.e);
        }

        public final int hashCode() {
            String str = this.f22980a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (this.d.hashCode() + b.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c)) * 31;
            LinkCardAnimation linkCardAnimation = this.e;
            return iHashCode2 + (linkCardAnimation != null ? linkCardAnimation.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnQuickLinkCard(linkCardImage=", this.f22980a, ", linkCardSubtitle=", this.b, ", linkCardTitle=");
            sbV.append(this.c);
            sbV.append(", linkCardAction=");
            sbV.append(this.d);
            sbV.append(", linkCardAnimation=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnQuickLinkHorizontalList;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnQuickLinkHorizontalList {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f22981a;

        public OnQuickLinkHorizontalList(ArrayList arrayList) {
            this.f22981a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnQuickLinkHorizontalList) && this.f22981a.equals(((OnQuickLinkHorizontalList) obj).f22981a);
        }

        public final int hashCode() {
            return this.f22981a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("OnQuickLinkHorizontalList(items=", ")", this.f22981a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnRecipeHorizontalList;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRecipeHorizontalList {

        /* renamed from: a, reason: collision with root package name */
        public final String f22982a;
        public final String b;
        public final String c;
        public final String d;
        public final ArrayList e;

        public OnRecipeHorizontalList(String str, String str2, String str3, String str4, ArrayList arrayList) {
            this.f22982a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnRecipeHorizontalList)) {
                return false;
            }
            OnRecipeHorizontalList onRecipeHorizontalList = (OnRecipeHorizontalList) obj;
            return this.f22982a.equals(onRecipeHorizontalList.f22982a) && Intrinsics.c(this.b, onRecipeHorizontalList.b) && Intrinsics.c(this.c, onRecipeHorizontalList.c) && Intrinsics.c(this.d, onRecipeHorizontalList.d) && this.e.equals(onRecipeHorizontalList.e);
        }

        public final int hashCode() {
            int iHashCode = this.f22982a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            return this.e.hashCode() + ((iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnRecipeHorizontalList(title=", this.f22982a, ", subtitle=", this.b, ", deepLink=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", actionTitle=", this.d, ", items=");
            return android.support.v4.media.session.a.q(")", sbV, this.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnRecipeMoreCard;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRecipeMoreCard {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f22983a;

        public OnRecipeMoreCard(ArrayList arrayList) {
            this.f22983a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRecipeMoreCard) && this.f22983a.equals(((OnRecipeMoreCard) obj).f22983a);
        }

        public final int hashCode() {
            return this.f22983a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("OnRecipeMoreCard(actionMetadata=", ")", this.f22983a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnRecipeSource;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRecipeSource {

        /* renamed from: a, reason: collision with root package name */
        public final String f22984a;

        public OnRecipeSource(String str) {
            this.f22984a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRecipeSource) && Intrinsics.c(this.f22984a, ((OnRecipeSource) obj).f22984a);
        }

        public final int hashCode() {
            return this.f22984a.hashCode();
        }

        public final String toString() {
            return a.h("OnRecipeSource(source=", this.f22984a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnRecipeSummaryCard;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRecipeSummaryCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f22985a;
        public final RecipeSummaryCardFragment b;

        public OnRecipeSummaryCard(String str, RecipeSummaryCardFragment recipeSummaryCardFragment) {
            this.f22985a = str;
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
            return Intrinsics.c(this.f22985a, onRecipeSummaryCard.f22985a) && Intrinsics.c(this.b, onRecipeSummaryCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22985a.hashCode() * 31);
        }

        public final String toString() {
            return "OnRecipeSummaryCard(__typename=" + this.f22985a + ", recipeSummaryCardFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnRecipeTagList;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRecipeTagList {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f22986a;

        public OnRecipeTagList(ArrayList arrayList) {
            this.f22986a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRecipeTagList) && this.f22986a.equals(((OnRecipeTagList) obj).f22986a);
        }

        public final int hashCode() {
            return this.f22986a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("OnRecipeTagList(tags=", ")", this.f22986a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnRegistrationCard;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRegistrationCard {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f22987a;

        public OnRegistrationCard(Boolean bool) {
            this.f22987a = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRegistrationCard) && Intrinsics.c(this.f22987a, ((OnRegistrationCard) obj).f22987a);
        }

        public final int hashCode() {
            Boolean bool = this.f22987a;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        public final String toString() {
            return androidx.compose.ui.input.pointer.a.k(this.f22987a, "OnRegistrationCard(_excluded=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnRewardsBalanceCard;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRewardsBalanceCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f22988a;
        public final String b;
        public final int c;
        public final int d;
        public final String e;
        public final String f;
        public final ArrayList g;
        public final String h;
        public final OffersAlertIndicator i;
        public final PointsAlertIndicator j;
        public final String k;

        public OnRewardsBalanceCard(String str, String str2, int i, int i2, String str3, String str4, ArrayList arrayList, String str5, OffersAlertIndicator offersAlertIndicator, PointsAlertIndicator pointsAlertIndicator, String str6) {
            this.f22988a = str;
            this.b = str2;
            this.c = i;
            this.d = i2;
            this.e = str3;
            this.f = str4;
            this.g = arrayList;
            this.h = str5;
            this.i = offersAlertIndicator;
            this.j = pointsAlertIndicator;
            this.k = str6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnRewardsBalanceCard)) {
                return false;
            }
            OnRewardsBalanceCard onRewardsBalanceCard = (OnRewardsBalanceCard) obj;
            return this.f22988a.equals(onRewardsBalanceCard.f22988a) && this.b.equals(onRewardsBalanceCard.b) && this.c == onRewardsBalanceCard.c && this.d == onRewardsBalanceCard.d && this.e.equals(onRewardsBalanceCard.e) && this.f.equals(onRewardsBalanceCard.f) && this.g.equals(onRewardsBalanceCard.g) && this.h.equals(onRewardsBalanceCard.h) && Intrinsics.c(this.i, onRewardsBalanceCard.i) && Intrinsics.c(this.j, onRewardsBalanceCard.j) && this.k.equals(onRewardsBalanceCard.k);
        }

        public final int hashCode() {
            int iC = b.c(androidx.compose.ui.input.pointer.a.b(b.c(b.c(b.a(this.d, b.a(this.c, b.c(this.f22988a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
            OffersAlertIndicator offersAlertIndicator = this.i;
            int iHashCode = (iC + (offersAlertIndicator == null ? 0 : offersAlertIndicator.hashCode())) * 31;
            PointsAlertIndicator pointsAlertIndicator = this.j;
            return this.k.hashCode() + ((iHashCode + (pointsAlertIndicator != null ? pointsAlertIndicator.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnRewardsBalanceCard(edrNumber=", this.f22988a, ", offersTitle=", this.b, ", currentBalance=");
            a.w(this.c, this.d, ", goalBalance=", ", actionUrl=", sbV);
            androidx.constraintlayout.core.state.a.B(sbV, this.e, ", pointsDescriptionFormat=", this.f, ", pointsDescriptionReplacements=");
            sbV.append(this.g);
            sbV.append(", altText=");
            sbV.append(this.h);
            sbV.append(", offersAlertIndicator=");
            sbV.append(this.i);
            sbV.append(", pointsAlertIndicator=");
            sbV.append(this.j);
            sbV.append(", rewardsState=");
            return a.o(sbV, this.k, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$OnlineShoppingModeVariantTile;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnlineShoppingModeVariantTile {

        /* renamed from: a, reason: collision with root package name */
        public final String f22989a;
        public final Title1 b;
        public final Subtitle1 c;
        public final Analytics1 d;

        public OnlineShoppingModeVariantTile(String str, Title1 title1, Subtitle1 subtitle1, Analytics1 analytics1) {
            this.f22989a = str;
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
            return Intrinsics.c(this.f22989a, onlineShoppingModeVariantTile.f22989a) && Intrinsics.c(this.b, onlineShoppingModeVariantTile.b) && Intrinsics.c(this.c, onlineShoppingModeVariantTile.c) && Intrinsics.c(this.d, onlineShoppingModeVariantTile.d);
        }

        public final int hashCode() {
            int iHashCode = this.f22989a.hashCode() * 31;
            Title1 title1 = this.b;
            int iHashCode2 = (iHashCode + (title1 == null ? 0 : title1.hashCode())) * 31;
            Subtitle1 subtitle1 = this.c;
            return this.d.f22917a.hashCode() + ((iHashCode2 + (subtitle1 != null ? subtitle1.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "OnlineShoppingModeVariantTile(url=" + this.f22989a + ", title=" + this.b + ", subtitle=" + this.c + ", analytics=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$PointsAlertIndicator;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PointsAlertIndicator {

        /* renamed from: a, reason: collision with root package name */
        public final AlertIndicatorType f22990a;
        public final String b;

        public PointsAlertIndicator(AlertIndicatorType alertIndicatorType, String str) {
            this.f22990a = alertIndicatorType;
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
            return this.f22990a == pointsAlertIndicator.f22990a && Intrinsics.c(this.b, pointsAlertIndicator.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22990a.hashCode() * 31);
        }

        public final String toString() {
            return "PointsAlertIndicator(indicatorType=" + this.f22990a + ", message=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$PrimaryCta;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrimaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f22991a;
        public final String b;

        public PrimaryCta(String str, String str2) {
            this.f22991a = str;
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
            return Intrinsics.c(this.f22991a, primaryCta.f22991a) && Intrinsics.c(this.b, primaryCta.b);
        }

        public final int hashCode() {
            int iHashCode = this.f22991a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("PrimaryCta(label=", this.f22991a, ", url=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$SecondaryCta;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SecondaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f22992a;
        public final String b;

        public SecondaryCta(String str, String str2) {
            this.f22992a = str;
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
            return Intrinsics.c(this.f22992a, secondaryCta.f22992a) && Intrinsics.c(this.b, secondaryCta.b);
        }

        public final int hashCode() {
            int iHashCode = this.f22992a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("SecondaryCta(label=", this.f22992a, ", url=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$StoreName;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StoreName {

        /* renamed from: a, reason: collision with root package name */
        public final String f22993a;
        public final String b;

        public StoreName(String str, String str2) {
            this.f22993a = str;
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
            return Intrinsics.c(this.f22993a, storeName.f22993a) && Intrinsics.c(this.b, storeName.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22993a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("StoreName(label=", this.f22993a, ", url=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$StoreTime;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StoreTime {

        /* renamed from: a, reason: collision with root package name */
        public final String f22994a;
        public final String b;

        public StoreTime(String str, String str2) {
            this.f22994a = str;
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
            return Intrinsics.c(this.f22994a, storeTime.f22994a) && Intrinsics.c(this.b, storeTime.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22994a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("StoreTime(label=", this.f22994a, ", url=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$Subtitle;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Subtitle {

        /* renamed from: a, reason: collision with root package name */
        public final String f22995a;
        public final String b;

        public Subtitle(String str, String str2) {
            this.f22995a = str;
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
            return Intrinsics.c(this.f22995a, subtitle.f22995a) && Intrinsics.c(this.b, subtitle.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22995a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Subtitle(text=", this.f22995a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$Subtitle1;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Subtitle1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22996a;
        public final String b;

        public Subtitle1(String str, String str2) {
            this.f22996a = str;
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
            return Intrinsics.c(this.f22996a, subtitle1.f22996a) && Intrinsics.c(this.b, subtitle1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22996a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Subtitle1(text=", this.f22996a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$Title;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Title {

        /* renamed from: a, reason: collision with root package name */
        public final String f22997a;
        public final String b;

        public Title(String str, String str2) {
            this.f22997a = str;
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
            return Intrinsics.c(this.f22997a, title.f22997a) && Intrinsics.c(this.b, title.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22997a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Title(text=", this.f22997a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$Title1;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Title1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22998a;
        public final String b;

        public Title1(String str, String str2) {
            this.f22998a = str;
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
            return Intrinsics.c(this.f22998a, title1.f22998a) && Intrinsics.c(this.b, title1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22998a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("Title1(text=", this.f22998a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/homepage/HomeQuery$UnreadChatbotMsg;", "", "homepage_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnreadChatbotMsg {

        /* renamed from: a, reason: collision with root package name */
        public final int f22999a;

        public UnreadChatbotMsg(int i) {
            this.f22999a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnreadChatbotMsg) && this.f22999a == ((UnreadChatbotMsg) obj).f22999a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f22999a);
        }

        public final String toString() {
            return a.e(this.f22999a, "UnreadChatbotMsg(count=", ")");
        }
    }

    public HomeQuery(ShoppingModeType shoppingModeType, Optional optional, Optional optional2, Optional optional3, boolean z, boolean z2, boolean z3, Optional optional4, Optional optional5, boolean z4, Optional optional6, boolean z5) {
        this.f22912a = shoppingModeType;
        this.b = optional;
        this.c = optional2;
        this.d = optional3;
        this.e = z;
        this.f = z2;
        Optional.Absent absent = Optional.Absent.f13523a;
        this.g = absent;
        this.h = z3;
        this.i = optional4;
        this.j = absent;
        this.k = optional5;
        this.l = z4;
        this.m = optional6;
        this.n = z5;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(HomeQuery_ResponseAdapter.Data.f23144a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query Home($mode: ShoppingModeType!, $storeId: String, $supportedLinks: [String!], $catalogueStoreId: String, $includeCatalogueCard: Boolean!, $includeProductAvailabilityStates: Boolean!, $includeBroadcastBanner: Boolean!, $includeOfferMinimumSpend: Boolean!, $includeAvailabilityInfoStatus: Boolean! = false , $isWiFiProfileInstalled: Boolean!, $chatbotSessionId: String, $isVideoTagOnRecipeCardEnabled: Boolean! = false , $isConsolidatedSpecials: Boolean, $includeCampaignAnimation: Boolean!, $includePricingFootnote: Boolean! = false , $includeLowestPrice14Days: Boolean!) { home(mode: $mode, storeId: $storeId, supportedLinks: $supportedLinks, catalogueStoreId: $catalogueStoreId, isWiFiProfileInstalled: $isWiFiProfileInstalled, chatbotSessionId: $chatbotSessionId, isConsolidatedSpecials: $isConsolidatedSpecials) { headerItems { __typename ... on HomeFulfilmentWindowBanner { fulfilmentWindowStateTitle fulfilmentWindowStateSubtitle { text altText } fulfilmentWindowStateButton { label style enabled action url } } ... on HomeFulfilmentWindowContainer { button { __typename label style enabled action url } deliveryNowBanner { _excluded: _ } orientation } ... on HomeModeSelectorContainer { fulfilmentWindowTile { style iconUrl url title { text altText } subtitle { text altText } analytics { label } } onlineShoppingModeVariantTile { url title { text altText } subtitle { text altText } analytics { label } } divider { _excluded: _ } deliveryNowBanner { __typename ... on HomeDeliveryNowBottomBanner { __typename bottomSheetTitle bottomSheetBody showOnceOnly bannerAsset { assetType assetUrl assetWidth assetHeight fit altText } primaryCta { label url } secondaryCta { label url } } ... on HomeDeliveryNowBanner { _excluded: _ } } inStoreDetailsCard { storeName { label url } storeTime { label url } isLocationMapped } } } analytics { __typename ... on AdobeTargetAnalytics { tnta pe _excluded } ... on OrderAnalytics { marketplaceOrderCount woolworthsOrderCount } } deliveryNow { status expressDeliveryStoreId } items { __typename ... on Carousel { carouselItems { __typename ... on HeroBanner { heroBannerId heroBannerAction { action analytics { __typename ...analyticsFields } type } heroBannerAnalytics { __typename ...analyticsFields extraContent { key value } } heroBannerImpressionAnalytics { __typename ...analyticsFields } heroBannerBackgroundColour heroBannerTextColour heroBannerBody { __typename ... on HeroBannerBodyText { text } ... on HeroBannerPromoBody { code text } } heroBannerBrandsLogo { imageUrl altText } heroBannerGraphics { imageUrl altText } heroBannerImages { imageUrl altText } heroBannerTermsAndConditions { text heroBannerTermsAndConditionAction: action { action type id analytics { __typename ...analyticsFields } } } heroBannerTitle heroBannerTitleSize } } } ... on RegistrationCard { _excluded } ... on RewardsBalanceCard { edrNumber offersTitle currentBalance goalBalance actionUrl pointsDescriptionFormat pointsDescriptionReplacements altText offersAlertIndicator { indicatorType message } pointsAlertIndicator { indicatorType message } rewardsState } ... on AddRewardsCard { addRewardsCardTitle addRewardsCardSubtitle } ... on BroadcastBanner @include(if: $includeBroadcastBanner) { title subtitle deeplink type imageUrl actionLabel analyticsLabel dismissible bannerId } ... on DividerCard { _excluded: _ } ... on InsetBanner { _excluded displayType message bannerTitle: title iconUrl action { url type placement label } } ... on CatalogueCard @include(if: $includeCatalogueCard) { title catalogueCardSubtitle: subtitle imageLeft imageRight imageBackground } ... on MarketplaceCard { marketplaceCardBannerImage marketplaceCardBannerAltText } ... on QuickLinkHorizontalList { items { __typename ... on QuickLinkCard { linkCardImage linkCardSubtitle linkCardTitle linkCardAction { type action } linkCardAnimation @include(if: $includeCampaignAnimation) { source playCount } } } } ... on MyShoppingLists { myListTitle myListSubtitle myListActionTitle myListDeepLink } ... on ActionableCard { image altText cardHeight link analytics _excluded } ... on GoogleAdBannerCard { adUnit nativeCustomTemplateId targeting height _excluded } ... on RecipeHorizontalList { title subtitle deepLink actionTitle items { __typename ... on RecipeSummaryCard { __typename ...recipeSummaryCardFragment } ... on RecipeMoreCard { actionMetadata { __typename ... on RecipeTagList { tags } ... on RecipeSource { source } } } } } ... on OrderHorizontalList { title subtitle deepLink actionTitle items { __typename ... on OrderCard { title subtitle status orderCardId total timeLabel timeValue date fulfilmentStatusBanner { text buttonLabel } } } } ... on ProductHorizontalList { title subtitle deepLink actionTitle items { __typename ... on ProductCard { __typename ...productCard } } } ... on BoosterHorizontalList { title subtitle deepLink actionTitle tigerOfferIds items { __typename ... on ProductCard { __typename ...productCard } } } } unreadChatbotMsg { count } } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment recipeSummaryCardFragment on RecipeSummaryCard { title image id tags sourceName isVideoAvailable @include(if: $isVideoTagOnRecipeCardEnabled) recipePrepDuration { duration altText } recipeCookDuration { duration altText } recipeCostPerServe { recipeCostPerServePrice } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeQuery)) {
            return false;
        }
        HomeQuery homeQuery = (HomeQuery) obj;
        return this.f22912a == homeQuery.f22912a && this.b.equals(homeQuery.b) && this.c.equals(homeQuery.c) && this.d.equals(homeQuery.d) && this.e == homeQuery.e && this.f == homeQuery.f && this.g.equals(homeQuery.g) && this.h == homeQuery.h && this.i.equals(homeQuery.i) && this.j.equals(homeQuery.j) && this.k.equals(homeQuery.k) && this.l == homeQuery.l && this.m.equals(homeQuery.m) && this.n == homeQuery.n;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.n) + au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.m, b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.k, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.j, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.i, b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.g, b.e(b.e(b.e(b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.d, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.c, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.b, this.f22912a.hashCode() * 31, 31), 31), 31), 31, this.e), 31, false), 31, this.f), 31, true), 31), 31, this.h), 31), 31), 31), 31, this.l), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "998f41f586b7694e028f00ed56dedcb56b178ce81857df321a2f9b80405336e9";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "Home";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("mode");
        ShoppingModeType_ResponseAdapter.b(jsonWriter, customScalarAdapters, this.f22912a);
        Optional optional = this.b;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("storeId");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
        Optional optional2 = this.c;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("supportedLinks");
            Adapters.d(Adapters.b(Adapters.a(Adapters.f13493a))).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        }
        Optional optional3 = this.d;
        if (optional3 instanceof Optional.Present) {
            jsonWriter.F1("catalogueStoreId");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional3);
        }
        jsonWriter.F1("includeCatalogueCard");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        d.B(this.e, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeProductAvailabilityStates");
        Boolean bool = Boolean.FALSE;
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, bool);
        jsonWriter.F1("includeBroadcastBanner");
        d.B(this.f, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeOfferMinimumSpend");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.TRUE);
        Optional optional4 = this.g;
        if (optional4 instanceof Optional.Present) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional4);
        } else if (z) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, bool);
        }
        jsonWriter.F1("isWiFiProfileInstalled");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.h));
        Optional optional5 = this.i;
        if (optional5 instanceof Optional.Present) {
            jsonWriter.F1("chatbotSessionId");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional5);
        }
        Optional optional6 = this.j;
        if (optional6 instanceof Optional.Present) {
            jsonWriter.F1("isVideoTagOnRecipeCardEnabled");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional6);
        } else if (z) {
            jsonWriter.F1("isVideoTagOnRecipeCardEnabled");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, bool);
        }
        Optional optional7 = this.k;
        if (optional7 instanceof Optional.Present) {
            jsonWriter.F1("isConsolidatedSpecials");
            Adapters.d(Adapters.l).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional7);
        }
        jsonWriter.F1("includeCampaignAnimation");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.l));
        Optional optional8 = this.m;
        if (optional8 instanceof Optional.Present) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional8);
        } else if (z) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, bool);
        }
        jsonWriter.F1("includeLowestPrice14Days");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.n));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeQuery(mode=");
        sb.append(this.f22912a);
        sb.append(", storeId=");
        sb.append(this.b);
        sb.append(", supportedLinks=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, this.c, ", catalogueStoreId=", this.d, ", includeCatalogueCard=");
        au.com.woolworths.android.onesite.a.D(sb, this.e, ", includeProductAvailabilityStates=false, includeBroadcastBanner=", this.f, ", includeOfferMinimumSpend=true, includeAvailabilityInfoStatus=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.y(sb, this.g, ", isWiFiProfileInstalled=", this.h, ", chatbotSessionId=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sb, this.i, ", isVideoTagOnRecipeCardEnabled=", this.j, ", isConsolidatedSpecials=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.y(sb, this.k, ", includeCampaignAnimation=", this.l, ", includePricingFootnote=");
        sb.append(this.m);
        sb.append(", includeLowestPrice14Days=");
        sb.append(this.n);
        sb.append(")");
        return sb.toString();
    }
}
