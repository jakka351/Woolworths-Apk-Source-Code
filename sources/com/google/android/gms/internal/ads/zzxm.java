package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
final class zzxm implements Comparable {
    private final boolean zza;
    private final boolean zzb;

    public zzxm(zzu zzuVar, int i) {
        this.zza = 1 == (zzuVar.zze & 1);
        this.zzb = zzln.zzZ(i, false);
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxm zzxmVar) {
        return zzgjp.zzg().zzd(this.zzb, zzxmVar.zzb).zzd(this.zza, zzxmVar.zza).zze();
    }
}
