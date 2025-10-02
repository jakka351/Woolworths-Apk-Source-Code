package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
final class zzahj implements zzahi {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;
    private final int zze;

    private zzahj(long[] jArr, long[] jArr2, long j, long j2, long j3, int i) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j3;
        this.zze = i;
    }

    @Nullable
    public static zzahj zzd(long j, long j2, zzado zzadoVar, zzef zzefVar) {
        int iZzs;
        zzef zzefVar2 = zzefVar;
        zzefVar2.zzk(6);
        int iZzB = zzefVar2.zzB();
        long j3 = zzadoVar.zzc;
        long j4 = iZzB;
        if (zzefVar2.zzB() <= 0) {
            return null;
        }
        long jZzr = zzeo.zzr((r4 * zzadoVar.zzg) - 1, zzadoVar.zzd);
        int iZzt = zzefVar2.zzt();
        int iZzt2 = zzefVar2.zzt();
        int iZzt3 = zzefVar2.zzt();
        zzefVar2.zzk(2);
        long[] jArr = new long[iZzt];
        long[] jArr2 = new long[iZzt];
        int i = 0;
        long j5 = j2 + zzadoVar.zzc;
        while (i < iZzt) {
            long j6 = j3;
            jArr[i] = (i * jZzr) / iZzt;
            jArr2[i] = j5;
            if (iZzt3 == 1) {
                iZzs = zzefVar2.zzs();
            } else if (iZzt3 == 2) {
                iZzs = zzefVar2.zzt();
            } else if (iZzt3 == 3) {
                iZzs = zzefVar2.zzx();
            } else {
                if (iZzt3 != 4) {
                    return null;
                }
                iZzs = zzefVar2.zzH();
            }
            j5 += iZzs * iZzt2;
            i++;
            zzefVar2 = zzefVar;
            iZzt = iZzt;
            j3 = j6;
        }
        long j7 = j2 + j3;
        long jMax = j7 + j4;
        if (j != -1 && j != jMax) {
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 27 + String.valueOf(jMax).length());
            androidx.constraintlayout.core.state.a.A(sb, "VBRI data size mismatch: ", j, ", ");
            sb.append(jMax);
            zzds.zzc("VbriSeeker", sb.toString());
        }
        if (jMax != j5) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(j5).length() + String.valueOf(jMax).length() + 43 + 28);
            androidx.constraintlayout.core.state.a.A(sb2, "VBRI bytes and ToC mismatch (using max): ", jMax, ", ");
            sb2.append(j5);
            sb2.append("\nSeeking will be inaccurate.");
            zzds.zzc("VbriSeeker", sb2.toString());
            jMax = Math.max(jMax, j5);
        }
        return new zzahj(jArr, jArr2, jZzr, j7, jMax, zzadoVar.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j) {
        long[] jArr = this.zza;
        int iZzm = zzeo.zzm(jArr, j, true, true);
        long j2 = jArr[iZzm];
        long[] jArr2 = this.zzb;
        zzadw zzadwVar = new zzadw(j2, jArr2[iZzm]);
        if (zzadwVar.zzb >= j || iZzm == jArr.length - 1) {
            return new zzadt(zzadwVar, zzadwVar);
        }
        int i = iZzm + 1;
        return new zzadt(zzadwVar, new zzadw(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final long zze(long j) {
        return this.zza[zzeo.zzm(this.zzb, j, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final long zzf() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahi
    public final int zzg() {
        return this.zze;
    }
}
