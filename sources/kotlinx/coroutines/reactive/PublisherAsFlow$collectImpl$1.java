package kotlinx.coroutines.reactive;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.reactive.PublisherAsFlow", f = "ReactiveFlow.kt", l = {94, 96}, m = "collectImpl")
/* loaded from: classes7.dex */
final class PublisherAsFlow$collectImpl$1 extends ContinuationImpl {
    public Object p;
    public FlowCollector q;
    public Object r;
    public long s;
    public /* synthetic */ Object t;
    public final /* synthetic */ PublisherAsFlow u;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PublisherAsFlow$collectImpl$1(PublisherAsFlow publisherAsFlow, Continuation continuation) {
        super(continuation);
        this.u = publisherAsFlow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.t = obj;
        this.v |= Integer.MIN_VALUE;
        return this.u.l(null, null, this);
    }
}
