package androidx.media3.common.util;

@UnstableApi
/* loaded from: classes2.dex */
public class ConditionVariable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2909a;

    public final synchronized void a() {
        while (!this.f2909a) {
            wait();
        }
    }

    public final synchronized boolean b(long j) {
        if (j <= 0) {
            return this.f2909a;
        }
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        long j2 = j + jElapsedRealtime;
        if (j2 < jElapsedRealtime) {
            a();
        } else {
            while (!this.f2909a && jElapsedRealtime < j2) {
                wait(j2 - jElapsedRealtime);
                jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            }
        }
        return this.f2909a;
    }

    public final synchronized void c() {
        boolean z = false;
        while (!this.f2909a) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z = true;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final synchronized void d() {
        this.f2909a = false;
    }

    public final synchronized boolean e() {
        if (this.f2909a) {
            return false;
        }
        this.f2909a = true;
        notifyAll();
        return true;
    }
}
