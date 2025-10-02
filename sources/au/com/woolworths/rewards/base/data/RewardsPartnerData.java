package au.com.woolworths.rewards.base.data;

import YU.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0007HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0015\u001a\u00020\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0016HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lau/com/woolworths/rewards/base/data/RewardsPartnerData;", "Landroid/os/Parcelable;", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "partnerId", "iconUrl", "shopOnlineButton", "Lau/com/woolworths/rewards/base/data/PartnerShopOnlineButtonData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lau/com/woolworths/rewards/base/data/PartnerShopOnlineButtonData;)V", "getName", "()Ljava/lang/String;", "getPartnerId", "getIconUrl", "getShopOnlineButton", "()Lau/com/woolworths/rewards/base/data/PartnerShopOnlineButtonData;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class RewardsPartnerData implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<RewardsPartnerData> CREATOR = new Creator();

    @SerializedName("iconUrl")
    @NotNull
    private final String iconUrl;

    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    private final String name;

    @SerializedName("partnerId")
    @NotNull
    private final String partnerId;

    @SerializedName("shopOnlineButton")
    @Nullable
    private final PartnerShopOnlineButtonData shopOnlineButton;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RewardsPartnerData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsPartnerData createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new RewardsPartnerData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PartnerShopOnlineButtonData.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RewardsPartnerData[] newArray(int i) {
            return new RewardsPartnerData[i];
        }
    }

    public RewardsPartnerData(@NotNull String name, @NotNull String partnerId, @NotNull String iconUrl, @Nullable PartnerShopOnlineButtonData partnerShopOnlineButtonData) {
        Intrinsics.h(name, "name");
        Intrinsics.h(partnerId, "partnerId");
        Intrinsics.h(iconUrl, "iconUrl");
        this.name = name;
        this.partnerId = partnerId;
        this.iconUrl = iconUrl;
        this.shopOnlineButton = partnerShopOnlineButtonData;
    }

    public static /* synthetic */ RewardsPartnerData copy$default(RewardsPartnerData rewardsPartnerData, String str, String str2, String str3, PartnerShopOnlineButtonData partnerShopOnlineButtonData, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardsPartnerData.name;
        }
        if ((i & 2) != 0) {
            str2 = rewardsPartnerData.partnerId;
        }
        if ((i & 4) != 0) {
            str3 = rewardsPartnerData.iconUrl;
        }
        if ((i & 8) != 0) {
            partnerShopOnlineButtonData = rewardsPartnerData.shopOnlineButton;
        }
        return rewardsPartnerData.copy(str, str2, str3, partnerShopOnlineButtonData);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPartnerId() {
        return this.partnerId;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final PartnerShopOnlineButtonData getShopOnlineButton() {
        return this.shopOnlineButton;
    }

    @NotNull
    public final RewardsPartnerData copy(@NotNull String name, @NotNull String partnerId, @NotNull String iconUrl, @Nullable PartnerShopOnlineButtonData shopOnlineButton) {
        Intrinsics.h(name, "name");
        Intrinsics.h(partnerId, "partnerId");
        Intrinsics.h(iconUrl, "iconUrl");
        return new RewardsPartnerData(name, partnerId, iconUrl, shopOnlineButton);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsPartnerData)) {
            return false;
        }
        RewardsPartnerData rewardsPartnerData = (RewardsPartnerData) other;
        return Intrinsics.c(this.name, rewardsPartnerData.name) && Intrinsics.c(this.partnerId, rewardsPartnerData.partnerId) && Intrinsics.c(this.iconUrl, rewardsPartnerData.iconUrl) && Intrinsics.c(this.shopOnlineButton, rewardsPartnerData.shopOnlineButton);
    }

    @NotNull
    public final String getIconUrl() {
        return this.iconUrl;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getPartnerId() {
        return this.partnerId;
    }

    @Nullable
    public final PartnerShopOnlineButtonData getShopOnlineButton() {
        return this.shopOnlineButton;
    }

    public int hashCode() {
        int iC = b.c(b.c(this.name.hashCode() * 31, 31, this.partnerId), 31, this.iconUrl);
        PartnerShopOnlineButtonData partnerShopOnlineButtonData = this.shopOnlineButton;
        return iC + (partnerShopOnlineButtonData == null ? 0 : partnerShopOnlineButtonData.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.name;
        String str2 = this.partnerId;
        String str3 = this.iconUrl;
        PartnerShopOnlineButtonData partnerShopOnlineButtonData = this.shopOnlineButton;
        StringBuilder sbV = a.v("RewardsPartnerData(name=", str, ", partnerId=", str2, ", iconUrl=");
        sbV.append(str3);
        sbV.append(", shopOnlineButton=");
        sbV.append(partnerShopOnlineButtonData);
        sbV.append(")");
        return sbV.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.name);
        dest.writeString(this.partnerId);
        dest.writeString(this.iconUrl);
        PartnerShopOnlineButtonData partnerShopOnlineButtonData = this.shopOnlineButton;
        if (partnerShopOnlineButtonData == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            partnerShopOnlineButtonData.writeToParcel(dest, flags);
        }
    }
}
