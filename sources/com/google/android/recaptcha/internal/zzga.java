package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import kotlin.collections.ArraysKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class zzga extends zzfx {

    @NotNull
    private final zzfz zza;

    @NotNull
    private final String zzb;

    public zzga(@NotNull zzfz zzfzVar, @NotNull String str, @Nullable Object obj) {
        super(obj);
        this.zza = zzfzVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzfx
    public final boolean zza(@NotNull Object obj, @NotNull Method method, @Nullable Object[] objArr) {
        if (!Intrinsics.c(method.getName(), this.zzb)) {
            return false;
        }
        this.zza.zzb(objArr != null ? ArraysKt.f(objArr) : EmptyList.d);
        return true;
    }
}
