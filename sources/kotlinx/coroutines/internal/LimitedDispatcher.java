package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.DefaultExecutorKt;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.DisposableHandle;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005R\u000b\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/Delay;", "Lkotlinx/atomicfu/AtomicInt;", "runningWorkers", "Worker", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LimitedDispatcher extends CoroutineDispatcher implements Delay {
    public static final /* synthetic */ AtomicIntegerFieldUpdater k = AtomicIntegerFieldUpdater.newUpdater(LimitedDispatcher.class, "runningWorkers$volatile");
    public final /* synthetic */ Delay f;
    public final CoroutineDispatcher g;
    public final int h;
    public final LockFreeTaskQueue i;
    public final Object j;
    private volatile /* synthetic */ int runningWorkers$volatile;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lkotlinx/coroutines/internal/LimitedDispatcher$Worker;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class Worker implements Runnable {
        public Runnable d;

        public Worker(Runnable runnable) {
            this.d = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() throws DispatchException {
            int i = 0;
            while (true) {
                try {
                    this.d.run();
                } catch (Throwable th) {
                    CoroutineExceptionHandlerKt.a(th, EmptyCoroutineContext.d);
                }
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = LimitedDispatcher.k;
                LimitedDispatcher limitedDispatcher = LimitedDispatcher.this;
                Runnable runnableT = limitedDispatcher.T();
                if (runnableT == null) {
                    return;
                }
                this.d = runnableT;
                i++;
                if (i >= 16 && DispatchedContinuationKt.c(limitedDispatcher.g, limitedDispatcher)) {
                    DispatchedContinuationKt.b(limitedDispatcher.g, limitedDispatcher, this);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LimitedDispatcher(CoroutineDispatcher coroutineDispatcher, int i) {
        Delay delay = coroutineDispatcher instanceof Delay ? (Delay) coroutineDispatcher : null;
        this.f = delay == null ? DefaultExecutorKt.f24690a : delay;
        this.g = coroutineDispatcher;
        this.h = i;
        this.i = new LockFreeTaskQueue();
        this.j = new Object();
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher A(int i) {
        LimitedDispatcherKt.a(i);
        return i >= this.h ? this : super.A(i);
    }

    public final Runnable T() {
        while (true) {
            Runnable runnable = (Runnable) this.i.c();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.j) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = k;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.i.b() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    public final boolean U() {
        synchronized (this.j) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = k;
            if (atomicIntegerFieldUpdater.get(this) >= this.h) {
                return false;
            }
            atomicIntegerFieldUpdater.incrementAndGet(this);
            return true;
        }
    }

    @Override // kotlinx.coroutines.Delay
    public final void c(long j, CancellableContinuationImpl cancellableContinuationImpl) {
        this.f.c(j, cancellableContinuationImpl);
    }

    @Override // kotlinx.coroutines.Delay
    public final DisposableHandle j(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f.j(j, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void k(CoroutineContext coroutineContext, Runnable runnable) throws DispatchException {
        Runnable runnableT;
        this.i.a(runnable);
        if (k.get(this) >= this.h || !U() || (runnableT = T()) == null) {
            return;
        }
        DispatchedContinuationKt.b(this.g, this, new Worker(runnableT));
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void r(CoroutineContext coroutineContext, Runnable runnable) {
        Runnable runnableT;
        this.i.a(runnable);
        if (k.get(this) >= this.h || !U() || (runnableT = T()) == null) {
            return;
        }
        this.g.r(this, new Worker(runnableT));
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.g);
        sb.append(".limitedParallelism(");
        return YU.a.l(sb, this.h, ')');
    }
}
