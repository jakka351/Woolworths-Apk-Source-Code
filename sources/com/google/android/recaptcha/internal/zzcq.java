package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.TimeoutCancellationException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class zzcq {

    @Nullable
    private static zzcv zza;

    @NotNull
    public static final zzcv zza(@NotNull Application application) {
        zzcv zzcvVar = zza;
        if (zzcvVar == null) {
            zzcvVar = new zzcv(application);
        }
        if (zza == null) {
            zza = zzcvVar;
        }
        return zzcvVar;
    }

    @Nullable
    public static final Object zzb(@NotNull Application application, @NotNull String str, long j, @NotNull Continuation continuation) throws RecaptchaException, TimeoutCancellationException, ApiException {
        return zzcv.zzh(zza(application), str, j, null, null, null, continuation, 28, null);
    }

    @NotNull
    public static final Task zzc(@NotNull Application application, @NotNull String str, long j) throws RecaptchaException, TimeoutCancellationException, ApiException {
        return zzas.zza(BuildersKt.a(zza(application).zzd().zza(), null, new zzco(application, str, j, null), 3));
    }

    @Nullable
    public static final Object zzd(@NotNull Application application, @NotNull String str, @NotNull Continuation continuation) throws RecaptchaException, ApiException {
        zzcv zzcvVarZza = zza(application);
        return zzcv.zzh(zzcvVarZza, str, 0L, null, zzcvVarZza.zzf, zzch.zzb, continuation, 2, null);
    }

    @NotNull
    public static final Task zze(@NotNull Application application, @NotNull String str) throws RecaptchaException, ApiException {
        return zzas.zza(BuildersKt.a(zza(application).zzd().zza(), null, new zzcp(application, str, null), 3));
    }
}
