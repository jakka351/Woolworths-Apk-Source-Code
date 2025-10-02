package au.com.woolworths.pay.internal.services.merchantprofile;

import androidx.annotation.Keep;
import au.com.woolworths.pay.internal.network.JSONField;
import au.com.woolworths.pay.sdk.models.merchantprofile.AllowedPaymentMethods;

@Keep
/* loaded from: classes4.dex */
class MerchantProfileResponse {

    @JSONField("allowedPaymentMethods")
    AllowedPaymentMethods allowedPaymentMethods;
}
