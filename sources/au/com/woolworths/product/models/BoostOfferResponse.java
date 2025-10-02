package au.com.woolworths.product.models;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.impl.b;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.core.state.a;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
@Parcelize
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u00052\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006#"}, d2 = {"Lau/com/woolworths/product/models/BoostOfferResponse;", "Landroid/os/Parcelable;", "offerId", "", "success", "", "message", "info", "Lau/com/woolworths/product/models/RewardsOfferInfo;", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Lau/com/woolworths/product/models/RewardsOfferInfo;)V", "getOfferId", "()Ljava/lang/String;", "getSuccess", "()Z", "getMessage", "getInfo", "()Lau/com/woolworths/product/models/RewardsOfferInfo;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "shop-product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BoostOfferResponse implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<BoostOfferResponse> CREATOR = new Creator();

    @SerializedName("info")
    @Nullable
    private final RewardsOfferInfo info;

    @SerializedName("message")
    @NotNull
    private final String message;

    @SerializedName("offerId")
    @NotNull
    private final String offerId;

    @SerializedName("success")
    private final boolean success;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BoostOfferResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BoostOfferResponse createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return new BoostOfferResponse(parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() == 0 ? null : RewardsOfferInfo.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BoostOfferResponse[] newArray(int i) {
            return new BoostOfferResponse[i];
        }
    }

    public BoostOfferResponse(@NotNull String offerId, boolean z, @NotNull String message, @Nullable RewardsOfferInfo rewardsOfferInfo) {
        Intrinsics.h(offerId, "offerId");
        Intrinsics.h(message, "message");
        this.offerId = offerId;
        this.success = z;
        this.message = message;
        this.info = rewardsOfferInfo;
    }

    public static /* synthetic */ BoostOfferResponse copy$default(BoostOfferResponse boostOfferResponse, String str, boolean z, String str2, RewardsOfferInfo rewardsOfferInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            str = boostOfferResponse.offerId;
        }
        if ((i & 2) != 0) {
            z = boostOfferResponse.success;
        }
        if ((i & 4) != 0) {
            str2 = boostOfferResponse.message;
        }
        if ((i & 8) != 0) {
            rewardsOfferInfo = boostOfferResponse.info;
        }
        return boostOfferResponse.copy(str, z, str2, rewardsOfferInfo);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getOfferId() {
        return this.offerId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final RewardsOfferInfo getInfo() {
        return this.info;
    }

    @NotNull
    public final BoostOfferResponse copy(@NotNull String offerId, boolean success, @NotNull String message, @Nullable RewardsOfferInfo info) {
        Intrinsics.h(offerId, "offerId");
        Intrinsics.h(message, "message");
        return new BoostOfferResponse(offerId, success, message, info);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BoostOfferResponse)) {
            return false;
        }
        BoostOfferResponse boostOfferResponse = (BoostOfferResponse) other;
        return Intrinsics.c(this.offerId, boostOfferResponse.offerId) && this.success == boostOfferResponse.success && Intrinsics.c(this.message, boostOfferResponse.message) && Intrinsics.c(this.info, boostOfferResponse.info);
    }

    @Nullable
    public final RewardsOfferInfo getInfo() {
        return this.info;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getOfferId() {
        return this.offerId;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        int iC = b.c(b.e(this.offerId.hashCode() * 31, 31, this.success), 31, this.message);
        RewardsOfferInfo rewardsOfferInfo = this.info;
        return iC + (rewardsOfferInfo == null ? 0 : rewardsOfferInfo.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.offerId;
        boolean z = this.success;
        String str2 = this.message;
        RewardsOfferInfo rewardsOfferInfo = this.info;
        StringBuilder sbQ = a.q("BoostOfferResponse(offerId=", str, ", success=", ", message=", z);
        sbQ.append(str2);
        sbQ.append(", info=");
        sbQ.append(rewardsOfferInfo);
        sbQ.append(")");
        return sbQ.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.h(dest, "dest");
        dest.writeString(this.offerId);
        dest.writeInt(this.success ? 1 : 0);
        dest.writeString(this.message);
        RewardsOfferInfo rewardsOfferInfo = this.info;
        if (rewardsOfferInfo == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            rewardsOfferInfo.writeToParcel(dest, flags);
        }
    }
}
