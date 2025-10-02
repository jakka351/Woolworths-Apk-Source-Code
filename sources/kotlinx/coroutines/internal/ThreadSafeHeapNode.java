package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlinx.coroutines.EventLoopImplBase;
import kotlinx.coroutines.InternalCoroutinesApi;

@InternalCoroutinesApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ThreadSafeHeapNode {
    void b(EventLoopImplBase.DelayedTaskQueue delayedTaskQueue);

    void setIndex(int i);
}
