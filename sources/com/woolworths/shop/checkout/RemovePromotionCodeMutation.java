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
import com.woolworths.shop.checkout.adapter.RemovePromotionCodeMutation_ResponseAdapter;
import com.woolworths.shop.checkout.fragment.CheckoutContentSummary;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/checkout/RemovePromotionCodeMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/shop/checkout/RemovePromotionCodeMutation$Data;", "Data", "RemovePromotionCode", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RemovePromotionCodeMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f21889a;
    public final Optional b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final Optional j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/checkout/RemovePromotionCodeMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/RemovePromotionCodeMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final RemovePromotionCode f21890a;

        public Data(RemovePromotionCode removePromotionCode) {
            this.f21890a = removePromotionCode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21890a, ((Data) obj).f21890a);
        }

        public final int hashCode() {
            RemovePromotionCode removePromotionCode = this.f21890a;
            if (removePromotionCode == null) {
                return 0;
            }
            return removePromotionCode.hashCode();
        }

        public final String toString() {
            return "Data(removePromotionCode=" + this.f21890a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/RemovePromotionCodeMutation$RemovePromotionCode;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RemovePromotionCode {

        /* renamed from: a, reason: collision with root package name */
        public final String f21891a;
        public final CheckoutContentSummary b;

        public RemovePromotionCode(String str, CheckoutContentSummary checkoutContentSummary) {
            this.f21891a = str;
            this.b = checkoutContentSummary;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemovePromotionCode)) {
                return false;
            }
            RemovePromotionCode removePromotionCode = (RemovePromotionCode) obj;
            return Intrinsics.c(this.f21891a, removePromotionCode.f21891a) && Intrinsics.c(this.b, removePromotionCode.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21891a.hashCode() * 31);
        }

        public final String toString() {
            return "RemovePromotionCode(__typename=" + this.f21891a + ", checkoutContentSummary=" + this.b + ")";
        }
    }

    public RemovePromotionCodeMutation(Optional optional, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        Optional.Absent absent = Optional.Absent.f13523a;
        this.f21889a = absent;
        this.b = optional;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = z5;
        this.h = z6;
        this.i = z7;
        this.j = absent;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(RemovePromotionCodeMutation_ResponseAdapter.Data.f22020a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation RemovePromotionCode($includeMarketPickupSheet: Boolean = false , $includeIdVerificationBottomSheet: Boolean = false , $includeRewardsAndDiscounts: Boolean!, $isRewardsUplift: Boolean!, $isPromoCodeUplift: Boolean!, $includeCredit: Boolean!, $rewardsAndDiscountsImpressionUplift: Boolean!, $includePanelMarkdown: Boolean!, $isWPayEnabled: Boolean!, $includeServiceFees: Boolean! = false ) { removePromotionCode { __typename ...checkoutContentSummary } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment checkoutContentSummary on CheckoutContent { productsInfo { productId productName price quantity subtotal isAvailable sellerName brandName dispatchNote } message { __typename ... on SnackBar { message eventSource } } legacyErrors { errorCode message key } progress { index id title } content { __typename ... on InsetBanner { displayType message } ... on CheckoutSummaryBillingAddress { title addressText } ... on CheckoutSummaryBillingAddressEmpty { title displayName buttonText } ... on CheckoutSummaryRewardsUnregistered @skip(if: $isRewardsUplift) { buttonTitle } ... on CheckoutSummaryRewards @skip(if: $isRewardsUplift) { rewardsSections { __typename ... on CheckoutSummaryRewardsRegistered { title subtitle imageUrl } ... on CheckoutSummaryRewardsRegisteredRedeemable { redeemText buttonTitle isRedeemed redeemInfo { title message buttonTitle secondaryButtonTitle } } } } ... on CheckoutOrderAddresses { title addressSections { __typename ... on CheckoutOrderGroceryAddress { title addressText imageUrl fulfilmentWindow } ... on CheckoutOrderMarketAddress { title addressText imageUrl sellerInfo { sellerName dispatchNote } } } insetBanner { displayType message } } ... on CheckoutOrderSummary { title sections { title titleType value valueType imageUrl message { title body type @include(if: $includeServiceFees) } } } ... on CheckoutTermsConditions { markdownText } ... on CheckoutPromotionCode @skip(if: $isPromoCodeUplift) { title placeholderText buttonTitle discounts { discountItems { title price } buttonTitle } } ... on CheckoutRewardsAndDiscounts @include(if: $includeRewardsAndDiscounts) { title rewardsAndDiscounts { __typename ... on CheckoutRewards @include(if: $isRewardsUplift) { title description redeemedIcon actionClickAnalytics { __typename ...analyticsFields } rewardsAction { __typename ... on CheckoutRewardsRedeem { rewardsRedeemInfo { minimum maximum maximumRedeemable increment current unRedeemableBanner { displayType message } } title description impressionAnalytics { __typename ...analyticsFields } } ... on CheckoutRewardsInfo { title description buttonTitle impressionAnalytics { __typename ...analyticsFields } buttonClickAnalytics { __typename ...analyticsFields } } ... on CheckoutRewardsLink { __typename } } } ... on CheckoutPromoCode @include(if: $isPromoCodeUplift) { title description appliedIcon actionClickAnalytics { __typename ...analyticsFields } detail { placeholderText buttonTitle promoCodes { __typename ... on CheckoutPromoCodeItem { title subtitle primaryLabel secondaryLabel isApplied code } } } } ... on CheckoutCredit @include(if: $includeCredit) { title description appliedIcon actionClickAnalytics { __typename ...analyticsFields } detail { __typename ... on CheckoutCreditEmpty { title message } ... on CheckoutCreditItems { title subtitle items { title subtitle primaryLabel secondaryLabel isApplied code amount } } ... on CheckoutCreditUnavailable { title message retryButtonTitle } } } } impressionAnalytics @skip(if: $rewardsAndDiscountsImpressionUplift) { __typename ...analyticsFields } } } orderTotalDetails { inlineMessage { displayType message } sections { title titleType value valueType imageUrl message @include(if: $includeServiceFees) { title body type } } total { title value balanceToPay buttonTitle progressId isEnabled } refundInfo { bottomSheetTitle bottomSheetBody primaryCta { label } } reviewProducts { unavailableOrderItems { name } restrictedOrderItems { name } exceededSupplyLimitProductGroups { products { name } } restrictedProductsByDeliveryMethod { name } restrictedProductsByDeliPlatter { name } availableOrderItems { name } } panelMarkdown @include(if: $includePanelMarkdown) } idVerificationBottomSheet @include(if: $includeIdVerificationBottomSheet) { title body imageUrls primaryButton { label style enabled } secondaryButton { label style enabled } } impressionAnalytics @include(if: $rewardsAndDiscountsImpressionUplift) { __typename ...analyticsFields } isUserWPayMigrated @include(if: $isWPayEnabled) restrictionPrompt { title message } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemovePromotionCodeMutation)) {
            return false;
        }
        RemovePromotionCodeMutation removePromotionCodeMutation = (RemovePromotionCodeMutation) obj;
        return Intrinsics.c(this.f21889a, removePromotionCodeMutation.f21889a) && Intrinsics.c(this.b, removePromotionCodeMutation.b) && this.c == removePromotionCodeMutation.c && this.d == removePromotionCodeMutation.d && this.e == removePromotionCodeMutation.e && this.f == removePromotionCodeMutation.f && this.g == removePromotionCodeMutation.g && this.h == removePromotionCodeMutation.h && this.i == removePromotionCodeMutation.i && Intrinsics.c(this.j, removePromotionCodeMutation.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + b.e(b.e(b.e(b.e(b.e(b.e(b.e(a.c(this.b, this.f21889a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "6a66de0415e7d7e6d363316c2222008d1d5057587aa04c25f67b0c6746649f65";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "RemovePromotionCode";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Optional optional = this.f21889a;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("includeMarketPickupSheet");
            Adapters.d(Adapters.l).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        } else if (z) {
            jsonWriter.F1("includeMarketPickupSheet");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
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
        d.B(this.h, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isWPayEnabled");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.i));
        Optional optional3 = this.j;
        if (optional3 instanceof Optional.Present) {
            jsonWriter.F1("includeServiceFees");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional3);
        } else if (z) {
            jsonWriter.F1("includeServiceFees");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
    }

    public final String toString() {
        StringBuilder sbP = a.p("RemovePromotionCodeMutation(includeMarketPickupSheet=", this.f21889a, ", includeIdVerificationBottomSheet=", this.b, ", includeRewardsAndDiscounts=");
        au.com.woolworths.android.onesite.a.D(sbP, this.c, ", isRewardsUplift=", this.d, ", isPromoCodeUplift=");
        au.com.woolworths.android.onesite.a.D(sbP, this.e, ", includeCredit=", this.f, ", rewardsAndDiscountsImpressionUplift=");
        au.com.woolworths.android.onesite.a.D(sbP, this.g, ", includePanelMarkdown=", this.h, ", isWPayEnabled=");
        sbP.append(this.i);
        sbP.append(", includeServiceFees=");
        sbP.append(this.j);
        sbP.append(")");
        return sbP.toString();
    }
}
