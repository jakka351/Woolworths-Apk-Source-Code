package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
public final class zzeuh implements zzeup {
    private final boolean zza;

    public zzeuh(@Nullable zzfaf zzfafVar) {
        this.zza = zzfafVar != null;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return zzgot.zza(new zzeug(this.zza, null));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 36;
    }
}
