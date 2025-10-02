package au.com.woolworths.foundation.rewards.onboarding;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.sync.MutexImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.foundation.rewards.onboarding.ProgressiveCoachMarkManager", f = "ProgressiveCoachMarkManager.kt", l = {420}, m = "consumeAction")
/* loaded from: classes4.dex */
final class ProgressiveCoachMarkManager$consumeAction$1 extends ContinuationImpl {
    public String p;
    public MutexImpl q;
    public /* synthetic */ Object r;
    public final /* synthetic */ ProgressiveCoachMarkManager s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressiveCoachMarkManager$consumeAction$1(ProgressiveCoachMarkManager progressiveCoachMarkManager, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = progressiveCoachMarkManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.b(null, this);
    }
}
