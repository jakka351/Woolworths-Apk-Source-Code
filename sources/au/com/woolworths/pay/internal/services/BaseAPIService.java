package au.com.woolworths.pay.internal.services;

import au.com.woolworths.pay.internal.AccessTokenManager;
import au.com.woolworths.pay.internal.network.APICall;
import au.com.woolworths.pay.internal.network.APICallback;
import au.com.woolworths.pay.internal.network.APIResponse;
import au.com.woolworths.pay.internal.network.HttpClient;
import au.com.woolworths.pay.sdk.hooks.Retryable;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.interfaces.PayResultCallback;
import au.com.woolworths.pay.sdk.models.config.Configuration;
import au.com.woolworths.pay.sdk.models.errors.HTTPNotOkError;
import au.com.woolworths.pay.sdk.models.errors.RetryExhaustedError;
import java.util.Locale;

/* loaded from: classes4.dex */
public abstract class BaseAPIService<InternalResponse, TransformedResponse> {

    /* renamed from: a, reason: collision with root package name */
    public int f9184a;
    public final HttpClient b;
    public final Configuration c;
    public final AccessTokenManager d;

    public BaseAPIService(Configuration configuration, HttpClient httpClient, AccessTokenManager accessTokenManager) {
        this.f9184a = configuration.getMaxRetryLimit();
        this.c = configuration;
        this.b = httpClient;
        this.d = accessTokenManager;
    }

    public abstract void a(PayResultCallback payResultCallback);

    public final Retryable b(PayResultCallback payResultCallback) {
        Retryable retryable = new Retryable();
        retryable.f9190a = this;
        retryable.b = this.d;
        retryable.c = payResultCallback;
        return retryable;
    }

    public final void c(APICall aPICall, final PayResultCallback payResultCallback) {
        aPICall.a(this.b, new APICallback<Object>() { // from class: au.com.woolworths.pay.internal.services.BaseAPIService.1
            @Override // au.com.woolworths.pay.internal.network.APICallback
            public final void a() {
                BaseAPIService baseAPIService = BaseAPIService.this;
                int i = baseAPIService.f9184a;
                PayResultCallback payResultCallback2 = payResultCallback;
                if (i <= 0) {
                    payResultCallback2.v(new RetryExhaustedError(String.format(Locale.getDefault(), "Error: onAuthorisationRequired() after %d retries", Integer.valueOf(baseAPIService.c.getMaxRetryLimit()))));
                } else {
                    payResultCallback2.A(baseAPIService.b(payResultCallback2));
                    baseAPIService.f9184a--;
                }
            }

            @Override // au.com.woolworths.pay.internal.network.APICallback
            public final void b(PayError payError) {
                payResultCallback.v(payError);
            }

            @Override // au.com.woolworths.pay.internal.network.APICallback
            public final void c(APIResponse aPIResponse) {
                int i = aPIResponse.f9180a;
                PayResultCallback payResultCallback2 = payResultCallback;
                if (i < 400) {
                    payResultCallback2.k0(aPIResponse.c);
                } else {
                    payResultCallback2.v(new HTTPNotOkError(Integer.valueOf(i), aPIResponse.d.getErrorMessage()));
                }
            }
        });
    }
}
