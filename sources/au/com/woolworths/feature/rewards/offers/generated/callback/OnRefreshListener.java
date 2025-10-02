package au.com.woolworths.feature.rewards.offers.generated.callback;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import au.com.woolworths.feature.rewards.offers.RewardsOffersViewModelLegacy;
import au.com.woolworths.feature.rewards.offers.databinding.FragmentRewardsOffersBindingImpl;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes3.dex */
public final class OnRefreshListener implements SwipeRefreshLayout.OnRefreshListener {

    /* renamed from: a, reason: collision with root package name */
    public final FragmentRewardsOffersBindingImpl f6339a;

    public interface Listener {
    }

    public OnRefreshListener(FragmentRewardsOffersBindingImpl fragmentRewardsOffersBindingImpl) {
        this.f6339a = fragmentRewardsOffersBindingImpl;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public final void a() {
        Callback.t();
        try {
            RewardsOffersViewModelLegacy rewardsOffersViewModelLegacy = this.f6339a.D;
            if (rewardsOffersViewModelLegacy != null) {
                rewardsOffersViewModelLegacy.t6();
            }
        } finally {
            Callback.u();
        }
    }
}
