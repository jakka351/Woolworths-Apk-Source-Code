package au.com.woolworths.shop.lists.data.utils;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/shop/lists/data/utils/ListsAnalyticsAppSection;", "", "shop-lists-data_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ListsAnalyticsAppSection {
    public static final ListsAnalyticsAppSection e;
    public static final ListsAnalyticsAppSection f;
    public static final /* synthetic */ ListsAnalyticsAppSection[] g;
    public static final /* synthetic */ EnumEntries h;
    public final String d;

    static {
        ListsAnalyticsAppSection listsAnalyticsAppSection = new ListsAnalyticsAppSection("LISTS_APP_SECTION", 0, "Lists");
        e = listsAnalyticsAppSection;
        ListsAnalyticsAppSection listsAnalyticsAppSection2 = new ListsAnalyticsAppSection("SNG_APP_SECTION", 1, "Scan&Go");
        f = listsAnalyticsAppSection2;
        ListsAnalyticsAppSection[] listsAnalyticsAppSectionArr = {listsAnalyticsAppSection, listsAnalyticsAppSection2};
        g = listsAnalyticsAppSectionArr;
        h = EnumEntriesKt.a(listsAnalyticsAppSectionArr);
    }

    public ListsAnalyticsAppSection(String str, int i, String str2) {
        this.d = str2;
    }

    public static ListsAnalyticsAppSection valueOf(String str) {
        return (ListsAnalyticsAppSection) Enum.valueOf(ListsAnalyticsAppSection.class, str);
    }

    public static ListsAnalyticsAppSection[] values() {
        return (ListsAnalyticsAppSection[]) g.clone();
    }
}
