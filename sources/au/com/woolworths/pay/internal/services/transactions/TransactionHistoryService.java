package au.com.woolworths.pay.internal.services.transactions;

import au.com.woolworths.pay.internal.network.APICall;
import au.com.woolworths.pay.internal.services.BaseAPIService;
import au.com.woolworths.pay.sdk.hooks.Retryable;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.interfaces.PayResultCallback;

/* loaded from: classes4.dex */
public class TransactionHistoryService extends BaseAPIService<TransactionHistoryResponse, Transaction[]> {
    @Override // au.com.woolworths.pay.internal.services.BaseAPIService
    public final void a(final PayResultCallback payResultCallback) {
        c(new APICall(new TransactionHistoryRequest(this.d.f9177a, this.c, null), new TransactionHistoryResponse()), new PayResultCallback<TransactionHistoryResponse>() { // from class: au.com.woolworths.pay.internal.services.transactions.TransactionHistoryService.1
            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void A(Retryable retryable) {
                TransactionHistoryService transactionHistoryService = TransactionHistoryService.this;
                PayResultCallback payResultCallback2 = payResultCallback;
                payResultCallback2.A(transactionHistoryService.b(payResultCallback2));
            }

            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void k0(Object obj) {
                payResultCallback.k0(((TransactionHistoryResponse) obj).transactions);
            }

            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void v(PayError payError) {
                payResultCallback.v(payError);
            }
        });
    }
}
