package au.com.woolworths.android.onesite.analytics;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Parcelize
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/analytics/RewardsOfferAction;", "Landroid/os/Parcelable;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsOfferAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RewardsOfferAction> CREATOR;
    public static final RewardsOfferAction e;
    public static final RewardsOfferAction f;
    public static final RewardsOfferAction g;
    public static final /* synthetic */ RewardsOfferAction[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RewardsOfferAction> {
        @Override // android.os.Parcelable.Creator
        public final RewardsOfferAction createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return RewardsOfferAction.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RewardsOfferAction[] newArray(int i) {
            return new RewardsOfferAction[i];
        }
    }

    static {
        RewardsOfferAction rewardsOfferAction = new RewardsOfferAction("IMPRESSION", 0, "Impression");
        e = rewardsOfferAction;
        RewardsOfferAction rewardsOfferAction2 = new RewardsOfferAction("ACTIVATION", 1, "Activation");
        f = rewardsOfferAction2;
        RewardsOfferAction rewardsOfferAction3 = new RewardsOfferAction("FAILED", 2, "Failed");
        g = rewardsOfferAction3;
        RewardsOfferAction[] rewardsOfferActionArr = {rewardsOfferAction, rewardsOfferAction2, rewardsOfferAction3};
        h = rewardsOfferActionArr;
        i = EnumEntriesKt.a(rewardsOfferActionArr);
        CREATOR = new Creator();
    }

    public RewardsOfferAction(String str, int i2, String str2) {
        this.d = str2;
    }

    public static RewardsOfferAction valueOf(String str) {
        return (RewardsOfferAction) Enum.valueOf(RewardsOfferAction.class, str);
    }

    public static RewardsOfferAction[] values() {
        return (RewardsOfferAction[]) h.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i2) {
        Intrinsics.h(dest, "dest");
        dest.writeString(name());
    }
}
