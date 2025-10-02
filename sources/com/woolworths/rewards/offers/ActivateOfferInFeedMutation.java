package com.woolworths.rewards.offers;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Mutation;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.offers.adapter.ActivateOfferInFeedMutation_ResponseAdapter;
import com.woolworths.rewards.offers.fragment.RewardsOfferFeedFields;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/woolworths/rewards/offers/ActivateOfferInFeedMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/rewards/offers/ActivateOfferInFeedMutation$Data;", "Data", "ActivateOfferInFeed", "OfferFeed", "ActivationDetails", "OnActivationDetailsError", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ActivateOfferInFeedMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f20694a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final Optional.Present e;
    public final Optional.Present f;
    public final boolean g;
    public final boolean h;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/ActivateOfferInFeedMutation$ActivateOfferInFeed;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActivateOfferInFeed {

        /* renamed from: a, reason: collision with root package name */
        public final OfferFeed f20695a;
        public final ArrayList b;
        public final ActivationDetails c;

        public ActivateOfferInFeed(OfferFeed offerFeed, ArrayList arrayList, ActivationDetails activationDetails) {
            this.f20695a = offerFeed;
            this.b = arrayList;
            this.c = activationDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActivateOfferInFeed)) {
                return false;
            }
            ActivateOfferInFeed activateOfferInFeed = (ActivateOfferInFeed) obj;
            return this.f20695a.equals(activateOfferInFeed.f20695a) && this.b.equals(activateOfferInFeed.b) && Intrinsics.c(this.c, activateOfferInFeed.c);
        }

        public final int hashCode() {
            int iB = a.b(this.f20695a.hashCode() * 31, 31, this.b);
            ActivationDetails activationDetails = this.c;
            return iB + (activationDetails == null ? 0 : activationDetails.hashCode());
        }

        public final String toString() {
            return "ActivateOfferInFeed(offerFeed=" + this.f20695a + ", activatedOfferIds=" + this.b + ", activationDetails=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/ActivateOfferInFeedMutation$ActivationDetails;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActivationDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f20696a;
        public final OnActivationDetailsError b;

        public ActivationDetails(String __typename, OnActivationDetailsError onActivationDetailsError) {
            Intrinsics.h(__typename, "__typename");
            this.f20696a = __typename;
            this.b = onActivationDetailsError;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActivationDetails)) {
                return false;
            }
            ActivationDetails activationDetails = (ActivationDetails) obj;
            return Intrinsics.c(this.f20696a, activationDetails.f20696a) && Intrinsics.c(this.b, activationDetails.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20696a.hashCode() * 31;
            OnActivationDetailsError onActivationDetailsError = this.b;
            return iHashCode + (onActivationDetailsError == null ? 0 : onActivationDetailsError.f20699a.hashCode());
        }

        public final String toString() {
            return "ActivationDetails(__typename=" + this.f20696a + ", onActivationDetailsError=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/offers/ActivateOfferInFeedMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/ActivateOfferInFeedMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ActivateOfferInFeed f20697a;

        public Data(ActivateOfferInFeed activateOfferInFeed) {
            this.f20697a = activateOfferInFeed;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20697a, ((Data) obj).f20697a);
        }

        public final int hashCode() {
            ActivateOfferInFeed activateOfferInFeed = this.f20697a;
            if (activateOfferInFeed == null) {
                return 0;
            }
            return activateOfferInFeed.hashCode();
        }

        public final String toString() {
            return "Data(activateOfferInFeed=" + this.f20697a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/ActivateOfferInFeedMutation$OfferFeed;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferFeed {

        /* renamed from: a, reason: collision with root package name */
        public final String f20698a;
        public final RewardsOfferFeedFields b;

        public OfferFeed(String str, RewardsOfferFeedFields rewardsOfferFeedFields) {
            this.f20698a = str;
            this.b = rewardsOfferFeedFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferFeed)) {
                return false;
            }
            OfferFeed offerFeed = (OfferFeed) obj;
            return Intrinsics.c(this.f20698a, offerFeed.f20698a) && Intrinsics.c(this.b, offerFeed.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20698a.hashCode() * 31);
        }

        public final String toString() {
            return "OfferFeed(__typename=" + this.f20698a + ", rewardsOfferFeedFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/ActivateOfferInFeedMutation$OnActivationDetailsError;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnActivationDetailsError {

        /* renamed from: a, reason: collision with root package name */
        public final String f20699a;

        public OnActivationDetailsError(String str) {
            this.f20699a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnActivationDetailsError) && Intrinsics.c(this.f20699a, ((OnActivationDetailsError) obj).f20699a);
        }

        public final int hashCode() {
            return this.f20699a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnActivationDetailsError(errorMessage=", this.f20699a, ")");
        }
    }

    public ActivateOfferInFeedMutation(String offerId, boolean z, boolean z2, boolean z3, Optional.Present present, Optional.Present present2, boolean z4, boolean z5) {
        Intrinsics.h(offerId, "offerId");
        this.f20694a = offerId;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = present;
        this.f = present2;
        this.g = z4;
        this.h = z5;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(ActivateOfferInFeedMutation_ResponseAdapter.Data.f20740a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation ActivateOfferInFeed($offerId: ID!, $isShopAppInstalled: Boolean!, $isSpinSurpriseEnabled: Boolean!, $isPersonalisedOffersEnabled: Boolean!, $includeDetails: Boolean!, $isAutoBoostFeatureEnabled: Boolean! = false , $isOfferDetailsRefactorEnabled: Boolean! = false , $isMandyBannerEnabled: Boolean!, $isTigerNewOfferEnabled: Boolean!) { activateOfferInFeed(offerId: $offerId, isShopAppInstalled: $isShopAppInstalled, isAutoBoostFeatureEnabled: $isAutoBoostFeatureEnabled) { offerFeed { __typename ...rewardsOfferFeedFields } activatedOfferIds activationDetails { __typename ... on ActivationDetailsError { errorMessage } } } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment contentCtaFields on ContentCta { label url isExternalUrl onCtaClickAnalytics { __typename ...analyticsFields } }  fragment standardBannerFields on StandardBanner { bannerId bannerTitle bannerImageUrl bannerDescription bannerActionUrl bannerActionLabel bannerActionAccessibilityHint }  fragment iconAsset on IconAsset { __typename ... on LocalAsset { iconName } ... on HostedIcon { url } ... on CoreIcon { coreIconName coreWebIconName } }  fragment rewardsOfferFields on RewardsOffer { offerId image bannerUrl standardBanner @include(if: $includeDetails) { __typename ...standardBannerFields } boostedOfferInsetBanner { displayType message title iconUrl action { placement type label url actionAccessibilityHint } } title subtitle summary body formattedTermsAndConditions markdownTermsAndConditions displayStatus offerStatus mechanics @include(if: $includeDetails) { displayLastUpdated separator selectedIndex items { icon caption altText title } } displayExpiry displayExpiryExtended statusIcons @skip(if: $isOfferDetailsRefactorEnabled) { icon } offerAnalytics { offerName commId uoid campaignCode campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode rtlCouponStart profile } activationAnimation displayAnimation activationMessage { title message buttonLabel } brandLogoUrl brandLogoUrlCompact roundel @include(if: $isTigerNewOfferEnabled) { __typename ...iconAsset } offerListCta { cta { label url isExternalUrl } displayStatus } offerDetailsCta @include(if: $includeDetails) { cta { label url isExternalUrl } displayStatus } offerTileProgressTracker @include(if: $isOfferDetailsRefactorEnabled) { title titleSuffix description circularProgressIndicator { primaryRing { ringPercent ringColor } } } offerTileAltText @include(if: $isOfferDetailsRefactorEnabled) }  fragment OffersSectionsFragment on OffersSections { __typename ... on StandardBanner { __typename ...standardBannerFields } ... on MandyBanner @include(if: $isMandyBannerEnabled) { id mandyBannerAction mandyImageUrl mandyBannerTitle mandyBannerDescription mandyBannerAction mandyBannerActionUrl } ... on NoOffersCard { emptyStateIconAsset { __typename ... on HostedIcon { url } } emptyStateTitle emptyStateMessage } ... on StandardOffersSection { sectionId sectionTitle items { __typename ...rewardsOfferFields } } ... on ProductOffersSection { sectionId sectionTitle sectionSubtitle endedOffersSectionSubtitle sectionCta { __typename ...contentCtaFields } items { __typename ...rewardsOfferFields } layout } ... on SpinSurpriseBanner @include(if: $isSpinSurpriseEnabled) { bannerId bannerAsset { assetType assetUrl assetWidth assetHeight fit } bannerActionUrl } ... on PersonalisedOffersBanner @include(if: $isPersonalisedOffersEnabled) { bannerId imageUrl title description status actionUrl: bannerActionUrl } ... on OfferFeedInlineBanner @include(if: $isAutoBoostFeatureEnabled) { inlineBannerId inlineBannerLeadingIcon { __typename ...iconAsset } inlineBannerTrailingIcon { __typename ...iconAsset } inlineBannerTitle inlineBannerDescription inlineBannerActionUrl showIsNewLabel dismissible } ... on RewardsCtaCard @include(if: $isAutoBoostFeatureEnabled) { id title actionUrl } }  fragment rewardsOfferFeedFields on OfferFeed { header { title summary { __typename ...contentCtaFields ... on RewardsSummaryText { text } } } errorMessage { title description primaryCta { __typename ...contentCtaFields } secondaryCta { __typename ...contentCtaFields } } message { icon title message } filters { id label offerIds message { icon title message } analytics { label } sectionConfigsFeed { __typename ... on OffersSectionConfig { sectionId showSectionTitle } ... on BannerSectionConfig { sectionId showBanner } } } sections { __typename ...OffersSectionsFragment } onLoadDeepLinkUrl eligibleForOnboardingBanner isAutoBoostEnabled }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivateOfferInFeedMutation)) {
            return false;
        }
        ActivateOfferInFeedMutation activateOfferInFeedMutation = (ActivateOfferInFeedMutation) obj;
        return Intrinsics.c(this.f20694a, activateOfferInFeedMutation.f20694a) && this.b == activateOfferInFeedMutation.b && this.c == activateOfferInFeedMutation.c && this.d == activateOfferInFeedMutation.d && this.e.equals(activateOfferInFeedMutation.e) && this.f.equals(activateOfferInFeedMutation.f) && this.g == activateOfferInFeedMutation.g && this.h == activateOfferInFeedMutation.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.b(this.f, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.b(this.e, b.e(b.e(b.e(b.e(this.f20694a.hashCode() * 31, 31, this.b), 31, true), 31, this.c), 31, this.d), 31), 31), 31, this.g);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "901f09f57c74769e9685af582229d4f4fad275533d8265feac1d0b187b25ed45";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "ActivateOfferInFeed";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("offerId");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f20694a);
        jsonWriter.F1("isShopAppInstalled");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        d.B(this.b, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isSpinSurpriseEnabled");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.TRUE);
        jsonWriter.F1("isPersonalisedOffersEnabled");
        d.B(this.c, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeDetails");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.d));
        jsonWriter.F1("isAutoBoostFeatureEnabled");
        Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, this.e);
        jsonWriter.F1("isOfferDetailsRefactorEnabled");
        Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, this.f);
        jsonWriter.F1("isMandyBannerEnabled");
        d.B(this.g, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isTigerNewOfferEnabled");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.h));
    }

    public final String toString() {
        StringBuilder sbQ = androidx.constraintlayout.core.state.a.q("ActivateOfferInFeedMutation(offerId=", this.f20694a, ", isShopAppInstalled=", ", isSpinSurpriseEnabled=true, isPersonalisedOffersEnabled=", this.b);
        au.com.woolworths.android.onesite.a.D(sbQ, this.c, ", includeDetails=", this.d, ", isAutoBoostFeatureEnabled=");
        sbQ.append(this.e);
        sbQ.append(", isOfferDetailsRefactorEnabled=");
        sbQ.append(this.f);
        sbQ.append(", isMandyBannerEnabled=");
        return au.com.woolworths.android.onesite.a.q(sbQ, this.g, ", isTigerNewOfferEnabled=", this.h, ")");
    }
}
