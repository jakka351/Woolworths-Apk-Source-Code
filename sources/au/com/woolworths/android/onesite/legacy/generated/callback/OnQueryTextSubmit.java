package au.com.woolworths.android.onesite.legacy.generated.callback;

import androidx.databinding.adapters.SearchViewBindingAdapter;
import au.com.woolworths.android.onesite.legacy.databinding.ActivityAddFullDeliveryAddressBySearchBindingImpl;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchContract;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchViewModel;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class OnQueryTextSubmit implements SearchViewBindingAdapter.OnQueryTextSubmit {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityAddFullDeliveryAddressBySearchBindingImpl f4267a;

    public interface Listener {
    }

    public OnQueryTextSubmit(ActivityAddFullDeliveryAddressBySearchBindingImpl activityAddFullDeliveryAddressBySearchBindingImpl) {
        this.f4267a = activityAddFullDeliveryAddressBySearchBindingImpl;
    }

    @Override // androidx.databinding.adapters.SearchViewBindingAdapter.OnQueryTextSubmit
    public final boolean onQueryTextSubmit(String queryTextValue) {
        DeliveryAddressSearchViewModel deliveryAddressSearchViewModel = this.f4267a.B;
        if (deliveryAddressSearchViewModel == null) {
            return false;
        }
        Intrinsics.h(queryTextValue, "queryTextValue");
        deliveryAddressSearchViewModel.p.onNext(DeliveryAddressSearchContract.Actions.HideKeyboard.f4328a);
        String string = StringsKt.k0(queryTextValue).toString();
        deliveryAddressSearchViewModel.j = string;
        deliveryAddressSearchViewModel.m.onNext(string);
        return true;
    }
}
