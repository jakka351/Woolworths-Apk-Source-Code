package au.com.woolworths.shop.cart.ui.cart;

import au.com.woolworths.shop.cart.ui.cart.CartContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class CartScreenKt$CartScreen$4$1$1$1$2$4$1$2$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String p0 = (String) obj;
        Intrinsics.h(p0, "p0");
        CartViewModel cartViewModel = (CartViewModel) this.receiver;
        cartViewModel.getClass();
        cartViewModel.l.k(new CartContract.Actions.CopyEverydayMarketCouponCode(p0));
        return Unit.f24250a;
    }
}
