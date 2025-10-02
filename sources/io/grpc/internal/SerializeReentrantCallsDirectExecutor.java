package io.grpc.internal;

import com.google.common.base.Preconditions;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes7.dex */
class SerializeReentrantCallsDirectExecutor implements Executor {
    public static final Logger f = Logger.getLogger(SerializeReentrantCallsDirectExecutor.class.getName());
    public boolean d;
    public ArrayDeque e;

    public final void a() {
        while (true) {
            Runnable runnable = (Runnable) this.e.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                f.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        Preconditions.j(runnable, "'task' must not be null.");
        if (this.d) {
            if (this.e == null) {
                this.e = new ArrayDeque(4);
            }
            this.e.add(runnable);
            return;
        }
        this.d = true;
        try {
            runnable.run();
        } catch (Throwable th) {
            try {
                f.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
                if (this.e != null) {
                    a();
                }
                this.d = false;
            } finally {
                if (this.e != null) {
                    a();
                }
                this.d = false;
            }
        }
    }
}
