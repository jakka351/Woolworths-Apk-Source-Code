package me.oriient.internal.services.sensorsManager;

import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* loaded from: classes7.dex */
public final class n0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OriientSensorWrapper f25585a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(OriientSensorWrapper oriientSensorWrapper, Continuation continuation) {
        super(2, continuation);
        this.f25585a = oriientSensorWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new n0(this.f25585a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new n0(this.f25585a, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        return new Pair(this.f25585a, Boolean.TRUE);
    }
}
