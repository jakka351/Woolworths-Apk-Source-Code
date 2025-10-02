package com.woolworths.rewards.offers.fragment.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.graphql.type.RewardsOfferStatus;
import com.apollographql.apollo.api.Fragment;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Mechanics", "StatusIcon", "OfferAnalytics", "ActivationMessage", "OnRewardsOffer", "Item", "OfferDetailsCta", "Cta", "StandardBanner", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class OfferDetailsFragment implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final String f20978a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final RewardsOfferStatus m;
    public final String n;
    public final Mechanics o;
    public final ArrayList p;
    public final OfferAnalytics q;
    public final String r;
    public final String s;
    public final ActivationMessage t;
    public final OnRewardsOffer u;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragment$ActivationMessage;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActivationMessage {

        /* renamed from: a, reason: collision with root package name */
        public final String f20979a;
        public final String b;
        public final String c;

        public ActivationMessage(String str, String str2, String str3) {
            this.f20979a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActivationMessage)) {
                return false;
            }
            ActivationMessage activationMessage = (ActivationMessage) obj;
            return Intrinsics.c(this.f20979a, activationMessage.f20979a) && Intrinsics.c(this.b, activationMessage.b) && Intrinsics.c(this.c, activationMessage.c);
        }

        public final int hashCode() {
            String str = this.f20979a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return a.o(a.v("ActivationMessage(title=", this.f20979a, ", message=", this.b, ", buttonLabel="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragment$Cta;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cta {

        /* renamed from: a, reason: collision with root package name */
        public final String f20980a;
        public final String b;
        public final Boolean c;

        public Cta(Boolean bool, String str, String str2) {
            this.f20980a = str;
            this.b = str2;
            this.c = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cta)) {
                return false;
            }
            Cta cta = (Cta) obj;
            return Intrinsics.c(this.f20980a, cta.f20980a) && Intrinsics.c(this.b, cta.b) && Intrinsics.c(this.c, cta.c);
        }

        public final int hashCode() {
            int iHashCode = this.f20980a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.c;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.o(a.v("Cta(label=", this.f20980a, ", url=", this.b, ", isExternalUrl="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragment$Item;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f20981a;
        public final String b;
        public final String c;
        public final String d;

        public Item(String str, String str2, String str3, String str4) {
            this.f20981a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return Intrinsics.c(this.f20981a, item.f20981a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c) && Intrinsics.c(this.d, item.d);
        }

        public final int hashCode() {
            int iC = b.c(this.f20981a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return androidx.constraintlayout.core.state.a.l(a.v("Item(icon=", this.f20981a, ", caption=", this.b, ", altText="), this.c, ", title=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragment$Mechanics;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Mechanics {

        /* renamed from: a, reason: collision with root package name */
        public final String f20982a;
        public final String b;
        public final int c;
        public final ArrayList d;

        public Mechanics(String str, String str2, int i, ArrayList arrayList) {
            this.f20982a = str;
            this.b = str2;
            this.c = i;
            this.d = arrayList;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Mechanics)) {
                return false;
            }
            Mechanics mechanics = (Mechanics) obj;
            return this.f20982a.equals(mechanics.f20982a) && this.b.equals(mechanics.b) && this.c == mechanics.c && this.d.equals(mechanics.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + b.a(this.c, b.c(this.f20982a.hashCode() * 31, 31, this.b), 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("Mechanics(displayLastUpdated=", this.f20982a, ", separator=", this.b, ", selectedIndex=");
            sbV.append(this.c);
            sbV.append(", items=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragment$OfferAnalytics;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f20983a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final String j;
        public final String k;
        public final String l;
        public final String m;
        public final String n;

        public OfferAnalytics(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            this.f20983a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
            this.e = str5;
            this.f = str6;
            this.g = str7;
            this.h = str8;
            this.i = str9;
            this.j = str10;
            this.k = str11;
            this.l = str12;
            this.m = str13;
            this.n = str14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferAnalytics)) {
                return false;
            }
            OfferAnalytics offerAnalytics = (OfferAnalytics) obj;
            return Intrinsics.c(this.f20983a, offerAnalytics.f20983a) && Intrinsics.c(this.b, offerAnalytics.b) && Intrinsics.c(this.c, offerAnalytics.c) && Intrinsics.c(this.d, offerAnalytics.d) && Intrinsics.c(this.e, offerAnalytics.e) && Intrinsics.c(this.f, offerAnalytics.f) && Intrinsics.c(this.g, offerAnalytics.g) && Intrinsics.c(this.h, offerAnalytics.h) && Intrinsics.c(this.i, offerAnalytics.i) && Intrinsics.c(this.j, offerAnalytics.j) && Intrinsics.c(this.k, offerAnalytics.k) && Intrinsics.c(this.l, offerAnalytics.l) && Intrinsics.c(this.m, offerAnalytics.m) && Intrinsics.c(this.n, offerAnalytics.n);
        }

        public final int hashCode() {
            String str = this.f20983a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.d;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.e;
            int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f;
            int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.g;
            int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
            String str8 = this.h;
            int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
            String str9 = this.i;
            int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
            String str10 = this.j;
            int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
            String str11 = this.k;
            int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
            String str12 = this.l;
            int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
            String str13 = this.m;
            int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
            String str14 = this.n;
            return iHashCode13 + (str14 != null ? str14.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sbV = a.v("OfferAnalytics(offerName=", this.f20983a, ", commId=", this.b, ", uoid=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", campaignCode=", this.d, ", campaignStream=");
            androidx.constraintlayout.core.state.a.B(sbV, this.e, ", channel=", this.f, ", status=");
            androidx.constraintlayout.core.state.a.B(sbV, this.g, ", offerType=", this.h, ", partnerId=");
            androidx.constraintlayout.core.state.a.B(sbV, this.i, ", rtlAccountID=", this.j, ", rtlCampaignID=");
            androidx.constraintlayout.core.state.a.B(sbV, this.k, ", rtlCampaignCode=", this.l, ", rtlCouponStart=");
            return androidx.constraintlayout.core.state.a.l(sbV, this.m, ", profile=", this.n, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragment$OfferDetailsCta;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferDetailsCta {

        /* renamed from: a, reason: collision with root package name */
        public final Cta f20984a;
        public final String b;

        public OfferDetailsCta(Cta cta, String str) {
            this.f20984a = cta;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferDetailsCta)) {
                return false;
            }
            OfferDetailsCta offerDetailsCta = (OfferDetailsCta) obj;
            return Intrinsics.c(this.f20984a, offerDetailsCta.f20984a) && Intrinsics.c(this.b, offerDetailsCta.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20984a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "OfferDetailsCta(cta=" + this.f20984a + ", displayStatus=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragment$OnRewardsOffer;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnRewardsOffer {

        /* renamed from: a, reason: collision with root package name */
        public final String f20985a;
        public final OfferDetailsCta b;
        public final StandardBanner c;

        public OnRewardsOffer(String str, OfferDetailsCta offerDetailsCta, StandardBanner standardBanner) {
            this.f20985a = str;
            this.b = offerDetailsCta;
            this.c = standardBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnRewardsOffer)) {
                return false;
            }
            OnRewardsOffer onRewardsOffer = (OnRewardsOffer) obj;
            return Intrinsics.c(this.f20985a, onRewardsOffer.f20985a) && Intrinsics.c(this.b, onRewardsOffer.b) && Intrinsics.c(this.c, onRewardsOffer.c);
        }

        public final int hashCode() {
            String str = this.f20985a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            OfferDetailsCta offerDetailsCta = this.b;
            int iHashCode2 = (iHashCode + (offerDetailsCta == null ? 0 : offerDetailsCta.hashCode())) * 31;
            StandardBanner standardBanner = this.c;
            return iHashCode2 + (standardBanner != null ? standardBanner.hashCode() : 0);
        }

        public final String toString() {
            return "OnRewardsOffer(displayExpiryExtended=" + this.f20985a + ", offerDetailsCta=" + this.b + ", standardBanner=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragment$StandardBanner;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StandardBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f20986a;
        public final StandardBannerFields b;

        public StandardBanner(String str, StandardBannerFields standardBannerFields) {
            this.f20986a = str;
            this.b = standardBannerFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StandardBanner)) {
                return false;
            }
            StandardBanner standardBanner = (StandardBanner) obj;
            return Intrinsics.c(this.f20986a, standardBanner.f20986a) && Intrinsics.c(this.b, standardBanner.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20986a.hashCode() * 31);
        }

        public final String toString() {
            return "StandardBanner(__typename=" + this.f20986a + ", standardBannerFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/fragment/OfferDetailsFragment$StatusIcon;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StatusIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f20987a;

        public StatusIcon(String str) {
            this.f20987a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StatusIcon) && Intrinsics.c(this.f20987a, ((StatusIcon) obj).f20987a);
        }

        public final int hashCode() {
            return this.f20987a.hashCode();
        }

        public final String toString() {
            return a.h("StatusIcon(icon=", this.f20987a, ")");
        }
    }

    public OfferDetailsFragment(String __typename, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, RewardsOfferStatus rewardsOfferStatus, String str12, Mechanics mechanics, ArrayList arrayList, OfferAnalytics offerAnalytics, String str13, String str14, ActivationMessage activationMessage, OnRewardsOffer onRewardsOffer) {
        Intrinsics.h(__typename, "__typename");
        this.f20978a = __typename;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
        this.k = str10;
        this.l = str11;
        this.m = rewardsOfferStatus;
        this.n = str12;
        this.o = mechanics;
        this.p = arrayList;
        this.q = offerAnalytics;
        this.r = str13;
        this.s = str14;
        this.t = activationMessage;
        this.u = onRewardsOffer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferDetailsFragment)) {
            return false;
        }
        OfferDetailsFragment offerDetailsFragment = (OfferDetailsFragment) obj;
        return Intrinsics.c(this.f20978a, offerDetailsFragment.f20978a) && this.b.equals(offerDetailsFragment.b) && this.c.equals(offerDetailsFragment.c) && Intrinsics.c(this.d, offerDetailsFragment.d) && this.e.equals(offerDetailsFragment.e) && this.f.equals(offerDetailsFragment.f) && Intrinsics.c(this.g, offerDetailsFragment.g) && Intrinsics.c(this.h, offerDetailsFragment.h) && Intrinsics.c(this.i, offerDetailsFragment.i) && Intrinsics.c(this.j, offerDetailsFragment.j) && this.k.equals(offerDetailsFragment.k) && this.l.equals(offerDetailsFragment.l) && this.m == offerDetailsFragment.m && Intrinsics.c(this.n, offerDetailsFragment.n) && Intrinsics.c(this.o, offerDetailsFragment.o) && this.p.equals(offerDetailsFragment.p) && Intrinsics.c(this.q, offerDetailsFragment.q) && Intrinsics.c(this.r, offerDetailsFragment.r) && Intrinsics.c(this.s, offerDetailsFragment.s) && Intrinsics.c(this.t, offerDetailsFragment.t) && Intrinsics.c(this.u, offerDetailsFragment.u);
    }

    public final int hashCode() {
        int iC = b.c(b.c(this.f20978a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int iC2 = b.c(b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f);
        String str2 = this.g;
        int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.i;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        int iHashCode4 = (this.m.hashCode() + b.c(b.c((iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.k), 31, this.l)) * 31;
        String str6 = this.n;
        int iHashCode5 = (iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Mechanics mechanics = this.o;
        int iB = androidx.compose.ui.input.pointer.a.b((iHashCode5 + (mechanics == null ? 0 : mechanics.hashCode())) * 31, 31, this.p);
        OfferAnalytics offerAnalytics = this.q;
        int iHashCode6 = (iB + (offerAnalytics == null ? 0 : offerAnalytics.hashCode())) * 31;
        String str7 = this.r;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.s;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        ActivationMessage activationMessage = this.t;
        int iHashCode9 = (iHashCode8 + (activationMessage == null ? 0 : activationMessage.hashCode())) * 31;
        OnRewardsOffer onRewardsOffer = this.u;
        return iHashCode9 + (onRewardsOffer != null ? onRewardsOffer.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = a.v("OfferDetailsFragment(__typename=", this.f20978a, ", offerId=", this.b, ", image=");
        androidx.constraintlayout.core.state.a.B(sbV, this.c, ", bannerUrl=", this.d, ", title=");
        androidx.constraintlayout.core.state.a.B(sbV, this.e, ", subtitle=", this.f, ", summary=");
        androidx.constraintlayout.core.state.a.B(sbV, this.g, ", body=", this.h, ", formattedTermsAndConditions=");
        androidx.constraintlayout.core.state.a.B(sbV, this.i, ", markdownTermsAndConditions=", this.j, ", displayExpiry=");
        androidx.constraintlayout.core.state.a.B(sbV, this.k, ", displayStatus=", this.l, ", offerStatus=");
        sbV.append(this.m);
        sbV.append(", brandLogoUrl=");
        sbV.append(this.n);
        sbV.append(", mechanics=");
        sbV.append(this.o);
        sbV.append(", statusIcons=");
        sbV.append(this.p);
        sbV.append(", offerAnalytics=");
        sbV.append(this.q);
        sbV.append(", activationAnimation=");
        sbV.append(this.r);
        sbV.append(", displayAnimation=");
        sbV.append(this.s);
        sbV.append(", activationMessage=");
        sbV.append(this.t);
        sbV.append(", onRewardsOffer=");
        sbV.append(this.u);
        sbV.append(")");
        return sbV.toString();
    }
}
