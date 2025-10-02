package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/ResumeOnCompletion;", "Lkotlinx/coroutines/JobNode;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ResumeOnCompletion extends JobNode {
    public final CancellableContinuationImpl h;

    public ResumeOnCompletion(CancellableContinuationImpl cancellableContinuationImpl) {
        this.h = cancellableContinuationImpl;
    }

    @Override // kotlinx.coroutines.JobNode
    public final boolean k() {
        return false;
    }

    @Override // kotlinx.coroutines.JobNode
    public final void l(Throwable th) {
        this.h.resumeWith(Unit.f24250a);
    }
}
