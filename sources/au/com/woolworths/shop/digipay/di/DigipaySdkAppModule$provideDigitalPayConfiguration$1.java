package au.com.woolworths.shop.digipay.di;

import au.com.woolworths.pay.sdk.models.config.Configuration;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"au/com/woolworths/shop/digipay/di/DigipaySdkAppModule$provideDigitalPayConfiguration$1", "Lau/com/woolworths/pay/sdk/models/config/Configuration;", "shop-digipay_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DigipaySdkAppModule$provideDigitalPayConfiguration$1 extends Configuration {
    @Override // au.com.woolworths.pay.sdk.models.config.Configuration
    public final boolean allowsInvalidSSL() {
        if (isDebug()) {
            return true;
        }
        return super.allowsInvalidSSL();
    }
}
