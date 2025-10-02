package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.camera.core.impl.b;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzpx {
    private final Class<?> zza;
    private final Class<?> zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpx)) {
            return false;
        }
        zzpx zzpxVar = (zzpx) obj;
        return zzpxVar.zza.equals(this.zza) && zzpxVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return b.o(this.zza.getSimpleName(), " with primitive type: ", this.zzb.getSimpleName());
    }

    private zzpx(Class<?> cls, Class<?> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }
}
