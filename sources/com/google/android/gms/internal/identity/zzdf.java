package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.location.LocationSettingsResult;

/* loaded from: classes5.dex */
final class zzdf extends zzaa {
    final /* synthetic */ BaseImplementation.ResultHolder zza;

    public zzdf(BaseImplementation.ResultHolder resultHolder) {
        this.zza = resultHolder;
    }

    @Override // com.google.android.gms.internal.identity.zzab
    public final void zzb(LocationSettingsResult locationSettingsResult) {
        this.zza.setResult(locationSettingsResult);
    }
}
