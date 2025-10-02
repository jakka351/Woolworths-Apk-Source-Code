package com.woolworths.shop.product.details;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.analytics.graphql.TealiumAnalytics;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.graphql.common.fragment.ProductCard;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.sdui.shop.fragment.BasicCoreRow;
import au.com.woolworths.sdui.shop.fragment.CoreRowUI;
import au.com.woolworths.shop.graphql.type.ActionType;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.CardHeight;
import au.com.woolworths.shop.graphql.type.CoreAlertStyle;
import au.com.woolworths.shop.graphql.type.CoreBroadcastBannerStyle;
import au.com.woolworths.shop.graphql.type.CouponBannerColorTheme;
import au.com.woolworths.shop.graphql.type.ParagraphTextItemType;
import au.com.woolworths.shop.graphql.type.ProductDetailsPageInput;
import au.com.woolworths.shop.graphql.type.ProductRatingsAndReviewsPreviewInput;
import au.com.woolworths.shop.graphql.type.RoundelImagePriority;
import au.com.woolworths.shop.graphql.type.adapter.ProductDetailsPageInput_InputAdapter;
import au.com.woolworths.shop.graphql.type.adapter.ProductRatingsAndReviewsPreviewInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.product.details.adapter.ProductDetailsPageQuery_ResponseAdapter;
import com.woolworths.shop.productcard.data.fragment.ProductTile;
import fragment.RatingsAndReviewsPreviewCta;
import fragment.RatingsAndReviewsPreviewHeader;
import fragment.RatingsAndReviewsRatingsDetails;
import fragment.RatingsAndReviewsReviewDetails;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b_\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:^\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`¨\u0006a"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Data;", "Data", "ProductDetailsPage", "Analytics", "ImpressionAnalytics", "Item", "OnProductDetailsCouponBanner", "ProductDetailsCouponBanner", "CouponBannerTermsAndConditions", "OnActionableCard", "OnBasicCoreBroadcastBanner", "BroadcastBannerUI", "Icon", "OnHostedIcon", "BroadcastBannerAction", "Analytics1", "OnProductDetailsImages", "ProductImage", "ImageGalleryClickAnalytics", "ImageGalleryScrollAnalytics", "ImageGalleryCloseAnalytics", "ImageGalleryThumbnailClickAnalytics", "ProductDetailsThumbnailClickAnalytics", "RoundelImage", "OnBasicInsetAlert", "InsetAlertUI", "InsetAlertAction", "Analytics2", "OnProductDetailsProductPanel", "RatingsAndReviewsSummary", "OnProductRatingsAndReviewsSummary", "RatingText", "Cta", "CtaText", "Action", "Product", "OnProductCard", "OnProductOriginAndHealthInfo", "CountryOfOrigin", "OnProductDetailsRowAccordion", "OpenActionAnalytics", "CloseActionAnalytics", "RowUI", "LeadingAsset", "OnHostedIcon1", "OnCoreIcon", "ExpandedContent", "OnParagraphTextItem", "OnProductDetailsRowAccordionProductList", "ProductDetailsRowAccordionProductListTextItem", "OnParagraphTextItem1", "ProductDetailsRowAccordionProductListCta", "OnContentCta", "OnCtaClickAnalytics", "ProductDetailsRowAccordionProductList", "OnHorizontalList", "Item1", "OnProductCard1", "OnProductTile", "OnProductDetailsRowLink", "RowUI1", "LeadingAsset1", "OnHostedIcon2", "OnCoreIcon1", "LinkContent", "OnParagraphTextItem2", "OnProductNutritionInfo", "OnInfoSection", "Item2", "Footer", "OpenActionAnalytics1", "OnHorizontalList1", "Item3", "OnProductCard2", "OnProductTile1", "OnProductDetailsRatingsAndReviewsPreview", "RatingsAndReviewsPreview", "Section", "OnRatingsAndReviewsPreviewHeader", "OnRatingsAndReviewsRatingsDetails", "OnRatingsAndReviewsReviewDetails", "OnRatingsAndReviewsPreviewCta", "OnProductDetailsCoreRow", "RowDetails", "OnBasicCoreRow", "OnCoreRowUI", "OnChatEntryCardV3", "ChatEntryCardAction", "Analytics3", "Footer1", "FooterMessage", "ProductDetailsAction", "ButtonAction", "Analytics4", "Companion", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ProductDetailsPageQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final ProductDetailsPageInput f23408a;
    public final boolean b;
    public final boolean c;
    public final Optional d;
    public final boolean e;
    public final ProductRatingsAndReviewsPreviewInput f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final Optional j;
    public final Optional k;
    public final boolean l;
    public final boolean m;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Action;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: a, reason: collision with root package name */
        public final ActionType f23409a;
        public final String b;
        public final String c;

        public Action(ActionType actionType, String str, String str2) {
            this.f23409a = actionType;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return this.f23409a == action.f23409a && Intrinsics.c(this.b, action.b) && Intrinsics.c(this.c, action.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f23409a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(d.s("Action(type=", this.f23409a, ", action=", this.b, ", id="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Analytics;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f23410a;
        public final AnalyticsFields b;

        public Analytics(String str, AnalyticsFields analyticsFields) {
            this.f23410a = str;
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
            return Intrinsics.c(this.f23410a, analytics.f23410a) && Intrinsics.c(this.b, analytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23410a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics(__typename=", this.f23410a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Analytics1;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23411a;
        public final AnalyticsFields b;

        public Analytics1(String str, AnalyticsFields analyticsFields) {
            this.f23411a = str;
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
            return Intrinsics.c(this.f23411a, analytics1.f23411a) && Intrinsics.c(this.b, analytics1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23411a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics1(__typename=", this.f23411a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Analytics2;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23412a;
        public final AnalyticsFields b;

        public Analytics2(String str, AnalyticsFields analyticsFields) {
            this.f23412a = str;
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
            return Intrinsics.c(this.f23412a, analytics2.f23412a) && Intrinsics.c(this.b, analytics2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23412a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics2(__typename=", this.f23412a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Analytics3;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23413a;
        public final AnalyticsFields b;

        public Analytics3(String str, AnalyticsFields analyticsFields) {
            this.f23413a = str;
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
            return Intrinsics.c(this.f23413a, analytics3.f23413a) && Intrinsics.c(this.b, analytics3.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23413a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics3(__typename=", this.f23413a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Analytics4;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics4 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23414a;
        public final AnalyticsFields b;

        public Analytics4(String str, AnalyticsFields analyticsFields) {
            this.f23414a = str;
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
            return Intrinsics.c(this.f23414a, analytics4.f23414a) && Intrinsics.c(this.b, analytics4.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23414a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("Analytics4(__typename=", this.f23414a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$BroadcastBannerAction;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BroadcastBannerAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f23415a;
        public final ActionType b;
        public final String c;
        public final Analytics1 d;

        public BroadcastBannerAction(String str, ActionType actionType, String str2, Analytics1 analytics1) {
            this.f23415a = str;
            this.b = actionType;
            this.c = str2;
            this.d = analytics1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BroadcastBannerAction)) {
                return false;
            }
            BroadcastBannerAction broadcastBannerAction = (BroadcastBannerAction) obj;
            return Intrinsics.c(this.f23415a, broadcastBannerAction.f23415a) && this.b == broadcastBannerAction.b && Intrinsics.c(this.c, broadcastBannerAction.c) && Intrinsics.c(this.d, broadcastBannerAction.d);
        }

        public final int hashCode() {
            String str = this.f23415a;
            int iC = b.c(d.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.c);
            Analytics1 analytics1 = this.d;
            return iC + (analytics1 != null ? analytics1.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbW = d.w("BroadcastBannerAction(id=", this.f23415a, ", type=", this.b, ", action=");
            sbW.append(this.c);
            sbW.append(", analytics=");
            sbW.append(this.d);
            sbW.append(")");
            return sbW.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$BroadcastBannerUI;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BroadcastBannerUI {

        /* renamed from: a, reason: collision with root package name */
        public final String f23416a;
        public final String b;
        public final CoreBroadcastBannerStyle c;
        public final Icon d;

        public BroadcastBannerUI(String str, String str2, CoreBroadcastBannerStyle coreBroadcastBannerStyle, Icon icon) {
            this.f23416a = str;
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
            return Intrinsics.c(this.f23416a, broadcastBannerUI.f23416a) && Intrinsics.c(this.b, broadcastBannerUI.b) && this.c == broadcastBannerUI.c && Intrinsics.c(this.d, broadcastBannerUI.d);
        }

        public final int hashCode() {
            int iHashCode = this.f23416a.hashCode() * 31;
            String str = this.b;
            return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("BroadcastBannerUI(title=", this.f23416a, ", subtitle=", this.b, ", style=");
            sbV.append(this.c);
            sbV.append(", icon=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ButtonAction;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ButtonAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f23417a;
        public final String b;
        public final ActionType c;
        public final Analytics4 d;

        public ButtonAction(String str, String str2, ActionType actionType, Analytics4 analytics4) {
            this.f23417a = str;
            this.b = str2;
            this.c = actionType;
            this.d = analytics4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonAction)) {
                return false;
            }
            ButtonAction buttonAction = (ButtonAction) obj;
            return Intrinsics.c(this.f23417a, buttonAction.f23417a) && Intrinsics.c(this.b, buttonAction.b) && this.c == buttonAction.c && Intrinsics.c(this.d, buttonAction.d);
        }

        public final int hashCode() {
            String str = this.f23417a;
            int iA = d.a(this.c, b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31);
            Analytics4 analytics4 = this.d;
            return iA + (analytics4 != null ? analytics4.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("ButtonAction(id=", this.f23417a, ", action=", this.b, ", type=");
            sbV.append(this.c);
            sbV.append(", analytics=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ChatEntryCardAction;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ChatEntryCardAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f23418a;
        public final String b;
        public final ActionType c;
        public final Analytics3 d;

        public ChatEntryCardAction(String str, String str2, ActionType actionType, Analytics3 analytics3) {
            this.f23418a = str;
            this.b = str2;
            this.c = actionType;
            this.d = analytics3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChatEntryCardAction)) {
                return false;
            }
            ChatEntryCardAction chatEntryCardAction = (ChatEntryCardAction) obj;
            return Intrinsics.c(this.f23418a, chatEntryCardAction.f23418a) && Intrinsics.c(this.b, chatEntryCardAction.b) && this.c == chatEntryCardAction.c && Intrinsics.c(this.d, chatEntryCardAction.d);
        }

        public final int hashCode() {
            String str = this.f23418a;
            int iA = d.a(this.c, b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31);
            Analytics3 analytics3 = this.d;
            return iA + (analytics3 != null ? analytics3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("ChatEntryCardAction(id=", this.f23418a, ", action=", this.b, ", type=");
            sbV.append(this.c);
            sbV.append(", analytics=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$CloseActionAnalytics;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CloseActionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f23419a;
        public final AnalyticsFields b;

        public CloseActionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f23419a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CloseActionAnalytics)) {
                return false;
            }
            CloseActionAnalytics closeActionAnalytics = (CloseActionAnalytics) obj;
            return Intrinsics.c(this.f23419a, closeActionAnalytics.f23419a) && Intrinsics.c(this.b, closeActionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23419a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("CloseActionAnalytics(__typename=", this.f23419a, ", analyticsFields=", this.b, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$CountryOfOrigin;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CountryOfOrigin {

        /* renamed from: a, reason: collision with root package name */
        public final String f23420a;
        public final String b;
        public final String c;

        public CountryOfOrigin(String str, String str2, String str3) {
            this.f23420a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CountryOfOrigin)) {
                return false;
            }
            CountryOfOrigin countryOfOrigin = (CountryOfOrigin) obj;
            return Intrinsics.c(this.f23420a, countryOfOrigin.f23420a) && Intrinsics.c(this.b, countryOfOrigin.b) && Intrinsics.c(this.c, countryOfOrigin.c);
        }

        public final int hashCode() {
            String str = this.f23420a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return a.o(a.v("CountryOfOrigin(url=", this.f23420a, ", text=", this.b, ", altText="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$CouponBannerTermsAndConditions;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CouponBannerTermsAndConditions {

        /* renamed from: a, reason: collision with root package name */
        public final String f23421a;
        public final String b;
        public final String c;

        public CouponBannerTermsAndConditions(String str, String str2, String str3) {
            this.f23421a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CouponBannerTermsAndConditions)) {
                return false;
            }
            CouponBannerTermsAndConditions couponBannerTermsAndConditions = (CouponBannerTermsAndConditions) obj;
            return Intrinsics.c(this.f23421a, couponBannerTermsAndConditions.f23421a) && Intrinsics.c(this.b, couponBannerTermsAndConditions.b) && Intrinsics.c(this.c, couponBannerTermsAndConditions.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f23421a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.o(a.v("CouponBannerTermsAndConditions(url=", this.f23421a, ", title=", this.b, ", accessibilityLabel="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Cta;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cta {

        /* renamed from: a, reason: collision with root package name */
        public final CtaText f23422a;
        public final Action b;

        public Cta(CtaText ctaText, Action action) {
            this.f23422a = ctaText;
            this.b = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cta)) {
                return false;
            }
            Cta cta = (Cta) obj;
            return Intrinsics.c(this.f23422a, cta.f23422a) && Intrinsics.c(this.b, cta.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23422a.hashCode() * 31);
        }

        public final String toString() {
            return "Cta(ctaText=" + this.f23422a + ", action=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$CtaText;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CtaText {

        /* renamed from: a, reason: collision with root package name */
        public final String f23423a;
        public final String b;

        public CtaText(String str, String str2) {
            this.f23423a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CtaText)) {
                return false;
            }
            CtaText ctaText = (CtaText) obj;
            return Intrinsics.c(this.f23423a, ctaText.f23423a) && Intrinsics.c(this.b, ctaText.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23423a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("CtaText(text=", this.f23423a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ProductDetailsPage f23424a;

        public Data(ProductDetailsPage productDetailsPage) {
            this.f23424a = productDetailsPage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f23424a, ((Data) obj).f23424a);
        }

        public final int hashCode() {
            return this.f23424a.hashCode();
        }

        public final String toString() {
            return "Data(productDetailsPage=" + this.f23424a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ExpandedContent;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ExpandedContent {

        /* renamed from: a, reason: collision with root package name */
        public final String f23425a;
        public final OnParagraphTextItem b;
        public final OnProductDetailsRowAccordionProductList c;

        public ExpandedContent(String __typename, OnParagraphTextItem onParagraphTextItem, OnProductDetailsRowAccordionProductList onProductDetailsRowAccordionProductList) {
            Intrinsics.h(__typename, "__typename");
            this.f23425a = __typename;
            this.b = onParagraphTextItem;
            this.c = onProductDetailsRowAccordionProductList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ExpandedContent)) {
                return false;
            }
            ExpandedContent expandedContent = (ExpandedContent) obj;
            return Intrinsics.c(this.f23425a, expandedContent.f23425a) && Intrinsics.c(this.b, expandedContent.b) && Intrinsics.c(this.c, expandedContent.c);
        }

        public final int hashCode() {
            int iHashCode = this.f23425a.hashCode() * 31;
            OnParagraphTextItem onParagraphTextItem = this.b;
            int iHashCode2 = (iHashCode + (onParagraphTextItem == null ? 0 : onParagraphTextItem.hashCode())) * 31;
            OnProductDetailsRowAccordionProductList onProductDetailsRowAccordionProductList = this.c;
            return iHashCode2 + (onProductDetailsRowAccordionProductList != null ? onProductDetailsRowAccordionProductList.hashCode() : 0);
        }

        public final String toString() {
            return "ExpandedContent(__typename=" + this.f23425a + ", onParagraphTextItem=" + this.b + ", onProductDetailsRowAccordionProductList=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Footer;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Footer {

        /* renamed from: a, reason: collision with root package name */
        public final String f23426a;
        public final String b;
        public final String c;

        public Footer(String str, String str2, String str3) {
            this.f23426a = str;
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
            return Intrinsics.c(this.f23426a, footer.f23426a) && Intrinsics.c(this.b, footer.b) && Intrinsics.c(this.c, footer.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f23426a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("Footer(title=", this.f23426a, ", subtitle=", this.b, ", linkUrl="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Footer1;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Footer1 {

        /* renamed from: a, reason: collision with root package name */
        public final FooterMessage f23427a;
        public final ArrayList b;

        public Footer1(FooterMessage footerMessage, ArrayList arrayList) {
            this.f23427a = footerMessage;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Footer1)) {
                return false;
            }
            Footer1 footer1 = (Footer1) obj;
            return Intrinsics.c(this.f23427a, footer1.f23427a) && this.b.equals(footer1.b);
        }

        public final int hashCode() {
            FooterMessage footerMessage = this.f23427a;
            return this.b.hashCode() + ((footerMessage == null ? 0 : footerMessage.hashCode()) * 31);
        }

        public final String toString() {
            return "Footer1(footerMessage=" + this.f23427a + ", productDetailsActions=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$FooterMessage;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FooterMessage {

        /* renamed from: a, reason: collision with root package name */
        public final String f23428a;
        public final String b;

        public FooterMessage(String str, String str2) {
            this.f23428a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FooterMessage)) {
                return false;
            }
            FooterMessage footerMessage = (FooterMessage) obj;
            return Intrinsics.c(this.f23428a, footerMessage.f23428a) && Intrinsics.c(this.b, footerMessage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23428a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("FooterMessage(text=", this.f23428a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Icon;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Icon {

        /* renamed from: a, reason: collision with root package name */
        public final String f23429a;
        public final OnHostedIcon b;

        public Icon(String __typename, OnHostedIcon onHostedIcon) {
            Intrinsics.h(__typename, "__typename");
            this.f23429a = __typename;
            this.b = onHostedIcon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) obj;
            return Intrinsics.c(this.f23429a, icon.f23429a) && Intrinsics.c(this.b, icon.b);
        }

        public final int hashCode() {
            int iHashCode = this.f23429a.hashCode() * 31;
            OnHostedIcon onHostedIcon = this.b;
            return iHashCode + (onHostedIcon == null ? 0 : onHostedIcon.f23456a.hashCode());
        }

        public final String toString() {
            return "Icon(__typename=" + this.f23429a + ", onHostedIcon=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ImageGalleryClickAnalytics;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImageGalleryClickAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f23430a;
        public final AnalyticsFields b;

        public ImageGalleryClickAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f23430a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageGalleryClickAnalytics)) {
                return false;
            }
            ImageGalleryClickAnalytics imageGalleryClickAnalytics = (ImageGalleryClickAnalytics) obj;
            return Intrinsics.c(this.f23430a, imageGalleryClickAnalytics.f23430a) && Intrinsics.c(this.b, imageGalleryClickAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23430a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImageGalleryClickAnalytics(__typename=", this.f23430a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ImageGalleryCloseAnalytics;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImageGalleryCloseAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f23431a;
        public final AnalyticsFields b;

        public ImageGalleryCloseAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f23431a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageGalleryCloseAnalytics)) {
                return false;
            }
            ImageGalleryCloseAnalytics imageGalleryCloseAnalytics = (ImageGalleryCloseAnalytics) obj;
            return Intrinsics.c(this.f23431a, imageGalleryCloseAnalytics.f23431a) && Intrinsics.c(this.b, imageGalleryCloseAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23431a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImageGalleryCloseAnalytics(__typename=", this.f23431a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ImageGalleryScrollAnalytics;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImageGalleryScrollAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f23432a;
        public final AnalyticsFields b;

        public ImageGalleryScrollAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f23432a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageGalleryScrollAnalytics)) {
                return false;
            }
            ImageGalleryScrollAnalytics imageGalleryScrollAnalytics = (ImageGalleryScrollAnalytics) obj;
            return Intrinsics.c(this.f23432a, imageGalleryScrollAnalytics.f23432a) && Intrinsics.c(this.b, imageGalleryScrollAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23432a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImageGalleryScrollAnalytics(__typename=", this.f23432a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ImageGalleryThumbnailClickAnalytics;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImageGalleryThumbnailClickAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f23433a;
        public final AnalyticsFields b;

        public ImageGalleryThumbnailClickAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f23433a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImageGalleryThumbnailClickAnalytics)) {
                return false;
            }
            ImageGalleryThumbnailClickAnalytics imageGalleryThumbnailClickAnalytics = (ImageGalleryThumbnailClickAnalytics) obj;
            return Intrinsics.c(this.f23433a, imageGalleryThumbnailClickAnalytics.f23433a) && Intrinsics.c(this.b, imageGalleryThumbnailClickAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23433a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImageGalleryThumbnailClickAnalytics(__typename=", this.f23433a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ImpressionAnalytics;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f23434a;
        public final AnalyticsFields b;

        public ImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f23434a = str;
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
            return Intrinsics.c(this.f23434a, impressionAnalytics.f23434a) && Intrinsics.c(this.b, impressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23434a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytics(__typename=", this.f23434a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$InsetAlertAction;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InsetAlertAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f23435a;
        public final ActionType b;
        public final String c;
        public final Analytics2 d;

        public InsetAlertAction(String str, ActionType actionType, String str2, Analytics2 analytics2) {
            this.f23435a = str;
            this.b = actionType;
            this.c = str2;
            this.d = analytics2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InsetAlertAction)) {
                return false;
            }
            InsetAlertAction insetAlertAction = (InsetAlertAction) obj;
            return Intrinsics.c(this.f23435a, insetAlertAction.f23435a) && this.b == insetAlertAction.b && Intrinsics.c(this.c, insetAlertAction.c) && Intrinsics.c(this.d, insetAlertAction.d);
        }

        public final int hashCode() {
            String str = this.f23435a;
            int iC = b.c(d.a(this.b, (str == null ? 0 : str.hashCode()) * 31, 31), 31, this.c);
            Analytics2 analytics2 = this.d;
            return iC + (analytics2 != null ? analytics2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbW = d.w("InsetAlertAction(id=", this.f23435a, ", type=", this.b, ", action=");
            sbW.append(this.c);
            sbW.append(", analytics=");
            sbW.append(this.d);
            sbW.append(")");
            return sbW.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$InsetAlertUI;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InsetAlertUI {

        /* renamed from: a, reason: collision with root package name */
        public final String f23436a;
        public final String b;
        public final CoreAlertStyle c;

        public InsetAlertUI(CoreAlertStyle coreAlertStyle, String str, String str2) {
            this.f23436a = str;
            this.b = str2;
            this.c = coreAlertStyle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InsetAlertUI)) {
                return false;
            }
            InsetAlertUI insetAlertUI = (InsetAlertUI) obj;
            return Intrinsics.c(this.f23436a, insetAlertUI.f23436a) && Intrinsics.c(this.b, insetAlertUI.b) && this.c == insetAlertUI.c;
        }

        public final int hashCode() {
            String str = this.f23436a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("InsetAlertUI(title=", this.f23436a, ", description=", this.b, ", style=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Item;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f23437a;
        public final OnProductDetailsCouponBanner b;
        public final OnActionableCard c;
        public final OnBasicCoreBroadcastBanner d;
        public final OnProductDetailsImages e;
        public final OnBasicInsetAlert f;
        public final OnProductDetailsProductPanel g;
        public final OnProductOriginAndHealthInfo h;
        public final OnProductDetailsRowAccordion i;
        public final OnProductDetailsRowLink j;
        public final OnHorizontalList1 k;
        public final OnProductDetailsRatingsAndReviewsPreview l;
        public final OnProductDetailsCoreRow m;
        public final OnChatEntryCardV3 n;

        public Item(String __typename, OnProductDetailsCouponBanner onProductDetailsCouponBanner, OnActionableCard onActionableCard, OnBasicCoreBroadcastBanner onBasicCoreBroadcastBanner, OnProductDetailsImages onProductDetailsImages, OnBasicInsetAlert onBasicInsetAlert, OnProductDetailsProductPanel onProductDetailsProductPanel, OnProductOriginAndHealthInfo onProductOriginAndHealthInfo, OnProductDetailsRowAccordion onProductDetailsRowAccordion, OnProductDetailsRowLink onProductDetailsRowLink, OnHorizontalList1 onHorizontalList1, OnProductDetailsRatingsAndReviewsPreview onProductDetailsRatingsAndReviewsPreview, OnProductDetailsCoreRow onProductDetailsCoreRow, OnChatEntryCardV3 onChatEntryCardV3) {
            Intrinsics.h(__typename, "__typename");
            this.f23437a = __typename;
            this.b = onProductDetailsCouponBanner;
            this.c = onActionableCard;
            this.d = onBasicCoreBroadcastBanner;
            this.e = onProductDetailsImages;
            this.f = onBasicInsetAlert;
            this.g = onProductDetailsProductPanel;
            this.h = onProductOriginAndHealthInfo;
            this.i = onProductDetailsRowAccordion;
            this.j = onProductDetailsRowLink;
            this.k = onHorizontalList1;
            this.l = onProductDetailsRatingsAndReviewsPreview;
            this.m = onProductDetailsCoreRow;
            this.n = onChatEntryCardV3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f23437a, item.f23437a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c) && Intrinsics.c(this.d, item.d) && Intrinsics.c(this.e, item.e) && Intrinsics.c(this.f, item.f) && Intrinsics.c(this.g, item.g) && Intrinsics.c(this.h, item.h) && Intrinsics.c(this.i, item.i) && Intrinsics.c(this.j, item.j) && Intrinsics.c(this.k, item.k) && Intrinsics.c(this.l, item.l) && Intrinsics.c(this.m, item.m) && Intrinsics.c(this.n, item.n);
        }

        public final int hashCode() {
            int iHashCode = this.f23437a.hashCode() * 31;
            OnProductDetailsCouponBanner onProductDetailsCouponBanner = this.b;
            int iHashCode2 = (iHashCode + (onProductDetailsCouponBanner == null ? 0 : onProductDetailsCouponBanner.hashCode())) * 31;
            OnActionableCard onActionableCard = this.c;
            int iHashCode3 = (iHashCode2 + (onActionableCard == null ? 0 : onActionableCard.hashCode())) * 31;
            OnBasicCoreBroadcastBanner onBasicCoreBroadcastBanner = this.d;
            int iHashCode4 = (iHashCode3 + (onBasicCoreBroadcastBanner == null ? 0 : onBasicCoreBroadcastBanner.hashCode())) * 31;
            OnProductDetailsImages onProductDetailsImages = this.e;
            int iHashCode5 = (iHashCode4 + (onProductDetailsImages == null ? 0 : onProductDetailsImages.hashCode())) * 31;
            OnBasicInsetAlert onBasicInsetAlert = this.f;
            int iHashCode6 = (iHashCode5 + (onBasicInsetAlert == null ? 0 : onBasicInsetAlert.hashCode())) * 31;
            OnProductDetailsProductPanel onProductDetailsProductPanel = this.g;
            int iHashCode7 = (iHashCode6 + (onProductDetailsProductPanel == null ? 0 : onProductDetailsProductPanel.hashCode())) * 31;
            OnProductOriginAndHealthInfo onProductOriginAndHealthInfo = this.h;
            int iHashCode8 = (iHashCode7 + (onProductOriginAndHealthInfo == null ? 0 : onProductOriginAndHealthInfo.hashCode())) * 31;
            OnProductDetailsRowAccordion onProductDetailsRowAccordion = this.i;
            int iHashCode9 = (iHashCode8 + (onProductDetailsRowAccordion == null ? 0 : onProductDetailsRowAccordion.hashCode())) * 31;
            OnProductDetailsRowLink onProductDetailsRowLink = this.j;
            int iHashCode10 = (iHashCode9 + (onProductDetailsRowLink == null ? 0 : onProductDetailsRowLink.hashCode())) * 31;
            OnHorizontalList1 onHorizontalList1 = this.k;
            int iHashCode11 = (iHashCode10 + (onHorizontalList1 == null ? 0 : onHorizontalList1.hashCode())) * 31;
            OnProductDetailsRatingsAndReviewsPreview onProductDetailsRatingsAndReviewsPreview = this.l;
            int iHashCode12 = (iHashCode11 + (onProductDetailsRatingsAndReviewsPreview == null ? 0 : onProductDetailsRatingsAndReviewsPreview.hashCode())) * 31;
            OnProductDetailsCoreRow onProductDetailsCoreRow = this.m;
            int iHashCode13 = (iHashCode12 + (onProductDetailsCoreRow == null ? 0 : onProductDetailsCoreRow.hashCode())) * 31;
            OnChatEntryCardV3 onChatEntryCardV3 = this.n;
            return iHashCode13 + (onChatEntryCardV3 != null ? onChatEntryCardV3.hashCode() : 0);
        }

        public final String toString() {
            return "Item(__typename=" + this.f23437a + ", onProductDetailsCouponBanner=" + this.b + ", onActionableCard=" + this.c + ", onBasicCoreBroadcastBanner=" + this.d + ", onProductDetailsImages=" + this.e + ", onBasicInsetAlert=" + this.f + ", onProductDetailsProductPanel=" + this.g + ", onProductOriginAndHealthInfo=" + this.h + ", onProductDetailsRowAccordion=" + this.i + ", onProductDetailsRowLink=" + this.j + ", onHorizontalList=" + this.k + ", onProductDetailsRatingsAndReviewsPreview=" + this.l + ", onProductDetailsCoreRow=" + this.m + ", onChatEntryCardV3=" + this.n + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Item1;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23438a;
        public final OnProductCard1 b;
        public final OnProductTile c;

        public Item1(String __typename, OnProductCard1 onProductCard1, OnProductTile onProductTile) {
            Intrinsics.h(__typename, "__typename");
            this.f23438a = __typename;
            this.b = onProductCard1;
            this.c = onProductTile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item1)) {
                return false;
            }
            Item1 item1 = (Item1) obj;
            return Intrinsics.c(this.f23438a, item1.f23438a) && Intrinsics.c(this.b, item1.b) && Intrinsics.c(this.c, item1.c);
        }

        public final int hashCode() {
            int iHashCode = this.f23438a.hashCode() * 31;
            OnProductCard1 onProductCard1 = this.b;
            int iHashCode2 = (iHashCode + (onProductCard1 == null ? 0 : onProductCard1.hashCode())) * 31;
            OnProductTile onProductTile = this.c;
            return iHashCode2 + (onProductTile != null ? onProductTile.hashCode() : 0);
        }

        public final String toString() {
            return "Item1(__typename=" + this.f23438a + ", onProductCard=" + this.b + ", onProductTile=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Item2;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23439a;
        public final String b;
        public final String c;

        public Item2(String str, String str2, String str3) {
            this.f23439a = str;
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
            return Intrinsics.c(this.f23439a, item2.f23439a) && Intrinsics.c(this.b, item2.b) && Intrinsics.c(this.c, item2.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f23439a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("Item2(title=", this.f23439a, ", description=", this.b, ", imageUrl="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Item3;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23440a;
        public final OnProductCard2 b;
        public final OnProductTile1 c;

        public Item3(String __typename, OnProductCard2 onProductCard2, OnProductTile1 onProductTile1) {
            Intrinsics.h(__typename, "__typename");
            this.f23440a = __typename;
            this.b = onProductCard2;
            this.c = onProductTile1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item3)) {
                return false;
            }
            Item3 item3 = (Item3) obj;
            return Intrinsics.c(this.f23440a, item3.f23440a) && Intrinsics.c(this.b, item3.b) && Intrinsics.c(this.c, item3.c);
        }

        public final int hashCode() {
            int iHashCode = this.f23440a.hashCode() * 31;
            OnProductCard2 onProductCard2 = this.b;
            int iHashCode2 = (iHashCode + (onProductCard2 == null ? 0 : onProductCard2.hashCode())) * 31;
            OnProductTile1 onProductTile1 = this.c;
            return iHashCode2 + (onProductTile1 != null ? onProductTile1.hashCode() : 0);
        }

        public final String toString() {
            return "Item3(__typename=" + this.f23440a + ", onProductCard=" + this.b + ", onProductTile=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$LeadingAsset;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LeadingAsset {

        /* renamed from: a, reason: collision with root package name */
        public final String f23441a;
        public final OnHostedIcon1 b;
        public final OnCoreIcon c;

        public LeadingAsset(String __typename, OnHostedIcon1 onHostedIcon1, OnCoreIcon onCoreIcon) {
            Intrinsics.h(__typename, "__typename");
            this.f23441a = __typename;
            this.b = onHostedIcon1;
            this.c = onCoreIcon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LeadingAsset)) {
                return false;
            }
            LeadingAsset leadingAsset = (LeadingAsset) obj;
            return Intrinsics.c(this.f23441a, leadingAsset.f23441a) && Intrinsics.c(this.b, leadingAsset.b) && Intrinsics.c(this.c, leadingAsset.c);
        }

        public final int hashCode() {
            int iHashCode = this.f23441a.hashCode() * 31;
            OnHostedIcon1 onHostedIcon1 = this.b;
            int iHashCode2 = (iHashCode + (onHostedIcon1 == null ? 0 : onHostedIcon1.f23457a.hashCode())) * 31;
            OnCoreIcon onCoreIcon = this.c;
            return iHashCode2 + (onCoreIcon != null ? onCoreIcon.f23450a.hashCode() : 0);
        }

        public final String toString() {
            return "LeadingAsset(__typename=" + this.f23441a + ", onHostedIcon=" + this.b + ", onCoreIcon=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$LeadingAsset1;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LeadingAsset1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23442a;
        public final OnHostedIcon2 b;
        public final OnCoreIcon1 c;

        public LeadingAsset1(String __typename, OnHostedIcon2 onHostedIcon2, OnCoreIcon1 onCoreIcon1) {
            Intrinsics.h(__typename, "__typename");
            this.f23442a = __typename;
            this.b = onHostedIcon2;
            this.c = onCoreIcon1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LeadingAsset1)) {
                return false;
            }
            LeadingAsset1 leadingAsset1 = (LeadingAsset1) obj;
            return Intrinsics.c(this.f23442a, leadingAsset1.f23442a) && Intrinsics.c(this.b, leadingAsset1.b) && Intrinsics.c(this.c, leadingAsset1.c);
        }

        public final int hashCode() {
            int iHashCode = this.f23442a.hashCode() * 31;
            OnHostedIcon2 onHostedIcon2 = this.b;
            int iHashCode2 = (iHashCode + (onHostedIcon2 == null ? 0 : onHostedIcon2.f23458a.hashCode())) * 31;
            OnCoreIcon1 onCoreIcon1 = this.c;
            return iHashCode2 + (onCoreIcon1 != null ? onCoreIcon1.f23451a.hashCode() : 0);
        }

        public final String toString() {
            return "LeadingAsset1(__typename=" + this.f23442a + ", onHostedIcon=" + this.b + ", onCoreIcon=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$LinkContent;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LinkContent {

        /* renamed from: a, reason: collision with root package name */
        public final String f23443a;
        public final OnParagraphTextItem2 b;
        public final OnProductNutritionInfo c;
        public final OnInfoSection d;

        public LinkContent(String __typename, OnParagraphTextItem2 onParagraphTextItem2, OnProductNutritionInfo onProductNutritionInfo, OnInfoSection onInfoSection) {
            Intrinsics.h(__typename, "__typename");
            this.f23443a = __typename;
            this.b = onParagraphTextItem2;
            this.c = onProductNutritionInfo;
            this.d = onInfoSection;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LinkContent)) {
                return false;
            }
            LinkContent linkContent = (LinkContent) obj;
            return Intrinsics.c(this.f23443a, linkContent.f23443a) && Intrinsics.c(this.b, linkContent.b) && Intrinsics.c(this.c, linkContent.c) && Intrinsics.c(this.d, linkContent.d);
        }

        public final int hashCode() {
            int iHashCode = this.f23443a.hashCode() * 31;
            OnParagraphTextItem2 onParagraphTextItem2 = this.b;
            int iHashCode2 = (iHashCode + (onParagraphTextItem2 == null ? 0 : onParagraphTextItem2.hashCode())) * 31;
            OnProductNutritionInfo onProductNutritionInfo = this.c;
            int iHashCode3 = (iHashCode2 + (onProductNutritionInfo == null ? 0 : onProductNutritionInfo.hashCode())) * 31;
            OnInfoSection onInfoSection = this.d;
            return iHashCode3 + (onInfoSection != null ? onInfoSection.hashCode() : 0);
        }

        public final String toString() {
            return "LinkContent(__typename=" + this.f23443a + ", onParagraphTextItem=" + this.b + ", onProductNutritionInfo=" + this.c + ", onInfoSection=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnActionableCard;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnActionableCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f23444a;
        public final String b;
        public final CardHeight c;
        public final String d;
        public final TealiumAnalytics e;

        public OnActionableCard(String str, String str2, CardHeight cardHeight, String str3, TealiumAnalytics tealiumAnalytics) {
            this.f23444a = str;
            this.b = str2;
            this.c = cardHeight;
            this.d = str3;
            this.e = tealiumAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnActionableCard)) {
                return false;
            }
            OnActionableCard onActionableCard = (OnActionableCard) obj;
            return Intrinsics.c(this.f23444a, onActionableCard.f23444a) && Intrinsics.c(this.b, onActionableCard.b) && this.c == onActionableCard.c && Intrinsics.c(this.d, onActionableCard.d) && Intrinsics.c(this.e, onActionableCard.e);
        }

        public final int hashCode() {
            int iC = b.c(d.b(this.c, b.c(this.f23444a.hashCode() * 31, 31, this.b), 31), 31, this.d);
            TealiumAnalytics tealiumAnalytics = this.e;
            return iC + (tealiumAnalytics == null ? 0 : tealiumAnalytics.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnActionableCard(image=", this.f23444a, ", altText=", this.b, ", cardHeight=");
            sbV.append(this.c);
            sbV.append(", link=");
            sbV.append(this.d);
            sbV.append(", analytics=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnBasicCoreBroadcastBanner;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBasicCoreBroadcastBanner {

        /* renamed from: a, reason: collision with root package name */
        public final BroadcastBannerUI f23445a;
        public final String b;
        public final BroadcastBannerAction c;

        public OnBasicCoreBroadcastBanner(BroadcastBannerUI broadcastBannerUI, String str, BroadcastBannerAction broadcastBannerAction) {
            this.f23445a = broadcastBannerUI;
            this.b = str;
            this.c = broadcastBannerAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBasicCoreBroadcastBanner)) {
                return false;
            }
            OnBasicCoreBroadcastBanner onBasicCoreBroadcastBanner = (OnBasicCoreBroadcastBanner) obj;
            return Intrinsics.c(this.f23445a, onBasicCoreBroadcastBanner.f23445a) && Intrinsics.c(this.b, onBasicCoreBroadcastBanner.b) && Intrinsics.c(this.c, onBasicCoreBroadcastBanner.c);
        }

        public final int hashCode() {
            int iHashCode = this.f23445a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            BroadcastBannerAction broadcastBannerAction = this.c;
            return iHashCode2 + (broadcastBannerAction != null ? broadcastBannerAction.hashCode() : 0);
        }

        public final String toString() {
            return "OnBasicCoreBroadcastBanner(broadcastBannerUI=" + this.f23445a + ", broadcastBannerActionLabel=" + this.b + ", broadcastBannerAction=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnBasicCoreRow;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBasicCoreRow {

        /* renamed from: a, reason: collision with root package name */
        public final String f23446a;
        public final BasicCoreRow b;

        public OnBasicCoreRow(String str, BasicCoreRow basicCoreRow) {
            this.f23446a = str;
            this.b = basicCoreRow;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBasicCoreRow)) {
                return false;
            }
            OnBasicCoreRow onBasicCoreRow = (OnBasicCoreRow) obj;
            return Intrinsics.c(this.f23446a, onBasicCoreRow.f23446a) && Intrinsics.c(this.b, onBasicCoreRow.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23446a.hashCode() * 31);
        }

        public final String toString() {
            return "OnBasicCoreRow(__typename=" + this.f23446a + ", basicCoreRow=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnBasicInsetAlert;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBasicInsetAlert {

        /* renamed from: a, reason: collision with root package name */
        public final InsetAlertUI f23447a;
        public final InsetAlertAction b;
        public final String c;

        public OnBasicInsetAlert(InsetAlertUI insetAlertUI, InsetAlertAction insetAlertAction, String str) {
            this.f23447a = insetAlertUI;
            this.b = insetAlertAction;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBasicInsetAlert)) {
                return false;
            }
            OnBasicInsetAlert onBasicInsetAlert = (OnBasicInsetAlert) obj;
            return Intrinsics.c(this.f23447a, onBasicInsetAlert.f23447a) && Intrinsics.c(this.b, onBasicInsetAlert.b) && Intrinsics.c(this.c, onBasicInsetAlert.c);
        }

        public final int hashCode() {
            int iHashCode = this.f23447a.hashCode() * 31;
            InsetAlertAction insetAlertAction = this.b;
            int iHashCode2 = (iHashCode + (insetAlertAction == null ? 0 : insetAlertAction.hashCode())) * 31;
            String str = this.c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnBasicInsetAlert(insetAlertUI=");
            sb.append(this.f23447a);
            sb.append(", insetAlertAction=");
            sb.append(this.b);
            sb.append(", insetAlertActionLabel=");
            return a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnChatEntryCardV3;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnChatEntryCardV3 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23448a;
        public final Boolean b;
        public final ArrayList c;
        public final ChatEntryCardAction d;

        public OnChatEntryCardV3(String str, Boolean bool, ArrayList arrayList, ChatEntryCardAction chatEntryCardAction) {
            this.f23448a = str;
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
            return this.f23448a.equals(onChatEntryCardV3.f23448a) && Intrinsics.c(this.b, onChatEntryCardV3.b) && this.c.equals(onChatEntryCardV3.c) && this.d.equals(onChatEntryCardV3.d);
        }

        public final int hashCode() {
            int iHashCode = this.f23448a.hashCode() * 31;
            Boolean bool = this.b;
            return this.d.hashCode() + androidx.compose.ui.input.pointer.a.b((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.c);
        }

        public final String toString() {
            return "OnChatEntryCardV3(chatEntryCardTitle=" + this.f23448a + ", chatEntryCardShowBeta=" + this.b + ", chatEntryCardSuggestedPrompts=" + this.c + ", chatEntryCardAction=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnContentCta;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnContentCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f23449a;
        public final String b;
        public final OnCtaClickAnalytics c;

        public OnContentCta(String str, String str2, OnCtaClickAnalytics onCtaClickAnalytics) {
            this.f23449a = str;
            this.b = str2;
            this.c = onCtaClickAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnContentCta)) {
                return false;
            }
            OnContentCta onContentCta = (OnContentCta) obj;
            return Intrinsics.c(this.f23449a, onContentCta.f23449a) && Intrinsics.c(this.b, onContentCta.b) && Intrinsics.c(this.c, onContentCta.c);
        }

        public final int hashCode() {
            int iHashCode = this.f23449a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            OnCtaClickAnalytics onCtaClickAnalytics = this.c;
            return iHashCode2 + (onCtaClickAnalytics != null ? onCtaClickAnalytics.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnContentCta(label=", this.f23449a, ", url=", this.b, ", onCtaClickAnalytics=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnCoreIcon;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCoreIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f23450a;

        public OnCoreIcon(String str) {
            this.f23450a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCoreIcon) && Intrinsics.c(this.f23450a, ((OnCoreIcon) obj).f23450a);
        }

        public final int hashCode() {
            return this.f23450a.hashCode();
        }

        public final String toString() {
            return a.h("OnCoreIcon(coreIconName=", this.f23450a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnCoreIcon1;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCoreIcon1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23451a;

        public OnCoreIcon1(String str) {
            this.f23451a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCoreIcon1) && Intrinsics.c(this.f23451a, ((OnCoreIcon1) obj).f23451a);
        }

        public final int hashCode() {
            return this.f23451a.hashCode();
        }

        public final String toString() {
            return a.h("OnCoreIcon1(coreIconName=", this.f23451a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnCoreRowUI;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCoreRowUI {

        /* renamed from: a, reason: collision with root package name */
        public final String f23452a;
        public final CoreRowUI b;

        public OnCoreRowUI(String str, CoreRowUI coreRowUI) {
            this.f23452a = str;
            this.b = coreRowUI;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCoreRowUI)) {
                return false;
            }
            OnCoreRowUI onCoreRowUI = (OnCoreRowUI) obj;
            return Intrinsics.c(this.f23452a, onCoreRowUI.f23452a) && Intrinsics.c(this.b, onCoreRowUI.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23452a.hashCode() * 31);
        }

        public final String toString() {
            return "OnCoreRowUI(__typename=" + this.f23452a + ", coreRowUI=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnCtaClickAnalytics;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCtaClickAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f23453a;
        public final AnalyticsFields b;

        public OnCtaClickAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f23453a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCtaClickAnalytics)) {
                return false;
            }
            OnCtaClickAnalytics onCtaClickAnalytics = (OnCtaClickAnalytics) obj;
            return Intrinsics.c(this.f23453a, onCtaClickAnalytics.f23453a) && Intrinsics.c(this.b, onCtaClickAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23453a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("OnCtaClickAnalytics(__typename=", this.f23453a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnHorizontalList;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHorizontalList {

        /* renamed from: a, reason: collision with root package name */
        public final String f23454a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final ArrayList h;

        public OnHorizontalList(String str, String str2, String str3, String str4, String str5, String str6, String str7, ArrayList arrayList) {
            this.f23454a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
            this.h = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnHorizontalList)) {
                return false;
            }
            OnHorizontalList onHorizontalList = (OnHorizontalList) obj;
            return Intrinsics.c(this.f23454a, onHorizontalList.f23454a) && this.b.equals(onHorizontalList.b) && Intrinsics.c(this.c, onHorizontalList.c) && Intrinsics.c(this.d, onHorizontalList.d) && Intrinsics.c(this.e, onHorizontalList.e) && Intrinsics.c(this.f, onHorizontalList.f) && Intrinsics.c(this.g, onHorizontalList.g) && this.h.equals(onHorizontalList.h);
        }

        public final int hashCode() {
            String str = this.f23454a;
            int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            String str2 = this.c;
            int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.e;
            int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f;
            int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.g;
            return this.h.hashCode() + ((iHashCode4 + (str6 != null ? str6.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnHorizontalList(id=", this.f23454a, ", title=", this.b, ", subtitle=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", actionTitle=", this.d, ", deepLink=");
            androidx.constraintlayout.core.state.a.B(sbV, this.e, ", actionPath=", this.f, ", nodeId=");
            sbV.append(this.g);
            sbV.append(", items=");
            sbV.append(this.h);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnHorizontalList1;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHorizontalList1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23455a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final ArrayList h;

        public OnHorizontalList1(String str, String str2, String str3, String str4, String str5, String str6, String str7, ArrayList arrayList) {
            this.f23455a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
            this.h = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnHorizontalList1)) {
                return false;
            }
            OnHorizontalList1 onHorizontalList1 = (OnHorizontalList1) obj;
            return Intrinsics.c(this.f23455a, onHorizontalList1.f23455a) && this.b.equals(onHorizontalList1.b) && Intrinsics.c(this.c, onHorizontalList1.c) && Intrinsics.c(this.d, onHorizontalList1.d) && Intrinsics.c(this.e, onHorizontalList1.e) && Intrinsics.c(this.f, onHorizontalList1.f) && Intrinsics.c(this.g, onHorizontalList1.g) && this.h.equals(onHorizontalList1.h);
        }

        public final int hashCode() {
            String str = this.f23455a;
            int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            String str2 = this.c;
            int iHashCode = (iC + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.e;
            int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f;
            int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.g;
            return this.h.hashCode() + ((iHashCode4 + (str6 != null ? str6.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnHorizontalList1(id=", this.f23455a, ", title=", this.b, ", subtitle=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", actionTitle=", this.d, ", deepLink=");
            androidx.constraintlayout.core.state.a.B(sbV, this.e, ", actionPath=", this.f, ", nodeId=");
            sbV.append(this.g);
            sbV.append(", items=");
            sbV.append(this.h);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnHostedIcon;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f23456a;

        public OnHostedIcon(String str) {
            this.f23456a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon) && Intrinsics.c(this.f23456a, ((OnHostedIcon) obj).f23456a);
        }

        public final int hashCode() {
            return this.f23456a.hashCode();
        }

        public final String toString() {
            return a.h("OnHostedIcon(url=", this.f23456a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnHostedIcon1;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23457a;

        public OnHostedIcon1(String str) {
            this.f23457a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon1) && Intrinsics.c(this.f23457a, ((OnHostedIcon1) obj).f23457a);
        }

        public final int hashCode() {
            return this.f23457a.hashCode();
        }

        public final String toString() {
            return a.h("OnHostedIcon1(url=", this.f23457a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnHostedIcon2;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23458a;

        public OnHostedIcon2(String str) {
            this.f23458a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon2) && Intrinsics.c(this.f23458a, ((OnHostedIcon2) obj).f23458a);
        }

        public final int hashCode() {
            return this.f23458a.hashCode();
        }

        public final String toString() {
            return a.h("OnHostedIcon2(url=", this.f23458a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnInfoSection;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnInfoSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f23459a;
        public final ArrayList b;
        public final Footer c;

        public OnInfoSection(String str, ArrayList arrayList, Footer footer) {
            this.f23459a = str;
            this.b = arrayList;
            this.c = footer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnInfoSection)) {
                return false;
            }
            OnInfoSection onInfoSection = (OnInfoSection) obj;
            return this.f23459a.equals(onInfoSection.f23459a) && this.b.equals(onInfoSection.b) && Intrinsics.c(this.c, onInfoSection.c);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(this.f23459a.hashCode() * 31, 31, this.b);
            Footer footer = this.c;
            return iB + (footer == null ? 0 : footer.hashCode());
        }

        public final String toString() {
            StringBuilder sbX = d.x("OnInfoSection(title=", this.f23459a, ", items=", ", footer=", this.b);
            sbX.append(this.c);
            sbX.append(")");
            return sbX.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnParagraphTextItem;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnParagraphTextItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f23460a;
        public final String b;
        public final ParagraphTextItemType c;

        public OnParagraphTextItem(String str, String str2, ParagraphTextItemType paragraphTextItemType) {
            this.f23460a = str;
            this.b = str2;
            this.c = paragraphTextItemType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnParagraphTextItem)) {
                return false;
            }
            OnParagraphTextItem onParagraphTextItem = (OnParagraphTextItem) obj;
            return Intrinsics.c(this.f23460a, onParagraphTextItem.f23460a) && Intrinsics.c(this.b, onParagraphTextItem.b) && this.c == onParagraphTextItem.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f23460a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnParagraphTextItem(__typename=", this.f23460a, ", content=", this.b, ", type=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnParagraphTextItem1;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnParagraphTextItem1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23461a;
        public final String b;
        public final ParagraphTextItemType c;

        public OnParagraphTextItem1(String str, String str2, ParagraphTextItemType paragraphTextItemType) {
            this.f23461a = str;
            this.b = str2;
            this.c = paragraphTextItemType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnParagraphTextItem1)) {
                return false;
            }
            OnParagraphTextItem1 onParagraphTextItem1 = (OnParagraphTextItem1) obj;
            return Intrinsics.c(this.f23461a, onParagraphTextItem1.f23461a) && Intrinsics.c(this.b, onParagraphTextItem1.b) && this.c == onParagraphTextItem1.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f23461a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnParagraphTextItem1(__typename=", this.f23461a, ", content=", this.b, ", type=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnParagraphTextItem2;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnParagraphTextItem2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23462a;
        public final ParagraphTextItemType b;

        public OnParagraphTextItem2(ParagraphTextItemType paragraphTextItemType, String str) {
            this.f23462a = str;
            this.b = paragraphTextItemType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnParagraphTextItem2)) {
                return false;
            }
            OnParagraphTextItem2 onParagraphTextItem2 = (OnParagraphTextItem2) obj;
            return Intrinsics.c(this.f23462a, onParagraphTextItem2.f23462a) && this.b == onParagraphTextItem2.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23462a.hashCode() * 31);
        }

        public final String toString() {
            return "OnParagraphTextItem2(content=" + this.f23462a + ", type=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductCard;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f23463a;
        public final ProductCard b;

        public OnProductCard(String str, ProductCard productCard) {
            this.f23463a = str;
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
            return Intrinsics.c(this.f23463a, onProductCard.f23463a) && Intrinsics.c(this.b, onProductCard.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23463a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OnProductCard(__typename=", this.f23463a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductCard1;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23464a;
        public final ProductCard b;

        public OnProductCard1(String str, ProductCard productCard) {
            this.f23464a = str;
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
            return Intrinsics.c(this.f23464a, onProductCard1.f23464a) && Intrinsics.c(this.b, onProductCard1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23464a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OnProductCard1(__typename=", this.f23464a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductCard2;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductCard2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23465a;
        public final ProductCard b;

        public OnProductCard2(String str, ProductCard productCard) {
            this.f23465a = str;
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
            return Intrinsics.c(this.f23465a, onProductCard2.f23465a) && Intrinsics.c(this.b, onProductCard2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23465a.hashCode() * 31);
        }

        public final String toString() {
            return d.o("OnProductCard2(__typename=", this.f23465a, ", productCard=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductDetailsCoreRow;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductDetailsCoreRow {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f23466a;
        public final RowDetails b;

        public OnProductDetailsCoreRow(boolean z, RowDetails rowDetails) {
            this.f23466a = z;
            this.b = rowDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductDetailsCoreRow)) {
                return false;
            }
            OnProductDetailsCoreRow onProductDetailsCoreRow = (OnProductDetailsCoreRow) obj;
            return this.f23466a == onProductDetailsCoreRow.f23466a && Intrinsics.c(this.b, onProductDetailsCoreRow.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Boolean.hashCode(this.f23466a) * 31);
        }

        public final String toString() {
            return "OnProductDetailsCoreRow(hasTopSeparator=" + this.f23466a + ", rowDetails=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductDetailsCouponBanner;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductDetailsCouponBanner {

        /* renamed from: a, reason: collision with root package name */
        public final ProductDetailsCouponBanner f23467a;

        public OnProductDetailsCouponBanner(ProductDetailsCouponBanner productDetailsCouponBanner) {
            this.f23467a = productDetailsCouponBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnProductDetailsCouponBanner) && Intrinsics.c(this.f23467a, ((OnProductDetailsCouponBanner) obj).f23467a);
        }

        public final int hashCode() {
            ProductDetailsCouponBanner productDetailsCouponBanner = this.f23467a;
            if (productDetailsCouponBanner == null) {
                return 0;
            }
            return productDetailsCouponBanner.hashCode();
        }

        public final String toString() {
            return "OnProductDetailsCouponBanner(productDetailsCouponBanner=" + this.f23467a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductDetailsImages;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductDetailsImages {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f23468a;
        public final ArrayList b;

        public OnProductDetailsImages(ArrayList arrayList, ArrayList arrayList2) {
            this.f23468a = arrayList;
            this.b = arrayList2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductDetailsImages)) {
                return false;
            }
            OnProductDetailsImages onProductDetailsImages = (OnProductDetailsImages) obj;
            return this.f23468a.equals(onProductDetailsImages.f23468a) && this.b.equals(onProductDetailsImages.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23468a.hashCode() * 31);
        }

        public final String toString() {
            return "OnProductDetailsImages(productImages=" + this.f23468a + ", roundelImages=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductDetailsProductPanel;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductDetailsProductPanel {

        /* renamed from: a, reason: collision with root package name */
        public final RatingsAndReviewsSummary f23469a;
        public final Product b;

        public OnProductDetailsProductPanel(RatingsAndReviewsSummary ratingsAndReviewsSummary, Product product) {
            this.f23469a = ratingsAndReviewsSummary;
            this.b = product;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductDetailsProductPanel)) {
                return false;
            }
            OnProductDetailsProductPanel onProductDetailsProductPanel = (OnProductDetailsProductPanel) obj;
            return Intrinsics.c(this.f23469a, onProductDetailsProductPanel.f23469a) && Intrinsics.c(this.b, onProductDetailsProductPanel.b);
        }

        public final int hashCode() {
            RatingsAndReviewsSummary ratingsAndReviewsSummary = this.f23469a;
            return this.b.hashCode() + ((ratingsAndReviewsSummary == null ? 0 : ratingsAndReviewsSummary.hashCode()) * 31);
        }

        public final String toString() {
            return "OnProductDetailsProductPanel(ratingsAndReviewsSummary=" + this.f23469a + ", product=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductDetailsRatingsAndReviewsPreview;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductDetailsRatingsAndReviewsPreview {

        /* renamed from: a, reason: collision with root package name */
        public final RatingsAndReviewsPreview f23470a;

        public OnProductDetailsRatingsAndReviewsPreview(RatingsAndReviewsPreview ratingsAndReviewsPreview) {
            this.f23470a = ratingsAndReviewsPreview;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnProductDetailsRatingsAndReviewsPreview) && Intrinsics.c(this.f23470a, ((OnProductDetailsRatingsAndReviewsPreview) obj).f23470a);
        }

        public final int hashCode() {
            RatingsAndReviewsPreview ratingsAndReviewsPreview = this.f23470a;
            if (ratingsAndReviewsPreview == null) {
                return 0;
            }
            return ratingsAndReviewsPreview.f23495a.hashCode();
        }

        public final String toString() {
            return "OnProductDetailsRatingsAndReviewsPreview(ratingsAndReviewsPreview=" + this.f23470a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductDetailsRowAccordion;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductDetailsRowAccordion {

        /* renamed from: a, reason: collision with root package name */
        public final OpenActionAnalytics f23471a;
        public final CloseActionAnalytics b;
        public final RowUI c;
        public final boolean d;
        public final boolean e;
        public final ExpandedContent f;

        public OnProductDetailsRowAccordion(OpenActionAnalytics openActionAnalytics, CloseActionAnalytics closeActionAnalytics, RowUI rowUI, boolean z, boolean z2, ExpandedContent expandedContent) {
            this.f23471a = openActionAnalytics;
            this.b = closeActionAnalytics;
            this.c = rowUI;
            this.d = z;
            this.e = z2;
            this.f = expandedContent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductDetailsRowAccordion)) {
                return false;
            }
            OnProductDetailsRowAccordion onProductDetailsRowAccordion = (OnProductDetailsRowAccordion) obj;
            return Intrinsics.c(this.f23471a, onProductDetailsRowAccordion.f23471a) && Intrinsics.c(this.b, onProductDetailsRowAccordion.b) && Intrinsics.c(this.c, onProductDetailsRowAccordion.c) && this.d == onProductDetailsRowAccordion.d && this.e == onProductDetailsRowAccordion.e && Intrinsics.c(this.f, onProductDetailsRowAccordion.f);
        }

        public final int hashCode() {
            OpenActionAnalytics openActionAnalytics = this.f23471a;
            int iHashCode = (openActionAnalytics == null ? 0 : openActionAnalytics.hashCode()) * 31;
            CloseActionAnalytics closeActionAnalytics = this.b;
            return this.f.hashCode() + b.e(b.e((this.c.hashCode() + ((iHashCode + (closeActionAnalytics != null ? closeActionAnalytics.hashCode() : 0)) * 31)) * 31, 31, this.d), 31, this.e);
        }

        public final String toString() {
            return "OnProductDetailsRowAccordion(openActionAnalytics=" + this.f23471a + ", closeActionAnalytics=" + this.b + ", rowUI=" + this.c + ", isExpanded=" + this.d + ", hasTopSeparator=" + this.e + ", expandedContent=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductDetailsRowAccordionProductList;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductDetailsRowAccordionProductList {

        /* renamed from: a, reason: collision with root package name */
        public final String f23472a;
        public final ProductDetailsRowAccordionProductListTextItem b;
        public final ProductDetailsRowAccordionProductListCta c;
        public final ProductDetailsRowAccordionProductList d;

        public OnProductDetailsRowAccordionProductList(String str, ProductDetailsRowAccordionProductListTextItem productDetailsRowAccordionProductListTextItem, ProductDetailsRowAccordionProductListCta productDetailsRowAccordionProductListCta, ProductDetailsRowAccordionProductList productDetailsRowAccordionProductList) {
            this.f23472a = str;
            this.b = productDetailsRowAccordionProductListTextItem;
            this.c = productDetailsRowAccordionProductListCta;
            this.d = productDetailsRowAccordionProductList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductDetailsRowAccordionProductList)) {
                return false;
            }
            OnProductDetailsRowAccordionProductList onProductDetailsRowAccordionProductList = (OnProductDetailsRowAccordionProductList) obj;
            return Intrinsics.c(this.f23472a, onProductDetailsRowAccordionProductList.f23472a) && Intrinsics.c(this.b, onProductDetailsRowAccordionProductList.b) && Intrinsics.c(this.c, onProductDetailsRowAccordionProductList.c) && Intrinsics.c(this.d, onProductDetailsRowAccordionProductList.d);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.f23472a.hashCode() * 31)) * 31)) * 31;
            ProductDetailsRowAccordionProductList productDetailsRowAccordionProductList = this.d;
            return iHashCode + (productDetailsRowAccordionProductList == null ? 0 : productDetailsRowAccordionProductList.hashCode());
        }

        public final String toString() {
            return "OnProductDetailsRowAccordionProductList(__typename=" + this.f23472a + ", productDetailsRowAccordionProductListTextItem=" + this.b + ", productDetailsRowAccordionProductListCta=" + this.c + ", productDetailsRowAccordionProductList=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductDetailsRowLink;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductDetailsRowLink {

        /* renamed from: a, reason: collision with root package name */
        public final RowUI1 f23473a;
        public final LinkContent b;
        public final boolean c;
        public final OpenActionAnalytics1 d;

        public OnProductDetailsRowLink(RowUI1 rowUI1, LinkContent linkContent, boolean z, OpenActionAnalytics1 openActionAnalytics1) {
            this.f23473a = rowUI1;
            this.b = linkContent;
            this.c = z;
            this.d = openActionAnalytics1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductDetailsRowLink)) {
                return false;
            }
            OnProductDetailsRowLink onProductDetailsRowLink = (OnProductDetailsRowLink) obj;
            return Intrinsics.c(this.f23473a, onProductDetailsRowLink.f23473a) && Intrinsics.c(this.b, onProductDetailsRowLink.b) && this.c == onProductDetailsRowLink.c && Intrinsics.c(this.d, onProductDetailsRowLink.d);
        }

        public final int hashCode() {
            int iE = b.e((this.b.hashCode() + (this.f23473a.hashCode() * 31)) * 31, 31, this.c);
            OpenActionAnalytics1 openActionAnalytics1 = this.d;
            return iE + (openActionAnalytics1 == null ? 0 : openActionAnalytics1.hashCode());
        }

        public final String toString() {
            return "OnProductDetailsRowLink(rowUI=" + this.f23473a + ", linkContent=" + this.b + ", hasTopSeparator=" + this.c + ", openActionAnalytics=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductNutritionInfo;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductNutritionInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f23474a;
        public final String b;
        public final String c;
        public final ArrayList d;
        public final ArrayList e;
        public final String f;
        public final ArrayList g;
        public final ArrayList h;

        public OnProductNutritionInfo(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, String str4, ArrayList arrayList3, ArrayList arrayList4) {
            this.f23474a = str;
            this.b = str2;
            this.c = str3;
            this.d = arrayList;
            this.e = arrayList2;
            this.f = str4;
            this.g = arrayList3;
            this.h = arrayList4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductNutritionInfo)) {
                return false;
            }
            OnProductNutritionInfo onProductNutritionInfo = (OnProductNutritionInfo) obj;
            return this.f23474a.equals(onProductNutritionInfo.f23474a) && this.b.equals(onProductNutritionInfo.b) && this.c.equals(onProductNutritionInfo.c) && this.d.equals(onProductNutritionInfo.d) && this.e.equals(onProductNutritionInfo.e) && this.f.equals(onProductNutritionInfo.f) && this.g.equals(onProductNutritionInfo.g) && this.h.equals(onProductNutritionInfo.h);
        }

        public final int hashCode() {
            return this.h.hashCode() + androidx.compose.ui.input.pointer.a.b(b.c(androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b(b.c(b.c(this.f23474a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnProductNutritionInfo(productNutritionTitle=", this.f23474a, ", servingsPerPack=", this.b, ", servingSize=");
            sbV.append(this.c);
            sbV.append(", servingsHeader=");
            sbV.append(this.d);
            sbV.append(", servingsRow=");
            sbV.append(this.e);
            sbV.append(", bottomCaption=");
            sbV.append(this.f);
            sbV.append(", tableHeaderRow=");
            sbV.append(this.g);
            sbV.append(", tableRows=");
            sbV.append(this.h);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductOriginAndHealthInfo;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductOriginAndHealthInfo {

        /* renamed from: a, reason: collision with root package name */
        public final CountryOfOrigin f23475a;

        public OnProductOriginAndHealthInfo(CountryOfOrigin countryOfOrigin) {
            this.f23475a = countryOfOrigin;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnProductOriginAndHealthInfo) && Intrinsics.c(this.f23475a, ((OnProductOriginAndHealthInfo) obj).f23475a);
        }

        public final int hashCode() {
            CountryOfOrigin countryOfOrigin = this.f23475a;
            if (countryOfOrigin == null) {
                return 0;
            }
            return countryOfOrigin.hashCode();
        }

        public final String toString() {
            return "OnProductOriginAndHealthInfo(countryOfOrigin=" + this.f23475a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductRatingsAndReviewsSummary;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductRatingsAndReviewsSummary {

        /* renamed from: a, reason: collision with root package name */
        public final double f23476a;
        public final double b;
        public final int c;
        public final RatingText d;
        public final Cta e;

        public OnProductRatingsAndReviewsSummary(double d, double d2, int i, RatingText ratingText, Cta cta) {
            this.f23476a = d;
            this.b = d2;
            this.c = i;
            this.d = ratingText;
            this.e = cta;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductRatingsAndReviewsSummary)) {
                return false;
            }
            OnProductRatingsAndReviewsSummary onProductRatingsAndReviewsSummary = (OnProductRatingsAndReviewsSummary) obj;
            return Double.compare(this.f23476a, onProductRatingsAndReviewsSummary.f23476a) == 0 && Double.compare(this.b, onProductRatingsAndReviewsSummary.b) == 0 && this.c == onProductRatingsAndReviewsSummary.c && Intrinsics.c(this.d, onProductRatingsAndReviewsSummary.d) && Intrinsics.c(this.e, onProductRatingsAndReviewsSummary.e);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + b.a(this.c, android.support.v4.media.session.a.a(this.b, Double.hashCode(this.f23476a) * 31, 31), 31)) * 31;
            Cta cta = this.e;
            return iHashCode + (cta == null ? 0 : cta.hashCode());
        }

        public final String toString() {
            StringBuilder sbN = androidx.constraintlayout.core.state.a.n(this.f23476a, "OnProductRatingsAndReviewsSummary(averageRatings=", ", displayRatings=");
            sbN.append(this.b);
            sbN.append(", maximumRating=");
            sbN.append(this.c);
            sbN.append(", ratingText=");
            sbN.append(this.d);
            sbN.append(", cta=");
            sbN.append(this.e);
            sbN.append(")");
            return sbN.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductTile;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductTile {

        /* renamed from: a, reason: collision with root package name */
        public final String f23477a;
        public final ProductTile b;

        public OnProductTile(String str, ProductTile productTile) {
            this.f23477a = str;
            this.b = productTile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductTile)) {
                return false;
            }
            OnProductTile onProductTile = (OnProductTile) obj;
            return Intrinsics.c(this.f23477a, onProductTile.f23477a) && Intrinsics.c(this.b, onProductTile.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23477a.hashCode() * 31);
        }

        public final String toString() {
            return "OnProductTile(__typename=" + this.f23477a + ", productTile=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnProductTile1;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductTile1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23478a;
        public final ProductTile b;

        public OnProductTile1(String str, ProductTile productTile) {
            this.f23478a = str;
            this.b = productTile;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductTile1)) {
                return false;
            }
            OnProductTile1 onProductTile1 = (OnProductTile1) obj;
            return Intrinsics.c(this.f23478a, onProductTile1.f23478a) && Intrinsics.c(this.b, onProductTile1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23478a.hashCode() * 31);
        }

        public final String toString() {
            return "OnProductTile1(__typename=" + this.f23478a + ", productTile=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnRatingsAndReviewsPreviewCta;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRatingsAndReviewsPreviewCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f23479a;
        public final RatingsAndReviewsPreviewCta b;

        public OnRatingsAndReviewsPreviewCta(String str, RatingsAndReviewsPreviewCta ratingsAndReviewsPreviewCta) {
            this.f23479a = str;
            this.b = ratingsAndReviewsPreviewCta;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnRatingsAndReviewsPreviewCta)) {
                return false;
            }
            OnRatingsAndReviewsPreviewCta onRatingsAndReviewsPreviewCta = (OnRatingsAndReviewsPreviewCta) obj;
            return Intrinsics.c(this.f23479a, onRatingsAndReviewsPreviewCta.f23479a) && Intrinsics.c(this.b, onRatingsAndReviewsPreviewCta.b);
        }

        public final int hashCode() {
            return this.b.f23785a.hashCode() + (this.f23479a.hashCode() * 31);
        }

        public final String toString() {
            return "OnRatingsAndReviewsPreviewCta(__typename=" + this.f23479a + ", ratingsAndReviewsPreviewCta=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnRatingsAndReviewsPreviewHeader;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRatingsAndReviewsPreviewHeader {

        /* renamed from: a, reason: collision with root package name */
        public final String f23480a;
        public final RatingsAndReviewsPreviewHeader b;

        public OnRatingsAndReviewsPreviewHeader(String str, RatingsAndReviewsPreviewHeader ratingsAndReviewsPreviewHeader) {
            this.f23480a = str;
            this.b = ratingsAndReviewsPreviewHeader;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnRatingsAndReviewsPreviewHeader)) {
                return false;
            }
            OnRatingsAndReviewsPreviewHeader onRatingsAndReviewsPreviewHeader = (OnRatingsAndReviewsPreviewHeader) obj;
            return Intrinsics.c(this.f23480a, onRatingsAndReviewsPreviewHeader.f23480a) && Intrinsics.c(this.b, onRatingsAndReviewsPreviewHeader.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23480a.hashCode() * 31);
        }

        public final String toString() {
            return "OnRatingsAndReviewsPreviewHeader(__typename=" + this.f23480a + ", ratingsAndReviewsPreviewHeader=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnRatingsAndReviewsRatingsDetails;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRatingsAndReviewsRatingsDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f23481a;
        public final RatingsAndReviewsRatingsDetails b;

        public OnRatingsAndReviewsRatingsDetails(String str, RatingsAndReviewsRatingsDetails ratingsAndReviewsRatingsDetails) {
            this.f23481a = str;
            this.b = ratingsAndReviewsRatingsDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnRatingsAndReviewsRatingsDetails)) {
                return false;
            }
            OnRatingsAndReviewsRatingsDetails onRatingsAndReviewsRatingsDetails = (OnRatingsAndReviewsRatingsDetails) obj;
            return Intrinsics.c(this.f23481a, onRatingsAndReviewsRatingsDetails.f23481a) && Intrinsics.c(this.b, onRatingsAndReviewsRatingsDetails.b);
        }

        public final int hashCode() {
            return this.b.f23793a.hashCode() + (this.f23481a.hashCode() * 31);
        }

        public final String toString() {
            return "OnRatingsAndReviewsRatingsDetails(__typename=" + this.f23481a + ", ratingsAndReviewsRatingsDetails=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OnRatingsAndReviewsReviewDetails;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRatingsAndReviewsReviewDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f23482a;
        public final RatingsAndReviewsReviewDetails b;

        public OnRatingsAndReviewsReviewDetails(String str, RatingsAndReviewsReviewDetails ratingsAndReviewsReviewDetails) {
            this.f23482a = str;
            this.b = ratingsAndReviewsReviewDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnRatingsAndReviewsReviewDetails)) {
                return false;
            }
            OnRatingsAndReviewsReviewDetails onRatingsAndReviewsReviewDetails = (OnRatingsAndReviewsReviewDetails) obj;
            return Intrinsics.c(this.f23482a, onRatingsAndReviewsReviewDetails.f23482a) && Intrinsics.c(this.b, onRatingsAndReviewsReviewDetails.b);
        }

        public final int hashCode() {
            return this.b.f23817a.hashCode() + (this.f23482a.hashCode() * 31);
        }

        public final String toString() {
            return "OnRatingsAndReviewsReviewDetails(__typename=" + this.f23482a + ", ratingsAndReviewsReviewDetails=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OpenActionAnalytics;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenActionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f23483a;
        public final AnalyticsFields b;

        public OpenActionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f23483a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenActionAnalytics)) {
                return false;
            }
            OpenActionAnalytics openActionAnalytics = (OpenActionAnalytics) obj;
            return Intrinsics.c(this.f23483a, openActionAnalytics.f23483a) && Intrinsics.c(this.b, openActionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23483a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("OpenActionAnalytics(__typename=", this.f23483a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$OpenActionAnalytics1;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OpenActionAnalytics1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f23484a;
        public final AnalyticsFields b;

        public OpenActionAnalytics1(String str, AnalyticsFields analyticsFields) {
            this.f23484a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OpenActionAnalytics1)) {
                return false;
            }
            OpenActionAnalytics1 openActionAnalytics1 = (OpenActionAnalytics1) obj;
            return Intrinsics.c(this.f23484a, openActionAnalytics1.f23484a) && Intrinsics.c(this.b, openActionAnalytics1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23484a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("OpenActionAnalytics1(__typename=", this.f23484a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Product;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Product {

        /* renamed from: a, reason: collision with root package name */
        public final String f23485a;
        public final OnProductCard b;

        public Product(String str, OnProductCard onProductCard) {
            this.f23485a = str;
            this.b = onProductCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return Intrinsics.c(this.f23485a, product.f23485a) && Intrinsics.c(this.b, product.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23485a.hashCode() * 31);
        }

        public final String toString() {
            return "Product(__typename=" + this.f23485a + ", onProductCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ProductDetailsAction;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductDetailsAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f23486a;
        public final String b;
        public final boolean c;
        public final ButtonAction d;
        public final String e;
        public final String f;
        public final ButtonStyle g;

        public ProductDetailsAction(String str, String str2, boolean z, ButtonAction buttonAction, String str3, String str4, ButtonStyle buttonStyle) {
            this.f23486a = str;
            this.b = str2;
            this.c = z;
            this.d = buttonAction;
            this.e = str3;
            this.f = str4;
            this.g = buttonStyle;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductDetailsAction)) {
                return false;
            }
            ProductDetailsAction productDetailsAction = (ProductDetailsAction) obj;
            return Intrinsics.c(this.f23486a, productDetailsAction.f23486a) && Intrinsics.c(this.b, productDetailsAction.b) && this.c == productDetailsAction.c && Intrinsics.c(this.d, productDetailsAction.d) && Intrinsics.c(this.e, productDetailsAction.e) && Intrinsics.c(this.f, productDetailsAction.f) && this.g == productDetailsAction.g;
        }

        public final int hashCode() {
            String str = this.f23486a;
            int iE = b.e(b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
            ButtonAction buttonAction = this.d;
            int iHashCode = (iE + (buttonAction == null ? 0 : buttonAction.hashCode())) * 31;
            String str2 = this.e;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            ButtonStyle buttonStyle = this.g;
            return iHashCode3 + (buttonStyle != null ? buttonStyle.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("ProductDetailsAction(altText=", this.f23486a, ", label=", this.b, ", enabled=");
            sbV.append(this.c);
            sbV.append(", buttonAction=");
            sbV.append(this.d);
            sbV.append(", buttonId=");
            androidx.constraintlayout.core.state.a.B(sbV, this.e, ", iconUrl=", this.f, ", style=");
            sbV.append(this.g);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ProductDetailsCouponBanner;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductDetailsCouponBanner {

        /* renamed from: a, reason: collision with root package name */
        public final CouponBannerColorTheme f23487a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final CouponBannerTermsAndConditions g;

        public ProductDetailsCouponBanner(CouponBannerColorTheme couponBannerColorTheme, String str, String str2, String str3, String str4, String str5, CouponBannerTermsAndConditions couponBannerTermsAndConditions) {
            this.f23487a = couponBannerColorTheme;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = couponBannerTermsAndConditions;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductDetailsCouponBanner)) {
                return false;
            }
            ProductDetailsCouponBanner productDetailsCouponBanner = (ProductDetailsCouponBanner) obj;
            return this.f23487a == productDetailsCouponBanner.f23487a && Intrinsics.c(this.b, productDetailsCouponBanner.b) && Intrinsics.c(this.c, productDetailsCouponBanner.c) && Intrinsics.c(this.d, productDetailsCouponBanner.d) && Intrinsics.c(this.e, productDetailsCouponBanner.e) && Intrinsics.c(this.f, productDetailsCouponBanner.f) && Intrinsics.c(this.g, productDetailsCouponBanner.g);
        }

        public final int hashCode() {
            int iC = b.c(b.c(b.c(this.f23487a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
            String str = this.e;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            return this.g.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ProductDetailsCouponBanner(couponBannerColorTheme=");
            sb.append(this.f23487a);
            sb.append(", couponBannerCouponCode=");
            sb.append(this.b);
            sb.append(", couponBannerDescription=");
            androidx.constraintlayout.core.state.a.B(sb, this.c, ", couponBannerMinimumSpend=", this.d, ", couponBannerCouponCodeAccessibilityLabel=");
            androidx.constraintlayout.core.state.a.B(sb, this.e, ", couponBannerDescriptionAccessibilityLabel=", this.f, ", couponBannerTermsAndConditions=");
            sb.append(this.g);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ProductDetailsPage;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductDetailsPage {

        /* renamed from: a, reason: collision with root package name */
        public final Analytics f23488a;
        public final ImpressionAnalytics b;
        public final ArrayList c;
        public final Footer1 d;

        public ProductDetailsPage(Analytics analytics, ImpressionAnalytics impressionAnalytics, ArrayList arrayList, Footer1 footer1) {
            this.f23488a = analytics;
            this.b = impressionAnalytics;
            this.c = arrayList;
            this.d = footer1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductDetailsPage)) {
                return false;
            }
            ProductDetailsPage productDetailsPage = (ProductDetailsPage) obj;
            return Intrinsics.c(this.f23488a, productDetailsPage.f23488a) && Intrinsics.c(this.b, productDetailsPage.b) && this.c.equals(productDetailsPage.c) && Intrinsics.c(this.d, productDetailsPage.d);
        }

        public final int hashCode() {
            Analytics analytics = this.f23488a;
            int iHashCode = (analytics == null ? 0 : analytics.hashCode()) * 31;
            ImpressionAnalytics impressionAnalytics = this.b;
            int iB = androidx.compose.ui.input.pointer.a.b((iHashCode + (impressionAnalytics == null ? 0 : impressionAnalytics.hashCode())) * 31, 31, this.c);
            Footer1 footer1 = this.d;
            return iB + (footer1 != null ? footer1.hashCode() : 0);
        }

        public final String toString() {
            return "ProductDetailsPage(analytics=" + this.f23488a + ", impressionAnalytics=" + this.b + ", items=" + this.c + ", footer=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ProductDetailsRowAccordionProductList;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductDetailsRowAccordionProductList {

        /* renamed from: a, reason: collision with root package name */
        public final String f23489a;
        public final OnHorizontalList b;

        public ProductDetailsRowAccordionProductList(String str, OnHorizontalList onHorizontalList) {
            this.f23489a = str;
            this.b = onHorizontalList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductDetailsRowAccordionProductList)) {
                return false;
            }
            ProductDetailsRowAccordionProductList productDetailsRowAccordionProductList = (ProductDetailsRowAccordionProductList) obj;
            return Intrinsics.c(this.f23489a, productDetailsRowAccordionProductList.f23489a) && Intrinsics.c(this.b, productDetailsRowAccordionProductList.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23489a.hashCode() * 31);
        }

        public final String toString() {
            return "ProductDetailsRowAccordionProductList(__typename=" + this.f23489a + ", onHorizontalList=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ProductDetailsRowAccordionProductListCta;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductDetailsRowAccordionProductListCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f23490a;
        public final OnContentCta b;

        public ProductDetailsRowAccordionProductListCta(String str, OnContentCta onContentCta) {
            this.f23490a = str;
            this.b = onContentCta;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductDetailsRowAccordionProductListCta)) {
                return false;
            }
            ProductDetailsRowAccordionProductListCta productDetailsRowAccordionProductListCta = (ProductDetailsRowAccordionProductListCta) obj;
            return Intrinsics.c(this.f23490a, productDetailsRowAccordionProductListCta.f23490a) && Intrinsics.c(this.b, productDetailsRowAccordionProductListCta.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23490a.hashCode() * 31);
        }

        public final String toString() {
            return "ProductDetailsRowAccordionProductListCta(__typename=" + this.f23490a + ", onContentCta=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ProductDetailsRowAccordionProductListTextItem;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductDetailsRowAccordionProductListTextItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f23491a;
        public final OnParagraphTextItem1 b;

        public ProductDetailsRowAccordionProductListTextItem(String str, OnParagraphTextItem1 onParagraphTextItem1) {
            this.f23491a = str;
            this.b = onParagraphTextItem1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductDetailsRowAccordionProductListTextItem)) {
                return false;
            }
            ProductDetailsRowAccordionProductListTextItem productDetailsRowAccordionProductListTextItem = (ProductDetailsRowAccordionProductListTextItem) obj;
            return Intrinsics.c(this.f23491a, productDetailsRowAccordionProductListTextItem.f23491a) && Intrinsics.c(this.b, productDetailsRowAccordionProductListTextItem.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23491a.hashCode() * 31);
        }

        public final String toString() {
            return "ProductDetailsRowAccordionProductListTextItem(__typename=" + this.f23491a + ", onParagraphTextItem=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ProductDetailsThumbnailClickAnalytics;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductDetailsThumbnailClickAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f23492a;
        public final AnalyticsFields b;

        public ProductDetailsThumbnailClickAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f23492a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductDetailsThumbnailClickAnalytics)) {
                return false;
            }
            ProductDetailsThumbnailClickAnalytics productDetailsThumbnailClickAnalytics = (ProductDetailsThumbnailClickAnalytics) obj;
            return Intrinsics.c(this.f23492a, productDetailsThumbnailClickAnalytics.f23492a) && Intrinsics.c(this.b, productDetailsThumbnailClickAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23492a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ProductDetailsThumbnailClickAnalytics(__typename=", this.f23492a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$ProductImage;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductImage {

        /* renamed from: a, reason: collision with root package name */
        public final String f23493a;
        public final String b;
        public final ImageGalleryClickAnalytics c;
        public final ImageGalleryScrollAnalytics d;
        public final ImageGalleryCloseAnalytics e;
        public final ImageGalleryThumbnailClickAnalytics f;
        public final ProductDetailsThumbnailClickAnalytics g;

        public ProductImage(String str, String str2, ImageGalleryClickAnalytics imageGalleryClickAnalytics, ImageGalleryScrollAnalytics imageGalleryScrollAnalytics, ImageGalleryCloseAnalytics imageGalleryCloseAnalytics, ImageGalleryThumbnailClickAnalytics imageGalleryThumbnailClickAnalytics, ProductDetailsThumbnailClickAnalytics productDetailsThumbnailClickAnalytics) {
            this.f23493a = str;
            this.b = str2;
            this.c = imageGalleryClickAnalytics;
            this.d = imageGalleryScrollAnalytics;
            this.e = imageGalleryCloseAnalytics;
            this.f = imageGalleryThumbnailClickAnalytics;
            this.g = productDetailsThumbnailClickAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductImage)) {
                return false;
            }
            ProductImage productImage = (ProductImage) obj;
            return Intrinsics.c(this.f23493a, productImage.f23493a) && Intrinsics.c(this.b, productImage.b) && Intrinsics.c(this.c, productImage.c) && Intrinsics.c(this.d, productImage.d) && Intrinsics.c(this.e, productImage.e) && Intrinsics.c(this.f, productImage.f) && Intrinsics.c(this.g, productImage.g);
        }

        public final int hashCode() {
            String str = this.f23493a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            ImageGalleryClickAnalytics imageGalleryClickAnalytics = this.c;
            int iHashCode3 = (iHashCode2 + (imageGalleryClickAnalytics == null ? 0 : imageGalleryClickAnalytics.hashCode())) * 31;
            ImageGalleryScrollAnalytics imageGalleryScrollAnalytics = this.d;
            int iHashCode4 = (iHashCode3 + (imageGalleryScrollAnalytics == null ? 0 : imageGalleryScrollAnalytics.hashCode())) * 31;
            ImageGalleryCloseAnalytics imageGalleryCloseAnalytics = this.e;
            int iHashCode5 = (iHashCode4 + (imageGalleryCloseAnalytics == null ? 0 : imageGalleryCloseAnalytics.hashCode())) * 31;
            ImageGalleryThumbnailClickAnalytics imageGalleryThumbnailClickAnalytics = this.f;
            int iHashCode6 = (iHashCode5 + (imageGalleryThumbnailClickAnalytics == null ? 0 : imageGalleryThumbnailClickAnalytics.hashCode())) * 31;
            ProductDetailsThumbnailClickAnalytics productDetailsThumbnailClickAnalytics = this.g;
            return iHashCode6 + (productDetailsThumbnailClickAnalytics != null ? productDetailsThumbnailClickAnalytics.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("ProductImage(largeUrl=", this.f23493a, ", altText=", this.b, ", imageGalleryClickAnalytics=");
            sbV.append(this.c);
            sbV.append(", imageGalleryScrollAnalytics=");
            sbV.append(this.d);
            sbV.append(", imageGalleryCloseAnalytics=");
            sbV.append(this.e);
            sbV.append(", imageGalleryThumbnailClickAnalytics=");
            sbV.append(this.f);
            sbV.append(", productDetailsThumbnailClickAnalytics=");
            sbV.append(this.g);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$RatingText;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RatingText {

        /* renamed from: a, reason: collision with root package name */
        public final String f23494a;
        public final String b;

        public RatingText(String str, String str2) {
            this.f23494a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RatingText)) {
                return false;
            }
            RatingText ratingText = (RatingText) obj;
            return Intrinsics.c(this.f23494a, ratingText.f23494a) && Intrinsics.c(this.b, ratingText.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23494a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("RatingText(text=", this.f23494a, ", altText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$RatingsAndReviewsPreview;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RatingsAndReviewsPreview {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f23495a;

        public RatingsAndReviewsPreview(ArrayList arrayList) {
            this.f23495a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RatingsAndReviewsPreview) && this.f23495a.equals(((RatingsAndReviewsPreview) obj).f23495a);
        }

        public final int hashCode() {
            return this.f23495a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("RatingsAndReviewsPreview(sections=", ")", this.f23495a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$RatingsAndReviewsSummary;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RatingsAndReviewsSummary {

        /* renamed from: a, reason: collision with root package name */
        public final String f23496a;
        public final OnProductRatingsAndReviewsSummary b;

        public RatingsAndReviewsSummary(String str, OnProductRatingsAndReviewsSummary onProductRatingsAndReviewsSummary) {
            this.f23496a = str;
            this.b = onProductRatingsAndReviewsSummary;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RatingsAndReviewsSummary)) {
                return false;
            }
            RatingsAndReviewsSummary ratingsAndReviewsSummary = (RatingsAndReviewsSummary) obj;
            return Intrinsics.c(this.f23496a, ratingsAndReviewsSummary.f23496a) && Intrinsics.c(this.b, ratingsAndReviewsSummary.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f23496a.hashCode() * 31);
        }

        public final String toString() {
            return "RatingsAndReviewsSummary(__typename=" + this.f23496a + ", onProductRatingsAndReviewsSummary=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$RoundelImage;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RoundelImage {

        /* renamed from: a, reason: collision with root package name */
        public final String f23497a;
        public final String b;
        public final RoundelImagePriority c;

        public RoundelImage(String str, String str2, RoundelImagePriority roundelImagePriority) {
            this.f23497a = str;
            this.b = str2;
            this.c = roundelImagePriority;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RoundelImage)) {
                return false;
            }
            RoundelImage roundelImage = (RoundelImage) obj;
            return Intrinsics.c(this.f23497a, roundelImage.f23497a) && Intrinsics.c(this.b, roundelImage.b) && this.c == roundelImage.c;
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f23497a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sbV = a.v("RoundelImage(url=", this.f23497a, ", altText=", this.b, ", priority=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$RowDetails;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RowDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f23498a;
        public final OnBasicCoreRow b;
        public final OnCoreRowUI c;

        public RowDetails(String __typename, OnBasicCoreRow onBasicCoreRow, OnCoreRowUI onCoreRowUI) {
            Intrinsics.h(__typename, "__typename");
            this.f23498a = __typename;
            this.b = onBasicCoreRow;
            this.c = onCoreRowUI;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RowDetails)) {
                return false;
            }
            RowDetails rowDetails = (RowDetails) obj;
            return Intrinsics.c(this.f23498a, rowDetails.f23498a) && Intrinsics.c(this.b, rowDetails.b) && Intrinsics.c(this.c, rowDetails.c);
        }

        public final int hashCode() {
            int iHashCode = this.f23498a.hashCode() * 31;
            OnBasicCoreRow onBasicCoreRow = this.b;
            int iHashCode2 = (iHashCode + (onBasicCoreRow == null ? 0 : onBasicCoreRow.hashCode())) * 31;
            OnCoreRowUI onCoreRowUI = this.c;
            return iHashCode2 + (onCoreRowUI != null ? onCoreRowUI.hashCode() : 0);
        }

        public final String toString() {
            return "RowDetails(__typename=" + this.f23498a + ", onBasicCoreRow=" + this.b + ", onCoreRowUI=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$RowUI;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RowUI {

        /* renamed from: a, reason: collision with root package name */
        public final LeadingAsset f23499a;
        public final String b;
        public final String c;

        public RowUI(LeadingAsset leadingAsset, String str, String str2) {
            this.f23499a = leadingAsset;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RowUI)) {
                return false;
            }
            RowUI rowUI = (RowUI) obj;
            return Intrinsics.c(this.f23499a, rowUI.f23499a) && Intrinsics.c(this.b, rowUI.b) && Intrinsics.c(this.c, rowUI.c);
        }

        public final int hashCode() {
            LeadingAsset leadingAsset = this.f23499a;
            int iHashCode = (leadingAsset == null ? 0 : leadingAsset.hashCode()) * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RowUI(leadingAsset=");
            sb.append(this.f23499a);
            sb.append(", description=");
            sb.append(this.b);
            sb.append(", label=");
            return a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$RowUI1;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RowUI1 {

        /* renamed from: a, reason: collision with root package name */
        public final LeadingAsset1 f23500a;
        public final String b;
        public final String c;

        public RowUI1(LeadingAsset1 leadingAsset1, String str, String str2) {
            this.f23500a = leadingAsset1;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RowUI1)) {
                return false;
            }
            RowUI1 rowUI1 = (RowUI1) obj;
            return Intrinsics.c(this.f23500a, rowUI1.f23500a) && Intrinsics.c(this.b, rowUI1.b) && Intrinsics.c(this.c, rowUI1.c);
        }

        public final int hashCode() {
            LeadingAsset1 leadingAsset1 = this.f23500a;
            int iHashCode = (leadingAsset1 == null ? 0 : leadingAsset1.hashCode()) * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RowUI1(leadingAsset=");
            sb.append(this.f23500a);
            sb.append(", description=");
            sb.append(this.b);
            sb.append(", label=");
            return a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/product/details/ProductDetailsPageQuery$Section;", "", "product-details_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Section {

        /* renamed from: a, reason: collision with root package name */
        public final String f23501a;
        public final OnRatingsAndReviewsPreviewHeader b;
        public final OnRatingsAndReviewsRatingsDetails c;
        public final OnRatingsAndReviewsReviewDetails d;
        public final OnRatingsAndReviewsPreviewCta e;

        public Section(String __typename, OnRatingsAndReviewsPreviewHeader onRatingsAndReviewsPreviewHeader, OnRatingsAndReviewsRatingsDetails onRatingsAndReviewsRatingsDetails, OnRatingsAndReviewsReviewDetails onRatingsAndReviewsReviewDetails, OnRatingsAndReviewsPreviewCta onRatingsAndReviewsPreviewCta) {
            Intrinsics.h(__typename, "__typename");
            this.f23501a = __typename;
            this.b = onRatingsAndReviewsPreviewHeader;
            this.c = onRatingsAndReviewsRatingsDetails;
            this.d = onRatingsAndReviewsReviewDetails;
            this.e = onRatingsAndReviewsPreviewCta;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            return Intrinsics.c(this.f23501a, section.f23501a) && Intrinsics.c(this.b, section.b) && Intrinsics.c(this.c, section.c) && Intrinsics.c(this.d, section.d) && Intrinsics.c(this.e, section.e);
        }

        public final int hashCode() {
            int iHashCode = this.f23501a.hashCode() * 31;
            OnRatingsAndReviewsPreviewHeader onRatingsAndReviewsPreviewHeader = this.b;
            int iHashCode2 = (iHashCode + (onRatingsAndReviewsPreviewHeader == null ? 0 : onRatingsAndReviewsPreviewHeader.hashCode())) * 31;
            OnRatingsAndReviewsRatingsDetails onRatingsAndReviewsRatingsDetails = this.c;
            int iHashCode3 = (iHashCode2 + (onRatingsAndReviewsRatingsDetails == null ? 0 : onRatingsAndReviewsRatingsDetails.hashCode())) * 31;
            OnRatingsAndReviewsReviewDetails onRatingsAndReviewsReviewDetails = this.d;
            int iHashCode4 = (iHashCode3 + (onRatingsAndReviewsReviewDetails == null ? 0 : onRatingsAndReviewsReviewDetails.hashCode())) * 31;
            OnRatingsAndReviewsPreviewCta onRatingsAndReviewsPreviewCta = this.e;
            return iHashCode4 + (onRatingsAndReviewsPreviewCta != null ? onRatingsAndReviewsPreviewCta.hashCode() : 0);
        }

        public final String toString() {
            return "Section(__typename=" + this.f23501a + ", onRatingsAndReviewsPreviewHeader=" + this.b + ", onRatingsAndReviewsRatingsDetails=" + this.c + ", onRatingsAndReviewsReviewDetails=" + this.d + ", onRatingsAndReviewsPreviewCta=" + this.e + ")";
        }
    }

    public ProductDetailsPageQuery(ProductDetailsPageInput productDetailsPageInput, boolean z, boolean z2, boolean z3, ProductRatingsAndReviewsPreviewInput productRatingsAndReviewsPreviewInput, boolean z4, boolean z5, boolean z6, Optional.Present present, Optional optional, boolean z7, boolean z8) {
        Intrinsics.h(productDetailsPageInput, "productDetailsPageInput");
        this.f23408a = productDetailsPageInput;
        this.b = z;
        this.c = z2;
        this.d = Optional.Absent.f13523a;
        this.e = z3;
        this.f = productRatingsAndReviewsPreviewInput;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = present;
        this.k = optional;
        this.l = z7;
        this.m = z8;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(ProductDetailsPageQuery_ResponseAdapter.Data.f23523a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query productDetailsPage($productDetailsPageInput: ProductDetailsPageInput!, $isRatingsAndReviewsSummaryEnabled: Boolean!, $isRatingsAndReviewsPreviewEnabled: Boolean!, $includeOfferMinimumSpend: Boolean!, $includeAvailabilityInfoStatus: Boolean! = false , $includeProductAvailabilityStates: Boolean!, $productRatingsAndReviewsPreviewInput: ProductRatingsAndReviewsPreviewInput!, $includeActionableCard: Boolean!, $isProductTileUpliftEnabled: Boolean!, $isEverydayMarketPdpUpliftEnabled: Boolean!, $isProductCarouselLazyLoadingEnabled: Boolean! = false , $includePricingFootnote: Boolean! = false , $includeLowestPrice14Days: Boolean!, $includeChatEntryCard: Boolean!) { productDetailsPage(productDetailsPageInput: $productDetailsPageInput) { analytics { __typename ...analyticsFields } impressionAnalytics { __typename ...analyticsFields } items { __typename ... on ProductDetailsCouponBanner @include(if: $isEverydayMarketPdpUpliftEnabled) { productDetailsCouponBanner { couponBannerColorTheme couponBannerCouponCode couponBannerDescription couponBannerMinimumSpend couponBannerCouponCodeAccessibilityLabel couponBannerDescriptionAccessibilityLabel couponBannerTermsAndConditions { url title accessibilityLabel } } } ... on ActionableCard { image altText cardHeight link analytics } ... on BasicCoreBroadcastBanner { broadcastBannerUI { title subtitle style icon { __typename ... on HostedIcon { url } } } broadcastBannerActionLabel broadcastBannerAction { id type action analytics { __typename ...analyticsFields } } } ... on ProductDetailsImages { productImages { largeUrl altText imageGalleryClickAnalytics { __typename ...analyticsFields } imageGalleryScrollAnalytics { __typename ...analyticsFields } imageGalleryCloseAnalytics { __typename ...analyticsFields } imageGalleryThumbnailClickAnalytics { __typename ...analyticsFields } productDetailsThumbnailClickAnalytics { __typename ...analyticsFields } } roundelImages { url altText priority } } ... on BasicInsetAlert { insetAlertUI { title description style } insetAlertAction { id type action analytics { __typename ...analyticsFields } } insetAlertActionLabel } ... on ProductDetailsProductPanel { ratingsAndReviewsSummary @include(if: $isRatingsAndReviewsSummaryEnabled) { __typename ... on ProductRatingsAndReviewsSummary { averageRatings displayRatings maximumRating ratingText { text altText } cta { ctaText { text altText } action { type action id } } } } product { __typename ... on ProductCard { __typename ...productCard } } } ... on ProductOriginAndHealthInfo { countryOfOrigin { url text altText } } ... on ProductDetailsRowAccordion { openActionAnalytics { __typename ...analyticsFields } closeActionAnalytics { __typename ...analyticsFields } rowUI { leadingAsset { __typename ... on HostedIcon { url } ... on CoreIcon { coreIconName } } description label } isExpanded hasTopSeparator expandedContent { __typename ... on ParagraphTextItem { __typename content type } ... on ProductDetailsRowAccordionProductList { __typename productDetailsRowAccordionProductListTextItem { __typename ... on ParagraphTextItem { __typename content type } } productDetailsRowAccordionProductListCta { __typename ... on ContentCta { label url onCtaClickAnalytics { __typename ...analyticsFields } } } productDetailsRowAccordionProductList { __typename ... on HorizontalList { id title subtitle actionTitle deepLink actionPath nodeId @include(if: $isProductCarouselLazyLoadingEnabled) items { __typename ... on ProductCard @skip(if: $isProductTileUpliftEnabled) { __typename ...productCard } ... on ProductTile @include(if: $isProductTileUpliftEnabled) { __typename ...productTile } } } } } } } ... on ProductDetailsRowLink { rowUI { leadingAsset { __typename ... on HostedIcon { url } ... on CoreIcon { coreIconName } } description label } linkContent { __typename ... on ParagraphTextItem { content type } ... on ProductNutritionInfo { productNutritionTitle: title servingsPerPack servingSize servingsHeader servingsRow bottomCaption tableHeaderRow tableRows } ... on InfoSection @include(if: $isEverydayMarketPdpUpliftEnabled) { title items { title description imageUrl } footer { title subtitle linkUrl } } } hasTopSeparator openActionAnalytics { __typename ...analyticsFields } } ... on HorizontalList { id title subtitle actionTitle deepLink actionPath nodeId @include(if: $isProductCarouselLazyLoadingEnabled) items { __typename ... on ProductCard @skip(if: $isProductTileUpliftEnabled) { __typename ...productCard } ... on ProductTile @include(if: $isProductTileUpliftEnabled) { __typename ...productTile } } } ... on ProductDetailsRatingsAndReviewsPreview @include(if: $isRatingsAndReviewsPreviewEnabled) { ratingsAndReviewsPreview { sections { __typename ... on RatingsAndReviewsPreviewHeader { __typename ...ratingsAndReviewsPreviewHeader } ... on RatingsAndReviewsRatingsDetails { __typename ...ratingsAndReviewsRatingsDetails } ... on RatingsAndReviewsReviewDetails { __typename ...ratingsAndReviewsReviewDetails } ... on RatingsAndReviewsPreviewCta { __typename ...ratingsAndReviewsPreviewCta } } } } ... on ProductDetailsCoreRow @include(if: $isEverydayMarketPdpUpliftEnabled) { hasTopSeparator rowDetails { __typename ... on BasicCoreRow { __typename ...basicCoreRow } ... on CoreRowUI { __typename ...coreRowUI } } } ... on ChatEntryCardV3 @include(if: $includeChatEntryCard) { chatEntryCardTitle chatEntryCardShowBeta chatEntryCardSuggestedPrompts chatEntryCardAction { id action type analytics { __typename ...analyticsFields } } } } footer { footerMessage { text altText } productDetailsActions { altText label enabled buttonAction { id action type analytics { __typename ...analyticsFields } } buttonId iconUrl style } } } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment productTrolley on ProductTrolley { minimum maximum increment defaultValue: default unit inTrolley buttonState buttonLabel buttonQuantity title }  fragment productCard on ProductCard { productId name isNew purchaseRestriction productImage isAvailable inStoreAvailabilityInfo @include(if: $includeProductAvailabilityStates) { button { label action style enabled } status @include(if: $includeAvailabilityInfoStatus) infoSheet { title message button { label action style enabled } } } price unitOfMeasureLabel badgeImage promotionInfo { type label } unitPriceDescription wasPrice purchaseWarning inlineLabels { type label priority } trolley { __typename ...productTrolley } trolleys { __typename ...productTrolley } list { minimum maximum increment defaultValue: default unit } inStoreDetails { locationText locationType } inStoreLocation { details { aisleNumber aisleSide bayNumber bayNumberAlternate floorNumber location x y z } displayInfo { locationText locationType } } adId source marketplace { imageUrl title sellerName brandName lowestMarketPriceDescription @include(if: $includeLowestPrice14Days) } rewardsOfferInfo { offerId offerStatus displayStatus displayExpiry minimumSpend @include(if: $includeOfferMinimumSpend) offerAnalytics { offerName campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode } boostButton { label style enabled } } disclaimer tagLabel { text style } productVarieties { totalCount label priceFamilyId } categories { name categoryLevel } isTobacco memberPriceInfo { header title subtitle } multiBuyPriceInfo { price unitPrice } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } productCardAnalytics { __typename ...analyticsFields } productCardAction { action type id analytics { __typename ...analyticsFields } } pricingFootnoteMd @include(if: $includePricingFootnote) }  fragment compatibleColor on CompatibleColor { lightHexCode }  fragment iconFragment on IconAsset { __typename ... on HostedIcon { __typename url } ... on CoreIcon { __typename coreIconName } }  fragment coreTagUI on CoreTagUI { __typename label coreColorTheme { __typename background { __typename ...compatibleColor } foreground { __typename primary { __typename ...compatibleColor } secondary { __typename ...compatibleColor } highlight { __typename ...compatibleColor } } } hasBorder icon { __typename ...iconFragment } }  fragment productTile on ProductTile { productId productName roundelImage { url altText priority } mainProductImage { smallUrl mediumUrl largeUrl altText } productTags { __typename ...coreTagUI } priceInfo { leadPriceHeaderText leadPrice leadPriceMeasure unitPriceDescriptions { text altText } wasPrice { text altText } savePrice { text altText } variablePrice { text altText } priceClarificationMessage { text altText } } productStatuses { text { text altText } colorScheme } middleMessage { text altText } ratingsAndReviews { rating reviewsCount displayText { text altText } } footer { footerText footerIcon { coreIconName } isEnhanced footerAction { type action id } } list { minimum maximum increment defaultValue: default unit } trolleys { __typename ...productTrolley } adId rewardsOfferInfo { offerId } categories { name categoryLevel } source productCardAction { type action id } inStoreInfo { location { displayInfo { locationText locationType } details { x y z aisleSide location aisleNumber bayNumber bayNumberAlternate floorNumber } } availability { button { buttonId label style enabled action url buttonAction { type action id } iconUrl: altText } status infoSheet { title message button { buttonId label style enabled action url buttonAction { type action id } iconUrl altText } } } } marketplaceInfo { iconUrl description { altText text } } restrictionInfo { purchaseRestriction disclaimer isTobacco } }  fragment ratingsAndReviewsPreviewHeader on RatingsAndReviewsPreviewHeader { title subtitle }  fragment ratingsAndReviewsRatingsDetails on RatingsAndReviewsRatingsDetails { sections { __typename ... on RatingsAndReviewsRatingDistributionOverview { averageRating displayRatings ratingText { text altText } maximumRating totalReviewsText cta { linkId linkAction { type action id } linkTextWithAlt { text altText } } } ... on RatingsAndReviewsRatingDistributionDetails { items { ratingScore percentage ratingCount } } ... on RatingsAndReviewsRatingDistributionWriteReview { button { buttonId label enabled buttonAction { type action id } iconUrl altText } } } }  fragment ratingsAndReviewsReviewDetails on RatingsAndReviewsReviewDetails { items { sections { __typename ... on RatingsAndReviewsReviewItemRating { rating maximumRating text } ... on RatingsAndReviewsReviewItemReviewTitle { title } ... on RatingsAndReviewsReviewItemRecommendation { recommendationText: text } ... on RatingsAndReviewsReviewItemInfo { userName createdAt } ... on RatingsAndReviewsReviewItemBody { content } } } }  fragment ratingsAndReviewsPreviewCta on RatingsAndReviewsPreviewCta { button { buttonId label enabled buttonAction { type action id } iconUrl altText } }  fragment coreRowUI on CoreRowUI { overlineText leadingAsset { __typename ... on HostedIcon { url } ... on CoreIcon { coreIconName } } description label trailingAsset { __typename ... on HostedIcon { url } ... on CoreIcon { coreIconName } } trailingText @include(if: $isEverydayMarketPdpUpliftEnabled) }  fragment basicCoreRow on BasicCoreRow { row { __typename ...coreRowUI } action { type action } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProductDetailsPageQuery)) {
            return false;
        }
        ProductDetailsPageQuery productDetailsPageQuery = (ProductDetailsPageQuery) obj;
        return Intrinsics.c(this.f23408a, productDetailsPageQuery.f23408a) && this.b == productDetailsPageQuery.b && this.c == productDetailsPageQuery.c && this.d.equals(productDetailsPageQuery.d) && this.e == productDetailsPageQuery.e && this.f.equals(productDetailsPageQuery.f) && this.g == productDetailsPageQuery.g && this.h == productDetailsPageQuery.h && this.i == productDetailsPageQuery.i && this.j.equals(productDetailsPageQuery.j) && this.k.equals(productDetailsPageQuery.k) && this.l == productDetailsPageQuery.l && this.m == productDetailsPageQuery.m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.m) + b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.k, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.j, b.e(b.e(b.e((this.f.hashCode() + b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.d, b.e(b.e(b.e(this.f23408a.hashCode() * 31, 31, this.b), 31, this.c), 31, true), 31), 31, this.e)) * 31, 31, this.g), 31, this.h), 31, this.i), 31), 31), 31, this.l);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "2a52da91c3bbc85ba3032ae141e30d1c883f56d540004c36a70bfb400b165912";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "productDetailsPage";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("productDetailsPageInput");
        Adapters.c(ProductDetailsPageInput_InputAdapter.f12099a, false).toJson(jsonWriter, customScalarAdapters, this.f23408a);
        jsonWriter.F1("isRatingsAndReviewsSummaryEnabled");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        d.B(this.b, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isRatingsAndReviewsPreviewEnabled");
        d.B(this.c, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeOfferMinimumSpend");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.TRUE);
        Optional optional = this.d;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        } else if (z) {
            jsonWriter.F1("includeAvailabilityInfoStatus");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        jsonWriter.F1("includeProductAvailabilityStates");
        d.B(this.e, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "productRatingsAndReviewsPreviewInput");
        Adapters.c(ProductRatingsAndReviewsPreviewInput_InputAdapter.f12104a, false).toJson(jsonWriter, customScalarAdapters, this.f);
        jsonWriter.F1("includeActionableCard");
        d.B(this.g, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isProductTileUpliftEnabled");
        d.B(this.h, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isEverydayMarketPdpUpliftEnabled");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.i));
        Optional optional2 = this.j;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("isProductCarouselLazyLoadingEnabled");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        } else if (z) {
            jsonWriter.F1("isProductCarouselLazyLoadingEnabled");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional3 = this.k;
        if (optional3 instanceof Optional.Present) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional3);
        } else if (z) {
            jsonWriter.F1("includePricingFootnote");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        jsonWriter.F1("includeLowestPrice14Days");
        d.B(this.l, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeChatEntryCard");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.m));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductDetailsPageQuery(productDetailsPageInput=");
        sb.append(this.f23408a);
        sb.append(", isRatingsAndReviewsSummaryEnabled=");
        sb.append(this.b);
        sb.append(", isRatingsAndReviewsPreviewEnabled=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.z(sb, this.c, ", includeOfferMinimumSpend=true, includeAvailabilityInfoStatus=", this.d, ", includeProductAvailabilityStates=");
        sb.append(this.e);
        sb.append(", productRatingsAndReviewsPreviewInput=");
        sb.append(this.f);
        sb.append(", includeActionableCard=");
        au.com.woolworths.android.onesite.a.D(sb, this.g, ", isProductTileUpliftEnabled=", this.h, ", isEverydayMarketPdpUpliftEnabled=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.z(sb, this.i, ", isProductCarouselLazyLoadingEnabled=", this.j, ", includePricingFootnote=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.y(sb, this.k, ", includeLowestPrice14Days=", this.l, ", includeChatEntryCard=");
        return a.k(")", sb, this.m);
    }
}
