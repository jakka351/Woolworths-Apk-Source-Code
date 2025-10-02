package io.grpc.internal;

import com.google.common.base.Throwables;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
public final class LogExceptionRunnable implements Runnable {
    public static final Logger e = Logger.getLogger(LogExceptionRunnable.class.getName());
    public final Runnable d;

    public LogExceptionRunnable(Runnable runnable) {
        this.d = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Runnable runnable = this.d;
        try {
            runnable.run();
        } catch (Throwable th) {
            e.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            Throwables.a(th);
            throw new AssertionError(th);
        }
    }

    public final String toString() {
        return "LogExceptionRunnable(" + this.d + ")";
    }
}
