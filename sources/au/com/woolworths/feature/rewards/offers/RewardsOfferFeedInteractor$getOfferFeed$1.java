package au.com.woolworths.feature.rewards.offers;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.RewardsOfferFeedInteractor", f = "RewardsOfferFeedInteractor.kt", l = {17}, m = "getOfferFeed")
/* loaded from: classes3.dex */
final class RewardsOfferFeedInteractor$getOfferFeed$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ RewardsOfferFeedInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsOfferFeedInteractor$getOfferFeed$1(RewardsOfferFeedInteractor rewardsOfferFeedInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = rewardsOfferFeedInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(this);
    }
}
