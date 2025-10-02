package com.google.android.gms.internal.p002firebaseauthapi;

import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* loaded from: classes5.dex */
final class zzakt {
    private final Object zza;
    private final int zzb;

    public zzakt(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzakt)) {
            return false;
        }
        zzakt zzaktVar = (zzakt) obj;
        return this.zza == zzaktVar.zza && this.zzb == zzaktVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) + this.zzb;
    }
}
