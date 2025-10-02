package au.com.woolworths.feature.shared.instore.wifi.generated.callback;

import android.widget.CompoundButton;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.feature.shared.instore.wifi.analytics.TermsAndConditionsInStoreWifiActions;
import au.com.woolworths.feature.shared.instore.wifi.databinding.ActivityJoinWifiBindingImpl;
import au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiViewModel;

/* loaded from: classes3.dex */
public final class OnCheckedChangeListener implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityJoinWifiBindingImpl f6519a;

    public interface Listener {
    }

    public OnCheckedChangeListener(ActivityJoinWifiBindingImpl activityJoinWifiBindingImpl) {
        this.f6519a = activityJoinWifiBindingImpl;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        JoinWifiViewModel joinWifiViewModel = this.f6519a.E;
        if (joinWifiViewModel != null) {
            AnalyticsManager analyticsManager = joinWifiViewModel.f;
            if (z) {
                analyticsManager.c(TermsAndConditionsInStoreWifiActions.e);
            } else {
                analyticsManager.c(TermsAndConditionsInStoreWifiActions.f);
            }
            JoinWifiViewModel.s6(joinWifiViewModel, joinWifiViewModel.i, false, z, 1);
        }
    }
}
