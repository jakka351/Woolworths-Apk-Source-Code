package com.google.android.gms.internal.measurement;

/* loaded from: classes5.dex */
final class zzbc implements zzbe {
    private final zzg zza;
    private final String zzb;

    public zzbc(zzg zzgVar, String str) {
        this.zza = zzgVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzbe
    public final zzg zza(zzao zzaoVar) {
        zzg zzgVarZzc = this.zza.zzc();
        zzgVarZzc.zzg(this.zzb, zzaoVar);
        return zzgVarZzc;
    }
}
