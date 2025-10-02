package kotlinx.coroutines;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/BlockingEventLoop;", "Lkotlinx/coroutines/EventLoopImplBase;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlockingEventLoop extends EventLoopImplBase {
    public final Thread m;

    public BlockingEventLoop(Thread thread) {
        this.m = thread;
    }

    @Override // kotlinx.coroutines.EventLoopImplPlatform
    /* renamed from: i0, reason: from getter */
    public final Thread getM() {
        return this.m;
    }
}
