package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzex implements zzan {
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzex(long j, long j2, long j3) {
        this.zza = j;
        this.zzb = j2;
        this.zzc = j3;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzex)) {
            return false;
        }
        zzex zzexVar = (zzex) obj;
        return this.zza == zzexVar.zza && this.zzb == zzexVar.zzb && this.zzc == zzexVar.zzc;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.zza) + 527;
        return Long.hashCode(this.zzc) + ((Long.hashCode(this.zzb) + (iHashCode * 31)) * 31);
    }

    public final String toString() {
        long j = this.zza;
        int length = String.valueOf(j).length();
        long j2 = this.zzb;
        int length2 = String.valueOf(j2).length();
        long j3 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 48 + length2 + 12 + String.valueOf(j3).length());
        androidx.constraintlayout.core.state.a.A(sb, "Mp4Timestamp: creation time=", j, ", modification time=");
        sb.append(j2);
        return au.com.woolworths.shop.checkout.ui.confirmation.c.m(j3, ", timescale=", sb);
    }
}
