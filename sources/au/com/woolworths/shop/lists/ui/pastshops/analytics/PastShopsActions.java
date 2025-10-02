package au.com.woolworths.shop.lists.ui.pastshops.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.shop.lists.data.utils.ListsAnalyticsAppSection;
import au.com.woolworths.shop.lists.ui.ListScreen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/ui/pastshops/analytics/PastShopsActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class PastShopsActions implements Action {
    public static final PastShopsActions e;
    public static final PastShopsActions f;
    public static final PastShopsActions g;
    public static final PastShopsActions h;
    public static final PastShopsActions i;
    public static final /* synthetic */ PastShopsActions[] j;
    public static final /* synthetic */ EnumEntries k;
    public final ListScreen.PastShopsList d;

    static {
        PastShopsActions pastShopsActions = new PastShopsActions() { // from class: au.com.woolworths.shop.lists.ui.pastshops.analytics.PastShopsActions.NETWORK_ERROR
            public final Category l = Category.v;
            public final String m = "Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.l;
            }
        };
        e = pastShopsActions;
        PastShopsActions pastShopsActions2 = new PastShopsActions() { // from class: au.com.woolworths.shop.lists.ui.pastshops.analytics.PastShopsActions.SERVER_ERROR
            public final Category l = Category.v;
            public final String m = "Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.l;
            }
        };
        f = pastShopsActions2;
        PastShopsActions pastShopsActions3 = new PastShopsActions() { // from class: au.com.woolworths.shop.lists.ui.pastshops.analytics.PastShopsActions.TRY_AGAIN_NETWORK_ERROR
            public final Category l = Category.m;
            public final String m = "Network Error - Try Again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.l;
            }
        };
        g = pastShopsActions3;
        PastShopsActions pastShopsActions4 = new PastShopsActions() { // from class: au.com.woolworths.shop.lists.ui.pastshops.analytics.PastShopsActions.TRY_AGAIN_SERVER_ERROR
            public final Category l = Category.m;
            public final String m = "Server Error - Try Again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.l;
            }
        };
        h = pastShopsActions4;
        PastShopsActions pastShopsActions5 = new PastShopsActions() { // from class: au.com.woolworths.shop.lists.ui.pastshops.analytics.PastShopsActions.SEARCH_ICON_CLICK
            public final Category l = Category.m;
            public final String m = "Tap Search Icon";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getM() {
                return this.m;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getL() {
                return this.l;
            }
        };
        i = pastShopsActions5;
        PastShopsActions[] pastShopsActionsArr = {pastShopsActions, pastShopsActions2, pastShopsActions3, pastShopsActions4, pastShopsActions5};
        j = pastShopsActionsArr;
        k = EnumEntriesKt.a(pastShopsActionsArr);
    }

    public PastShopsActions(String str, int i2) {
        ListsAnalyticsAppSection listsAnalyticsAppSection = ListsAnalyticsAppSection.e;
        this.d = new ListScreen.PastShopsList();
    }

    public static PastShopsActions valueOf(String str) {
        return (PastShopsActions) Enum.valueOf(PastShopsActions.class, str);
    }

    public static PastShopsActions[] values() {
        return (PastShopsActions[]) j.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
