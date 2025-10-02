package au.com.woolworths.feature.shop.instore.presence.domain;

import android.location.Location;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl", f = "InstorePresenceInteractor.kt", l = {333, 338}, m = "debugNearestStore")
/* loaded from: classes3.dex */
final class InstorePresenceInteractorImpl$debugNearestStore$1 extends ContinuationImpl {
    public long p;
    public long q;
    public Location r;
    public /* synthetic */ Object s;
    public final /* synthetic */ InstorePresenceInteractorImpl t;
    public int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstorePresenceInteractorImpl$debugNearestStore$1(InstorePresenceInteractorImpl instorePresenceInteractorImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.t = instorePresenceInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.s = obj;
        this.u |= Integer.MIN_VALUE;
        return this.t.l(this);
    }
}
