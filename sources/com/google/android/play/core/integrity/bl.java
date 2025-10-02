package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes6.dex */
final class bl extends bi {
    final /* synthetic */ bn c;
    private final com.google.android.play.integrity.internal.s d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bl(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.d = new com.google.android.play.integrity.internal.s("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, com.google.android.play.integrity.internal.k
    public final void e(Bundle bundle) throws RemoteException {
        super.e(bundle);
        this.d.b("onWarmUpExpressIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.c.f.a(bundle);
        if (apiExceptionA != null) {
            this.f14737a.trySetException(apiExceptionA);
        } else {
            this.f14737a.trySetResult(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
