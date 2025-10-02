package au.com.woolworths.feature.shop.homepage.generated.callback;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import au.com.woolworths.feature.shop.homepage.databinding.FragmentHomePageBindingImpl;
import au.com.woolworths.feature.shop.homepage.presentation.HomePageViewModel;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes3.dex */
public final class OnRefreshListener implements SwipeRefreshLayout.OnRefreshListener {

    /* renamed from: a, reason: collision with root package name */
    public final FragmentHomePageBindingImpl f7209a;

    public interface Listener {
    }

    public OnRefreshListener(FragmentHomePageBindingImpl fragmentHomePageBindingImpl) {
        this.f7209a = fragmentHomePageBindingImpl;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public final void a() {
        Callback.t();
        try {
            HomePageViewModel homePageViewModel = this.f7209a.G;
            if (homePageViewModel != null) {
                homePageViewModel.y6();
            }
        } finally {
            Callback.u();
        }
    }
}
