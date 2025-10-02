package au.com.woolworths.feature.shop.instore.navigation.productfinder;

import au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/productfinder/EmptyCallbacks;", "Lau/com/woolworths/feature/shop/instore/navigation/productfinder/ProductFinderCallbacks;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final class EmptyCallbacks implements ProductFinderCallbacks {
    public static final EmptyCallbacks d = new EmptyCallbacks();

    @Override // au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderCallbacks
    public final void C4() {
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderCallbacks
    public final void J5() {
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderCallbacks
    public final void b() {
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderCallbacks
    public final void d2() {
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderCallbacks
    public final void g2() {
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderCallbacks
    public final void h() {
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderCallbacks
    public final void j2(ProductFinderContract.LocationServicesUnavailableState state) {
        Intrinsics.h(state, "state");
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderCallbacks
    public final void p1(String searchTerm) {
        Intrinsics.h(searchTerm, "searchTerm");
    }
}
