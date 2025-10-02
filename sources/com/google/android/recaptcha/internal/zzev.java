package com.google.android.recaptcha.internal;

import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzev {
    @NotNull
    public static final zzrl zza(@NotNull zzbn zzbnVar, @NotNull zzbn zzbnVar2) {
        zzrj zzrjVarZzf = zzrl.zzf();
        zzrjVarZzf.zzq(zzqb.zzb(zzbnVar.zzb()));
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        zzrjVarZzf.zzr(zzpz.zza(zzbnVar.zza(timeUnit)));
        zzrjVarZzf.zze(zzqb.zzb(zzbnVar2.zzb()));
        zzrjVarZzf.zzf(zzpz.zza(zzbnVar2.zza(timeUnit)));
        return (zzrl) zzrjVarZzf.zzk();
    }
}
