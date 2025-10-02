package com.google.android.gms.internal.ads;

import android.net.Uri;
import androidx.annotation.Nullable;

/* loaded from: classes5.dex */
public final class zzwj extends zzbe {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;
    private final boolean zze;

    @Nullable
    private final zzaj zzf;

    @Nullable
    private final zzae zzg;

    static {
        zzy zzyVar = new zzy();
        zzyVar.zza("SinglePeriodTimeline");
        zzyVar.zzb(Uri.EMPTY);
        zzyVar.zzc();
    }

    public zzwj(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, @Nullable Object obj, zzaj zzajVar, @Nullable zzae zzaeVar) {
        this.zzc = j4;
        this.zzd = j5;
        this.zze = z;
        zzajVar.getClass();
        this.zzf = zzajVar;
        this.zzg = zzaeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zza() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final zzbd zzb(int i, zzbd zzbdVar, long j) {
        zzghc.zzm(i, 1, "index");
        boolean z = this.zze;
        zzbdVar.zza(zzbd.zza, this.zzf, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, z, false, this.zzg, 0L, this.zzd, 0, 0, 0L);
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zzc() {
        return 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final zzbc zzd(int i, zzbc zzbcVar, boolean z) {
        zzghc.zzm(i, 1, "index");
        zzbcVar.zza(null, z ? zzb : null, 0, this.zzc, 0L, zzb.zza, false);
        return zzbcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final int zze(Object obj) {
        return zzb.equals(obj) ? 0 : -1;
    }

    @Override // com.google.android.gms.internal.ads.zzbe
    public final Object zzf(int i) {
        zzghc.zzm(i, 1, "index");
        return zzb;
    }
}
