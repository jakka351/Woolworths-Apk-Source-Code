package com.woolworths.rewards.offers;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.rewards.everydayextras.signup.selections.a;
import com.apollographql.apollo.api.Adapter;
import com.apollographql.apollo.api.Adapters;
import com.apollographql.apollo.api.CustomScalarAdapters;
import com.apollographql.apollo.api.Optional;
import com.apollographql.apollo.api.Query;
import com.apollographql.apollo.api.json.JsonWriter;
import com.woolworths.rewards.offers.adapter.OfferDetailsQuery_ResponseAdapter;
import com.woolworths.rewards.offers.fragment.fragment.OfferDetailsFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/offers/OfferDetailsQuery;", "Lcom/apollographql/apollo/api/Query;", "Lcom/woolworths/rewards/offers/OfferDetailsQuery$Data;", "Data", "RewardsOffer", "Companion", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class OfferDetailsQuery implements Query<Data> {

    /* renamed from: a, reason: collision with root package name */
    public final String f20709a;
    public final boolean b;
    public final Optional c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/woolworths/rewards/offers/OfferDetailsQuery$Companion;", "", "", "OPERATION_ID", "Ljava/lang/String;", "OPERATION_NAME", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/OfferDetailsQuery$Data;", "Lcom/apollographql/apollo/api/Query$Data;", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Data implements Query.Data {

        /* renamed from: a, reason: collision with root package name */
        public final RewardsOffer f20710a;

        public Data(RewardsOffer rewardsOffer) {
            this.f20710a = rewardsOffer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Data) && Intrinsics.c(this.f20710a, ((Data) obj).f20710a);
        }

        public final int hashCode() {
            RewardsOffer rewardsOffer = this.f20710a;
            if (rewardsOffer == null) {
                return 0;
            }
            return rewardsOffer.hashCode();
        }

        public final String toString() {
            return "Data(rewardsOffer=" + this.f20710a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/OfferDetailsQuery$RewardsOffer;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RewardsOffer {

        /* renamed from: a, reason: collision with root package name */
        public final String f20711a;
        public final OfferDetailsFragment b;

        public RewardsOffer(String str, OfferDetailsFragment offerDetailsFragment) {
            this.f20711a = str;
            this.b = offerDetailsFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RewardsOffer)) {
                return false;
            }
            RewardsOffer rewardsOffer = (RewardsOffer) obj;
            return Intrinsics.c(this.f20711a, rewardsOffer.f20711a) && Intrinsics.c(this.b, rewardsOffer.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20711a.hashCode() * 31);
        }

        public final String toString() {
            return "RewardsOffer(__typename=" + this.f20711a + ", offerDetailsFragment=" + this.b + ")";
        }
    }

    public OfferDetailsQuery(Optional optional, String offerId, boolean z) {
        Intrinsics.h(offerId, "offerId");
        this.f20709a = offerId;
        this.b = z;
        this.c = optional;
    }

    @Override // com.apollographql.apollo.api.Executable
    public final Adapter adapter() {
        return Adapters.c(OfferDetailsQuery_ResponseAdapter.Data.f20750a, false);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String document() {
        return "query OfferDetails($offerId: String!, $isShopAppInstalled: Boolean!, $offerType: String) { rewardsOffer(offerId: $offerId, isShopAppInstalled: $isShopAppInstalled, type: $offerType) { __typename ...OfferDetailsFragment } }  fragment standardBannerFields on StandardBanner { bannerId bannerTitle bannerImageUrl bannerDescription bannerActionUrl bannerActionLabel bannerActionAccessibilityHint }  fragment OfferDetailsFragment on RewardsOfferBase { __typename offerId image bannerUrl title subtitle summary body formattedTermsAndConditions markdownTermsAndConditions displayExpiry displayStatus offerStatus brandLogoUrl mechanics { displayLastUpdated separator selectedIndex items { icon caption altText title } } statusIcons { icon } offerAnalytics { offerName commId uoid campaignCode campaignStream channel status offerType partnerId rtlAccountID rtlCampaignID rtlCampaignCode rtlCouponStart profile } activationAnimation displayAnimation activationMessage { title message buttonLabel } ... on RewardsOffer { displayExpiryExtended offerDetailsCta { cta { label url isExternalUrl } displayStatus } standardBanner { __typename ...standardBannerFields } } }";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferDetailsQuery)) {
            return false;
        }
        OfferDetailsQuery offerDetailsQuery = (OfferDetailsQuery) obj;
        return Intrinsics.c(this.f20709a, offerDetailsQuery.f20709a) && this.b == offerDetailsQuery.b && Intrinsics.c(this.c, offerDetailsQuery.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + b.e(this.f20709a.hashCode() * 31, 31, this.b);
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String id() {
        return "1c81bd036799633160b2684ff4b80eac796ca1a1ded95dcb2338bad264caf322";
    }

    @Override // com.apollographql.apollo.api.Operation
    public final String name() {
        return "OfferDetails";
    }

    @Override // com.apollographql.apollo.api.Executable
    public final void serializeVariables(JsonWriter jsonWriter, CustomScalarAdapters customScalarAdapters, boolean z) {
        Intrinsics.h(customScalarAdapters, "customScalarAdapters");
        jsonWriter.F1("offerId");
        Adapters.f13493a.toJson(jsonWriter, customScalarAdapters, this.f20709a);
        jsonWriter.F1("isShopAppInstalled");
        Adapters.f.toJson(jsonWriter, customScalarAdapters, Boolean.valueOf(this.b));
        Optional optional = this.c;
        if (optional instanceof Optional.Present) {
            jsonWriter.F1("offerType");
            Adapters.d(Adapters.i).toJson(jsonWriter, customScalarAdapters, (Optional.Present) optional);
        }
    }

    public final String toString() {
        return a.o(androidx.constraintlayout.core.state.a.q("OfferDetailsQuery(offerId=", this.f20709a, ", isShopAppInstalled=", ", offerType=", this.b), this.c, ")");
    }
}
