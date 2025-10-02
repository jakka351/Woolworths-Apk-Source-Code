package com.google.android.gms.ads.nonagon.signalgeneration;

import YU.a;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.internal.ads.zzauu;
import com.google.android.gms.internal.ads.zzauv;
import com.google.android.gms.internal.ads.zzbci;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbzh;
import com.google.android.gms.internal.ads.zzdsr;
import com.google.android.gms.internal.ads.zzfdg;
import com.google.android.gms.internal.ads.zzfjv;
import com.google.android.gms.internal.ads.zzgpd;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class TaggingLibraryJsInterface {
    private final Context zza;
    private final WebView zzb;
    private final zzauu zzc;
    private final zzfdg zzd;
    private final int zze;
    private final zzdsr zzf;
    private final boolean zzg;
    private final zzgpd zzh = zzbzh.zzf;
    private final zzfjv zzi;
    private final zzo zzj;
    private final zzf zzk;
    private final zzj zzl;

    public TaggingLibraryJsInterface(WebView webView, zzauu zzauuVar, zzdsr zzdsrVar, zzfjv zzfjvVar, zzfdg zzfdgVar, zzo zzoVar, zzf zzfVar, zzj zzjVar) {
        this.zzb = webView;
        Context context = webView.getContext();
        this.zza = context;
        this.zzc = zzauuVar;
        this.zzf = zzdsrVar;
        zzbci.zza(context);
        this.zze = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzks)).intValue();
        this.zzg = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkt)).booleanValue();
        this.zzi = zzfjvVar;
        this.zzd = zzfdgVar;
        this.zzj = zzoVar;
        this.zzk = zzfVar;
        this.zzl = zzjVar;
    }

    @NonNull
    @JavascriptInterface
    @KeepForSdk
    public String getClickSignals(@NonNull String str) {
        try {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            String strZzg = this.zzc.zzb().zzg(this.zza, str, this.zzb);
            if (!this.zzg) {
                return strZzg;
            }
            zzaa.zze(this.zzf, null, "csg", new Pair("clat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - jCurrentTimeMillis)));
            return strZzg;
        } catch (RuntimeException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting click signals. ", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "TaggingLibraryJsInterface.getClickSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    @JavascriptInterface
    @KeepForSdk
    public String getClickSignalsWithTimeout(@NonNull final String str, int i) {
        if (i <= 0) {
            String strN = a.n(new StringBuilder(String.valueOf(i).length() + 51), "Invalid timeout for getting click signals. Timeout=", i);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf(strN);
            return "";
        }
        try {
            return (String) zzbzh.zza.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbr
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.getClickSignals(str);
                }
            }).get(Math.min(i, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting click signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "TaggingLibraryJsInterface.getClickSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @NonNull
    @JavascriptInterface
    @KeepForSdk
    public String getQueryInfo() {
        com.google.android.gms.ads.internal.zzt.zzc();
        String string = UUID.randomUUID().toString();
        final Bundle bundleG = c.g("query_info_type", "requester_type_6");
        final zzbp zzbpVar = new zzbp(this, string);
        if (((Boolean) zzben.zze.zze()).booleanValue()) {
            this.zzj.zzb(this.zzb, zzbpVar);
            return string;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkv)).booleanValue()) {
            this.zzh.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zza(bundleG, zzbpVar);
                }
            });
            return string;
        }
        QueryInfo.generate(this.zza, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundleG).build(), zzbpVar);
        return string;
    }

    @NonNull
    @JavascriptInterface
    @KeepForSdk
    public String getViewSignals() {
        try {
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            String strZzj = this.zzc.zzb().zzj(this.zza, this.zzb, null);
            if (!this.zzg) {
                return strZzj;
            }
            zzaa.zze(this.zzf, null, "vsg", new Pair("vlat", String.valueOf(com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis() - jCurrentTimeMillis)));
            return strZzj;
        } catch (RuntimeException e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting view signals. ", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "TaggingLibraryJsInterface.getViewSignals");
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NonNull
    @JavascriptInterface
    @KeepForSdk
    public String getViewSignalsWithTimeout(int i) {
        if (i <= 0) {
            String strN = a.n(new StringBuilder(String.valueOf(i).length() + 50), "Invalid timeout for getting view signals. Timeout=", i);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzf(strN);
            return "";
        }
        try {
            return (String) zzbzh.zza.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbq
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.getViewSignals();
                }
            }).get(Math.min(i, this.zze), TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            int i3 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Exception getting view signals with timeout. ", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "TaggingLibraryJsInterface.getViewSignalsWithTimeout");
            return e instanceof TimeoutException ? "17" : "";
        }
    }

    @JavascriptInterface
    @KeepForSdk
    public void recordClick(@NonNull final String str) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkx)).booleanValue() || TextUtils.isEmpty(str)) {
            return;
        }
        zzbzh.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzbs
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzb(str);
            }
        });
    }

    @JavascriptInterface
    @KeepForSdk
    public void reportTouchEvent(@NonNull String str) throws JSONException {
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i = jSONObject.getInt("x");
            i2 = jSONObject.getInt("y");
            i3 = jSONObject.getInt("duration_ms");
            f = (float) jSONObject.getDouble("force");
            int i5 = jSONObject.getInt("type");
            if (i5 != 0) {
                i4 = 1;
                if (i5 != 1) {
                    i4 = 2;
                    if (i5 != 2) {
                        i4 = 3;
                        if (i5 != 3) {
                            i4 = -1;
                        }
                    }
                }
            } else {
                i4 = 0;
            }
        } catch (RuntimeException | JSONException e) {
            e = e;
        }
        try {
            this.zzc.zzc(MotionEvent.obtain(0L, i3, i4, i, i2, f, 1.0f, 0, 1.0f, 1.0f, 0, 0));
        } catch (RuntimeException e2) {
            e = e2;
            int i6 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "TaggingLibraryJsInterface.reportTouchEvent");
        } catch (JSONException e3) {
            e = e3;
            int i62 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to parse the touch string. ", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "TaggingLibraryJsInterface.reportTouchEvent");
        }
    }

    public final /* synthetic */ void zza(Bundle bundle, QueryInfoGenerationCallback queryInfoGenerationCallback) {
        com.google.android.gms.ads.internal.util.zzz zzzVarZzf = com.google.android.gms.ads.internal.zzt.zzf();
        Context context = this.zza;
        CookieManager cookieManagerZza = zzzVarZzf.zza(context);
        bundle.putBoolean("accept_3p_cookie", cookieManagerZza != null ? cookieManagerZza.acceptThirdPartyCookies(this.zzb) : false);
        QueryInfo.generate(context, AdFormat.BANNER, new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), queryInfoGenerationCallback);
    }

    public final /* synthetic */ void zzb(String str) {
        zzfdg zzfdgVar;
        Uri uriZzd = Uri.parse(str);
        try {
            uriZzd = (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmN)).booleanValue() || (zzfdgVar = this.zzd) == null) ? this.zzc.zzd(uriZzd, this.zza, this.zzb, null) : zzfdgVar.zza(uriZzd, this.zza, this.zzb, null);
        } catch (zzauv e) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zze("Failed to append the click signal to URL: ", e);
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "TaggingLibraryJsInterface.recordClick");
        }
        this.zzi.zzb(uriZzd.toString(), null, null, null);
    }

    public final /* synthetic */ WebView zzc() {
        return this.zzb;
    }

    public final /* synthetic */ zzgpd zzd() {
        return this.zzh;
    }

    public final /* synthetic */ zzf zze() {
        return this.zzk;
    }

    public final /* synthetic */ zzj zzf() {
        return this.zzl;
    }
}
