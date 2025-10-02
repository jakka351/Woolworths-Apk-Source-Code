package au.com.woolworths.geolocation.location;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.geolocation.location.LocationInteractor", f = "LocationInteractor.kt", l = {91}, m = "getCurrentLocation")
/* loaded from: classes4.dex */
final class LocationInteractor$getCurrentLocation$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ LocationInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationInteractor$getCurrentLocation$1(LocationInteractor locationInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = locationInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}
