package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzado {
    public int zza;

    @Nullable
    public String zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public int zzf;
    public int zzg;

    public zzado() {
    }

    public final boolean zza(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (!zzadp.zzl(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i6 = i4 - 1;
        this.zza = i2;
        this.zzb = zzadp.zza[3 - i3];
        int i7 = zzadp.zzb[i5];
        this.zzd = i7;
        if (i2 == 2) {
            i7 /= 2;
            this.zzd = i7;
        } else if (i2 == 0) {
            i7 /= 4;
            this.zzd = i7;
        }
        int i8 = (i >>> 9) & 1;
        this.zzg = zzadp.zzm(i2, i3);
        if (i3 == 3) {
            int i9 = i2 == 3 ? zzadp.zzc[i6] : zzadp.zzd[i6];
            this.zzf = i9;
            this.zzc = (((i9 * 12) / i7) + i8) * 4;
        } else {
            if (i2 == 3) {
                int i10 = i3 == 2 ? zzadp.zze[i6] : zzadp.zzf[i6];
                this.zzf = i10;
                this.zzc = androidx.constraintlayout.core.state.a.a(i10, 144, i7, i8);
            } else {
                int i11 = zzadp.zzg[i6];
                this.zzf = i11;
                this.zzc = androidx.constraintlayout.core.state.a.a(i3 == 1 ? 72 : 144, i11, i7, i8);
            }
        }
        this.zze = ((i >> 6) & 3) == 3 ? 1 : 2;
        return true;
    }

    public zzado(zzado zzadoVar) {
        this.zza = zzadoVar.zza;
        this.zzb = zzadoVar.zzb;
        this.zzc = zzadoVar.zzc;
        this.zzd = zzadoVar.zzd;
        this.zze = zzadoVar.zze;
        this.zzf = zzadoVar.zzf;
        this.zzg = zzadoVar.zzg;
    }
}
