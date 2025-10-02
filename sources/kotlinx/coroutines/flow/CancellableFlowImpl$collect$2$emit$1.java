package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.CancellableFlowImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.CancellableFlowImpl$collect$2", f = "Context.kt", l = {271}, m = "emit")
/* loaded from: classes7.dex */
final class CancellableFlowImpl$collect$2$emit$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ CancellableFlowImpl.AnonymousClass2 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CancellableFlowImpl$collect$2$emit$1(CancellableFlowImpl.AnonymousClass2 anonymousClass2, Continuation continuation) {
        super(continuation);
        this.q = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        this.q.emit(null, this);
        return Unit.f24250a;
    }
}
