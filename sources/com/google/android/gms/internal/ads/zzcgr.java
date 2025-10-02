package com.google.android.gms.internal.ads;

import androidx.annotation.OptIn;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewStartUpResult;
import com.salesforce.marketingcloud.UrlHandler;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public final class zzcgr {
    private final zzcgj zza;
    private final zzdsm zzb;

    public zzcgr(zzcgj zzcgjVar, zzdsm zzdsmVar) {
        this.zza = zzcgjVar;
        this.zzb = zzdsmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.concurrent.ThreadPoolExecutor] */
    /* JADX WARN: Type inference failed for: r2v4 */
    @OptIn
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzox)).booleanValue()) {
            Executor threadPoolExecutor = zzbzh.zza;
            final ?? r2 = 0;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoA)).booleanValue()) {
                zzcgq zzcgqVar = new zzcgq(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoC)).intValue(), null);
                int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoB)).intValue();
                threadPoolExecutor = new ThreadPoolExecutor(iIntValue, iIntValue, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), zzcgqVar);
                r2 = threadPoolExecutor;
            }
            final long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
            WebViewCompat.WebViewStartUpCallback webViewStartUpCallback = new WebViewCompat.WebViewStartUpCallback() { // from class: com.google.android.gms.internal.ads.zzcgo
                @Override // androidx.webkit.WebViewCompat.WebViewStartUpCallback
                public final /* synthetic */ void onSuccess(WebViewStartUpResult webViewStartUpResult) {
                    this.zza.zzb(jElapsedRealtime, r2, webViewStartUpResult);
                }
            };
            this.zza.zzd(threadPoolExecutor, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoz)).booleanValue(), webViewStartUpCallback);
        }
    }

    public final /* synthetic */ void zzb(long j, ThreadPoolExecutor threadPoolExecutor, WebViewStartUpResult webViewStartUpResult) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoy)).booleanValue()) {
            long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - j;
            zzdsl zzdslVarZza = this.zzb.zza();
            zzdslVarZza.zzc(UrlHandler.ACTION, "webview_startup_l");
            StringBuilder sb = new StringBuilder(String.valueOf(jElapsedRealtime).length());
            sb.append(jElapsedRealtime);
            zzdslVarZza.zzc("webview_startup_l", sb.toString());
            Long totalTimeInUiThreadMillis = webViewStartUpResult.getTotalTimeInUiThreadMillis();
            StringBuilder sb2 = new StringBuilder(String.valueOf(totalTimeInUiThreadMillis).length());
            sb2.append(totalTimeInUiThreadMillis);
            zzdslVarZza.zzc("webview_startup_uil", sb2.toString());
            zzdslVarZza.zzd();
        }
        if (threadPoolExecutor != null) {
            threadPoolExecutor.shutdown();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoF)).booleanValue()) {
            zzbzh.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgn
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzc();
                }
            });
        }
    }

    public final /* synthetic */ void zzc() {
        this.zza.zzf(new zzcgm(this, com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime()));
    }

    public final /* synthetic */ zzdsm zzd() {
        return this.zzb;
    }
}
