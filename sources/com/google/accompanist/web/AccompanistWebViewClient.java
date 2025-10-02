package com.google.accompanist.web;

import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.compose.runtime.SnapshotMutableStateImpl;
import androidx.compose.runtime.internal.StabilityInferred;
import com.google.accompanist.web.LoadingState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@StabilityInferred
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/accompanist/web/AccompanistWebViewClient;", "Landroid/webkit/WebViewClient;", "web_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public class AccompanistWebViewClient extends WebViewClient {
    public static final /* synthetic */ int c = 0;

    /* renamed from: a, reason: collision with root package name */
    public WebViewState f14373a;
    public WebViewNavigator b;

    public final WebViewState a() {
        WebViewState webViewState = this.f14373a;
        if (webViewState != null) {
            return webViewState;
        }
        Intrinsics.p("state");
        throw null;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView view, String str, boolean z) {
        Intrinsics.h(view, "view");
        super.doUpdateVisitedHistory(view, str, z);
        WebViewNavigator webViewNavigator = this.b;
        if (webViewNavigator == null) {
            Intrinsics.p("navigator");
            throw null;
        }
        boolean zCanGoBack = view.canGoBack();
        ((SnapshotMutableStateImpl) webViewNavigator.c).setValue(Boolean.valueOf(zCanGoBack));
        WebViewNavigator webViewNavigator2 = this.b;
        if (webViewNavigator2 == null) {
            Intrinsics.p("navigator");
            throw null;
        }
        boolean zCanGoForward = view.canGoForward();
        ((SnapshotMutableStateImpl) webViewNavigator2.d).setValue(Boolean.valueOf(zCanGoForward));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView view, String str) {
        Intrinsics.h(view, "view");
        super.onPageFinished(view, str);
        ((SnapshotMutableStateImpl) a().c).setValue(LoadingState.Finished.f14374a);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView view, String str, Bitmap bitmap) {
        Intrinsics.h(view, "view");
        super.onPageStarted(view, str, bitmap);
        WebViewState webViewStateA = a();
        ((SnapshotMutableStateImpl) webViewStateA.c).setValue(new LoadingState.Loading(BitmapDescriptorFactory.HUE_RED));
        a().f.clear();
        ((SnapshotMutableStateImpl) a().d).setValue(null);
        ((SnapshotMutableStateImpl) a().e).setValue(null);
        ((SnapshotMutableStateImpl) a().f14382a).setValue(str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView view, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        Intrinsics.h(view, "view");
        super.onReceivedError(view, webResourceRequest, webResourceError);
        if (webResourceError != null) {
            a().f.add(new WebViewError(webResourceRequest, webResourceError));
        }
    }
}
