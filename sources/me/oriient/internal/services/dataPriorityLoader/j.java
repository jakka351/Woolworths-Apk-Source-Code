package me.oriient.internal.services.dataPriorityLoader;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.NonCancellable;

/* loaded from: classes7.dex */
public final class j extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25433a;
    public /* synthetic */ Object b;
    public final /* synthetic */ DataPriorityLoaderImpl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(DataPriorityLoaderImpl dataPriorityLoaderImpl, Continuation continuation) {
        super(2, continuation);
        this.c = dataPriorityLoaderImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        j jVar = new j(this.c, continuation);
        jVar.b = obj;
        return jVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        j jVar = new j(this.c, (Continuation) obj2);
        jVar.b = (CoroutineScope) obj;
        return jVar.invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25433a;
        if (i == 0) {
            ResultKt.b(obj);
            coroutineScope = (CoroutineScope) this.b;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            coroutineScope = (CoroutineScope) this.b;
            ResultKt.b(obj);
        }
        while (CoroutineScopeKt.d(coroutineScope) && !this.c.shouldCancelAll) {
            n nVar = (n) this.c.taskQueue.take();
            NonCancellable nonCancellable = NonCancellable.e;
            i iVar = new i(nVar, null);
            this.b = coroutineScope;
            this.f25433a = 1;
            if (BuildersKt.f(nonCancellable, iVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.f24250a;
    }
}
