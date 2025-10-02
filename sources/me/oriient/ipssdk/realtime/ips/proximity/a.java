package me.oriient.ipssdk.realtime.ips.proximity;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.ipssdk.realtime.ips.proximity.ProximityStatsManager;
import me.oriient.ipssdk.realtime.ips.proximity.local.ProximityEventOrigin;

/* loaded from: classes8.dex */
public final class a extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProximityStatsManagerImpl f25890a;
    public final /* synthetic */ ProximityEventOrigin b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ProximityStatsManager.EventShape d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ProximityStatsManagerImpl proximityStatsManagerImpl, ProximityEventOrigin proximityEventOrigin, boolean z, ProximityStatsManager.EventShape eventShape, Continuation continuation) {
        super(2, continuation);
        this.f25890a = proximityStatsManagerImpl;
        this.b = proximityEventOrigin;
        this.c = z;
        this.d = eventShape;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new a(this.f25890a, this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((a) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        ProximityMetadataImpl proximityMetadataImpl = (ProximityMetadataImpl) this.f25890a.c.get(this.b);
        Unit unit = Unit.f24250a;
        if (proximityMetadataImpl == null) {
            return unit;
        }
        proximityMetadataImpl.setTriggersTriggered(proximityMetadataImpl.getTriggersTriggered() + 1);
        if (this.c) {
            proximityMetadataImpl.setTriggersTriggeredUnique(proximityMetadataImpl.getTriggersTriggeredUnique() + 1);
        }
        int i = ProximityStatsManagerImpl$onEventTriggered$1$WhenMappings.$EnumSwitchMapping$0[this.d.ordinal()];
        if (i == 1) {
            proximityMetadataImpl.setTriggersTriggeredCircle(proximityMetadataImpl.getTriggersTriggeredCircle() + 1);
        } else if (i == 2) {
            proximityMetadataImpl.setTriggersTriggeredPolygon(proximityMetadataImpl.getTriggersTriggeredPolygon() + 1);
        } else if (i == 3) {
            proximityMetadataImpl.setTriggersTriggeredRectangle(proximityMetadataImpl.getTriggersTriggeredRectangle() + 1);
        } else if (i == 4) {
            proximityMetadataImpl.setTriggersTriggeredWalkingDistance(proximityMetadataImpl.getTriggersTriggeredWalkingDistance() + 1);
        }
        return unit;
    }
}
