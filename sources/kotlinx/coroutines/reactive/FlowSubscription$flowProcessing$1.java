package kotlinx.coroutines.reactive;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.reactive.FlowSubscription", f = "ReactiveFlow.kt", l = {205}, m = "flowProcessing")
/* loaded from: classes7.dex */
final class FlowSubscription$flowProcessing$1 extends ContinuationImpl {
    public FlowSubscription p;
    public /* synthetic */ Object q;
    public final /* synthetic */ FlowSubscription r;
    public int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowSubscription$flowProcessing$1(FlowSubscription flowSubscription, Continuation continuation) {
        super(continuation);
        this.r = flowSubscription;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.q = obj;
        this.s |= Integer.MIN_VALUE;
        FlowSubscription.q0(this.r, this);
        return Unit.f24250a;
    }
}
