package kotlinx.coroutines.rx2;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/rx2/SchedulerCoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "kotlinx-coroutines-rx2"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class SchedulerCoroutineDispatcher extends CoroutineDispatcher implements Delay {
    @Override // kotlinx.coroutines.Delay
    public final void c(long j, CancellableContinuationImpl cancellableContinuationImpl) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        throw null;
    }

    public final boolean equals(Object obj) {
        return obj instanceof SchedulerCoroutineDispatcher;
    }

    public final int hashCode() {
        return System.identityHashCode(null);
    }

    @Override // kotlinx.coroutines.Delay
    public final DisposableHandle j(long j, Runnable runnable, CoroutineContext coroutineContext) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        throw null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void k(CoroutineContext coroutineContext, Runnable runnable) {
        throw null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        throw null;
    }
}
