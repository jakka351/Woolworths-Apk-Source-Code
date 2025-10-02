package au.com.woolworths.pay.sdk;

import android.content.Context;
import android.view.View;
import au.com.woolworths.android.onesite.modules.checkout.digitalpay.DigitalPayForOrderPresenter$linkPayPalAccountWithNonce$1$1;
import au.com.woolworths.pay.internal.AccessTokenManager;
import au.com.woolworths.pay.internal.network.HttpClient;
import au.com.woolworths.pay.internal.network.PayTrustManager;
import au.com.woolworths.pay.internal.network.TLSSocketFactory;
import au.com.woolworths.pay.internal.services.cardcapture.InitiateCardCaptureService;
import au.com.woolworths.pay.internal.services.merchantprofile.MerchantProfileManager;
import au.com.woolworths.pay.internal.services.paymentinstruments.DeletePaymentInstrumentService;
import au.com.woolworths.pay.internal.services.tokenise.TokenisePayPalService;
import au.com.woolworths.pay.internal.util.Logger;
import au.com.woolworths.pay.sdk.hooks.Retryable;
import au.com.woolworths.pay.sdk.interfaces.PayEmptyResultCallback;
import au.com.woolworths.pay.sdk.interfaces.PayError;
import au.com.woolworths.pay.sdk.interfaces.PayResultCallback;
import au.com.woolworths.pay.sdk.models.CardCaptureInfo;
import au.com.woolworths.pay.sdk.models.PayPalInstrument;
import au.com.woolworths.pay.sdk.models.config.Configuration;
import au.com.woolworths.pay.sdk.models.errors.InvalidModelError;
import au.com.woolworths.pay.sdk.web.CardCaptureView;
import au.com.woolworths.pay.sdk.web.FormView;
import au.com.woolworths.pay.sdk.web.StepUpView;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Executors;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.TrustManager;

/* loaded from: classes4.dex */
public class PayClient implements PayClientInterface {

    /* renamed from: a, reason: collision with root package name */
    public final MerchantProfileManager f9189a;
    public final Configuration b;
    public final HttpClient c;
    public final Logger d;
    public final AccessTokenManager e;
    public boolean f;

    public PayClient(Configuration configuration) throws SSLException, NoSuchAlgorithmException, KeyManagementException {
        this.b = configuration;
        Logger logger = new Logger(configuration.isDebug());
        this.d = logger;
        AccessTokenManager accessTokenManager = new AccessTokenManager();
        accessTokenManager.f9177a = "";
        this.e = accessTokenManager;
        HttpClient httpClient = new HttpClient();
        httpClient.f = logger;
        httpClient.f9181a = configuration.getBaseURL();
        httpClient.d = Executors.newCachedThreadPool();
        httpClient.b = configuration.getAPIRequestTimeout() * 1000;
        httpClient.c = configuration.getAPIRequestTimeout() * 1000;
        try {
            TLSSocketFactory tLSSocketFactory = new TLSSocketFactory();
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS");
                sSLContext.init(null, new TrustManager[]{new PayTrustManager(configuration)}, null);
                tLSSocketFactory.f9183a = sSLContext.getSocketFactory();
                httpClient.e = tLSSocketFactory;
            } catch (KeyManagementException e) {
                e = e;
                throw new SSLException(e.getMessage());
            } catch (KeyStoreException e2) {
                e = e2;
                throw new SSLException(e.getMessage());
            } catch (NoSuchAlgorithmException e3) {
                e = e3;
                throw new SSLException(e.getMessage());
            }
        } catch (SSLException unused) {
            httpClient.e = null;
        }
        this.c = httpClient;
        this.f9189a = new MerchantProfileManager(configuration, httpClient, this.e, this.d);
    }

    public final void a(String str, final PayEmptyResultCallback payEmptyResultCallback) {
        DeletePaymentInstrumentService deletePaymentInstrumentService = new DeletePaymentInstrumentService(this.b, this.c, this.e);
        deletePaymentInstrumentService.e = str;
        deletePaymentInstrumentService.a(new PayResultCallback() { // from class: au.com.woolworths.pay.sdk.PayClient.2
            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void A(Retryable retryable) {
                payEmptyResultCallback.A(retryable);
            }

            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void k0(Object obj) {
                payEmptyResultCallback.d2();
            }

            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void v(PayError payError) {
                payEmptyResultCallback.v(payError);
            }
        });
    }

    public final StepUpView b(Context context, View view, URL url) {
        StepUpView stepUpView = new StepUpView(context);
        FormView.a(stepUpView, view, url, this.b, this.d);
        return stepUpView;
    }

    public final void c(final Context context, final View view, final PayResultCallback payResultCallback) {
        PayResultCallback<CardCaptureInfo> payResultCallback2 = new PayResultCallback<CardCaptureInfo>() { // from class: au.com.woolworths.pay.sdk.PayClient.1
            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void A(Retryable retryable) {
                payResultCallback.A(retryable);
            }

            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void k0(Object obj) {
                CardCaptureInfo cardCaptureInfo = (CardCaptureInfo) obj;
                PayResultCallback payResultCallback3 = payResultCallback;
                try {
                    URL url = new URL(cardCaptureInfo.getCardCaptureURL());
                    PayClient payClient = PayClient.this;
                    Context context2 = context;
                    View view2 = view;
                    CardCaptureView cardCaptureView = new CardCaptureView(context2);
                    FormView.a(cardCaptureView, view2, url, payClient.b, payClient.d);
                    payResultCallback3.k0(cardCaptureView);
                } catch (Throwable th) {
                    payResultCallback3.v(new InvalidModelError(th.getLocalizedMessage()));
                }
            }

            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void v(PayError payError) {
                payResultCallback.v(payError);
            }
        };
        InitiateCardCaptureService initiateCardCaptureService = new InitiateCardCaptureService(this.b, this.c, this.e);
        initiateCardCaptureService.e = "VALID_REFERENCE";
        initiateCardCaptureService.a(payResultCallback2);
    }

    public final void d(String str, final DigitalPayForOrderPresenter$linkPayPalAccountWithNonce$1$1 digitalPayForOrderPresenter$linkPayPalAccountWithNonce$1$1) {
        TokenisePayPalService tokenisePayPalService = new TokenisePayPalService(this.b, this.c, this.e);
        tokenisePayPalService.e = str;
        tokenisePayPalService.f = true;
        tokenisePayPalService.a(new PayResultCallback<PayPalInstrument>() { // from class: au.com.woolworths.pay.sdk.PayClient.3
            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void A(Retryable retryable) {
                digitalPayForOrderPresenter$linkPayPalAccountWithNonce$1$1.A(retryable);
            }

            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void k0(Object obj) {
                digitalPayForOrderPresenter$linkPayPalAccountWithNonce$1$1.k0((PayPalInstrument) obj);
            }

            @Override // au.com.woolworths.pay.sdk.interfaces.PayResultCallback
            public final void v(PayError payError) {
                digitalPayForOrderPresenter$linkPayPalAccountWithNonce$1$1.v(payError);
            }
        });
    }
}
