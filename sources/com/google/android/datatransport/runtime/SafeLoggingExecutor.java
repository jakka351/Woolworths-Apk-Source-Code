package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.logging.Logging;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
class SafeLoggingExecutor implements Executor {
    public final Executor d;

    public static class SafeLoggingRunnable implements Runnable {
        public final Runnable d;

        public SafeLoggingRunnable(Runnable runnable) {
            this.d = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.d.run();
            } catch (Exception e) {
                Logging.c(e, "Executor", "Background execution failure.");
            }
        }
    }

    public SafeLoggingExecutor(ExecutorService executorService) {
        this.d = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.d.execute(new SafeLoggingRunnable(runnable));
    }
}
