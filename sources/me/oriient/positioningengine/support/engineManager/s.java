package me.oriient.positioningengine.support.engineManager;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import me.oriient.internal.infra.utils.core.coroutines.CoroutineContextProvider;

/* loaded from: classes8.dex */
public final class s extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26543a;
    public final /* synthetic */ SupportPositioningEngineManagerImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(SupportPositioningEngineManagerImpl supportPositioningEngineManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = supportPositioningEngineManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new s(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new s(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26543a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        me.oriient.positioningengine.ondevice.ml.i mlModelRepository = this.b.getMlModelRepository();
        this.f26543a = 1;
        me.oriient.positioningengine.ondevice.ml.o oVar = (me.oriient.positioningengine.ondevice.ml.o) mlModelRepository;
        Object objF = BuildersKt.f(((CoroutineContextProvider) oVar.d.getD()).getIo(), new me.oriient.positioningengine.ondevice.ml.n(oVar, null), this);
        return objF == coroutineSingletons ? coroutineSingletons : objF;
    }
}
