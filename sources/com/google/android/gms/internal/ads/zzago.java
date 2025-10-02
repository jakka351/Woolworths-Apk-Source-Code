package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzago implements zzan {
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzago(long j, long j2, long j3, long j4, long j5) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
        this.zzd = j4;
        this.zze = j5;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzago.class == obj.getClass()) {
            zzago zzagoVar = (zzago) obj;
            if (this.zza == zzagoVar.zza && this.zzb == zzagoVar.zzb && this.zzc == zzagoVar.zzc && this.zzd == zzagoVar.zzd && this.zze == zzagoVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.zza) + 527;
        int iHashCode2 = Long.hashCode(this.zzc) + ((Long.hashCode(this.zzb) + (iHashCode * 31)) * 31);
        return Long.hashCode(this.zze) + ((Long.hashCode(this.zzd) + (iHashCode2 * 31)) * 31);
    }

    public final String toString() {
        long j = this.zza;
        int length = String.valueOf(j).length();
        long j2 = this.zzb;
        int length2 = String.valueOf(j2).length();
        long j3 = this.zzc;
        int length3 = String.valueOf(j3).length();
        long j4 = this.zzd;
        int length4 = String.valueOf(j4).length();
        long j5 = this.zze;
        StringBuilder sb = new StringBuilder(length + 54 + length2 + 31 + length3 + 21 + length4 + 12 + String.valueOf(j5).length());
        androidx.constraintlayout.core.state.a.A(sb, "Motion photo metadata: photoStartPosition=", j, ", photoSize=");
        sb.append(j2);
        androidx.constraintlayout.core.state.a.A(sb, ", photoPresentationTimestampUs=", j3, ", videoStartPosition=");
        sb.append(j4);
        return au.com.woolworths.shop.checkout.ui.confirmation.c.m(j5, ", videoSize=", sb);
    }
}
