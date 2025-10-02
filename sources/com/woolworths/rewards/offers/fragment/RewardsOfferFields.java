package com.woolworths.rewards.offers.fragment;

import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import au.com.woolworths.rewards.graphql.type.InsetBannerActionPlacement;
import au.com.woolworths.rewards.graphql.type.InsetBannerActionType;
import au.com.woolworths.rewards.graphql.type.InsetBannerDisplayType;
import au.com.woolworths.rewards.graphql.type.RewardsOfferStatus;
import com.apollographql.apollo.api.Fragment;
import com.woolworths.rewards.offers.fragment.fragment.StandardBannerFields;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields;", "Lcom/apollographql/apollo/api/Fragment$Data;", "StandardBanner", "BoostedOfferInsetBanner", "Mechanics", "StatusIcon", "OfferAnalytics", "ActivationMessage", "Roundel", "OfferListCta", "OfferDetailsCta", "OfferTileProgressTracker", "Action", "Item", "Cta", "Cta1", "CircularProgressIndicator", "PrimaryRing", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RewardsOfferFields implements Fragment.Data {
    public final OfferTileProgressTracker A;
    public final String B;

    /* renamed from: a, reason: collision with root package name */
    public final String f20940a;
    public final String b;
    public final String c;
    public final StandardBanner d;
    public final BoostedOfferInsetBanner e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final RewardsOfferStatus m;
    public final Mechanics n;
    public final String o;
    public final String p;
    public final List q;
    public final OfferAnalytics r;
    public final String s;
    public final String t;
    public final ActivationMessage u;
    public final String v;
    public final String w;
    public final Roundel x;
    public final OfferListCta y;
    public final OfferDetailsCta z;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$Action;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Action {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerActionPlacement f20941a;
        public final InsetBannerActionType b;
        public final String c;
        public final String d;
        public final String e;

        public Action(InsetBannerActionPlacement insetBannerActionPlacement, InsetBannerActionType insetBannerActionType, String str, String str2, String str3) {
            this.f20941a = insetBannerActionPlacement;
            this.b = insetBannerActionType;
            this.c = str;
            this.d = str2;
            this.e = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Action)) {
                return false;
            }
            Action action = (Action) obj;
            return this.f20941a == action.f20941a && this.b == action.b && Intrinsics.c(this.c, action.c) && Intrinsics.c(this.d, action.d) && Intrinsics.c(this.e, action.e);
        }

        public final int hashCode() {
            int iC = b.c((this.b.hashCode() + (this.f20941a.hashCode() * 31)) * 31, 31, this.c);
            String str = this.d;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Action(placement=");
            sb.append(this.f20941a);
            sb.append(", type=");
            sb.append(this.b);
            sb.append(", label=");
            a.B(sb, this.c, ", url=", this.d, ", actionAccessibilityHint=");
            return YU.a.o(sb, this.e, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$ActivationMessage;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class ActivationMessage {

        /* renamed from: a, reason: collision with root package name */
        public final String f20942a;
        public final String b;
        public final String c;

        public ActivationMessage(String str, String str2, String str3) {
            this.f20942a = str;
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
            return Intrinsics.c(this.f20942a, activationMessage.f20942a) && Intrinsics.c(this.b, activationMessage.b) && Intrinsics.c(this.c, activationMessage.c);
        }

        public final int hashCode() {
            String str = this.f20942a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return this.c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            return YU.a.o(YU.a.v("ActivationMessage(title=", this.f20942a, ", message=", this.b, ", buttonLabel="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$BoostedOfferInsetBanner;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BoostedOfferInsetBanner {

        /* renamed from: a, reason: collision with root package name */
        public final InsetBannerDisplayType f20943a;
        public final String b;
        public final String c;
        public final String d;
        public final Action e;

        public BoostedOfferInsetBanner(InsetBannerDisplayType insetBannerDisplayType, String str, String str2, String str3, Action action) {
            this.f20943a = insetBannerDisplayType;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = action;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BoostedOfferInsetBanner)) {
                return false;
            }
            BoostedOfferInsetBanner boostedOfferInsetBanner = (BoostedOfferInsetBanner) obj;
            return this.f20943a == boostedOfferInsetBanner.f20943a && Intrinsics.c(this.b, boostedOfferInsetBanner.b) && Intrinsics.c(this.c, boostedOfferInsetBanner.c) && Intrinsics.c(this.d, boostedOfferInsetBanner.d) && Intrinsics.c(this.e, boostedOfferInsetBanner.e);
        }

        public final int hashCode() {
            int iC = b.c(this.f20943a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Action action = this.e;
            return iHashCode2 + (action != null ? action.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BoostedOfferInsetBanner(displayType=");
            sb.append(this.f20943a);
            sb.append(", message=");
            sb.append(this.b);
            sb.append(", title=");
            a.B(sb, this.c, ", iconUrl=", this.d, ", action=");
            sb.append(this.e);
            sb.append(")");
            return sb.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$CircularProgressIndicator;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class CircularProgressIndicator {

        /* renamed from: a, reason: collision with root package name */
        public final PrimaryRing f20944a;

        public CircularProgressIndicator(PrimaryRing primaryRing) {
            this.f20944a = primaryRing;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof CircularProgressIndicator) && Intrinsics.c(this.f20944a, ((CircularProgressIndicator) obj).f20944a);
        }

        public final int hashCode() {
            return this.f20944a.hashCode();
        }

        public final String toString() {
            return "CircularProgressIndicator(primaryRing=" + this.f20944a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$Cta;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cta {

        /* renamed from: a, reason: collision with root package name */
        public final String f20945a;
        public final String b;
        public final Boolean c;

        public Cta(Boolean bool, String str, String str2) {
            this.f20945a = str;
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
            return Intrinsics.c(this.f20945a, cta.f20945a) && Intrinsics.c(this.b, cta.b) && Intrinsics.c(this.c, cta.c);
        }

        public final int hashCode() {
            int iHashCode = this.f20945a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.c;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.o(YU.a.v("Cta(label=", this.f20945a, ", url=", this.b, ", isExternalUrl="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$Cta1;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cta1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f20946a;
        public final String b;
        public final Boolean c;

        public Cta1(Boolean bool, String str, String str2) {
            this.f20946a = str;
            this.b = str2;
            this.c = bool;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cta1)) {
                return false;
            }
            Cta1 cta1 = (Cta1) obj;
            return Intrinsics.c(this.f20946a, cta1.f20946a) && Intrinsics.c(this.b, cta1.b) && Intrinsics.c(this.c, cta1.c);
        }

        public final int hashCode() {
            int iHashCode = this.f20946a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            Boolean bool = this.c;
            return iHashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            return au.com.woolworths.android.onesite.a.o(YU.a.v("Cta1(label=", this.f20946a, ", url=", this.b, ", isExternalUrl="), this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$Item;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Item {

        /* renamed from: a, reason: collision with root package name */
        public final String f20947a;
        public final String b;
        public final String c;
        public final String d;

        public Item(String str, String str2, String str3, String str4) {
            this.f20947a = str;
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
            return Intrinsics.c(this.f20947a, item.f20947a) && Intrinsics.c(this.b, item.b) && Intrinsics.c(this.c, item.c) && Intrinsics.c(this.d, item.d);
        }

        public final int hashCode() {
            int iC = b.c(this.f20947a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return this.d.hashCode() + ((iC + (str == null ? 0 : str.hashCode())) * 31);
        }

        public final String toString() {
            return a.l(YU.a.v("Item(icon=", this.f20947a, ", caption=", this.b, ", altText="), this.c, ", title=", this.d, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$Mechanics;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Mechanics {

        /* renamed from: a, reason: collision with root package name */
        public final String f20948a;
        public final String b;
        public final int c;
        public final ArrayList d;

        public Mechanics(String str, String str2, int i, ArrayList arrayList) {
            this.f20948a = str;
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
            return this.f20948a.equals(mechanics.f20948a) && this.b.equals(mechanics.b) && this.c == mechanics.c && this.d.equals(mechanics.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + b.a(this.c, b.c(this.f20948a.hashCode() * 31, 31, this.b), 31);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("Mechanics(displayLastUpdated=", this.f20948a, ", separator=", this.b, ", selectedIndex=");
            sbV.append(this.c);
            sbV.append(", items=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$OfferAnalytics;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f20949a;
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
            this.f20949a = str;
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
            return Intrinsics.c(this.f20949a, offerAnalytics.f20949a) && Intrinsics.c(this.b, offerAnalytics.b) && Intrinsics.c(this.c, offerAnalytics.c) && Intrinsics.c(this.d, offerAnalytics.d) && Intrinsics.c(this.e, offerAnalytics.e) && Intrinsics.c(this.f, offerAnalytics.f) && Intrinsics.c(this.g, offerAnalytics.g) && Intrinsics.c(this.h, offerAnalytics.h) && Intrinsics.c(this.i, offerAnalytics.i) && Intrinsics.c(this.j, offerAnalytics.j) && Intrinsics.c(this.k, offerAnalytics.k) && Intrinsics.c(this.l, offerAnalytics.l) && Intrinsics.c(this.m, offerAnalytics.m) && Intrinsics.c(this.n, offerAnalytics.n);
        }

        public final int hashCode() {
            String str = this.f20949a;
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
            StringBuilder sbV = YU.a.v("OfferAnalytics(offerName=", this.f20949a, ", commId=", this.b, ", uoid=");
            a.B(sbV, this.c, ", campaignCode=", this.d, ", campaignStream=");
            a.B(sbV, this.e, ", channel=", this.f, ", status=");
            a.B(sbV, this.g, ", offerType=", this.h, ", partnerId=");
            a.B(sbV, this.i, ", rtlAccountID=", this.j, ", rtlCampaignID=");
            a.B(sbV, this.k, ", rtlCampaignCode=", this.l, ", rtlCouponStart=");
            return a.l(sbV, this.m, ", profile=", this.n, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$OfferDetailsCta;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferDetailsCta {

        /* renamed from: a, reason: collision with root package name */
        public final Cta1 f20950a;
        public final String b;

        public OfferDetailsCta(Cta1 cta1, String str) {
            this.f20950a = cta1;
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
            return Intrinsics.c(this.f20950a, offerDetailsCta.f20950a) && Intrinsics.c(this.b, offerDetailsCta.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20950a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "OfferDetailsCta(cta=" + this.f20950a + ", displayStatus=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$OfferListCta;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferListCta {

        /* renamed from: a, reason: collision with root package name */
        public final Cta f20951a;
        public final String b;

        public OfferListCta(Cta cta, String str) {
            this.f20951a = cta;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferListCta)) {
                return false;
            }
            OfferListCta offerListCta = (OfferListCta) obj;
            return Intrinsics.c(this.f20951a, offerListCta.f20951a) && Intrinsics.c(this.b, offerListCta.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20951a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return "OfferListCta(cta=" + this.f20951a + ", displayStatus=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$OfferTileProgressTracker;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferTileProgressTracker {

        /* renamed from: a, reason: collision with root package name */
        public final String f20952a;
        public final String b;
        public final String c;
        public final CircularProgressIndicator d;

        public OfferTileProgressTracker(String str, String str2, String str3, CircularProgressIndicator circularProgressIndicator) {
            this.f20952a = str;
            this.b = str2;
            this.c = str3;
            this.d = circularProgressIndicator;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OfferTileProgressTracker)) {
                return false;
            }
            OfferTileProgressTracker offerTileProgressTracker = (OfferTileProgressTracker) obj;
            return Intrinsics.c(this.f20952a, offerTileProgressTracker.f20952a) && Intrinsics.c(this.b, offerTileProgressTracker.b) && Intrinsics.c(this.c, offerTileProgressTracker.c) && Intrinsics.c(this.d, offerTileProgressTracker.d);
        }

        public final int hashCode() {
            int iHashCode = this.f20952a.hashCode() * 31;
            String str = this.b;
            return this.d.f20944a.hashCode() + b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        }

        public final String toString() {
            StringBuilder sbV = YU.a.v("OfferTileProgressTracker(title=", this.f20952a, ", titleSuffix=", this.b, ", description=");
            sbV.append(this.c);
            sbV.append(", circularProgressIndicator=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$PrimaryRing;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class PrimaryRing {

        /* renamed from: a, reason: collision with root package name */
        public final double f20953a;
        public final String b;

        public PrimaryRing(double d, String str) {
            this.f20953a = d;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PrimaryRing)) {
                return false;
            }
            PrimaryRing primaryRing = (PrimaryRing) obj;
            return Double.compare(this.f20953a, primaryRing.f20953a) == 0 && Intrinsics.c(this.b, primaryRing.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Double.hashCode(this.f20953a) * 31);
        }

        public final String toString() {
            return "PrimaryRing(ringPercent=" + this.f20953a + ", ringColor=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$Roundel;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Roundel {

        /* renamed from: a, reason: collision with root package name */
        public final String f20954a;
        public final IconAsset b;

        public Roundel(String str, IconAsset iconAsset) {
            this.f20954a = str;
            this.b = iconAsset;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Roundel)) {
                return false;
            }
            Roundel roundel = (Roundel) obj;
            return Intrinsics.c(this.f20954a, roundel.f20954a) && Intrinsics.c(this.b, roundel.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20954a.hashCode() * 31);
        }

        public final String toString() {
            return "Roundel(__typename=" + this.f20954a + ", iconAsset=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$StandardBanner;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StandardBanner {

        /* renamed from: a, reason: collision with root package name */
        public final String f20955a;
        public final StandardBannerFields b;

        public StandardBanner(String str, StandardBannerFields standardBannerFields) {
            this.f20955a = str;
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
            return Intrinsics.c(this.f20955a, standardBanner.f20955a) && Intrinsics.c(this.b, standardBanner.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20955a.hashCode() * 31);
        }

        public final String toString() {
            return "StandardBanner(__typename=" + this.f20955a + ", standardBannerFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/fragment/RewardsOfferFields$StatusIcon;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StatusIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f20956a;

        public StatusIcon(String str) {
            this.f20956a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StatusIcon) && Intrinsics.c(this.f20956a, ((StatusIcon) obj).f20956a);
        }

        public final int hashCode() {
            return this.f20956a.hashCode();
        }

        public final String toString() {
            return YU.a.h("StatusIcon(icon=", this.f20956a, ")");
        }
    }

    public RewardsOfferFields(String str, String str2, String str3, StandardBanner standardBanner, BoostedOfferInsetBanner boostedOfferInsetBanner, String str4, String str5, String str6, String str7, String str8, String str9, String str10, RewardsOfferStatus rewardsOfferStatus, Mechanics mechanics, String str11, String str12, List list, OfferAnalytics offerAnalytics, String str13, String str14, ActivationMessage activationMessage, String str15, String str16, Roundel roundel, OfferListCta offerListCta, OfferDetailsCta offerDetailsCta, OfferTileProgressTracker offerTileProgressTracker, String str17) {
        this.f20940a = str;
        this.b = str2;
        this.c = str3;
        this.d = standardBanner;
        this.e = boostedOfferInsetBanner;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = str10;
        this.m = rewardsOfferStatus;
        this.n = mechanics;
        this.o = str11;
        this.p = str12;
        this.q = list;
        this.r = offerAnalytics;
        this.s = str13;
        this.t = str14;
        this.u = activationMessage;
        this.v = str15;
        this.w = str16;
        this.x = roundel;
        this.y = offerListCta;
        this.z = offerDetailsCta;
        this.A = offerTileProgressTracker;
        this.B = str17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsOfferFields)) {
            return false;
        }
        RewardsOfferFields rewardsOfferFields = (RewardsOfferFields) obj;
        return Intrinsics.c(this.f20940a, rewardsOfferFields.f20940a) && Intrinsics.c(this.b, rewardsOfferFields.b) && Intrinsics.c(this.c, rewardsOfferFields.c) && Intrinsics.c(this.d, rewardsOfferFields.d) && Intrinsics.c(this.e, rewardsOfferFields.e) && Intrinsics.c(this.f, rewardsOfferFields.f) && Intrinsics.c(this.g, rewardsOfferFields.g) && Intrinsics.c(this.h, rewardsOfferFields.h) && Intrinsics.c(this.i, rewardsOfferFields.i) && Intrinsics.c(this.j, rewardsOfferFields.j) && Intrinsics.c(this.k, rewardsOfferFields.k) && Intrinsics.c(this.l, rewardsOfferFields.l) && this.m == rewardsOfferFields.m && Intrinsics.c(this.n, rewardsOfferFields.n) && Intrinsics.c(this.o, rewardsOfferFields.o) && Intrinsics.c(this.p, rewardsOfferFields.p) && Intrinsics.c(this.q, rewardsOfferFields.q) && Intrinsics.c(this.r, rewardsOfferFields.r) && Intrinsics.c(this.s, rewardsOfferFields.s) && Intrinsics.c(this.t, rewardsOfferFields.t) && Intrinsics.c(this.u, rewardsOfferFields.u) && Intrinsics.c(this.v, rewardsOfferFields.v) && Intrinsics.c(this.w, rewardsOfferFields.w) && Intrinsics.c(this.x, rewardsOfferFields.x) && Intrinsics.c(this.y, rewardsOfferFields.y) && Intrinsics.c(this.z, rewardsOfferFields.z) && Intrinsics.c(this.A, rewardsOfferFields.A) && Intrinsics.c(this.B, rewardsOfferFields.B);
    }

    public final int hashCode() {
        int iC = b.c(this.f20940a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        StandardBanner standardBanner = this.d;
        int iHashCode2 = (iHashCode + (standardBanner == null ? 0 : standardBanner.hashCode())) * 31;
        BoostedOfferInsetBanner boostedOfferInsetBanner = this.e;
        int iC2 = b.c(b.c((iHashCode2 + (boostedOfferInsetBanner == null ? 0 : boostedOfferInsetBanner.hashCode())) * 31, 31, this.f), 31, this.g);
        String str2 = this.h;
        int iHashCode3 = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.j;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.k;
        int iHashCode6 = (this.m.hashCode() + b.c((iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.l)) * 31;
        Mechanics mechanics = this.n;
        int iC3 = b.c((iHashCode6 + (mechanics == null ? 0 : mechanics.hashCode())) * 31, 31, this.o);
        String str6 = this.p;
        int iHashCode7 = (iC3 + (str6 == null ? 0 : str6.hashCode())) * 31;
        List list = this.q;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        OfferAnalytics offerAnalytics = this.r;
        int iHashCode9 = (iHashCode8 + (offerAnalytics == null ? 0 : offerAnalytics.hashCode())) * 31;
        String str7 = this.s;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.t;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        ActivationMessage activationMessage = this.u;
        int iHashCode12 = (iHashCode11 + (activationMessage == null ? 0 : activationMessage.hashCode())) * 31;
        String str9 = this.v;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.w;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Roundel roundel = this.x;
        int iHashCode15 = (iHashCode14 + (roundel == null ? 0 : roundel.hashCode())) * 31;
        OfferListCta offerListCta = this.y;
        int iHashCode16 = (iHashCode15 + (offerListCta == null ? 0 : offerListCta.hashCode())) * 31;
        OfferDetailsCta offerDetailsCta = this.z;
        int iHashCode17 = (iHashCode16 + (offerDetailsCta == null ? 0 : offerDetailsCta.hashCode())) * 31;
        OfferTileProgressTracker offerTileProgressTracker = this.A;
        int iHashCode18 = (iHashCode17 + (offerTileProgressTracker == null ? 0 : offerTileProgressTracker.hashCode())) * 31;
        String str11 = this.B;
        return iHashCode18 + (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("RewardsOfferFields(offerId=", this.f20940a, ", image=", this.b, ", bannerUrl=");
        sbV.append(this.c);
        sbV.append(", standardBanner=");
        sbV.append(this.d);
        sbV.append(", boostedOfferInsetBanner=");
        sbV.append(this.e);
        sbV.append(", title=");
        sbV.append(this.f);
        sbV.append(", subtitle=");
        a.B(sbV, this.g, ", summary=", this.h, ", body=");
        a.B(sbV, this.i, ", formattedTermsAndConditions=", this.j, ", markdownTermsAndConditions=");
        a.B(sbV, this.k, ", displayStatus=", this.l, ", offerStatus=");
        sbV.append(this.m);
        sbV.append(", mechanics=");
        sbV.append(this.n);
        sbV.append(", displayExpiry=");
        a.B(sbV, this.o, ", displayExpiryExtended=", this.p, ", statusIcons=");
        sbV.append(this.q);
        sbV.append(", offerAnalytics=");
        sbV.append(this.r);
        sbV.append(", activationAnimation=");
        a.B(sbV, this.s, ", displayAnimation=", this.t, ", activationMessage=");
        sbV.append(this.u);
        sbV.append(", brandLogoUrl=");
        sbV.append(this.v);
        sbV.append(", brandLogoUrlCompact=");
        sbV.append(this.w);
        sbV.append(", roundel=");
        sbV.append(this.x);
        sbV.append(", offerListCta=");
        sbV.append(this.y);
        sbV.append(", offerDetailsCta=");
        sbV.append(this.z);
        sbV.append(", offerTileProgressTracker=");
        sbV.append(this.A);
        sbV.append(", offerTileAltText=");
        sbV.append(this.B);
        sbV.append(")");
        return sbV.toString();
    }
}
