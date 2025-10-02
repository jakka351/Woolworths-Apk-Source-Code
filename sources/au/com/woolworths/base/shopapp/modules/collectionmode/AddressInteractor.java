package au.com.woolworths.base.shopapp.modules.collectionmode;

import au.com.woolworths.base.shopapp.models.address.AddressInput;
import io.reactivex.internal.operators.observable.ObservableCreate;
import io.reactivex.internal.operators.single.SingleCreate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.rx2.RxObservableKt;
import kotlinx.coroutines.rx2.RxSingleKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/shopapp/modules/collectionmode/AddressInteractor;", "", "base-shop-app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AddressInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final AddressApi f4623a;

    public AddressInteractor(AddressApi addressApi) {
        Intrinsics.h(addressApi, "addressApi");
        this.f4623a = addressApi;
    }

    public final SingleCreate a(int i) {
        return RxSingleKt.a(new AddressInteractor$deleteAddress$1(this, i, null));
    }

    public final SingleCreate b() {
        return RxSingleKt.a(new AddressInteractor$getSavedAddresses$1(this, null));
    }

    public final SingleCreate c(AddressInput addressInput) {
        return RxSingleKt.a(new AddressInteractor$saveAddress$1(this, addressInput, null));
    }

    public final ObservableCreate d(String query) {
        Intrinsics.h(query, "query");
        return RxObservableKt.a(new AddressInteractor$searchAddresses$1(this, query, null));
    }

    public final ObservableCreate e(String postcode) {
        Intrinsics.h(postcode, "postcode");
        return RxObservableKt.a(new AddressInteractor$searchPostcodes$1(this, postcode, null));
    }
}
