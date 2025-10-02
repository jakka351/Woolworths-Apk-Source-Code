package com.woolworths.shop.checkout;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.android.onesite.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.checkout.adapter.RemoveCheckoutCreditMutation_ResponseAdapter;
import com.woolworths.shop.checkout.fragment.CheckoutContentSummary;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/woolworths/shop/checkout/RemoveCheckoutCreditMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/shop/checkout/RemoveCheckoutCreditMutation$Data;", "Data", "RemoveCheckoutCredit", "CheckoutSummary", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RemoveCheckoutCreditMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final List f21875a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final Optional j;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/RemoveCheckoutCreditMutation$CheckoutSummary;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CheckoutSummary {

        /* renamed from: a, reason: collision with root package name */
        public final String f21876a;
        public final CheckoutContentSummary b;

        public CheckoutSummary(String str, CheckoutContentSummary checkoutContentSummary) {
            this.f21876a = str;
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
            return Intrinsics.c(this.f21876a, checkoutSummary.f21876a) && Intrinsics.c(this.b, checkoutSummary.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21876a.hashCode() * 31);
        }

        public final String toString() {
            return "CheckoutSummary(__typename=" + this.f21876a + ", checkoutContentSummary=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/checkout/RemoveCheckoutCreditMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/RemoveCheckoutCreditMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final RemoveCheckoutCredit f21877a;

        public Data(RemoveCheckoutCredit removeCheckoutCredit) {
            this.f21877a = removeCheckoutCredit;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21877a, ((Data) obj).f21877a);
        }

        public final int hashCode() {
            return this.f21877a.hashCode();
        }

        public final String toString() {
            return "Data(removeCheckoutCredit=" + this.f21877a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/RemoveCheckoutCreditMutation$RemoveCheckoutCredit;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RemoveCheckoutCredit {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f21878a;
        public final String b;
        public final CheckoutSummary c;

        public RemoveCheckoutCredit(boolean z, String str, CheckoutSummary checkoutSummary) {
            this.f21878a = z;
            this.b = str;
            this.c = checkoutSummary;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RemoveCheckoutCredit)) {
                return false;
            }
            RemoveCheckoutCredit removeCheckoutCredit = (RemoveCheckoutCredit) obj;
            return this.f21878a == removeCheckoutCredit.f21878a && Intrinsics.c(this.b, removeCheckoutCredit.b) && Intrinsics.c(this.c, removeCheckoutCredit.c);
        }

        public final int hashCode() {
            int iC = b.c(Boolean.hashCode(this.f21878a) * 31, 31, this.b);
            CheckoutSummary checkoutSummary = this.c;
            return iC + (checkoutSummary == null ? 0 : checkoutSummary.hashCode());
        }

        public final String toString() {
            StringBuilder sbT = a.t("RemoveCheckoutCredit(success=", ", message=", this.b, ", checkoutSummary=", this.f21878a);
            sbT.append(this.c);
            sbT.append(")");
            return sbT.toString();
        }
    }

    public RemoveCheckoutCreditMutation(List creditCodes, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        Intrinsics.h(creditCodes, "creditCodes");
        this.f21875a = creditCodes;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = Optional.Absent.f13523a;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(RemoveCheckoutCreditMutation_ResponseAdapter.Data.f22011a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation RemoveCheckoutCredit($creditCodes: [String!]!, $isRewardsUplift: Boolean!, $isPromoCodeUplift: Boolean!, $includeCredit: Boolean!, $includeRewardsAndDiscounts: Boolean!, $includeIdVerificationBottomSheet: Boolean!, $rewardsAndDiscountsImpressionUplift: Boolean!, $includePanelMarkdown: Boolean!, $isWPayEnabled: Boolean!, $includeServiceFees: Boolean! = false ) { removeCheckoutCredit(creditCodes: $creditCodes) { success message checkoutSummary { __typename ...checkoutContentSummary } } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment checkoutContentSummary on CheckoutContent { productsInfo { productId productName price quantity subtotal isAvailable sellerName brandName dispatchNote } message { __typename ... on SnackBar { message eventSource } } legacyErrors { errorCode message key } progress { index id title } content { __typename ... on InsetBanner { displayType message } ... on CheckoutSummaryBillingAddress { title addressText } ... on CheckoutSummaryBillingAddressEmpty { title displayName buttonText } ... on CheckoutSummaryRewardsUnregistered @skip(if: $isRewardsUplift) { buttonTitle } ... on CheckoutSummaryRewards @skip(if: $isRewardsUplift) { rewardsSections { __typename ... on CheckoutSummaryRewardsRegistered { title subtitle imageUrl } ... on CheckoutSummaryRewardsRegisteredRedeemable { redeemText buttonTitle isRedeemed redeemInfo { title message buttonTitle secondaryButtonTitle } } } } ... on CheckoutOrderAddresses { title addressSections { __typename ... on CheckoutOrderGroceryAddress { title addressText imageUrl fulfilmentWindow } ... on CheckoutOrderMarketAddress { title addressText imageUrl sellerInfo { sellerName dispatchNote } } } insetBanner { displayType message } } ... on CheckoutOrderSummary { title sections { title titleType value valueType imageUrl message { title body type @include(if: $includeServiceFees) } } } ... on CheckoutTermsConditions { markdownText } ... on CheckoutPromotionCode @skip(if: $isPromoCodeUplift) { title placeholderText buttonTitle discounts { discountItems { title price } buttonTitle } } ... on CheckoutRewardsAndDiscounts @include(if: $includeRewardsAndDiscounts) { title rewardsAndDiscounts { __typename ... on CheckoutRewards @include(if: $isRewardsUplift) { title description redeemedIcon actionClickAnalytics { __typename ...analyticsFields } rewardsAction { __typename ... on CheckoutRewardsRedeem { rewardsRedeemInfo { minimum maximum maximumRedeemable increment current unRedeemableBanner { displayType message } } title description impressionAnalytics { __typename ...analyticsFields } } ... on CheckoutRewardsInfo { title description buttonTitle impressionAnalytics { __typename ...analyticsFields } buttonClickAnalytics { __typename ...analyticsFields } } ... on CheckoutRewardsLink { __typename } } } ... on CheckoutPromoCode @include(if: $isPromoCodeUplift) { title description appliedIcon actionClickAnalytics { __typename ...analyticsFields } detail { placeholderText buttonTitle promoCodes { __typename ... on CheckoutPromoCodeItem { title subtitle primaryLabel secondaryLabel isApplied code } } } } ... on CheckoutCredit @include(if: $includeCredit) { title description appliedIcon actionClickAnalytics { __typename ...analyticsFields } detail { __typename ... on CheckoutCreditEmpty { title message } ... on CheckoutCreditItems { title subtitle items { title subtitle primaryLabel secondaryLabel isApplied code amount } } ... on CheckoutCreditUnavailable { title message retryButtonTitle } } } } impressionAnalytics @skip(if: $rewardsAndDiscountsImpressionUplift) { __typename ...analyticsFields } } } orderTotalDetails { inlineMessage { displayType message } sections { title titleType value valueType imageUrl message @include(if: $includeServiceFees) { title body type } } total { title value balanceToPay buttonTitle progressId isEnabled } refundInfo { bottomSheetTitle bottomSheetBody primaryCta { label } } reviewProducts { unavailableOrderItems { name } restrictedOrderItems { name } exceededSupplyLimitProductGroups { products { name } } restrictedProductsByDeliveryMethod { name } restrictedProductsByDeliPlatter { name } availableOrderItems { name } } panelMarkdown @include(if: $includePanelMarkdown) } idVerificationBottomSheet @include(if: $includeIdVerificationBottomSheet) { title body imageUrls primaryButton { label style enabled } secondaryButton { label style enabled } } impressionAnalytics @include(if: $rewardsAndDiscountsImpressionUplift) { __typename ...analyticsFields } isUserWPayMigrated @include(if: $isWPayEnabled) restrictionPrompt { title message } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoveCheckoutCreditMutation)) {
            return false;
        }
        RemoveCheckoutCreditMutation removeCheckoutCreditMutation = (RemoveCheckoutCreditMutation) obj;
        return Intrinsics.c(this.f21875a, removeCheckoutCreditMutation.f21875a) && this.b == removeCheckoutCreditMutation.b && this.c == removeCheckoutCreditMutation.c && this.d == removeCheckoutCreditMutation.d && this.e == removeCheckoutCreditMutation.e && this.f == removeCheckoutCreditMutation.f && this.g == removeCheckoutCreditMutation.g && this.h == removeCheckoutCreditMutation.h && this.i == removeCheckoutCreditMutation.i && Intrinsics.c(this.j, removeCheckoutCreditMutation.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + b.e(b.e(b.e(b.e(b.e(b.e(b.e(b.e(this.f21875a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "c17f65ea098dc76fd45266abdaf2a8fe0b5cea5610bfbe02d27652e3885513a3";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "RemoveCheckoutCredit";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("creditCodes");
        Adapters.a(Adapters.f13493a).toJson(jsonWriter, customScalarAdapters, this.f21875a);
        jsonWriter.F1("isRewardsUplift");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        d.B(this.b, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isPromoCodeUplift");
        d.B(this.c, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeCredit");
        d.B(this.d, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeRewardsAndDiscounts");
        d.B(this.e, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeIdVerificationBottomSheet");
        d.B(this.f, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "rewardsAndDiscountsImpressionUplift");
        d.B(this.g, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includePanelMarkdown");
        d.B(this.h, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isWPayEnabled");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.i));
        Optional optional = this.j;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("includeServiceFees");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        } else if (z) {
            jsonWriter.F1("includeServiceFees");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RemoveCheckoutCreditMutation(creditCodes=");
        sb.append(this.f21875a);
        sb.append(", isRewardsUplift=");
        sb.append(this.b);
        sb.append(", isPromoCodeUplift=");
        a.D(sb, this.c, ", includeCredit=", this.d, ", includeRewardsAndDiscounts=");
        a.D(sb, this.e, ", includeIdVerificationBottomSheet=", this.f, ", rewardsAndDiscountsImpressionUplift=");
        a.D(sb, this.g, ", includePanelMarkdown=", this.h, ", isWPayEnabled=");
        sb.append(this.i);
        sb.append(", includeServiceFees=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
