package com.woolworths.feature.shop.contentpage.fragment;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.analytics.graphql.TealiumAnalytics;
import au.com.woolworths.android.onesite.graphql.GoogleAdCustomTargeting;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.aem.components.offercard.fragment.OfferCard;
import au.com.woolworths.shop.aem.components.recipes.fragment.RecipeSummaryCardFragment;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.CatalogueCardType;
import au.com.woolworths.shop.graphql.type.ContentCardSize;
import au.com.woolworths.shop.graphql.type.CoreBroadcastBannerStyle;
import au.com.woolworths.shop.graphql.type.DownloadableAssetFit;
import au.com.woolworths.shop.graphql.type.DownloadableAssetType;
import au.com.woolworths.shop.graphql.type.FooterStyle;
import au.com.woolworths.shop.graphql.type.GenericPageHeroImageType;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.MoreCardStyle;
import au.com.woolworths.shop.graphql.type.PageCoverContentAlignment;
import au.com.woolworths.shop.graphql.type.PageCoverContentFormat;
import au.com.woolworths.shop.graphql.type.PageCoverImagePosition;
import au.com.woolworths.shop.graphql.type.PageCoverTitleTextSize;
import au.com.woolworths.shop.graphql.type.ParagraphTextItemType;
import au.com.woolworths.shop.graphql.type.TitleSectionTypes;
import com.apollographql.apollo.api.Fragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bm\b\u0087\b\u0018\u00002\u00020\u0001:l\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklm¨\u0006n"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Header", "ImpressionAnalytics", "Analytics", "Item", "Video", "OnPageCover", "PageCoverContentTheme", "Background", "Foreground", "Primary", "Secondary", "Highlight", "PageCoverPrimaryImage", "PageCoverLogo", "OnUniversalInventoryContainer", "GoogleAdBannerCard", "NextBestAction", "OnActionableCard", "ActionableCardImpressionAnalytics", "ActionableCardClickAnalytics", "OnTitleSection", "OnDownloadableAsset", "OnParagraphTextItem", "OnVerticalList", "VerticalListItem", "OnFullWidthContentCard", "ContentCardAction", "OnInfoTile", "VerticalListAction", "Action", "OnHorizontalList", "HorizontalListTrailingLink", "LinkTextWithAlt", "LinkAction", "HorizontalListAnalytics", "HorizontalListImpressionAnalytics", "Item1", "OnProductCard", "OnRecipeSummaryCard", "OnRecipeMoreCard", "ActionMetadatum", "OnRecipeTagList", "OnRecipeSource", "OnNavRoundel", "NavRoundelAction", "OnPill", "PillAction", "OnContentCard", "ContentCardAction1", "ContentCardFooter", "Logo", "ContentCardBrandImage", "ContentCardAnalytics", "OnMoreCard", "MoreCardAction", "OnProductCategoryTile", "ProductCategoryTileAction", "OnOfferCard", "OnQuickLinkCard", "LinkCardAction", "OnPromotionCard", "PromotionCardProduct", "Analytics1", "ImpressionAnalytics1", "OnRecipeMethod", "Item2", "OnInsetBanner", "Action1", "OnBasicCoreRowList", "BasicCoreRowListItem", "Row", "LeadingAsset", "OnHostedIcon", "Action2", "BasicCoreRowListAnalytics", "BasicCoreRowListImpressionAnalytics", "OnVideo", "OnEditorialCarousel", "EditorialCarouselItem", "OnEditorialBanner", "OnEditorialBanner1", "OnSearchNavCard", "SearchNavCardAction", "OnBasicCoreBroadcastBanner", "ImpressionAnalytics2", "BroadcastBannerDismissAnalytics", "BroadcastBannerUI", "Icon", "OnCoreIcon", "OnHostedIcon1", "BroadcastBannerAction", "OnButtonSection", "ButtonSectionButton", "OnGridList", "GridListAnalytics", "GridListImpressionAnalytics", "GridListItem", "OnRecipeSummaryCard1", "OnInfoTile1", "OnChatEntryCardV3", "ChatEntryCardAction", "Analytics2", "OnCatalogueCard", "ClickAnalytics", "ImpressionAnalytics3", "OnActionableCard1", "ActionableCardImpressionAnalytics1", "ActionableCardClickAnalytics1", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ContentPage implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final Header f19528a;
    public final ImpressionAnalytics b;
    public final Analytics c;
    public final Integer d;
    public final ArrayList e;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Action;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: a, reason: collision with root package name */
        public final String f19529a;
        public final ActionFields b;

        public Action(String str, ActionFields actionFields) {
            this.f19529a = str;
            this.b = actionFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return Intrinsics.c(this.f19529a, action.f19529a) && Intrinsics.c(this.b, action.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19529a.hashCode() * 31);
        }

        public final String toString() {
            return "Action(__typename=" + this.f19529a + ", actionFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Action1;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action1 {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerActionPlacement f19530a;
        public final InsetBannerActionType b;
        public final String c;
        public final String d;

        public Action1(InsetBannerActionPlacement insetBannerActionPlacement, InsetBannerActionType insetBannerActionType, String str, String str2) {
            this.f19530a = insetBannerActionPlacement;
            this.b = insetBannerActionType;
            this.c = str;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action1)) {
                return false;
            }
            Action1 action1 = (Action1) obj;
            return this.f19530a == action1.f19530a && this.b == action1.b && Intrinsics.c(this.c, action1.c) && Intrinsics.c(this.d, action1.d);
        }

        public final int hashCode() {
            int iC = b.c(d.c(this.b, this.f19530a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.l(d.t("Action1(placement=", this.f19530a, ", type=", this.b, ", label="), this.c, ", url=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Action2;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19531a;
        public final ActionFields b;

        public Action2(String str, ActionFields actionFields) {
            this.f19531a = str;
            this.b = actionFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action2)) {
                return false;
            }
            Action2 action2 = (Action2) obj;
            return Intrinsics.c(this.f19531a, action2.f19531a) && Intrinsics.c(this.b, action2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19531a.hashCode() * 31);
        }

        public final String toString() {
            return "Action2(__typename=" + this.f19531a + ", actionFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ActionMetadatum;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActionMetadatum {

        /* renamed from: a, reason: collision with root package name */
        public final String f19532a;
        public final OnRecipeTagList b;
        public final OnRecipeSource c;

        public ActionMetadatum(String __typename, OnRecipeTagList onRecipeTagList, OnRecipeSource onRecipeSource) {
            Intrinsics.h(__typename, "__typename");
            this.f19532a = __typename;
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
            return Intrinsics.c(this.f19532a, actionMetadatum.f19532a) && Intrinsics.c(this.b, actionMetadatum.b) && Intrinsics.c(this.c, actionMetadatum.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19532a.hashCode() * 31;
            OnRecipeTagList onRecipeTagList = this.b;
            int iHashCode2 = (iHashCode + (onRecipeTagList == null ? 0 : onRecipeTagList.f19618a.hashCode())) * 31;
            OnRecipeSource onRecipeSource = this.c;
            return iHashCode2 + (onRecipeSource != null ? onRecipeSource.f19615a.hashCode() : 0);
        }

        public final String toString() {
            return "ActionMetadatum(__typename=" + this.f19532a + ", onRecipeTagList=" + this.b + ", onRecipeSource=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ActionableCardClickAnalytics;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActionableCardClickAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f19533a;
        public final AnalyticsFields b;

        public ActionableCardClickAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f19533a = str;
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
            return Intrinsics.c(this.f19533a, actionableCardClickAnalytics.f19533a) && Intrinsics.c(this.b, actionableCardClickAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19533a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ActionableCardClickAnalytics(__typename=", this.f19533a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ActionableCardClickAnalytics1;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActionableCardClickAnalytics1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19534a;
        public final AnalyticsFields b;

        public ActionableCardClickAnalytics1(String str, AnalyticsFields analyticsFields) {
            this.f19534a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionableCardClickAnalytics1)) {
                return false;
            }
            ActionableCardClickAnalytics1 actionableCardClickAnalytics1 = (ActionableCardClickAnalytics1) obj;
            return Intrinsics.c(this.f19534a, actionableCardClickAnalytics1.f19534a) && Intrinsics.c(this.b, actionableCardClickAnalytics1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19534a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ActionableCardClickAnalytics1(__typename=", this.f19534a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ActionableCardImpressionAnalytics;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActionableCardImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f19535a;
        public final AnalyticsFields b;

        public ActionableCardImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f19535a = str;
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
            return Intrinsics.c(this.f19535a, actionableCardImpressionAnalytics.f19535a) && Intrinsics.c(this.b, actionableCardImpressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19535a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ActionableCardImpressionAnalytics(__typename=", this.f19535a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ActionableCardImpressionAnalytics1;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActionableCardImpressionAnalytics1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19536a;
        public final AnalyticsFields b;

        public ActionableCardImpressionAnalytics1(String str, AnalyticsFields analyticsFields) {
            this.f19536a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionableCardImpressionAnalytics1)) {
                return false;
            }
            ActionableCardImpressionAnalytics1 actionableCardImpressionAnalytics1 = (ActionableCardImpressionAnalytics1) obj;
            return Intrinsics.c(this.f19536a, actionableCardImpressionAnalytics1.f19536a) && Intrinsics.c(this.b, actionableCardImpressionAnalytics1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19536a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ActionableCardImpressionAnalytics1(__typename=", this.f19536a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Analytics;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f19537a;
        public final AnalyticsFields b;

        public Analytics(String str, AnalyticsFields analyticsFields) {
            this.f19537a = str;
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
            return Intrinsics.c(this.f19537a, analytics.f19537a) && Intrinsics.c(this.b, analytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19537a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics(__typename=", this.f19537a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Analytics1;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19538a;
        public final AnalyticsFields b;

        public Analytics1(String str, AnalyticsFields analyticsFields) {
            this.f19538a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics1)) {
                return false;
            }
            Analytics1 analytics1 = (Analytics1) obj;
            return Intrinsics.c(this.f19538a, analytics1.f19538a) && Intrinsics.c(this.b, analytics1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19538a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics1(__typename=", this.f19538a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Analytics2;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19539a;
        public final AnalyticsFields b;

        public Analytics2(String str, AnalyticsFields analyticsFields) {
            this.f19539a = str;
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
            return Intrinsics.c(this.f19539a, analytics2.f19539a) && Intrinsics.c(this.b, analytics2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19539a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics2(__typename=", this.f19539a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Background;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Background {

        /* renamed from: a, reason: collision with root package name */
        public final String f19540a;

        public Background(String str) {
            this.f19540a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Background) && Intrinsics.c(this.f19540a, ((Background) obj).f19540a);
        }

        public final int hashCode() {
            return this.f19540a.hashCode();
        }

        public final String toString() {
            return YU.a.h("Background(lightHexCode=", this.f19540a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$BasicCoreRowListAnalytics;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BasicCoreRowListAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f19541a;
        public final AnalyticsFields b;

        public BasicCoreRowListAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f19541a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BasicCoreRowListAnalytics)) {
                return false;
            }
            BasicCoreRowListAnalytics basicCoreRowListAnalytics = (BasicCoreRowListAnalytics) obj;
            return Intrinsics.c(this.f19541a, basicCoreRowListAnalytics.f19541a) && Intrinsics.c(this.b, basicCoreRowListAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19541a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("BasicCoreRowListAnalytics(__typename=", this.f19541a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$BasicCoreRowListImpressionAnalytics;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BasicCoreRowListImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f19542a;
        public final AnalyticsFields b;

        public BasicCoreRowListImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f19542a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BasicCoreRowListImpressionAnalytics)) {
                return false;
            }
            BasicCoreRowListImpressionAnalytics basicCoreRowListImpressionAnalytics = (BasicCoreRowListImpressionAnalytics) obj;
            return Intrinsics.c(this.f19542a, basicCoreRowListImpressionAnalytics.f19542a) && Intrinsics.c(this.b, basicCoreRowListImpressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19542a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("BasicCoreRowListImpressionAnalytics(__typename=", this.f19542a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$BasicCoreRowListItem;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BasicCoreRowListItem {

        /* renamed from: a, reason: collision with root package name */
        public final Row f19543a;
        public final Action2 b;

        public BasicCoreRowListItem(Row row, Action2 action2) {
            this.f19543a = row;
            this.b = action2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BasicCoreRowListItem)) {
                return false;
            }
            BasicCoreRowListItem basicCoreRowListItem = (BasicCoreRowListItem) obj;
            return Intrinsics.c(this.f19543a, basicCoreRowListItem.f19543a) && Intrinsics.c(this.b, basicCoreRowListItem.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19543a.hashCode() * 31);
        }

        public final String toString() {
            return "BasicCoreRowListItem(row=" + this.f19543a + ", action=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$BroadcastBannerAction;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BroadcastBannerAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f19544a;
        public final ActionFields b;

        public BroadcastBannerAction(String str, ActionFields actionFields) {
            this.f19544a = str;
            this.b = actionFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BroadcastBannerAction)) {
                return false;
            }
            BroadcastBannerAction broadcastBannerAction = (BroadcastBannerAction) obj;
            return Intrinsics.c(this.f19544a, broadcastBannerAction.f19544a) && Intrinsics.c(this.b, broadcastBannerAction.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19544a.hashCode() * 31);
        }

        public final String toString() {
            return "BroadcastBannerAction(__typename=" + this.f19544a + ", actionFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$BroadcastBannerDismissAnalytics;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BroadcastBannerDismissAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f19545a;
        public final AnalyticsFields b;

        public BroadcastBannerDismissAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f19545a = str;
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
            return Intrinsics.c(this.f19545a, broadcastBannerDismissAnalytics.f19545a) && Intrinsics.c(this.b, broadcastBannerDismissAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19545a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("BroadcastBannerDismissAnalytics(__typename=", this.f19545a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$BroadcastBannerUI;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BroadcastBannerUI {

        /* renamed from: a, reason: collision with root package name */
        public final String f19546a;
        public final String b;
        public final CoreBroadcastBannerStyle c;
        public final Icon d;

        public BroadcastBannerUI(String str, String str2, CoreBroadcastBannerStyle coreBroadcastBannerStyle, Icon icon) {
            this.f19546a = str;
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
            return Intrinsics.c(this.f19546a, broadcastBannerUI.f19546a) && Intrinsics.c(this.b, broadcastBannerUI.b) && this.c == broadcastBannerUI.c && Intrinsics.c(this.d, broadcastBannerUI.d);
        }

        public final int hashCode() {
            int iHashCode = this.f19546a.hashCode() * 31;
            String str = this.b;
            return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("BroadcastBannerUI(title=", this.f19546a, ", subtitle=", this.b, ", style=");
            sbV.append(this.c);
            sbV.append(", icon=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ButtonSectionButton;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ButtonSectionButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f19547a;
        public final CoreButtonFields b;

        public ButtonSectionButton(String str, CoreButtonFields coreButtonFields) {
            this.f19547a = str;
            this.b = coreButtonFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonSectionButton)) {
                return false;
            }
            ButtonSectionButton buttonSectionButton = (ButtonSectionButton) obj;
            return Intrinsics.c(this.f19547a, buttonSectionButton.f19547a) && Intrinsics.c(this.b, buttonSectionButton.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19547a.hashCode() * 31);
        }

        public final String toString() {
            return "ButtonSectionButton(__typename=" + this.f19547a + ", coreButtonFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ChatEntryCardAction;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChatEntryCardAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f19548a;
        public final String b;
        public final ActionType c;
        public final Analytics2 d;

        public ChatEntryCardAction(String str, String str2, ActionType actionType, Analytics2 analytics2) {
            this.f19548a = str;
            this.b = str2;
            this.c = actionType;
            this.d = analytics2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChatEntryCardAction)) {
                return false;
            }
            ChatEntryCardAction chatEntryCardAction = (ChatEntryCardAction) obj;
            return Intrinsics.c(this.f19548a, chatEntryCardAction.f19548a) && Intrinsics.c(this.b, chatEntryCardAction.b) && this.c == chatEntryCardAction.c && Intrinsics.c(this.d, chatEntryCardAction.d);
        }

        public final int hashCode() {
            String str = this.f19548a;
            int iA = d.a(this.c, b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31);
            Analytics2 analytics2 = this.d;
            return iA + (analytics2 != null ? analytics2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("ChatEntryCardAction(id=", this.f19548a, ", action=", this.b, ", type=");
            sbV.append(this.c);
            sbV.append(", analytics=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ClickAnalytics;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ClickAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f19549a;
        public final AnalyticsFields b;

        public ClickAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f19549a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ClickAnalytics)) {
                return false;
            }
            ClickAnalytics clickAnalytics = (ClickAnalytics) obj;
            return Intrinsics.c(this.f19549a, clickAnalytics.f19549a) && Intrinsics.c(this.b, clickAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19549a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ClickAnalytics(__typename=", this.f19549a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ContentCardAction;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ContentCardAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f19550a;
        public final ActionFields b;

        public ContentCardAction(String str, ActionFields actionFields) {
            this.f19550a = str;
            this.b = actionFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentCardAction)) {
                return false;
            }
            ContentCardAction contentCardAction = (ContentCardAction) obj;
            return Intrinsics.c(this.f19550a, contentCardAction.f19550a) && Intrinsics.c(this.b, contentCardAction.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19550a.hashCode() * 31);
        }

        public final String toString() {
            return "ContentCardAction(__typename=" + this.f19550a + ", actionFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ContentCardAction1;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ContentCardAction1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19551a;
        public final ActionFields b;

        public ContentCardAction1(String str, ActionFields actionFields) {
            this.f19551a = str;
            this.b = actionFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentCardAction1)) {
                return false;
            }
            ContentCardAction1 contentCardAction1 = (ContentCardAction1) obj;
            return Intrinsics.c(this.f19551a, contentCardAction1.f19551a) && Intrinsics.c(this.b, contentCardAction1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19551a.hashCode() * 31);
        }

        public final String toString() {
            return "ContentCardAction1(__typename=" + this.f19551a + ", actionFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ContentCardAnalytics;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ContentCardAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f19552a;
        public final AnalyticsFields b;

        public ContentCardAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f19552a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentCardAnalytics)) {
                return false;
            }
            ContentCardAnalytics contentCardAnalytics = (ContentCardAnalytics) obj;
            return Intrinsics.c(this.f19552a, contentCardAnalytics.f19552a) && Intrinsics.c(this.b, contentCardAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19552a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ContentCardAnalytics(__typename=", this.f19552a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ContentCardBrandImage;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ContentCardBrandImage {

        /* renamed from: a, reason: collision with root package name */
        public final String f19553a;
        public final String b;

        public ContentCardBrandImage(String str, String str2) {
            this.f19553a = str;
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
            return Intrinsics.c(this.f19553a, contentCardBrandImage.f19553a) && Intrinsics.c(this.b, contentCardBrandImage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19553a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("ContentCardBrandImage(imageUrl=", this.f19553a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ContentCardFooter;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ContentCardFooter {

        /* renamed from: a, reason: collision with root package name */
        public final FooterStyle f19554a;
        public final String b;
        public final Logo c;

        public ContentCardFooter(FooterStyle footerStyle, String str, Logo logo) {
            this.f19554a = footerStyle;
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
            return this.f19554a == contentCardFooter.f19554a && Intrinsics.c(this.b, contentCardFooter.b) && Intrinsics.c(this.c, contentCardFooter.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19554a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Logo logo = this.c;
            return iHashCode2 + (logo != null ? logo.hashCode() : 0);
        }

        public final String toString() {
            return "ContentCardFooter(style=" + this.f19554a + ", text=" + this.b + ", logo=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$EditorialCarouselItem;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EditorialCarouselItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f19555a;
        public final OnEditorialBanner b;

        public EditorialCarouselItem(String __typename, OnEditorialBanner onEditorialBanner) {
            Intrinsics.h(__typename, "__typename");
            this.f19555a = __typename;
            this.b = onEditorialBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EditorialCarouselItem)) {
                return false;
            }
            EditorialCarouselItem editorialCarouselItem = (EditorialCarouselItem) obj;
            return Intrinsics.c(this.f19555a, editorialCarouselItem.f19555a) && Intrinsics.c(this.b, editorialCarouselItem.b);
        }

        public final int hashCode() {
            int iHashCode = this.f19555a.hashCode() * 31;
            OnEditorialBanner onEditorialBanner = this.b;
            return iHashCode + (onEditorialBanner == null ? 0 : onEditorialBanner.hashCode());
        }

        public final String toString() {
            return "EditorialCarouselItem(__typename=" + this.f19555a + ", onEditorialBanner=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Foreground;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Foreground {

        /* renamed from: a, reason: collision with root package name */
        public final Primary f19556a;
        public final Secondary b;
        public final Highlight c;

        public Foreground(Primary primary, Secondary secondary, Highlight highlight) {
            this.f19556a = primary;
            this.b = secondary;
            this.c = highlight;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Foreground)) {
                return false;
            }
            Foreground foreground = (Foreground) obj;
            return Intrinsics.c(this.f19556a, foreground.f19556a) && Intrinsics.c(this.b, foreground.b) && Intrinsics.c(this.c, foreground.c);
        }

        public final int hashCode() {
            return this.c.f19562a.hashCode() + b.c(this.f19556a.f19628a.hashCode() * 31, 31, this.b.f19633a);
        }

        public final String toString() {
            return "Foreground(primary=" + this.f19556a + ", secondary=" + this.b + ", highlight=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$GoogleAdBannerCard;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GoogleAdBannerCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f19557a;
        public final String b;
        public final String c;
        public final GoogleAdCustomTargeting d;
        public final String e;
        public final String f;
        public final Boolean g;

        public GoogleAdBannerCard(String str, String str2, String str3, GoogleAdCustomTargeting googleAdCustomTargeting, String str4, String str5, Boolean bool) {
            this.f19557a = str;
            this.b = str2;
            this.c = str3;
            this.d = googleAdCustomTargeting;
            this.e = str4;
            this.f = str5;
            this.g = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GoogleAdBannerCard)) {
                return false;
            }
            GoogleAdBannerCard googleAdBannerCard = (GoogleAdBannerCard) obj;
            return Intrinsics.c(this.f19557a, googleAdBannerCard.f19557a) && Intrinsics.c(this.b, googleAdBannerCard.b) && Intrinsics.c(this.c, googleAdBannerCard.c) && Intrinsics.c(this.d, googleAdBannerCard.d) && Intrinsics.c(this.e, googleAdBannerCard.e) && Intrinsics.c(this.f, googleAdBannerCard.f) && Intrinsics.c(this.g, googleAdBannerCard.g);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f19557a.hashCode() * 31, 31, this.b), 31, this.c);
            GoogleAdCustomTargeting googleAdCustomTargeting = this.d;
            int iHashCode = (iC + (googleAdCustomTargeting == null ? 0 : googleAdCustomTargeting.hashCode())) * 31;
            String str = this.e;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.g;
            return iHashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("GoogleAdBannerCard(__typename=", this.f19557a, ", adUnit=", this.b, ", nativeCustomTemplateId=");
            sbV.append(this.c);
            sbV.append(", targeting=");
            sbV.append(this.d);
            sbV.append(", iabSize=");
            a.B(sbV, this.e, ", correlator=", this.f, ", _excluded=");
            return au.com.woolworths.android.onesite.a.o(sbV, this.g, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$GridListAnalytics;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GridListAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f19558a;
        public final AnalyticsFields b;

        public GridListAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f19558a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GridListAnalytics)) {
                return false;
            }
            GridListAnalytics gridListAnalytics = (GridListAnalytics) obj;
            return Intrinsics.c(this.f19558a, gridListAnalytics.f19558a) && Intrinsics.c(this.b, gridListAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19558a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("GridListAnalytics(__typename=", this.f19558a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$GridListImpressionAnalytics;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GridListImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f19559a;
        public final AnalyticsFields b;

        public GridListImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f19559a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GridListImpressionAnalytics)) {
                return false;
            }
            GridListImpressionAnalytics gridListImpressionAnalytics = (GridListImpressionAnalytics) obj;
            return Intrinsics.c(this.f19559a, gridListImpressionAnalytics.f19559a) && Intrinsics.c(this.b, gridListImpressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19559a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("GridListImpressionAnalytics(__typename=", this.f19559a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$GridListItem;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GridListItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f19560a;
        public final OnRecipeSummaryCard1 b;

        public GridListItem(String __typename, OnRecipeSummaryCard1 onRecipeSummaryCard1) {
            Intrinsics.h(__typename, "__typename");
            this.f19560a = __typename;
            this.b = onRecipeSummaryCard1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GridListItem)) {
                return false;
            }
            GridListItem gridListItem = (GridListItem) obj;
            return Intrinsics.c(this.f19560a, gridListItem.f19560a) && Intrinsics.c(this.b, gridListItem.b);
        }

        public final int hashCode() {
            int iHashCode = this.f19560a.hashCode() * 31;
            OnRecipeSummaryCard1 onRecipeSummaryCard1 = this.b;
            return iHashCode + (onRecipeSummaryCard1 == null ? 0 : onRecipeSummaryCard1.hashCode());
        }

        public final String toString() {
            return "GridListItem(__typename=" + this.f19560a + ", onRecipeSummaryCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Header;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Header {

        /* renamed from: a, reason: collision with root package name */
        public final String f19561a;
        public final String b;
        public final GenericPageHeroImageType c;
        public final Video d;

        public Header(String str, String str2, GenericPageHeroImageType genericPageHeroImageType, Video video) {
            this.f19561a = str;
            this.b = str2;
            this.c = genericPageHeroImageType;
            this.d = video;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return Intrinsics.c(this.f19561a, header.f19561a) && Intrinsics.c(this.b, header.b) && this.c == header.c && Intrinsics.c(this.d, header.d);
        }

        public final int hashCode() {
            int iHashCode = this.f19561a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            GenericPageHeroImageType genericPageHeroImageType = this.c;
            int iHashCode3 = (iHashCode2 + (genericPageHeroImageType == null ? 0 : genericPageHeroImageType.hashCode())) * 31;
            Video video = this.d;
            return iHashCode3 + (video != null ? video.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("Header(pageTitle=", this.f19561a, ", heroImage=", this.b, ", heroImageType=");
            sbV.append(this.c);
            sbV.append(", video=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Highlight;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Highlight {

        /* renamed from: a, reason: collision with root package name */
        public final String f19562a;

        public Highlight(String str) {
            this.f19562a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Highlight) && Intrinsics.c(this.f19562a, ((Highlight) obj).f19562a);
        }

        public final int hashCode() {
            return this.f19562a.hashCode();
        }

        public final String toString() {
            return YU.a.h("Highlight(lightHexCode=", this.f19562a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$HorizontalListAnalytics;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HorizontalListAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f19563a;
        public final AnalyticsFields b;

        public HorizontalListAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f19563a = str;
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
            return Intrinsics.c(this.f19563a, horizontalListAnalytics.f19563a) && Intrinsics.c(this.b, horizontalListAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19563a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("HorizontalListAnalytics(__typename=", this.f19563a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$HorizontalListImpressionAnalytics;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HorizontalListImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f19564a;
        public final AnalyticsFields b;

        public HorizontalListImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f19564a = str;
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
            return Intrinsics.c(this.f19564a, horizontalListImpressionAnalytics.f19564a) && Intrinsics.c(this.b, horizontalListImpressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19564a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("HorizontalListImpressionAnalytics(__typename=", this.f19564a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$HorizontalListTrailingLink;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HorizontalListTrailingLink {

        /* renamed from: a, reason: collision with root package name */
        public final LinkTextWithAlt f19565a;
        public final String b;
        public final LinkAction c;

        public HorizontalListTrailingLink(LinkTextWithAlt linkTextWithAlt, String str, LinkAction linkAction) {
            this.f19565a = linkTextWithAlt;
            this.b = str;
            this.c = linkAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HorizontalListTrailingLink)) {
                return false;
            }
            HorizontalListTrailingLink horizontalListTrailingLink = (HorizontalListTrailingLink) obj;
            return Intrinsics.c(this.f19565a, horizontalListTrailingLink.f19565a) && Intrinsics.c(this.b, horizontalListTrailingLink.b) && Intrinsics.c(this.c, horizontalListTrailingLink.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19565a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return "HorizontalListTrailingLink(linkTextWithAlt=" + this.f19565a + ", linkId=" + this.b + ", linkAction=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Icon;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Icon {

        /* renamed from: a, reason: collision with root package name */
        public final String f19566a;
        public final OnCoreIcon b;
        public final OnHostedIcon1 c;

        public Icon(String __typename, OnCoreIcon onCoreIcon, OnHostedIcon1 onHostedIcon1) {
            Intrinsics.h(__typename, "__typename");
            this.f19566a = __typename;
            this.b = onCoreIcon;
            this.c = onHostedIcon1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) obj;
            return Intrinsics.c(this.f19566a, icon.f19566a) && Intrinsics.c(this.b, icon.b) && Intrinsics.c(this.c, icon.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19566a.hashCode() * 31;
            OnCoreIcon onCoreIcon = this.b;
            int iHashCode2 = (iHashCode + (onCoreIcon == null ? 0 : onCoreIcon.hashCode())) * 31;
            OnHostedIcon1 onHostedIcon1 = this.c;
            return iHashCode2 + (onHostedIcon1 != null ? onHostedIcon1.hashCode() : 0);
        }

        public final String toString() {
            return "Icon(__typename=" + this.f19566a + ", onCoreIcon=" + this.b + ", onHostedIcon=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ImpressionAnalytics;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f19567a;
        public final AnalyticsFields b;

        public ImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f19567a = str;
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
            return Intrinsics.c(this.f19567a, impressionAnalytics.f19567a) && Intrinsics.c(this.b, impressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19567a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytics(__typename=", this.f19567a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ImpressionAnalytics1;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19568a;
        public final AnalyticsFields b;

        public ImpressionAnalytics1(String str, AnalyticsFields analyticsFields) {
            this.f19568a = str;
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
            return Intrinsics.c(this.f19568a, impressionAnalytics1.f19568a) && Intrinsics.c(this.b, impressionAnalytics1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19568a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytics1(__typename=", this.f19568a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ImpressionAnalytics2;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19569a;
        public final AnalyticsFields b;

        public ImpressionAnalytics2(String str, AnalyticsFields analyticsFields) {
            this.f19569a = str;
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
            return Intrinsics.c(this.f19569a, impressionAnalytics2.f19569a) && Intrinsics.c(this.b, impressionAnalytics2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19569a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytics2(__typename=", this.f19569a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ImpressionAnalytics3;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19570a;
        public final AnalyticsFields b;

        public ImpressionAnalytics3(String str, AnalyticsFields analyticsFields) {
            this.f19570a = str;
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
            return Intrinsics.c(this.f19570a, impressionAnalytics3.f19570a) && Intrinsics.c(this.b, impressionAnalytics3.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19570a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytics3(__typename=", this.f19570a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Item;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f19571a;
        public final OnPageCover b;
        public final OnUniversalInventoryContainer c;
        public final OnTitleSection d;
        public final OnDownloadableAsset e;
        public final OnParagraphTextItem f;
        public final OnVerticalList g;
        public final OnHorizontalList h;
        public final OnRecipeMethod i;
        public final OnInsetBanner j;
        public final OnBasicCoreRowList k;
        public final OnVideo l;
        public final OnEditorialCarousel m;
        public final OnEditorialBanner1 n;
        public final OnSearchNavCard o;
        public final OnBasicCoreBroadcastBanner p;
        public final OnButtonSection q;
        public final OnGridList r;
        public final OnInfoTile1 s;
        public final OnChatEntryCardV3 t;
        public final OnCatalogueCard u;
        public final OnActionableCard1 v;

        public Item(String __typename, OnPageCover onPageCover, OnUniversalInventoryContainer onUniversalInventoryContainer, OnTitleSection onTitleSection, OnDownloadableAsset onDownloadableAsset, OnParagraphTextItem onParagraphTextItem, OnVerticalList onVerticalList, OnHorizontalList onHorizontalList, OnRecipeMethod onRecipeMethod, OnInsetBanner onInsetBanner, OnBasicCoreRowList onBasicCoreRowList, OnVideo onVideo, OnEditorialCarousel onEditorialCarousel, OnEditorialBanner1 onEditorialBanner1, OnSearchNavCard onSearchNavCard, OnBasicCoreBroadcastBanner onBasicCoreBroadcastBanner, OnButtonSection onButtonSection, OnGridList onGridList, OnInfoTile1 onInfoTile1, OnChatEntryCardV3 onChatEntryCardV3, OnCatalogueCard onCatalogueCard, OnActionableCard1 onActionableCard1) {
            Intrinsics.h(__typename, "__typename");
            this.f19571a = __typename;
            this.b = onPageCover;
            this.c = onUniversalInventoryContainer;
            this.d = onTitleSection;
            this.e = onDownloadableAsset;
            this.f = onParagraphTextItem;
            this.g = onVerticalList;
            this.h = onHorizontalList;
            this.i = onRecipeMethod;
            this.j = onInsetBanner;
            this.k = onBasicCoreRowList;
            this.l = onVideo;
            this.m = onEditorialCarousel;
            this.n = onEditorialBanner1;
            this.o = onSearchNavCard;
            this.p = onBasicCoreBroadcastBanner;
            this.q = onButtonSection;
            this.r = onGridList;
            this.s = onInfoTile1;
            this.t = onChatEntryCardV3;
            this.u = onCatalogueCard;
            this.v = onActionableCard1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f19571a, item.f19571a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c) && Intrinsics.c(this.d, item.d) && Intrinsics.c(this.e, item.e) && Intrinsics.c(this.f, item.f) && Intrinsics.c(this.g, item.g) && Intrinsics.c(this.h, item.h) && Intrinsics.c(this.i, item.i) && Intrinsics.c(this.j, item.j) && Intrinsics.c(this.k, item.k) && Intrinsics.c(this.l, item.l) && Intrinsics.c(this.m, item.m) && Intrinsics.c(this.n, item.n) && Intrinsics.c(this.o, item.o) && Intrinsics.c(this.p, item.p) && Intrinsics.c(this.q, item.q) && Intrinsics.c(this.r, item.r) && Intrinsics.c(this.s, item.s) && Intrinsics.c(this.t, item.t) && Intrinsics.c(this.u, item.u) && Intrinsics.c(this.v, item.v);
        }

        public final int hashCode() {
            int iHashCode = this.f19571a.hashCode() * 31;
            OnPageCover onPageCover = this.b;
            int iHashCode2 = (iHashCode + (onPageCover == null ? 0 : onPageCover.hashCode())) * 31;
            OnUniversalInventoryContainer onUniversalInventoryContainer = this.c;
            int iHashCode3 = (iHashCode2 + (onUniversalInventoryContainer == null ? 0 : onUniversalInventoryContainer.hashCode())) * 31;
            OnTitleSection onTitleSection = this.d;
            int iHashCode4 = (iHashCode3 + (onTitleSection == null ? 0 : onTitleSection.hashCode())) * 31;
            OnDownloadableAsset onDownloadableAsset = this.e;
            int iHashCode5 = (iHashCode4 + (onDownloadableAsset == null ? 0 : onDownloadableAsset.hashCode())) * 31;
            OnParagraphTextItem onParagraphTextItem = this.f;
            int iHashCode6 = (iHashCode5 + (onParagraphTextItem == null ? 0 : onParagraphTextItem.hashCode())) * 31;
            OnVerticalList onVerticalList = this.g;
            int iHashCode7 = (iHashCode6 + (onVerticalList == null ? 0 : onVerticalList.hashCode())) * 31;
            OnHorizontalList onHorizontalList = this.h;
            int iHashCode8 = (iHashCode7 + (onHorizontalList == null ? 0 : onHorizontalList.hashCode())) * 31;
            OnRecipeMethod onRecipeMethod = this.i;
            int iHashCode9 = (iHashCode8 + (onRecipeMethod == null ? 0 : onRecipeMethod.hashCode())) * 31;
            OnInsetBanner onInsetBanner = this.j;
            int iHashCode10 = (iHashCode9 + (onInsetBanner == null ? 0 : onInsetBanner.hashCode())) * 31;
            OnBasicCoreRowList onBasicCoreRowList = this.k;
            int iHashCode11 = (iHashCode10 + (onBasicCoreRowList == null ? 0 : onBasicCoreRowList.hashCode())) * 31;
            OnVideo onVideo = this.l;
            int iHashCode12 = (iHashCode11 + (onVideo == null ? 0 : onVideo.hashCode())) * 31;
            OnEditorialCarousel onEditorialCarousel = this.m;
            int iHashCode13 = (iHashCode12 + (onEditorialCarousel == null ? 0 : onEditorialCarousel.f19594a.hashCode())) * 31;
            OnEditorialBanner1 onEditorialBanner1 = this.n;
            int iHashCode14 = (iHashCode13 + (onEditorialBanner1 == null ? 0 : onEditorialBanner1.hashCode())) * 31;
            OnSearchNavCard onSearchNavCard = this.o;
            int iHashCode15 = (iHashCode14 + (onSearchNavCard == null ? 0 : onSearchNavCard.hashCode())) * 31;
            OnBasicCoreBroadcastBanner onBasicCoreBroadcastBanner = this.p;
            int iHashCode16 = (iHashCode15 + (onBasicCoreBroadcastBanner == null ? 0 : onBasicCoreBroadcastBanner.hashCode())) * 31;
            OnButtonSection onButtonSection = this.q;
            int iHashCode17 = (iHashCode16 + (onButtonSection == null ? 0 : onButtonSection.f19586a.hashCode())) * 31;
            OnGridList onGridList = this.r;
            int iHashCode18 = (iHashCode17 + (onGridList == null ? 0 : onGridList.hashCode())) * 31;
            OnInfoTile1 onInfoTile1 = this.s;
            int iHashCode19 = (iHashCode18 + (onInfoTile1 == null ? 0 : onInfoTile1.hashCode())) * 31;
            OnChatEntryCardV3 onChatEntryCardV3 = this.t;
            int iHashCode20 = (iHashCode19 + (onChatEntryCardV3 == null ? 0 : onChatEntryCardV3.hashCode())) * 31;
            OnCatalogueCard onCatalogueCard = this.u;
            int iHashCode21 = (iHashCode20 + (onCatalogueCard == null ? 0 : onCatalogueCard.hashCode())) * 31;
            OnActionableCard1 onActionableCard1 = this.v;
            return iHashCode21 + (onActionableCard1 != null ? onActionableCard1.hashCode() : 0);
        }

        public final String toString() {
            return "Item(__typename=" + this.f19571a + ", onPageCover=" + this.b + ", onUniversalInventoryContainer=" + this.c + ", onTitleSection=" + this.d + ", onDownloadableAsset=" + this.e + ", onParagraphTextItem=" + this.f + ", onVerticalList=" + this.g + ", onHorizontalList=" + this.h + ", onRecipeMethod=" + this.i + ", onInsetBanner=" + this.j + ", onBasicCoreRowList=" + this.k + ", onVideo=" + this.l + ", onEditorialCarousel=" + this.m + ", onEditorialBanner=" + this.n + ", onSearchNavCard=" + this.o + ", onBasicCoreBroadcastBanner=" + this.p + ", onButtonSection=" + this.q + ", onGridList=" + this.r + ", onInfoTile=" + this.s + ", onChatEntryCardV3=" + this.t + ", onCatalogueCard=" + this.u + ", onActionableCard=" + this.v + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Item1;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19572a;
        public final OnProductCard b;
        public final OnRecipeSummaryCard c;
        public final OnRecipeMoreCard d;
        public final OnNavRoundel e;
        public final OnPill f;
        public final OnContentCard g;
        public final OnMoreCard h;
        public final OnProductCategoryTile i;
        public final OnOfferCard j;
        public final OnQuickLinkCard k;
        public final OnPromotionCard l;

        public Item1(String __typename, OnProductCard onProductCard, OnRecipeSummaryCard onRecipeSummaryCard, OnRecipeMoreCard onRecipeMoreCard, OnNavRoundel onNavRoundel, OnPill onPill, OnContentCard onContentCard, OnMoreCard onMoreCard, OnProductCategoryTile onProductCategoryTile, OnOfferCard onOfferCard, OnQuickLinkCard onQuickLinkCard, OnPromotionCard onPromotionCard) {
            Intrinsics.h(__typename, "__typename");
            this.f19572a = __typename;
            this.b = onProductCard;
            this.c = onRecipeSummaryCard;
            this.d = onRecipeMoreCard;
            this.e = onNavRoundel;
            this.f = onPill;
            this.g = onContentCard;
            this.h = onMoreCard;
            this.i = onProductCategoryTile;
            this.j = onOfferCard;
            this.k = onQuickLinkCard;
            this.l = onPromotionCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item1)) {
                return false;
            }
            Item1 item1 = (Item1) obj;
            return Intrinsics.c(this.f19572a, item1.f19572a) && Intrinsics.c(this.b, item1.b) && Intrinsics.c(this.c, item1.c) && Intrinsics.c(this.d, item1.d) && Intrinsics.c(this.e, item1.e) && Intrinsics.c(this.f, item1.f) && Intrinsics.c(this.g, item1.g) && Intrinsics.c(this.h, item1.h) && Intrinsics.c(this.i, item1.i) && Intrinsics.c(this.j, item1.j) && Intrinsics.c(this.k, item1.k) && Intrinsics.c(this.l, item1.l);
        }

        public final int hashCode() {
            int iHashCode = this.f19572a.hashCode() * 31;
            OnProductCard onProductCard = this.b;
            int iHashCode2 = (iHashCode + (onProductCard == null ? 0 : onProductCard.hashCode())) * 31;
            OnRecipeSummaryCard onRecipeSummaryCard = this.c;
            int iHashCode3 = (iHashCode2 + (onRecipeSummaryCard == null ? 0 : onRecipeSummaryCard.hashCode())) * 31;
            OnRecipeMoreCard onRecipeMoreCard = this.d;
            int iHashCode4 = (iHashCode3 + (onRecipeMoreCard == null ? 0 : onRecipeMoreCard.f19614a.hashCode())) * 31;
            OnNavRoundel onNavRoundel = this.e;
            int iHashCode5 = (iHashCode4 + (onNavRoundel == null ? 0 : onNavRoundel.hashCode())) * 31;
            OnPill onPill = this.f;
            int iHashCode6 = (iHashCode5 + (onPill == null ? 0 : onPill.hashCode())) * 31;
            OnContentCard onContentCard = this.g;
            int iHashCode7 = (iHashCode6 + (onContentCard == null ? 0 : onContentCard.hashCode())) * 31;
            OnMoreCard onMoreCard = this.h;
            int iHashCode8 = (iHashCode7 + (onMoreCard == null ? 0 : onMoreCard.hashCode())) * 31;
            OnProductCategoryTile onProductCategoryTile = this.i;
            int iHashCode9 = (iHashCode8 + (onProductCategoryTile == null ? 0 : onProductCategoryTile.hashCode())) * 31;
            OnOfferCard onOfferCard = this.j;
            int iHashCode10 = (iHashCode9 + (onOfferCard == null ? 0 : onOfferCard.hashCode())) * 31;
            OnQuickLinkCard onQuickLinkCard = this.k;
            int iHashCode11 = (iHashCode10 + (onQuickLinkCard == null ? 0 : onQuickLinkCard.hashCode())) * 31;
            OnPromotionCard onPromotionCard = this.l;
            return iHashCode11 + (onPromotionCard != null ? onPromotionCard.hashCode() : 0);
        }

        public final String toString() {
            return "Item1(__typename=" + this.f19572a + ", onProductCard=" + this.b + ", onRecipeSummaryCard=" + this.c + ", onRecipeMoreCard=" + this.d + ", onNavRoundel=" + this.e + ", onPill=" + this.f + ", onContentCard=" + this.g + ", onMoreCard=" + this.h + ", onProductCategoryTile=" + this.i + ", onOfferCard=" + this.j + ", onQuickLinkCard=" + this.k + ", onPromotionCard=" + this.l + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Item2;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19573a;
        public final String b;
        public final String c;

        public Item2(String str, String str2, String str3) {
            this.f19573a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item2)) {
                return false;
            }
            Item2 item2 = (Item2) obj;
            return Intrinsics.c(this.f19573a, item2.f19573a) && Intrinsics.c(this.b, item2.b) && Intrinsics.c(this.c, item2.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f19573a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return YU.a.o(YU.a.v("Item2(title=", this.f19573a, ", content=", this.b, ", methodImage="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$LeadingAsset;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LeadingAsset {

        /* renamed from: a, reason: collision with root package name */
        public final String f19574a;
        public final OnHostedIcon b;

        public LeadingAsset(String __typename, OnHostedIcon onHostedIcon) {
            Intrinsics.h(__typename, "__typename");
            this.f19574a = __typename;
            this.b = onHostedIcon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LeadingAsset)) {
                return false;
            }
            LeadingAsset leadingAsset = (LeadingAsset) obj;
            return Intrinsics.c(this.f19574a, leadingAsset.f19574a) && Intrinsics.c(this.b, leadingAsset.b);
        }

        public final int hashCode() {
            int iHashCode = this.f19574a.hashCode() * 31;
            OnHostedIcon onHostedIcon = this.b;
            return iHashCode + (onHostedIcon == null ? 0 : onHostedIcon.hashCode());
        }

        public final String toString() {
            return "LeadingAsset(__typename=" + this.f19574a + ", onHostedIcon=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$LinkAction;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f19575a;
        public final ActionFields b;

        public LinkAction(String str, ActionFields actionFields) {
            this.f19575a = str;
            this.b = actionFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkAction)) {
                return false;
            }
            LinkAction linkAction = (LinkAction) obj;
            return Intrinsics.c(this.f19575a, linkAction.f19575a) && Intrinsics.c(this.b, linkAction.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19575a.hashCode() * 31);
        }

        public final String toString() {
            return "LinkAction(__typename=" + this.f19575a + ", actionFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$LinkCardAction;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkCardAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f19576a;
        public final ActionFields b;

        public LinkCardAction(String str, ActionFields actionFields) {
            this.f19576a = str;
            this.b = actionFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkCardAction)) {
                return false;
            }
            LinkCardAction linkCardAction = (LinkCardAction) obj;
            return Intrinsics.c(this.f19576a, linkCardAction.f19576a) && Intrinsics.c(this.b, linkCardAction.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19576a.hashCode() * 31);
        }

        public final String toString() {
            return "LinkCardAction(__typename=" + this.f19576a + ", actionFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$LinkTextWithAlt;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkTextWithAlt {

        /* renamed from: a, reason: collision with root package name */
        public final String f19577a;
        public final String b;

        public LinkTextWithAlt(String str, String str2) {
            this.f19577a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkTextWithAlt)) {
                return false;
            }
            LinkTextWithAlt linkTextWithAlt = (LinkTextWithAlt) obj;
            return Intrinsics.c(this.f19577a, linkTextWithAlt.f19577a) && Intrinsics.c(this.b, linkTextWithAlt.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19577a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("LinkTextWithAlt(altText=", this.f19577a, ", text=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Logo;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Logo {

        /* renamed from: a, reason: collision with root package name */
        public final String f19578a;
        public final String b;

        public Logo(String str, String str2) {
            this.f19578a = str;
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
            return Intrinsics.c(this.f19578a, logo.f19578a) && Intrinsics.c(this.b, logo.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19578a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("Logo(imageUrl=", this.f19578a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$MoreCardAction;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MoreCardAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f19579a;
        public final ActionFields b;

        public MoreCardAction(String str, ActionFields actionFields) {
            this.f19579a = str;
            this.b = actionFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MoreCardAction)) {
                return false;
            }
            MoreCardAction moreCardAction = (MoreCardAction) obj;
            return Intrinsics.c(this.f19579a, moreCardAction.f19579a) && Intrinsics.c(this.b, moreCardAction.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19579a.hashCode() * 31);
        }

        public final String toString() {
            return "MoreCardAction(__typename=" + this.f19579a + ", actionFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$NavRoundelAction;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NavRoundelAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f19580a;
        public final ActionFields b;

        public NavRoundelAction(String str, ActionFields actionFields) {
            this.f19580a = str;
            this.b = actionFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NavRoundelAction)) {
                return false;
            }
            NavRoundelAction navRoundelAction = (NavRoundelAction) obj;
            return Intrinsics.c(this.f19580a, navRoundelAction.f19580a) && Intrinsics.c(this.b, navRoundelAction.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19580a.hashCode() * 31);
        }

        public final String toString() {
            return "NavRoundelAction(__typename=" + this.f19580a + ", actionFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$NextBestAction;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NextBestAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f19581a;
        public final OnActionableCard b;

        public NextBestAction(String __typename, OnActionableCard onActionableCard) {
            Intrinsics.h(__typename, "__typename");
            this.f19581a = __typename;
            this.b = onActionableCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NextBestAction)) {
                return false;
            }
            NextBestAction nextBestAction = (NextBestAction) obj;
            return Intrinsics.c(this.f19581a, nextBestAction.f19581a) && Intrinsics.c(this.b, nextBestAction.b);
        }

        public final int hashCode() {
            int iHashCode = this.f19581a.hashCode() * 31;
            OnActionableCard onActionableCard = this.b;
            return iHashCode + (onActionableCard == null ? 0 : onActionableCard.hashCode());
        }

        public final String toString() {
            return "NextBestAction(__typename=" + this.f19581a + ", onActionableCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnActionableCard;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnActionableCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f19582a;
        public final String b;
        public final String c;
        public final String d;
        public final CardHeight e;
        public final TealiumAnalytics f;
        public final Boolean g;
        public final ActionableCardImpressionAnalytics h;
        public final ActionableCardClickAnalytics i;

        public OnActionableCard(String str, String str2, String str3, String str4, CardHeight cardHeight, TealiumAnalytics tealiumAnalytics, Boolean bool, ActionableCardImpressionAnalytics actionableCardImpressionAnalytics, ActionableCardClickAnalytics actionableCardClickAnalytics) {
            this.f19582a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = cardHeight;
            this.f = tealiumAnalytics;
            this.g = bool;
            this.h = actionableCardImpressionAnalytics;
            this.i = actionableCardClickAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnActionableCard)) {
                return false;
            }
            OnActionableCard onActionableCard = (OnActionableCard) obj;
            return Intrinsics.c(this.f19582a, onActionableCard.f19582a) && Intrinsics.c(this.b, onActionableCard.b) && Intrinsics.c(this.c, onActionableCard.c) && Intrinsics.c(this.d, onActionableCard.d) && this.e == onActionableCard.e && Intrinsics.c(this.f, onActionableCard.f) && Intrinsics.c(this.g, onActionableCard.g) && Intrinsics.c(this.h, onActionableCard.h) && Intrinsics.c(this.i, onActionableCard.i);
        }

        public final int hashCode() {
            int iB = d.b(this.e, b.c(b.c(b.c(this.f19582a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
            TealiumAnalytics tealiumAnalytics = this.f;
            int iHashCode = (iB + (tealiumAnalytics == null ? 0 : tealiumAnalytics.hashCode())) * 31;
            Boolean bool = this.g;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            ActionableCardImpressionAnalytics actionableCardImpressionAnalytics = this.h;
            int iHashCode3 = (iHashCode2 + (actionableCardImpressionAnalytics == null ? 0 : actionableCardImpressionAnalytics.hashCode())) * 31;
            ActionableCardClickAnalytics actionableCardClickAnalytics = this.i;
            return iHashCode3 + (actionableCardClickAnalytics != null ? actionableCardClickAnalytics.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnActionableCard(__typename=", this.f19582a, ", link=", this.b, ", image=");
            a.B(sbV, this.c, ", altText=", this.d, ", cardHeight=");
            sbV.append(this.e);
            sbV.append(", analytics=");
            sbV.append(this.f);
            sbV.append(", _excluded=");
            sbV.append(this.g);
            sbV.append(", actionableCardImpressionAnalytics=");
            sbV.append(this.h);
            sbV.append(", actionableCardClickAnalytics=");
            sbV.append(this.i);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnActionableCard1;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnActionableCard1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19583a;
        public final String b;
        public final CardHeight c;
        public final String d;
        public final Boolean e;
        public final TealiumAnalytics f;
        public final ActionableCardImpressionAnalytics1 g;
        public final ActionableCardClickAnalytics1 h;

        public OnActionableCard1(String str, String str2, CardHeight cardHeight, String str3, Boolean bool, TealiumAnalytics tealiumAnalytics, ActionableCardImpressionAnalytics1 actionableCardImpressionAnalytics1, ActionableCardClickAnalytics1 actionableCardClickAnalytics1) {
            this.f19583a = str;
            this.b = str2;
            this.c = cardHeight;
            this.d = str3;
            this.e = bool;
            this.f = tealiumAnalytics;
            this.g = actionableCardImpressionAnalytics1;
            this.h = actionableCardClickAnalytics1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnActionableCard1)) {
                return false;
            }
            OnActionableCard1 onActionableCard1 = (OnActionableCard1) obj;
            return Intrinsics.c(this.f19583a, onActionableCard1.f19583a) && Intrinsics.c(this.b, onActionableCard1.b) && this.c == onActionableCard1.c && Intrinsics.c(this.d, onActionableCard1.d) && Intrinsics.c(this.e, onActionableCard1.e) && Intrinsics.c(this.f, onActionableCard1.f) && Intrinsics.c(this.g, onActionableCard1.g) && Intrinsics.c(this.h, onActionableCard1.h);
        }

        public final int hashCode() {
            int iC = b.c(d.b(this.c, b.c(this.f19583a.hashCode() * 31, 31, this.b), 31), 31, this.d);
            Boolean bool = this.e;
            int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
            TealiumAnalytics tealiumAnalytics = this.f;
            int iHashCode2 = (iHashCode + (tealiumAnalytics == null ? 0 : tealiumAnalytics.hashCode())) * 31;
            ActionableCardImpressionAnalytics1 actionableCardImpressionAnalytics1 = this.g;
            int iHashCode3 = (iHashCode2 + (actionableCardImpressionAnalytics1 == null ? 0 : actionableCardImpressionAnalytics1.hashCode())) * 31;
            ActionableCardClickAnalytics1 actionableCardClickAnalytics1 = this.h;
            return iHashCode3 + (actionableCardClickAnalytics1 != null ? actionableCardClickAnalytics1.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnActionableCard1(image=", this.f19583a, ", altText=", this.b, ", cardHeight=");
            sbV.append(this.c);
            sbV.append(", link=");
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnBasicCoreBroadcastBanner;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBasicCoreBroadcastBanner {

        /* renamed from: a, reason: collision with root package name */
        public final ImpressionAnalytics2 f19584a;
        public final BroadcastBannerDismissAnalytics b;
        public final BroadcastBannerUI c;
        public final BroadcastBannerAction d;
        public final String e;
        public final String f;
        public final boolean g;

        public OnBasicCoreBroadcastBanner(ImpressionAnalytics2 impressionAnalytics2, BroadcastBannerDismissAnalytics broadcastBannerDismissAnalytics, BroadcastBannerUI broadcastBannerUI, BroadcastBannerAction broadcastBannerAction, String str, String str2, boolean z) {
            this.f19584a = impressionAnalytics2;
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
            return Intrinsics.c(this.f19584a, onBasicCoreBroadcastBanner.f19584a) && Intrinsics.c(this.b, onBasicCoreBroadcastBanner.b) && Intrinsics.c(this.c, onBasicCoreBroadcastBanner.c) && Intrinsics.c(this.d, onBasicCoreBroadcastBanner.d) && Intrinsics.c(this.e, onBasicCoreBroadcastBanner.e) && Intrinsics.c(this.f, onBasicCoreBroadcastBanner.f) && this.g == onBasicCoreBroadcastBanner.g;
        }

        public final int hashCode() {
            ImpressionAnalytics2 impressionAnalytics2 = this.f19584a;
            int iHashCode = (impressionAnalytics2 == null ? 0 : impressionAnalytics2.hashCode()) * 31;
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
            sb.append(this.f19584a);
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnBasicCoreRowList;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBasicCoreRowList {

        /* renamed from: a, reason: collision with root package name */
        public final String f19585a;
        public final ArrayList b;
        public final BasicCoreRowListAnalytics c;
        public final BasicCoreRowListImpressionAnalytics d;

        public OnBasicCoreRowList(String str, ArrayList arrayList, BasicCoreRowListAnalytics basicCoreRowListAnalytics, BasicCoreRowListImpressionAnalytics basicCoreRowListImpressionAnalytics) {
            this.f19585a = str;
            this.b = arrayList;
            this.c = basicCoreRowListAnalytics;
            this.d = basicCoreRowListImpressionAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBasicCoreRowList)) {
                return false;
            }
            OnBasicCoreRowList onBasicCoreRowList = (OnBasicCoreRowList) obj;
            return Intrinsics.c(this.f19585a, onBasicCoreRowList.f19585a) && this.b.equals(onBasicCoreRowList.b) && Intrinsics.c(this.c, onBasicCoreRowList.c) && Intrinsics.c(this.d, onBasicCoreRowList.d);
        }

        public final int hashCode() {
            String str = this.f19585a;
            int iB = androidx.compose.ui.input.pointer.a.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            BasicCoreRowListAnalytics basicCoreRowListAnalytics = this.c;
            int iHashCode = (iB + (basicCoreRowListAnalytics == null ? 0 : basicCoreRowListAnalytics.hashCode())) * 31;
            BasicCoreRowListImpressionAnalytics basicCoreRowListImpressionAnalytics = this.d;
            return iHashCode + (basicCoreRowListImpressionAnalytics != null ? basicCoreRowListImpressionAnalytics.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbX = d.x("OnBasicCoreRowList(basicCoreRowListSectionTitle=", this.f19585a, ", basicCoreRowListItems=", ", basicCoreRowListAnalytics=", this.b);
            sbX.append(this.c);
            sbX.append(", basicCoreRowListImpressionAnalytics=");
            sbX.append(this.d);
            sbX.append(")");
            return sbX.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnButtonSection;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnButtonSection {

        /* renamed from: a, reason: collision with root package name */
        public final ButtonSectionButton f19586a;

        public OnButtonSection(ButtonSectionButton buttonSectionButton) {
            this.f19586a = buttonSectionButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnButtonSection) && Intrinsics.c(this.f19586a, ((OnButtonSection) obj).f19586a);
        }

        public final int hashCode() {
            return this.f19586a.hashCode();
        }

        public final String toString() {
            return "OnButtonSection(buttonSectionButton=" + this.f19586a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnCatalogueCard;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCatalogueCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f19587a;
        public final String b;
        public final String c;
        public final String d;
        public final CatalogueCardType e;
        public final ClickAnalytics f;
        public final ImpressionAnalytics3 g;

        public OnCatalogueCard(String str, String str2, String str3, String str4, CatalogueCardType catalogueCardType, ClickAnalytics clickAnalytics, ImpressionAnalytics3 impressionAnalytics3) {
            this.f19587a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = catalogueCardType;
            this.f = clickAnalytics;
            this.g = impressionAnalytics3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCatalogueCard)) {
                return false;
            }
            OnCatalogueCard onCatalogueCard = (OnCatalogueCard) obj;
            return Intrinsics.c(this.f19587a, onCatalogueCard.f19587a) && Intrinsics.c(this.b, onCatalogueCard.b) && Intrinsics.c(this.c, onCatalogueCard.c) && Intrinsics.c(this.d, onCatalogueCard.d) && this.e == onCatalogueCard.e && Intrinsics.c(this.f, onCatalogueCard.f) && Intrinsics.c(this.g, onCatalogueCard.g);
        }

        public final int hashCode() {
            String str = this.f19587a;
            int iC = b.c(b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
            String str2 = this.d;
            int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            CatalogueCardType catalogueCardType = this.e;
            int iHashCode2 = (iHashCode + (catalogueCardType == null ? 0 : catalogueCardType.hashCode())) * 31;
            ClickAnalytics clickAnalytics = this.f;
            int iHashCode3 = (iHashCode2 + (clickAnalytics == null ? 0 : clickAnalytics.hashCode())) * 31;
            ImpressionAnalytics3 impressionAnalytics3 = this.g;
            return iHashCode3 + (impressionAnalytics3 != null ? impressionAnalytics3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnCatalogueCard(catalogueCardId=", this.f19587a, ", title=", this.b, ", catalogueCardSubtitle=");
            a.B(sbV, this.c, ", imageLeft=", this.d, ", catalogueCardType=");
            sbV.append(this.e);
            sbV.append(", clickAnalytics=");
            sbV.append(this.f);
            sbV.append(", impressionAnalytics=");
            sbV.append(this.g);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnChatEntryCardV3;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnChatEntryCardV3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19588a;
        public final Boolean b;
        public final ArrayList c;
        public final ChatEntryCardAction d;

        public OnChatEntryCardV3(String str, Boolean bool, ArrayList arrayList, ChatEntryCardAction chatEntryCardAction) {
            this.f19588a = str;
            this.b = bool;
            this.c = arrayList;
            this.d = chatEntryCardAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnChatEntryCardV3)) {
                return false;
            }
            OnChatEntryCardV3 onChatEntryCardV3 = (OnChatEntryCardV3) obj;
            return this.f19588a.equals(onChatEntryCardV3.f19588a) && Intrinsics.c(this.b, onChatEntryCardV3.b) && this.c.equals(onChatEntryCardV3.c) && this.d.equals(onChatEntryCardV3.d);
        }

        public final int hashCode() {
            int iHashCode = this.f19588a.hashCode() * 31;
            Boolean bool = this.b;
            return this.d.hashCode() + androidx.compose.ui.input.pointer.a.b((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.c);
        }

        public final String toString() {
            return "OnChatEntryCardV3(chatEntryCardTitle=" + this.f19588a + ", chatEntryCardShowBeta=" + this.b + ", chatEntryCardSuggestedPrompts=" + this.c + ", chatEntryCardAction=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnContentCard;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnContentCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f19589a;
        public final String b;
        public final String c;
        public final String d;
        public final ContentCardAction1 e;
        public final ContentCardFooter f;
        public final ContentCardBrandImage g;
        public final Boolean h;
        public final ContentCardSize i;
        public final String j;
        public final ContentCardAnalytics k;

        public OnContentCard(String str, String str2, String str3, String str4, ContentCardAction1 contentCardAction1, ContentCardFooter contentCardFooter, ContentCardBrandImage contentCardBrandImage, Boolean bool, ContentCardSize contentCardSize, String str5, ContentCardAnalytics contentCardAnalytics) {
            this.f19589a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = contentCardAction1;
            this.f = contentCardFooter;
            this.g = contentCardBrandImage;
            this.h = bool;
            this.i = contentCardSize;
            this.j = str5;
            this.k = contentCardAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnContentCard)) {
                return false;
            }
            OnContentCard onContentCard = (OnContentCard) obj;
            return Intrinsics.c(this.f19589a, onContentCard.f19589a) && Intrinsics.c(this.b, onContentCard.b) && Intrinsics.c(this.c, onContentCard.c) && Intrinsics.c(this.d, onContentCard.d) && Intrinsics.c(this.e, onContentCard.e) && Intrinsics.c(this.f, onContentCard.f) && Intrinsics.c(this.g, onContentCard.g) && Intrinsics.c(this.h, onContentCard.h) && this.i == onContentCard.i && Intrinsics.c(this.j, onContentCard.j) && Intrinsics.c(this.k, onContentCard.k);
        }

        public final int hashCode() {
            String str = this.f19589a;
            int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            String str2 = this.c;
            int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            ContentCardAction1 contentCardAction1 = this.e;
            int iHashCode3 = (iHashCode2 + (contentCardAction1 == null ? 0 : contentCardAction1.hashCode())) * 31;
            ContentCardFooter contentCardFooter = this.f;
            int iHashCode4 = (iHashCode3 + (contentCardFooter == null ? 0 : contentCardFooter.hashCode())) * 31;
            ContentCardBrandImage contentCardBrandImage = this.g;
            int iHashCode5 = (iHashCode4 + (contentCardBrandImage == null ? 0 : contentCardBrandImage.hashCode())) * 31;
            Boolean bool = this.h;
            int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
            ContentCardSize contentCardSize = this.i;
            int iHashCode7 = (iHashCode6 + (contentCardSize == null ? 0 : contentCardSize.hashCode())) * 31;
            String str4 = this.j;
            int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
            ContentCardAnalytics contentCardAnalytics = this.k;
            return iHashCode8 + (contentCardAnalytics != null ? contentCardAnalytics.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnContentCard(contentCardId=", this.f19589a, ", contentCardImageUrl=", this.b, ", contentCardTitle=");
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
            sbV.append(", contentCardSponsoredText=");
            sbV.append(this.j);
            sbV.append(", contentCardAnalytics=");
            sbV.append(this.k);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnCoreIcon;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCoreIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f19590a;
        public final CoreIconFields b;

        public OnCoreIcon(String str, CoreIconFields coreIconFields) {
            this.f19590a = str;
            this.b = coreIconFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCoreIcon)) {
                return false;
            }
            OnCoreIcon onCoreIcon = (OnCoreIcon) obj;
            return Intrinsics.c(this.f19590a, onCoreIcon.f19590a) && Intrinsics.c(this.b, onCoreIcon.b);
        }

        public final int hashCode() {
            return this.b.f19754a.hashCode() + (this.f19590a.hashCode() * 31);
        }

        public final String toString() {
            return "OnCoreIcon(__typename=" + this.f19590a + ", coreIconFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnDownloadableAsset;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnDownloadableAsset {

        /* renamed from: a, reason: collision with root package name */
        public final DownloadableAssetType f19591a;
        public final String b;
        public final int c;
        public final int d;
        public final DownloadableAssetFit e;
        public final String f;

        public OnDownloadableAsset(DownloadableAssetType downloadableAssetType, String str, int i, int i2, DownloadableAssetFit downloadableAssetFit, String str2) {
            this.f19591a = downloadableAssetType;
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
            if (!(obj instanceof OnDownloadableAsset)) {
                return false;
            }
            OnDownloadableAsset onDownloadableAsset = (OnDownloadableAsset) obj;
            return this.f19591a == onDownloadableAsset.f19591a && Intrinsics.c(this.b, onDownloadableAsset.b) && this.c == onDownloadableAsset.c && this.d == onDownloadableAsset.d && this.e == onDownloadableAsset.e && Intrinsics.c(this.f, onDownloadableAsset.f);
        }

        public final int hashCode() {
            int iA = b.a(this.d, b.a(this.c, b.c(this.f19591a.hashCode() * 31, 31, this.b), 31), 31);
            DownloadableAssetFit downloadableAssetFit = this.e;
            int iHashCode = (iA + (downloadableAssetFit == null ? 0 : downloadableAssetFit.hashCode())) * 31;
            String str = this.f;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnDownloadableAsset(assetType=");
            sb.append(this.f19591a);
            sb.append(", assetUrl=");
            sb.append(this.b);
            sb.append(", assetWidth=");
            YU.a.w(this.c, this.d, ", assetHeight=", ", fit=", sb);
            sb.append(this.e);
            sb.append(", alternativeText=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnEditorialBanner;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnEditorialBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f19592a;
        public final EditorialBanner b;

        public OnEditorialBanner(String str, EditorialBanner editorialBanner) {
            this.f19592a = str;
            this.b = editorialBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnEditorialBanner)) {
                return false;
            }
            OnEditorialBanner onEditorialBanner = (OnEditorialBanner) obj;
            return Intrinsics.c(this.f19592a, onEditorialBanner.f19592a) && Intrinsics.c(this.b, onEditorialBanner.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19592a.hashCode() * 31);
        }

        public final String toString() {
            return "OnEditorialBanner(__typename=" + this.f19592a + ", editorialBanner=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnEditorialBanner1;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnEditorialBanner1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19593a;
        public final EditorialBanner b;

        public OnEditorialBanner1(String str, EditorialBanner editorialBanner) {
            this.f19593a = str;
            this.b = editorialBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnEditorialBanner1)) {
                return false;
            }
            OnEditorialBanner1 onEditorialBanner1 = (OnEditorialBanner1) obj;
            return Intrinsics.c(this.f19593a, onEditorialBanner1.f19593a) && Intrinsics.c(this.b, onEditorialBanner1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19593a.hashCode() * 31);
        }

        public final String toString() {
            return "OnEditorialBanner1(__typename=" + this.f19593a + ", editorialBanner=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnEditorialCarousel;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnEditorialCarousel {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f19594a;

        public OnEditorialCarousel(ArrayList arrayList) {
            this.f19594a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnEditorialCarousel) && this.f19594a.equals(((OnEditorialCarousel) obj).f19594a);
        }

        public final int hashCode() {
            return this.f19594a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("OnEditorialCarousel(editorialCarouselItems=", ")", this.f19594a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnFullWidthContentCard;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnFullWidthContentCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f19595a;
        public final String b;
        public final String c;
        public final String d;
        public final Boolean e;
        public final ContentCardAction f;

        public OnFullWidthContentCard(String str, String str2, String str3, String str4, Boolean bool, ContentCardAction contentCardAction) {
            this.f19595a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = bool;
            this.f = contentCardAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnFullWidthContentCard)) {
                return false;
            }
            OnFullWidthContentCard onFullWidthContentCard = (OnFullWidthContentCard) obj;
            return Intrinsics.c(this.f19595a, onFullWidthContentCard.f19595a) && Intrinsics.c(this.b, onFullWidthContentCard.b) && Intrinsics.c(this.c, onFullWidthContentCard.c) && Intrinsics.c(this.d, onFullWidthContentCard.d) && Intrinsics.c(this.e, onFullWidthContentCard.e) && Intrinsics.c(this.f, onFullWidthContentCard.f);
        }

        public final int hashCode() {
            String str = this.f19595a;
            int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            String str2 = this.c;
            int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool = this.e;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            ContentCardAction contentCardAction = this.f;
            return iHashCode3 + (contentCardAction != null ? contentCardAction.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnFullWidthContentCard(contentCardId=", this.f19595a, ", contentCardImageUrl=", this.b, ", contentCardTitle=");
            a.B(sbV, this.c, ", contentCardDescription=", this.d, ", contentCardIsVideoAvailable=");
            sbV.append(this.e);
            sbV.append(", contentCardAction=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnGridList;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnGridList {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f19596a;
        public final GridListAnalytics b;
        public final GridListImpressionAnalytics c;
        public final ArrayList d;

        public OnGridList(Integer num, GridListAnalytics gridListAnalytics, GridListImpressionAnalytics gridListImpressionAnalytics, ArrayList arrayList) {
            this.f19596a = num;
            this.b = gridListAnalytics;
            this.c = gridListImpressionAnalytics;
            this.d = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnGridList)) {
                return false;
            }
            OnGridList onGridList = (OnGridList) obj;
            return Intrinsics.c(this.f19596a, onGridList.f19596a) && Intrinsics.c(this.b, onGridList.b) && Intrinsics.c(this.c, onGridList.c) && this.d.equals(onGridList.d);
        }

        public final int hashCode() {
            Integer num = this.f19596a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            GridListAnalytics gridListAnalytics = this.b;
            int iHashCode2 = (iHashCode + (gridListAnalytics == null ? 0 : gridListAnalytics.hashCode())) * 31;
            GridListImpressionAnalytics gridListImpressionAnalytics = this.c;
            return this.d.hashCode() + ((iHashCode2 + (gridListImpressionAnalytics != null ? gridListImpressionAnalytics.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "OnGridList(gridListItemCount=" + this.f19596a + ", gridListAnalytics=" + this.b + ", gridListImpressionAnalytics=" + this.c + ", gridListItems=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnHorizontalList;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHorizontalList {

        /* renamed from: a, reason: collision with root package name */
        public final HorizontalListTrailingLink f19597a;
        public final HorizontalListAnalytics b;
        public final HorizontalListImpressionAnalytics c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final ArrayList i;

        public OnHorizontalList(HorizontalListTrailingLink horizontalListTrailingLink, HorizontalListAnalytics horizontalListAnalytics, HorizontalListImpressionAnalytics horizontalListImpressionAnalytics, String str, String str2, String str3, String str4, String str5, ArrayList arrayList) {
            this.f19597a = horizontalListTrailingLink;
            this.b = horizontalListAnalytics;
            this.c = horizontalListImpressionAnalytics;
            this.d = str;
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
            return Intrinsics.c(this.f19597a, onHorizontalList.f19597a) && Intrinsics.c(this.b, onHorizontalList.b) && Intrinsics.c(this.c, onHorizontalList.c) && this.d.equals(onHorizontalList.d) && Intrinsics.c(this.e, onHorizontalList.e) && Intrinsics.c(this.f, onHorizontalList.f) && Intrinsics.c(this.g, onHorizontalList.g) && Intrinsics.c(this.h, onHorizontalList.h) && this.i.equals(onHorizontalList.i);
        }

        public final int hashCode() {
            HorizontalListTrailingLink horizontalListTrailingLink = this.f19597a;
            int iHashCode = (horizontalListTrailingLink == null ? 0 : horizontalListTrailingLink.hashCode()) * 31;
            HorizontalListAnalytics horizontalListAnalytics = this.b;
            int iHashCode2 = (iHashCode + (horizontalListAnalytics == null ? 0 : horizontalListAnalytics.hashCode())) * 31;
            HorizontalListImpressionAnalytics horizontalListImpressionAnalytics = this.c;
            int iC = b.c((iHashCode2 + (horizontalListImpressionAnalytics == null ? 0 : horizontalListImpressionAnalytics.hashCode())) * 31, 31, this.d);
            String str = this.e;
            int iHashCode3 = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.g;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.h;
            return this.i.hashCode() + ((iHashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnHorizontalList(horizontalListTrailingLink=");
            sb.append(this.f19597a);
            sb.append(", horizontalListAnalytics=");
            sb.append(this.b);
            sb.append(", horizontalListImpressionAnalytics=");
            sb.append(this.c);
            sb.append(", title=");
            sb.append(this.d);
            sb.append(", subtitle=");
            a.B(sb, this.e, ", deepLink=", this.f, ", actionTitle=");
            a.B(sb, this.g, ", actionPath=", this.h, ", items=");
            return android.support.v4.media.session.a.q(")", sb, this.i);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnHostedIcon;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f19598a;
        public final HostedIconFields b;

        public OnHostedIcon(String str, HostedIconFields hostedIconFields) {
            this.f19598a = str;
            this.b = hostedIconFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnHostedIcon)) {
                return false;
            }
            OnHostedIcon onHostedIcon = (OnHostedIcon) obj;
            return Intrinsics.c(this.f19598a, onHostedIcon.f19598a) && Intrinsics.c(this.b, onHostedIcon.b);
        }

        public final int hashCode() {
            return this.b.f19768a.hashCode() + (this.f19598a.hashCode() * 31);
        }

        public final String toString() {
            return "OnHostedIcon(__typename=" + this.f19598a + ", hostedIconFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnHostedIcon1;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19599a;
        public final HostedIconFields b;

        public OnHostedIcon1(String str, HostedIconFields hostedIconFields) {
            this.f19599a = str;
            this.b = hostedIconFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnHostedIcon1)) {
                return false;
            }
            OnHostedIcon1 onHostedIcon1 = (OnHostedIcon1) obj;
            return Intrinsics.c(this.f19599a, onHostedIcon1.f19599a) && Intrinsics.c(this.b, onHostedIcon1.b);
        }

        public final int hashCode() {
            return this.b.f19768a.hashCode() + (this.f19599a.hashCode() * 31);
        }

        public final String toString() {
            return "OnHostedIcon1(__typename=" + this.f19599a + ", hostedIconFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnInfoTile;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnInfoTile {

        /* renamed from: a, reason: collision with root package name */
        public final String f19600a;
        public final InfoTileFields b;

        public OnInfoTile(String str, InfoTileFields infoTileFields) {
            this.f19600a = str;
            this.b = infoTileFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnInfoTile)) {
                return false;
            }
            OnInfoTile onInfoTile = (OnInfoTile) obj;
            return Intrinsics.c(this.f19600a, onInfoTile.f19600a) && Intrinsics.c(this.b, onInfoTile.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19600a.hashCode() * 31);
        }

        public final String toString() {
            return "OnInfoTile(__typename=" + this.f19600a + ", infoTileFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnInfoTile1;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnInfoTile1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19601a;
        public final InfoTileFields b;

        public OnInfoTile1(String str, InfoTileFields infoTileFields) {
            this.f19601a = str;
            this.b = infoTileFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnInfoTile1)) {
                return false;
            }
            OnInfoTile1 onInfoTile1 = (OnInfoTile1) obj;
            return Intrinsics.c(this.f19601a, onInfoTile1.f19601a) && Intrinsics.c(this.b, onInfoTile1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19601a.hashCode() * 31);
        }

        public final String toString() {
            return "OnInfoTile1(__typename=" + this.f19601a + ", infoTileFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnInsetBanner;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnInsetBanner {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f19602a;
        public final String b;
        public final String c;
        public final Action1 d;

        public OnInsetBanner(InsetBannerDisplayType insetBannerDisplayType, String str, String str2, Action1 action1) {
            this.f19602a = insetBannerDisplayType;
            this.b = str;
            this.c = str2;
            this.d = action1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnInsetBanner)) {
                return false;
            }
            OnInsetBanner onInsetBanner = (OnInsetBanner) obj;
            return this.f19602a == onInsetBanner.f19602a && Intrinsics.c(this.b, onInsetBanner.b) && Intrinsics.c(this.c, onInsetBanner.c) && Intrinsics.c(this.d, onInsetBanner.d);
        }

        public final int hashCode() {
            int iC = b.c(this.f19602a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Action1 action1 = this.d;
            return iHashCode + (action1 != null ? action1.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbU = d.u("OnInsetBanner(displayType=", this.f19602a, ", message=", this.b, ", bannerTitle=");
            sbU.append(this.c);
            sbU.append(", action=");
            sbU.append(this.d);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnMoreCard;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMoreCard {

        /* renamed from: a, reason: collision with root package name */
        public final MoreCardStyle f19603a;
        public final MoreCardAction b;

        public OnMoreCard(MoreCardStyle moreCardStyle, MoreCardAction moreCardAction) {
            this.f19603a = moreCardStyle;
            this.b = moreCardAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMoreCard)) {
                return false;
            }
            OnMoreCard onMoreCard = (OnMoreCard) obj;
            return this.f19603a == onMoreCard.f19603a && Intrinsics.c(this.b, onMoreCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19603a.hashCode() * 31);
        }

        public final String toString() {
            return "OnMoreCard(moreCardStyle=" + this.f19603a + ", moreCardAction=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnNavRoundel;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnNavRoundel {

        /* renamed from: a, reason: collision with root package name */
        public final String f19604a;
        public final String b;
        public final String c;
        public final NavRoundelAction d;

        public OnNavRoundel(String str, String str2, String str3, NavRoundelAction navRoundelAction) {
            this.f19604a = str;
            this.b = str2;
            this.c = str3;
            this.d = navRoundelAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnNavRoundel)) {
                return false;
            }
            OnNavRoundel onNavRoundel = (OnNavRoundel) obj;
            return Intrinsics.c(this.f19604a, onNavRoundel.f19604a) && Intrinsics.c(this.b, onNavRoundel.b) && Intrinsics.c(this.c, onNavRoundel.c) && Intrinsics.c(this.d, onNavRoundel.d);
        }

        public final int hashCode() {
            String str = this.f19604a;
            int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            String str2 = this.c;
            int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            NavRoundelAction navRoundelAction = this.d;
            return iHashCode + (navRoundelAction != null ? navRoundelAction.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnNavRoundel(navRoundelId=", this.f19604a, ", navRoundelImageUrl=", this.b, ", navRoundelTitle=");
            sbV.append(this.c);
            sbV.append(", navRoundelAction=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnOfferCard;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOfferCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f19605a;
        public final OfferCard b;

        public OnOfferCard(String str, OfferCard offerCard) {
            this.f19605a = str;
            this.b = offerCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOfferCard)) {
                return false;
            }
            OnOfferCard onOfferCard = (OnOfferCard) obj;
            return Intrinsics.c(this.f19605a, onOfferCard.f19605a) && Intrinsics.c(this.b, onOfferCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19605a.hashCode() * 31);
        }

        public final String toString() {
            return "OnOfferCard(__typename=" + this.f19605a + ", offerCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnPageCover;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPageCover {

        /* renamed from: a, reason: collision with root package name */
        public final String f19606a;
        public final PageCoverContentFormat b;
        public final PageCoverContentAlignment c;
        public final PageCoverContentTheme d;
        public final PageCoverPrimaryImage e;
        public final PageCoverImagePosition f;
        public final List g;
        public final String h;
        public final PageCoverTitleTextSize i;
        public final String j;

        public OnPageCover(String str, PageCoverContentFormat pageCoverContentFormat, PageCoverContentAlignment pageCoverContentAlignment, PageCoverContentTheme pageCoverContentTheme, PageCoverPrimaryImage pageCoverPrimaryImage, PageCoverImagePosition pageCoverImagePosition, List list, String str2, PageCoverTitleTextSize pageCoverTitleTextSize, String str3) {
            this.f19606a = str;
            this.b = pageCoverContentFormat;
            this.c = pageCoverContentAlignment;
            this.d = pageCoverContentTheme;
            this.e = pageCoverPrimaryImage;
            this.f = pageCoverImagePosition;
            this.g = list;
            this.h = str2;
            this.i = pageCoverTitleTextSize;
            this.j = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPageCover)) {
                return false;
            }
            OnPageCover onPageCover = (OnPageCover) obj;
            return Intrinsics.c(this.f19606a, onPageCover.f19606a) && this.b == onPageCover.b && this.c == onPageCover.c && Intrinsics.c(this.d, onPageCover.d) && Intrinsics.c(this.e, onPageCover.e) && this.f == onPageCover.f && Intrinsics.c(this.g, onPageCover.g) && Intrinsics.c(this.h, onPageCover.h) && this.i == onPageCover.i && Intrinsics.c(this.j, onPageCover.j);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f19606a.hashCode() * 31)) * 31)) * 31)) * 31;
            PageCoverPrimaryImage pageCoverPrimaryImage = this.e;
            int iHashCode2 = (iHashCode + (pageCoverPrimaryImage == null ? 0 : pageCoverPrimaryImage.hashCode())) * 31;
            PageCoverImagePosition pageCoverImagePosition = this.f;
            int iHashCode3 = (iHashCode2 + (pageCoverImagePosition == null ? 0 : pageCoverImagePosition.hashCode())) * 31;
            List list = this.g;
            int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
            String str = this.h;
            int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
            PageCoverTitleTextSize pageCoverTitleTextSize = this.i;
            int iHashCode6 = (iHashCode5 + (pageCoverTitleTextSize == null ? 0 : pageCoverTitleTextSize.hashCode())) * 31;
            String str2 = this.j;
            return iHashCode6 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return "OnPageCover(__typename=" + this.f19606a + ", pageCoverContentFormat=" + this.b + ", pageCoverContentAlignment=" + this.c + ", pageCoverContentTheme=" + this.d + ", pageCoverPrimaryImage=" + this.e + ", pageCoverPrimaryImagePosition=" + this.f + ", pageCoverLogos=" + this.g + ", pageCoverTitle=" + this.h + ", pageCoverTitleSize=" + this.i + ", pageCoverSubTitle=" + this.j + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnParagraphTextItem;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnParagraphTextItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f19607a;
        public final ParagraphTextItemType b;

        public OnParagraphTextItem(ParagraphTextItemType paragraphTextItemType, String str) {
            this.f19607a = str;
            this.b = paragraphTextItemType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnParagraphTextItem)) {
                return false;
            }
            OnParagraphTextItem onParagraphTextItem = (OnParagraphTextItem) obj;
            return Intrinsics.c(this.f19607a, onParagraphTextItem.f19607a) && this.b == onParagraphTextItem.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19607a.hashCode() * 31);
        }

        public final String toString() {
            return "OnParagraphTextItem(content=" + this.f19607a + ", type=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnPill;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPill {

        /* renamed from: a, reason: collision with root package name */
        public final String f19608a;
        public final PillAction b;

        public OnPill(String str, PillAction pillAction) {
            this.f19608a = str;
            this.b = pillAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPill)) {
                return false;
            }
            OnPill onPill = (OnPill) obj;
            return Intrinsics.c(this.f19608a, onPill.f19608a) && Intrinsics.c(this.b, onPill.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19608a.hashCode() * 31);
        }

        public final String toString() {
            return "OnPill(pillText=" + this.f19608a + ", pillAction=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnProductCard;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f19609a;
        public final ProductCard b;

        public OnProductCard(String str, ProductCard productCard) {
            this.f19609a = str;
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
            return Intrinsics.c(this.f19609a, onProductCard.f19609a) && Intrinsics.c(this.b, onProductCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19609a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OnProductCard(__typename=", this.f19609a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnProductCategoryTile;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCategoryTile {

        /* renamed from: a, reason: collision with root package name */
        public final String f19610a;
        public final String b;
        public final ProductCategoryTileAction c;

        public OnProductCategoryTile(String str, String str2, ProductCategoryTileAction productCategoryTileAction) {
            this.f19610a = str;
            this.b = str2;
            this.c = productCategoryTileAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductCategoryTile)) {
                return false;
            }
            OnProductCategoryTile onProductCategoryTile = (OnProductCategoryTile) obj;
            return Intrinsics.c(this.f19610a, onProductCategoryTile.f19610a) && Intrinsics.c(this.b, onProductCategoryTile.b) && Intrinsics.c(this.c, onProductCategoryTile.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f19610a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnProductCategoryTile(productCategoryTileImageUrl=", this.f19610a, ", productCategoryTileLabel=", this.b, ", productCategoryTileAction=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnPromotionCard;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPromotionCard {

        /* renamed from: a, reason: collision with root package name */
        public final PromotionCardProduct f19611a;
        public final String b;
        public final Analytics1 c;
        public final ImpressionAnalytics1 d;

        public OnPromotionCard(PromotionCardProduct promotionCardProduct, String str, Analytics1 analytics1, ImpressionAnalytics1 impressionAnalytics1) {
            this.f19611a = promotionCardProduct;
            this.b = str;
            this.c = analytics1;
            this.d = impressionAnalytics1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPromotionCard)) {
                return false;
            }
            OnPromotionCard onPromotionCard = (OnPromotionCard) obj;
            return Intrinsics.c(this.f19611a, onPromotionCard.f19611a) && Intrinsics.c(this.b, onPromotionCard.b) && Intrinsics.c(this.c, onPromotionCard.c) && Intrinsics.c(this.d, onPromotionCard.d);
        }

        public final int hashCode() {
            int iHashCode = this.f19611a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Analytics1 analytics1 = this.c;
            int iHashCode3 = (iHashCode2 + (analytics1 == null ? 0 : analytics1.hashCode())) * 31;
            ImpressionAnalytics1 impressionAnalytics1 = this.d;
            return iHashCode3 + (impressionAnalytics1 != null ? impressionAnalytics1.hashCode() : 0);
        }

        public final String toString() {
            return "OnPromotionCard(promotionCardProduct=" + this.f19611a + ", promotionCardOfferId=" + this.b + ", analytics=" + this.c + ", impressionAnalytics=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnQuickLinkCard;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnQuickLinkCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f19612a;
        public final String b;
        public final String c;
        public final String d;
        public final LinkCardAction e;
        public final Boolean f;

        public OnQuickLinkCard(String str, String str2, String str3, String str4, LinkCardAction linkCardAction, Boolean bool) {
            this.f19612a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = linkCardAction;
            this.f = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnQuickLinkCard)) {
                return false;
            }
            OnQuickLinkCard onQuickLinkCard = (OnQuickLinkCard) obj;
            return Intrinsics.c(this.f19612a, onQuickLinkCard.f19612a) && Intrinsics.c(this.b, onQuickLinkCard.b) && Intrinsics.c(this.c, onQuickLinkCard.c) && Intrinsics.c(this.d, onQuickLinkCard.d) && Intrinsics.c(this.e, onQuickLinkCard.e) && Intrinsics.c(this.f, onQuickLinkCard.f);
        }

        public final int hashCode() {
            int iC = b.c(this.f19612a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode2 = (this.e.hashCode() + ((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Boolean bool = this.f;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnQuickLinkCard(__typename=", this.f19612a, ", linkCardTitle=", this.b, ", linkCardSubtitle=");
            a.B(sbV, this.c, ", linkCardImage=", this.d, ", linkCardAction=");
            sbV.append(this.e);
            sbV.append(", isQuickLinkView=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnRecipeMethod;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRecipeMethod {

        /* renamed from: a, reason: collision with root package name */
        public final String f19613a;
        public final String b;
        public final ArrayList c;
        public final String d;

        public OnRecipeMethod(String str, String str2, String str3, ArrayList arrayList) {
            this.f19613a = str;
            this.b = str2;
            this.c = arrayList;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnRecipeMethod)) {
                return false;
            }
            OnRecipeMethod onRecipeMethod = (OnRecipeMethod) obj;
            return Intrinsics.c(this.f19613a, onRecipeMethod.f19613a) && Intrinsics.c(this.b, onRecipeMethod.b) && this.c.equals(onRecipeMethod.c) && Intrinsics.c(this.d, onRecipeMethod.d);
        }

        public final int hashCode() {
            String str = this.f19613a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iB = androidx.compose.ui.input.pointer.a.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
            String str3 = this.d;
            return iB + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnRecipeMethod(panelTitle=", this.f19613a, ", caption=", this.b, ", items=");
            sbV.append(this.c);
            sbV.append(", disclaimer=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnRecipeMoreCard;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRecipeMoreCard {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f19614a;

        public OnRecipeMoreCard(ArrayList arrayList) {
            this.f19614a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRecipeMoreCard) && this.f19614a.equals(((OnRecipeMoreCard) obj).f19614a);
        }

        public final int hashCode() {
            return this.f19614a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("OnRecipeMoreCard(actionMetadata=", ")", this.f19614a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnRecipeSource;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRecipeSource {

        /* renamed from: a, reason: collision with root package name */
        public final String f19615a;

        public OnRecipeSource(String str) {
            this.f19615a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRecipeSource) && Intrinsics.c(this.f19615a, ((OnRecipeSource) obj).f19615a);
        }

        public final int hashCode() {
            return this.f19615a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnRecipeSource(source=", this.f19615a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnRecipeSummaryCard;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRecipeSummaryCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f19616a;
        public final RecipeSummaryCardFragment b;

        public OnRecipeSummaryCard(String str, RecipeSummaryCardFragment recipeSummaryCardFragment) {
            this.f19616a = str;
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
            return Intrinsics.c(this.f19616a, onRecipeSummaryCard.f19616a) && Intrinsics.c(this.b, onRecipeSummaryCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19616a.hashCode() * 31);
        }

        public final String toString() {
            return "OnRecipeSummaryCard(__typename=" + this.f19616a + ", recipeSummaryCardFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnRecipeSummaryCard1;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRecipeSummaryCard1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f19617a;
        public final RecipeSummaryCardFragment b;

        public OnRecipeSummaryCard1(String str, RecipeSummaryCardFragment recipeSummaryCardFragment) {
            this.f19617a = str;
            this.b = recipeSummaryCardFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnRecipeSummaryCard1)) {
                return false;
            }
            OnRecipeSummaryCard1 onRecipeSummaryCard1 = (OnRecipeSummaryCard1) obj;
            return Intrinsics.c(this.f19617a, onRecipeSummaryCard1.f19617a) && Intrinsics.c(this.b, onRecipeSummaryCard1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19617a.hashCode() * 31);
        }

        public final String toString() {
            return "OnRecipeSummaryCard1(__typename=" + this.f19617a + ", recipeSummaryCardFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnRecipeTagList;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRecipeTagList {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f19618a;

        public OnRecipeTagList(ArrayList arrayList) {
            this.f19618a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRecipeTagList) && this.f19618a.equals(((OnRecipeTagList) obj).f19618a);
        }

        public final int hashCode() {
            return this.f19618a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("OnRecipeTagList(tags=", ")", this.f19618a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnSearchNavCard;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnSearchNavCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f19619a;
        public final SearchNavCardAction b;

        public OnSearchNavCard(String str, SearchNavCardAction searchNavCardAction) {
            this.f19619a = str;
            this.b = searchNavCardAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnSearchNavCard)) {
                return false;
            }
            OnSearchNavCard onSearchNavCard = (OnSearchNavCard) obj;
            return Intrinsics.c(this.f19619a, onSearchNavCard.f19619a) && Intrinsics.c(this.b, onSearchNavCard.b);
        }

        public final int hashCode() {
            String str = this.f19619a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return "OnSearchNavCard(searchNavCardPlaceholderText=" + this.f19619a + ", searchNavCardAction=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnTitleSection;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnTitleSection {

        /* renamed from: a, reason: collision with root package name */
        public final TitleSectionTypes f19620a;
        public final String b;

        public OnTitleSection(TitleSectionTypes titleSectionTypes, String str) {
            this.f19620a = titleSectionTypes;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnTitleSection)) {
                return false;
            }
            OnTitleSection onTitleSection = (OnTitleSection) obj;
            return this.f19620a == onTitleSection.f19620a && Intrinsics.c(this.b, onTitleSection.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19620a.hashCode() * 31);
        }

        public final String toString() {
            return "OnTitleSection(titleSectionType=" + this.f19620a + ", titleSectionText=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnUniversalInventoryContainer;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnUniversalInventoryContainer {

        /* renamed from: a, reason: collision with root package name */
        public final GoogleAdBannerCard f19621a;
        public final NextBestAction b;

        public OnUniversalInventoryContainer(GoogleAdBannerCard googleAdBannerCard, NextBestAction nextBestAction) {
            this.f19621a = googleAdBannerCard;
            this.b = nextBestAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnUniversalInventoryContainer)) {
                return false;
            }
            OnUniversalInventoryContainer onUniversalInventoryContainer = (OnUniversalInventoryContainer) obj;
            return Intrinsics.c(this.f19621a, onUniversalInventoryContainer.f19621a) && Intrinsics.c(this.b, onUniversalInventoryContainer.b);
        }

        public final int hashCode() {
            GoogleAdBannerCard googleAdBannerCard = this.f19621a;
            int iHashCode = (googleAdBannerCard == null ? 0 : googleAdBannerCard.hashCode()) * 31;
            NextBestAction nextBestAction = this.b;
            return iHashCode + (nextBestAction != null ? nextBestAction.hashCode() : 0);
        }

        public final String toString() {
            return "OnUniversalInventoryContainer(googleAdBannerCard=" + this.f19621a + ", nextBestAction=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnVerticalList;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnVerticalList {

        /* renamed from: a, reason: collision with root package name */
        public final String f19622a;
        public final String b;
        public final ArrayList c;
        public final VerticalListAction d;

        public OnVerticalList(String str, String str2, ArrayList arrayList, VerticalListAction verticalListAction) {
            this.f19622a = str;
            this.b = str2;
            this.c = arrayList;
            this.d = verticalListAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnVerticalList)) {
                return false;
            }
            OnVerticalList onVerticalList = (OnVerticalList) obj;
            return Intrinsics.c(this.f19622a, onVerticalList.f19622a) && Intrinsics.c(this.b, onVerticalList.b) && this.c.equals(onVerticalList.c) && Intrinsics.c(this.d, onVerticalList.d);
        }

        public final int hashCode() {
            String str = this.f19622a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iB = androidx.compose.ui.input.pointer.a.b((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
            VerticalListAction verticalListAction = this.d;
            return iB + (verticalListAction != null ? verticalListAction.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnVerticalList(verticalListTitle=", this.f19622a, ", verticalListSubtitle=", this.b, ", verticalListItems=");
            sbV.append(this.c);
            sbV.append(", verticalListAction=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$OnVideo;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnVideo {

        /* renamed from: a, reason: collision with root package name */
        public final String f19623a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public OnVideo(String str, String str2, String str3, String str4, String str5) {
            this.f19623a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnVideo)) {
                return false;
            }
            OnVideo onVideo = (OnVideo) obj;
            return Intrinsics.c(this.f19623a, onVideo.f19623a) && Intrinsics.c(this.b, onVideo.b) && Intrinsics.c(this.c, onVideo.c) && Intrinsics.c(this.d, onVideo.d) && Intrinsics.c(this.e, onVideo.e);
        }

        public final int hashCode() {
            int iC = b.c(b.c(b.c(this.f19623a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            String str = this.e;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnVideo(url=", this.f19623a, ", title=", this.b, ", thumbnail=");
            a.B(sbV, this.c, ", duration=", this.d, ", id=");
            return YU.a.o(sbV, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$PageCoverContentTheme;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PageCoverContentTheme {

        /* renamed from: a, reason: collision with root package name */
        public final Background f19624a;
        public final Foreground b;

        public PageCoverContentTheme(Background background, Foreground foreground) {
            this.f19624a = background;
            this.b = foreground;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PageCoverContentTheme)) {
                return false;
            }
            PageCoverContentTheme pageCoverContentTheme = (PageCoverContentTheme) obj;
            return Intrinsics.c(this.f19624a, pageCoverContentTheme.f19624a) && Intrinsics.c(this.b, pageCoverContentTheme.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19624a.f19540a.hashCode() * 31);
        }

        public final String toString() {
            return "PageCoverContentTheme(background=" + this.f19624a + ", foreground=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$PageCoverLogo;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PageCoverLogo {

        /* renamed from: a, reason: collision with root package name */
        public final String f19625a;
        public final String b;

        public PageCoverLogo(String str, String str2) {
            this.f19625a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PageCoverLogo)) {
                return false;
            }
            PageCoverLogo pageCoverLogo = (PageCoverLogo) obj;
            return Intrinsics.c(this.f19625a, pageCoverLogo.f19625a) && Intrinsics.c(this.b, pageCoverLogo.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19625a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("PageCoverLogo(imageUrl=", this.f19625a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$PageCoverPrimaryImage;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PageCoverPrimaryImage {

        /* renamed from: a, reason: collision with root package name */
        public final String f19626a;
        public final String b;

        public PageCoverPrimaryImage(String str, String str2) {
            this.f19626a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PageCoverPrimaryImage)) {
                return false;
            }
            PageCoverPrimaryImage pageCoverPrimaryImage = (PageCoverPrimaryImage) obj;
            return Intrinsics.c(this.f19626a, pageCoverPrimaryImage.f19626a) && Intrinsics.c(this.b, pageCoverPrimaryImage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19626a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("PageCoverPrimaryImage(imageUrl=", this.f19626a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$PillAction;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PillAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f19627a;
        public final ActionFields b;

        public PillAction(String str, ActionFields actionFields) {
            this.f19627a = str;
            this.b = actionFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PillAction)) {
                return false;
            }
            PillAction pillAction = (PillAction) obj;
            return Intrinsics.c(this.f19627a, pillAction.f19627a) && Intrinsics.c(this.b, pillAction.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19627a.hashCode() * 31);
        }

        public final String toString() {
            return "PillAction(__typename=" + this.f19627a + ", actionFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Primary;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Primary {

        /* renamed from: a, reason: collision with root package name */
        public final String f19628a;

        public Primary(String str) {
            this.f19628a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Primary) && Intrinsics.c(this.f19628a, ((Primary) obj).f19628a);
        }

        public final int hashCode() {
            return this.f19628a.hashCode();
        }

        public final String toString() {
            return YU.a.h("Primary(lightHexCode=", this.f19628a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$ProductCategoryTileAction;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductCategoryTileAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f19629a;
        public final ActionFields b;

        public ProductCategoryTileAction(String str, ActionFields actionFields) {
            this.f19629a = str;
            this.b = actionFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductCategoryTileAction)) {
                return false;
            }
            ProductCategoryTileAction productCategoryTileAction = (ProductCategoryTileAction) obj;
            return Intrinsics.c(this.f19629a, productCategoryTileAction.f19629a) && Intrinsics.c(this.b, productCategoryTileAction.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19629a.hashCode() * 31);
        }

        public final String toString() {
            return "ProductCategoryTileAction(__typename=" + this.f19629a + ", actionFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$PromotionCardProduct;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PromotionCardProduct {

        /* renamed from: a, reason: collision with root package name */
        public final String f19630a;
        public final ProductCard b;

        public PromotionCardProduct(String str, ProductCard productCard) {
            this.f19630a = str;
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
            return Intrinsics.c(this.f19630a, promotionCardProduct.f19630a) && Intrinsics.c(this.b, promotionCardProduct.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19630a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("PromotionCardProduct(__typename=", this.f19630a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Row;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Row {

        /* renamed from: a, reason: collision with root package name */
        public final LeadingAsset f19631a;
        public final String b;
        public final String c;

        public Row(LeadingAsset leadingAsset, String str, String str2) {
            this.f19631a = leadingAsset;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Row)) {
                return false;
            }
            Row row = (Row) obj;
            return Intrinsics.c(this.f19631a, row.f19631a) && Intrinsics.c(this.b, row.b) && Intrinsics.c(this.c, row.c);
        }

        public final int hashCode() {
            LeadingAsset leadingAsset = this.f19631a;
            int iHashCode = (leadingAsset == null ? 0 : leadingAsset.hashCode()) * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Row(leadingAsset=");
            sb.append(this.f19631a);
            sb.append(", description=");
            sb.append(this.b);
            sb.append(", label=");
            return YU.a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$SearchNavCardAction;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SearchNavCardAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f19632a;
        public final ActionFields b;

        public SearchNavCardAction(String str, ActionFields actionFields) {
            this.f19632a = str;
            this.b = actionFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SearchNavCardAction)) {
                return false;
            }
            SearchNavCardAction searchNavCardAction = (SearchNavCardAction) obj;
            return Intrinsics.c(this.f19632a, searchNavCardAction.f19632a) && Intrinsics.c(this.b, searchNavCardAction.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f19632a.hashCode() * 31);
        }

        public final String toString() {
            return "SearchNavCardAction(__typename=" + this.f19632a + ", actionFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Secondary;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Secondary {

        /* renamed from: a, reason: collision with root package name */
        public final String f19633a;

        public Secondary(String str) {
            this.f19633a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Secondary) && Intrinsics.c(this.f19633a, ((Secondary) obj).f19633a);
        }

        public final int hashCode() {
            return this.f19633a.hashCode();
        }

        public final String toString() {
            return YU.a.h("Secondary(lightHexCode=", this.f19633a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$VerticalListAction;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VerticalListAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f19634a;
        public final Action b;

        public VerticalListAction(String str, Action action) {
            this.f19634a = str;
            this.b = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VerticalListAction)) {
                return false;
            }
            VerticalListAction verticalListAction = (VerticalListAction) obj;
            return Intrinsics.c(this.f19634a, verticalListAction.f19634a) && Intrinsics.c(this.b, verticalListAction.b);
        }

        public final int hashCode() {
            String str = this.f19634a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return "VerticalListAction(actionTitle=" + this.f19634a + ", action=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$VerticalListItem;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VerticalListItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f19635a;
        public final OnFullWidthContentCard b;
        public final OnInfoTile c;

        public VerticalListItem(String __typename, OnFullWidthContentCard onFullWidthContentCard, OnInfoTile onInfoTile) {
            Intrinsics.h(__typename, "__typename");
            this.f19635a = __typename;
            this.b = onFullWidthContentCard;
            this.c = onInfoTile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VerticalListItem)) {
                return false;
            }
            VerticalListItem verticalListItem = (VerticalListItem) obj;
            return Intrinsics.c(this.f19635a, verticalListItem.f19635a) && Intrinsics.c(this.b, verticalListItem.b) && Intrinsics.c(this.c, verticalListItem.c);
        }

        public final int hashCode() {
            int iHashCode = this.f19635a.hashCode() * 31;
            OnFullWidthContentCard onFullWidthContentCard = this.b;
            int iHashCode2 = (iHashCode + (onFullWidthContentCard == null ? 0 : onFullWidthContentCard.hashCode())) * 31;
            OnInfoTile onInfoTile = this.c;
            return iHashCode2 + (onInfoTile != null ? onInfoTile.hashCode() : 0);
        }

        public final String toString() {
            return "VerticalListItem(__typename=" + this.f19635a + ", onFullWidthContentCard=" + this.b + ", onInfoTile=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/feature/shop/contentpage/fragment/ContentPage$Video;", "", "content-page_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Video {

        /* renamed from: a, reason: collision with root package name */
        public final String f19636a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;

        public Video(String str, String str2, String str3, String str4, String str5) {
            this.f19636a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Video)) {
                return false;
            }
            Video video = (Video) obj;
            return Intrinsics.c(this.f19636a, video.f19636a) && Intrinsics.c(this.b, video.b) && Intrinsics.c(this.c, video.c) && Intrinsics.c(this.d, video.d) && Intrinsics.c(this.e, video.e);
        }

        public final int hashCode() {
            int iC = b.c(b.c(b.c(this.f19636a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            String str = this.e;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("Video(url=", this.f19636a, ", title=", this.b, ", thumbnail=");
            a.B(sbV, this.c, ", duration=", this.d, ", id=");
            return YU.a.o(sbV, this.e, ")");
        }
    }

    public ContentPage(Header header, ImpressionAnalytics impressionAnalytics, Analytics analytics, Integer num, ArrayList arrayList) {
        this.f19528a = header;
        this.b = impressionAnalytics;
        this.c = analytics;
        this.d = num;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentPage)) {
            return false;
        }
        ContentPage contentPage = (ContentPage) obj;
        return Intrinsics.c(this.f19528a, contentPage.f19528a) && Intrinsics.c(this.b, contentPage.b) && Intrinsics.c(this.c, contentPage.c) && Intrinsics.c(this.d, contentPage.d) && this.e.equals(contentPage.e);
    }

    public final int hashCode() {
        Header header = this.f19528a;
        int iHashCode = (header == null ? 0 : header.hashCode()) * 31;
        ImpressionAnalytics impressionAnalytics = this.b;
        int iHashCode2 = (iHashCode + (impressionAnalytics == null ? 0 : impressionAnalytics.hashCode())) * 31;
        Analytics analytics = this.c;
        int iHashCode3 = (iHashCode2 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Integer num = this.d;
        return this.e.hashCode() + ((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentPage(header=");
        sb.append(this.f19528a);
        sb.append(", impressionAnalytics=");
        sb.append(this.b);
        sb.append(", analytics=");
        sb.append(this.c);
        sb.append(", nextPageNumber=");
        sb.append(this.d);
        sb.append(", items=");
        return android.support.v4.media.session.a.q(")", sb, this.e);
    }
}
