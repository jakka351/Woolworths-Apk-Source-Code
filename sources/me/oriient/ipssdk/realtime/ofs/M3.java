package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityEventWrapper;

/* loaded from: classes8.dex */
public final class M3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocalProximityEventWrapper f25976a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M3(LocalProximityEventWrapper localProximityEventWrapper, Continuation continuation) {
        super(2, continuation);
        this.f25976a = localProximityEventWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new M3(this.f25976a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new M3(this.f25976a, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.f25976a.getEvent().getAction().invoke();
        return Unit.f24250a;
    }
}
