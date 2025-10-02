package me.oriient.internal.services.dataManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.infra.utils.core.Mapable;
import me.oriient.internal.infra.utils.core.Outcome;

/* loaded from: classes7.dex */
public final class S extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25082a;
    public /* synthetic */ Object b;
    public final /* synthetic */ DataRepositoryImpl c;
    public final /* synthetic */ Mapable d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S(DataRepositoryImpl dataRepositoryImpl, Mapable mapable, Continuation continuation) {
        super(2, continuation);
        this.c = dataRepositoryImpl;
        this.d = mapable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        S s = new S(this.c, this.d, continuation);
        s.b = obj;
        return s;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((S) create(obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25082a;
        if (i == 0) {
            ResultKt.b(obj);
            Object obj3 = this.b;
            DataCache dataCache = this.c.cache;
            Mapable mapable = this.d;
            this.b = obj3;
            this.f25082a = 1;
            Object objSave = dataCache.save(mapable, obj3, this);
            if (objSave == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj2 = obj3;
            obj = objSave;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = this.b;
            ResultKt.b(obj);
        }
        return ((Outcome) obj).map(new Q(obj2));
    }
}
