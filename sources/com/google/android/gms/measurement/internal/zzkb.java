package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;
import java.util.Objects;

/* loaded from: classes.dex */
final class zzkb extends zzay {
    final /* synthetic */ zzlj zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzkb(zzlj zzljVar, zzjg zzjgVar) {
        super(zzjgVar);
        Objects.requireNonNull(zzljVar);
        this.zza = zzljVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzay
    @WorkerThread
    public final void zza() {
        this.zza.zzD();
    }
}
