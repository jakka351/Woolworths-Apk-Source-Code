package com.google.android.recaptcha.internal;

import android.content.Context;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class zzia implements zzih {

    @NotNull
    private final Context zza;

    public zzia(@NotNull Context context) {
        this.zza = context;
    }

    @Override // com.google.android.recaptcha.internal.zzih
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzie.zza(this, objArr);
    }

    @Override // com.google.android.recaptcha.internal.zzih
    @Nullable
    public final Object zza(@NotNull Object... objArr) {
        return zzap.zza(this.zza.getContentResolver());
    }
}
