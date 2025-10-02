package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/NumericSearchFacetType;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NumericSearchFacetType {
    public static final Companion e;
    public static final NumericSearchFacetType f;
    public static final /* synthetic */ NumericSearchFacetType[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/NumericSearchFacetType$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        NumericSearchFacetType numericSearchFacetType = new NumericSearchFacetType("PRICE_RANGE", 0, "PRICE_RANGE");
        NumericSearchFacetType numericSearchFacetType2 = new NumericSearchFacetType("UNKNOWN__", 1, "UNKNOWN__");
        f = numericSearchFacetType2;
        NumericSearchFacetType[] numericSearchFacetTypeArr = {numericSearchFacetType, numericSearchFacetType2};
        g = numericSearchFacetTypeArr;
        h = EnumEntriesKt.a(numericSearchFacetTypeArr);
        e = new Companion();
        CollectionsKt.Q("PRICE_RANGE");
    }

    public NumericSearchFacetType(String str, int i, String str2) {
        this.d = str2;
    }

    public static NumericSearchFacetType valueOf(String str) {
        return (NumericSearchFacetType) Enum.valueOf(NumericSearchFacetType.class, str);
    }

    public static NumericSearchFacetType[] values() {
        return (NumericSearchFacetType[]) g.clone();
    }
}
