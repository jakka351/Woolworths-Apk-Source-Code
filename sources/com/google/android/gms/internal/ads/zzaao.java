package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
final class zzaao implements zzbr {
    private final zzbp zza = new zzaan(false);

    public zzaao(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzbr
    public final zzbt zza(Context context, zzh zzhVar, zzk zzkVar, zzbs zzbsVar, Executor executor, long j, boolean z) {
        try {
            return ((zzbr) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(zzbp.class).newInstance(this.zza)).zza(context, zzhVar, zzkVar, zzbsVar, executor, 0L, false);
        } catch (Exception e) {
            throw new IllegalStateException(e);
        }
    }
}
