package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1", f = "Emitters.kt", l = {181}, m = "emit")
/* loaded from: classes7.dex */
final class FlowKt__EmittersKt$onEmpty$1$1$emit$1 extends ContinuationImpl {
    public /* synthetic */ Object p;
    public final /* synthetic */ FlowKt__EmittersKt$onEmpty$1$1 q;
    public int r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__EmittersKt$onEmpty$1$1$emit$1(FlowKt__EmittersKt$onEmpty$1$1 flowKt__EmittersKt$onEmpty$1$1, Continuation continuation) {
        super(continuation);
        this.q = flowKt__EmittersKt$onEmpty$1$1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.p = obj;
        this.r |= Integer.MIN_VALUE;
        this.q.emit(null, this);
        return Unit.f24250a;
    }
}
