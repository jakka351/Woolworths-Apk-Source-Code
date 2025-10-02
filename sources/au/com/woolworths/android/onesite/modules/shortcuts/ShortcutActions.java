package au.com.woolworths.android.onesite.modules.shortcuts;

import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.NotificationAction;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/android/onesite/modules/shortcuts/ShortcutActions;", "Lau/com/woolworths/android/onesite/analytics/NotificationAction;", "", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class ShortcutActions implements NotificationAction {
    public static final ShortcutActions d;
    public static final ShortcutActions e;
    public static final ShortcutActions f;
    public static final ShortcutActions g;
    public static final /* synthetic */ ShortcutActions[] h;
    public static final /* synthetic */ EnumEntries i;

    static {
        ShortcutActions shortcutActions = new ShortcutActions() { // from class: au.com.woolworths.android.onesite.modules.shortcuts.ShortcutActions.LISTS_SHORTCUT_USED
            public final Category j = Category.Y;
            public final String k = "Default list";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.k;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.j;
            }
        };
        d = shortcutActions;
        ShortcutActions shortcutActions2 = new ShortcutActions() { // from class: au.com.woolworths.android.onesite.modules.shortcuts.ShortcutActions.SEARCH_SHORTCUT_USED
            public final Category j = Category.Y;
            public final String k = "Search";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.k;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.j;
            }
        };
        e = shortcutActions2;
        ShortcutActions shortcutActions3 = new ShortcutActions() { // from class: au.com.woolworths.android.onesite.modules.shortcuts.ShortcutActions.SPECIALS_SHORTCUT_USED
            public final Category j = Category.Y;
            public final String k = "Specials";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.k;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.j;
            }
        };
        f = shortcutActions3;
        ShortcutActions shortcutActions4 = new ShortcutActions() { // from class: au.com.woolworths.android.onesite.modules.shortcuts.ShortcutActions.REWARDS_BARCODE_SHORTCUT_USED
            public final Category j = Category.Y;
            public final String k = "Show barcode";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getK() {
                return this.k;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getJ() {
                return this.j;
            }
        };
        g = shortcutActions4;
        ShortcutActions[] shortcutActionsArr = {shortcutActions, shortcutActions2, shortcutActions3, shortcutActions4};
        h = shortcutActionsArr;
        i = EnumEntriesKt.a(shortcutActionsArr);
    }

    public static ShortcutActions valueOf(String str) {
        return (ShortcutActions) Enum.valueOf(ShortcutActions.class, str);
    }

    public static ShortcutActions[] values() {
        return (ShortcutActions[]) h.clone();
    }
}
