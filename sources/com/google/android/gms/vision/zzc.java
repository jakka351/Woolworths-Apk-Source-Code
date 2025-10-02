package com.google.android.gms.vision;

import android.util.SparseIntArray;
import com.google.android.gms.common.util.VisibleForTesting;
import javax.annotation.concurrent.GuardedBy;

@VisibleForTesting
/* loaded from: classes5.dex */
public final class zzc {
    private static final Object zza = new Object();

    @GuardedBy
    private static int zzb;

    @GuardedBy
    private final SparseIntArray zzc = new SparseIntArray();

    @GuardedBy
    private final SparseIntArray zzd = new SparseIntArray();

    public final int zza(int i) {
        synchronized (zza) {
            try {
                int i2 = this.zzc.get(i, -1);
                if (i2 != -1) {
                    return i2;
                }
                int i3 = zzb;
                zzb = i3 + 1;
                this.zzc.append(i, i3);
                this.zzd.append(i3, i);
                return i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final int zzb(int i) {
        int i2;
        synchronized (zza) {
            i2 = this.zzd.get(i);
        }
        return i2;
    }
}
