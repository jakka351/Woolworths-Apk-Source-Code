package com.adobe.marketing.mobile.services.ui.message;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.adobe.marketing.mobile.services.Log;
import java.net.MalformedURLException;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageWebViewClient;", "Landroid/webkit/WebViewClient;", "Companion", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes4.dex */
public final class InAppMessageWebViewClient extends WebViewClient {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/adobe/marketing/mobile/services/ui/message/InAppMessageWebViewClient$Companion;", "", "", "LOG_TAG", "Ljava/lang/String;", "core_phoneRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest request) {
        Intrinsics.h(request, "request");
        String string = request.getUrl().toString();
        if (string != null && !StringsKt.D(string) && !StringsKt.D(string)) {
            try {
                new URL(string);
                throw null;
            } catch (MalformedURLException unused) {
            }
        }
        Log.c();
        return super.shouldInterceptRequest(webView, request);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest != null ? webResourceRequest.getUrl() : null;
        String string = url != null ? url.toString() : null;
        if (string != null && !StringsKt.D(string)) {
            throw null;
        }
        Log.c();
        return true;
    }
}
