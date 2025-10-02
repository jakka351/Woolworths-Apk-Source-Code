package com.google.android.gms.internal.ads;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public class zzcfy extends zzcfx {
    public zzcfy(zzcek zzcekVar, zzbbh zzbbhVar, boolean z, @Nullable zzecy zzecyVar) {
        super(zzcekVar, zzbbhVar, z, zzecyVar);
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return zzaa(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }
}
