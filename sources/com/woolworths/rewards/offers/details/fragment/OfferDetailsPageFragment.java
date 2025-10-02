package com.woolworths.rewards.offers.details.fragment;

import YU.a;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.rewards.graphql.type.ActionType;
import au.com.woolworths.rewards.graphql.type.CoreBroadcastBannerStyle;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetFit;
import au.com.woolworths.rewards.graphql.type.DownloadableAssetType;
import au.com.woolworths.rewards.graphql.type.LocalAssetIconName;
import au.com.woolworths.rewards.graphql.type.RewardsOfferStatus;
import com.apollographql.apollo.api.Fragment;
import com.woolworths.rewards.offers.fragment.IconAsset;
import com.woolworths.rewards.offers.fragment.fragment.ContentCtaFields;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u0013\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment;", "Lcom/apollographql/apollo/api/Fragment$Data;", "Header", "Content", "Footer", "OfferAnalytics", "HeroAsset", "LeafAsset", "OnLocalAsset", "OnHostedIcon", "RoundelAsset", "StatusBadge", "BroadcastBanner", "BroadcastBannerUI", "Icon", "OnHostedIcon1", "BroadcastBannerAction", "OnOfferDetailsCard", "OnOfferDetailsFooter", "Cta", "StatusBadge1", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class OfferDetailsPageFragment implements Fragment.Data {

    /* renamed from: a, reason: collision with root package name */
    public final Header f20842a;
    public final ArrayList b;
    public final Footer c;
    public final OfferAnalytics d;

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$BroadcastBanner;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BroadcastBanner {

        /* renamed from: a, reason: collision with root package name */
        public final BroadcastBannerUI f20843a;
        public final BroadcastBannerAction b;
        public final String c;

        public BroadcastBanner(BroadcastBannerUI broadcastBannerUI, BroadcastBannerAction broadcastBannerAction, String str) {
            this.f20843a = broadcastBannerUI;
            this.b = broadcastBannerAction;
            this.c = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BroadcastBanner)) {
                return false;
            }
            BroadcastBanner broadcastBanner = (BroadcastBanner) obj;
            return Intrinsics.c(this.f20843a, broadcastBanner.f20843a) && Intrinsics.c(this.b, broadcastBanner.b) && Intrinsics.c(this.c, broadcastBanner.c);
        }

        public final int hashCode() {
            int iHashCode = this.f20843a.hashCode() * 31;
            BroadcastBannerAction broadcastBannerAction = this.b;
            int iHashCode2 = (iHashCode + (broadcastBannerAction == null ? 0 : broadcastBannerAction.hashCode())) * 31;
            String str = this.c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BroadcastBanner(broadcastBannerUI=");
            sb.append(this.f20843a);
            sb.append(", broadcastBannerAction=");
            sb.append(this.b);
            sb.append(", broadcastBannerActionLabel=");
            return a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$BroadcastBannerAction;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BroadcastBannerAction {

        /* renamed from: a, reason: collision with root package name */
        public final String f20844a;
        public final ActionType b;
        public final String c;

        public BroadcastBannerAction(String str, ActionType actionType, String str2) {
            this.f20844a = str;
            this.b = actionType;
            this.c = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BroadcastBannerAction)) {
                return false;
            }
            BroadcastBannerAction broadcastBannerAction = (BroadcastBannerAction) obj;
            return Intrinsics.c(this.f20844a, broadcastBannerAction.f20844a) && this.b == broadcastBannerAction.b && Intrinsics.c(this.c, broadcastBannerAction.c);
        }

        public final int hashCode() {
            String str = this.f20844a;
            return this.c.hashCode() + ((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BroadcastBannerAction(id=");
            sb.append(this.f20844a);
            sb.append(", type=");
            sb.append(this.b);
            sb.append(", action=");
            return a.o(sb, this.c, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$BroadcastBannerUI;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class BroadcastBannerUI {

        /* renamed from: a, reason: collision with root package name */
        public final String f20845a;
        public final String b;
        public final CoreBroadcastBannerStyle c;
        public final Icon d;

        public BroadcastBannerUI(String str, String str2, CoreBroadcastBannerStyle coreBroadcastBannerStyle, Icon icon) {
            this.f20845a = str;
            this.b = str2;
            this.c = coreBroadcastBannerStyle;
            this.d = icon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BroadcastBannerUI)) {
                return false;
            }
            BroadcastBannerUI broadcastBannerUI = (BroadcastBannerUI) obj;
            return Intrinsics.c(this.f20845a, broadcastBannerUI.f20845a) && Intrinsics.c(this.b, broadcastBannerUI.b) && this.c == broadcastBannerUI.c && Intrinsics.c(this.d, broadcastBannerUI.d);
        }

        public final int hashCode() {
            int iHashCode = this.f20845a.hashCode() * 31;
            String str = this.b;
            return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }

        public final String toString() {
            StringBuilder sbV = a.v("BroadcastBannerUI(title=", this.f20845a, ", subtitle=", this.b, ", style=");
            sbV.append(this.c);
            sbV.append(", icon=");
            sbV.append(this.d);
            sbV.append(")");
            return sbV.toString();
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$Content;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Content {

        /* renamed from: a, reason: collision with root package name */
        public final String f20846a;
        public final OnOfferDetailsCard b;

        public Content(String __typename, OnOfferDetailsCard onOfferDetailsCard) {
            Intrinsics.h(__typename, "__typename");
            this.f20846a = __typename;
            this.b = onOfferDetailsCard;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Content)) {
                return false;
            }
            Content content = (Content) obj;
            return Intrinsics.c(this.f20846a, content.f20846a) && Intrinsics.c(this.b, content.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20846a.hashCode() * 31;
            OnOfferDetailsCard onOfferDetailsCard = this.b;
            return iHashCode + (onOfferDetailsCard == null ? 0 : onOfferDetailsCard.hashCode());
        }

        public final String toString() {
            return "Content(__typename=" + this.f20846a + ", onOfferDetailsCard=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$Cta;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Cta {

        /* renamed from: a, reason: collision with root package name */
        public final String f20847a;
        public final ContentCtaFields b;

        public Cta(String str, ContentCtaFields contentCtaFields) {
            this.f20847a = str;
            this.b = contentCtaFields;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Cta)) {
                return false;
            }
            Cta cta = (Cta) obj;
            return Intrinsics.c(this.f20847a, cta.f20847a) && Intrinsics.c(this.b, cta.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20847a.hashCode() * 31);
        }

        public final String toString() {
            return "Cta(__typename=" + this.f20847a + ", contentCtaFields=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$Footer;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Footer {

        /* renamed from: a, reason: collision with root package name */
        public final String f20848a;
        public final OnOfferDetailsFooter b;

        public Footer(String str, OnOfferDetailsFooter onOfferDetailsFooter) {
            this.f20848a = str;
            this.b = onOfferDetailsFooter;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) obj;
            return Intrinsics.c(this.f20848a, footer.f20848a) && Intrinsics.c(this.b, footer.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20848a.hashCode() * 31);
        }

        public final String toString() {
            return "Footer(__typename=" + this.f20848a + ", onOfferDetailsFooter=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$Header;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Header {

        /* renamed from: a, reason: collision with root package name */
        public final HeroAsset f20849a;
        public final LeafAsset b;
        public final RoundelAsset c;
        public final String d;
        public final String e;
        public final StatusBadge f;
        public final BroadcastBanner g;

        public Header(HeroAsset heroAsset, LeafAsset leafAsset, RoundelAsset roundelAsset, String str, String str2, StatusBadge statusBadge, BroadcastBanner broadcastBanner) {
            this.f20849a = heroAsset;
            this.b = leafAsset;
            this.c = roundelAsset;
            this.d = str;
            this.e = str2;
            this.f = statusBadge;
            this.g = broadcastBanner;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return Intrinsics.c(this.f20849a, header.f20849a) && Intrinsics.c(this.b, header.b) && Intrinsics.c(this.c, header.c) && Intrinsics.c(this.d, header.d) && Intrinsics.c(this.e, header.e) && Intrinsics.c(this.f, header.f) && Intrinsics.c(this.g, header.g);
        }

        public final int hashCode() {
            int iHashCode = (this.b.hashCode() + (this.f20849a.hashCode() * 31)) * 31;
            RoundelAsset roundelAsset = this.c;
            int iC = b.c(b.c((iHashCode + (roundelAsset == null ? 0 : roundelAsset.hashCode())) * 31, 31, this.d), 31, this.e);
            StatusBadge statusBadge = this.f;
            int iHashCode2 = (iC + (statusBadge == null ? 0 : statusBadge.hashCode())) * 31;
            BroadcastBanner broadcastBanner = this.g;
            return iHashCode2 + (broadcastBanner != null ? broadcastBanner.hashCode() : 0);
        }

        public final String toString() {
            return "Header(heroAsset=" + this.f20849a + ", leafAsset=" + this.b + ", roundelAsset=" + this.c + ", title=" + this.d + ", description=" + this.e + ", statusBadge=" + this.f + ", broadcastBanner=" + this.g + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$HeroAsset;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class HeroAsset {

        /* renamed from: a, reason: collision with root package name */
        public final String f20850a;
        public final DownloadableAssetType b;
        public final String c;
        public final int d;
        public final int e;
        public final DownloadableAssetFit f;
        public final String g;

        public HeroAsset(String str, DownloadableAssetType downloadableAssetType, String str2, int i, int i2, DownloadableAssetFit downloadableAssetFit, String str3) {
            this.f20850a = str;
            this.b = downloadableAssetType;
            this.c = str2;
            this.d = i;
            this.e = i2;
            this.f = downloadableAssetFit;
            this.g = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof HeroAsset)) {
                return false;
            }
            HeroAsset heroAsset = (HeroAsset) obj;
            return Intrinsics.c(this.f20850a, heroAsset.f20850a) && this.b == heroAsset.b && Intrinsics.c(this.c, heroAsset.c) && this.d == heroAsset.d && this.e == heroAsset.e && this.f == heroAsset.f && Intrinsics.c(this.g, heroAsset.g);
        }

        public final int hashCode() {
            String str = this.f20850a;
            int iA = b.a(this.e, b.a(this.d, b.c((this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31, this.c), 31), 31);
            DownloadableAssetFit downloadableAssetFit = this.f;
            int iHashCode = (iA + (downloadableAssetFit == null ? 0 : downloadableAssetFit.hashCode())) * 31;
            String str2 = this.g;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HeroAsset(assetId=");
            sb.append(this.f20850a);
            sb.append(", assetType=");
            sb.append(this.b);
            sb.append(", assetUrl=");
            a.x(this.d, this.c, ", assetWidth=", ", assetHeight=", sb);
            sb.append(this.e);
            sb.append(", fit=");
            sb.append(this.f);
            sb.append(", altText=");
            return a.o(sb, this.g, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$Icon;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Icon {

        /* renamed from: a, reason: collision with root package name */
        public final String f20851a;
        public final OnHostedIcon1 b;

        public Icon(String __typename, OnHostedIcon1 onHostedIcon1) {
            Intrinsics.h(__typename, "__typename");
            this.f20851a = __typename;
            this.b = onHostedIcon1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) obj;
            return Intrinsics.c(this.f20851a, icon.f20851a) && Intrinsics.c(this.b, icon.b);
        }

        public final int hashCode() {
            int iHashCode = this.f20851a.hashCode() * 31;
            OnHostedIcon1 onHostedIcon1 = this.b;
            return iHashCode + (onHostedIcon1 == null ? 0 : onHostedIcon1.f20855a.hashCode());
        }

        public final String toString() {
            return "Icon(__typename=" + this.f20851a + ", onHostedIcon=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$LeafAsset;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class LeafAsset {

        /* renamed from: a, reason: collision with root package name */
        public final String f20852a;
        public final OnLocalAsset b;
        public final OnHostedIcon c;

        public LeafAsset(String __typename, OnLocalAsset onLocalAsset, OnHostedIcon onHostedIcon) {
            Intrinsics.h(__typename, "__typename");
            this.f20852a = __typename;
            this.b = onLocalAsset;
            this.c = onHostedIcon;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LeafAsset)) {
                return false;
            }
            LeafAsset leafAsset = (LeafAsset) obj;
            return Intrinsics.c(this.f20852a, leafAsset.f20852a) && Intrinsics.c(this.b, leafAsset.b) && Intrinsics.c(this.c, leafAsset.c);
        }

        public final int hashCode() {
            int iHashCode = this.f20852a.hashCode() * 31;
            OnLocalAsset onLocalAsset = this.b;
            int iHashCode2 = (iHashCode + (onLocalAsset == null ? 0 : onLocalAsset.f20856a.hashCode())) * 31;
            OnHostedIcon onHostedIcon = this.c;
            return iHashCode2 + (onHostedIcon != null ? onHostedIcon.f20854a.hashCode() : 0);
        }

        public final String toString() {
            return "LeafAsset(__typename=" + this.f20852a + ", onLocalAsset=" + this.b + ", onHostedIcon=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$OfferAnalytics;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OfferAnalytics {

        /* renamed from: a, reason: collision with root package name */
        public final String f20853a;
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
            this.f20853a = str;
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
            return Intrinsics.c(this.f20853a, offerAnalytics.f20853a) && Intrinsics.c(this.b, offerAnalytics.b) && Intrinsics.c(this.c, offerAnalytics.c) && Intrinsics.c(this.d, offerAnalytics.d) && Intrinsics.c(this.e, offerAnalytics.e) && Intrinsics.c(this.f, offerAnalytics.f) && Intrinsics.c(this.g, offerAnalytics.g) && Intrinsics.c(this.h, offerAnalytics.h) && Intrinsics.c(this.i, offerAnalytics.i) && Intrinsics.c(this.j, offerAnalytics.j) && Intrinsics.c(this.k, offerAnalytics.k) && Intrinsics.c(this.l, offerAnalytics.l) && Intrinsics.c(this.m, offerAnalytics.m) && Intrinsics.c(this.n, offerAnalytics.n);
        }

        public final int hashCode() {
            String str = this.f20853a;
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
            StringBuilder sbV = a.v("OfferAnalytics(offerName=", this.f20853a, ", commId=", this.b, ", uoid=");
            androidx.constraintlayout.core.state.a.B(sbV, this.c, ", campaignCode=", this.d, ", campaignStream=");
            androidx.constraintlayout.core.state.a.B(sbV, this.e, ", channel=", this.f, ", status=");
            androidx.constraintlayout.core.state.a.B(sbV, this.g, ", offerType=", this.h, ", partnerId=");
            androidx.constraintlayout.core.state.a.B(sbV, this.i, ", rtlAccountID=", this.j, ", rtlCampaignID=");
            androidx.constraintlayout.core.state.a.B(sbV, this.k, ", rtlCampaignCode=", this.l, ", rtlCouponStart=");
            return androidx.constraintlayout.core.state.a.l(sbV, this.m, ", profile=", this.n, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$OnHostedIcon;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon {

        /* renamed from: a, reason: collision with root package name */
        public final String f20854a;

        public OnHostedIcon(String str) {
            this.f20854a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon) && Intrinsics.c(this.f20854a, ((OnHostedIcon) obj).f20854a);
        }

        public final int hashCode() {
            return this.f20854a.hashCode();
        }

        public final String toString() {
            return a.h("OnHostedIcon(url=", this.f20854a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$OnHostedIcon1;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnHostedIcon1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f20855a;

        public OnHostedIcon1(String str) {
            this.f20855a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnHostedIcon1) && Intrinsics.c(this.f20855a, ((OnHostedIcon1) obj).f20855a);
        }

        public final int hashCode() {
            return this.f20855a.hashCode();
        }

        public final String toString() {
            return a.h("OnHostedIcon1(url=", this.f20855a, ")");
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$OnLocalAsset;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnLocalAsset {

        /* renamed from: a, reason: collision with root package name */
        public final LocalAssetIconName f20856a;

        public OnLocalAsset(LocalAssetIconName localAssetIconName) {
            this.f20856a = localAssetIconName;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OnLocalAsset) && this.f20856a == ((OnLocalAsset) obj).f20856a;
        }

        public final int hashCode() {
            return this.f20856a.hashCode();
        }

        public final String toString() {
            return "OnLocalAsset(iconName=" + this.f20856a + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$OnOfferDetailsCard;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOfferDetailsCard {

        /* renamed from: a, reason: collision with root package name */
        public final String f20857a;
        public final OfferDetailsCardFragment b;

        public OnOfferDetailsCard(String str, OfferDetailsCardFragment offerDetailsCardFragment) {
            this.f20857a = str;
            this.b = offerDetailsCardFragment;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOfferDetailsCard)) {
                return false;
            }
            OnOfferDetailsCard onOfferDetailsCard = (OnOfferDetailsCard) obj;
            return Intrinsics.c(this.f20857a, onOfferDetailsCard.f20857a) && Intrinsics.c(this.b, onOfferDetailsCard.b);
        }

        public final int hashCode() {
            return this.b.f20802a.hashCode() + (this.f20857a.hashCode() * 31);
        }

        public final String toString() {
            return "OnOfferDetailsCard(__typename=" + this.f20857a + ", offerDetailsCardFragment=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$OnOfferDetailsFooter;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class OnOfferDetailsFooter {

        /* renamed from: a, reason: collision with root package name */
        public final String f20858a;
        public final Cta b;
        public final StatusBadge1 c;

        public OnOfferDetailsFooter(String str, Cta cta, StatusBadge1 statusBadge1) {
            this.f20858a = str;
            this.b = cta;
            this.c = statusBadge1;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OnOfferDetailsFooter)) {
                return false;
            }
            OnOfferDetailsFooter onOfferDetailsFooter = (OnOfferDetailsFooter) obj;
            return Intrinsics.c(this.f20858a, onOfferDetailsFooter.f20858a) && Intrinsics.c(this.b, onOfferDetailsFooter.b) && Intrinsics.c(this.c, onOfferDetailsFooter.c);
        }

        public final int hashCode() {
            String str = this.f20858a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Cta cta = this.b;
            int iHashCode2 = (iHashCode + (cta == null ? 0 : cta.hashCode())) * 31;
            StatusBadge1 statusBadge1 = this.c;
            return iHashCode2 + (statusBadge1 != null ? statusBadge1.hashCode() : 0);
        }

        public final String toString() {
            return "OnOfferDetailsFooter(label=" + this.f20858a + ", cta=" + this.b + ", statusBadge=" + this.c + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$RoundelAsset;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RoundelAsset {

        /* renamed from: a, reason: collision with root package name */
        public final String f20859a;
        public final IconAsset b;

        public RoundelAsset(String str, IconAsset iconAsset) {
            this.f20859a = str;
            this.b = iconAsset;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RoundelAsset)) {
                return false;
            }
            RoundelAsset roundelAsset = (RoundelAsset) obj;
            return Intrinsics.c(this.f20859a, roundelAsset.f20859a) && Intrinsics.c(this.b, roundelAsset.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20859a.hashCode() * 31);
        }

        public final String toString() {
            return "RoundelAsset(__typename=" + this.f20859a + ", iconAsset=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$StatusBadge;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StatusBadge {

        /* renamed from: a, reason: collision with root package name */
        public final String f20860a;
        public final RewardsOfferStatus b;

        public StatusBadge(String str, RewardsOfferStatus rewardsOfferStatus) {
            this.f20860a = str;
            this.b = rewardsOfferStatus;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StatusBadge)) {
                return false;
            }
            StatusBadge statusBadge = (StatusBadge) obj;
            return Intrinsics.c(this.f20860a, statusBadge.f20860a) && this.b == statusBadge.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20860a.hashCode() * 31);
        }

        public final String toString() {
            return "StatusBadge(label=" + this.f20860a + ", status=" + this.b + ")";
        }
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/woolworths/rewards/offers/details/fragment/OfferDetailsPageFragment$StatusBadge1;", "", "offers_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class StatusBadge1 {

        /* renamed from: a, reason: collision with root package name */
        public final String f20861a;
        public final RewardsOfferStatus b;

        public StatusBadge1(String str, RewardsOfferStatus rewardsOfferStatus) {
            this.f20861a = str;
            this.b = rewardsOfferStatus;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StatusBadge1)) {
                return false;
            }
            StatusBadge1 statusBadge1 = (StatusBadge1) obj;
            return Intrinsics.c(this.f20861a, statusBadge1.f20861a) && this.b == statusBadge1.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f20861a.hashCode() * 31);
        }

        public final String toString() {
            return "StatusBadge1(label=" + this.f20861a + ", status=" + this.b + ")";
        }
    }

    public OfferDetailsPageFragment(Header header, ArrayList arrayList, Footer footer, OfferAnalytics offerAnalytics) {
        this.f20842a = header;
        this.b = arrayList;
        this.c = footer;
        this.d = offerAnalytics;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OfferDetailsPageFragment)) {
            return false;
        }
        OfferDetailsPageFragment offerDetailsPageFragment = (OfferDetailsPageFragment) obj;
        return this.f20842a.equals(offerDetailsPageFragment.f20842a) && this.b.equals(offerDetailsPageFragment.b) && Intrinsics.c(this.c, offerDetailsPageFragment.c) && this.d.equals(offerDetailsPageFragment.d);
    }

    public final int hashCode() {
        int iB = androidx.compose.ui.input.pointer.a.b(this.f20842a.hashCode() * 31, 31, this.b);
        Footer footer = this.c;
        return this.d.hashCode() + ((iB + (footer == null ? 0 : footer.hashCode())) * 31);
    }

    public final String toString() {
        return "OfferDetailsPageFragment(header=" + this.f20842a + ", content=" + this.b + ", footer=" + this.c + ", offerAnalytics=" + this.d + ")";
    }
}
