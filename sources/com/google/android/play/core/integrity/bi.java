package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes6.dex */
class bi extends com.google.android.play.integrity.internal.j {

    /* renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f14737a;
    final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.b = bnVar;
        this.f14737a = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.k
    public final void b(Bundle bundle) throws RemoteException {
        this.b.f14739a.d(this.f14737a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public void c(Bundle bundle) throws RemoteException {
        this.b.f14739a.d(this.f14737a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public final void d(Bundle bundle) throws RemoteException {
        this.b.f14739a.d(this.f14737a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public void e(Bundle bundle) throws RemoteException {
        this.b.f14739a.d(this.f14737a);
    }
}
