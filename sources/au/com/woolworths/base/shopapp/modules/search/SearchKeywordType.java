package au.com.woolworths.base.shopapp.modules.search;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/search/SearchKeywordType;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SearchKeywordType {
    public static final SearchKeywordType e;
    public static final SearchKeywordType f;
    public static final SearchKeywordType g;
    public static final SearchKeywordType h;
    public static final /* synthetic */ SearchKeywordType[] i;
    public static final /* synthetic */ EnumEntries j;
    public final String d;

    static {
        SearchKeywordType searchKeywordType = new SearchKeywordType("POPULAR_SEARCH", 0, "Popular Search");
        e = searchKeywordType;
        SearchKeywordType searchKeywordType2 = new SearchKeywordType("RECENT_SEARCH", 1, "Recent Search");
        f = searchKeywordType2;
        SearchKeywordType searchKeywordType3 = new SearchKeywordType("SELF_TYPED", 2, "Self-Typed");
        g = searchKeywordType3;
        SearchKeywordType searchKeywordType4 = new SearchKeywordType("SUGGESTED", 3, "Suggested");
        h = searchKeywordType4;
        SearchKeywordType[] searchKeywordTypeArr = {searchKeywordType, searchKeywordType2, searchKeywordType3, searchKeywordType4};
        i = searchKeywordTypeArr;
        j = EnumEntriesKt.a(searchKeywordTypeArr);
    }

    public SearchKeywordType(String str, int i2, String str2) {
        this.d = str2;
    }

    public static SearchKeywordType valueOf(String str) {
        return (SearchKeywordType) Enum.valueOf(SearchKeywordType.class, str);
    }

    public static SearchKeywordType[] values() {
        return (SearchKeywordType[]) i.clone();
    }
}
