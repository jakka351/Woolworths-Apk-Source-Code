package me.oriient.internal.services.dataManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.Mapable;

/* loaded from: classes7.dex */
public final class U extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25084a;
    public final /* synthetic */ DataRepositoryImpl b;
    public final /* synthetic */ Mapable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(DataRepositoryImpl dataRepositoryImpl, Mapable mapable, Continuation continuation) {
        super(2, continuation);
        this.b = dataRepositoryImpl;
        this.c = mapable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new U(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new U(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25084a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        DataRepositoryImpl dataRepositoryImpl = this.b;
        Mapable mapable = this.c;
        this.f25084a = 1;
        Object objFetchData = dataRepositoryImpl.fetchData(mapable, this);
        return objFetchData == coroutineSingletons ? coroutineSingletons : objFetchData;
    }
}
