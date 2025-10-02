package me.oriient.internal.services.dataManager.preloading;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final class t extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25383a;
    public final /* synthetic */ DataPreloadingManagerImpl b;
    public final /* synthetic */ n c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(DataPreloadingManagerImpl dataPreloadingManagerImpl, n nVar, Continuation continuation) {
        super(2, continuation);
        this.b = dataPreloadingManagerImpl;
        this.c = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new t(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new t(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25383a;
        if (i == 0) {
            ResultKt.b(obj);
            DataPreloadingManagerImpl dataPreloadingManagerImpl = this.b;
            n nVar = this.c;
            this.f25383a = 1;
            if (dataPreloadingManagerImpl.preloadDataImpl(nVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return Unit.f24250a;
    }
}
