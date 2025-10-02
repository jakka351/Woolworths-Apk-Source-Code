package au.com.woolworths.pay.internal.services.tokenise;

import au.com.woolworths.pay.internal.network.APICall;
import au.com.woolworths.pay.internal.services.BaseAPIService;
import au.com.woolworths.pay.sdk.hooks.Retryable;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.interfaces.PayResultCallback;
import au.com.woolworths.pay.sdk.models.PayPalInstrument;

/* loaded from: classes4.dex */
public class TokenisePayPalService extends BaseAPIService<TokenisePayPalResponse, PayPalInstrument> {
    public String e;
    public boolean f;

    @Override // au.com.woolworths.pay.internal.services.BaseAPIService
    public final void a(final PayResultCallback payResultCallback) {
        c(new APICall(new TokenisePayPalRequest(this.d.f9177a, this.c, this.e, this.f), new TokenisePayPalResponse()), new PayResultCallback<TokenisePayPalResponse>() { // from class: au.com.woolworths.pay.internal.services.tokenise.TokenisePayPalService.1
            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void A(Retryable retryable) {
                TokenisePayPalService tokenisePayPalService = TokenisePayPalService.this;
                PayResultCallback payResultCallback2 = payResultCallback;
                payResultCallback2.A(tokenisePayPalService.b(payResultCallback2));
            }

            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void k0(Object obj) {
                payResultCallback.k0(((TokenisePayPalResponse) obj).payPalInstrument);
            }

            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void v(PayError payError) {
                payResultCallback.v(payError);
            }
        });
    }
}
