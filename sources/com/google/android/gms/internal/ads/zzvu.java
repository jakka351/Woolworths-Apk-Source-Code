package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzvu extends zzud {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzvu(zzvx zzvxVar, zzbe zzbeVar) {
        super(zzbeVar);
        Objects.requireNonNull(zzvxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzud, com.google.android.gms.internal.ads.zzbe
    public final zzbd zzb(int i, zzbd zzbdVar, long j) {
        this.zzb.zzb(i, zzbdVar, j);
        zzbdVar.zzk = true;
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzud, com.google.android.gms.internal.ads.zzbe
    public final zzbc zzd(int i, zzbc zzbcVar, boolean z) {
        this.zzb.zzd(i, zzbcVar, z);
        zzbcVar.zzf = true;
        return zzbcVar;
    }
}
