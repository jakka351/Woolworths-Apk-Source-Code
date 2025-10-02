package me.oriient.internal.services.dataManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.Mapable;

/* loaded from: classes7.dex */
public final class V extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25085a;
    public final /* synthetic */ DataRepositoryImpl b;
    public final /* synthetic */ Mapable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(DataRepositoryImpl dataRepositoryImpl, Mapable mapable, Continuation continuation) {
        super(2, continuation);
        this.b = dataRepositoryImpl;
        this.c = mapable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new V(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new V(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25085a;
        if (i == 0) {
            ResultKt.b(obj);
            DataRepositoryImpl dataRepositoryImpl = this.b;
            Mapable mapable = this.c;
            this.f25085a = 1;
            if (dataRepositoryImpl.fetchData(mapable, this) == coroutineSingletons) {
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
