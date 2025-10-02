package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
final class zzfmc implements Runnable {
    final /* synthetic */ zzfmd zza;

    public zzfmc(zzfmd zzfmdVar) {
        Objects.requireNonNull(zzfmdVar);
        this.zza = zzfmdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfmd zzfmdVar = this.zza;
        AtomicBoolean atomicBooleanZzf = zzfmdVar.zzf();
        float fZzc = zzfmdVar.zzc();
        atomicBooleanZzf.set(false);
        if (((Float) zzfmdVar.zze().getAndSet(Float.valueOf(fZzc))).floatValue() != fZzc) {
            zzfmdVar.zzd().post(new zzfmb(this, fZzc));
        }
    }
}
