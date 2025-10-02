package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.impl.DefaultRunnableScheduler;
import androidx.work.impl.model.WorkGenerationalId;
import java.util.HashMap;

@RestrictTo
/* loaded from: classes2.dex */
public class WorkTimer {
    public static final String e = Logger.g("WorkTimer");

    /* renamed from: a, reason: collision with root package name */
    public final RunnableScheduler f4008a;
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public final Object d = new Object();

    @RestrictTo
    public interface TimeLimitExceededListener {
        void a(WorkGenerationalId workGenerationalId);
    }

    @RestrictTo
    public static class WorkTimerRunnable implements Runnable {
        public final WorkTimer d;
        public final WorkGenerationalId e;

        public WorkTimerRunnable(WorkTimer workTimer, WorkGenerationalId workGenerationalId) {
            this.d = workTimer;
            this.e = workGenerationalId;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.d.d) {
                try {
                    if (((WorkTimerRunnable) this.d.b.remove(this.e)) != null) {
                        TimeLimitExceededListener timeLimitExceededListener = (TimeLimitExceededListener) this.d.c.remove(this.e);
                        if (timeLimitExceededListener != null) {
                            timeLimitExceededListener.a(this.e);
                        }
                    } else {
                        Logger.e().a("WrkTimerRunnable", "Timer with " + this.e + " is already marked as complete.");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public WorkTimer(DefaultRunnableScheduler defaultRunnableScheduler) {
        this.f4008a = defaultRunnableScheduler;
    }

    public final void a(WorkGenerationalId workGenerationalId) {
        synchronized (this.d) {
            try {
                if (((WorkTimerRunnable) this.b.remove(workGenerationalId)) != null) {
                    Logger.e().a(e, "Stopping timer for " + workGenerationalId);
                    this.c.remove(workGenerationalId);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
