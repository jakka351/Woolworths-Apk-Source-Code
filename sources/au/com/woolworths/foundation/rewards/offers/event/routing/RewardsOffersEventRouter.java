package au.com.woolworths.foundation.rewards.offers.event.routing;

import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.SharedFlowKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lau/com/woolworths/foundation/rewards/offers/event/routing/RewardsOffersEventRouter;", "", "offers-event-routing"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RewardsOffersEventRouter {

    /* renamed from: a, reason: collision with root package name */
    public final SharedFlowImpl f8603a;
    public final Flow b;

    public RewardsOffersEventRouter() {
        SharedFlowImpl sharedFlowImplB = SharedFlowKt.b(0, 0, null, 7);
        this.f8603a = sharedFlowImplB;
        this.b = FlowKt.a(sharedFlowImplB);
    }
}
