package com.woolworths.rewards.offers.fragment.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetFit;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetType;
import au.com.woolworths.rewards.graphql.type.PersonalisedOffersStatus;
import au.com.woolworths.rewards.graphql.type.ProductOffersSectionLayout;
import com.apollographql.apollo.api.Fragment;
import com.woolworths.rewards.offers.fragment.IconAsset;
import com.woolworths.rewards.offers.fragment.RewardsOfferFields;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0011\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "OnStandardBanner", "OnMandyBanner", "OnNoOffersCard", "OnStandardOffersSection", "OnProductOffersSection", "OnSpinSurpriseBanner", "OnPersonalisedOffersBanner", "OnOfferFeedInlineBanner", "OnRewardsCtaCard", "EmptyStateIconAsset", "OnHostedIcon", "Item", "SectionCta", "Item1", "BannerAsset", "InlineBannerLeadingIcon", "InlineBannerTrailingIcon", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class OffersSectionsFragment implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f20998a;
    public final OnStandardBanner b;
    public final OnMandyBanner c;
    public final OnNoOffersCard d;
    public final OnStandardOffersSection e;
    public final OnProductOffersSection f;
    public final OnSpinSurpriseBanner g;
    public final OnPersonalisedOffersBanner h;
    public final OnOfferFeedInlineBanner i;
    public final OnRewardsCtaCard j;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$BannerAsset;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BannerAsset {

        /* renamed from: a, reason: collision with root package name */
        public final DownloadableAssetType f20999a;
        public final String b;
        public final int c;
        public final int d;
        public final DownloadableAssetFit e;

        public BannerAsset(DownloadableAssetType downloadableAssetType, String str, int i, int i2, DownloadableAssetFit downloadableAssetFit) {
            this.f20999a = downloadableAssetType;
            this.b = str;
            this.c = i;
            this.d = i2;
            this.e = downloadableAssetFit;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BannerAsset)) {
                return false;
            }
            BannerAsset bannerAsset = (BannerAsset) obj;
            return this.f20999a == bannerAsset.f20999a && Intrinsics.c(this.b, bannerAsset.b) && this.c == bannerAsset.c && this.d == bannerAsset.d && this.e == bannerAsset.e;
        }

        public final int hashCode() {
            int iA = b.a(this.d, b.a(this.c, b.c(this.f20999a.hashCode() * 31, 31, this.b), 31), 31);
            DownloadableAssetFit downloadableAssetFit = this.e;
            return iA + (downloadableAssetFit == null ? 0 : downloadableAssetFit.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BannerAsset(assetType=");
            sb.append(this.f20999a);
            sb.append(", assetUrl=");
            sb.append(this.b);
            sb.append(", assetWidth=");
            a.w(this.c, this.d, ", assetHeight=", ", fit=", sb);
            sb.append(this.e);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$EmptyStateIconAsset;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class EmptyStateIconAsset {

        /* renamed from: a, reason: collision with root package name */
        public final String f21000a;
        public final OnHostedIcon b;

        public EmptyStateIconAsset(String __typename, OnHostedIcon onHostedIcon) {
            Intrinsics.h(__typename, "__typename");
            this.f21000a = __typename;
            this.b = onHostedIcon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EmptyStateIconAsset)) {
                return false;
            }
            EmptyStateIconAsset emptyStateIconAsset = (EmptyStateIconAsset) obj;
            return Intrinsics.c(this.f21000a, emptyStateIconAsset.f21000a) && Intrinsics.c(this.b, emptyStateIconAsset.b);
        }

        public final int hashCode() {
            int iHashCode = this.f21000a.hashCode() * 31;
            OnHostedIcon onHostedIcon = this.b;
            return iHashCode + (onHostedIcon == null ? 0 : onHostedIcon.f21005a.hashCode());
        }

        public final String toString() {
            return "EmptyStateIconAsset(__typename=" + this.f21000a + ", onHostedIcon=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$InlineBannerLeadingIcon;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InlineBannerLeadingIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f21001a;
        public final IconAsset b;

        public InlineBannerLeadingIcon(String str, IconAsset iconAsset) {
            this.f21001a = str;
            this.b = iconAsset;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InlineBannerLeadingIcon)) {
                return false;
            }
            InlineBannerLeadingIcon inlineBannerLeadingIcon = (InlineBannerLeadingIcon) obj;
            return Intrinsics.c(this.f21001a, inlineBannerLeadingIcon.f21001a) && Intrinsics.c(this.b, inlineBannerLeadingIcon.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21001a.hashCode() * 31);
        }

        public final String toString() {
            return "InlineBannerLeadingIcon(__typename=" + this.f21001a + ", iconAsset=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$InlineBannerTrailingIcon;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class InlineBannerTrailingIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f21002a;
        public final IconAsset b;

        public InlineBannerTrailingIcon(String str, IconAsset iconAsset) {
            this.f21002a = str;
            this.b = iconAsset;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InlineBannerTrailingIcon)) {
                return false;
            }
            InlineBannerTrailingIcon inlineBannerTrailingIcon = (InlineBannerTrailingIcon) obj;
            return Intrinsics.c(this.f21002a, inlineBannerTrailingIcon.f21002a) && Intrinsics.c(this.b, inlineBannerTrailingIcon.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21002a.hashCode() * 31);
        }

        public final String toString() {
            return "InlineBannerTrailingIcon(__typename=" + this.f21002a + ", iconAsset=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$Item;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f21003a;
        public final RewardsOfferFields b;

        public Item(String str, RewardsOfferFields rewardsOfferFields) {
            this.f21003a = str;
            this.b = rewardsOfferFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f21003a, item.f21003a) && Intrinsics.c(this.b, item.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21003a.hashCode() * 31);
        }

        public final String toString() {
            return "Item(__typename=" + this.f21003a + ", rewardsOfferFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$Item1;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f21004a;
        public final RewardsOfferFields b;

        public Item1(String str, RewardsOfferFields rewardsOfferFields) {
            this.f21004a = str;
            this.b = rewardsOfferFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item1)) {
                return false;
            }
            Item1 item1 = (Item1) obj;
            return Intrinsics.c(this.f21004a, item1.f21004a) && Intrinsics.c(this.b, item1.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21004a.hashCode() * 31);
        }

        public final String toString() {
            return "Item1(__typename=" + this.f21004a + ", rewardsOfferFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$OnHostedIcon;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f21005a;

        public OnHostedIcon(String str) {
            this.f21005a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon) && Intrinsics.c(this.f21005a, ((OnHostedIcon) obj).f21005a);
        }

        public final int hashCode() {
            return this.f21005a.hashCode();
        }

        public final String toString() {
            return a.h("OnHostedIcon(url=", this.f21005a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$OnMandyBanner;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnMandyBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f21006a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;

        public OnMandyBanner(String str, String str2, String str3, String str4, String str5, String str6) {
            this.f21006a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnMandyBanner)) {
                return false;
            }
            OnMandyBanner onMandyBanner = (OnMandyBanner) obj;
            return Intrinsics.c(this.f21006a, onMandyBanner.f21006a) && Intrinsics.c(this.b, onMandyBanner.b) && Intrinsics.c(this.c, onMandyBanner.c) && Intrinsics.c(this.d, onMandyBanner.d) && Intrinsics.c(this.e, onMandyBanner.e) && Intrinsics.c(this.f, onMandyBanner.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + b.c(b.c(b.c(b.c(this.f21006a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnMandyBanner(id=", this.f21006a, ", mandyBannerAction=", this.b, ", mandyImageUrl=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", mandyBannerTitle=", this.d, ", mandyBannerDescription=");
            return androidx.constraintlayout.core.state.a.l(sbV, this.e, ", mandyBannerActionUrl=", this.f, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$OnNoOffersCard;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnNoOffersCard {

        /* renamed from: a, reason: collision with root package name */
        public final EmptyStateIconAsset f21007a;
        public final String b;
        public final String c;

        public OnNoOffersCard(EmptyStateIconAsset emptyStateIconAsset, String str, String str2) {
            this.f21007a = emptyStateIconAsset;
            this.b = str;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnNoOffersCard)) {
                return false;
            }
            OnNoOffersCard onNoOffersCard = (OnNoOffersCard) obj;
            return Intrinsics.c(this.f21007a, onNoOffersCard.f21007a) && Intrinsics.c(this.b, onNoOffersCard.b) && Intrinsics.c(this.c, onNoOffersCard.c);
        }

        public final int hashCode() {
            EmptyStateIconAsset emptyStateIconAsset = this.f21007a;
            int iHashCode = (emptyStateIconAsset == null ? 0 : emptyStateIconAsset.hashCode()) * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnNoOffersCard(emptyStateIconAsset=");
            sb.append(this.f21007a);
            sb.append(", emptyStateTitle=");
            sb.append(this.b);
            sb.append(", emptyStateMessage=");
            return a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$OnOfferFeedInlineBanner;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOfferFeedInlineBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f21008a;
        public final InlineBannerLeadingIcon b;
        public final InlineBannerTrailingIcon c;
        public final String d;
        public final String e;
        public final String f;
        public final Boolean g;
        public final Boolean h;

        public OnOfferFeedInlineBanner(String str, InlineBannerLeadingIcon inlineBannerLeadingIcon, InlineBannerTrailingIcon inlineBannerTrailingIcon, String str2, String str3, String str4, Boolean bool, Boolean bool2) {
            this.f21008a = str;
            this.b = inlineBannerLeadingIcon;
            this.c = inlineBannerTrailingIcon;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = bool;
            this.h = bool2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOfferFeedInlineBanner)) {
                return false;
            }
            OnOfferFeedInlineBanner onOfferFeedInlineBanner = (OnOfferFeedInlineBanner) obj;
            return Intrinsics.c(this.f21008a, onOfferFeedInlineBanner.f21008a) && Intrinsics.c(this.b, onOfferFeedInlineBanner.b) && Intrinsics.c(this.c, onOfferFeedInlineBanner.c) && Intrinsics.c(this.d, onOfferFeedInlineBanner.d) && Intrinsics.c(this.e, onOfferFeedInlineBanner.e) && Intrinsics.c(this.f, onOfferFeedInlineBanner.f) && Intrinsics.c(this.g, onOfferFeedInlineBanner.g) && Intrinsics.c(this.h, onOfferFeedInlineBanner.h);
        }

        public final int hashCode() {
            int iHashCode = this.f21008a.hashCode() * 31;
            InlineBannerLeadingIcon inlineBannerLeadingIcon = this.b;
            int iHashCode2 = (iHashCode + (inlineBannerLeadingIcon == null ? 0 : inlineBannerLeadingIcon.hashCode())) * 31;
            InlineBannerTrailingIcon inlineBannerTrailingIcon = this.c;
            int iHashCode3 = (iHashCode2 + (inlineBannerTrailingIcon == null ? 0 : inlineBannerTrailingIcon.hashCode())) * 31;
            String str = this.d;
            int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int iC = b.c((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f);
            Boolean bool = this.g;
            int iHashCode5 = (iC + (bool == null ? 0 : bool.hashCode())) * 31;
            Boolean bool2 = this.h;
            return iHashCode5 + (bool2 != null ? bool2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnOfferFeedInlineBanner(inlineBannerId=");
            sb.append(this.f21008a);
            sb.append(", inlineBannerLeadingIcon=");
            sb.append(this.b);
            sb.append(", inlineBannerTrailingIcon=");
            sb.append(this.c);
            sb.append(", inlineBannerTitle=");
            sb.append(this.d);
            sb.append(", inlineBannerDescription=");
            androidx.constraintlayout.core.state.a.B(sb, this.e, ", inlineBannerActionUrl=", this.f, ", showIsNewLabel=");
            sb.append(this.g);
            sb.append(", dismissible=");
            sb.append(this.h);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$OnPersonalisedOffersBanner;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnPersonalisedOffersBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f21009a;
        public final String b;
        public final String c;
        public final String d;
        public final PersonalisedOffersStatus e;
        public final String f;

        public OnPersonalisedOffersBanner(String str, String str2, String str3, String str4, PersonalisedOffersStatus personalisedOffersStatus, String str5) {
            this.f21009a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = personalisedOffersStatus;
            this.f = str5;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnPersonalisedOffersBanner)) {
                return false;
            }
            OnPersonalisedOffersBanner onPersonalisedOffersBanner = (OnPersonalisedOffersBanner) obj;
            return Intrinsics.c(this.f21009a, onPersonalisedOffersBanner.f21009a) && Intrinsics.c(this.b, onPersonalisedOffersBanner.b) && Intrinsics.c(this.c, onPersonalisedOffersBanner.c) && Intrinsics.c(this.d, onPersonalisedOffersBanner.d) && this.e == onPersonalisedOffersBanner.e && Intrinsics.c(this.f, onPersonalisedOffersBanner.f);
        }

        public final int hashCode() {
            return this.f.hashCode() + ((this.e.hashCode() + b.c(b.c(b.c(this.f21009a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnPersonalisedOffersBanner(bannerId=", this.f21009a, ", imageUrl=", this.b, ", title=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", description=", this.d, ", status=");
            sbV.append(this.e);
            sbV.append(", actionUrl=");
            sbV.append(this.f);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$OnProductOffersSection;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnProductOffersSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f21010a;
        public final String b;
        public final String c;
        public final String d;
        public final SectionCta e;
        public final ArrayList f;
        public final ProductOffersSectionLayout g;

        public OnProductOffersSection(String str, String str2, String str3, String str4, SectionCta sectionCta, ArrayList arrayList, ProductOffersSectionLayout productOffersSectionLayout) {
            this.f21010a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = sectionCta;
            this.f = arrayList;
            this.g = productOffersSectionLayout;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnProductOffersSection)) {
                return false;
            }
            OnProductOffersSection onProductOffersSection = (OnProductOffersSection) obj;
            return this.f21010a.equals(onProductOffersSection.f21010a) && Intrinsics.c(this.b, onProductOffersSection.b) && Intrinsics.c(this.c, onProductOffersSection.c) && Intrinsics.c(this.d, onProductOffersSection.d) && Intrinsics.c(this.e, onProductOffersSection.e) && this.f.equals(onProductOffersSection.f) && this.g == onProductOffersSection.g;
        }

        public final int hashCode() {
            int iHashCode = this.f21010a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            SectionCta sectionCta = this.e;
            return this.g.hashCode() + androidx.compose.ui.input.pointer.a.b((iHashCode4 + (sectionCta != null ? sectionCta.hashCode() : 0)) * 31, 31, this.f);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OnProductOffersSection(sectionId=", this.f21010a, ", sectionTitle=", this.b, ", sectionSubtitle=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", endedOffersSectionSubtitle=", this.d, ", sectionCta=");
            sbV.append(this.e);
            sbV.append(", items=");
            sbV.append(this.f);
            sbV.append(", layout=");
            sbV.append(this.g);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$OnRewardsCtaCard;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRewardsCtaCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f21011a;
        public final String b;
        public final String c;

        public OnRewardsCtaCard(String str, String str2, String str3) {
            this.f21011a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnRewardsCtaCard)) {
                return false;
            }
            OnRewardsCtaCard onRewardsCtaCard = (OnRewardsCtaCard) obj;
            return Intrinsics.c(this.f21011a, onRewardsCtaCard.f21011a) && Intrinsics.c(this.b, onRewardsCtaCard.b) && Intrinsics.c(this.c, onRewardsCtaCard.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + b.c(this.f21011a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return a.o(a.v("OnRewardsCtaCard(id=", this.f21011a, ", title=", this.b, ", actionUrl="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$OnSpinSurpriseBanner;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnSpinSurpriseBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f21012a;
        public final BannerAsset b;
        public final String c;

        public OnSpinSurpriseBanner(String str, BannerAsset bannerAsset, String str2) {
            this.f21012a = str;
            this.b = bannerAsset;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnSpinSurpriseBanner)) {
                return false;
            }
            OnSpinSurpriseBanner onSpinSurpriseBanner = (OnSpinSurpriseBanner) obj;
            return Intrinsics.c(this.f21012a, onSpinSurpriseBanner.f21012a) && Intrinsics.c(this.b, onSpinSurpriseBanner.b) && Intrinsics.c(this.c, onSpinSurpriseBanner.c);
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.f21012a.hashCode() * 31)) * 31;
            String str = this.c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("OnSpinSurpriseBanner(bannerId=");
            sb.append(this.f21012a);
            sb.append(", bannerAsset=");
            sb.append(this.b);
            sb.append(", bannerActionUrl=");
            return a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$OnStandardBanner;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnStandardBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f21013a;
        public final StandardBannerFields b;

        public OnStandardBanner(String str, StandardBannerFields standardBannerFields) {
            this.f21013a = str;
            this.b = standardBannerFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnStandardBanner)) {
                return false;
            }
            OnStandardBanner onStandardBanner = (OnStandardBanner) obj;
            return Intrinsics.c(this.f21013a, onStandardBanner.f21013a) && Intrinsics.c(this.b, onStandardBanner.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21013a.hashCode() * 31);
        }

        public final String toString() {
            return "OnStandardBanner(__typename=" + this.f21013a + ", standardBannerFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$OnStandardOffersSection;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnStandardOffersSection {

        /* renamed from: a, reason: collision with root package name */
        public final String f21014a;
        public final String b;
        public final ArrayList c;

        public OnStandardOffersSection(String str, String str2, ArrayList arrayList) {
            this.f21014a = str;
            this.b = str2;
            this.c = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnStandardOffersSection)) {
                return false;
            }
            OnStandardOffersSection onStandardOffersSection = (OnStandardOffersSection) obj;
            return this.f21014a.equals(onStandardOffersSection.f21014a) && Intrinsics.c(this.b, onStandardOffersSection.b) && this.c.equals(onStandardOffersSection.c);
        }

        public final int hashCode() {
            int iHashCode = this.f21014a.hashCode() * 31;
            String str = this.b;
            return this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return android.support.v4.media.session.a.q(")", a.v("OnStandardOffersSection(sectionId=", this.f21014a, ", sectionTitle=", this.b, ", items="), this.c);
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OffersSectionsFragment$SectionCta;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class SectionCta {

        /* renamed from: a, reason: collision with root package name */
        public final String f21015a;
        public final ContentCtaFields b;

        public SectionCta(String str, ContentCtaFields contentCtaFields) {
            this.f21015a = str;
            this.b = contentCtaFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SectionCta)) {
                return false;
            }
            SectionCta sectionCta = (SectionCta) obj;
            return Intrinsics.c(this.f21015a, sectionCta.f21015a) && Intrinsics.c(this.b, sectionCta.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f21015a.hashCode() * 31);
        }

        public final String toString() {
            return "SectionCta(__typename=" + this.f21015a + ", contentCtaFields=" + this.b + ")";
        }
    }

    public OffersSectionsFragment(String __typename, OnStandardBanner onStandardBanner, OnMandyBanner onMandyBanner, OnNoOffersCard onNoOffersCard, OnStandardOffersSection onStandardOffersSection, OnProductOffersSection onProductOffersSection, OnSpinSurpriseBanner onSpinSurpriseBanner, OnPersonalisedOffersBanner onPersonalisedOffersBanner, OnOfferFeedInlineBanner onOfferFeedInlineBanner, OnRewardsCtaCard onRewardsCtaCard) {
        Intrinsics.h(__typename, "__typename");
        this.f20998a = __typename;
        this.b = onStandardBanner;
        this.c = onMandyBanner;
        this.d = onNoOffersCard;
        this.e = onStandardOffersSection;
        this.f = onProductOffersSection;
        this.g = onSpinSurpriseBanner;
        this.h = onPersonalisedOffersBanner;
        this.i = onOfferFeedInlineBanner;
        this.j = onRewardsCtaCard;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OffersSectionsFragment)) {
            return false;
        }
        OffersSectionsFragment offersSectionsFragment = (OffersSectionsFragment) obj;
        return Intrinsics.c(this.f20998a, offersSectionsFragment.f20998a) && Intrinsics.c(this.b, offersSectionsFragment.b) && Intrinsics.c(this.c, offersSectionsFragment.c) && Intrinsics.c(this.d, offersSectionsFragment.d) && Intrinsics.c(this.e, offersSectionsFragment.e) && Intrinsics.c(this.f, offersSectionsFragment.f) && Intrinsics.c(this.g, offersSectionsFragment.g) && Intrinsics.c(this.h, offersSectionsFragment.h) && Intrinsics.c(this.i, offersSectionsFragment.i) && Intrinsics.c(this.j, offersSectionsFragment.j);
    }

    public final int hashCode() {
        int iHashCode = this.f20998a.hashCode() * 31;
        OnStandardBanner onStandardBanner = this.b;
        int iHashCode2 = (iHashCode + (onStandardBanner == null ? 0 : onStandardBanner.hashCode())) * 31;
        OnMandyBanner onMandyBanner = this.c;
        int iHashCode3 = (iHashCode2 + (onMandyBanner == null ? 0 : onMandyBanner.hashCode())) * 31;
        OnNoOffersCard onNoOffersCard = this.d;
        int iHashCode4 = (iHashCode3 + (onNoOffersCard == null ? 0 : onNoOffersCard.hashCode())) * 31;
        OnStandardOffersSection onStandardOffersSection = this.e;
        int iHashCode5 = (iHashCode4 + (onStandardOffersSection == null ? 0 : onStandardOffersSection.hashCode())) * 31;
        OnProductOffersSection onProductOffersSection = this.f;
        int iHashCode6 = (iHashCode5 + (onProductOffersSection == null ? 0 : onProductOffersSection.hashCode())) * 31;
        OnSpinSurpriseBanner onSpinSurpriseBanner = this.g;
        int iHashCode7 = (iHashCode6 + (onSpinSurpriseBanner == null ? 0 : onSpinSurpriseBanner.hashCode())) * 31;
        OnPersonalisedOffersBanner onPersonalisedOffersBanner = this.h;
        int iHashCode8 = (iHashCode7 + (onPersonalisedOffersBanner == null ? 0 : onPersonalisedOffersBanner.hashCode())) * 31;
        OnOfferFeedInlineBanner onOfferFeedInlineBanner = this.i;
        int iHashCode9 = (iHashCode8 + (onOfferFeedInlineBanner == null ? 0 : onOfferFeedInlineBanner.hashCode())) * 31;
        OnRewardsCtaCard onRewardsCtaCard = this.j;
        return iHashCode9 + (onRewardsCtaCard != null ? onRewardsCtaCard.hashCode() : 0);
    }

    public final String toString() {
        return "OffersSectionsFragment(__typename=" + this.f20998a + ", onStandardBanner=" + this.b + ", onMandyBanner=" + this.c + ", onNoOffersCard=" + this.d + ", onStandardOffersSection=" + this.e + ", onProductOffersSection=" + this.f + ", onSpinSurpriseBanner=" + this.g + ", onPersonalisedOffersBanner=" + this.h + ", onOfferFeedInlineBanner=" + this.i + ", onRewardsCtaCard=" + this.j + ")";
    }
}
