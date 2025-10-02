package com.woolworths.rewards.offers;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.offers.adapter.OfferDetailsScreenQuery_ResponseAdapter;
import com.woolworths.rewards.offers.fragment.fragment.OfferDetailsFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0006\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/woolworths/rewards/offers/OfferDetailsScreenQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/rewards/offers/OfferDetailsScreenQuery$Data;", "Data", "RewardsOfferDetails", "OnRewardsOffer", "OnRewardsOfferUnknown", "Cta", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class OfferDetailsScreenQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f20712a;
    public final boolean b;
    public final Optional c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/offers/OfferDetailsScreenQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/OfferDetailsScreenQuery$Cta;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cta {

        /* renamed from: a, reason: collision with root package name */
        public final String f20713a;
        public final String b;

        public Cta(String str, String str2) {
            this.f20713a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cta)) {
                return false;
            }
            Cta cta = (Cta) obj;
            return Intrinsics.c(this.f20713a, cta.f20713a) && Intrinsics.c(this.b, cta.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20713a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return a.j("Cta(label=", this.f20713a, ", url=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/OfferDetailsScreenQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsOfferDetails f20714a;

        public Data(RewardsOfferDetails rewardsOfferDetails) {
            this.f20714a = rewardsOfferDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20714a, ((Data) obj).f20714a);
        }

        public final int hashCode() {
            RewardsOfferDetails rewardsOfferDetails = this.f20714a;
            if (rewardsOfferDetails == null) {
                return 0;
            }
            return rewardsOfferDetails.hashCode();
        }

        public final String toString() {
            return "Data(rewardsOfferDetails=" + this.f20714a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/OfferDetailsScreenQuery$OnRewardsOffer;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRewardsOffer {

        /* renamed from: a, reason: collision with root package name */
        public final String f20715a;
        public final OfferDetailsFragment b;

        public OnRewardsOffer(String str, OfferDetailsFragment offerDetailsFragment) {
            this.f20715a = str;
            this.b = offerDetailsFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnRewardsOffer)) {
                return false;
            }
            OnRewardsOffer onRewardsOffer = (OnRewardsOffer) obj;
            return Intrinsics.c(this.f20715a, onRewardsOffer.f20715a) && Intrinsics.c(this.b, onRewardsOffer.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20715a.hashCode() * 31);
        }

        public final String toString() {
            return "OnRewardsOffer(__typename=" + this.f20715a + ", offerDetailsFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/OfferDetailsScreenQuery$OnRewardsOfferUnknown;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRewardsOfferUnknown {

        /* renamed from: a, reason: collision with root package name */
        public final String f20716a;
        public final String b;
        public final Cta c;

        public OnRewardsOfferUnknown(String str, String str2, Cta cta) {
            this.f20716a = str;
            this.b = str2;
            this.c = cta;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnRewardsOfferUnknown)) {
                return false;
            }
            OnRewardsOfferUnknown onRewardsOfferUnknown = (OnRewardsOfferUnknown) obj;
            return Intrinsics.c(this.f20716a, onRewardsOfferUnknown.f20716a) && Intrinsics.c(this.b, onRewardsOfferUnknown.b) && Intrinsics.c(this.c, onRewardsOfferUnknown.c);
        }

        public final int hashCode() {
            int iC = b.c(this.f20716a.hashCode() * 31, 31, this.b);
            Cta cta = this.c;
            return iC + (cta == null ? 0 : cta.hashCode());
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnRewardsOfferUnknown(title=", this.f20716a, ", description=", this.b, ", cta=");
            sbV.append(this.c);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/OfferDetailsScreenQuery$RewardsOfferDetails;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsOfferDetails {

        /* renamed from: a, reason: collision with root package name */
        public final String f20717a;
        public final OnRewardsOffer b;
        public final OnRewardsOfferUnknown c;

        public RewardsOfferDetails(String __typename, OnRewardsOffer onRewardsOffer, OnRewardsOfferUnknown onRewardsOfferUnknown) {
            Intrinsics.h(__typename, "__typename");
            this.f20717a = __typename;
            this.b = onRewardsOffer;
            this.c = onRewardsOfferUnknown;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RewardsOfferDetails)) {
                return false;
            }
            RewardsOfferDetails rewardsOfferDetails = (RewardsOfferDetails) obj;
            return Intrinsics.c(this.f20717a, rewardsOfferDetails.f20717a) && Intrinsics.c(this.b, rewardsOfferDetails.b) && Intrinsics.c(this.c, rewardsOfferDetails.c);
        }

        public final int hashCode() {
            int iHashCode = this.f20717a.hashCode() * 31;
            OnRewardsOffer onRewardsOffer = this.b;
            int iHashCode2 = (iHashCode + (onRewardsOffer == null ? 0 : onRewardsOffer.hashCode())) * 31;
            OnRewardsOfferUnknown onRewardsOfferUnknown = this.c;
            return iHashCode2 + (onRewardsOfferUnknown != null ? onRewardsOfferUnknown.hashCode() : 0);
        }

        public final String toString() {
            return "RewardsOfferDetails(__typename=" + this.f20717a + ", onRewardsOffer=" + this.b + ", onRewardsOfferUnknown=" + this.c + ")";
        }
    }

    public OfferDetailsScreenQuery(Optional optional, String offerId, boolean z) {
        Intrinsics.h(offerId, "offerId");
        this.f20712a = offerId;
        this.b = z;
        this.c = optional;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(OfferDetailsScreenQuery_ResponseAdapter.Data.f20753a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query OfferDetailsScreen($offerId: ID!, $isShopAppInstalled: Boolean!, $offerType: String) { rewardsOfferDetails(offerId: $offerId, isShopAppInstalled: $isShopAppInstalled, type: $offerType) { __typename ... on RewardsOffer { __typename ...OfferDetailsFragment } ... on RewardsOfferUnknown { title description cta { label url } } } }  fragment standardBannerFields on StandardBanner { bannerId bannerTitle bannerImageUrl bannerDescription bannerActionUrl bannerActionLabel bannerActionAccessibilityHint }  fragment OfferDetailsFragment on RewardsOfferBase { __typename offerId image bannerUrl title subtitle summary body formattedTermsAndConditions markdownTermsAndConditions displayExpiry displayStatus offerStatus brandLogoUrl mechanics { displayLastUpdated separator selectedIndex items { icon caption altText title } } statusIcons { icon } offerAnalytics { offerName commId uoid campaignCode campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode rtlCouponStart profile } activationAnimation displayAnimation activationMessage { title message buttonLabel } ... on RewardsOffer { displayExpiryExtended offerDetailsCta { cta { label url isExternalUrl } displayStatus } standardBanner { __typename ...standardBannerFields } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferDetailsScreenQuery)) {
            return false;
        }
        OfferDetailsScreenQuery offerDetailsScreenQuery = (OfferDetailsScreenQuery) obj;
        return Intrinsics.c(this.f20712a, offerDetailsScreenQuery.f20712a) && this.b == offerDetailsScreenQuery.b && Intrinsics.c(this.c, offerDetailsScreenQuery.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.e(this.f20712a.hashCode() * 31, 31, this.b);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "b981cc7dc74e36fa095fd470b8df6a30ccf66c9dcd61dfb1a3d927eca29bb6d5";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "OfferDetailsScreen";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("offerId");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f20712a);
        jsonWriter.F1("isShopAppInstalled");
        Adapters.f.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.b));
        Optional optional = this.c;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("offerType");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
    }

    public final String toString() {
        return au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.o(androidx.constraintlayout.core.state.a.q("OfferDetailsScreenQuery(offerId=", this.f20712a, ", isShopAppInstalled=", ", offerType=", this.b), this.c, ")");
    }
}
