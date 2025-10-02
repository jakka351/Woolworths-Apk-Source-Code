package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public final class zzeeo implements zzeef {
    private final Context zza;
    private final zzcny zzb;
    private final Executor zzc;

    public zzeeo(Context context, zzcny zzcnyVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcnyVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final void zza(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj {
        zzfea zzfeaVar = (zzfea) zzeecVar.zzb;
        zzfdc zzfdcVar = zzfcuVar.zza.zza;
        String string = zzfcjVar.zzv.toString();
        zzfeaVar.zzy(this.zza, zzfdcVar.zzd, string, (zzbpd) zzeecVar.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final /* bridge */ /* synthetic */ Object zzb(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj, zzeho {
        zzcnv zzcnvVarZzf = this.zzb.zzf(new zzcri(zzfcuVar, zzfcjVar, zzeecVar.zza), new zzdfe(new zzeen(this, zzeecVar, zzfcjVar), null), new zzcnw(zzfcjVar.zzaa));
        zzcnvVarZzf.zza().zzq(new zzcly((zzfea) zzeecVar.zzb), this.zzc);
        ((zzefo) zzeecVar.zzc).zzc(zzcnvVarZzf.zzf());
        return zzcnvVarZzf.zzh();
    }
}
