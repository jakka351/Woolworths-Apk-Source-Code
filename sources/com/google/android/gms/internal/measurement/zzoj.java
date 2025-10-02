package com.google.android.gms.internal.measurement;

import YU.a;
import au.com.woolworths.shop.checkout.ui.confirmation.c;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzoj {
    private static final zzoj zza = new zzoj(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzoj(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzoj zza() {
        return zza;
    }

    public static zzoj zzb() {
        return new zzoj(0, new int[8], new Object[8], true);
    }

    public static zzoj zzc(zzoj zzojVar, zzoj zzojVar2) {
        int i = zzojVar.zzb + zzojVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzojVar.zzc, i);
        System.arraycopy(zzojVar2.zzc, 0, iArrCopyOf, zzojVar.zzb, zzojVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzojVar.zzd, i);
        System.arraycopy(zzojVar2.zzd, 0, objArrCopyOf, zzojVar.zzb, zzojVar2.zzb);
        return new zzoj(i, iArrCopyOf, objArrCopyOf, true);
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
        if (obj == null || !(obj instanceof zzoj)) {
            return false;
        }
        zzoj zzojVar = (zzoj) obj;
        int i = this.zzb;
        if (i == zzojVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzojVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzojVar.zzd;
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

    public final void zzd() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zze() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzf(zzov zzovVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzovVar.zzv(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzg(zzov zzovVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzovVar.zzc(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzovVar.zzj(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzovVar.zzn(i4, (zzlh) obj);
                } else if (i3 == 3) {
                    zzovVar.zzt(i4);
                    ((zzoj) obj).zzg(zzovVar);
                    zzovVar.zzu(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new zzmq("Protocol message tag had invalid wire type."));
                    }
                    zzovVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int zzh() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iB = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2] >>> 3;
            zzlh zzlhVar = (zzlh) this.zzd[i2];
            int iZzz = zzlm.zzz(8);
            int iZzz2 = zzlm.zzz(i3) + zzlm.zzz(16);
            int iZzz3 = zzlm.zzz(24);
            int iZzc = zzlhVar.zzc();
            iB = a.b(iZzz + iZzz, iZzz2, c.A(iZzc, iZzc, iZzz3), iB);
        }
        this.zze = iB;
        return iB;
    }

    public final int zzi() {
        int iZzz;
        int iZzA;
        int iZzz2;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzz3 = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 == 1) {
                    ((Long) this.zzd[i2]).getClass();
                    iZzz2 = zzlm.zzz(i4 << 3) + 8;
                } else if (i5 == 2) {
                    int i6 = i4 << 3;
                    zzlh zzlhVar = (zzlh) this.zzd[i2];
                    int iZzz4 = zzlm.zzz(i6);
                    int iZzc = zzlhVar.zzc();
                    iZzz3 = zzlm.zzz(iZzc) + iZzc + iZzz4 + iZzz3;
                } else if (i5 == 3) {
                    int iZzz5 = zzlm.zzz(i4 << 3);
                    iZzz = iZzz5 + iZzz5;
                    iZzA = ((zzoj) this.zzd[i2]).zzi();
                } else {
                    if (i5 != 5) {
                        throw new IllegalStateException(new zzmq("Protocol message tag had invalid wire type."));
                    }
                    ((Integer) this.zzd[i2]).getClass();
                    iZzz2 = zzlm.zzz(i4 << 3) + 4;
                }
                iZzz3 = iZzz2 + iZzz3;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.zzd[i2]).longValue();
                iZzz = zzlm.zzz(i7);
                iZzA = zzlm.zzA(jLongValue);
            }
            iZzz3 = iZzA + iZzz + iZzz3;
        }
        this.zze = iZzz3;
        return iZzz3;
    }

    public final void zzj(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzno.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    public final void zzk(int i, Object obj) {
        zze();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final zzoj zzl(zzoj zzojVar) {
        if (zzojVar.equals(zza)) {
            return this;
        }
        zze();
        int i = this.zzb + zzojVar.zzb;
        zzm(i);
        System.arraycopy(zzojVar.zzc, 0, this.zzc, this.zzb, zzojVar.zzb);
        System.arraycopy(zzojVar.zzd, 0, this.zzd, this.zzb, zzojVar.zzb);
        this.zzb = i;
        return this;
    }

    private zzoj() {
        this(0, new int[8], new Object[8], true);
    }
}
