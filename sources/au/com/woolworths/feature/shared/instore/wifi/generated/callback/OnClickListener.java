package au.com.woolworths.feature.shared.instore.wifi.generated.callback;

import android.view.View;
import au.com.woolworths.feature.shared.instore.wifi.databinding.ActivityJoinWifiBindingImpl;
import au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiContract;
import au.com.woolworths.feature.shared.instore.wifi.ui.JoinWifiViewModel;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes3.dex */
public final class OnClickListener implements View.OnClickListener {
    public final ActivityJoinWifiBindingImpl d;
    public final int e;

    public interface Listener {
    }

    public OnClickListener(ActivityJoinWifiBindingImpl activityJoinWifiBindingImpl, int i) {
        this.d = activityJoinWifiBindingImpl;
        this.e = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        JoinWifiViewModel joinWifiViewModel;
        Callback.g(view);
        try {
            ActivityJoinWifiBindingImpl activityJoinWifiBindingImpl = this.d;
            int i = this.e;
            if (i == 1) {
                JoinWifiViewModel joinWifiViewModel2 = activityJoinWifiBindingImpl.E;
                if (joinWifiViewModel2 != null) {
                    joinWifiViewModel2.j.f(new JoinWifiContract.Actions.CloseScreen(false));
                }
            } else if (i == 3 && (joinWifiViewModel = activityJoinWifiBindingImpl.E) != null) {
                joinWifiViewModel.r6();
            }
        } finally {
            Callback.h();
        }
    }
}
