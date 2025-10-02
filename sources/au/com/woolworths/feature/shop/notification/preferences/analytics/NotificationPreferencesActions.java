package au.com.woolworths.feature.shop.notification.preferences.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/analytics/NotificationPreferencesActions;", "Lau/com/woolworths/android/onesite/analytics/Action;", "", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class NotificationPreferencesActions implements Action {
    public static final NotificationPreferencesActions e;
    public static final NotificationPreferencesActions f;
    public static final NotificationPreferencesActions g;
    public static final NotificationPreferencesActions h;
    public static final NotificationPreferencesActions i;
    public static final NotificationPreferencesActions j;
    public static final NotificationPreferencesActions k;
    public static final /* synthetic */ NotificationPreferencesActions[] l;
    public static final /* synthetic */ EnumEntries m;
    public final NotificationPreferenceScreens d = NotificationPreferenceScreens.d;

    static {
        NotificationPreferencesActions notificationPreferencesActions = new NotificationPreferencesActions() { // from class: au.com.woolworths.feature.shop.notification.preferences.analytics.NotificationPreferencesActions.CHECK_PERMISSIONS_IMPRESSION
            public final Category n = Category.B;
            public final String o = "don't miss out";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        e = notificationPreferencesActions;
        NotificationPreferencesActions notificationPreferencesActions2 = new NotificationPreferencesActions() { // from class: au.com.woolworths.feature.shop.notification.preferences.analytics.NotificationPreferencesActions.CHECK_PERMISSIONS_CTA_CLICK
            public final Category n = Category.m;
            public final String o = "turn on in settings";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        f = notificationPreferencesActions2;
        NotificationPreferencesActions notificationPreferencesActions3 = new NotificationPreferencesActions() { // from class: au.com.woolworths.feature.shop.notification.preferences.analytics.NotificationPreferencesActions.NETWORK_ERROR_IMPRESSION
            public final Category n = Category.v;
            public final String o = "Network Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        g = notificationPreferencesActions3;
        NotificationPreferencesActions notificationPreferencesActions4 = new NotificationPreferencesActions() { // from class: au.com.woolworths.feature.shop.notification.preferences.analytics.NotificationPreferencesActions.NETWORK_ERROR_TRY_AGAIN_CLICK
            public final Category n = Category.m;
            public final String o = "Network Error - Try Again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        h = notificationPreferencesActions4;
        NotificationPreferencesActions notificationPreferencesActions5 = new NotificationPreferencesActions() { // from class: au.com.woolworths.feature.shop.notification.preferences.analytics.NotificationPreferencesActions.SERVER_ERROR_IMPRESSION
            public final Category n = Category.v;
            public final String o = "Server Error";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        i = notificationPreferencesActions5;
        NotificationPreferencesActions notificationPreferencesActions6 = new NotificationPreferencesActions() { // from class: au.com.woolworths.feature.shop.notification.preferences.analytics.NotificationPreferencesActions.SERVER_ERROR_TRY_AGAIN_CLICK
            public final Category n = Category.m;
            public final String o = "Server Error - Try Again";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        j = notificationPreferencesActions6;
        NotificationPreferencesActions notificationPreferencesActions7 = new NotificationPreferencesActions() { // from class: au.com.woolworths.feature.shop.notification.preferences.analytics.NotificationPreferencesActions.FAILED_TO_UPDATE_SWITCH_SNACK_BAR_IMPRESSION
            public final Category n = Category.g0;
            public final String o = "unable to change your preference setting due to a connection error. please try again.";

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: a, reason: from getter */
            public final String getO() {
                return this.o;
            }

            @Override // au.com.woolworths.android.onesite.analytics.BaseAction
            /* renamed from: b, reason: from getter */
            public final Category getN() {
                return this.n;
            }
        };
        k = notificationPreferencesActions7;
        NotificationPreferencesActions[] notificationPreferencesActionsArr = {notificationPreferencesActions, notificationPreferencesActions2, notificationPreferencesActions3, notificationPreferencesActions4, notificationPreferencesActions5, notificationPreferencesActions6, notificationPreferencesActions7};
        l = notificationPreferencesActionsArr;
        m = EnumEntriesKt.a(notificationPreferencesActionsArr);
    }

    public NotificationPreferencesActions(String str, int i2) {
    }

    public static NotificationPreferencesActions valueOf(String str) {
        return (NotificationPreferencesActions) Enum.valueOf(NotificationPreferencesActions.class, str);
    }

    public static NotificationPreferencesActions[] values() {
        return (NotificationPreferencesActions[]) l.clone();
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.d;
    }
}
