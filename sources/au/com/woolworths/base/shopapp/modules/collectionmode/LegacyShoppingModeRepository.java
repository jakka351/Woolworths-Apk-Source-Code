package au.com.woolworths.base.shopapp.modules.collectionmode;

import au.com.woolworths.android.onesite.AddressLevel;
import au.com.woolworths.base.shopapp.models.address.AddressResult;
import au.com.woolworths.base.shopapp.models.address.SaveAddressResult;
import io.reactivex.Completable;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.internal.operators.single.SingleObserveOn;

/* loaded from: classes.dex */
public interface LegacyShoppingModeRepository {
    SingleObserveOn a(AddressResult.ManualAddressToSave manualAddressToSave);

    Observable b(String str);

    Observable c(String str);

    SingleObserveOn d();

    boolean e();

    Completable f();

    void g(SaveAddressResult.Address address);

    SingleObserveOn h(SaveAddressResult.Address address);

    SingleObserveOn i(SaveAddressResult.Address address);

    Single j(SaveAddressResult.Address address);

    SingleObserveOn k(AddressResult.Address address, boolean z, boolean z2);

    SingleObserveOn l(SaveAddressResult.Address address);

    SaveAddressResult.Address m();

    AddressLevel n();

    Single o(boolean z);
}
