package au.com.woolworths.android.onesite.network;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "au.com.woolworths.android.onesite.network.RefreshTokenFlowRetry", f = "RefreshTokenFlowRetry.kt", l = {31}, m = "invoke")
/* loaded from: classes3.dex */
final class RefreshTokenFlowRetry$invoke$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ RefreshTokenFlowRetry q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshTokenFlowRetry$invoke$1(RefreshTokenFlowRetry refreshTokenFlowRetry, Continuation continuation) {
        super(continuation);
        this.q = refreshTokenFlowRetry;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        return this.q.a(null, this);
    }
}
