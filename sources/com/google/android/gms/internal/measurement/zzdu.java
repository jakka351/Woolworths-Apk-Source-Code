package com.google.android.gms.internal.measurement;

import androidx.annotation.BinderThread;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzdu extends zzcw {
    final /* synthetic */ Runnable zza;

    public zzdu(zzdv zzdvVar, Runnable runnable) {
        this.zza = runnable;
        Objects.requireNonNull(zzdvVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzcx
    @BinderThread
    public final void zze() {
        this.zza.run();
    }
}
