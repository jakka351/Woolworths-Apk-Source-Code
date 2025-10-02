package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.core.provider.FontRequestWorker;
import androidx.core.util.Consumer;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
class RequestExecutor {

    public static class DefaultThreadFactory implements ThreadFactory {
        public String d;
        public int e;

        public static class ProcessPriorityThread extends Thread {
            public final int d;

            public ProcessPriorityThread(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.d = i;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public final void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(this.d);
                super.run();
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new ProcessPriorityThread(runnable, this.d, this.e);
        }
    }

    public static class HandlerExecutor implements Executor {
        public final Handler d;

        public HandlerExecutor(Handler handler) {
            this.d = handler;
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            runnable.getClass();
            Handler handler = this.d;
            if (handler.post(runnable)) {
                return;
            }
            throw new RejectedExecutionException(handler + " is shutting down");
        }
    }

    public static class ReplyRunnable<T> implements Runnable {
        public Callable d;
        public Consumer e;
        public Handler f;

        @Override // java.lang.Runnable
        public final void run() {
            final Object objCall;
            try {
                objCall = ((FontRequestWorker.AnonymousClass3) this.d).call();
            } catch (Exception unused) {
                objCall = null;
            }
            final Consumer consumer = this.e;
            this.f.post(new Runnable() { // from class: androidx.core.provider.RequestExecutor.ReplyRunnable.1
                @Override // java.lang.Runnable
                public final void run() {
                    consumer.accept(objCall);
                }
            });
        }
    }
}
