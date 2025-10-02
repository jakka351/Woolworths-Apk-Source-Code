package me.oriient.internal.services.dataManager.preloading;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final class v extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25385a;
    public final /* synthetic */ DataPreloadingManagerImpl b;
    public final /* synthetic */ DataPreloader c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(DataPreloadingManagerImpl dataPreloadingManagerImpl, DataPreloader dataPreloader, Continuation continuation) {
        super(2, continuation);
        this.b = dataPreloadingManagerImpl;
        this.c = dataPreloader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new v(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new v(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25385a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        this.b.getLogger().d("DataPreloadingManager", "preloadDataImpl: calling universal preloader - " + this.c.getDataTypeDescription());
        DataPreloader dataPreloader = this.c;
        this.f25385a = 1;
        Object objPreloadData = dataPreloader.preloadData(Unit.f24250a, this);
        return objPreloadData == coroutineSingletons ? coroutineSingletons : objPreloadData;
    }
}
