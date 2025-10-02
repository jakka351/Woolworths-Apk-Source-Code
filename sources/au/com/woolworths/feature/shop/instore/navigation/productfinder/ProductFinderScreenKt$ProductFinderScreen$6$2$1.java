package au.com.woolworths.feature.shop.instore.navigation.productfinder;

import au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ProductFinderScreenKt$ProductFinderScreen$6$2$1 extends FunctionReferenceImpl implements Function1<ProductFinderContract.LocationServicesUnavailableState, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ProductFinderContract.LocationServicesUnavailableState p0 = (ProductFinderContract.LocationServicesUnavailableState) obj;
        Intrinsics.h(p0, "p0");
        ((ProductFinderCallbacks) this.receiver).j2(p0);
        return Unit.f24250a;
    }
}
