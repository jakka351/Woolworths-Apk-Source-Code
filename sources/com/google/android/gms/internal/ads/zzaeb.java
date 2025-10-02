package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* loaded from: classes5.dex */
public interface zzaeb {
    void zzu(zzu zzuVar);

    int zzv(zzi zziVar, int i, boolean z, int i2) throws IOException;

    void zzw(zzef zzefVar, int i, int i2);

    void zzx(long j, int i, int i2, int i3, @Nullable zzaea zzaeaVar);

    default int zzy(zzi zziVar, int i, boolean z) throws IOException {
        return zzv(zziVar, i, z, 0);
    }

    default void zzz(zzef zzefVar, int i) {
        zzw(zzefVar, i, 0);
    }
}
