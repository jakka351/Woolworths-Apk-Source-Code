package au.com.woolworths.feature.shop.instore.presence.domain;

import android.location.Location;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl", f = "InstorePresenceInteractor.kt", l = {260, 263}, m = "locateStoreByGeoLocation")
/* loaded from: classes3.dex */
final class InstorePresenceInteractorImpl$locateStoreByGeoLocation$1 extends ContinuationImpl {
    public Function1 p;
    public Location q;
    public /* synthetic */ Object r;
    public final /* synthetic */ InstorePresenceInteractorImpl s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstorePresenceInteractorImpl$locateStoreByGeoLocation$1(InstorePresenceInteractorImpl instorePresenceInteractorImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = instorePresenceInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.p(null, this);
    }
}
