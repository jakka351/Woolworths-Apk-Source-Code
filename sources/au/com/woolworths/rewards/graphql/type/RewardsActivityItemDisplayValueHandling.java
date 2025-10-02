package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/RewardsActivityItemDisplayValueHandling;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsActivityItemDisplayValueHandling {
    public static final Companion e;
    public static final RewardsActivityItemDisplayValueHandling f;
    public static final /* synthetic */ RewardsActivityItemDisplayValueHandling[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/RewardsActivityItemDisplayValueHandling$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        RewardsActivityItemDisplayValueHandling rewardsActivityItemDisplayValueHandling = new RewardsActivityItemDisplayValueHandling("STRIKE_THROUGH", 0, "STRIKE_THROUGH");
        RewardsActivityItemDisplayValueHandling rewardsActivityItemDisplayValueHandling2 = new RewardsActivityItemDisplayValueHandling("NORMAL", 1, "NORMAL");
        RewardsActivityItemDisplayValueHandling rewardsActivityItemDisplayValueHandling3 = new RewardsActivityItemDisplayValueHandling("UNKNOWN__", 2, "UNKNOWN__");
        f = rewardsActivityItemDisplayValueHandling3;
        RewardsActivityItemDisplayValueHandling[] rewardsActivityItemDisplayValueHandlingArr = {rewardsActivityItemDisplayValueHandling, rewardsActivityItemDisplayValueHandling2, rewardsActivityItemDisplayValueHandling3};
        g = rewardsActivityItemDisplayValueHandlingArr;
        h = EnumEntriesKt.a(rewardsActivityItemDisplayValueHandlingArr);
        e = new Companion();
        CollectionsKt.R("STRIKE_THROUGH", "NORMAL");
    }

    public RewardsActivityItemDisplayValueHandling(String str, int i, String str2) {
        this.d = str2;
    }

    public static RewardsActivityItemDisplayValueHandling valueOf(String str) {
        return (RewardsActivityItemDisplayValueHandling) Enum.valueOf(RewardsActivityItemDisplayValueHandling.class, str);
    }

    public static RewardsActivityItemDisplayValueHandling[] values() {
        return (RewardsActivityItemDisplayValueHandling[]) g.clone();
    }
}
