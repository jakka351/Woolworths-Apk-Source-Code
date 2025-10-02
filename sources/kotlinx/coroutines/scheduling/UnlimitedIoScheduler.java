package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.internal.LimitedDispatcherKt;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/scheduling/UnlimitedIoScheduler;", "Lkotlinx/coroutines/CoroutineDispatcher;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
final class UnlimitedIoScheduler extends CoroutineDispatcher {
    public static final UnlimitedIoScheduler f = new UnlimitedIoScheduler();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher A(int i) {
        LimitedDispatcherKt.a(i);
        return i >= TasksKt.d ? this : super.A(i);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void k(CoroutineContext coroutineContext, Runnable runnable) {
        DefaultScheduler.g.f.b(runnable, true, false);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void r(CoroutineContext coroutineContext, Runnable runnable) {
        DefaultScheduler.g.f.b(runnable, true, true);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "Dispatchers.IO";
    }
}
