package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0010\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/scheduling/SchedulerCoroutineDispatcher;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public class SchedulerCoroutineDispatcher extends ExecutorCoroutineDispatcher {
    public CoroutineScheduler f;

    public void close() throws InterruptedException {
        this.f.close();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void k(CoroutineContext coroutineContext, Runnable runnable) {
        CoroutineScheduler.c(this.f, runnable, 6);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void r(CoroutineContext coroutineContext, Runnable runnable) {
        CoroutineScheduler.c(this.f, runnable, 2);
    }
}
