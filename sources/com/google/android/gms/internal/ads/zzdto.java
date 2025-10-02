package com.google.android.gms.internal.ads;

/* loaded from: classes5.dex */
final class zzdto extends zzdts {
    private final long zza;
    private final int zzb;

    public /* synthetic */ zzdto(long j, int i, byte[] bArr) {
        this.zza = j;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdts) {
            zzdts zzdtsVar = (zzdts) obj;
            if (this.zza == zzdtsVar.zza() && this.zzb == zzdtsVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.zza;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.zzb;
    }

    public final String toString() {
        long j = this.zza;
        int length = String.valueOf(j).length();
        int i = this.zzb;
        StringBuilder sb = new StringBuilder(length + 34 + String.valueOf(i).length() + 1);
        androidx.constraintlayout.core.state.a.A(sb, "OnDeviceStorageKey{id=", j, ", eventType=");
        return YU.a.m(sb, i, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzdts
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdts
    public final int zzb() {
        return this.zzb;
    }
}
