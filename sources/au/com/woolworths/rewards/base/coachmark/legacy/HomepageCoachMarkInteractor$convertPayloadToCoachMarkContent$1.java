package au.com.woolworths.rewards.base.coachmark.legacy;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.rewards.base.coachmark.legacy.HomepageCoachMarkInteractor", f = "HomepageCoachMarkInteractor.kt", l = {43}, m = "convertPayloadToCoachMarkContent")
/* loaded from: classes4.dex */
final class HomepageCoachMarkInteractor$convertPayloadToCoachMarkContent$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ HomepageCoachMarkInteractor q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomepageCoachMarkInteractor$convertPayloadToCoachMarkContent$1(HomepageCoachMarkInteractor homepageCoachMarkInteractor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = homepageCoachMarkInteractor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
