package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;

@InternalCoroutinesApi
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/Delay;", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public interface Delay {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @SourceDebugExtension
    /* loaded from: classes7.dex */
    public static final class DefaultImpls {
        public static DisposableHandle a(long j, Runnable runnable, CoroutineContext coroutineContext) {
            return DefaultExecutorKt.f24690a.j(j, runnable, coroutineContext);
        }
    }

    void c(long j, CancellableContinuationImpl cancellableContinuationImpl);

    DisposableHandle j(long j, Runnable runnable, CoroutineContext coroutineContext);
}
