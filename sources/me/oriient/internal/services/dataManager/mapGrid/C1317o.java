package me.oriient.internal.services.dataManager.mapGrid;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.DbError;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;

/* renamed from: me.oriient.internal.services.dataManager.mapGrid.o, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1317o extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f25220a;
    public final /* synthetic */ C1321t b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1317o(r rVar, C1321t c1321t, Continuation continuation) {
        super(2, continuation);
        this.f25220a = rVar;
        this.b = c1321t;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1317o(this.f25220a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1317o(this.f25220a, this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        try {
            return (Outcome) this.f25220a.invoke(this.b.b.getMapGridQueries());
        } catch (Exception e) {
            ((Logger) this.b.d.getD()).e("MapGridDatabase", "execute: db operation failed", e);
            String message = e.getMessage();
            if (message == null) {
                message = "db operation failed";
            }
            return new Outcome.Failure(new DbError(message));
        }
    }
}
