package au.com.woolworths.feature.shop.storelocator.generated.callback;

import au.com.woolworths.feature.shop.storelocator.StoreLocatorContract;
import au.com.woolworths.feature.shop.storelocator.StoreLocatorViewModel;
import au.com.woolworths.feature.shop.storelocator.databinding.ActivityStoreLocatorBindingImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class OnQueryTextSubmit implements au.com.woolworths.android.onesite.bindings.OnQueryTextSubmit {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityStoreLocatorBindingImpl f8149a;

    public interface Listener {
    }

    public OnQueryTextSubmit(ActivityStoreLocatorBindingImpl activityStoreLocatorBindingImpl) {
        this.f8149a = activityStoreLocatorBindingImpl;
    }

    @Override // au.com.woolworths.android.onesite.bindings.OnQueryTextSubmit
    public final boolean onQueryTextSubmit(String queryTextValue) {
        StoreLocatorViewModel storeLocatorViewModel = this.f8149a.I;
        if (storeLocatorViewModel == null) {
            return false;
        }
        Intrinsics.h(queryTextValue, "queryTextValue");
        storeLocatorViewModel.k.f(StoreLocatorContract.Actions.HideKeyboard.f8121a);
        storeLocatorViewModel.l = queryTextValue;
        storeLocatorViewModel.s6(queryTextValue);
        return true;
    }
}
