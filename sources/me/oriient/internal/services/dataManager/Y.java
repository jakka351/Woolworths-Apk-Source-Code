package me.oriient.internal.services.dataManager;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.Mapable;
import me.oriient.internal.infra.utils.core.Outcome;

/* loaded from: classes7.dex */
public final class Y extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25087a;
    public /* synthetic */ Object b;
    public final /* synthetic */ DataRepositoryImpl c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Mapable e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(DataRepositoryImpl dataRepositoryImpl, Object obj, Mapable mapable, Continuation continuation) {
        super(2, continuation);
        this.c = dataRepositoryImpl;
        this.d = obj;
        this.e = mapable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        Y y = new Y(this.c, this.d, this.e, continuation);
        y.b = obj;
        return y;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Y) create((CachedDataStatus) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25087a;
        if (i == 0) {
            ResultKt.b(obj);
            int i2 = X.$EnumSwitchMapping$0[((CachedDataStatus) this.b).ordinal()];
            if (i2 == 1) {
                this.c.getLogger().d("DataRepository", "(" + this.c.dataTypeName + ") cache hit is valid");
                return new Outcome.Success(this.d);
            }
            if (i2 != 2) {
                if (i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                this.c.getLogger().d("DataRepository", "(" + this.c.dataTypeName + ") cache hit should be refreshed. Fetching new data in background...");
                this.c.refreshInBackground(this.e);
                return new Outcome.Success(this.d);
            }
            this.c.getLogger().d("DataRepository", "(" + this.c.dataTypeName + ") cache hit is invalid. Fetching new data...");
            DataRepositoryImpl dataRepositoryImpl = this.c;
            Mapable mapable = this.e;
            this.f25087a = 1;
            obj = dataRepositoryImpl.fetchData(mapable, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        return (Outcome) obj;
    }
}
