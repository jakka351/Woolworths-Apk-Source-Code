package me.oriient.ipssdk.realtime.ofs;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import me.oriient.ipssdk.realtime.ips.proximity.local.ProximityEventManagerImpl;

/* loaded from: classes8.dex */
public final class S3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProximityEventManagerImpl f26007a;
    public final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S3(ProximityEventManagerImpl proximityEventManagerImpl, List list, Continuation continuation) {
        super(2, continuation);
        this.f26007a = proximityEventManagerImpl;
        this.b = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new S3(this.f26007a, this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new S3(this.f26007a, this.b, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        CollectionsKt.f0(this.f26007a.j, new R3(this.b));
        ProximityEventManagerImpl.access$getProximityStatsManager(this.f26007a).onNewTriggersCount(this.f26007a.f25902a, this.f26007a.j.size());
        return Unit.f24250a;
    }
}
