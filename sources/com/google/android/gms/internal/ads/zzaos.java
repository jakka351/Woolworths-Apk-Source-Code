package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzaos implements Runnable {
    final /* synthetic */ zzaph zza;
    final /* synthetic */ zzaot zzb;

    public zzaos(zzaot zzaotVar, zzaph zzaphVar) {
        this.zza = zzaphVar;
        Objects.requireNonNull(zzaotVar);
        this.zzb = zzaotVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        try {
            this.zzb.zzb().put(this.zza);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
