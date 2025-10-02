package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/ChildHandleNode;", "Lkotlinx/coroutines/JobNode;", "Lkotlinx/coroutines/ChildHandle;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class ChildHandleNode extends JobNode implements ChildHandle {
    public final ChildJob h;

    public ChildHandleNode(ChildJob childJob) {
        this.h = childJob;
    }

    @Override // kotlinx.coroutines.ChildHandle
    public final boolean a(Throwable th) {
        return j().J(th);
    }

    @Override // kotlinx.coroutines.JobNode
    public final boolean k() {
        return true;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void l(Throwable th) {
        this.h.l(j());
    }
}
