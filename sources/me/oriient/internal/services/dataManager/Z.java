package me.oriient.internal.services.dataManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.Mapable;

/* loaded from: classes7.dex */
public final class Z extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25088a;
    public final /* synthetic */ DataRepositoryImpl b;
    public final /* synthetic */ Mapable c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(DataRepositoryImpl dataRepositoryImpl, Mapable mapable, Object obj, Continuation continuation) {
        super(2, continuation);
        this.b = dataRepositoryImpl;
        this.c = mapable;
        this.d = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Z(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Z) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25088a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        DataCache dataCache = this.b.cache;
        Mapable mapable = this.c;
        Object obj2 = this.d;
        this.f25088a = 1;
        Object objSave = dataCache.save(mapable, obj2, this);
        return objSave == coroutineSingletons ? coroutineSingletons : objSave;
    }
}
