package io.reactivex.android.schedulers;

import android.os.Handler;
import android.os.Message;
import io.reactivex.Scheduler;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class HandlerScheduler extends Scheduler {
    public final Handler f;

    public static final class HandlerWorker extends Scheduler.Worker {
        public final Handler d;
        public volatile boolean e;

        public HandlerWorker(Handler handler) {
            this.d = handler;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.e;
        }

        @Override // io.reactivex.Scheduler.Worker
        public final Disposable d(Runnable runnable, long j, TimeUnit timeUnit) {
            EmptyDisposable emptyDisposable = EmptyDisposable.d;
            if (timeUnit == null) {
                throw new NullPointerException("unit == null");
            }
            if (this.e) {
                return emptyDisposable;
            }
            Handler handler = this.d;
            ScheduledRunnable scheduledRunnable = new ScheduledRunnable(handler, runnable);
            Message messageObtain = Message.obtain(handler, scheduledRunnable);
            messageObtain.obj = this;
            this.d.sendMessageDelayed(messageObtain, timeUnit.toMillis(j));
            if (!this.e) {
                return scheduledRunnable;
            }
            this.d.removeCallbacks(scheduledRunnable);
            return emptyDisposable;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.e = true;
            this.d.removeCallbacksAndMessages(this);
        }
    }

    public static final class ScheduledRunnable implements Runnable, Disposable {
        public final Handler d;
        public final Runnable e;
        public volatile boolean f;

        public ScheduledRunnable(Handler handler, Runnable runnable) {
            this.d = handler;
            this.e = runnable;
        }

        @Override // io.reactivex.disposables.Disposable
        public final boolean b() {
            return this.f;
        }

        @Override // io.reactivex.disposables.Disposable
        public final void dispose() {
            this.d.removeCallbacks(this);
            this.f = true;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.e.run();
            } catch (Throwable th) {
                RxJavaPlugins.b(th);
            }
        }
    }

    public HandlerScheduler(Handler handler) {
        this.f = handler;
    }

    @Override // io.reactivex.Scheduler
    public final Scheduler.Worker c() {
        return new HandlerWorker(this.f);
    }

    @Override // io.reactivex.Scheduler
    public final Disposable e(Runnable runnable, long j, TimeUnit timeUnit) {
        if (timeUnit == null) {
            throw new NullPointerException("unit == null");
        }
        Handler handler = this.f;
        ScheduledRunnable scheduledRunnable = new ScheduledRunnable(handler, runnable);
        handler.sendMessageDelayed(Message.obtain(handler, scheduledRunnable), timeUnit.toMillis(j));
        return scheduledRunnable;
    }
}
