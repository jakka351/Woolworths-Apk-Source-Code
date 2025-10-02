package au.com.woolworths.feature.shop.storelocator.legacy.pickup;

import android.location.Location;
import au.com.woolworths.android.onesite.modules.storelocator.apis.PickUpLocationsResponse;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorContract;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorViewModel;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.apis.PickUpLocationsResponseExtKt;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.apis.PickUpSuburbResponseExtKt;
import au.com.woolworths.foundation.shop.storelocator.PickUpLocatorRepository;
import au.com.woolworths.foundation.shop.storelocator.models.PickUpSuburbResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ PickUpLocatorViewModel e;

    public /* synthetic */ d(PickUpLocatorViewModel pickUpLocatorViewModel, int i) {
        this.d = i;
        this.e = pickUpLocatorViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.d) {
            case 0:
                Result result = (Result) obj;
                Intrinsics.e(result);
                PickUpSuburbResponse pickUpSuburbResponse = (PickUpSuburbResponse) result.f4591a;
                PickUpLocatorViewModel pickUpLocatorViewModel = this.e;
                pickUpLocatorViewModel.k.m((result.a() || pickUpSuburbResponse == null) ? pickUpLocatorViewModel.q6(result, PickUpLocatorViewModel.CallingApi.e) : pickUpSuburbResponse.getSuburbs().isEmpty() ? PickUpLocatorViewModel.r6(pickUpLocatorViewModel, PickUpLocatorContract.PageState.g, PickUpLocatorPageErrorState.h, null, null, 12) : PickUpLocatorViewModel.r6(pickUpLocatorViewModel, PickUpLocatorContract.PageState.f, null, null, PickUpSuburbResponseExtKt.a(pickUpSuburbResponse), 6));
                return Unit.f24250a;
            case 1:
                Result result2 = (Result) obj;
                Intrinsics.e(result2);
                PickUpLocationsResponse pickUpLocationsResponse = (PickUpLocationsResponse) result2.f4591a;
                PickUpLocatorViewModel pickUpLocatorViewModel2 = this.e;
                pickUpLocatorViewModel2.k.m((result2.a() || pickUpLocationsResponse == null) ? pickUpLocatorViewModel2.q6(result2, PickUpLocatorViewModel.CallingApi.d) : PickUpLocatorViewModel.r6(pickUpLocatorViewModel2, PickUpLocatorContract.PageState.e, null, PickUpLocationsResponseExtKt.a(pickUpLocationsResponse), null, 10));
                return Unit.f24250a;
            case 2:
                PickUpLocatorViewModel pickUpLocatorViewModel3 = this.e;
                pickUpLocatorViewModel3.k.m(PickUpLocatorViewModel.r6(pickUpLocatorViewModel3, PickUpLocatorContract.PageState.d, null, null, null, 14));
                return Unit.f24250a;
            default:
                Location it = (Location) obj;
                Intrinsics.h(it, "it");
                PickUpLocatorInteractor pickUpLocatorInteractor = this.e.e;
                pickUpLocatorInteractor.getClass();
                PickUpLocatorRepository pickUpLocatorRepository = pickUpLocatorInteractor.f8185a;
                pickUpLocatorRepository.getClass();
                return pickUpLocatorRepository.c.f(it.getLatitude(), it.getLongitude());
        }
    }
}
