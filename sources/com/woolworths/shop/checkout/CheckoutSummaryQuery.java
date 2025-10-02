package com.woolworths.shop.checkout;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.checkout.adapter.CheckoutSummaryQuery_ResponseAdapter;
import com.woolworths.shop.checkout.fragment.CheckoutContentSummary;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/checkout/CheckoutSummaryQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/checkout/CheckoutSummaryQuery$Data;", "Data", "CheckoutSummary", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class CheckoutSummaryQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f21825a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final Optional j;
    public final Optional k;
    public final Optional l;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/CheckoutSummaryQuery$CheckoutSummary;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CheckoutSummary {

        /* renamed from: a, reason: collision with root package name */
        public final String f21826a;
        public final CheckoutContentSummary b;

        public CheckoutSummary(String str, CheckoutContentSummary checkoutContentSummary) {
            this.f21826a = str;
            this.b = checkoutContentSummary;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CheckoutSummary)) {
                return false;
            }
            CheckoutSummary checkoutSummary = (CheckoutSummary) obj;
            return Intrinsics.c(this.f21826a, checkoutSummary.f21826a) && Intrinsics.c(this.b, checkoutSummary.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21826a.hashCode() * 31);
        }

        public final String toString() {
            return "CheckoutSummary(__typename=" + this.f21826a + ", checkoutContentSummary=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/checkout/CheckoutSummaryQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/CheckoutSummaryQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final CheckoutSummary f21827a;

        public Data(CheckoutSummary checkoutSummary) {
            this.f21827a = checkoutSummary;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21827a, ((Data) obj).f21827a);
        }

        public final int hashCode() {
            CheckoutSummary checkoutSummary = this.f21827a;
            if (checkoutSummary == null) {
                return 0;
            }
            return checkoutSummary.hashCode();
        }

        public final String toString() {
            return "Data(checkoutSummary=" + this.f21827a + ")";
        }
    }

    public CheckoutSummaryQuery(Optional optional, Optional optional2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.f21825a = optional;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        Optional.Absent absent = Optional.Absent.f13523a;
        this.j = absent;
        this.k = absent;
        this.l = optional2;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(CheckoutSummaryQuery_ResponseAdapter.Data.f21967a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query CheckoutSummary($includeIdVerificationBottomSheet: Boolean = false , $includeRewardsAndDiscounts: Boolean!, $isRewardsUplift: Boolean!, $isPromoCodeUplift: Boolean!, $includeCredit: Boolean!, $rewardsAndDiscountsImpressionUplift: Boolean!, $includePanelMarkdown: Boolean!, $includeContactDetails: Boolean!, $isWPayEnabled: Boolean!, $includeTimeSelectionContent: Boolean! = false , $includeSuggestedTimeSlot: Boolean! = false , $includeServiceFees: Boolean! = false ) { checkoutSummary { __typename ...checkoutContentSummary } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment checkoutContentSummary on CheckoutContent { productsInfo { productId productName price quantity subtotal isAvailable sellerName brandName dispatchNote } message { __typename ... on SnackBar { message eventSource } } legacyErrors { errorCode message key } progress { index id title } content { __typename ... on InsetBanner { displayType message } ... on CheckoutSummaryBillingAddress { title addressText } ... on CheckoutSummaryBillingAddressEmpty { title displayName buttonText } ... on CheckoutSummaryRewardsUnregistered @skip(if: $isRewardsUplift) { buttonTitle } ... on CheckoutSummaryRewards @skip(if: $isRewardsUplift) { rewardsSections { __typename ... on CheckoutSummaryRewardsRegistered { title subtitle imageUrl } ... on CheckoutSummaryRewardsRegisteredRedeemable { redeemText buttonTitle isRedeemed redeemInfo { title message buttonTitle secondaryButtonTitle } } } } ... on CheckoutOrderAddresses { title addressSections { __typename ... on CheckoutOrderGroceryAddress { title addressText imageUrl fulfilmentWindow } ... on CheckoutOrderMarketAddress { title addressText imageUrl sellerInfo { sellerName dispatchNote } } } insetBanner { displayType message } } ... on CheckoutOrderSummary { title sections { title titleType value valueType imageUrl message { title body type @include(if: $includeServiceFees) } } } ... on CheckoutTermsConditions { markdownText } ... on CheckoutPromotionCode @skip(if: $isPromoCodeUplift) { title placeholderText buttonTitle discounts { discountItems { title price } buttonTitle } } ... on CheckoutRewardsAndDiscounts @include(if: $includeRewardsAndDiscounts) { title rewardsAndDiscounts { __typename ... on CheckoutRewards @include(if: $isRewardsUplift) { title description redeemedIcon actionClickAnalytics { __typename ...analyticsFields } rewardsAction { __typename ... on CheckoutRewardsRedeem { rewardsRedeemInfo { minimum maximum maximumRedeemable increment current unRedeemableBanner { displayType message } } title description impressionAnalytics { __typename ...analyticsFields } } ... on CheckoutRewardsInfo { title description buttonTitle impressionAnalytics { __typename ...analyticsFields } buttonClickAnalytics { __typename ...analyticsFields } } ... on CheckoutRewardsLink { __typename } } } ... on CheckoutPromoCode @include(if: $isPromoCodeUplift) { title description appliedIcon actionClickAnalytics { __typename ...analyticsFields } detail { placeholderText buttonTitle promoCodes { __typename ... on CheckoutPromoCodeItem { title subtitle primaryLabel secondaryLabel isApplied code } } } } ... on CheckoutCredit @include(if: $includeCredit) { title description appliedIcon actionClickAnalytics { __typename ...analyticsFields } detail { __typename ... on CheckoutCreditEmpty { title message } ... on CheckoutCreditItems { title subtitle items { title subtitle primaryLabel secondaryLabel isApplied code amount } } ... on CheckoutCreditUnavailable { title message retryButtonTitle } } } } impressionAnalytics @skip(if: $rewardsAndDiscountsImpressionUplift) { __typename ...analyticsFields } } } orderTotalDetails { inlineMessage { displayType message } sections { title titleType value valueType imageUrl message @include(if: $includeServiceFees) { title body type } } total { title value balanceToPay buttonTitle progressId isEnabled } refundInfo { bottomSheetTitle bottomSheetBody primaryCta { label } } reviewProducts { unavailableOrderItems { name } restrictedOrderItems { name } exceededSupplyLimitProductGroups { products { name } } restrictedProductsByDeliveryMethod { name } restrictedProductsByDeliPlatter { name } availableOrderItems { name } } panelMarkdown @include(if: $includePanelMarkdown) } idVerificationBottomSheet @include(if: $includeIdVerificationBottomSheet) { title body imageUrls primaryButton { label style enabled } secondaryButton { label style enabled } } impressionAnalytics @include(if: $rewardsAndDiscountsImpressionUplift) { __typename ...analyticsFields } isUserWPayMigrated @include(if: $isWPayEnabled) restrictionPrompt { title message } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheckoutSummaryQuery)) {
            return false;
        }
        CheckoutSummaryQuery checkoutSummaryQuery = (CheckoutSummaryQuery) obj;
        return Intrinsics.c(this.f21825a, checkoutSummaryQuery.f21825a) && this.b == checkoutSummaryQuery.b && this.c == checkoutSummaryQuery.c && this.d == checkoutSummaryQuery.d && this.e == checkoutSummaryQuery.e && this.f == checkoutSummaryQuery.f && this.g == checkoutSummaryQuery.g && this.h == checkoutSummaryQuery.h && this.i == checkoutSummaryQuery.i && Intrinsics.c(this.j, checkoutSummaryQuery.j) && Intrinsics.c(this.k, checkoutSummaryQuery.k) && Intrinsics.c(this.l, checkoutSummaryQuery.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + a.c(this.k, a.c(this.j, b.e(b.e(b.e(b.e(b.e(b.e(b.e(b.e(this.f21825a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "0975f9f7bc567191b80aef6fffde58065739b4c215d52a97c7b9dccc6663bd18";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "CheckoutSummary";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Optional optional = this.f21825a;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("includeIdVerificationBottomSheet");
            Adapters.d(Adapters.l).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        } else if (z) {
            jsonWriter.F1("includeIdVerificationBottomSheet");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        jsonWriter.F1("includeRewardsAndDiscounts");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        d.B(this.b, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isRewardsUplift");
        d.B(this.c, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isPromoCodeUplift");
        d.B(this.d, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeCredit");
        d.B(this.e, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "rewardsAndDiscountsImpressionUplift");
        d.B(this.f, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includePanelMarkdown");
        d.B(this.g, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeContactDetails");
        d.B(this.h, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isWPayEnabled");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.i));
        Optional optional2 = this.j;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("includeTimeSelectionContent");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        } else if (z) {
            jsonWriter.F1("includeTimeSelectionContent");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional3 = this.k;
        if (optional3 instanceof Optional.Present) {
            jsonWriter.F1("includeSuggestedTimeSlot");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional3);
        } else if (z) {
            jsonWriter.F1("includeSuggestedTimeSlot");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional4 = this.l;
        if (optional4 instanceof Optional.Present) {
            jsonWriter.F1("includeServiceFees");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional4);
        } else if (z) {
            jsonWriter.F1("includeServiceFees");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckoutSummaryQuery(includeIdVerificationBottomSheet=");
        sb.append(this.f21825a);
        sb.append(", includeRewardsAndDiscounts=");
        sb.append(this.b);
        sb.append(", isRewardsUplift=");
        au.com.woolworths.android.onesite.a.D(sb, this.c, ", isPromoCodeUplift=", this.d, ", includeCredit=");
        au.com.woolworths.android.onesite.a.D(sb, this.e, ", rewardsAndDiscountsImpressionUplift=", this.f, ", includePanelMarkdown=");
        au.com.woolworths.android.onesite.a.D(sb, this.g, ", includeContactDetails=", this.h, ", isWPayEnabled=");
        a.z(sb, this.i, ", includeTimeSelectionContent=", this.j, ", includeSuggestedTimeSlot=");
        sb.append(this.k);
        sb.append(", includeServiceFees=");
        sb.append(this.l);
        sb.append(")");
        return sb.toString();
    }
}
