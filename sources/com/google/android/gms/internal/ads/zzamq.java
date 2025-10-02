package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
public final class zzamq implements zzamd {
    private String zzf;
    private zzaeb zzg;
    private boolean zzj;
    private int zzl;
    private int zzm;
    private int zzo;
    private int zzp;
    private int zzt;
    private boolean zzv;
    private final String zza = "video/mp2t";
    private int zze = 0;
    private final zzef zzb = new zzef(new byte[15], 2);
    private final zzee zzc = new zzee();
    private final zzef zzd = new zzef();
    private final zzamr zzq = new zzamr();
    private int zzr = -2147483647;
    private int zzs = -1;
    private long zzu = -1;
    private boolean zzk = true;
    private boolean zzn = true;
    private double zzh = -9.223372036854776E18d;
    private double zzi = -9.223372036854776E18d;

    public zzamq(String str) {
    }

    private static final void zzf(zzef zzefVar, zzef zzefVar2, boolean z) {
        int iZzg = zzefVar.zzg();
        int iMin = Math.min(zzefVar.zzd(), zzefVar2.zzd());
        zzefVar.zzm(zzefVar2.zzi(), zzefVar2.zzg(), iMin);
        zzefVar2.zzk(iMin);
        if (z) {
            zzefVar.zzh(iZzg);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        this.zze = 0;
        this.zzm = 0;
        this.zzb.zza(2);
        this.zzo = 0;
        this.zzp = 0;
        this.zzr = -2147483647;
        this.zzs = -1;
        this.zzt = 0;
        this.zzu = -1L;
        this.zzv = false;
        this.zzj = false;
        this.zzn = true;
        this.zzk = true;
        this.zzh = -9.223372036854776E18d;
        this.zzi = -9.223372036854776E18d;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zzf = zzanrVar.zzc();
        this.zzg = zzacxVar.zzu(zzanrVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j, int i) {
        this.zzl = i;
        if (!this.zzk && (this.zzp != 0 || !this.zzn)) {
            this.zzj = true;
        }
        if (j != -9223372036854775807L) {
            double d = j;
            if (this.zzj) {
                this.zzi = d;
            } else {
                this.zzh = d;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzd(zzef zzefVar) throws zzas {
        int i;
        this.zzg.getClass();
        while (zzefVar.zzd() > 0) {
            int i2 = this.zze;
            int iZzj = 0;
            if (i2 == 0) {
                int i3 = this.zzl;
                if ((i3 & 2) != 0) {
                    if ((i3 & 4) == 0) {
                        while (zzefVar.zzd() > 0) {
                            int i4 = this.zzm << 8;
                            this.zzm = i4;
                            int iZzs = i4 | zzefVar.zzs();
                            this.zzm = iZzs;
                            if ((iZzs & 16777215) == 12583333) {
                                zzefVar.zzh(zzefVar.zzg() - 3);
                                this.zzm = 0;
                            }
                        }
                    }
                    this.zze = 1;
                    break;
                }
                zzefVar.zzh(zzefVar.zze());
            } else if (i2 != 1) {
                zzamr zzamrVar = this.zzq;
                int i5 = zzamrVar.zza;
                if (i5 == 1 || i5 == 17) {
                    zzf(zzefVar, this.zzd, true);
                }
                int iMin = Math.min(zzefVar.zzd(), zzamrVar.zzc - this.zzo);
                this.zzg.zzz(zzefVar, iMin);
                int i6 = this.zzo + iMin;
                this.zzo = i6;
                if (i6 == zzamrVar.zzc) {
                    int i7 = zzamrVar.zza;
                    if (i7 == 1) {
                        byte[] bArrZzi = this.zzd.zzi();
                        zzams zzamsVarZzb = zzamt.zzb(new zzee(bArrZzi, bArrZzi.length));
                        this.zzr = zzamsVarZzb.zzb;
                        this.zzs = zzamsVarZzb.zzc;
                        long j = this.zzu;
                        long j2 = zzamrVar.zzb;
                        if (j != j2) {
                            this.zzu = j2;
                            int i8 = zzamsVarZzb.zza;
                            String strConcat = i8 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(i8))) : "mhm1";
                            byte[] bArr = zzamsVarZzb.zzd;
                            zzgjz zzgjzVarZzk = null;
                            if (bArr != null && bArr.length > 0) {
                                zzgjzVarZzk = zzgjz.zzk(zzeo.zzb, bArr);
                            }
                            zzs zzsVar = new zzs();
                            zzsVar.zza(this.zzf);
                            zzsVar.zzl(this.zza);
                            zzsVar.zzm("audio/mhm1");
                            zzsVar.zzF(this.zzr);
                            zzsVar.zzj(strConcat);
                            zzsVar.zzp(zzgjzVarZzk);
                            this.zzg.zzu(zzsVar.zzM());
                        }
                        this.zzv = true;
                    } else if (i7 == 17) {
                        byte[] bArrZzi2 = this.zzd.zzi();
                        zzee zzeeVar = new zzee(bArrZzi2, bArrZzi2.length);
                        if (zzeeVar.zzi()) {
                            zzeeVar.zzh(2);
                            iZzj = zzeeVar.zzj(13);
                        }
                        this.zzt = iZzj;
                    } else if (i7 == 2) {
                        if (this.zzv) {
                            this.zzk = false;
                            i = 1;
                        } else {
                            i = 0;
                        }
                        int i9 = this.zzs - this.zzt;
                        double d = this.zzr;
                        long jRound = Math.round(this.zzh);
                        if (this.zzj) {
                            this.zzj = false;
                            this.zzh = this.zzi;
                        } else {
                            this.zzh += (i9 * 1000000.0d) / d;
                        }
                        this.zzg.zzx(jRound, i, this.zzp, 0, null);
                        this.zzv = false;
                        this.zzt = 0;
                        this.zzp = 0;
                    }
                    this.zze = 1;
                }
            } else {
                zzef zzefVar2 = this.zzb;
                zzf(zzefVar, zzefVar2, false);
                if (zzefVar2.zzd() == 0) {
                    zzee zzeeVar2 = this.zzc;
                    int iZze = zzefVar2.zze();
                    zzeeVar2.zzb(zzefVar2.zzi(), iZze);
                    zzamr zzamrVar2 = this.zzq;
                    if (zzamt.zza(zzeeVar2, zzamrVar2)) {
                        this.zzo = 0;
                        this.zzp = zzamrVar2.zzc + iZze + this.zzp;
                        zzefVar2.zzh(0);
                        this.zzg.zzz(zzefVar2, zzefVar2.zze());
                        zzefVar2.zza(2);
                        this.zzd.zza(zzamrVar2.zzc);
                        this.zzn = true;
                        this.zze = 2;
                    } else if (zzefVar2.zze() < 15) {
                        zzefVar2.zzf(zzefVar2.zze() + 1);
                    }
                }
                this.zzn = false;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z) {
    }
}
