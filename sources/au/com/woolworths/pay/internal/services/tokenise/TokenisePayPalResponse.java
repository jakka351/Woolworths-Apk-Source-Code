package au.com.woolworths.pay.internal.services.tokenise;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import au.com.woolworths.pay.internal.network.JSONField;
import au.com.woolworths.pay.sdk.models.PayPalInstrument;

@Keep
/* loaded from: classes4.dex */
class TokenisePayPalResponse {

    @NonNull
    @JSONField("payPal")
    PayPalInstrument payPalInstrument;
}
