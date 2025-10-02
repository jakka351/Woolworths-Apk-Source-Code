package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzqm {
    private final zzcf[] zza;
    private final zzri zzb;
    private final zzci zzc;

    public zzqm(zzcf... zzcfVarArr) {
        zzri zzriVar = new zzri();
        zzci zzciVar = new zzci();
        zzcf[] zzcfVarArr2 = {zzriVar, zzciVar};
        this.zza = zzcfVarArr2;
        System.arraycopy(zzcfVarArr, 0, zzcfVarArr2, 0, 0);
        this.zzb = zzriVar;
        this.zzc = zzciVar;
    }

    public final zzcf[] zza() {
        return this.zza;
    }

    public final zzau zzb(zzau zzauVar) {
        zzci zzciVar = this.zzc;
        zzciVar.zzk(zzauVar.zzb);
        zzciVar.zzl(zzauVar.zzc);
        return zzauVar;
    }

    public final boolean zzc(boolean z) {
        this.zzb.zzq(z);
        return z;
    }

    public final long zzd(long j) {
        zzci zzciVar = this.zzc;
        return zzciVar.zzc() ? zzciVar.zzm(j) : j;
    }

    public final long zze() {
        return this.zzb.zzr();
    }
}
