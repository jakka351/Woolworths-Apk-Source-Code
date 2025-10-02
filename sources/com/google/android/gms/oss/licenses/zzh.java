package com.google.android.gms.oss.licenses;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zzh extends TaskApiCall {
    final /* synthetic */ String zza;

    public zzh(zzk zzkVar, String str) {
        this.zza = str;
        Objects.requireNonNull(zzkVar);
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) throws RemoteException {
        taskCompletionSource.setResult(((zzl) anyClient).zzp(this.zza));
    }
}
