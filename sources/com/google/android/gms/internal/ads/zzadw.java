package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzadw {
    public static final zzadw zza = new zzadw(0, 0);
    public final long zzb;
    public final long zzc;

    public zzadw(long j, long j2) {
        this.zzb = j;
        this.zzc = j2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzadw.class == obj.getClass()) {
            zzadw zzadwVar = (zzadw) obj;
            if (this.zzb == zzadwVar.zzb && this.zzc == zzadwVar.zzc) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        long j = this.zzb;
        int length = String.valueOf(j).length();
        long j2 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 19 + String.valueOf(j2).length() + 1);
        androidx.constraintlayout.core.state.a.A(sb, "[timeUs=", j, ", position=");
        return android.support.v4.media.session.a.l(j2, "]", sb);
    }
}
