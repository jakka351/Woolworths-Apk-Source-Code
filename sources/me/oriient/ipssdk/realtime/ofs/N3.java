package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityEventWrapper;
import me.oriient.ipssdk.realtime.ips.proximity.local.ProximityEventManagerImpl;

/* loaded from: classes8.dex */
public final class N3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LocalProximityEventWrapper f25982a;
    public final /* synthetic */ ProximityEventManagerImpl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N3(LocalProximityEventWrapper localProximityEventWrapper, ProximityEventManagerImpl proximityEventManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.f25982a = localProximityEventWrapper;
        this.b = proximityEventManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new N3(this.f25982a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new N3(this.f25982a, this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        ProximityEventManagerImpl.access$getELog(this.b).i("LocalProximityManager", "Action triggered", new L3(this.f25982a.getEvent(), this.f25982a));
        if (this.f25982a.getIsConsumed()) {
            this.b.j.remove(this.f25982a);
            ProximityEventManagerImpl.access$getProximityStatsManager(this.b).onNewTriggersCount(this.b.f25902a, this.b.j.size());
        }
        BuildersKt.c(this.b.h, null, null, new M3(this.f25982a, null), 3);
        return Unit.f24250a;
    }
}
