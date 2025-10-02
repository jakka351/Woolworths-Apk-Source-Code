package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.internal.SafeCollector;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {418, 422}, m = "onSubscription")
/* loaded from: classes7.dex */
final class SubscribedFlowCollector$onSubscription$1 extends ContinuationImpl {
    public SubscribedFlowCollector p;
    public SafeCollector q;
    public /* synthetic */ Object r;
    public final /* synthetic */ SubscribedFlowCollector s;
    public int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubscribedFlowCollector$onSubscription$1(SubscribedFlowCollector subscribedFlowCollector, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.s = subscribedFlowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.t |= Integer.MIN_VALUE;
        return this.s.a(this);
    }
}
