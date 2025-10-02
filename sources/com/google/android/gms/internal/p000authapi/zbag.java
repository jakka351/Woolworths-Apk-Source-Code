package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zbag extends zbt {
    final /* synthetic */ TaskCompletionSource zba;

    public zbag(zbaj zbajVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        Objects.requireNonNull(zbajVar);
    }

    @Override // com.google.android.gms.internal.p000authapi.zbu
    public final void zbb(Status status, SavePasswordResult savePasswordResult) throws RemoteException {
        TaskUtil.setResultOrApiException(status, savePasswordResult, (TaskCompletionSource<SavePasswordResult>) this.zba);
    }
}
