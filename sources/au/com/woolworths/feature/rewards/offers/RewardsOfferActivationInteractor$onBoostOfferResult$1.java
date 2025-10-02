package au.com.woolworths.feature.rewards.offers;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.offers.RewardsOfferActivationInteractor", f = "RewardsOfferActivationInteractor.kt", l = {34}, m = "onBoostOfferResult")
/* loaded from: classes3.dex */
final class RewardsOfferActivationInteractor$onBoostOfferResult$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ RewardsOfferActivationInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsOfferActivationInteractor$onBoostOfferResult$1(RewardsOfferActivationInteractor rewardsOfferActivationInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = rewardsOfferActivationInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        this.q.c(null, this);
        return CoroutineSingletons.d;
    }
}
