package com.medallia.digital.mobilesdk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.medallia.digital.mobilesdk.Broadcasts;
import java.util.ArrayList;

/* loaded from: classes6.dex */
class y4 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    private final j2 f16782a;
    private final boolean b;
    private final ArrayList<String> c;

    public y4(j2 j2Var, boolean z, ArrayList<String> arrayList) {
        this.f16782a = j2Var;
        this.b = z;
        this.c = arrayList;
    }

    private WebResourceResponse a(String str) {
        a4.b(YU.a.A("Url was blocked from WebView = ", str));
        return new WebResourceResponse("text/plain", "UTF-8", null);
    }

    private void b(String str) {
        Broadcasts.d.a(Broadcasts.d.a.formBlockedUrl, this.f16782a.getFormId(), this.f16782a.getFormType(), str);
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        a4.b("Form showed onPageFinished");
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        return (webResourceRequest == null || webResourceRequest.getUrl() == null || !q2.a(webResourceRequest.getUrl().toString(), this.b, this.c, this.f16782a.getFormId(), this.f16782a.getFormType())) ? super.shouldInterceptRequest(webView, webResourceRequest) : a(webResourceRequest.getUrl().toString());
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
        if (q2.a(webResourceRequest.getUrl().toString(), this.b, this.c, this.f16782a.getFormId(), this.f16782a.getFormType())) {
            b(webResourceRequest.getUrl().toString());
            return true;
        }
        a(webView.getContext(), webResourceRequest.getUrl().toString());
        return true;
    }

    private void a(Context context, String str) {
        if (str != null) {
            try {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(str));
                intent.setFlags(268435456);
                intent.addCategory("android.intent.category.BROWSABLE");
                context.startActivity(intent);
            } catch (Exception e) {
                a4.c(e.getMessage());
            }
        }
    }
}
