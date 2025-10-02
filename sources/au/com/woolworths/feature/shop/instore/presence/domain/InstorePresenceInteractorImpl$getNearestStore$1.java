package au.com.woolworths.feature.shop.instore.presence.domain;

import android.location.Location;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl", f = "InstorePresenceInteractor.kt", l = {276}, m = "getNearestStore")
/* loaded from: classes3.dex */
final class InstorePresenceInteractorImpl$getNearestStore$1 extends ContinuationImpl {
    public Location p;
    public /* synthetic */ Object q;
    public final /* synthetic */ InstorePresenceInteractorImpl r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstorePresenceInteractorImpl$getNearestStore$1(InstorePresenceInteractorImpl instorePresenceInteractorImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = instorePresenceInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.m(null, this);
    }
}
