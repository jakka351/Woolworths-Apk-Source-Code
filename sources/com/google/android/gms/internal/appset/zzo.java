package com.google.android.gms.internal.appset;

import androidx.annotation.Nullable;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes5.dex */
final class zzo extends zze {
    final /* synthetic */ TaskCompletionSource zza;

    public zzo(zzp zzpVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.appset.zzf
    public final void zzb(Status status, @Nullable com.google.android.gms.appset.zzc zzcVar) {
        TaskUtil.setResultOrApiException(status, zzcVar != null ? new AppSetIdInfo(zzcVar.zzb(), zzcVar.zza()) : null, (TaskCompletionSource<AppSetIdInfo>) this.zza);
    }
}
