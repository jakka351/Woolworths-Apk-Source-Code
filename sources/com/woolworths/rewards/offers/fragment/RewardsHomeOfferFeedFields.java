package com.woolworths.rewards.offers.fragment;

import YU.a;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Fragment;
import com.woolworths.rewards.offers.fragment.fragment.ContentCtaFields;
import com.woolworths.rewards.offers.fragment.fragment.OffersSectionsFragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsHomeOfferFeedFields;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Header", "ErrorMessage", "Section", "Summary", "OnRewardsSummaryText", "PrimaryCta", "SecondaryCta", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RewardsHomeOfferFeedFields implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final Header f20894a;
    public final ErrorMessage b;
    public final ArrayList c;
    public final String d;
    public final Boolean e;
    public final boolean f;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsHomeOfferFeedFields$ErrorMessage;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ErrorMessage {

        /* renamed from: a, reason: collision with root package name */
        public final String f20895a;
        public final String b;
        public final PrimaryCta c;
        public final SecondaryCta d;

        public ErrorMessage(String str, String str2, PrimaryCta primaryCta, SecondaryCta secondaryCta) {
            this.f20895a = str;
            this.b = str2;
            this.c = primaryCta;
            this.d = secondaryCta;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ErrorMessage)) {
                return false;
            }
            ErrorMessage errorMessage = (ErrorMessage) obj;
            return Intrinsics.c(this.f20895a, errorMessage.f20895a) && Intrinsics.c(this.b, errorMessage.b) && Intrinsics.c(this.c, errorMessage.c) && Intrinsics.c(this.d, errorMessage.d);
        }

        public final int hashCode() {
            int iHashCode = this.f20895a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            PrimaryCta primaryCta = this.c;
            int iHashCode3 = (iHashCode2 + (primaryCta == null ? 0 : primaryCta.hashCode())) * 31;
            SecondaryCta secondaryCta = this.d;
            return iHashCode3 + (secondaryCta != null ? secondaryCta.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("ErrorMessage(title=", this.f20895a, ", description=", this.b, ", primaryCta=");
            sbV.append(this.c);
            sbV.append(", secondaryCta=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsHomeOfferFeedFields$Header;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Header {

        /* renamed from: a, reason: collision with root package name */
        public final String f20896a;
        public final Summary b;

        public Header(String str, Summary summary) {
            this.f20896a = str;
            this.b = summary;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return Intrinsics.c(this.f20896a, header.f20896a) && Intrinsics.c(this.b, header.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20896a.hashCode() * 31;
            Summary summary = this.b;
            return iHashCode + (summary == null ? 0 : summary.hashCode());
        }

        public final String toString() {
            return "Header(title=" + this.f20896a + ", summary=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsHomeOfferFeedFields$OnRewardsSummaryText;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRewardsSummaryText {

        /* renamed from: a, reason: collision with root package name */
        public final String f20897a;

        public OnRewardsSummaryText(String str) {
            this.f20897a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRewardsSummaryText) && Intrinsics.c(this.f20897a, ((OnRewardsSummaryText) obj).f20897a);
        }

        public final int hashCode() {
            return this.f20897a.hashCode();
        }

        public final String toString() {
            return a.h("OnRewardsSummaryText(text=", this.f20897a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsHomeOfferFeedFields$PrimaryCta;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrimaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f20898a;
        public final ContentCtaFields b;

        public PrimaryCta(String str, ContentCtaFields contentCtaFields) {
            this.f20898a = str;
            this.b = contentCtaFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrimaryCta)) {
                return false;
            }
            PrimaryCta primaryCta = (PrimaryCta) obj;
            return Intrinsics.c(this.f20898a, primaryCta.f20898a) && Intrinsics.c(this.b, primaryCta.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20898a.hashCode() * 31);
        }

        public final String toString() {
            return "PrimaryCta(__typename=" + this.f20898a + ", contentCtaFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsHomeOfferFeedFields$SecondaryCta;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SecondaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f20899a;
        public final ContentCtaFields b;

        public SecondaryCta(String str, ContentCtaFields contentCtaFields) {
            this.f20899a = str;
            this.b = contentCtaFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SecondaryCta)) {
                return false;
            }
            SecondaryCta secondaryCta = (SecondaryCta) obj;
            return Intrinsics.c(this.f20899a, secondaryCta.f20899a) && Intrinsics.c(this.b, secondaryCta.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20899a.hashCode() * 31);
        }

        public final String toString() {
            return "SecondaryCta(__typename=" + this.f20899a + ", contentCtaFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsHomeOfferFeedFields$Section;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Section {

        /* renamed from: a, reason: collision with root package name */
        public final String f20900a;
        public final OffersSectionsFragment b;

        public Section(String str, OffersSectionsFragment offersSectionsFragment) {
            this.f20900a = str;
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
            return Intrinsics.c(this.f20900a, section.f20900a) && Intrinsics.c(this.b, section.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20900a.hashCode() * 31);
        }

        public final String toString() {
            return "Section(__typename=" + this.f20900a + ", offersSectionsFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsHomeOfferFeedFields$Summary;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Summary {

        /* renamed from: a, reason: collision with root package name */
        public final String f20901a;
        public final OnRewardsSummaryText b;
        public final ContentCtaFields c;

        public Summary(String __typename, OnRewardsSummaryText onRewardsSummaryText, ContentCtaFields contentCtaFields) {
            Intrinsics.h(__typename, "__typename");
            this.f20901a = __typename;
            this.b = onRewardsSummaryText;
            this.c = contentCtaFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Summary)) {
                return false;
            }
            Summary summary = (Summary) obj;
            return Intrinsics.c(this.f20901a, summary.f20901a) && Intrinsics.c(this.b, summary.b) && Intrinsics.c(this.c, summary.c);
        }

        public final int hashCode() {
            int iHashCode = this.f20901a.hashCode() * 31;
            OnRewardsSummaryText onRewardsSummaryText = this.b;
            int iHashCode2 = (iHashCode + (onRewardsSummaryText == null ? 0 : onRewardsSummaryText.f20897a.hashCode())) * 31;
            ContentCtaFields contentCtaFields = this.c;
            return iHashCode2 + (contentCtaFields != null ? contentCtaFields.hashCode() : 0);
        }

        public final String toString() {
            return "Summary(__typename=" + this.f20901a + ", onRewardsSummaryText=" + this.b + ", contentCtaFields=" + this.c + ")";
        }
    }

    public RewardsHomeOfferFeedFields(Header header, ErrorMessage errorMessage, ArrayList arrayList, String str, Boolean bool, boolean z) {
        this.f20894a = header;
        this.b = errorMessage;
        this.c = arrayList;
        this.d = str;
        this.e = bool;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsHomeOfferFeedFields)) {
            return false;
        }
        RewardsHomeOfferFeedFields rewardsHomeOfferFeedFields = (RewardsHomeOfferFeedFields) obj;
        return Intrinsics.c(this.f20894a, rewardsHomeOfferFeedFields.f20894a) && Intrinsics.c(this.b, rewardsHomeOfferFeedFields.b) && this.c.equals(rewardsHomeOfferFeedFields.c) && Intrinsics.c(this.d, rewardsHomeOfferFeedFields.d) && Intrinsics.c(this.e, rewardsHomeOfferFeedFields.e) && this.f == rewardsHomeOfferFeedFields.f;
    }

    public final int hashCode() {
        Header header = this.f20894a;
        int iHashCode = (header == null ? 0 : header.hashCode()) * 31;
        ErrorMessage errorMessage = this.b;
        int iB = androidx.compose.ui.input.pointer.a.b((iHashCode + (errorMessage == null ? 0 : errorMessage.hashCode())) * 31, 31, this.c);
        String str = this.d;
        int iHashCode2 = (iB + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "RewardsHomeOfferFeedFields(header=" + this.f20894a + ", errorMessage=" + this.b + ", sections=" + this.c + ", onLoadDeepLinkUrl=" + this.d + ", eligibleForOnboardingBanner=" + this.e + ", isAutoBoostEnabled=" + this.f + ")";
    }
}
