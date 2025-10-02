package au.com.woolworths.rewards.base.data;

import au.com.woolworths.graphql.DefaultValue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lau/com/woolworths/rewards/base/data/RewardsCoachMarkAnchor;", "", "<init>", "(Ljava/lang/String;I)V", "ACCOUNT_TAB", "ACTIVITY_TAB", "BOOSTERS_TAB", "CARD_TAB", "DISCOVER_TAB", "UNKNOWN", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsCoachMarkAnchor {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RewardsCoachMarkAnchor[] $VALUES;

    @SerializedName("ACCOUNT_TAB")
    public static final RewardsCoachMarkAnchor ACCOUNT_TAB = new RewardsCoachMarkAnchor("ACCOUNT_TAB", 0);

    @SerializedName("ACTIVITY_TAB")
    public static final RewardsCoachMarkAnchor ACTIVITY_TAB = new RewardsCoachMarkAnchor("ACTIVITY_TAB", 1);

    @SerializedName("BOOSTERS_TAB")
    public static final RewardsCoachMarkAnchor BOOSTERS_TAB = new RewardsCoachMarkAnchor("BOOSTERS_TAB", 2);

    @SerializedName("CARD_TAB")
    public static final RewardsCoachMarkAnchor CARD_TAB = new RewardsCoachMarkAnchor("CARD_TAB", 3);

    @SerializedName("DISCOVER_TAB")
    public static final RewardsCoachMarkAnchor DISCOVER_TAB = new RewardsCoachMarkAnchor("DISCOVER_TAB", 4);

    @DefaultValue
    public static final RewardsCoachMarkAnchor UNKNOWN = new RewardsCoachMarkAnchor("UNKNOWN", 5);

    private static final /* synthetic */ RewardsCoachMarkAnchor[] $values() {
        return new RewardsCoachMarkAnchor[]{ACCOUNT_TAB, ACTIVITY_TAB, BOOSTERS_TAB, CARD_TAB, DISCOVER_TAB, UNKNOWN};
    }

    static {
        RewardsCoachMarkAnchor[] rewardsCoachMarkAnchorArr$values = $values();
        $VALUES = rewardsCoachMarkAnchorArr$values;
        $ENTRIES = EnumEntriesKt.a(rewardsCoachMarkAnchorArr$values);
    }

    private RewardsCoachMarkAnchor(String str, int i) {
    }

    @NotNull
    public static EnumEntries<RewardsCoachMarkAnchor> getEntries() {
        return $ENTRIES;
    }

    public static RewardsCoachMarkAnchor valueOf(String str) {
        return (RewardsCoachMarkAnchor) Enum.valueOf(RewardsCoachMarkAnchor.class, str);
    }

    public static RewardsCoachMarkAnchor[] values() {
        return (RewardsCoachMarkAnchor[]) $VALUES.clone();
    }
}
