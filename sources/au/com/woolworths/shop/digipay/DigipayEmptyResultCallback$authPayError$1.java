package au.com.woolworths.shop.digipay;

import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.models.errors.PayErrorCode;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/digipay/DigipayEmptyResultCallback$authPayError$1", "Lau/com/woolworths/pay/sdk/interfaces/PayError;", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DigipayEmptyResultCallback$authPayError$1 implements PayError {
    @Override // au.com.woolworths.pay.sdk.interfaces.PayError
    public final String getErrorMessage() {
        return "Unable to retrieve new access token";
    }

    @Override // au.com.woolworths.pay.sdk.interfaces.PayError
    public final PayErrorCode getPayErrorCode() {
        return PayErrorCode.HTTP_NOT_OK;
    }
}
