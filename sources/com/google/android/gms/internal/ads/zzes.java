package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzes implements zzan {
    public final int zza;

    public zzes(int i) {
        this.zza = i;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zzes) && this.zza == ((zzes) obj).zza;
    }

    public final int hashCode() {
        return this.zza;
    }

    public final String toString() {
        int i = this.zza;
        return YU.a.n(new StringBuilder(String.valueOf(i).length() + 19), "Mp4AlternateGroup: ", i);
    }
}
