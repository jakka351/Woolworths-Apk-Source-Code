package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/internal/NamedDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class NamedDispatcher extends CoroutineDispatcher implements Delay {
    @Override // kotlinx.coroutines.Delay
    public final void c(long j, CancellableContinuationImpl cancellableContinuationImpl) {
        throw null;
    }

    @Override // kotlinx.coroutines.Delay
    public final DisposableHandle j(long j, Runnable runnable, CoroutineContext coroutineContext) {
        throw null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void k(CoroutineContext coroutineContext, Runnable runnable) {
        throw null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void r(CoroutineContext coroutineContext, Runnable runnable) {
        throw null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return null;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean v(CoroutineContext coroutineContext) {
        throw null;
    }
}
