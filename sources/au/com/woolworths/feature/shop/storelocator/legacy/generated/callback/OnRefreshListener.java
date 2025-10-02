package au.com.woolworths.feature.shop.storelocator.legacy.generated.callback;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorViewModel;
import au.com.woolworths.feature.shop.storelocator.legacy.databinding.LegacyActivityStoreLocatorBindingImpl;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes3.dex */
public final class OnRefreshListener implements SwipeRefreshLayout.OnRefreshListener {

    /* renamed from: a, reason: collision with root package name */
    public final LegacyActivityStoreLocatorBindingImpl f8175a;

    public interface Listener {
    }

    public OnRefreshListener(LegacyActivityStoreLocatorBindingImpl legacyActivityStoreLocatorBindingImpl) {
        this.f8175a = legacyActivityStoreLocatorBindingImpl;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public final void a() {
        Callback.t();
        try {
            StoreLocatorViewModel storeLocatorViewModel = this.f8175a.I;
            if (storeLocatorViewModel != null) {
                storeLocatorViewModel.r6();
            }
        } finally {
            Callback.u();
        }
    }
}
