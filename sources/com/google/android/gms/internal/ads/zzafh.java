package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
final class zzafh extends zzafg {
    private final zzef zzb;
    private final zzef zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzafh(zzaeb zzaebVar) {
        super(zzaebVar);
        this.zzb = new zzef(zzfl.zza);
        this.zzc = new zzef(4);
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    public final boolean zza(zzef zzefVar) throws zzaff {
        int iZzs = zzefVar.zzs();
        int i = iZzs >> 4;
        int i2 = iZzs & 15;
        if (i2 != 7) {
            throw new zzaff(YU.a.n(new StringBuilder(String.valueOf(i2).length() + 28), "Video format not supported: ", i2));
        }
        this.zzg = i;
        return i != 5;
    }

    @Override // com.google.android.gms.internal.ads.zzafg
    public final boolean zzb(zzef zzefVar, long j) throws zzas {
        int i;
        int iZzs = zzefVar.zzs();
        long jZzy = zzefVar.zzy();
        if (iZzs == 0) {
            if (!this.zze) {
                zzef zzefVar2 = new zzef(new byte[zzefVar.zzd()]);
                zzefVar.zzm(zzefVar2.zzi(), 0, zzefVar.zzd());
                zzabz zzabzVarZza = zzabz.zza(zzefVar2);
                this.zzd = zzabzVarZza.zzb;
                zzs zzsVar = new zzs();
                zzsVar.zzl("video/x-flv");
                zzsVar.zzm("video/avc");
                zzsVar.zzj(zzabzVarZza.zzl);
                zzsVar.zzt(zzabzVarZza.zzc);
                zzsVar.zzu(zzabzVarZza.zzd);
                zzsVar.zzz(zzabzVarZza.zzk);
                zzsVar.zzp(zzabzVarZza.zza);
                this.zza.zzu(zzsVar.zzM());
                this.zze = true;
                return false;
            }
        } else if (iZzs == 1 && this.zze) {
            int i2 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i = i2;
            } else if (i2 != 0) {
                i = 1;
            }
            zzef zzefVar3 = this.zzc;
            byte[] bArrZzi = zzefVar3.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[2] = 0;
            int i3 = 4 - this.zzd;
            int i4 = 0;
            while (zzefVar.zzd() > 0) {
                zzefVar.zzm(zzefVar3.zzi(), i3, this.zzd);
                zzefVar3.zzh(0);
                zzef zzefVar4 = this.zzb;
                int iZzH = zzefVar3.zzH();
                zzefVar4.zzh(0);
                zzaeb zzaebVar = this.zza;
                zzaebVar.zzz(zzefVar4, 4);
                zzaebVar.zzz(zzefVar, iZzH);
                i4 = i4 + 4 + iZzH;
            }
            this.zza.zzx((jZzy * 1000) + j, i, i4, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
