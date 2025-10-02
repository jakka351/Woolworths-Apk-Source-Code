package me.oriient.internal.services.dataManager.preloading;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.internal.services.dataManager.preloading.DataPreloadingManager;

/* loaded from: classes7.dex */
public final class r extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DataPreloadingManagerImpl f25381a;
    public final /* synthetic */ String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(DataPreloadingManagerImpl dataPreloadingManagerImpl, String str, Continuation continuation) {
        super(2, continuation);
        this.f25381a = dataPreloadingManagerImpl;
        this.b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new r(this.f25381a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new r(this.f25381a, this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        m mVar;
        DataPreloadingManager.PreloadingStatus preloadingStatus;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        n nVar = (n) this.f25381a.preloadingTasks.get(this.b);
        return (nVar == null || (mVar = nVar.c) == null || (preloadingStatus = mVar.toPreloadingStatus()) == null) ? DataPreloadingManager.PreloadingStatus.NOT_PRELOADED : preloadingStatus;
    }
}
