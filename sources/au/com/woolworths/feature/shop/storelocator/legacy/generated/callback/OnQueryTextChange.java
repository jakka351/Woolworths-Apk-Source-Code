package au.com.woolworths.feature.shop.storelocator.legacy.generated.callback;

import androidx.databinding.adapters.SearchViewBindingAdapter;
import androidx.lifecycle.MutableLiveData;
import au.com.woolworths.feature.shop.storelocator.legacy.databinding.ActivityPickUpLocatorBindingImpl;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorContract;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorViewModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class OnQueryTextChange implements SearchViewBindingAdapter.OnQueryTextChange {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityPickUpLocatorBindingImpl f8171a;

    public interface Listener {
    }

    public OnQueryTextChange(ActivityPickUpLocatorBindingImpl activityPickUpLocatorBindingImpl) {
        this.f8171a = activityPickUpLocatorBindingImpl;
    }

    @Override // androidx.databinding.adapters.SearchViewBindingAdapter.OnQueryTextChange
    public final boolean onQueryTextChange(String queryTextValue) {
        PickUpLocatorViewModel pickUpLocatorViewModel = this.f8171a.C;
        if (pickUpLocatorViewModel == null) {
            return false;
        }
        MutableLiveData mutableLiveData = pickUpLocatorViewModel.k;
        Intrinsics.h(queryTextValue, "queryTextValue");
        if (queryTextValue.length() >= 3) {
            pickUpLocatorViewModel.s6(queryTextValue);
            return true;
        }
        if (queryTextValue.length() != 0) {
            return true;
        }
        mutableLiveData.m(PickUpLocatorViewModel.r6(pickUpLocatorViewModel, PickUpLocatorContract.PageState.e, null, null, null, 14));
        PickUpLocatorContract.ViewState viewState = (PickUpLocatorContract.ViewState) mutableLiveData.e();
        List list = viewState != null ? viewState.c : null;
        if (list != null && !list.isEmpty()) {
            return true;
        }
        pickUpLocatorViewModel.p6();
        return true;
    }
}
