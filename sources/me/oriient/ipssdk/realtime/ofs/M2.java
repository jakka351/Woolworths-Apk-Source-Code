package me.oriient.ipssdk.realtime.ofs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import me.oriient.internal.infra.utils.core.Outcome;
import me.oriient.ipssdk.api.listeners.IPSRouteListener;
import me.oriient.ipssdk.api.models.IPSWaypoint;
import me.oriient.ipssdk.realtime.ips.Navigation;
import me.oriient.ipssdk.realtime.ips.NavigationExtKt;
import me.oriient.ipssdk.realtime.utils.ExtensionsKt;
import me.oriient.navigation.common.NavigationManager;
import me.oriient.navigation.common.models.NavigationWaypoint;
import me.oriient.navigation.common.models.Route;
import me.oriient.navigation.common.util.NavigationError;

/* loaded from: classes8.dex */
public final class M2 extends SuspendLambda implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public int f25975a;
    public final /* synthetic */ String b;
    public final /* synthetic */ List c;
    public final /* synthetic */ IPSWaypoint d;
    public final /* synthetic */ IPSRouteListener e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M2(String str, List list, IPSWaypoint iPSWaypoint, IPSRouteListener iPSRouteListener, Continuation continuation) {
        super(2, continuation);
        this.b = str;
        this.c = list;
        this.d = iPSWaypoint;
        this.e = iPSRouteListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new M2(this.b, this.c, this.d, this.e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((M2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        int i = this.f25975a;
        if (i == 0) {
            ResultKt.b(obj);
            NavigationManager navigationManagerAccess$getNavigationManager = Navigation.access$getNavigationManager(Navigation.INSTANCE);
            String str = this.b;
            List list = this.c;
            ArrayList arrayList = new ArrayList(CollectionsKt.s(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(NavigationExtKt.toNavigationWaypoint((IPSWaypoint) it.next()));
            }
            IPSWaypoint iPSWaypoint = this.d;
            NavigationWaypoint navigationWaypoint = iPSWaypoint != null ? NavigationExtKt.toNavigationWaypoint(iPSWaypoint) : null;
            this.f25975a = 1;
            obj = navigationManagerAccess$getNavigationManager.findRouteInBuilding(str, arrayList, navigationWaypoint, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(obj);
        }
        Outcome outcome = (Outcome) obj;
        IPSRouteListener iPSRouteListener = this.e;
        if (outcome instanceof Outcome.Success) {
            Route route = (Route) ((Outcome.Success) outcome).getValue();
            if (iPSRouteListener != null) {
                iPSRouteListener.onRouteReceived(NavigationExtKt.toSdkRoute(route));
            }
        }
        IPSRouteListener iPSRouteListener2 = this.e;
        if (outcome instanceof Outcome.Failure) {
            NavigationError navigationError = (NavigationError) ((Outcome.Failure) outcome).getValue();
            if (iPSRouteListener2 != null) {
                iPSRouteListener2.onError(ExtensionsKt.toIpsError(navigationError));
            }
        }
        return Unit.f24250a;
    }
}
