package androidx.media3.exoplayer;

import android.os.SystemClock;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

@UnstableApi
/* loaded from: classes2.dex */
public final class DefaultLivePlaybackSpeedControl implements LivePlaybackSpeedControl {

    /* renamed from: a, reason: collision with root package name */
    public final long f2995a;
    public final long b;
    public final float c;
    public long d = -9223372036854775807L;
    public long e = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public float k = 0.97f;
    public float j = 1.03f;
    public float l = 1.0f;
    public long m = -9223372036854775807L;
    public long f = -9223372036854775807L;
    public long i = -9223372036854775807L;
    public long n = -9223372036854775807L;
    public long o = -9223372036854775807L;

    public static final class Builder {
    }

    public DefaultLivePlaybackSpeedControl(long j, float f, long j2) {
        this.f2995a = j;
        this.b = j2;
        this.c = f;
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public final void a(MediaItem.LiveConfiguration liveConfiguration) {
        this.d = Util.I(liveConfiguration.f2861a);
        this.g = Util.I(liveConfiguration.b);
        this.h = Util.I(liveConfiguration.c);
        float f = liveConfiguration.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        this.k = f;
        float f2 = liveConfiguration.e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        this.j = f2;
        if (f == 1.0f && f2 == 1.0f) {
            this.d = -9223372036854775807L;
        }
        f();
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public final float b(long j, long j2) {
        if (this.d == -9223372036854775807L) {
            return 1.0f;
        }
        long j3 = j - j2;
        long j4 = this.n;
        if (j4 == -9223372036854775807L) {
            this.n = j3;
            this.o = 0L;
        } else {
            float f = j4;
            float f2 = this.c;
            float f3 = 1.0f - f2;
            this.n = Math.max(j3, (long) ((j3 * f3) + (f * f2)));
            this.o = (long) ((f3 * Math.abs(j3 - r9)) + (f2 * this.o));
        }
        if (this.m != -9223372036854775807L && SystemClock.elapsedRealtime() - this.m < 1000) {
            return this.l;
        }
        this.m = SystemClock.elapsedRealtime();
        long j5 = (this.o * 3) + this.n;
        if (this.i > j5) {
            float fI = Util.I(1000L);
            long[] jArr = {j5, this.f, this.i - (((long) ((this.l - 1.0f) * fI)) + ((long) ((this.j - 1.0f) * fI)))};
            long j6 = jArr[0];
            for (int i = 1; i < 3; i++) {
                long j7 = jArr[i];
                if (j7 > j6) {
                    j6 = j7;
                }
            }
            this.i = j6;
        } else {
            long j8 = Util.j(j - ((long) (Math.max(BitmapDescriptorFactory.HUE_RED, this.l - 1.0f) / 1.0E-7f)), this.i, j5);
            this.i = j8;
            long j9 = this.h;
            if (j9 != -9223372036854775807L && j8 > j9) {
                this.i = j9;
            }
        }
        long j10 = j - this.i;
        if (Math.abs(j10) < this.f2995a) {
            this.l = 1.0f;
        } else {
            this.l = Util.h((1.0E-7f * j10) + 1.0f, this.k, this.j);
        }
        return this.l;
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public final long c() {
        return this.i;
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public final void d() {
        long j = this.i;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.b;
        this.i = j2;
        long j3 = this.h;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.i = j3;
        }
        this.m = -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.LivePlaybackSpeedControl
    public final void e(long j) {
        this.e = j;
        f();
    }

    public final void f() {
        long j;
        long j2 = this.d;
        if (j2 != -9223372036854775807L) {
            j = this.e;
            if (j == -9223372036854775807L) {
                long j3 = this.g;
                if (j3 != -9223372036854775807L && j2 < j3) {
                    j2 = j3;
                }
                j = this.h;
                if (j == -9223372036854775807L || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.f == j) {
            return;
        }
        this.f = j;
        this.i = j;
        this.n = -9223372036854775807L;
        this.o = -9223372036854775807L;
        this.m = -9223372036854775807L;
    }
}
