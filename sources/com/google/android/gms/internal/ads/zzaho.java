package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
final class zzaho {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzef zzf;
    private final zzef zzg;
    private int zzh;
    private int zzi;

    public zzaho(zzef zzefVar, zzef zzefVar2, boolean z) throws zzas {
        this.zzg = zzefVar;
        this.zzf = zzefVar2;
        this.zze = z;
        zzefVar2.zzh(12);
        this.zza = zzefVar2.zzH();
        zzefVar.zzh(12);
        this.zzi = zzefVar.zzH();
        zzacy.zza(zzefVar.zzB() == 1, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        int i = this.zzb + 1;
        this.zzb = i;
        if (i == this.zza) {
            return false;
        }
        this.zzd = this.zze ? this.zzf.zzJ() : this.zzf.zzz();
        if (this.zzb == this.zzh) {
            zzef zzefVar = this.zzg;
            this.zzc = zzefVar.zzH();
            zzefVar.zzk(4);
            int i2 = this.zzi - 1;
            this.zzi = i2;
            this.zzh = i2 > 0 ? (-1) + zzefVar.zzH() : -1;
        }
        return true;
    }
}
