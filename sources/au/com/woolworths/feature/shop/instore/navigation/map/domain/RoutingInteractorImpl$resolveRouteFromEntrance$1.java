package au.com.woolworths.feature.shop.instore.navigation.map.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.navigation.map.domain.RoutingInteractorImpl", f = "RoutingInteractor.kt", l = {209}, m = "resolveRouteFromEntrance")
/* loaded from: classes3.dex */
final class RoutingInteractorImpl$resolveRouteFromEntrance$1 extends ContinuationImpl {
    public RoutingInteractorImpl p;
    public /* synthetic */ Object q;
    public final /* synthetic */ RoutingInteractorImpl r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoutingInteractorImpl$resolveRouteFromEntrance$1(RoutingInteractorImpl routingInteractorImpl, Continuation continuation) {
        super(continuation);
        this.r = routingInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.f(this);
    }
}
