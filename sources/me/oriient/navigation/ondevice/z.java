package me.oriient.navigation.ondevice;

import java.util.ArrayList;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import me.oriient.internal.infra.utils.core.Logger;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.services.elog.ELog;
import me.oriient.navigation.common.models.NavigationWaypoint;
import me.oriient.navigation.common.util.NavigationError;

/* loaded from: classes8.dex */
public final class z extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ J f26363a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;
    public final /* synthetic */ NavigationWaypoint d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(J j, String str, List list, NavigationWaypoint navigationWaypoint, Continuation continuation) {
        super(2, continuation);
        this.f26363a = j;
        this.b = str;
        this.c = list;
        this.d = navigationWaypoint;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new z(this.f26363a, this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((z) create((Unit) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int size;
        List waypoints;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        J j = this.f26363a;
        String buildingId = this.b;
        List list = this.c;
        NavigationWaypoint navigationWaypoint = this.d;
        Logger logger = (Logger) j.f26280a.getD();
        StringBuilder sbS = au.com.woolworths.android.onesite.a.s("findRoute() called with: buildingId = ", buildingId, ", waypoints = ", ", finalWaypointIndex = ", list);
        sbS.append(navigationWaypoint);
        logger.d("OnDeviceNavigationCore", sbS.toString());
        if (navigationWaypoint == null) {
            size = -1;
            waypoints = list;
        } else {
            ArrayList arrayListD0 = CollectionsKt.d0(navigationWaypoint, list);
            size = arrayListD0.size();
            waypoints = arrayListD0;
        }
        NdkBridgeImpl ndkBridgeImpl = (NdkBridgeImpl) ((p) j.c.getD());
        ndkBridgeImpl.getClass();
        Intrinsics.h(buildingId, "buildingId");
        Intrinsics.h(waypoints, "waypoints");
        Outcome outcomeA = ndkBridgeImpl.a(new q(ndkBridgeImpl, buildingId, waypoints, size));
        if (outcomeA instanceof Outcome.Failure) {
            ((ELog) j.b.getD()).e("OnDeviceNavigationCore", "Cannot use findRouteInBuilding in navigation engine", new x((NavigationError) ((Outcome.Failure) outcomeA).getValue(), buildingId, list, navigationWaypoint));
        }
        return outcomeA.map(y.f26362a);
    }
}
