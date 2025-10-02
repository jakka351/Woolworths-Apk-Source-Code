package androidx.media3.common.util;

import com.lexisnexisrisk.threatmetrix.rl.tmxprofiling.llqqqql;
import java.math.RoundingMode;

@UnstableApi
/* loaded from: classes2.dex */
public final class TimestampAdjuster {

    /* renamed from: a, reason: collision with root package name */
    public long f2927a;
    public long b;
    public long c;
    public final ThreadLocal d = new ThreadLocal();

    public TimestampAdjuster(long j) {
        e(j);
    }

    public final synchronized long a(long j) {
        long j2;
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            synchronized (this) {
                if (!(this.b != -9223372036854775807L)) {
                    long jLongValue = this.f2927a;
                    if (jLongValue == 9223372036854775806L) {
                        Long l = (Long) this.d.get();
                        l.getClass();
                        jLongValue = l.longValue();
                    }
                    this.b = jLongValue - j;
                    notifyAll();
                }
                this.c = j;
                j2 = j + this.b;
            }
            return j2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.c;
            if (j2 != -9223372036854775807L) {
                int i = Util.f2928a;
                long jO = Util.O(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = (llqqqql.a00610061aaaa + jO) / 8589934592L;
                long j4 = ((j3 - 1) * 8589934592L) + j;
                long j5 = (j3 * 8589934592L) + j;
                j = Math.abs(j4 - jO) < Math.abs(j5 - jO) ? j4 : j5;
            }
            long j6 = j;
            int i2 = Util.f2928a;
            return a(Util.O(j6, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j2 = this.c;
            if (j2 != -9223372036854775807L) {
                int i = Util.f2928a;
                long jO = Util.O(j2, 90000L, 1000000L, RoundingMode.DOWN);
                long j3 = jO / 8589934592L;
                long j4 = (j3 * 8589934592L) + j;
                j = j4 >= jO ? j4 : ((j3 + 1) * 8589934592L) + j;
            }
            long j5 = j;
            int i2 = Util.f2928a;
            return a(Util.O(j5, 1000000L, 90000L, RoundingMode.DOWN));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long d() {
        long j;
        j = this.f2927a;
        if (j == Long.MAX_VALUE || j == 9223372036854775806L) {
            j = -9223372036854775807L;
        }
        return j;
    }

    public final synchronized void e(long j) {
        this.f2927a = j;
        this.b = j == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.c = -9223372036854775807L;
    }
}
