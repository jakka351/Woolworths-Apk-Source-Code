package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Ref;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {179}, m = "firstOrNull")
/* loaded from: classes7.dex */
final class FlowKt__ReduceKt$firstOrNull$3<T> extends ContinuationImpl {
    public Ref.ObjectRef p;
    public FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 q;
    public /* synthetic */ Object r;
    public int s;

    public FlowKt__ReduceKt$firstOrNull$3(ContinuationImpl continuationImpl) {
        super(continuationImpl);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.r = obj;
        this.s |= Integer.MIN_VALUE;
        return FlowKt.z(null, null, this);
    }
}
