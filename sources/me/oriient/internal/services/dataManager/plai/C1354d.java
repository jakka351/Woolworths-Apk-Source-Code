package me.oriient.internal.services.dataManager.plai;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.services.plai.database.PlaiSqlDatabase;

/* renamed from: me.oriient.internal.services.dataManager.plai.d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C1354d extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f25296a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1354d(String str, Continuation continuation) {
        super(2, continuation);
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        C1354d c1354d = new C1354d(this.b, continuation);
        c1354d.f25296a = obj;
        return c1354d;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C1354d c1354d = new C1354d(this.b, (Continuation) obj2);
        c1354d.f25296a = (PlaiSqlDatabase) obj;
        return c1354d.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        PlaiSqlDatabase plaiSqlDatabase = (PlaiSqlDatabase) this.f25296a;
        plaiSqlDatabase.transaction(false, new C1353c(plaiSqlDatabase, this.b));
        return Unit.f24250a;
    }
}
