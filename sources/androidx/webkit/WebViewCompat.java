package androidx.webkit;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;
import androidx.annotation.RequiresOptIn;
import androidx.camera.core.processing.g;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewGlueCommunicator;
import androidx.webkit.internal.WebViewProviderAdapter;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class WebViewCompat {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f3842a;
    public static final WeakHashMap b;

    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @RequiresOptIn
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalAsyncStartUp {
    }

    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @RequiresOptIn
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalCacheProvider {
    }

    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @RequiresOptIn
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalSaveState {
    }

    @Target({ElementType.METHOD, ElementType.TYPE, ElementType.FIELD})
    @RequiresOptIn
    @Retention(RetentionPolicy.CLASS)
    public @interface ExperimentalUrlPrerender {
    }

    public static class NullReturningWebViewStartUpResult implements WebViewStartUpResult {
        @Override // androidx.webkit.WebViewStartUpResult
        public final Long getTotalTimeInUiThreadMillis() {
            return null;
        }
    }

    public interface VisualStateCallback {
    }

    public interface WebMessageListener {
        void onPostMessage(WebView webView, WebMessageCompat webMessageCompat, Uri uri, boolean z, JavaScriptReplyProxy javaScriptReplyProxy);
    }

    @ExperimentalAsyncStartUp
    public interface WebViewStartUpCallback {
        void onSuccess(WebViewStartUpResult webViewStartUpResult);
    }

    static {
        Uri.parse("*");
        Uri.parse("");
        f3842a = true;
        b = new WeakHashMap();
    }

    public static WebViewProviderAdapter a(WebView webView) {
        if (!WebViewFeatureInternal.n.d() || !f3842a) {
            return new WebViewProviderAdapter(WebViewGlueCommunicator.b().createWebView(webView));
        }
        WeakHashMap weakHashMap = b;
        WebViewProviderAdapter webViewProviderAdapter = (WebViewProviderAdapter) weakHashMap.get(webView);
        if (webViewProviderAdapter != null) {
            return webViewProviderAdapter;
        }
        WebViewProviderAdapter webViewProviderAdapter2 = new WebViewProviderAdapter(WebViewGlueCommunicator.b().createWebView(webView));
        weakHashMap.put(webView, webViewProviderAdapter2);
        return webViewProviderAdapter2;
    }

    public static String b() {
        if (WebViewFeatureInternal.j.d()) {
            return WebViewGlueCommunicator.b().getStatics().getVariationsHeader();
        }
        throw WebViewFeatureInternal.a();
    }

    public static void c(WebView webView) {
        if (!WebViewFeatureInternal.k.d()) {
            throw WebViewFeatureInternal.a();
        }
        a(webView).f3861a.setProfile("GMA_WEBVIEW_PROFILE");
    }

    public static void d(Context context, WebViewStartUpConfig webViewStartUpConfig, WebViewStartUpCallback webViewStartUpCallback) {
        webViewStartUpConfig.f3843a.execute(new g(6, webViewStartUpConfig, webViewStartUpCallback, context));
    }
}
