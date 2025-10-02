package com.google.android.gms.internal.ads;

import java.util.List;

/* loaded from: classes5.dex */
final class zzty implements zzwh {
    private final zzwh zza;
    private final zzgjz zzb;

    public zzty(zzwh zzwhVar, List list) {
        this.zza = zzwhVar;
        this.zzb = zzgjz.zzq(list);
    }

    public final zzgjz zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final void zzg(long j) {
        this.zza.zzg(j);
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final long zzi() {
        return this.zza.zzi();
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final long zzl() {
        return this.zza.zzl();
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final boolean zzm(zzkl zzklVar) {
        return this.zza.zzm(zzklVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwh
    public final boolean zzn() {
        return this.zza.zzn();
    }
}
