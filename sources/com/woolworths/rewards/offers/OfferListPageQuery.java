package com.woolworths.rewards.offers;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.dynamic.page.ui.content.d;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.Adapters$BooleanAdapter$1;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.offers.adapter.OfferListPageQuery_ResponseAdapter;
import com.woolworths.rewards.offers.fragment.fragment.OffersSectionsFragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/woolworths/rewards/offers/OfferListPageQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/rewards/offers/OfferListPageQuery$Data;", "Data", "RewardsOffersListPage", "OnRewardsOffersSection", "Section", "Footer", "Cta", "OnRewardsEmptyPage", "State", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class OfferListPageQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f20727a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/offers/OfferListPageQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/OfferListPageQuery$Cta;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cta {

        /* renamed from: a, reason: collision with root package name */
        public final Boolean f20728a;
        public final String b;
        public final String c;

        public Cta(Boolean bool, String str, String str2) {
            this.f20728a = bool;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cta)) {
                return false;
            }
            Cta cta = (Cta) obj;
            return Intrinsics.c(this.f20728a, cta.f20728a) && Intrinsics.c(this.b, cta.b) && Intrinsics.c(this.c, cta.c);
        }

        public final int hashCode() {
            Boolean bool = this.f20728a;
            int iC = b.c((bool == null ? 0 : bool.hashCode()) * 31, 31, this.b);
            String str = this.c;
            return iC + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Cta(isExternalUrl=");
            sb.append(this.f20728a);
            sb.append(", label=");
            sb.append(this.b);
            sb.append(", url=");
            return a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/OfferListPageQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsOffersListPage f20729a;

        public Data(RewardsOffersListPage rewardsOffersListPage) {
            this.f20729a = rewardsOffersListPage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20729a, ((Data) obj).f20729a);
        }

        public final int hashCode() {
            RewardsOffersListPage rewardsOffersListPage = this.f20729a;
            if (rewardsOffersListPage == null) {
                return 0;
            }
            return rewardsOffersListPage.hashCode();
        }

        public final String toString() {
            return "Data(rewardsOffersListPage=" + this.f20729a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/OfferListPageQuery$Footer;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Footer {

        /* renamed from: a, reason: collision with root package name */
        public final Cta f20730a;
        public final String b;

        public Footer(Cta cta, String str) {
            this.f20730a = cta;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) obj;
            return Intrinsics.c(this.f20730a, footer.f20730a) && Intrinsics.c(this.b, footer.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20730a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "Footer(cta=" + this.f20730a + ", title=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/OfferListPageQuery$OnRewardsEmptyPage;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRewardsEmptyPage {

        /* renamed from: a, reason: collision with root package name */
        public final String f20731a;
        public final State b;

        public OnRewardsEmptyPage(String str, State state) {
            this.f20731a = str;
            this.b = state;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnRewardsEmptyPage)) {
                return false;
            }
            OnRewardsEmptyPage onRewardsEmptyPage = (OnRewardsEmptyPage) obj;
            return Intrinsics.c(this.f20731a, onRewardsEmptyPage.f20731a) && Intrinsics.c(this.b, onRewardsEmptyPage.b);
        }

        public final int hashCode() {
            String str = this.f20731a;
            return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        public final String toString() {
            return "OnRewardsEmptyPage(navigationTitle=" + this.f20731a + ", state=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/OfferListPageQuery$OnRewardsOffersSection;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRewardsOffersSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f20732a;
        public final ArrayList b;
        public final Footer c;

        public OnRewardsOffersSection(String str, ArrayList arrayList, Footer footer) {
            this.f20732a = str;
            this.b = arrayList;
            this.c = footer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnRewardsOffersSection)) {
                return false;
            }
            OnRewardsOffersSection onRewardsOffersSection = (OnRewardsOffersSection) obj;
            return Intrinsics.c(this.f20732a, onRewardsOffersSection.f20732a) && this.b.equals(onRewardsOffersSection.b) && Intrinsics.c(this.c, onRewardsOffersSection.c);
        }

        public final int hashCode() {
            String str = this.f20732a;
            int iB = androidx.compose.ui.input.pointer.a.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
            Footer footer = this.c;
            return iB + (footer != null ? footer.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbX = d.x("OnRewardsOffersSection(navigationTitle=", this.f20732a, ", sections=", ", footer=", this.b);
            sbX.append(this.c);
            sbX.append(")");
            return sbX.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/OfferListPageQuery$RewardsOffersListPage;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsOffersListPage {

        /* renamed from: a, reason: collision with root package name */
        public final String f20733a;
        public final OnRewardsOffersSection b;
        public final OnRewardsEmptyPage c;

        public RewardsOffersListPage(String __typename, OnRewardsOffersSection onRewardsOffersSection, OnRewardsEmptyPage onRewardsEmptyPage) {
            Intrinsics.h(__typename, "__typename");
            this.f20733a = __typename;
            this.b = onRewardsOffersSection;
            this.c = onRewardsEmptyPage;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RewardsOffersListPage)) {
                return false;
            }
            RewardsOffersListPage rewardsOffersListPage = (RewardsOffersListPage) obj;
            return Intrinsics.c(this.f20733a, rewardsOffersListPage.f20733a) && Intrinsics.c(this.b, rewardsOffersListPage.b) && Intrinsics.c(this.c, rewardsOffersListPage.c);
        }

        public final int hashCode() {
            int iHashCode = this.f20733a.hashCode() * 31;
            OnRewardsOffersSection onRewardsOffersSection = this.b;
            int iHashCode2 = (iHashCode + (onRewardsOffersSection == null ? 0 : onRewardsOffersSection.hashCode())) * 31;
            OnRewardsEmptyPage onRewardsEmptyPage = this.c;
            return iHashCode2 + (onRewardsEmptyPage != null ? onRewardsEmptyPage.hashCode() : 0);
        }

        public final String toString() {
            return "RewardsOffersListPage(__typename=" + this.f20733a + ", onRewardsOffersSection=" + this.b + ", onRewardsEmptyPage=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/OfferListPageQuery$Section;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Section {

        /* renamed from: a, reason: collision with root package name */
        public final String f20734a;
        public final OffersSectionsFragment b;

        public Section(String str, OffersSectionsFragment offersSectionsFragment) {
            this.f20734a = str;
            this.b = offersSectionsFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Section)) {
                return false;
            }
            Section section = (Section) obj;
            return Intrinsics.c(this.f20734a, section.f20734a) && Intrinsics.c(this.b, section.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20734a.hashCode() * 31);
        }

        public final String toString() {
            return "Section(__typename=" + this.f20734a + ", offersSectionsFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/OfferListPageQuery$State;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class State {

        /* renamed from: a, reason: collision with root package name */
        public final String f20735a;
        public final String b;
        public final String c;

        public State(String str, String str2, String str3) {
            this.f20735a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.c(this.f20735a, state.f20735a) && Intrinsics.c(this.b, state.b) && Intrinsics.c(this.c, state.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f20735a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("State(title=", this.f20735a, ", imageUrl=", this.b, ", message="), this.c, ")");
        }
    }

    public OfferListPageQuery(String pageName, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Intrinsics.h(pageName, "pageName");
        this.f20727a = pageName;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(OfferListPageQuery_ResponseAdapter.Data.f20766a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query OfferListPage($pageName: ID!, $isSpinSurpriseEnabled: Boolean!, $isPersonalisedOffersEnabled: Boolean!, $isAutoBoostFeatureEnabled: Boolean!, $includeDetails: Boolean!, $isOfferDetailsRefactorEnabled: Boolean!, $isMandyBannerEnabled: Boolean!, $isTigerNewOfferEnabled: Boolean!) { rewardsOffersListPage(pageName: $pageName) { __typename ... on RewardsOffersSection { navigationTitle sections { __typename ...OffersSectionsFragment } footer { cta { isExternalUrl label url } title } } ... on RewardsEmptyPage { navigationTitle state { title imageUrl message } } } }  fragment standardBannerFields on StandardBanner { bannerId bannerTitle bannerImageUrl bannerDescription bannerActionUrl bannerActionLabel bannerActionAccessibilityHint }  fragment iconAsset on IconAsset { __typename ... on LocalAsset { iconName } ... on HostedIcon { url } ... on CoreIcon { coreIconName coreWebIconName } }  fragment rewardsOfferFields on RewardsOffer { offerId image bannerUrl standardBanner @include(if: $includeDetails) { __typename ...standardBannerFields } boostedOfferInsetBanner { displayType message title iconUrl action { placement type label url actionAccessibilityHint } } title subtitle summary body formattedTermsAndConditions markdownTermsAndConditions displayStatus offerStatus mechanics @include(if: $includeDetails) { displayLastUpdated separator selectedIndex items { icon caption altText title } } displayExpiry displayExpiryExtended statusIcons @skip(if: $isOfferDetailsRefactorEnabled) { icon } offerAnalytics { offerName commId uoid campaignCode campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode rtlCouponStart profile } activationAnimation displayAnimation activationMessage { title message buttonLabel } brandLogoUrl brandLogoUrlCompact roundel @include(if: $isTigerNewOfferEnabled) { __typename ...iconAsset } offerListCta { cta { label url isExternalUrl } displayStatus } offerDetailsCta @include(if: $includeDetails) { cta { label url isExternalUrl } displayStatus } offerTileProgressTracker @include(if: $isOfferDetailsRefactorEnabled) { title titleSuffix description circularProgressIndicator { primaryRing { ringPercent ringColor } } } offerTileAltText @include(if: $isOfferDetailsRefactorEnabled) }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment contentCtaFields on ContentCta { label url isExternalUrl onCtaClickAnalytics { __typename ...analyticsFields } }  fragment OffersSectionsFragment on OffersSections { __typename ... on StandardBanner { __typename ...standardBannerFields } ... on MandyBanner @include(if: $isMandyBannerEnabled) { id mandyBannerAction mandyImageUrl mandyBannerTitle mandyBannerDescription mandyBannerAction mandyBannerActionUrl } ... on NoOffersCard { emptyStateIconAsset { __typename ... on HostedIcon { url } } emptyStateTitle emptyStateMessage } ... on StandardOffersSection { sectionId sectionTitle items { __typename ...rewardsOfferFields } } ... on ProductOffersSection { sectionId sectionTitle sectionSubtitle endedOffersSectionSubtitle sectionCta { __typename ...contentCtaFields } items { __typename ...rewardsOfferFields } layout } ... on SpinSurpriseBanner @include(if: $isSpinSurpriseEnabled) { bannerId bannerAsset { assetType assetUrl assetWidth assetHeight fit } bannerActionUrl } ... on PersonalisedOffersBanner @include(if: $isPersonalisedOffersEnabled) { bannerId imageUrl title description status actionUrl: bannerActionUrl } ... on OfferFeedInlineBanner @include(if: $isAutoBoostFeatureEnabled) { inlineBannerId inlineBannerLeadingIcon { __typename ...iconAsset } inlineBannerTrailingIcon { __typename ...iconAsset } inlineBannerTitle inlineBannerDescription inlineBannerActionUrl showIsNewLabel dismissible } ... on RewardsCtaCard @include(if: $isAutoBoostFeatureEnabled) { id title actionUrl } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferListPageQuery)) {
            return false;
        }
        OfferListPageQuery offerListPageQuery = (OfferListPageQuery) obj;
        return Intrinsics.c(this.f20727a, offerListPageQuery.f20727a) && this.b == offerListPageQuery.b && this.c == offerListPageQuery.c && this.d == offerListPageQuery.d && this.e == offerListPageQuery.e && this.f == offerListPageQuery.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + b.e(b.e(b.e(b.e(b.e(b.e(this.f20727a.hashCode() * 31, 31, true), 31, this.b), 31, this.c), 31, true), 31, this.d), 31, this.e);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "0fbf048a29cfc1b074a1823d09ba7c51b0bf62bb4447b3c5430984a4a62af671";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "OfferListPage";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("pageName");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f20727a);
        jsonWriter.F1("isSpinSurpriseEnabled");
        Adapters$BooleanAdapter$1 adapters$BooleanAdapter$1 = Adapters.f;
        Boolean bool = Boolean.TRUE;
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, bool);
        jsonWriter.F1("isPersonalisedOffersEnabled");
        d.B(this.b, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isAutoBoostFeatureEnabled");
        d.B(this.c, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "includeDetails");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, bool);
        jsonWriter.F1("isOfferDetailsRefactorEnabled");
        d.B(this.d, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isMandyBannerEnabled");
        d.B(this.e, adapters$BooleanAdapter$1, jsonWriter, customScalarAdapters, "isTigerNewOfferEnabled");
        adapters$BooleanAdapter$1.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.f));
    }

    public final String toString() {
        StringBuilder sbQ = androidx.constraintlayout.core.state.a.q("OfferListPageQuery(pageName=", this.f20727a, ", isSpinSurpriseEnabled=true, isPersonalisedOffersEnabled=", ", isAutoBoostFeatureEnabled=", this.b);
        au.com.woolworths.android.onesite.a.D(sbQ, this.c, ", includeDetails=true, isOfferDetailsRefactorEnabled=", this.d, ", isMandyBannerEnabled=");
        return au.com.woolworths.android.onesite.a.q(sbQ, this.e, ", isTigerNewOfferEnabled=", this.f, ")");
    }
}
