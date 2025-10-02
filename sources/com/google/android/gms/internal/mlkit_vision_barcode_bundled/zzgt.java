package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import YU.a;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzgt {
    private static final zzgt zza = new zzgt(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzgt(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzgt zzc() {
        return zza;
    }

    public static zzgt zze(zzgt zzgtVar, zzgt zzgtVar2) {
        int i = zzgtVar.zzb + zzgtVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzgtVar.zzc, i);
        System.arraycopy(zzgtVar2.zzc, 0, iArrCopyOf, zzgtVar.zzb, zzgtVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzgtVar.zzd, i);
        System.arraycopy(zzgtVar2.zzd, 0, objArrCopyOf, zzgtVar.zzb, zzgtVar2.zzb);
        return new zzgt(i, iArrCopyOf, objArrCopyOf, true);
    }

    public static zzgt zzf() {
        return new zzgt(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzgt)) {
            return false;
        }
        zzgt zzgtVar = (zzgt) obj;
        int i = this.zzb;
        if (i == zzgtVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzgtVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzgtVar.zzd;
                    int i3 = this.zzb;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int iB = a.B(i2, 31, i3, 31);
        Object[] objArr = this.zzd;
        int i5 = this.zzb;
        for (int i6 = 0; i6 < i5; i6++) {
            iHashCode = (iHashCode * 31) + objArr[i6].hashCode();
        }
        return iB + iHashCode;
    }

    public final int zza() {
        int iZzA;
        int iZzB;
        int iZzA2;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzA3 = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 == 1) {
                    ((Long) this.zzd[i2]).getClass();
                    iZzA2 = zzdn.zzA(i4 << 3) + 8;
                } else if (i5 == 2) {
                    int i6 = i4 << 3;
                    zzdf zzdfVar = (zzdf) this.zzd[i2];
                    int iZzA4 = zzdn.zzA(i6);
                    int iZzd = zzdfVar.zzd();
                    iZzA3 = zzdn.zzA(iZzd) + iZzd + iZzA4 + iZzA3;
                } else if (i5 == 3) {
                    int iZzA5 = zzdn.zzA(i4 << 3);
                    iZzA = iZzA5 + iZzA5;
                    iZzB = ((zzgt) this.zzd[i2]).zza();
                } else {
                    if (i5 != 5) {
                        throw new IllegalStateException(new zzeq("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i2]).getClass();
                    iZzA2 = zzdn.zzA(i4 << 3) + 4;
                }
                iZzA3 = iZzA2 + iZzA3;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.zzd[i2]).longValue();
                iZzA = zzdn.zzA(i7);
                iZzB = zzdn.zzB(jLongValue);
            }
            iZzA3 = iZzB + iZzA + iZzA3;
        }
        this.zze = iZzA3;
        return iZzA3;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iB = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2] >>> 3;
            zzdf zzdfVar = (zzdf) this.zzd[i2];
            int iZzA = zzdn.zzA(8);
            int iZzA2 = zzdn.zzA(i3) + zzdn.zzA(16);
            int iZzA3 = zzdn.zzA(24);
            int iZzd = zzdfVar.zzd();
            iB = a.b(iZzA + iZzA, iZzA2, com.google.android.gms.common.api.internal.a.w(iZzd, iZzd, iZzA3), iB);
        }
        this.zze = iB;
        return iB;
    }

    public final zzgt zzd(zzgt zzgtVar) {
        if (zzgtVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzgtVar.zzb;
        zzm(i);
        System.arraycopy(zzgtVar.zzc, 0, this.zzc, this.zzb, zzgtVar.zzb);
        System.arraycopy(zzgtVar.zzd, 0, this.zzd, this.zzb, zzgtVar.zzb);
        this.zzb = i;
        return this;
    }

    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzfo.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    public final void zzj(int i, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zzk(zzhh zzhhVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzhhVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(zzhh zzhhVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzhhVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzhhVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzhhVar.zzd(i4, (zzdf) obj);
                } else if (i3 == 3) {
                    zzhhVar.zzF(i4);
                    ((zzgt) obj).zzl(zzhhVar);
                    zzhhVar.zzh(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new zzeq("Protocol message tag had invalid wire type."));
                    }
                    zzhhVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    private zzgt() {
        this(0, new int[8], new Object[8], true);
    }
}
