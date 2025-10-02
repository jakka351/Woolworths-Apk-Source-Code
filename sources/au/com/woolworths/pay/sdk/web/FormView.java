package au.com.woolworths.pay.sdk.web;

import YU.a;
import android.content.Context;
import android.net.http.SslError;
import android.view.View;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import au.com.woolworths.pay.internal.network.JSONHelper;
import au.com.woolworths.pay.internal.util.Logger;
import au.com.woolworths.pay.sdk.models.config.Configuration;
import au.com.woolworths.pay.sdk.models.errors.BaseError;
import au.com.woolworths.pay.sdk.models.errors.FatalError;
import au.com.woolworths.pay.sdk.models.errors.FormError;
import au.com.woolworths.pay.sdk.models.errors.InvalidJSONError;
import au.com.woolworths.pay.sdk.models.errors.NetworkError;
import au.com.woolworths.pay.sdk.models.errors.NetworkTimeoutError;
import au.com.woolworths.pay.sdk.web.FrameResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class FormView extends WebView {
    public FormViewCallback d;
    public final Context e;
    public Logger f;
    public boolean g;

    /* renamed from: au.com.woolworths.pay.sdk.web.FormView$8, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass8 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9193a;

        static {
            int[] iArr = new int[FrameResponse.EventId.values().length];
            f9193a = iArr;
            try {
                iArr[FrameResponse.EventId.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9193a[FrameResponse.EventId.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9193a[FrameResponse.EventId.VALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9193a[FrameResponse.EventId.INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9193a[FrameResponse.EventId.FOCUS_GAINED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9193a[FrameResponse.EventId.FOCUS_LOST.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9193a[FrameResponse.EventId.RETURN_KEY_PRESSED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public interface FormViewCallback {
        void a(FormFocusState formFocusState);

        void b();

        void c(boolean z, boolean z2);

        void d(BaseError baseError);

        void e(String str, String str2, String str3);

        void f(String str, Boolean bool);
    }

    public FormView(@NonNull Context context) {
        super(context);
        this.d = null;
        this.g = false;
        this.e = context;
        setWebChromeClient(new WebChromeClient() { // from class: au.com.woolworths.pay.sdk.web.FormView.1
            @Override // android.webkit.WebChromeClient
            public final void onProgressChanged(WebView webView, int i) {
                Logger logger = FormView.this.f;
                if (logger != null) {
                    logger.b("WebViewSDK", "onProgressChanged");
                }
            }

            @Override // android.webkit.WebChromeClient
            public final void onReceivedTitle(WebView webView, String str) {
                Logger logger = FormView.this.f;
                if (logger != null) {
                    logger.b("WebViewSDK", "onReceivedTitle :" + str);
                }
            }
        });
        setWebViewClient(new CustomWebViewClient());
        getSettings().setJavaScriptEnabled(true);
        setLayerType(1, null);
        addJavascriptInterface(this, "webView");
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus(130);
    }

    public static void a(FormView formView, View view, URL url, Configuration configuration, Logger logger) {
        FormView formView2;
        formView.f = logger;
        formView.setAllowInvalidSsl(configuration.allowsInvalidSSL());
        formView.setLayoutParams(view.getLayoutParams());
        String externalForm = url.toExternalForm();
        Logger logger2 = formView.f;
        if (logger2 != null) {
            logger2.b("WebView iframe ==> ", externalForm);
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(formView.e.getAssets().open("HostedFrame.html")));
            StringBuilder sb = new StringBuilder();
            for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                sb.append(line + "\n");
            }
            formView2 = formView;
            try {
                formView2.loadDataWithBaseURL(externalForm, sb.toString().replace("(iframe-src-url)", externalForm).replace("(iframe-domain)", new URL(url.getProtocol(), url.getHost(), "").toString()), "text/html", "UTF-8", null);
            } catch (IOException unused) {
                formView2.c(new FatalError("Unable to load HTML from assets folder."));
            }
        } catch (IOException unused2) {
            formView2 = formView;
        }
    }

    public final void b() {
        loadUrl("javascript:clearForm()");
    }

    public final void c(final BaseError baseError) {
        post(new Runnable() { // from class: au.com.woolworths.pay.sdk.web.FormView.4
            @Override // java.lang.Runnable
            public final void run() {
                FormViewCallback formViewCallback = FormView.this.d;
                if (formViewCallback != null) {
                    formViewCallback.d(baseError);
                }
            }
        });
    }

    public final void d(JSONObject jSONObject) {
        loadUrl("javascript:submitForm(" + jSONObject.toString() + ")");
    }

    @JavascriptInterface
    public void iframeCallback(@NonNull String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            FrameResponse.EventId eventIdEventIdForString = FrameResponse.eventIdForString(jSONObject.getString("eventId"));
            FrameResponse frameResponse = (FrameResponse) JSONHelper.c(FrameResponse.classForEventId(eventIdEventIdForString), jSONObject);
            switch (AnonymousClass8.f9193a[eventIdEventIdForString.ordinal()]) {
                case 1:
                    FrameResponseSuccess frameResponseSuccess = (FrameResponseSuccess) frameResponse;
                    final String str2 = frameResponseSuccess.auditId;
                    final String str3 = frameResponseSuccess.paymentInstrumentId;
                    final String str4 = frameResponseSuccess.stepUpToken;
                    post(new Runnable() { // from class: au.com.woolworths.pay.sdk.web.FormView.3
                        @Override // java.lang.Runnable
                        public final void run() {
                            FormView formView = FormView.this;
                            formView.stopLoading();
                            formView.loadData("<html></html>", "text/html", "utf-8");
                            formView.setVisibility(8);
                            FormViewCallback formViewCallback = formView.d;
                            if (formViewCallback != null) {
                                formViewCallback.e(str2, str3, str4);
                            }
                        }
                    });
                    break;
                case 2:
                    FrameResponseError frameResponseError = (FrameResponseError) frameResponse;
                    c(new FormError(frameResponseError.message, frameResponseError.code, frameResponseError.auditId));
                    break;
                case 3:
                case 4:
                    final boolean zEquals = eventIdEventIdForString.equals(FrameResponse.EventId.VALID);
                    final boolean z = jSONObject.has("allFieldsEmpty") ? jSONObject.getBoolean("allFieldsEmpty") : false;
                    post(new Runnable() { // from class: au.com.woolworths.pay.sdk.web.FormView.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            FormViewCallback formViewCallback = FormView.this.d;
                            if (formViewCallback != null) {
                                formViewCallback.c(zEquals, z);
                            }
                        }
                    });
                    break;
                case 5:
                case 6:
                    FrameResponseFocusState frameResponseFocusState = (FrameResponseFocusState) frameResponse;
                    final FormFocusState formFocusState = new FormFocusState();
                    formFocusState.f9191a = Boolean.valueOf(eventIdEventIdForString == FrameResponse.EventId.FOCUS_GAINED);
                    formFocusState.b = Boolean.valueOf(frameResponseFocusState.allFieldsEmpty);
                    formFocusState.c = frameResponseFocusState.cardValid;
                    formFocusState.d = frameResponseFocusState.cvvValid;
                    formFocusState.e = frameResponseFocusState.expiryMonthValid;
                    formFocusState.f = frameResponseFocusState.expiryYearValid;
                    formFocusState.g = frameResponseFocusState.cardAccepted;
                    post(new Runnable() { // from class: au.com.woolworths.pay.sdk.web.FormView.2
                        @Override // java.lang.Runnable
                        public final void run() {
                            FormView.this.d.a(formFocusState);
                        }
                    });
                    break;
                case 7:
                    FrameResponseReturnKeyPressed frameResponseReturnKeyPressed = (FrameResponseReturnKeyPressed) frameResponse;
                    final String str5 = frameResponseReturnKeyPressed.fieldName;
                    final Boolean boolValueOf = Boolean.valueOf(frameResponseReturnKeyPressed.allFieldsValid);
                    post(new Runnable() { // from class: au.com.woolworths.pay.sdk.web.FormView.6
                        @Override // java.lang.Runnable
                        public final void run() {
                            FormViewCallback formViewCallback = FormView.this.d;
                            if (formViewCallback != null) {
                                formViewCallback.f(str5, boolValueOf);
                            }
                        }
                    });
                    break;
            }
        } catch (Throwable th) {
            c(new InvalidJSONError("Unable to unmarshall: " + th.getLocalizedMessage()));
        }
    }

    public void setAllowInvalidSsl(boolean z) {
        this.g = z;
    }

    public void setCallback(@Nullable FormViewCallback formViewCallback) {
        this.d = formViewCallback;
    }

    public class CustomWebViewClient extends WebViewClient {
        public CustomWebViewClient() {
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            final FormView formView = FormView.this;
            Logger logger = formView.f;
            if (logger != null) {
                logger.b("WebViewSDK", "Page finished: " + str);
            }
            formView.post(new Runnable() { // from class: au.com.woolworths.pay.sdk.web.FormView.7
                @Override // java.lang.Runnable
                public final void run() {
                    FormViewCallback formViewCallback = FormView.this.d;
                    if (formViewCallback != null) {
                        formViewCallback.b();
                    }
                }
            });
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            FormView formView = FormView.this;
            Logger logger = formView.f;
            if (logger != null) {
                logger.b("WebViewSDK", "onReceivedError " + webResourceRequest.getUrl().toString() + ": " + webResourceError);
            }
            if (webResourceError.getErrorCode() == -8) {
                formView.c(new NetworkTimeoutError());
            } else {
                formView.c(new NetworkError(webResourceError.toString()));
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (FormView.this.g) {
                sslErrorHandler.proceed();
            } else {
                sslErrorHandler.cancel();
            }
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            FormView formView = FormView.this;
            Logger logger = formView.f;
            if (logger != null) {
                logger.b("WebViewSDK", a.i("onReceivedError ", str2, ": ", str));
            }
            if (i == -8) {
                formView.c(new NetworkTimeoutError());
            } else {
                formView.c(new NetworkError(str));
            }
        }
    }
}
