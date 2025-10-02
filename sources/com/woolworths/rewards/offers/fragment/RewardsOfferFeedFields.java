package com.woolworths.rewards.offers.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.apollographql.apollo.api.Fragment;
import com.woolworths.rewards.offers.fragment.fragment.ContentCtaFields;
import com.woolworths.rewards.offers.fragment.fragment.OffersSectionsFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Header", "ErrorMessage", "Message", "Filter", "Section", "Summary", "OnRewardsSummaryText", "PrimaryCta", "SecondaryCta", "Message1", "Analytics", "SectionConfigsFeed", "OnOffersSectionConfig", "OnBannerSectionConfig", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RewardsOfferFeedFields implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final Header f20910a;
    public final ErrorMessage b;
    public final Message c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f;
    public final Boolean g;
    public final boolean h;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$Analytics;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Analytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f20911a;

        public Analytics(String str) {
            this.f20911a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Analytics) && Intrinsics.c(this.f20911a, ((Analytics) obj).f20911a);
        }

        public final int hashCode() {
            return this.f20911a.hashCode();
        }

        public final String toString() {
            return a.h("Analytics(label=", this.f20911a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$ErrorMessage;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ErrorMessage {

        /* renamed from: a, reason: collision with root package name */
        public final String f20912a;
        public final String b;
        public final PrimaryCta c;
        public final SecondaryCta d;

        public ErrorMessage(String str, String str2, PrimaryCta primaryCta, SecondaryCta secondaryCta) {
            this.f20912a = str;
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
            return Intrinsics.c(this.f20912a, errorMessage.f20912a) && Intrinsics.c(this.b, errorMessage.b) && Intrinsics.c(this.c, errorMessage.c) && Intrinsics.c(this.d, errorMessage.d);
        }

        public final int hashCode() {
            int iHashCode = this.f20912a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            PrimaryCta primaryCta = this.c;
            int iHashCode3 = (iHashCode2 + (primaryCta == null ? 0 : primaryCta.hashCode())) * 31;
            SecondaryCta secondaryCta = this.d;
            return iHashCode3 + (secondaryCta != null ? secondaryCta.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("ErrorMessage(title=", this.f20912a, ", description=", this.b, ", primaryCta=");
            sbV.append(this.c);
            sbV.append(", secondaryCta=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$Filter;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Filter {

        /* renamed from: a, reason: collision with root package name */
        public final String f20913a;
        public final String b;
        public final ArrayList c;
        public final Message1 d;
        public final Analytics e;
        public final List f;

        public Filter(String str, String str2, ArrayList arrayList, Message1 message1, Analytics analytics, List list) {
            this.f20913a = str;
            this.b = str2;
            this.c = arrayList;
            this.d = message1;
            this.e = analytics;
            this.f = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Filter)) {
                return false;
            }
            Filter filter = (Filter) obj;
            return this.f20913a.equals(filter.f20913a) && this.b.equals(filter.b) && this.c.equals(filter.c) && Intrinsics.c(this.d, filter.d) && Intrinsics.c(this.e, filter.e) && Intrinsics.c(this.f, filter.f);
        }

        public final int hashCode() {
            int iB = androidx.compose.ui.input.pointer.a.b(b.c(this.f20913a.hashCode() * 31, 31, this.b), 31, this.c);
            Message1 message1 = this.d;
            int iHashCode = (iB + (message1 == null ? 0 : message1.hashCode())) * 31;
            Analytics analytics = this.e;
            int iHashCode2 = (iHashCode + (analytics == null ? 0 : analytics.f20911a.hashCode())) * 31;
            List list = this.f;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Filter(id=", this.f20913a, ", label=", this.b, ", offerIds=");
            sbV.append(this.c);
            sbV.append(", message=");
            sbV.append(this.d);
            sbV.append(", analytics=");
            sbV.append(this.e);
            sbV.append(", sectionConfigsFeed=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$Header;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Header {

        /* renamed from: a, reason: collision with root package name */
        public final String f20914a;
        public final Summary b;

        public Header(String str, Summary summary) {
            this.f20914a = str;
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
            return Intrinsics.c(this.f20914a, header.f20914a) && Intrinsics.c(this.b, header.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20914a.hashCode() * 31;
            Summary summary = this.b;
            return iHashCode + (summary == null ? 0 : summary.hashCode());
        }

        public final String toString() {
            return "Header(title=" + this.f20914a + ", summary=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$Message;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Message {

        /* renamed from: a, reason: collision with root package name */
        public final String f20915a;
        public final String b;
        public final String c;

        public Message(String str, String str2, String str3) {
            this.f20915a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Message)) {
                return false;
            }
            Message message = (Message) obj;
            return Intrinsics.c(this.f20915a, message.f20915a) && Intrinsics.c(this.b, message.b) && Intrinsics.c(this.c, message.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f20915a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("Message(icon=", this.f20915a, ", title=", this.b, ", message="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$Message1;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Message1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f20916a;
        public final String b;
        public final String c;

        public Message1(String str, String str2, String str3) {
            this.f20916a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Message1)) {
                return false;
            }
            Message1 message1 = (Message1) obj;
            return Intrinsics.c(this.f20916a, message1.f20916a) && Intrinsics.c(this.b, message1.b) && Intrinsics.c(this.c, message1.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f20916a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("Message1(icon=", this.f20916a, ", title=", this.b, ", message="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$OnBannerSectionConfig;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnBannerSectionConfig {

        /* renamed from: a, reason: collision with root package name */
        public final String f20917a;
        public final boolean b;

        public OnBannerSectionConfig(String str, boolean z) {
            this.f20917a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnBannerSectionConfig)) {
                return false;
            }
            OnBannerSectionConfig onBannerSectionConfig = (OnBannerSectionConfig) obj;
            return Intrinsics.c(this.f20917a, onBannerSectionConfig.f20917a) && this.b == onBannerSectionConfig.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.f20917a.hashCode() * 31);
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.j("OnBannerSectionConfig(sectionId=", this.f20917a, ", showBanner=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$OnOffersSectionConfig;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOffersSectionConfig {

        /* renamed from: a, reason: collision with root package name */
        public final String f20918a;
        public final boolean b;

        public OnOffersSectionConfig(String str, boolean z) {
            this.f20918a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOffersSectionConfig)) {
                return false;
            }
            OnOffersSectionConfig onOffersSectionConfig = (OnOffersSectionConfig) obj;
            return Intrinsics.c(this.f20918a, onOffersSectionConfig.f20918a) && this.b == onOffersSectionConfig.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.f20918a.hashCode() * 31);
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.j("OnOffersSectionConfig(sectionId=", this.f20918a, ", showSectionTitle=", this.b, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$OnRewardsSummaryText;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRewardsSummaryText {

        /* renamed from: a, reason: collision with root package name */
        public final String f20919a;

        public OnRewardsSummaryText(String str) {
            this.f20919a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnRewardsSummaryText) && Intrinsics.c(this.f20919a, ((OnRewardsSummaryText) obj).f20919a);
        }

        public final int hashCode() {
            return this.f20919a.hashCode();
        }

        public final String toString() {
            return a.h("OnRewardsSummaryText(text=", this.f20919a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$PrimaryCta;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrimaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f20920a;
        public final ContentCtaFields b;

        public PrimaryCta(String str, ContentCtaFields contentCtaFields) {
            this.f20920a = str;
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
            return Intrinsics.c(this.f20920a, primaryCta.f20920a) && Intrinsics.c(this.b, primaryCta.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20920a.hashCode() * 31);
        }

        public final String toString() {
            return "PrimaryCta(__typename=" + this.f20920a + ", contentCtaFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$SecondaryCta;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SecondaryCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f20921a;
        public final ContentCtaFields b;

        public SecondaryCta(String str, ContentCtaFields contentCtaFields) {
            this.f20921a = str;
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
            return Intrinsics.c(this.f20921a, secondaryCta.f20921a) && Intrinsics.c(this.b, secondaryCta.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20921a.hashCode() * 31);
        }

        public final String toString() {
            return "SecondaryCta(__typename=" + this.f20921a + ", contentCtaFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$Section;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Section {

        /* renamed from: a, reason: collision with root package name */
        public final String f20922a;
        public final OffersSectionsFragment b;

        public Section(String str, OffersSectionsFragment offersSectionsFragment) {
            this.f20922a = str;
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
            return Intrinsics.c(this.f20922a, section.f20922a) && Intrinsics.c(this.b, section.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20922a.hashCode() * 31);
        }

        public final String toString() {
            return "Section(__typename=" + this.f20922a + ", offersSectionsFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$SectionConfigsFeed;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SectionConfigsFeed {

        /* renamed from: a, reason: collision with root package name */
        public final String f20923a;
        public final OnOffersSectionConfig b;
        public final OnBannerSectionConfig c;

        public SectionConfigsFeed(String __typename, OnOffersSectionConfig onOffersSectionConfig, OnBannerSectionConfig onBannerSectionConfig) {
            Intrinsics.h(__typename, "__typename");
            this.f20923a = __typename;
            this.b = onOffersSectionConfig;
            this.c = onBannerSectionConfig;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SectionConfigsFeed)) {
                return false;
            }
            SectionConfigsFeed sectionConfigsFeed = (SectionConfigsFeed) obj;
            return Intrinsics.c(this.f20923a, sectionConfigsFeed.f20923a) && Intrinsics.c(this.b, sectionConfigsFeed.b) && Intrinsics.c(this.c, sectionConfigsFeed.c);
        }

        public final int hashCode() {
            int iHashCode = this.f20923a.hashCode() * 31;
            OnOffersSectionConfig onOffersSectionConfig = this.b;
            int iHashCode2 = (iHashCode + (onOffersSectionConfig == null ? 0 : onOffersSectionConfig.hashCode())) * 31;
            OnBannerSectionConfig onBannerSectionConfig = this.c;
            return iHashCode2 + (onBannerSectionConfig != null ? onBannerSectionConfig.hashCode() : 0);
        }

        public final String toString() {
            return "SectionConfigsFeed(__typename=" + this.f20923a + ", onOffersSectionConfig=" + this.b + ", onBannerSectionConfig=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFeedFields$Summary;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Summary {

        /* renamed from: a, reason: collision with root package name */
        public final String f20924a;
        public final OnRewardsSummaryText b;
        public final ContentCtaFields c;

        public Summary(String __typename, OnRewardsSummaryText onRewardsSummaryText, ContentCtaFields contentCtaFields) {
            Intrinsics.h(__typename, "__typename");
            this.f20924a = __typename;
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
            return Intrinsics.c(this.f20924a, summary.f20924a) && Intrinsics.c(this.b, summary.b) && Intrinsics.c(this.c, summary.c);
        }

        public final int hashCode() {
            int iHashCode = this.f20924a.hashCode() * 31;
            OnRewardsSummaryText onRewardsSummaryText = this.b;
            int iHashCode2 = (iHashCode + (onRewardsSummaryText == null ? 0 : onRewardsSummaryText.f20919a.hashCode())) * 31;
            ContentCtaFields contentCtaFields = this.c;
            return iHashCode2 + (contentCtaFields != null ? contentCtaFields.hashCode() : 0);
        }

        public final String toString() {
            return "Summary(__typename=" + this.f20924a + ", onRewardsSummaryText=" + this.b + ", contentCtaFields=" + this.c + ")";
        }
    }

    public RewardsOfferFeedFields(Header header, ErrorMessage errorMessage, Message message, ArrayList arrayList, ArrayList arrayList2, String str, Boolean bool, boolean z) {
        this.f20910a = header;
        this.b = errorMessage;
        this.c = message;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = str;
        this.g = bool;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsOfferFeedFields)) {
            return false;
        }
        RewardsOfferFeedFields rewardsOfferFeedFields = (RewardsOfferFeedFields) obj;
        return Intrinsics.c(this.f20910a, rewardsOfferFeedFields.f20910a) && Intrinsics.c(this.b, rewardsOfferFeedFields.b) && Intrinsics.c(this.c, rewardsOfferFeedFields.c) && this.d.equals(rewardsOfferFeedFields.d) && this.e.equals(rewardsOfferFeedFields.e) && Intrinsics.c(this.f, rewardsOfferFeedFields.f) && Intrinsics.c(this.g, rewardsOfferFeedFields.g) && this.h == rewardsOfferFeedFields.h;
    }

    public final int hashCode() {
        Header header = this.f20910a;
        int iHashCode = (header == null ? 0 : header.hashCode()) * 31;
        ErrorMessage errorMessage = this.b;
        int iHashCode2 = (iHashCode + (errorMessage == null ? 0 : errorMessage.hashCode())) * 31;
        Message message = this.c;
        int iB = androidx.compose.ui.input.pointer.a.b(androidx.compose.ui.input.pointer.a.b((iHashCode2 + (message == null ? 0 : message.hashCode())) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode3 = (iB + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.g;
        return Boolean.hashCode(this.h) + ((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "RewardsOfferFeedFields(header=" + this.f20910a + ", errorMessage=" + this.b + ", message=" + this.c + ", filters=" + this.d + ", sections=" + this.e + ", onLoadDeepLinkUrl=" + this.f + ", eligibleForOnboardingBanner=" + this.g + ", isAutoBoostEnabled=" + this.h + ")";
    }
}
