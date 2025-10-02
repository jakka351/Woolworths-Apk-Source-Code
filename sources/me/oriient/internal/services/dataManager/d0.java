package me.oriient.internal.services.dataManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final class d0 extends SuspendLambda implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public int f25130a;
    public final /* synthetic */ SimpleDataSource b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(SimpleDataSource simpleDataSource, Object obj, Continuation continuation) {
        super(1, continuation);
        this.b = simpleDataSource;
        this.c = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new d0(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new d0(this.b, this.c, (Continuation) obj).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25130a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        Function2 function2 = this.b.fetchData;
        Object obj2 = this.c;
        this.f25130a = 1;
        Object objInvoke = function2.invoke(obj2, this);
        return objInvoke == coroutineSingletons ? coroutineSingletons : objInvoke;
    }
}
