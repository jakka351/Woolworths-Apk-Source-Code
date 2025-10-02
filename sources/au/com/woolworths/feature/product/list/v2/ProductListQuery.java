package au.com.woolworths.feature.product.list.v2;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.graphql.TealiumAnalytics;
import au.com.woolworths.android.onesite.graphql.GoogleAdCustomTargeting;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.product.list.v2.adapter.ProductListQuery_ResponseAdapter;
import au.com.woolworths.feature.product.list.v2.fragment.InsetBanner;
import au.com.woolworths.feature.product.list.v2.fragment.VideoAdBottomSheet;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.AdBannerNativeSize;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.ProductListInput;
import au.com.woolworths.shop.graphql.type.adapter.ProductListInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b`\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:_\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`a¨\u0006b"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery;", "Lcom/apollographql/apollo/api/Query;", "Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Data;", "Data", "ProductList", "Analytic", "OnAdobeTargetAnalytics", "ProductsFeed", "OnActionableCard", "OnGoogleAdBannerCard", "OnUniversalInventoryContainer", "GoogleAdBannerCard", "NextBestAction", "OnActionableCard1", "OnEdrOfferBanner", "BannerButtonAction", "Analytics", "BannerButtonLabel", "BannerAction", "Analytics1", "BannerAnalytics", "BannerImpressionAnalytics", "CommonAnalytics", "OnPersonalisedProductsBanner", "BannerImage", "Product", "BannerAction1", "Analytics2", "BannerAnalytics1", "BannerImpressionAnalytics1", "OnHorizontalList", "Item", "OnProductCard", "OnMerchCardFullImage", "MerchCardFullImageAction", "MerchCardFullImageBackgroundImageWithAlt", "MerchCardFullImageButton", "ButtonAction", "OnVideoAdUnit", "VideoAdUnitVideoAd", "FallbackImage", "Transcript", "TermsAndConditions", "Analytics3", "EventAnalytics", "Impression", "VideoPlay", "VideoPause", "VideoErrorImpression", "VideoAdUnitProductCard", "OnMerchCard", "MerchCardGridImageWithAlt", "MerchCardListImageWithAlt", "MerchCardButton", "ButtonAction1", "Analytics4", "MerchCardAction", "Analytics5", "MerchCardAnalytics", "MerchCardImpressionAnalytics", "OnInsetBanner", "Action", "OnProductCard1", "Filter", "FilterItem", "Banner", "Action1", "SortOption", "SortOptionsBanner", "MarketplaceFilterSwitch", "ButtonCta", "MarketplaceInfo", "Item1", "Footer", "MarketplaceBottomSheet", "PrimaryCta", "SecondaryCta", "Chip", "Text", "FacetChip", "Text1", "ZeroResult", "OnProductListZeroResult", "Item2", "OnZeroResultProductCategories", "ZeroResultProductCategoriesItem", "ProductCategoryTileAction", "OnHorizontalList1", "Item3", "OnProductCard2", "OnProductListFullScreenError", "Analytics6", "ImpressionAnalytics", "Cta", "LinkTextWithAlt", "LinkAction", "Analytics7", "Companion", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ProductListQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final ProductListInput f5403a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Action;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerActionPlacement f5404a;
        public final InsetBannerActionType b;
        public final String c;
        public final String d;

        public Action(InsetBannerActionPlacement insetBannerActionPlacement, InsetBannerActionType insetBannerActionType, String str, String str2) {
            this.f5404a = insetBannerActionPlacement;
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
            return this.f5404a == action.f5404a && this.b == action.b && Intrinsics.c(this.c, action.c) && Intrinsics.c(this.d, action.d);
        }

        public final int hashCode() {
            int iC = b.c(d.c(this.b, this.f5404a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(d.t("Action(placement=", this.f5404a, ", type=", this.b, ", label="), this.c, ", url=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Action1;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action1 {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerActionPlacement f5405a;
        public final InsetBannerActionType b;
        public final String c;
        public final String d;

        public Action1(InsetBannerActionPlacement insetBannerActionPlacement, InsetBannerActionType insetBannerActionType, String str, String str2) {
            this.f5405a = insetBannerActionPlacement;
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
            return this.f5405a == action1.f5405a && this.b == action1.b && Intrinsics.c(this.c, action1.c) && Intrinsics.c(this.d, action1.d);
        }

        public final int hashCode() {
            int iC = b.c(d.c(this.b, this.f5405a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(d.t("Action1(placement=", this.f5405a, ", type=", this.b, ", label="), this.c, ", url=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Analytic;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytic {

        /* renamed from: a, reason: collision with root package name */
        public final String f5406a;
        public final OnAdobeTargetAnalytics b;

        public Analytic(String __typename, OnAdobeTargetAnalytics onAdobeTargetAnalytics) {
            Intrinsics.h(__typename, "__typename");
            this.f5406a = __typename;
            this.b = onAdobeTargetAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytic)) {
                return false;
            }
            Analytic analytic = (Analytic) obj;
            return Intrinsics.c(this.f5406a, analytic.f5406a) && Intrinsics.c(this.b, analytic.b);
        }

        public final int hashCode() {
            int iHashCode = this.f5406a.hashCode() * 31;
            OnAdobeTargetAnalytics onAdobeTargetAnalytics = this.b;
            return iHashCode + (onAdobeTargetAnalytics == null ? 0 : onAdobeTargetAnalytics.hashCode());
        }

        public final String toString() {
            return "Analytic(__typename=" + this.f5406a + ", onAdobeTargetAnalytics=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Analytics;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f5407a;
        public final AnalyticsFields b;

        public Analytics(String str, AnalyticsFields analyticsFields) {
            this.f5407a = str;
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
            return Intrinsics.c(this.f5407a, analytics.f5407a) && Intrinsics.c(this.b, analytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5407a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics(__typename=", this.f5407a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Analytics1;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f5408a;
        public final AnalyticsFields b;

        public Analytics1(String str, AnalyticsFields analyticsFields) {
            this.f5408a = str;
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
            return Intrinsics.c(this.f5408a, analytics1.f5408a) && Intrinsics.c(this.b, analytics1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5408a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics1(__typename=", this.f5408a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Analytics2;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f5409a;
        public final AnalyticsFields b;

        public Analytics2(String str, AnalyticsFields analyticsFields) {
            this.f5409a = str;
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
            return Intrinsics.c(this.f5409a, analytics2.f5409a) && Intrinsics.c(this.b, analytics2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5409a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics2(__typename=", this.f5409a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Analytics3;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f5410a;
        public final AnalyticsFields b;

        public Analytics3(String str, AnalyticsFields analyticsFields) {
            this.f5410a = str;
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
            return Intrinsics.c(this.f5410a, analytics3.f5410a) && Intrinsics.c(this.b, analytics3.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5410a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics3(__typename=", this.f5410a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Analytics4;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics4 {

        /* renamed from: a, reason: collision with root package name */
        public final String f5411a;
        public final AnalyticsFields b;

        public Analytics4(String str, AnalyticsFields analyticsFields) {
            this.f5411a = str;
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
            return Intrinsics.c(this.f5411a, analytics4.f5411a) && Intrinsics.c(this.b, analytics4.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5411a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics4(__typename=", this.f5411a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Analytics5;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics5 {

        /* renamed from: a, reason: collision with root package name */
        public final String f5412a;
        public final AnalyticsFields b;

        public Analytics5(String str, AnalyticsFields analyticsFields) {
            this.f5412a = str;
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
            return Intrinsics.c(this.f5412a, analytics5.f5412a) && Intrinsics.c(this.b, analytics5.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5412a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics5(__typename=", this.f5412a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Analytics6;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics6 {

        /* renamed from: a, reason: collision with root package name */
        public final String f5413a;
        public final AnalyticsFields b;

        public Analytics6(String str, AnalyticsFields analyticsFields) {
            this.f5413a = str;
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
            return Intrinsics.c(this.f5413a, analytics6.f5413a) && Intrinsics.c(this.b, analytics6.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5413a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics6(__typename=", this.f5413a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Analytics7;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics7 {

        /* renamed from: a, reason: collision with root package name */
        public final String f5414a;
        public final AnalyticsFields b;

        public Analytics7(String str, AnalyticsFields analyticsFields) {
            this.f5414a = str;
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
            return Intrinsics.c(this.f5414a, analytics7.f5414a) && Intrinsics.c(this.b, analytics7.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5414a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics7(__typename=", this.f5414a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Banner;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Banner {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f5415a;
        public final String b;
        public final String c;
        public final Action1 d;
        public final String e;

        public Banner(InsetBannerDisplayType insetBannerDisplayType, String str, String str2, Action1 action1, String str3) {
            this.f5415a = insetBannerDisplayType;
            this.b = str;
            this.c = str2;
            this.d = action1;
            this.e = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) obj;
            return this.f5415a == banner.f5415a && Intrinsics.c(this.b, banner.b) && Intrinsics.c(this.c, banner.c) && Intrinsics.c(this.d, banner.d) && Intrinsics.c(this.e, banner.e);
        }

        public final int hashCode() {
            int iC = b.c(this.f5415a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Action1 action1 = this.d;
            int iHashCode2 = (iHashCode + (action1 == null ? 0 : action1.hashCode())) * 31;
            String str2 = this.e;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbU = d.u("Banner(displayType=", this.f5415a, ", message=", this.b, ", iconUrl=");
            sbU.append(this.c);
            sbU.append(", action=");
            sbU.append(this.d);
            sbU.append(", bannerTitle=");
            return YU.a.o(sbU, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$BannerAction;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BannerAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f5416a;
        public final ActionType b;
        public final String c;
        public final Analytics1 d;
        public final String e;

        public BannerAction(String str, ActionType actionType, String str2, Analytics1 analytics1, String str3) {
            this.f5416a = str;
            this.b = actionType;
            this.c = str2;
            this.d = analytics1;
            this.e = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BannerAction)) {
                return false;
            }
            BannerAction bannerAction = (BannerAction) obj;
            return Intrinsics.c(this.f5416a, bannerAction.f5416a) && this.b == bannerAction.b && Intrinsics.c(this.c, bannerAction.c) && Intrinsics.c(this.d, bannerAction.d) && Intrinsics.c(this.e, bannerAction.e);
        }

        public final int hashCode() {
            int iC = b.c(d.a(this.b, this.f5416a.hashCode() * 31, 31), 31, this.c);
            Analytics1 analytics1 = this.d;
            int iHashCode = (iC + (analytics1 == null ? 0 : analytics1.hashCode())) * 31;
            String str = this.e;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbW = d.w("BannerAction(__typename=", this.f5416a, ", type=", this.b, ", action=");
            sbW.append(this.c);
            sbW.append(", analytics=");
            sbW.append(this.d);
            sbW.append(", id=");
            return YU.a.o(sbW, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$BannerAction1;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BannerAction1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f5417a;
        public final ActionType b;
        public final String c;
        public final Analytics2 d;
        public final String e;

        public BannerAction1(String str, ActionType actionType, String str2, Analytics2 analytics2, String str3) {
            this.f5417a = str;
            this.b = actionType;
            this.c = str2;
            this.d = analytics2;
            this.e = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BannerAction1)) {
                return false;
            }
            BannerAction1 bannerAction1 = (BannerAction1) obj;
            return Intrinsics.c(this.f5417a, bannerAction1.f5417a) && this.b == bannerAction1.b && Intrinsics.c(this.c, bannerAction1.c) && Intrinsics.c(this.d, bannerAction1.d) && Intrinsics.c(this.e, bannerAction1.e);
        }

        public final int hashCode() {
            int iC = b.c(d.a(this.b, this.f5417a.hashCode() * 31, 31), 31, this.c);
            Analytics2 analytics2 = this.d;
            int iHashCode = (iC + (analytics2 == null ? 0 : analytics2.hashCode())) * 31;
            String str = this.e;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbW = d.w("BannerAction1(__typename=", this.f5417a, ", type=", this.b, ", action=");
            sbW.append(this.c);
            sbW.append(", analytics=");
            sbW.append(this.d);
            sbW.append(", id=");
            return YU.a.o(sbW, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$BannerAnalytics;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BannerAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f5418a;
        public final AnalyticsFields b;

        public BannerAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f5418a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BannerAnalytics)) {
                return false;
            }
            BannerAnalytics bannerAnalytics = (BannerAnalytics) obj;
            return Intrinsics.c(this.f5418a, bannerAnalytics.f5418a) && Intrinsics.c(this.b, bannerAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5418a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("BannerAnalytics(__typename=", this.f5418a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$BannerAnalytics1;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BannerAnalytics1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f5419a;
        public final AnalyticsFields b;

        public BannerAnalytics1(String str, AnalyticsFields analyticsFields) {
            this.f5419a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BannerAnalytics1)) {
                return false;
            }
            BannerAnalytics1 bannerAnalytics1 = (BannerAnalytics1) obj;
            return Intrinsics.c(this.f5419a, bannerAnalytics1.f5419a) && Intrinsics.c(this.b, bannerAnalytics1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5419a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("BannerAnalytics1(__typename=", this.f5419a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$BannerButtonAction;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BannerButtonAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f5420a;
        public final ActionType b;
        public final String c;
        public final Analytics d;
        public final String e;

        public BannerButtonAction(String str, ActionType actionType, String str2, Analytics analytics, String str3) {
            this.f5420a = str;
            this.b = actionType;
            this.c = str2;
            this.d = analytics;
            this.e = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BannerButtonAction)) {
                return false;
            }
            BannerButtonAction bannerButtonAction = (BannerButtonAction) obj;
            return Intrinsics.c(this.f5420a, bannerButtonAction.f5420a) && this.b == bannerButtonAction.b && Intrinsics.c(this.c, bannerButtonAction.c) && Intrinsics.c(this.d, bannerButtonAction.d) && Intrinsics.c(this.e, bannerButtonAction.e);
        }

        public final int hashCode() {
            int iC = b.c(d.a(this.b, this.f5420a.hashCode() * 31, 31), 31, this.c);
            Analytics analytics = this.d;
            int iHashCode = (iC + (analytics == null ? 0 : analytics.hashCode())) * 31;
            String str = this.e;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbW = d.w("BannerButtonAction(__typename=", this.f5420a, ", type=", this.b, ", action=");
            sbW.append(this.c);
            sbW.append(", analytics=");
            sbW.append(this.d);
            sbW.append(", id=");
            return YU.a.o(sbW, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$BannerButtonLabel;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BannerButtonLabel {

        /* renamed from: a, reason: collision with root package name */
        public final String f5421a;
        public final String b;
        public final String c;

        public BannerButtonLabel(String str, String str2, String str3) {
            this.f5421a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BannerButtonLabel)) {
                return false;
            }
            BannerButtonLabel bannerButtonLabel = (BannerButtonLabel) obj;
            return Intrinsics.c(this.f5421a, bannerButtonLabel.f5421a) && Intrinsics.c(this.b, bannerButtonLabel.b) && Intrinsics.c(this.c, bannerButtonLabel.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f5421a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("BannerButtonLabel(__typename=", this.f5421a, ", text=", this.b, ", altText="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$BannerImage;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BannerImage {

        /* renamed from: a, reason: collision with root package name */
        public final String f5422a;
        public final String b;
        public final String c;

        public BannerImage(String str, String str2, String str3) {
            this.f5422a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BannerImage)) {
                return false;
            }
            BannerImage bannerImage = (BannerImage) obj;
            return Intrinsics.c(this.f5422a, bannerImage.f5422a) && Intrinsics.c(this.b, bannerImage.b) && Intrinsics.c(this.c, bannerImage.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f5422a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("BannerImage(__typename=", this.f5422a, ", imageUrl=", this.b, ", altText="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$BannerImpressionAnalytics;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BannerImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f5423a;
        public final AnalyticsFields b;

        public BannerImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f5423a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BannerImpressionAnalytics)) {
                return false;
            }
            BannerImpressionAnalytics bannerImpressionAnalytics = (BannerImpressionAnalytics) obj;
            return Intrinsics.c(this.f5423a, bannerImpressionAnalytics.f5423a) && Intrinsics.c(this.b, bannerImpressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5423a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("BannerImpressionAnalytics(__typename=", this.f5423a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$BannerImpressionAnalytics1;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BannerImpressionAnalytics1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f5424a;
        public final AnalyticsFields b;

        public BannerImpressionAnalytics1(String str, AnalyticsFields analyticsFields) {
            this.f5424a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BannerImpressionAnalytics1)) {
                return false;
            }
            BannerImpressionAnalytics1 bannerImpressionAnalytics1 = (BannerImpressionAnalytics1) obj;
            return Intrinsics.c(this.f5424a, bannerImpressionAnalytics1.f5424a) && Intrinsics.c(this.b, bannerImpressionAnalytics1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5424a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("BannerImpressionAnalytics1(__typename=", this.f5424a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$ButtonAction;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ButtonAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f5425a;
        public final ActionType b;
        public final String c;
        public final String d;

        public ButtonAction(String str, ActionType actionType, String str2, String str3) {
            this.f5425a = str;
            this.b = actionType;
            this.c = str2;
            this.d = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonAction)) {
                return false;
            }
            ButtonAction buttonAction = (ButtonAction) obj;
            return Intrinsics.c(this.f5425a, buttonAction.f5425a) && this.b == buttonAction.b && Intrinsics.c(this.c, buttonAction.c) && Intrinsics.c(this.d, buttonAction.d);
        }

        public final int hashCode() {
            int iC = b.c(d.a(this.b, this.f5425a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(d.w("ButtonAction(__typename=", this.f5425a, ", type=", this.b, ", action="), this.c, ", id=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$ButtonAction1;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ButtonAction1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f5426a;
        public final ActionType b;
        public final String c;
        public final String d;
        public final Analytics4 e;

        public ButtonAction1(String str, ActionType actionType, String str2, String str3, Analytics4 analytics4) {
            this.f5426a = str;
            this.b = actionType;
            this.c = str2;
            this.d = str3;
            this.e = analytics4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonAction1)) {
                return false;
            }
            ButtonAction1 buttonAction1 = (ButtonAction1) obj;
            return Intrinsics.c(this.f5426a, buttonAction1.f5426a) && this.b == buttonAction1.b && Intrinsics.c(this.c, buttonAction1.c) && Intrinsics.c(this.d, buttonAction1.d) && Intrinsics.c(this.e, buttonAction1.e);
        }

        public final int hashCode() {
            int iC = b.c(d.a(this.b, this.f5426a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Analytics4 analytics4 = this.e;
            return iHashCode + (analytics4 != null ? analytics4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbW = d.w("ButtonAction1(__typename=", this.f5426a, ", type=", this.b, ", action=");
            androidx.constraintlayout.core.state.a.B(sbW, this.c, ", id=", this.d, ", analytics=");
            sbW.append(this.e);
            sbW.append(")");
            return sbW.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$ButtonCta;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ButtonCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f5427a;

        public ButtonCta(String str) {
            this.f5427a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ButtonCta) && Intrinsics.c(this.f5427a, ((ButtonCta) obj).f5427a);
        }

        public final int hashCode() {
            return this.f5427a.hashCode();
        }

        public final String toString() {
            return YU.a.h("ButtonCta(label=", this.f5427a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Chip;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Chip {

        /* renamed from: a, reason: collision with root package name */
        public final String f5428a;
        public final boolean b;
        public final Text c;
        public final String d;

        public Chip(String str, boolean z, Text text, String str2) {
            this.f5428a = str;
            this.b = z;
            this.c = text;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Chip)) {
                return false;
            }
            Chip chip = (Chip) obj;
            return Intrinsics.c(this.f5428a, chip.f5428a) && this.b == chip.b && Intrinsics.c(this.c, chip.c) && Intrinsics.c(this.d, chip.d);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + b.e(this.f5428a.hashCode() * 31, 31, this.b)) * 31;
            String str = this.d;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sbQ = androidx.constraintlayout.core.state.a.q("Chip(id=", this.f5428a, ", isSelected=", ", text=", this.b);
            sbQ.append(this.c);
            sbQ.append(", persistentId=");
            sbQ.append(this.d);
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$CommonAnalytics;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CommonAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f5429a;
        public final AnalyticsFields b;

        public CommonAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f5429a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CommonAnalytics)) {
                return false;
            }
            CommonAnalytics commonAnalytics = (CommonAnalytics) obj;
            return Intrinsics.c(this.f5429a, commonAnalytics.f5429a) && Intrinsics.c(this.b, commonAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5429a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("CommonAnalytics(__typename=", this.f5429a, ", analyticsFields=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Cta;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cta {

        /* renamed from: a, reason: collision with root package name */
        public final String f5430a;
        public final LinkTextWithAlt b;
        public final LinkAction c;

        public Cta(String str, LinkTextWithAlt linkTextWithAlt, LinkAction linkAction) {
            this.f5430a = str;
            this.b = linkTextWithAlt;
            this.c = linkAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cta)) {
                return false;
            }
            Cta cta = (Cta) obj;
            return Intrinsics.c(this.f5430a, cta.f5430a) && Intrinsics.c(this.b, cta.b) && Intrinsics.c(this.c, cta.c);
        }

        public final int hashCode() {
            String str = this.f5430a;
            return this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
        }

        public final String toString() {
            return "Cta(linkId=" + this.f5430a + ", linkTextWithAlt=" + this.b + ", linkAction=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ProductList f5431a;

        public Data(ProductList productList) {
            this.f5431a = productList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f5431a, ((Data) obj).f5431a);
        }

        public final int hashCode() {
            return this.f5431a.hashCode();
        }

        public final String toString() {
            return "Data(productList=" + this.f5431a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$EventAnalytics;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EventAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final Impression f5432a;
        public final VideoPlay b;
        public final VideoPause c;
        public final VideoErrorImpression d;

        public EventAnalytics(Impression impression, VideoPlay videoPlay, VideoPause videoPause, VideoErrorImpression videoErrorImpression) {
            this.f5432a = impression;
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
            return Intrinsics.c(this.f5432a, eventAnalytics.f5432a) && Intrinsics.c(this.b, eventAnalytics.b) && Intrinsics.c(this.c, eventAnalytics.c) && Intrinsics.c(this.d, eventAnalytics.d);
        }

        public final int hashCode() {
            Impression impression = this.f5432a;
            int iHashCode = (impression == null ? 0 : impression.hashCode()) * 31;
            VideoPlay videoPlay = this.b;
            int iHashCode2 = (iHashCode + (videoPlay == null ? 0 : videoPlay.hashCode())) * 31;
            VideoPause videoPause = this.c;
            int iHashCode3 = (iHashCode2 + (videoPause == null ? 0 : videoPause.hashCode())) * 31;
            VideoErrorImpression videoErrorImpression = this.d;
            return iHashCode3 + (videoErrorImpression != null ? videoErrorImpression.hashCode() : 0);
        }

        public final String toString() {
            return "EventAnalytics(impression=" + this.f5432a + ", videoPlay=" + this.b + ", videoPause=" + this.c + ", videoErrorImpression=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$FacetChip;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FacetChip {

        /* renamed from: a, reason: collision with root package name */
        public final String f5433a;
        public final boolean b;
        public final Text1 c;

        public FacetChip(String str, boolean z, Text1 text1) {
            this.f5433a = str;
            this.b = z;
            this.c = text1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FacetChip)) {
                return false;
            }
            FacetChip facetChip = (FacetChip) obj;
            return Intrinsics.c(this.f5433a, facetChip.f5433a) && this.b == facetChip.b && Intrinsics.c(this.c, facetChip.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.e(this.f5433a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbQ = androidx.constraintlayout.core.state.a.q("FacetChip(id=", this.f5433a, ", isSelected=", ", text=", this.b);
            sbQ.append(this.c);
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$FallbackImage;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FallbackImage {

        /* renamed from: a, reason: collision with root package name */
        public final String f5434a;
        public final String b;

        public FallbackImage(String str, String str2) {
            this.f5434a = str;
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
            return Intrinsics.c(this.f5434a, fallbackImage.f5434a) && Intrinsics.c(this.b, fallbackImage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5434a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("FallbackImage(imageUrl=", this.f5434a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Filter;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Filter {

        /* renamed from: a, reason: collision with root package name */
        public final String f5435a;
        public final String b;
        public final ArrayList c;
        public final Banner d;

        public Filter(String str, String str2, ArrayList arrayList, Banner banner) {
            this.f5435a = str;
            this.b = str2;
            this.c = arrayList;
            this.d = banner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Filter)) {
                return false;
            }
            Filter filter = (Filter) obj;
            return this.f5435a.equals(filter.f5435a) && this.b.equals(filter.b) && this.c.equals(filter.c) && Intrinsics.c(this.d, filter.d);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(b.c(this.f5435a.hashCode() * 31, 31, this.b), 31, this.c);
            Banner banner = this.d;
            return iB + (banner == null ? 0 : banner.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("Filter(headerKey=", this.f5435a, ", headerTitle=", this.b, ", filterItems=");
            sbV.append(this.c);
            sbV.append(", banner=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$FilterItem;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FilterItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f5436a;
        public final String b;
        public final String c;
        public final String d;
        public final boolean e;
        public final boolean f;

        public FilterItem(String str, String str2, String str3, String str4, boolean z, boolean z2) {
            this.f5436a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = z;
            this.f = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FilterItem)) {
                return false;
            }
            FilterItem filterItem = (FilterItem) obj;
            return Intrinsics.c(this.f5436a, filterItem.f5436a) && Intrinsics.c(this.b, filterItem.b) && Intrinsics.c(this.c, filterItem.c) && Intrinsics.c(this.d, filterItem.d) && this.e == filterItem.e && this.f == filterItem.f;
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f5436a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            return Boolean.hashCode(this.f) + b.e((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("FilterItem(key=", this.f5436a, ", title=", this.b, ", label=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", parentKey=", this.d, ", hasChildren=");
            return au.com.woolworths.android.onesite.a.q(sbV, this.e, ", isApplied=", this.f, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Footer;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Footer {

        /* renamed from: a, reason: collision with root package name */
        public final String f5437a;
        public final String b;
        public final String c;

        public Footer(String str, String str2, String str3) {
            this.f5437a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) obj;
            return Intrinsics.c(this.f5437a, footer.f5437a) && Intrinsics.c(this.b, footer.b) && Intrinsics.c(this.c, footer.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f5437a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("Footer(title=", this.f5437a, ", subtitle=", this.b, ", linkUrl="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$GoogleAdBannerCard;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class GoogleAdBannerCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f5438a;
        public final String b;
        public final boolean c;
        public final String d;
        public final AdBannerNativeSize e;
        public final GoogleAdCustomTargeting f;
        public final String g;
        public final Boolean h;

        public GoogleAdBannerCard(String str, String str2, boolean z, String str3, AdBannerNativeSize adBannerNativeSize, GoogleAdCustomTargeting googleAdCustomTargeting, String str4, Boolean bool) {
            this.f5438a = str;
            this.b = str2;
            this.c = z;
            this.d = str3;
            this.e = adBannerNativeSize;
            this.f = googleAdCustomTargeting;
            this.g = str4;
            this.h = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GoogleAdBannerCard)) {
                return false;
            }
            GoogleAdBannerCard googleAdBannerCard = (GoogleAdBannerCard) obj;
            return Intrinsics.c(this.f5438a, googleAdBannerCard.f5438a) && Intrinsics.c(this.b, googleAdBannerCard.b) && this.c == googleAdBannerCard.c && Intrinsics.c(this.d, googleAdBannerCard.d) && this.e == googleAdBannerCard.e && Intrinsics.c(this.f, googleAdBannerCard.f) && Intrinsics.c(this.g, googleAdBannerCard.g) && Intrinsics.c(this.h, googleAdBannerCard.h);
        }

        public final int hashCode() {
            int iE = b.e(b.c(this.f5438a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            int iHashCode = (this.e.hashCode() + ((iE + (str == null ? 0 : str.hashCode())) * 31)) * 31;
            GoogleAdCustomTargeting googleAdCustomTargeting = this.f;
            int iHashCode2 = (iHashCode + (googleAdCustomTargeting == null ? 0 : googleAdCustomTargeting.hashCode())) * 31;
            String str2 = this.g;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.h;
            return iHashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("GoogleAdBannerCard(adUnit=", this.f5438a, ", nativeCustomTemplateId=", this.b, ", iabSpec=");
            au.com.woolworths.android.onesite.a.y(", iabSize=", this.d, ", height=", sbV, this.c);
            sbV.append(this.e);
            sbV.append(", targeting=");
            sbV.append(this.f);
            sbV.append(", correlator=");
            sbV.append(this.g);
            sbV.append(", _excluded=");
            sbV.append(this.h);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Impression;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Impression {

        /* renamed from: a, reason: collision with root package name */
        public final String f5439a;
        public final AnalyticsFields b;

        public Impression(String str, AnalyticsFields analyticsFields) {
            this.f5439a = str;
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
            return Intrinsics.c(this.f5439a, impression.f5439a) && Intrinsics.c(this.b, impression.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5439a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Impression(__typename=", this.f5439a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$ImpressionAnalytics;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f5440a;
        public final AnalyticsFields b;

        public ImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f5440a = str;
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
            return Intrinsics.c(this.f5440a, impressionAnalytics.f5440a) && Intrinsics.c(this.b, impressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5440a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytics(__typename=", this.f5440a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Item;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f5441a;
        public final OnProductCard b;
        public final OnMerchCardFullImage c;

        public Item(String __typename, OnProductCard onProductCard, OnMerchCardFullImage onMerchCardFullImage) {
            Intrinsics.h(__typename, "__typename");
            this.f5441a = __typename;
            this.b = onProductCard;
            this.c = onMerchCardFullImage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f5441a, item.f5441a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c);
        }

        public final int hashCode() {
            int iHashCode = this.f5441a.hashCode() * 31;
            OnProductCard onProductCard = this.b;
            int iHashCode2 = (iHashCode + (onProductCard == null ? 0 : onProductCard.hashCode())) * 31;
            OnMerchCardFullImage onMerchCardFullImage = this.c;
            return iHashCode2 + (onMerchCardFullImage != null ? onMerchCardFullImage.hashCode() : 0);
        }

        public final String toString() {
            return "Item(__typename=" + this.f5441a + ", onProductCard=" + this.b + ", onMerchCardFullImage=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Item1;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f5442a;
        public final String b;
        public final String c;

        public Item1(String str, String str2, String str3) {
            this.f5442a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item1)) {
                return false;
            }
            Item1 item1 = (Item1) obj;
            return Intrinsics.c(this.f5442a, item1.f5442a) && Intrinsics.c(this.b, item1.b) && Intrinsics.c(this.c, item1.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f5442a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("Item1(title=", this.f5442a, ", description=", this.b, ", imageUrl="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Item2;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f5443a;
        public final OnZeroResultProductCategories b;
        public final OnHorizontalList1 c;

        public Item2(String __typename, OnZeroResultProductCategories onZeroResultProductCategories, OnHorizontalList1 onHorizontalList1) {
            Intrinsics.h(__typename, "__typename");
            this.f5443a = __typename;
            this.b = onZeroResultProductCategories;
            this.c = onHorizontalList1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item2)) {
                return false;
            }
            Item2 item2 = (Item2) obj;
            return Intrinsics.c(this.f5443a, item2.f5443a) && Intrinsics.c(this.b, item2.b) && Intrinsics.c(this.c, item2.c);
        }

        public final int hashCode() {
            int iHashCode = this.f5443a.hashCode() * 31;
            OnZeroResultProductCategories onZeroResultProductCategories = this.b;
            int iHashCode2 = (iHashCode + (onZeroResultProductCategories == null ? 0 : onZeroResultProductCategories.hashCode())) * 31;
            OnHorizontalList1 onHorizontalList1 = this.c;
            return iHashCode2 + (onHorizontalList1 != null ? onHorizontalList1.hashCode() : 0);
        }

        public final String toString() {
            return "Item2(__typename=" + this.f5443a + ", onZeroResultProductCategories=" + this.b + ", onHorizontalList=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Item3;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f5444a;
        public final OnProductCard2 b;

        public Item3(String __typename, OnProductCard2 onProductCard2) {
            Intrinsics.h(__typename, "__typename");
            this.f5444a = __typename;
            this.b = onProductCard2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item3)) {
                return false;
            }
            Item3 item3 = (Item3) obj;
            return Intrinsics.c(this.f5444a, item3.f5444a) && Intrinsics.c(this.b, item3.b);
        }

        public final int hashCode() {
            int iHashCode = this.f5444a.hashCode() * 31;
            OnProductCard2 onProductCard2 = this.b;
            return iHashCode + (onProductCard2 == null ? 0 : onProductCard2.hashCode());
        }

        public final String toString() {
            return "Item3(__typename=" + this.f5444a + ", onProductCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$LinkAction;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f5445a;
        public final String b;
        public final ActionType c;
        public final Analytics7 d;

        public LinkAction(String str, String str2, ActionType actionType, Analytics7 analytics7) {
            this.f5445a = str;
            this.b = str2;
            this.c = actionType;
            this.d = analytics7;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkAction)) {
                return false;
            }
            LinkAction linkAction = (LinkAction) obj;
            return Intrinsics.c(this.f5445a, linkAction.f5445a) && Intrinsics.c(this.b, linkAction.b) && this.c == linkAction.c && Intrinsics.c(this.d, linkAction.d);
        }

        public final int hashCode() {
            int iHashCode = this.f5445a.hashCode() * 31;
            String str = this.b;
            int iA = d.a(this.c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
            Analytics7 analytics7 = this.d;
            return iA + (analytics7 != null ? analytics7.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("LinkAction(action=", this.f5445a, ", id=", this.b, ", type=");
            sbV.append(this.c);
            sbV.append(", analytics=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$LinkTextWithAlt;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkTextWithAlt {

        /* renamed from: a, reason: collision with root package name */
        public final String f5446a;
        public final String b;

        public LinkTextWithAlt(String str, String str2) {
            this.f5446a = str;
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
            return Intrinsics.c(this.f5446a, linkTextWithAlt.f5446a) && Intrinsics.c(this.b, linkTextWithAlt.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5446a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("LinkTextWithAlt(text=", this.f5446a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$MarketplaceBottomSheet;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MarketplaceBottomSheet {

        /* renamed from: a, reason: collision with root package name */
        public final String f5447a;
        public final String b;
        public final PrimaryCta c;
        public final SecondaryCta d;
        public final Boolean e;

        public MarketplaceBottomSheet(String str, String str2, PrimaryCta primaryCta, SecondaryCta secondaryCta, Boolean bool) {
            this.f5447a = str;
            this.b = str2;
            this.c = primaryCta;
            this.d = secondaryCta;
            this.e = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarketplaceBottomSheet)) {
                return false;
            }
            MarketplaceBottomSheet marketplaceBottomSheet = (MarketplaceBottomSheet) obj;
            return Intrinsics.c(this.f5447a, marketplaceBottomSheet.f5447a) && Intrinsics.c(this.b, marketplaceBottomSheet.b) && Intrinsics.c(this.c, marketplaceBottomSheet.c) && Intrinsics.c(this.d, marketplaceBottomSheet.d) && Intrinsics.c(this.e, marketplaceBottomSheet.e);
        }

        public final int hashCode() {
            int iC = b.c(this.f5447a.hashCode() * 31, 31, this.b);
            PrimaryCta primaryCta = this.c;
            int iHashCode = (iC + (primaryCta == null ? 0 : primaryCta.f5479a.hashCode())) * 31;
            SecondaryCta secondaryCta = this.d;
            int iHashCode2 = (iHashCode + (secondaryCta == null ? 0 : secondaryCta.f5484a.hashCode())) * 31;
            Boolean bool = this.e;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("MarketplaceBottomSheet(bottomSheetTitle=", this.f5447a, ", bottomSheetBody=", this.b, ", primaryCta=");
            sbV.append(this.c);
            sbV.append(", secondaryCta=");
            sbV.append(this.d);
            sbV.append(", showOnceOnly=");
            return au.com.woolworths.android.onesite.a.o(sbV, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$MarketplaceFilterSwitch;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MarketplaceFilterSwitch {

        /* renamed from: a, reason: collision with root package name */
        public final String f5448a;
        public final String b;
        public final String c;
        public final ButtonCta d;
        public final boolean e;

        public MarketplaceFilterSwitch(String str, String str2, String str3, ButtonCta buttonCta, boolean z) {
            this.f5448a = str;
            this.b = str2;
            this.c = str3;
            this.d = buttonCta;
            this.e = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarketplaceFilterSwitch)) {
                return false;
            }
            MarketplaceFilterSwitch marketplaceFilterSwitch = (MarketplaceFilterSwitch) obj;
            return Intrinsics.c(this.f5448a, marketplaceFilterSwitch.f5448a) && Intrinsics.c(this.b, marketplaceFilterSwitch.b) && Intrinsics.c(this.c, marketplaceFilterSwitch.c) && Intrinsics.c(this.d, marketplaceFilterSwitch.d) && this.e == marketplaceFilterSwitch.e;
        }

        public final int hashCode() {
            int iHashCode = this.f5448a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            ButtonCta buttonCta = this.d;
            return Boolean.hashCode(this.e) + ((iHashCode3 + (buttonCta != null ? buttonCta.f5427a.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("MarketplaceFilterSwitch(title=", this.f5448a, ", subtitle=", this.b, ", imageUrl=");
            sbV.append(this.c);
            sbV.append(", buttonCta=");
            sbV.append(this.d);
            sbV.append(", value=");
            return YU.a.k(")", sbV, this.e);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$MarketplaceInfo;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MarketplaceInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f5449a;
        public final ArrayList b;
        public final Footer c;

        public MarketplaceInfo(String str, ArrayList arrayList, Footer footer) {
            this.f5449a = str;
            this.b = arrayList;
            this.c = footer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarketplaceInfo)) {
                return false;
            }
            MarketplaceInfo marketplaceInfo = (MarketplaceInfo) obj;
            return this.f5449a.equals(marketplaceInfo.f5449a) && this.b.equals(marketplaceInfo.b) && Intrinsics.c(this.c, marketplaceInfo.c);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(this.f5449a.hashCode() * 31, 31, this.b);
            Footer footer = this.c;
            return iB + (footer == null ? 0 : footer.hashCode());
        }

        public final String toString() {
            StringBuilder sbX = d.x("MarketplaceInfo(title=", this.f5449a, ", items=", ", footer=", this.b);
            sbX.append(this.c);
            sbX.append(")");
            return sbX.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$MerchCardAction;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MerchCardAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f5450a;
        public final ActionType b;
        public final String c;
        public final String d;
        public final Analytics5 e;

        public MerchCardAction(String str, ActionType actionType, String str2, String str3, Analytics5 analytics5) {
            this.f5450a = str;
            this.b = actionType;
            this.c = str2;
            this.d = str3;
            this.e = analytics5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MerchCardAction)) {
                return false;
            }
            MerchCardAction merchCardAction = (MerchCardAction) obj;
            return Intrinsics.c(this.f5450a, merchCardAction.f5450a) && this.b == merchCardAction.b && Intrinsics.c(this.c, merchCardAction.c) && Intrinsics.c(this.d, merchCardAction.d) && Intrinsics.c(this.e, merchCardAction.e);
        }

        public final int hashCode() {
            int iC = b.c(d.a(this.b, this.f5450a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            Analytics5 analytics5 = this.e;
            return iHashCode + (analytics5 != null ? analytics5.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbW = d.w("MerchCardAction(__typename=", this.f5450a, ", type=", this.b, ", action=");
            androidx.constraintlayout.core.state.a.B(sbW, this.c, ", id=", this.d, ", analytics=");
            sbW.append(this.e);
            sbW.append(")");
            return sbW.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$MerchCardAnalytics;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MerchCardAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f5451a;
        public final AnalyticsFields b;

        public MerchCardAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f5451a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MerchCardAnalytics)) {
                return false;
            }
            MerchCardAnalytics merchCardAnalytics = (MerchCardAnalytics) obj;
            return Intrinsics.c(this.f5451a, merchCardAnalytics.f5451a) && Intrinsics.c(this.b, merchCardAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5451a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("MerchCardAnalytics(__typename=", this.f5451a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$MerchCardButton;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MerchCardButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f5452a;
        public final String b;
        public final String c;
        public final ButtonStyle d;
        public final boolean e;
        public final String f;
        public final String g;
        public final ButtonAction1 h;

        public MerchCardButton(String str, String str2, String str3, ButtonStyle buttonStyle, boolean z, String str4, String str5, ButtonAction1 buttonAction1) {
            this.f5452a = str;
            this.b = str2;
            this.c = str3;
            this.d = buttonStyle;
            this.e = z;
            this.f = str4;
            this.g = str5;
            this.h = buttonAction1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MerchCardButton)) {
                return false;
            }
            MerchCardButton merchCardButton = (MerchCardButton) obj;
            return Intrinsics.c(this.f5452a, merchCardButton.f5452a) && Intrinsics.c(this.b, merchCardButton.b) && Intrinsics.c(this.c, merchCardButton.c) && this.d == merchCardButton.d && this.e == merchCardButton.e && Intrinsics.c(this.f, merchCardButton.f) && Intrinsics.c(this.g, merchCardButton.g) && Intrinsics.c(this.h, merchCardButton.h);
        }

        public final int hashCode() {
            int iHashCode = this.f5452a.hashCode() * 31;
            String str = this.b;
            int iC = b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
            ButtonStyle buttonStyle = this.d;
            int iE = b.e((iC + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31, 31, this.e);
            String str2 = this.f;
            int iHashCode2 = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.g;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            ButtonAction1 buttonAction1 = this.h;
            return iHashCode3 + (buttonAction1 != null ? buttonAction1.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("MerchCardButton(__typename=", this.f5452a, ", buttonId=", this.b, ", label=");
            sbV.append(this.c);
            sbV.append(", style=");
            sbV.append(this.d);
            sbV.append(", enabled=");
            au.com.woolworths.android.onesite.a.y(", iconUrl=", this.f, ", altText=", sbV, this.e);
            sbV.append(this.g);
            sbV.append(", buttonAction=");
            sbV.append(this.h);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$MerchCardFullImageAction;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MerchCardFullImageAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f5453a;
        public final ActionType b;
        public final String c;

        public MerchCardFullImageAction(String str, ActionType actionType, String str2) {
            this.f5453a = str;
            this.b = actionType;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MerchCardFullImageAction)) {
                return false;
            }
            MerchCardFullImageAction merchCardFullImageAction = (MerchCardFullImageAction) obj;
            return Intrinsics.c(this.f5453a, merchCardFullImageAction.f5453a) && this.b == merchCardFullImageAction.b && Intrinsics.c(this.c, merchCardFullImageAction.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + d.a(this.b, this.f5453a.hashCode() * 31, 31);
        }

        public final String toString() {
            return YU.a.o(d.w("MerchCardFullImageAction(__typename=", this.f5453a, ", type=", this.b, ", action="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$MerchCardFullImageBackgroundImageWithAlt;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MerchCardFullImageBackgroundImageWithAlt {

        /* renamed from: a, reason: collision with root package name */
        public final String f5454a;
        public final String b;
        public final String c;

        public MerchCardFullImageBackgroundImageWithAlt(String str, String str2, String str3) {
            this.f5454a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MerchCardFullImageBackgroundImageWithAlt)) {
                return false;
            }
            MerchCardFullImageBackgroundImageWithAlt merchCardFullImageBackgroundImageWithAlt = (MerchCardFullImageBackgroundImageWithAlt) obj;
            return Intrinsics.c(this.f5454a, merchCardFullImageBackgroundImageWithAlt.f5454a) && Intrinsics.c(this.b, merchCardFullImageBackgroundImageWithAlt.b) && Intrinsics.c(this.c, merchCardFullImageBackgroundImageWithAlt.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f5454a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("MerchCardFullImageBackgroundImageWithAlt(__typename=", this.f5454a, ", imageUrl=", this.b, ", altText="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$MerchCardFullImageButton;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MerchCardFullImageButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f5455a;
        public final String b;
        public final String c;
        public final ButtonStyle d;
        public final boolean e;
        public final String f;
        public final String g;
        public final ButtonAction h;

        public MerchCardFullImageButton(String str, String str2, String str3, ButtonStyle buttonStyle, boolean z, String str4, String str5, ButtonAction buttonAction) {
            this.f5455a = str;
            this.b = str2;
            this.c = str3;
            this.d = buttonStyle;
            this.e = z;
            this.f = str4;
            this.g = str5;
            this.h = buttonAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MerchCardFullImageButton)) {
                return false;
            }
            MerchCardFullImageButton merchCardFullImageButton = (MerchCardFullImageButton) obj;
            return Intrinsics.c(this.f5455a, merchCardFullImageButton.f5455a) && Intrinsics.c(this.b, merchCardFullImageButton.b) && Intrinsics.c(this.c, merchCardFullImageButton.c) && this.d == merchCardFullImageButton.d && this.e == merchCardFullImageButton.e && Intrinsics.c(this.f, merchCardFullImageButton.f) && Intrinsics.c(this.g, merchCardFullImageButton.g) && Intrinsics.c(this.h, merchCardFullImageButton.h);
        }

        public final int hashCode() {
            int iHashCode = this.f5455a.hashCode() * 31;
            String str = this.b;
            int iC = b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
            ButtonStyle buttonStyle = this.d;
            int iE = b.e((iC + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31, 31, this.e);
            String str2 = this.f;
            int iHashCode2 = (iE + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.g;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            ButtonAction buttonAction = this.h;
            return iHashCode3 + (buttonAction != null ? buttonAction.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("MerchCardFullImageButton(__typename=", this.f5455a, ", buttonId=", this.b, ", label=");
            sbV.append(this.c);
            sbV.append(", style=");
            sbV.append(this.d);
            sbV.append(", enabled=");
            au.com.woolworths.android.onesite.a.y(", iconUrl=", this.f, ", altText=", sbV, this.e);
            sbV.append(this.g);
            sbV.append(", buttonAction=");
            sbV.append(this.h);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$MerchCardGridImageWithAlt;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MerchCardGridImageWithAlt {

        /* renamed from: a, reason: collision with root package name */
        public final String f5456a;
        public final String b;
        public final String c;

        public MerchCardGridImageWithAlt(String str, String str2, String str3) {
            this.f5456a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MerchCardGridImageWithAlt)) {
                return false;
            }
            MerchCardGridImageWithAlt merchCardGridImageWithAlt = (MerchCardGridImageWithAlt) obj;
            return Intrinsics.c(this.f5456a, merchCardGridImageWithAlt.f5456a) && Intrinsics.c(this.b, merchCardGridImageWithAlt.b) && Intrinsics.c(this.c, merchCardGridImageWithAlt.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f5456a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("MerchCardGridImageWithAlt(__typename=", this.f5456a, ", imageUrl=", this.b, ", altText="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$MerchCardImpressionAnalytics;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MerchCardImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f5457a;
        public final AnalyticsFields b;

        public MerchCardImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f5457a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MerchCardImpressionAnalytics)) {
                return false;
            }
            MerchCardImpressionAnalytics merchCardImpressionAnalytics = (MerchCardImpressionAnalytics) obj;
            return Intrinsics.c(this.f5457a, merchCardImpressionAnalytics.f5457a) && Intrinsics.c(this.b, merchCardImpressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5457a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("MerchCardImpressionAnalytics(__typename=", this.f5457a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$MerchCardListImageWithAlt;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MerchCardListImageWithAlt {

        /* renamed from: a, reason: collision with root package name */
        public final String f5458a;
        public final String b;
        public final String c;

        public MerchCardListImageWithAlt(String str, String str2, String str3) {
            this.f5458a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MerchCardListImageWithAlt)) {
                return false;
            }
            MerchCardListImageWithAlt merchCardListImageWithAlt = (MerchCardListImageWithAlt) obj;
            return Intrinsics.c(this.f5458a, merchCardListImageWithAlt.f5458a) && Intrinsics.c(this.b, merchCardListImageWithAlt.b) && Intrinsics.c(this.c, merchCardListImageWithAlt.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f5458a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("MerchCardListImageWithAlt(__typename=", this.f5458a, ", imageUrl=", this.b, ", altText="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$NextBestAction;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class NextBestAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f5459a;
        public final OnActionableCard1 b;
        public final OnEdrOfferBanner c;
        public final OnPersonalisedProductsBanner d;

        public NextBestAction(String __typename, OnActionableCard1 onActionableCard1, OnEdrOfferBanner onEdrOfferBanner, OnPersonalisedProductsBanner onPersonalisedProductsBanner) {
            Intrinsics.h(__typename, "__typename");
            this.f5459a = __typename;
            this.b = onActionableCard1;
            this.c = onEdrOfferBanner;
            this.d = onPersonalisedProductsBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof NextBestAction)) {
                return false;
            }
            NextBestAction nextBestAction = (NextBestAction) obj;
            return Intrinsics.c(this.f5459a, nextBestAction.f5459a) && Intrinsics.c(this.b, nextBestAction.b) && Intrinsics.c(this.c, nextBestAction.c) && Intrinsics.c(this.d, nextBestAction.d);
        }

        public final int hashCode() {
            int iHashCode = this.f5459a.hashCode() * 31;
            OnActionableCard1 onActionableCard1 = this.b;
            int iHashCode2 = (iHashCode + (onActionableCard1 == null ? 0 : onActionableCard1.hashCode())) * 31;
            OnEdrOfferBanner onEdrOfferBanner = this.c;
            int iHashCode3 = (iHashCode2 + (onEdrOfferBanner == null ? 0 : onEdrOfferBanner.hashCode())) * 31;
            OnPersonalisedProductsBanner onPersonalisedProductsBanner = this.d;
            return iHashCode3 + (onPersonalisedProductsBanner != null ? onPersonalisedProductsBanner.hashCode() : 0);
        }

        public final String toString() {
            return "NextBestAction(__typename=" + this.f5459a + ", onActionableCard=" + this.b + ", onEdrOfferBanner=" + this.c + ", onPersonalisedProductsBanner=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnActionableCard;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnActionableCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f5460a;
        public final String b;
        public final CardHeight c;
        public final String d;
        public final TealiumAnalytics e;
        public final Boolean f;

        public OnActionableCard(String str, String str2, CardHeight cardHeight, String str3, TealiumAnalytics tealiumAnalytics, Boolean bool) {
            this.f5460a = str;
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
            return Intrinsics.c(this.f5460a, onActionableCard.f5460a) && Intrinsics.c(this.b, onActionableCard.b) && this.c == onActionableCard.c && Intrinsics.c(this.d, onActionableCard.d) && Intrinsics.c(this.e, onActionableCard.e) && Intrinsics.c(this.f, onActionableCard.f);
        }

        public final int hashCode() {
            int iC = b.c(d.b(this.c, b.c(this.f5460a.hashCode() * 31, 31, this.b), 31), 31, this.d);
            TealiumAnalytics tealiumAnalytics = this.e;
            int iHashCode = (iC + (tealiumAnalytics == null ? 0 : tealiumAnalytics.hashCode())) * 31;
            Boolean bool = this.f;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnActionableCard(image=", this.f5460a, ", altText=", this.b, ", cardHeight=");
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnActionableCard1;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnActionableCard1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f5461a;
        public final String b;
        public final String c;
        public final String d;
        public final CardHeight e;
        public final TealiumAnalytics f;
        public final Boolean g;

        public OnActionableCard1(String str, String str2, String str3, String str4, CardHeight cardHeight, TealiumAnalytics tealiumAnalytics, Boolean bool) {
            this.f5461a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = cardHeight;
            this.f = tealiumAnalytics;
            this.g = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnActionableCard1)) {
                return false;
            }
            OnActionableCard1 onActionableCard1 = (OnActionableCard1) obj;
            return Intrinsics.c(this.f5461a, onActionableCard1.f5461a) && Intrinsics.c(this.b, onActionableCard1.b) && Intrinsics.c(this.c, onActionableCard1.c) && Intrinsics.c(this.d, onActionableCard1.d) && this.e == onActionableCard1.e && Intrinsics.c(this.f, onActionableCard1.f) && Intrinsics.c(this.g, onActionableCard1.g);
        }

        public final int hashCode() {
            int iB = d.b(this.e, b.c(b.c(b.c(this.f5461a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
            TealiumAnalytics tealiumAnalytics = this.f;
            int iHashCode = (iB + (tealiumAnalytics == null ? 0 : tealiumAnalytics.hashCode())) * 31;
            Boolean bool = this.g;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnActionableCard1(__typename=", this.f5461a, ", link=", this.b, ", image=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", altText=", this.d, ", cardHeight=");
            sbV.append(this.e);
            sbV.append(", analytics=");
            sbV.append(this.f);
            sbV.append(", _excluded=");
            return au.com.woolworths.android.onesite.a.o(sbV, this.g, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnAdobeTargetAnalytics;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAdobeTargetAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f5462a;
        public final String b;

        public OnAdobeTargetAnalytics(String str, String str2) {
            this.f5462a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnAdobeTargetAnalytics)) {
                return false;
            }
            OnAdobeTargetAnalytics onAdobeTargetAnalytics = (OnAdobeTargetAnalytics) obj;
            return Intrinsics.c(this.f5462a, onAdobeTargetAnalytics.f5462a) && Intrinsics.c(this.b, onAdobeTargetAnalytics.b);
        }

        public final int hashCode() {
            String str = this.f5462a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return YU.a.j("OnAdobeTargetAnalytics(tnta=", this.f5462a, ", pe=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnEdrOfferBanner;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnEdrOfferBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f5463a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final BannerButtonAction h;
        public final BannerButtonLabel i;
        public final BannerAction j;
        public final BannerAnalytics k;
        public final BannerImpressionAnalytics l;
        public final CommonAnalytics m;

        public OnEdrOfferBanner(String str, String str2, String str3, String str4, String str5, String str6, String str7, BannerButtonAction bannerButtonAction, BannerButtonLabel bannerButtonLabel, BannerAction bannerAction, BannerAnalytics bannerAnalytics, BannerImpressionAnalytics bannerImpressionAnalytics, CommonAnalytics commonAnalytics) {
            this.f5463a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
            this.h = bannerButtonAction;
            this.i = bannerButtonLabel;
            this.j = bannerAction;
            this.k = bannerAnalytics;
            this.l = bannerImpressionAnalytics;
            this.m = commonAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnEdrOfferBanner)) {
                return false;
            }
            OnEdrOfferBanner onEdrOfferBanner = (OnEdrOfferBanner) obj;
            return Intrinsics.c(this.f5463a, onEdrOfferBanner.f5463a) && Intrinsics.c(this.b, onEdrOfferBanner.b) && Intrinsics.c(this.c, onEdrOfferBanner.c) && Intrinsics.c(this.d, onEdrOfferBanner.d) && Intrinsics.c(this.e, onEdrOfferBanner.e) && Intrinsics.c(this.f, onEdrOfferBanner.f) && Intrinsics.c(this.g, onEdrOfferBanner.g) && Intrinsics.c(this.h, onEdrOfferBanner.h) && Intrinsics.c(this.i, onEdrOfferBanner.i) && Intrinsics.c(this.j, onEdrOfferBanner.j) && Intrinsics.c(this.k, onEdrOfferBanner.k) && Intrinsics.c(this.l, onEdrOfferBanner.l) && Intrinsics.c(this.m, onEdrOfferBanner.m);
        }

        public final int hashCode() {
            int iC = b.c(this.f5463a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iC2 = b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d);
            String str2 = this.e;
            int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.g;
            int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            BannerButtonAction bannerButtonAction = this.h;
            int iHashCode4 = (iHashCode3 + (bannerButtonAction == null ? 0 : bannerButtonAction.hashCode())) * 31;
            BannerButtonLabel bannerButtonLabel = this.i;
            int iHashCode5 = (iHashCode4 + (bannerButtonLabel == null ? 0 : bannerButtonLabel.hashCode())) * 31;
            BannerAction bannerAction = this.j;
            int iHashCode6 = (iHashCode5 + (bannerAction == null ? 0 : bannerAction.hashCode())) * 31;
            BannerAnalytics bannerAnalytics = this.k;
            int iHashCode7 = (iHashCode6 + (bannerAnalytics == null ? 0 : bannerAnalytics.hashCode())) * 31;
            BannerImpressionAnalytics bannerImpressionAnalytics = this.l;
            int iHashCode8 = (iHashCode7 + (bannerImpressionAnalytics == null ? 0 : bannerImpressionAnalytics.hashCode())) * 31;
            CommonAnalytics commonAnalytics = this.m;
            return iHashCode8 + (commonAnalytics != null ? commonAnalytics.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnEdrOfferBanner(__typename=", this.f5463a, ", offerId=", this.b, ", offerIdV1=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", linkedEdrHashCrn=", this.d, ", bannerTitle=");
            androidx.constraintlayout.core.state.a.B(sbV, this.e, ", bannerDescription=", this.f, ", bannerIconUrl=");
            sbV.append(this.g);
            sbV.append(", bannerButtonAction=");
            sbV.append(this.h);
            sbV.append(", bannerButtonLabel=");
            sbV.append(this.i);
            sbV.append(", bannerAction=");
            sbV.append(this.j);
            sbV.append(", bannerAnalytics=");
            sbV.append(this.k);
            sbV.append(", bannerImpressionAnalytics=");
            sbV.append(this.l);
            sbV.append(", commonAnalytics=");
            sbV.append(this.m);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnGoogleAdBannerCard;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnGoogleAdBannerCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f5464a;
        public final String b;
        public final GoogleAdCustomTargeting c;
        public final String d;
        public final String e;

        public OnGoogleAdBannerCard(String str, String str2, GoogleAdCustomTargeting googleAdCustomTargeting, String str3, String str4) {
            this.f5464a = str;
            this.b = str2;
            this.c = googleAdCustomTargeting;
            this.d = str3;
            this.e = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnGoogleAdBannerCard)) {
                return false;
            }
            OnGoogleAdBannerCard onGoogleAdBannerCard = (OnGoogleAdBannerCard) obj;
            return Intrinsics.c(this.f5464a, onGoogleAdBannerCard.f5464a) && Intrinsics.c(this.b, onGoogleAdBannerCard.b) && Intrinsics.c(this.c, onGoogleAdBannerCard.c) && Intrinsics.c(this.d, onGoogleAdBannerCard.d) && Intrinsics.c(this.e, onGoogleAdBannerCard.e);
        }

        public final int hashCode() {
            int iC = b.c(this.f5464a.hashCode() * 31, 31, this.b);
            GoogleAdCustomTargeting googleAdCustomTargeting = this.c;
            int iHashCode = (iC + (googleAdCustomTargeting == null ? 0 : googleAdCustomTargeting.hashCode())) * 31;
            String str = this.d;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnGoogleAdBannerCard(adUnit=", this.f5464a, ", nativeCustomTemplateId=", this.b, ", targeting=");
            sbV.append(this.c);
            sbV.append(", iabSize=");
            sbV.append(this.d);
            sbV.append(", correlator=");
            return YU.a.o(sbV, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnHorizontalList;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHorizontalList {

        /* renamed from: a, reason: collision with root package name */
        public final String f5465a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final ArrayList f;

        public OnHorizontalList(String str, String str2, String str3, String str4, String str5, ArrayList arrayList) {
            this.f5465a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnHorizontalList)) {
                return false;
            }
            OnHorizontalList onHorizontalList = (OnHorizontalList) obj;
            return this.f5465a.equals(onHorizontalList.f5465a) && this.b.equals(onHorizontalList.b) && Intrinsics.c(this.c, onHorizontalList.c) && Intrinsics.c(this.d, onHorizontalList.d) && Intrinsics.c(this.e, onHorizontalList.e) && this.f.equals(onHorizontalList.f);
        }

        public final int hashCode() {
            int iC = b.c(this.f5465a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            return this.f.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnHorizontalList(__typename=", this.f5465a, ", title=", this.b, ", subtitle=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", actionTitle=", this.d, ", deepLink=");
            sbV.append(this.e);
            sbV.append(", items=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnHorizontalList1;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHorizontalList1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f5466a;
        public final ArrayList b;

        public OnHorizontalList1(String str, ArrayList arrayList) {
            this.f5466a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnHorizontalList1)) {
                return false;
            }
            OnHorizontalList1 onHorizontalList1 = (OnHorizontalList1) obj;
            return this.f5466a.equals(onHorizontalList1.f5466a) && this.b.equals(onHorizontalList1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5466a.hashCode() * 31);
        }

        public final String toString() {
            return d.q("OnHorizontalList1(title=", this.f5466a, ", items=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnInsetBanner;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnInsetBanner {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f5467a;
        public final String b;
        public final String c;
        public final String d;
        public final Action e;

        public OnInsetBanner(InsetBannerDisplayType insetBannerDisplayType, String str, String str2, String str3, Action action) {
            this.f5467a = insetBannerDisplayType;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnInsetBanner)) {
                return false;
            }
            OnInsetBanner onInsetBanner = (OnInsetBanner) obj;
            return this.f5467a == onInsetBanner.f5467a && Intrinsics.c(this.b, onInsetBanner.b) && Intrinsics.c(this.c, onInsetBanner.c) && Intrinsics.c(this.d, onInsetBanner.d) && Intrinsics.c(this.e, onInsetBanner.e);
        }

        public final int hashCode() {
            int iC = b.c(this.f5467a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Action action = this.e;
            return iHashCode2 + (action != null ? action.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbU = d.u("OnInsetBanner(displayType=", this.f5467a, ", message=", this.b, ", bannerTitle=");
            androidx.constraintlayout.core.state.a.B(sbU, this.c, ", iconUrl=", this.d, ", action=");
            sbU.append(this.e);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnMerchCard;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMerchCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f5468a;
        public final MerchCardGridImageWithAlt b;
        public final MerchCardListImageWithAlt c;
        public final String d;
        public final String e;
        public final MerchCardButton f;
        public final MerchCardAction g;
        public final MerchCardAnalytics h;
        public final MerchCardImpressionAnalytics i;

        public OnMerchCard(String str, MerchCardGridImageWithAlt merchCardGridImageWithAlt, MerchCardListImageWithAlt merchCardListImageWithAlt, String str2, String str3, MerchCardButton merchCardButton, MerchCardAction merchCardAction, MerchCardAnalytics merchCardAnalytics, MerchCardImpressionAnalytics merchCardImpressionAnalytics) {
            this.f5468a = str;
            this.b = merchCardGridImageWithAlt;
            this.c = merchCardListImageWithAlt;
            this.d = str2;
            this.e = str3;
            this.f = merchCardButton;
            this.g = merchCardAction;
            this.h = merchCardAnalytics;
            this.i = merchCardImpressionAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMerchCard)) {
                return false;
            }
            OnMerchCard onMerchCard = (OnMerchCard) obj;
            return Intrinsics.c(this.f5468a, onMerchCard.f5468a) && Intrinsics.c(this.b, onMerchCard.b) && Intrinsics.c(this.c, onMerchCard.c) && Intrinsics.c(this.d, onMerchCard.d) && Intrinsics.c(this.e, onMerchCard.e) && Intrinsics.c(this.f, onMerchCard.f) && Intrinsics.c(this.g, onMerchCard.g) && Intrinsics.c(this.h, onMerchCard.h) && Intrinsics.c(this.i, onMerchCard.i);
        }

        public final int hashCode() {
            int iC = b.c((this.c.hashCode() + ((this.b.hashCode() + (this.f5468a.hashCode() * 31)) * 31)) * 31, 31, this.d);
            String str = this.e;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            MerchCardButton merchCardButton = this.f;
            int iHashCode2 = (iHashCode + (merchCardButton == null ? 0 : merchCardButton.hashCode())) * 31;
            MerchCardAction merchCardAction = this.g;
            int iHashCode3 = (iHashCode2 + (merchCardAction == null ? 0 : merchCardAction.hashCode())) * 31;
            MerchCardAnalytics merchCardAnalytics = this.h;
            int iHashCode4 = (iHashCode3 + (merchCardAnalytics == null ? 0 : merchCardAnalytics.hashCode())) * 31;
            MerchCardImpressionAnalytics merchCardImpressionAnalytics = this.i;
            return iHashCode4 + (merchCardImpressionAnalytics != null ? merchCardImpressionAnalytics.hashCode() : 0);
        }

        public final String toString() {
            return "OnMerchCard(__typename=" + this.f5468a + ", merchCardGridImageWithAlt=" + this.b + ", merchCardListImageWithAlt=" + this.c + ", merchCardTitle=" + this.d + ", merchCardDescription=" + this.e + ", merchCardButton=" + this.f + ", merchCardAction=" + this.g + ", merchCardAnalytics=" + this.h + ", merchCardImpressionAnalytics=" + this.i + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnMerchCardFullImage;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMerchCardFullImage {

        /* renamed from: a, reason: collision with root package name */
        public final String f5469a;
        public final MerchCardFullImageAction b;
        public final MerchCardFullImageBackgroundImageWithAlt c;
        public final MerchCardFullImageButton d;
        public final String e;
        public final String f;

        public OnMerchCardFullImage(String str, MerchCardFullImageAction merchCardFullImageAction, MerchCardFullImageBackgroundImageWithAlt merchCardFullImageBackgroundImageWithAlt, MerchCardFullImageButton merchCardFullImageButton, String str2, String str3) {
            this.f5469a = str;
            this.b = merchCardFullImageAction;
            this.c = merchCardFullImageBackgroundImageWithAlt;
            this.d = merchCardFullImageButton;
            this.e = str2;
            this.f = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMerchCardFullImage)) {
                return false;
            }
            OnMerchCardFullImage onMerchCardFullImage = (OnMerchCardFullImage) obj;
            return Intrinsics.c(this.f5469a, onMerchCardFullImage.f5469a) && Intrinsics.c(this.b, onMerchCardFullImage.b) && Intrinsics.c(this.c, onMerchCardFullImage.c) && Intrinsics.c(this.d, onMerchCardFullImage.d) && Intrinsics.c(this.e, onMerchCardFullImage.e) && Intrinsics.c(this.f, onMerchCardFullImage.f);
        }

        public final int hashCode() {
            int iHashCode = this.f5469a.hashCode() * 31;
            MerchCardFullImageAction merchCardFullImageAction = this.b;
            int iHashCode2 = (this.c.hashCode() + ((iHashCode + (merchCardFullImageAction == null ? 0 : merchCardFullImageAction.hashCode())) * 31)) * 31;
            MerchCardFullImageButton merchCardFullImageButton = this.d;
            int iHashCode3 = (iHashCode2 + (merchCardFullImageButton == null ? 0 : merchCardFullImageButton.hashCode())) * 31;
            String str = this.e;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnMerchCardFullImage(__typename=");
            sb.append(this.f5469a);
            sb.append(", merchCardFullImageAction=");
            sb.append(this.b);
            sb.append(", merchCardFullImageBackgroundImageWithAlt=");
            sb.append(this.c);
            sb.append(", merchCardFullImageButton=");
            sb.append(this.d);
            sb.append(", merchCardFullImageTitle=");
            return androidx.constraintlayout.core.state.a.l(sb, this.e, ", merchCardFullImageDescription=", this.f, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnPersonalisedProductsBanner;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPersonalisedProductsBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f5470a;
        public final String b;
        public final String c;
        public final String d;
        public final BannerImage e;
        public final List f;
        public final BannerAction1 g;
        public final BannerAnalytics1 h;
        public final BannerImpressionAnalytics1 i;

        public OnPersonalisedProductsBanner(String str, String str2, String str3, String str4, BannerImage bannerImage, List list, BannerAction1 bannerAction1, BannerAnalytics1 bannerAnalytics1, BannerImpressionAnalytics1 bannerImpressionAnalytics1) {
            this.f5470a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = bannerImage;
            this.f = list;
            this.g = bannerAction1;
            this.h = bannerAnalytics1;
            this.i = bannerImpressionAnalytics1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPersonalisedProductsBanner)) {
                return false;
            }
            OnPersonalisedProductsBanner onPersonalisedProductsBanner = (OnPersonalisedProductsBanner) obj;
            return Intrinsics.c(this.f5470a, onPersonalisedProductsBanner.f5470a) && Intrinsics.c(this.b, onPersonalisedProductsBanner.b) && Intrinsics.c(this.c, onPersonalisedProductsBanner.c) && Intrinsics.c(this.d, onPersonalisedProductsBanner.d) && Intrinsics.c(this.e, onPersonalisedProductsBanner.e) && Intrinsics.c(this.f, onPersonalisedProductsBanner.f) && Intrinsics.c(this.g, onPersonalisedProductsBanner.g) && Intrinsics.c(this.h, onPersonalisedProductsBanner.h) && Intrinsics.c(this.i, onPersonalisedProductsBanner.i);
        }

        public final int hashCode() {
            int iHashCode = this.f5470a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            BannerImage bannerImage = this.e;
            int iHashCode5 = (iHashCode4 + (bannerImage == null ? 0 : bannerImage.hashCode())) * 31;
            List list = this.f;
            int iHashCode6 = (iHashCode5 + (list == null ? 0 : list.hashCode())) * 31;
            BannerAction1 bannerAction1 = this.g;
            int iHashCode7 = (iHashCode6 + (bannerAction1 == null ? 0 : bannerAction1.hashCode())) * 31;
            BannerAnalytics1 bannerAnalytics1 = this.h;
            int iHashCode8 = (iHashCode7 + (bannerAnalytics1 == null ? 0 : bannerAnalytics1.hashCode())) * 31;
            BannerImpressionAnalytics1 bannerImpressionAnalytics1 = this.i;
            return iHashCode8 + (bannerImpressionAnalytics1 != null ? bannerImpressionAnalytics1.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnPersonalisedProductsBanner(__typename=", this.f5470a, ", bannerTitle=", this.b, ", bannerForegroundColour=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", bannerBackgroundColour=", this.d, ", bannerImage=");
            sbV.append(this.e);
            sbV.append(", products=");
            sbV.append(this.f);
            sbV.append(", bannerAction=");
            sbV.append(this.g);
            sbV.append(", bannerAnalytics=");
            sbV.append(this.h);
            sbV.append(", bannerImpressionAnalytics=");
            sbV.append(this.i);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnProductCard;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f5471a;
        public final ProductCard b;

        public OnProductCard(String str, ProductCard productCard) {
            this.f5471a = str;
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
            return Intrinsics.c(this.f5471a, onProductCard.f5471a) && Intrinsics.c(this.b, onProductCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5471a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OnProductCard(__typename=", this.f5471a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnProductCard1;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f5472a;
        public final ProductCard b;

        public OnProductCard1(String str, ProductCard productCard) {
            this.f5472a = str;
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
            return Intrinsics.c(this.f5472a, onProductCard1.f5472a) && Intrinsics.c(this.b, onProductCard1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5472a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OnProductCard1(__typename=", this.f5472a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnProductCard2;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f5473a;
        public final ProductCard b;

        public OnProductCard2(String str, ProductCard productCard) {
            this.f5473a = str;
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
            return Intrinsics.c(this.f5473a, onProductCard2.f5473a) && Intrinsics.c(this.b, onProductCard2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5473a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OnProductCard2(__typename=", this.f5473a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnProductListFullScreenError;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductListFullScreenError {

        /* renamed from: a, reason: collision with root package name */
        public final Analytics6 f5474a;
        public final ImpressionAnalytics b;
        public final String c;
        public final String d;
        public final String e;
        public final Cta f;

        public OnProductListFullScreenError(Analytics6 analytics6, ImpressionAnalytics impressionAnalytics, String str, String str2, String str3, Cta cta) {
            this.f5474a = analytics6;
            this.b = impressionAnalytics;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = cta;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductListFullScreenError)) {
                return false;
            }
            OnProductListFullScreenError onProductListFullScreenError = (OnProductListFullScreenError) obj;
            return Intrinsics.c(this.f5474a, onProductListFullScreenError.f5474a) && Intrinsics.c(this.b, onProductListFullScreenError.b) && Intrinsics.c(this.c, onProductListFullScreenError.c) && Intrinsics.c(this.d, onProductListFullScreenError.d) && Intrinsics.c(this.e, onProductListFullScreenError.e) && Intrinsics.c(this.f, onProductListFullScreenError.f);
        }

        public final int hashCode() {
            Analytics6 analytics6 = this.f5474a;
            int iHashCode = (analytics6 == null ? 0 : analytics6.hashCode()) * 31;
            ImpressionAnalytics impressionAnalytics = this.b;
            int iHashCode2 = (iHashCode + (impressionAnalytics == null ? 0 : impressionAnalytics.hashCode())) * 31;
            String str = this.c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.e;
            int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Cta cta = this.f;
            return iHashCode5 + (cta != null ? cta.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnProductListFullScreenError(analytics=");
            sb.append(this.f5474a);
            sb.append(", impressionAnalytics=");
            sb.append(this.b);
            sb.append(", image=");
            androidx.constraintlayout.core.state.a.B(sb, this.c, ", title=", this.d, ", description=");
            sb.append(this.e);
            sb.append(", cta=");
            sb.append(this.f);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnProductListZeroResult;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductListZeroResult {

        /* renamed from: a, reason: collision with root package name */
        public final String f5475a;
        public final String b;
        public final ArrayList c;

        public OnProductListZeroResult(String str, String str2, ArrayList arrayList) {
            this.f5475a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductListZeroResult)) {
                return false;
            }
            OnProductListZeroResult onProductListZeroResult = (OnProductListZeroResult) obj;
            return Intrinsics.c(this.f5475a, onProductListZeroResult.f5475a) && Intrinsics.c(this.b, onProductListZeroResult.b) && this.c.equals(onProductListZeroResult.c);
        }

        public final int hashCode() {
            String str = this.f5475a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", YU.a.v("OnProductListZeroResult(title=", this.f5475a, ", message=", this.b, ", items="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnUniversalInventoryContainer;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnUniversalInventoryContainer {

        /* renamed from: a, reason: collision with root package name */
        public final GoogleAdBannerCard f5476a;
        public final NextBestAction b;

        public OnUniversalInventoryContainer(GoogleAdBannerCard googleAdBannerCard, NextBestAction nextBestAction) {
            this.f5476a = googleAdBannerCard;
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
            return Intrinsics.c(this.f5476a, onUniversalInventoryContainer.f5476a) && Intrinsics.c(this.b, onUniversalInventoryContainer.b);
        }

        public final int hashCode() {
            GoogleAdBannerCard googleAdBannerCard = this.f5476a;
            int iHashCode = (googleAdBannerCard == null ? 0 : googleAdBannerCard.hashCode()) * 31;
            NextBestAction nextBestAction = this.b;
            return iHashCode + (nextBestAction != null ? nextBestAction.hashCode() : 0);
        }

        public final String toString() {
            return "OnUniversalInventoryContainer(googleAdBannerCard=" + this.f5476a + ", nextBestAction=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnVideoAdUnit;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnVideoAdUnit {

        /* renamed from: a, reason: collision with root package name */
        public final String f5477a;
        public final VideoAdUnitVideoAd b;
        public final VideoAdUnitProductCard c;

        public OnVideoAdUnit(String str, VideoAdUnitVideoAd videoAdUnitVideoAd, VideoAdUnitProductCard videoAdUnitProductCard) {
            this.f5477a = str;
            this.b = videoAdUnitVideoAd;
            this.c = videoAdUnitProductCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnVideoAdUnit)) {
                return false;
            }
            OnVideoAdUnit onVideoAdUnit = (OnVideoAdUnit) obj;
            return Intrinsics.c(this.f5477a, onVideoAdUnit.f5477a) && Intrinsics.c(this.b, onVideoAdUnit.b) && Intrinsics.c(this.c, onVideoAdUnit.c);
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.f5477a.hashCode() * 31)) * 31;
            VideoAdUnitProductCard videoAdUnitProductCard = this.c;
            return iHashCode + (videoAdUnitProductCard == null ? 0 : videoAdUnitProductCard.hashCode());
        }

        public final String toString() {
            return "OnVideoAdUnit(__typename=" + this.f5477a + ", videoAdUnitVideoAd=" + this.b + ", videoAdUnitProductCard=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$OnZeroResultProductCategories;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnZeroResultProductCategories {

        /* renamed from: a, reason: collision with root package name */
        public final String f5478a;
        public final ArrayList b;

        public OnZeroResultProductCategories(String str, ArrayList arrayList) {
            this.f5478a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnZeroResultProductCategories)) {
                return false;
            }
            OnZeroResultProductCategories onZeroResultProductCategories = (OnZeroResultProductCategories) obj;
            return Intrinsics.c(this.f5478a, onZeroResultProductCategories.f5478a) && this.b.equals(onZeroResultProductCategories.b);
        }

        public final int hashCode() {
            String str = this.f5478a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return d.q("OnZeroResultProductCategories(zeroResultProductCategoriesTitle=", this.f5478a, ", zeroResultProductCategoriesItems=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$PrimaryCta;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrimaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f5479a;

        public PrimaryCta(String str) {
            this.f5479a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PrimaryCta) && Intrinsics.c(this.f5479a, ((PrimaryCta) obj).f5479a);
        }

        public final int hashCode() {
            return this.f5479a.hashCode();
        }

        public final String toString() {
            return YU.a.h("PrimaryCta(label=", this.f5479a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Product;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Product {

        /* renamed from: a, reason: collision with root package name */
        public final String f5480a;
        public final String b;
        public final String c;
        public final String d;

        public Product(String str, String str2, String str3, String str4) {
            this.f5480a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return Intrinsics.c(this.f5480a, product.f5480a) && Intrinsics.c(this.b, product.b) && Intrinsics.c(this.c, product.c) && Intrinsics.c(this.d, product.d);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f5480a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(YU.a.v("Product(__typename=", this.f5480a, ", productId=", this.b, ", name="), this.c, ", productImage=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$ProductCategoryTileAction;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductCategoryTileAction {

        /* renamed from: a, reason: collision with root package name */
        public final ActionType f5481a;
        public final String b;
        public final String c;

        public ProductCategoryTileAction(ActionType actionType, String str, String str2) {
            this.f5481a = actionType;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductCategoryTileAction)) {
                return false;
            }
            ProductCategoryTileAction productCategoryTileAction = (ProductCategoryTileAction) obj;
            return this.f5481a == productCategoryTileAction.f5481a && Intrinsics.c(this.b, productCategoryTileAction.b) && Intrinsics.c(this.c, productCategoryTileAction.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f5481a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return YU.a.o(d.s("ProductCategoryTileAction(type=", this.f5481a, ", action=", this.b, ", id="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$ProductList;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductList {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f5482a;
        public final Integer b;
        public final String c;
        public final List d;
        public final ArrayList e;
        public final ArrayList f;
        public final ArrayList g;
        public final SortOptionsBanner h;
        public final MarketplaceFilterSwitch i;
        public final MarketplaceInfo j;
        public final MarketplaceBottomSheet k;
        public final List l;
        public final List m;
        public final ZeroResult n;

        public ProductList(Integer num, Integer num2, String str, List list, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, SortOptionsBanner sortOptionsBanner, MarketplaceFilterSwitch marketplaceFilterSwitch, MarketplaceInfo marketplaceInfo, MarketplaceBottomSheet marketplaceBottomSheet, List list2, List list3, ZeroResult zeroResult) {
            this.f5482a = num;
            this.b = num2;
            this.c = str;
            this.d = list;
            this.e = arrayList;
            this.f = arrayList2;
            this.g = arrayList3;
            this.h = sortOptionsBanner;
            this.i = marketplaceFilterSwitch;
            this.j = marketplaceInfo;
            this.k = marketplaceBottomSheet;
            this.l = list2;
            this.m = list3;
            this.n = zeroResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductList)) {
                return false;
            }
            ProductList productList = (ProductList) obj;
            return Intrinsics.c(this.f5482a, productList.f5482a) && Intrinsics.c(this.b, productList.b) && Intrinsics.c(this.c, productList.c) && Intrinsics.c(this.d, productList.d) && this.e.equals(productList.e) && this.f.equals(productList.f) && this.g.equals(productList.g) && Intrinsics.c(this.h, productList.h) && Intrinsics.c(this.i, productList.i) && Intrinsics.c(this.j, productList.j) && Intrinsics.c(this.k, productList.k) && Intrinsics.c(this.l, productList.l) && Intrinsics.c(this.m, productList.m) && Intrinsics.c(this.n, productList.n);
        }

        public final int hashCode() {
            Integer num = this.f5482a;
            int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
            Integer num2 = this.b;
            int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
            String str = this.c;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            List list = this.d;
            int iB = androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b((iHashCode3 + (list == null ? 0 : list.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
            SortOptionsBanner sortOptionsBanner = this.h;
            int iHashCode4 = (iB + (sortOptionsBanner == null ? 0 : sortOptionsBanner.hashCode())) * 31;
            MarketplaceFilterSwitch marketplaceFilterSwitch = this.i;
            int iHashCode5 = (iHashCode4 + (marketplaceFilterSwitch == null ? 0 : marketplaceFilterSwitch.hashCode())) * 31;
            MarketplaceInfo marketplaceInfo = this.j;
            int iHashCode6 = (iHashCode5 + (marketplaceInfo == null ? 0 : marketplaceInfo.hashCode())) * 31;
            MarketplaceBottomSheet marketplaceBottomSheet = this.k;
            int iHashCode7 = (iHashCode6 + (marketplaceBottomSheet == null ? 0 : marketplaceBottomSheet.hashCode())) * 31;
            List list2 = this.l;
            int iHashCode8 = (iHashCode7 + (list2 == null ? 0 : list2.hashCode())) * 31;
            List list3 = this.m;
            int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
            ZeroResult zeroResult = this.n;
            return iHashCode9 + (zeroResult != null ? zeroResult.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = d.v("ProductList(totalNumberOfProducts=", this.f5482a, ", nextPage=", this.b, ", pageTitle=");
            au.com.woolworths.android.onesite.a.B(sbV, this.c, ", analytics=", this.d, ", productsFeed=");
            sbV.append(this.e);
            sbV.append(", filters=");
            sbV.append(this.f);
            sbV.append(", sortOptions=");
            sbV.append(this.g);
            sbV.append(", sortOptionsBanner=");
            sbV.append(this.h);
            sbV.append(", marketplaceFilterSwitch=");
            sbV.append(this.i);
            sbV.append(", marketplaceInfo=");
            sbV.append(this.j);
            sbV.append(", marketplaceBottomSheet=");
            sbV.append(this.k);
            sbV.append(", chips=");
            sbV.append(this.l);
            sbV.append(", facetChips=");
            sbV.append(this.m);
            sbV.append(", zeroResult=");
            sbV.append(this.n);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$ProductsFeed;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductsFeed {

        /* renamed from: a, reason: collision with root package name */
        public final String f5483a;
        public final OnActionableCard b;
        public final OnGoogleAdBannerCard c;
        public final OnUniversalInventoryContainer d;
        public final OnHorizontalList e;
        public final OnVideoAdUnit f;
        public final OnMerchCard g;
        public final OnInsetBanner h;
        public final OnProductCard1 i;

        public ProductsFeed(String __typename, OnActionableCard onActionableCard, OnGoogleAdBannerCard onGoogleAdBannerCard, OnUniversalInventoryContainer onUniversalInventoryContainer, OnHorizontalList onHorizontalList, OnVideoAdUnit onVideoAdUnit, OnMerchCard onMerchCard, OnInsetBanner onInsetBanner, OnProductCard1 onProductCard1) {
            Intrinsics.h(__typename, "__typename");
            this.f5483a = __typename;
            this.b = onActionableCard;
            this.c = onGoogleAdBannerCard;
            this.d = onUniversalInventoryContainer;
            this.e = onHorizontalList;
            this.f = onVideoAdUnit;
            this.g = onMerchCard;
            this.h = onInsetBanner;
            this.i = onProductCard1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductsFeed)) {
                return false;
            }
            ProductsFeed productsFeed = (ProductsFeed) obj;
            return Intrinsics.c(this.f5483a, productsFeed.f5483a) && Intrinsics.c(this.b, productsFeed.b) && Intrinsics.c(this.c, productsFeed.c) && Intrinsics.c(this.d, productsFeed.d) && Intrinsics.c(this.e, productsFeed.e) && Intrinsics.c(this.f, productsFeed.f) && Intrinsics.c(this.g, productsFeed.g) && Intrinsics.c(this.h, productsFeed.h) && Intrinsics.c(this.i, productsFeed.i);
        }

        public final int hashCode() {
            int iHashCode = this.f5483a.hashCode() * 31;
            OnActionableCard onActionableCard = this.b;
            int iHashCode2 = (iHashCode + (onActionableCard == null ? 0 : onActionableCard.hashCode())) * 31;
            OnGoogleAdBannerCard onGoogleAdBannerCard = this.c;
            int iHashCode3 = (iHashCode2 + (onGoogleAdBannerCard == null ? 0 : onGoogleAdBannerCard.hashCode())) * 31;
            OnUniversalInventoryContainer onUniversalInventoryContainer = this.d;
            int iHashCode4 = (iHashCode3 + (onUniversalInventoryContainer == null ? 0 : onUniversalInventoryContainer.hashCode())) * 31;
            OnHorizontalList onHorizontalList = this.e;
            int iHashCode5 = (iHashCode4 + (onHorizontalList == null ? 0 : onHorizontalList.hashCode())) * 31;
            OnVideoAdUnit onVideoAdUnit = this.f;
            int iHashCode6 = (iHashCode5 + (onVideoAdUnit == null ? 0 : onVideoAdUnit.hashCode())) * 31;
            OnMerchCard onMerchCard = this.g;
            int iHashCode7 = (iHashCode6 + (onMerchCard == null ? 0 : onMerchCard.hashCode())) * 31;
            OnInsetBanner onInsetBanner = this.h;
            int iHashCode8 = (iHashCode7 + (onInsetBanner == null ? 0 : onInsetBanner.hashCode())) * 31;
            OnProductCard1 onProductCard1 = this.i;
            return iHashCode8 + (onProductCard1 != null ? onProductCard1.hashCode() : 0);
        }

        public final String toString() {
            return "ProductsFeed(__typename=" + this.f5483a + ", onActionableCard=" + this.b + ", onGoogleAdBannerCard=" + this.c + ", onUniversalInventoryContainer=" + this.d + ", onHorizontalList=" + this.e + ", onVideoAdUnit=" + this.f + ", onMerchCard=" + this.g + ", onInsetBanner=" + this.h + ", onProductCard=" + this.i + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$SecondaryCta;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SecondaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f5484a;

        public SecondaryCta(String str) {
            this.f5484a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SecondaryCta) && Intrinsics.c(this.f5484a, ((SecondaryCta) obj).f5484a);
        }

        public final int hashCode() {
            return this.f5484a.hashCode();
        }

        public final String toString() {
            return YU.a.h("SecondaryCta(label=", this.f5484a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$SortOption;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SortOption {

        /* renamed from: a, reason: collision with root package name */
        public final String f5485a;
        public final String b;
        public final String c;
        public final boolean d;

        public SortOption(String str, String str2, String str3, boolean z) {
            this.f5485a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SortOption)) {
                return false;
            }
            SortOption sortOption = (SortOption) obj;
            return Intrinsics.c(this.f5485a, sortOption.f5485a) && Intrinsics.c(this.b, sortOption.b) && Intrinsics.c(this.c, sortOption.c) && this.d == sortOption.d;
        }

        public final int hashCode() {
            int iC = b.c(this.f5485a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return Boolean.hashCode(this.d) + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return d.r(this.c, ", isApplied=", ")", YU.a.v("SortOption(key=", this.f5485a, ", title=", this.b, ", subtitle="), this.d);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$SortOptionsBanner;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SortOptionsBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f5486a;
        public final InsetBanner b;

        public SortOptionsBanner(String str, InsetBanner insetBanner) {
            this.f5486a = str;
            this.b = insetBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SortOptionsBanner)) {
                return false;
            }
            SortOptionsBanner sortOptionsBanner = (SortOptionsBanner) obj;
            return Intrinsics.c(this.f5486a, sortOptionsBanner.f5486a) && Intrinsics.c(this.b, sortOptionsBanner.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5486a.hashCode() * 31);
        }

        public final String toString() {
            return "SortOptionsBanner(__typename=" + this.f5486a + ", insetBanner=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$TermsAndConditions;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TermsAndConditions {

        /* renamed from: a, reason: collision with root package name */
        public final String f5487a;
        public final VideoAdBottomSheet b;

        public TermsAndConditions(String str, VideoAdBottomSheet videoAdBottomSheet) {
            this.f5487a = str;
            this.b = videoAdBottomSheet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TermsAndConditions)) {
                return false;
            }
            TermsAndConditions termsAndConditions = (TermsAndConditions) obj;
            return Intrinsics.c(this.f5487a, termsAndConditions.f5487a) && Intrinsics.c(this.b, termsAndConditions.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5487a.hashCode() * 31);
        }

        public final String toString() {
            return "TermsAndConditions(__typename=" + this.f5487a + ", videoAdBottomSheet=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Text;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Text {

        /* renamed from: a, reason: collision with root package name */
        public final String f5488a;
        public final String b;

        public Text(String str, String str2) {
            this.f5488a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Text)) {
                return false;
            }
            Text text = (Text) obj;
            return Intrinsics.c(this.f5488a, text.f5488a) && Intrinsics.c(this.b, text.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5488a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("Text(text=", this.f5488a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Text1;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Text1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f5489a;
        public final String b;

        public Text1(String str, String str2) {
            this.f5489a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Text1)) {
                return false;
            }
            Text1 text1 = (Text1) obj;
            return Intrinsics.c(this.f5489a, text1.f5489a) && Intrinsics.c(this.b, text1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5489a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("Text1(text=", this.f5489a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$Transcript;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Transcript {

        /* renamed from: a, reason: collision with root package name */
        public final String f5490a;
        public final VideoAdBottomSheet b;

        public Transcript(String str, VideoAdBottomSheet videoAdBottomSheet) {
            this.f5490a = str;
            this.b = videoAdBottomSheet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Transcript)) {
                return false;
            }
            Transcript transcript = (Transcript) obj;
            return Intrinsics.c(this.f5490a, transcript.f5490a) && Intrinsics.c(this.b, transcript.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5490a.hashCode() * 31);
        }

        public final String toString() {
            return "Transcript(__typename=" + this.f5490a + ", videoAdBottomSheet=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$VideoAdUnitProductCard;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VideoAdUnitProductCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f5491a;
        public final ProductCard b;

        public VideoAdUnitProductCard(String str, ProductCard productCard) {
            this.f5491a = str;
            this.b = productCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VideoAdUnitProductCard)) {
                return false;
            }
            VideoAdUnitProductCard videoAdUnitProductCard = (VideoAdUnitProductCard) obj;
            return Intrinsics.c(this.f5491a, videoAdUnitProductCard.f5491a) && Intrinsics.c(this.b, videoAdUnitProductCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5491a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("VideoAdUnitProductCard(__typename=", this.f5491a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$VideoAdUnitVideoAd;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VideoAdUnitVideoAd {

        /* renamed from: a, reason: collision with root package name */
        public final String f5492a;
        public final String b;
        public final FallbackImage c;
        public final int d;
        public final Transcript e;
        public final TermsAndConditions f;
        public final Analytics3 g;
        public final EventAnalytics h;

        public VideoAdUnitVideoAd(String str, String str2, FallbackImage fallbackImage, int i, Transcript transcript, TermsAndConditions termsAndConditions, Analytics3 analytics3, EventAnalytics eventAnalytics) {
            this.f5492a = str;
            this.b = str2;
            this.c = fallbackImage;
            this.d = i;
            this.e = transcript;
            this.f = termsAndConditions;
            this.g = analytics3;
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
            return Intrinsics.c(this.f5492a, videoAdUnitVideoAd.f5492a) && Intrinsics.c(this.b, videoAdUnitVideoAd.b) && Intrinsics.c(this.c, videoAdUnitVideoAd.c) && this.d == videoAdUnitVideoAd.d && Intrinsics.c(this.e, videoAdUnitVideoAd.e) && Intrinsics.c(this.f, videoAdUnitVideoAd.f) && Intrinsics.c(this.g, videoAdUnitVideoAd.g) && Intrinsics.c(this.h, videoAdUnitVideoAd.h);
        }

        public final int hashCode() {
            int iC = b.c(this.f5492a.hashCode() * 31, 31, this.b);
            FallbackImage fallbackImage = this.c;
            int iA = b.a(this.d, (iC + (fallbackImage == null ? 0 : fallbackImage.hashCode())) * 31, 31);
            Transcript transcript = this.e;
            int iHashCode = (iA + (transcript == null ? 0 : transcript.hashCode())) * 31;
            TermsAndConditions termsAndConditions = this.f;
            int iHashCode2 = (iHashCode + (termsAndConditions == null ? 0 : termsAndConditions.hashCode())) * 31;
            Analytics3 analytics3 = this.g;
            int iHashCode3 = (iHashCode2 + (analytics3 == null ? 0 : analytics3.hashCode())) * 31;
            EventAnalytics eventAnalytics = this.h;
            return iHashCode3 + (eventAnalytics != null ? eventAnalytics.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("VideoAdUnitVideoAd(__typename=", this.f5492a, ", url=", this.b, ", fallbackImage=");
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$VideoErrorImpression;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VideoErrorImpression {

        /* renamed from: a, reason: collision with root package name */
        public final String f5493a;
        public final AnalyticsFields b;

        public VideoErrorImpression(String str, AnalyticsFields analyticsFields) {
            this.f5493a = str;
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
            return Intrinsics.c(this.f5493a, videoErrorImpression.f5493a) && Intrinsics.c(this.b, videoErrorImpression.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5493a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("VideoErrorImpression(__typename=", this.f5493a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$VideoPause;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VideoPause {

        /* renamed from: a, reason: collision with root package name */
        public final String f5494a;
        public final AnalyticsFields b;

        public VideoPause(String str, AnalyticsFields analyticsFields) {
            this.f5494a = str;
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
            return Intrinsics.c(this.f5494a, videoPause.f5494a) && Intrinsics.c(this.b, videoPause.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5494a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("VideoPause(__typename=", this.f5494a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$VideoPlay;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class VideoPlay {

        /* renamed from: a, reason: collision with root package name */
        public final String f5495a;
        public final AnalyticsFields b;

        public VideoPlay(String str, AnalyticsFields analyticsFields) {
            this.f5495a = str;
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
            return Intrinsics.c(this.f5495a, videoPlay.f5495a) && Intrinsics.c(this.b, videoPlay.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f5495a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("VideoPlay(__typename=", this.f5495a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$ZeroResult;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ZeroResult {

        /* renamed from: a, reason: collision with root package name */
        public final String f5496a;
        public final OnProductListZeroResult b;
        public final OnProductListFullScreenError c;

        public ZeroResult(String __typename, OnProductListZeroResult onProductListZeroResult, OnProductListFullScreenError onProductListFullScreenError) {
            Intrinsics.h(__typename, "__typename");
            this.f5496a = __typename;
            this.b = onProductListZeroResult;
            this.c = onProductListFullScreenError;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ZeroResult)) {
                return false;
            }
            ZeroResult zeroResult = (ZeroResult) obj;
            return Intrinsics.c(this.f5496a, zeroResult.f5496a) && Intrinsics.c(this.b, zeroResult.b) && Intrinsics.c(this.c, zeroResult.c);
        }

        public final int hashCode() {
            int iHashCode = this.f5496a.hashCode() * 31;
            OnProductListZeroResult onProductListZeroResult = this.b;
            int iHashCode2 = (iHashCode + (onProductListZeroResult == null ? 0 : onProductListZeroResult.hashCode())) * 31;
            OnProductListFullScreenError onProductListFullScreenError = this.c;
            return iHashCode2 + (onProductListFullScreenError != null ? onProductListFullScreenError.hashCode() : 0);
        }

        public final String toString() {
            return "ZeroResult(__typename=" + this.f5496a + ", onProductListZeroResult=" + this.b + ", onProductListFullScreenError=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/product/list/v2/ProductListQuery$ZeroResultProductCategoriesItem;", "", "product-list-v2_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ZeroResultProductCategoriesItem {

        /* renamed from: a, reason: collision with root package name */
        public final ProductCategoryTileAction f5497a;
        public final String b;
        public final String c;

        public ZeroResultProductCategoriesItem(ProductCategoryTileAction productCategoryTileAction, String str, String str2) {
            this.f5497a = productCategoryTileAction;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ZeroResultProductCategoriesItem)) {
                return false;
            }
            ZeroResultProductCategoriesItem zeroResultProductCategoriesItem = (ZeroResultProductCategoriesItem) obj;
            return Intrinsics.c(this.f5497a, zeroResultProductCategoriesItem.f5497a) && Intrinsics.c(this.b, zeroResultProductCategoriesItem.b) && Intrinsics.c(this.c, zeroResultProductCategoriesItem.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f5497a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ZeroResultProductCategoriesItem(productCategoryTileAction=");
            sb.append(this.f5497a);
            sb.append(", productCategoryTileImageUrl=");
            sb.append(this.b);
            sb.append(", productCategoryTileLabel=");
            return YU.a.o(sb, this.c, ")");
        }
    }

    public ProductListQuery(ProductListInput productListInput, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.f5403a = productListInput;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(ProductListQuery_ResponseAdapter.Data.f5553a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query productList($productListInput: ProductListInput!, $includeAvailabilityInfoStatus: Boolean!, $includeVideoAdUnit: Boolean!, $includeMerchCard: Boolean!, $includeHorizontalList: Boolean!, $includePricingFootnote: Boolean!, $includeNhpEdrBanner: Boolean!, $includeNhpPersonalisedProductsBanner: Boolean!, $includeLowestPrice14Days: Boolean!, $includeUniversalInventoryFallback: Boolean!, $includeProductAvailabilityStates: Boolean!, $includeOfferMinimumSpend: Boolean!) { productList(productListInput: $productListInput) { totalNumberOfProducts nextPage pageTitle analytics { __typename ... on AdobeTargetAnalytics { tnta pe } } productsFeed { __typename ... on ActionableCard { image altText cardHeight link analytics _excluded } ... on GoogleAdBannerCard @skip(if: $includeUniversalInventoryFallback) { adUnit nativeCustomTemplateId targeting iabSize correlator } ... on UniversalInventoryContainer @include(if: $includeUniversalInventoryFallback) { googleAdBannerCard { adUnit nativeCustomTemplateId iabSpec iabSize height targeting correlator _excluded } nextBestAction { __typename ... on ActionableCard { __typename link image altText cardHeight analytics _excluded } ... on EdrOfferBanner @include(if: $includeNhpEdrBanner) { __typename offerId offerIdV1 linkedEdrHashCrn bannerTitle bannerDescription bannerIconUrl bannerButtonAction { __typename type action analytics { __typename ...analyticsFields } id } bannerButtonLabel { __typename text altText } bannerAction { __typename type action analytics { __typename ...analyticsFields } id } bannerAnalytics { __typename ...analyticsFields } bannerImpressionAnalytics { __typename ...analyticsFields } commonAnalytics { __typename ...analyticsFields } } ... on PersonalisedProductsBanner @include(if: $includeNhpPersonalisedProductsBanner) { __typename bannerTitle bannerForegroundColour bannerBackgroundColour bannerImage { __typename imageUrl altText } products { __typename productId name productImage } bannerAction { __typename type action analytics { __typename ...analyticsFields } id } bannerAnalytics { __typename ...analyticsFields } bannerImpressionAnalytics { __typename ...analyticsFields } } } } ... on HorizontalList @include(if: $includeHorizontalList) { __typename title subtitle actionTitle deepLink items { __typename ... on ProductCard { __typename ...productCard } ... on MerchCardFullImage { __typename merchCardFullImageAction { __typename type action } merchCardFullImageBackgroundImageWithAlt { __typename imageUrl altText } merchCardFullImageButton { __typename buttonId label style enabled iconUrl altText buttonAction { __typename type action id } } merchCardFullImageTitle merchCardFullImageDescription } } } ... on VideoAdUnit @include(if: $includeVideoAdUnit) { __typename videoAdUnitVideoAd { __typename url fallbackImage { imageUrl altText } duration transcript { __typename ...videoAdBottomSheet } termsAndConditions { __typename ...videoAdBottomSheet } analytics { __typename ...analyticsFields } eventAnalytics { impression { __typename ...analyticsFields } videoPlay { __typename ...analyticsFields } videoPause { __typename ...analyticsFields } videoErrorImpression { __typename ...analyticsFields } } } videoAdUnitProductCard { __typename ...productCard } } ... on MerchCard @include(if: $includeMerchCard) { __typename merchCardGridImageWithAlt { __typename imageUrl altText } merchCardListImageWithAlt { __typename imageUrl altText } merchCardTitle merchCardDescription merchCardButton { __typename buttonId label style enabled iconUrl altText buttonAction { __typename type action id analytics { __typename ...analyticsFields } } } merchCardAction { __typename type action id analytics { __typename ...analyticsFields } } merchCardAnalytics { __typename ...analyticsFields } merchCardImpressionAnalytics { __typename ...analyticsFields } } ... on InsetBanner { displayType message bannerTitle: title iconUrl action { placement type label url } } ... on ProductCard { __typename ...productCard } } filters { headerKey headerTitle filterItems { key title label parentKey hasChildren isApplied } banner { displayType message iconUrl action { placement type label url } bannerTitle: title } } sortOptions { key title subtitle isApplied } sortOptionsBanner { __typename ...insetBanner } marketplaceFilterSwitch { title subtitle imageUrl buttonCta { label } value } marketplaceInfo { title items { title description imageUrl } footer { title subtitle linkUrl } } marketplaceBottomSheet { bottomSheetTitle bottomSheetBody primaryCta { label } secondaryCta { label } showOnceOnly } chips { id isSelected text { text altText } persistentId } facetChips { id isSelected text { text altText } } zeroResult { __typename ... on ProductListZeroResult { title message items { __typename ... on ZeroResultProductCategories { zeroResultProductCategoriesTitle zeroResultProductCategoriesItems { productCategoryTileAction { type action id } productCategoryTileImageUrl productCategoryTileLabel } } ... on HorizontalList { title items { __typename ... on ProductCard { __typename ...productCard } } } } } ... on ProductListFullScreenError { analytics { __typename ...analyticsFields } impressionAnalytics { __typename ...analyticsFields } image title description cta { linkId linkTextWithAlt { text altText } linkAction { action id type analytics { __typename ...analyticsFields } } } } } } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }  fragment videoAdBottomSheet on VideoAdBottomSheet { __typename contentMarkdown title buttonText accessibilityText impressionAnalytics { __typename ...analyticsFields } }  fragment insetBanner on InsetBanner { displayType message bannerTitle: title iconUrl action { placement type label url } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductListQuery)) {
            return false;
        }
        ProductListQuery productListQuery = (ProductListQuery) obj;
        return this.f5403a.equals(productListQuery.f5403a) && this.b == productListQuery.b && this.c == productListQuery.c && this.d == productListQuery.d && this.e == productListQuery.e && this.f == productListQuery.f && this.g == productListQuery.g && this.h == productListQuery.h && this.i == productListQuery.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + b.e(b.e(b.e(b.e(b.e(b.e(b.e(b.e(b.e(b.e(this.f5403a.hashCode() * 31, 31, false), 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, true);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "8a9df97dc96aea298a759a287ca830940535e23326b3cbbe4d2438f8b9151b37";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "productList";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("productListInput");
        Adapters.c(ProductListInput_InputAdapter.f12102a, false).toJson(jsonWriter, customScalarAdapters, this.f5403a);
        jsonWriter.F1("includeAvailabilityInfoStatus");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        jsonWriter.F1("includeVideoAdUnit");
        d.B(this.b, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeMerchCard");
        d.B(this.c, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeHorizontalList");
        d.B(this.d, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includePricingFootnote");
        d.B(this.e, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeNhpEdrBanner");
        d.B(this.f, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeNhpPersonalisedProductsBanner");
        d.B(this.g, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeLowestPrice14Days");
        d.B(this.h, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeUniversalInventoryFallback");
        d.B(this.i, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeProductAvailabilityStates");
        Boolean bool = Boolean.TRUE;
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, bool);
        jsonWriter.F1("includeOfferMinimumSpend");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, bool);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductListQuery(productListInput=");
        sb.append(this.f5403a);
        sb.append(", includeAvailabilityInfoStatus=false, includeVideoAdUnit=");
        sb.append(this.b);
        sb.append(", includeMerchCard=");
        au.com.woolworths.android.onesite.a.D(sb, this.c, ", includeHorizontalList=", this.d, ", includePricingFootnote=");
        au.com.woolworths.android.onesite.a.D(sb, this.e, ", includeNhpEdrBanner=", this.f, ", includeNhpPersonalisedProductsBanner=");
        au.com.woolworths.android.onesite.a.D(sb, this.g, ", includeLowestPrice14Days=", this.h, ", includeUniversalInventoryFallback=");
        return YU.a.k(", includeProductAvailabilityStates=true, includeOfferMinimumSpend=true)", sb, this.i);
    }
}
