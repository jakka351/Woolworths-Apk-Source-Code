package me.oriient.internal.services.dataManager.plai;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import me.oriient.internal.infra.utils.core.DbError;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.OutcomeKt;

/* renamed from: me.oriient.internal.services.dataManager.plai.h, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1358h extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Lambda f25300a;
    public final /* synthetic */ C1364n b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1358h(Function1 function1, C1364n c1364n, Continuation continuation) {
        super(2, continuation);
        this.f25300a = (Lambda) function1;
        this.b = c1364n;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1358h(this.f25300a, this.b, continuation);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1358h(this.f25300a, this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        try {
            return (Outcome) this.f25300a.invoke(this.b.b);
        } catch (Exception e) {
            ((Logger) this.b.c.getD()).e("PlaiDatabase", "execute: db operation failed", e);
            String message = e.getMessage();
            if (message == null) {
                message = "db operation failed";
            }
            return OutcomeKt.toOutcomeFailure(new DbError(message));
        }
    }
}
