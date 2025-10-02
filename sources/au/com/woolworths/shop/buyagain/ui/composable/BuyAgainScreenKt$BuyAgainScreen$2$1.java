package au.com.woolworths.shop.buyagain.ui.composable;

import au.com.woolworths.analytics.supers.buyagain.BuyAgainAnalytics;
import au.com.woolworths.shop.buyagain.ui.BuyAgainContract;
import au.com.woolworths.shop.buyagain.ui.BuyAgainViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class BuyAgainScreenKt$BuyAgainScreen$2$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BuyAgainViewModel buyAgainViewModel = (BuyAgainViewModel) this.receiver;
        buyAgainViewModel.g.g(BuyAgainAnalytics.BuyAgain.Action.i);
        buyAgainViewModel.k.k(BuyAgainContract.Actions.OpenCart.f10264a);
        return Unit.f24250a;
    }
}
