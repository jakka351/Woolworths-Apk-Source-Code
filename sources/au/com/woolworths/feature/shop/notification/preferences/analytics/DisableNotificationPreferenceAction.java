package au.com.woolworths.feature.shop.notification.preferences.analytics;

import au.com.woolworths.android.onesite.analytics.Action;
import au.com.woolworths.android.onesite.analytics.Category;
import au.com.woolworths.android.onesite.analytics.Screen;
import au.com.woolworths.feature.shop.notification.preferences.models.PreferenceToggleData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/analytics/DisableNotificationPreferenceAction;", "Lau/com/woolworths/android/onesite/analytics/Action;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DisableNotificationPreferenceAction implements Action {
    public final PreferenceToggleData d;
    public final String e;
    public final NotificationPreferenceScreens f;
    public final Category g;

    public DisableNotificationPreferenceAction(PreferenceToggleData toggleData) {
        Intrinsics.h(toggleData, "toggleData");
        this.d = toggleData;
        this.e = toggleData.getAnalytics().getLabel();
        this.f = NotificationPreferenceScreens.d;
        this.g = Category.h0;
    }

    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
    /* renamed from: a, reason: from getter */
    public final String getE() {
        return this.e;
    }

    @Override // au.com.woolworths.android.onesite.analytics.BaseAction
    /* renamed from: b, reason: from getter */
    public final Category getG() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DisableNotificationPreferenceAction) && Intrinsics.c(this.d, ((DisableNotificationPreferenceAction) obj).d);
    }

    @Override // au.com.woolworths.android.onesite.analytics.Action
    /* renamed from: f */
    public final Screen getD() {
        return this.f;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return "DisableNotificationPreferenceAction(toggleData=" + this.d + ")";
    }
}
