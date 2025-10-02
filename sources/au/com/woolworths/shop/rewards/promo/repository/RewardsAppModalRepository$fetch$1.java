package au.com.woolworths.shop.rewards.promo.repository;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.rewards.promo.repository.RewardsAppModalRepository", f = "RewardsAppModalRepository.kt", l = {50}, m = "fetch")
/* loaded from: classes4.dex */
final class RewardsAppModalRepository$fetch$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ RewardsAppModalRepository q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsAppModalRepository$fetch$1(RewardsAppModalRepository rewardsAppModalRepository, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = rewardsAppModalRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
