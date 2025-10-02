package com.woolworths.shop.checkout;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.shop.checkout.adapter.FulfilmentWindowsQuery_ResponseAdapter;
import com.woolworths.shop.checkout.fragment.CheckoutFulfilmentWindows;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/checkout/FulfilmentWindowsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/shop/checkout/FulfilmentWindowsQuery$Data;", "Data", "FulfilmentWindows", "Companion", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class FulfilmentWindowsQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final Optional f21836a;
    public final Optional b;
    public final Optional c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/shop/checkout/FulfilmentWindowsQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/FulfilmentWindowsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final FulfilmentWindows f21837a;

        public Data(FulfilmentWindows fulfilmentWindows) {
            this.f21837a = fulfilmentWindows;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f21837a, ((Data) obj).f21837a);
        }

        public final int hashCode() {
            FulfilmentWindows fulfilmentWindows = this.f21837a;
            if (fulfilmentWindows == null) {
                return 0;
            }
            return fulfilmentWindows.hashCode();
        }

        public final String toString() {
            return "Data(fulfilmentWindows=" + this.f21837a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/shop/checkout/FulfilmentWindowsQuery$FulfilmentWindows;", "", "shop-checkout_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class FulfilmentWindows {

        /* renamed from: a, reason: collision with root package name */
        public final String f21838a;
        public final CheckoutFulfilmentWindows b;

        public FulfilmentWindows(String str, CheckoutFulfilmentWindows checkoutFulfilmentWindows) {
            this.f21838a = str;
            this.b = checkoutFulfilmentWindows;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof FulfilmentWindows)) {
                return false;
            }
            FulfilmentWindows fulfilmentWindows = (FulfilmentWindows) obj;
            return Intrinsics.c(this.f21838a, fulfilmentWindows.f21838a) && Intrinsics.c(this.b, fulfilmentWindows.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21838a.hashCode() * 31);
        }

        public final String toString() {
            return "FulfilmentWindows(__typename=" + this.f21838a + ", checkoutFulfilmentWindows=" + this.b + ")";
        }
    }

    public FulfilmentWindowsQuery(Optional.Present present) {
        this.f21836a = present;
        Optional.Absent absent = Optional.Absent.f13523a;
        this.b = absent;
        this.c = absent;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(FulfilmentWindowsQuery_ResponseAdapter.Data.f21975a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query FulfilmentWindows($includeExtraInfoContent: Boolean! = false , $includeTimeSelectionContent: Boolean! = false , $includeSuggestedTimeSlot: Boolean! = false ) { fulfilmentWindows { __typename ...checkoutFulfilmentWindows } }  fragment selectionInfo on FulfilmentWindowSlotSelectionInfo { descriptionMd iconType }  fragment compatibleColor on CompatibleColor { lightHexCode }  fragment iconFragment on IconAsset { __typename ... on HostedIcon { __typename url } ... on CoreIcon { __typename coreIconName } }  fragment coreTagUI on CoreTagUI { __typename label coreColorTheme { __typename background { __typename ...compatibleColor } foreground { __typename primary { __typename ...compatibleColor } secondary { __typename ...compatibleColor } highlight { __typename ...compatibleColor } } } hasBorder icon { __typename ...iconFragment } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment fulfilmentExtraInfo on FulfilmentExtraInfo { title content { __typename ... on BasicInsetAlert { insetAlertUI { title description style } insetAlertAction { id type action analytics { __typename ...analyticsFields } } insetAlertActionLabel } ... on BasicCoreBroadcastBanner { impressionAnalytics { __typename ...analyticsFields } broadcastBannerDismissAnalytics { __typename ...analyticsFields } broadcastBannerUI { title subtitle style icon { __typename ... on CoreIcon { coreIconName } ... on HostedIcon { url } } } broadcastBannerAction { action id type } broadcastBannerActionLabel broadcastBannerId broadcastBannerDismissible } ... on FulfilmentFeesInfoSection { feesInfoSectionTitle items { __typename ... on FulfilmentFeeItem { title subtitle prices { __typename ... on FulfilmentFeePriceInfo { amount description } } } } } ... on CheckoutTermsConditions { markdownText } ... on FulfilmentInfoRowAccordion { openActionAnalytics { __typename ...analyticsFields } closeActionAnalytics { __typename ...analyticsFields } rowUI { leadingAsset { __typename ... on HostedIcon { url } ... on CoreIcon { coreIconName } } description label } isExpanded hasTopSeparator expandedContent { __typename ... on ParagraphTextItem { type content } } } } }  fragment checkoutFulfilmentWindows on CheckoutFulfilmentWindows { title header subheader { displayType message bannerTitle: title iconUrl action { placement type label url } } subtitle footer { buttonTitle } sectionHeader @include(if: $includeTimeSelectionContent) suggestedGroup @include(if: $includeSuggestedTimeSlot) { title slots { title subtitle startTime id isAvailable isSelected isPartnerDriver sectionTitle badges { title style } selectionInfo { __typename ...selectionInfo } tags { __typename ...coreTagUI } statuses { __typename ...coreTagUI } } bottomSheet { bottomSheetTitle bottomSheetBody } } options { title subtitle isAvailable isSelected footer footerV2 @include(if: $includeTimeSelectionContent) { title subtitle isSpecial } sectionTitle extraInfoButton @include(if: $includeExtraInfoContent) { messageTitle buttonTitle } extraInfo @include(if: $includeExtraInfoContent) { __typename ...fulfilmentExtraInfo } deliveryNowV2 { id startTime tags @include(if: $includeTimeSelectionContent) { __typename ...coreTagUI } statuses @include(if: $includeTimeSelectionContent) { __typename ...coreTagUI } title subtitle secondarySubtitle sectionTitle imageUrl messageTitle buttonTitle info { title items { title description imageUrl } } isSelected isEnabled deliveryNowV2Badge: badge { label altLabel { text altText } type } selectionInfo { __typename ...selectionInfo } } deliveryNowStatus directToBootNow { id startTime title subtitle secondarySubtitle sectionTitle imageUrl isSelected } directToBootNowV2 { id startTime tags @include(if: $includeTimeSelectionContent) { __typename ...coreTagUI } statuses @include(if: $includeTimeSelectionContent) { __typename ...coreTagUI } title subtitle secondarySubtitle sectionTitle imageUrl isSelected isEnabled directToBootNowV2Badge: badge { label altLabel { text altText } type } tileBadge { label type } selectionInfo { __typename ...selectionInfo } selectionOptionsState @include(if: $includeExtraInfoContent) { enabledOptions excludedOptions selectedOption isLastWindow } } directToBootNowStatus groups { title isSelected imageUrl message { title subtitle } subtitle slots { title subtitle startTime id isAvailable isSelected isPartnerDriver sectionTitle badges { title style } selectionInfo { __typename ...selectionInfo } selectionOptionsState @include(if: $includeExtraInfoContent) { enabledOptions excludedOptions selectedOption isLastWindow } tags @include(if: $includeTimeSelectionContent) { __typename ...coreTagUI } statuses @include(if: $includeTimeSelectionContent) { __typename ...coreTagUI } } slotsV2 @include(if: $includeSuggestedTimeSlot) { title subtitle startTime id isAvailable isSelected isPartnerDriver sectionTitle badges { title style } selectionInfo { __typename ...selectionInfo } tags { __typename ...coreTagUI } statuses { __typename ...coreTagUI } } } } feesInfo @include(if: $includeExtraInfoContent) { __typename ...fulfilmentExtraInfo } selectionOptionsInfo @include(if: $includeExtraInfoContent) { title selectionOptions { selectionOptionId description icon { coreIconName } title selectionOptionsInfoTags: tags { label altLabel { text altText } type } disabledBadge { label altLabel { text altText } type } disabledTitle disabledDescription } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FulfilmentWindowsQuery)) {
            return false;
        }
        FulfilmentWindowsQuery fulfilmentWindowsQuery = (FulfilmentWindowsQuery) obj;
        return Intrinsics.c(this.f21836a, fulfilmentWindowsQuery.f21836a) && Intrinsics.c(this.b, fulfilmentWindowsQuery.b) && Intrinsics.c(this.c, fulfilmentWindowsQuery.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + a.c(this.b, this.f21836a.hashCode() * 31, 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "c69317140043f19bdc69a9d983b68170c8d2b522020936590feb362f2836b2e2";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "FulfilmentWindows";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        Optional optional = this.f21836a;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("includeExtraInfoContent");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        } else if (z) {
            jsonWriter.F1("includeExtraInfoContent");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional2 = this.b;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("includeTimeSelectionContent");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        } else if (z) {
            jsonWriter.F1("includeTimeSelectionContent");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional3 = this.c;
        if (optional3 instanceof Optional.Present) {
            jsonWriter.F1("includeSuggestedTimeSlot");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional3);
        } else if (z) {
            jsonWriter.F1("includeSuggestedTimeSlot");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
    }

    public final String toString() {
        return a.o(a.p("FulfilmentWindowsQuery(includeExtraInfoContent=", this.f21836a, ", includeTimeSelectionContent=", this.b, ", includeSuggestedTimeSlot="), this.c, ")");
    }
}
