package androidx.work.impl.utils;

import androidx.work.impl.utils.taskexecutor.SerialExecutor;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class SerialExecutorImpl implements SerialExecutor {
    public final Executor e;
    public Runnable f;
    public final ArrayDeque d = new ArrayDeque();
    public final Object g = new Object();

    public static class Task implements Runnable {
        public final SerialExecutorImpl d;
        public final Runnable e;

        public Task(SerialExecutorImpl serialExecutorImpl, Runnable runnable) {
            this.d = serialExecutorImpl;
            this.e = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.e.run();
                synchronized (this.d.g) {
                    this.d.a();
                }
            } catch (Throwable th) {
                synchronized (this.d.g) {
                    this.d.a();
                    throw th;
                }
            }
        }
    }

    public SerialExecutorImpl(Executor executor) {
        this.e = executor;
    }

    public final void a() {
        Runnable runnable = (Runnable) this.d.poll();
        this.f = runnable;
        if (runnable != null) {
            this.e.execute(runnable);
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.g) {
            try {
                this.d.add(new Task(this, runnable));
                if (this.f == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
