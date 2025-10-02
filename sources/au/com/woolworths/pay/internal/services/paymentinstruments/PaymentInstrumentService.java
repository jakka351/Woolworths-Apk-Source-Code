package au.com.woolworths.pay.internal.services.paymentinstruments;

import au.com.woolworths.pay.internal.network.APICall;
import au.com.woolworths.pay.internal.services.BaseAPIService;
import au.com.woolworths.pay.sdk.hooks.Retryable;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.interfaces.PayResultCallback;
import au.com.woolworths.pay.sdk.models.PaymentInstrument;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class PaymentInstrumentService extends BaseAPIService<ListPaymentInstrumentsResponse, List<? extends PaymentInstrument>> {
    @Override // au.com.woolworths.pay.internal.services.BaseAPIService
    public final void a(final PayResultCallback payResultCallback) {
        c(new APICall(new ListPaymentInstrumentsRequest(this.d.f9177a, this.c), new ListPaymentInstrumentsResponse()), new PayResultCallback<ListPaymentInstrumentsResponse>() { // from class: au.com.woolworths.pay.internal.services.paymentinstruments.PaymentInstrumentService.1
            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void A(Retryable retryable) {
                PaymentInstrumentService paymentInstrumentService = PaymentInstrumentService.this;
                PayResultCallback payResultCallback2 = payResultCallback;
                payResultCallback2.A(paymentInstrumentService.b(payResultCallback2));
            }

            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void k0(Object obj) {
                ListPaymentInstrumentsResponse listPaymentInstrumentsResponse = (ListPaymentInstrumentsResponse) obj;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(Arrays.asList(listPaymentInstrumentsResponse.getCreditCards()));
                arrayList.addAll(Arrays.asList(listPaymentInstrumentsResponse.getGiftCards()));
                arrayList.addAll(Arrays.asList(listPaymentInstrumentsResponse.getPayPal()));
                payResultCallback.k0(arrayList);
            }

            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void v(PayError payError) {
                payResultCallback.v(payError);
            }
        });
    }
}
