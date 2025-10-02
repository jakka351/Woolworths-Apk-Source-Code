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
import com.woolworths.rewards.offers.adapter.ActivateSectionInFeedMutation_ResponseAdapter;
import com.woolworths.rewards.offers.fragment.RewardsOfferFeedFields;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/woolworths/rewards/offers/ActivateSectionInFeedMutation;", "Lcom/apollographql/apollo/api/Mutation;", "Lcom/woolworths/rewards/offers/ActivateSectionInFeedMutation$Data;", "Data", "ActivateAllOffersInFeed", "OfferFeed", "ActivationDetails", "OnActivationDetailsError", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ActivateSectionInFeedMutation implements Mutation<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f20700a;
    public final boolean b;
    public final boolean c;
    public final Optional d;
    public final Optional e;
    public final Optional f;
    public final boolean g;
    public final boolean h;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/ActivateSectionInFeedMutation$ActivateAllOffersInFeed;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActivateAllOffersInFeed {

        /* renamed from: a, reason: collision with root package name */
        public final OfferFeed f20701a;
        public final ArrayList b;
        public final ActivationDetails c;

        public ActivateAllOffersInFeed(OfferFeed offerFeed, ArrayList arrayList, ActivationDetails activationDetails) {
            this.f20701a = offerFeed;
            this.b = arrayList;
            this.c = activationDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActivateAllOffersInFeed)) {
                return false;
            }
            ActivateAllOffersInFeed activateAllOffersInFeed = (ActivateAllOffersInFeed) obj;
            return this.f20701a.equals(activateAllOffersInFeed.f20701a) && this.b.equals(activateAllOffersInFeed.b) && Intrinsics.c(this.c, activateAllOffersInFeed.c);
        }

        public final int hashCode() {
            int iB = a.b(this.f20701a.hashCode() * 31, 31, this.b);
            ActivationDetails activationDetails = this.c;
            return iB + (activationDetails == null ? 0 : activationDetails.hashCode());
        }

        public final String toString() {
            return "ActivateAllOffersInFeed(offerFeed=" + this.f20701a + ", activatedOfferIds=" + this.b + ", activationDetails=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/ActivateSectionInFeedMutation$ActivationDetails;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActivationDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f20702a;
        public final OnActivationDetailsError b;

        public ActivationDetails(String __typename, OnActivationDetailsError onActivationDetailsError) {
            Intrinsics.h(__typename, "__typename");
            this.f20702a = __typename;
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
            return Intrinsics.c(this.f20702a, activationDetails.f20702a) && Intrinsics.c(this.b, activationDetails.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20702a.hashCode() * 31;
            OnActivationDetailsError onActivationDetailsError = this.b;
            return iHashCode + (onActivationDetailsError == null ? 0 : onActivationDetailsError.f20705a.hashCode());
        }

        public final String toString() {
            return "ActivationDetails(__typename=" + this.f20702a + ", onActivationDetailsError=" + this.b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/offers/ActivateSectionInFeedMutation$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/ActivateSectionInFeedMutation$Data;", "Lcom/apollographql/apollo/api/Mutation$Data;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Mutation.Data {

        /* renamed from: a, reason: collision with root package name */
        public final ActivateAllOffersInFeed f20703a;

        public Data(ActivateAllOffersInFeed activateAllOffersInFeed) {
            this.f20703a = activateAllOffersInFeed;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20703a, ((Data) obj).f20703a);
        }

        public final int hashCode() {
            ActivateAllOffersInFeed activateAllOffersInFeed = this.f20703a;
            if (activateAllOffersInFeed == null) {
                return 0;
            }
            return activateAllOffersInFeed.hashCode();
        }

        public final String toString() {
            return "Data(activateAllOffersInFeed=" + this.f20703a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/ActivateSectionInFeedMutation$OfferFeed;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferFeed {

        /* renamed from: a, reason: collision with root package name */
        public final String f20704a;
        public final RewardsOfferFeedFields b;

        public OfferFeed(String str, RewardsOfferFeedFields rewardsOfferFeedFields) {
            this.f20704a = str;
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
            return Intrinsics.c(this.f20704a, offerFeed.f20704a) && Intrinsics.c(this.b, offerFeed.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20704a.hashCode() * 31);
        }

        public final String toString() {
            return "OfferFeed(__typename=" + this.f20704a + ", rewardsOfferFeedFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/ActivateSectionInFeedMutation$OnActivationDetailsError;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnActivationDetailsError {

        /* renamed from: a, reason: collision with root package name */
        public final String f20705a;

        public OnActivationDetailsError(String str) {
            this.f20705a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnActivationDetailsError) && Intrinsics.c(this.f20705a, ((OnActivationDetailsError) obj).f20705a);
        }

        public final int hashCode() {
            return this.f20705a.hashCode();
        }

        public final String toString() {
            return YU.a.h("OnActivationDetailsError(errorMessage=", this.f20705a, ")");
        }
    }

    public ActivateSectionInFeedMutation(String sectionId, boolean z, boolean z2, Optional.Present present, boolean z3, boolean z4) {
        Intrinsics.h(sectionId, "sectionId");
        this.f20700a = sectionId;
        this.b = z;
        this.c = z2;
        Optional.Absent absent = Optional.Absent.f13523a;
        this.d = absent;
        this.e = absent;
        this.f = present;
        this.g = z3;
        this.h = z4;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(ActivateSectionInFeedMutation_ResponseAdapter.Data.f20745a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "mutation ActivateSectionInFeed($sectionId: ID!, $isShopAppInstalled: Boolean!, $isSpinSurpriseEnabled: Boolean!, $isPersonalisedOffersEnabled: Boolean!, $includeDetails: Boolean! = false , $isAutoBoostFeatureEnabled: Boolean! = false , $isOfferDetailsRefactorEnabled: Boolean! = false , $isMandyBannerEnabled: Boolean!, $isTigerNewOfferEnabled: Boolean!) { activateAllOffersInFeed(sectionId: $sectionId, isShopAppInstalled: $isShopAppInstalled) { offerFeed { __typename ...rewardsOfferFeedFields } activatedOfferIds activationDetails { __typename ... on ActivationDetailsError { errorMessage } } } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment contentCtaFields on ContentCta { label url isExternalUrl onCtaClickAnalytics { __typename ...analyticsFields } }  fragment standardBannerFields on StandardBanner { bannerId bannerTitle bannerImageUrl bannerDescription bannerActionUrl bannerActionLabel bannerActionAccessibilityHint }  fragment iconAsset on IconAsset { __typename ... on LocalAsset { iconName } ... on HostedIcon { url } ... on CoreIcon { coreIconName coreWebIconName } }  fragment rewardsOfferFields on RewardsOffer { offerId image bannerUrl standardBanner @include(if: $includeDetails) { __typename ...standardBannerFields } boostedOfferInsetBanner { displayType message title iconUrl action { placement type label url actionAccessibilityHint } } title subtitle summary body formattedTermsAndConditions markdownTermsAndConditions displayStatus offerStatus mechanics @include(if: $includeDetails) { displayLastUpdated separator selectedIndex items { icon caption altText title } } displayExpiry displayExpiryExtended statusIcons @skip(if: $isOfferDetailsRefactorEnabled) { icon } offerAnalytics { offerName commId uoid campaignCode campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode rtlCouponStart profile } activationAnimation displayAnimation activationMessage { title message buttonLabel } brandLogoUrl brandLogoUrlCompact roundel @include(if: $isTigerNewOfferEnabled) { __typename ...iconAsset } offerListCta { cta { label url isExternalUrl } displayStatus } offerDetailsCta @include(if: $includeDetails) { cta { label url isExternalUrl } displayStatus } offerTileProgressTracker @include(if: $isOfferDetailsRefactorEnabled) { title titleSuffix description circularProgressIndicator { primaryRing { ringPercent ringColor } } } offerTileAltText @include(if: $isOfferDetailsRefactorEnabled) }  fragment OffersSectionsFragment on OffersSections { __typename ... on StandardBanner { __typename ...standardBannerFields } ... on MandyBanner @include(if: $isMandyBannerEnabled) { id mandyBannerAction mandyImageUrl mandyBannerTitle mandyBannerDescription mandyBannerAction mandyBannerActionUrl } ... on NoOffersCard { emptyStateIconAsset { __typename ... on HostedIcon { url } } emptyStateTitle emptyStateMessage } ... on StandardOffersSection { sectionId sectionTitle items { __typename ...rewardsOfferFields } } ... on ProductOffersSection { sectionId sectionTitle sectionSubtitle endedOffersSectionSubtitle sectionCta { __typename ...contentCtaFields } items { __typename ...rewardsOfferFields } layout } ... on SpinSurpriseBanner @include(if: $isSpinSurpriseEnabled) { bannerId bannerAsset { assetType assetUrl assetWidth assetHeight fit } bannerActionUrl } ... on PersonalisedOffersBanner @include(if: $isPersonalisedOffersEnabled) { bannerId imageUrl title description status actionUrl: bannerActionUrl } ... on OfferFeedInlineBanner @include(if: $isAutoBoostFeatureEnabled) { inlineBannerId inlineBannerLeadingIcon { __typename ...iconAsset } inlineBannerTrailingIcon { __typename ...iconAsset } inlineBannerTitle inlineBannerDescription inlineBannerActionUrl showIsNewLabel dismissible } ... on RewardsCtaCard @include(if: $isAutoBoostFeatureEnabled) { id title actionUrl } }  fragment rewardsOfferFeedFields on OfferFeed { header { title summary { __typename ...contentCtaFields ... on RewardsSummaryText { text } } } errorMessage { title description primaryCta { __typename ...contentCtaFields } secondaryCta { __typename ...contentCtaFields } } message { icon title message } filters { id label offerIds message { icon title message } analytics { label } sectionConfigsFeed { __typename ... on OffersSectionConfig { sectionId showSectionTitle } ... on BannerSectionConfig { sectionId showBanner } } } sections { __typename ...OffersSectionsFragment } onLoadDeepLinkUrl eligibleForOnboardingBanner isAutoBoostEnabled }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActivateSectionInFeedMutation)) {
            return false;
        }
        ActivateSectionInFeedMutation activateSectionInFeedMutation = (ActivateSectionInFeedMutation) obj;
        return Intrinsics.c(this.f20700a, activateSectionInFeedMutation.f20700a) && this.b == activateSectionInFeedMutation.b && this.c == activateSectionInFeedMutation.c && this.d.equals(activateSectionInFeedMutation.d) && this.e.equals(activateSectionInFeedMutation.e) && this.f.equals(activateSectionInFeedMutation.f) && this.g == activateSectionInFeedMutation.g && this.h == activateSectionInFeedMutation.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.f, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.e, au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.d, b.e(b.e(b.e(this.f20700a.hashCode() * 31, 31, this.b), 31, true), 31, this.c), 31), 31), 31), 31, this.g);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "99a14bff2094aa56d07c116014576229404e74b7b7e2d90db5ee9071a80a70bc";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "ActivateSectionInFeed";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("sectionId");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f20700a);
        jsonWriter.F1("isShopAppInstalled");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        d.B(this.b, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isSpinSurpriseEnabled");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.TRUE);
        jsonWriter.F1("isPersonalisedOffersEnabled");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.c));
        Optional optional = this.d;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("includeDetails");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        } else if (z) {
            jsonWriter.F1("includeDetails");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional2 = this.e;
        if (optional2 instanceof Optional.Present) {
            jsonWriter.F1("isAutoBoostFeatureEnabled");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional2);
        } else if (z) {
            jsonWriter.F1("isAutoBoostFeatureEnabled");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        Optional optional3 = this.f;
        if (optional3 instanceof Optional.Present) {
            jsonWriter.F1("isOfferDetailsRefactorEnabled");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional3);
        } else if (z) {
            jsonWriter.F1("isOfferDetailsRefactorEnabled");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        jsonWriter.F1("isMandyBannerEnabled");
        d.B(this.g, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isTigerNewOfferEnabled");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.h));
    }

    public final String toString() {
        StringBuilder sbQ = androidx.constraintlayout.core.state.a.q("ActivateSectionInFeedMutation(sectionId=", this.f20700a, ", isShopAppInstalled=", ", isSpinSurpriseEnabled=true, isPersonalisedOffersEnabled=", this.b);
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.z(sbQ, this.c, ", includeDetails=", this.d, ", isAutoBoostFeatureEnabled=");
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.x(sbQ, this.e, ", isOfferDetailsRefactorEnabled=", this.f, ", isMandyBannerEnabled=");
        return au.com.woolworths.android.onesite.a.q(sbQ, this.g, ", isTigerNewOfferEnabled=", this.h, ")");
    }
}
