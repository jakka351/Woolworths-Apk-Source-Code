package com.google.android.gms.ads.internal.util.client;

import android.content.Context;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzc extends Thread {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;

    public zzc(zzf zzfVar, Context context, String str) {
        this.zza = context;
        this.zzb = str;
        Objects.requireNonNull(zzfVar);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        new zzu(this.zza, null).zza(this.zzb);
    }
}
