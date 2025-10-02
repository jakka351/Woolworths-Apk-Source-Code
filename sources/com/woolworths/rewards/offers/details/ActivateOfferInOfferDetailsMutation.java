package com.woolworths.rewards.offers.details;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import au.com.woolworths.rewards.graphql.type.OfferDetailsPageInput;
import au.com.woolworths.rewards.graphql.type.adapter.OfferDetailsPageInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.offers.details.adapter.ActivateOfferInOfferDetailsMutation_ResponseAdapter;
import com.woolworths.rewards.offers.details.fragment.OfferDetailsPageFragment;
import com.woolworths.rewards.offers.fragment.RewardsOfferFields;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/woolworths/rewards/offers/details/ActivateOfferInOfferDetailsMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/rewards/offers/details/ActivateOfferInOfferDetailsMutation$Data;", "Data", "ActivateOfferInOfferDetails", "OnOfferDetailsMutationResult", "RewardsOffer", "OfferDetailsPage", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ActivateOfferInOfferDetailsMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final OfferDetailsPageInput f20774a;
    public final Optional b;
    public final boolean c;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/ActivateOfferInOfferDetailsMutation$ActivateOfferInOfferDetails;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActivateOfferInOfferDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f20775a;
        public final OnOfferDetailsMutationResult b;

        public ActivateOfferInOfferDetails(String __typename, OnOfferDetailsMutationResult onOfferDetailsMutationResult) {
            Intrinsics.h(__typename, "__typename");
            this.f20775a = __typename;
            this.b = onOfferDetailsMutationResult;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActivateOfferInOfferDetails)) {
                return false;
            }
            ActivateOfferInOfferDetails activateOfferInOfferDetails = (ActivateOfferInOfferDetails) obj;
            return Intrinsics.c(this.f20775a, activateOfferInOfferDetails.f20775a) && Intrinsics.c(this.b, activateOfferInOfferDetails.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20775a.hashCode() * 31;
            OnOfferDetailsMutationResult onOfferDetailsMutationResult = this.b;
            return iHashCode + (onOfferDetailsMutationResult == null ? 0 : onOfferDetailsMutationResult.hashCode());
        }

        public final String toString() {
            return "ActivateOfferInOfferDetails(__typename=" + this.f20775a + ", onOfferDetailsMutationResult=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/offers/details/ActivateOfferInOfferDetailsMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/ActivateOfferInOfferDetailsMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ActivateOfferInOfferDetails f20776a;

        public Data(ActivateOfferInOfferDetails activateOfferInOfferDetails) {
            this.f20776a = activateOfferInOfferDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20776a, ((Data) obj).f20776a);
        }

        public final int hashCode() {
            return this.f20776a.hashCode();
        }

        public final String toString() {
            return "Data(activateOfferInOfferDetails=" + this.f20776a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/ActivateOfferInOfferDetailsMutation$OfferDetailsPage;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferDetailsPage {

        /* renamed from: a, reason: collision with root package name */
        public final String f20777a;
        public final OfferDetailsPageFragment b;

        public OfferDetailsPage(String str, OfferDetailsPageFragment offerDetailsPageFragment) {
            this.f20777a = str;
            this.b = offerDetailsPageFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferDetailsPage)) {
                return false;
            }
            OfferDetailsPage offerDetailsPage = (OfferDetailsPage) obj;
            return Intrinsics.c(this.f20777a, offerDetailsPage.f20777a) && Intrinsics.c(this.b, offerDetailsPage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20777a.hashCode() * 31);
        }

        public final String toString() {
            return "OfferDetailsPage(__typename=" + this.f20777a + ", offerDetailsPageFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/ActivateOfferInOfferDetailsMutation$OnOfferDetailsMutationResult;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOfferDetailsMutationResult {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsOffer f20778a;
        public final OfferDetailsPage b;

        public OnOfferDetailsMutationResult(RewardsOffer rewardsOffer, OfferDetailsPage offerDetailsPage) {
            this.f20778a = rewardsOffer;
            this.b = offerDetailsPage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOfferDetailsMutationResult)) {
                return false;
            }
            OnOfferDetailsMutationResult onOfferDetailsMutationResult = (OnOfferDetailsMutationResult) obj;
            return Intrinsics.c(this.f20778a, onOfferDetailsMutationResult.f20778a) && Intrinsics.c(this.b, onOfferDetailsMutationResult.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20778a.hashCode() * 31);
        }

        public final String toString() {
            return "OnOfferDetailsMutationResult(rewardsOffer=" + this.f20778a + ", offerDetailsPage=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/ActivateOfferInOfferDetailsMutation$RewardsOffer;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsOffer {

        /* renamed from: a, reason: collision with root package name */
        public final String f20779a;
        public final RewardsOfferFields b;

        public RewardsOffer(String __typename, RewardsOfferFields rewardsOfferFields) {
            Intrinsics.h(__typename, "__typename");
            this.f20779a = __typename;
            this.b = rewardsOfferFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RewardsOffer)) {
                return false;
            }
            RewardsOffer rewardsOffer = (RewardsOffer) obj;
            return Intrinsics.c(this.f20779a, rewardsOffer.f20779a) && Intrinsics.c(this.b, rewardsOffer.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20779a.hashCode() * 31;
            RewardsOfferFields rewardsOfferFields = this.b;
            return iHashCode + (rewardsOfferFields == null ? 0 : rewardsOfferFields.hashCode());
        }

        public final String toString() {
            return "RewardsOffer(__typename=" + this.f20779a + ", rewardsOfferFields=" + this.b + ")";
        }
    }

    public ActivateOfferInOfferDetailsMutation(OfferDetailsPageInput offerDetailsPageInput, boolean z) {
        Intrinsics.h(offerDetailsPageInput, "offerDetailsPageInput");
        this.f20774a = offerDetailsPageInput;
        this.b = Optional.Absent.f13523a;
        this.c = z;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(ActivateOfferInOfferDetailsMutation_ResponseAdapter.Data.f20790a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation ActivateOfferInOfferDetails($offerDetailsPageInput: OfferDetailsPageInput!, $includeDetails: Boolean! = false , $isOfferDetailsRefactorEnabled: Boolean!, $isTigerNewOfferEnabled: Boolean!) { activateOfferInOfferDetails(input: $offerDetailsPageInput) { __typename ... on OfferDetailsMutationResult { rewardsOffer { __typename ...rewardsOfferFields } offerDetailsPage { __typename ...OfferDetailsPageFragment } } } }  fragment standardBannerFields on StandardBanner { bannerId bannerTitle bannerImageUrl bannerDescription bannerActionUrl bannerActionLabel bannerActionAccessibilityHint }  fragment iconAsset on IconAsset { __typename ... on LocalAsset { iconName } ... on HostedIcon { url } ... on CoreIcon { coreIconName coreWebIconName } }  fragment rewardsOfferFields on RewardsOffer { offerId image bannerUrl standardBanner @include(if: $includeDetails) { __typename ...standardBannerFields } boostedOfferInsetBanner { displayType message title iconUrl action { placement type label url actionAccessibilityHint } } title subtitle summary body formattedTermsAndConditions markdownTermsAndConditions displayStatus offerStatus mechanics @include(if: $includeDetails) { displayLastUpdated separator selectedIndex items { icon caption altText title } } displayExpiry displayExpiryExtended statusIcons @skip(if: $isOfferDetailsRefactorEnabled) { icon } offerAnalytics { offerName commId uoid campaignCode campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode rtlCouponStart profile } activationAnimation displayAnimation activationMessage { title message buttonLabel } brandLogoUrl brandLogoUrlCompact roundel @include(if: $isTigerNewOfferEnabled) { __typename ...iconAsset } offerListCta { cta { label url isExternalUrl } displayStatus } offerDetailsCta @include(if: $includeDetails) { cta { label url isExternalUrl } displayStatus } offerTileProgressTracker @include(if: $isOfferDetailsRefactorEnabled) { title titleSuffix description circularProgressIndicator { primaryRing { ringPercent ringColor } } } offerTileAltText @include(if: $isOfferDetailsRefactorEnabled) }  fragment OfferDetailsCardFragment on OfferDetailsCard { rows { __typename ... on OfferDetailsTrackerComboRow { trackerRow { rowLeadingAsset { __typename ... on LocalAsset { iconName } ... on HostedIcon { url } } rowLabel rowTrailingElement { __typename ... on OfferDetailsTrackerTrailingElementLabel { elementLabel } ... on OfferDetailsTrackerTrailingElementPoints { pointsPrefix pointsLabel } } } progressRow { progressRowTitle progressRowDescription progressRowCircularIndicator { primaryRing { ringPercent ringColor } } } comboRowAltText: altText } ... on MarkdownTextItem { content } ... on SubheadTextItem { content } ... on OfferDetailsInfoItem { infoLeadingAsset { __typename ... on LocalAsset { iconName } ... on HostedIcon { url } } infoDescription } ... on DownloadableAsset { assetType assetUrl assetWidth assetHeight fit altText } } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment contentCtaFields on ContentCta { label url isExternalUrl onCtaClickAnalytics { __typename ...analyticsFields } }  fragment OfferDetailsPageFragment on OfferDetailsPage { header { heroAsset { assetId assetType assetUrl assetWidth assetHeight fit altText } leafAsset { __typename ... on LocalAsset { iconName } ... on HostedIcon { url } } roundelAsset @include(if: $isTigerNewOfferEnabled) { __typename ...iconAsset } title description statusBadge { label status } broadcastBanner { broadcastBannerUI { title subtitle style icon { __typename ... on HostedIcon { url } } } broadcastBannerAction { id type action } broadcastBannerActionLabel } } content { __typename ... on OfferDetailsCard { __typename ...OfferDetailsCardFragment } } footer { __typename ... on OfferDetailsFooter { label cta { __typename ...contentCtaFields } statusBadge { label status } } } offerAnalytics { offerName commId uoid campaignCode campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode rtlCouponStart profile } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivateOfferInOfferDetailsMutation)) {
            return false;
        }
        ActivateOfferInOfferDetailsMutation activateOfferInOfferDetailsMutation = (ActivateOfferInOfferDetailsMutation) obj;
        return Intrinsics.c(this.f20774a, activateOfferInOfferDetailsMutation.f20774a) && this.b.equals(activateOfferInOfferDetailsMutation.b) && this.c == activateOfferInOfferDetailsMutation.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + b.e(a.c(this.b, this.f20774a.hashCode() * 31, 31), 31, true);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "4f4df6be5b9f83da659c89bece0ec0baabad98232cc728a7a46d1719d24a3ff4";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "ActivateOfferInOfferDetails";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("offerDetailsPageInput");
        Adapters.c(OfferDetailsPageInput_InputAdapter.f9959a, false).toJson(jsonWriter, customScalarAdapters, this.f20774a);
        Optional optional = this.b;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("includeDetails");
            Adapters.d(Adapters.f).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        } else if (z) {
            jsonWriter.F1("includeDetails");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        jsonWriter.F1("isOfferDetailsRefactorEnabled");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.TRUE);
        jsonWriter.F1("isTigerNewOfferEnabled");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.c));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivateOfferInOfferDetailsMutation(offerDetailsPageInput=");
        sb.append(this.f20774a);
        sb.append(", includeDetails=");
        sb.append(this.b);
        sb.append(", isOfferDetailsRefactorEnabled=true, isTigerNewOfferEnabled=");
        return YU.a.k(")", sb, this.c);
    }
}
