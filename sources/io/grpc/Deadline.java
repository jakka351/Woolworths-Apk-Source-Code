package io.grpc;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* loaded from: classes7.dex */
public final class Deadline implements Comparable<Deadline> {
    public static final SystemTicker g = new SystemTicker();
    public static final long h;
    public static final long i;
    public static final long j;
    public final Ticker d;
    public final long e;
    public volatile boolean f;

    public static class SystemTicker extends Ticker {
        @Override // io.grpc.Deadline.Ticker
        public final long a() {
            return System.nanoTime();
        }
    }

    public static abstract class Ticker {
        public abstract long a();
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        h = nanos;
        i = -nanos;
        j = TimeUnit.SECONDS.toNanos(1L);
    }

    public Deadline(long j2) {
        SystemTicker systemTicker = g;
        long jNanoTime = System.nanoTime();
        this.d = systemTicker;
        long jMin = Math.min(h, Math.max(i, j2));
        this.e = jNanoTime + jMin;
        this.f = jMin <= 0;
    }

    public final void a(Deadline deadline) {
        Ticker ticker = deadline.d;
        Ticker ticker2 = this.d;
        if (ticker2 == ticker) {
            return;
        }
        throw new AssertionError("Tickers (" + ticker2 + " and " + deadline.d + ") don't match. Custom Ticker should only be used in tests!");
    }

    @Override // java.lang.Comparable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Deadline deadline) {
        a(deadline);
        long j2 = this.e - deadline.e;
        if (j2 < 0) {
            return -1;
        }
        return j2 > 0 ? 1 : 0;
    }

    public final boolean c(Deadline deadline) {
        a(deadline);
        return this.e - deadline.e < 0;
    }

    public final boolean d() {
        if (!this.f) {
            if (this.e - this.d.a() > 0) {
                return false;
            }
            this.f = true;
        }
        return true;
    }

    public final long e() {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        ((SystemTicker) this.d).getClass();
        long jNanoTime = System.nanoTime();
        if (!this.f && this.e - jNanoTime <= 0) {
            this.f = true;
        }
        return timeUnit.convert(this.e - jNanoTime, timeUnit);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Deadline)) {
            return false;
        }
        Deadline deadline = (Deadline) obj;
        Ticker ticker = deadline.d;
        Ticker ticker2 = this.d;
        if (ticker2 != null ? ticker2 == ticker : ticker == null) {
            return this.e == deadline.e;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.asList(this.d, Long.valueOf(this.e)).hashCode();
    }

    public final String toString() {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        long jE = e();
        long jAbs = Math.abs(jE);
        long j2 = j;
        long j3 = jAbs / j2;
        long jAbs2 = Math.abs(jE) % j2;
        StringBuilder sb = new StringBuilder();
        if (jE < 0) {
            sb.append('-');
        }
        sb.append(j3);
        if (jAbs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb.append("s from now");
        SystemTicker systemTicker = g;
        Ticker ticker = this.d;
        if (ticker != systemTicker) {
            sb.append(" (ticker=" + ticker + ")");
        }
        return sb.toString();
    }
}
