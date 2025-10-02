package com.google.android.gms.internal.p000authapi;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zban extends zbp {
    final /* synthetic */ TaskCompletionSource zba;

    public zban(zbat zbatVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
        Objects.requireNonNull(zbatVar);
    }

    @Override // com.google.android.gms.internal.p000authapi.zbq
    public final void zbb(Status status, PendingIntent pendingIntent) throws RemoteException {
        TaskUtil.setResultOrApiException(status, pendingIntent, (TaskCompletionSource<PendingIntent>) this.zba);
    }
}
