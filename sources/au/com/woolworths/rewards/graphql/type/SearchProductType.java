package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/SearchProductType;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SearchProductType {
    public static final Companion e;
    public static final SearchProductType f;
    public static final /* synthetic */ SearchProductType[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/SearchProductType$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        SearchProductType searchProductType = new SearchProductType("THIRD_PARTY_PRODUCT", 0, "THIRD_PARTY_PRODUCT");
        SearchProductType searchProductType2 = new SearchProductType("GIFTING_PRODUCT", 1, "GIFTING_PRODUCT");
        SearchProductType searchProductType3 = new SearchProductType("ALL", 2, "ALL");
        SearchProductType searchProductType4 = new SearchProductType("UNKNOWN__", 3, "UNKNOWN__");
        f = searchProductType4;
        SearchProductType[] searchProductTypeArr = {searchProductType, searchProductType2, searchProductType3, searchProductType4};
        g = searchProductTypeArr;
        h = EnumEntriesKt.a(searchProductTypeArr);
        e = new Companion();
        CollectionsKt.R("THIRD_PARTY_PRODUCT", "GIFTING_PRODUCT", "ALL");
    }

    public SearchProductType(String str, int i, String str2) {
        this.d = str2;
    }

    public static SearchProductType valueOf(String str) {
        return (SearchProductType) Enum.valueOf(SearchProductType.class, str);
    }

    public static SearchProductType[] values() {
        return (SearchProductType[]) g.clone();
    }
}
