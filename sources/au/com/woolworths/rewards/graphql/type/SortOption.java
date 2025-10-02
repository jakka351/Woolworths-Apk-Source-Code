package au.com.woolworths.rewards.graphql.type;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/SortOption;", "", "Companion", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SortOption {
    public static final Companion e;
    public static final SortOption f;
    public static final /* synthetic */ SortOption[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/rewards/graphql/type/SortOption$Companion;", "", "schema-rewards"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    public static final class Companion {
    }

    static {
        SortOption sortOption = new SortOption("NATURAL", 0, "NATURAL");
        SortOption sortOption2 = new SortOption("PRICE_ASC", 1, "PRICE_ASC");
        SortOption sortOption3 = new SortOption("PRICE_DESC", 2, "PRICE_DESC");
        SortOption sortOption4 = new SortOption("CREATED_DESC", 3, "CREATED_DESC");
        SortOption sortOption5 = new SortOption("UNKNOWN__", 4, "UNKNOWN__");
        f = sortOption5;
        SortOption[] sortOptionArr = {sortOption, sortOption2, sortOption3, sortOption4, sortOption5};
        g = sortOptionArr;
        h = EnumEntriesKt.a(sortOptionArr);
        e = new Companion();
        CollectionsKt.R("NATURAL", "PRICE_ASC", "PRICE_DESC", "CREATED_DESC");
    }

    public SortOption(String str, int i, String str2) {
        this.d = str2;
    }

    public static SortOption valueOf(String str) {
        return (SortOption) Enum.valueOf(SortOption.class, str);
    }

    public static SortOption[] values() {
        return (SortOption[]) g.clone();
    }
}
