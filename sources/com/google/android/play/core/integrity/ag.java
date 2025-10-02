package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes6.dex */
final class ag extends com.google.android.play.integrity.internal.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f14713a;
    final /* synthetic */ Activity b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ aj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i) {
        super(taskCompletionSource);
        this.e = ajVar;
        this.f14713a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        try {
            aj ajVar = this.e;
            ((com.google.android.play.integrity.internal.n) ajVar.f14716a.n).a(this.f14713a, ajVar.d.a(this.b, this.c, ajVar.f14716a));
        } catch (RemoteException e) {
            this.e.b.a(e, "requestAndShowDialog(%s)", Integer.valueOf(this.d));
            this.c.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
