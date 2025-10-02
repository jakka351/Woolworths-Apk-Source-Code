package com.google.android.gms.internal.ads;

import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzfmz extends WebViewClient {
    final /* synthetic */ zzfnb zza;

    public zzfmz(zzfnb zzfnbVar) {
        Objects.requireNonNull(zzfnbVar);
        this.zza = zzfnbVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        String string = renderProcessGoneDetail.toString();
        String strValueOf = String.valueOf(webView);
        Log.w("NativeBridge", androidx.constraintlayout.core.state.a.l(new StringBuilder(String.valueOf(string).length() + 36 + strValueOf.length()), "WebView renderer gone: ", string, "for WebView: ", strValueOf));
        zzfnb zzfnbVar = this.zza;
        if (zzfnbVar.zzd() == webView) {
            Log.w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            zzfnbVar.zzc(null);
        }
        webView.destroy();
        return true;
    }
}
