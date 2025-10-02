package au.com.woolworths.feature.shop.notification.preferences.analytics;

import au.com.woolworths.android.onesite.analytics.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002¨\u0006\u0003"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/analytics/NotificationPreferenceScreens;", "Lau/com/woolworths/android/onesite/analytics/Screen;", "", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public abstract class NotificationPreferenceScreens implements Screen {
    public static final NotificationPreferenceScreens d;
    public static final NotificationPreferenceScreens e;
    public static final /* synthetic */ NotificationPreferenceScreens[] f;
    public static final /* synthetic */ EnumEntries g;

    static {
        NotificationPreferenceScreens notificationPreferenceScreens = new NotificationPreferenceScreens() { // from class: au.com.woolworths.feature.shop.notification.preferences.analytics.NotificationPreferenceScreens.NOTIFICATION_PREFERENCES
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Push Notifications Preferences";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "pushnotificationspreferences_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Push Notifications Preferences screen";
            }
        };
        d = notificationPreferenceScreens;
        NotificationPreferenceScreens notificationPreferenceScreens2 = new NotificationPreferenceScreens() { // from class: au.com.woolworths.feature.shop.notification.preferences.analytics.NotificationPreferenceScreens.NOTIFICATION_PREFERENCES_GUEST_BLOCKED
            @Override // au.com.woolworths.android.onesite.analytics.Screen
            /* renamed from: a */
            public final String getD() {
                return "Push Notifications Preferences";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String b() {
                return "loginsignup_screen";
            }

            @Override // au.com.woolworths.android.onesite.analytics.Screen
            public final String d() {
                return "Login Signup screen";
            }
        };
        e = notificationPreferenceScreens2;
        NotificationPreferenceScreens[] notificationPreferenceScreensArr = {notificationPreferenceScreens, notificationPreferenceScreens2};
        f = notificationPreferenceScreensArr;
        g = EnumEntriesKt.a(notificationPreferenceScreensArr);
    }

    public static NotificationPreferenceScreens valueOf(String str) {
        return (NotificationPreferenceScreens) Enum.valueOf(NotificationPreferenceScreens.class, str);
    }

    public static NotificationPreferenceScreens[] values() {
        return (NotificationPreferenceScreens[]) f.clone();
    }
}
