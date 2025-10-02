package au.com.woolworths.feature.shop.instore.presence.domain;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.shop.instore.presence.domain.InstorePresenceInteractorImpl", f = "InstorePresenceInteractor.kt", l = {214, 216}, m = "getInstorePrompt")
/* loaded from: classes3.dex */
final class InstorePresenceInteractorImpl$getInstorePrompt$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ InstorePresenceInteractorImpl q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstorePresenceInteractorImpl$getInstorePrompt$1(InstorePresenceInteractorImpl instorePresenceInteractorImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = instorePresenceInteractorImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.f(this);
    }
}
