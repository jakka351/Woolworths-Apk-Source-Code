package au.com.woolworths.android.onesite.modules.rewards.data;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/android/onesite/modules/rewards/data/RewardsCardTypeData;", "", "<init>", "(Ljava/lang/String;I)V", "LOYALTY_CARD", "QFF_CARD", "STAFF_CARD", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RewardsCardTypeData {

    @SerializedName(alternate = {"loyalty_card"}, value = "LOYALTY_CARD")
    public static final RewardsCardTypeData LOYALTY_CARD;

    @SerializedName(alternate = {"qff_card"}, value = "QFF_CARD")
    public static final RewardsCardTypeData QFF_CARD;

    @SerializedName(alternate = {"staff_card"}, value = "STAFF_CARD")
    public static final RewardsCardTypeData STAFF_CARD;
    public static final /* synthetic */ RewardsCardTypeData[] d;
    public static final /* synthetic */ EnumEntries e;

    static {
        RewardsCardTypeData rewardsCardTypeData = new RewardsCardTypeData("LOYALTY_CARD", 0);
        LOYALTY_CARD = rewardsCardTypeData;
        RewardsCardTypeData rewardsCardTypeData2 = new RewardsCardTypeData("QFF_CARD", 1);
        QFF_CARD = rewardsCardTypeData2;
        RewardsCardTypeData rewardsCardTypeData3 = new RewardsCardTypeData("STAFF_CARD", 2);
        STAFF_CARD = rewardsCardTypeData3;
        RewardsCardTypeData[] rewardsCardTypeDataArr = {rewardsCardTypeData, rewardsCardTypeData2, rewardsCardTypeData3};
        d = rewardsCardTypeDataArr;
        e = EnumEntriesKt.a(rewardsCardTypeDataArr);
    }

    private RewardsCardTypeData(String str, int i) {
    }

    public static RewardsCardTypeData valueOf(String str) {
        return (RewardsCardTypeData) Enum.valueOf(RewardsCardTypeData.class, str);
    }

    public static RewardsCardTypeData[] values() {
        return (RewardsCardTypeData[]) d.clone();
    }
}
