package au.com.woolworths.android.onesite.legacy.generated.callback;

import androidx.databinding.adapters.SearchViewBindingAdapter;
import au.com.woolworths.android.onesite.legacy.databinding.ActivityAddFullDeliveryAddressBySearchBindingImpl;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchViewModel;

/* loaded from: classes3.dex */
public final class OnQueryTextChange implements SearchViewBindingAdapter.OnQueryTextChange {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityAddFullDeliveryAddressBySearchBindingImpl f4266a;

    public interface Listener {
    }

    public OnQueryTextChange(ActivityAddFullDeliveryAddressBySearchBindingImpl activityAddFullDeliveryAddressBySearchBindingImpl) {
        this.f4266a = activityAddFullDeliveryAddressBySearchBindingImpl;
    }

    @Override // androidx.databinding.adapters.SearchViewBindingAdapter.OnQueryTextChange
    public final boolean onQueryTextChange(String str) {
        DeliveryAddressSearchViewModel deliveryAddressSearchViewModel = this.f4266a.B;
        if (deliveryAddressSearchViewModel == null) {
            return false;
        }
        deliveryAddressSearchViewModel.q6(str);
        return true;
    }
}
