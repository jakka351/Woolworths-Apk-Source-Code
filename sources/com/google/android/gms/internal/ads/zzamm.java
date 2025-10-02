package com.google.android.gms.internal.ads;

import java.util.Collections;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* loaded from: classes5.dex */
public final class zzamm implements zzamd {
    private final zzang zza;
    private String zzb;
    private zzaeb zzc;
    private zzaml zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final zzamu zzg = new zzamu(32, 128);
    private final zzamu zzh = new zzamu(33, 128);
    private final zzamu zzi = new zzamu(34, 128);
    private final zzamu zzj = new zzamu(39, 128);
    private final zzamu zzk = new zzamu(40, 128);
    private long zzm = -9223372036854775807L;
    private final zzef zzn = new zzef();

    public zzamm(zzang zzangVar, String str) {
        this.zza = zzangVar;
    }

    @RequiresNonNull
    private final void zzf(long j, int i, int i2, long j2) {
        this.zzd.zzb(j, i, i2, j2, this.zze);
        if (!this.zze) {
            this.zzg.zzc(i2);
            this.zzh.zzc(i2);
            this.zzi.zzc(i2);
        }
        this.zzj.zzc(i2);
        this.zzk.zzc(i2);
    }

    @RequiresNonNull
    private final void zzg(byte[] bArr, int i, int i2) {
        this.zzd.zzc(bArr, i, i2);
        if (!this.zze) {
            this.zzg.zzd(bArr, i, i2);
            this.zzh.zzd(bArr, i, i2);
            this.zzi.zzd(bArr, i, i2);
        }
        this.zzj.zzd(bArr, i, i2);
        this.zzk.zzd(bArr, i, i2);
    }

