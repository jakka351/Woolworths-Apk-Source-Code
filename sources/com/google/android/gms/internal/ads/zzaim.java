package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzaim implements zzacu, zzadv {
    public static final /* synthetic */ int zza = 0;
    private int zzA;
    private long zzB;
    private int zzC;

    @Nullable
    private zzago zzD;
    private final zzajt zzb;
    private final int zzc;
    private final zzef zzd;
    private final zzef zze;
    private final zzef zzf;
    private final zzef zzg;
    private final ArrayDeque zzh;
    private final zzaiq zzi;
    private final List zzj;
    private zzgjz zzk;
    private int zzl;
    private int zzm;
    private long zzn;
    private int zzo;

    @Nullable
    private zzef zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private boolean zzu;
    private boolean zzv;
    private long zzw;
    private zzacx zzx;
    private zzail[] zzy;

    @Nullable
    private long[][] zzz;

    @Deprecated
    public zzaim() {
        this(zzajt.zza, 16);
    }

    private final void zzj() {
        this.zzl = 0;
        this.zzo = 0;
    }

    private final void zzk(long j) throws zzas {
        zzao zzaoVarZzc;
        int i;
        boolean z;
        ArrayDeque arrayDeque;
        int i2;
        List list;
        zzao zzaoVar;
        int i3;
        zzadk zzadkVar;
        zzao zzaoVar2;
        ArrayList arrayList;
        while (true) {
            ArrayDeque arrayDeque2 = this.zzh;
            if (arrayDeque2.isEmpty() || ((zzet) arrayDeque2.peek()).zza != j) {
                break;
            }
            zzet zzetVar = (zzet) arrayDeque2.pop();
            if (zzetVar.zzd == 1836019574) {
                zzet zzetVarZzd = zzetVar.zzd(1835365473);
                new ArrayList();
                zzao zzaoVarZze = zzetVarZzd != null ? zzahy.zze(zzetVarZzd) : null;
                ArrayList arrayList2 = new ArrayList();
                boolean z2 = this.zzC == 1;
                zzadk zzadkVar2 = new zzadk();
                zzeu zzeuVarZzc = zzetVar.zzc(1969517665);
                if (zzeuVarZzc != null) {
                    zzaoVarZzc = zzahy.zzc(zzeuVarZzc);
                    zzadkVar2.zza(zzaoVarZzc);
                } else {
                    zzaoVarZzc = null;
                }
                zzeu zzeuVarZzc2 = zzetVar.zzc(1836476516);
                zzeuVarZzc2.getClass();
                ArrayList arrayList3 = arrayList2;
                zzao zzaoVar3 = new zzao(-9223372036854775807L, zzahy.zzd(zzeuVarZzc2.zza));
                int i4 = this.zzc;
                if (1 != (i4 & 1)) {
                    i = i4;
                    z = false;
                } else {
                    i = i4;
                    z = true;
                }
                int i5 = i;
                zzao zzaoVar4 = zzaoVarZzc;
                List listZzb = zzahy.zzb(zzetVar, zzadkVar2, -9223372036854775807L, null, z, z2, zzaik.zza, false);
                String strZza = zzaii.zza(listZzb);
                int i6 = 0;
                int i7 = 0;
                long jMax = -9223372036854775807L;
                int size = -1;
                while (i6 < listZzb.size()) {
                    zzaiv zzaivVar = (zzaiv) listZzb.get(i6);
                    if (zzaivVar.zzb == 0) {
                        arrayDeque = arrayDeque2;
                        list = listZzb;
                        zzadkVar = zzadkVar2;
                        i3 = i6;
                        i2 = i7;
                        arrayList = arrayList3;
                        zzaoVar = zzaoVarZze;
                    } else {
                        zzais zzaisVar = zzaivVar.zza;
                        arrayDeque = arrayDeque2;
                        zzacx zzacxVar = this.zzx;
                        i2 = i7 + 1;
                        list = listZzb;
                        int i8 = zzaisVar.zzb;
                        zzail zzailVar = new zzail(zzaisVar, zzaivVar, zzacxVar.zzu(i7, i8));
                        zzaoVar = zzaoVarZze;
                        long j2 = zzaisVar.zze;
                        if (j2 == -9223372036854775807L) {
                            j2 = zzaivVar.zzh;
                        }
                        i3 = i6;
                        zzaeb zzaebVar = zzailVar.zzc;
                        jMax = Math.max(jMax, j2);
                        zzu zzuVar = zzaisVar.zzg;
                        String str = zzuVar.zzo;
                        int i9 = "audio/true-hd".equals(str) ? zzaivVar.zze * 16 : zzaivVar.zze + 30;
                        zzs zzsVarZza = zzuVar.zza();
                        zzsVarZza.zzn(i9);
                        if (i8 == 2) {
                            int i10 = zzuVar.zzf;
                            if ((i5 & 8) != 0) {
                                i10 |= size == -1 ? 1 : 2;
                            }
                            zzsVarZza.zzg(i10);
                            i8 = 2;
                        }
                        zzaih.zzb(i8, zzadkVar2, zzsVarZza);
                        zzao zzaoVar5 = zzuVar.zzl;
                        List list2 = this.zzj;
                        if (list2.isEmpty()) {
                            zzadkVar = zzadkVar2;
                            zzaoVar2 = null;
                        } else {
                            zzadkVar = zzadkVar2;
                            zzaoVar2 = new zzao(list2);
                        }
                        zzaih.zza(i8, zzaoVar, zzsVarZza, zzaoVar5, zzaoVar2, zzaoVar4, zzaoVar3);
                        zzsVarZza.zzl(strZza);
                        if (Objects.equals(str, "audio/mpeg")) {
                            zzailVar.zzf = zzsVarZza.zzM();
                        } else {
                            zzaebVar.zzu(zzsVarZza.zzM());
                        }
                        if (i8 == 2 && size == -1) {
                            size = arrayList3.size();
                        }
                        arrayList = arrayList3;
                        arrayList.add(zzailVar);
                    }
                    i6 = i3 + 1;
                    arrayList3 = arrayList;
                    zzaoVarZze = zzaoVar;
                    arrayDeque2 = arrayDeque;
                    i7 = i2;
                    listZzb = list;
                    zzadkVar2 = zzadkVar;
                }
                ArrayDeque arrayDeque3 = arrayDeque2;
                this.zzA = size;
                this.zzB = jMax;
                zzail[] zzailVarArr = (zzail[]) arrayList3.toArray(new zzail[0]);
                this.zzy = zzailVarArr;
                int length = zzailVarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i11 = 0; i11 < zzailVarArr.length; i11++) {
                    jArr[i11] = new long[zzailVarArr[i11].zzb.zzb];
                    jArr2[i11] = zzailVarArr[i11].zzb.zzf[0];
                }
                long j3 = 0;
                int i12 = 0;
                while (i12 < zzailVarArr.length) {
                    long j4 = Long.MAX_VALUE;
                    int i13 = -1;
                    for (int i14 = 0; i14 < zzailVarArr.length; i14++) {
                        if (!zArr[i14]) {
                            long j5 = jArr2[i14];
                            if (j5 <= j4) {
                                i13 = i14;
                                j4 = j5;
                            }
                        }
                    }
                    int i15 = iArr[i13];
                    long[] jArr3 = jArr[i13];
                    jArr3[i15] = j3;
                    zzaiv zzaivVar2 = zzailVarArr[i13].zzb;
                    j3 += zzaivVar2.zzd[i15];
                    int i16 = i15 + 1;
                    iArr[i13] = i16;
                    if (i16 < jArr3.length) {
                        jArr2[i13] = zzaivVar2.zzf[i16];
                    } else {
                        zArr[i13] = true;
                        i12++;
                    }
                }
                this.zzz = jArr;
                this.zzx.zzv();
                this.zzx.zzw(this);
                arrayDeque3.clear();
                this.zzl = 2;
            } else if (!arrayDeque2.isEmpty()) {
                ((zzet) arrayDeque2.peek()).zzb(zzetVar);
            }
        }
        if (this.zzl != 2) {
            zzj();
        }
    }

    private static long zzl(zzaiv zzaivVar, long j, long j2) {
        int iZzm = zzm(zzaivVar, j);
        return iZzm == -1 ? j2 : Math.min(zzaivVar.zzc[iZzm], j2);
    }

    private static int zzm(zzaiv zzaivVar, long j) {
        int iZza = zzaivVar.zza(j);
        return iZza == -1 ? zzaivVar.zzb(j) : iZza;
    }

    private static int zzn(int i) {
        if (i != 1751476579) {
            return i != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zzB;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzb() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final zzadt zzc(long j) {
        long j2;
        long j3;
        long jZzl;
        long j4;
        int iZzb;
        long j5 = j;
        zzail[] zzailVarArr = this.zzy;
        if (zzailVarArr.length == 0) {
            zzadw zzadwVar = zzadw.zza;
            return new zzadt(zzadwVar, zzadwVar);
        }
        int i = this.zzA;
        if (i != -1) {
            zzaiv zzaivVar = zzailVarArr[i].zzb;
            int iZzm = zzm(zzaivVar, j5);
            if (iZzm == -1) {
                zzadw zzadwVar2 = zzadw.zza;
                return new zzadt(zzadwVar2, zzadwVar2);
            }
            long[] jArr = zzaivVar.zzf;
            long j6 = jArr[iZzm];
            long[] jArr2 = zzaivVar.zzc;
            j2 = jArr2[iZzm];
            if (j6 >= j5 || iZzm >= zzaivVar.zzb - 1 || (iZzb = zzaivVar.zzb(j5)) == -1 || iZzb == iZzm) {
                j4 = -9223372036854775807L;
                jZzl = -1;
            } else {
                j4 = jArr[iZzb];
                jZzl = jArr2[iZzb];
            }
            j3 = j4;
            j5 = j6;
        } else {
            j2 = Long.MAX_VALUE;
            j3 = -9223372036854775807L;
            jZzl = -1;
        }
        int i2 = 0;
        while (true) {
            zzail[] zzailVarArr2 = this.zzy;
            if (i2 >= zzailVarArr2.length) {
                break;
            }
            if (i2 != this.zzA) {
                zzaiv zzaivVar2 = zzailVarArr2[i2].zzb;
                long jZzl2 = zzl(zzaivVar2, j5, j2);
                if (j3 != -9223372036854775807L) {
                    jZzl = zzl(zzaivVar2, j3, jZzl);
                }
                j2 = jZzl2;
            }
            i2++;
        }
        zzadw zzadwVar3 = new zzadw(j5, j2);
        return j3 == -9223372036854775807L ? new zzadt(zzadwVar3, zzadwVar3) : new zzadt(zzadwVar3, new zzadw(j3, jZzl));
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final boolean zzd(zzacv zzacvVar) throws IOException {
        zzadz zzadzVarZzb = zzair.zzb(zzacvVar, (this.zzc & 2) != 0);
        this.zzk = zzadzVarZzb != null ? zzgjz.zzj(zzadzVarZzb) : zzgjz.zzi();
        return zzadzVarZzb == null;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final /* synthetic */ List zze() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzf(zzacx zzacxVar) {
        if ((this.zzc & 16) == 0) {
            zzacxVar = new zzajw(zzacxVar, this.zzb);
        }
        this.zzx = zzacxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:311:0x009c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:313:0x018e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0165  */
    @Override // com.google.android.gms.internal.ads.zzacu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzg(com.google.android.gms.internal.ads.zzacv r34, com.google.android.gms.internal.ads.zzads r35) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaim.zzg(com.google.android.gms.internal.ads.zzacv, com.google.android.gms.internal.ads.zzads):int");
    }

    @Override // com.google.android.gms.internal.ads.zzacu
    public final void zzh(long j, long j2) {
        this.zzh.clear();
        this.zzo = 0;
        this.zzq = -1;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = false;
        if (j == 0) {
            if (this.zzl != 3) {
                zzj();
                return;
            } else {
                this.zzi.zza();
                this.zzj.clear();
                return;
            }
        }
        for (zzail zzailVar : this.zzy) {
            zzaiv zzaivVar = zzailVar.zzb;
            int iZza = zzaivVar.zza(j2);
            if (iZza == -1) {
                iZza = zzaivVar.zzb(j2);
            }
            zzailVar.zze = iZza;
            zzaec zzaecVar = zzailVar.zzd;
            if (zzaecVar != null) {
                zzaecVar.zza();
            }
        }
    }

    public zzaim(zzajt zzajtVar, int i) {
        this.zzb = zzajtVar;
        this.zzc = i;
        this.zzk = zzgjz.zzi();
        this.zzl = (i & 4) != 0 ? 3 : 0;
        this.zzi = new zzaiq();
        this.zzj = new ArrayList();
        this.zzg = new zzef(16);
        this.zzh = new ArrayDeque();
        this.zzd = new zzef(zzfl.zza);
        this.zze = new zzef(6);
        this.zzf = new zzef();
        this.zzq = -1;
        this.zzx = zzacx.zza;
        this.zzy = new zzail[0];
    }
}
