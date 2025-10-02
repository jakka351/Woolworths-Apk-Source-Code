package com.woolworths.rewards.offers;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.offers.adapter.HomeOfferFeedQuery_ResponseAdapter;
import com.woolworths.rewards.offers.fragment.RewardsHomeOfferFeedFields;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/offers/HomeOfferFeedQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/rewards/offers/HomeOfferFeedQuery$Data;", "Data", "RewardsOfferFeed", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class HomeOfferFeedQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20706a;
    public final Optional b = Optional.Absent.f13523a;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/offers/HomeOfferFeedQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/HomeOfferFeedQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsOfferFeed f20707a;

        public Data(RewardsOfferFeed rewardsOfferFeed) {
            this.f20707a = rewardsOfferFeed;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20707a, ((Data) obj).f20707a);
        }

        public final int hashCode() {
            RewardsOfferFeed rewardsOfferFeed = this.f20707a;
            if (rewardsOfferFeed == null) {
                return 0;
            }
            return rewardsOfferFeed.hashCode();
        }

        public final String toString() {
            return "Data(rewardsOfferFeed=" + this.f20707a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/HomeOfferFeedQuery$RewardsOfferFeed;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsOfferFeed {

        /* renamed from: a, reason: collision with root package name */
        public final String f20708a;
        public final RewardsHomeOfferFeedFields b;

        public RewardsOfferFeed(String str, RewardsHomeOfferFeedFields rewardsHomeOfferFeedFields) {
            this.f20708a = str;
            this.b = rewardsHomeOfferFeedFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RewardsOfferFeed)) {
                return false;
            }
            RewardsOfferFeed rewardsOfferFeed = (RewardsOfferFeed) obj;
            return Intrinsics.c(this.f20708a, rewardsOfferFeed.f20708a) && Intrinsics.c(this.b, rewardsOfferFeed.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20708a.hashCode() * 31);
        }

        public final String toString() {
            return "RewardsOfferFeed(__typename=" + this.f20708a + ", rewardsHomeOfferFeedFields=" + this.b + ")";
        }
    }

    public HomeOfferFeedQuery(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f20706a = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(HomeOfferFeedQuery_ResponseAdapter.Data.f20748a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query HomeOfferFeed($isShopAppInstalled: Boolean!, $isSpinSurpriseEnabled: Boolean!, $isPersonalisedOffersEnabled: Boolean!, $isEverydayExtraHomeTabEnabled: Boolean!, $includeDetails: Boolean! = false , $isAutoBoostFeatureEnabled: Boolean!, $isOfferDetailsRefactorEnabled: Boolean!, $isMandyBannerEnabled: Boolean!, $isTigerNewOfferEnabled: Boolean!) { rewardsOfferFeed(isShopAppInstalled: $isShopAppInstalled, isEverydayExtraHomeTabEnabled: $isEverydayExtraHomeTabEnabled, isAutoBoostFeatureEnabled: $isAutoBoostFeatureEnabled) { __typename ...rewardsHomeOfferFeedFields } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment contentCtaFields on ContentCta { label url isExternalUrl onCtaClickAnalytics { __typename ...analyticsFields } }  fragment standardBannerFields on StandardBanner { bannerId bannerTitle bannerImageUrl bannerDescription bannerActionUrl bannerActionLabel bannerActionAccessibilityHint }  fragment iconAsset on IconAsset { __typename ... on LocalAsset { iconName } ... on HostedIcon { url } ... on CoreIcon { coreIconName coreWebIconName } }  fragment rewardsOfferFields on RewardsOffer { offerId image bannerUrl standardBanner @include(if: $includeDetails) { __typename ...standardBannerFields } boostedOfferInsetBanner { displayType message title iconUrl action { placement type label url actionAccessibilityHint } } title subtitle summary body formattedTermsAndConditions markdownTermsAndConditions displayStatus offerStatus mechanics @include(if: $includeDetails) { displayLastUpdated separator selectedIndex items { icon caption altText title } } displayExpiry displayExpiryExtended statusIcons @skip(if: $isOfferDetailsRefactorEnabled) { icon } offerAnalytics { offerName commId uoid campaignCode campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode rtlCouponStart profile } activationAnimation displayAnimation activationMessage { title message buttonLabel } brandLogoUrl brandLogoUrlCompact roundel @include(if: $isTigerNewOfferEnabled) { __typename ...iconAsset } offerListCta { cta { label url isExternalUrl } displayStatus } offerDetailsCta @include(if: $includeDetails) { cta { label url isExternalUrl } displayStatus } offerTileProgressTracker @include(if: $isOfferDetailsRefactorEnabled) { title titleSuffix description circularProgressIndicator { primaryRing { ringPercent ringColor } } } offerTileAltText @include(if: $isOfferDetailsRefactorEnabled) }  fragment OffersSectionsFragment on OffersSections { __typename ... on StandardBanner { __typename ...standardBannerFields } ... on MandyBanner @include(if: $isMandyBannerEnabled) { id mandyBannerAction mandyImageUrl mandyBannerTitle mandyBannerDescription mandyBannerAction mandyBannerActionUrl } ... on NoOffersCard { emptyStateIconAsset { __typename ... on HostedIcon { url } } emptyStateTitle emptyStateMessage } ... on StandardOffersSection { sectionId sectionTitle items { __typename ...rewardsOfferFields } } ... on ProductOffersSection { sectionId sectionTitle sectionSubtitle endedOffersSectionSubtitle sectionCta { __typename ...contentCtaFields } items { __typename ...rewardsOfferFields } layout } ... on SpinSurpriseBanner @include(if: $isSpinSurpriseEnabled) { bannerId bannerAsset { assetType assetUrl assetWidth assetHeight fit } bannerActionUrl } ... on PersonalisedOffersBanner @include(if: $isPersonalisedOffersEnabled) { bannerId imageUrl title description status actionUrl: bannerActionUrl } ... on OfferFeedInlineBanner @include(if: $isAutoBoostFeatureEnabled) { inlineBannerId inlineBannerLeadingIcon { __typename ...iconAsset } inlineBannerTrailingIcon { __typename ...iconAsset } inlineBannerTitle inlineBannerDescription inlineBannerActionUrl showIsNewLabel dismissible } ... on RewardsCtaCard @include(if: $isAutoBoostFeatureEnabled) { id title actionUrl } }  fragment rewardsHomeOfferFeedFields on OfferFeed { header { title summary { __typename ...contentCtaFields ... on RewardsSummaryText { text } } } errorMessage { title description primaryCta { __typename ...contentCtaFields } secondaryCta { __typename ...contentCtaFields } } sections { __typename ...OffersSectionsFragment } onLoadDeepLinkUrl eligibleForOnboardingBanner isAutoBoostEnabled }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeOfferFeedQuery)) {
            return false;
        }
        HomeOfferFeedQuery homeOfferFeedQuery = (HomeOfferFeedQuery) obj;
        return this.f20706a == homeOfferFeedQuery.f20706a && this.b.equals(homeOfferFeedQuery.b) && this.c == homeOfferFeedQuery.c && this.d == homeOfferFeedQuery.d && this.e == homeOfferFeedQuery.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + b.e(b.e(b.e(a.c(this.b, b.e(b.e(b.e(Boolean.hashCode(this.f20706a) * 31, 31, true), 31, false), 31, true), 31), 31, true), 31, this.c), 31, this.d);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "0dd907fb8672240dd06b63c94ffc554cee80a0a8fbe91510997463eb04d21c0a";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "HomeOfferFeed";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("isShopAppInstalled");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        d.B(this.f20706a, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isSpinSurpriseEnabled");
        Boolean bool = Boolean.TRUE;
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, bool);
        jsonWriter.F1("isPersonalisedOffersEnabled");
        Boolean bool2 = Boolean.FALSE;
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, bool2);
        jsonWriter.F1("isEverydayExtraHomeTabEnabled");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, bool);
        Optional optional = this.b;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("includeDetails");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        } else if (z) {
            jsonWriter.F1("includeDetails");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, bool2);
        }
        jsonWriter.F1("isAutoBoostFeatureEnabled");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, bool);
        jsonWriter.F1("isOfferDetailsRefactorEnabled");
        d.B(this.c, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isMandyBannerEnabled");
        d.B(this.d, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isTigerNewOfferEnabled");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.e));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeOfferFeedQuery(isShopAppInstalled=");
        sb.append(this.f20706a);
        sb.append(", isSpinSurpriseEnabled=true, isPersonalisedOffersEnabled=false, isEverydayExtraHomeTabEnabled=true, includeDetails=");
        sb.append(this.b);
        sb.append(", isAutoBoostFeatureEnabled=true, isOfferDetailsRefactorEnabled=");
        au.com.woolworths.android.onesite.a.D(sb, this.c, ", isMandyBannerEnabled=", this.d, ", isTigerNewOfferEnabled=");
        return YU.a.k(")", sb, this.e);
    }
}
