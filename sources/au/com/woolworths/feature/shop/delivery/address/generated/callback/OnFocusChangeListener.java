package au.com.woolworths.feature.shop.delivery.address.generated.callback;

import android.view.View;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyContract;
import au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyViewModel;
import au.com.woolworths.feature.shop.delivery.address.databinding.ActivityAddDeliveryAddressManuallyBindingImpl;
import com.woolworths.R;
import kotlin.collections.EmptyList;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class OnFocusChangeListener implements View.OnFocusChangeListener {
    public final ActivityAddDeliveryAddressManuallyBindingImpl d;

    public interface Listener {
    }

    public OnFocusChangeListener(ActivityAddDeliveryAddressManuallyBindingImpl activityAddDeliveryAddressManuallyBindingImpl) {
        this.d = activityAddDeliveryAddressManuallyBindingImpl;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        AddDeliveryAddressManuallyContract.ViewState viewState;
        String str;
        String str2;
        AddDeliveryAddressManuallyViewModel addDeliveryAddressManuallyViewModel = this.d.G;
        if (addDeliveryAddressManuallyViewModel != null) {
            MutableLiveData mutableLiveData = addDeliveryAddressManuallyViewModel.i;
            if (z) {
                return;
            }
            AddDeliveryAddressManuallyContract.ViewState viewState2 = (AddDeliveryAddressManuallyContract.ViewState) mutableLiveData.e();
            if ((viewState2 == null || (str2 = viewState2.d) == null || str2.length() != 4) && (viewState = (AddDeliveryAddressManuallyContract.ViewState) mutableLiveData.e()) != null && (str = viewState.d) != null && (!StringsKt.D(str))) {
                AddDeliveryAddressManuallyViewModel.w6(addDeliveryAddressManuallyViewModel, mutableLiveData, false, null, null, null, EmptyList.d, null, addDeliveryAddressManuallyViewModel.p6().getString(R.string.delivery_address_error_postcode_minimum_length), 15);
                addDeliveryAddressManuallyViewModel.v6("Postcode must be four digits");
            }
        }
    }
}
