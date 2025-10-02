package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzr {
    private final SparseBooleanArray zza;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzr) {
            return this.zza.equals(((zzr) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final boolean zza(int i) {
        return this.zza.get(i);
    }

    public final int zzb() {
        return this.zza.size();
    }

    public final int zzc(int i) {
        SparseBooleanArray sparseBooleanArray = this.zza;
        zzghc.zzm(i, sparseBooleanArray.size(), "index");
        return sparseBooleanArray.keyAt(i);
    }
}
