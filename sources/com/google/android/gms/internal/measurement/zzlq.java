package com.google.android.gms.internal.measurement;

import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* loaded from: classes5.dex */
final class zzlq {
    private final Object zza;
    private final int zzb;

    public zzlq(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzlq)) {
            return false;
        }
        zzlq zzlqVar = (zzlq) obj;
        return this.zza == zzlqVar.zza && this.zzb == zzlqVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) + this.zzb;
    }
}
