package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.salesforce.marketingcloud.UrlHandler;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzbjy implements zzbjl {

    @Nullable
    private final com.google.android.gms.ads.internal.zzb zza;

    @Nullable
    private final zzdsm zzb;

    @Nullable
    private final zzbrv zzd;

    @Nullable
    private final zzecn zze;

    @Nullable
    private final zzcmi zzf;

    @Nullable
    private final zzcur zzg;

    @Nullable
    private com.google.android.gms.ads.internal.util.client.zzu zzc = null;
    private com.google.android.gms.ads.internal.overlay.zzz zzh = null;
    private final zzgpd zzi = zzbzh.zzg;

    public zzbjy(com.google.android.gms.ads.internal.zzb zzbVar, zzbrv zzbrvVar, zzecn zzecnVar, zzdsm zzdsmVar, zzcmi zzcmiVar, zzcur zzcurVar) {
        this.zza = zzbVar;
        this.zzd = zzbrvVar;
        this.zze = zzecnVar;
        this.zzb = zzdsmVar;
        this.zzf = zzcmiVar;
        this.zzg = zzcurVar;
    }

    public static boolean zzb(Map map) {
        return "1".equals(map.get("custom_close"));
    }

    public static int zzc(Map map) {
        String str = (String) map.get("o");
        if (str == null) {
            return -1;
        }
        if ("p".equalsIgnoreCase(str)) {
            return 7;
        }
        if ("l".equalsIgnoreCase(str)) {
            return 6;
        }
        return "c".equalsIgnoreCase(str) ? 14 : -1;
    }

    @VisibleForTesting
    public static Uri zzd(Context context, zzauu zzauuVar, Uri uri, View view, @Nullable Activity activity, @Nullable zzfdg zzfdgVar) {
        if (zzauuVar != null) {
            try {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzmN)).booleanValue() || zzfdgVar == null) {
                    if (zzauuVar.zze(uri)) {
                        return zzauuVar.zzd(uri, context, view, activity);
                    }
                } else if (zzauuVar.zze(uri)) {
                    return zzfdgVar.zza(uri, context, view, activity);
                }
            } catch (zzauv unused) {
            } catch (Exception e) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "OpenGmsgHandler.maybeAddClickSignalsToUri");
            }
        }
        return uri;
    }

    @VisibleForTesting
    public static Uri zze(Uri uri) {
        try {
            if (uri.getQueryParameter("aclk_ms") == null) {
                return uri;
            }
            return uri.buildUpon().appendQueryParameter("aclk_upms", String.valueOf(SystemClock.uptimeMillis())).build();
        } catch (UnsupportedOperationException e) {
            String strValueOf = String.valueOf(uri.toString());
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Error adding click uptime parameter to url: ".concat(strValueOf), e);
            return uri;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02f5  */
    /* renamed from: zzh, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzf(java.lang.String r26, com.google.android.gms.ads.internal.client.zza r27, java.util.Map r28, java.lang.String r29) throws java.net.URISyntaxException {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbjy.zzf(java.lang.String, com.google.android.gms.ads.internal.client.zza, java.util.Map, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x006e, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbci.zzjn)).booleanValue() != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00de, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT < 33 ? ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbci.zzji)).booleanValue() : ((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(com.google.android.gms.internal.ads.zzbci.zzjh)).booleanValue()) != false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean zzi(com.google.android.gms.ads.internal.client.zza r10, android.content.Context r11, java.lang.String r12, java.lang.String r13) throws java.lang.IllegalAccessException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 356
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbjy.zzi(com.google.android.gms.ads.internal.client.zza, android.content.Context, java.lang.String, java.lang.String):boolean");
    }

    private final void zzj(Context context, String str, String str2) {
        zzecn zzecnVar = this.zze;
        zzecnVar.zzd(str);
        zzdsm zzdsmVar = this.zzb;
        if (zzdsmVar != null) {
            zzecy.zzk(context, zzdsmVar, zzecnVar, str, "dialog_not_shown", zzgkc.zzb("dialog_not_shown_reason", str2));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x014b, code lost:
    
        r15 = r18;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzk(com.google.android.gms.ads.internal.client.zza r21, java.util.Map r22, boolean r23, java.lang.String r24, boolean r25, boolean r26) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbjy.zzk(com.google.android.gms.ads.internal.client.zza, java.util.Map, boolean, java.lang.String, boolean, boolean):void");
    }

    private final void zzl(boolean z) {
        zzbrv zzbrvVar = this.zzd;
        if (zzbrvVar != null) {
            zzbrvVar.zzb(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzg(int i) {
        zzdsm zzdsmVar;
        String str;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfc)).booleanValue() || (zzdsmVar = this.zzb) == null) {
            return;
        }
        zzdsl zzdslVarZza = zzdsmVar.zza();
        zzdslVarZza.zzc(UrlHandler.ACTION, "cct_action");
        switch (i) {
            case 2:
                str = "CONTEXT_NOT_AN_ACTIVITY";
                break;
            case 3:
                str = "CONTEXT_NULL";
                break;
            case 4:
                str = "CCT_NOT_SUPPORTED";
                break;
            case 5:
                str = "CCT_READY_TO_OPEN";
                break;
            case 6:
                str = "ACTIVITY_NOT_FOUND";
                break;
            case 7:
                str = "EMPTY_URL";
                break;
            case 8:
                str = "UNKNOWN";
                break;
            case 9:
                str = "WRONG_EXP_SETUP";
                break;
            default:
                str = "OPT_OUT";
                break;
        }
        zzdslVarZza.zzc("cct_open_status", str);
        zzdslVarZza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzbjl
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        zzcmi zzcmiVar;
        com.google.android.gms.ads.internal.client.zza zzaVar = (com.google.android.gms.ads.internal.client.zza) obj;
        String str = (String) map.get("u");
        Map map2 = new HashMap();
        zzcek zzcekVar = (zzcek) zzaVar;
        if (zzcekVar.zzC() != null) {
            map2 = zzcekVar.zzC().zzaw;
        }
        String strZza = zzbxt.zza(str, zzcekVar.getContext(), true, map2);
        String str2 = (String) map.get("a");
        if (str2 == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Action missing from an open GMSG.");
            return;
        }
        com.google.android.gms.ads.internal.zzb zzbVar = this.zza;
        if (zzbVar == null || zzbVar.zzb()) {
            zzgot.zzq((((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkQ)).booleanValue() && (zzcmiVar = this.zzf) != null && zzcmi.zzc(strZza)) ? zzcmiVar.zzb(strZza, com.google.android.gms.ads.internal.client.zzbb.zze()) : zzgot.zza(strZza), new zzbju(this, map, zzaVar, str2), this.zzi);
        } else {
            zzbVar.zzc(strZza);
        }
    }
}
