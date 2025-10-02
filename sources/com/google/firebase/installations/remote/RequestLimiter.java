package com.google.firebase.installations.remote;

import com.google.firebase.installations.Utils;
import com.google.firebase.installations.time.SystemClock;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
class RequestLimiter {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final Utils f15628a;
    public long b;
    public int c;

    public RequestLimiter() {
        if (SystemClock.f15629a == null) {
            Pattern pattern = Utils.c;
            SystemClock.f15629a = new SystemClock();
        }
        SystemClock systemClock = SystemClock.f15629a;
        if (Utils.d == null) {
            Utils.d = new Utils(systemClock);
        }
        this.f15628a = Utils.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean a() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.c     // Catch: java.lang.Throwable -> L16
            if (r0 == 0) goto L18
            com.google.firebase.installations.Utils r0 = r4.f15628a     // Catch: java.lang.Throwable -> L16
            com.google.firebase.installations.time.Clock r0 = r0.f15617a     // Catch: java.lang.Throwable -> L16
            long r0 = r0.currentTimeMillis()     // Catch: java.lang.Throwable -> L16
            long r2 = r4.b     // Catch: java.lang.Throwable -> L16
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L14
            goto L18
        L14:
            r0 = 0
            goto L19
        L16:
            r0 = move-exception
            goto L1b
        L18:
            r0 = 1
        L19:
            monitor-exit(r4)
            return r0
        L1b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L16
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.installations.remote.RequestLimiter.a():boolean");
    }

    public final synchronized void b(int i) {
        long jMin;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.c = 0;
            }
            return;
        }
        this.c++;
        synchronized (this) {
            if (i == 429 || (i >= 500 && i < 600)) {
                double dPow = Math.pow(2.0d, this.c);
                this.f15628a.getClass();
                jMin = (long) Math.min(dPow + ((long) (Math.random() * 1000.0d)), e);
            } else {
                jMin = d;
            }
            this.b = this.f15628a.f15617a.currentTimeMillis() + jMin;
        }
        return;
    }
}
