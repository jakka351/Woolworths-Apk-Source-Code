package com.woolworths.shop.checkout;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.checkout.adapter.FulfilmentWindowsV2Query_ResponseAdapter;
import com.woolworths.shop.checkout.fragment.CheckoutFulfilmentWindows;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/checkout/FulfilmentWindowsV2Query;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/checkout/FulfilmentWindowsV2Query$Data;", "Data", "FulfilmentWindowsV2", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FulfilmentWindowsV2Query implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f21839a;
    public final boolean b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/checkout/FulfilmentWindowsV2Query$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/FulfilmentWindowsV2Query$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final FulfilmentWindowsV2 f21840a;

        public Data(FulfilmentWindowsV2 fulfilmentWindowsV2) {
            this.f21840a = fulfilmentWindowsV2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21840a, ((Data) obj).f21840a);
        }

        public final int hashCode() {
            FulfilmentWindowsV2 fulfilmentWindowsV2 = this.f21840a;
            if (fulfilmentWindowsV2 == null) {
                return 0;
            }
            return fulfilmentWindowsV2.hashCode();
        }

        public final String toString() {
            return "Data(fulfilmentWindowsV2=" + this.f21840a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/FulfilmentWindowsV2Query$FulfilmentWindowsV2;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FulfilmentWindowsV2 {

        /* renamed from: a, reason: collision with root package name */
        public final String f21841a;
        public final CheckoutFulfilmentWindows b;

        public FulfilmentWindowsV2(String str, CheckoutFulfilmentWindows checkoutFulfilmentWindows) {
            this.f21841a = str;
            this.b = checkoutFulfilmentWindows;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FulfilmentWindowsV2)) {
                return false;
            }
            FulfilmentWindowsV2 fulfilmentWindowsV2 = (FulfilmentWindowsV2) obj;
            return Intrinsics.c(this.f21841a, fulfilmentWindowsV2.f21841a) && Intrinsics.c(this.b, fulfilmentWindowsV2.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21841a.hashCode() * 31);
        }

        public final String toString() {
            return "FulfilmentWindowsV2(__typename=" + this.f21841a + ", checkoutFulfilmentWindows=" + this.b + ")";
        }
    }

    public FulfilmentWindowsV2Query(boolean z, boolean z2) {
        this.f21839a = z;
        this.b = z2;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(FulfilmentWindowsV2Query_ResponseAdapter.Data.f21977a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query FulfilmentWindowsV2($includeTimeSelectionContent: Boolean!, $includeExtraInfoContent: Boolean!, $includeSuggestedTimeSlot: Boolean!) { fulfilmentWindowsV2 { __typename ...checkoutFulfilmentWindows } }  fragment selectionInfo on FulfilmentWindowSlotSelectionInfo { descriptionMd iconType }  fragment compatibleColor on CompatibleColor { lightHexCode }  fragment iconFragment on IconAsset { __typename ... on HostedIcon { __typename url } ... on CoreIcon { __typename coreIconName } }  fragment coreTagUI on CoreTagUI { __typename label coreColorTheme { __typename background { __typename ...compatibleColor } foreground { __typename primary { __typename ...compatibleColor } secondary { __typename ...compatibleColor } highlight { __typename ...compatibleColor } } } hasBorder icon { __typename ...iconFragment } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment fulfilmentExtraInfo on FulfilmentExtraInfo { title content { __typename ... on BasicInsetAlert { insetAlertUI { title description style } insetAlertAction { id type action analytics { __typename ...analyticsFields } } insetAlertActionLabel } ... on BasicCoreBroadcastBanner { impressionAnalytics { __typename ...analyticsFields } broadcastBannerDismissAnalytics { __typename ...analyticsFields } broadcastBannerUI { title subtitle style icon { __typename ... on CoreIcon { coreIconName } ... on HostedIcon { url } } } broadcastBannerAction { action id type } broadcastBannerActionLabel broadcastBannerId broadcastBannerDismissible } ... on FulfilmentFeesInfoSection { feesInfoSectionTitle items { __typename ... on FulfilmentFeeItem { title subtitle prices { __typename ... on FulfilmentFeePriceInfo { amount description } } } } } ... on CheckoutTermsConditions { markdownText } ... on FulfilmentInfoRowAccordion { openActionAnalytics { __typename ...analyticsFields } closeActionAnalytics { __typename ...analyticsFields } rowUI { leadingAsset { __typename ... on HostedIcon { url } ... on CoreIcon { coreIconName } } description label } isExpanded hasTopSeparator expandedContent { __typename ... on ParagraphTextItem { type content } } } } }  fragment checkoutFulfilmentWindows on CheckoutFulfilmentWindows { title header subheader { displayType message bannerTitle: title iconUrl action { placement type label url } } subtitle footer { buttonTitle } sectionHeader @include(if: $includeTimeSelectionContent) suggestedGroup @include(if: $includeSuggestedTimeSlot) { title slots { title subtitle startTime id isAvailable isSelected isPartnerDriver sectionTitle badges { title style } selectionInfo { __typename ...selectionInfo } tags { __typename ...coreTagUI } statuses { __typename ...coreTagUI } } bottomSheet { bottomSheetTitle bottomSheetBody } } options { title subtitle isAvailable isSelected footer footerV2 @include(if: $includeTimeSelectionContent) { title subtitle isSpecial } sectionTitle extraInfoButton @include(if: $includeExtraInfoContent) { messageTitle buttonTitle } extraInfo @include(if: $includeExtraInfoContent) { __typename ...fulfilmentExtraInfo } deliveryNowV2 { id startTime tags @include(if: $includeTimeSelectionContent) { __typename ...coreTagUI } statuses @include(if: $includeTimeSelectionContent) { __typename ...coreTagUI } title subtitle secondarySubtitle sectionTitle imageUrl messageTitle buttonTitle info { title items { title description imageUrl } } isSelected isEnabled deliveryNowV2Badge: badge { label altLabel { text altText } type } selectionInfo { __typename ...selectionInfo } } deliveryNowStatus directToBootNow { id startTime title subtitle secondarySubtitle sectionTitle imageUrl isSelected } directToBootNowV2 { id startTime tags @include(if: $includeTimeSelectionContent) { __typename ...coreTagUI } statuses @include(if: $includeTimeSelectionContent) { __typename ...coreTagUI } title subtitle secondarySubtitle sectionTitle imageUrl isSelected isEnabled directToBootNowV2Badge: badge { label altLabel { text altText } type } tileBadge { label type } selectionInfo { __typename ...selectionInfo } selectionOptionsState @include(if: $includeExtraInfoContent) { enabledOptions excludedOptions selectedOption isLastWindow } } directToBootNowStatus groups { title isSelected imageUrl message { title subtitle } subtitle slots { title subtitle startTime id isAvailable isSelected isPartnerDriver sectionTitle badges { title style } selectionInfo { __typename ...selectionInfo } selectionOptionsState @include(if: $includeExtraInfoContent) { enabledOptions excludedOptions selectedOption isLastWindow } tags @include(if: $includeTimeSelectionContent) { __typename ...coreTagUI } statuses @include(if: $includeTimeSelectionContent) { __typename ...coreTagUI } } slotsV2 @include(if: $includeSuggestedTimeSlot) { title subtitle startTime id isAvailable isSelected isPartnerDriver sectionTitle badges { title style } selectionInfo { __typename ...selectionInfo } tags { __typename ...coreTagUI } statuses { __typename ...coreTagUI } } } } feesInfo @include(if: $includeExtraInfoContent) { __typename ...fulfilmentExtraInfo } selectionOptionsInfo @include(if: $includeExtraInfoContent) { title selectionOptions { selectionOptionId description icon { coreIconName } title selectionOptionsInfoTags: tags { label altLabel { text altText } type } disabledBadge { label altLabel { text altText } type } disabledTitle disabledDescription } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FulfilmentWindowsV2Query)) {
            return false;
        }
        FulfilmentWindowsV2Query fulfilmentWindowsV2Query = (FulfilmentWindowsV2Query) obj;
        return this.f21839a == fulfilmentWindowsV2Query.f21839a && this.b == fulfilmentWindowsV2Query.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + b.e(Boolean.hashCode(this.f21839a) * 31, 31, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "62d68f685145626f4a82dd13c666fd0547c8f0f8e586b15fb4c568fbee8da093";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "FulfilmentWindowsV2";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("includeTimeSelectionContent");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        d.B(this.f21839a, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeExtraInfoContent");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        jsonWriter.F1("includeSuggestedTimeSlot");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.b));
    }

    public final String toString() {
        return "FulfilmentWindowsV2Query(includeTimeSelectionContent=" + this.f21839a + ", includeExtraInfoContent=false, includeSuggestedTimeSlot=" + this.b + ")";
    }
}
