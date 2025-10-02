package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zbx extends zbh {
    final /* synthetic */ TaskCompletionSource zba;

    public zbx(zbad zbadVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        Objects.requireNonNull(zbadVar);
    }

    @Override // com.google.android.gms.internal.p000authapi.zbi
    public final void zbb(Status status, AuthorizationResult authorizationResult) throws RemoteException {
        if (status.isSuccess()) {
            this.zba.setResult(authorizationResult);
        } else {
            this.zba.setException(ApiExceptionUtil.fromStatus(status));
        }
    }
}
