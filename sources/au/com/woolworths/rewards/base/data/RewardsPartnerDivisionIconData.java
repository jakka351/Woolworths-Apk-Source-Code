package au.com.woolworths.rewards.base.data;

import au.com.woolworths.graphql.DefaultValue;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lau/com/woolworths/rewards/base/data/RewardsPartnerDivisionIconData;", "", "<init>", "(Ljava/lang/String;I)V", "WOOLWORTHS", "WOOLWORTHS_METRO", "BWS", "AMPOL", "AMPOL_METRO", "BIGW", "EG", "UNKNOWN", "base-rewards-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsPartnerDivisionIconData {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RewardsPartnerDivisionIconData[] $VALUES;

    @SerializedName("woolworths")
    public static final RewardsPartnerDivisionIconData WOOLWORTHS = new RewardsPartnerDivisionIconData("WOOLWORTHS", 0);

    @SerializedName("woolworths_metro")
    public static final RewardsPartnerDivisionIconData WOOLWORTHS_METRO = new RewardsPartnerDivisionIconData("WOOLWORTHS_METRO", 1);

    @SerializedName("bws")
    public static final RewardsPartnerDivisionIconData BWS = new RewardsPartnerDivisionIconData("BWS", 2);

    @SerializedName("ampol")
    public static final RewardsPartnerDivisionIconData AMPOL = new RewardsPartnerDivisionIconData("AMPOL", 3);

    @SerializedName("ampol_metro")
    public static final RewardsPartnerDivisionIconData AMPOL_METRO = new RewardsPartnerDivisionIconData("AMPOL_METRO", 4);

    @SerializedName("bigw")
    public static final RewardsPartnerDivisionIconData BIGW = new RewardsPartnerDivisionIconData("BIGW", 5);

    @SerializedName("eg")
    public static final RewardsPartnerDivisionIconData EG = new RewardsPartnerDivisionIconData("EG", 6);

    @DefaultValue
    @SerializedName("unknown_partner")
    public static final RewardsPartnerDivisionIconData UNKNOWN = new RewardsPartnerDivisionIconData("UNKNOWN", 7);

    private static final /* synthetic */ RewardsPartnerDivisionIconData[] $values() {
        return new RewardsPartnerDivisionIconData[]{WOOLWORTHS, WOOLWORTHS_METRO, BWS, AMPOL, AMPOL_METRO, BIGW, EG, UNKNOWN};
    }

    static {
        RewardsPartnerDivisionIconData[] rewardsPartnerDivisionIconDataArr$values = $values();
        $VALUES = rewardsPartnerDivisionIconDataArr$values;
        $ENTRIES = EnumEntriesKt.a(rewardsPartnerDivisionIconDataArr$values);
    }

    private RewardsPartnerDivisionIconData(String str, int i) {
    }

    @NotNull
    public static EnumEntries<RewardsPartnerDivisionIconData> getEntries() {
        return $ENTRIES;
    }

    public static RewardsPartnerDivisionIconData valueOf(String str) {
        return (RewardsPartnerDivisionIconData) Enum.valueOf(RewardsPartnerDivisionIconData.class, str);
    }

    public static RewardsPartnerDivisionIconData[] values() {
        return (RewardsPartnerDivisionIconData[]) $VALUES.clone();
    }
}
