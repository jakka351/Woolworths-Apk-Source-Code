package coil3.intercept;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "coil3.intercept.EngineInterceptor", f = "EngineInterceptor.kt", l = {64}, m = "intercept")
/* loaded from: classes.dex */
final class EngineInterceptor$intercept$1 extends ContinuationImpl {
    public RealInterceptorChain p;
    public /* synthetic */ Object q;
    public final /* synthetic */ EngineInterceptor r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EngineInterceptor$intercept$1(EngineInterceptor engineInterceptor, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.r = engineInterceptor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        return this.r.a(null, this);
    }
}
