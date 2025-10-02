package me.oriient.internal.services.dataManager.plaiCategories;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.services.plai.database.PlaiSqlDatabase;

/* loaded from: classes7.dex */
public final class K extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25326a;
    public final /* synthetic */ SuspendLambda b;
    public final /* synthetic */ S c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public K(Function2 function2, S s, Continuation continuation) {
        super(2, continuation);
        this.b = (SuspendLambda) function2;
        this.c = s;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new K(this.b, this.c, continuation);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new K(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.coroutines.jvm.internal.SuspendLambda, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25326a;
        try {
            if (i == 0) {
                ResultKt.b(obj);
                ?? r4 = this.b;
                PlaiSqlDatabase plaiSqlDatabase = this.c.b;
                this.f25326a = 1;
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
            ((Logger) this.c.c.getD()).e("PlaiCategoriesDatabase", "execute: db operation failed", e);
        }
        return Unit.f24250a;
    }
}
