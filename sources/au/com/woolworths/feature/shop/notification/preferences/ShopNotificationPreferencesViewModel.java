package au.com.woolworths.feature.shop.notification.preferences;

import androidx.lifecycle.ViewModel;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.shop.auth.ShopAccountInteractor;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@HiltViewModel
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/notification/preferences/ShopNotificationPreferencesViewModel;", "Landroidx/lifecycle/ViewModel;", "notification-preferences_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ShopNotificationPreferencesViewModel extends ViewModel {
    public final ShopAccountInteractor e;
    public final AnalyticsManager f;
    public final SharedFlowImpl g;
    public final Flow h;

    public ShopNotificationPreferencesViewModel(ShopAccountInteractor accountInteractor, AnalyticsManager analyticsManager) {
        Intrinsics.h(accountInteractor, "accountInteractor");
        Intrinsics.h(analyticsManager, "analyticsManager");
        this.e = accountInteractor;
        this.f = analyticsManager;
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 1, BufferOverflow.e, 1);
        this.g = sharedFlowImplB;
        this.h = FlowKt.a(sharedFlowImplB);
    }
}
