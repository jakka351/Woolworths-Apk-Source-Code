package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/DispatcherExecutor;", "Ljava/util/concurrent/Executor;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class DispatcherExecutor implements Executor {
    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) throws DispatchException {
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.d;
        if (DispatchedContinuationKt.c(null, emptyCoroutineContext)) {
            DispatchedContinuationKt.b(null, emptyCoroutineContext, runnable);
        } else {
            runnable.run();
        }
    }

    public final String toString() {
        throw null;
    }
}
