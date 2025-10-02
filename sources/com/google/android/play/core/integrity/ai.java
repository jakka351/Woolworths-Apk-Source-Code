package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes6.dex */
final class ai extends com.google.android.play.integrity.internal.o {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ aj f14715a;
    private final com.google.android.play.integrity.internal.s b;
    private final TaskCompletionSource c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai(aj ajVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.f14715a = ajVar;
        this.b = new com.google.android.play.integrity.internal.s("OnRequestIntegrityTokenCallback");
        this.c = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.p
    public final void b(Bundle bundle) {
        this.f14715a.f14716a.d(this.c);
        this.b.b("onRequestIntegrityToken", new Object[0]);
        ApiException apiExceptionA = this.f14715a.e.a(bundle);
        if (apiExceptionA != null) {
            this.c.trySetException(apiExceptionA);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        ah ahVar = new ah(this, this.f14715a.c, bundle.getLong("request.token.sid"));
        TaskCompletionSource taskCompletionSource = this.c;
        a aVar = new a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
