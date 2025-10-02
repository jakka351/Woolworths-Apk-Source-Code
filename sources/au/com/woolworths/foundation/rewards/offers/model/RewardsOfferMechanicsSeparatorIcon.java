package au.com.woolworths.foundation.rewards.offers.model;

import android.os.Parcel;
import android.os.Parcelable;
import au.com.woolworths.graphql.MappedValue;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/RewardsOfferMechanicsSeparatorIcon;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ARROW", "PLUS_SIGN", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsOfferMechanicsSeparatorIcon implements Parcelable {

    @MappedValue
    @SerializedName("arrow")
    public static final RewardsOfferMechanicsSeparatorIcon ARROW;

    @NotNull
    public static final Parcelable.Creator<RewardsOfferMechanicsSeparatorIcon> CREATOR;

    @MappedValue
    @SerializedName("plus-sign")
    public static final RewardsOfferMechanicsSeparatorIcon PLUS_SIGN;
    public static final RewardsOfferMechanicsSeparatorIcon d;
    public static final /* synthetic */ RewardsOfferMechanicsSeparatorIcon[] e;
    public static final /* synthetic */ EnumEntries f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RewardsOfferMechanicsSeparatorIcon> {
        @Override // android.os.Parcelable.Creator
        public final RewardsOfferMechanicsSeparatorIcon createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return RewardsOfferMechanicsSeparatorIcon.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RewardsOfferMechanicsSeparatorIcon[] newArray(int i) {
            return new RewardsOfferMechanicsSeparatorIcon[i];
        }
    }

    static {
        RewardsOfferMechanicsSeparatorIcon rewardsOfferMechanicsSeparatorIcon = new RewardsOfferMechanicsSeparatorIcon("ARROW", 0);
        ARROW = rewardsOfferMechanicsSeparatorIcon;
        RewardsOfferMechanicsSeparatorIcon rewardsOfferMechanicsSeparatorIcon2 = new RewardsOfferMechanicsSeparatorIcon("PLUS_SIGN", 1);
        PLUS_SIGN = rewardsOfferMechanicsSeparatorIcon2;
        RewardsOfferMechanicsSeparatorIcon rewardsOfferMechanicsSeparatorIcon3 = new RewardsOfferMechanicsSeparatorIcon("UNKNOWN", 2);
        d = rewardsOfferMechanicsSeparatorIcon3;
        RewardsOfferMechanicsSeparatorIcon[] rewardsOfferMechanicsSeparatorIconArr = {rewardsOfferMechanicsSeparatorIcon, rewardsOfferMechanicsSeparatorIcon2, rewardsOfferMechanicsSeparatorIcon3};
        e = rewardsOfferMechanicsSeparatorIconArr;
        f = EnumEntriesKt.a(rewardsOfferMechanicsSeparatorIconArr);
        CREATOR = new Creator();
    }

    private RewardsOfferMechanicsSeparatorIcon(String str, int i) {
    }

    public static RewardsOfferMechanicsSeparatorIcon valueOf(String str) {
        return (RewardsOfferMechanicsSeparatorIcon) Enum.valueOf(RewardsOfferMechanicsSeparatorIcon.class, str);
    }

    public static RewardsOfferMechanicsSeparatorIcon[] values() {
        return (RewardsOfferMechanicsSeparatorIcon[]) e.clone();
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
