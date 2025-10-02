package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes5.dex */
public final class zzamb implements zzamd {
    private final zzef zza;

    @Nullable
    private final String zzc;
    private final int zzd;
    private String zzf;
    private zzaeb zzg;
    private int zzi;
    private int zzj;
    private long zzk;
    private zzu zzl;
    private int zzm;
    private int zzn;
    private int zzh = 0;
    private long zzq = -9223372036854775807L;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzo = -1;
    private int zzp = -1;
    private final String zze = "video/mp2t";

    public zzamb(@Nullable String str, int i, int i2, String str2) {
        this.zza = new zzef(new byte[i2]);
        this.zzc = str;
        this.zzd = i;
    }

    private final boolean zzf(zzef zzefVar, byte[] bArr, int i) {
        int iMin = Math.min(zzefVar.zzd(), i - this.zzi);
        zzefVar.zzm(bArr, this.zzi, iMin);
        int i2 = this.zzi + iMin;
        this.zzi = i2;
        return i2 == i;
    }

    @RequiresNonNull
    private final void zzg(zzacs zzacsVar) {
        int i;
        int i2 = zzacsVar.zzb;
        if (i2 == -2147483647 || (i = zzacsVar.zzc) == -1) {
            return;
        }
        zzu zzuVar = this.zzl;
        if (zzuVar != null && i == zzuVar.zzG && i2 == zzuVar.zzH && Objects.equals(zzacsVar.zza, zzuVar.zzo)) {
            return;
        }
        zzu zzuVar2 = this.zzl;
        zzs zzsVar = zzuVar2 == null ? new zzs() : zzuVar2.zza();
        zzsVar.zza(this.zzf);
        zzsVar.zzl(this.zze);
        zzsVar.zzm(zzacsVar.zza);
        zzsVar.zzE(i);
        zzsVar.zzF(i2);
        zzsVar.zze(this.zzc);
        zzsVar.zzg(this.zzd);
        zzu zzuVarZzM = zzsVar.zzM();
        this.zzl = zzuVarZzM;
        this.zzg.zzu(zzuVarZzM);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = 0;
        this.zzq = -9223372036854775807L;
        this.zzb.set(0);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zzf = zzanrVar.zzc();
        this.zzg = zzacxVar.zzu(zzanrVar.zzb(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j, int i) {
        this.zzq = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzd(zzef zzefVar) throws zzas {
        int i;
        byte b;
        int i2;
        byte b2;
        this.zzg.getClass();
        while (zzefVar.zzd() > 0) {
            int i3 = this.zzh;
            if (i3 == 0) {
                while (true) {
                    if (zzefVar.zzd() > 0) {
                        int i4 = this.zzj << 8;
                        this.zzj = i4;
                        int iZzs = i4 | zzefVar.zzs();
                        this.zzj = iZzs;
                        int iZza = zzact.zza(iZzs);
                        this.zzn = iZza;
                        if (iZza != 0) {
                            byte[] bArrZzi = this.zza.zzi();
                            int i5 = this.zzj;
                            bArrZzi[0] = (byte) ((i5 >> 24) & 255);
                            bArrZzi[1] = (byte) ((i5 >> 16) & 255);
                            bArrZzi[2] = (byte) ((i5 >> 8) & 255);
                            bArrZzi[3] = (byte) (i5 & 255);
                            this.zzi = 4;
                            this.zzj = 0;
                            if (iZza == 3 || iZza == 4) {
                                this.zzh = 4;
                            } else if (iZza == 1) {
                                this.zzh = 1;
                            } else {
                                this.zzh = 2;
                            }
                        }
                    }
                }
            } else if (i3 == 1) {
                zzef zzefVar2 = this.zza;
                if (zzf(zzefVar, zzefVar2.zzi(), 18)) {
                    byte[] bArrZzi2 = zzefVar2.zzi();
                    if (this.zzl == null) {
                        zzu zzuVarZzb = zzact.zzb(bArrZzi2, this.zzf, this.zzc, this.zzd, this.zze, null);
                        this.zzl = zzuVarZzb;
                        this.zzg.zzu(zzuVarZzb);
                    }
                    this.zzm = zzact.zzc(bArrZzi2);
                    byte b3 = bArrZzi2[0];
                    if (b3 != -2) {
                        if (b3 == -1) {
                            i = (bArrZzi2[4] & 7) << 4;
                            b2 = bArrZzi2[7];
                        } else if (b3 != 31) {
                            i = (bArrZzi2[4] & 1) << 6;
                            b = bArrZzi2[5];
                        } else {
                            i = (bArrZzi2[5] & 7) << 4;
                            b2 = bArrZzi2[6];
                        }
                        i2 = b2 & 60;
                        this.zzk = zzgne.zza(zzeo.zzr(((i | (i2 >> 2)) + 1) * 32, this.zzl.zzH));
                        zzefVar2.zzh(0);
                        this.zzg.zzz(zzefVar2, 18);
                        this.zzh = 6;
                    } else {
                        i = (bArrZzi2[5] & 1) << 6;
                        b = bArrZzi2[4];
                    }
                    i2 = b & 252;
                    this.zzk = zzgne.zza(zzeo.zzr(((i | (i2 >> 2)) + 1) * 32, this.zzl.zzH));
                    zzefVar2.zzh(0);
                    this.zzg.zzz(zzefVar2, 18);
                    this.zzh = 6;
                }
            } else if (i3 != 2) {
                if (i3 == 3) {
                    zzef zzefVar3 = this.zza;
                    if (zzf(zzefVar, zzefVar3.zzi(), this.zzo)) {
                        zzacs zzacsVarZzd = zzact.zzd(zzefVar3.zzi());
                        zzg(zzacsVarZzd);
                        this.zzm = zzacsVarZzd.zzd;
                        long j = zzacsVarZzd.zze;
                        this.zzk = j != -9223372036854775807L ? j : 0L;
                        zzefVar3.zzh(0);
                        this.zzg.zzz(zzefVar3, this.zzo);
                        this.zzh = 6;
                    }
                } else if (i3 == 4) {
                    zzef zzefVar4 = this.zza;
                    if (zzf(zzefVar, zzefVar4.zzi(), 6)) {
                        int iZzg = zzact.zzg(zzefVar4.zzi());
                        this.zzp = iZzg;
                        int i6 = this.zzi;
                        if (i6 > iZzg) {
                            int i7 = i6 - iZzg;
                            this.zzi = i6 - i7;
                            zzefVar.zzh(zzefVar.zzg() - i7);
                        }
                        this.zzh = 5;
                    }
                } else if (i3 != 5) {
                    int iMin = Math.min(zzefVar.zzd(), this.zzm - this.zzi);
                    this.zzg.zzz(zzefVar, iMin);
                    int i8 = this.zzi + iMin;
                    this.zzi = i8;
                    if (i8 == this.zzm) {
                        zzghc.zzh(this.zzq != -9223372036854775807L);
                        this.zzg.zzx(this.zzq, this.zzn == 4 ? 0 : 1, this.zzm, 0, null);
                        this.zzq += this.zzk;
                        this.zzh = 0;
                    }
                } else {
                    zzef zzefVar5 = this.zza;
                    if (zzf(zzefVar, zzefVar5.zzi(), this.zzp)) {
                        zzacs zzacsVarZzf = zzact.zzf(zzefVar5.zzi(), this.zzb);
                        if (this.zzn == 3) {
                            zzg(zzacsVarZzf);
                        }
                        this.zzm = zzacsVarZzf.zzd;
                        long j2 = zzacsVarZzf.zze;
                        this.zzk = j2 != -9223372036854775807L ? j2 : 0L;
                        zzefVar5.zzh(0);
                        this.zzg.zzz(zzefVar5, this.zzp);
                        this.zzh = 6;
                    }
                }
            } else {
                zzef zzefVar6 = this.zza;
                if (zzf(zzefVar, zzefVar6.zzi(), 7)) {
                    this.zzo = zzact.zze(zzefVar6.zzi());
                    this.zzh = 3;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z) {
    }
}
