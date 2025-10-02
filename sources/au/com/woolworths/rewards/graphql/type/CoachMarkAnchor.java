package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/CoachMarkAnchor;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CoachMarkAnchor {
    public static final Companion e;
    public static final CoachMarkAnchor f;
    public static final /* synthetic */ CoachMarkAnchor[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/CoachMarkAnchor$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        CoachMarkAnchor coachMarkAnchor = new CoachMarkAnchor("ACCOUNT_TAB", 0, "ACCOUNT_TAB");
        CoachMarkAnchor coachMarkAnchor2 = new CoachMarkAnchor("ACTIVITY_TAB", 1, "ACTIVITY_TAB");
        CoachMarkAnchor coachMarkAnchor3 = new CoachMarkAnchor("BOOSTERS_TAB", 2, "BOOSTERS_TAB");
        CoachMarkAnchor coachMarkAnchor4 = new CoachMarkAnchor("CARD_TAB", 3, "CARD_TAB");
        CoachMarkAnchor coachMarkAnchor5 = new CoachMarkAnchor("DISCOVER_TAB", 4, "DISCOVER_TAB");
        CoachMarkAnchor coachMarkAnchor6 = new CoachMarkAnchor("UNKNOWN__", 5, "UNKNOWN__");
        f = coachMarkAnchor6;
        CoachMarkAnchor[] coachMarkAnchorArr = {coachMarkAnchor, coachMarkAnchor2, coachMarkAnchor3, coachMarkAnchor4, coachMarkAnchor5, coachMarkAnchor6};
        g = coachMarkAnchorArr;
        h = EnumEntriesKt.a(coachMarkAnchorArr);
        e = new Companion();
        CollectionsKt.R("ACCOUNT_TAB", "ACTIVITY_TAB", "BOOSTERS_TAB", "CARD_TAB", "DISCOVER_TAB");
    }

    public CoachMarkAnchor(String str, int i, String str2) {
        this.d = str2;
    }

    public static CoachMarkAnchor valueOf(String str) {
        return (CoachMarkAnchor) Enum.valueOf(CoachMarkAnchor.class, str);
    }

    public static CoachMarkAnchor[] values() {
        return (CoachMarkAnchor[]) g.clone();
    }
}
