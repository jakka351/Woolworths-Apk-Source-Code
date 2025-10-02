package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes5.dex */
final class zzbax extends zzbzm {
    final /* synthetic */ zzbbd zza;

    public zzbax(zzbbd zzbbdVar) {
        Objects.requireNonNull(zzbbdVar);
        this.zza = zzbbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbzm, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        this.zza.zzb();
        return super.cancel(z);
    }
}
