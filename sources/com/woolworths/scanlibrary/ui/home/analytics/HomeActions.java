package com.woolworths.scanlibrary.ui.home.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import com.woolworths.scanlibrary.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/home/analytics/HomeActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class HomeActions implements Action {
    public static final HomeActions e;
    public static final HomeActions f;
    public static final HomeActions g;
    public static final HomeActions h;
    public static final HomeActions i;
    public static final /* synthetic */ HomeActions[] j;
    public static final /* synthetic */ EnumEntries k;
    public final Screen d = Screens.d;

    static {
        HomeActions homeActions = new HomeActions() { // from class: com.woolworths.scanlibrary.ui.home.analytics.HomeActions.OPEN_CARTS_CLICK
            public final Category l = Category.m;
            public final String m = "Cart Open";

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
        e = homeActions;
        HomeActions homeActions2 = new HomeActions() { // from class: com.woolworths.scanlibrary.ui.home.analytics.HomeActions.OPEN_HAMBURGER_MENU_CLICK
            public final Category l = Category.m;
            public final String m = "Menu Hamburger";

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
        f = homeActions2;
        HomeActions homeActions3 = new HomeActions() { // from class: com.woolworths.scanlibrary.ui.home.analytics.HomeActions.SCAN_ITEM_CLICK
            public final Category l = Category.m;
            public final String m = "scan an item";

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
        g = homeActions3;
        HomeActions homeActions4 = new HomeActions() { // from class: com.woolworths.scanlibrary.ui.home.analytics.HomeActions.SEARCH_ICON_CLICK
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
        h = homeActions4;
        HomeActions homeActions5 = new HomeActions() { // from class: com.woolworths.scanlibrary.ui.home.analytics.HomeActions.USE_MY_LISTS_CLICK
            public final Category l = Category.m;
            public final String m = "use my lists";

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
        i = homeActions5;
        HomeActions[] homeActionsArr = {homeActions, homeActions2, homeActions3, homeActions4, homeActions5};
        j = homeActionsArr;
        k = EnumEntriesKt.a(homeActionsArr);
    }

    public HomeActions(String str, int i2) {
    }

    public static HomeActions valueOf(String str) {
        return (HomeActions) Enum.valueOf(HomeActions.class, str);
    }

    public static HomeActions[] values() {
        return (HomeActions[]) j.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
