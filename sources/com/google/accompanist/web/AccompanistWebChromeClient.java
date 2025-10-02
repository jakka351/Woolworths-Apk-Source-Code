package com.google.accompanist.web;

import android.graphics.Bitmap;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.accompanist.web.LoadingState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/accompanist/web/AccompanistWebChromeClient;", "Landroid/webkit/WebChromeClient;", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public class AccompanistWebChromeClient extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public WebViewState f14372a;

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView view, int i) {
        Intrinsics.h(view, "view");
        super.onProgressChanged(view, i);
        WebViewState webViewState = this.f14372a;
        if (webViewState == null) {
            Intrinsics.p("state");
            throw null;
        }
        if (((LoadingState) ((SnapshotMutableStateImpl) webViewState.c).getD()) instanceof LoadingState.Finished) {
            return;
        }
        WebViewState webViewState2 = this.f14372a;
        if (webViewState2 == null) {
            Intrinsics.p("state");
            throw null;
        }
        ((SnapshotMutableStateImpl) webViewState2.c).setValue(new LoadingState.Loading(i / 100.0f));
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedIcon(WebView view, Bitmap bitmap) {
        Intrinsics.h(view, "view");
        super.onReceivedIcon(view, bitmap);
        WebViewState webViewState = this.f14372a;
        if (webViewState != null) {
            ((SnapshotMutableStateImpl) webViewState.e).setValue(bitmap);
        } else {
            Intrinsics.p("state");
            throw null;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView view, String str) {
        Intrinsics.h(view, "view");
        super.onReceivedTitle(view, str);
        WebViewState webViewState = this.f14372a;
        if (webViewState != null) {
            ((SnapshotMutableStateImpl) webViewState.d).setValue(str);
        } else {
            Intrinsics.p("state");
            throw null;
        }
    }
}
