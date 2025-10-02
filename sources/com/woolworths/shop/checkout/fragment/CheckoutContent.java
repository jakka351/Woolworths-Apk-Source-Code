package com.woolworths.shop.checkout.fragment;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.shop.graphql.type.AddressType;
import au.com.woolworths.shop.graphql.type.BroadcastBannerType;
import au.com.woolworths.shop.graphql.type.ButtonStyle;
import au.com.woolworths.shop.graphql.type.CheckoutDeliveryPreferenceId;
import au.com.woolworths.shop.graphql.type.CheckoutProgressId;
import au.com.woolworths.shop.graphql.type.CheckoutSummaryValueType;
import au.com.woolworths.shop.graphql.type.CollectionModeId;
import au.com.woolworths.shop.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.shop.graphql.type.InsetBannerActionType;
import au.com.woolworths.shop.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.shop.graphql.type.MarketFulfilmentAddressStatus;
import au.com.woolworths.shop.graphql.type.SubstitutionState;
import com.apollographql.apollo.api.Fragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bP\b\u0087\b\u0018\u00002\u00020\u0001:O\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOP¨\u0006Q"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent;", "Lcom/apollographql/apollo/api/Fragment$Data;", "ProductsInfo", "Message", "LegacyError", "Progress", "Content", "OrderTotalDetails", "IdVerificationBottomSheet", "RestrictionPrompt", "OnSnackBar", "OnInsetBanner", "Action", "OnCheckoutCollectionAddressEmpty", "OnCheckoutMarketFulfilmentAddress", "AddressData", "OnCheckoutCollectionAddressDelivery", "ShoppingModeDetails", "OnCheckoutCollectionAddressDelivery1", "OnCheckoutCollectionMethod", "Option", "Address", "OnCheckoutCollectionAddressPickup", "InsetBanner", "MarketPickupSheet", "PrimaryCta", "SecondaryCta", "ShoppingModeDetails1", "OnCheckoutFulfilmentWindows", "OnCheckoutFulfilmentWindowsEmptyState", "OnCheckoutFulfilmentWindowsSelectedState", "InlineMessage", "Windows", "OnCheckoutPackagingMethod", "Option1", "OnCheckoutDeliveryPreferenceToggle", "InlineMessage1", "OnCheckoutContactDetails", "InlineMessage2", "OnCheckoutDeliveryPreferenceText", "InputLimit", "InlineMessage3", "OnCheckoutProducts", "Substitution", "Option2", "Info", "SubstitutionPreferences", "Info1", "Product", "Instruction", "InputLimit1", "Rewards", "RemoveInfo", "CartProductInfo", "SubstitutionPreference", "Action1", "SubstitutionPreferenceOnboardingBanner", "OnCheckoutMarketProducts", "SellerGroup", "Product1", "RemoveInfo1", "CartProductInfo1", "OnCheckoutProductCampaigns", "Campaign", "CampaignInfo", "OnCheckoutSectionHeader", "InlineMessage4", "Analytics", "Section", "Message1", "Total", "ReviewProducts", "UnavailableOrderItem", "RestrictedOrderItem", "ExceededSupplyLimitProductGroup", "Product2", "RestrictedProductsByDeliveryMethod", "RestrictedProductsByDeliPlatter", "AvailableOrderItem", "PrimaryButton", "SecondaryButton", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CheckoutContent implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final List f22062a;
    public final Message b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final OrderTotalDetails f;
    public final IdVerificationBottomSheet g;
    public final RestrictionPrompt h;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Action;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerActionPlacement f22063a;
        public final InsetBannerActionType b;
        public final String c;
        public final String d;

        public Action(InsetBannerActionPlacement insetBannerActionPlacement, InsetBannerActionType insetBannerActionType, String str, String str2) {
            this.f22063a = insetBannerActionPlacement;
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
            return this.f22063a == action.f22063a && this.b == action.b && Intrinsics.c(this.c, action.c) && Intrinsics.c(this.d, action.d);
        }

        public final int hashCode() {
            int iC = b.c(d.c(this.b, this.f22063a.hashCode() * 31, 31), 31, this.c);
            String str = this.d;
            return iC + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.l(d.t("Action(placement=", this.f22063a, ", type=", this.b, ", label="), this.c, ", url=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Action1;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22064a;
        public final boolean b;

        public Action1(String str, boolean z) {
            this.f22064a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action1)) {
                return false;
            }
            Action1 action1 = (Action1) obj;
            return Intrinsics.c(this.f22064a, action1.f22064a) && this.b == action1.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.f22064a.hashCode() * 31);
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.j("Action1(label=", this.f22064a, ", enabled=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Address;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Address {

        /* renamed from: a, reason: collision with root package name */
        public final String f22065a;
        public final OnCheckoutCollectionAddressPickup b;
        public final CheckoutCollectionAddressDelivery c;

        public Address(String __typename, OnCheckoutCollectionAddressPickup onCheckoutCollectionAddressPickup, CheckoutCollectionAddressDelivery checkoutCollectionAddressDelivery) {
            Intrinsics.h(__typename, "__typename");
            this.f22065a = __typename;
            this.b = onCheckoutCollectionAddressPickup;
            this.c = checkoutCollectionAddressDelivery;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Address)) {
                return false;
            }
            Address address = (Address) obj;
            return Intrinsics.c(this.f22065a, address.f22065a) && Intrinsics.c(this.b, address.b) && Intrinsics.c(this.c, address.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22065a.hashCode() * 31;
            OnCheckoutCollectionAddressPickup onCheckoutCollectionAddressPickup = this.b;
            int iHashCode2 = (iHashCode + (onCheckoutCollectionAddressPickup == null ? 0 : onCheckoutCollectionAddressPickup.hashCode())) * 31;
            CheckoutCollectionAddressDelivery checkoutCollectionAddressDelivery = this.c;
            return iHashCode2 + (checkoutCollectionAddressDelivery != null ? checkoutCollectionAddressDelivery.hashCode() : 0);
        }

        public final String toString() {
            return "Address(__typename=" + this.f22065a + ", onCheckoutCollectionAddressPickup=" + this.b + ", checkoutCollectionAddressDelivery=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$AddressData;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AddressData {

        /* renamed from: a, reason: collision with root package name */
        public final String f22066a;
        public final OnCheckoutCollectionAddressDelivery b;

        public AddressData(String __typename, OnCheckoutCollectionAddressDelivery onCheckoutCollectionAddressDelivery) {
            Intrinsics.h(__typename, "__typename");
            this.f22066a = __typename;
            this.b = onCheckoutCollectionAddressDelivery;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AddressData)) {
                return false;
            }
            AddressData addressData = (AddressData) obj;
            return Intrinsics.c(this.f22066a, addressData.f22066a) && Intrinsics.c(this.b, addressData.b);
        }

        public final int hashCode() {
            int iHashCode = this.f22066a.hashCode() * 31;
            OnCheckoutCollectionAddressDelivery onCheckoutCollectionAddressDelivery = this.b;
            return iHashCode + (onCheckoutCollectionAddressDelivery == null ? 0 : onCheckoutCollectionAddressDelivery.f22091a.hashCode());
        }

        public final String toString() {
            return "AddressData(__typename=" + this.f22066a + ", onCheckoutCollectionAddressDelivery=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Analytics;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f22067a;
        public final String b;
        public final String c;

        public Analytics(String str, String str2, String str3) {
            this.f22067a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Analytics)) {
                return false;
            }
            Analytics analytics = (Analytics) obj;
            return Intrinsics.c(this.f22067a, analytics.f22067a) && Intrinsics.c(this.b, analytics.b) && Intrinsics.c(this.c, analytics.c);
        }

        public final int hashCode() {
            String str = this.f22067a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("Analytics(eventLabel=", this.f22067a, ", eventDescription=", this.b, ", eventValue="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$AvailableOrderItem;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AvailableOrderItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f22068a;

        public AvailableOrderItem(String str) {
            this.f22068a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AvailableOrderItem) && Intrinsics.c(this.f22068a, ((AvailableOrderItem) obj).f22068a);
        }

        public final int hashCode() {
            String str = this.f22068a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return YU.a.h("AvailableOrderItem(name=", this.f22068a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Campaign;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Campaign {

        /* renamed from: a, reason: collision with root package name */
        public final String f22069a;
        public final String b;
        public final String c;
        public final int d;
        public final String e;
        public final boolean f;
        public final CampaignInfo g;

        public Campaign(String str, String str2, String str3, int i, String str4, boolean z, CampaignInfo campaignInfo) {
            this.f22069a = str;
            this.b = str2;
            this.c = str3;
            this.d = i;
            this.e = str4;
            this.f = z;
            this.g = campaignInfo;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Campaign)) {
                return false;
            }
            Campaign campaign = (Campaign) obj;
            return Intrinsics.c(this.f22069a, campaign.f22069a) && Intrinsics.c(this.b, campaign.b) && Intrinsics.c(this.c, campaign.c) && this.d == campaign.d && Intrinsics.c(this.e, campaign.e) && this.f == campaign.f && Intrinsics.c(this.g, campaign.g);
        }

        public final int hashCode() {
            return this.g.hashCode() + b.e(b.c(b.a(this.d, b.c(b.c(this.f22069a.hashCode() * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("Campaign(label=", this.f22069a, ", title=", this.b, ", subtitle=");
            YU.a.x(this.d, this.c, ", id=", ", imageUrl=", sbV);
            d.A(this.e, ", isOptedIn=", ", campaignInfo=", sbV, this.f);
            sbV.append(this.g);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$CampaignInfo;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CampaignInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f22070a;
        public final String b;

        public CampaignInfo(String str, String str2) {
            this.f22070a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CampaignInfo)) {
                return false;
            }
            CampaignInfo campaignInfo = (CampaignInfo) obj;
            return Intrinsics.c(this.f22070a, campaignInfo.f22070a) && Intrinsics.c(this.b, campaignInfo.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22070a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("CampaignInfo(message=", this.f22070a, ", buttonTitle=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$CartProductInfo;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CartProductInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f22071a;
        public final String b;
        public final String c;

        public CartProductInfo(String str, String str2, String str3) {
            this.f22071a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CartProductInfo)) {
                return false;
            }
            CartProductInfo cartProductInfo = (CartProductInfo) obj;
            return Intrinsics.c(this.f22071a, cartProductInfo.f22071a) && Intrinsics.c(this.b, cartProductInfo.b) && Intrinsics.c(this.c, cartProductInfo.c);
        }

        public final int hashCode() {
            String str = this.f22071a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("CartProductInfo(totalPrice=", this.f22071a, ", totalOriginalPrice=", this.b, ", totalDiscount="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$CartProductInfo1;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CartProductInfo1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22072a;
        public final String b;
        public final String c;

        public CartProductInfo1(String str, String str2, String str3) {
            this.f22072a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CartProductInfo1)) {
                return false;
            }
            CartProductInfo1 cartProductInfo1 = (CartProductInfo1) obj;
            return Intrinsics.c(this.f22072a, cartProductInfo1.f22072a) && Intrinsics.c(this.b, cartProductInfo1.b) && Intrinsics.c(this.c, cartProductInfo1.c);
        }

        public final int hashCode() {
            String str = this.f22072a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("CartProductInfo1(totalPrice=", this.f22072a, ", totalOriginalPrice=", this.b, ", totalDiscount="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Content;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Content {

        /* renamed from: a, reason: collision with root package name */
        public final String f22073a;
        public final OnInsetBanner b;
        public final OnCheckoutCollectionAddressEmpty c;
        public final OnCheckoutMarketFulfilmentAddress d;
        public final OnCheckoutCollectionAddressDelivery1 e;
        public final OnCheckoutCollectionMethod f;
        public final OnCheckoutFulfilmentWindows g;
        public final OnCheckoutFulfilmentWindowsEmptyState h;
        public final OnCheckoutFulfilmentWindowsSelectedState i;
        public final OnCheckoutPackagingMethod j;
        public final OnCheckoutDeliveryPreferenceToggle k;
        public final OnCheckoutContactDetails l;
        public final OnCheckoutDeliveryPreferenceText m;
        public final OnCheckoutProducts n;
        public final OnCheckoutMarketProducts o;
        public final OnCheckoutProductCampaigns p;
        public final OnCheckoutSectionHeader q;

        public Content(String __typename, OnInsetBanner onInsetBanner, OnCheckoutCollectionAddressEmpty onCheckoutCollectionAddressEmpty, OnCheckoutMarketFulfilmentAddress onCheckoutMarketFulfilmentAddress, OnCheckoutCollectionAddressDelivery1 onCheckoutCollectionAddressDelivery1, OnCheckoutCollectionMethod onCheckoutCollectionMethod, OnCheckoutFulfilmentWindows onCheckoutFulfilmentWindows, OnCheckoutFulfilmentWindowsEmptyState onCheckoutFulfilmentWindowsEmptyState, OnCheckoutFulfilmentWindowsSelectedState onCheckoutFulfilmentWindowsSelectedState, OnCheckoutPackagingMethod onCheckoutPackagingMethod, OnCheckoutDeliveryPreferenceToggle onCheckoutDeliveryPreferenceToggle, OnCheckoutContactDetails onCheckoutContactDetails, OnCheckoutDeliveryPreferenceText onCheckoutDeliveryPreferenceText, OnCheckoutProducts onCheckoutProducts, OnCheckoutMarketProducts onCheckoutMarketProducts, OnCheckoutProductCampaigns onCheckoutProductCampaigns, OnCheckoutSectionHeader onCheckoutSectionHeader) {
            Intrinsics.h(__typename, "__typename");
            this.f22073a = __typename;
            this.b = onInsetBanner;
            this.c = onCheckoutCollectionAddressEmpty;
            this.d = onCheckoutMarketFulfilmentAddress;
            this.e = onCheckoutCollectionAddressDelivery1;
            this.f = onCheckoutCollectionMethod;
            this.g = onCheckoutFulfilmentWindows;
            this.h = onCheckoutFulfilmentWindowsEmptyState;
            this.i = onCheckoutFulfilmentWindowsSelectedState;
            this.j = onCheckoutPackagingMethod;
            this.k = onCheckoutDeliveryPreferenceToggle;
            this.l = onCheckoutContactDetails;
            this.m = onCheckoutDeliveryPreferenceText;
            this.n = onCheckoutProducts;
            this.o = onCheckoutMarketProducts;
            this.p = onCheckoutProductCampaigns;
            this.q = onCheckoutSectionHeader;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.c(this.f22073a, content.f22073a) && Intrinsics.c(this.b, content.b) && Intrinsics.c(this.c, content.c) && Intrinsics.c(this.d, content.d) && Intrinsics.c(this.e, content.e) && Intrinsics.c(this.f, content.f) && Intrinsics.c(this.g, content.g) && Intrinsics.c(this.h, content.h) && Intrinsics.c(this.i, content.i) && Intrinsics.c(this.j, content.j) && Intrinsics.c(this.k, content.k) && Intrinsics.c(this.l, content.l) && Intrinsics.c(this.m, content.m) && Intrinsics.c(this.n, content.n) && Intrinsics.c(this.o, content.o) && Intrinsics.c(this.p, content.p) && Intrinsics.c(this.q, content.q);
        }

        public final int hashCode() {
            int iHashCode = this.f22073a.hashCode() * 31;
            OnInsetBanner onInsetBanner = this.b;
            int iHashCode2 = (iHashCode + (onInsetBanner == null ? 0 : onInsetBanner.hashCode())) * 31;
            OnCheckoutCollectionAddressEmpty onCheckoutCollectionAddressEmpty = this.c;
            int iHashCode3 = (iHashCode2 + (onCheckoutCollectionAddressEmpty == null ? 0 : onCheckoutCollectionAddressEmpty.hashCode())) * 31;
            OnCheckoutMarketFulfilmentAddress onCheckoutMarketFulfilmentAddress = this.d;
            int iHashCode4 = (iHashCode3 + (onCheckoutMarketFulfilmentAddress == null ? 0 : onCheckoutMarketFulfilmentAddress.hashCode())) * 31;
            OnCheckoutCollectionAddressDelivery1 onCheckoutCollectionAddressDelivery1 = this.e;
            int iHashCode5 = (iHashCode4 + (onCheckoutCollectionAddressDelivery1 == null ? 0 : onCheckoutCollectionAddressDelivery1.hashCode())) * 31;
            OnCheckoutCollectionMethod onCheckoutCollectionMethod = this.f;
            int iHashCode6 = (iHashCode5 + (onCheckoutCollectionMethod == null ? 0 : onCheckoutCollectionMethod.hashCode())) * 31;
            OnCheckoutFulfilmentWindows onCheckoutFulfilmentWindows = this.g;
            int iHashCode7 = (iHashCode6 + (onCheckoutFulfilmentWindows == null ? 0 : onCheckoutFulfilmentWindows.hashCode())) * 31;
            OnCheckoutFulfilmentWindowsEmptyState onCheckoutFulfilmentWindowsEmptyState = this.h;
            int iHashCode8 = (iHashCode7 + (onCheckoutFulfilmentWindowsEmptyState == null ? 0 : onCheckoutFulfilmentWindowsEmptyState.hashCode())) * 31;
            OnCheckoutFulfilmentWindowsSelectedState onCheckoutFulfilmentWindowsSelectedState = this.i;
            int iHashCode9 = (iHashCode8 + (onCheckoutFulfilmentWindowsSelectedState == null ? 0 : onCheckoutFulfilmentWindowsSelectedState.hashCode())) * 31;
            OnCheckoutPackagingMethod onCheckoutPackagingMethod = this.j;
            int iHashCode10 = (iHashCode9 + (onCheckoutPackagingMethod == null ? 0 : onCheckoutPackagingMethod.hashCode())) * 31;
            OnCheckoutDeliveryPreferenceToggle onCheckoutDeliveryPreferenceToggle = this.k;
            int iHashCode11 = (iHashCode10 + (onCheckoutDeliveryPreferenceToggle == null ? 0 : onCheckoutDeliveryPreferenceToggle.hashCode())) * 31;
            OnCheckoutContactDetails onCheckoutContactDetails = this.l;
            int iHashCode12 = (iHashCode11 + (onCheckoutContactDetails == null ? 0 : onCheckoutContactDetails.hashCode())) * 31;
            OnCheckoutDeliveryPreferenceText onCheckoutDeliveryPreferenceText = this.m;
            int iHashCode13 = (iHashCode12 + (onCheckoutDeliveryPreferenceText == null ? 0 : onCheckoutDeliveryPreferenceText.hashCode())) * 31;
            OnCheckoutProducts onCheckoutProducts = this.n;
            int iHashCode14 = (iHashCode13 + (onCheckoutProducts == null ? 0 : onCheckoutProducts.hashCode())) * 31;
            OnCheckoutMarketProducts onCheckoutMarketProducts = this.o;
            int iHashCode15 = (iHashCode14 + (onCheckoutMarketProducts == null ? 0 : onCheckoutMarketProducts.hashCode())) * 31;
            OnCheckoutProductCampaigns onCheckoutProductCampaigns = this.p;
            int iHashCode16 = (iHashCode15 + (onCheckoutProductCampaigns == null ? 0 : onCheckoutProductCampaigns.f22105a.hashCode())) * 31;
            OnCheckoutSectionHeader onCheckoutSectionHeader = this.q;
            return iHashCode16 + (onCheckoutSectionHeader != null ? onCheckoutSectionHeader.hashCode() : 0);
        }

        public final String toString() {
            return "Content(__typename=" + this.f22073a + ", onInsetBanner=" + this.b + ", onCheckoutCollectionAddressEmpty=" + this.c + ", onCheckoutMarketFulfilmentAddress=" + this.d + ", onCheckoutCollectionAddressDelivery=" + this.e + ", onCheckoutCollectionMethod=" + this.f + ", onCheckoutFulfilmentWindows=" + this.g + ", onCheckoutFulfilmentWindowsEmptyState=" + this.h + ", onCheckoutFulfilmentWindowsSelectedState=" + this.i + ", onCheckoutPackagingMethod=" + this.j + ", onCheckoutDeliveryPreferenceToggle=" + this.k + ", onCheckoutContactDetails=" + this.l + ", onCheckoutDeliveryPreferenceText=" + this.m + ", onCheckoutProducts=" + this.n + ", onCheckoutMarketProducts=" + this.o + ", onCheckoutProductCampaigns=" + this.p + ", onCheckoutSectionHeader=" + this.q + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$ExceededSupplyLimitProductGroup;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ExceededSupplyLimitProductGroup {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f22074a;

        public ExceededSupplyLimitProductGroup(ArrayList arrayList) {
            this.f22074a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ExceededSupplyLimitProductGroup) && this.f22074a.equals(((ExceededSupplyLimitProductGroup) obj).f22074a);
        }

        public final int hashCode() {
            return this.f22074a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("ExceededSupplyLimitProductGroup(products=", ")", this.f22074a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$IdVerificationBottomSheet;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class IdVerificationBottomSheet {

        /* renamed from: a, reason: collision with root package name */
        public final String f22075a;
        public final String b;
        public final ArrayList c;
        public final PrimaryButton d;
        public final SecondaryButton e;

        public IdVerificationBottomSheet(String str, String str2, ArrayList arrayList, PrimaryButton primaryButton, SecondaryButton secondaryButton) {
            this.f22075a = str;
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
            return this.f22075a.equals(idVerificationBottomSheet.f22075a) && this.b.equals(idVerificationBottomSheet.b) && this.c.equals(idVerificationBottomSheet.c) && Intrinsics.c(this.d, idVerificationBottomSheet.d) && Intrinsics.c(this.e, idVerificationBottomSheet.e);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(b.c(this.f22075a.hashCode() * 31, 31, this.b), 31, this.c);
            PrimaryButton primaryButton = this.d;
            int iHashCode = (iB + (primaryButton == null ? 0 : primaryButton.hashCode())) * 31;
            SecondaryButton secondaryButton = this.e;
            return iHashCode + (secondaryButton != null ? secondaryButton.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("IdVerificationBottomSheet(title=", this.f22075a, ", body=", this.b, ", imageUrls=");
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Info;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Info {

        /* renamed from: a, reason: collision with root package name */
        public final String f22076a;
        public final String b;
        public final String c;

        public Info(String str, String str2, String str3) {
            this.f22076a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Info)) {
                return false;
            }
            Info info = (Info) obj;
            return Intrinsics.c(this.f22076a, info.f22076a) && Intrinsics.c(this.b, info.b) && Intrinsics.c(this.c, info.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f22076a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("Info(title=", this.f22076a, ", message=", this.b, ", buttonTitle="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Info1;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Info1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22077a;
        public final String b;
        public final String c;

        public Info1(String str, String str2, String str3) {
            this.f22077a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Info1)) {
                return false;
            }
            Info1 info1 = (Info1) obj;
            return Intrinsics.c(this.f22077a, info1.f22077a) && Intrinsics.c(this.b, info1.b) && Intrinsics.c(this.c, info1.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f22077a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("Info1(title=", this.f22077a, ", message=", this.b, ", buttonTitle="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$InlineMessage;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InlineMessage {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f22078a;
        public final String b;

        public InlineMessage(InsetBannerDisplayType insetBannerDisplayType, String str) {
            this.f22078a = insetBannerDisplayType;
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
            return this.f22078a == inlineMessage.f22078a && Intrinsics.c(this.b, inlineMessage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22078a.hashCode() * 31);
        }

        public final String toString() {
            return "InlineMessage(displayType=" + this.f22078a + ", message=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$InlineMessage1;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InlineMessage1 {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f22079a;
        public final String b;

        public InlineMessage1(InsetBannerDisplayType insetBannerDisplayType, String str) {
            this.f22079a = insetBannerDisplayType;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InlineMessage1)) {
                return false;
            }
            InlineMessage1 inlineMessage1 = (InlineMessage1) obj;
            return this.f22079a == inlineMessage1.f22079a && Intrinsics.c(this.b, inlineMessage1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22079a.hashCode() * 31);
        }

        public final String toString() {
            return "InlineMessage1(displayType=" + this.f22079a + ", message=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$InlineMessage2;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InlineMessage2 {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f22080a;
        public final String b;

        public InlineMessage2(InsetBannerDisplayType insetBannerDisplayType, String str) {
            this.f22080a = insetBannerDisplayType;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InlineMessage2)) {
                return false;
            }
            InlineMessage2 inlineMessage2 = (InlineMessage2) obj;
            return this.f22080a == inlineMessage2.f22080a && Intrinsics.c(this.b, inlineMessage2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22080a.hashCode() * 31);
        }

        public final String toString() {
            return "InlineMessage2(displayType=" + this.f22080a + ", message=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$InlineMessage3;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InlineMessage3 {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f22081a;
        public final String b;

        public InlineMessage3(InsetBannerDisplayType insetBannerDisplayType, String str) {
            this.f22081a = insetBannerDisplayType;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InlineMessage3)) {
                return false;
            }
            InlineMessage3 inlineMessage3 = (InlineMessage3) obj;
            return this.f22081a == inlineMessage3.f22081a && Intrinsics.c(this.b, inlineMessage3.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22081a.hashCode() * 31);
        }

        public final String toString() {
            return "InlineMessage3(displayType=" + this.f22081a + ", message=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$InlineMessage4;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InlineMessage4 {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f22082a;
        public final String b;
        public final Analytics c;

        public InlineMessage4(InsetBannerDisplayType insetBannerDisplayType, String str, Analytics analytics) {
            this.f22082a = insetBannerDisplayType;
            this.b = str;
            this.c = analytics;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InlineMessage4)) {
                return false;
            }
            InlineMessage4 inlineMessage4 = (InlineMessage4) obj;
            return this.f22082a == inlineMessage4.f22082a && Intrinsics.c(this.b, inlineMessage4.b) && Intrinsics.c(this.c, inlineMessage4.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f22082a.hashCode() * 31, 31, this.b);
            Analytics analytics = this.c;
            return iC + (analytics == null ? 0 : analytics.hashCode());
        }

        public final String toString() {
            StringBuilder sbU = d.u("InlineMessage4(displayType=", this.f22082a, ", message=", this.b, ", analytics=");
            sbU.append(this.c);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$InputLimit;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InputLimit {

        /* renamed from: a, reason: collision with root package name */
        public final int f22083a;
        public final int b;

        public InputLimit(int i, int i2) {
            this.f22083a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InputLimit)) {
                return false;
            }
            InputLimit inputLimit = (InputLimit) obj;
            return this.f22083a == inputLimit.f22083a && this.b == inputLimit.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.f22083a) * 31);
        }

        public final String toString() {
            return b.j(this.f22083a, this.b, "InputLimit(maxLength=", ", warningOffset=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$InputLimit1;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InputLimit1 {

        /* renamed from: a, reason: collision with root package name */
        public final int f22084a;
        public final int b;

        public InputLimit1(int i, int i2) {
            this.f22084a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InputLimit1)) {
                return false;
            }
            InputLimit1 inputLimit1 = (InputLimit1) obj;
            return this.f22084a == inputLimit1.f22084a && this.b == inputLimit1.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.f22084a) * 31);
        }

        public final String toString() {
            return b.j(this.f22084a, this.b, "InputLimit1(maxLength=", ", warningOffset=", ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$InsetBanner;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InsetBanner {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f22085a;
        public final String b;

        public InsetBanner(InsetBannerDisplayType insetBannerDisplayType, String str) {
            this.f22085a = insetBannerDisplayType;
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
            return this.f22085a == insetBanner.f22085a && Intrinsics.c(this.b, insetBanner.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22085a.hashCode() * 31);
        }

        public final String toString() {
            return "InsetBanner(displayType=" + this.f22085a + ", message=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Instruction;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Instruction {

        /* renamed from: a, reason: collision with root package name */
        public final String f22086a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final InputLimit1 f;

        public Instruction(String str, String str2, String str3, String str4, String str5, InputLimit1 inputLimit1) {
            this.f22086a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = inputLimit1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Instruction)) {
                return false;
            }
            Instruction instruction = (Instruction) obj;
            return Intrinsics.c(this.f22086a, instruction.f22086a) && Intrinsics.c(this.b, instruction.b) && Intrinsics.c(this.c, instruction.c) && Intrinsics.c(this.d, instruction.d) && Intrinsics.c(this.e, instruction.e) && Intrinsics.c(this.f, instruction.f);
        }

        public final int hashCode() {
            String str = this.f22086a;
            int iC = b.c(b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b), 31, this.c);
            String str2 = this.d;
            int iC2 = b.c((iC + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.e);
            InputLimit1 inputLimit1 = this.f;
            return iC2 + (inputLimit1 != null ? inputLimit1.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("Instruction(text=", this.f22086a, ", title=", this.b, ", label=");
            a.B(sbV, this.c, ", placeholderText=", this.d, ", buttonTitle=");
            sbV.append(this.e);
            sbV.append(", inputLimit=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$LegacyError;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LegacyError {

        /* renamed from: a, reason: collision with root package name */
        public final int f22087a;
        public final String b;
        public final String c;

        public LegacyError(int i, String str, String str2) {
            this.f22087a = i;
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
            return this.f22087a == legacyError.f22087a && Intrinsics.c(this.b, legacyError.b) && Intrinsics.c(this.c, legacyError.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(Integer.hashCode(this.f22087a) * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.o(a.p("LegacyError(errorCode=", this.f22087a, ", message=", this.b, ", key="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$MarketPickupSheet;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class MarketPickupSheet {

        /* renamed from: a, reason: collision with root package name */
        public final String f22088a;
        public final String b;
        public final Boolean c;
        public final PrimaryCta d;
        public final SecondaryCta e;

        public MarketPickupSheet(String str, String str2, Boolean bool, PrimaryCta primaryCta, SecondaryCta secondaryCta) {
            this.f22088a = str;
            this.b = str2;
            this.c = bool;
            this.d = primaryCta;
            this.e = secondaryCta;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MarketPickupSheet)) {
                return false;
            }
            MarketPickupSheet marketPickupSheet = (MarketPickupSheet) obj;
            return Intrinsics.c(this.f22088a, marketPickupSheet.f22088a) && Intrinsics.c(this.b, marketPickupSheet.b) && Intrinsics.c(this.c, marketPickupSheet.c) && Intrinsics.c(this.d, marketPickupSheet.d) && Intrinsics.c(this.e, marketPickupSheet.e);
        }

        public final int hashCode() {
            int iC = b.c(this.f22088a.hashCode() * 31, 31, this.b);
            Boolean bool = this.c;
            int iHashCode = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
            PrimaryCta primaryCta = this.d;
            int iHashCode2 = (iHashCode + (primaryCta == null ? 0 : primaryCta.f22115a.hashCode())) * 31;
            SecondaryCta secondaryCta = this.e;
            return iHashCode2 + (secondaryCta != null ? secondaryCta.f22130a.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("MarketPickupSheet(bottomSheetTitle=", this.f22088a, ", bottomSheetBody=", this.b, ", showOnceOnly=");
            sbV.append(this.c);
            sbV.append(", primaryCta=");
            sbV.append(this.d);
            sbV.append(", secondaryCta=");
            sbV.append(this.e);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Message;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Message {

        /* renamed from: a, reason: collision with root package name */
        public final String f22089a;
        public final OnSnackBar b;

        public Message(String __typename, OnSnackBar onSnackBar) {
            Intrinsics.h(__typename, "__typename");
            this.f22089a = __typename;
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
            return Intrinsics.c(this.f22089a, message.f22089a) && Intrinsics.c(this.b, message.b);
        }

        public final int hashCode() {
            int iHashCode = this.f22089a.hashCode() * 31;
            OnSnackBar onSnackBar = this.b;
            return iHashCode + (onSnackBar == null ? 0 : onSnackBar.hashCode());
        }

        public final String toString() {
            return "Message(__typename=" + this.f22089a + ", onSnackBar=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Message1;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Message1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22090a;
        public final String b;
        public final String c;

        public Message1(String str, String str2, String str3) {
            this.f22090a = str;
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
            return Intrinsics.c(this.f22090a, message1.f22090a) && Intrinsics.c(this.b, message1.b) && Intrinsics.c(this.c, message1.c);
        }

        public final int hashCode() {
            String str = this.f22090a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("Message1(title=", this.f22090a, ", body=", this.b, ", type="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutCollectionAddressDelivery;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutCollectionAddressDelivery {

        /* renamed from: a, reason: collision with root package name */
        public final CollectionModeId f22091a;

        public OnCheckoutCollectionAddressDelivery(CollectionModeId collectionModeId) {
            this.f22091a = collectionModeId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCheckoutCollectionAddressDelivery) && this.f22091a == ((OnCheckoutCollectionAddressDelivery) obj).f22091a;
        }

        public final int hashCode() {
            return this.f22091a.hashCode();
        }

        public final String toString() {
            return "OnCheckoutCollectionAddressDelivery(modeId=" + this.f22091a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutCollectionAddressDelivery1;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutCollectionAddressDelivery1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22092a;
        public final CheckoutCollectionAddressDelivery b;

        public OnCheckoutCollectionAddressDelivery1(String str, CheckoutCollectionAddressDelivery checkoutCollectionAddressDelivery) {
            this.f22092a = str;
            this.b = checkoutCollectionAddressDelivery;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutCollectionAddressDelivery1)) {
                return false;
            }
            OnCheckoutCollectionAddressDelivery1 onCheckoutCollectionAddressDelivery1 = (OnCheckoutCollectionAddressDelivery1) obj;
            return Intrinsics.c(this.f22092a, onCheckoutCollectionAddressDelivery1.f22092a) && Intrinsics.c(this.b, onCheckoutCollectionAddressDelivery1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22092a.hashCode() * 31);
        }

        public final String toString() {
            return "OnCheckoutCollectionAddressDelivery1(__typename=" + this.f22092a + ", checkoutCollectionAddressDelivery=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutCollectionAddressEmpty;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutCollectionAddressEmpty {

        /* renamed from: a, reason: collision with root package name */
        public final String f22093a;
        public final String b;
        public final String c;

        public OnCheckoutCollectionAddressEmpty(String str, String str2, String str3) {
            this.f22093a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutCollectionAddressEmpty)) {
                return false;
            }
            OnCheckoutCollectionAddressEmpty onCheckoutCollectionAddressEmpty = (OnCheckoutCollectionAddressEmpty) obj;
            return Intrinsics.c(this.f22093a, onCheckoutCollectionAddressEmpty.f22093a) && Intrinsics.c(this.b, onCheckoutCollectionAddressEmpty.b) && Intrinsics.c(this.c, onCheckoutCollectionAddressEmpty.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f22093a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("OnCheckoutCollectionAddressEmpty(title=", this.f22093a, ", displayName=", this.b, ", buttonText="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutCollectionAddressPickup;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutCollectionAddressPickup {

        /* renamed from: a, reason: collision with root package name */
        public final String f22094a;
        public final CollectionModeId b;
        public final int c;
        public final String d;
        public final int e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;

        public OnCheckoutCollectionAddressPickup(String str, CollectionModeId collectionModeId, int i, String str2, int i2, String str3, String str4, String str5, String str6) {
            this.f22094a = str;
            this.b = collectionModeId;
            this.c = i;
            this.d = str2;
            this.e = i2;
            this.f = str3;
            this.g = str4;
            this.h = str5;
            this.i = str6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutCollectionAddressPickup)) {
                return false;
            }
            OnCheckoutCollectionAddressPickup onCheckoutCollectionAddressPickup = (OnCheckoutCollectionAddressPickup) obj;
            return Intrinsics.c(this.f22094a, onCheckoutCollectionAddressPickup.f22094a) && this.b == onCheckoutCollectionAddressPickup.b && this.c == onCheckoutCollectionAddressPickup.c && Intrinsics.c(this.d, onCheckoutCollectionAddressPickup.d) && this.e == onCheckoutCollectionAddressPickup.e && Intrinsics.c(this.f, onCheckoutCollectionAddressPickup.f) && Intrinsics.c(this.g, onCheckoutCollectionAddressPickup.g) && Intrinsics.c(this.h, onCheckoutCollectionAddressPickup.h) && Intrinsics.c(this.i, onCheckoutCollectionAddressPickup.i);
        }

        public final int hashCode() {
            int iC = b.c(b.a(this.e, b.c(b.a(this.c, (this.b.hashCode() + (this.f22094a.hashCode() * 31)) * 31, 31), 31, this.d), 31), 31, this.f);
            String str = this.g;
            return this.i.hashCode() + b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.h);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnCheckoutCollectionAddressPickup(title=");
            sb.append(this.f22094a);
            sb.append(", modeId=");
            sb.append(this.b);
            sb.append(", storeId=");
            androidx.compose.ui.input.pointer.a.u(this.c, ", text=", this.d, ", addressId=", sb);
            androidx.compose.ui.input.pointer.a.u(this.e, ", displayName=", this.f, ", addressImageUrl=", sb);
            a.B(sb, this.g, ", buttonText=", this.h, ", label=");
            return YU.a.o(sb, this.i, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutCollectionMethod;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutCollectionMethod {

        /* renamed from: a, reason: collision with root package name */
        public final String f22095a;
        public final ArrayList b;
        public final Address c;
        public final InsetBanner d;
        public final MarketPickupSheet e;
        public final ShoppingModeDetails1 f;

        public OnCheckoutCollectionMethod(String str, ArrayList arrayList, Address address, InsetBanner insetBanner, MarketPickupSheet marketPickupSheet, ShoppingModeDetails1 shoppingModeDetails1) {
            this.f22095a = str;
            this.b = arrayList;
            this.c = address;
            this.d = insetBanner;
            this.e = marketPickupSheet;
            this.f = shoppingModeDetails1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutCollectionMethod)) {
                return false;
            }
            OnCheckoutCollectionMethod onCheckoutCollectionMethod = (OnCheckoutCollectionMethod) obj;
            return this.f22095a.equals(onCheckoutCollectionMethod.f22095a) && this.b.equals(onCheckoutCollectionMethod.b) && this.c.equals(onCheckoutCollectionMethod.c) && Intrinsics.c(this.d, onCheckoutCollectionMethod.d) && Intrinsics.c(this.e, onCheckoutCollectionMethod.e) && this.f.equals(onCheckoutCollectionMethod.f);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + androidx.compose.ui.input.pointer.a.b(this.f22095a.hashCode() * 31, 31, this.b)) * 31;
            InsetBanner insetBanner = this.d;
            int iHashCode2 = (iHashCode + (insetBanner == null ? 0 : insetBanner.hashCode())) * 31;
            MarketPickupSheet marketPickupSheet = this.e;
            return this.f.hashCode() + ((iHashCode2 + (marketPickupSheet != null ? marketPickupSheet.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbX = d.x("OnCheckoutCollectionMethod(title=", this.f22095a, ", options=", ", address=", this.b);
            sbX.append(this.c);
            sbX.append(", insetBanner=");
            sbX.append(this.d);
            sbX.append(", marketPickupSheet=");
            sbX.append(this.e);
            sbX.append(", shoppingModeDetails=");
            sbX.append(this.f);
            sbX.append(")");
            return sbX.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutContactDetails;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutContactDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f22096a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final InlineMessage2 f;

        public OnCheckoutContactDetails(String str, String str2, String str3, String str4, String str5, InlineMessage2 inlineMessage2) {
            this.f22096a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = inlineMessage2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutContactDetails)) {
                return false;
            }
            OnCheckoutContactDetails onCheckoutContactDetails = (OnCheckoutContactDetails) obj;
            return Intrinsics.c(this.f22096a, onCheckoutContactDetails.f22096a) && Intrinsics.c(this.b, onCheckoutContactDetails.b) && Intrinsics.c(this.c, onCheckoutContactDetails.c) && Intrinsics.c(this.d, onCheckoutContactDetails.d) && Intrinsics.c(this.e, onCheckoutContactDetails.e) && Intrinsics.c(this.f, onCheckoutContactDetails.f);
        }

        public final int hashCode() {
            int iHashCode = this.f22096a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iC = b.c(b.c((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.d), 31, this.e);
            InlineMessage2 inlineMessage2 = this.f;
            return iC + (inlineMessage2 != null ? inlineMessage2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnCheckoutContactDetails(title=", this.f22096a, ", phoneNumberLabel=", this.b, ", phoneNumber=");
            a.B(sbV, this.c, ", placeholder=", this.d, ", buttonTitle=");
            sbV.append(this.e);
            sbV.append(", inlineMessage=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutDeliveryPreferenceText;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutDeliveryPreferenceText {

        /* renamed from: a, reason: collision with root package name */
        public final CheckoutDeliveryPreferenceId f22097a;
        public final boolean b;
        public final String c;
        public final InputLimit d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final InlineMessage3 i;

        public OnCheckoutDeliveryPreferenceText(CheckoutDeliveryPreferenceId checkoutDeliveryPreferenceId, boolean z, String str, InputLimit inputLimit, String str2, String str3, String str4, String str5, InlineMessage3 inlineMessage3) {
            this.f22097a = checkoutDeliveryPreferenceId;
            this.b = z;
            this.c = str;
            this.d = inputLimit;
            this.e = str2;
            this.f = str3;
            this.g = str4;
            this.h = str5;
            this.i = inlineMessage3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutDeliveryPreferenceText)) {
                return false;
            }
            OnCheckoutDeliveryPreferenceText onCheckoutDeliveryPreferenceText = (OnCheckoutDeliveryPreferenceText) obj;
            return this.f22097a == onCheckoutDeliveryPreferenceText.f22097a && this.b == onCheckoutDeliveryPreferenceText.b && Intrinsics.c(this.c, onCheckoutDeliveryPreferenceText.c) && Intrinsics.c(this.d, onCheckoutDeliveryPreferenceText.d) && Intrinsics.c(this.e, onCheckoutDeliveryPreferenceText.e) && Intrinsics.c(this.f, onCheckoutDeliveryPreferenceText.f) && Intrinsics.c(this.g, onCheckoutDeliveryPreferenceText.g) && Intrinsics.c(this.h, onCheckoutDeliveryPreferenceText.h) && Intrinsics.c(this.i, onCheckoutDeliveryPreferenceText.i);
        }

        public final int hashCode() {
            int iC = b.c(b.e(this.f22097a.hashCode() * 31, 31, this.b), 31, this.c);
            InputLimit inputLimit = this.d;
            int iHashCode = (iC + (inputLimit == null ? 0 : inputLimit.hashCode())) * 31;
            String str = this.e;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.g;
            int iC2 = b.c((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.h);
            InlineMessage3 inlineMessage3 = this.i;
            return iC2 + (inlineMessage3 != null ? inlineMessage3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnCheckoutDeliveryPreferenceText(preferenceId=");
            sb.append(this.f22097a);
            sb.append(", isEnabled=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            sb.append(", inputLimit=");
            sb.append(this.d);
            sb.append(", descriptionText=");
            a.B(sb, this.e, ", placeholderText=", this.f, ", text=");
            a.B(sb, this.g, ", buttonTitle=", this.h, ", inlineMessage=");
            sb.append(this.i);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutDeliveryPreferenceToggle;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutDeliveryPreferenceToggle {

        /* renamed from: a, reason: collision with root package name */
        public final CheckoutDeliveryPreferenceId f22098a;
        public final boolean b;
        public final String c;
        public final String d;
        public final String e;
        public final boolean f;
        public final InlineMessage1 g;

        public OnCheckoutDeliveryPreferenceToggle(CheckoutDeliveryPreferenceId checkoutDeliveryPreferenceId, boolean z, String str, String str2, String str3, boolean z2, InlineMessage1 inlineMessage1) {
            this.f22098a = checkoutDeliveryPreferenceId;
            this.b = z;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = z2;
            this.g = inlineMessage1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutDeliveryPreferenceToggle)) {
                return false;
            }
            OnCheckoutDeliveryPreferenceToggle onCheckoutDeliveryPreferenceToggle = (OnCheckoutDeliveryPreferenceToggle) obj;
            return this.f22098a == onCheckoutDeliveryPreferenceToggle.f22098a && this.b == onCheckoutDeliveryPreferenceToggle.b && Intrinsics.c(this.c, onCheckoutDeliveryPreferenceToggle.c) && Intrinsics.c(this.d, onCheckoutDeliveryPreferenceToggle.d) && Intrinsics.c(this.e, onCheckoutDeliveryPreferenceToggle.e) && this.f == onCheckoutDeliveryPreferenceToggle.f && Intrinsics.c(this.g, onCheckoutDeliveryPreferenceToggle.g);
        }

        public final int hashCode() {
            int iE = b.e(b.c(b.c(b.c(b.e(this.f22098a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
            InlineMessage1 inlineMessage1 = this.g;
            return iE + (inlineMessage1 == null ? 0 : inlineMessage1.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnCheckoutDeliveryPreferenceToggle(preferenceId=");
            sb.append(this.f22098a);
            sb.append(", isEnabled=");
            sb.append(this.b);
            sb.append(", title=");
            a.B(sb, this.c, ", subtitle=", this.d, ", label=");
            d.A(this.e, ", value=", ", inlineMessage=", sb, this.f);
            sb.append(this.g);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutFulfilmentWindows;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutFulfilmentWindows {

        /* renamed from: a, reason: collision with root package name */
        public final String f22099a;
        public final CheckoutFulfilmentWindows b;

        public OnCheckoutFulfilmentWindows(String str, CheckoutFulfilmentWindows checkoutFulfilmentWindows) {
            this.f22099a = str;
            this.b = checkoutFulfilmentWindows;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutFulfilmentWindows)) {
                return false;
            }
            OnCheckoutFulfilmentWindows onCheckoutFulfilmentWindows = (OnCheckoutFulfilmentWindows) obj;
            return Intrinsics.c(this.f22099a, onCheckoutFulfilmentWindows.f22099a) && Intrinsics.c(this.b, onCheckoutFulfilmentWindows.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22099a.hashCode() * 31);
        }

        public final String toString() {
            return "OnCheckoutFulfilmentWindows(__typename=" + this.f22099a + ", checkoutFulfilmentWindows=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutFulfilmentWindowsEmptyState;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutFulfilmentWindowsEmptyState {

        /* renamed from: a, reason: collision with root package name */
        public final String f22100a;
        public final String b;

        public OnCheckoutFulfilmentWindowsEmptyState(String str, String str2) {
            this.f22100a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutFulfilmentWindowsEmptyState)) {
                return false;
            }
            OnCheckoutFulfilmentWindowsEmptyState onCheckoutFulfilmentWindowsEmptyState = (OnCheckoutFulfilmentWindowsEmptyState) obj;
            return Intrinsics.c(this.f22100a, onCheckoutFulfilmentWindowsEmptyState.f22100a) && Intrinsics.c(this.b, onCheckoutFulfilmentWindowsEmptyState.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22100a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("OnCheckoutFulfilmentWindowsEmptyState(title=", this.f22100a, ", message=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutFulfilmentWindowsSelectedState;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutFulfilmentWindowsSelectedState {

        /* renamed from: a, reason: collision with root package name */
        public final String f22101a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final InlineMessage f;
        public final Windows g;

        public OnCheckoutFulfilmentWindowsSelectedState(String str, String str2, String str3, String str4, String str5, InlineMessage inlineMessage, Windows windows) {
            this.f22101a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = inlineMessage;
            this.g = windows;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutFulfilmentWindowsSelectedState)) {
                return false;
            }
            OnCheckoutFulfilmentWindowsSelectedState onCheckoutFulfilmentWindowsSelectedState = (OnCheckoutFulfilmentWindowsSelectedState) obj;
            return Intrinsics.c(this.f22101a, onCheckoutFulfilmentWindowsSelectedState.f22101a) && Intrinsics.c(this.b, onCheckoutFulfilmentWindowsSelectedState.b) && Intrinsics.c(this.c, onCheckoutFulfilmentWindowsSelectedState.c) && Intrinsics.c(this.d, onCheckoutFulfilmentWindowsSelectedState.d) && Intrinsics.c(this.e, onCheckoutFulfilmentWindowsSelectedState.e) && Intrinsics.c(this.f, onCheckoutFulfilmentWindowsSelectedState.f) && Intrinsics.c(this.g, onCheckoutFulfilmentWindowsSelectedState.g);
        }

        public final int hashCode() {
            int iC = b.c(b.c(b.c(b.c(this.f22101a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
            InlineMessage inlineMessage = this.f;
            return this.g.hashCode() + ((iC + (inlineMessage == null ? 0 : inlineMessage.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnCheckoutFulfilmentWindowsSelectedState(title=", this.f22101a, ", subtitle=", this.b, ", timeWindow=");
            a.B(sbV, this.c, ", price=", this.d, ", buttonTitle=");
            sbV.append(this.e);
            sbV.append(", inlineMessage=");
            sbV.append(this.f);
            sbV.append(", windows=");
            sbV.append(this.g);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutMarketFulfilmentAddress;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutMarketFulfilmentAddress {

        /* renamed from: a, reason: collision with root package name */
        public final String f22102a;
        public final String b;
        public final String c;
        public final MarketFulfilmentAddressStatus d;
        public final AddressType e;
        public final AddressData f;
        public final ShoppingModeDetails g;

        public OnCheckoutMarketFulfilmentAddress(String str, String str2, String str3, MarketFulfilmentAddressStatus marketFulfilmentAddressStatus, AddressType addressType, AddressData addressData, ShoppingModeDetails shoppingModeDetails) {
            this.f22102a = str;
            this.b = str2;
            this.c = str3;
            this.d = marketFulfilmentAddressStatus;
            this.e = addressType;
            this.f = addressData;
            this.g = shoppingModeDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutMarketFulfilmentAddress)) {
                return false;
            }
            OnCheckoutMarketFulfilmentAddress onCheckoutMarketFulfilmentAddress = (OnCheckoutMarketFulfilmentAddress) obj;
            return Intrinsics.c(this.f22102a, onCheckoutMarketFulfilmentAddress.f22102a) && Intrinsics.c(this.b, onCheckoutMarketFulfilmentAddress.b) && Intrinsics.c(this.c, onCheckoutMarketFulfilmentAddress.c) && this.d == onCheckoutMarketFulfilmentAddress.d && this.e == onCheckoutMarketFulfilmentAddress.e && Intrinsics.c(this.f, onCheckoutMarketFulfilmentAddress.f) && Intrinsics.c(this.g, onCheckoutMarketFulfilmentAddress.g);
        }

        public final int hashCode() {
            int iC = b.c(this.f22102a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
            AddressData addressData = this.f;
            return this.g.hashCode() + ((iHashCode + (addressData != null ? addressData.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnCheckoutMarketFulfilmentAddress(title=", this.f22102a, ", displayName=", this.b, ", addressButtonTitle=");
            sbV.append(this.c);
            sbV.append(", addressStatus=");
            sbV.append(this.d);
            sbV.append(", addressType=");
            sbV.append(this.e);
            sbV.append(", addressData=");
            sbV.append(this.f);
            sbV.append(", shoppingModeDetails=");
            sbV.append(this.g);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutMarketProducts;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutMarketProducts {

        /* renamed from: a, reason: collision with root package name */
        public final String f22103a;
        public final String b;
        public final ArrayList c;

        public OnCheckoutMarketProducts(String str, String str2, ArrayList arrayList) {
            this.f22103a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutMarketProducts)) {
                return false;
            }
            OnCheckoutMarketProducts onCheckoutMarketProducts = (OnCheckoutMarketProducts) obj;
            return this.f22103a.equals(onCheckoutMarketProducts.f22103a) && Intrinsics.c(this.b, onCheckoutMarketProducts.b) && this.c.equals(onCheckoutMarketProducts.c);
        }

        public final int hashCode() {
            int iHashCode = this.f22103a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", YU.a.v("OnCheckoutMarketProducts(title=", this.f22103a, ", descriptionText=", this.b, ", sellerGroups="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutPackagingMethod;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutPackagingMethod {

        /* renamed from: a, reason: collision with root package name */
        public final String f22104a;
        public final ArrayList b;

        public OnCheckoutPackagingMethod(String str, ArrayList arrayList) {
            this.f22104a = str;
            this.b = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutPackagingMethod)) {
                return false;
            }
            OnCheckoutPackagingMethod onCheckoutPackagingMethod = (OnCheckoutPackagingMethod) obj;
            return this.f22104a.equals(onCheckoutPackagingMethod.f22104a) && this.b.equals(onCheckoutPackagingMethod.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22104a.hashCode() * 31);
        }

        public final String toString() {
            return d.q("OnCheckoutPackagingMethod(title=", this.f22104a, ", options=", ")", this.b);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutProductCampaigns;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutProductCampaigns {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f22105a;

        public OnCheckoutProductCampaigns(ArrayList arrayList) {
            this.f22105a = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnCheckoutProductCampaigns) && this.f22105a.equals(((OnCheckoutProductCampaigns) obj).f22105a);
        }

        public final int hashCode() {
            return this.f22105a.hashCode();
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.k("OnCheckoutProductCampaigns(campaigns=", ")", this.f22105a);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutProducts;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutProducts {

        /* renamed from: a, reason: collision with root package name */
        public final String f22106a;
        public final String b;
        public final Substitution c;
        public final SubstitutionPreferences d;
        public final ArrayList e;
        public final boolean f;
        public final SubstitutionPreferenceOnboardingBanner g;

        public OnCheckoutProducts(String str, String str2, Substitution substitution, SubstitutionPreferences substitutionPreferences, ArrayList arrayList, boolean z, SubstitutionPreferenceOnboardingBanner substitutionPreferenceOnboardingBanner) {
            this.f22106a = str;
            this.b = str2;
            this.c = substitution;
            this.d = substitutionPreferences;
            this.e = arrayList;
            this.f = z;
            this.g = substitutionPreferenceOnboardingBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutProducts)) {
                return false;
            }
            OnCheckoutProducts onCheckoutProducts = (OnCheckoutProducts) obj;
            return this.f22106a.equals(onCheckoutProducts.f22106a) && Intrinsics.c(this.b, onCheckoutProducts.b) && Intrinsics.c(this.c, onCheckoutProducts.c) && Intrinsics.c(this.d, onCheckoutProducts.d) && this.e.equals(onCheckoutProducts.e) && this.f == onCheckoutProducts.f && Intrinsics.c(this.g, onCheckoutProducts.g);
        }

        public final int hashCode() {
            int iHashCode = this.f22106a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Substitution substitution = this.c;
            int iHashCode3 = (iHashCode2 + (substitution == null ? 0 : substitution.hashCode())) * 31;
            SubstitutionPreferences substitutionPreferences = this.d;
            int iE = b.e(androidx.compose.ui.input.pointer.a.b((iHashCode3 + (substitutionPreferences == null ? 0 : substitutionPreferences.hashCode())) * 31, 31, this.e), 31, this.f);
            SubstitutionPreferenceOnboardingBanner substitutionPreferenceOnboardingBanner = this.g;
            return iE + (substitutionPreferenceOnboardingBanner != null ? substitutionPreferenceOnboardingBanner.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OnCheckoutProducts(title=", this.f22106a, ", descriptionText=", this.b, ", substitution=");
            sbV.append(this.c);
            sbV.append(", substitutionPreferences=");
            sbV.append(this.d);
            sbV.append(", products=");
            sbV.append(this.e);
            sbV.append(", useSubstitutionPreference=");
            sbV.append(this.f);
            sbV.append(", substitutionPreferenceOnboardingBanner=");
            sbV.append(this.g);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnCheckoutSectionHeader;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnCheckoutSectionHeader {

        /* renamed from: a, reason: collision with root package name */
        public final String f22107a;
        public final String b;

        public OnCheckoutSectionHeader(String str, String str2) {
            this.f22107a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnCheckoutSectionHeader)) {
                return false;
            }
            OnCheckoutSectionHeader onCheckoutSectionHeader = (OnCheckoutSectionHeader) obj;
            return Intrinsics.c(this.f22107a, onCheckoutSectionHeader.f22107a) && Intrinsics.c(this.b, onCheckoutSectionHeader.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22107a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("OnCheckoutSectionHeader(title=", this.f22107a, ", imageUrl=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnInsetBanner;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnInsetBanner {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f22108a;
        public final String b;
        public final Action c;

        public OnInsetBanner(InsetBannerDisplayType insetBannerDisplayType, String str, Action action) {
            this.f22108a = insetBannerDisplayType;
            this.b = str;
            this.c = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnInsetBanner)) {
                return false;
            }
            OnInsetBanner onInsetBanner = (OnInsetBanner) obj;
            return this.f22108a == onInsetBanner.f22108a && Intrinsics.c(this.b, onInsetBanner.b) && Intrinsics.c(this.c, onInsetBanner.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f22108a.hashCode() * 31, 31, this.b);
            Action action = this.c;
            return iC + (action == null ? 0 : action.hashCode());
        }

        public final String toString() {
            StringBuilder sbU = d.u("OnInsetBanner(displayType=", this.f22108a, ", message=", this.b, ", action=");
            sbU.append(this.c);
            sbU.append(")");
            return sbU.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OnSnackBar;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnSnackBar {

        /* renamed from: a, reason: collision with root package name */
        public final String f22109a;
        public final String b;

        public OnSnackBar(String str, String str2) {
            this.f22109a = str;
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
            return Intrinsics.c(this.f22109a, onSnackBar.f22109a) && Intrinsics.c(this.b, onSnackBar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22109a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("OnSnackBar(message=", this.f22109a, ", eventSource=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Option;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Option {

        /* renamed from: a, reason: collision with root package name */
        public final String f22110a;
        public final CollectionModeId b;
        public final boolean c;
        public final Integer d;

        public Option(String str, CollectionModeId collectionModeId, boolean z, Integer num) {
            this.f22110a = str;
            this.b = collectionModeId;
            this.c = z;
            this.d = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option)) {
                return false;
            }
            Option option = (Option) obj;
            return Intrinsics.c(this.f22110a, option.f22110a) && this.b == option.b && this.c == option.c && Intrinsics.c(this.d, option.d);
        }

        public final int hashCode() {
            int iE = b.e((this.b.hashCode() + (this.f22110a.hashCode() * 31)) * 31, 31, this.c);
            Integer num = this.d;
            return iE + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            return "Option(title=" + this.f22110a + ", modeId=" + this.b + ", isSelected=" + this.c + ", addressId=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Option1;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Option1 {

        /* renamed from: a, reason: collision with root package name */
        public final int f22111a;
        public final boolean b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public Option1(int i, boolean z, String str, String str2, String str3, String str4) {
            this.f22111a = i;
            this.b = z;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option1)) {
                return false;
            }
            Option1 option1 = (Option1) obj;
            return this.f22111a == option1.f22111a && this.b == option1.b && Intrinsics.c(this.c, option1.c) && Intrinsics.c(this.d, option1.d) && Intrinsics.c(this.e, option1.e) && Intrinsics.c(this.f, option1.f);
        }

        public final int hashCode() {
            int iC = b.c(b.c(b.e(Integer.hashCode(this.f22111a) * 31, 31, this.b), 31, this.c), 31, this.d);
            String str = this.e;
            return this.f.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Option1(id=");
            sb.append(this.f22111a);
            sb.append(", isSelected=");
            sb.append(this.b);
            sb.append(", title=");
            a.B(sb, this.c, ", price=", this.d, ", description=");
            return a.l(sb, this.e, ", imageUrl=", this.f, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Option2;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Option2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22112a;
        public final String b;

        public Option2(String str, String str2) {
            this.f22112a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Option2)) {
                return false;
            }
            Option2 option2 = (Option2) obj;
            return Intrinsics.c(this.f22112a, option2.f22112a) && Intrinsics.c(this.b, option2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22112a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("Option2(title=", this.f22112a, ", id=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$OrderTotalDetails;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OrderTotalDetails {

        /* renamed from: a, reason: collision with root package name */
        public final InlineMessage4 f22113a;
        public final ArrayList b;
        public final Total c;
        public final ReviewProducts d;
        public final String e;

        public OrderTotalDetails(InlineMessage4 inlineMessage4, ArrayList arrayList, Total total, ReviewProducts reviewProducts, String str) {
            this.f22113a = inlineMessage4;
            this.b = arrayList;
            this.c = total;
            this.d = reviewProducts;
            this.e = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OrderTotalDetails)) {
                return false;
            }
            OrderTotalDetails orderTotalDetails = (OrderTotalDetails) obj;
            return Intrinsics.c(this.f22113a, orderTotalDetails.f22113a) && this.b.equals(orderTotalDetails.b) && this.c.equals(orderTotalDetails.c) && Intrinsics.c(this.d, orderTotalDetails.d) && Intrinsics.c(this.e, orderTotalDetails.e);
        }

        public final int hashCode() {
            InlineMessage4 inlineMessage4 = this.f22113a;
            int iHashCode = (this.c.hashCode() + androidx.compose.ui.input.pointer.a.b((inlineMessage4 == null ? 0 : inlineMessage4.hashCode()) * 31, 31, this.b)) * 31;
            ReviewProducts reviewProducts = this.d;
            int iHashCode2 = (iHashCode + (reviewProducts == null ? 0 : reviewProducts.hashCode())) * 31;
            String str = this.e;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OrderTotalDetails(inlineMessage=");
            sb.append(this.f22113a);
            sb.append(", sections=");
            sb.append(this.b);
            sb.append(", total=");
            sb.append(this.c);
            sb.append(", reviewProducts=");
            sb.append(this.d);
            sb.append(", panelMarkdown=");
            return YU.a.o(sb, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$PrimaryButton;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrimaryButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f22114a;
        public final ButtonStyle b;
        public final boolean c;

        public PrimaryButton(String str, ButtonStyle buttonStyle, boolean z) {
            this.f22114a = str;
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
            return Intrinsics.c(this.f22114a, primaryButton.f22114a) && this.b == primaryButton.b && this.c == primaryButton.c;
        }

        public final int hashCode() {
            int iHashCode = this.f22114a.hashCode() * 31;
            ButtonStyle buttonStyle = this.b;
            return Boolean.hashCode(this.c) + ((iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31);
        }

        public final String toString() {
            return YU.a.k(")", au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.q("PrimaryButton(label=", this.f22114a, ", style=", this.b, ", enabled="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$PrimaryCta;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrimaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f22115a;

        public PrimaryCta(String str) {
            this.f22115a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof PrimaryCta) && Intrinsics.c(this.f22115a, ((PrimaryCta) obj).f22115a);
        }

        public final int hashCode() {
            return this.f22115a.hashCode();
        }

        public final String toString() {
            return YU.a.h("PrimaryCta(label=", this.f22115a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Product;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Product {

        /* renamed from: a, reason: collision with root package name */
        public final String f22116a;
        public final double b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final Instruction h;
        public final Rewards i;
        public final RemoveInfo j;
        public final boolean k;
        public final ArrayList l;
        public final boolean m;
        public final CartProductInfo n;
        public final SubstitutionPreference o;

        public Product(String str, double d, String str2, String str3, String str4, String str5, String str6, Instruction instruction, Rewards rewards, RemoveInfo removeInfo, boolean z, ArrayList arrayList, boolean z2, CartProductInfo cartProductInfo, SubstitutionPreference substitutionPreference) {
            this.f22116a = str;
            this.b = d;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = instruction;
            this.i = rewards;
            this.j = removeInfo;
            this.k = z;
            this.l = arrayList;
            this.m = z2;
            this.n = cartProductInfo;
            this.o = substitutionPreference;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product)) {
                return false;
            }
            Product product = (Product) obj;
            return this.f22116a.equals(product.f22116a) && Double.compare(this.b, product.b) == 0 && this.c.equals(product.c) && this.d.equals(product.d) && this.e.equals(product.e) && this.f.equals(product.f) && this.g.equals(product.g) && this.h.equals(product.h) && Intrinsics.c(this.i, product.i) && this.j.equals(product.j) && this.k == product.k && this.l.equals(product.l) && this.m == product.m && Intrinsics.c(this.n, product.n) && Intrinsics.c(this.o, product.o);
        }

        public final int hashCode() {
            int iHashCode = (this.h.hashCode() + b.c(b.c(b.c(b.c(b.c(android.support.v4.media.session.a.a(this.b, this.f22116a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31;
            Rewards rewards = this.i;
            int iE = b.e(androidx.compose.ui.input.pointer.a.b(b.e((this.j.hashCode() + ((iHashCode + (rewards == null ? 0 : rewards.hashCode())) * 31)) * 31, 31, this.k), 31, this.l), 31, this.m);
            CartProductInfo cartProductInfo = this.n;
            int iHashCode2 = (iE + (cartProductInfo == null ? 0 : cartProductInfo.hashCode())) * 31;
            SubstitutionPreference substitutionPreference = this.o;
            return iHashCode2 + (substitutionPreference != null ? substitutionPreference.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbR = au.com.woolworths.android.onesite.a.r(this.b, "Product(title=", this.f22116a, ", quantity=");
            a.B(sbR, ", productId=", this.c, ", unitPrice=", this.d);
            a.B(sbR, ", totalPrice=", this.e, ", totalTitle=", this.f);
            sbR.append(", imageUrl=");
            sbR.append(this.g);
            sbR.append(", instruction=");
            sbR.append(this.h);
            sbR.append(", rewards=");
            sbR.append(this.i);
            sbR.append(", removeInfo=");
            sbR.append(this.j);
            sbR.append(", allowSubstitution=");
            sbR.append(this.k);
            sbR.append(", messages=");
            sbR.append(this.l);
            sbR.append(", showSubstitution=");
            sbR.append(this.m);
            sbR.append(", cartProductInfo=");
            sbR.append(this.n);
            sbR.append(", substitutionPreference=");
            sbR.append(this.o);
            sbR.append(")");
            return sbR.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Product1;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Product1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22117a;
        public final double b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final RemoveInfo1 i;
        public final CartProductInfo1 j;

        public Product1(String str, double d, String str2, String str3, String str4, String str5, String str6, String str7, RemoveInfo1 removeInfo1, CartProductInfo1 cartProductInfo1) {
            this.f22117a = str;
            this.b = d;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = str7;
            this.i = removeInfo1;
            this.j = cartProductInfo1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Product1)) {
                return false;
            }
            Product1 product1 = (Product1) obj;
            return Intrinsics.c(this.f22117a, product1.f22117a) && Double.compare(this.b, product1.b) == 0 && Intrinsics.c(this.c, product1.c) && Intrinsics.c(this.d, product1.d) && Intrinsics.c(this.e, product1.e) && Intrinsics.c(this.f, product1.f) && Intrinsics.c(this.g, product1.g) && Intrinsics.c(this.h, product1.h) && Intrinsics.c(this.i, product1.i) && Intrinsics.c(this.j, product1.j);
        }

        public final int hashCode() {
            int iHashCode = (this.i.hashCode() + b.c(b.c(b.c(b.c(b.c(b.c(android.support.v4.media.session.a.a(this.b, this.f22117a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31;
            CartProductInfo1 cartProductInfo1 = this.j;
            return iHashCode + (cartProductInfo1 == null ? 0 : cartProductInfo1.hashCode());
        }

        public final String toString() {
            StringBuilder sbR = au.com.woolworths.android.onesite.a.r(this.b, "Product1(title=", this.f22117a, ", quantity=");
            a.B(sbR, ", productId=", this.c, ", unitPrice=", this.d);
            a.B(sbR, ", totalPrice=", this.e, ", totalTitle=", this.f);
            a.B(sbR, ", imageUrl=", this.g, ", brandName=", this.h);
            sbR.append(", removeInfo=");
            sbR.append(this.i);
            sbR.append(", cartProductInfo=");
            sbR.append(this.j);
            sbR.append(")");
            return sbR.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Product2;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Product2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22118a;

        public Product2(String str) {
            this.f22118a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Product2) && Intrinsics.c(this.f22118a, ((Product2) obj).f22118a);
        }

        public final int hashCode() {
            String str = this.f22118a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return YU.a.h("Product2(name=", this.f22118a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$ProductsInfo;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ProductsInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f22119a;
        public final String b;
        public final double c;
        public final double d;
        public final double e;
        public final boolean f;
        public final String g;
        public final String h;
        public final String i;

        public ProductsInfo(String str, String str2, double d, double d2, double d3, boolean z, String str3, String str4, String str5) {
            this.f22119a = str;
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
            return Intrinsics.c(this.f22119a, productsInfo.f22119a) && Intrinsics.c(this.b, productsInfo.b) && Double.compare(this.c, productsInfo.c) == 0 && Double.compare(this.d, productsInfo.d) == 0 && Double.compare(this.e, productsInfo.e) == 0 && this.f == productsInfo.f && Intrinsics.c(this.g, productsInfo.g) && Intrinsics.c(this.h, productsInfo.h) && Intrinsics.c(this.i, productsInfo.i);
        }

        public final int hashCode() {
            int iE = b.e(android.support.v4.media.session.a.a(this.e, android.support.v4.media.session.a.a(this.d, android.support.v4.media.session.a.a(this.c, b.c(this.f22119a.hashCode() * 31, 31, this.b), 31), 31), 31), 31, this.f);
            String str = this.g;
            int iHashCode = (iE + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.h;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.i;
            return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("ProductsInfo(productId=", this.f22119a, ", productName=", this.b, ", price=");
            sbV.append(this.c);
            au.com.woolworths.android.onesite.a.z(sbV, ", quantity=", this.d, ", subtotal=");
            sbV.append(this.e);
            sbV.append(", isAvailable=");
            sbV.append(this.f);
            a.B(sbV, ", sellerName=", this.g, ", brandName=", this.h);
            return YU.a.p(sbV, ", dispatchNote=", this.i, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Progress;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Progress {

        /* renamed from: a, reason: collision with root package name */
        public final String f22120a;
        public final CheckoutProgressId b;
        public final String c;

        public Progress(String str, CheckoutProgressId checkoutProgressId, String str2) {
            this.f22120a = str;
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
            return Intrinsics.c(this.f22120a, progress.f22120a) && this.b == progress.b && Intrinsics.c(this.c, progress.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (this.f22120a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Progress(index=");
            sb.append(this.f22120a);
            sb.append(", id=");
            sb.append(this.b);
            sb.append(", title=");
            return YU.a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$RemoveInfo;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RemoveInfo {

        /* renamed from: a, reason: collision with root package name */
        public final String f22121a;
        public final String b;
        public final String c;

        public RemoveInfo(String str, String str2, String str3) {
            this.f22121a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoveInfo)) {
                return false;
            }
            RemoveInfo removeInfo = (RemoveInfo) obj;
            return Intrinsics.c(this.f22121a, removeInfo.f22121a) && Intrinsics.c(this.b, removeInfo.b) && Intrinsics.c(this.c, removeInfo.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f22121a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("RemoveInfo(title=", this.f22121a, ", message=", this.b, ", buttonTitle="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$RemoveInfo1;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RemoveInfo1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22122a;
        public final String b;
        public final String c;

        public RemoveInfo1(String str, String str2, String str3) {
            this.f22122a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoveInfo1)) {
                return false;
            }
            RemoveInfo1 removeInfo1 = (RemoveInfo1) obj;
            return Intrinsics.c(this.f22122a, removeInfo1.f22122a) && Intrinsics.c(this.b, removeInfo1.b) && Intrinsics.c(this.c, removeInfo1.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f22122a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("RemoveInfo1(title=", this.f22122a, ", message=", this.b, ", buttonTitle="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$RestrictedOrderItem;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RestrictedOrderItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f22123a;

        public RestrictedOrderItem(String str) {
            this.f22123a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RestrictedOrderItem) && Intrinsics.c(this.f22123a, ((RestrictedOrderItem) obj).f22123a);
        }

        public final int hashCode() {
            String str = this.f22123a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return YU.a.h("RestrictedOrderItem(name=", this.f22123a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$RestrictedProductsByDeliPlatter;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RestrictedProductsByDeliPlatter {

        /* renamed from: a, reason: collision with root package name */
        public final String f22124a;

        public RestrictedProductsByDeliPlatter(String str) {
            this.f22124a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RestrictedProductsByDeliPlatter) && Intrinsics.c(this.f22124a, ((RestrictedProductsByDeliPlatter) obj).f22124a);
        }

        public final int hashCode() {
            String str = this.f22124a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return YU.a.h("RestrictedProductsByDeliPlatter(name=", this.f22124a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$RestrictedProductsByDeliveryMethod;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RestrictedProductsByDeliveryMethod {

        /* renamed from: a, reason: collision with root package name */
        public final String f22125a;

        public RestrictedProductsByDeliveryMethod(String str) {
            this.f22125a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RestrictedProductsByDeliveryMethod) && Intrinsics.c(this.f22125a, ((RestrictedProductsByDeliveryMethod) obj).f22125a);
        }

        public final int hashCode() {
            String str = this.f22125a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return YU.a.h("RestrictedProductsByDeliveryMethod(name=", this.f22125a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$RestrictionPrompt;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RestrictionPrompt {

        /* renamed from: a, reason: collision with root package name */
        public final String f22126a;
        public final String b;

        public RestrictionPrompt(String str, String str2) {
            this.f22126a = str;
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
            return Intrinsics.c(this.f22126a, restrictionPrompt.f22126a) && Intrinsics.c(this.b, restrictionPrompt.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22126a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("RestrictionPrompt(title=", this.f22126a, ", message=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$ReviewProducts;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ReviewProducts {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f22127a;
        public final ArrayList b;
        public final ArrayList c;
        public final ArrayList d;
        public final ArrayList e;
        public final ArrayList f;

        public ReviewProducts(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
            this.f22127a = arrayList;
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
            return this.f22127a.equals(reviewProducts.f22127a) && this.b.equals(reviewProducts.b) && this.c.equals(reviewProducts.c) && this.d.equals(reviewProducts.d) && this.e.equals(reviewProducts.e) && this.f.equals(reviewProducts.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b(this.f22127a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            return "ReviewProducts(unavailableOrderItems=" + this.f22127a + ", restrictedOrderItems=" + this.b + ", exceededSupplyLimitProductGroups=" + this.c + ", restrictedProductsByDeliveryMethod=" + this.d + ", restrictedProductsByDeliPlatter=" + this.e + ", availableOrderItems=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Rewards;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Rewards {

        /* renamed from: a, reason: collision with root package name */
        public final String f22128a;
        public final String b;

        public Rewards(String str, String str2) {
            this.f22128a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Rewards)) {
                return false;
            }
            Rewards rewards = (Rewards) obj;
            return Intrinsics.c(this.f22128a, rewards.f22128a) && Intrinsics.c(this.b, rewards.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22128a.hashCode() * 31);
        }

        public final String toString() {
            return YU.a.j("Rewards(points=", this.f22128a, ", imageUrl=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$SecondaryButton;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SecondaryButton {

        /* renamed from: a, reason: collision with root package name */
        public final String f22129a;
        public final ButtonStyle b;
        public final boolean c;

        public SecondaryButton(String str, ButtonStyle buttonStyle, boolean z) {
            this.f22129a = str;
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
            return Intrinsics.c(this.f22129a, secondaryButton.f22129a) && this.b == secondaryButton.b && this.c == secondaryButton.c;
        }

        public final int hashCode() {
            int iHashCode = this.f22129a.hashCode() * 31;
            ButtonStyle buttonStyle = this.b;
            return Boolean.hashCode(this.c) + ((iHashCode + (buttonStyle == null ? 0 : buttonStyle.hashCode())) * 31);
        }

        public final String toString() {
            return YU.a.k(")", au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.q("SecondaryButton(label=", this.f22129a, ", style=", this.b, ", enabled="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$SecondaryCta;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SecondaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f22130a;

        public SecondaryCta(String str) {
            this.f22130a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SecondaryCta) && Intrinsics.c(this.f22130a, ((SecondaryCta) obj).f22130a);
        }

        public final int hashCode() {
            return this.f22130a.hashCode();
        }

        public final String toString() {
            return YU.a.h("SecondaryCta(label=", this.f22130a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Section;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Section {

        /* renamed from: a, reason: collision with root package name */
        public final String f22131a;
        public final CheckoutSummaryValueType b;
        public final String c;
        public final CheckoutSummaryValueType d;
        public final String e;
        public final Message1 f;

        public Section(String str, CheckoutSummaryValueType checkoutSummaryValueType, String str2, CheckoutSummaryValueType checkoutSummaryValueType2, String str3, Message1 message1) {
            this.f22131a = str;
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
            return Intrinsics.c(this.f22131a, section.f22131a) && this.b == section.b && Intrinsics.c(this.c, section.c) && this.d == section.d && Intrinsics.c(this.e, section.e) && Intrinsics.c(this.f, section.f);
        }

        public final int hashCode() {
            int iHashCode = (this.d.hashCode() + b.c((this.b.hashCode() + (this.f22131a.hashCode() * 31)) * 31, 31, this.c)) * 31;
            String str = this.e;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Message1 message1 = this.f;
            return iHashCode2 + (message1 != null ? message1.hashCode() : 0);
        }

        public final String toString() {
            return "Section(title=" + this.f22131a + ", titleType=" + this.b + ", value=" + this.c + ", valueType=" + this.d + ", imageUrl=" + this.e + ", message=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$SellerGroup;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SellerGroup {

        /* renamed from: a, reason: collision with root package name */
        public final String f22132a;
        public final String b;
        public final ArrayList c;

        public SellerGroup(String str, String str2, ArrayList arrayList) {
            this.f22132a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SellerGroup)) {
                return false;
            }
            SellerGroup sellerGroup = (SellerGroup) obj;
            return this.f22132a.equals(sellerGroup.f22132a) && this.b.equals(sellerGroup.b) && this.c.equals(sellerGroup.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f22132a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", YU.a.v("SellerGroup(sellerName=", this.f22132a, ", dispatchNote=", this.b, ", products="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$ShoppingModeDetails;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShoppingModeDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f22133a;
        public final String b;
        public final Integer c;

        public ShoppingModeDetails(String str, String str2, Integer num) {
            this.f22133a = str;
            this.b = str2;
            this.c = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShoppingModeDetails)) {
                return false;
            }
            ShoppingModeDetails shoppingModeDetails = (ShoppingModeDetails) obj;
            return Intrinsics.c(this.f22133a, shoppingModeDetails.f22133a) && Intrinsics.c(this.b, shoppingModeDetails.b) && Intrinsics.c(this.c, shoppingModeDetails.c);
        }

        public final int hashCode() {
            String str = this.f22133a;
            int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            Integer num = this.c;
            return iC + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.p(YU.a.v("ShoppingModeDetails(displayName=", this.f22133a, ", mode=", this.b, ", storeAddressId="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$ShoppingModeDetails1;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ShoppingModeDetails1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f22134a;
        public final String b;
        public final Integer c;

        public ShoppingModeDetails1(String str, String str2, Integer num) {
            this.f22134a = str;
            this.b = str2;
            this.c = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShoppingModeDetails1)) {
                return false;
            }
            ShoppingModeDetails1 shoppingModeDetails1 = (ShoppingModeDetails1) obj;
            return Intrinsics.c(this.f22134a, shoppingModeDetails1.f22134a) && Intrinsics.c(this.b, shoppingModeDetails1.b) && Intrinsics.c(this.c, shoppingModeDetails1.c);
        }

        public final int hashCode() {
            String str = this.f22134a;
            int iC = b.c((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            Integer num = this.c;
            return iC + (num != null ? num.hashCode() : 0);
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.p(YU.a.v("ShoppingModeDetails1(displayName=", this.f22134a, ", mode=", this.b, ", storeAddressId="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Substitution;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Substitution {

        /* renamed from: a, reason: collision with root package name */
        public final String f22135a;
        public final String b;
        public final ArrayList c;
        public final Info d;

        public Substitution(String str, String str2, ArrayList arrayList, Info info) {
            this.f22135a = str;
            this.b = str2;
            this.c = arrayList;
            this.d = info;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Substitution)) {
                return false;
            }
            Substitution substitution = (Substitution) obj;
            return this.f22135a.equals(substitution.f22135a) && this.b.equals(substitution.b) && this.c.equals(substitution.c) && this.d.equals(substitution.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + androidx.compose.ui.input.pointer.a.b(b.c(this.f22135a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("Substitution(title=", this.f22135a, ", selectedOptionTitle=", this.b, ", options=");
            sbV.append(this.c);
            sbV.append(", info=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$SubstitutionPreference;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SubstitutionPreference {

        /* renamed from: a, reason: collision with root package name */
        public final SubstitutionState f22136a;
        public final String b;
        public final String c;
        public final Action1 d;

        public SubstitutionPreference(SubstitutionState substitutionState, String str, String str2, Action1 action1) {
            this.f22136a = substitutionState;
            this.b = str;
            this.c = str2;
            this.d = action1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubstitutionPreference)) {
                return false;
            }
            SubstitutionPreference substitutionPreference = (SubstitutionPreference) obj;
            return this.f22136a == substitutionPreference.f22136a && Intrinsics.c(this.b, substitutionPreference.b) && Intrinsics.c(this.c, substitutionPreference.c) && Intrinsics.c(this.d, substitutionPreference.d);
        }

        public final int hashCode() {
            int iHashCode = this.f22136a.hashCode() * 31;
            String str = this.b;
            return this.d.hashCode() + b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        }

        public final String toString() {
            return "SubstitutionPreference(state=" + this.f22136a + ", header=" + this.b + ", title=" + this.c + ", action=" + this.d + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$SubstitutionPreferenceOnboardingBanner;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SubstitutionPreferenceOnboardingBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f22137a;
        public final String b;
        public final String c;
        public final BroadcastBannerType d;
        public final String e;
        public final String f;
        public final String g;
        public final Boolean h;
        public final String i;

        public SubstitutionPreferenceOnboardingBanner(String str, String str2, String str3, BroadcastBannerType broadcastBannerType, String str4, String str5, String str6, Boolean bool, String str7) {
            this.f22137a = str;
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
            if (!(obj instanceof SubstitutionPreferenceOnboardingBanner)) {
                return false;
            }
            SubstitutionPreferenceOnboardingBanner substitutionPreferenceOnboardingBanner = (SubstitutionPreferenceOnboardingBanner) obj;
            return Intrinsics.c(this.f22137a, substitutionPreferenceOnboardingBanner.f22137a) && Intrinsics.c(this.b, substitutionPreferenceOnboardingBanner.b) && Intrinsics.c(this.c, substitutionPreferenceOnboardingBanner.c) && this.d == substitutionPreferenceOnboardingBanner.d && Intrinsics.c(this.e, substitutionPreferenceOnboardingBanner.e) && Intrinsics.c(this.f, substitutionPreferenceOnboardingBanner.f) && Intrinsics.c(this.g, substitutionPreferenceOnboardingBanner.g) && Intrinsics.c(this.h, substitutionPreferenceOnboardingBanner.h) && Intrinsics.c(this.i, substitutionPreferenceOnboardingBanner.i);
        }

        public final int hashCode() {
            int iHashCode = this.f22137a.hashCode() * 31;
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
            StringBuilder sbV = YU.a.v("SubstitutionPreferenceOnboardingBanner(title=", this.f22137a, ", subtitle=", this.b, ", deeplink=");
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$SubstitutionPreferences;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SubstitutionPreferences {

        /* renamed from: a, reason: collision with root package name */
        public final String f22138a;
        public final String b;
        public final SubstitutionState c;
        public final Info1 d;

        public SubstitutionPreferences(String str, String str2, SubstitutionState substitutionState, Info1 info1) {
            this.f22138a = str;
            this.b = str2;
            this.c = substitutionState;
            this.d = info1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SubstitutionPreferences)) {
                return false;
            }
            SubstitutionPreferences substitutionPreferences = (SubstitutionPreferences) obj;
            return Intrinsics.c(this.f22138a, substitutionPreferences.f22138a) && Intrinsics.c(this.b, substitutionPreferences.b) && this.c == substitutionPreferences.c && Intrinsics.c(this.d, substitutionPreferences.d);
        }

        public final int hashCode() {
            int iHashCode = this.f22138a.hashCode() * 31;
            String str = this.b;
            return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("SubstitutionPreferences(title=", this.f22138a, ", body=", this.b, ", state=");
            sbV.append(this.c);
            sbV.append(", info=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Total;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Total {

        /* renamed from: a, reason: collision with root package name */
        public final String f22139a;
        public final String b;
        public final double c;
        public final String d;
        public final CheckoutProgressId e;
        public final boolean f;

        public Total(String str, String str2, double d, String str3, CheckoutProgressId checkoutProgressId, boolean z) {
            this.f22139a = str;
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
            return Intrinsics.c(this.f22139a, total.f22139a) && Intrinsics.c(this.b, total.b) && Double.compare(this.c, total.c) == 0 && Intrinsics.c(this.d, total.d) && this.e == total.e && this.f == total.f;
        }

        public final int hashCode() {
            int iC = b.c(android.support.v4.media.session.a.a(this.c, b.c(this.f22139a.hashCode() * 31, 31, this.b), 31), 31, this.d);
            CheckoutProgressId checkoutProgressId = this.e;
            return Boolean.hashCode(this.f) + ((iC + (checkoutProgressId == null ? 0 : checkoutProgressId.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("Total(title=", this.f22139a, ", value=", this.b, ", balanceToPay=");
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
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$UnavailableOrderItem;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UnavailableOrderItem {

        /* renamed from: a, reason: collision with root package name */
        public final String f22140a;

        public UnavailableOrderItem(String str) {
            this.f22140a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnavailableOrderItem) && Intrinsics.c(this.f22140a, ((UnavailableOrderItem) obj).f22140a);
        }

        public final int hashCode() {
            String str = this.f22140a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return YU.a.h("UnavailableOrderItem(name=", this.f22140a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/fragment/CheckoutContent$Windows;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Windows {

        /* renamed from: a, reason: collision with root package name */
        public final String f22141a;
        public final CheckoutFulfilmentWindows b;

        public Windows(String str, CheckoutFulfilmentWindows checkoutFulfilmentWindows) {
            this.f22141a = str;
            this.b = checkoutFulfilmentWindows;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Windows)) {
                return false;
            }
            Windows windows = (Windows) obj;
            return Intrinsics.c(this.f22141a, windows.f22141a) && Intrinsics.c(this.b, windows.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f22141a.hashCode() * 31);
        }

        public final String toString() {
            return "Windows(__typename=" + this.f22141a + ", checkoutFulfilmentWindows=" + this.b + ")";
        }
    }

    public CheckoutContent(List list, Message message, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, OrderTotalDetails orderTotalDetails, IdVerificationBottomSheet idVerificationBottomSheet, RestrictionPrompt restrictionPrompt) {
        this.f22062a = list;
        this.b = message;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = orderTotalDetails;
        this.g = idVerificationBottomSheet;
        this.h = restrictionPrompt;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutContent)) {
            return false;
        }
        CheckoutContent checkoutContent = (CheckoutContent) obj;
        return Intrinsics.c(this.f22062a, checkoutContent.f22062a) && Intrinsics.c(this.b, checkoutContent.b) && this.c.equals(checkoutContent.c) && this.d.equals(checkoutContent.d) && this.e.equals(checkoutContent.e) && this.f.equals(checkoutContent.f) && Intrinsics.c(this.g, checkoutContent.g) && Intrinsics.c(this.h, checkoutContent.h);
    }

    public final int hashCode() {
        List list = this.f22062a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Message message = this.b;
        int iHashCode2 = (this.f.hashCode() + androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b((iHashCode + (message == null ? 0 : message.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e)) * 31;
        IdVerificationBottomSheet idVerificationBottomSheet = this.g;
        int iHashCode3 = (iHashCode2 + (idVerificationBottomSheet == null ? 0 : idVerificationBottomSheet.hashCode())) * 31;
        RestrictionPrompt restrictionPrompt = this.h;
        return iHashCode3 + (restrictionPrompt != null ? restrictionPrompt.hashCode() : 0);
    }

    public final String toString() {
        return "CheckoutContent(productsInfo=" + this.f22062a + ", message=" + this.b + ", legacyErrors=" + this.c + ", progress=" + this.d + ", content=" + this.e + ", orderTotalDetails=" + this.f + ", idVerificationBottomSheet=" + this.g + ", restrictionPrompt=" + this.h + ")";
    }
}
