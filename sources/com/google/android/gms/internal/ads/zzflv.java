package com.google.android.gms.internal.ads;

import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import androidx.webkit.internal.WebMessageListenerAdapter;
import androidx.webkit.internal.WebViewFeatureInternal;
import androidx.webkit.internal.WebViewProviderAdapter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Timer;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

/* loaded from: classes5.dex */
public final class zzflv {
    private final zzflx zza;
    private final WebView zzb;
    private zzfny zzc;
    private final HashMap zzd;
    private final zzfml zze;

    private zzflv(zzflx zzflxVar, WebView webView, boolean z) {
        HashMap map = new HashMap();
        this.zzd = map;
        this.zze = new zzfml();
        zzfnh.zza();
        this.zza = zzflxVar;
        this.zzb = webView;
        if (zzc() != webView) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((zzflj) it.next()).zzb(webView);
            }
            this.zzc = new zzfny(webView);
        }
        if (!WebViewFeature.a("WEB_MESSAGE_LISTENER")) {
            throw new UnsupportedOperationException("The JavaScriptSessionService cannot be supported in this WebView version.");
        }
        zze();
        zzflt zzfltVar = new zzflt(this);
        WebView webView2 = this.zzb;
        HashSet hashSet = new HashSet(Arrays.asList("*"));
        boolean z2 = WebViewCompat.f3842a;
        if (!WebViewFeatureInternal.h.d()) {
            throw WebViewFeatureInternal.a();
        }
        WebViewProviderAdapter webViewProviderAdapterA = WebViewCompat.a(webView2);
        webViewProviderAdapterA.f3861a.addWebMessageListener("omidJsSessionService", (String[]) hashSet.toArray(new String[0]), BoundaryInterfaceReflectionUtil.b(new WebMessageListenerAdapter(zzfltVar)));
    }

    public static zzflv zza(zzflx zzflxVar, WebView webView, boolean z) {
        return new zzflv(zzflxVar, webView, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zze() {
        WebView webView = this.zzb;
        boolean z = WebViewCompat.f3842a;
        if (!WebViewFeatureInternal.h.d()) {
            throw WebViewFeatureInternal.a();
        }
        WebViewCompat.a(webView).f3861a.removeWebMessageListener("omidJsSessionService");
    }

    public final void zzb(zzflu zzfluVar) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzflj) it.next()).zzc();
        }
        Timer timer = new Timer();
        timer.schedule(new zzfls(this, zzfluVar, timer), 1000L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final View zzc() {
        zzfny zzfnyVar = this.zzc;
        if (zzfnyVar == null) {
            return null;
        }
        return (View) zzfnyVar.get();
    }

    public final void zzd(View view, zzflq zzflqVar, @Nullable String str) {
        Iterator it = this.zzd.values().iterator();
        while (it.hasNext()) {
            ((zzflj) it.next()).zzd(view, zzflqVar, "Ad overlay");
        }
        this.zze.zzb(view, zzflqVar, "Ad overlay");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zzf(String str) {
        zzflo zzfloVar = zzflo.DEFINED_BY_JAVASCRIPT;
        zzflr zzflrVar = zzflr.DEFINED_BY_JAVASCRIPT;
        zzflw zzflwVar = zzflw.JAVASCRIPT;
        zzfln zzflnVar = new zzfln(zzflk.zza(zzfloVar, zzflrVar, zzflwVar, zzflwVar, false), zzfll.zza(this.zza, this.zzb, null, null), str);
        this.zzd.put(str, zzflnVar);
        zzflnVar.zzb(zzc());
        for (zzfmk zzfmkVar : this.zze.zza()) {
            zzflnVar.zzd((View) zzfmkVar.zza().get(), zzfmkVar.zzc(), zzfmkVar.zzd());
        }
        zzflnVar.zza();
    }

    public final /* synthetic */ void zzg(String str) {
        HashMap map = this.zzd;
        zzflj zzfljVar = (zzflj) map.get(str);
        if (zzfljVar != null) {
            zzfljVar.zzc();
            map.remove(str);
        }
    }
}
