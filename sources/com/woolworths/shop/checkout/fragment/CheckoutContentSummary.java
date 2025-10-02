package com.woolworths.shop.checkout.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.sdui.shop.fragment.AnalyticsFields;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.CheckoutProgressId;
import au.com.woolworths.shop.graphql.type.CheckoutSummaryValueType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import com.apollographql.apollo.api.Fragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bK\b\u0087\b\u0018\u00002\u00020\u0001:J\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJK¨\u0006L"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary;", "Lcom/apollographql/apollo/api/Fragment$Data;", "ProductsInfo", "Message", "LegacyError", "Progress", "Content", "OrderTotalDetails", "IdVerificationBottomSheet", "ImpressionAnalytic1", "RestrictionPrompt", "OnSnackBar", "OnInsetBanner", "OnCheckoutSummaryBillingAddress", "OnCheckoutSummaryBillingAddressEmpty", "OnCheckoutSummaryRewardsUnregistered", "OnCheckoutSummaryRewards", "RewardsSection", "OnCheckoutSummaryRewardsRegistered", "OnCheckoutSummaryRewardsRegisteredRedeemable", "RedeemInfo", "OnCheckoutOrderAddresses", "AddressSection", "OnCheckoutOrderGroceryAddress", "OnCheckoutOrderMarketAddress", "SellerInfo", "InsetBanner", "OnCheckoutOrderSummary", "Section", "Message1", "OnCheckoutTermsConditions", "OnCheckoutPromotionCode", "Discounts", "DiscountItem", "OnCheckoutRewardsAndDiscounts", "RewardsAndDiscount", "OnCheckoutRewards", "ActionClickAnalytics", "RewardsAction", "OnCheckoutRewardsRedeem", "RewardsRedeemInfo", "UnRedeemableBanner", "ImpressionAnalytics", "OnCheckoutRewardsInfo", "ImpressionAnalytics1", "ButtonClickAnalytics", "OnCheckoutRewardsLink", "OnCheckoutPromoCode", "ActionClickAnalytics1", "Detail", "PromoCode", "OnCheckoutPromoCodeItem", "OnCheckoutCredit", "ActionClickAnalytics2", "Detail1", "OnCheckoutCreditEmpty", "OnCheckoutCreditItems", "Item", "OnCheckoutCreditUnavailable", "ImpressionAnalytic", "InlineMessage", "Section1", "Message2", "Total", "RefundInfo", "PrimaryCta", "ReviewProducts", "UnavailableOrderItem", "RestrictedOrderItem", "ExceededSupplyLimitProductGroup", "Product", "RestrictedProductsByDeliveryMethod", "RestrictedProductsByDeliPlatter", "AvailableOrderItem", "PrimaryButton", "SecondaryButton", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CheckoutContentSummary implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final List f22222a;
    public final Message b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final OrderTotalDetails f;
    public final IdVerificationBottomSheet g;
    public final List h;
    public final Boolean i;
    public final RestrictionPrompt j;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$ActionClickAnalytics;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActionClickAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f22223a;
        public final AnalyticsFields b;

        public ActionClickAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f22223a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionClickAnalytics)) {
                return false;
            }
            ActionClickAnalytics actionClickAnalytics = (ActionClickAnalytics) obj;
            return Intrinsics.c(this.f22223a, actionClickAnalytics.f22223a) && Intrinsics.c(this.b, actionClickAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22223a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ActionClickAnalytics(__typename=", this.f22223a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$ActionClickAnalytics1;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActionClickAnalytics1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22224a;
        public final AnalyticsFields b;

        public ActionClickAnalytics1(String str, AnalyticsFields analyticsFields) {
            this.f22224a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionClickAnalytics1)) {
                return false;
            }
            ActionClickAnalytics1 actionClickAnalytics1 = (ActionClickAnalytics1) obj;
            return Intrinsics.c(this.f22224a, actionClickAnalytics1.f22224a) && Intrinsics.c(this.b, actionClickAnalytics1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22224a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ActionClickAnalytics1(__typename=", this.f22224a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$ActionClickAnalytics2;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActionClickAnalytics2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22225a;
        public final AnalyticsFields b;

        public ActionClickAnalytics2(String str, AnalyticsFields analyticsFields) {
            this.f22225a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionClickAnalytics2)) {
                return false;
            }
            ActionClickAnalytics2 actionClickAnalytics2 = (ActionClickAnalytics2) obj;
            return Intrinsics.c(this.f22225a, actionClickAnalytics2.f22225a) && Intrinsics.c(this.b, actionClickAnalytics2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22225a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ActionClickAnalytics2(__typename=", this.f22225a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$AddressSection;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddressSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f22226a;
        public final OnCheckoutOrderGroceryAddress b;
        public final OnCheckoutOrderMarketAddress c;

        public AddressSection(String __typename, OnCheckoutOrderGroceryAddress onCheckoutOrderGroceryAddress, OnCheckoutOrderMarketAddress onCheckoutOrderMarketAddress) {
            Intrinsics.h(__typename, "__typename");
            this.f22226a = __typename;
            this.b = onCheckoutOrderGroceryAddress;
            this.c = onCheckoutOrderMarketAddress;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddressSection)) {
                return false;
            }
            AddressSection addressSection = (AddressSection) obj;
            return Intrinsics.c(this.f22226a, addressSection.f22226a) && Intrinsics.c(this.b, addressSection.b) && Intrinsics.c(this.c, addressSection.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22226a.hashCode() * 31;
            OnCheckoutOrderGroceryAddress onCheckoutOrderGroceryAddress = this.b;
            int iHashCode2 = (iHashCode + (onCheckoutOrderGroceryAddress == null ? 0 : onCheckoutOrderGroceryAddress.hashCode())) * 31;
            OnCheckoutOrderMarketAddress onCheckoutOrderMarketAddress = this.c;
            return iHashCode2 + (onCheckoutOrderMarketAddress != null ? onCheckoutOrderMarketAddress.hashCode() : 0);
        }

        public final String toString() {
            return "AddressSection(__typename=" + this.f22226a + ", onCheckoutOrderGroceryAddress=" + this.b + ", onCheckoutOrderMarketAddress=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$AvailableOrderItem;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AvailableOrderItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f22227a;

        public AvailableOrderItem(String str) {
            this.f22227a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AvailableOrderItem) && Intrinsics.c(this.f22227a, ((AvailableOrderItem) obj).f22227a);
        }

        public final int hashCode() {
            String str = this.f22227a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return a.h("AvailableOrderItem(name=", this.f22227a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$ButtonClickAnalytics;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ButtonClickAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f22228a;
        public final AnalyticsFields b;

        public ButtonClickAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f22228a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ButtonClickAnalytics)) {
                return false;
            }
            ButtonClickAnalytics buttonClickAnalytics = (ButtonClickAnalytics) obj;
            return Intrinsics.c(this.f22228a, buttonClickAnalytics.f22228a) && Intrinsics.c(this.b, buttonClickAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22228a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ButtonClickAnalytics(__typename=", this.f22228a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$Content;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Content {

        /* renamed from: a, reason: collision with root package name */
        public final String f22229a;
        public final OnInsetBanner b;
        public final OnCheckoutSummaryBillingAddress c;
        public final OnCheckoutSummaryBillingAddressEmpty d;
        public final OnCheckoutSummaryRewardsUnregistered e;
        public final OnCheckoutSummaryRewards f;
        public final OnCheckoutOrderAddresses g;
        public final OnCheckoutOrderSummary h;
        public final OnCheckoutTermsConditions i;
        public final OnCheckoutPromotionCode j;
        public final OnCheckoutRewardsAndDiscounts k;

        public Content(String __typename, OnInsetBanner onInsetBanner, OnCheckoutSummaryBillingAddress onCheckoutSummaryBillingAddress, OnCheckoutSummaryBillingAddressEmpty onCheckoutSummaryBillingAddressEmpty, OnCheckoutSummaryRewardsUnregistered onCheckoutSummaryRewardsUnregistered, OnCheckoutSummaryRewards onCheckoutSummaryRewards, OnCheckoutOrderAddresses onCheckoutOrderAddresses, OnCheckoutOrderSummary onCheckoutOrderSummary, OnCheckoutTermsConditions onCheckoutTermsConditions, OnCheckoutPromotionCode onCheckoutPromotionCode, OnCheckoutRewardsAndDiscounts onCheckoutRewardsAndDiscounts) {
            Intrinsics.h(__typename, "__typename");
            this.f22229a = __typename;
            this.b = onInsetBanner;
            this.c = onCheckoutSummaryBillingAddress;
            this.d = onCheckoutSummaryBillingAddressEmpty;
            this.e = onCheckoutSummaryRewardsUnregistered;
            this.f = onCheckoutSummaryRewards;
            this.g = onCheckoutOrderAddresses;
            this.h = onCheckoutOrderSummary;
            this.i = onCheckoutTermsConditions;
            this.j = onCheckoutPromotionCode;
            this.k = onCheckoutRewardsAndDiscounts;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.c(this.f22229a, content.f22229a) && Intrinsics.c(this.b, content.b) && Intrinsics.c(this.c, content.c) && Intrinsics.c(this.d, content.d) && Intrinsics.c(this.e, content.e) && Intrinsics.c(this.f, content.f) && Intrinsics.c(this.g, content.g) && Intrinsics.c(this.h, content.h) && Intrinsics.c(this.i, content.i) && Intrinsics.c(this.j, content.j) && Intrinsics.c(this.k, content.k);
        }

        public final int hashCode() {
            int iHashCode = this.f22229a.hashCode() * 31;
            OnInsetBanner onInsetBanner = this.b;
            int iHashCode2 = (iHashCode + (onInsetBanner == null ? 0 : onInsetBanner.hashCode())) * 31;
            OnCheckoutSummaryBillingAddress onCheckoutSummaryBillingAddress = this.c;
            int iHashCode3 = (iHashCode2 + (onCheckoutSummaryBillingAddress == null ? 0 : onCheckoutSummaryBillingAddress.hashCode())) * 31;
            OnCheckoutSummaryBillingAddressEmpty onCheckoutSummaryBillingAddressEmpty = this.d;
            int iHashCode4 = (iHashCode3 + (onCheckoutSummaryBillingAddressEmpty == null ? 0 : onCheckoutSummaryBillingAddressEmpty.hashCode())) * 31;
            OnCheckoutSummaryRewardsUnregistered onCheckoutSummaryRewardsUnregistered = this.e;
            int iHashCode5 = (iHashCode4 + (onCheckoutSummaryRewardsUnregistered == null ? 0 : onCheckoutSummaryRewardsUnregistered.f22268a.hashCode())) * 31;
            OnCheckoutSummaryRewards onCheckoutSummaryRewards = this.f;
            int iHashCode6 = (iHashCode5 + (onCheckoutSummaryRewards == null ? 0 : onCheckoutSummaryRewards.f22265a.hashCode())) * 31;
            OnCheckoutOrderAddresses onCheckoutOrderAddresses = this.g;
            int iHashCode7 = (iHashCode6 + (onCheckoutOrderAddresses == null ? 0 : onCheckoutOrderAddresses.hashCode())) * 31;
            OnCheckoutOrderSummary onCheckoutOrderSummary = this.h;
            int iHashCode8 = (iHashCode7 + (onCheckoutOrderSummary == null ? 0 : onCheckoutOrderSummary.hashCode())) * 31;
            OnCheckoutTermsConditions onCheckoutTermsConditions = this.i;
            int iHashCode9 = (iHashCode8 + (onCheckoutTermsConditions == null ? 0 : onCheckoutTermsConditions.f22269a.hashCode())) * 31;
            OnCheckoutPromotionCode onCheckoutPromotionCode = this.j;
            int iHashCode10 = (iHashCode9 + (onCheckoutPromotionCode == null ? 0 : onCheckoutPromotionCode.hashCode())) * 31;
            OnCheckoutRewardsAndDiscounts onCheckoutRewardsAndDiscounts = this.k;
            return iHashCode10 + (onCheckoutRewardsAndDiscounts != null ? onCheckoutRewardsAndDiscounts.hashCode() : 0);
        }

        public final String toString() {
            return "Content(__typename=" + this.f22229a + ", onInsetBanner=" + this.b + ", onCheckoutSummaryBillingAddress=" + this.c + ", onCheckoutSummaryBillingAddressEmpty=" + this.d + ", onCheckoutSummaryRewardsUnregistered=" + this.e + ", onCheckoutSummaryRewards=" + this.f + ", onCheckoutOrderAddresses=" + this.g + ", onCheckoutOrderSummary=" + this.h + ", onCheckoutTermsConditions=" + this.i + ", onCheckoutPromotionCode=" + this.j + ", onCheckoutRewardsAndDiscounts=" + this.k + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$Detail;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Detail {

        /* renamed from: a, reason: collision with root package name */
        public final String f22230a;
        public final String b;
        public final ArrayList c;

        public Detail(String str, String str2, ArrayList arrayList) {
            this.f22230a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Detail)) {
                return false;
            }
            Detail detail = (Detail) obj;
            return Intrinsics.c(this.f22230a, detail.f22230a) && this.b.equals(detail.b) && this.c.equals(detail.c);
        }

        public final int hashCode() {
            String str = this.f22230a;
            return this.c.hashCode() + b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", a.v("Detail(placeholderText=", this.f22230a, ", buttonTitle=", this.b, ", promoCodes="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$Detail1;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Detail1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22231a;
        public final OnCheckoutCreditEmpty b;
        public final OnCheckoutCreditItems c;
        public final OnCheckoutCreditUnavailable d;

        public Detail1(String __typename, OnCheckoutCreditEmpty onCheckoutCreditEmpty, OnCheckoutCreditItems onCheckoutCreditItems, OnCheckoutCreditUnavailable onCheckoutCreditUnavailable) {
            Intrinsics.h(__typename, "__typename");
            this.f22231a = __typename;
            this.b = onCheckoutCreditEmpty;
            this.c = onCheckoutCreditItems;
            this.d = onCheckoutCreditUnavailable;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Detail1)) {
                return false;
            }
            Detail1 detail1 = (Detail1) obj;
            return Intrinsics.c(this.f22231a, detail1.f22231a) && Intrinsics.c(this.b, detail1.b) && Intrinsics.c(this.c, detail1.c) && Intrinsics.c(this.d, detail1.d);
        }

        public final int hashCode() {
            int iHashCode = this.f22231a.hashCode() * 31;
            OnCheckoutCreditEmpty onCheckoutCreditEmpty = this.b;
            int iHashCode2 = (iHashCode + (onCheckoutCreditEmpty == null ? 0 : onCheckoutCreditEmpty.hashCode())) * 31;
            OnCheckoutCreditItems onCheckoutCreditItems = this.c;
            int iHashCode3 = (iHashCode2 + (onCheckoutCreditItems == null ? 0 : onCheckoutCreditItems.hashCode())) * 31;
            OnCheckoutCreditUnavailable onCheckoutCreditUnavailable = this.d;
            return iHashCode3 + (onCheckoutCreditUnavailable != null ? onCheckoutCreditUnavailable.hashCode() : 0);
        }

        public final String toString() {
            return "Detail1(__typename=" + this.f22231a + ", onCheckoutCreditEmpty=" + this.b + ", onCheckoutCreditItems=" + this.c + ", onCheckoutCreditUnavailable=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$DiscountItem;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DiscountItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f22232a;
        public final String b;

        public DiscountItem(String str, String str2) {
            this.f22232a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DiscountItem)) {
                return false;
            }
            DiscountItem discountItem = (DiscountItem) obj;
            return Intrinsics.c(this.f22232a, discountItem.f22232a) && Intrinsics.c(this.b, discountItem.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22232a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("DiscountItem(title=", this.f22232a, ", price=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$Discounts;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Discounts {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f22233a;
        public final String b;

        public Discounts(String str, ArrayList arrayList) {
            this.f22233a = arrayList;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Discounts)) {
                return false;
            }
            Discounts discounts = (Discounts) obj;
            return this.f22233a.equals(discounts.f22233a) && this.b.equals(discounts.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22233a.hashCode() * 31);
        }

        public final String toString() {
            return "Discounts(discountItems=" + this.f22233a + ", buttonTitle=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$ExceededSupplyLimitProductGroup;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ExceededSupplyLimitProductGroup {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f22234a;

        public ExceededSupplyLimitProductGroup(ArrayList arrayList) {
            this.f22234a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExceededSupplyLimitProductGroup) && this.f22234a.equals(((ExceededSupplyLimitProductGroup) obj).f22234a);
        }

        public final int hashCode() {
            return this.f22234a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("ExceededSupplyLimitProductGroup(products=", ")", this.f22234a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$IdVerificationBottomSheet;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class IdVerificationBottomSheet {

        /* renamed from: a, reason: collision with root package name */
        public final String f22235a;
        public final String b;
        public final ArrayList c;
        public final PrimaryButton d;
        public final SecondaryButton e;

        public IdVerificationBottomSheet(String str, String str2, ArrayList arrayList, PrimaryButton primaryButton, SecondaryButton secondaryButton) {
            this.f22235a = str;
            this.b = str2;
            this.c = arrayList;
            this.d = primaryButton;
            this.e = secondaryButton;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof IdVerificationBottomSheet)) {
                return false;
            }
            IdVerificationBottomSheet idVerificationBottomSheet = (IdVerificationBottomSheet) obj;
            return this.f22235a.equals(idVerificationBottomSheet.f22235a) && this.b.equals(idVerificationBottomSheet.b) && this.c.equals(idVerificationBottomSheet.c) && Intrinsics.c(this.d, idVerificationBottomSheet.d) && Intrinsics.c(this.e, idVerificationBottomSheet.e);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(b.c(this.f22235a.hashCode() * 31, 31, this.b), 31, this.c);
            PrimaryButton primaryButton = this.d;
            int iHashCode = (iB + (primaryButton == null ? 0 : primaryButton.hashCode())) * 31;
            SecondaryButton secondaryButton = this.e;
            return iHashCode + (secondaryButton != null ? secondaryButton.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("IdVerificationBottomSheet(title=", this.f22235a, ", body=", this.b, ", imageUrls=");
            sbV.append(this.c);
            sbV.append(", primaryButton=");
            sbV.append(this.d);
            sbV.append(", secondaryButton=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$ImpressionAnalytic;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytic {

        /* renamed from: a, reason: collision with root package name */
        public final String f22236a;
        public final AnalyticsFields b;

        public ImpressionAnalytic(String str, AnalyticsFields analyticsFields) {
            this.f22236a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImpressionAnalytic)) {
                return false;
            }
            ImpressionAnalytic impressionAnalytic = (ImpressionAnalytic) obj;
            return Intrinsics.c(this.f22236a, impressionAnalytic.f22236a) && Intrinsics.c(this.b, impressionAnalytic.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22236a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytic(__typename=", this.f22236a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$ImpressionAnalytic1;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytic1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22237a;
        public final AnalyticsFields b;

        public ImpressionAnalytic1(String str, AnalyticsFields analyticsFields) {
            this.f22237a = str;
            this.b = analyticsFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ImpressionAnalytic1)) {
                return false;
            }
            ImpressionAnalytic1 impressionAnalytic1 = (ImpressionAnalytic1) obj;
            return Intrinsics.c(this.f22237a, impressionAnalytic1.f22237a) && Intrinsics.c(this.b, impressionAnalytic1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22237a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytic1(__typename=", this.f22237a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$ImpressionAnalytics;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f22238a;
        public final AnalyticsFields b;

        public ImpressionAnalytics(String str, AnalyticsFields analyticsFields) {
            this.f22238a = str;
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
            return Intrinsics.c(this.f22238a, impressionAnalytics.f22238a) && Intrinsics.c(this.b, impressionAnalytics.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22238a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytics(__typename=", this.f22238a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$ImpressionAnalytics1;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ImpressionAnalytics1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22239a;
        public final AnalyticsFields b;

        public ImpressionAnalytics1(String str, AnalyticsFields analyticsFields) {
            this.f22239a = str;
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
            return Intrinsics.c(this.f22239a, impressionAnalytics1.f22239a) && Intrinsics.c(this.b, impressionAnalytics1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22239a.hashCode() * 31);
        }

        public final String toString() {
            return d.p("ImpressionAnalytics1(__typename=", this.f22239a, ", analyticsFields=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$InlineMessage;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InlineMessage {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f22240a;
        public final String b;

        public InlineMessage(InsetBannerDisplayType insetBannerDisplayType, String str) {
            this.f22240a = insetBannerDisplayType;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InlineMessage)) {
                return false;
            }
            InlineMessage inlineMessage = (InlineMessage) obj;
            return this.f22240a == inlineMessage.f22240a && Intrinsics.c(this.b, inlineMessage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22240a.hashCode() * 31);
        }

        public final String toString() {
            return "InlineMessage(displayType=" + this.f22240a + ", message=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$InsetBanner;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InsetBanner {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f22241a;
        public final String b;

        public InsetBanner(InsetBannerDisplayType insetBannerDisplayType, String str) {
            this.f22241a = insetBannerDisplayType;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InsetBanner)) {
                return false;
            }
            InsetBanner insetBanner = (InsetBanner) obj;
            return this.f22241a == insetBanner.f22241a && Intrinsics.c(this.b, insetBanner.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22241a.hashCode() * 31);
        }

        public final String toString() {
            return "InsetBanner(displayType=" + this.f22241a + ", message=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$Item;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f22242a;
        public final String b;
        public final String c;
        public final String d;
        public final boolean e;
        public final String f;
        public final String g;

        public Item(String str, String str2, String str3, String str4, boolean z, String str5, String str6) {
            this.f22242a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = z;
            this.f = str5;
            this.g = str6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f22242a, item.f22242a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c) && Intrinsics.c(this.d, item.d) && this.e == item.e && Intrinsics.c(this.f, item.f) && Intrinsics.c(this.g, item.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + b.c(b.e(b.c(b.c(b.c(this.f22242a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Item(title=", this.f22242a, ", subtitle=", this.b, ", primaryLabel=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", secondaryLabel=", this.d, ", isApplied=");
            au.com.woolworths.android.onesite.a.y(", code=", this.f, ", amount=", sbV, this.e);
            return a.o(sbV, this.g, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$LegacyError;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LegacyError {

        /* renamed from: a, reason: collision with root package name */
        public final int f22243a;
        public final String b;
        public final String c;

        public LegacyError(int i, String str, String str2) {
            this.f22243a = i;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LegacyError)) {
                return false;
            }
            LegacyError legacyError = (LegacyError) obj;
            return this.f22243a == legacyError.f22243a && Intrinsics.c(this.b, legacyError.b) && Intrinsics.c(this.c, legacyError.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(Integer.hashCode(this.f22243a) * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(androidx.constraintlayout.core.state.a.p("LegacyError(errorCode=", this.f22243a, ", message=", this.b, ", key="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$Message;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Message {

        /* renamed from: a, reason: collision with root package name */
        public final String f22244a;
        public final OnSnackBar b;

        public Message(String __typename, OnSnackBar onSnackBar) {
            Intrinsics.h(__typename, "__typename");
            this.f22244a = __typename;
            this.b = onSnackBar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Message)) {
                return false;
            }
            Message message = (Message) obj;
            return Intrinsics.c(this.f22244a, message.f22244a) && Intrinsics.c(this.b, message.b);
        }

        public final int hashCode() {
            int iHashCode = this.f22244a.hashCode() * 31;
            OnSnackBar onSnackBar = this.b;
            return iHashCode + (onSnackBar == null ? 0 : onSnackBar.hashCode());
        }

        public final String toString() {
            return "Message(__typename=" + this.f22244a + ", onSnackBar=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$Message1;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Message1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22245a;
        public final String b;
        public final String c;

        public Message1(String str, String str2, String str3) {
            this.f22245a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Message1)) {
                return false;
            }
            Message1 message1 = (Message1) obj;
            return Intrinsics.c(this.f22245a, message1.f22245a) && Intrinsics.c(this.b, message1.b) && Intrinsics.c(this.c, message1.c);
        }

        public final int hashCode() {
            String str = this.f22245a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return a.o(a.v("Message1(title=", this.f22245a, ", body=", this.b, ", type="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$Message2;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Message2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22246a;
        public final String b;
        public final String c;

        public Message2(String str, String str2, String str3) {
            this.f22246a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Message2)) {
                return false;
            }
            Message2 message2 = (Message2) obj;
            return Intrinsics.c(this.f22246a, message2.f22246a) && Intrinsics.c(this.b, message2.b) && Intrinsics.c(this.c, message2.c);
        }

        public final int hashCode() {
            String str = this.f22246a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return a.o(a.v("Message2(title=", this.f22246a, ", body=", this.b, ", type="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutCredit;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutCredit {

        /* renamed from: a, reason: collision with root package name */
        public final String f22247a;
        public final String b;
        public final boolean c;
        public final ActionClickAnalytics2 d;
        public final Detail1 e;

        public OnCheckoutCredit(String str, String str2, boolean z, ActionClickAnalytics2 actionClickAnalytics2, Detail1 detail1) {
            this.f22247a = str;
            this.b = str2;
            this.c = z;
            this.d = actionClickAnalytics2;
            this.e = detail1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutCredit)) {
                return false;
            }
            OnCheckoutCredit onCheckoutCredit = (OnCheckoutCredit) obj;
            return Intrinsics.c(this.f22247a, onCheckoutCredit.f22247a) && Intrinsics.c(this.b, onCheckoutCredit.b) && this.c == onCheckoutCredit.c && Intrinsics.c(this.d, onCheckoutCredit.d) && Intrinsics.c(this.e, onCheckoutCredit.e);
        }

        public final int hashCode() {
            int iE = b.e(b.c(this.f22247a.hashCode() * 31, 31, this.b), 31, this.c);
            ActionClickAnalytics2 actionClickAnalytics2 = this.d;
            return this.e.hashCode() + ((iE + (actionClickAnalytics2 == null ? 0 : actionClickAnalytics2.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnCheckoutCredit(title=", this.f22247a, ", description=", this.b, ", appliedIcon=");
            sbV.append(this.c);
            sbV.append(", actionClickAnalytics=");
            sbV.append(this.d);
            sbV.append(", detail=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutCreditEmpty;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutCreditEmpty {

        /* renamed from: a, reason: collision with root package name */
        public final String f22248a;
        public final String b;

        public OnCheckoutCreditEmpty(String str, String str2) {
            this.f22248a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutCreditEmpty)) {
                return false;
            }
            OnCheckoutCreditEmpty onCheckoutCreditEmpty = (OnCheckoutCreditEmpty) obj;
            return Intrinsics.c(this.f22248a, onCheckoutCreditEmpty.f22248a) && Intrinsics.c(this.b, onCheckoutCreditEmpty.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22248a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OnCheckoutCreditEmpty(title=", this.f22248a, ", message=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutCreditItems;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutCreditItems {

        /* renamed from: a, reason: collision with root package name */
        public final String f22249a;
        public final String b;
        public final ArrayList c;

        public OnCheckoutCreditItems(String str, String str2, ArrayList arrayList) {
            this.f22249a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutCreditItems)) {
                return false;
            }
            OnCheckoutCreditItems onCheckoutCreditItems = (OnCheckoutCreditItems) obj;
            return this.f22249a.equals(onCheckoutCreditItems.f22249a) && this.b.equals(onCheckoutCreditItems.b) && this.c.equals(onCheckoutCreditItems.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f22249a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", a.v("OnCheckoutCreditItems(title=", this.f22249a, ", subtitle=", this.b, ", items="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutCreditUnavailable;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutCreditUnavailable {

        /* renamed from: a, reason: collision with root package name */
        public final String f22250a;
        public final String b;
        public final String c;

        public OnCheckoutCreditUnavailable(String str, String str2, String str3) {
            this.f22250a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutCreditUnavailable)) {
                return false;
            }
            OnCheckoutCreditUnavailable onCheckoutCreditUnavailable = (OnCheckoutCreditUnavailable) obj;
            return Intrinsics.c(this.f22250a, onCheckoutCreditUnavailable.f22250a) && Intrinsics.c(this.b, onCheckoutCreditUnavailable.b) && Intrinsics.c(this.c, onCheckoutCreditUnavailable.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f22250a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("OnCheckoutCreditUnavailable(title=", this.f22250a, ", message=", this.b, ", retryButtonTitle="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutOrderAddresses;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutOrderAddresses {

        /* renamed from: a, reason: collision with root package name */
        public final String f22251a;
        public final ArrayList b;
        public final InsetBanner c;

        public OnCheckoutOrderAddresses(String str, ArrayList arrayList, InsetBanner insetBanner) {
            this.f22251a = str;
            this.b = arrayList;
            this.c = insetBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutOrderAddresses)) {
                return false;
            }
            OnCheckoutOrderAddresses onCheckoutOrderAddresses = (OnCheckoutOrderAddresses) obj;
            return this.f22251a.equals(onCheckoutOrderAddresses.f22251a) && this.b.equals(onCheckoutOrderAddresses.b) && Intrinsics.c(this.c, onCheckoutOrderAddresses.c);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(this.f22251a.hashCode() * 31, 31, this.b);
            InsetBanner insetBanner = this.c;
            return iB + (insetBanner == null ? 0 : insetBanner.hashCode());
        }

        public final String toString() {
            StringBuilder sbX = d.x("OnCheckoutOrderAddresses(title=", this.f22251a, ", addressSections=", ", insetBanner=", this.b);
            sbX.append(this.c);
            sbX.append(")");
            return sbX.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutOrderGroceryAddress;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutOrderGroceryAddress {

        /* renamed from: a, reason: collision with root package name */
        public final String f22252a;
        public final String b;
        public final String c;
        public final String d;

        public OnCheckoutOrderGroceryAddress(String str, String str2, String str3, String str4) {
            this.f22252a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutOrderGroceryAddress)) {
                return false;
            }
            OnCheckoutOrderGroceryAddress onCheckoutOrderGroceryAddress = (OnCheckoutOrderGroceryAddress) obj;
            return Intrinsics.c(this.f22252a, onCheckoutOrderGroceryAddress.f22252a) && Intrinsics.c(this.b, onCheckoutOrderGroceryAddress.b) && Intrinsics.c(this.c, onCheckoutOrderGroceryAddress.c) && Intrinsics.c(this.d, onCheckoutOrderGroceryAddress.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + b.c(b.c(this.f22252a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(a.v("OnCheckoutOrderGroceryAddress(title=", this.f22252a, ", addressText=", this.b, ", imageUrl="), this.c, ", fulfilmentWindow=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutOrderMarketAddress;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutOrderMarketAddress {

        /* renamed from: a, reason: collision with root package name */
        public final String f22253a;
        public final String b;
        public final String c;
        public final ArrayList d;

        public OnCheckoutOrderMarketAddress(String str, String str2, String str3, ArrayList arrayList) {
            this.f22253a = str;
            this.b = str2;
            this.c = str3;
            this.d = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutOrderMarketAddress)) {
                return false;
            }
            OnCheckoutOrderMarketAddress onCheckoutOrderMarketAddress = (OnCheckoutOrderMarketAddress) obj;
            return this.f22253a.equals(onCheckoutOrderMarketAddress.f22253a) && this.b.equals(onCheckoutOrderMarketAddress.b) && this.c.equals(onCheckoutOrderMarketAddress.c) && this.d.equals(onCheckoutOrderMarketAddress.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + b.c(b.c(this.f22253a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnCheckoutOrderMarketAddress(title=", this.f22253a, ", addressText=", this.b, ", imageUrl=");
            sbV.append(this.c);
            sbV.append(", sellerInfo=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutOrderSummary;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutOrderSummary {

        /* renamed from: a, reason: collision with root package name */
        public final String f22254a;
        public final ArrayList b;

        public OnCheckoutOrderSummary(String str, ArrayList arrayList) {
            this.f22254a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutOrderSummary)) {
                return false;
            }
            OnCheckoutOrderSummary onCheckoutOrderSummary = (OnCheckoutOrderSummary) obj;
            return this.f22254a.equals(onCheckoutOrderSummary.f22254a) && this.b.equals(onCheckoutOrderSummary.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22254a.hashCode() * 31);
        }

        public final String toString() {
            return d.q("OnCheckoutOrderSummary(title=", this.f22254a, ", sections=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutPromoCode;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutPromoCode {

        /* renamed from: a, reason: collision with root package name */
        public final String f22255a;
        public final String b;
        public final boolean c;
        public final ActionClickAnalytics1 d;
        public final Detail e;

        public OnCheckoutPromoCode(String str, String str2, boolean z, ActionClickAnalytics1 actionClickAnalytics1, Detail detail) {
            this.f22255a = str;
            this.b = str2;
            this.c = z;
            this.d = actionClickAnalytics1;
            this.e = detail;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutPromoCode)) {
                return false;
            }
            OnCheckoutPromoCode onCheckoutPromoCode = (OnCheckoutPromoCode) obj;
            return Intrinsics.c(this.f22255a, onCheckoutPromoCode.f22255a) && Intrinsics.c(this.b, onCheckoutPromoCode.b) && this.c == onCheckoutPromoCode.c && Intrinsics.c(this.d, onCheckoutPromoCode.d) && Intrinsics.c(this.e, onCheckoutPromoCode.e);
        }

        public final int hashCode() {
            int iE = b.e(b.c(this.f22255a.hashCode() * 31, 31, this.b), 31, this.c);
            ActionClickAnalytics1 actionClickAnalytics1 = this.d;
            return this.e.hashCode() + ((iE + (actionClickAnalytics1 == null ? 0 : actionClickAnalytics1.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnCheckoutPromoCode(title=", this.f22255a, ", description=", this.b, ", appliedIcon=");
            sbV.append(this.c);
            sbV.append(", actionClickAnalytics=");
            sbV.append(this.d);
            sbV.append(", detail=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutPromoCodeItem;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutPromoCodeItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f22256a;
        public final String b;
        public final String c;
        public final String d;
        public final boolean e;
        public final String f;

        public OnCheckoutPromoCodeItem(String str, String str2, String str3, String str4, boolean z, String str5) {
            this.f22256a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = z;
            this.f = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutPromoCodeItem)) {
                return false;
            }
            OnCheckoutPromoCodeItem onCheckoutPromoCodeItem = (OnCheckoutPromoCodeItem) obj;
            return Intrinsics.c(this.f22256a, onCheckoutPromoCodeItem.f22256a) && Intrinsics.c(this.b, onCheckoutPromoCodeItem.b) && Intrinsics.c(this.c, onCheckoutPromoCodeItem.c) && Intrinsics.c(this.d, onCheckoutPromoCodeItem.d) && this.e == onCheckoutPromoCodeItem.e && Intrinsics.c(this.f, onCheckoutPromoCodeItem.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + b.e(b.c(b.c(b.c(this.f22256a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnCheckoutPromoCodeItem(title=", this.f22256a, ", subtitle=", this.b, ", primaryLabel=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", secondaryLabel=", this.d, ", isApplied=");
            sbV.append(this.e);
            sbV.append(", code=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutPromotionCode;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutPromotionCode {

        /* renamed from: a, reason: collision with root package name */
        public final String f22257a;
        public final String b;
        public final String c;
        public final Discounts d;

        public OnCheckoutPromotionCode(String str, String str2, String str3, Discounts discounts) {
            this.f22257a = str;
            this.b = str2;
            this.c = str3;
            this.d = discounts;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutPromotionCode)) {
                return false;
            }
            OnCheckoutPromotionCode onCheckoutPromotionCode = (OnCheckoutPromotionCode) obj;
            return Intrinsics.c(this.f22257a, onCheckoutPromotionCode.f22257a) && Intrinsics.c(this.b, onCheckoutPromotionCode.b) && Intrinsics.c(this.c, onCheckoutPromotionCode.c) && Intrinsics.c(this.d, onCheckoutPromotionCode.d);
        }

        public final int hashCode() {
            int iHashCode = this.f22257a.hashCode() * 31;
            String str = this.b;
            int iC = b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
            Discounts discounts = this.d;
            return iC + (discounts != null ? discounts.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnCheckoutPromotionCode(title=", this.f22257a, ", placeholderText=", this.b, ", buttonTitle=");
            sbV.append(this.c);
            sbV.append(", discounts=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutRewards;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutRewards {

        /* renamed from: a, reason: collision with root package name */
        public final String f22258a;
        public final String b;
        public final boolean c;
        public final ActionClickAnalytics d;
        public final RewardsAction e;

        public OnCheckoutRewards(String str, String str2, boolean z, ActionClickAnalytics actionClickAnalytics, RewardsAction rewardsAction) {
            this.f22258a = str;
            this.b = str2;
            this.c = z;
            this.d = actionClickAnalytics;
            this.e = rewardsAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutRewards)) {
                return false;
            }
            OnCheckoutRewards onCheckoutRewards = (OnCheckoutRewards) obj;
            return Intrinsics.c(this.f22258a, onCheckoutRewards.f22258a) && Intrinsics.c(this.b, onCheckoutRewards.b) && this.c == onCheckoutRewards.c && Intrinsics.c(this.d, onCheckoutRewards.d) && Intrinsics.c(this.e, onCheckoutRewards.e);
        }

        public final int hashCode() {
            int iE = b.e(b.c(this.f22258a.hashCode() * 31, 31, this.b), 31, this.c);
            ActionClickAnalytics actionClickAnalytics = this.d;
            int iHashCode = (iE + (actionClickAnalytics == null ? 0 : actionClickAnalytics.hashCode())) * 31;
            RewardsAction rewardsAction = this.e;
            return iHashCode + (rewardsAction != null ? rewardsAction.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnCheckoutRewards(title=", this.f22258a, ", description=", this.b, ", redeemedIcon=");
            sbV.append(this.c);
            sbV.append(", actionClickAnalytics=");
            sbV.append(this.d);
            sbV.append(", rewardsAction=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutRewardsAndDiscounts;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutRewardsAndDiscounts {

        /* renamed from: a, reason: collision with root package name */
        public final String f22259a;
        public final ArrayList b;
        public final List c;

        public OnCheckoutRewardsAndDiscounts(String str, ArrayList arrayList, List list) {
            this.f22259a = str;
            this.b = arrayList;
            this.c = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutRewardsAndDiscounts)) {
                return false;
            }
            OnCheckoutRewardsAndDiscounts onCheckoutRewardsAndDiscounts = (OnCheckoutRewardsAndDiscounts) obj;
            return this.f22259a.equals(onCheckoutRewardsAndDiscounts.f22259a) && this.b.equals(onCheckoutRewardsAndDiscounts.b) && Intrinsics.c(this.c, onCheckoutRewardsAndDiscounts.c);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(this.f22259a.hashCode() * 31, 31, this.b);
            List list = this.c;
            return iB + (list == null ? 0 : list.hashCode());
        }

        public final String toString() {
            return android.support.v4.media.session.a.t(d.x("OnCheckoutRewardsAndDiscounts(title=", this.f22259a, ", rewardsAndDiscounts=", ", impressionAnalytics=", this.b), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutRewardsInfo;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutRewardsInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f22260a;
        public final String b;
        public final String c;
        public final ImpressionAnalytics1 d;
        public final ButtonClickAnalytics e;

        public OnCheckoutRewardsInfo(String str, String str2, String str3, ImpressionAnalytics1 impressionAnalytics1, ButtonClickAnalytics buttonClickAnalytics) {
            this.f22260a = str;
            this.b = str2;
            this.c = str3;
            this.d = impressionAnalytics1;
            this.e = buttonClickAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutRewardsInfo)) {
                return false;
            }
            OnCheckoutRewardsInfo onCheckoutRewardsInfo = (OnCheckoutRewardsInfo) obj;
            return Intrinsics.c(this.f22260a, onCheckoutRewardsInfo.f22260a) && Intrinsics.c(this.b, onCheckoutRewardsInfo.b) && Intrinsics.c(this.c, onCheckoutRewardsInfo.c) && Intrinsics.c(this.d, onCheckoutRewardsInfo.d) && Intrinsics.c(this.e, onCheckoutRewardsInfo.e);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f22260a.hashCode() * 31, 31, this.b), 31, this.c);
            ImpressionAnalytics1 impressionAnalytics1 = this.d;
            int iHashCode = (iC + (impressionAnalytics1 == null ? 0 : impressionAnalytics1.hashCode())) * 31;
            ButtonClickAnalytics buttonClickAnalytics = this.e;
            return iHashCode + (buttonClickAnalytics != null ? buttonClickAnalytics.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnCheckoutRewardsInfo(title=", this.f22260a, ", description=", this.b, ", buttonTitle=");
            sbV.append(this.c);
            sbV.append(", impressionAnalytics=");
            sbV.append(this.d);
            sbV.append(", buttonClickAnalytics=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutRewardsLink;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutRewardsLink {

        /* renamed from: a, reason: collision with root package name */
        public final String f22261a;

        public OnCheckoutRewardsLink(String str) {
            this.f22261a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCheckoutRewardsLink) && Intrinsics.c(this.f22261a, ((OnCheckoutRewardsLink) obj).f22261a);
        }

        public final int hashCode() {
            return this.f22261a.hashCode();
        }

        public final String toString() {
            return a.h("OnCheckoutRewardsLink(__typename=", this.f22261a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutRewardsRedeem;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutRewardsRedeem {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsRedeemInfo f22262a;
        public final String b;
        public final String c;
        public final ImpressionAnalytics d;

        public OnCheckoutRewardsRedeem(RewardsRedeemInfo rewardsRedeemInfo, String str, String str2, ImpressionAnalytics impressionAnalytics) {
            this.f22262a = rewardsRedeemInfo;
            this.b = str;
            this.c = str2;
            this.d = impressionAnalytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutRewardsRedeem)) {
                return false;
            }
            OnCheckoutRewardsRedeem onCheckoutRewardsRedeem = (OnCheckoutRewardsRedeem) obj;
            return Intrinsics.c(this.f22262a, onCheckoutRewardsRedeem.f22262a) && Intrinsics.c(this.b, onCheckoutRewardsRedeem.b) && Intrinsics.c(this.c, onCheckoutRewardsRedeem.c) && Intrinsics.c(this.d, onCheckoutRewardsRedeem.d);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f22262a.hashCode() * 31, 31, this.b), 31, this.c);
            ImpressionAnalytics impressionAnalytics = this.d;
            return iC + (impressionAnalytics == null ? 0 : impressionAnalytics.hashCode());
        }

        public final String toString() {
            return "OnCheckoutRewardsRedeem(rewardsRedeemInfo=" + this.f22262a + ", title=" + this.b + ", description=" + this.c + ", impressionAnalytics=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutSummaryBillingAddress;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutSummaryBillingAddress {

        /* renamed from: a, reason: collision with root package name */
        public final String f22263a;
        public final String b;

        public OnCheckoutSummaryBillingAddress(String str, String str2) {
            this.f22263a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutSummaryBillingAddress)) {
                return false;
            }
            OnCheckoutSummaryBillingAddress onCheckoutSummaryBillingAddress = (OnCheckoutSummaryBillingAddress) obj;
            return Intrinsics.c(this.f22263a, onCheckoutSummaryBillingAddress.f22263a) && Intrinsics.c(this.b, onCheckoutSummaryBillingAddress.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22263a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OnCheckoutSummaryBillingAddress(title=", this.f22263a, ", addressText=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutSummaryBillingAddressEmpty;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutSummaryBillingAddressEmpty {

        /* renamed from: a, reason: collision with root package name */
        public final String f22264a;
        public final String b;
        public final String c;

        public OnCheckoutSummaryBillingAddressEmpty(String str, String str2, String str3) {
            this.f22264a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutSummaryBillingAddressEmpty)) {
                return false;
            }
            OnCheckoutSummaryBillingAddressEmpty onCheckoutSummaryBillingAddressEmpty = (OnCheckoutSummaryBillingAddressEmpty) obj;
            return Intrinsics.c(this.f22264a, onCheckoutSummaryBillingAddressEmpty.f22264a) && Intrinsics.c(this.b, onCheckoutSummaryBillingAddressEmpty.b) && Intrinsics.c(this.c, onCheckoutSummaryBillingAddressEmpty.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f22264a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("OnCheckoutSummaryBillingAddressEmpty(title=", this.f22264a, ", displayName=", this.b, ", buttonText="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutSummaryRewards;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutSummaryRewards {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f22265a;

        public OnCheckoutSummaryRewards(ArrayList arrayList) {
            this.f22265a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCheckoutSummaryRewards) && this.f22265a.equals(((OnCheckoutSummaryRewards) obj).f22265a);
        }

        public final int hashCode() {
            return this.f22265a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("OnCheckoutSummaryRewards(rewardsSections=", ")", this.f22265a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutSummaryRewardsRegistered;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutSummaryRewardsRegistered {

        /* renamed from: a, reason: collision with root package name */
        public final String f22266a;
        public final String b;
        public final String c;

        public OnCheckoutSummaryRewardsRegistered(String str, String str2, String str3) {
            this.f22266a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutSummaryRewardsRegistered)) {
                return false;
            }
            OnCheckoutSummaryRewardsRegistered onCheckoutSummaryRewardsRegistered = (OnCheckoutSummaryRewardsRegistered) obj;
            return Intrinsics.c(this.f22266a, onCheckoutSummaryRewardsRegistered.f22266a) && Intrinsics.c(this.b, onCheckoutSummaryRewardsRegistered.b) && Intrinsics.c(this.c, onCheckoutSummaryRewardsRegistered.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f22266a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("OnCheckoutSummaryRewardsRegistered(title=", this.f22266a, ", subtitle=", this.b, ", imageUrl="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutSummaryRewardsRegisteredRedeemable;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutSummaryRewardsRegisteredRedeemable {

        /* renamed from: a, reason: collision with root package name */
        public final String f22267a;
        public final String b;
        public final boolean c;
        public final RedeemInfo d;

        public OnCheckoutSummaryRewardsRegisteredRedeemable(String str, String str2, boolean z, RedeemInfo redeemInfo) {
            this.f22267a = str;
            this.b = str2;
            this.c = z;
            this.d = redeemInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutSummaryRewardsRegisteredRedeemable)) {
                return false;
            }
            OnCheckoutSummaryRewardsRegisteredRedeemable onCheckoutSummaryRewardsRegisteredRedeemable = (OnCheckoutSummaryRewardsRegisteredRedeemable) obj;
            return Intrinsics.c(this.f22267a, onCheckoutSummaryRewardsRegisteredRedeemable.f22267a) && Intrinsics.c(this.b, onCheckoutSummaryRewardsRegisteredRedeemable.b) && this.c == onCheckoutSummaryRewardsRegisteredRedeemable.c && Intrinsics.c(this.d, onCheckoutSummaryRewardsRegisteredRedeemable.d);
        }

        public final int hashCode() {
            int iE = b.e(b.c(this.f22267a.hashCode() * 31, 31, this.b), 31, this.c);
            RedeemInfo redeemInfo = this.d;
            return iE + (redeemInfo == null ? 0 : redeemInfo.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnCheckoutSummaryRewardsRegisteredRedeemable(redeemText=", this.f22267a, ", buttonTitle=", this.b, ", isRedeemed=");
            sbV.append(this.c);
            sbV.append(", redeemInfo=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutSummaryRewardsUnregistered;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutSummaryRewardsUnregistered {

        /* renamed from: a, reason: collision with root package name */
        public final String f22268a;

        public OnCheckoutSummaryRewardsUnregistered(String str) {
            this.f22268a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCheckoutSummaryRewardsUnregistered) && Intrinsics.c(this.f22268a, ((OnCheckoutSummaryRewardsUnregistered) obj).f22268a);
        }

        public final int hashCode() {
            return this.f22268a.hashCode();
        }

        public final String toString() {
            return a.h("OnCheckoutSummaryRewardsUnregistered(buttonTitle=", this.f22268a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnCheckoutTermsConditions;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutTermsConditions {

        /* renamed from: a, reason: collision with root package name */
        public final String f22269a;

        public OnCheckoutTermsConditions(String str) {
            this.f22269a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCheckoutTermsConditions) && Intrinsics.c(this.f22269a, ((OnCheckoutTermsConditions) obj).f22269a);
        }

        public final int hashCode() {
            return this.f22269a.hashCode();
        }

        public final String toString() {
            return a.h("OnCheckoutTermsConditions(markdownText=", this.f22269a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnInsetBanner;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnInsetBanner {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f22270a;
        public final String b;

        public OnInsetBanner(InsetBannerDisplayType insetBannerDisplayType, String str) {
            this.f22270a = insetBannerDisplayType;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnInsetBanner)) {
                return false;
            }
            OnInsetBanner onInsetBanner = (OnInsetBanner) obj;
            return this.f22270a == onInsetBanner.f22270a && Intrinsics.c(this.b, onInsetBanner.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22270a.hashCode() * 31);
        }

        public final String toString() {
            return "OnInsetBanner(displayType=" + this.f22270a + ", message=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OnSnackBar;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnSnackBar {

        /* renamed from: a, reason: collision with root package name */
        public final String f22271a;
        public final String b;

        public OnSnackBar(String str, String str2) {
            this.f22271a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnSnackBar)) {
                return false;
            }
            OnSnackBar onSnackBar = (OnSnackBar) obj;
            return Intrinsics.c(this.f22271a, onSnackBar.f22271a) && Intrinsics.c(this.b, onSnackBar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22271a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("OnSnackBar(message=", this.f22271a, ", eventSource=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$OrderTotalDetails;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OrderTotalDetails {

        /* renamed from: a, reason: collision with root package name */
        public final InlineMessage f22272a;
        public final ArrayList b;
        public final Total c;
        public final RefundInfo d;
        public final ReviewProducts e;
        public final String f;

        public OrderTotalDetails(InlineMessage inlineMessage, ArrayList arrayList, Total total, RefundInfo refundInfo, ReviewProducts reviewProducts, String str) {
            this.f22272a = inlineMessage;
            this.b = arrayList;
            this.c = total;
            this.d = refundInfo;
            this.e = reviewProducts;
            this.f = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderTotalDetails)) {
                return false;
            }
            OrderTotalDetails orderTotalDetails = (OrderTotalDetails) obj;
            return Intrinsics.c(this.f22272a, orderTotalDetails.f22272a) && this.b.equals(orderTotalDetails.b) && this.c.equals(orderTotalDetails.c) && Intrinsics.c(this.d, orderTotalDetails.d) && Intrinsics.c(this.e, orderTotalDetails.e) && Intrinsics.c(this.f, orderTotalDetails.f);
        }

        public final int hashCode() {
            InlineMessage inlineMessage = this.f22272a;
            int iHashCode = (this.c.hashCode() + androidx.compose.ui.input.pointer.a.b((inlineMessage == null ? 0 : inlineMessage.hashCode()) * 31, 31, this.b)) * 31;
            RefundInfo refundInfo = this.d;
            int iHashCode2 = (iHashCode + (refundInfo == null ? 0 : refundInfo.hashCode())) * 31;
            ReviewProducts reviewProducts = this.e;
            int iHashCode3 = (iHashCode2 + (reviewProducts == null ? 0 : reviewProducts.hashCode())) * 31;
            String str = this.f;
            return iHashCode3 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "OrderTotalDetails(inlineMessage=" + this.f22272a + ", sections=" + this.b + ", total=" + this.c + ", refundInfo=" + this.d + ", reviewProducts=" + this.e + ", panelMarkdown=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$PrimaryButton;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrimaryButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f22273a;
        public final ButtonStyle b;
        public final boolean c;

        public PrimaryButton(String str, ButtonStyle buttonStyle, boolean z) {
            this.f22273a = str;
            this.b = buttonStyle;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrimaryButton)) {
                return false;
            }
            PrimaryButton primaryButton = (PrimaryButton) obj;
            return Intrinsics.c(this.f22273a, primaryButton.f22273a) && this.b == primaryButton.b && this.c == primaryButton.c;
        }

        public final int hashCode() {
            int iHashCode = this.f22273a.hashCode() * 31;
            ButtonStyle buttonStyle = this.b;
            return Boolean.hashCode(this.c) + ((iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31);
        }

        public final String toString() {
            return a.k(")", au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.q("PrimaryButton(label=", this.f22273a, ", style=", this.b, ", enabled="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$PrimaryCta;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrimaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f22274a;

        public PrimaryCta(String str) {
            this.f22274a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PrimaryCta) && Intrinsics.c(this.f22274a, ((PrimaryCta) obj).f22274a);
        }

        public final int hashCode() {
            return this.f22274a.hashCode();
        }

        public final String toString() {
            return a.h("PrimaryCta(label=", this.f22274a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$Product;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Product {

        /* renamed from: a, reason: collision with root package name */
        public final String f22275a;

        public Product(String str) {
            this.f22275a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Product) && Intrinsics.c(this.f22275a, ((Product) obj).f22275a);
        }

        public final int hashCode() {
            String str = this.f22275a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return a.h("Product(name=", this.f22275a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$ProductsInfo;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductsInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f22276a;
        public final String b;
        public final double c;
        public final double d;
        public final double e;
        public final boolean f;
        public final String g;
        public final String h;
        public final String i;

        public ProductsInfo(String str, String str2, double d, double d2, double d3, boolean z, String str3, String str4, String str5) {
            this.f22276a = str;
            this.b = str2;
            this.c = d;
            this.d = d2;
            this.e = d3;
            this.f = z;
            this.g = str3;
            this.h = str4;
            this.i = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductsInfo)) {
                return false;
            }
            ProductsInfo productsInfo = (ProductsInfo) obj;
            return Intrinsics.c(this.f22276a, productsInfo.f22276a) && Intrinsics.c(this.b, productsInfo.b) && Double.compare(this.c, productsInfo.c) == 0 && Double.compare(this.d, productsInfo.d) == 0 && Double.compare(this.e, productsInfo.e) == 0 && this.f == productsInfo.f && Intrinsics.c(this.g, productsInfo.g) && Intrinsics.c(this.h, productsInfo.h) && Intrinsics.c(this.i, productsInfo.i);
        }

        public final int hashCode() {
            int iE = b.e(android.support.v4.media.session.a.a(this.e, android.support.v4.media.session.a.a(this.d, android.support.v4.media.session.a.a(this.c, b.c(this.f22276a.hashCode() * 31, 31, this.b), 31), 31), 31), 31, this.f);
            String str = this.g;
            int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.h;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.i;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("ProductsInfo(productId=", this.f22276a, ", productName=", this.b, ", price=");
            sbV.append(this.c);
            au.com.woolworths.android.onesite.a.z(sbV, ", quantity=", this.d, ", subtotal=");
            sbV.append(this.e);
            sbV.append(", isAvailable=");
            sbV.append(this.f);
            androidx.constraintlayout.core.state.a.B(sbV, ", sellerName=", this.g, ", brandName=", this.h);
            return a.p(sbV, ", dispatchNote=", this.i, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$Progress;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Progress {

        /* renamed from: a, reason: collision with root package name */
        public final String f22277a;
        public final CheckoutProgressId b;
        public final String c;

        public Progress(String str, CheckoutProgressId checkoutProgressId, String str2) {
            this.f22277a = str;
            this.b = checkoutProgressId;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Progress)) {
                return false;
            }
            Progress progress = (Progress) obj;
            return Intrinsics.c(this.f22277a, progress.f22277a) && this.b == progress.b && Intrinsics.c(this.c, progress.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.f22277a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Progress(index=");
            sb.append(this.f22277a);
            sb.append(", id=");
            sb.append(this.b);
            sb.append(", title=");
            return a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$PromoCode;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PromoCode {

        /* renamed from: a, reason: collision with root package name */
        public final String f22278a;
        public final OnCheckoutPromoCodeItem b;

        public PromoCode(String __typename, OnCheckoutPromoCodeItem onCheckoutPromoCodeItem) {
            Intrinsics.h(__typename, "__typename");
            this.f22278a = __typename;
            this.b = onCheckoutPromoCodeItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PromoCode)) {
                return false;
            }
            PromoCode promoCode = (PromoCode) obj;
            return Intrinsics.c(this.f22278a, promoCode.f22278a) && Intrinsics.c(this.b, promoCode.b);
        }

        public final int hashCode() {
            int iHashCode = this.f22278a.hashCode() * 31;
            OnCheckoutPromoCodeItem onCheckoutPromoCodeItem = this.b;
            return iHashCode + (onCheckoutPromoCodeItem == null ? 0 : onCheckoutPromoCodeItem.hashCode());
        }

        public final String toString() {
            return "PromoCode(__typename=" + this.f22278a + ", onCheckoutPromoCodeItem=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$RedeemInfo;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RedeemInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f22279a;
        public final String b;
        public final String c;
        public final String d;

        public RedeemInfo(String str, String str2, String str3, String str4) {
            this.f22279a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RedeemInfo)) {
                return false;
            }
            RedeemInfo redeemInfo = (RedeemInfo) obj;
            return Intrinsics.c(this.f22279a, redeemInfo.f22279a) && Intrinsics.c(this.b, redeemInfo.b) && Intrinsics.c(this.c, redeemInfo.c) && Intrinsics.c(this.d, redeemInfo.d);
        }

        public final int hashCode() {
            int iC = b.c(b.c(this.f22279a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(a.v("RedeemInfo(title=", this.f22279a, ", message=", this.b, ", buttonTitle="), this.c, ", secondaryButtonTitle=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$RefundInfo;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RefundInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f22280a;
        public final String b;
        public final PrimaryCta c;

        public RefundInfo(String str, String str2, PrimaryCta primaryCta) {
            this.f22280a = str;
            this.b = str2;
            this.c = primaryCta;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RefundInfo)) {
                return false;
            }
            RefundInfo refundInfo = (RefundInfo) obj;
            return Intrinsics.c(this.f22280a, refundInfo.f22280a) && Intrinsics.c(this.b, refundInfo.b) && Intrinsics.c(this.c, refundInfo.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f22280a.hashCode() * 31, 31, this.b);
            PrimaryCta primaryCta = this.c;
            return iC + (primaryCta == null ? 0 : primaryCta.f22274a.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("RefundInfo(bottomSheetTitle=", this.f22280a, ", bottomSheetBody=", this.b, ", primaryCta=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$RestrictedOrderItem;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RestrictedOrderItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f22281a;

        public RestrictedOrderItem(String str) {
            this.f22281a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RestrictedOrderItem) && Intrinsics.c(this.f22281a, ((RestrictedOrderItem) obj).f22281a);
        }

        public final int hashCode() {
            String str = this.f22281a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return a.h("RestrictedOrderItem(name=", this.f22281a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$RestrictedProductsByDeliPlatter;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RestrictedProductsByDeliPlatter {

        /* renamed from: a, reason: collision with root package name */
        public final String f22282a;

        public RestrictedProductsByDeliPlatter(String str) {
            this.f22282a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RestrictedProductsByDeliPlatter) && Intrinsics.c(this.f22282a, ((RestrictedProductsByDeliPlatter) obj).f22282a);
        }

        public final int hashCode() {
            String str = this.f22282a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return a.h("RestrictedProductsByDeliPlatter(name=", this.f22282a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$RestrictedProductsByDeliveryMethod;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RestrictedProductsByDeliveryMethod {

        /* renamed from: a, reason: collision with root package name */
        public final String f22283a;

        public RestrictedProductsByDeliveryMethod(String str) {
            this.f22283a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RestrictedProductsByDeliveryMethod) && Intrinsics.c(this.f22283a, ((RestrictedProductsByDeliveryMethod) obj).f22283a);
        }

        public final int hashCode() {
            String str = this.f22283a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return a.h("RestrictedProductsByDeliveryMethod(name=", this.f22283a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$RestrictionPrompt;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RestrictionPrompt {

        /* renamed from: a, reason: collision with root package name */
        public final String f22284a;
        public final String b;

        public RestrictionPrompt(String str, String str2) {
            this.f22284a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RestrictionPrompt)) {
                return false;
            }
            RestrictionPrompt restrictionPrompt = (RestrictionPrompt) obj;
            return Intrinsics.c(this.f22284a, restrictionPrompt.f22284a) && Intrinsics.c(this.b, restrictionPrompt.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22284a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("RestrictionPrompt(title=", this.f22284a, ", message=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$ReviewProducts;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ReviewProducts {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f22285a;
        public final ArrayList b;
        public final ArrayList c;
        public final ArrayList d;
        public final ArrayList e;
        public final ArrayList f;

        public ReviewProducts(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
            this.f22285a = arrayList;
            this.b = arrayList2;
            this.c = arrayList3;
            this.d = arrayList4;
            this.e = arrayList5;
            this.f = arrayList6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReviewProducts)) {
                return false;
            }
            ReviewProducts reviewProducts = (ReviewProducts) obj;
            return this.f22285a.equals(reviewProducts.f22285a) && this.b.equals(reviewProducts.b) && this.c.equals(reviewProducts.c) && this.d.equals(reviewProducts.d) && this.e.equals(reviewProducts.e) && this.f.equals(reviewProducts.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b(this.f22285a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            return "ReviewProducts(unavailableOrderItems=" + this.f22285a + ", restrictedOrderItems=" + this.b + ", exceededSupplyLimitProductGroups=" + this.c + ", restrictedProductsByDeliveryMethod=" + this.d + ", restrictedProductsByDeliPlatter=" + this.e + ", availableOrderItems=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$RewardsAction;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f22286a;
        public final OnCheckoutRewardsRedeem b;
        public final OnCheckoutRewardsInfo c;
        public final OnCheckoutRewardsLink d;

        public RewardsAction(String __typename, OnCheckoutRewardsRedeem onCheckoutRewardsRedeem, OnCheckoutRewardsInfo onCheckoutRewardsInfo, OnCheckoutRewardsLink onCheckoutRewardsLink) {
            Intrinsics.h(__typename, "__typename");
            this.f22286a = __typename;
            this.b = onCheckoutRewardsRedeem;
            this.c = onCheckoutRewardsInfo;
            this.d = onCheckoutRewardsLink;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RewardsAction)) {
                return false;
            }
            RewardsAction rewardsAction = (RewardsAction) obj;
            return Intrinsics.c(this.f22286a, rewardsAction.f22286a) && Intrinsics.c(this.b, rewardsAction.b) && Intrinsics.c(this.c, rewardsAction.c) && Intrinsics.c(this.d, rewardsAction.d);
        }

        public final int hashCode() {
            int iHashCode = this.f22286a.hashCode() * 31;
            OnCheckoutRewardsRedeem onCheckoutRewardsRedeem = this.b;
            int iHashCode2 = (iHashCode + (onCheckoutRewardsRedeem == null ? 0 : onCheckoutRewardsRedeem.hashCode())) * 31;
            OnCheckoutRewardsInfo onCheckoutRewardsInfo = this.c;
            int iHashCode3 = (iHashCode2 + (onCheckoutRewardsInfo == null ? 0 : onCheckoutRewardsInfo.hashCode())) * 31;
            OnCheckoutRewardsLink onCheckoutRewardsLink = this.d;
            return iHashCode3 + (onCheckoutRewardsLink != null ? onCheckoutRewardsLink.f22261a.hashCode() : 0);
        }

        public final String toString() {
            return "RewardsAction(__typename=" + this.f22286a + ", onCheckoutRewardsRedeem=" + this.b + ", onCheckoutRewardsInfo=" + this.c + ", onCheckoutRewardsLink=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$RewardsAndDiscount;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsAndDiscount {

        /* renamed from: a, reason: collision with root package name */
        public final String f22287a;
        public final OnCheckoutRewards b;
        public final OnCheckoutPromoCode c;
        public final OnCheckoutCredit d;

        public RewardsAndDiscount(String __typename, OnCheckoutRewards onCheckoutRewards, OnCheckoutPromoCode onCheckoutPromoCode, OnCheckoutCredit onCheckoutCredit) {
            Intrinsics.h(__typename, "__typename");
            this.f22287a = __typename;
            this.b = onCheckoutRewards;
            this.c = onCheckoutPromoCode;
            this.d = onCheckoutCredit;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RewardsAndDiscount)) {
                return false;
            }
            RewardsAndDiscount rewardsAndDiscount = (RewardsAndDiscount) obj;
            return Intrinsics.c(this.f22287a, rewardsAndDiscount.f22287a) && Intrinsics.c(this.b, rewardsAndDiscount.b) && Intrinsics.c(this.c, rewardsAndDiscount.c) && Intrinsics.c(this.d, rewardsAndDiscount.d);
        }

        public final int hashCode() {
            int iHashCode = this.f22287a.hashCode() * 31;
            OnCheckoutRewards onCheckoutRewards = this.b;
            int iHashCode2 = (iHashCode + (onCheckoutRewards == null ? 0 : onCheckoutRewards.hashCode())) * 31;
            OnCheckoutPromoCode onCheckoutPromoCode = this.c;
            int iHashCode3 = (iHashCode2 + (onCheckoutPromoCode == null ? 0 : onCheckoutPromoCode.hashCode())) * 31;
            OnCheckoutCredit onCheckoutCredit = this.d;
            return iHashCode3 + (onCheckoutCredit != null ? onCheckoutCredit.hashCode() : 0);
        }

        public final String toString() {
            return "RewardsAndDiscount(__typename=" + this.f22287a + ", onCheckoutRewards=" + this.b + ", onCheckoutPromoCode=" + this.c + ", onCheckoutCredit=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$RewardsRedeemInfo;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsRedeemInfo {

        /* renamed from: a, reason: collision with root package name */
        public final int f22288a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final UnRedeemableBanner f;

        public RewardsRedeemInfo(int i, int i2, int i3, int i4, int i5, UnRedeemableBanner unRedeemableBanner) {
            this.f22288a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = unRedeemableBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RewardsRedeemInfo)) {
                return false;
            }
            RewardsRedeemInfo rewardsRedeemInfo = (RewardsRedeemInfo) obj;
            return this.f22288a == rewardsRedeemInfo.f22288a && this.b == rewardsRedeemInfo.b && this.c == rewardsRedeemInfo.c && this.d == rewardsRedeemInfo.d && this.e == rewardsRedeemInfo.e && Intrinsics.c(this.f, rewardsRedeemInfo.f);
        }

        public final int hashCode() {
            int iA = b.a(this.e, b.a(this.d, b.a(this.c, b.a(this.b, Integer.hashCode(this.f22288a) * 31, 31), 31), 31), 31);
            UnRedeemableBanner unRedeemableBanner = this.f;
            return iA + (unRedeemableBanner == null ? 0 : unRedeemableBanner.hashCode());
        }

        public final String toString() {
            StringBuilder sbQ = a.q(this.f22288a, this.b, "RewardsRedeemInfo(minimum=", ", maximum=", ", maximumRedeemable=");
            a.w(this.c, this.d, ", increment=", ", current=", sbQ);
            sbQ.append(this.e);
            sbQ.append(", unRedeemableBanner=");
            sbQ.append(this.f);
            sbQ.append(")");
            return sbQ.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$RewardsSection;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f22289a;
        public final OnCheckoutSummaryRewardsRegistered b;
        public final OnCheckoutSummaryRewardsRegisteredRedeemable c;

        public RewardsSection(String __typename, OnCheckoutSummaryRewardsRegistered onCheckoutSummaryRewardsRegistered, OnCheckoutSummaryRewardsRegisteredRedeemable onCheckoutSummaryRewardsRegisteredRedeemable) {
            Intrinsics.h(__typename, "__typename");
            this.f22289a = __typename;
            this.b = onCheckoutSummaryRewardsRegistered;
            this.c = onCheckoutSummaryRewardsRegisteredRedeemable;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RewardsSection)) {
                return false;
            }
            RewardsSection rewardsSection = (RewardsSection) obj;
            return Intrinsics.c(this.f22289a, rewardsSection.f22289a) && Intrinsics.c(this.b, rewardsSection.b) && Intrinsics.c(this.c, rewardsSection.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22289a.hashCode() * 31;
            OnCheckoutSummaryRewardsRegistered onCheckoutSummaryRewardsRegistered = this.b;
            int iHashCode2 = (iHashCode + (onCheckoutSummaryRewardsRegistered == null ? 0 : onCheckoutSummaryRewardsRegistered.hashCode())) * 31;
            OnCheckoutSummaryRewardsRegisteredRedeemable onCheckoutSummaryRewardsRegisteredRedeemable = this.c;
            return iHashCode2 + (onCheckoutSummaryRewardsRegisteredRedeemable != null ? onCheckoutSummaryRewardsRegisteredRedeemable.hashCode() : 0);
        }

        public final String toString() {
            return "RewardsSection(__typename=" + this.f22289a + ", onCheckoutSummaryRewardsRegistered=" + this.b + ", onCheckoutSummaryRewardsRegisteredRedeemable=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$SecondaryButton;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SecondaryButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f22290a;
        public final ButtonStyle b;
        public final boolean c;

        public SecondaryButton(String str, ButtonStyle buttonStyle, boolean z) {
            this.f22290a = str;
            this.b = buttonStyle;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SecondaryButton)) {
                return false;
            }
            SecondaryButton secondaryButton = (SecondaryButton) obj;
            return Intrinsics.c(this.f22290a, secondaryButton.f22290a) && this.b == secondaryButton.b && this.c == secondaryButton.c;
        }

        public final int hashCode() {
            int iHashCode = this.f22290a.hashCode() * 31;
            ButtonStyle buttonStyle = this.b;
            return Boolean.hashCode(this.c) + ((iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31);
        }

        public final String toString() {
            return a.k(")", au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.q("SecondaryButton(label=", this.f22290a, ", style=", this.b, ", enabled="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$Section;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Section {

        /* renamed from: a, reason: collision with root package name */
        public final String f22291a;
        public final CheckoutSummaryValueType b;
        public final String c;
        public final CheckoutSummaryValueType d;
        public final String e;
        public final Message1 f;

        public Section(String str, CheckoutSummaryValueType checkoutSummaryValueType, String str2, CheckoutSummaryValueType checkoutSummaryValueType2, String str3, Message1 message1) {
            this.f22291a = str;
            this.b = checkoutSummaryValueType;
            this.c = str2;
            this.d = checkoutSummaryValueType2;
            this.e = str3;
            this.f = message1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            return Intrinsics.c(this.f22291a, section.f22291a) && this.b == section.b && Intrinsics.c(this.c, section.c) && this.d == section.d && Intrinsics.c(this.e, section.e) && Intrinsics.c(this.f, section.f);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + b.c((this.b.hashCode() + (this.f22291a.hashCode() * 31)) * 31, 31, this.c)) * 31;
            String str = this.e;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Message1 message1 = this.f;
            return iHashCode2 + (message1 != null ? message1.hashCode() : 0);
        }

        public final String toString() {
            return "Section(title=" + this.f22291a + ", titleType=" + this.b + ", value=" + this.c + ", valueType=" + this.d + ", imageUrl=" + this.e + ", message=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$Section1;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Section1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22292a;
        public final CheckoutSummaryValueType b;
        public final String c;
        public final CheckoutSummaryValueType d;
        public final String e;
        public final Message2 f;

        public Section1(String str, CheckoutSummaryValueType checkoutSummaryValueType, String str2, CheckoutSummaryValueType checkoutSummaryValueType2, String str3, Message2 message2) {
            this.f22292a = str;
            this.b = checkoutSummaryValueType;
            this.c = str2;
            this.d = checkoutSummaryValueType2;
            this.e = str3;
            this.f = message2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Section1)) {
                return false;
            }
            Section1 section1 = (Section1) obj;
            return Intrinsics.c(this.f22292a, section1.f22292a) && this.b == section1.b && Intrinsics.c(this.c, section1.c) && this.d == section1.d && Intrinsics.c(this.e, section1.e) && Intrinsics.c(this.f, section1.f);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + b.c((this.b.hashCode() + (this.f22292a.hashCode() * 31)) * 31, 31, this.c)) * 31;
            String str = this.e;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Message2 message2 = this.f;
            return iHashCode2 + (message2 != null ? message2.hashCode() : 0);
        }

        public final String toString() {
            return "Section1(title=" + this.f22292a + ", titleType=" + this.b + ", value=" + this.c + ", valueType=" + this.d + ", imageUrl=" + this.e + ", message=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$SellerInfo;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SellerInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f22293a;
        public final String b;

        public SellerInfo(String str, String str2) {
            this.f22293a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SellerInfo)) {
                return false;
            }
            SellerInfo sellerInfo = (SellerInfo) obj;
            return Intrinsics.c(this.f22293a, sellerInfo.f22293a) && Intrinsics.c(this.b, sellerInfo.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22293a.hashCode() * 31);
        }

        public final String toString() {
            return a.j("SellerInfo(sellerName=", this.f22293a, ", dispatchNote=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$Total;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Total {

        /* renamed from: a, reason: collision with root package name */
        public final String f22294a;
        public final String b;
        public final double c;
        public final String d;
        public final CheckoutProgressId e;
        public final boolean f;

        public Total(String str, String str2, double d, String str3, CheckoutProgressId checkoutProgressId, boolean z) {
            this.f22294a = str;
            this.b = str2;
            this.c = d;
            this.d = str3;
            this.e = checkoutProgressId;
            this.f = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Total)) {
                return false;
            }
            Total total = (Total) obj;
            return Intrinsics.c(this.f22294a, total.f22294a) && Intrinsics.c(this.b, total.b) && Double.compare(this.c, total.c) == 0 && Intrinsics.c(this.d, total.d) && this.e == total.e && this.f == total.f;
        }

        public final int hashCode() {
            int iC = b.c(android.support.v4.media.session.a.a(this.c, b.c(this.f22294a.hashCode() * 31, 31, this.b), 31), 31, this.d);
            CheckoutProgressId checkoutProgressId = this.e;
            return Boolean.hashCode(this.f) + ((iC + (checkoutProgressId == null ? 0 : checkoutProgressId.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Total(title=", this.f22294a, ", value=", this.b, ", balanceToPay=");
            sbV.append(this.c);
            sbV.append(", buttonTitle=");
            sbV.append(this.d);
            sbV.append(", progressId=");
            sbV.append(this.e);
            sbV.append(", isEnabled=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$UnRedeemableBanner;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnRedeemableBanner {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f22295a;
        public final String b;

        public UnRedeemableBanner(InsetBannerDisplayType insetBannerDisplayType, String str) {
            this.f22295a = insetBannerDisplayType;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UnRedeemableBanner)) {
                return false;
            }
            UnRedeemableBanner unRedeemableBanner = (UnRedeemableBanner) obj;
            return this.f22295a == unRedeemableBanner.f22295a && Intrinsics.c(this.b, unRedeemableBanner.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22295a.hashCode() * 31);
        }

        public final String toString() {
            return "UnRedeemableBanner(displayType=" + this.f22295a + ", message=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContentSummary$UnavailableOrderItem;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnavailableOrderItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f22296a;

        public UnavailableOrderItem(String str) {
            this.f22296a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnavailableOrderItem) && Intrinsics.c(this.f22296a, ((UnavailableOrderItem) obj).f22296a);
        }

        public final int hashCode() {
            String str = this.f22296a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return a.h("UnavailableOrderItem(name=", this.f22296a, ")");
        }
    }

    public CheckoutContentSummary(List list, Message message, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, OrderTotalDetails orderTotalDetails, IdVerificationBottomSheet idVerificationBottomSheet, List list2, Boolean bool, RestrictionPrompt restrictionPrompt) {
        this.f22222a = list;
        this.b = message;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = orderTotalDetails;
        this.g = idVerificationBottomSheet;
        this.h = list2;
        this.i = bool;
        this.j = restrictionPrompt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutContentSummary)) {
            return false;
        }
        CheckoutContentSummary checkoutContentSummary = (CheckoutContentSummary) obj;
        return Intrinsics.c(this.f22222a, checkoutContentSummary.f22222a) && Intrinsics.c(this.b, checkoutContentSummary.b) && this.c.equals(checkoutContentSummary.c) && this.d.equals(checkoutContentSummary.d) && this.e.equals(checkoutContentSummary.e) && this.f.equals(checkoutContentSummary.f) && Intrinsics.c(this.g, checkoutContentSummary.g) && Intrinsics.c(this.h, checkoutContentSummary.h) && Intrinsics.c(this.i, checkoutContentSummary.i) && Intrinsics.c(this.j, checkoutContentSummary.j);
    }

    public final int hashCode() {
        List list = this.f22222a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Message message = this.b;
        int iHashCode2 = (this.f.hashCode() + androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b((iHashCode + (message == null ? 0 : message.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e)) * 31;
        IdVerificationBottomSheet idVerificationBottomSheet = this.g;
        int iHashCode3 = (iHashCode2 + (idVerificationBottomSheet == null ? 0 : idVerificationBottomSheet.hashCode())) * 31;
        List list2 = this.h;
        int iHashCode4 = (iHashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.i;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        RestrictionPrompt restrictionPrompt = this.j;
        return iHashCode5 + (restrictionPrompt != null ? restrictionPrompt.hashCode() : 0);
    }

    public final String toString() {
        return "CheckoutContentSummary(productsInfo=" + this.f22222a + ", message=" + this.b + ", legacyErrors=" + this.c + ", progress=" + this.d + ", content=" + this.e + ", orderTotalDetails=" + this.f + ", idVerificationBottomSheet=" + this.g + ", impressionAnalytics=" + this.h + ", isUserWPayMigrated=" + this.i + ", restrictionPrompt=" + this.j + ")";
    }
}
