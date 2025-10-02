package com.google.android.gms.internal.auth;

import YU.a;
import javax.annotation.CheckForNull;

/* loaded from: classes5.dex */
final class zzdi extends zzdh {
    private final Object zza;

    public zzdi(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(@CheckForNull Object obj) {
        if (obj instanceof zzdi) {
            return this.zza.equals(((zzdi) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return a.h("Optional.of(", this.zza.toString(), ")");
    }

    @Override // com.google.android.gms.internal.auth.zzdh
    public final Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.auth.zzdh
    public final boolean zzb() {
        return true;
    }
}
