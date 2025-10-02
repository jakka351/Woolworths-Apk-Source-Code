package au.com.woolworths.shop.deliveryunlimited.signup.payment;

import au.com.woolworths.feature.shop.wpay.domain.model.payment.PaymentMethodItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class PaymentScreenKt$PaymentScreen$3$1$1$1 extends FunctionReferenceImpl implements Function1<PaymentMethodItem.CreditCard.Add, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PaymentMethodItem.CreditCard.Add p0 = (PaymentMethodItem.CreditCard.Add) obj;
        Intrinsics.h(p0, "p0");
        ((PaymentViewModel) this.receiver).r6(p0);
        return Unit.f24250a;
    }
}
