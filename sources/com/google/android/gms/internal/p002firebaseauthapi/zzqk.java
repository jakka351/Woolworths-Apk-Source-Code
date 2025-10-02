package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.camera.core.impl.b;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzqk {
    private final Class<? extends zzqf> zza;
    private final zzaaj zzb;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqk)) {
            return false;
        }
        zzqk zzqkVar = (zzqk) obj;
        return zzqkVar.zza.equals(this.zza) && zzqkVar.zzb.equals(this.zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return b.o(this.zza.getSimpleName(), ", object identifier: ", String.valueOf(this.zzb));
    }

    private zzqk(Class<? extends zzqf> cls, zzaaj zzaajVar) {
        this.zza = cls;
        this.zzb = zzaajVar;
    }
}
