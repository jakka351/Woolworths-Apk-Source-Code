package au.com.woolworths.feature.shop.trafficdrivers;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.trafficdrivers.TrafficDriversInteractor", f = "TrafficDriversInteractor.kt", l = {19}, m = "fetchAndCacheTrafficDrivers")
/* loaded from: classes3.dex */
final class TrafficDriversInteractor$fetchAndCacheTrafficDrivers$1 extends ContinuationImpl {
    public Object p;
    public /* synthetic */ Object q;
    public final /* synthetic */ TrafficDriversInteractor r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrafficDriversInteractor$fetchAndCacheTrafficDrivers$1(TrafficDriversInteractor trafficDriversInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = trafficDriversInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.b(this);
    }
}
