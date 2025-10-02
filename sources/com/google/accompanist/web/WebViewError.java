package com.google.accompanist.web;

import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import androidx.compose.runtime.Immutable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Immutable
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/accompanist/web/WebViewError;", "", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class WebViewError {

    /* renamed from: a, reason: collision with root package name */
    public final WebResourceRequest f14379a;
    public final WebResourceError b;

    public WebViewError(WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.f14379a = webResourceRequest;
        this.b = webResourceError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WebViewError)) {
            return false;
        }
        WebViewError webViewError = (WebViewError) obj;
        return Intrinsics.c(this.f14379a, webViewError.f14379a) && Intrinsics.c(this.b, webViewError.b);
    }

    public final int hashCode() {
        WebResourceRequest webResourceRequest = this.f14379a;
        return this.b.hashCode() + ((webResourceRequest == null ? 0 : webResourceRequest.hashCode()) * 31);
    }

    public final String toString() {
        return "WebViewError(request=" + this.f14379a + ", error=" + this.b + ')';
    }
}
