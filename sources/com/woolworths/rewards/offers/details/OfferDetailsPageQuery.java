package com.woolworths.rewards.offers.details;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.graphql.type.LocalAssetIconName;
import au.com.woolworths.rewards.graphql.type.OfferDetailsPageInput;
import au.com.woolworths.rewards.graphql.type.adapter.OfferDetailsPageInput_InputAdapter;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.offers.details.adapter.OfferDetailsPageQuery_ResponseAdapter;
import com.woolworths.rewards.offers.details.fragment.OfferDetailsPageFragment;
import com.woolworths.rewards.offers.fragment.fragment.ContentCtaFields;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/woolworths/rewards/offers/details/OfferDetailsPageQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/rewards/offers/details/OfferDetailsPageQuery$Data;", "Data", "OfferDetails", "OnOfferDetailsPage", "OnRewardsErrorEmptyState", "EmptyStateIconAsset", "OnLocalAsset", "OnHostedIcon", "EmptyStateAction", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class OfferDetailsPageQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final OfferDetailsPageInput f20780a;
    public final boolean b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/offers/details/OfferDetailsPageQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/OfferDetailsPageQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final OfferDetails f20781a;

        public Data(OfferDetails offerDetails) {
            this.f20781a = offerDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20781a, ((Data) obj).f20781a);
        }

        public final int hashCode() {
            return this.f20781a.hashCode();
        }

        public final String toString() {
            return "Data(offerDetails=" + this.f20781a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/OfferDetailsPageQuery$EmptyStateAction;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EmptyStateAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f20782a;
        public final ContentCtaFields b;

        public EmptyStateAction(String str, ContentCtaFields contentCtaFields) {
            this.f20782a = str;
            this.b = contentCtaFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EmptyStateAction)) {
                return false;
            }
            EmptyStateAction emptyStateAction = (EmptyStateAction) obj;
            return Intrinsics.c(this.f20782a, emptyStateAction.f20782a) && Intrinsics.c(this.b, emptyStateAction.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20782a.hashCode() * 31);
        }

        public final String toString() {
            return "EmptyStateAction(__typename=" + this.f20782a + ", contentCtaFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/OfferDetailsPageQuery$EmptyStateIconAsset;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EmptyStateIconAsset {

        /* renamed from: a, reason: collision with root package name */
        public final String f20783a;
        public final OnLocalAsset b;
        public final OnHostedIcon c;

        public EmptyStateIconAsset(String __typename, OnLocalAsset onLocalAsset, OnHostedIcon onHostedIcon) {
            Intrinsics.h(__typename, "__typename");
            this.f20783a = __typename;
            this.b = onLocalAsset;
            this.c = onHostedIcon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EmptyStateIconAsset)) {
                return false;
            }
            EmptyStateIconAsset emptyStateIconAsset = (EmptyStateIconAsset) obj;
            return Intrinsics.c(this.f20783a, emptyStateIconAsset.f20783a) && Intrinsics.c(this.b, emptyStateIconAsset.b) && Intrinsics.c(this.c, emptyStateIconAsset.c);
        }

        public final int hashCode() {
            int iHashCode = this.f20783a.hashCode() * 31;
            OnLocalAsset onLocalAsset = this.b;
            int iHashCode2 = (iHashCode + (onLocalAsset == null ? 0 : onLocalAsset.f20786a.hashCode())) * 31;
            OnHostedIcon onHostedIcon = this.c;
            return iHashCode2 + (onHostedIcon != null ? onHostedIcon.f20785a.hashCode() : 0);
        }

        public final String toString() {
            return "EmptyStateIconAsset(__typename=" + this.f20783a + ", onLocalAsset=" + this.b + ", onHostedIcon=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/OfferDetailsPageQuery$OfferDetails;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f20784a;
        public final OnOfferDetailsPage b;
        public final OnRewardsErrorEmptyState c;

        public OfferDetails(String __typename, OnOfferDetailsPage onOfferDetailsPage, OnRewardsErrorEmptyState onRewardsErrorEmptyState) {
            Intrinsics.h(__typename, "__typename");
            this.f20784a = __typename;
            this.b = onOfferDetailsPage;
            this.c = onRewardsErrorEmptyState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferDetails)) {
                return false;
            }
            OfferDetails offerDetails = (OfferDetails) obj;
            return Intrinsics.c(this.f20784a, offerDetails.f20784a) && Intrinsics.c(this.b, offerDetails.b) && Intrinsics.c(this.c, offerDetails.c);
        }

        public final int hashCode() {
            int iHashCode = this.f20784a.hashCode() * 31;
            OnOfferDetailsPage onOfferDetailsPage = this.b;
            int iHashCode2 = (iHashCode + (onOfferDetailsPage == null ? 0 : onOfferDetailsPage.hashCode())) * 31;
            OnRewardsErrorEmptyState onRewardsErrorEmptyState = this.c;
            return iHashCode2 + (onRewardsErrorEmptyState != null ? onRewardsErrorEmptyState.hashCode() : 0);
        }

        public final String toString() {
            return "OfferDetails(__typename=" + this.f20784a + ", onOfferDetailsPage=" + this.b + ", onRewardsErrorEmptyState=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/OfferDetailsPageQuery$OnHostedIcon;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f20785a;

        public OnHostedIcon(String str) {
            this.f20785a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon) && Intrinsics.c(this.f20785a, ((OnHostedIcon) obj).f20785a);
        }

        public final int hashCode() {
            return this.f20785a.hashCode();
        }

        public final String toString() {
            return a.h("OnHostedIcon(url=", this.f20785a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/OfferDetailsPageQuery$OnLocalAsset;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnLocalAsset {

        /* renamed from: a, reason: collision with root package name */
        public final LocalAssetIconName f20786a;

        public OnLocalAsset(LocalAssetIconName localAssetIconName) {
            this.f20786a = localAssetIconName;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnLocalAsset) && this.f20786a == ((OnLocalAsset) obj).f20786a;
        }

        public final int hashCode() {
            return this.f20786a.hashCode();
        }

        public final String toString() {
            return "OnLocalAsset(iconName=" + this.f20786a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/OfferDetailsPageQuery$OnOfferDetailsPage;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOfferDetailsPage {

        /* renamed from: a, reason: collision with root package name */
        public final String f20787a;
        public final OfferDetailsPageFragment b;

        public OnOfferDetailsPage(String str, OfferDetailsPageFragment offerDetailsPageFragment) {
            this.f20787a = str;
            this.b = offerDetailsPageFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOfferDetailsPage)) {
                return false;
            }
            OnOfferDetailsPage onOfferDetailsPage = (OnOfferDetailsPage) obj;
            return Intrinsics.c(this.f20787a, onOfferDetailsPage.f20787a) && Intrinsics.c(this.b, onOfferDetailsPage.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20787a.hashCode() * 31);
        }

        public final String toString() {
            return "OnOfferDetailsPage(__typename=" + this.f20787a + ", offerDetailsPageFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/OfferDetailsPageQuery$OnRewardsErrorEmptyState;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRewardsErrorEmptyState {

        /* renamed from: a, reason: collision with root package name */
        public final EmptyStateIconAsset f20788a;
        public final String b;
        public final String c;
        public final EmptyStateAction d;

        public OnRewardsErrorEmptyState(EmptyStateIconAsset emptyStateIconAsset, String str, String str2, EmptyStateAction emptyStateAction) {
            this.f20788a = emptyStateIconAsset;
            this.b = str;
            this.c = str2;
            this.d = emptyStateAction;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnRewardsErrorEmptyState)) {
                return false;
            }
            OnRewardsErrorEmptyState onRewardsErrorEmptyState = (OnRewardsErrorEmptyState) obj;
            return Intrinsics.c(this.f20788a, onRewardsErrorEmptyState.f20788a) && Intrinsics.c(this.b, onRewardsErrorEmptyState.b) && Intrinsics.c(this.c, onRewardsErrorEmptyState.c) && Intrinsics.c(this.d, onRewardsErrorEmptyState.d);
        }

        public final int hashCode() {
            EmptyStateIconAsset emptyStateIconAsset = this.f20788a;
            int iHashCode = (emptyStateIconAsset == null ? 0 : emptyStateIconAsset.hashCode()) * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            EmptyStateAction emptyStateAction = this.d;
            return iHashCode3 + (emptyStateAction != null ? emptyStateAction.hashCode() : 0);
        }

        public final String toString() {
            return "OnRewardsErrorEmptyState(emptyStateIconAsset=" + this.f20788a + ", emptyStateTitle=" + this.b + ", emptyStateMessage=" + this.c + ", emptyStateAction=" + this.d + ")";
        }
    }

    public OfferDetailsPageQuery(OfferDetailsPageInput offerDetailsPageInput, boolean z) {
        this.f20780a = offerDetailsPageInput;
        this.b = z;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(OfferDetailsPageQuery_ResponseAdapter.Data.f20794a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query OfferDetailsPage($input: OfferDetailsPageInput!, $isTigerNewOfferEnabled: Boolean!) { offerDetails(input: $input) { __typename ... on OfferDetailsPage { __typename ...OfferDetailsPageFragment } ... on RewardsErrorEmptyState { emptyStateIconAsset { __typename ... on LocalAsset { iconName } ... on HostedIcon { url } } emptyStateTitle emptyStateMessage emptyStateAction { __typename ...contentCtaFields } } } }  fragment iconAsset on IconAsset { __typename ... on LocalAsset { iconName } ... on HostedIcon { url } ... on CoreIcon { coreIconName coreWebIconName } }  fragment OfferDetailsCardFragment on OfferDetailsCard { rows { __typename ... on OfferDetailsTrackerComboRow { trackerRow { rowLeadingAsset { __typename ... on LocalAsset { iconName } ... on HostedIcon { url } } rowLabel rowTrailingElement { __typename ... on OfferDetailsTrackerTrailingElementLabel { elementLabel } ... on OfferDetailsTrackerTrailingElementPoints { pointsPrefix pointsLabel } } } progressRow { progressRowTitle progressRowDescription progressRowCircularIndicator { primaryRing { ringPercent ringColor } } } comboRowAltText: altText } ... on MarkdownTextItem { content } ... on SubheadTextItem { content } ... on OfferDetailsInfoItem { infoLeadingAsset { __typename ... on LocalAsset { iconName } ... on HostedIcon { url } } infoDescription } ... on DownloadableAsset { assetType assetUrl assetWidth assetHeight fit altText } } }  fragment analyticsFields on Analytics { appSection screenName screenType eventAction eventCategory eventLabel eventValue eventDescription tealiumEvent extraContent { key value values } }  fragment contentCtaFields on ContentCta { label url isExternalUrl onCtaClickAnalytics { __typename ...analyticsFields } }  fragment OfferDetailsPageFragment on OfferDetailsPage { header { heroAsset { assetId assetType assetUrl assetWidth assetHeight fit altText } leafAsset { __typename ... on LocalAsset { iconName } ... on HostedIcon { url } } roundelAsset @include(if: $isTigerNewOfferEnabled) { __typename ...iconAsset } title description statusBadge { label status } broadcastBanner { broadcastBannerUI { title subtitle style icon { __typename ... on HostedIcon { url } } } broadcastBannerAction { id type action } broadcastBannerActionLabel } } content { __typename ... on OfferDetailsCard { __typename ...OfferDetailsCardFragment } } footer { __typename ... on OfferDetailsFooter { label cta { __typename ...contentCtaFields } statusBadge { label status } } } offerAnalytics { offerName commId uoid campaignCode campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode rtlCouponStart profile } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferDetailsPageQuery)) {
            return false;
        }
        OfferDetailsPageQuery offerDetailsPageQuery = (OfferDetailsPageQuery) obj;
        return Intrinsics.c(this.f20780a, offerDetailsPageQuery.f20780a) && this.b == offerDetailsPageQuery.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f20780a.hashCode() * 31);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "4f6e3914c16c877c8172fed8f99cad4dcf5bca2fcacf7139445c6590ce5833b7";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "OfferDetailsPage";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("input");
        Adapters.c(OfferDetailsPageInput_InputAdapter.f9959a, false).toJson(jsonWriter, customScalarAdapters, this.f20780a);
        jsonWriter.F1("isTigerNewOfferEnabled");
        Adapters.f.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.b));
    }

    public final String toString() {
        return "OfferDetailsPageQuery(input=" + this.f20780a + ", isTigerNewOfferEnabled=" + this.b + ")";
    }
}
