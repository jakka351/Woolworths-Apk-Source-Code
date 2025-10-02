package com.google.android.gms.ads.nonagon.signalgeneration;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzhpx;

/* loaded from: classes5.dex */
public final class zzbd implements zzhpx {
    private final zzay zza;

    private zzbd(zzay zzayVar) {
        this.zza = zzayVar;
    }

    public static zzbd zza(zzay zzayVar) {
        return new zzbd(zzayVar);
    }

    @Override // com.google.android.gms.internal.ads.zzhqm, com.google.android.gms.internal.ads.zzhql
    @Nullable
    public final /* synthetic */ Object zzb() {
        return this.zza.zze();
    }
}
