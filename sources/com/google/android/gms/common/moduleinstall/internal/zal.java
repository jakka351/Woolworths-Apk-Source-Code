package com.google.android.gms.common.moduleinstall.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* loaded from: classes5.dex */
final class zal extends zaa {
    final /* synthetic */ TaskCompletionSource zaa;

    public zal(zay zayVar, TaskCompletionSource taskCompletionSource) {
        this.zaa = taskCompletionSource;
        Objects.requireNonNull(zayVar);
    }

    @Override // com.google.android.gms.common.moduleinstall.internal.zaa, com.google.android.gms.common.moduleinstall.internal.zae
    public final void zac(Status status, @Nullable ModuleInstallResponse moduleInstallResponse) {
        TaskUtil.trySetResultOrApiException(status, moduleInstallResponse, this.zaa);
    }
}
