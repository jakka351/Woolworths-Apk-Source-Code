package au.com.woolworths.shop.deliveryunlimited.signup.payment;

import au.com.woolworths.feature.shop.wpay.ui.common.model.LoadingState;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.MutableStateFlow;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class PaymentScreenKt$PaymentScreen$3$1$5$1 extends FunctionReferenceImpl implements Function0<Unit> {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        MutableStateFlow mutableStateFlow = ((PaymentViewModel) this.receiver).k;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.d(value, PaymentContract.ViewState.a((PaymentContract.ViewState) value, LoadingState.d, null, null, null, false, null, null, null, null, 510)));
        return Unit.f24250a;
    }
}
