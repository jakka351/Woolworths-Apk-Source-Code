package au.com.woolworths.product.models;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.ColumnInfo;
import au.com.woolworths.android.onesite.analytics.RewardsOfferAnalyticsData;
import au.com.woolworths.base.shopapp.modules.button.ButtonApiData;
import au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData;
import au.com.woolworths.foundation.rewards.offers.model.RewardsOfferStatus;
import au.com.woolworths.graphql.MappedName;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010BG\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\rHÆ\u0003JW\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0006\u0010#\u001a\u00020$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020$HÖ\u0001J\t\u0010*\u001a\u00020\u0004HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020$R\u0016\u0010\u0003\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0016X\u0097\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u00061"}, d2 = {"Lau/com/woolworths/product/models/RewardsOfferInfo;", "Landroid/os/Parcelable;", "Lau/com/woolworths/foundation/rewards/offers/model/BasicRewardsOfferStatusData;", "offerId", "", "displayStatus", "displayExpiryExtended", "minimumSpend", "offerStatus", "Lau/com/woolworths/foundation/rewards/offers/model/RewardsOfferStatus;", "offerAnalytics", "Lau/com/woolworths/android/onesite/analytics/RewardsOfferAnalyticsData;", "boostButton", "Lau/com/woolworths/base/shopapp/modules/button/ButtonApiData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/foundation/rewards/offers/model/RewardsOfferStatus;Lau/com/woolworths/android/onesite/analytics/RewardsOfferAnalyticsData;Lau/com/woolworths/base/shopapp/modules/button/ButtonApiData;)V", "getOfferId", "()Ljava/lang/String;", "getDisplayStatus", "getDisplayExpiryExtended", "getMinimumSpend", "getOfferStatus", "()Lau/com/woolworths/foundation/rewards/offers/model/RewardsOfferStatus;", "getOfferAnalytics", "()Lau/com/woolworths/android/onesite/analytics/RewardsOfferAnalyticsData;", "getBoostButton", "()Lau/com/woolworths/base/shopapp/modules/button/ButtonApiData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "Companion", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RewardsOfferInfo implements Parcelable, BasicRewardsOfferStatusData {

    @SerializedName("boostButton")
    @Nullable
    private final ButtonApiData boostButton;

    @SerializedName("displayExpiry")
    @ColumnInfo
    @MappedName
    @NotNull
    private final String displayExpiryExtended;

    @SerializedName("displayStatus")
    @Nullable
    private final String displayStatus;

    @SerializedName("minimumSpend")
    @Nullable
    private final String minimumSpend;

    @SerializedName("offerAnalytics")
    @Nullable
    private final RewardsOfferAnalyticsData offerAnalytics;

    @SerializedName("offerId")
    @NotNull
    private final String offerId;

    @SerializedName("offerStatus")
    @NotNull
    private final RewardsOfferStatus offerStatus;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<RewardsOfferInfo> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/product/models/RewardsOfferInfo$Companion;", "", "<init>", "()V", "create", "Lau/com/woolworths/product/models/RewardsOfferInfo;", "data", "Lau/com/woolworths/foundation/rewards/offers/model/BasicRewardsOfferStatusData;", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final RewardsOfferInfo create(@NotNull BasicRewardsOfferStatusData data) {
            Intrinsics.h(data, "data");
            String offerId = data.getD();
            String displayStatus = data.getM();
            String displayExpiryExtended = data.getD();
            if (displayExpiryExtended == null) {
                displayExpiryExtended = "";
            }
            return new RewardsOfferInfo(offerId, displayStatus, displayExpiryExtended, data.getE(), data.getN(), data.getR(), null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RewardsOfferInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsOfferInfo createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new RewardsOfferInfo(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (RewardsOfferStatus) parcel.readParcelable(RewardsOfferInfo.class.getClassLoader()), (RewardsOfferAnalyticsData) parcel.readParcelable(RewardsOfferInfo.class.getClassLoader()), (ButtonApiData) parcel.readParcelable(RewardsOfferInfo.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsOfferInfo[] newArray(int i) {
            return new RewardsOfferInfo[i];
        }
    }

    public RewardsOfferInfo(@NotNull String offerId, @Nullable String str, @NotNull String displayExpiryExtended, @Nullable String str2, @NotNull RewardsOfferStatus offerStatus, @Nullable RewardsOfferAnalyticsData rewardsOfferAnalyticsData, @Nullable ButtonApiData buttonApiData) {
        Intrinsics.h(offerId, "offerId");
        Intrinsics.h(displayExpiryExtended, "displayExpiryExtended");
        Intrinsics.h(offerStatus, "offerStatus");
        this.offerId = offerId;
        this.displayStatus = str;
        this.displayExpiryExtended = displayExpiryExtended;
        this.minimumSpend = str2;
        this.offerStatus = offerStatus;
        this.offerAnalytics = rewardsOfferAnalyticsData;
        this.boostButton = buttonApiData;
    }

    public static /* synthetic */ RewardsOfferInfo copy$default(RewardsOfferInfo rewardsOfferInfo, String str, String str2, String str3, String str4, RewardsOfferStatus rewardsOfferStatus, RewardsOfferAnalyticsData rewardsOfferAnalyticsData, ButtonApiData buttonApiData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardsOfferInfo.offerId;
        }
        if ((i & 2) != 0) {
            str2 = rewardsOfferInfo.displayStatus;
        }
        if ((i & 4) != 0) {
            str3 = rewardsOfferInfo.displayExpiryExtended;
        }
        if ((i & 8) != 0) {
            str4 = rewardsOfferInfo.minimumSpend;
        }
        if ((i & 16) != 0) {
            rewardsOfferStatus = rewardsOfferInfo.offerStatus;
        }
        if ((i & 32) != 0) {
            rewardsOfferAnalyticsData = rewardsOfferInfo.offerAnalytics;
        }
        if ((i & 64) != 0) {
            buttonApiData = rewardsOfferInfo.boostButton;
        }
        RewardsOfferAnalyticsData rewardsOfferAnalyticsData2 = rewardsOfferAnalyticsData;
        ButtonApiData buttonApiData2 = buttonApiData;
        RewardsOfferStatus rewardsOfferStatus2 = rewardsOfferStatus;
        String str5 = str3;
        return rewardsOfferInfo.copy(str, str2, str5, str4, rewardsOfferStatus2, rewardsOfferAnalyticsData2, buttonApiData2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getOfferId() {
        return this.offerId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getDisplayStatus() {
        return this.displayStatus;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getDisplayExpiryExtended() {
        return this.displayExpiryExtended;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getMinimumSpend() {
        return this.minimumSpend;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final RewardsOfferStatus getOfferStatus() {
        return this.offerStatus;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final RewardsOfferAnalyticsData getOfferAnalytics() {
        return this.offerAnalytics;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final ButtonApiData getBoostButton() {
        return this.boostButton;
    }

    @NotNull
    public final RewardsOfferInfo copy(@NotNull String offerId, @Nullable String displayStatus, @NotNull String displayExpiryExtended, @Nullable String minimumSpend, @NotNull RewardsOfferStatus offerStatus, @Nullable RewardsOfferAnalyticsData offerAnalytics, @Nullable ButtonApiData boostButton) {
        Intrinsics.h(offerId, "offerId");
        Intrinsics.h(displayExpiryExtended, "displayExpiryExtended");
        Intrinsics.h(offerStatus, "offerStatus");
        return new RewardsOfferInfo(offerId, displayStatus, displayExpiryExtended, minimumSpend, offerStatus, offerAnalytics, boostButton);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsOfferInfo)) {
            return false;
        }
        RewardsOfferInfo rewardsOfferInfo = (RewardsOfferInfo) other;
        return Intrinsics.c(this.offerId, rewardsOfferInfo.offerId) && Intrinsics.c(this.displayStatus, rewardsOfferInfo.displayStatus) && Intrinsics.c(this.displayExpiryExtended, rewardsOfferInfo.displayExpiryExtended) && Intrinsics.c(this.minimumSpend, rewardsOfferInfo.minimumSpend) && this.offerStatus == rewardsOfferInfo.offerStatus && Intrinsics.c(this.offerAnalytics, rewardsOfferInfo.offerAnalytics) && Intrinsics.c(this.boostButton, rewardsOfferInfo.boostButton);
    }

    @Nullable
    public final ButtonApiData getBoostButton() {
        return this.boostButton;
    }

    @Override // au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData
    @NotNull
    /* renamed from: getDisplayExpiryExtended */
    public String getD() {
        return this.displayExpiryExtended;
    }

    @Override // au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData
    @Nullable
    /* renamed from: getDisplayStatus */
    public String getM() {
        return this.displayStatus;
    }

    @Override // au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData
    @Nullable
    /* renamed from: getMinimumSpend */
    public String getE() {
        return this.minimumSpend;
    }

    @Override // au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData
    @Nullable
    /* renamed from: getOfferAnalytics */
    public RewardsOfferAnalyticsData getR() {
        return this.offerAnalytics;
    }

    @Override // au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData
    @NotNull
    /* renamed from: getOfferId */
    public String getD() {
        return this.offerId;
    }

    @Override // au.com.woolworths.foundation.rewards.offers.model.BasicRewardsOfferStatusData
    @NotNull
    /* renamed from: getOfferStatus */
    public RewardsOfferStatus getN() {
        return this.offerStatus;
    }

    public int hashCode() {
        int iHashCode = this.offerId.hashCode() * 31;
        String str = this.displayStatus;
        int iC = b.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.displayExpiryExtended);
        String str2 = this.minimumSpend;
        int iHashCode2 = (this.offerStatus.hashCode() + ((iC + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        RewardsOfferAnalyticsData rewardsOfferAnalyticsData = this.offerAnalytics;
        int iHashCode3 = (iHashCode2 + (rewardsOfferAnalyticsData == null ? 0 : rewardsOfferAnalyticsData.hashCode())) * 31;
        ButtonApiData buttonApiData = this.boostButton;
        return iHashCode3 + (buttonApiData != null ? buttonApiData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.offerId;
        String str2 = this.displayStatus;
        String str3 = this.displayExpiryExtended;
        String str4 = this.minimumSpend;
        RewardsOfferStatus rewardsOfferStatus = this.offerStatus;
        RewardsOfferAnalyticsData rewardsOfferAnalyticsData = this.offerAnalytics;
        ButtonApiData buttonApiData = this.boostButton;
        StringBuilder sbV = a.v("RewardsOfferInfo(offerId=", str, ", displayStatus=", str2, ", displayExpiryExtended=");
        androidx.constraintlayout.core.state.a.B(sbV, str3, ", minimumSpend=", str4, ", offerStatus=");
        sbV.append(rewardsOfferStatus);
        sbV.append(", offerAnalytics=");
        sbV.append(rewardsOfferAnalyticsData);
        sbV.append(", boostButton=");
        sbV.append(buttonApiData);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.offerId);
        dest.writeString(this.displayStatus);
        dest.writeString(this.displayExpiryExtended);
        dest.writeString(this.minimumSpend);
        dest.writeParcelable(this.offerStatus, flags);
        dest.writeParcelable(this.offerAnalytics, flags);
        dest.writeParcelable(this.boostButton, flags);
    }
}
