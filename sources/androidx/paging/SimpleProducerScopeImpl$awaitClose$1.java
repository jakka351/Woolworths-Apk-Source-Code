package androidx.paging;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Job;

@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.paging.SimpleProducerScopeImpl", f = "SimpleChannelFlow.kt", l = {101}, m = "awaitClose")
/* loaded from: classes2.dex */
final class SimpleProducerScopeImpl$awaitClose$1 extends ContinuationImpl {
    public Lambda p;
    public Job q;
    public /* synthetic */ Object r;
    public final /* synthetic */ SimpleProducerScopeImpl s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleProducerScopeImpl$awaitClose$1(SimpleProducerScopeImpl simpleProducerScopeImpl, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = simpleProducerScopeImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.v(null, this);
    }
}
