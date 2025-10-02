package au.com.woolworths.feature.shop.storelocator.generated.callback;

import au.com.woolworths.feature.shop.storelocator.StoreLocatorViewModel;
import au.com.woolworths.feature.shop.storelocator.databinding.ActivityStoreLocatorBindingImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class OnQueryTextChange implements au.com.woolworths.android.onesite.bindings.OnQueryTextChange {

    /* renamed from: a, reason: collision with root package name */
    public final ActivityStoreLocatorBindingImpl f8148a;

    public interface Listener {
    }

    public OnQueryTextChange(ActivityStoreLocatorBindingImpl activityStoreLocatorBindingImpl) {
        this.f8148a = activityStoreLocatorBindingImpl;
    }

    @Override // au.com.woolworths.android.onesite.bindings.OnQueryTextChange
    public final boolean onQueryTextChange(String queryTextValue) {
        StoreLocatorViewModel storeLocatorViewModel = this.f8148a.I;
        if (storeLocatorViewModel == null) {
            return false;
        }
        Intrinsics.h(queryTextValue, "queryTextValue");
        if (queryTextValue.length() >= 3) {
            storeLocatorViewModel.l = queryTextValue;
            storeLocatorViewModel.s6(queryTextValue);
            return true;
        }
        if (queryTextValue.length() != 0) {
            return true;
        }
        storeLocatorViewModel.p6();
        return true;
    }
}
