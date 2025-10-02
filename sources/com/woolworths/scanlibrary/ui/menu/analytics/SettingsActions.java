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
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/woolworths/scanlibrary/ui/menu/analytics/SettingsActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "scanGoLibrary_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class SettingsActions implements Action {
    public static final SettingsActions e;
    public static final SettingsActions f;
    public static final /* synthetic */ SettingsActions[] g;
    public static final /* synthetic */ EnumEntries h;
    public final Screen d = Screens.m;

    static {
        SettingsActions settingsActions = new SettingsActions() { // from class: com.woolworths.scanlibrary.ui.menu.analytics.SettingsActions.AUTO_CHECK_TOGGLE_OFF
            public final Category i = Category.h0;
            public final String j = "auto check scanned items from list";

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
        e = settingsActions;
        SettingsActions settingsActions2 = new SettingsActions() { // from class: com.woolworths.scanlibrary.ui.menu.analytics.SettingsActions.AUTO_CHECK_TOGGLE_ON
            public final Category i = Category.i0;
            public final String j = "auto check scanned items from list";

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
        f = settingsActions2;
        SettingsActions[] settingsActionsArr = {settingsActions, settingsActions2};
        g = settingsActionsArr;
        h = EnumEntriesKt.a(settingsActionsArr);
    }

    public SettingsActions(String str, int i) {
    }

    public static SettingsActions valueOf(String str) {
        return (SettingsActions) Enum.valueOf(SettingsActions.class, str);
    }

    public static SettingsActions[] values() {
        return (SettingsActions[]) g.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f, reason: from getter */
    public final Screen getD() {
        return this.d;
    }
}
