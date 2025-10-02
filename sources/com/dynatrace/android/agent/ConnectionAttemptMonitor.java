package com.dynatrace.android.agent;

import com.dynatrace.android.agent.util.Utility;
import com.medallia.digital.mobilesdk.l8;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class ConnectionAttemptMonitor {
    public static final String h;

    /* renamed from: a, reason: collision with root package name */
    public long f14069a;
    public long b;
    public Timer c;
    public boolean d;
    public boolean e;
    public AtomicBoolean f;
    public Date g;

    public class AttemptTimer extends TimerTask {
        public AttemptTimer() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            synchronized (ConnectionAttemptMonitor.this) {
                ConnectionAttemptMonitor.this.f.set(true);
                ConnectionAttemptMonitor connectionAttemptMonitor = ConnectionAttemptMonitor.this;
                connectionAttemptMonitor.e(connectionAttemptMonitor.b());
            }
        }
    }

    static {
        boolean z = Global.f14077a;
        h = "dtxConnectionAttemptMonitor";
    }

    public final synchronized void a() {
        Timer timer = this.c;
        if (timer != null) {
            timer.cancel();
            this.c.purge();
            this.c = null;
        }
    }

    public final Date b() {
        Date date = new Date(TimeLineProvider.b.a() + this.b);
        long j = this.f14069a - 1;
        this.f14069a = j;
        if (j > 0) {
            this.b = l8.b.b;
            return date;
        }
        if (j == 0) {
            this.b = 0L;
            return null;
        }
        long j2 = this.b;
        if (j2 == 1920000) {
            this.b = 3420000L;
            return date;
        }
        if (j2 == 3420000 || j2 <= 0) {
            return null;
        }
        this.b = j2 * 2;
        return date;
    }

    public final synchronized void c(boolean z, boolean z2) {
        try {
            this.e = z;
            this.f.set(false);
            if (z) {
                if (Global.f14077a) {
                    Utility.h(h, "Connection ok notification");
                }
                this.d = true;
                this.f14069a = -1L;
                this.b = 0L;
                a();
            } else {
                if (Global.f14077a) {
                    Utility.h(h, "No connection notification");
                }
                if (this.d && this.c == null && this.b == 0) {
                    this.b = l8.b.b;
                    e(b());
                } else if (z2 && this.c == null) {
                    e(b());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d(int i) {
        try {
            this.e = false;
            this.f.set(false);
            if (this.d && this.c == null && this.b == 0) {
                this.b = l8.b.b;
            }
            if (this.c != null || b() != null) {
                e(new Date(TimeLineProvider.b.a() + (i * 1000)));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void e(Date date) {
        a();
        this.g = date;
        if (date != null) {
            String str = h;
            Timer timer = new Timer(str);
            this.c = timer;
            try {
                timer.schedule(new AttemptTimer(), this.g);
                if (Global.f14077a) {
                    Utility.h(str, "Connection attempt is scheduled for " + this.g);
                }
            } catch (Exception e) {
                if (Global.f14077a) {
                    Utility.h(h, "Failed to schedule a connection attempt ... " + e.toString());
                }
            }
        }
    }
}
