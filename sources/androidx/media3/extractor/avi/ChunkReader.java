package androidx.media3.extractor.avi;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.TrackOutput;
import java.math.RoundingMode;

/* loaded from: classes2.dex */
final class ChunkReader {

    /* renamed from: a, reason: collision with root package name */
    public final AviStreamHeaderChunk f3265a;
    public final TrackOutput b;
    public final int c;
    public final int d;
    public final long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long[] m;
    public int[] n;

    public ChunkReader(int i, AviStreamHeaderChunk aviStreamHeaderChunk, TrackOutput trackOutput) {
        int i2 = aviStreamHeaderChunk.d;
        this.f3265a = aviStreamHeaderChunk;
        int iA = aviStreamHeaderChunk.a();
        boolean z = true;
        if (iA != 1 && iA != 2) {
            z = false;
        }
        Assertions.b(z);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.c = (iA == 2 ? 1667497984 : 1651965952) | i3;
        long j = aviStreamHeaderChunk.b * 1000000;
        long j2 = aviStreamHeaderChunk.c;
        int i4 = Util.f2928a;
        this.e = Util.O(i2, j, j2, RoundingMode.DOWN);
        this.b = trackOutput;
        this.d = iA == 2 ? i3 | 1650720768 : -1;
        this.l = -1L;
        this.m = new long[512];
        this.n = new int[512];
        this.f = i2;
    }

    public final SeekPoint a(int i) {
        return new SeekPoint(((this.e * 1) / this.f) * this.n[i], this.m[i]);
    }

    public final SeekMap.SeekPoints b(long j) {
        if (this.k == 0) {
            SeekPoint seekPoint = new SeekPoint(0L, this.l);
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        int i = (int) (j / ((this.e * 1) / this.f));
        int iC = Util.c(this.n, i, true, true);
        if (this.n[iC] == i) {
            SeekPoint seekPointA = a(iC);
            return new SeekMap.SeekPoints(seekPointA, seekPointA);
        }
        SeekPoint seekPointA2 = a(iC);
        int i2 = iC + 1;
        return i2 < this.m.length ? new SeekMap.SeekPoints(seekPointA2, a(i2)) : new SeekMap.SeekPoints(seekPointA2, seekPointA2);
    }
}
