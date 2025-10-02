package au.com.woolworths.shop.deliveryunlimited.signup.payment;

import au.com.woolworths.shop.deliveryunlimited.signup.data.DeliveryUnlimitedSubscribeLink;
import au.com.woolworths.shop.deliveryunlimited.signup.payment.PaymentContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
final /* synthetic */ class TermsBottomSheetKt$TermsBottomSheet$2$1 extends FunctionReferenceImpl implements Function1<DeliveryUnlimitedSubscribeLink, Unit> {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        DeliveryUnlimitedSubscribeLink p0 = (DeliveryUnlimitedSubscribeLink) obj;
        Intrinsics.h(p0, "p0");
        PaymentViewModel paymentViewModel = (PaymentViewModel) this.receiver;
        paymentViewModel.getClass();
        paymentViewModel.m.k(new PaymentContract.Action.OpenUrl(p0.getUrl()));
        return Unit.f24250a;
    }
}
