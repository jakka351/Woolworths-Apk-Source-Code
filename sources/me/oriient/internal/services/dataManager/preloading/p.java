package me.oriient.internal.services.dataManager.preloading;

import java.util.Collection;
import java.util.Iterator;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final class p extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public DataPreloadingManagerImpl f25379a;
    public Iterator b;
    public int c;
    public final /* synthetic */ DataPreloadingManagerImpl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(DataPreloadingManagerImpl dataPreloadingManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.d = dataPreloadingManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new p(this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new p(this.d, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DataPreloadingManagerImpl dataPreloadingManagerImpl;
        Iterator it;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.c;
        if (i == 0) {
            ResultKt.b(obj);
            Collection collectionValues = this.d.preloadingTasks.values();
            dataPreloadingManagerImpl = this.d;
            it = collectionValues.iterator();
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.b;
            dataPreloadingManagerImpl = this.f25379a;
            ResultKt.b(obj);
        }
        while (it.hasNext()) {
            n nVar = (n) it.next();
            this.f25379a = dataPreloadingManagerImpl;
            this.b = it;
            this.c = 1;
            if (dataPreloadingManagerImpl.cancelPreloadingTask(nVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return Unit.f24250a;
    }
}
