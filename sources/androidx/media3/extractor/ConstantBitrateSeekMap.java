package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SeekMap;

@UnstableApi
/* loaded from: classes2.dex */
public class ConstantBitrateSeekMap implements SeekMap {

    /* renamed from: a, reason: collision with root package name */
    public final long f3228a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;
    public final boolean g;

    public ConstantBitrateSeekMap(long j, long j2, int i, int i2, boolean z) {
        this.f3228a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        this.g = z;
        if (j == -1) {
            this.d = -1L;
            this.f = -9223372036854775807L;
        } else {
            long j3 = j - j2;
            this.d = j3;
            this.f = (Math.max(0L, j3) * 8000000) / i;
        }
    }

    @Override // androidx.media3.extractor.SeekMap
    public final SeekMap.SeekPoints b(long j) {
        long j2 = this.d;
        long j3 = this.b;
        if (j2 == -1 && !this.g) {
            SeekPoint seekPoint = new SeekPoint(0L, j3);
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        int i = this.e;
        long j4 = this.c;
        long jMin = (((i * j) / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = Math.max(jMin, 0L) + j3;
        long jMax2 = (Math.max(0L, jMax - j3) * 8000000) / i;
        SeekPoint seekPoint2 = new SeekPoint(jMax2, jMax);
        if (j2 != -1 && jMax2 < j) {
            long j5 = jMax + j4;
            if (j5 < this.f3228a) {
                return new SeekMap.SeekPoints(seekPoint2, new SeekPoint((Math.max(0L, j5 - j3) * 8000000) / i, j5));
            }
        }
        return new SeekMap.SeekPoints(seekPoint2, seekPoint2);
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean d() {
        return this.d != -1 || this.g;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final long l() {
        return this.f;
    }
}
