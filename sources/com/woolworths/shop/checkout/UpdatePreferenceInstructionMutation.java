package com.woolworths.shop.checkout;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.shop.graphql.type.adapter.CheckoutDeliveryPreferenceId_ResponseAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.checkout.adapter.UpdatePreferenceInstructionMutation_ResponseAdapter;
import com.woolworths.shop.checkout.fragment.CheckoutContent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/checkout/UpdatePreferenceInstructionMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/shop/checkout/UpdatePreferenceInstructionMutation$Data;", "Data", "UpdatePreferenceInstruction", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class UpdatePreferenceInstructionMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f21924a;
    public final String b;
    public final Optional c;
    public final Optional d;
    public final Optional e;
    public final boolean f;
    public final boolean g;
    public final Optional h;
    public final Optional i;
    public final Optional j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/checkout/UpdatePreferenceInstructionMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/UpdatePreferenceInstructionMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final UpdatePreferenceInstruction f21925a;

        public Data(UpdatePreferenceInstruction updatePreferenceInstruction) {
            this.f21925a = updatePreferenceInstruction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21925a, ((Data) obj).f21925a);
        }

        public final int hashCode() {
            UpdatePreferenceInstruction updatePreferenceInstruction = this.f21925a;
            if (updatePreferenceInstruction == null) {
                return 0;
            }
            return updatePreferenceInstruction.hashCode();
        }

        public final String toString() {
            return "Data(updatePreferenceInstruction=" + this.f21925a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/UpdatePreferenceInstructionMutation$UpdatePreferenceInstruction;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class UpdatePreferenceInstruction {

        /* renamed from: a, reason: collision with root package name */
        public final String f21926a;
        public final CheckoutContent b;

        public UpdatePreferenceInstruction(String str, CheckoutContent checkoutContent) {
            this.f21926a = str;
            this.b = checkoutContent;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UpdatePreferenceInstruction)) {
                return false;
            }
            UpdatePreferenceInstruction updatePreferenceInstruction = (UpdatePreferenceInstruction) obj;
            return Intrinsics.c(this.f21926a, updatePreferenceInstruction.f21926a) && Intrinsics.c(this.b, updatePreferenceInstruction.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21926a.hashCode() * 31);
        }

        public final String toString() {
            return "UpdatePreferenceInstruction(__typename=" + this.f21926a + ", checkoutContent=" + this.b + ")";
        }
    }

    public UpdatePreferenceInstructionMutation(Optional.Present present, String value, Optional optional, boolean z, boolean z2) {
        Intrinsics.h(value, "value");
        this.f21924a = present;
        this.b = value;
        Optional.Absent absent = Optional.Absent.f13523a;
        this.c = absent;
        this.d = optional;
        this.e = absent;
        this.f = z;
        this.g = z2;
        this.h = absent;
        this.i = absent;
        this.j = absent;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(UpdatePreferenceInstructionMutation_ResponseAdapter.Data.f22047a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation updatePreferenceInstruction($preferenceId: CheckoutDeliveryPreferenceId, $value: String!, $includeMarketPickupSheet: Boolean = false , $includeIdVerificationBottomSheet: Boolean = false , $includeExtraInfoContent: Boolean! = false , $includePanelMarkdown: Boolean!, $includeContactDetails: Boolean!, $includeTimeSelectionContent: Boolean! = false , $includeSuggestedTimeSlot: Boolean! = false , $includeServiceFees: Boolean! = false ) { updatePreferenceInstruction(preferenceId: $preferenceId, value: $value) { __typename ...checkoutContent } }  fragment checkoutCollectionAddressDelivery on CheckoutCollectionAddressDelivery { title modeId addressId displayName addressImageUrl buttonText expressDeliveryStoreId }  fragment selectionInfo on FulfilmentWindowSlotSelectionInfo { descriptionMd iconType }  fragment compatibleColor on CompatibleColor { lightHexCode }  fragment iconFragment on IconAsset { __typename ... on HostedIcon { __typename url } ... on CoreIcon { __typename coreIconName } }  fragment coreTagUI on CoreTagUI { __typename label coreColorTheme { __typename background { __typename ...compatibleColor } foreground { __typename primary { __typename ...compatibleColor } secondary { __typename ...compatibleColor } highlight { __typename ...compatibleColor } } } hasBorder icon { __typename ...iconFragment } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment fulfilmentExtraInfo on FulfilmentExtraInfo { title content { __typename ... on BasicInsetAlert { insetAlertUI { title description style } insetAlertAction { id type action analytics { __typename ...analyticsFields } } insetAlertActionLabel } ... on BasicCoreBroadcastBanner { impressionAnalytics { __typename ...analyticsFields } broadcastBannerDismissAnalytics { __typename ...analyticsFields } broadcastBannerUI { title subtitle style icon { __typename ... on CoreIcon { coreIconName } ... on HostedIcon { url } } } broadcastBannerAction { action id type } broadcastBannerActionLabel broadcastBannerId broadcastBannerDismissible } ... on FulfilmentFeesInfoSection { feesInfoSectionTitle items { __typename ... on FulfilmentFeeItem { title subtitle prices { __typename ... on FulfilmentFeePriceInfo { amount description } } } } } ... on CheckoutTermsConditions { markdownText } ... on FulfilmentInfoRowAccordion { openActionAnalytics { __typename ...analyticsFields } closeActionAnalytics { __typename ...analyticsFields } rowUI { leadingAsset { __typename ... on HostedIcon { url } ... on CoreIcon { coreIconName } } description label } isExpanded hasTopSeparator expandedContent { __typename ... on ParagraphTextItem { type content } } } } }  fragment checkoutFulfilmentWindows on CheckoutFulfilmentWindows { title header subheader { displayType message bannerTitle: title iconUrl action { placement type label url } } subtitle footer { buttonTitle } sectionHeader @include(if: $includeTimeSelectionContent) suggestedGroup @include(if: $includeSuggestedTimeSlot) { title slots { title subtitle startTime id isAvailable isSelected isPartnerDriver sectionTitle badges { title style } selectionInfo { __typename ...selectionInfo } tags { __typename ...coreTagUI } statuses { __typename ...coreTagUI } } bottomSheet { bottomSheetTitle bottomSheetBody } } options { title subtitle isAvailable isSelected footer footerV2 @include(if: $includeTimeSelectionContent) { title subtitle isSpecial } sectionTitle extraInfoButton @include(if: $includeExtraInfoContent) { messageTitle buttonTitle } extraInfo @include(if: $includeExtraInfoContent) { __typename ...fulfilmentExtraInfo } deliveryNowV2 { id startTime tags @include(if: $includeTimeSelectionContent) { __typename ...coreTagUI } statuses @include(if: $includeTimeSelectionContent) { __typename ...coreTagUI } title subtitle secondarySubtitle sectionTitle imageUrl messageTitle buttonTitle info { title items { title description imageUrl } } isSelected isEnabled deliveryNowV2Badge: badge { label altLabel { text altText } type } selectionInfo { __typename ...selectionInfo } } deliveryNowStatus directToBootNow { id startTime title subtitle secondarySubtitle sectionTitle imageUrl isSelected } directToBootNowV2 { id startTime tags @include(if: $includeTimeSelectionContent) { __typename ...coreTagUI } statuses @include(if: $includeTimeSelectionContent) { __typename ...coreTagUI } title subtitle secondarySubtitle sectionTitle imageUrl isSelected isEnabled directToBootNowV2Badge: badge { label altLabel { text altText } type } tileBadge { label type } selectionInfo { __typename ...selectionInfo } selectionOptionsState @include(if: $includeExtraInfoContent) { enabledOptions excludedOptions selectedOption isLastWindow } } directToBootNowStatus groups { title isSelected imageUrl message { title subtitle } subtitle slots { title subtitle startTime id isAvailable isSelected isPartnerDriver sectionTitle badges { title style } selectionInfo { __typename ...selectionInfo } selectionOptionsState @include(if: $includeExtraInfoContent) { enabledOptions excludedOptions selectedOption isLastWindow } tags @include(if: $includeTimeSelectionContent) { __typename ...coreTagUI } statuses @include(if: $includeTimeSelectionContent) { __typename ...coreTagUI } } slotsV2 @include(if: $includeSuggestedTimeSlot) { title subtitle startTime id isAvailable isSelected isPartnerDriver sectionTitle badges { title style } selectionInfo { __typename ...selectionInfo } tags { __typename ...coreTagUI } statuses { __typename ...coreTagUI } } } } feesInfo @include(if: $includeExtraInfoContent) { __typename ...fulfilmentExtraInfo } selectionOptionsInfo @include(if: $includeExtraInfoContent) { title selectionOptions { selectionOptionId description icon { coreIconName } title selectionOptionsInfoTags: tags { label altLabel { text altText } type } disabledBadge { label altLabel { text altText } type } disabledTitle disabledDescription } } }  fragment checkoutContent on CheckoutContent { productsInfo { productId productName price quantity subtotal isAvailable sellerName brandName dispatchNote } message { __typename ... on SnackBar { message eventSource } } legacyErrors { errorCode message key } progress { index id title } content { __typename ... on InsetBanner { displayType message action { placement type label url } } ... on CheckoutCollectionAddressEmpty { title displayName buttonText } ... on CheckoutMarketFulfilmentAddress { title displayName addressButtonTitle addressStatus addressType addressData { __typename ... on CheckoutCollectionAddressDelivery { modeId } } shoppingModeDetails { displayName mode storeAddressId } } ... on CheckoutCollectionAddressDelivery { __typename ...checkoutCollectionAddressDelivery } ... on CheckoutCollectionMethod { title options { title modeId isSelected addressId } address { __typename ...checkoutCollectionAddressDelivery ... on CheckoutCollectionAddressPickup { title modeId storeId text addressId displayName addressImageUrl buttonText label } } insetBanner { displayType message } marketPickupSheet @include(if: $includeMarketPickupSheet) { bottomSheetTitle bottomSheetBody showOnceOnly primaryCta { label } secondaryCta { label } } shoppingModeDetails { displayName mode storeAddressId } } ... on CheckoutFulfilmentWindows { __typename ...checkoutFulfilmentWindows } ... on CheckoutFulfilmentWindowsEmptyState { title message } ... on CheckoutFulfilmentWindowsSelectedState { title subtitle timeWindow price buttonTitle inlineMessage { displayType message } windows { __typename ...checkoutFulfilmentWindows } } ... on CheckoutPackagingMethod { title options { id isSelected title price description imageUrl } } ... on CheckoutDeliveryPreferenceToggle { preferenceId isEnabled title subtitle label value inlineMessage { displayType message } } ... on CheckoutContactDetails @include(if: $includeContactDetails) { title phoneNumberLabel phoneNumber placeholder buttonTitle inlineMessage { displayType message } } ... on CheckoutDeliveryPreferenceText { preferenceId isEnabled title inputLimit { maxLength warningOffset } descriptionText placeholderText text buttonTitle inlineMessage { displayType message } } ... on CheckoutProducts { title descriptionText substitution { title selectedOptionTitle options { title id } info { title message buttonTitle } } substitutionPreferences { title body state info { title message buttonTitle } } products { title quantity productId unitPrice totalPrice totalTitle imageUrl instruction { text title label placeholderText buttonTitle inputLimit { maxLength warningOffset } } rewards { points imageUrl } removeInfo { title message buttonTitle } allowSubstitution messages showSubstitution cartProductInfo { totalPrice totalOriginalPrice totalDiscount } substitutionPreference { state header title action { label enabled } } } useSubstitutionPreference substitutionPreferenceOnboardingBanner { title subtitle deeplink type imageUrl actionLabel analyticsLabel dismissible bannerId } } ... on CheckoutMarketProducts { title descriptionText sellerGroups { sellerName dispatchNote products { title quantity productId unitPrice totalPrice totalTitle imageUrl brandName removeInfo { title message buttonTitle } cartProductInfo { totalPrice totalOriginalPrice totalDiscount } } } } ... on CheckoutProductCampaigns { campaigns { label title subtitle id imageUrl isOptedIn campaignInfo { message buttonTitle } } } ... on CheckoutSectionHeader { title imageUrl } } orderTotalDetails { inlineMessage { displayType message analytics { eventLabel eventDescription eventValue } } sections { title titleType value valueType imageUrl message @include(if: $includeServiceFees) { title body type } } total { title value balanceToPay buttonTitle progressId isEnabled } reviewProducts { unavailableOrderItems { name } restrictedOrderItems { name } exceededSupplyLimitProductGroups { products { name } } restrictedProductsByDeliveryMethod { name } restrictedProductsByDeliPlatter { name } availableOrderItems { name } } panelMarkdown @include(if: $includePanelMarkdown) } idVerificationBottomSheet @include(if: $includeIdVerificationBottomSheet) { title body imageUrls primaryButton { label style enabled } secondaryButton { label style enabled } } restrictionPrompt { title message } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdatePreferenceInstructionMutation)) {
            return false;
        }
        UpdatePreferenceInstructionMutation updatePreferenceInstructionMutation = (UpdatePreferenceInstructionMutation) obj;
        return Intrinsics.c(this.f21924a, updatePreferenceInstructionMutation.f21924a) && Intrinsics.c(this.b, updatePreferenceInstructionMutation.b) && Intrinsics.c(this.c, updatePreferenceInstructionMutation.c) && Intrinsics.c(this.d, updatePreferenceInstructionMutation.d) && Intrinsics.c(this.e, updatePreferenceInstructionMutation.e) && this.f == updatePreferenceInstructionMutation.f && this.g == updatePreferenceInstructionMutation.g && Intrinsics.c(this.h, updatePreferenceInstructionMutation.h) && Intrinsics.c(this.i, updatePreferenceInstructionMutation.i) && Intrinsics.c(this.j, updatePreferenceInstructionMutation.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + a.c(this.i, a.c(this.h, b.e(b.e(a.c(this.e, a.c(this.d, a.c(this.c, b.c(this.f21924a.hashCode() * 31, 31, this.b), 31), 31), 31), 31, this.f), 31, this.g), 31), 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "eca88186f4fea6ef7a30c5b03d392f6d5631ec45eababd390e10b2f4407dcb95";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "updatePreferenceInstruction";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Optional optional = this.f21924a;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("preferenceId");
            Adapters.d(Adapters.b(CheckoutDeliveryPreferenceId_ResponseAdapter.f12051a)).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
        jsonWriter.F1("value");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.b);
        Optional optional2 = this.c;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("includeMarketPickupSheet");
            Adapters.d(Adapters.l).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        } else if (z) {
            jsonWriter.F1("includeMarketPickupSheet");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional3 = this.d;
        if (optional3 instanceof Optional.Present) {
            jsonWriter.F1("includeIdVerificationBottomSheet");
            Adapters.d(Adapters.l).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional3);
        } else if (z) {
            jsonWriter.F1("includeIdVerificationBottomSheet");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional4 = this.e;
        if (optional4 instanceof Optional.Present) {
            jsonWriter.F1("includeExtraInfoContent");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional4);
        } else if (z) {
            jsonWriter.F1("includeExtraInfoContent");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        jsonWriter.F1("includePanelMarkdown");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        d.B(this.f, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeContactDetails");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.g));
        Optional optional5 = this.h;
        if (optional5 instanceof Optional.Present) {
            jsonWriter.F1("includeTimeSelectionContent");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional5);
        } else if (z) {
            jsonWriter.F1("includeTimeSelectionContent");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional6 = this.i;
        if (optional6 instanceof Optional.Present) {
            jsonWriter.F1("includeSuggestedTimeSlot");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional6);
        } else if (z) {
            jsonWriter.F1("includeSuggestedTimeSlot");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional7 = this.j;
        if (optional7 instanceof Optional.Present) {
            jsonWriter.F1("includeServiceFees");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional7);
        } else if (z) {
            jsonWriter.F1("includeServiceFees");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdatePreferenceInstructionMutation(preferenceId=");
        sb.append(this.f21924a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(", includeMarketPickupSheet=");
        a.x(sb, this.c, ", includeIdVerificationBottomSheet=", this.d, ", includeExtraInfoContent=");
        a.y(sb, this.e, ", includePanelMarkdown=", this.f, ", includeContactDetails=");
        a.z(sb, this.g, ", includeTimeSelectionContent=", this.h, ", includeSuggestedTimeSlot=");
        sb.append(this.i);
        sb.append(", includeServiceFees=");
        sb.append(this.j);
        sb.append(")");
        return sb.toString();
    }
}
