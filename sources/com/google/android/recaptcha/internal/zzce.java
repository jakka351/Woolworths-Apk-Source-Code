package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class zzce extends Exception {

    @Nullable
    private final Throwable zza;

    @NotNull
    private final zztd zzb;

    @NotNull
    private final int zzc;

    @NotNull
    private final int zzd;

    public zzce(@NotNull int i, @NotNull int i2, @Nullable Throwable th) {
        this.zzc = i;
        this.zzd = i2;
        this.zza = th;
        zztd zztdVarZzf = zzte.zzf();
        zztdVarZzf.zzq(i2);
        zztdVarZzf.zzr(i);
        this.zzb = zztdVarZzf;
    }

    @Override // java.lang.Throwable
    @Nullable
    public final Throwable getCause() {
        return this.zza;
    }

    @NotNull
    public final zztd zza() {
        return this.zzb;
    }

    @NotNull
    public final int zzb() {
        return this.zzd;
    }
}
