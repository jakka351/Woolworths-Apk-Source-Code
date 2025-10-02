package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import me.oriient.ipssdk.realtime.debugInfo.DebugInfoManagerImpl;

/* loaded from: classes8.dex */
public final class B1 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25914a;
    public final /* synthetic */ DebugInfoManagerImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B1(DebugInfoManagerImpl debugInfoManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.b = debugInfoManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new B1(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new B1(this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25914a;
        if (i == 0) {
            ResultKt.b(obj);
            FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1 = new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(DebugInfoManagerImpl.access$getEngineManager(this.b).getEngine());
            A1 a1 = new A1(this.b, null);
            this.f25914a = 1;
            if (FlowKt.h(flowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1, a1, this) == coroutineSingletons) {
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
