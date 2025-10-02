package com.google.android.play.core.integrity;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes6.dex */
final class bg extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f14735a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ TaskCompletionSource d;
    final /* synthetic */ bn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i, String str, long j, long j2, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.e = bnVar;
        this.f14735a = str;
        this.b = j;
        this.c = j2;
        this.d = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        if (bn.k(this.e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.e;
            ((com.google.android.play.integrity.internal.i) bnVar.f14739a.n).T(bn.a(bnVar, this.f14735a, this.b, this.c, 0), new bk(this.e, this.d, this.b));
        } catch (RemoteException e) {
            this.e.b.a(e, "requestExpressIntegrityToken(%s, %s)", this.f14735a, Long.valueOf(this.b));
            this.d.trySetException(new StandardIntegrityException(-100, e));
        }
    }
}
