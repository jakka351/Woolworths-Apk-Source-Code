package com.woolworths.scanlibrary.ui.menu.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import com.woolworths.scanlibrary.analytics.Screens;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/menu/analytics/MenuActionData;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class MenuActionData implements Action {
    public static final MenuActionData e;
    public static final MenuActionData f;
    public static final /* synthetic */ MenuActionData[] g;
    public static final /* synthetic */ EnumEntries h;
    public final Screens d = Screens.k;

    static {
        MenuActionData menuActionData = new MenuActionData() { // from class: com.woolworths.scanlibrary.ui.menu.analytics.MenuActionData.MEDALLIA_ERROR_IMPRESSION
            public final Category i = Category.v;
            public final String j = "Form Error";

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
        e = menuActionData;
        MenuActionData menuActionData2 = new MenuActionData() { // from class: com.woolworths.scanlibrary.ui.menu.analytics.MenuActionData.SEND_FEEDBACK_MENU_CLICK
            public final Category i = Category.m;
            public final String j = "External Link";

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
        f = menuActionData2;
        MenuActionData[] menuActionDataArr = {menuActionData, menuActionData2};
        g = menuActionDataArr;
        h = EnumEntriesKt.a(menuActionDataArr);
    }

    public MenuActionData(String str, int i) {
    }

    public static MenuActionData valueOf(String str) {
        return (MenuActionData) Enum.valueOf(MenuActionData.class, str);
    }

    public static MenuActionData[] values() {
        return (MenuActionData[]) g.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
