package au.com.woolworths.shop.lists.data.prefs;

import com.woolworths.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/prefs/SortBy;", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SortBy {
    public static final SortBy f;
    public static final SortBy g;
    public static final SortBy h;
    public static final /* synthetic */ SortBy[] i;
    public static final /* synthetic */ EnumEntries j;
    public final int d;
    public final int e;

    static {
        SortBy sortBy = new SortBy(0, R.string.shop_lists_sort_category, R.string.shop_lists_sort_category_tracking, "CATEGORY");
        f = sortBy;
        SortBy sortBy2 = new SortBy(1, R.string.shop_lists_sort_last_added, R.string.shop_lists_sort_last_added_tracking, "LAST_ADDED");
        SortBy sortBy3 = new SortBy(2, R.string.shop_lists_sort_alphabetic, R.string.shop_lists_sort_alphabetic, "ALPHABETIC");
        SortBy sortBy4 = new SortBy(3, R.string.shop_lists_sort_specials, R.string.shop_lists_sort_specials, "SPECIALS");
        g = sortBy4;
        SortBy sortBy5 = new SortBy(4, R.string.shop_lists_sort_aisle, R.string.shop_lists_sort_aisle_tracking, "AISLE");
        h = sortBy5;
        SortBy[] sortByArr = {sortBy, sortBy2, sortBy3, sortBy4, sortBy5};
        i = sortByArr;
        j = EnumEntriesKt.a(sortByArr);
    }

    public SortBy(int i2, int i3, int i4, String str) {
        this.d = i3;
        this.e = i4;
    }

    public static SortBy valueOf(String str) {
        return (SortBy) Enum.valueOf(SortBy.class, str);
    }

    public static SortBy[] values() {
        return (SortBy[]) i.clone();
    }
}
