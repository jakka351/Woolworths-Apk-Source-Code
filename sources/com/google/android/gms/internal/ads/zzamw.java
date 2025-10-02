package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzamw implements zzans {
    private final zzamd zza;
    private final zzee zzb = new zzee(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private zzel zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzamw(zzamd zzamdVar) {
        this.zza = zzamdVar;
    }

    private final void zze(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zzf(zzef zzefVar, @Nullable byte[] bArr, int i) {
        int iMin = Math.min(zzefVar.zzd(), i - this.zzd);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zzefVar.zzk(iMin);
        } else {
            zzefVar.zzm(bArr, this.zzd, iMin);
        }
        int i2 = this.zzd + iMin;
        this.zzd = i2;
        return i2 == i;
    }

    @Override // com.google.android.gms.internal.ads.zzans
    public final void zza(zzel zzelVar, zzacx zzacxVar, zzanr zzanrVar) {
        this.zze = zzelVar;
        this.zza.zzb(zzacxVar, zzanrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzans
    public final void zzb() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzans
    public final void zzc(zzef zzefVar, int i) throws zzas {
        int i2;
        int i3;
        long jZze;
        long j;
        this.zze.getClass();
        int i4 = -1;
        int i5 = 2;
        if ((i & 1) != 0) {
            int i6 = this.zzc;
            if (i6 != 0 && i6 != 1) {
                if (i6 != 2) {
                    int i7 = this.zzj;
                    if (i7 != -1) {
                        StringBuilder sb = new StringBuilder(String.valueOf(i7).length() + 48);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i7);
                        sb.append(" more bytes");
                        zzds.zzc("PesReader", sb.toString());
                    }
                    this.zza.zze(zzefVar.zze() == 0);
                } else {
                    zzds.zzc("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i8 = i;
        while (zzefVar.zzd() > 0) {
            int i9 = this.zzc;
            if (i9 == 0) {
                i2 = i5;
                zzefVar.zzk(zzefVar.zzd());
            } else if (i9 != 1) {
                if (i9 != i5) {
                    int iZzd = zzefVar.zzd();
                    int i10 = this.zzj;
                    int i11 = i10 == i4 ? 0 : iZzd - i10;
                    if (i11 > 0) {
                        iZzd -= i11;
                        zzefVar.zzf(zzefVar.zzg() + iZzd);
                    }
                    zzamd zzamdVar = this.zza;
                    zzamdVar.zzd(zzefVar);
                    int i12 = this.zzj;
                    if (i12 != i4) {
                        int i13 = i12 - iZzd;
                        this.zzj = i13;
                        if (i13 == 0) {
                            zzamdVar.zze(false);
                            zze(1);
                        }
                    }
                } else {
                    int iMin = Math.min(10, this.zzi);
                    zzee zzeeVar = this.zzb;
                    if (zzf(zzefVar, zzeeVar.zza, iMin) && zzf(zzefVar, null, this.zzi)) {
                        zzeeVar.zzf(0);
                        if (this.zzf) {
                            zzeeVar.zzh(4);
                            long jZzj = zzeeVar.zzj(3);
                            zzeeVar.zzh(1);
                            int iZzj = zzeeVar.zzj(15) << 15;
                            zzeeVar.zzh(1);
                            long jZzj2 = zzeeVar.zzj(15);
                            zzeeVar.zzh(1);
                            if (this.zzh || !this.zzg) {
                                j = jZzj;
                            } else {
                                zzeeVar.zzh(4);
                                j = jZzj;
                                zzeeVar.zzh(1);
                                int iZzj2 = zzeeVar.zzj(15) << 15;
                                zzeeVar.zzh(1);
                                long jZzj3 = zzeeVar.zzj(15);
                                zzeeVar.zzh(1);
                                this.zze.zze((zzeeVar.zzj(3) << 30) | iZzj2 | jZzj3);
                                this.zzh = true;
                            }
                            jZze = this.zze.zze(jZzj2 | (j << 30) | iZzj);
                        } else {
                            jZze = -9223372036854775807L;
                        }
                        i8 |= true != this.zzk ? 0 : 4;
                        this.zza.zzc(jZze, i8);
                        zze(3);
                        i4 = -1;
                        i5 = 2;
                    }
                }
                i2 = i5;
            } else {
                zzee zzeeVar2 = this.zzb;
                if (zzf(zzefVar, zzeeVar2.zza, 9)) {
                    zzeeVar2.zzf(0);
                    int iZzj3 = zzeeVar2.zzj(24);
                    if (iZzj3 != 1) {
                        com.google.android.gms.common.api.internal.a.r(new StringBuilder(String.valueOf(iZzj3).length() + 30), "Unexpected start code prefix: ", iZzj3, "PesReader");
                        i4 = -1;
                        this.zzj = -1;
                        i3 = 0;
                        i2 = 2;
                    } else {
                        zzeeVar2.zzh(8);
                        int iZzj4 = zzeeVar2.zzj(16);
                        zzeeVar2.zzh(5);
                        this.zzk = zzeeVar2.zzi();
                        i2 = 2;
                        zzeeVar2.zzh(2);
                        this.zzf = zzeeVar2.zzi();
                        this.zzg = zzeeVar2.zzi();
                        zzeeVar2.zzh(6);
                        int iZzj5 = zzeeVar2.zzj(8);
                        this.zzi = iZzj5;
                        if (iZzj4 == 0) {
                            this.zzj = -1;
                            i4 = -1;
                        } else {
                            int i14 = (iZzj4 - 3) - iZzj5;
                            this.zzj = i14;
                            if (i14 < 0) {
                                com.google.android.gms.common.api.internal.a.r(new StringBuilder(String.valueOf(i14).length() + 36), "Found negative packet payload size: ", i14, "PesReader");
                                i4 = -1;
                                this.zzj = -1;
                            } else {
                                i4 = -1;
                            }
                        }
                        i3 = 2;
                    }
                    zze(i3);
                } else {
                    i4 = -1;
                    i2 = 2;
                }
            }
            i5 = i2;
        }
    }

    public final boolean zzd(boolean z) {
        return this.zzc == 3 && this.zzj == -1;
    }
}
