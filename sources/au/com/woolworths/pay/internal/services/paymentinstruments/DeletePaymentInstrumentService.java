package au.com.woolworths.pay.internal.services.paymentinstruments;

import au.com.woolworths.pay.internal.network.APICall;
import au.com.woolworths.pay.internal.services.BaseAPIService;
import au.com.woolworths.pay.sdk.interfaces.PayResultCallback;

/* loaded from: classes4.dex */
public class DeletePaymentInstrumentService extends BaseAPIService<DeletePaymentInstrumentResponse, DeletePaymentInstrumentResponse> {
    public String e;

    @Override // au.com.woolworths.pay.internal.services.BaseAPIService
    public final void a(PayResultCallback payResultCallback) {
        c(new APICall(new DeletePaymentInstrumentRequest(this.d.f9177a, this.c, this.e), new DeletePaymentInstrumentResponse()), payResultCallback);
    }
}
