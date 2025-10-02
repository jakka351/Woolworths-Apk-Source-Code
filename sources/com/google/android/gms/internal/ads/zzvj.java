package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzvj extends zzadj {
    final /* synthetic */ zzvt zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzvj(zzvt zzvtVar, zzadv zzadvVar) {
        super(zzadvVar);
        Objects.requireNonNull(zzvtVar);
        this.zza = zzvtVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadj, com.google.android.gms.internal.ads.zzadv
    public final long zza() {
        return this.zza.zzQ();
    }
}
