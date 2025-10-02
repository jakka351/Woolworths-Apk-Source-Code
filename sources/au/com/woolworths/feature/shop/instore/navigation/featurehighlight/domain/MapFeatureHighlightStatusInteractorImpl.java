package au.com.woolworths.feature.shop.instore.navigation.featurehighlight.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderRepositoryImpl;
import au.com.woolworths.foundation.shop.instore.navigation.featurehighlight.MapFeatureHighlightStatusInteractor;
import au.com.woolworths.foundation.shop.instore.navigation.map.InstoreNavigationInteractor;
import au.com.woolworths.product.extensions.ProductCardExtKt;
import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/featurehighlight/domain/MapFeatureHighlightStatusInteractorImpl;", "Lau/com/woolworths/foundation/shop/instore/navigation/featurehighlight/MapFeatureHighlightStatusInteractor;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MapFeatureHighlightStatusInteractorImpl implements MapFeatureHighlightStatusInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final ProductFinderRepositoryImpl f7325a;
    public final InstoreNavigationInteractor b;
    public boolean c;

    public MapFeatureHighlightStatusInteractorImpl(ProductFinderRepositoryImpl productFinderRepositoryImpl, InstoreNavigationInteractor instoreNavigationInteractor) {
        Intrinsics.h(instoreNavigationInteractor, "instoreNavigationInteractor");
        this.f7325a = productFinderRepositoryImpl;
        this.b = instoreNavigationInteractor;
    }

    public final boolean a(ProductCard productCard) {
        Intrinsics.h(productCard, "productCard");
        if (!this.b.d() || this.f7325a.f7437a.getBoolean("tappableAisleFeatureHighlightShown", false) || this.c || !ProductCardExtKt.o(productCard)) {
            return false;
        }
        this.c = true;
        return true;
    }
}
