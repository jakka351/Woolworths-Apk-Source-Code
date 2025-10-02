package au.com.woolworths.android.onesite.modules.deliveryaddress.search;

import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchContract;
import au.com.woolworths.android.onesite.modules.deliveryaddress.search.DeliveryAddressSearchViewModel;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.repository.NoResultsException;
import au.com.woolworths.base.shopapp.models.address.AddressResult;
import au.com.woolworths.base.shopapp.models.address.SaveAddressResult;
import io.reactivex.internal.operators.observable.ObservableEmpty;
import io.reactivex.internal.operators.observable.ObservableOnErrorNext;
import io.reactivex.internal.operators.single.SingleCache;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ DeliveryAddressSearchViewModel e;

    public /* synthetic */ c(DeliveryAddressSearchViewModel deliveryAddressSearchViewModel, int i) {
        this.d = i;
        this.e = deliveryAddressSearchViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                DeliveryAddressSearchViewModel deliveryAddressSearchViewModel = this.e;
                DeliveryAddressSearchViewModel.r6(deliveryAddressSearchViewModel, deliveryAddressSearchViewModel.q, true, null, null, 14);
                return Unit.f24250a;
            case 1:
                AddressResult.Address it = (AddressResult.Address) obj;
                Intrinsics.h(it, "it");
                DeliveryAddressSearchViewModel deliveryAddressSearchViewModel2 = this.e;
                DeliveryAddressSearchContract.ViewState viewState = (DeliveryAddressSearchContract.ViewState) deliveryAddressSearchViewModel2.r.e();
                DeliveryAddressSearchViewModel.ScreenOptions screenOptions = viewState != null ? viewState.d : null;
                return new ObservableOnErrorNext(new SingleCache(deliveryAddressSearchViewModel2.e.k(it, screenOptions != null ? screenOptions.f4333a : false, screenOptions != null ? screenOptions.b : false)).i(), new androidx.camera.core.impl.e(new c(deliveryAddressSearchViewModel2, 6), 28));
            case 2:
                SaveAddressResult.Address it2 = (SaveAddressResult.Address) obj;
                Intrinsics.h(it2, "it");
                return this.e.s6(it2);
            case 3:
                List list = (List) obj;
                Intrinsics.e(list);
                DeliveryAddressSearchViewModel deliveryAddressSearchViewModel3 = this.e;
                DeliveryAddressSearchViewModel.r6(deliveryAddressSearchViewModel3, deliveryAddressSearchViewModel3.q, false, null, null, 14);
                deliveryAddressSearchViewModel3.k = list;
                deliveryAddressSearchViewModel3.p.onNext(DeliveryAddressSearchContract.Actions.AddressSetSuccessfully.f4326a);
                return Unit.f24250a;
            case 4:
                DeliveryAddressSearchViewModel deliveryAddressSearchViewModel4 = this.e;
                DeliveryAddressSearchViewModel.r6(deliveryAddressSearchViewModel4, deliveryAddressSearchViewModel4.q, true, null, null, 14);
                return Unit.f24250a;
            case 5:
                SaveAddressResult.Address it3 = (SaveAddressResult.Address) obj;
                Intrinsics.h(it3, "it");
                return this.e.s6(it3);
            case 6:
                Throwable throwable = (Throwable) obj;
                Intrinsics.h(throwable, "throwable");
                this.e.p6(throwable);
                return ObservableEmpty.d;
            case 7:
                Throwable throwable2 = (Throwable) obj;
                Intrinsics.h(throwable2, "throwable");
                this.e.p6(throwable2);
                return ObservableEmpty.d;
            case 8:
                Throwable throwable3 = (Throwable) obj;
                Intrinsics.h(throwable3, "throwable");
                DeliveryAddressSearchViewModel deliveryAddressSearchViewModel5 = this.e;
                MutableLiveData mutableLiveData = deliveryAddressSearchViewModel5.q;
                deliveryAddressSearchViewModel5.f.getClass();
                if (throwable3 instanceof NoConnectivityException) {
                    DeliveryAddressSearchViewModel.r6(deliveryAddressSearchViewModel5, mutableLiveData, false, DeliveryAddressSearchErrorState.e, null, 12);
                } else if (throwable3 instanceof NoResultsException) {
                    DeliveryAddressSearchViewModel.r6(deliveryAddressSearchViewModel5, mutableLiveData, false, DeliveryAddressSearchErrorState.d, null, 12);
                } else {
                    DeliveryAddressSearchViewModel.r6(deliveryAddressSearchViewModel5, mutableLiveData, false, DeliveryAddressSearchErrorState.f, null, 12);
                    Timber.f27013a.p(throwable3);
                }
                return ObservableEmpty.d;
            case 9:
                List list2 = (List) obj;
                Intrinsics.e(list2);
                this.e.k = list2;
                return Unit.f24250a;
            case 10:
                this.e.k = EmptyList.d;
                Timber.f27013a.p((Throwable) obj);
                return Unit.f24250a;
            case 11:
                List list3 = (List) obj;
                Intrinsics.e(list3);
                DeliveryAddressSearchViewModel deliveryAddressSearchViewModel6 = this.e;
                DeliveryAddressSearchViewModel.r6(deliveryAddressSearchViewModel6, deliveryAddressSearchViewModel6.q, false, null, null, 14);
                deliveryAddressSearchViewModel6.k = list3;
                deliveryAddressSearchViewModel6.p.onNext(DeliveryAddressSearchContract.Actions.AddressSetSuccessfully.f4326a);
                return Unit.f24250a;
            case 12:
                this.e.p.onNext(DeliveryAddressSearchContract.Actions.ForceLogoutEvent.f4327a);
                return Unit.f24250a;
            case 13:
                String it4 = (String) obj;
                Intrinsics.h(it4, "it");
                DeliveryAddressSearchViewModel deliveryAddressSearchViewModel7 = this.e;
                return new ObservableOnErrorNext(deliveryAddressSearchViewModel7.e.c(it4), new e(new c(deliveryAddressSearchViewModel7, 8), 2));
            default:
                List list4 = (List) obj;
                Intrinsics.e(list4);
                DeliveryAddressSearchViewModel deliveryAddressSearchViewModel8 = this.e;
                DeliveryAddressSearchViewModel.r6(deliveryAddressSearchViewModel8, deliveryAddressSearchViewModel8.q, false, null, list4, 8);
                return Unit.f24250a;
        }
    }
}
