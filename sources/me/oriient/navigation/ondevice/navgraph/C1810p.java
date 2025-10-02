package me.oriient.navigation.ondevice.navgraph;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.navigation.common.util.NavigationError;

/* renamed from: me.oriient.navigation.ondevice.navgraph.p, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C1810p extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f26320a;
    public final /* synthetic */ v b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1810p(t tVar, v vVar, Continuation continuation) {
        super(2, continuation);
        this.f26320a = tVar;
        this.b = vVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1810p(this.f26320a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1810p(this.f26320a, this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        try {
            return (Outcome) this.f26320a.invoke(this.b.f26326a.f26352a);
        } catch (Exception e) {
            ((Logger) this.b.c.getD()).e("NavGraphDatabase", "execute: db operation failed", e);
            String message = e.getMessage();
            if (message == null) {
                message = "db operation failed";
            }
            return new Outcome.Failure(new NavigationError.DbError(message));
        }
    }
}
