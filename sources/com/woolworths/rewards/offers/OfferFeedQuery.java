package com.woolworths.rewards.offers;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.offers.adapter.OfferFeedQuery_ResponseAdapter;
import com.woolworths.rewards.offers.fragment.RewardsOfferFeedFields;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/woolworths/rewards/offers/OfferFeedQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/rewards/offers/OfferFeedQuery$Data;", "Data", "RewardsHomePage", "Balance", "PointsBalance", "RewardsOfferFeed", "PersonalisedOffers", "OnAvailablePersonalisedOffers", "AvailableOffer", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class OfferFeedQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20718a;
    public final boolean b;
    public final Optional c = Optional.Absent.f13523a;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/OfferFeedQuery$AvailableOffer;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class AvailableOffer {

        /* renamed from: a, reason: collision with root package name */
        public final String f20719a;

        public AvailableOffer(String str) {
            this.f20719a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof AvailableOffer) && Intrinsics.c(this.f20719a, ((AvailableOffer) obj).f20719a);
        }

        public final int hashCode() {
            return this.f20719a.hashCode();
        }

        public final String toString() {
            return a.h("AvailableOffer(offerId=", this.f20719a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/OfferFeedQuery$Balance;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Balance {

        /* renamed from: a, reason: collision with root package name */
        public final PointsBalance f20720a;

        public Balance(PointsBalance pointsBalance) {
            this.f20720a = pointsBalance;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Balance) && Intrinsics.c(this.f20720a, ((Balance) obj).f20720a);
        }

        public final int hashCode() {
            return this.f20720a.hashCode();
        }

        public final String toString() {
            return "Balance(pointsBalance=" + this.f20720a + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/offers/OfferFeedQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/OfferFeedQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsHomePage f20721a;
        public final RewardsOfferFeed b;
        public final PersonalisedOffers c;

        public Data(RewardsHomePage rewardsHomePage, RewardsOfferFeed rewardsOfferFeed, PersonalisedOffers personalisedOffers) {
            this.f20721a = rewardsHomePage;
            this.b = rewardsOfferFeed;
            this.c = personalisedOffers;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return Intrinsics.c(this.f20721a, data.f20721a) && Intrinsics.c(this.b, data.b) && Intrinsics.c(this.c, data.c);
        }

        public final int hashCode() {
            RewardsHomePage rewardsHomePage = this.f20721a;
            int iHashCode = (rewardsHomePage == null ? 0 : rewardsHomePage.hashCode()) * 31;
            RewardsOfferFeed rewardsOfferFeed = this.b;
            return this.c.hashCode() + ((iHashCode + (rewardsOfferFeed != null ? rewardsOfferFeed.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return "Data(rewardsHomePage=" + this.f20721a + ", rewardsOfferFeed=" + this.b + ", personalisedOffers=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/OfferFeedQuery$OnAvailablePersonalisedOffers;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnAvailablePersonalisedOffers {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f20722a;
        public final boolean b;
        public final boolean c;

        public OnAvailablePersonalisedOffers(ArrayList arrayList, boolean z, boolean z2) {
            this.f20722a = arrayList;
            this.b = z;
            this.c = z2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnAvailablePersonalisedOffers)) {
                return false;
            }
            OnAvailablePersonalisedOffers onAvailablePersonalisedOffers = (OnAvailablePersonalisedOffers) obj;
            return this.f20722a.equals(onAvailablePersonalisedOffers.f20722a) && this.b == onAvailablePersonalisedOffers.b && this.c == onAvailablePersonalisedOffers.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + b.e(this.f20722a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnAvailablePersonalisedOffers(availableOffers=");
            sb.append(this.f20722a);
            sb.append(", hasBoostedOffers=");
            sb.append(this.b);
            sb.append(", swapEnabled=");
            return a.k(")", sb, this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/OfferFeedQuery$PersonalisedOffers;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PersonalisedOffers {

        /* renamed from: a, reason: collision with root package name */
        public final String f20723a;
        public final OnAvailablePersonalisedOffers b;

        public PersonalisedOffers(String __typename, OnAvailablePersonalisedOffers onAvailablePersonalisedOffers) {
            Intrinsics.h(__typename, "__typename");
            this.f20723a = __typename;
            this.b = onAvailablePersonalisedOffers;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PersonalisedOffers)) {
                return false;
            }
            PersonalisedOffers personalisedOffers = (PersonalisedOffers) obj;
            return Intrinsics.c(this.f20723a, personalisedOffers.f20723a) && Intrinsics.c(this.b, personalisedOffers.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20723a.hashCode() * 31;
            OnAvailablePersonalisedOffers onAvailablePersonalisedOffers = this.b;
            return iHashCode + (onAvailablePersonalisedOffers == null ? 0 : onAvailablePersonalisedOffers.hashCode());
        }

        public final String toString() {
            return "PersonalisedOffers(__typename=" + this.f20723a + ", onAvailablePersonalisedOffers=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/OfferFeedQuery$PointsBalance;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PointsBalance {

        /* renamed from: a, reason: collision with root package name */
        public final int f20724a;
        public final Integer b;
        public final double c;
        public final String d;
        public final Boolean e;
        public final String f;

        public PointsBalance(int i, Integer num, double d, String str, Boolean bool, String str2) {
            this.f20724a = i;
            this.b = num;
            this.c = d;
            this.d = str;
            this.e = bool;
            this.f = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PointsBalance)) {
                return false;
            }
            PointsBalance pointsBalance = (PointsBalance) obj;
            return this.f20724a == pointsBalance.f20724a && Intrinsics.c(this.b, pointsBalance.b) && Double.compare(this.c, pointsBalance.c) == 0 && Intrinsics.c(this.d, pointsBalance.d) && Intrinsics.c(this.e, pointsBalance.e) && Intrinsics.c(this.f, pointsBalance.f);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.f20724a) * 31;
            Integer num = this.b;
            int iC = b.c(android.support.v4.media.session.a.a(this.c, (iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31, this.d);
            Boolean bool = this.e;
            int iHashCode2 = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
            String str = this.f;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            return "PointsBalance(pointsBalance=" + this.f20724a + ", creditsBalance=" + this.b + ", redemptionPercentage=" + this.c + ", displayMessage=" + this.d + ", showStatusMark=" + this.e + ", statusMarkUrl=" + this.f + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/OfferFeedQuery$RewardsHomePage;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsHomePage {

        /* renamed from: a, reason: collision with root package name */
        public final Balance f20725a;

        public RewardsHomePage(Balance balance) {
            this.f20725a = balance;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof RewardsHomePage) && Intrinsics.c(this.f20725a, ((RewardsHomePage) obj).f20725a);
        }

        public final int hashCode() {
            return this.f20725a.f20720a.hashCode();
        }

        public final String toString() {
            return "RewardsHomePage(balance=" + this.f20725a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/OfferFeedQuery$RewardsOfferFeed;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsOfferFeed {

        /* renamed from: a, reason: collision with root package name */
        public final String f20726a;
        public final RewardsOfferFeedFields b;

        public RewardsOfferFeed(String str, RewardsOfferFeedFields rewardsOfferFeedFields) {
            this.f20726a = str;
            this.b = rewardsOfferFeedFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RewardsOfferFeed)) {
                return false;
            }
            RewardsOfferFeed rewardsOfferFeed = (RewardsOfferFeed) obj;
            return Intrinsics.c(this.f20726a, rewardsOfferFeed.f20726a) && Intrinsics.c(this.b, rewardsOfferFeed.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20726a.hashCode() * 31);
        }

        public final String toString() {
            return "RewardsOfferFeed(__typename=" + this.f20726a + ", rewardsOfferFeedFields=" + this.b + ")";
        }
    }

    public OfferFeedQuery(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f20718a = z;
        this.b = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(OfferFeedQuery_ResponseAdapter.Data.f20759a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query OfferFeed($isShopAppInstalled: Boolean!, $isSpinSurpriseEnabled: Boolean!, $isPersonalisedOffersEnabled: Boolean!, $isEverydayExtraHomeTabEnabled: Boolean!, $includeDetails: Boolean! = false , $isAutoBoostFeatureEnabled: Boolean!, $isOfferDetailsRefactorEnabled: Boolean!, $isMandyBannerEnabled: Boolean!, $isTigerNewOfferEnabled: Boolean!) { rewardsHomePage { balance { pointsBalance { pointsBalance creditsBalance redemptionPercentage displayMessage showStatusMark statusMarkUrl } } } rewardsOfferFeed(isShopAppInstalled: $isShopAppInstalled, isEverydayExtraHomeTabEnabled: $isEverydayExtraHomeTabEnabled, isAutoBoostFeatureEnabled: $isAutoBoostFeatureEnabled) { __typename ...rewardsOfferFeedFields } personalisedOffers(filter: AVAILABLE) { __typename ... on AvailablePersonalisedOffers { availableOffers: offers { offerId } hasBoostedOffers swapEnabled } } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment contentCtaFields on ContentCta { label url isExternalUrl onCtaClickAnalytics { __typename ...analyticsFields } }  fragment standardBannerFields on StandardBanner { bannerId bannerTitle bannerImageUrl bannerDescription bannerActionUrl bannerActionLabel bannerActionAccessibilityHint }  fragment iconAsset on IconAsset { __typename ... on LocalAsset { iconName } ... on HostedIcon { url } ... on CoreIcon { coreIconName coreWebIconName } }  fragment rewardsOfferFields on RewardsOffer { offerId image bannerUrl standardBanner @include(if: $includeDetails) { __typename ...standardBannerFields } boostedOfferInsetBanner { displayType message title iconUrl action { placement type label url actionAccessibilityHint } } title subtitle summary body formattedTermsAndConditions markdownTermsAndConditions displayStatus offerStatus mechanics @include(if: $includeDetails) { displayLastUpdated separator selectedIndex items { icon caption altText title } } displayExpiry displayExpiryExtended statusIcons @skip(if: $isOfferDetailsRefactorEnabled) { icon } offerAnalytics { offerName commId uoid campaignCode campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode rtlCouponStart profile } activationAnimation displayAnimation activationMessage { title message buttonLabel } brandLogoUrl brandLogoUrlCompact roundel @include(if: $isTigerNewOfferEnabled) { __typename ...iconAsset } offerListCta { cta { label url isExternalUrl } displayStatus } offerDetailsCta @include(if: $includeDetails) { cta { label url isExternalUrl } displayStatus } offerTileProgressTracker @include(if: $isOfferDetailsRefactorEnabled) { title titleSuffix description circularProgressIndicator { primaryRing { ringPercent ringColor } } } offerTileAltText @include(if: $isOfferDetailsRefactorEnabled) }  fragment OffersSectionsFragment on OffersSections { __typename ... on StandardBanner { __typename ...standardBannerFields } ... on MandyBanner @include(if: $isMandyBannerEnabled) { id mandyBannerAction mandyImageUrl mandyBannerTitle mandyBannerDescription mandyBannerAction mandyBannerActionUrl } ... on NoOffersCard { emptyStateIconAsset { __typename ... on HostedIcon { url } } emptyStateTitle emptyStateMessage } ... on StandardOffersSection { sectionId sectionTitle items { __typename ...rewardsOfferFields } } ... on ProductOffersSection { sectionId sectionTitle sectionSubtitle endedOffersSectionSubtitle sectionCta { __typename ...contentCtaFields } items { __typename ...rewardsOfferFields } layout } ... on SpinSurpriseBanner @include(if: $isSpinSurpriseEnabled) { bannerId bannerAsset { assetType assetUrl assetWidth assetHeight fit } bannerActionUrl } ... on PersonalisedOffersBanner @include(if: $isPersonalisedOffersEnabled) { bannerId imageUrl title description status actionUrl: bannerActionUrl } ... on OfferFeedInlineBanner @include(if: $isAutoBoostFeatureEnabled) { inlineBannerId inlineBannerLeadingIcon { __typename ...iconAsset } inlineBannerTrailingIcon { __typename ...iconAsset } inlineBannerTitle inlineBannerDescription inlineBannerActionUrl showIsNewLabel dismissible } ... on RewardsCtaCard @include(if: $isAutoBoostFeatureEnabled) { id title actionUrl } }  fragment rewardsOfferFeedFields on OfferFeed { header { title summary { __typename ...contentCtaFields ... on RewardsSummaryText { text } } } errorMessage { title description primaryCta { __typename ...contentCtaFields } secondaryCta { __typename ...contentCtaFields } } message { icon title message } filters { id label offerIds message { icon title message } analytics { label } sectionConfigsFeed { __typename ... on OffersSectionConfig { sectionId showSectionTitle } ... on BannerSectionConfig { sectionId showBanner } } } sections { __typename ...OffersSectionsFragment } onLoadDeepLinkUrl eligibleForOnboardingBanner isAutoBoostEnabled }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferFeedQuery)) {
            return false;
        }
        OfferFeedQuery offerFeedQuery = (OfferFeedQuery) obj;
        return this.f20718a == offerFeedQuery.f20718a && this.b == offerFeedQuery.b && this.c.equals(offerFeedQuery.c) && this.d == offerFeedQuery.d && this.e == offerFeedQuery.e && this.f == offerFeedQuery.f && this.g == offerFeedQuery.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + b.e(b.e(b.e(au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.c(this.c, b.e(b.e(b.e(Boolean.hashCode(this.f20718a) * 31, 31, true), 31, this.b), 31, true), 31), 31, this.d), 31, this.e), 31, this.f);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "103cb7f4191bf89e20131cda18f622923d730ac8a618e3fc9979da0771219605";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "OfferFeed";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("isShopAppInstalled");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        d.B(this.f20718a, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isSpinSurpriseEnabled");
        Boolean bool = Boolean.TRUE;
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, bool);
        jsonWriter.F1("isPersonalisedOffersEnabled");
        d.B(this.b, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isEverydayExtraHomeTabEnabled");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, bool);
        Optional optional = this.c;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("includeDetails");
            Adapters.d(adapters$BooleanAdapter$1).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        } else if (z) {
            jsonWriter.F1("includeDetails");
            Adapters.m.toJson(jsonWriter, customScalarAdapters, Boolean.FALSE);
        }
        jsonWriter.F1("isAutoBoostFeatureEnabled");
        d.B(this.d, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isOfferDetailsRefactorEnabled");
        d.B(this.e, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isMandyBannerEnabled");
        d.B(this.f, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isTigerNewOfferEnabled");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.g));
    }

    public final String toString() {
        StringBuilder sbV = b.v("OfferFeedQuery(isShopAppInstalled=", ", isSpinSurpriseEnabled=true, isPersonalisedOffersEnabled=", ", isEverydayExtraHomeTabEnabled=true, includeDetails=", this.f20718a, this.b);
        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.y(sbV, this.c, ", isAutoBoostFeatureEnabled=", this.d, ", isOfferDetailsRefactorEnabled=");
        au.com.woolworths.android.onesite.a.D(sbV, this.e, ", isMandyBannerEnabled=", this.f, ", isTigerNewOfferEnabled=");
        return a.k(")", sbV, this.g);
    }
}
