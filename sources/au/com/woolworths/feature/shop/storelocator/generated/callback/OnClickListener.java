package au.com.woolworths.feature.shop.storelocator.generated.callback;

import android.view.View;
import au.com.woolworths.feature.shop.storelocator.StoreLocatorContract;
import au.com.woolworths.feature.shop.storelocator.StoreLocatorViewModel;
import au.com.woolworths.feature.shop.storelocator.databinding.ActivityStoreLocatorBindingImpl;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes3.dex */
public final class OnClickListener implements View.OnClickListener {
    public final ActivityStoreLocatorBindingImpl d;
    public final int e;

    public interface Listener {
    }

    public OnClickListener(ActivityStoreLocatorBindingImpl activityStoreLocatorBindingImpl, int i) {
        this.d = activityStoreLocatorBindingImpl;
        this.e = i;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        StoreLocatorViewModel storeLocatorViewModel;
        Callback.g(view);
        try {
            ActivityStoreLocatorBindingImpl activityStoreLocatorBindingImpl = this.d;
            int i = this.e;
            if (i == 3) {
                StoreLocatorViewModel storeLocatorViewModel2 = activityStoreLocatorBindingImpl.I;
                if (storeLocatorViewModel2 != null) {
                    storeLocatorViewModel2.q6(StoreLocatorContract.StoreListDisplayMode.d);
                }
            } else if (i == 4 && (storeLocatorViewModel = activityStoreLocatorBindingImpl.I) != null) {
                storeLocatorViewModel.q6(StoreLocatorContract.StoreListDisplayMode.e);
            }
        } finally {
            Callback.h();
        }
    }
}
