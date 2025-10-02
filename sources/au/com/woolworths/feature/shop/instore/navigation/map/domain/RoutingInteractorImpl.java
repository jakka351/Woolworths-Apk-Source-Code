package au.com.woolworths.feature.shop.instore.navigation.map.domain;

import androidx.compose.runtime.internal.StabilityInferred;
import au.com.woolworths.feature.shop.instore.navigation.map.content.OriientMapContent;
import au.com.woolworths.feature.shop.instore.navigation.map.content.PinContent;
import au.com.woolworths.feature.shop.instore.navigation.map.data.Building;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMapRouteKt;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMetersCoordinate;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientPosition;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientWaypoint;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.PositioningInteractor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import me.oriient.ipssdk.api.listeners.IPSLiveNavigationListener;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.api.models.IPSRoute;
import me.oriient.ipssdk.ips.IPSNavigation;
import timber.log.Timber;

@StabilityInferred
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/RoutingInteractorImpl;", "Lau/com/woolworths/feature/shop/instore/navigation/map/domain/RoutingInteractor;", "LiveNavigationListener", "Companion", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class RoutingInteractorImpl implements RoutingInteractor {

    /* renamed from: a, reason: collision with root package name */
    public final PositioningInteractor f7374a;
    public final BuildingInteractor b;
    public final MutableStateFlow c;
    public final MutableStateFlow d;
    public final MutableStateFlow e;
    public final SharedFlowImpl f;
    public final MutableStateFlow g;
    public final MutableStateFlow h;
    public Job i;
    public final LiveNavigationListener j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/RoutingInteractorImpl$Companion;", "", "", "FINAL_WAYPOINT_ID", "Ljava/lang/String;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/feature/shop/instore/navigation/map/domain/RoutingInteractorImpl$LiveNavigationListener;", "Lme/oriient/ipssdk/api/listeners/IPSLiveNavigationListener;", "instore-navigation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class LiveNavigationListener implements IPSLiveNavigationListener {
        public LiveNavigationListener() {
        }

        @Override // me.oriient.ipssdk.api.listeners.IPSFailable
        public final void onError(IPSError error) {
            Intrinsics.h(error, "error");
            Timber.f27013a.b("onError() called with: error = " + error, new Object[0]);
            RoutingInteractorImpl routingInteractorImpl = RoutingInteractorImpl.this;
            if (routingInteractorImpl.g()) {
                routingInteractorImpl.f.f(OriientErrorKt.a(error));
            }
        }

        @Override // me.oriient.ipssdk.api.listeners.IPSLiveNavigationListener
        public final void onNavigationUpdate(IPSRoute ipsRoute) {
            Intrinsics.h(ipsRoute, "ipsRoute");
            RoutingInteractorImpl routingInteractorImpl = RoutingInteractorImpl.this;
            if (routingInteractorImpl.g()) {
                Timber.f27013a.b("onNavigationUpdate() called with: ipsRoute = " + ipsRoute, new Object[0]);
                Job job = routingInteractorImpl.i;
                if (job != null) {
                    job.cancel((CancellationException) null);
                }
                routingInteractorImpl.i = null;
                routingInteractorImpl.g.setValue(OriientMapRouteKt.b(ipsRoute));
            }
        }
    }

    public RoutingInteractorImpl(PositioningInteractor positioningInteractor, BuildingInteractor buildingInteractor) {
        Intrinsics.h(positioningInteractor, "positioningInteractor");
        Intrinsics.h(buildingInteractor, "buildingInteractor");
        this.f7374a = positioningInteractor;
        this.b = buildingInteractor;
        this.c = StateFlowKt.a(EmptyList.d);
        this.d = StateFlowKt.a(null);
        this.e = StateFlowKt.a(null);
        this.f = SharedFlowKt.a(0, 1, BufferOverflow.e);
        this.g = StateFlowKt.a(null);
        this.h = StateFlowKt.a(null);
        this.j = new LiveNavigationListener();
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.RoutingInteractor
    public final StateFlow a() {
        return this.d;
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.RoutingInteractor
    public final Object b(Continuation continuation) throws Throwable {
        Timber.f27013a.b("startRouting", new Object[0]);
        IPSNavigation.addLiveNavigationListener(this.j);
        Object objF = BuildersKt.f(Dispatchers.f24691a, new RoutingInteractorImpl$startRouting$2(this, null), continuation);
        return objF == CoroutineSingletons.d ? objF : Unit.f24250a;
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.RoutingInteractor
    public final Object c(Continuation continuation) {
        Object next;
        MutableStateFlow mutableStateFlow = this.c;
        Iterator it = ((Iterable) mutableStateFlow.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.c(((OriientMapContent) next).getF7329a(), "ROUTE_PIN_ID")) {
                break;
            }
        }
        OriientMapContent oriientMapContent = (OriientMapContent) next;
        if (oriientMapContent != null) {
            ArrayList arrayListX = CollectionsKt.X((Iterable) mutableStateFlow.getValue(), oriientMapContent);
            mutableStateFlow.setValue(arrayListX);
            h(arrayListX);
            Object objF = f(continuation);
            if (objF == CoroutineSingletons.d) {
                return objF;
            }
        }
        return Unit.f24250a;
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.RoutingInteractor
    public final Object d(PinContent pinContent, Continuation continuation) {
        MutableStateFlow mutableStateFlow = this.c;
        if (!((List) mutableStateFlow.getValue()).contains(pinContent)) {
            ArrayList arrayListD0 = CollectionsKt.d0(pinContent, (Collection) mutableStateFlow.getValue());
            mutableStateFlow.setValue(arrayListD0);
            h(arrayListD0);
            Object objF = f(continuation);
            if (objF == CoroutineSingletons.d) {
                return objF;
            }
        }
        return Unit.f24250a;
    }

    @Override // au.com.woolworths.feature.shop.instore.navigation.map.domain.RoutingInteractor
    public final void e() {
        Timber.f27013a.b("stopRouting", new Object[0]);
        Job job = this.i;
        if (job != null) {
            job.cancel((CancellationException) null);
        }
        this.i = null;
        IPSNavigation.removeLiveNavigationListener(this.j);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(kotlin.coroutines.Continuation r17) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: au.com.woolworths.feature.shop.instore.navigation.map.domain.RoutingInteractorImpl.f(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean g() {
        OriientPosition oriientPosition;
        PositioningInteractor positioningInteractor = this.f7374a;
        return (positioningInteractor.c().getValue() == PositioningInteractor.PositioningState.d || (oriientPosition = (OriientPosition) positioningInteractor.getCurrentPosition().getValue()) == null || !oriientPosition.e) ? false : true;
    }

    public final void h(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(CollectionsKt.s(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            OriientMapContent oriientMapContent = (OriientMapContent) it.next();
            String f7329a = oriientMapContent.getF7329a();
            OriientMetersCoordinate c = oriientMapContent.getC();
            Building building = (Building) this.b.getCurrentBuilding().getValue();
            arrayList2.add(new OriientWaypoint(f7329a, c, building != null ? building.f7331a : "", oriientMapContent.getB()));
        }
        IPSNavigation.setLiveNavigationWayPoints(arrayList2);
        if (arrayList.isEmpty()) {
            this.d.setValue(null);
        }
    }
}
