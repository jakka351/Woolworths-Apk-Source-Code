package au.com.woolworths.android.onesite.modules.search.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/modules/search/analytics/SearchActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class SearchActions implements Action {
    public static final SearchActions e;
    public static final SearchActions f;
    public static final /* synthetic */ SearchActions[] g;
    public static final /* synthetic */ EnumEntries h;
    public final SearchScreens d = SearchScreens.d;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/android/onesite/modules/search/analytics/SearchActions.VOICE_SEARCH", "Lau/com/woolworths/android/onesite/modules/search/analytics/SearchActions;", "app-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class VOICE_SEARCH extends SearchActions {
        public final Category i;
        public final String j;

        public VOICE_SEARCH() {
            super("VOICE_SEARCH", 1);
            this.i = Category.k0;
            this.j = "tap on olive voice product finder";
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: a, reason: from getter */
        public final String getJ() {
            return this.j;
        }

        @Override // au.com.woolworths.android.onesite.analytics.BaseAction
        /* renamed from: b, reason: from getter */
        public final Category getI() {
            return this.i;
        }
    }

    static {
        SearchActions searchActions = new SearchActions() { // from class: au.com.woolworths.android.onesite.modules.search.analytics.SearchActions.RUN_SEARCH
            public final Category i = Category.d0;
            public final String j = "Search";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getJ() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getI() {
                return this.i;
            }
        };
        e = searchActions;
        VOICE_SEARCH voice_search = new VOICE_SEARCH();
        f = voice_search;
        SearchActions[] searchActionsArr = {searchActions, voice_search};
        g = searchActionsArr;
        h = EnumEntriesKt.a(searchActionsArr);
    }

    public SearchActions(String str, int i) {
    }

    public static SearchActions valueOf(String str) {
        return (SearchActions) Enum.valueOf(SearchActions.class, str);
    }

    public static SearchActions[] values() {
        return (SearchActions[]) g.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
