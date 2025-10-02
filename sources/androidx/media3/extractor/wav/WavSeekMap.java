package androidx.media3.extractor.wav;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import java.math.RoundingMode;

/* loaded from: classes2.dex */
final class WavSeekMap implements SeekMap {

    /* renamed from: a, reason: collision with root package name */
    public final WavFormat f3450a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;

    public WavSeekMap(WavFormat wavFormat, int i, long j, long j2) {
        this.f3450a = wavFormat;
        this.b = i;
        this.c = j;
        long j3 = (j2 - j) / wavFormat.c;
        this.d = j3;
        this.e = a(j3);
    }

    public final long a(long j) {
        long j2 = j * this.b;
        long j3 = this.f3450a.b;
        int i = Util.f2928a;
        return Util.O(j2, 1000000L, j3, RoundingMode.DOWN);
    }

    @Override // androidx.media3.extractor.SeekMap
    public final SeekMap.SeekPoints b(long j) {
        WavFormat wavFormat = this.f3450a;
        long j2 = this.d;
        long j3 = Util.j((wavFormat.b * j) / (this.b * 1000000), 0L, j2 - 1);
        long j4 = this.c;
        long jA = a(j3);
        SeekPoint seekPoint = new SeekPoint(jA, (wavFormat.c * j3) + j4);
        if (jA >= j || j3 == j2 - 1) {
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        long j5 = j3 + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(a(j5), (wavFormat.c * j5) + j4));
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean d() {
        return true;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final long l() {
        return this.e;
    }
}
