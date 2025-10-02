package au.com.woolworths.auth.auth0.rewards;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.auth.auth0.rewards.RewardsAppTokenAuthenticator", f = "RewardsAppTokenAuthenticator.kt", l = {247}, m = "exchangeToken")
/* loaded from: classes3.dex */
final class RewardsAppTokenAuthenticator$exchangeToken$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ RewardsAppTokenAuthenticator q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RewardsAppTokenAuthenticator$exchangeToken$1(RewardsAppTokenAuthenticator rewardsAppTokenAuthenticator, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.q = rewardsAppTokenAuthenticator;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return RewardsAppTokenAuthenticator.b(this.q, null, this);
    }
}
