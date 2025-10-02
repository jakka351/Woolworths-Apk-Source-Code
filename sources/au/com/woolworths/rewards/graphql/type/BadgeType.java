package au.com.woolworths.rewards.graphql.type;

import com.apollographql.apollo.api.EnumType;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/BadgeType;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BadgeType {
    public static final Companion e;
    public static final EnumType f;
    public static final BadgeType g;
    public static final /* synthetic */ BadgeType[] h;
    public static final /* synthetic */ EnumEntries i;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/BadgeType$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        BadgeType badgeType = new BadgeType("SPECIAL", 0, "SPECIAL");
        BadgeType badgeType2 = new BadgeType("NEW", 1, "NEW");
        BadgeType badgeType3 = new BadgeType("REWARDS", 2, "REWARDS");
        BadgeType badgeType4 = new BadgeType("PRIMARY", 3, "PRIMARY");
        BadgeType badgeType5 = new BadgeType("INFO", 4, "INFO");
        BadgeType badgeType6 = new BadgeType("ALWAYS", 5, "ALWAYS");
        BadgeType badgeType7 = new BadgeType("INFO_TINT", 6, "INFO_TINT");
        BadgeType badgeType8 = new BadgeType("STATUS_BACKGROUND_POSITIVE", 7, "STATUS_BACKGROUND_POSITIVE");
        BadgeType badgeType9 = new BadgeType("ACCENT_TINT", 8, "ACCENT_TINT");
        BadgeType badgeType10 = new BadgeType("ALWAYS_TINT", 9, "ALWAYS_TINT");
        BadgeType badgeType11 = new BadgeType("UNKNOWN__", 10, "UNKNOWN__");
        g = badgeType11;
        BadgeType[] badgeTypeArr = {badgeType, badgeType2, badgeType3, badgeType4, badgeType5, badgeType6, badgeType7, badgeType8, badgeType9, badgeType10, badgeType11};
        h = badgeTypeArr;
        i = EnumEntriesKt.a(badgeTypeArr);
        e = new Companion();
        f = new EnumType("BadgeType", CollectionsKt.R("SPECIAL", "NEW", "REWARDS", "PRIMARY", "INFO", "ALWAYS", "INFO_TINT", "STATUS_BACKGROUND_POSITIVE", "ACCENT_TINT", "ALWAYS_TINT"));
    }

    public BadgeType(String str, int i2, String str2) {
        this.d = str2;
    }

    public static BadgeType valueOf(String str) {
        return (BadgeType) Enum.valueOf(BadgeType.class, str);
    }

    public static BadgeType[] values() {
        return (BadgeType[]) h.clone();
    }
}
