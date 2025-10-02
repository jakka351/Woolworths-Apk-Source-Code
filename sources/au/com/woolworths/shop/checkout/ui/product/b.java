package au.com.woolworths.shop.checkout.ui.product;

import au.com.woolworths.analytics.supers.substitution.CheckoutSubstitutionAnalytics;
import au.com.woolworths.shop.checkout.ui.analytics.CheckoutProductsActions;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ CheckoutProductViewModel e;

    public /* synthetic */ b(CheckoutProductViewModel checkoutProductViewModel, int i) {
        this.d = i;
        this.e = checkoutProductViewModel;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                this.e.D6(CheckoutProductsActions.PromotionSuccess.e);
                break;
            default:
                this.e.C6(CheckoutSubstitutionAnalytics.CheckoutSubstitution.Action.f, null);
                break;
        }
        return Unit.f24250a;
    }
}
