package au.com.woolworths.shop.cart.ui.quickadd;

import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.product.models.ProductTrolleyData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class QuickAddOfferScreenKt$QuickAddOfferScreen$4$4$1 extends FunctionReferenceImpl implements Function1<ProductCard, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ProductCard p0 = (ProductCard) obj;
        Intrinsics.h(p0, "p0");
        QuickAddOfferViewModel quickAddOfferViewModel = (QuickAddOfferViewModel) this.receiver;
        quickAddOfferViewModel.getClass();
        ProductTrolleyData trolley = p0.getTrolley();
        Unit unit = Unit.f24250a;
        if (trolley != null) {
            quickAddOfferViewModel.r6(p0, trolley.getIncrement());
            quickAddOfferViewModel.h.f(unit);
        }
        return unit;
    }
}
