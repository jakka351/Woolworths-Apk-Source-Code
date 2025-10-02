package io.grpc.internal;

import com.google.common.base.Preconditions;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
public final class SerializingExecutor implements Executor, Runnable {
    public static final Logger g = Logger.getLogger(SerializingExecutor.class.getName());
    public static final AtomicHelper h;
    public final Executor d;
    public final ConcurrentLinkedQueue e = new ConcurrentLinkedQueue();
    public volatile int f = 0;

    public static abstract class AtomicHelper {
        public abstract boolean a(SerializingExecutor serializingExecutor);

        public abstract void b(SerializingExecutor serializingExecutor);
    }

    public static final class FieldUpdaterAtomicHelper extends AtomicHelper {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicIntegerFieldUpdater f24100a;

        public FieldUpdaterAtomicHelper(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            this.f24100a = atomicIntegerFieldUpdater;
        }

        @Override // io.grpc.internal.SerializingExecutor.AtomicHelper
        public final boolean a(SerializingExecutor serializingExecutor) {
            return this.f24100a.compareAndSet(serializingExecutor, 0, -1);
        }

        @Override // io.grpc.internal.SerializingExecutor.AtomicHelper
        public final void b(SerializingExecutor serializingExecutor) {
            this.f24100a.set(serializingExecutor, 0);
        }
    }

    public static final class SynchronizedAtomicHelper extends AtomicHelper {
        @Override // io.grpc.internal.SerializingExecutor.AtomicHelper
        public final boolean a(SerializingExecutor serializingExecutor) {
            synchronized (serializingExecutor) {
                try {
                    if (serializingExecutor.f != 0) {
                        return false;
                    }
                    serializingExecutor.f = -1;
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.grpc.internal.SerializingExecutor.AtomicHelper
        public final void b(SerializingExecutor serializingExecutor) {
            synchronized (serializingExecutor) {
                serializingExecutor.f = 0;
            }
        }
    }

    static {
        AtomicHelper synchronizedAtomicHelper;
        try {
            synchronizedAtomicHelper = new FieldUpdaterAtomicHelper(AtomicIntegerFieldUpdater.newUpdater(SerializingExecutor.class, "f"));
        } catch (Throwable th) {
            g.log(Level.SEVERE, "FieldUpdaterAtomicHelper failed", th);
            synchronizedAtomicHelper = new SynchronizedAtomicHelper();
        }
        h = synchronizedAtomicHelper;
    }

    public SerializingExecutor(Executor executor) {
        Preconditions.j(executor, "'executor' must not be null.");
        this.d = executor;
    }

    public final void a(Runnable runnable) {
        AtomicHelper atomicHelper = h;
        if (atomicHelper.a(this)) {
            try {
                this.d.execute(this);
            } catch (Throwable th) {
                if (runnable != null) {
                    this.e.remove(runnable);
                }
                atomicHelper.b(this);
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Preconditions.j(runnable, "'r' must not be null.");
        this.e.add(runnable);
        a(runnable);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        Runnable runnable;
        AtomicHelper atomicHelper = h;
        try {
            Executor executor = this.d;
            while (true) {
                Executor executor2 = this.d;
                concurrentLinkedQueue = this.e;
                if (executor != executor2 || (runnable = (Runnable) concurrentLinkedQueue.poll()) == null) {
                    break;
                }
                try {
                    runnable.run();
                } catch (RuntimeException e) {
                    g.log(Level.SEVERE, "Exception while executing runnable " + runnable, (Throwable) e);
                }
            }
            atomicHelper.b(this);
            if (concurrentLinkedQueue.isEmpty()) {
                return;
            }
            a(null);
        } catch (Throwable th) {
            atomicHelper.b(this);
            throw th;
        }
    }
}
