package com.woolworths.shop.checkout;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.checkout.adapter.PayWithRewardsDollarMutation_ResponseAdapter;
import com.woolworths.shop.checkout.fragment.CheckoutContentSummary;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/checkout/PayWithRewardsDollarMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/shop/checkout/PayWithRewardsDollarMutation$Data;", "Data", "PayWithRewardsDollar", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class PayWithRewardsDollarMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f21872a;
    public final Optional b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final Optional k;
    public final Optional l;
    public final Optional m;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/checkout/PayWithRewardsDollarMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/PayWithRewardsDollarMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final PayWithRewardsDollar f21873a;

        public Data(PayWithRewardsDollar payWithRewardsDollar) {
            this.f21873a = payWithRewardsDollar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21873a, ((Data) obj).f21873a);
        }

        public final int hashCode() {
            PayWithRewardsDollar payWithRewardsDollar = this.f21873a;
            if (payWithRewardsDollar == null) {
                return 0;
            }
            return payWithRewardsDollar.hashCode();
        }

        public final String toString() {
            return "Data(payWithRewardsDollar=" + this.f21873a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/PayWithRewardsDollarMutation$PayWithRewardsDollar;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PayWithRewardsDollar {

        /* renamed from: a, reason: collision with root package name */
        public final String f21874a;
        public final CheckoutContentSummary b;

        public PayWithRewardsDollar(String str, CheckoutContentSummary checkoutContentSummary) {
            this.f21874a = str;
            this.b = checkoutContentSummary;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PayWithRewardsDollar)) {
                return false;
            }
            PayWithRewardsDollar payWithRewardsDollar = (PayWithRewardsDollar) obj;
            return Intrinsics.c(this.f21874a, payWithRewardsDollar.f21874a) && Intrinsics.c(this.b, payWithRewardsDollar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21874a.hashCode() * 31);
        }

        public final String toString() {
            return "PayWithRewardsDollar(__typename=" + this.f21874a + ", checkoutContentSummary=" + this.b + ")";
        }
    }

    public PayWithRewardsDollarMutation(Optional optional, Optional optional2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.f21872a = optional;
        this.b = optional2;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = z8;
        Optional.Absent absent = Optional.Absent.f13523a;
        this.k = absent;
        this.l = absent;
        this.m = absent;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(PayWithRewardsDollarMutation_ResponseAdapter.Data.f22008a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation PayWithRewardsDollar($amount: Int, $includeIdVerificationBottomSheet: Boolean = false , $includeRewardsAndDiscounts: Boolean!, $isRewardsUplift: Boolean!, $isPromoCodeUplift: Boolean!, $includeCredit: Boolean!, $rewardsAndDiscountsImpressionUplift: Boolean!, $includePanelMarkdown: Boolean!, $includeContactDetails: Boolean!, $isWPayEnabled: Boolean!, $includeTimeSelectionContent: Boolean! = false , $includeSuggestedTimeSlot: Boolean! = false , $includeServiceFees: Boolean! = false ) { payWithRewardsDollar(amount: $amount) { __typename ...checkoutContentSummary } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment checkoutContentSummary on CheckoutContent { productsInfo { productId productName price quantity subtotal isAvailable sellerName brandName dispatchNote } message { __typename ... on SnackBar { message eventSource } } legacyErrors { errorCode message key } progress { index id title } content { __typename ... on InsetBanner { displayType message } ... on CheckoutSummaryBillingAddress { title addressText } ... on CheckoutSummaryBillingAddressEmpty { title displayName buttonText } ... on CheckoutSummaryRewardsUnregistered @skip(if: $isRewardsUplift) { buttonTitle } ... on CheckoutSummaryRewards @skip(if: $isRewardsUplift) { rewardsSections { __typename ... on CheckoutSummaryRewardsRegistered { title subtitle imageUrl } ... on CheckoutSummaryRewardsRegisteredRedeemable { redeemText buttonTitle isRedeemed redeemInfo { title message buttonTitle secondaryButtonTitle } } } } ... on CheckoutOrderAddresses { title addressSections { __typename ... on CheckoutOrderGroceryAddress { title addressText imageUrl fulfilmentWindow } ... on CheckoutOrderMarketAddress { title addressText imageUrl sellerInfo { sellerName dispatchNote } } } insetBanner { displayType message } } ... on CheckoutOrderSummary { title sections { title titleType value valueType imageUrl message { title body type @include(if: $includeServiceFees) } } } ... on CheckoutTermsConditions { markdownText } ... on CheckoutPromotionCode @skip(if: $isPromoCodeUplift) { title placeholderText buttonTitle discounts { discountItems { title price } buttonTitle } } ... on CheckoutRewardsAndDiscounts @include(if: $includeRewardsAndDiscounts) { title rewardsAndDiscounts { __typename ... on CheckoutRewards @include(if: $isRewardsUplift) { title description redeemedIcon actionClickAnalytics { __typename ...analyticsFields } rewardsAction { __typename ... on CheckoutRewardsRedeem { rewardsRedeemInfo { minimum maximum maximumRedeemable increment current unRedeemableBanner { displayType message } } title description impressionAnalytics { __typename ...analyticsFields } } ... on CheckoutRewardsInfo { title description buttonTitle impressionAnalytics { __typename ...analyticsFields } buttonClickAnalytics { __typename ...analyticsFields } } ... on CheckoutRewardsLink { __typename } } } ... on CheckoutPromoCode @include(if: $isPromoCodeUplift) { title description appliedIcon actionClickAnalytics { __typename ...analyticsFields } detail { placeholderText buttonTitle promoCodes { __typename ... on CheckoutPromoCodeItem { title subtitle primaryLabel secondaryLabel isApplied code } } } } ... on CheckoutCredit @include(if: $includeCredit) { title description appliedIcon actionClickAnalytics { __typename ...analyticsFields } detail { __typename ... on CheckoutCreditEmpty { title message } ... on CheckoutCreditItems { title subtitle items { title subtitle primaryLabel secondaryLabel isApplied code amount } } ... on CheckoutCreditUnavailable { title message retryButtonTitle } } } } impressionAnalytics @skip(if: $rewardsAndDiscountsImpressionUplift) { __typename ...analyticsFields } } } orderTotalDetails { inlineMessage { displayType message } sections { title titleType value valueType imageUrl message @include(if: $includeServiceFees) { title body type } } total { title value balanceToPay buttonTitle progressId isEnabled } refundInfo { bottomSheetTitle bottomSheetBody primaryCta { label } } reviewProducts { unavailableOrderItems { name } restrictedOrderItems { name } exceededSupplyLimitProductGroups { products { name } } restrictedProductsByDeliveryMethod { name } restrictedProductsByDeliPlatter { name } availableOrderItems { name } } panelMarkdown @include(if: $includePanelMarkdown) } idVerificationBottomSheet @include(if: $includeIdVerificationBottomSheet) { title body imageUrls primaryButton { label style enabled } secondaryButton { label style enabled } } impressionAnalytics @include(if: $rewardsAndDiscountsImpressionUplift) { __typename ...analyticsFields } isUserWPayMigrated @include(if: $isWPayEnabled) restrictionPrompt { title message } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PayWithRewardsDollarMutation)) {
            return false;
        }
        PayWithRewardsDollarMutation payWithRewardsDollarMutation = (PayWithRewardsDollarMutation) obj;
        return Intrinsics.c(this.f21872a, payWithRewardsDollarMutation.f21872a) && Intrinsics.c(this.b, payWithRewardsDollarMutation.b) && this.c == payWithRewardsDollarMutation.c && this.d == payWithRewardsDollarMutation.d && this.e == payWithRewardsDollarMutation.e && this.f == payWithRewardsDollarMutation.f && this.g == payWithRewardsDollarMutation.g && this.h == payWithRewardsDollarMutation.h && this.i == payWithRewardsDollarMutation.i && this.j == payWithRewardsDollarMutation.j && Intrinsics.c(this.k, payWithRewardsDollarMutation.k) && Intrinsics.c(this.l, payWithRewardsDollarMutation.l) && Intrinsics.c(this.m, payWithRewardsDollarMutation.m);
    }

    public final int hashCode() {
        return this.m.hashCode() + a.c(this.l, a.c(this.k, b.e(b.e(b.e(b.e(b.e(b.e(b.e(b.e(a.c(this.b, this.f21872a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "6e6c74714e4bf8062974b14623c00304f9313a4353eb87d28db282e68608a7c3";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "PayWithRewardsDollar";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Optional optional = this.f21872a;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("amount");
            Adapters.d(Adapters.k).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
        Optional optional2 = this.b;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("includeIdVerificationBottomSheet");
            Adapters.d(Adapters.l).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        } else if (z) {
            jsonWriter.F1("includeIdVerificationBottomSheet");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        jsonWriter.F1("includeRewardsAndDiscounts");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        d.B(this.c, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isRewardsUplift");
        d.B(this.d, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isPromoCodeUplift");
        d.B(this.e, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeCredit");
        d.B(this.f, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "rewardsAndDiscountsImpressionUplift");
        d.B(this.g, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includePanelMarkdown");
        d.B(this.h, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeContactDetails");
        d.B(this.i, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isWPayEnabled");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.j));
        Optional optional3 = this.k;
        if (optional3 instanceof Optional.Present) {
            jsonWriter.F1("includeTimeSelectionContent");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional3);
        } else if (z) {
            jsonWriter.F1("includeTimeSelectionContent");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional4 = this.l;
        if (optional4 instanceof Optional.Present) {
            jsonWriter.F1("includeSuggestedTimeSlot");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional4);
        } else if (z) {
            jsonWriter.F1("includeSuggestedTimeSlot");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional5 = this.m;
        if (optional5 instanceof Optional.Present) {
            jsonWriter.F1("includeServiceFees");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional5);
        } else if (z) {
            jsonWriter.F1("includeServiceFees");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
    }

    public final String toString() {
        StringBuilder sbP = a.p("PayWithRewardsDollarMutation(amount=", this.f21872a, ", includeIdVerificationBottomSheet=", this.b, ", includeRewardsAndDiscounts=");
        au.com.woolworths.android.onesite.a.D(sbP, this.c, ", isRewardsUplift=", this.d, ", isPromoCodeUplift=");
        au.com.woolworths.android.onesite.a.D(sbP, this.e, ", includeCredit=", this.f, ", rewardsAndDiscountsImpressionUplift=");
        au.com.woolworths.android.onesite.a.D(sbP, this.g, ", includePanelMarkdown=", this.h, ", includeContactDetails=");
        au.com.woolworths.android.onesite.a.D(sbP, this.i, ", isWPayEnabled=", this.j, ", includeTimeSelectionContent=");
        a.x(sbP, this.k, ", includeSuggestedTimeSlot=", this.l, ", includeServiceFees=");
        return a.o(sbP, this.m, ")");
    }
}
