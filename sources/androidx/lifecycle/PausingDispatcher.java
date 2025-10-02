package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/PausingDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PausingDispatcher extends CoroutineDispatcher {
    public final DispatchQueue f = new DispatchQueue();

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void k(CoroutineContext context, Runnable block) {
        Intrinsics.h(context, "context");
        Intrinsics.h(block, "block");
        DispatchQueue dispatchQueue = this.f;
        dispatchQueue.getClass();
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        MainCoroutineDispatcher mainCoroutineDispatcherT = MainDispatcherLoader.f24726a.T();
        if (mainCoroutineDispatcherT.v(context) || dispatchQueue.b || !dispatchQueue.f2785a) {
            mainCoroutineDispatcherT.k(context, new androidx.camera.core.impl.utils.futures.e(5, dispatchQueue, block));
        } else {
            if (!dispatchQueue.d.offer(block)) {
                throw new IllegalStateException("cannot enqueue any more runnables");
            }
            dispatchQueue.a();
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean v(CoroutineContext context) {
        Intrinsics.h(context, "context");
        DefaultScheduler defaultScheduler = Dispatchers.f24691a;
        if (MainDispatcherLoader.f24726a.T().v(context)) {
            return true;
        }
        DispatchQueue dispatchQueue = this.f;
        return !(dispatchQueue.b || !dispatchQueue.f2785a);
    }
}
