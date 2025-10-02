package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.ipssdk.realtime.ips.proximity.local.ProximityEventManagerImpl;

/* loaded from: classes8.dex */
public final class O3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProximityEventManagerImpl f25987a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O3(ProximityEventManagerImpl proximityEventManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.f25987a = proximityEventManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new O3(this.f25987a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new O3(this.f25987a, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        this.f25987a.j.clear();
        ProximityEventManagerImpl.access$getProximityStatsManager(this.f25987a).onNewTriggersCount(this.f25987a.f25902a, this.f25987a.j.size());
        return Unit.f24250a;
    }
}
