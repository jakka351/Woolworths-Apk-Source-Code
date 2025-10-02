package au.com.woolworths.auth.auth0.rewards;

import au.com.woolworths.android.onesite.network.RefreshTokenFlowRetry;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class RewardsAppTokenAuthenticator$requestAccessToken$1$3$1 extends FunctionReferenceImpl implements Function2<Throwable, Continuation<? super Boolean>, Object>, SuspendFunction {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RefreshTokenFlowRetry) this.receiver).a((Throwable) obj, (Continuation) obj2);
    }
}
