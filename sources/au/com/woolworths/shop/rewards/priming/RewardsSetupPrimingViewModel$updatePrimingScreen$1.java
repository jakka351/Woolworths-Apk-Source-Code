package au.com.woolworths.shop.rewards.priming;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.shop.rewards.priming.RewardsSetupPrimingViewModel", f = "RewardsSetupPrimingViewModel.kt", l = {52}, m = "updatePrimingScreen")
/* loaded from: classes4.dex */
final class RewardsSetupPrimingViewModel$updatePrimingScreen$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ RewardsSetupPrimingViewModel q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsSetupPrimingViewModel$updatePrimingScreen$1(RewardsSetupPrimingViewModel rewardsSetupPrimingViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = rewardsSetupPrimingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.p6(false, this);
    }
}
