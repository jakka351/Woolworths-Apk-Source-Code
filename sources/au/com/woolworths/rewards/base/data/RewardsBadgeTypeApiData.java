package au.com.woolworths.rewards.base.data;

import au.com.woolworths.graphql.DefaultValue;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lau/com/woolworths/rewards/base/data/RewardsBadgeTypeApiData;", "", "<init>", "(Ljava/lang/String;I)V", "ACCENT_TINT", "ALWAYS", "ALWAYS_TINT", "INFO", "INFO_TINT", "NEW", "PRIMARY", "REWARDS", "SPECIAL", "STATUS_BACKGROUND_POSITIVE", "UNKNOWN", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsBadgeTypeApiData {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RewardsBadgeTypeApiData[] $VALUES;
    public static final RewardsBadgeTypeApiData ACCENT_TINT = new RewardsBadgeTypeApiData("ACCENT_TINT", 0);
    public static final RewardsBadgeTypeApiData ALWAYS = new RewardsBadgeTypeApiData("ALWAYS", 1);
    public static final RewardsBadgeTypeApiData ALWAYS_TINT = new RewardsBadgeTypeApiData("ALWAYS_TINT", 2);
    public static final RewardsBadgeTypeApiData INFO = new RewardsBadgeTypeApiData("INFO", 3);
    public static final RewardsBadgeTypeApiData INFO_TINT = new RewardsBadgeTypeApiData("INFO_TINT", 4);
    public static final RewardsBadgeTypeApiData NEW = new RewardsBadgeTypeApiData("NEW", 5);
    public static final RewardsBadgeTypeApiData PRIMARY = new RewardsBadgeTypeApiData("PRIMARY", 6);
    public static final RewardsBadgeTypeApiData REWARDS = new RewardsBadgeTypeApiData("REWARDS", 7);
    public static final RewardsBadgeTypeApiData SPECIAL = new RewardsBadgeTypeApiData("SPECIAL", 8);
    public static final RewardsBadgeTypeApiData STATUS_BACKGROUND_POSITIVE = new RewardsBadgeTypeApiData("STATUS_BACKGROUND_POSITIVE", 9);

    @DefaultValue
    public static final RewardsBadgeTypeApiData UNKNOWN = new RewardsBadgeTypeApiData("UNKNOWN", 10);

    private static final /* synthetic */ RewardsBadgeTypeApiData[] $values() {
        return new RewardsBadgeTypeApiData[]{ACCENT_TINT, ALWAYS, ALWAYS_TINT, INFO, INFO_TINT, NEW, PRIMARY, REWARDS, SPECIAL, STATUS_BACKGROUND_POSITIVE, UNKNOWN};
    }

    static {
        RewardsBadgeTypeApiData[] rewardsBadgeTypeApiDataArr$values = $values();
        $VALUES = rewardsBadgeTypeApiDataArr$values;
        $ENTRIES = EnumEntriesKt.a(rewardsBadgeTypeApiDataArr$values);
    }

    private RewardsBadgeTypeApiData(String str, int i) {
    }

    @NotNull
    public static EnumEntries<RewardsBadgeTypeApiData> getEntries() {
        return $ENTRIES;
    }

    public static RewardsBadgeTypeApiData valueOf(String str) {
        return (RewardsBadgeTypeApiData) Enum.valueOf(RewardsBadgeTypeApiData.class, str);
    }

    public static RewardsBadgeTypeApiData[] values() {
        return (RewardsBadgeTypeApiData[]) $VALUES.clone();
    }
}
