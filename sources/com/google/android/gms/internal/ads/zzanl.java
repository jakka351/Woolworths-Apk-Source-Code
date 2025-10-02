package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseIntArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzanl implements zzand {
    final /* synthetic */ zzann zza;
    private final zzee zzb;
    private final SparseArray zzc;
    private final SparseIntArray zzd;
    private final int zze;

    public zzanl(zzann zzannVar, int i) {
        Objects.requireNonNull(zzannVar);
        this.zza = zzannVar;
        this.zzb = new zzee(new byte[5], 5);
        this.zzc = new SparseArray();
        this.zzd = new SparseIntArray();
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final void zza(zzel zzelVar, zzacx zzacxVar, zzanr zzanrVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzand
    public final void zzb(zzef zzefVar) {
        zzann zzannVar;
        int i;
        zzee zzeeVar;
        int i2;
        int i3;
        if (zzefVar.zzs() != 2) {
            return;
        }
        zzann zzannVar2 = this.zza;
        zzel zzelVar = (zzel) zzannVar2.zza().get(0);
        if ((zzefVar.zzs() & 128) != 0) {
            zzefVar.zzk(1);
            int iZzt = zzefVar.zzt();
            int i4 = 3;
            zzefVar.zzk(3);
            zzee zzeeVar2 = this.zzb;
            zzefVar.zzl(zzeeVar2, 2);
            zzeeVar2.zzh(3);
            int i5 = 13;
            zzannVar2.zzp(zzeeVar2.zzj(13));
            zzefVar.zzl(zzeeVar2, 2);
            int i6 = 4;
            zzeeVar2.zzh(4);
            int i7 = 12;
            zzefVar.zzk(zzeeVar2.zzj(12));
            SparseArray sparseArray = this.zzc;
            sparseArray.clear();
            SparseIntArray sparseIntArray = this.zzd;
            sparseIntArray.clear();
            int iZzd = zzefVar.zzd();
            while (iZzd > 0) {
                int i8 = 5;
                zzefVar.zzl(zzeeVar2, 5);
                int iZzj = zzeeVar2.zzj(8);
                zzeeVar2.zzh(i4);
                int iZzj2 = zzeeVar2.zzj(i5);
                zzeeVar2.zzh(i6);
                int iZzj3 = zzeeVar2.zzj(i7);
                int iZzg = zzefVar.zzg();
                int i9 = iZzg + iZzj3;
                String str = null;
                ArrayList arrayList = null;
                int i10 = -1;
                int iZzs = 0;
                while (zzefVar.zzg() < i9) {
                    int iZzs2 = zzefVar.zzs();
                    int iZzg2 = zzefVar.zzg() + zzefVar.zzs();
                    if (iZzg2 > i9) {
                        break;
                    }
                    if (iZzs2 == i8) {
                        long jZzz = zzefVar.zzz();
                        if (jZzz != 1094921523) {
                            if (jZzz != 1161904947) {
                                if (jZzz != 1094921524) {
                                    if (jZzz == 1212503619) {
                                        i3 = 36;
                                        zzannVar = zzannVar2;
                                        i10 = i3;
                                        i = iZzg2;
                                        zzeeVar = zzeeVar2;
                                        i2 = iZzd;
                                    }
                                    zzannVar = zzannVar2;
                                    i = iZzg2;
                                    zzeeVar = zzeeVar2;
                                    i2 = iZzd;
                                }
                                zzannVar = zzannVar2;
                                i = iZzg2;
                                zzeeVar = zzeeVar2;
                                i2 = iZzd;
                                i10 = 172;
                            }
                            zzannVar = zzannVar2;
                            zzeeVar = zzeeVar2;
                            i2 = iZzd;
                            i10 = 135;
                            i = iZzg2;
                        }
                        zzannVar = zzannVar2;
                        i = iZzg2;
                        zzeeVar = zzeeVar2;
                        i2 = iZzd;
                        i10 = 129;
                    } else {
                        if (iZzs2 != 106) {
                            if (iZzs2 == 122) {
                                zzannVar = zzannVar2;
                                zzeeVar = zzeeVar2;
                                i2 = iZzd;
                                i10 = 135;
                                i = iZzg2;
                            } else {
                                if (iZzs2 == 127) {
                                    int iZzs3 = zzefVar.zzs();
                                    if (iZzs3 != 21) {
                                        if (iZzs3 == 14) {
                                            i3 = 136;
                                        } else {
                                            if (iZzs3 == 33) {
                                                i3 = 139;
                                            }
                                            zzannVar = zzannVar2;
                                            i = iZzg2;
                                            zzeeVar = zzeeVar2;
                                            i2 = iZzd;
                                        }
                                    }
                                    zzannVar = zzannVar2;
                                    i = iZzg2;
                                    zzeeVar = zzeeVar2;
                                    i2 = iZzd;
                                    i10 = 172;
                                } else if (iZzs2 == 123) {
                                    i3 = 138;
                                } else if (iZzs2 == 10) {
                                    String strTrim = zzefVar.zzK(3, StandardCharsets.UTF_8).trim();
                                    iZzs = zzefVar.zzs();
                                    zzannVar = zzannVar2;
                                    str = strTrim;
                                    i = iZzg2;
                                    zzeeVar = zzeeVar2;
                                    i2 = iZzd;
                                } else if (iZzs2 == 89) {
                                    ArrayList arrayList2 = new ArrayList();
                                    while (zzefVar.zzg() < iZzg2) {
                                        int i11 = iZzg2;
                                        String strTrim2 = zzefVar.zzK(3, StandardCharsets.UTF_8).trim();
                                        int iZzs4 = zzefVar.zzs();
                                        int i12 = iZzd;
                                        byte[] bArr = new byte[4];
                                        zzefVar.zzm(bArr, 0, 4);
                                        arrayList2.add(new zzano(strTrim2, iZzs4, bArr));
                                        iZzd = i12;
                                        iZzg2 = i11;
                                        zzeeVar2 = zzeeVar2;
                                        zzannVar2 = zzannVar2;
                                    }
                                    zzannVar = zzannVar2;
                                    i = iZzg2;
                                    zzeeVar = zzeeVar2;
                                    i2 = iZzd;
                                    arrayList = arrayList2;
                                    i10 = 89;
                                } else {
                                    zzannVar = zzannVar2;
                                    i = iZzg2;
                                    zzeeVar = zzeeVar2;
                                    i2 = iZzd;
                                    if (iZzs2 == 111) {
                                        i10 = 257;
                                    }
                                }
                                zzannVar = zzannVar2;
                                i10 = i3;
                                i = iZzg2;
                                zzeeVar = zzeeVar2;
                                i2 = iZzd;
                            }
                        }
                        zzannVar = zzannVar2;
                        i = iZzg2;
                        zzeeVar = zzeeVar2;
                        i2 = iZzd;
                        i10 = 129;
                    }
                    zzefVar.zzk(i - zzefVar.zzg());
                    iZzd = i2;
                    zzeeVar2 = zzeeVar;
                    zzannVar2 = zzannVar;
                    i8 = 5;
                }
                zzann zzannVar3 = zzannVar2;
                zzee zzeeVar3 = zzeeVar2;
                int i13 = iZzd;
                zzefVar.zzh(i9);
                zzanp zzanpVar = new zzanp(i10, str, iZzs, arrayList, Arrays.copyOfRange(zzefVar.zzi(), iZzg, i9));
                if (iZzj == 6 || iZzj == 5) {
                    iZzj = zzanpVar.zza;
                }
                iZzd = i13 - (iZzj3 + 5);
                if (!zzannVar3.zzj().get(iZzj2)) {
                    zzans zzansVarZzb = zzannVar3.zzb().zzb(iZzj, zzanpVar);
                    sparseIntArray.put(iZzj2, iZzj2);
                    sparseArray.put(iZzj2, zzansVarZzb);
                }
                i6 = 4;
                zzeeVar2 = zzeeVar3;
                zzannVar2 = zzannVar3;
                i4 = 3;
                i5 = 13;
                i7 = 12;
            }
            zzann zzannVar4 = zzannVar2;
            int size = sparseIntArray.size();
            for (int i14 = 0; i14 < size; i14++) {
                int iKeyAt = sparseIntArray.keyAt(i14);
                int iValueAt = sparseIntArray.valueAt(i14);
                zzannVar4.zzj().put(iKeyAt, true);
                zzannVar4.zzk().put(iValueAt, true);
                zzans zzansVar = (zzans) sparseArray.valueAt(i14);
                if (zzansVar != null) {
                    zzansVar.zza(zzelVar, zzannVar4.zzl(), new zzanr(iZzt, iKeyAt, 8192));
                    zzannVar4.zzc().put(iValueAt, zzansVar);
                }
            }
            zzannVar4.zzc().remove(this.zze);
            zzannVar4.zzn(0);
            if (zzannVar4.zzm() == 0) {
                zzannVar4.zzl().zzv();
                zzannVar4.zzo(true);
            }
        }
    }
}
