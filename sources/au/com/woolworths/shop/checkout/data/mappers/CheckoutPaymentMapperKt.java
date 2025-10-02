package au.com.woolworths.shop.checkout.data.mappers;

import au.com.woolworths.shop.checkout.domain.model.PaymentError;
import au.com.woolworths.shop.checkout.domain.model.PaymentErrorStepUp;
import au.com.woolworths.shop.checkout.domain.model.PaymentResponse;
import com.woolworths.shop.payment.fragment.PaymentResponse;
import com.woolworths.shop.payment.fragment.ZeroPaymentResponse;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"shop-checkout_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CheckoutPaymentMapperKt {
    public static final PaymentResponse a(com.woolworths.shop.payment.fragment.PaymentResponse paymentResponse) {
        PaymentResponse.OnPaymentSuccess onPaymentSuccess = paymentResponse.b;
        if (onPaymentSuccess != null) {
            return new PaymentResponse.Success(onPaymentSuccess.f23381a, onPaymentSuccess.b);
        }
        PaymentResponse.OnPaymentFailure onPaymentFailure = paymentResponse.c;
        if (onPaymentFailure == null) {
            PaymentResponse.OnPaymentValidationFailure onPaymentValidationFailure = paymentResponse.d;
            if (onPaymentValidationFailure != null) {
                return new PaymentResponse.ValidationError(onPaymentValidationFailure.f23382a, onPaymentValidationFailure.b);
            }
            return null;
        }
        ArrayList<PaymentResponse.PaymentError> arrayList = onPaymentFailure.f23380a;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        for (PaymentResponse.PaymentError paymentError : arrayList) {
            Intrinsics.h(paymentError, "<this>");
            String str = paymentError.f23383a;
            String str2 = paymentError.b;
            String str3 = paymentError.c;
            PaymentResponse.StepUp stepUp = paymentError.d;
            arrayList2.add(new PaymentError(str, str2, str3, stepUp != null ? new PaymentErrorStepUp(stepUp.f23384a, stepUp.b) : null));
        }
        return new PaymentResponse.Fail(arrayList2);
    }

    public static final au.com.woolworths.shop.checkout.domain.model.PaymentResponse b(ZeroPaymentResponse zeroPaymentResponse) {
        ZeroPaymentResponse.OnPaymentSuccess onPaymentSuccess = zeroPaymentResponse.b;
        if (onPaymentSuccess != null) {
            return new PaymentResponse.Success(onPaymentSuccess.f23392a, onPaymentSuccess.b);
        }
        ZeroPaymentResponse.OnPaymentValidationFailure onPaymentValidationFailure = zeroPaymentResponse.c;
        if (onPaymentValidationFailure != null) {
            return new PaymentResponse.ValidationError(onPaymentValidationFailure.f23393a, onPaymentValidationFailure.b);
        }
        return null;
    }
}
