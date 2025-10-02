package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
final class zzxl extends zzxv implements Comparable {
    private final int zze;
    private final int zzf;

    public zzxl(int i, zzbf zzbfVar, int i2, zzxo zzxoVar, int i3) {
        super(i, zzbfVar, i2);
        this.zze = zzln.zzZ(i3, zzxoVar.zzV) ? 1 : 0;
        this.zzf = this.zzd.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final int zza() {
        return this.zze;
    }

    @Override // java.lang.Comparable
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final int compareTo(zzxl zzxlVar) {
        return Integer.compare(this.zzf, zzxlVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final /* bridge */ /* synthetic */ boolean zzc(zzxv zzxvVar) {
        return false;
    }
}
