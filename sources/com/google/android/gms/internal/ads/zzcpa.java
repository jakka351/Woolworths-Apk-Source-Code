package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class zzcpa implements zzhpx {
    private final zzcor zza;
    private final zzhqg zzb;
    private final zzhqg zzc;
    private final zzhqg zzd;
    private final zzhqg zze;

    private zzcpa(zzcor zzcorVar, zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        this.zza = zzcorVar;
        this.zzb = zzhqgVar;
        this.zzc = zzhqgVar2;
        this.zzd = zzhqgVar3;
        this.zze = zzhqgVar4;
    }

    public static zzcpa zza(zzcor zzcorVar, zzhqg zzhqgVar, zzhqg zzhqgVar2, zzhqg zzhqgVar3, zzhqg zzhqgVar4) {
        return new zzcpa(zzcorVar, zzhqgVar, zzhqgVar2, zzhqgVar3, zzhqgVar4);
    }

    public static zzddr zzc(zzcor zzcorVar, final Context context, final VersionInfoParcel versionInfoParcel, final zzfcj zzfcjVar, final zzfdc zzfdcVar) {
        return new zzddr(new zzcxg() { // from class: com.google.android.gms.internal.ads.zzcoq
            @Override // com.google.android.gms.internal.ads.zzcxg
            public final /* synthetic */ void zzg() {
                zzfdc zzfdcVar2 = zzfdcVar;
                JSONObject jSONObject = zzfcjVar.zzC;
                com.google.android.gms.ads.internal.zzt.zzo().zzg(context, versionInfoParcel.afmaVersion, jSONObject.toString(), zzfdcVar2.zzg);
            }
        }, zzbzh.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zzc(this.zza, (Context) this.zzb.zzb(), ((zzchs) this.zzc).zza(), ((zzcrj) this.zzd).zza(), ((zzcvj) this.zze).zza());
    }
}
