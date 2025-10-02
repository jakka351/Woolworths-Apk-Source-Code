package au.com.woolworths.base.wallet.digipay.framesview;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.net.http.SslError;
import android.util.AttributeSet;
import android.webkit.JavascriptInterface;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.camera.core.processing.g;
import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.base.wallet.digipay.framesview.CompleteResponse;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.URLConnection;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonKt;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;

@StabilityInferred
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0004\u001b\u001c\u001d\u001eB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0015\u0010\u000eJ\u000f\u0010\u0016\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0017\u0010\u000eJ\u000f\u0010\u0018\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0018\u0010\u000eJ\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u001a\u0010\u0013¨\u0006\u001f"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/FramesWebView;", "Lau/com/woolworths/base/wallet/digipay/framesview/CompleteResponse;", "CR", "Landroid/webkit/WebView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "handleFramesSDKLoaded", "()V", "handleOnRendered", "", "jsonString", "handleOnComplete", "(Ljava/lang/String;)V", "handleOnValidated", "handleOnFocus", "handleOnBlur", "handleOnRender", "handleOnClose", "error", "handleUncaughtError", "FramesWebViewClient", "Callback", "Logger", "Companion", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public abstract class FramesWebView<CR extends CompleteResponse> extends WebView {
    public static final /* synthetic */ int i = 0;
    public Callback d;
    public boolean e;
    public final Json f;
    public boolean g;
    public boolean h;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/FramesWebView$Callback;", "", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Callback {
        void b();

        void c(CompleteResponse completeResponse);

        void d(boolean z);

        void e(Error error);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/FramesWebView$Companion;", "", "", "ASSET_DIRECTORY_PATH_LENGTH", "I", "STATUS_CODE_INVALID_AUTH_TOKEN", "STATUS_CODE_CORS_ERROR", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/FramesWebView$Logger;", "", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Logger {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FramesWebView(@NotNull Context context) {
        this(context, null, 6, 0);
        Intrinsics.h(context, "context");
    }

    public abstract void a();

    public abstract CompleteResponse b(String str, Json json);

    public void c() {
    }

    public boolean d(CompleteResponse response) {
        Intrinsics.h(response, "response");
        return false;
    }

    public void e() {
    }

    public void f() {
    }

    public void g() {
    }

    public final void h(Error error) {
        Bark.Companion companion = Bark.f8483a;
        Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.e), error.f4666a + ": " + error.b, null);
        this.h = true;
        Callback callback = this.d;
        if (callback != null) {
            callback.e(error);
        }
    }

    @JavascriptInterface
    public final void handleFramesSDKLoaded() {
        post(new g(12, this, TestFramesLoadedCommand.b, new c(this, 1)));
    }

    @JavascriptInterface
    public final void handleOnBlur() {
        post(new b(this, 0));
    }

    @JavascriptInterface
    public final void handleOnClose() {
        post(new d(this, 2));
    }

    @JavascriptInterface
    public final void handleOnComplete(@NotNull String jsonString) {
        Intrinsics.h(jsonString, "jsonString");
        Bark.Companion companion = Bark.f8483a;
        Bark.Barker.i(new ReportOwner(ReportOwner.Squad.e), "Frames SDK: handleOnComplete", null, 12);
        if (this.h) {
            return;
        }
        post(new androidx.camera.core.impl.utils.futures.e(20, this, b(jsonString, this.f)));
    }

    @JavascriptInterface
    public final void handleOnFocus() {
        post(new b(this, 0));
    }

    @JavascriptInterface
    public final void handleOnRender() {
        post(new d(this, 1));
    }

    @JavascriptInterface
    public final void handleOnRendered() {
        if (this.h) {
            return;
        }
        post(new d(this, 3));
    }

    @JavascriptInterface
    public final void handleOnValidated(@NotNull String jsonString) throws JSONException {
        String strQ;
        Intrinsics.h(jsonString, "jsonString");
        JSONArray jSONArray = new JSONArray(jsonString);
        if (jSONArray.length() > 0) {
            String strJoin = jSONArray.join("\n");
            Intrinsics.g(strJoin, "join(...)");
            strQ = StringsKt.Q(strJoin, "\"", "", false);
        } else {
            strQ = null;
        }
        if (strQ != null) {
            post(new e(this, strQ, 1));
        }
        post(new e(this, strQ, 2));
    }

    @JavascriptInterface
    public final void handleUncaughtError(@NotNull String error) {
        String strO;
        Intrinsics.h(error, "error");
        try {
            Json json = this.f;
            json.getClass();
            strO = ((FramesError) json.b(FramesError.INSTANCE.serializer(), error)).f4671a;
        } catch (SerializationException unused) {
            strO = StringsKt.O(error, "\"", "\"");
        } catch (IllegalArgumentException unused2) {
            strO = StringsKt.O(error, "\"", "\"");
        }
        post(new e(strO, this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FramesWebView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        Intrinsics.h(context, "context");
    }

    public /* synthetic */ FramesWebView(Context context, AttributeSet attributeSet, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FramesWebView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.h(context, "context");
        this.f = JsonKt.a(new au.com.woolworths.android.onesite.repository.b(7));
        WebView.setWebContentsDebuggingEnabled(true);
        setWebChromeClient(new FramesWebView$initialiseWebView$1(this));
        setWebViewClient(new FramesWebViewClient(this));
        getSettings().setJavaScriptEnabled(true);
        addJavascriptInterface(this, "android");
        setLayerType(1, null);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus(130);
    }

    @StabilityInferred
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/base/wallet/digipay/framesview/FramesWebView$FramesWebViewClient;", "Landroid/webkit/WebViewClient;", "base-wallet_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class FramesWebViewClient extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        public final FramesWebView f4676a;

        public FramesWebViewClient(FramesWebView framesWebView) {
            this.f4676a = framesWebView;
        }

        @Override // android.webkit.WebViewClient
        public final void onPageFinished(WebView view, String url) {
            Intrinsics.h(view, "view");
            Intrinsics.h(url, "url");
            super.onPageFinished(view, url);
            int i = FramesWebView.i;
            FramesWebView framesWebView = this.f4676a;
            framesWebView.getClass();
            Bark.f8483a.a("Frames SDK: page loaded");
            JavaScriptCommand.a(InitFramesLoadCommand.b, framesWebView);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView view, WebResourceRequest request, WebResourceError error) {
            Intrinsics.h(view, "view");
            Intrinsics.h(request, "request");
            Intrinsics.h(error, "error");
            super.onReceivedError(view, request, error);
            CharSequence description = error.getDescription();
            error.getErrorCode();
            Objects.toString(description);
            int i = FramesWebView.i;
            FramesWebView framesWebView = this.f4676a;
            framesWebView.getClass();
            if (error.getErrorCode() != -6 && error.getErrorCode() != -2) {
                framesWebView.e();
                if (error.getErrorCode() == -8) {
                    framesWebView.h(new NetworkTimeoutError());
                    return;
                } else {
                    framesWebView.h(new NetworkError(error.toString()));
                    return;
                }
            }
            Bark.Companion companion = Bark.f8483a;
            Bark.Barker.i(new ReportOwner(ReportOwner.Squad.e), "Frames SDK: network error", "error -> " + ((Object) error.getDescription()), 8);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
            String strValueOf;
            String reasonPhrase = webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null;
            if (reasonPhrase != null && !StringsKt.D(reasonPhrase)) {
                strValueOf = webResourceResponse != null ? webResourceResponse.getReasonPhrase() : null;
            } else if (webResourceResponse == null || webResourceResponse.getStatusCode() != 401) {
                strValueOf = String.valueOf(webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null);
            } else {
                strValueOf = "Authentication token is invalid";
            }
            int i = FramesWebView.i;
            FramesWebView framesWebView = this.f4676a;
            framesWebView.getClass();
            Integer numValueOf = webResourceResponse != null ? Integer.valueOf(webResourceResponse.getStatusCode()) : null;
            if (numValueOf == null || numValueOf.intValue() != 526 || !framesWebView.g) {
                framesWebView.e();
                framesWebView.h(new NetworkError(strValueOf));
                return;
            }
            Bark.Companion companion = Bark.f8483a;
            Bark.Barker.i(new ReportOwner(ReportOwner.Squad.e), "Frames SDK: CORS error", "error -> " + strValueOf, 8);
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedSslError(WebView view, SslErrorHandler handler, SslError error) {
            Intrinsics.h(view, "view");
            Intrinsics.h(handler, "handler");
            Intrinsics.h(error, "error");
            error.toString();
            int i = FramesWebView.i;
            FramesWebView framesWebView = this.f4676a;
            framesWebView.getClass();
            if (framesWebView.e) {
                handler.proceed();
            } else {
                handler.cancel();
            }
        }

        @Override // android.webkit.WebViewClient
        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest request) {
            Intrinsics.h(request, "request");
            Uri url = request.getUrl();
            Intrinsics.g(url, "getUrl(...)");
            if (StringsKt.y(url.getHost(), "assets", false)) {
                try {
                    Uri url2 = request.getUrl();
                    if (Intrinsics.c(url2 != null ? url2.getLastPathSegment() : null, "favicon.ico")) {
                        Charset charsetDefaultCharset = Charset.defaultCharset();
                        Intrinsics.g(charsetDefaultCharset, "defaultCharset(...)");
                        byte[] bytes = "".getBytes(charsetDefaultCharset);
                        Intrinsics.g(bytes, "getBytes(...)");
                        return new WebResourceResponse(TextBundle.TEXT_ENTRY, "UTF-8", new ByteArrayInputStream(bytes));
                    }
                    String strGuessContentTypeFromName = URLConnection.guessContentTypeFromName(url.getPath());
                    AssetManager assets = this.f4676a.getContext().getAssets();
                    String string = url.toString();
                    Intrinsics.g(string, "toString(...)");
                    String strSubstring = string.substring(15);
                    Intrinsics.g(strSubstring, "substring(...)");
                    return new WebResourceResponse(strGuessContentTypeFromName, "utf-8", assets.open(strSubstring));
                } catch (IOException e) {
                    if (webView != null) {
                        webView.post(new androidx.camera.core.impl.utils.futures.e(21, this, e));
                    }
                }
            }
            return null;
        }

        @Override // android.webkit.WebViewClient
        public final void onReceivedError(WebView view, int i, String description, String failingUrl) {
            Intrinsics.h(view, "view");
            Intrinsics.h(description, "description");
            Intrinsics.h(failingUrl, "failingUrl");
            super.onReceivedError(view, i, description, failingUrl);
            int i2 = FramesWebView.i;
            FramesWebView framesWebView = this.f4676a;
            framesWebView.getClass();
            framesWebView.e();
            if (i == -8) {
                framesWebView.h(new NetworkTimeoutError());
            } else {
                framesWebView.h(new NetworkError(description));
            }
        }
    }
}
