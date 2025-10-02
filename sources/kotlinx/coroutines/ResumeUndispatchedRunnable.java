package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/ResumeUndispatchedRunnable;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
final class ResumeUndispatchedRunnable implements Runnable {
    public final ExecutorCoroutineDispatcherImpl d;
    public final CancellableContinuationImpl e;

    public ResumeUndispatchedRunnable(ExecutorCoroutineDispatcherImpl executorCoroutineDispatcherImpl, CancellableContinuationImpl cancellableContinuationImpl) {
        this.d = executorCoroutineDispatcherImpl;
        this.e = cancellableContinuationImpl;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.e.D(this.d, Unit.f24250a);
    }
}
