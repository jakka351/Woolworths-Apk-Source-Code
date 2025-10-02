package au.com.woolworths.feature.shop.trafficdrivers;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.trafficdrivers.TrafficDriversRepository", f = "TrafficDriversRepository.kt", l = {24}, m = "fetchTrafficDrivers")
/* loaded from: classes3.dex */
final class TrafficDriversRepository$fetchTrafficDrivers$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ TrafficDriversRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrafficDriversRepository$fetchTrafficDrivers$1(TrafficDriversRepository trafficDriversRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = trafficDriversRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}
