package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/RewardsNewBadgeMenuType;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsNewBadgeMenuType {
    public static final Companion e;
    public static final RewardsNewBadgeMenuType f;
    public static final RewardsNewBadgeMenuType g;
    public static final /* synthetic */ RewardsNewBadgeMenuType[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/RewardsNewBadgeMenuType$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        RewardsNewBadgeMenuType rewardsNewBadgeMenuType = new RewardsNewBadgeMenuType("accountHome", 0, "accountHome");
        f = rewardsNewBadgeMenuType;
        RewardsNewBadgeMenuType rewardsNewBadgeMenuType2 = new RewardsNewBadgeMenuType("discoverHome", 1, "discoverHome");
        RewardsNewBadgeMenuType rewardsNewBadgeMenuType3 = new RewardsNewBadgeMenuType("UNKNOWN__", 2, "UNKNOWN__");
        g = rewardsNewBadgeMenuType3;
        RewardsNewBadgeMenuType[] rewardsNewBadgeMenuTypeArr = {rewardsNewBadgeMenuType, rewardsNewBadgeMenuType2, rewardsNewBadgeMenuType3};
        h = rewardsNewBadgeMenuTypeArr;
        i = EnumEntriesKt.a(rewardsNewBadgeMenuTypeArr);
        e = new Companion();
        CollectionsKt.R("accountHome", "discoverHome");
    }

    public RewardsNewBadgeMenuType(String str, int i2, String str2) {
        this.d = str2;
    }

    public static RewardsNewBadgeMenuType valueOf(String str) {
        return (RewardsNewBadgeMenuType) Enum.valueOf(RewardsNewBadgeMenuType.class, str);
    }

    public static RewardsNewBadgeMenuType[] values() {
        return (RewardsNewBadgeMenuType[]) h.clone();
    }
}
