package me.oriient.internal.services.dataManager.preloading;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScopeKt;

/* loaded from: classes7.dex */
public final class u extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public n f25384a;
    public int b;
    public final /* synthetic */ DataPreloadingManagerImpl c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(DataPreloadingManagerImpl dataPreloadingManagerImpl, String str, Continuation continuation) {
        super(2, continuation);
        this.c = dataPreloadingManagerImpl;
        this.d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new u(this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new u(this.c, this.d, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        n nVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.b;
        Unit unit = Unit.f24250a;
        if (i == 0) {
            ResultKt.b(obj);
            n nVar2 = (n) this.c.preloadingTasks.get(this.d);
            if (nVar2 == null) {
                nVar2 = new n(this.d);
                this.c.preloadingTasks.put(this.d, nVar2);
            }
            m mVar = nVar2.c;
            m mVar2 = m.IN_PROGRESS;
            if (mVar == mVar2) {
                this.c.getLogger().d("DataPreloadingManager", "preloadData: task for building " + this.d + " is already in progress. Returning...");
                return unit;
            }
            this.c.getELog().i("DataPreloadingManager", "Initiated data preloading", new s(this.d));
            Intrinsics.h(mVar2, "<set-?>");
            nVar2.c = mVar2;
            DataPreloadingManagerImpl dataPreloadingManagerImpl = this.c;
            this.f25384a = nVar2;
            this.b = 1;
            if (dataPreloadingManagerImpl.sendTaskUpdate(nVar2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            nVar = nVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            nVar = this.f25384a;
            ResultKt.b(obj);
        }
        nVar.b = BuildersKt.c(CoroutineScopeKt.a(this.c.getCoroutineContextProvider().getIo()), null, null, new t(this.c, nVar, null), 3);
        return unit;
    }
}
