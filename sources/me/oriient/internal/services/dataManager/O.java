package me.oriient.internal.services.dataManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import me.oriient.internal.infra.utils.core.Mapable;
import me.oriient.internal.infra.utils.core.Outcome;

/* loaded from: classes7.dex */
public final class O extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25079a;
    public /* synthetic */ Object b;
    public final /* synthetic */ DataRepositoryImpl c;
    public final /* synthetic */ Mapable d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(DataRepositoryImpl dataRepositoryImpl, Mapable mapable, Continuation continuation) {
        super(2, continuation);
        this.c = dataRepositoryImpl;
        this.d = mapable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        O o = new O(this.c, this.d, continuation);
        o.b = obj;
        return o;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((O) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25079a;
        if (i == 0) {
            ResultKt.b(obj);
            Deferred deferredA = BuildersKt.a((CoroutineScope) this.b, null, new N(this.c, this.d, null), 3);
            Object obj2 = this.c.pendingFetchMapLock;
            DataRepositoryImpl dataRepositoryImpl = this.c;
            Mapable mapable = this.d;
            synchronized (obj2) {
                dataRepositoryImpl.pendingFetchRequests.put(mapable, deferredA);
            }
            this.f25079a = 1;
            obj = deferredA.await(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        Outcome outcome = (Outcome) obj;
        Object obj3 = this.c.pendingFetchMapLock;
        DataRepositoryImpl dataRepositoryImpl2 = this.c;
        Mapable mapable2 = this.d;
        synchronized (obj3) {
        }
        return outcome;
    }
}
