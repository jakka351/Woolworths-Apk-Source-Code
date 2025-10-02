package com.google.android.recaptcha.internal;

import YU.a;
import kotlin.comparisons.ComparisonsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes6.dex */
public final class zzbj implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    @NotNull
    public final String toString() {
        return a.p(a.v("avgExecutionTime: ", StringsKt.I(10, String.valueOf(this.zzb / this.zza)), " us| maxExecutionTime: ", StringsKt.I(10, String.valueOf(this.zzc)), " us| totalTime: "), StringsKt.I(10, String.valueOf(this.zzb)), " us| #Usages: ", StringsKt.I(5, String.valueOf(this.zza)));
    }

    @Override // java.lang.Comparable
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final int compareTo(@NotNull zzbj zzbjVar) {
        return ComparisonsKt.a(Long.valueOf(this.zzb), Long.valueOf(zzbjVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j) {
        this.zzc = j;
    }

    public final void zzf(long j) {
        this.zzb = j;
    }

    public final void zzg(int i) {
        this.zza = i;
    }
}
