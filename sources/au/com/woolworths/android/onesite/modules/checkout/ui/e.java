package au.com.woolworths.android.onesite.modules.checkout.ui;

import au.com.woolworths.android.onesite.modules.checkout.CheckOutContract;
import au.com.woolworths.android.onesite.modules.checkout.ui.CheckoutContract;
import au.com.woolworths.android.onesite.network.NoConnectivityException;
import au.com.woolworths.android.onesite.utils.Jsons;
import au.com.woolworths.foundation.shop.model.checkout.OrderSummary;
import com.google.gson.JsonObject;
import com.woolworths.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.SharedFlowImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class e implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ CheckoutViewModel e;

    public /* synthetic */ e(CheckoutViewModel checkoutViewModel, int i) {
        this.d = i;
        this.e = checkoutViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        OrderSummary orderSummary;
        switch (this.d) {
            case 0:
                CheckoutViewModel checkoutViewModel = this.e;
                SharedFlowImpl sharedFlowImpl = checkoutViewModel.l;
                JsonObject jsonObject = (JsonObject) obj;
                checkoutViewModel.p6(CheckOutContract.LoadingState.e);
                if (Jsons.c(jsonObject) && (orderSummary = (OrderSummary) checkoutViewModel.h.b(jsonObject, OrderSummary.class)) != null && orderSummary.getIsPlaced()) {
                    sharedFlowImpl.f(new CheckoutContract.Action.LaunchOrderConfirmation(orderSummary.getOrderId()));
                } else {
                    sharedFlowImpl.f(new CheckoutContract.Action.ShowSnackBar(R.string.payment_unknown_failure));
                }
                break;
            default:
                CheckoutViewModel checkoutViewModel2 = this.e;
                SharedFlowImpl sharedFlowImpl2 = checkoutViewModel2.l;
                checkoutViewModel2.p6(CheckOutContract.LoadingState.e);
                if (((Throwable) obj) instanceof NoConnectivityException) {
                    sharedFlowImpl2.f(new CheckoutContract.Action.ShowSnackBar(R.string.error_no_network));
                } else {
                    sharedFlowImpl2.f(new CheckoutContract.Action.ShowSnackBar(R.string.payment_unknown_failure));
                }
                break;
        }
        return Unit.f24250a;
    }
}
