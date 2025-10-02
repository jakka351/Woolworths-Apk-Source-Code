package au.com.woolworths.feature.shop.storelocator.legacy.generated.callback;

import au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorContract;
import au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorViewModel;
import au.com.woolworths.feature.shop.storelocator.legacy.databinding.LegacyActivityStoreLocatorBindingImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class OnQueryTextSubmit1 implements au.com.woolworths.android.onesite.bindings.OnQueryTextSubmit {

    /* renamed from: a, reason: collision with root package name */
    public final LegacyActivityStoreLocatorBindingImpl f8174a;

    public interface Listener {
    }

    public OnQueryTextSubmit1(LegacyActivityStoreLocatorBindingImpl legacyActivityStoreLocatorBindingImpl) {
        this.f8174a = legacyActivityStoreLocatorBindingImpl;
    }

    @Override // au.com.woolworths.android.onesite.bindings.OnQueryTextSubmit
    public final boolean onQueryTextSubmit(String queryTextValue) {
        StoreLocatorViewModel storeLocatorViewModel = this.f8174a.I;
        if (storeLocatorViewModel == null) {
            return false;
        }
        Intrinsics.h(queryTextValue, "queryTextValue");
        storeLocatorViewModel.k.f(StoreLocatorContract.Actions.HideKeyboard.f8158a);
        storeLocatorViewModel.l = queryTextValue;
        storeLocatorViewModel.s6(queryTextValue);
        return true;
    }
}
