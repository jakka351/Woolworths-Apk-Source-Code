package androidx.media3.extractor.mp3;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;

/* loaded from: classes2.dex */
final class XingSeeker implements Seeker {

    /* renamed from: a, reason: collision with root package name */
    public final long f3314a;
    public final int b;
    public final long c;
    public final int d;
    public final long e;
    public final long f;
    public final long[] g;

    public XingSeeker(long j, int i, long j2, int i2, long j3, long[] jArr) {
        this.f3314a = j;
        this.b = i;
        this.c = j2;
        this.d = i2;
        this.e = j3;
        this.g = jArr;
        this.f = j3 != -1 ? j + j3 : -1L;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final SeekMap.SeekPoints b(long j) {
        double d;
        double d2;
        boolean zD = d();
        int i = this.b;
        long j2 = this.f3314a;
        if (!zD) {
            SeekPoint seekPoint = new SeekPoint(0L, j2 + i);
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        long j3 = Util.j(j, 0L, this.c);
        double d3 = (j3 * 100.0d) / this.c;
        double d4 = 0.0d;
        if (d3 <= 0.0d) {
            d = 256.0d;
        } else if (d3 >= 100.0d) {
            d = 256.0d;
            d4 = 256.0d;
        } else {
            int i2 = (int) d3;
            long[] jArr = this.g;
            Assertions.g(jArr);
            double d5 = jArr[i2];
            if (i2 == 99) {
                d = 256.0d;
                d2 = 256.0d;
            } else {
                d = 256.0d;
                d2 = jArr[i2 + 1];
            }
            d4 = ((d2 - d5) * (d3 - i2)) + d5;
        }
        long j4 = this.e;
        SeekPoint seekPoint2 = new SeekPoint(j3, j2 + Util.j(Math.round((d4 / d) * j4), i, j4 - 1));
        return new SeekMap.SeekPoints(seekPoint2, seekPoint2);
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean d() {
        return this.g != null;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final long g() {
        return this.f;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final long h(long j) {
        long j2 = j - this.f3314a;
        if (!d() || j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.g;
        Assertions.g(jArr);
        double d = (j2 * 256.0d) / this.e;
        int iD = Util.d(jArr, (long) d, true);
        long j3 = this.c;
        long j4 = (iD * j3) / 100;
        long j5 = jArr[iD];
        int i = iD + 1;
        long j6 = (j3 * i) / 100;
        return Math.round((j5 == (iD == 99 ? 256L : jArr[i]) ? 0.0d : (d - j5) / (r0 - j5)) * (j6 - j4)) + j4;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final int k() {
        return this.d;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final long l() {
        return this.c;
    }
}
