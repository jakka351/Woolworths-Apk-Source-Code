package com.google.android.recaptcha.internal;

import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzfz {

    @NotNull
    private final zzjj zza;

    public zzfz() {
        this(1);
    }

    @NotNull
    public final List zwk() {
        return zza();
    }

    @NotNull
    public final List zza() {
        return CollectionsKt.G0(this.zza);
    }

    public final boolean zzb(@NotNull List list) {
        this.zza.add(list);
        return true;
    }

    public zzfz(int i) {
        this.zza = zzjj.zza(i);
    }
}
