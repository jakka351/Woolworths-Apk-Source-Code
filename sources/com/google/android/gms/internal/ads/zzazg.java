package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzazg implements Runnable {
    final ValueCallback zza;
    final /* synthetic */ zzayy zzb;
    final /* synthetic */ WebView zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zzazi zze;

    public zzazg(zzazi zzaziVar, final zzayy zzayyVar, final WebView webView, final boolean z) {
        this.zzb = zzayyVar;
        this.zzc = webView;
        this.zzd = z;
        Objects.requireNonNull(zzaziVar);
        this.zze = zzaziVar;
        this.zza = new ValueCallback() { // from class: com.google.android.gms.internal.ads.zzazf
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Object obj) {
                this.zza.zze.zzd(zzayyVar, webView, (String) obj, z);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        WebView webView = this.zzc;
        if (webView.getSettings().getJavaScriptEnabled()) {
            try {
                webView.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.zza);
            } catch (Throwable unused) {
                this.zza.onReceiveValue("");
            }
        }
    }
}
