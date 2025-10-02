package me.oriient.internal.services.auth;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.Job;
import me.oriient.internal.infra.utils.core.SingleInstanceExecutor;

/* renamed from: me.oriient.internal.services.auth.t, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1227t extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ D f25055a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1227t(D d, Continuation continuation) {
        super(2, continuation);
        this.f25055a = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1227t(this.f25055a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1227t(this.f25055a, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.f25055a.f25014a.setValue(null);
        D d = this.f25055a;
        d.b = null;
        Job job = d.n;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        d.n = null;
        D.b(this.f25055a).cancel();
        ((SingleInstanceExecutor) this.f25055a.m.getD()).cancel();
        return Unit.f24250a;
    }
}
