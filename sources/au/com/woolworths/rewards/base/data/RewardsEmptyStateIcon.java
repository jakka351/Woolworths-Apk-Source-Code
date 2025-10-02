package au.com.woolworths.rewards.base.data;

import au.com.woolworths.graphql.DefaultValue;
import au.com.woolworths.graphql.MappedValue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lau/com/woolworths/rewards/base/data/RewardsEmptyStateIcon;", "", "<init>", "(Ljava/lang/String;I)V", "FuelPump", "Ribbon", "Cockade", "Unknown", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsEmptyStateIcon {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RewardsEmptyStateIcon[] $VALUES;

    @MappedValue
    @SerializedName("fuel_pump")
    public static final RewardsEmptyStateIcon FuelPump = new RewardsEmptyStateIcon("FuelPump", 0);

    @MappedValue
    @SerializedName("ribbon")
    public static final RewardsEmptyStateIcon Ribbon = new RewardsEmptyStateIcon("Ribbon", 1);

    @MappedValue
    @SerializedName("cockade")
    public static final RewardsEmptyStateIcon Cockade = new RewardsEmptyStateIcon("Cockade", 2);

    @DefaultValue
    public static final RewardsEmptyStateIcon Unknown = new RewardsEmptyStateIcon("Unknown", 3);

    private static final /* synthetic */ RewardsEmptyStateIcon[] $values() {
        return new RewardsEmptyStateIcon[]{FuelPump, Ribbon, Cockade, Unknown};
    }

    static {
        RewardsEmptyStateIcon[] rewardsEmptyStateIconArr$values = $values();
        $VALUES = rewardsEmptyStateIconArr$values;
        $ENTRIES = EnumEntriesKt.a(rewardsEmptyStateIconArr$values);
    }

    private RewardsEmptyStateIcon(String str, int i) {
    }

    @NotNull
    public static EnumEntries<RewardsEmptyStateIcon> getEntries() {
        return $ENTRIES;
    }

    public static RewardsEmptyStateIcon valueOf(String str) {
        return (RewardsEmptyStateIcon) Enum.valueOf(RewardsEmptyStateIcon.class, str);
    }

    public static RewardsEmptyStateIcon[] values() {
        return (RewardsEmptyStateIcon[]) $VALUES.clone();
    }
}
