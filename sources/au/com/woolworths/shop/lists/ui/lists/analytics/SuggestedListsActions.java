package au.com.woolworths.shop.lists.ui.lists.analytics;

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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/shop/lists/ui/lists/analytics/SuggestedListsActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "shop-lists_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class SuggestedListsActions implements Action {
    public static final SuggestedListsActions e;
    public static final SuggestedListsActions f;
    public static final SuggestedListsActions g;
    public static final SuggestedListsActions h;
    public static final SuggestedListsActions i;
    public static final /* synthetic */ SuggestedListsActions[] j;
    public static final /* synthetic */ EnumEntries k;
    public final ListScreen.Lists d = new ListScreen.Lists(ListsAnalyticsAppSection.e);

    static {
        SuggestedListsActions suggestedListsActions = new SuggestedListsActions() { // from class: au.com.woolworths.shop.lists.ui.lists.analytics.SuggestedListsActions.NETWORK_ERROR
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
        e = suggestedListsActions;
        SuggestedListsActions suggestedListsActions2 = new SuggestedListsActions() { // from class: au.com.woolworths.shop.lists.ui.lists.analytics.SuggestedListsActions.SERVER_ERROR
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
        f = suggestedListsActions2;
        SuggestedListsActions suggestedListsActions3 = new SuggestedListsActions() { // from class: au.com.woolworths.shop.lists.ui.lists.analytics.SuggestedListsActions.TRY_AGAIN_NETWORK_ERROR
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
        g = suggestedListsActions3;
        SuggestedListsActions suggestedListsActions4 = new SuggestedListsActions() { // from class: au.com.woolworths.shop.lists.ui.lists.analytics.SuggestedListsActions.SUGGESTED_LIST_CLICK
            public final Category l = Category.m;
            public final String m = "tap suggested list";

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
        h = suggestedListsActions4;
        SuggestedListsActions suggestedListsActions5 = new SuggestedListsActions() { // from class: au.com.woolworths.shop.lists.ui.lists.analytics.SuggestedListsActions.TRY_AGAIN_SERVER_ERROR
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
        i = suggestedListsActions5;
        SuggestedListsActions[] suggestedListsActionsArr = {suggestedListsActions, suggestedListsActions2, suggestedListsActions3, suggestedListsActions4, suggestedListsActions5};
        j = suggestedListsActionsArr;
        k = EnumEntriesKt.a(suggestedListsActionsArr);
    }

    public SuggestedListsActions(String str, int i2) {
    }

    public static SuggestedListsActions valueOf(String str) {
        return (SuggestedListsActions) Enum.valueOf(SuggestedListsActions.class, str);
    }

    public static SuggestedListsActions[] values() {
        return (SuggestedListsActions[]) j.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
