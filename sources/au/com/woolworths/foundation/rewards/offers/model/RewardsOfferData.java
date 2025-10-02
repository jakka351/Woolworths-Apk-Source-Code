package au.com.woolworths.foundation.rewards.offers.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.ui.input.pointer.a;
import au.com.woolworths.android.onesite.analytics.RewardsOfferAnalyticsData;
import au.com.woolworths.android.onesite.data.ContentCta;
import au.com.woolworths.android.onesite.modules.insetbanner.InsetBannerApiData;
import au.com.woolworths.rewards.base.data.IconAsset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

@Parcelize
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/RewardsOfferData;", "Landroid/os/Parcelable;", "Lau/com/woolworths/foundation/rewards/offers/model/BasicRewardsOfferStatusData;", "Lau/com/woolworths/foundation/rewards/offers/model/RewardsOfferScreenData;", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RewardsOfferData implements Parcelable, BasicRewardsOfferStatusData, RewardsOfferScreenData {

    @NotNull
    public static final Parcelable.Creator<RewardsOfferData> CREATOR = new Creator();
    public final OfferDetailsCta A;
    public final InsetBannerApiData B;
    public final StandardBanner C;
    public final String D;
    public final String E;
    public final OfferProgressTracker F;
    public final String G;
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
    public final RewardsOfferStatus n;
    public final String o;
    public final RewardsOfferMechanics p;
    public final List q;
    public final RewardsOfferAnalyticsData r;
    public final OfferActivationAnimationData s;
    public final OfferActivationMessage t;
    public final OfferDisplayAnimationData u;
    public final String v;
    public final String w;
    public final IconAsset x;
    public final ContentCta y;
    public final OfferDetailsCta z;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RewardsOfferData> {
        @Override // android.os.Parcelable.Creator
        public final RewardsOfferData createFromParcel(Parcel parcel) {
            Class cls;
            OfferDisplayAnimationData offerDisplayAnimationDataCreateFromParcel;
            ContentCta contentCta;
            OfferDetailsCta offerDetailsCtaCreateFromParcel;
            OfferDetailsCta offerDetailsCta;
            OfferDetailsCta offerDetailsCtaCreateFromParcel2;
            InsetBannerApiData insetBannerApiData;
            StandardBanner standardBannerCreateFromParcel;
            Intrinsics.h(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            RewardsOfferStatus rewardsOfferStatusCreateFromParcel = RewardsOfferStatus.CREATOR.createFromParcel(parcel);
            String string11 = parcel.readString();
            RewardsOfferMechanics rewardsOfferMechanicsCreateFromParcel = parcel.readInt() == 0 ? null : RewardsOfferMechanics.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = a.e(RewardsStatusIcon.CREATOR, parcel, arrayList, iE, 1);
                i = i;
                string2 = string2;
            }
            String str = string2;
            RewardsOfferAnalyticsData rewardsOfferAnalyticsData = (RewardsOfferAnalyticsData) parcel.readParcelable(RewardsOfferData.class.getClassLoader());
            OfferActivationAnimationData offerActivationAnimationDataCreateFromParcel = parcel.readInt() == 0 ? null : OfferActivationAnimationData.CREATOR.createFromParcel(parcel);
            OfferActivationMessage offerActivationMessageCreateFromParcel = parcel.readInt() == 0 ? null : OfferActivationMessage.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                cls = RewardsOfferData.class;
                offerDisplayAnimationDataCreateFromParcel = null;
            } else {
                cls = RewardsOfferData.class;
                offerDisplayAnimationDataCreateFromParcel = OfferDisplayAnimationData.CREATOR.createFromParcel(parcel);
            }
            OfferDisplayAnimationData offerDisplayAnimationData = offerDisplayAnimationDataCreateFromParcel;
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            IconAsset iconAsset = (IconAsset) parcel.readParcelable(cls.getClassLoader());
            ContentCta contentCta2 = (ContentCta) parcel.readParcelable(cls.getClassLoader());
            if (parcel.readInt() == 0) {
                contentCta = contentCta2;
                offerDetailsCtaCreateFromParcel = null;
            } else {
                contentCta = contentCta2;
                offerDetailsCtaCreateFromParcel = OfferDetailsCta.CREATOR.createFromParcel(parcel);
            }
            OfferDetailsCta offerDetailsCta2 = offerDetailsCtaCreateFromParcel;
            if (parcel.readInt() == 0) {
                offerDetailsCta = offerDetailsCta2;
                offerDetailsCtaCreateFromParcel2 = null;
            } else {
                offerDetailsCta = offerDetailsCta2;
                offerDetailsCtaCreateFromParcel2 = OfferDetailsCta.CREATOR.createFromParcel(parcel);
            }
            OfferDetailsCta offerDetailsCta3 = offerDetailsCtaCreateFromParcel2;
            InsetBannerApiData insetBannerApiData2 = (InsetBannerApiData) parcel.readParcelable(cls.getClassLoader());
            if (parcel.readInt() == 0) {
                insetBannerApiData = insetBannerApiData2;
                standardBannerCreateFromParcel = null;
            } else {
                insetBannerApiData = insetBannerApiData2;
                standardBannerCreateFromParcel = StandardBanner.CREATOR.createFromParcel(parcel);
            }
            return new RewardsOfferData(string, str, string3, string4, string5, string6, string7, string8, string9, string10, rewardsOfferStatusCreateFromParcel, string11, rewardsOfferMechanicsCreateFromParcel, arrayList, rewardsOfferAnalyticsData, offerActivationAnimationDataCreateFromParcel, offerActivationMessageCreateFromParcel, offerDisplayAnimationData, string12, string13, iconAsset, contentCta, offerDetailsCta, offerDetailsCta3, insetBannerApiData, standardBannerCreateFromParcel, parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : OfferProgressTracker.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RewardsOfferData[] newArray(int i) {
            return new RewardsOfferData[i];
        }
    }

    public /* synthetic */ RewardsOfferData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, RewardsOfferStatus rewardsOfferStatus, String str11, RewardsOfferMechanics rewardsOfferMechanics, ArrayList arrayList, RewardsOfferAnalyticsData rewardsOfferAnalyticsData, OfferActivationAnimationData offerActivationAnimationData, OfferActivationMessage offerActivationMessage, OfferDisplayAnimationData offerDisplayAnimationData, String str12) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, rewardsOfferStatus, str11, rewardsOfferMechanics, arrayList, rewardsOfferAnalyticsData, offerActivationAnimationData, offerActivationMessage, offerDisplayAnimationData, str12, null, null, null, null, null, null, null, null, null, null, null);
    }

    public static RewardsOfferData a(RewardsOfferData rewardsOfferData, String str, RewardsOfferStatus rewardsOfferStatus, List list, ContentCta contentCta, OfferDetailsCta offerDetailsCta, OfferDetailsCta offerDetailsCta2, StandardBanner standardBanner, String str2, OfferProgressTracker offerProgressTracker, int i) {
        IconAsset iconAsset;
        ContentCta contentCta2;
        InsetBannerApiData insetBannerApiData;
        StandardBanner standardBanner2;
        String str3;
        OfferProgressTracker offerProgressTracker2;
        String offerId = rewardsOfferData.d;
        String image = rewardsOfferData.e;
        String str4 = (i & 4) != 0 ? rewardsOfferData.f : "http://google.com/";
        String title = (i & 8) != 0 ? rewardsOfferData.g : "Shop to collect 100 points and 100 more on a shopping of $1000";
        String subtitle = rewardsOfferData.h;
        String str5 = (i & 32) != 0 ? rewardsOfferData.i : "Fancy Feast Medleys Tuna Tuscany In Savory Sauce 85g, is a culinary masterpiece for cats, blending the rich flavors of the sea with a tantalizing sauce.";
        String str6 = rewardsOfferData.j;
        String str7 = str5;
        String str8 = rewardsOfferData.k;
        String str9 = rewardsOfferData.l;
        String displayStatus = (i & 512) != 0 ? rewardsOfferData.m : str;
        RewardsOfferStatus offerStatus = (i & 1024) != 0 ? rewardsOfferData.n : rewardsOfferStatus;
        String displayExpiry = rewardsOfferData.o;
        RewardsOfferMechanics rewardsOfferMechanics = rewardsOfferData.p;
        List statusIcons = (i & 8192) != 0 ? rewardsOfferData.q : list;
        RewardsOfferAnalyticsData rewardsOfferAnalyticsData = rewardsOfferData.r;
        OfferActivationAnimationData offerActivationAnimationData = rewardsOfferData.s;
        OfferActivationMessage offerActivationMessage = rewardsOfferData.t;
        OfferDisplayAnimationData offerDisplayAnimationData = rewardsOfferData.u;
        String str10 = rewardsOfferData.v;
        String str11 = rewardsOfferData.w;
        IconAsset iconAsset2 = rewardsOfferData.x;
        if ((i & 2097152) != 0) {
            iconAsset = iconAsset2;
            contentCta2 = rewardsOfferData.y;
        } else {
            iconAsset = iconAsset2;
            contentCta2 = contentCta;
        }
        ContentCta contentCta3 = contentCta2;
        OfferDetailsCta offerDetailsCta3 = (i & 4194304) != 0 ? rewardsOfferData.z : offerDetailsCta;
        OfferDetailsCta offerDetailsCta4 = (i & 8388608) != 0 ? rewardsOfferData.A : offerDetailsCta2;
        InsetBannerApiData insetBannerApiData2 = rewardsOfferData.B;
        if ((i & 33554432) != 0) {
            insetBannerApiData = insetBannerApiData2;
            standardBanner2 = rewardsOfferData.C;
        } else {
            insetBannerApiData = insetBannerApiData2;
            standardBanner2 = standardBanner;
        }
        String str12 = (i & 67108864) != 0 ? rewardsOfferData.D : str2;
        String str13 = rewardsOfferData.E;
        if ((i & 268435456) != 0) {
            str3 = str13;
            offerProgressTracker2 = rewardsOfferData.F;
        } else {
            str3 = str13;
            offerProgressTracker2 = offerProgressTracker;
        }
        String str14 = rewardsOfferData.G;
        rewardsOfferData.getClass();
        Intrinsics.h(offerId, "offerId");
        Intrinsics.h(image, "image");
        Intrinsics.h(title, "title");
        Intrinsics.h(subtitle, "subtitle");
        Intrinsics.h(displayStatus, "displayStatus");
        Intrinsics.h(offerStatus, "offerStatus");
        Intrinsics.h(displayExpiry, "displayExpiry");
        Intrinsics.h(statusIcons, "statusIcons");
        return new RewardsOfferData(offerId, image, str4, title, subtitle, str7, str6, str8, str9, displayStatus, offerStatus, displayExpiry, rewardsOfferMechanics, statusIcons, rewardsOfferAnalyticsData, offerActivationAnimationData, offerActivationMessage, offerDisplayAnimationData, str10, str11, iconAsset, contentCta3, offerDetailsCta3, offerDetailsCta4, insetBannerApiData, standardBanner2, str12, str3, offerProgressTracker2, str14);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardsOfferData)) {
            return false;
        }
        RewardsOfferData rewardsOfferData = (RewardsOfferData) obj;
        return Intrinsics.c(this.d, rewardsOfferData.d) && Intrinsics.c(this.e, rewardsOfferData.e) && Intrinsics.c(this.f, rewardsOfferData.f) && Intrinsics.c(this.g, rewardsOfferData.g) && Intrinsics.c(this.h, rewardsOfferData.h) && Intrinsics.c(this.i, rewardsOfferData.i) && Intrinsics.c(this.j, rewardsOfferData.j) && Intrinsics.c(this.k, rewardsOfferData.k) && Intrinsics.c(this.l, rewardsOfferData.l) && Intrinsics.c(this.m, rewardsOfferData.m) && this.n == rewardsOfferData.n && Intrinsics.c(this.o, rewardsOfferData.o) && Intrinsics.c(this.p, rewardsOfferData.p) && Intrinsics.c(this.q, rewardsOfferData.q) && Intrinsics.c(this.r, rewardsOfferData.r) && this.s == rewardsOfferData.s && Intrinsics.c(this.t, rewardsOfferData.t) && this.u == rewardsOfferData.u && Intrinsics.c(this.v, rewardsOfferData.v) && Intrinsics.c(this.w, rewardsOfferData.w) && Intrinsics.c(this.x, rewardsOfferData.x) && Intrinsics.c(this.y, rewardsOfferData.y) && Intrinsics.c(this.z, rewardsOfferData.z) && Intrinsics.c(this.A, rewardsOfferData.A) && Intrinsics.c(this.B, rewardsOfferData.B) && Intrinsics.c(this.C, rewardsOfferData.C) && Intrinsics.c(this.D, rewardsOfferData.D) && Intrinsics.c(this.E, rewardsOfferData.E) && Intrinsics.c(this.F, rewardsOfferData.F) && Intrinsics.c(this.G, rewardsOfferData.G);
    }

    @Override // au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData
    /* renamed from: getDisplayExpiryExtended, reason: from getter */
    public final String getD() {
        return this.D;
    }

    @Override // au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData
    /* renamed from: getDisplayStatus, reason: from getter */
    public final String getM() {
        return this.m;
    }

    @Override // au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData
    /* renamed from: getMinimumSpend, reason: from getter */
    public final String getE() {
        return this.E;
    }

    @Override // au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData
    /* renamed from: getOfferAnalytics, reason: from getter */
    public final RewardsOfferAnalyticsData getR() {
        return this.r;
    }

    @Override // au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData
    /* renamed from: getOfferId, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData
    /* renamed from: getOfferStatus, reason: from getter */
    public final RewardsOfferStatus getN() {
        return this.n;
    }

    public final int hashCode() {
        int iC = b.c(this.d.hashCode() * 31, 31, this.e);
        String str = this.f;
        int iC2 = b.c(b.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.g), 31, this.h);
        String str2 = this.i;
        int iHashCode = (iC2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.k;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.l;
        int iC3 = b.c((this.n.hashCode() + b.c((iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.m)) * 31, 31, this.o);
        RewardsOfferMechanics rewardsOfferMechanics = this.p;
        int iD = b.d((iC3 + (rewardsOfferMechanics == null ? 0 : rewardsOfferMechanics.hashCode())) * 31, 31, this.q);
        RewardsOfferAnalyticsData rewardsOfferAnalyticsData = this.r;
        int iHashCode4 = (iD + (rewardsOfferAnalyticsData == null ? 0 : rewardsOfferAnalyticsData.hashCode())) * 31;
        OfferActivationAnimationData offerActivationAnimationData = this.s;
        int iHashCode5 = (iHashCode4 + (offerActivationAnimationData == null ? 0 : offerActivationAnimationData.hashCode())) * 31;
        OfferActivationMessage offerActivationMessage = this.t;
        int iHashCode6 = (iHashCode5 + (offerActivationMessage == null ? 0 : offerActivationMessage.hashCode())) * 31;
        OfferDisplayAnimationData offerDisplayAnimationData = this.u;
        int iHashCode7 = (iHashCode6 + (offerDisplayAnimationData == null ? 0 : offerDisplayAnimationData.hashCode())) * 31;
        String str6 = this.v;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.w;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        IconAsset iconAsset = this.x;
        int iHashCode10 = (iHashCode9 + (iconAsset == null ? 0 : iconAsset.hashCode())) * 31;
        ContentCta contentCta = this.y;
        int iHashCode11 = (iHashCode10 + (contentCta == null ? 0 : contentCta.hashCode())) * 31;
        OfferDetailsCta offerDetailsCta = this.z;
        int iHashCode12 = (iHashCode11 + (offerDetailsCta == null ? 0 : offerDetailsCta.hashCode())) * 31;
        OfferDetailsCta offerDetailsCta2 = this.A;
        int iHashCode13 = (iHashCode12 + (offerDetailsCta2 == null ? 0 : offerDetailsCta2.hashCode())) * 31;
        InsetBannerApiData insetBannerApiData = this.B;
        int iHashCode14 = (iHashCode13 + (insetBannerApiData == null ? 0 : insetBannerApiData.hashCode())) * 31;
        StandardBanner standardBanner = this.C;
        int iHashCode15 = (iHashCode14 + (standardBanner == null ? 0 : standardBanner.hashCode())) * 31;
        String str8 = this.D;
        int iHashCode16 = (iHashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.E;
        int iHashCode17 = (iHashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
        OfferProgressTracker offerProgressTracker = this.F;
        int iHashCode18 = (iHashCode17 + (offerProgressTracker == null ? 0 : offerProgressTracker.hashCode())) * 31;
        String str10 = this.G;
        return iHashCode18 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbV = YU.a.v("RewardsOfferData(offerId=", this.d, ", image=", this.e, ", bannerUrl=");
        androidx.constraintlayout.core.state.a.B(sbV, this.f, ", title=", this.g, ", subtitle=");
        androidx.constraintlayout.core.state.a.B(sbV, this.h, ", summary=", this.i, ", body=");
        androidx.constraintlayout.core.state.a.B(sbV, this.j, ", formattedTermsAndConditions=", this.k, ", markdownTermsAndConditions=");
        androidx.constraintlayout.core.state.a.B(sbV, this.l, ", displayStatus=", this.m, ", offerStatus=");
        sbV.append(this.n);
        sbV.append(", displayExpiry=");
        sbV.append(this.o);
        sbV.append(", offerMechanics=");
        sbV.append(this.p);
        sbV.append(", statusIcons=");
        sbV.append(this.q);
        sbV.append(", offerAnalytics=");
        sbV.append(this.r);
        sbV.append(", activationAnimation=");
        sbV.append(this.s);
        sbV.append(", activationMessage=");
        sbV.append(this.t);
        sbV.append(", displayAnimation=");
        sbV.append(this.u);
        sbV.append(", brandLogoUrl=");
        androidx.constraintlayout.core.state.a.B(sbV, this.v, ", brandLogoUrlCompact=", this.w, ", roundel=");
        sbV.append(this.x);
        sbV.append(", offerCta=");
        sbV.append(this.y);
        sbV.append(", offerDetailsCta=");
        sbV.append(this.z);
        sbV.append(", offerListCta=");
        sbV.append(this.A);
        sbV.append(", boostedOfferInsetBanner=");
        sbV.append(this.B);
        sbV.append(", standardBanner=");
        sbV.append(this.C);
        sbV.append(", displayExpiryExtended=");
        androidx.constraintlayout.core.state.a.B(sbV, this.D, ", minimumSpend=", this.E, ", offerTileProgressTracker=");
        sbV.append(this.F);
        sbV.append(", offerTileAltText=");
        sbV.append(this.G);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.d);
        dest.writeString(this.e);
        dest.writeString(this.f);
        dest.writeString(this.g);
        dest.writeString(this.h);
        dest.writeString(this.i);
        dest.writeString(this.j);
        dest.writeString(this.k);
        dest.writeString(this.l);
        dest.writeString(this.m);
        this.n.writeToParcel(dest, i);
        dest.writeString(this.o);
        RewardsOfferMechanics rewardsOfferMechanics = this.p;
        if (rewardsOfferMechanics == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rewardsOfferMechanics.writeToParcel(dest, i);
        }
        Iterator itU = au.com.woolworths.android.onesite.a.u(this.q, dest);
        while (itU.hasNext()) {
            ((RewardsStatusIcon) itU.next()).writeToParcel(dest, i);
        }
        dest.writeParcelable(this.r, i);
        OfferActivationAnimationData offerActivationAnimationData = this.s;
        if (offerActivationAnimationData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            offerActivationAnimationData.writeToParcel(dest, i);
        }
        OfferActivationMessage offerActivationMessage = this.t;
        if (offerActivationMessage == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            offerActivationMessage.writeToParcel(dest, i);
        }
        OfferDisplayAnimationData offerDisplayAnimationData = this.u;
        if (offerDisplayAnimationData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            offerDisplayAnimationData.writeToParcel(dest, i);
        }
        dest.writeString(this.v);
        dest.writeString(this.w);
        dest.writeParcelable(this.x, i);
        dest.writeParcelable(this.y, i);
        OfferDetailsCta offerDetailsCta = this.z;
        if (offerDetailsCta == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            offerDetailsCta.writeToParcel(dest, i);
        }
        OfferDetailsCta offerDetailsCta2 = this.A;
        if (offerDetailsCta2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            offerDetailsCta2.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.B, i);
        StandardBanner standardBanner = this.C;
        if (standardBanner == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            standardBanner.writeToParcel(dest, i);
        }
        dest.writeString(this.D);
        dest.writeString(this.E);
        OfferProgressTracker offerProgressTracker = this.F;
        if (offerProgressTracker == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            offerProgressTracker.writeToParcel(dest, i);
        }
        dest.writeString(this.G);
    }

    public RewardsOfferData(String offerId, String image, String str, String title, String subtitle, String str2, String str3, String str4, String str5, String displayStatus, RewardsOfferStatus offerStatus, String displayExpiry, RewardsOfferMechanics rewardsOfferMechanics, List list, RewardsOfferAnalyticsData rewardsOfferAnalyticsData, OfferActivationAnimationData offerActivationAnimationData, OfferActivationMessage offerActivationMessage, OfferDisplayAnimationData offerDisplayAnimationData, String str6, String str7, IconAsset iconAsset, ContentCta contentCta, OfferDetailsCta offerDetailsCta, OfferDetailsCta offerDetailsCta2, InsetBannerApiData insetBannerApiData, StandardBanner standardBanner, String str8, String str9, OfferProgressTracker offerProgressTracker, String str10) {
        Intrinsics.h(offerId, "offerId");
        Intrinsics.h(image, "image");
        Intrinsics.h(title, "title");
        Intrinsics.h(subtitle, "subtitle");
        Intrinsics.h(displayStatus, "displayStatus");
        Intrinsics.h(offerStatus, "offerStatus");
        Intrinsics.h(displayExpiry, "displayExpiry");
        this.d = offerId;
        this.e = image;
        this.f = str;
        this.g = title;
        this.h = subtitle;
        this.i = str2;
        this.j = str3;
        this.k = str4;
        this.l = str5;
        this.m = displayStatus;
        this.n = offerStatus;
        this.o = displayExpiry;
        this.p = rewardsOfferMechanics;
        this.q = list;
        this.r = rewardsOfferAnalyticsData;
        this.s = offerActivationAnimationData;
        this.t = offerActivationMessage;
        this.u = offerDisplayAnimationData;
        this.v = str6;
        this.w = str7;
        this.x = iconAsset;
        this.y = contentCta;
        this.z = offerDetailsCta;
        this.A = offerDetailsCta2;
        this.B = insetBannerApiData;
        this.C = standardBanner;
        this.D = str8;
        this.E = str9;
        this.F = offerProgressTracker;
        this.G = str10;
    }
}
