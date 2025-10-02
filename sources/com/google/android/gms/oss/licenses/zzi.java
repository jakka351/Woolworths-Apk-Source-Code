package com.google.android.gms.oss.licenses;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzi extends TaskApiCall {
    final /* synthetic */ com.google.android.gms.internal.oss_licenses.zzg zza;

    public zzi(zzk zzkVar, com.google.android.gms.internal.oss_licenses.zzg zzgVar) {
        this.zza = zzgVar;
        Objects.requireNonNull(zzkVar);
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
        taskCompletionSource.setResult(((zzl) anyClient).zzq(this.zza));
    }
}
