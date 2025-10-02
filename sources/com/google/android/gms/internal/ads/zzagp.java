package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class zzagp {
    public final long zza;
    public final long zzb;
    public final int zzc;

    public zzagp(long j, long j2, int i) {
        zzghc.zza(j < j2);
        this.zza = j;
        this.zzb = j2;
        this.zzc = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagp.class == obj.getClass()) {
            zzagp zzagpVar = (zzagp) obj;
            if (this.zza == zzagpVar.zza && this.zzb == zzagpVar.zzb && this.zzc == zzagpVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.zza), Long.valueOf(this.zzb), Integer.valueOf(this.zzc));
    }

    public final String toString() {
        long j = this.zza;
        long j2 = this.zzb;
        int i = this.zzc;
        String str = zzeo.zza;
        Locale locale = Locale.US;
        StringBuilder sbT = androidx.camera.core.impl.b.t(j, "Segment: startTimeMs=", ", endTimeMs=");
        sbT.append(j2);
        sbT.append(", speedDivisor=");
        sbT.append(i);
        return sbT.toString();
    }
}
