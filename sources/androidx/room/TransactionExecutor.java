package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/room/TransactionExecutor;", "Ljava/util/concurrent/Executor;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class TransactionExecutor implements Executor {
    public final Executor d;
    public final ArrayDeque e;
    public Runnable f;
    public final Object g;

    public TransactionExecutor(Executor executor) {
        Intrinsics.h(executor, "executor");
        this.d = executor;
        this.e = new ArrayDeque();
        this.g = new Object();
    }

    public final void a() {
        synchronized (this.g) {
            Object objPoll = this.e.poll();
            Runnable runnable = (Runnable) objPoll;
            this.f = runnable;
            if (objPoll != null) {
                this.d.execute(runnable);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable command) {
        Intrinsics.h(command, "command");
        synchronized (this.g) {
            this.e.offer(new b(0, command, this));
            if (this.f == null) {
                a();
            }
        }
    }
}
