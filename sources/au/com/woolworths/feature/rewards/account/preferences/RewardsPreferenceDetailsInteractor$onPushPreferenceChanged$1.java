package au.com.woolworths.feature.rewards.account.preferences;

import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.feature.rewards.account.preferences.RewardsPreferenceDetailsInteractor", f = "RewardsPreferenceDetailsInteractor.kt", l = {28}, m = "onPushPreferenceChanged")
/* loaded from: classes3.dex */
final class RewardsPreferenceDetailsInteractor$onPushPreferenceChanged$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ RewardsPreferenceDetailsInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsPreferenceDetailsInteractor$onPushPreferenceChanged$1(RewardsPreferenceDetailsInteractor rewardsPreferenceDetailsInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = rewardsPreferenceDetailsInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        this.q.a(null, this);
        return CoroutineSingletons.d;
    }
}
