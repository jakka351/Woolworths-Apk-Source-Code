package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzdnx {
    private final com.google.android.gms.ads.internal.zza zzb;
    private final Context zzc;
    private final zzdsm zzd;
    private final Executor zze;
    private final zzauu zzf;
    private final VersionInfoParcel zzg;
    private final zzecn zzi;
    private final zzfjv zzj;
    private final zzecy zzk;
    private final zzfdg zzl;
    private ListenableFuture zzm;
    private final zzdnl zza = new zzdnl();
    private final zzbkc zzh = new zzbkc();

    public zzdnx(zzdnv zzdnvVar) {
        this.zzc = zzdnvVar.zzb();
        this.zze = zzdnvVar.zze();
        this.zzf = zzdnvVar.zzf();
        this.zzg = zzdnvVar.zzg();
        this.zzb = zzdnvVar.zza();
        this.zzi = zzdnvVar.zzd();
        this.zzj = zzdnvVar.zzh();
        this.zzd = zzdnvVar.zzc();
        this.zzk = zzdnvVar.zzi();
        this.zzl = zzdnvVar.zzj();
    }

    public final synchronized void zza() {
        String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzei);
        zzauu zzauuVar = this.zzf;
        com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        zzecy zzecyVar = this.zzk;
        ListenableFuture listenableFutureZzk = zzgot.zzk(zzcfa.zzb(this.zzc, this.zzg, str, zzauuVar, zzaVar, zzecyVar, this.zzl, this.zzd), new zzggr() { // from class: com.google.android.gms.internal.ads.zzdnu
            @Override // com.google.android.gms.internal.ads.zzggr
            public final /* synthetic */ Object apply(Object obj) {
                zzcek zzcekVar = (zzcek) obj;
                this.zza.zzi(zzcekVar);
                return zzcekVar;
            }
        }, this.zze);
        this.zzm = listenableFutureZzk;
        zzbzk.zza(listenableFutureZzk, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzb() {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzgot.zzq(listenableFuture, new zzdnm(this), this.zze);
        this.zzm = null;
    }

    public final synchronized ListenableFuture zzc(final String str, final JSONObject jSONObject) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return zzgot.zza(null);
        }
        return zzgot.zzj(listenableFuture, new zzgob() { // from class: com.google.android.gms.internal.ads.zzdnt
            @Override // com.google.android.gms.internal.ads.zzgob
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzj(str, jSONObject, (zzcek) obj);
            }
        }, this.zze);
    }

    public final synchronized void zzd(String str, zzbjl zzbjlVar) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzgot.zzq(listenableFuture, new zzdnn(this, str, zzbjlVar), this.zze);
    }

    public final synchronized void zze(String str, zzbjl zzbjlVar) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzgot.zzq(listenableFuture, new zzdno(this, str, zzbjlVar), this.zze);
    }

    public final synchronized void zzf(String str, Map map) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzgot.zzq(listenableFuture, new zzdnp(this, "sendMessageToNativeJs", map), this.zze);
    }

    public final synchronized void zzg(zzfcj zzfcjVar, zzfcm zzfcmVar, zzcmi zzcmiVar) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzgot.zzq(listenableFuture, new zzdnq(this, zzfcjVar, zzfcmVar, zzcmiVar), this.zze);
    }

    public final void zzh(WeakReference weakReference, String str, zzbjl zzbjlVar) {
        zzd(str, new zzdnw(this, weakReference, str, zzbjlVar, null));
    }

    public final /* synthetic */ zzcek zzi(zzcek zzcekVar) {
        zzcekVar.zzab("/result", this.zzh);
        zzcgi zzcgiVarZzP = zzcekVar.zzP();
        com.google.android.gms.ads.internal.zzb zzbVar = new com.google.android.gms.ads.internal.zzb(this.zzc, null, null);
        zzecn zzecnVar = this.zzi;
        zzfjv zzfjvVar = this.zzj;
        zzdsm zzdsmVar = this.zzd;
        zzdnl zzdnlVar = this.zza;
        zzcgiVarZzP.zzZ(null, zzdnlVar, zzdnlVar, zzdnlVar, zzdnlVar, false, null, zzbVar, null, null, zzecnVar, zzfjvVar, zzdsmVar, null, null, null, null, null, null, null, null);
        return zzcekVar;
    }

    public final /* synthetic */ ListenableFuture zzj(String str, JSONObject jSONObject, zzcek zzcekVar) {
        return this.zzh.zzc(zzcekVar, str, jSONObject);
    }

    public final /* synthetic */ zzdnl zzk() {
        return this.zza;
    }

    public final /* synthetic */ zzdsm zzl() {
        return this.zzd;
    }

    public final /* synthetic */ zzecn zzm() {
        return this.zzi;
    }

    public final /* synthetic */ zzfjv zzn() {
        return this.zzj;
    }
}
