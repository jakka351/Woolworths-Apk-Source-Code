package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.Base64;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.UiThread;
import androidx.webkit.Profile;
import androidx.webkit.ProfileStore;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import androidx.webkit.WebViewStartUpConfig;
import com.salesforce.marketingcloud.UrlHandler;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class zzcgj {
    private final Context zzd;

    @Nullable
    private String zza = null;

    @Nullable
    private zzhlz zzb = null;
    private final AtomicBoolean zzc = new AtomicBoolean(false);

    @Nullable
    private Profile zze = null;

    public zzcgj(Context context) {
        this.zzd = context;
    }

    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzjE)).booleanValue() && !this.zzc.getAndSet(true) && WebViewFeature.a("GET_VARIATIONS_HEADER")) {
            try {
                String strB = WebViewCompat.b();
                if (strB.isEmpty()) {
                    return;
                }
                this.zza = strB;
                this.zzb = zzhlz.zzc(Base64.decode(strB, 0), zzhhr.zzb());
            } catch (zzhiw | IllegalArgumentException e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "ChromeVariations");
            }
        }
    }

    @Nullable
    public final String zzb() {
        return this.zza;
    }

    @Nullable
    public final zzhlz zzc() {
        return this.zzb;
    }

    @OptIn
    public final void zzd(Executor executor, boolean z, WebViewCompat.WebViewStartUpCallback webViewStartUpCallback) {
        WebViewStartUpConfig.Builder builder = new WebViewStartUpConfig.Builder(executor);
        builder.b(z);
        WebViewCompat.d(this.zzd, builder.a(), webViewStartUpCallback);
    }

    public final void zze(WebView webView) {
        if (this.zze != null) {
            try {
                WebViewCompat.c(webView);
                com.google.android.gms.ads.internal.util.zze.zza("WebViewCompat Profile is defined");
            } catch (IllegalStateException e) {
                String strConcat = "WebViewCompat error: ".concat(e.toString());
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi(strConcat);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoE)).booleanValue()) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "WebViewCompat.setProfile");
                }
            }
        }
    }

    @RequiresApi
    @UiThread
    public final void zzf(zzcgm zzcgmVar) {
        ProfileStore profileStore;
        if (!WebViewFeature.a("MULTI_PROFILE")) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("WebViewFeature.MULTI_PROFILE is not supported");
            return;
        }
        try {
            profileStore = (ProfileStore) zzfrt.zza("androidx.webkit.ProfileStore", "getInstance", new zzfrs[0]);
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e) {
            String strValueOf = String.valueOf(e.getMessage());
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzd("Unable to get ProfileStore instance: ".concat(strValueOf));
            try {
                profileStore = (ProfileStore) zzfrt.zza("androidx.webkit.ProfileStore$-CC", "getInstance", new zzfrs[0]);
            } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | IllegalStateException | NoSuchMethodException | InvocationTargetException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Unable to get ProfileStore instance: ".concat(String.valueOf(e2.getMessage())));
                profileStore = null;
            }
        }
        if (profileStore != null) {
            this.zze = profileStore.getOrCreateProfile("GMA_WEBVIEW_PROFILE");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoD)).booleanValue()) {
                long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - zzcgmVar.zza;
                zzdsl zzdslVarZza = zzcgmVar.zzb.zzd().zza();
                zzdslVarZza.zzc(UrlHandler.ACTION, "webview_p_l");
                zzdslVarZza.zzc("webview_p_l", Long.toString(jElapsedRealtime));
                zzdslVarZza.zzd();
                return;
            }
            return;
        }
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("WebViewCompat failure: No instance");
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzoD)).booleanValue()) {
            zzdsl zzdslVarZza2 = zzcgmVar.zzb.zzd().zza();
            zzdslVarZza2.zzc(UrlHandler.ACTION, "webview_p_f");
            zzdslVarZza2.zzc("webview_p_f", "No instance");
            zzdslVarZza2.zzd();
        }
    }
}
