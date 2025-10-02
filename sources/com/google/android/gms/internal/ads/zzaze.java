package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzaze implements Runnable {
    final /* synthetic */ View zza;
    final /* synthetic */ zzazi zzb;

    public zzaze(zzazi zzaziVar, View view) {
        this.zza = view;
        Objects.requireNonNull(zzaziVar);
        this.zzb = zzaziVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb(this.zza);
    }
}
