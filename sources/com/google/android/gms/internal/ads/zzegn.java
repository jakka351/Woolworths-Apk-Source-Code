package com.google.android.gms.internal.ads;

import android.content.Context;
import java.io.IOException;
import java.util.concurrent.Executor;
import org.json.JSONException;

/* loaded from: classes5.dex */
public final class zzegn implements zzeef {
    private final Context zza;
    private final zzdhd zzb;
    private final Executor zzc;

    public zzegn(Context context, zzdhd zzdhdVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdhdVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfcu zzfcuVar, int i) {
        return zzfcuVar.zza.zza.zzh.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final void zza(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws JSONException, IOException, zzfdj {
        zzfea zzfeaVar = (zzfea) zzeecVar.zzb;
        zzfdc zzfdcVar = zzfcuVar.zza.zza;
        String string = zzfcjVar.zzv.toString();
        String strZzm = com.google.android.gms.ads.internal.util.zzbp.zzm(zzfcjVar.zzs);
        zzfeaVar.zzo(this.zza, zzfdcVar.zzd, string, strZzm, (zzbpd) zzeecVar.zzc, zzfdcVar.zzj, zzfdcVar.zzh);
    }

    @Override // com.google.android.gms.internal.ads.zzeef
    public final /* bridge */ /* synthetic */ Object zzb(zzfcu zzfcuVar, zzfcj zzfcjVar, zzeec zzeecVar) throws zzfdj, zzeho {
        zzdiu zzdiuVarZzag;
        zzfea zzfeaVar = (zzfea) zzeecVar.zzb;
        zzbpi zzbpiVarZzD = zzfeaVar.zzD();
        zzbpj zzbpjVarZzE = zzfeaVar.zzE();
        zzbpm zzbpmVarZzu = zzfeaVar.zzu();
        if (zzbpmVarZzu != null && zzc(zzfcuVar, 6)) {
            zzdiuVarZzag = zzdiu.zzaf(zzbpmVarZzu);
        } else if (zzbpiVarZzD != null && zzc(zzfcuVar, 6)) {
            zzdiuVarZzag = zzdiu.zzai(zzbpiVarZzD);
        } else if (zzbpiVarZzD != null && zzc(zzfcuVar, 2)) {
            zzdiuVarZzag = zzdiu.zzah(zzbpiVarZzD);
        } else if (zzbpjVarZzE != null && zzc(zzfcuVar, 6)) {
            zzdiuVarZzag = zzdiu.zzaj(zzbpjVarZzE);
        } else {
            if (zzbpjVarZzE == null || !zzc(zzfcuVar, 1)) {
                throw new zzeho(1, "No native ad mappers");
            }
            zzdiuVarZzag = zzdiu.zzag(zzbpjVarZzE);
        }
        if (zzdiuVarZzag != null) {
            zzfdc zzfdcVar = zzfcuVar.zza.zza;
            if (zzfdcVar.zzh.contains(Integer.toString(zzdiuVarZzag.zzx()))) {
                zzdiw zzdiwVarZze = this.zzb.zze(new zzcri(zzfcuVar, zzfcjVar, zzeecVar.zza), new zzdjf(zzdiuVarZzag), new zzdky(zzbpjVarZzE, zzbpiVarZzD, zzbpmVarZzu));
                ((zzefo) zzeecVar.zzc).zzc(zzdiwVarZze.zzf());
                zzdiwVarZze.zza().zzq(new zzcly(zzfeaVar), this.zzc);
                return zzdiwVarZze.zzh();
            }
        }
        throw new zzeho(1, "No corresponding native ad listener");
    }
}
