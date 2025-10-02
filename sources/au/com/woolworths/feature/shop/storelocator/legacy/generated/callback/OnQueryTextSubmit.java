package au.com.woolworths.feature.shop.storelocator.legacy.generated.callback;

import androidx.databinding.adapters.SearchViewBindingAdapter;
import au.com.woolworths.feature.shop.storelocator.legacy.databinding.ActivityPickUpLocatorBindingImpl;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorContract;
import au.com.woolworths.feature.shop.storelocator.legacy.pickup.PickUpLocatorViewModel;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class OnQueryTextSubmit implements SearchViewBindingAdapter.OnQueryTextSubmit {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityPickUpLocatorBindingImpl f8173a;

    public interface Listener {
    }

    public OnQueryTextSubmit(ActivityPickUpLocatorBindingImpl activityPickUpLocatorBindingImpl) {
        this.f8173a = activityPickUpLocatorBindingImpl;
    }

    @Override // androidx.databinding.adapters.SearchViewBindingAdapter.OnQueryTextSubmit
    public final boolean onQueryTextSubmit(String queryTextValue) {
        PickUpLocatorViewModel pickUpLocatorViewModel = this.f8173a.C;
        if (pickUpLocatorViewModel == null) {
            return false;
        }
        Intrinsics.h(queryTextValue, "queryTextValue");
        pickUpLocatorViewModel.l.onNext(PickUpLocatorContract.Actions.HideKeyboard.f8178a);
        pickUpLocatorViewModel.s6(queryTextValue);
        return true;
    }
}
