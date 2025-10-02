package au.com.woolworths.foundation.rewards.offers.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Parcelize
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/RewardsOfferStatus;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "NOT_ACTIVATED", "ACTIVATED", "PENDING", "ENDED", "COMPLETED", "MISSED", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsOfferStatus implements Parcelable {

    @SerializedName("ACTIVATED")
    public static final RewardsOfferStatus ACTIVATED;

    @SerializedName("COMPLETED")
    public static final RewardsOfferStatus COMPLETED;

    @NotNull
    public static final Parcelable.Creator<RewardsOfferStatus> CREATOR;

    @SerializedName("ENDED")
    public static final RewardsOfferStatus ENDED;

    @SerializedName("MISSED")
    public static final RewardsOfferStatus MISSED;

    @SerializedName("NOT_ACTIVATED")
    public static final RewardsOfferStatus NOT_ACTIVATED;

    @SerializedName("PENDING")
    public static final RewardsOfferStatus PENDING;
    public static final RewardsOfferStatus d;
    public static final /* synthetic */ RewardsOfferStatus[] e;
    public static final /* synthetic */ EnumEntries f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RewardsOfferStatus> {
        @Override // android.os.Parcelable.Creator
        public final RewardsOfferStatus createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return RewardsOfferStatus.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RewardsOfferStatus[] newArray(int i) {
            return new RewardsOfferStatus[i];
        }
    }

    static {
        RewardsOfferStatus rewardsOfferStatus = new RewardsOfferStatus("NOT_ACTIVATED", 0);
        NOT_ACTIVATED = rewardsOfferStatus;
        RewardsOfferStatus rewardsOfferStatus2 = new RewardsOfferStatus("ACTIVATED", 1);
        ACTIVATED = rewardsOfferStatus2;
        RewardsOfferStatus rewardsOfferStatus3 = new RewardsOfferStatus("PENDING", 2);
        PENDING = rewardsOfferStatus3;
        RewardsOfferStatus rewardsOfferStatus4 = new RewardsOfferStatus("ENDED", 3);
        ENDED = rewardsOfferStatus4;
        RewardsOfferStatus rewardsOfferStatus5 = new RewardsOfferStatus("COMPLETED", 4);
        COMPLETED = rewardsOfferStatus5;
        RewardsOfferStatus rewardsOfferStatus6 = new RewardsOfferStatus("MISSED", 5);
        MISSED = rewardsOfferStatus6;
        RewardsOfferStatus rewardsOfferStatus7 = new RewardsOfferStatus("UNKNOWN", 6);
        d = rewardsOfferStatus7;
        RewardsOfferStatus[] rewardsOfferStatusArr = {rewardsOfferStatus, rewardsOfferStatus2, rewardsOfferStatus3, rewardsOfferStatus4, rewardsOfferStatus5, rewardsOfferStatus6, rewardsOfferStatus7};
        e = rewardsOfferStatusArr;
        f = EnumEntriesKt.a(rewardsOfferStatusArr);
        CREATOR = new Creator();
    }

    private RewardsOfferStatus(String str, int i) {
    }

    public static RewardsOfferStatus valueOf(String str) {
        return (RewardsOfferStatus) Enum.valueOf(RewardsOfferStatus.class, str);
    }

    public static RewardsOfferStatus[] values() {
        return (RewardsOfferStatus[]) e.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.h(dest, "dest");
        dest.writeString(name());
    }
}
