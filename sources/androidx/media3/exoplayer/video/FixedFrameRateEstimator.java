package androidx.media3.exoplayer.video;

import java.util.Arrays;

/* loaded from: classes2.dex */
final class FixedFrameRateEstimator {

    /* renamed from: a, reason: collision with root package name */
    public Matcher f3193a;
    public Matcher b;
    public boolean c;
    public long d;
    public int e;

    public static final class Matcher {

        /* renamed from: a, reason: collision with root package name */
        public long f3194a;
        public long b;
        public long c;
        public long d;
        public long e;
        public long f;
        public final boolean[] g = new boolean[15];
        public int h;

        public final boolean a() {
            return this.d > 15 && this.h == 0;
        }

        public final void b(long j) {
            long j2 = this.d;
            if (j2 == 0) {
                this.f3194a = j;
            } else if (j2 == 1) {
                long j3 = j - this.f3194a;
                this.b = j3;
                this.f = j3;
                this.e = 1L;
            } else {
                long j4 = j - this.c;
                int i = (int) (j2 % 15);
                long jAbs = Math.abs(j4 - this.b);
                boolean[] zArr = this.g;
                if (jAbs <= 1000000) {
                    this.e++;
                    this.f += j4;
                    if (zArr[i]) {
                        zArr[i] = false;
                        this.h--;
                    }
                } else if (!zArr[i]) {
                    zArr[i] = true;
                    this.h++;
                }
            }
            this.d++;
            this.c = j;
        }

        public final void c() {
            this.d = 0L;
            this.e = 0L;
            this.f = 0L;
            this.h = 0;
            Arrays.fill(this.g, false);
        }
    }
}
