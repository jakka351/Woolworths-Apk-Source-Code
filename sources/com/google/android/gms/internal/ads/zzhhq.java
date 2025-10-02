package com.google.android.gms.internal.ads;

import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* loaded from: classes5.dex */
final class zzhhq {
    private final Object zza;
    private final int zzb;

    public zzhhq(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzhhq)) {
            return false;
        }
        zzhhq zzhhqVar = (zzhhq) obj;
        return this.zza == zzhhqVar.zza && this.zzb == zzhhqVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) + this.zzb;
    }
}
