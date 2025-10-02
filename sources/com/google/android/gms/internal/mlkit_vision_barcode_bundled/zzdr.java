package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import org.bouncycastle.crypto.digests.Blake2xsDigest;

/* loaded from: classes5.dex */
final class zzdr {
    private final Object zza;
    private final int zzb;

    public zzdr(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzdr)) {
            return false;
        }
        zzdr zzdrVar = (zzdr) obj;
        return this.zza == zzdrVar.zza && this.zzb == zzdrVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * Blake2xsDigest.UNKNOWN_DIGEST_LENGTH) + this.zzb;
    }
}
