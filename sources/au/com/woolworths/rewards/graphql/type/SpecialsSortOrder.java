package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/SpecialsSortOrder;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SpecialsSortOrder {
    public static final Companion e;
    public static final SpecialsSortOrder f;
    public static final /* synthetic */ SpecialsSortOrder[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/SpecialsSortOrder$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        SpecialsSortOrder specialsSortOrder = new SpecialsSortOrder("RELEVANCE", 0, "RELEVANCE");
        SpecialsSortOrder specialsSortOrder2 = new SpecialsSortOrder("PRICE_HIGH_TO_LOW", 1, "PRICE_HIGH_TO_LOW");
        SpecialsSortOrder specialsSortOrder3 = new SpecialsSortOrder("PRICE_LOW_TO_HIGH", 2, "PRICE_LOW_TO_HIGH");
        SpecialsSortOrder specialsSortOrder4 = new SpecialsSortOrder("NAME_A_TO_Z", 3, "NAME_A_TO_Z");
        SpecialsSortOrder specialsSortOrder5 = new SpecialsSortOrder("NAME_Z_TO_A", 4, "NAME_Z_TO_A");
        SpecialsSortOrder specialsSortOrder6 = new SpecialsSortOrder("UNKNOWN__", 5, "UNKNOWN__");
        f = specialsSortOrder6;
        SpecialsSortOrder[] specialsSortOrderArr = {specialsSortOrder, specialsSortOrder2, specialsSortOrder3, specialsSortOrder4, specialsSortOrder5, specialsSortOrder6};
        g = specialsSortOrderArr;
        h = EnumEntriesKt.a(specialsSortOrderArr);
        e = new Companion();
        CollectionsKt.R("RELEVANCE", "PRICE_HIGH_TO_LOW", "PRICE_LOW_TO_HIGH", "NAME_A_TO_Z", "NAME_Z_TO_A");
    }

    public SpecialsSortOrder(String str, int i, String str2) {
        this.d = str2;
    }

    public static SpecialsSortOrder valueOf(String str) {
        return (SpecialsSortOrder) Enum.valueOf(SpecialsSortOrder.class, str);
    }

    public static SpecialsSortOrder[] values() {
        return (SpecialsSortOrder[]) g.clone();
    }
}
