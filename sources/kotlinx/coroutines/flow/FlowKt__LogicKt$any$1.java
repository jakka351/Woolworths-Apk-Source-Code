package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__LogicKt", f = "Logic.kt", l = {119}, m = "any")
/* loaded from: classes7.dex */
final class FlowKt__LogicKt$any$1<T> extends ContinuationImpl {
    public Ref.BooleanRef p;
    public FlowKt__LogicKt$any$$inlined$collectWhile$1 q;
    public /* synthetic */ Object r;
    public int s;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return FlowKt__LogicKt.a(this);
    }
}
