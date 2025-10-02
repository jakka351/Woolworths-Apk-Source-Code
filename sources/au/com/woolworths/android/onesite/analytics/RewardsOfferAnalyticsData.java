package au.com.woolworths.android.onesite.analytics;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.graphql.MappedName;
import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import com.salesforce.marketingcloud.UrlHandler;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Parcelize
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0012HÆ\u0003J½\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0006\u00106\u001a\u000207J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u000207HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001J\u0016\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u000207R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0016R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0016R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u0006C"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/RewardsOfferAnalyticsData;", "Landroid/os/Parcelable;", "offerName", "", "commId", "uoid", "campaignCode", "campaignStream", "channel", "status", "offerType", "partnerId", Scopes.PROFILE, "rtlAccountId", "rtlCampaignId", "rtlCampaignCode", "rtlCouponStart", UrlHandler.ACTION, "Lau/com/woolworths/android/onesite/analytics/RewardsOfferAction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/android/onesite/analytics/RewardsOfferAction;)V", "getOfferName", "()Ljava/lang/String;", "getCommId", "getUoid", "getCampaignCode", "getCampaignStream", "getChannel", "getStatus", "getOfferType", "getPartnerId", "getProfile", "getRtlAccountId", "getRtlCampaignId", "getRtlCampaignCode", "getRtlCouponStart", "getAction", "()Lau/com/woolworths/android/onesite/analytics/RewardsOfferAction;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RewardsOfferAnalyticsData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RewardsOfferAnalyticsData> CREATOR = new Creator();

    @Nullable
    private final RewardsOfferAction action;

    @SerializedName("campaignCode")
    @Nullable
    private final String campaignCode;

    @SerializedName("campaignStream")
    @Nullable
    private final String campaignStream;

    @SerializedName("channel")
    @Nullable
    private final String channel;

    @SerializedName("commId")
    @Nullable
    private final String commId;

    @SerializedName("offerName")
    @Nullable
    private final String offerName;

    @SerializedName("offerType")
    @Nullable
    private final String offerType;

    @SerializedName("partnerId")
    @Nullable
    private final String partnerId;

    @SerializedName(Scopes.PROFILE)
    @Nullable
    private final String profile;

    @SerializedName("rtlAccountID")
    @MappedName
    @Nullable
    private final String rtlAccountId;

    @SerializedName("rtlCampaignCode")
    @Nullable
    private final String rtlCampaignCode;

    @SerializedName("rtlCampaignID")
    @MappedName
    @Nullable
    private final String rtlCampaignId;

    @SerializedName("rtlCouponStart")
    @Nullable
    private final String rtlCouponStart;

    @SerializedName("status")
    @Nullable
    private final String status;

    @SerializedName("uoid")
    @Nullable
    private final String uoid;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RewardsOfferAnalyticsData> {
        @Override // android.os.Parcelable.Creator
        public final RewardsOfferAnalyticsData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new RewardsOfferAnalyticsData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : RewardsOfferAction.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final RewardsOfferAnalyticsData[] newArray(int i) {
            return new RewardsOfferAnalyticsData[i];
        }
    }

    public RewardsOfferAnalyticsData(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable RewardsOfferAction rewardsOfferAction) {
        this.offerName = str;
        this.commId = str2;
        this.uoid = str3;
        this.campaignCode = str4;
        this.campaignStream = str5;
        this.channel = str6;
        this.status = str7;
        this.offerType = str8;
        this.partnerId = str9;
        this.profile = str10;
        this.rtlAccountId = str11;
        this.rtlCampaignId = str12;
        this.rtlCampaignCode = str13;
        this.rtlCouponStart = str14;
        this.action = rewardsOfferAction;
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getOfferName() {
        return this.offerName;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getProfile() {
        return this.profile;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getRtlAccountId() {
        return this.rtlAccountId;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getRtlCampaignId() {
        return this.rtlCampaignId;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getRtlCampaignCode() {
        return this.rtlCampaignCode;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getRtlCouponStart() {
        return this.rtlCouponStart;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final RewardsOfferAction getAction() {
        return this.action;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getCommId() {
        return this.commId;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getUoid() {
        return this.uoid;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getCampaignCode() {
        return this.campaignCode;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getCampaignStream() {
        return this.campaignStream;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getOfferType() {
        return this.offerType;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getPartnerId() {
        return this.partnerId;
    }

    @NotNull
    public final RewardsOfferAnalyticsData copy(@Nullable String offerName, @Nullable String commId, @Nullable String uoid, @Nullable String campaignCode, @Nullable String campaignStream, @Nullable String channel, @Nullable String status, @Nullable String offerType, @Nullable String partnerId, @Nullable String profile, @Nullable String rtlAccountId, @Nullable String rtlCampaignId, @Nullable String rtlCampaignCode, @Nullable String rtlCouponStart, @Nullable RewardsOfferAction action) {
        return new RewardsOfferAnalyticsData(offerName, commId, uoid, campaignCode, campaignStream, channel, status, offerType, partnerId, profile, rtlAccountId, rtlCampaignId, rtlCampaignCode, rtlCouponStart, action);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsOfferAnalyticsData)) {
            return false;
        }
        RewardsOfferAnalyticsData rewardsOfferAnalyticsData = (RewardsOfferAnalyticsData) other;
        return Intrinsics.c(this.offerName, rewardsOfferAnalyticsData.offerName) && Intrinsics.c(this.commId, rewardsOfferAnalyticsData.commId) && Intrinsics.c(this.uoid, rewardsOfferAnalyticsData.uoid) && Intrinsics.c(this.campaignCode, rewardsOfferAnalyticsData.campaignCode) && Intrinsics.c(this.campaignStream, rewardsOfferAnalyticsData.campaignStream) && Intrinsics.c(this.channel, rewardsOfferAnalyticsData.channel) && Intrinsics.c(this.status, rewardsOfferAnalyticsData.status) && Intrinsics.c(this.offerType, rewardsOfferAnalyticsData.offerType) && Intrinsics.c(this.partnerId, rewardsOfferAnalyticsData.partnerId) && Intrinsics.c(this.profile, rewardsOfferAnalyticsData.profile) && Intrinsics.c(this.rtlAccountId, rewardsOfferAnalyticsData.rtlAccountId) && Intrinsics.c(this.rtlCampaignId, rewardsOfferAnalyticsData.rtlCampaignId) && Intrinsics.c(this.rtlCampaignCode, rewardsOfferAnalyticsData.rtlCampaignCode) && Intrinsics.c(this.rtlCouponStart, rewardsOfferAnalyticsData.rtlCouponStart) && this.action == rewardsOfferAnalyticsData.action;
    }

    @Nullable
    public final RewardsOfferAction getAction() {
        return this.action;
    }

    @Nullable
    public final String getCampaignCode() {
        return this.campaignCode;
    }

    @Nullable
    public final String getCampaignStream() {
        return this.campaignStream;
    }

    @Nullable
    public final String getChannel() {
        return this.channel;
    }

    @Nullable
    public final String getCommId() {
        return this.commId;
    }

    @Nullable
    public final String getOfferName() {
        return this.offerName;
    }

    @Nullable
    public final String getOfferType() {
        return this.offerType;
    }

    @Nullable
    public final String getPartnerId() {
        return this.partnerId;
    }

    @Nullable
    public final String getProfile() {
        return this.profile;
    }

    @Nullable
    public final String getRtlAccountId() {
        return this.rtlAccountId;
    }

    @Nullable
    public final String getRtlCampaignCode() {
        return this.rtlCampaignCode;
    }

    @Nullable
    public final String getRtlCampaignId() {
        return this.rtlCampaignId;
    }

    @Nullable
    public final String getRtlCouponStart() {
        return this.rtlCouponStart;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getUoid() {
        return this.uoid;
    }

    public int hashCode() {
        String str = this.offerName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.commId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.uoid;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.campaignCode;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.campaignStream;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.channel;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.status;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.offerType;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.partnerId;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.profile;
        int iHashCode10 = (iHashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.rtlAccountId;
        int iHashCode11 = (iHashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.rtlCampaignId;
        int iHashCode12 = (iHashCode11 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.rtlCampaignCode;
        int iHashCode13 = (iHashCode12 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.rtlCouponStart;
        int iHashCode14 = (iHashCode13 + (str14 == null ? 0 : str14.hashCode())) * 31;
        RewardsOfferAction rewardsOfferAction = this.action;
        return iHashCode14 + (rewardsOfferAction != null ? rewardsOfferAction.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.offerName;
        String str2 = this.commId;
        String str3 = this.uoid;
        String str4 = this.campaignCode;
        String str5 = this.campaignStream;
        String str6 = this.channel;
        String str7 = this.status;
        String str8 = this.offerType;
        String str9 = this.partnerId;
        String str10 = this.profile;
        String str11 = this.rtlAccountId;
        String str12 = this.rtlCampaignId;
        String str13 = this.rtlCampaignCode;
        String str14 = this.rtlCouponStart;
        RewardsOfferAction rewardsOfferAction = this.action;
        StringBuilder sbV = a.v("RewardsOfferAnalyticsData(offerName=", str, ", commId=", str2, ", uoid=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", campaignCode=", str4, ", campaignStream=");
        androidx.constraintlayout.core.state.a.B(sbV, str5, ", channel=", str6, ", status=");
        androidx.constraintlayout.core.state.a.B(sbV, str7, ", offerType=", str8, ", partnerId=");
        androidx.constraintlayout.core.state.a.B(sbV, str9, ", profile=", str10, ", rtlAccountId=");
        androidx.constraintlayout.core.state.a.B(sbV, str11, ", rtlCampaignId=", str12, ", rtlCampaignCode=");
        androidx.constraintlayout.core.state.a.B(sbV, str13, ", rtlCouponStart=", str14, ", action=");
        sbV.append(rewardsOfferAction);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.offerName);
        dest.writeString(this.commId);
        dest.writeString(this.uoid);
        dest.writeString(this.campaignCode);
        dest.writeString(this.campaignStream);
        dest.writeString(this.channel);
        dest.writeString(this.status);
        dest.writeString(this.offerType);
        dest.writeString(this.partnerId);
        dest.writeString(this.profile);
        dest.writeString(this.rtlAccountId);
        dest.writeString(this.rtlCampaignId);
        dest.writeString(this.rtlCampaignCode);
        dest.writeString(this.rtlCouponStart);
        RewardsOfferAction rewardsOfferAction = this.action;
        if (rewardsOfferAction == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rewardsOfferAction.writeToParcel(dest, flags);
        }
    }

    public /* synthetic */ RewardsOfferAnalyticsData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, RewardsOfferAction rewardsOfferAction, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, str14, (i & 16384) != 0 ? RewardsOfferAction.e : rewardsOfferAction);
    }
}
