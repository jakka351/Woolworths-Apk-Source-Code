package coil3.intercept;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.intercept.RealInterceptorChain", f = "RealInterceptorChain.kt", l = {31}, m = "proceed")
/* loaded from: classes.dex */
final class RealInterceptorChain$proceed$1 extends ContinuationImpl {
    public RealInterceptorChain p;
    public Interceptor q;
    public /* synthetic */ Object r;
    public final /* synthetic */ RealInterceptorChain s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealInterceptorChain$proceed$1(RealInterceptorChain realInterceptorChain, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = realInterceptorChain;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.b(this);
    }
}
