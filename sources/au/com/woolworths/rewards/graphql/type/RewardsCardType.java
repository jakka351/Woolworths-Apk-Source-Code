package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/RewardsCardType;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsCardType {
    public static final Companion e;
    public static final RewardsCardType f;
    public static final /* synthetic */ RewardsCardType[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/RewardsCardType$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        RewardsCardType rewardsCardType = new RewardsCardType("LOYALTY_CARD", 0, "LOYALTY_CARD");
        RewardsCardType rewardsCardType2 = new RewardsCardType("QFF_CARD", 1, "QFF_CARD");
        RewardsCardType rewardsCardType3 = new RewardsCardType("STAFF_CARD", 2, "STAFF_CARD");
        RewardsCardType rewardsCardType4 = new RewardsCardType("UNKNOWN__", 3, "UNKNOWN__");
        f = rewardsCardType4;
        RewardsCardType[] rewardsCardTypeArr = {rewardsCardType, rewardsCardType2, rewardsCardType3, rewardsCardType4};
        g = rewardsCardTypeArr;
        h = EnumEntriesKt.a(rewardsCardTypeArr);
        e = new Companion();
        CollectionsKt.R("LOYALTY_CARD", "QFF_CARD", "STAFF_CARD");
    }

    public RewardsCardType(String str, int i, String str2) {
        this.d = str2;
    }

    public static RewardsCardType valueOf(String str) {
        return (RewardsCardType) Enum.valueOf(RewardsCardType.class, str);
    }

    public static RewardsCardType[] values() {
        return (RewardsCardType[]) g.clone();
    }
}
