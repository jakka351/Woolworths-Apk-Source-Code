package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes5.dex */
public final class zzetf implements zzeup {

    @Nullable
    private final Bundle zza;

    public zzetf(@Nullable Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final ListenableFuture zza() {
        return zzgot.zza(new zzetg(this.zza));
    }

    @Override // com.google.android.gms.internal.ads.zzeup
    public final int zzb() {
        return 30;
    }
}
