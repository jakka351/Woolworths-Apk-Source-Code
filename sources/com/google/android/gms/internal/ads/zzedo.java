package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzedo implements zzedp {
    public static /* synthetic */ zzedu zzl(String str, String str2, String str3, zzedq zzedqVar, String str4, WebView webView, String str5, String str6, zzedr zzedrVar) {
        zzflx zzflxVarZza = zzflx.zza("Google", str2);
        zzflw zzflwVarZzn = zzn("javascript");
        zzflo zzfloVarZzp = zzp(zzedqVar.toString());
        zzflw zzflwVar = zzflw.NONE;
        if (zzflwVarZzn == zzflwVar) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfloVarZzp == null) {
            String strValueOf = String.valueOf(zzedqVar);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Unable to parse creative type: ".concat(strValueOf));
            return null;
        }
        zzflw zzflwVarZzn2 = zzn(str4);
        if (zzfloVarZzp != zzflo.VIDEO || zzflwVarZzn2 != zzflwVar) {
            zzfll zzfllVarZza = zzfll.zza(zzflxVarZza, webView, str5, "");
            return new zzedu(zzflj.zze(zzflk.zza(zzfloVarZzp, zzo(zzedrVar.toString()), zzflwVarZzn, zzflwVarZzn2, true), zzfllVarZza), zzfllVarZza);
        }
        String strValueOf2 = String.valueOf(str4);
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid html session error; Video events owner unknown for video creative: ".concat(strValueOf2));
        return null;
    }

    public static /* synthetic */ zzedu zzm(String str, String str2, String str3, String str4, zzedq zzedqVar, WebView webView, String str5, String str6, zzedr zzedrVar) {
        zzflx zzflxVarZza = zzflx.zza(str, str2);
        zzflw zzflwVarZzn = zzn("javascript");
        zzflw zzflwVarZzn2 = zzn(str4);
        zzflo zzfloVarZzp = zzp(zzedqVar.toString());
        zzflw zzflwVar = zzflw.NONE;
        if (zzflwVarZzn == zzflwVar) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse impression owner: javascript");
            return null;
        }
        if (zzfloVarZzp == null) {
            String strValueOf = String.valueOf(zzedqVar);
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Unable to parse creative type: ".concat(strValueOf));
            return null;
        }
        if (zzfloVarZzp != zzflo.VIDEO || zzflwVarZzn2 != zzflwVar) {
            zzfll zzfllVarZzb = zzfll.zzb(zzflxVarZza, webView, str5, "");
            return new zzedu(zzflj.zze(zzflk.zza(zzfloVarZzp, zzo(zzedrVar.toString()), zzflwVarZzn, zzflwVarZzn2, true), zzfllVarZzb), zzfllVarZzb);
        }
        String strValueOf2 = String.valueOf(str4);
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid js session error; Video events owner unknown for video creative: ".concat(strValueOf2));
        return null;
    }

    private static zzflw zzn(@Nullable String str) {
        return "native".equals(str) ? zzflw.NATIVE : "javascript".equals(str) ? zzflw.JAVASCRIPT : zzflw.NONE;
    }

    private static zzflr zzo(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1104128070) {
            if (iHashCode != 1318088141) {
                if (iHashCode == 1988248512 && str.equals("onePixel")) {
                    return zzflr.ONE_PIXEL;
                }
            } else if (str.equals("definedByJavascript")) {
                return zzflr.DEFINED_BY_JAVASCRIPT;
            }
        } else if (str.equals("beginToRender")) {
            return zzflr.BEGIN_TO_RENDER;
        }
        return zzflr.UNSPECIFIED;
    }

    @Nullable
    private static zzflo zzp(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -382745961) {
            if (str.equals("htmlDisplay")) {
                return zzflo.HTML_DISPLAY;
            }
            return null;
        }
        if (iHashCode == 112202875) {
            if (str.equals("video")) {
                return zzflo.VIDEO;
            }
            return null;
        }
        if (iHashCode == 714893483 && str.equals("nativeDisplay")) {
            return zzflo.NATIVE_DISPLAY;
        }
        return null;
    }

    @Nullable
    private static final Object zzq(zzedn zzednVar) {
        try {
            return zzednVar.zza();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "omid exception");
            return null;
        }
    }

    private static final void zzr(Runnable runnable) {
        try {
            runnable.run();
        } catch (RuntimeException e) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(e, "omid exception");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedp
    public final boolean zza(final Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfJ)).booleanValue()) {
            Boolean bool = (Boolean) zzq(new zzedn() { // from class: com.google.android.gms.internal.ads.zzedm
                @Override // com.google.android.gms.internal.ads.zzedn
                public final /* synthetic */ Object zza() {
                    if (zzflh.zzb()) {
                        return Boolean.TRUE;
                    }
                    zzflh.zza(context);
                    return Boolean.valueOf(zzflh.zzb());
                }
            });
            return bool != null && bool.booleanValue();
        }
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzi("Omid flag is disabled");
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzedp
    @Nullable
    public final String zzb(Context context) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfJ)).booleanValue()) {
            return (String) zzq(zzedd.zza);
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzedp
    @Nullable
    public final zzedu zzc(final String str, final WebView webView, String str2, String str3, @Nullable final String str4, final zzedr zzedrVar, final zzedq zzedqVar, @Nullable final String str5) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfJ)).booleanValue() || !zzflh.zzb()) {
            return null;
        }
        final String str6 = "javascript";
        final String str7 = "Google";
        final String str8 = "";
        return (zzedu) zzq(new zzedn(str7, str, str6, zzedqVar, str4, webView, str5, str8, zzedrVar) { // from class: com.google.android.gms.internal.ads.zzede
            private final /* synthetic */ String zzb;
            private final /* synthetic */ zzedq zzd;
            private final /* synthetic */ String zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzedr zzi;
            private final /* synthetic */ String zza = "Google";
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = "";

            {
                this.zzb = str;
                this.zzd = zzedqVar;
                this.zze = str4;
                this.zzf = webView;
                this.zzg = str5;
                this.zzi = zzedrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzedn
            public final /* synthetic */ Object zza() {
                return zzedo.zzl(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedp
    @Nullable
    public final zzedu zzd(final String str, final WebView webView, String str2, String str3, @Nullable final String str4, final String str5, final zzedr zzedrVar, final zzedq zzedqVar, @Nullable final String str6) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfJ)).booleanValue() || !zzflh.zzb()) {
            return null;
        }
        final String str7 = "";
        final String str8 = "javascript";
        return (zzedu) zzq(new zzedn(str5, str, str8, str4, zzedqVar, webView, str6, str7, zzedrVar) { // from class: com.google.android.gms.internal.ads.zzedf
            private final /* synthetic */ String zza;
            private final /* synthetic */ String zzb;
            private final /* synthetic */ String zzd;
            private final /* synthetic */ zzedq zze;
            private final /* synthetic */ WebView zzf;
            private final /* synthetic */ String zzg;
            private final /* synthetic */ zzedr zzi;
            private final /* synthetic */ String zzc = "javascript";
            private final /* synthetic */ String zzh = "";

            {
                this.zzd = str4;
                this.zze = zzedqVar;
                this.zzf = webView;
                this.zzg = str6;
                this.zzi = zzedrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzedn
            public final /* synthetic */ Object zza() {
                return zzedo.zzm(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedp
    public final void zze(final zzflj zzfljVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfJ)).booleanValue() && zzflh.zzb()) {
            Objects.requireNonNull(zzfljVar);
            zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedc
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzfljVar.zza();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzedp
    public final void zzf(final zzflj zzfljVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedg
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfJ)).booleanValue() && zzflh.zzb()) {
                    zzfljVar.zzc();
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedp
    public final void zzg(final zzflj zzfljVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfJ)).booleanValue() && zzflh.zzb()) {
                    zzfljVar.zzd(view, zzflq.NOT_VISIBLE, "Ad overlay");
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedp
    public final void zzh(final zzflj zzfljVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedi
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfJ)).booleanValue() && zzflh.zzb()) {
                    zzfljVar.zzb(view);
                }
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedp
    @Nullable
    public final zzflv zzi(final VersionInfoParcel versionInfoParcel, final WebView webView, boolean z) {
        final boolean z2 = true;
        return (zzflv) zzq(new zzedn(webView, z2) { // from class: com.google.android.gms.internal.ads.zzedj
            private final /* synthetic */ WebView zzb;

            @Override // com.google.android.gms.internal.ads.zzedn
            public final /* synthetic */ Object zza() {
                VersionInfoParcel versionInfoParcel2 = this.zza;
                int i = versionInfoParcel2.buddyApkVersion;
                int i2 = versionInfoParcel2.clientJarVersion;
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 1 + String.valueOf(i2).length());
                sb.append(i);
                sb.append(".");
                sb.append(i2);
                return zzflv.zza(zzflx.zza("Google", sb.toString()), this.zzb, true);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedp
    public final void zzj(final zzflv zzflvVar, final zzflu zzfluVar) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedk
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzflvVar.zzb(zzfluVar);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzedp
    public final void zzk(final zzflv zzflvVar, final View view) {
        zzr(new Runnable() { // from class: com.google.android.gms.internal.ads.zzedl
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                zzflvVar.zzd(view, zzflq.NOT_VISIBLE, "Ad overlay");
            }
        });
    }
}
