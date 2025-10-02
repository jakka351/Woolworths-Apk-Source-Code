package androidx.camera.core.impl.utils.futures;

import androidx.camera.core.Logger;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
abstract class ImmediateFuture<V> implements ListenableFuture<V> {

    public static class ImmediateFailedFuture<V> extends ImmediateFuture<V> {
        public final Throwable d;

        public ImmediateFailedFuture(Throwable th) {
            this.d = th;
        }

        @Override // java.util.concurrent.Future
        public final Object get() throws ExecutionException {
            throw new ExecutionException(this.d);
        }

        public final String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.d + "]]";
        }
    }

    public static final class ImmediateFailedScheduledFuture<V> extends ImmediateFailedFuture<V> implements ScheduledFuture<V> {
        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
            return -1;
        }

        @Override // java.util.concurrent.Delayed
        public final long getDelay(TimeUnit timeUnit) {
            return 0L;
        }
    }

    public static final class ImmediateSuccessfulFuture<V> extends ImmediateFuture<V> {
        public static final ImmediateSuccessfulFuture e = new ImmediateSuccessfulFuture(null);
        public final Object d;

        public ImmediateSuccessfulFuture(Object obj) {
            this.d = obj;
        }

        @Override // java.util.concurrent.Future
        public final Object get() {
            return this.d;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append("[status=SUCCESS, result=[");
            return android.support.v4.media.session.a.o(this.d, "]]", sb);
        }
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void addListener(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger.c("ImmediateFuture", "Experienced RuntimeException while attempting to notify " + runnable + " on Executor " + executor, e);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }
}
