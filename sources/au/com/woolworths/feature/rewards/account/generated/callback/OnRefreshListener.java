package au.com.woolworths.feature.rewards.account.generated.callback;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import au.com.woolworths.feature.rewards.account.databinding.FragmentRewardsAccountDynamicBindingImpl;
import au.com.woolworths.feature.rewards.account.settings.AccountSettingsViewModelOld;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes3.dex */
public final class OnRefreshListener implements SwipeRefreshLayout.OnRefreshListener {

    /* renamed from: a, reason: collision with root package name */
    public final FragmentRewardsAccountDynamicBindingImpl f5720a;

    public interface Listener {
    }

    public OnRefreshListener(FragmentRewardsAccountDynamicBindingImpl fragmentRewardsAccountDynamicBindingImpl) {
        this.f5720a = fragmentRewardsAccountDynamicBindingImpl;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public final void a() {
        Callback.t();
        try {
            AccountSettingsViewModelOld accountSettingsViewModelOld = this.f5720a.C;
            if (accountSettingsViewModelOld != null) {
                accountSettingsViewModelOld.p6(false);
            }
        } finally {
            Callback.u();
        }
    }
}