    @RequiresNonNull
    private final void zzh(long j, int i, int i2, long j2) {
        this.zzd.zzd(j, i, this.zze);
        if (!this.zze) {
            zzamu zzamuVar = this.zzg;
            zzamuVar.zze(i2);
            zzamu zzamuVar2 = this.zzh;
            zzamuVar2.zze(i2);
            zzamu zzamuVar3 = this.zzi;
            zzamuVar3.zze(i2);
            if (zzamuVar.zzb() && zzamuVar2.zzb() && zzamuVar3.zzb()) {
                String str = this.zzb;
                int i3 = zzamuVar.zzb;
                byte[] bArr = new byte[zzamuVar2.zzb + i3 + zzamuVar3.zzb];
                System.arraycopy(zzamuVar.zza, 0, bArr, 0, i3);
                System.arraycopy(zzamuVar2.zza, 0, bArr, zzamuVar.zzb, zzamuVar2.zzb);
                System.arraycopy(zzamuVar3.zza, 0, bArr, zzamuVar.zzb + zzamuVar2.zzb, zzamuVar3.zzb);
                String strZzc = null;
                zzff zzffVarZzf = zzfl.zzf(zzamuVar2.zza, 3, zzamuVar2.zzb, null);
                zzfa zzfaVar = zzffVarZzf.zzb;
                if (zzfaVar != null) {
                    int i4 = zzfaVar.zzf;
                    int[] iArr = zzfaVar.zze;
                    int i5 = zzfaVar.zzd;
                    strZzc = zzdc.zzc(zzfaVar.zza, zzfaVar.zzb, zzfaVar.zzc, i5, iArr, i4);
                }
                zzs zzsVar = new zzs();
                zzsVar.zza(str);
                zzsVar.zzl("video/mp2t");
                zzsVar.zzm("video/hevc");
                zzsVar.zzj(strZzc);
                zzsVar.zzt(zzffVarZzf.zze);
                zzsVar.zzu(zzffVarZzf.zzf);
                zzsVar.zzv(zzffVarZzf.zzg);
                zzsVar.zzw(zzffVarZzf.zzh);
                zzg zzgVar = new zzg();
                zzgVar.zza(zzffVarZzf.zzk);
                zzgVar.zzb(zzffVarZzf.zzl);
                zzgVar.zzc(zzffVarZzf.zzm);
                zzgVar.zze(zzffVarZzf.zzc + 8);
                zzgVar.zzf(zzffVarZzf.zzd + 8);
                zzsVar.zzC(zzgVar.zzg());
                zzsVar.zzz(zzffVarZzf.zzi);
                zzsVar.zzo(zzffVarZzf.zzj);
                zzsVar.zzD(zzffVarZzf.zza + 1);
                zzsVar.zzp(Collections.singletonList(bArr));
                zzu zzuVarZzM = zzsVar.zzM();
                this.zzc.zzu(zzuVarZzM);
                int i6 = zzuVarZzM.zzq;
                zzghc.zzh(i6 != -1);
                this.zza.zzb(i6);
                this.zze = true;
            }
        }
        zzamu zzamuVar4 = this.zzj;
        if (zzamuVar4.zze(i2)) {
            int iZza = zzfl.zza(zzamuVar4.zza, zzamuVar4.zzb);
            zzef zzefVar = this.zzn;
            zzefVar.zzb(zzamuVar4.zza, iZza);
            zzefVar.zzk(5);
            this.zza.zzc(j2, zzefVar);
        }
        zzamu zzamuVar5 = this.zzk;
        if (zzamuVar5.zze(i2)) {
            int iZza2 = zzfl.zza(zzamuVar5.zza, zzamuVar5.zzb);
            zzef zzefVar2 = this.zzn;
            zzefVar2.zzb(zzamuVar5.zza, iZza2);
            zzefVar2.zzk(5);
            this.zza.zzc(j2, zzefVar2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zza() {
        this.zzl = 0L;
        this.zzm = -9223372036854775807L;
        zzfl.zzi(this.zzf);
        this.zzg.zza();
        this.zzh.zza();
        this.zzi.zza();
        this.zzj.zza();
        this.zzk.zza();
        this.zza.zze();
        zzaml zzamlVar = this.zzd;
        if (zzamlVar != null) {
            zzamlVar.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzb(zzacx zzacxVar, zzanr zzanrVar) {
        zzanrVar.zza();
        this.zzb = zzanrVar.zzc();
        zzaeb zzaebVarZzu = zzacxVar.zzu(zzanrVar.zzb(), 2);
        this.zzc = zzaebVarZzu;
        this.zzd = new zzaml(zzaebVarZzu);
        this.zza.zza(zzacxVar, zzanrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzc(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zzd(zzef zzefVar) {
        this.zzc.getClass();
        String str = zzeo.zza;
        while (zzefVar.zzd() > 0) {
            int iZzg = zzefVar.zzg();
            int iZze = zzefVar.zze();
            byte[] bArrZzi = zzefVar.zzi();
            this.zzl += zzefVar.zzd();
            this.zzc.zzz(zzefVar, zzefVar.zzd());
            while (iZzg < iZze) {
                int iZzh = zzfl.zzh(bArrZzi, iZzg, iZze, this.zzf);
                if (iZzh == iZze) {
                    zzg(bArrZzi, iZzg, iZze);
                    return;
                }
                int i = bArrZzi[iZzh + 3] & 126;
                int i2 = 3;
                if (iZzh > 0) {
                    int i3 = iZzh - 1;
                    if (bArrZzi[i3] == 0) {
                        i2 = 4;
                        iZzh = i3;
                    }
                }
                int i4 = iZzh - iZzg;
                if (i4 > 0) {
                    zzg(bArrZzi, iZzg, iZzh);
                }
                int i5 = iZze - iZzh;
                long j = this.zzl - i5;
                zzh(j, i5, i4 < 0 ? -i4 : 0, this.zzm);
                zzf(j, i5, i >> 1, this.zzm);
                iZzg = iZzh + i2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamd
    public final void zze(boolean z) {
        this.zzc.getClass();
        String str = zzeo.zza;
        if (z) {
            this.zza.zzd();
            zzh(this.zzl, 0, 0, this.zzm);
            zzf(this.zzl, 0, 48, this.zzm);
        }
    }
}
