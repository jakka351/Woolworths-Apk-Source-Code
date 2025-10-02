package au.com.woolworths.feature.shop.delivery.address.generated.callback;

import android.view.View;
import au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyViewModel;
import au.com.woolworths.feature.shop.delivery.address.databinding.ActivityAddDeliveryAddressManuallyBindingImpl;
import com.dynatrace.android.callback.Callback;

/* loaded from: classes3.dex */
public final class OnClickListener implements View.OnClickListener {
    public final ActivityAddDeliveryAddressManuallyBindingImpl d;

    public interface Listener {
    }

    public OnClickListener(ActivityAddDeliveryAddressManuallyBindingImpl activityAddDeliveryAddressManuallyBindingImpl) {
        this.d = activityAddDeliveryAddressManuallyBindingImpl;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Callback.g(view);
        try {
            AddDeliveryAddressManuallyViewModel addDeliveryAddressManuallyViewModel = this.d.G;
            if (addDeliveryAddressManuallyViewModel != null) {
                addDeliveryAddressManuallyViewModel.s6();
            }
        } finally {
            Callback.h();
        }
    }
}
