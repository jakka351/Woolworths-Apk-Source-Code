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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0018\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/model/RewardsCalendarIcon;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "CALENDAR_1_ACTIVE", "CALENDAR_2_ACTIVE", "CALENDAR_3_ACTIVE", "CALENDAR_4_ACTIVE", "CALENDAR_5_ACTIVE", "CALENDAR_6_ACTIVE", "CALENDAR_7_ACTIVE", "CALENDAR_8_ACTIVE", "CALENDAR_1_DISABLED", "CALENDAR_2_DISABLED", "CALENDAR_3_DISABLED", "CALENDAR_4_DISABLED", "CALENDAR_5_DISABLED", "CALENDAR_6_DISABLED", "CALENDAR_7_DISABLED", "CALENDAR_8_DISABLED", "CALENDAR_CHECK_SUCCESS", "CALENDAR_CHECK_DISABLED", "CALENDAR_CROSS_DISABLED", "CALENDAR_DOTS_ACTIVE", "CALENDAR_CURRENT_ACTIVE", "offers-model_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsCalendarIcon implements Parcelable {

    @MappedValue
    @SerializedName("calendar-1-active")
    public static final RewardsCalendarIcon CALENDAR_1_ACTIVE;

    @MappedValue
    @SerializedName("calendar-1-disabled")
    public static final RewardsCalendarIcon CALENDAR_1_DISABLED;

    @MappedValue
    @SerializedName("calendar-2-active")
    public static final RewardsCalendarIcon CALENDAR_2_ACTIVE;

    @MappedValue
    @SerializedName("calendar-2-disabled")
    public static final RewardsCalendarIcon CALENDAR_2_DISABLED;

    @MappedValue
    @SerializedName("calendar-3-active")
    public static final RewardsCalendarIcon CALENDAR_3_ACTIVE;

    @MappedValue
    @SerializedName("calendar-3-disabled")
    public static final RewardsCalendarIcon CALENDAR_3_DISABLED;

    @MappedValue
    @SerializedName("calendar-4-active")
    public static final RewardsCalendarIcon CALENDAR_4_ACTIVE;

    @MappedValue
    @SerializedName("calendar-4-disabled")
    public static final RewardsCalendarIcon CALENDAR_4_DISABLED;

    @MappedValue
    @SerializedName("calendar-5-active")
    public static final RewardsCalendarIcon CALENDAR_5_ACTIVE;

    @MappedValue
    @SerializedName("calendar-5-disabled")
    public static final RewardsCalendarIcon CALENDAR_5_DISABLED;

    @MappedValue
    @SerializedName("calendar-6-active")
    public static final RewardsCalendarIcon CALENDAR_6_ACTIVE;

    @MappedValue
    @SerializedName("calendar-6-disabled")
    public static final RewardsCalendarIcon CALENDAR_6_DISABLED;

    @MappedValue
    @SerializedName("calendar-7-active")
    public static final RewardsCalendarIcon CALENDAR_7_ACTIVE;

    @MappedValue
    @SerializedName("calendar-7-disabled")
    public static final RewardsCalendarIcon CALENDAR_7_DISABLED;

    @MappedValue
    @SerializedName("calendar-8-active")
    public static final RewardsCalendarIcon CALENDAR_8_ACTIVE;

    @MappedValue
    @SerializedName("calendar-8-disabled")
    public static final RewardsCalendarIcon CALENDAR_8_DISABLED;

    @MappedValue
    @SerializedName("calendar-check-disabled")
    public static final RewardsCalendarIcon CALENDAR_CHECK_DISABLED;

    @MappedValue
    @SerializedName("calendar-check-success")
    public static final RewardsCalendarIcon CALENDAR_CHECK_SUCCESS;

    @MappedValue
    @SerializedName("calendar-cross-disabled")
    public static final RewardsCalendarIcon CALENDAR_CROSS_DISABLED;

    @MappedValue
    @SerializedName("calendar-current-active")
    public static final RewardsCalendarIcon CALENDAR_CURRENT_ACTIVE;

    @MappedValue
    @SerializedName("calendar-dots-active")
    public static final RewardsCalendarIcon CALENDAR_DOTS_ACTIVE;

    @NotNull
    public static final Parcelable.Creator<RewardsCalendarIcon> CREATOR;
    public static final RewardsCalendarIcon d;
    public static final /* synthetic */ RewardsCalendarIcon[] e;
    public static final /* synthetic */ EnumEntries f;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<RewardsCalendarIcon> {
        @Override // android.os.Parcelable.Creator
        public final RewardsCalendarIcon createFromParcel(Parcel parcel) {
            Intrinsics.h(parcel, "parcel");
            return RewardsCalendarIcon.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RewardsCalendarIcon[] newArray(int i) {
            return new RewardsCalendarIcon[i];
        }
    }

    static {
        RewardsCalendarIcon rewardsCalendarIcon = new RewardsCalendarIcon("CALENDAR_1_ACTIVE", 0);
        CALENDAR_1_ACTIVE = rewardsCalendarIcon;
        RewardsCalendarIcon rewardsCalendarIcon2 = new RewardsCalendarIcon("CALENDAR_2_ACTIVE", 1);
        CALENDAR_2_ACTIVE = rewardsCalendarIcon2;
        RewardsCalendarIcon rewardsCalendarIcon3 = new RewardsCalendarIcon("CALENDAR_3_ACTIVE", 2);
        CALENDAR_3_ACTIVE = rewardsCalendarIcon3;
        RewardsCalendarIcon rewardsCalendarIcon4 = new RewardsCalendarIcon("CALENDAR_4_ACTIVE", 3);
        CALENDAR_4_ACTIVE = rewardsCalendarIcon4;
        RewardsCalendarIcon rewardsCalendarIcon5 = new RewardsCalendarIcon("CALENDAR_5_ACTIVE", 4);
        CALENDAR_5_ACTIVE = rewardsCalendarIcon5;
        RewardsCalendarIcon rewardsCalendarIcon6 = new RewardsCalendarIcon("CALENDAR_6_ACTIVE", 5);
        CALENDAR_6_ACTIVE = rewardsCalendarIcon6;
        RewardsCalendarIcon rewardsCalendarIcon7 = new RewardsCalendarIcon("CALENDAR_7_ACTIVE", 6);
        CALENDAR_7_ACTIVE = rewardsCalendarIcon7;
        RewardsCalendarIcon rewardsCalendarIcon8 = new RewardsCalendarIcon("CALENDAR_8_ACTIVE", 7);
        CALENDAR_8_ACTIVE = rewardsCalendarIcon8;
        RewardsCalendarIcon rewardsCalendarIcon9 = new RewardsCalendarIcon("CALENDAR_1_DISABLED", 8);
        CALENDAR_1_DISABLED = rewardsCalendarIcon9;
        RewardsCalendarIcon rewardsCalendarIcon10 = new RewardsCalendarIcon("CALENDAR_2_DISABLED", 9);
        CALENDAR_2_DISABLED = rewardsCalendarIcon10;
        RewardsCalendarIcon rewardsCalendarIcon11 = new RewardsCalendarIcon("CALENDAR_3_DISABLED", 10);
        CALENDAR_3_DISABLED = rewardsCalendarIcon11;
        RewardsCalendarIcon rewardsCalendarIcon12 = new RewardsCalendarIcon("CALENDAR_4_DISABLED", 11);
        CALENDAR_4_DISABLED = rewardsCalendarIcon12;
        RewardsCalendarIcon rewardsCalendarIcon13 = new RewardsCalendarIcon("CALENDAR_5_DISABLED", 12);
        CALENDAR_5_DISABLED = rewardsCalendarIcon13;
        RewardsCalendarIcon rewardsCalendarIcon14 = new RewardsCalendarIcon("CALENDAR_6_DISABLED", 13);
        CALENDAR_6_DISABLED = rewardsCalendarIcon14;
        RewardsCalendarIcon rewardsCalendarIcon15 = new RewardsCalendarIcon("CALENDAR_7_DISABLED", 14);
        CALENDAR_7_DISABLED = rewardsCalendarIcon15;
        RewardsCalendarIcon rewardsCalendarIcon16 = new RewardsCalendarIcon("CALENDAR_8_DISABLED", 15);
        CALENDAR_8_DISABLED = rewardsCalendarIcon16;
        RewardsCalendarIcon rewardsCalendarIcon17 = new RewardsCalendarIcon("CALENDAR_CHECK_SUCCESS", 16);
        CALENDAR_CHECK_SUCCESS = rewardsCalendarIcon17;
        RewardsCalendarIcon rewardsCalendarIcon18 = new RewardsCalendarIcon("CALENDAR_CHECK_DISABLED", 17);
        CALENDAR_CHECK_DISABLED = rewardsCalendarIcon18;
        RewardsCalendarIcon rewardsCalendarIcon19 = new RewardsCalendarIcon("CALENDAR_CROSS_DISABLED", 18);
        CALENDAR_CROSS_DISABLED = rewardsCalendarIcon19;
        RewardsCalendarIcon rewardsCalendarIcon20 = new RewardsCalendarIcon("CALENDAR_DOTS_ACTIVE", 19);
        CALENDAR_DOTS_ACTIVE = rewardsCalendarIcon20;
        RewardsCalendarIcon rewardsCalendarIcon21 = new RewardsCalendarIcon("CALENDAR_CURRENT_ACTIVE", 20);
        CALENDAR_CURRENT_ACTIVE = rewardsCalendarIcon21;
        RewardsCalendarIcon rewardsCalendarIcon22 = new RewardsCalendarIcon("UNKNOWN", 21);
        d = rewardsCalendarIcon22;
        RewardsCalendarIcon[] rewardsCalendarIconArr = {rewardsCalendarIcon, rewardsCalendarIcon2, rewardsCalendarIcon3, rewardsCalendarIcon4, rewardsCalendarIcon5, rewardsCalendarIcon6, rewardsCalendarIcon7, rewardsCalendarIcon8, rewardsCalendarIcon9, rewardsCalendarIcon10, rewardsCalendarIcon11, rewardsCalendarIcon12, rewardsCalendarIcon13, rewardsCalendarIcon14, rewardsCalendarIcon15, rewardsCalendarIcon16, rewardsCalendarIcon17, rewardsCalendarIcon18, rewardsCalendarIcon19, rewardsCalendarIcon20, rewardsCalendarIcon21, rewardsCalendarIcon22};
        e = rewardsCalendarIconArr;
        f = EnumEntriesKt.a(rewardsCalendarIconArr);
        CREATOR = new Creator();
    }

    private RewardsCalendarIcon(String str, int i) {
    }

    public static RewardsCalendarIcon valueOf(String str) {
        return (RewardsCalendarIcon) Enum.valueOf(RewardsCalendarIcon.class, str);
    }

    public static RewardsCalendarIcon[] values() {
        return (RewardsCalendarIcon[]) e.clone();
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
