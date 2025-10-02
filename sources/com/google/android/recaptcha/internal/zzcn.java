package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public interface zzcn {
    @Nullable
    Object zza(@NotNull String str, @NotNull RecaptchaAction recaptchaAction, long j, @NotNull Continuation continuation) throws zzbd;

    @Nullable
    Object zzb(long j, @NotNull Continuation continuation) throws zzbd;
}
