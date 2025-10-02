package au.com.woolworths.android.onesite.modules.checkout.digitalpay;

import au.com.woolworths.foundation.shop.model.checkout.PaymentStepUp;
import au.com.woolworths.foundation.shop.model.checkout.ResponseStatusWithErrorListForOkStatus;

/* loaded from: classes3.dex */
public class InstrumentPaymentResult extends ResponseStatusWithErrorListForOkStatus.PaymentInstrumentResponse {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4286a;
    public final String b;
    public final boolean c;

    public InstrumentPaymentResult(String str, PaymentStepUp paymentStepUp, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2) {
        this.PaymentInstrumentType = str;
        this.StepUp = paymentStepUp;
        this.PaymentInstrumentId = str2;
        this.PaymentTransactionRef = str3;
        this.ErrorCode = str4;
        this.ErrorMessage = str5;
        this.ErrorDetail = str6;
        this.f4286a = z;
        this.b = str7;
        this.c = z2;
    }
}
