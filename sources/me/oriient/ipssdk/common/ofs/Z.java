package me.oriient.ipssdk.common.ofs;

import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* loaded from: classes2.dex */
public final class Z extends SuspendLambda implements Function3 {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Map f25737a;

    public Z(Continuation continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Z z = new Z((Continuation) obj3);
        z.f25737a = (Map) obj;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(Unit.f24250a);
        return z.f25737a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        return this.f25737a;
    }
}
