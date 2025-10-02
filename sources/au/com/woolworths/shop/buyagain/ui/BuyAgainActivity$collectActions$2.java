package au.com.woolworths.shop.buyagain.ui;

import au.com.woolworths.android.onesite.models.text.PlainText;
import au.com.woolworths.product.offers.ProductBoostContract;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class BuyAgainActivity$collectActions$2 extends AdaptedFunctionReference implements Function2<ProductBoostContract.Action, Continuation<? super Unit>, Object>, SuspendFunction {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ProductBoostContract.Action action = (ProductBoostContract.Action) obj;
        BuyAgainActivity buyAgainActivity = (BuyAgainActivity) this.d;
        int i = BuyAgainActivity.D;
        if (action instanceof ProductBoostContract.Action.ShowRetrySnackbar) {
            BuyAgainViewModel.w6(buyAgainActivity.O4(), new PlainText(((ProductBoostContract.Action.ShowRetrySnackbar) action).b), new PlainText("Retry"), new au.com.woolworths.sdui.common.alert.a(16, buyAgainActivity, action), null, 8);
        } else {
            if (!(action instanceof ProductBoostContract.Action.ShowSnackbar)) {
                buyAgainActivity.getClass();
                throw new NoWhenBranchMatchedException();
            }
            BuyAgainViewModel.w6(buyAgainActivity.O4(), new PlainText(((ProductBoostContract.Action.ShowSnackbar) action).b), null, null, null, 14);
        }
        return Unit.f24250a;
    }
}
