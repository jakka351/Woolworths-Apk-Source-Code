package com.google.android.gms.internal.ads;

import android.content.Context;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
final class zzeii implements zzdgp {
    private final Context zza;
    private final zzdpi zzb;
    private final zzfdc zzc;
    private final VersionInfoParcel zzd;
    private final zzfcj zze;
    private final ListenableFuture zzf;
    private final zzcek zzg;
    private final zzbjo zzh;
    private final boolean zzi;
    private final zzecy zzj;
    private final zzdsg zzk;
    private final zzdsm zzl;

    public zzeii(Context context, zzdpi zzdpiVar, zzfdc zzfdcVar, VersionInfoParcel versionInfoParcel, zzfcj zzfcjVar, ListenableFuture listenableFuture, zzcek zzcekVar, zzbjo zzbjoVar, boolean z, zzecy zzecyVar, zzdsg zzdsgVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzb = zzdpiVar;
        this.zzc = zzfdcVar;
        this.zzd = versionInfoParcel;
        this.zze = zzfcjVar;
        this.zzf = listenableFuture;
        this.zzg = zzcekVar;
        this.zzh = zzbjoVar;
        this.zzi = z;
        this.zzj = zzecyVar;
        this.zzk = zzdsgVar;
        this.zzl = zzdsmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    public final void zza(boolean z, Context context, zzcwf zzcwfVar) {
        zzdon zzdonVar = (zzdon) zzgot.zzs(this.zzf);
        try {
            zzfcj zzfcjVar = this.zze;
            final zzcek zzcekVarZza = this.zzg;
            if (zzcekVarZza.zzaB()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzbc)).booleanValue()) {
                    zzcekVarZza = this.zzb.zza(this.zzc.zzf, null, null);
                    zzbke.zzb(zzcekVarZza, zzdonVar.zzk());
                    final zzdpm zzdpmVar = new zzdpm();
                    zzdpmVar.zza(this.zza, zzcekVarZza.zzE());
                    zzdonVar.zzl().zzi(zzcekVarZza, true, this.zzi ? this.zzh : null, this.zzk.zze());
                    zzcekVarZza.zzP().zzG(new zzcgg() { // from class: com.google.android.gms.internal.ads.zzeih
                        @Override // com.google.android.gms.internal.ads.zzcgg
                        public final /* synthetic */ void zza(boolean z2, int i, String str, String str2) {
                            zzdpmVar.zzb();
                            zzcek zzcekVar = zzcekVarZza;
                            zzcekVar.zzJ();
                            zzcekVar.zzP().zzq();
                        }
                    });
                    zzcekVarZza.zzP().zzH(new zzcgh() { // from class: com.google.android.gms.internal.ads.zzeig
                        @Override // com.google.android.gms.internal.ads.zzcgh
                        public final /* synthetic */ void zza() {
                            zzcekVarZza.zzI();
                        }
                    });
                    zzfco zzfcoVar = zzfcjVar.zzs;
                    zzcekVarZza.zzau(zzfcoVar.zzb, zzfcoVar.zza, null);
                }
            }
            zzcek zzcekVar = zzcekVarZza;
            zzcekVar.zzag(true);
            boolean z2 = this.zzi;
            boolean z3 = false;
            boolean zZzc = z2 ? this.zzh.zzc(false) : false;
            com.google.android.gms.ads.internal.zzt.zzc();
            boolean zZzM = com.google.android.gms.ads.internal.util.zzs.zzM(this.zza);
            if (z2 && this.zzh.zzd()) {
                z3 = true;
            }
            float fZze = z2 ? this.zzh.zze() : BitmapDescriptorFactory.HUE_RED;
            zzfcj zzfcjVar2 = this.zze;
            com.google.android.gms.ads.internal.zzl zzlVar = new com.google.android.gms.ads.internal.zzl(zZzc, zZzM, z3, fZze, -1, z, zzfcjVar2.zzO, zzfcjVar2.zzP);
            if (zzcwfVar != null) {
                zzcwfVar.zzb();
            }
            com.google.android.gms.ads.internal.zzt.zzb();
            zzdge zzdgeVarZzj = zzdonVar.zzj();
            int i = zzfcjVar2.zzQ;
            VersionInfoParcel versionInfoParcel = this.zzd;
            String str = zzfcjVar2.zzB;
            zzfco zzfcoVar2 = zzfcjVar2.zzs;
            com.google.android.gms.ads.internal.overlay.zzm.zza(context, new AdOverlayInfoParcel(null, zzdgeVarZzj, null, zzcekVar, i, versionInfoParcel, str, zzlVar, zzfcoVar2.zzb, zzfcoVar2.zza, this.zzc.zzg, zzcwfVar, zzfcjVar2.zzb() ? this.zzj : null, zzcekVar.zzn()), true, this.zzl);
        } catch (zzcez e) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzg("", e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdgp
    @Nullable
    public final zzfcj zzb() {
        return this.zze;
    }
}
