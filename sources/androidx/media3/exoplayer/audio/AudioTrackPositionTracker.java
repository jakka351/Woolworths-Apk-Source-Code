package androidx.media3.exoplayer.audio;

import android.media.AudioTrack;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.Util;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* loaded from: classes2.dex */
final class AudioTrackPositionTracker {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;
    public boolean G;
    public long H;
    public Clock I;

    /* renamed from: a, reason: collision with root package name */
    public final Listener f3052a;
    public final long[] b;
    public AudioTrack c;
    public int d;
    public AudioTimestampPoller e;
    public int f;
    public boolean g;
    public long h;
    public float i;
    public boolean j;
    public long k;
    public long l;
    public Method m;
    public long n;
    public boolean o;
    public boolean p;
    public long q;
    public long r;
    public long s;
    public long t;
    public long u;
    public int v;
    public int w;
    public long x;
    public long y;
    public long z;

    public interface Listener {
    }

    public AudioTrackPositionTracker(Listener listener) {
        this.f3052a = listener;
        try {
            this.m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.b = new long[10];
        this.I = Clock.f2906a;
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0240 A[Catch: Exception -> 0x0256, TRY_LEAVE, TryCatch #0 {Exception -> 0x0256, blocks: (B:95:0x021b, B:97:0x0240), top: B:147:0x021b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a() {
        /*
            Method dump skipped, instructions count: 869
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.AudioTrackPositionTracker.a():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b() {
        /*
            r12 = this;
            long r0 = r12.x
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L16
            long r0 = r12.c()
            long r2 = r12.A
            long r0 = java.lang.Math.min(r2, r0)
            return r0
        L16:
            androidx.media3.common.util.Clock r0 = r12.I
            long r0 = r0.elapsedRealtime()
            long r4 = r12.r
            long r4 = r0 - r4
            r6 = 5
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L8e
            android.media.AudioTrack r4 = r12.c
            r4.getClass()
            int r5 = r4.getPlayState()
            r6 = 1
            if (r5 != r6) goto L33
            goto L8c
        L33:
            int r4 = r4.getPlaybackHeadPosition()
            long r6 = (long) r4
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            boolean r4 = r12.g
            r8 = 0
            if (r4 == 0) goto L52
            r4 = 2
            if (r5 != r4) goto L4f
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L4f
            long r10 = r12.s
            r12.u = r10
        L4f:
            long r10 = r12.u
            long r6 = r6 + r10
        L52:
            int r4 = androidx.media3.common.util.Util.f2928a
            r10 = 29
            if (r4 > r10) goto L70
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L6e
            long r10 = r12.s
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 <= 0) goto L6e
            r4 = 3
            if (r5 != r4) goto L6e
            long r4 = r12.y
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L8c
            r12.y = r0
            goto L8c
        L6e:
            r12.y = r2
        L70:
            long r2 = r12.s
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 <= 0) goto L8a
            boolean r4 = r12.G
            if (r4 == 0) goto L83
            long r4 = r12.H
            long r4 = r4 + r2
            r12.H = r4
            r2 = 0
            r12.G = r2
            goto L8a
        L83:
            long r2 = r12.t
            r4 = 1
            long r2 = r2 + r4
            r12.t = r2
        L8a:
            r12.s = r6
        L8c:
            r12.r = r0
        L8e:
            long r0 = r12.s
            long r2 = r12.H
            long r0 = r0 + r2
            long r2 = r12.t
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.audio.AudioTrackPositionTracker.b():long");
    }

    public final long c() {
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.z;
        }
        return this.z + Util.O(Util.v(Util.I(this.I.elapsedRealtime()) - this.x, this.i), this.f, 1000000L, RoundingMode.UP);
    }

    public final boolean d(long j) {
        long jA = a();
        int i = this.f;
        int i2 = Util.f2928a;
        if (j > Util.O(jA, i, 1000000L, RoundingMode.UP)) {
            return true;
        }
        if (!this.g) {
            return false;
        }
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        return audioTrack.getPlayState() == 2 && b() == 0;
    }

    public final void e() {
        this.k = 0L;
        this.w = 0;
        this.v = 0;
        this.l = 0L;
        this.C = 0L;
        this.F = 0L;
        this.j = false;
    }
}
