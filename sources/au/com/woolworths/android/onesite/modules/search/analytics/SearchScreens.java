package au.com.woolworths.android.onesite.modules.search.analytics;

import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/analytics/SearchScreens;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class SearchScreens implements Screen {
    public static final SearchScreens d;
    public static final /* synthetic */ SearchScreens[] e;
    public static final /* synthetic */ EnumEntries f;

    static {
        SearchScreens searchScreens = new SearchScreens() { // from class: au.com.woolworths.android.onesite.modules.search.analytics.SearchScreens.SEARCH
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Search";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Search screen";
            }
        };
        d = searchScreens;
        SearchScreens[] searchScreensArr = {searchScreens};
        e = searchScreensArr;
        f = EnumEntriesKt.a(searchScreensArr);
    }

    public static SearchScreens valueOf(String str) {
        return (SearchScreens) Enum.valueOf(SearchScreens.class, str);
    }

    public static SearchScreens[] values() {
        return (SearchScreens[]) e.clone();
    }
}
