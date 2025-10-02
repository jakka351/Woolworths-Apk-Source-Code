package au.com.woolworths.feature.shop.instore.navigation.productfinder;

import au.com.woolworths.feature.shop.instore.navigation.onboarding.ProductFinderOnboardingContract;
import au.com.woolworths.feature.shop.instore.navigation.productfinder.ProductFinderActivity;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class ProductFinderActivity$onCreate$2$1$1$1 extends FunctionReferenceImpl implements Function1<ProductFinderOnboardingContract.Actions, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m((ProductFinderOnboardingContract.Actions) obj);
        return Unit.f24250a;
    }

    public final void m(ProductFinderOnboardingContract.Actions p0) {
        Intrinsics.h(p0, "p0");
        ProductFinderActivity productFinderActivity = (ProductFinderActivity) this.receiver;
        int i = ProductFinderActivity.C;
        productFinderActivity.getClass();
        if (p0.equals(ProductFinderOnboardingContract.Actions.CloseAndMoveToProductFinder.f7413a)) {
            productFinderActivity.z.f(ProductFinderActivity.Mode.d);
        } else {
            if (!p0.equals(ProductFinderOnboardingContract.Actions.CloseOnboarding.f7414a)) {
                throw new NoWhenBranchMatchedException();
            }
            productFinderActivity.getF().d();
        }
    }
}
