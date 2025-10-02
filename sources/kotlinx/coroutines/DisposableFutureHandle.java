package kotlinx.coroutines;

import java.util.concurrent.ScheduledFuture;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/DisposableFutureHandle;", "Lkotlinx/coroutines/DisposableHandle;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
final class DisposableFutureHandle implements DisposableHandle {
    public final ScheduledFuture d;

    public DisposableFutureHandle(ScheduledFuture scheduledFuture) {
        this.d = scheduledFuture;
    }

    @Override // kotlinx.coroutines.DisposableHandle
    public final void dispose() {
        this.d.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.d + ']';
    }
}
