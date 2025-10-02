package au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult;

import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.android.onesite.analytics.AnalyticsManager;
import au.com.woolworths.android.onesite.modules.storelocator.apis.PickUpLocationsResponse;
import au.com.woolworths.android.onesite.network.NetworkExceptions;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.rxutils.Result;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.apis.PickUpLocationsResponseExtKt;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.PickUpLocationResultContract;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.locationresult.analytics.PickUpLocationResultActions;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ PickUpLocationResultViewModel e;

    public /* synthetic */ b(PickUpLocationResultViewModel pickUpLocationResultViewModel, int i) {
        this.d = i;
        this.e = pickUpLocationResultViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PickUpLocationResultContract.ViewState viewStateQ6;
        switch (this.d) {
            case 0:
                PickUpLocationResultViewModel pickUpLocationResultViewModel = this.e;
                pickUpLocationResultViewModel.j.m(PickUpLocationResultViewModel.q6(pickUpLocationResultViewModel, PickUpLocationResultContract.PageState.d, null, null, 6));
                break;
            default:
                Result result = (Result) obj;
                Intrinsics.e(result);
                PickUpLocationsResponse pickUpLocationsResponse = (PickUpLocationsResponse) result.f4591a;
                PickUpLocationResultViewModel pickUpLocationResultViewModel2 = this.e;
                MutableLiveData mutableLiveData = pickUpLocationResultViewModel2.j;
                if (result.a() || pickUpLocationsResponse == null) {
                    AnalyticsManager analyticsManager = pickUpLocationResultViewModel2.h;
                    NetworkExceptions networkExceptions = pickUpLocationResultViewModel2.f;
                    Intrinsics.h(networkExceptions, "networkExceptions");
                    if (result.b instanceof NoConnectivityException) {
                        analyticsManager.c(PickUpLocationResultActions.d);
                        viewStateQ6 = PickUpLocationResultViewModel.q6(pickUpLocationResultViewModel2, PickUpLocationResultContract.PageState.f, PickUpLocationResultErrorState.d, null, 4);
                    } else {
                        analyticsManager.c(PickUpLocationResultActions.e);
                        viewStateQ6 = PickUpLocationResultViewModel.q6(pickUpLocationResultViewModel2, PickUpLocationResultContract.PageState.f, PickUpLocationResultErrorState.e, null, 4);
                    }
                } else {
                    viewStateQ6 = PickUpLocationResultViewModel.q6(pickUpLocationResultViewModel2, PickUpLocationResultContract.PageState.e, null, PickUpLocationsResponseExtKt.a(pickUpLocationsResponse), 2);
                }
                mutableLiveData.m(viewStateQ6);
                break;
        }
        return Unit.f24250a;
    }
}
