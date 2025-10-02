package kotlinx.coroutines;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/BlockingCoroutine;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlinx/coroutines/AbstractCoroutine;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
final class BlockingCoroutine<T> extends AbstractCoroutine<T> {
    public final Thread g;
    public final EventLoop h;

    public BlockingCoroutine(CoroutineContext coroutineContext, Thread thread, EventLoop eventLoop) {
        super(coroutineContext, true, true);
        this.g = thread;
        this.h = eventLoop;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void m(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.g;
        if (Intrinsics.c(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}
