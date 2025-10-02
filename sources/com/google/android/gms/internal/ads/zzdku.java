package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class zzdku implements zzcwm {
    private final zzdiu zza;
    private final zzdiz zzb;
    private final Executor zzc;
    private final Executor zzd;

    public zzdku(zzdiu zzdiuVar, zzdiz zzdizVar, Executor executor, Executor executor2) {
        this.zza = zzdiuVar;
        this.zzb = zzdizVar;
        this.zzc = executor;
        this.zzd = executor2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final void zza(final zzcek zzcekVar) {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdkt
            @Override // java.lang.Runnable
            public final void run() {
                zzcekVar.zze("onSdkImpression", new ArrayMap(0));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwm
    public final void zzdw() {
        if (this.zzb.zzd()) {
            zzdiu zzdiuVar = this.zza;
            zzedu zzeduVarZzZ = zzdiuVar.zzZ();
            if (zzeduVarZzZ == null && zzdiuVar.zzX() != null && ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbci.zzfQ)).booleanValue()) {
                ListenableFuture listenableFutureZzX = zzdiuVar.zzX();
                zzbzm zzbzmVarZzY = zzdiuVar.zzY();
                if (listenableFutureZzX == null || zzbzmVarZzY == null) {
                    return;
                }
                zzgot.zzq(zzgot.zzp(listenableFutureZzX, zzbzmVarZzY), new zzdks(this), this.zzd);
                return;
            }
            if (zzeduVarZzZ != null) {
                zzcek zzcekVarZzW = zzdiuVar.zzW();
                zzcek zzcekVarZzT = zzdiuVar.zzT();
                if (zzcekVarZzW == null) {
                    zzcekVarZzW = zzcekVarZzT == null ? null : zzcekVarZzT;
                }
                if (zzcekVarZzW != null) {
                    zza(zzcekVarZzW);
                }
            }
        }
    }
}
