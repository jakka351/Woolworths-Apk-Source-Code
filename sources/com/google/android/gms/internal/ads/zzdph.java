package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import com.dynatrace.android.callback.Callback;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class zzdph {
    private final zzcvq zza;
    private final zzddx zzb;
    private final zzcwz zzc;
    private final zzcxm zzd;
    private final zzcyd zze;
    private final zzdaw zzf;
    private final Executor zzg;
    private final zzddt zzh;
    private final zzcnf zzi;
    private final com.google.android.gms.ads.internal.zzb zzj;
    private final zzbxf zzk;
    private final zzauu zzl;
    private final zzdan zzm;
    private final zzecn zzn;
    private final zzfjv zzo;
    private final zzdsm zzp;
    private final zzcmi zzq;
    private final zzdpn zzr;
    private final zzdtp zzs;
    private final zzcur zzt;

    public zzdph(zzcvq zzcvqVar, zzcwz zzcwzVar, zzcxm zzcxmVar, zzcyd zzcydVar, zzdaw zzdawVar, Executor executor, zzddt zzddtVar, zzcnf zzcnfVar, com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzbxf zzbxfVar, zzauu zzauuVar, zzdan zzdanVar, zzecn zzecnVar, zzfjv zzfjvVar, zzdsm zzdsmVar, zzddx zzddxVar, zzcmi zzcmiVar, zzdpn zzdpnVar, zzdtp zzdtpVar, zzcur zzcurVar) {
        this.zza = zzcvqVar;
        this.zzc = zzcwzVar;
        this.zzd = zzcxmVar;
        this.zze = zzcydVar;
        this.zzf = zzdawVar;
        this.zzg = executor;
        this.zzh = zzddtVar;
        this.zzi = zzcnfVar;
        this.zzj = zzbVar;
        this.zzk = zzbxfVar;
        this.zzl = zzauuVar;
        this.zzm = zzdanVar;
        this.zzn = zzecnVar;
        this.zzo = zzfjvVar;
        this.zzp = zzdsmVar;
        this.zzb = zzddxVar;
        this.zzq = zzcmiVar;
        this.zzr = zzdpnVar;
        this.zzs = zzdtpVar;
        this.zzt = zzcurVar;
    }

    public static final ListenableFuture zzj(zzcek zzcekVar, String str, String str2, final Bundle bundle, zzfib zzfibVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcu)).booleanValue()) {
            au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.v(bundle, zzdru.RENDERING_WEBVIEW_LOAD_HTML_START.zza());
        }
        final zzbzm zzbzmVar = new zzbzm();
        if (((Boolean) zzbeb.zzf.zze()).booleanValue()) {
            zzfhr zzfhrVarZzn = zzfhr.zzn(zzcekVar.getContext(), 112);
            zzfhrVarZzn.zza();
            zzfia.zzd(zzbzmVar, zzfibVar, zzfhrVarZzn);
        }
        zzcekVar.zzP().zzG(new zzcgg() { // from class: com.google.android.gms.internal.ads.zzdpf
            @Override // com.google.android.gms.internal.ads.zzcgg
            public final /* synthetic */ void zza(boolean z, int i, String str3, String str4) {
                zzbzm zzbzmVar2 = zzbzmVar;
                if (z) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcu)).booleanValue()) {
                        au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.v(bundle, zzdru.RENDERING_WEBVIEW_LOAD_HTML_END.zza());
                    }
                    zzbzmVar2.zzc(null);
                    return;
                }
                int length = String.valueOf(i).length();
                StringBuilder sb = new StringBuilder(length + 55 + String.valueOf(str3).length() + 15 + String.valueOf(str4).length());
                au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.t(i, "Ad Web View failed to load. Error code: ", ", Description: ", str3, sb);
                zzbzmVar2.zzd(new Exception(YU.a.o(sb, ", Failing URL: ", str4)));
            }
        });
        zzcekVar.zzau(str, str2, null);
        return zzbzmVar;
    }

    public final /* synthetic */ void zza() {
        this.zza.onAdClicked();
    }

    public final /* synthetic */ void zzb(String str, String str2) {
        this.zzf.zzb(str, str2);
    }

    public final /* synthetic */ void zzc() {
        this.zzc.zzb();
    }

    public final /* synthetic */ boolean zzd(View view, MotionEvent motionEvent) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzkQ)).booleanValue() && motionEvent != null && motionEvent.getAction() == 0) {
            this.zzr.zza(motionEvent);
        }
        this.zzj.zza();
        if (view == null) {
            return false;
        }
        view.performClick();
        return false;
    }

    public final /* synthetic */ void zze(View view) {
        this.zzj.zza();
    }

    public final /* synthetic */ void zzf(zzcek zzcekVar, zzcek zzcekVar2, Map map) {
        this.zzi.zzn(zzcekVar);
    }

    public final /* synthetic */ zzcwz zzg() {
        return this.zzc;
    }

    public final /* synthetic */ zzdan zzh() {
        return this.zzm;
    }

    public final void zzi(final zzcek zzcekVar, boolean z, zzbjo zzbjoVar, Bundle bundle) {
        zzaup zzaupVarZzb;
        zzbbz zzbbzVar = zzbci.zzcu;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
            au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.v(bundle, zzdru.RENDERING_CONFIGURE_WEBVIEW_START.zza());
        }
        zzcekVar.zzP().zzZ(new com.google.android.gms.ads.internal.client.zza() { // from class: com.google.android.gms.internal.ads.zzdpg
            @Override // com.google.android.gms.ads.internal.client.zza
            public final /* synthetic */ void onAdClicked() {
                this.zza.zza();
            }
        }, this.zzd, this.zze, new zzbid() { // from class: com.google.android.gms.internal.ads.zzdoz
            @Override // com.google.android.gms.internal.ads.zzbid
            public final /* synthetic */ void zzb(String str, String str2) {
                this.zza.zzb(str, str2);
            }
        }, new com.google.android.gms.ads.internal.overlay.zzac() { // from class: com.google.android.gms.internal.ads.zzdpa
            @Override // com.google.android.gms.ads.internal.overlay.zzac
            public final /* synthetic */ void zzl() {
                this.zza.zzc();
            }
        }, z, zzbjoVar, this.zzj, new zzdoy(this), this.zzk, this.zzn, this.zzo, this.zzp, null, this.zzb, null, null, null, this.zzq, this.zzs, this.zzt);
        zzcekVar.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.gms.internal.ads.zzdpb
            @Override // android.view.View.OnTouchListener
            public final /* synthetic */ boolean onTouch(View view, MotionEvent motionEvent) {
                this.zza.zzd(view, motionEvent);
                return false;
            }
        });
        zzcekVar.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.gms.internal.ads.zzdpc
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                Callback.g(view);
                try {
                    this.zza.zze(view);
                } finally {
                    Callback.h();
                }
            }
        });
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzcV)).booleanValue() && (zzaupVarZzb = this.zzl.zzb()) != null) {
            zzaupVarZzb.zzh(zzcekVar.zzE());
        }
        zzddt zzddtVar = this.zzh;
        Executor executor = this.zzg;
        zzddtVar.zzq(zzcekVar, executor);
        zzddtVar.zzq(new zzayi() { // from class: com.google.android.gms.internal.ads.zzdpd
            @Override // com.google.android.gms.internal.ads.zzayi
            public final /* synthetic */ void zzdo(zzayh zzayhVar) {
                Rect rect = zzayhVar.zzd;
                zzcekVar.zzP().zza(rect.left, rect.top, false);
            }
        }, executor);
        zzddtVar.zza(zzcekVar.zzE());
        zzcekVar.zzab("/trackActiveViewUnit", new zzbjl() { // from class: com.google.android.gms.internal.ads.zzdpe
            @Override // com.google.android.gms.internal.ads.zzbjl
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzf(zzcekVar, (zzcek) obj, map);
            }
        });
        this.zzi.zzo(zzcekVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbbzVar)).booleanValue()) {
            au.com.woolworths.feature.rewards.everydayextras.signup.selections.a.v(bundle, zzdru.RENDERING_CONFIGURE_WEBVIEW_END.zza());
        }
    }
}
