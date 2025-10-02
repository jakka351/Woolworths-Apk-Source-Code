package au.com.woolworths.feature.shop.storelocator.legacy.generated.callback;

import au.com.woolworths.feature.shop.storelocator.legacy.StoreLocatorViewModel;
import au.com.woolworths.feature.shop.storelocator.legacy.databinding.LegacyActivityStoreLocatorBindingImpl;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class OnQueryTextChange1 implements au.com.woolworths.android.onesite.bindings.OnQueryTextChange {

    /* renamed from: a, reason: collision with root package name */
    public final LegacyActivityStoreLocatorBindingImpl f8172a;

    public interface Listener {
    }

    public OnQueryTextChange1(LegacyActivityStoreLocatorBindingImpl legacyActivityStoreLocatorBindingImpl) {
        this.f8172a = legacyActivityStoreLocatorBindingImpl;
    }

    @Override // au.com.woolworths.android.onesite.bindings.OnQueryTextChange
    public final boolean onQueryTextChange(String queryTextValue) {
        StoreLocatorViewModel storeLocatorViewModel = this.f8172a.I;
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
