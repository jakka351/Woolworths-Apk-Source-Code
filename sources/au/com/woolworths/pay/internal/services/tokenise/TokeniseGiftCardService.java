package au.com.woolworths.pay.internal.services.tokenise;

import au.com.woolworths.pay.internal.network.APICall;
import au.com.woolworths.pay.internal.services.BaseAPIService;
import au.com.woolworths.pay.sdk.interfaces.PayResultCallback;
import au.com.woolworths.pay.sdk.models.SaveOptions;

/* loaded from: classes4.dex */
public class TokeniseGiftCardService extends BaseAPIService<TokeniseGiftCardResponse, TokeniseGiftCardResponse> {
    public String e;
    public String f;
    public SaveOptions g;

    @Override // au.com.woolworths.pay.internal.services.BaseAPIService
    public final void a(PayResultCallback payResultCallback) {
        c(new APICall(new TokeniseGiftCardRequest(this.d.f9177a, this.c, this.e, this.f, this.g), new TokeniseGiftCardResponse()), payResultCallback);
    }
}
