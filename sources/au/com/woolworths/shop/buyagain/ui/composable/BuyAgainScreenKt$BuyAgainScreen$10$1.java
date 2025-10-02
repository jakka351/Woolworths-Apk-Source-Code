package au.com.woolworths.shop.buyagain.ui.composable;

import au.com.woolworths.analytics.supers.buyagain.BuyAgainAnalytics;
import au.com.woolworths.product.models.ProductCard;
import au.com.woolworths.shop.buyagain.ui.BuyAgainContract;
import au.com.woolworths.shop.buyagain.ui.BuyAgainViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class BuyAgainScreenKt$BuyAgainScreen$10$1 extends FunctionReferenceImpl implements Function1<ProductCard, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ProductCard p0 = (ProductCard) obj;
        Intrinsics.h(p0, "p0");
        BuyAgainViewModel buyAgainViewModel = (BuyAgainViewModel) this.receiver;
        buyAgainViewModel.getClass();
        buyAgainViewModel.g.g(BuyAgainAnalytics.BuyAgain.Action.t);
        buyAgainViewModel.k.k(new BuyAgainContract.Actions.OpenAddToList(p0));
        return Unit.f24250a;
    }
}
