package me.oriient.internal.services.dataManager.plai;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.services.plai.database.PlaiSqlDatabase;

/* renamed from: me.oriient.internal.services.dataManager.plai.e, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1355e extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25297a;

    public C1355e(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C1355e c1355e = new C1355e(continuation);
        c1355e.f25297a = obj;
        return c1355e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C1355e c1355e = new C1355e((Continuation) obj2);
        c1355e.f25297a = (PlaiSqlDatabase) obj;
        return c1355e.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        PlaiSqlDatabase plaiSqlDatabase = (PlaiSqlDatabase) this.f25297a;
        plaiSqlDatabase.getPlaiStatisticsQueries().clearStatistics();
        plaiSqlDatabase.getPlaiProductsQueries().clearProducts();
        return Unit.f24250a;
    }
}
