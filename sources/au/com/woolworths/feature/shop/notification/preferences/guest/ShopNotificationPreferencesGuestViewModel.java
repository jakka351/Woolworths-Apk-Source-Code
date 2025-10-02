package au.com.woolworths.feature.shop.notification.preferences.guest;

import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/guest/ShopNotificationPreferencesGuestViewModel;", "Landroidx/lifecycle/ViewModel;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShopNotificationPreferencesGuestViewModel extends ViewModel {
    public final AnalyticsManager e;

    public ShopNotificationPreferencesGuestViewModel(AnalyticsManager analyticsManager) {
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = analyticsManager;
    }
}
