package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/InvokeOnCompletion;", "Lkotlinx/coroutines/JobNode;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class InvokeOnCompletion extends JobNode {
    public final Function1 h;

    public InvokeOnCompletion(Function1 function1) {
        this.h = function1;
    }

    @Override // kotlinx.coroutines.JobNode
    public final boolean k() {
        return false;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void l(Throwable th) {
        this.h.invoke(th);
    }
}
