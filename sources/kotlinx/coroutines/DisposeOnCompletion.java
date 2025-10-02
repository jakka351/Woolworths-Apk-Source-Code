package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/DisposeOnCompletion;", "Lkotlinx/coroutines/JobNode;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class DisposeOnCompletion extends JobNode {
    public final DisposableHandle h;

    public DisposeOnCompletion(DisposableHandle disposableHandle) {
        this.h = disposableHandle;
    }

    @Override // kotlinx.coroutines.JobNode
    public final boolean k() {
        return false;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void l(Throwable th) {
        this.h.dispose();
    }
}
