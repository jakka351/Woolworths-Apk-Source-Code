package au.com.woolworths.feature.shop.notification.preferences.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/analytics/NotificationPreferencesGuestBlockedActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class NotificationPreferencesGuestBlockedActions implements Action {
    public static final NotificationPreferencesGuestBlockedActions e;
    public static final NotificationPreferencesGuestBlockedActions f;
    public static final /* synthetic */ NotificationPreferencesGuestBlockedActions[] g;
    public static final /* synthetic */ EnumEntries h;
    public final NotificationPreferenceScreens d = NotificationPreferenceScreens.e;

    static {
        NotificationPreferencesGuestBlockedActions notificationPreferencesGuestBlockedActions = new NotificationPreferencesGuestBlockedActions() { // from class: au.com.woolworths.feature.shop.notification.preferences.analytics.NotificationPreferencesGuestBlockedActions.GUEST_USER_LOG_IN_CLICK
            public final Category i = Category.m;
            public final String j = "Log In";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getL() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.i;
            }
        };
        e = notificationPreferencesGuestBlockedActions;
        NotificationPreferencesGuestBlockedActions notificationPreferencesGuestBlockedActions2 = new NotificationPreferencesGuestBlockedActions() { // from class: au.com.woolworths.feature.shop.notification.preferences.analytics.NotificationPreferencesGuestBlockedActions.GUEST_USER_SIGN_UP_CLICK
            public final Category i = Category.m;
            public final String j = "Sign Up";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.j;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.i;
            }
        };
        f = notificationPreferencesGuestBlockedActions2;
        NotificationPreferencesGuestBlockedActions[] notificationPreferencesGuestBlockedActionsArr = {notificationPreferencesGuestBlockedActions, notificationPreferencesGuestBlockedActions2};
        g = notificationPreferencesGuestBlockedActionsArr;
        h = EnumEntriesKt.a(notificationPreferencesGuestBlockedActionsArr);
    }

    public NotificationPreferencesGuestBlockedActions(String str, int i) {
    }

    public static NotificationPreferencesGuestBlockedActions valueOf(String str) {
        return (NotificationPreferencesGuestBlockedActions) Enum.valueOf(NotificationPreferencesGuestBlockedActions.class, str);
    }

    public static NotificationPreferencesGuestBlockedActions[] values() {
        return (NotificationPreferencesGuestBlockedActions[]) g.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
