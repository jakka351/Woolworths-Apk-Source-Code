package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzaz {

    @Nullable
    public final Object zza;
    public final int zzb;

    @Nullable
    public final zzaj zzc;

    @Nullable
    public final Object zzd;
    public final int zze;
    public final long zzf;
    public final long zzg;
    public final int zzh;
    public final int zzi;

    static {
        String str = zzeo.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
    }

    public zzaz(@Nullable Object obj, int i, @Nullable zzaj zzajVar, @Nullable Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.zza = obj;
        this.zzb = i;
        this.zzc = zzajVar;
        this.zzd = obj2;
        this.zze = i2;
        this.zzf = j;
        this.zzg = j2;
        this.zzh = i3;
        this.zzi = i4;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaz.class == obj.getClass()) {
            zzaz zzazVar = (zzaz) obj;
            if (this.zzb == zzazVar.zzb && this.zze == zzazVar.zze && this.zzf == zzazVar.zzf && this.zzg == zzazVar.zzg && this.zzh == zzazVar.zzh && this.zzi == zzazVar.zzi && Objects.equals(this.zzc, zzazVar.zzc) && Objects.equals(this.zza, zzazVar.zza) && Objects.equals(this.zzd, zzazVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, Integer.valueOf(this.zzb), this.zzc, this.zzd, Integer.valueOf(this.zze), Long.valueOf(this.zzf), Long.valueOf(this.zzg), Integer.valueOf(this.zzh), Integer.valueOf(this.zzi));
    }

    public final String toString() {
        int i = this.zzb;
        int length = String.valueOf(i).length();
        int i2 = this.zze;
        int length2 = String.valueOf(i2).length();
        long j = this.zzf;
        StringBuilder sb = new StringBuilder(length + 19 + length2 + 6 + String.valueOf(j).length());
        androidx.constraintlayout.core.state.a.t(i, i2, "mediaItem=", ", period=", sb);
        String strM = au.com.woolworths.shop.checkout.ui.confirmation.c.m(j, ", pos=", sb);
        int i3 = this.zzh;
        if (i3 == -1) {
            return strM;
        }
        long j2 = this.zzg;
        int i4 = this.zzi;
        int length3 = strM.length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(i3).length() + length3 + 13 + String.valueOf(j2).length() + 10 + 5 + String.valueOf(i4).length());
        sb2.append(strM);
        sb2.append(", contentPos=");
        sb2.append(j2);
        return au.com.woolworths.shop.checkout.ui.confirmation.c.l(i3, i4, ", adGroup=", ", ad=", sb2);
    }
}
