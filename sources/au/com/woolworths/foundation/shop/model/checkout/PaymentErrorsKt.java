package au.com.woolworths.foundation.shop.model.checkout;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"model"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PaymentErrorsKt {
    public static final boolean a(PaymentErrors paymentErrors) {
        List errors;
        if (paymentErrors != null && paymentErrors.getResponseStatus() != null && (errors = paymentErrors.getResponseStatus().getErrors()) != null && !errors.isEmpty()) {
            List list = errors;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if ("WindowInvalid".equals(((ResponseError) it.next()).getErrorCode())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
