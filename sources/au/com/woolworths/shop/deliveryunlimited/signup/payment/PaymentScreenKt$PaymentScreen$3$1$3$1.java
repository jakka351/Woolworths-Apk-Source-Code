package au.com.woolworths.shop.deliveryunlimited.signup.payment;

import au.com.woolworths.feature.shop.wpay.ui.common.model.ErrorState;
import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import com.woolworths.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class PaymentScreenKt$PaymentScreen$3$1$3$1 extends FunctionReferenceImpl implements Function2<String, Boolean, Unit> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String p0 = (String) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        Intrinsics.h(p0, "p0");
        PaymentViewModel paymentViewModel = (PaymentViewModel) this.receiver;
        paymentViewModel.getClass();
        LoadingState loadingState = LoadingState.e;
        ErrorState.SnackBar snackBar = new ErrorState.SnackBar(R.string.checkout_payment_select_credit_card_fail_msg);
        if (zBooleanValue) {
            p0 = null;
        }
        paymentViewModel.p6(loadingState, snackBar, p0);
        return Unit.f24250a;
    }
}
