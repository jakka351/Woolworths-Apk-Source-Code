package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes5.dex */
final class zzdl extends zzw {
    final /* synthetic */ TaskCompletionSource zza;

    public zzdl(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.identity.zzx
    public final void zzb(Status status, LocationAvailability locationAvailability) {
        TaskUtil.setResultOrApiException(status, locationAvailability, (TaskCompletionSource<LocationAvailability>) this.zza);
    }
}
