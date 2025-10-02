package com.google.android.gms.internal.vision;

/* loaded from: classes5.dex */
final class zzfj extends zzfd {
    @Override // com.google.android.gms.internal.vision.zzfd
    public final void zza(Throwable th, Throwable th2) {
        th.addSuppressed(th2);
    }

    @Override // com.google.android.gms.internal.vision.zzfd
    public final void zza(Throwable th) {
        th.printStackTrace();
    }
}
