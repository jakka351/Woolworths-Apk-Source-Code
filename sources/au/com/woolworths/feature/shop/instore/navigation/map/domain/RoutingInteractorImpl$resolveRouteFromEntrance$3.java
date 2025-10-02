package au.com.woolworths.feature.shop.instore.navigation.map.domain;

import au.com.woolworths.feature.shop.instore.navigation.map.data.Building;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientMapRouteKt;
import au.com.woolworths.feature.shop.instore.navigation.map.data.OriientWaypoint;
import au.com.woolworths.feature.shop.instore.navigation.map.domain.OriientResult;
import au.com.woolworths.foundation.bark.Bark;
import au.com.woolworths.foundation.bark.common.ReportOwner;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import me.oriient.ipssdk.api.listeners.IPSRouteListener;
import me.oriient.ipssdk.api.models.IPSError;
import me.oriient.ipssdk.api.models.IPSRoute;
import me.oriient.ipssdk.ips.IPSNavigation;
import org.bouncycastle.math.Primes;
import timber.log.Timber;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.domain.RoutingInteractorImpl$resolveRouteFromEntrance$3", f = "RoutingInteractor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class RoutingInteractorImpl$resolveRouteFromEntrance$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Job>, Object> {
    public /* synthetic */ Object p;
    public final /* synthetic */ RoutingInteractorImpl q;
    public final /* synthetic */ Building r;
    public final /* synthetic */ ArrayList s;

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.domain.RoutingInteractorImpl$resolveRouteFromEntrance$3$1", f = "RoutingInteractor.kt", l = {Primes.SMALL_FACTOR_LIMIT}, m = "invokeSuspend")
    /* renamed from: au.com.woolworths.feature.shop.instore.navigation.map.domain.RoutingInteractorImpl$resolveRouteFromEntrance$3$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int p;
        public final /* synthetic */ RoutingInteractorImpl q;
        public final /* synthetic */ Building r;
        public final /* synthetic */ ArrayList s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RoutingInteractorImpl routingInteractorImpl, Building building, ArrayList arrayList, Continuation continuation) {
            super(2, continuation);
            this.q = routingInteractorImpl;
            this.r = building;
            this.s = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.q, this.r, this.s, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            RoutingInteractorImpl routingInteractorImpl = this.q;
            MutableStateFlow mutableStateFlow = routingInteractorImpl.h;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
            int i = this.p;
            if (i == 0) {
                ResultKt.b(obj);
                String str = this.r.f7331a;
                OriientWaypoint oriientWaypoint = (OriientWaypoint) routingInteractorImpl.e.getValue();
                this.p = 1;
                final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.b(this));
                IPSNavigation.findRouteInBuilding(str, this.s, oriientWaypoint, new IPSRouteListener() { // from class: au.com.woolworths.feature.shop.instore.navigation.map.domain.RoutingInteractorImpl$findRouteInBuilding$2$1
                    @Override // me.oriient.ipssdk.api.listeners.IPSFailable
                    public final void onError(IPSError error) {
                        Intrinsics.h(error, "error");
                        Bark.Companion companion = Bark.f8483a;
                        Bark.f8483a.f(new ReportOwner(ReportOwner.Squad.u), "findRouteInBuilding onError() called with error = " + error, null);
                        safeContinuation.resumeWith(new OriientResult.Failure(OriientErrorKt.a(error)));
                    }

                    @Override // me.oriient.ipssdk.api.listeners.IPSRouteListener
                    public final void onRouteReceived(IPSRoute route) {
                        Intrinsics.h(route, "route");
                        Timber.f27013a.b("findRouteInBuilding onRouteReceived() called with route = " + route, new Object[0]);
                        safeContinuation.resumeWith(new OriientResult.Success(OriientMapRouteKt.b(route)));
                    }
                });
                obj = safeContinuation.a();
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
            }
            OriientResult oriientResult = (OriientResult) obj;
            if (oriientResult instanceof OriientResult.Failure) {
                mutableStateFlow.setValue(null);
            } else {
                if (!(oriientResult instanceof OriientResult.Success)) {
                    throw new NoWhenBranchMatchedException();
                }
                mutableStateFlow.setValue(((OriientResult.Success) oriientResult).f7368a);
            }
            return Unit.f24250a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutingInteractorImpl$resolveRouteFromEntrance$3(RoutingInteractorImpl routingInteractorImpl, Building building, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.q = routingInteractorImpl;
        this.r = building;
        this.s = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        RoutingInteractorImpl$resolveRouteFromEntrance$3 routingInteractorImpl$resolveRouteFromEntrance$3 = new RoutingInteractorImpl$resolveRouteFromEntrance$3(this.q, this.r, this.s, continuation);
        routingInteractorImpl$resolveRouteFromEntrance$3.p = obj;
        return routingInteractorImpl$resolveRouteFromEntrance$3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RoutingInteractorImpl$resolveRouteFromEntrance$3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f24250a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.d;
        ResultKt.b(obj);
        return BuildersKt.c((CoroutineScope) this.p, null, null, new AnonymousClass1(this.q, this.r, this.s, null), 3);
    }
}
