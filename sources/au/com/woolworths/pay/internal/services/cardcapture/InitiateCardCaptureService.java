package au.com.woolworths.pay.internal.services.cardcapture;

import au.com.woolworths.pay.internal.network.APICall;
import au.com.woolworths.pay.internal.services.BaseAPIService;
import au.com.woolworths.pay.sdk.interfaces.PayResultCallback;
import au.com.woolworths.pay.sdk.models.CardCaptureInfo;

/* loaded from: classes4.dex */
public class InitiateCardCaptureService extends BaseAPIService<CardCaptureInfo, CardCaptureInfo> {
    public String e;

    @Override // au.com.woolworths.pay.internal.services.BaseAPIService
    public final void a(PayResultCallback payResultCallback) {
        c(new APICall(new InitiateCardCaptureRequest(this.d.f9177a, this.c, this.e), new CardCaptureInfo()), payResultCallback);
    }
}
