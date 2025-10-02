package com.google.android.recaptcha.internal;

import kotlinx.coroutines.TimeoutCancellationException;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzf {
    @NotNull
    public static final zzbd zza(@NotNull Exception exc, @NotNull zzbd zzbdVar) {
        return exc instanceof TimeoutCancellationException ? new zzbd(zzbb.zzb, zzba.zzb, exc.getMessage()) : exc instanceof zzbd ? (zzbd) exc : zzbdVar;
    }
}
