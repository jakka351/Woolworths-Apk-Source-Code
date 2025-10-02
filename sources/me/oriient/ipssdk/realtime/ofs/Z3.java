package me.oriient.ipssdk.realtime.ofs;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.ipssdk.realtime.ips.proximity.ProximityMetadataImpl;
import me.oriient.ipssdk.realtime.ips.proximity.ProximityStatsManagerImpl;
import me.oriient.ipssdk.realtime.ips.proximity.local.ProximityEventOrigin;

/* loaded from: classes8.dex */
public final class Z3 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProximityStatsManagerImpl f26039a;
    public final /* synthetic */ ProximityEventOrigin b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z3(ProximityStatsManagerImpl proximityStatsManagerImpl, ProximityEventOrigin proximityEventOrigin, int i, Continuation continuation) {
        super(2, continuation);
        this.f26039a = proximityStatsManagerImpl;
        this.b = proximityEventOrigin;
        this.c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Z3(this.f26039a, this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((Z3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        ProximityMetadataImpl proximityMetadataImpl = (ProximityMetadataImpl) this.f26039a.c.get(this.b);
        Unit unit = Unit.f24250a;
        if (proximityMetadataImpl == null) {
            return unit;
        }
        if (this.f26039a.d) {
            proximityMetadataImpl.setTriggersCreated(Math.max(proximityMetadataImpl.getTriggersCreated(), this.c));
        } else {
            proximityMetadataImpl.setTriggersCreated(this.c);
        }
        return unit;
    }
}
