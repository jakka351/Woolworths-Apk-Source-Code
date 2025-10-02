package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class zzaea {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzaea(int i, byte[] bArr, int i2, int i3) {
        this.zza = i;
        this.zzb = bArr;
        this.zzc = i2;
        this.zzd = i3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaea.class == obj.getClass()) {
            zzaea zzaeaVar = (zzaea) obj;
            if (this.zza == zzaeaVar.zza && this.zzc == zzaeaVar.zzc && this.zzd == zzaeaVar.zzd && Arrays.equals(this.zzb, zzaeaVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((androidx.compose.ui.input.pointer.a.d(this.zza * 31, 31, this.zzb) + this.zzc) * 31) + this.zzd;
    }
}
