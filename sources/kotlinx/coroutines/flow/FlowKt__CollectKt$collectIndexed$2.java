package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collectIndexed$2", "Lkotlinx/coroutines/flow/FlowCollector;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 176)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class FlowKt__CollectKt$collectIndexed$2 implements FlowCollector<Object> {
    public int d;

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.d;
        this.d = i + 1;
        if (i < 0) {
            throw new ArithmeticException("Index overflow has happened");
        }
        new Integer(i);
        throw null;
    }
}
