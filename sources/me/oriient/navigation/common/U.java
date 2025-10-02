package me.oriient.navigation.common;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.internal.infra.utils.core.OutcomeKt;
import me.oriient.navigation.common.models.NavigationBuilding;
import me.oriient.navigation.common.models.NavigationWaypoint;
import me.oriient.navigation.common.util.NavigationError;

/* loaded from: classes8.dex */
public final class U extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f26224a;
    public final /* synthetic */ NavigationManagerImpl b;
    public final /* synthetic */ String c;
    public final /* synthetic */ List d;
    public final /* synthetic */ NavigationWaypoint e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U(NavigationManagerImpl navigationManagerImpl, String str, List list, NavigationWaypoint navigationWaypoint, Continuation continuation) {
        super(2, continuation);
        this.b = navigationManagerImpl;
        this.c = str;
        this.d = list;
        this.e = navigationWaypoint;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new U(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((U) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f26224a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
            return obj;
        }
        ResultKt.b(obj);
        this.b.getLogger().d("NavigationManager", "findRouteInBuilding() called with: buildingId = " + this.c + ", waypoints = " + this.d + ", finalWaypoint = " + this.e);
        if (this.d.size() + (this.e != null ? 1 : 0) < 2) {
            this.b.getELog().e("NavigationManager", "Invalid waypoints", O.f26219a);
            return new Outcome.Failure(new NavigationError.InvalidInputError("At least 2 waypoints are necessary to calculate a route"));
        }
        InterfaceC1783y interfaceC1783y = this.b.navigationCore;
        if (interfaceC1783y == null) {
            return new Outcome.Failure(new NavigationError.InternalError("Navigation service is not ready"));
        }
        NavigationWaypoint navigationWaypoint = this.e;
        if (navigationWaypoint != null) {
            NavigationManagerImpl navigationManagerImpl = this.b;
            String str = this.c;
            ((v0) navigationManagerImpl.getWaypointValidator()).getClass();
            Outcome outcomeA = v0.a(navigationWaypoint, str, (NavigationBuilding) null);
            if (outcomeA instanceof Outcome.Failure) {
                NavigationError navigationError = (NavigationError) ((Outcome.Failure) outcomeA).getValue();
                navigationManagerImpl.getELog().e("NavigationManager", "Invalid final waypoint", new P(navigationError));
                return OutcomeKt.toOutcomeFailure(navigationError);
            }
        }
        Outcome outcomeA2 = ((v0) this.b.getWaypointValidator()).a(this.d, this.c, (NavigationBuilding) null);
        NavigationManagerImpl navigationManagerImpl2 = this.b;
        if (outcomeA2 instanceof Outcome.Failure) {
            navigationManagerImpl2.getELog().e("NavigationManager", "Invalid waypoints", new Q((NavigationError) ((Outcome.Failure) outcomeA2).getValue()));
        }
        T t = new T(interfaceC1783y, this.c, this.e, null);
        this.f26224a = 1;
        Object objThen = outcomeA2.then(t, this);
        return objThen == coroutineSingletons ? coroutineSingletons : objThen;
    }
}
