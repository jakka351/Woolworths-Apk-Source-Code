package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzanx {
    private static final zzanx zza = new zzanx(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzanx() {
        this(0, new int[8], new Object[8], true);
    }

    public static zzanx zzc() {
        return zza;
    }

    public static zzanx zzd() {
        return new zzanx();
    }

    private final void zzf() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzanx)) {
            return false;
        }
        zzanx zzanxVar = (zzanx) obj;
        int i = this.zzb;
        if (i == zzanxVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzanxVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzanxVar.zzd;
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
        int i2 = (i + 527) * 31;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.zzd;
        int i6 = this.zzb;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final int zza() {
        int iZze;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZza = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iZze = zzakn.zze(i4, ((Long) this.zzd[i2]).longValue());
            } else if (i5 == 1) {
                iZze = zzakn.zza(i4, ((Long) this.zzd[i2]).longValue());
            } else if (i5 == 2) {
                iZze = zzakn.zza(i4, (zzajv) this.zzd[i2]);
            } else if (i5 == 3) {
                iZza = ((zzanx) this.zzd[i2]).zza() + (zzakn.zzh(i4) << 1) + iZza;
            } else {
                if (i5 != 5) {
                    throw new IllegalStateException(zzall.zza());
                }
                iZze = zzakn.zzb(i4, ((Integer) this.zzd[i2]).intValue());
            }
            iZza = iZze + iZza;
        }
        this.zze = iZza;
        return iZza;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzb = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            iZzb += zzakn.zzb(this.zzc[i2] >>> 3, (zzajv) this.zzd[i2]);
        }
        this.zze = iZzb;
        return iZzb;
    }

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    private zzanx(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public final void zzb(zzaol zzaolVar) throws IOException {
        if (this.zzb == 0) {
            return;
        }
        if (zzaolVar.zza() == 1) {
            for (int i = 0; i < this.zzb; i++) {
                zza(this.zzc[i], this.zzd[i], zzaolVar);
            }
            return;
        }
        for (int i2 = this.zzb - 1; i2 >= 0; i2--) {
            zza(this.zzc[i2], this.zzd[i2], zzaolVar);
        }
    }

    public final zzanx zza(zzanx zzanxVar) {
        if (zzanxVar.equals(zza)) {
            return this;
        }
        zzf();
        int i = this.zzb + zzanxVar.zzb;
        zza(i);
        System.arraycopy(zzanxVar.zzc, 0, this.zzc, this.zzb, zzanxVar.zzb);
        System.arraycopy(zzanxVar.zzd, 0, this.zzd, this.zzb, zzanxVar.zzb);
        this.zzb = i;
        return this;
    }

    public static zzanx zza(zzanx zzanxVar, zzanx zzanxVar2) {
        int i = zzanxVar.zzb + zzanxVar2.zzb;
        int[] iArrCopyOf = Arrays.copyOf(zzanxVar.zzc, i);
        System.arraycopy(zzanxVar2.zzc, 0, iArrCopyOf, zzanxVar.zzb, zzanxVar2.zzb);
        Object[] objArrCopyOf = Arrays.copyOf(zzanxVar.zzd, i);
        System.arraycopy(zzanxVar2.zzd, 0, objArrCopyOf, zzanxVar.zzb, zzanxVar2.zzb);
        return new zzanx(i, iArrCopyOf, objArrCopyOf, true);
    }

    private final void zza(int i) {
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

    public final void zza(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzamn.zza(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    public final void zza(int i, Object obj) {
        zzf();
        zza(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zza(zzaol zzaolVar) throws IOException {
        if (zzaolVar.zza() == 2) {
            for (int i = this.zzb - 1; i >= 0; i--) {
                zzaolVar.zza(this.zzc[i] >>> 3, this.zzd[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzaolVar.zza(this.zzc[i2] >>> 3, this.zzd[i2]);
        }
    }

    private static void zza(int i, Object obj, zzaol zzaolVar) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zzaolVar.zzb(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 1) {
            zzaolVar.zza(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 2) {
            zzaolVar.zza(i2, (zzajv) obj);
            return;
        }
        if (i3 != 3) {
            if (i3 == 5) {
                zzaolVar.zzb(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzall.zza());
        }
        if (zzaolVar.zza() == 1) {
            zzaolVar.zzb(i2);
            ((zzanx) obj).zzb(zzaolVar);
            zzaolVar.zza(i2);
        } else {
            zzaolVar.zza(i2);
            ((zzanx) obj).zzb(zzaolVar);
            zzaolVar.zzb(i2);
        }
    }
}
