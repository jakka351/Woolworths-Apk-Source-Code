package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes5.dex */
public final class zzacr implements zzaeb {
    private final byte[] zza = new byte[4096];

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzu(zzu zzuVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final int zzv(zzi zziVar, int i, boolean z, int i2) throws IOException {
        int iZza = zziVar.zza(this.zza, 0, Math.min(4096, i));
        if (iZza != -1) {
            return iZza;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzw(zzef zzefVar, int i, int i2) {
        zzefVar.zzk(i);
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final void zzx(long j, int i, int i2, int i3, @Nullable zzaea zzaeaVar) {
    }
}
