package au.com.woolworths.shop.cart.ui.quickadd;

import au.com.woolworths.product.models.ProductCard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class QuickAddOfferScreenKt$QuickAddOfferScreen$4$5$1 extends FunctionReferenceImpl implements Function1<ProductCard, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ProductCard p0 = (ProductCard) obj;
        Intrinsics.h(p0, "p0");
        ((QuickAddOfferViewModel) this.receiver).getClass();
        return Unit.f24250a;
    }
}
