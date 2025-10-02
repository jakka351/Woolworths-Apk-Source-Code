package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzfkz implements Runnable {
    final /* synthetic */ zzflb zza;

    public zzfkz(zzflb zzflbVar) {
        Objects.requireNonNull(zzflbVar);
        this.zza = zzflbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzy();
    }
}
