package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* loaded from: classes5.dex */
public abstract class zzhgm implements zzhka {
    static {
        int i = zzhhr.zzb;
        int i2 = zzhgo.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzhka
    public final /* synthetic */ Object zza(InputStream inputStream, zzhhr zzhhrVar) throws zzhiw {
        zzhku zzhkuVarZzaU;
        zzhhg zzhhgVarZzF = zzhhg.zzF(inputStream, 4096);
        zzhjs zzhjsVar = (zzhjs) zzb(zzhhgVarZzF, zzhhrVar);
        zzhhgVarZzF.zzb(0);
        if (zzhjsVar == null || zzhjsVar.zzbi()) {
            return zzhjsVar;
        }
        if (zzhjsVar instanceof zzhgk) {
            zzhkuVarZzaU = ((zzhgk) zzhjsVar).zzaU();
        } else {
            if (zzhjsVar instanceof zzhgl) {
                throw null;
            }
            zzhkuVarZzaU = new zzhku(zzhjsVar);
        }
        throw zzhkuVarZzaU.zza();
    }
}
