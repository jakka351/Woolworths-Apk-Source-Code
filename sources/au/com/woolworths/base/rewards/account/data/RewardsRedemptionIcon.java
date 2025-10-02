package au.com.woolworths.base.rewards.account.data;

import au.com.woolworths.graphql.DefaultValue;
import au.com.woolworths.graphql.MappedName;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lau/com/woolworths/base/rewards/account/data/RewardsRedemptionIcon;", "", "<init>", "(Ljava/lang/String;I)V", "AIRPLANE", "CHRISTMAS_STOCKING", "AUTOMATIC", "AUTOMATIC_LOCKED", "NZ_AIRLINES", "NZ_SAVE_FOR_ANOTHER_OCCASION", "BFC_LOCKED", "TEN_DOLLARS_OFF", "AUTO_UNLOCKED", "UNKNOWN", "base-rewards-account_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsRedemptionIcon {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RewardsRedemptionIcon[] $VALUES;

    @SerializedName("airplane")
    @MappedName
    public static final RewardsRedemptionIcon AIRPLANE = new RewardsRedemptionIcon("AIRPLANE", 0);

    @SerializedName("xmas_stocking")
    @MappedName
    public static final RewardsRedemptionIcon CHRISTMAS_STOCKING = new RewardsRedemptionIcon("CHRISTMAS_STOCKING", 1);

    @SerializedName("dollars_off")
    @MappedName
    public static final RewardsRedemptionIcon AUTOMATIC = new RewardsRedemptionIcon("AUTOMATIC", 2);

    @SerializedName("dollars_off_locked")
    @MappedName
    public static final RewardsRedemptionIcon AUTOMATIC_LOCKED = new RewardsRedemptionIcon("AUTOMATIC_LOCKED", 3);

    @SerializedName("nz_airlines")
    @MappedName
    public static final RewardsRedemptionIcon NZ_AIRLINES = new RewardsRedemptionIcon("NZ_AIRLINES", 4);

    @SerializedName("nz_save_for_occasion")
    @MappedName
    public static final RewardsRedemptionIcon NZ_SAVE_FOR_ANOTHER_OCCASION = new RewardsRedemptionIcon("NZ_SAVE_FOR_ANOTHER_OCCASION", 5);

    @SerializedName("bfc_locked")
    @MappedName
    public static final RewardsRedemptionIcon BFC_LOCKED = new RewardsRedemptionIcon("BFC_LOCKED", 6);

    @SerializedName("ten_dollars_off")
    @MappedName
    public static final RewardsRedemptionIcon TEN_DOLLARS_OFF = new RewardsRedemptionIcon("TEN_DOLLARS_OFF", 7);

    @SerializedName("auto_unlocked")
    @MappedName
    public static final RewardsRedemptionIcon AUTO_UNLOCKED = new RewardsRedemptionIcon("AUTO_UNLOCKED", 8);

    @DefaultValue
    public static final RewardsRedemptionIcon UNKNOWN = new RewardsRedemptionIcon("UNKNOWN", 9);

    private static final /* synthetic */ RewardsRedemptionIcon[] $values() {
        return new RewardsRedemptionIcon[]{AIRPLANE, CHRISTMAS_STOCKING, AUTOMATIC, AUTOMATIC_LOCKED, NZ_AIRLINES, NZ_SAVE_FOR_ANOTHER_OCCASION, BFC_LOCKED, TEN_DOLLARS_OFF, AUTO_UNLOCKED, UNKNOWN};
    }

    static {
        RewardsRedemptionIcon[] rewardsRedemptionIconArr$values = $values();
        $VALUES = rewardsRedemptionIconArr$values;
        $ENTRIES = EnumEntriesKt.a(rewardsRedemptionIconArr$values);
    }

    private RewardsRedemptionIcon(String str, int i) {
    }

    @NotNull
    public static EnumEntries<RewardsRedemptionIcon> getEntries() {
        return $ENTRIES;
    }

    public static RewardsRedemptionIcon valueOf(String str) {
        return (RewardsRedemptionIcon) Enum.valueOf(RewardsRedemptionIcon.class, str);
    }

    public static RewardsRedemptionIcon[] values() {
        return (RewardsRedemptionIcon[]) $VALUES.clone();
    }
}
