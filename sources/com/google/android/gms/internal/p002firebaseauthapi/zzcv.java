package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzxb;

/* loaded from: classes5.dex */
public final class zzcv {
    public static final zzxb zza = zza(16);
    public static final zzxb zzb = zza(32);
    public static final zzxb zzc;

    static {
        zza(16, 16);
        zza(32, 16);
        zzvy zzvyVar = zzvy.SHA256;
        zzc = zza(16, 16, 32, 16, zzvyVar);
        zza(32, 16, 32, 32, zzvyVar);
        zzxb.zza zzaVarZza = zzxb.zza().zza(zzei.zza());
        zzxz zzxzVar = zzxz.TINK;
    }

    private static zzxb zza(int i, int i2, int i3, int i4, zzvy zzvyVar) {
        zzto zztoVar = (zzto) ((zzalf) zzto.zzb().zza((zztr) ((zzalf) zztr.zzb().zza(16).zze())).zza(i).zze());
        return (zzxb) ((zzalf) zzxb.zza().zza(((zzti) ((zzalf) zzti.zza().zza(zztoVar).zza((zzwe) ((zzalf) zzwe.zzc().zza((zzwh) ((zzalf) zzwh.zzc().zza(zzvyVar).zza(i4).zze())).zza(32).zze())).zze())).zzj()).zza(zzde.zza()).zza(zzxz.TINK).zze());
    }

    private static zzxb zza(int i, int i2) {
        return (zzxb) ((zzalf) zzxb.zza().zza(((zztx) ((zzalf) zztx.zzb().zza(i).zza((zzua) ((zzalf) zzua.zzb().zza(16).zze())).zze())).zzj()).zza(zzdm.zza()).zza(zzxz.TINK).zze());
    }

    private static zzxb zza(int i) {
        return (zzxb) ((zzalf) zzxb.zza().zza(((zzug) ((zzalf) zzug.zzc().zza(i).zze())).zzj()).zza(zzdt.zza()).zza(zzxz.TINK).zze());
    }
}
