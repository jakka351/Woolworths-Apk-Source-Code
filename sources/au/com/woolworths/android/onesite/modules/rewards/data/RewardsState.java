package au.com.woolworths.android.onesite.modules.rewards.data;

import au.com.woolworths.graphql.DefaultValue;
import au.com.woolworths.graphql.MappedValue;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsState;", "", "<init>", "(Ljava/lang/String;I)V", "ACTIVE", "INACTIVE", "LEGACY_LINKED", "LEGACY_NONE", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsState {

    @MappedValue
    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)
    public static final RewardsState ACTIVE;

    @MappedValue
    @SerializedName("inactive")
    public static final RewardsState INACTIVE;

    @MappedValue
    @SerializedName("legacy_linked")
    public static final RewardsState LEGACY_LINKED;

    @DefaultValue
    @MappedValue
    @SerializedName("legacy_none")
    public static final RewardsState LEGACY_NONE;
    public static final /* synthetic */ RewardsState[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        RewardsState rewardsState = new RewardsState("ACTIVE", 0);
        ACTIVE = rewardsState;
        RewardsState rewardsState2 = new RewardsState("INACTIVE", 1);
        INACTIVE = rewardsState2;
        RewardsState rewardsState3 = new RewardsState("LEGACY_LINKED", 2);
        LEGACY_LINKED = rewardsState3;
        RewardsState rewardsState4 = new RewardsState("LEGACY_NONE", 3);
        LEGACY_NONE = rewardsState4;
        RewardsState[] rewardsStateArr = {rewardsState, rewardsState2, rewardsState3, rewardsState4};
        d = rewardsStateArr;
        e = EnumEntriesKt.a(rewardsStateArr);
    }

    private RewardsState(String str, int i) {
    }

    public static RewardsState valueOf(String str) {
        return (RewardsState) Enum.valueOf(RewardsState.class, str);
    }

    public static RewardsState[] values() {
        return (RewardsState[]) d.clone();
    }

    public final boolean a() {
        return this == ACTIVE || this == LEGACY_LINKED;
    }
}
