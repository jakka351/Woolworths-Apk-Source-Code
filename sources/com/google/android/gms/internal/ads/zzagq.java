package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;

/* loaded from: classes5.dex */
public final class zzagq implements zzan {
    public final List zza;

    public zzagq(List list) {
        this.zza = list;
        boolean z = false;
        if (!list.isEmpty()) {
            long j = ((zzagp) list.get(0)).zzb;
            int i = 1;
            while (true) {
                if (i >= list.size()) {
                    break;
                }
                if (((zzagp) list.get(i)).zza < j) {
                    z = true;
                    break;
                } else {
                    j = ((zzagp) list.get(i)).zzb;
                    i++;
                }
            }
        }
        zzghc.zza(!z);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzagq.class != obj.getClass()) {
            return false;
        }
        return this.zza.equals(((zzagq) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=".concat(this.zza.toString());
    }
}
