package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes5.dex */
public class zzwz implements zzyf {
    protected final zzbf zza;
    protected final int zzb;
    protected final int[] zzc;
    private final zzu[] zzd;
    private int zze;

    public zzwz(zzbf zzbfVar, int[] iArr, int i) {
        int length = iArr.length;
        zzghc.zzh(length > 0);
        zzbfVar.getClass();
        this.zza = zzbfVar;
        this.zzb = length;
        this.zzd = new zzu[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.zzd[i2] = zzbfVar.zza(iArr[i2]);
        }
        Arrays.sort(this.zzd, zzwy.zza);
        this.zzc = new int[this.zzb];
        for (int i3 = 0; i3 < this.zzb; i3++) {
            this.zzc[i3] = zzbfVar.zzb(this.zzd[i3]);
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzwz zzwzVar = (zzwz) obj;
            if (this.zza.equals(zzwzVar.zza) && Arrays.equals(this.zzc, zzwzVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zze;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.zzc) + (System.identityHashCode(this.zza) * 31);
        this.zze = iHashCode;
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public final zzbf zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public final zzu zzb(int i) {
        return this.zzd[i];
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final zzu zzc() {
        return this.zzd[0];
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public final int zze() {
        return this.zzc.length;
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public final int zzf(int i) {
        return this.zzc[i];
    }

    @Override // com.google.android.gms.internal.ads.zzyk
    public final int zzg(int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            if (this.zzc[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzyf
    public final int zzh() {
        return this.zzc[0];
    }
}
