package au.com.woolworths.feature.shop.delivery.address.generated.callback;

import androidx.databinding.adapters.TextViewBindingAdapter;
import au.com.woolworths.feature.shop.delivery.address.addaddressmanually.AddDeliveryAddressManuallyViewModel;
import au.com.woolworths.feature.shop.delivery.address.databinding.ActivityAddDeliveryAddressManuallyBindingImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class OnTextChanged implements TextViewBindingAdapter.OnTextChanged {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityAddDeliveryAddressManuallyBindingImpl f7053a;
    public final int b;

    public interface Listener {
    }

    public OnTextChanged(ActivityAddDeliveryAddressManuallyBindingImpl activityAddDeliveryAddressManuallyBindingImpl, int i) {
        this.f7053a = activityAddDeliveryAddressManuallyBindingImpl;
        this.b = i;
    }

    @Override // androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged
    public final void onTextChanged(CharSequence streetAddress1, int i, int i2, int i3) {
        AddDeliveryAddressManuallyViewModel addDeliveryAddressManuallyViewModel;
        ActivityAddDeliveryAddressManuallyBindingImpl activityAddDeliveryAddressManuallyBindingImpl = this.f7053a;
        int i4 = this.b;
        if (i4 == 1) {
            AddDeliveryAddressManuallyViewModel addDeliveryAddressManuallyViewModel2 = activityAddDeliveryAddressManuallyBindingImpl.G;
            if (addDeliveryAddressManuallyViewModel2 != null) {
                Intrinsics.h(streetAddress1, "streetAddress1");
                AddDeliveryAddressManuallyViewModel.w6(addDeliveryAddressManuallyViewModel2, addDeliveryAddressManuallyViewModel2.i, false, streetAddress1.toString(), null, null, null, null, null, 125);
                return;
            }
            return;
        }
        if (i4 != 2) {
            if (i4 == 4 && (addDeliveryAddressManuallyViewModel = activityAddDeliveryAddressManuallyBindingImpl.G) != null) {
                addDeliveryAddressManuallyViewModel.t6(streetAddress1);
                return;
            }
            return;
        }
        AddDeliveryAddressManuallyViewModel addDeliveryAddressManuallyViewModel3 = activityAddDeliveryAddressManuallyBindingImpl.G;
        if (addDeliveryAddressManuallyViewModel3 != null) {
            Intrinsics.h(streetAddress1, "streetAddress2");
            AddDeliveryAddressManuallyViewModel.w6(addDeliveryAddressManuallyViewModel3, addDeliveryAddressManuallyViewModel3.i, false, null, streetAddress1.toString(), null, null, null, null, 123);
        }
    }
}
