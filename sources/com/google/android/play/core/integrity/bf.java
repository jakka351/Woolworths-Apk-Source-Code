package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes6.dex */
final class bf extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f14734a;
    final /* synthetic */ TaskCompletionSource b;
    final /* synthetic */ bn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i, long j, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.f14734a = j;
        this.b = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        if (bn.k(this.c)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.c;
            ((com.google.android.play.integrity.internal.i) bnVar.f14739a.n).N(bn.b(bnVar, this.f14734a, 0), new bl(this.c, this.b));
        } catch (RemoteException e) {
            this.c.b.a(e, "warmUpIntegrityToken(%s)", Long.valueOf(this.f14734a));
            this.b.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
