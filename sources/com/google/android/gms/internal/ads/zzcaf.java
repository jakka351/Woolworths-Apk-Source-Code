package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes.dex */
final class zzcaf implements Runnable {
    final /* synthetic */ zzcah zza;

    public zzcaf(zzcah zzcahVar) {
        Objects.requireNonNull(zzcahVar);
        this.zza = zzcahVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcah zzcahVar = this.zza;
        if (zzcahVar.zzt() != null) {
            zzcahVar.zzt().zzd();
        }
    }
}
