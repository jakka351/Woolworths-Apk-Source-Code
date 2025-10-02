package au.com.woolworths.feature.shop.storelocator.legacy.generated.callback;

import android.view.View;
import au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorContract;
import au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorViewModel;
import au.com.woolworths.feature.shop.storelocator.legacy.databinding.LegacyActivityStoreLocatorBindingImpl;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes3.dex */
public final class OnClickListener implements View.OnClickListener {
    public final LegacyActivityStoreLocatorBindingImpl d;
    public final int e;

    public interface Listener {
    }

    public OnClickListener(LegacyActivityStoreLocatorBindingImpl legacyActivityStoreLocatorBindingImpl, int i) {
        this.d = legacyActivityStoreLocatorBindingImpl;
        this.e = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        StoreLocatorViewModel storeLocatorViewModel;
        Callback.g(view);
        try {
            LegacyActivityStoreLocatorBindingImpl legacyActivityStoreLocatorBindingImpl = this.d;
            int i = this.e;
            if (i == 3) {
                StoreLocatorViewModel storeLocatorViewModel2 = legacyActivityStoreLocatorBindingImpl.I;
                if (storeLocatorViewModel2 != null) {
                    storeLocatorViewModel2.q6(StoreLocatorContract.StoreListDisplayMode.d);
                }
            } else if (i == 4 && (storeLocatorViewModel = legacyActivityStoreLocatorBindingImpl.I) != null) {
                storeLocatorViewModel.q6(StoreLocatorContract.StoreListDisplayMode.e);
            }
        } finally {
            Callback.h();
        }
    }
}
