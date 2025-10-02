package com.google.android.recaptcha.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes6.dex */
public final class zzav {
    public static final /* synthetic */ int zza = 0;

    @Nullable
    private static zzav zzb;

    @NotNull
    private static final Map zzc = new LinkedHashMap();

    @NotNull
    private static final Function0 zzd = zzat.zza;

    @NotNull
    private final Map zze;

    @Nullable
    public final Object zzb(int i) {
        return this.zze.get(Integer.valueOf(i));
    }
}
