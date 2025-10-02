package au.com.woolworths.pay.internal.services.balances;

import android.util.Pair;
import au.com.woolworths.pay.internal.AccessTokenManager;
import au.com.woolworths.pay.internal.network.APICall;
import au.com.woolworths.pay.internal.network.HttpClient;
import au.com.woolworths.pay.internal.services.BaseAPIService;
import au.com.woolworths.pay.internal.services.balances.GiftCardBalanceResult;
import au.com.woolworths.pay.sdk.hooks.Retryable;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.interfaces.PayResultCallback;
import au.com.woolworths.pay.sdk.models.config.Configuration;
import au.com.woolworths.pay.sdk.models.errors.FatalError;
import au.com.woolworths.pay.sdk.models.errors.JSONError;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public class GiftCardBalanceService<T extends GiftCardBalanceResult> extends BaseAPIService<GiftCardBalanceResponse, List<? extends T>> {
    public final GiftCardBalanceRequest e;
    public final GiftCardBalanceResponse f;
    public final Class g;

    public GiftCardBalanceService(Configuration configuration, HttpClient httpClient, AccessTokenManager accessTokenManager, String[] strArr) {
        super(configuration, httpClient, accessTokenManager);
        this.e = new GiftCardBalanceInstrumentsRequest(accessTokenManager.f9177a, configuration, strArr);
        this.f = new GiftCardBalanceInstrumentsResponse();
        this.g = GiftCardBalanceInstrumentsResult.class;
    }

    @Override // au.com.woolworths.pay.internal.services.BaseAPIService
    public final void a(final PayResultCallback payResultCallback) {
        c(new APICall(this.e, this.f), new PayResultCallback<GiftCardBalanceResponse>() { // from class: au.com.woolworths.pay.internal.services.balances.GiftCardBalanceService.1
            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void A(Retryable retryable) {
                GiftCardBalanceService giftCardBalanceService = GiftCardBalanceService.this;
                PayResultCallback payResultCallback2 = payResultCallback;
                payResultCallback2.A(giftCardBalanceService.b(payResultCallback2));
            }

            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void k0(Object obj) {
                GiftCardBalanceResponseElement[] elements = ((GiftCardBalanceResponse) obj).getElements();
                ArrayList arrayList = new ArrayList();
                int length = elements.length;
                int i = 0;
                while (true) {
                    PayResultCallback payResultCallback2 = payResultCallback;
                    if (i >= length) {
                        payResultCallback2.k0(arrayList);
                        return;
                    }
                    GiftCardBalanceResponseElement giftCardBalanceResponseElement = elements[i];
                    try {
                        GiftCardBalanceResult giftCardBalanceResult = (GiftCardBalanceResult) GiftCardBalanceService.this.g.newInstance();
                        giftCardBalanceResult.setFieldsFromElement(giftCardBalanceResponseElement);
                        String str = giftCardBalanceResponseElement.errorCode;
                        if (str == null || giftCardBalanceResponseElement.expired) {
                            GiftCardBalanceInfo giftCardBalanceInfo = new GiftCardBalanceInfo();
                            giftCardBalanceInfo.balance = giftCardBalanceResponseElement.balance;
                            giftCardBalanceInfo.expired = giftCardBalanceResponseElement.expired;
                            giftCardBalanceInfo.expiryMonth = giftCardBalanceResponseElement.expiryMonth;
                            giftCardBalanceInfo.expiryYear = giftCardBalanceResponseElement.expiryYear;
                            giftCardBalanceResult.balanceInfo = giftCardBalanceInfo;
                        } else {
                            giftCardBalanceResult.error = new JSONError(str, giftCardBalanceResponseElement.errorMessage, giftCardBalanceResponseElement.errorDetail);
                        }
                        arrayList.add(giftCardBalanceResult);
                        i++;
                    } catch (Exception e) {
                        payResultCallback2.v(new FatalError(e.getLocalizedMessage()));
                        return;
                    }
                }
            }

            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void v(PayError payError) {
                payResultCallback.v(payError);
            }
        });
    }

    public GiftCardBalanceService(Configuration configuration, HttpClient httpClient, AccessTokenManager accessTokenManager, Pair[] pairArr) {
        super(configuration, httpClient, accessTokenManager);
        this.e = new GiftCardBalanceNumbersRequest(accessTokenManager.f9177a, configuration, pairArr);
        this.f = new GiftCardBalanceNumbersResponse();
        this.g = GiftCardBalanceNumbersResult.class;
    }
}
