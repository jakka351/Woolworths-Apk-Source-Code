package me.oriient.navigation.common;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.MutableSharedFlow;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.navigation.common.models.NavigationBuilding;
import me.oriient.navigation.common.models.NavigationWaypoint;
import me.oriient.navigation.common.util.NavigationError;

/* loaded from: classes8.dex */
public final class b0 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public NavigationManagerImpl f26233a;
    public int b;
    public final /* synthetic */ NavigationWaypoint c;
    public final /* synthetic */ NavigationManagerImpl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(NavigationWaypoint navigationWaypoint, NavigationManagerImpl navigationManagerImpl, Continuation continuation) {
        super(2, continuation);
        this.c = navigationWaypoint;
        this.d = navigationManagerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new b0(this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new b0(this.c, this.d, (Continuation) obj2).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NavigationManagerImpl navigationManagerImpl;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.b;
        Unit unit = Unit.f24250a;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    ResultKt.b(obj);
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            navigationManagerImpl = this.f26233a;
            ResultKt.b(obj);
            navigationManagerImpl.onNewLiveNavigationFinalWaypoint(null);
            return unit;
        }
        ResultKt.b(obj);
        NavigationWaypoint navigationWaypoint = this.c;
        if (navigationWaypoint != null) {
            NavigationManagerImpl navigationManagerImpl2 = this.d;
            u0 waypointValidator = navigationManagerImpl2.getWaypointValidator();
            NavigationBuilding navigationBuilding = (NavigationBuilding) navigationManagerImpl2.getPositionProvider().getCurrentBuilding().getValue();
            String id = navigationBuilding != null ? navigationBuilding.getId() : null;
            NavigationBuilding navigationBuilding2 = (NavigationBuilding) navigationManagerImpl2.getPositionProvider().getCurrentBuilding().getValue();
            ((v0) waypointValidator).getClass();
            Outcome outcomeA = v0.a(navigationWaypoint, id, navigationBuilding2);
            if (outcomeA instanceof Outcome.Failure) {
                NavigationError navigationError = (NavigationError) ((Outcome.Failure) outcomeA).getValue();
                navigationManagerImpl2.getELog().e("NavigationManager", "Invalid final live navigation waypoint", new a0(navigationError));
                navigationManagerImpl2.lastRoute = null;
                MutableSharedFlow<NavigationError> liveNavigationErrors = navigationManagerImpl2.getLiveNavigationErrors();
                this.f26233a = navigationManagerImpl2;
                this.b = 1;
                if (liveNavigationErrors.emit(navigationError, this) != coroutineSingletons) {
                    navigationManagerImpl = navigationManagerImpl2;
                    navigationManagerImpl.onNewLiveNavigationFinalWaypoint(null);
                    return unit;
                }
            }
        }
        if (this.c == null) {
            this.d.getELog().d("NavigationManager", "Clean final live navigation waypoint");
        } else {
            this.d.getELog().d("NavigationManager", "Set new final live navigation waypoint");
        }
        this.d._liveFinalWaypoint = this.c;
        this.d.updateWaypointsCounter();
        this.d.cancelCurrentRequest();
        this.d.lastRoute = null;
        NavigationManagerImpl navigationManagerImpl3 = this.d;
        this.b = 2;
        return NavigationManagerImpl.updateRoute$default(navigationManagerImpl3, null, this, 1, null) == coroutineSingletons ? coroutineSingletons : unit;
    }
}
