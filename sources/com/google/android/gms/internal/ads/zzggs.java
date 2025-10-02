package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzggs<E> implements Serializable, zzggr {
    private final Object zza;

    public zzggs(Object obj) {
        this.zza = obj;
    }

    @Override // com.google.android.gms.internal.ads.zzggr
    public final E apply(Object obj) {
        return (E) this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzggr
    public final boolean equals(Object obj) {
        if (obj instanceof zzggs) {
            return Objects.equals(this.zza, ((zzggs) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.zza;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zza);
        return YU.a.p(new StringBuilder(strValueOf.length() + 20), "Functions.constant(", strValueOf, ")");
    }
}
