package me.oriient.positioningengine.support.engineManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;
import me.oriient.positioningengine.support.C1843e;
import me.oriient.positioningengine.support.C1846f;
import me.oriient.positioningengine.support.InterfaceC1840b;

/* loaded from: classes8.dex */
public final class t extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26544a;
    public final /* synthetic */ SupportPositioningEngineManagerImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(SupportPositioningEngineManagerImpl supportPositioningEngineManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = supportPositioningEngineManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new t(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new t(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26544a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        InterfaceC1840b engineSessionRepository = this.b.getEngineSessionRepository();
        this.f26544a = 1;
        C1846f c1846f = (C1846f) engineSessionRepository;
        Object objF = BuildersKt.f(((CoroutineContextProvider) c1846f.b.getD()).getIo(), new C1843e(c1846f, null), this);
        return objF == coroutineSingletons ? coroutineSingletons : objF;
    }
}
