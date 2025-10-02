package me.oriient.internal.services.dataManager.plai;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.plai.database.PlaiSqlDatabase;

/* renamed from: me.oriient.internal.services.dataManager.plai.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1357g extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25299a;
    public final /* synthetic */ SuspendLambda b;
    public final /* synthetic */ C1364n c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1357g(Function2 function2, C1364n c1364n, Continuation continuation) {
        super(2, continuation);
        this.b = (SuspendLambda) function2;
        this.c = c1364n;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1357g(this.b, this.c, continuation);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1357g(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25299a;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                ?? r4 = this.b;
                PlaiSqlDatabase plaiSqlDatabase = this.c.b;
                this.f25299a = 1;
                if (r4.invoke(plaiSqlDatabase, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
        } catch (Exception e) {
            ((Logger) this.c.c.getD()).e("PlaiDatabase", "execute: db operation failed", e);
        }
        return Unit.f24250a;
    }
}
