package au.com.woolworths.pay.internal.services.merchantprofile;

import au.com.woolworths.pay.internal.network.APICall;
import au.com.woolworths.pay.internal.services.BaseAPIService;
import au.com.woolworths.pay.internal.util.Logger;
import au.com.woolworths.pay.sdk.hooks.Retryable;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.interfaces.PayResultCallback;
import au.com.woolworths.pay.sdk.models.merchantprofile.AllowedPaymentMethods;
import au.com.woolworths.pay.sdk.models.merchantprofile.MerchantProfile;

/* loaded from: classes4.dex */
public class MerchantProfileService extends BaseAPIService<MerchantProfileResponse, MerchantProfile> {
    public Logger e;

    @Override // au.com.woolworths.pay.internal.services.BaseAPIService
    public final void a(final PayResultCallback payResultCallback) {
        this.e.b("MerchantProfileService", "Retrieving Merchant profile");
        c(new APICall(new MerchantProfileRequest(this.d.f9177a, this.c), new MerchantProfileResponse()), new PayResultCallback<MerchantProfileResponse>() { // from class: au.com.woolworths.pay.internal.services.merchantprofile.MerchantProfileService.1
            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void A(Retryable retryable) {
                MerchantProfileService merchantProfileService = MerchantProfileService.this;
                PayResultCallback payResultCallback2 = payResultCallback;
                payResultCallback2.A(merchantProfileService.b(payResultCallback2));
            }

            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void k0(Object obj) {
                MerchantProfile merchantProfile = new MerchantProfile();
                AllowedPaymentMethods allowedPaymentMethods = ((MerchantProfileResponse) obj).allowedPaymentMethods;
                merchantProfile.setCreditCardInfo(allowedPaymentMethods.getCreditCardInfo());
                merchantProfile.setGiftCardInfo(allowedPaymentMethods.getGiftCardInfo());
                merchantProfile.setPayPalInfo(allowedPaymentMethods.getPayPalInfo());
                merchantProfile.setCreditCardsAllowed(allowedPaymentMethods.getCreditCardInfo() != null);
                merchantProfile.setGiftCardsAllowed(allowedPaymentMethods.getGiftCardInfo() != null);
                merchantProfile.setPayPalAllowed(allowedPaymentMethods.getPayPalInfo() != null);
                payResultCallback.k0(merchantProfile);
            }

            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void v(PayError payError) {
                payResultCallback.v(payError);
            }
        });
    }
}
