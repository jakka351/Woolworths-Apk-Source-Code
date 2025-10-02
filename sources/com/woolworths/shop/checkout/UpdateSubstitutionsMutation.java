package com.woolworths.shop.checkout;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.adapter.CheckoutSubstitutionInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.checkout.adapter.UpdateSubstitutionsMutation_ResponseAdapter;
import com.woolworths.shop.checkout.fragment.CheckoutContent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/checkout/UpdateSubstitutionsMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/shop/checkout/UpdateSubstitutionsMutation$Data;", "Data", "UpdateSubstitutions", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UpdateSubstitutionsMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final List f21940a;
    public final Optional b;
    public final Optional c;
    public final Optional d;
    public final boolean e;
    public final boolean f;
    public final Optional g;
    public final Optional h;
    public final Optional i;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/checkout/UpdateSubstitutionsMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/UpdateSubstitutionsMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final UpdateSubstitutions f21941a;

        public Data(UpdateSubstitutions updateSubstitutions) {
            this.f21941a = updateSubstitutions;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21941a, ((Data) obj).f21941a);
        }

        public final int hashCode() {
            UpdateSubstitutions updateSubstitutions = this.f21941a;
            if (updateSubstitutions == null) {
                return 0;
            }
            return updateSubstitutions.hashCode();
        }

        public final String toString() {
            return "Data(updateSubstitutions=" + this.f21941a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/UpdateSubstitutionsMutation$UpdateSubstitutions;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdateSubstitutions {

        /* renamed from: a, reason: collision with root package name */
        public final String f21942a;
        public final CheckoutContent b;

        public UpdateSubstitutions(String str, CheckoutContent checkoutContent) {
            this.f21942a = str;
            this.b = checkoutContent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdateSubstitutions)) {
                return false;
            }
            UpdateSubstitutions updateSubstitutions = (UpdateSubstitutions) obj;
            return Intrinsics.c(this.f21942a, updateSubstitutions.f21942a) && Intrinsics.c(this.b, updateSubstitutions.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21942a.hashCode() * 31);
        }

        public final String toString() {
            return "UpdateSubstitutions(__typename=" + this.f21942a + ", checkoutContent=" + this.b + ")";
        }
    }

    public UpdateSubstitutionsMutation(List substitutions, Optional optional, boolean z, boolean z2) {
        Intrinsics.h(substitutions, "substitutions");
        this.f21940a = substitutions;
        Optional.Absent absent = Optional.Absent.f13523a;
        this.b = absent;
        this.c = optional;
        this.d = absent;
        this.e = z;
        this.f = z2;
        this.g = absent;
        this.h = absent;
        this.i = absent;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(UpdateSubstitutionsMutation_ResponseAdapter.Data.f22058a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation updateSubstitutions($substitutions: [CheckoutSubstitutionInput!]!, $includeMarketPickupSheet: Boolean = false , $includeIdVerificationBottomSheet: Boolean = false , $includeExtraInfoContent: Boolean! = false , $includePanelMarkdown: Boolean!, $includeContactDetails: Boolean!, $includeTimeSelectionContent: Boolean! = false , $includeSuggestedTimeSlot: Boolean! = false , $includeServiceFees: Boolean! = false ) { updateSubstitutions(products: $substitutions) { __typename ...checkoutContent } }  fragment checkoutCollectionAddressDelivery on CheckoutCollectionAddressDelivery { title modeId addressId displayName addressImageUrl buttonText expressDeliveryStoreId }  fragment selectionInfo on FulfilmentWindowSlotSelectionInfo { descriptionMd iconType }  fragment compatibleColor on CompatibleColor { lightHexCode }  fragment iconFragment on IconAsset { __typename ... on HostedIcon { __typename url } ... on CoreIcon { __typename coreIconName } }  fragment coreTagUI on CoreTagUI { __typename label coreColorTheme { __typename background { __typename ...compatibleColor } foreground { __typename primary { __typename ...compatibleColor } secondary { __typename ...compatibleColor } highlight { __typename ...compatibleColor } } } hasBorder icon { __typename ...iconFragment } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment fulfilmentExtraInfo on FulfilmentExtraInfo { title content { __typename ... on BasicInsetAlert { insetAlertUI { title description style } insetAlertAction { id type action analytics { __typename ...analyticsFields } } insetAlertActionLabel } ... on BasicCoreBroadcastBanner { impressionAnalytics { __typename ...analyticsFields } broadcastBannerDismissAnalytics { __typename ...analyticsFields } broadcastBannerUI { title subtitle style icon { __typename ... on CoreIcon { coreIconName } ... on HostedIcon { url } } } broadcastBannerAction { action id type } broadcastBannerActionLabel broadcastBannerId broadcastBannerDismissible } ... on FulfilmentFeesInfoSection { feesInfoSectionTitle items { __typename ... on FulfilmentFeeItem { title subtitle prices { __typename ... on FulfilmentFeePriceInfo { amount description } } } } } ... on CheckoutTermsConditions { markdownText } ... on FulfilmentInfoRowAccordion { openActionAnalytics { __typename ...analyticsFields } closeActionAnalytics { __typename ...analyticsFields } rowUI { leadingAsset { __typename ... on HostedIcon { url } ... on CoreIcon { coreIconName } } description label } isExpanded hasTopSeparator expandedContent { __typename ... on ParagraphTextItem { type content } } } } }  fragment checkoutFulfilmentWindows on CheckoutFulfilmentWindows { title header subheader { displayType message bannerTitle: title iconUrl action { placement type label url } } subtitle footer { buttonTitle } sectionHeader @include(if: $includeTimeSelectionContent) suggestedGroup @include(if: $includeSuggestedTimeSlot) { title slots { title subtitle startTime id isAvailable isSelected isPartnerDriver sectionTitle badges { title style } selectionInfo { __typename ...selectionInfo } tags { __typename ...coreTagUI } statuses { __typename ...coreTagUI } } bottomSheet { bottomSheetTitle bottomSheetBody } } options { title subtitle isAvailable isSelected footer footerV2 @include(if: $includeTimeSelectionContent) { title subtitle isSpecial } sectionTitle extraInfoButton @include(if: $includeExtraInfoContent) { messageTitle buttonTitle } extraInfo @include(if: $includeExtraInfoContent) { __typename ...fulfilmentExtraInfo } deliveryNowV2 { id startTime tags @include(if: $includeTimeSelectionContent) { __typename ...coreTagUI } statuses @include(if: $includeTimeSelectionContent) { __typename ...coreTagUI } title subtitle secondarySubtitle sectionTitle imageUrl messageTitle buttonTitle info { title items { title description imageUrl } } isSelected isEnabled deliveryNowV2Badge: badge { label altLabel { text altText } type } selectionInfo { __typename ...selectionInfo } } deliveryNowStatus directToBootNow { id startTime title subtitle secondarySubtitle sectionTitle imageUrl isSelected } directToBootNowV2 { id startTime tags @include(if: $includeTimeSelectionContent) { __typename ...coreTagUI } statuses @include(if: $includeTimeSelectionContent) { __typename ...coreTagUI } title subtitle secondarySubtitle sectionTitle imageUrl isSelected isEnabled directToBootNowV2Badge: badge { label altLabel { text altText } type } tileBadge { label type } selectionInfo { __typename ...selectionInfo } selectionOptionsState @include(if: $includeExtraInfoContent) { enabledOptions excludedOptions selectedOption isLastWindow } } directToBootNowStatus groups { title isSelected imageUrl message { title subtitle } subtitle slots { title subtitle startTime id isAvailable isSelected isPartnerDriver sectionTitle badges { title style } selectionInfo { __typename ...selectionInfo } selectionOptionsState @include(if: $includeExtraInfoContent) { enabledOptions excludedOptions selectedOption isLastWindow } tags @include(if: $includeTimeSelectionContent) { __typename ...coreTagUI } statuses @include(if: $includeTimeSelectionContent) { __typename ...coreTagUI } } slotsV2 @include(if: $includeSuggestedTimeSlot) { title subtitle startTime id isAvailable isSelected isPartnerDriver sectionTitle badges { title style } selectionInfo { __typename ...selectionInfo } tags { __typename ...coreTagUI } statuses { __typename ...coreTagUI } } } } feesInfo @include(if: $includeExtraInfoContent) { __typename ...fulfilmentExtraInfo } selectionOptionsInfo @include(if: $includeExtraInfoContent) { title selectionOptions { selectionOptionId description icon { coreIconName } title selectionOptionsInfoTags: tags { label altLabel { text altText } type } disabledBadge { label altLabel { text altText } type } disabledTitle disabledDescription } } }  fragment checkoutContent on CheckoutContent { productsInfo { productId productName price quantity subtotal isAvailable sellerName brandName dispatchNote } message { __typename ... on SnackBar { message eventSource } } legacyErrors { errorCode message key } progress { index id title } content { __typename ... on InsetBanner { displayType message action { placement type label url } } ... on CheckoutCollectionAddressEmpty { title displayName buttonText } ... on CheckoutMarketFulfilmentAddress { title displayName addressButtonTitle addressStatus addressType addressData { __typename ... on CheckoutCollectionAddressDelivery { modeId } } shoppingModeDetails { displayName mode storeAddressId } } ... on CheckoutCollectionAddressDelivery { __typename ...checkoutCollectionAddressDelivery } ... on CheckoutCollectionMethod { title options { title modeId isSelected addressId } address { __typename ...checkoutCollectionAddressDelivery ... on CheckoutCollectionAddressPickup { title modeId storeId text addressId displayName addressImageUrl buttonText label } } insetBanner { displayType message } marketPickupSheet @include(if: $includeMarketPickupSheet) { bottomSheetTitle bottomSheetBody showOnceOnly primaryCta { label } secondaryCta { label } } shoppingModeDetails { displayName mode storeAddressId } } ... on CheckoutFulfilmentWindows { __typename ...checkoutFulfilmentWindows } ... on CheckoutFulfilmentWindowsEmptyState { title message } ... on CheckoutFulfilmentWindowsSelectedState { title subtitle timeWindow price buttonTitle inlineMessage { displayType message } windows { __typename ...checkoutFulfilmentWindows } } ... on CheckoutPackagingMethod { title options { id isSelected title price description imageUrl } } ... on CheckoutDeliveryPreferenceToggle { preferenceId isEnabled title subtitle label value inlineMessage { displayType message } } ... on CheckoutContactDetails @include(if: $includeContactDetails) { title phoneNumberLabel phoneNumber placeholder buttonTitle inlineMessage { displayType message } } ... on CheckoutDeliveryPreferenceText { preferenceId isEnabled title inputLimit { maxLength warningOffset } descriptionText placeholderText text buttonTitle inlineMessage { displayType message } } ... on CheckoutProducts { title descriptionText substitution { title selectedOptionTitle options { title id } info { title message buttonTitle } } substitutionPreferences { title body state info { title message buttonTitle } } products { title quantity productId unitPrice totalPrice totalTitle imageUrl instruction { text title label placeholderText buttonTitle inputLimit { maxLength warningOffset } } rewards { points imageUrl } removeInfo { title message buttonTitle } allowSubstitution messages showSubstitution cartProductInfo { totalPrice totalOriginalPrice totalDiscount } substitutionPreference { state header title action { label enabled } } } useSubstitutionPreference substitutionPreferenceOnboardingBanner { title subtitle deeplink type imageUrl actionLabel analyticsLabel dismissible bannerId } } ... on CheckoutMarketProducts { title descriptionText sellerGroups { sellerName dispatchNote products { title quantity productId unitPrice totalPrice totalTitle imageUrl brandName removeInfo { title message buttonTitle } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } } } } ... on CheckoutProductCampaigns { campaigns { label title subtitle id imageUrl isOptedIn campaignInfo { message buttonTitle } } } ... on CheckoutSectionHeader { title imageUrl } } orderTotalDetails { inlineMessage { displayType message analytics { eventLabel eventDescription eventValue } } sections { title titleType value valueType imageUrl message @include(if: $includeServiceFees) { title body type } } total { title value balanceToPay buttonTitle progressId isEnabled } reviewProducts { unavailableOrderItems { name } restrictedOrderItems { name } exceededSupplyLimitProductGroups { products { name } } restrictedProductsByDeliveryMethod { name } restrictedProductsByDeliPlatter { name } availableOrderItems { name } } panelMarkdown @include(if: $includePanelMarkdown) } idVerificationBottomSheet @include(if: $includeIdVerificationBottomSheet) { title body imageUrls primaryButton { label style enabled } secondaryButton { label style enabled } } restrictionPrompt { title message } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateSubstitutionsMutation)) {
            return false;
        }
        UpdateSubstitutionsMutation updateSubstitutionsMutation = (UpdateSubstitutionsMutation) obj;
        return Intrinsics.c(this.f21940a, updateSubstitutionsMutation.f21940a) && Intrinsics.c(this.b, updateSubstitutionsMutation.b) && Intrinsics.c(this.c, updateSubstitutionsMutation.c) && Intrinsics.c(this.d, updateSubstitutionsMutation.d) && this.e == updateSubstitutionsMutation.e && this.f == updateSubstitutionsMutation.f && Intrinsics.c(this.g, updateSubstitutionsMutation.g) && Intrinsics.c(this.h, updateSubstitutionsMutation.h) && Intrinsics.c(this.i, updateSubstitutionsMutation.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + a.c(this.h, a.c(this.g, b.e(b.e(a.c(this.d, a.c(this.c, a.c(this.b, this.f21940a.hashCode() * 31, 31), 31), 31), 31, this.e), 31, this.f), 31), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "f5b7fdc38bad26300087c910a305974c1df4df3d9ff3dfb970ef56d2607cd598";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "updateSubstitutions";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("substitutions");
        Adapters.a(Adapters.c(CheckoutSubstitutionInput_InputAdapter.f12053a, false)).toJson(jsonWriter, customScalarAdapters, this.f21940a);
        Optional optional = this.b;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("includeMarketPickupSheet");
            Adapters.d(Adapters.l).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        } else if (z) {
            jsonWriter.F1("includeMarketPickupSheet");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional2 = this.c;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("includeIdVerificationBottomSheet");
            Adapters.d(Adapters.l).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        } else if (z) {
            jsonWriter.F1("includeIdVerificationBottomSheet");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional3 = this.d;
        if (optional3 instanceof Optional.Present) {
            jsonWriter.F1("includeExtraInfoContent");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional3);
        } else if (z) {
            jsonWriter.F1("includeExtraInfoContent");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        jsonWriter.F1("includePanelMarkdown");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        d.B(this.e, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeContactDetails");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.f));
        Optional optional4 = this.g;
        if (optional4 instanceof Optional.Present) {
            jsonWriter.F1("includeTimeSelectionContent");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional4);
        } else if (z) {
            jsonWriter.F1("includeTimeSelectionContent");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional5 = this.h;
        if (optional5 instanceof Optional.Present) {
            jsonWriter.F1("includeSuggestedTimeSlot");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional5);
        } else if (z) {
            jsonWriter.F1("includeSuggestedTimeSlot");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional6 = this.i;
        if (optional6 instanceof Optional.Present) {
            jsonWriter.F1("includeServiceFees");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional6);
        } else if (z) {
            jsonWriter.F1("includeServiceFees");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateSubstitutionsMutation(substitutions=");
        sb.append(this.f21940a);
        sb.append(", includeMarketPickupSheet=");
        sb.append(this.b);
        sb.append(", includeIdVerificationBottomSheet=");
        a.x(sb, this.c, ", includeExtraInfoContent=", this.d, ", includePanelMarkdown=");
        au.com.woolworths.android.onesite.a.D(sb, this.e, ", includeContactDetails=", this.f, ", includeTimeSelectionContent=");
        a.x(sb, this.g, ", includeSuggestedTimeSlot=", this.h, ", includeServiceFees=");
        return a.o(sb, this.i, ")");
    }
}
