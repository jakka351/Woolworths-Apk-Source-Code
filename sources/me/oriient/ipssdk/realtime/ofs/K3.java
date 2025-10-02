package me.oriient.ipssdk.realtime.ofs;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import me.oriient.ipssdk.realtime.ips.proximity.local.LocalProximityEventWrapper;
import me.oriient.ipssdk.realtime.ips.proximity.local.ProximityEventManagerImpl;

/* loaded from: classes8.dex */
public final /* synthetic */ class K3 extends FunctionReferenceImpl implements Function1 {
    public K3(Object obj) {
        super(1, obj, ProximityEventManagerImpl.class, "onEventConditionMet", "onEventConditionMet(Lme/oriient/ipssdk/realtime/ips/proximity/local/LocalProximityEventWrapper;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LocalProximityEventWrapper p0 = (LocalProximityEventWrapper) obj;
        Intrinsics.h(p0, "p0");
        ProximityEventManagerImpl proximityEventManagerImpl = (ProximityEventManagerImpl) this.receiver;
        BuildersKt.c(proximityEventManagerImpl.i, null, null, new N3(p0, proximityEventManagerImpl, null), 3);
        return Unit.f24250a;
    }
}
