package androidx.media3.extractor.mp3;

import android.util.Pair;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;

/* loaded from: classes2.dex */
final class MlltSeeker implements Seeker {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f3310a;
    public final long[] b;
    public final long c;

    public MlltSeeker(long[] jArr, long[] jArr2, long j) {
        this.f3310a = jArr;
        this.b = jArr2;
        this.c = j == -9223372036854775807L ? Util.I(jArr2[jArr2.length - 1]) : j;
    }

    public static Pair a(long j, long[] jArr, long[] jArr2) {
        int iD = Util.d(jArr, j, true);
        long j2 = jArr[iD];
        long j3 = jArr2[iD];
        int i = iD + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // androidx.media3.extractor.SeekMap
    public final SeekMap.SeekPoints b(long j) {
        Pair pairA = a(Util.U(Util.j(j, 0L, this.c)), this.b, this.f3310a);
        SeekPoint seekPoint = new SeekPoint(Util.I(((Long) pairA.first).longValue()), ((Long) pairA.second).longValue());
        return new SeekMap.SeekPoints(seekPoint, seekPoint);
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean d() {
        return true;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final long g() {
        return -1L;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final long h(long j) {
        return Util.I(((Long) a(j, this.f3310a, this.b).second).longValue());
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final int k() {
        return -2147483647;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final long l() {
        return this.c;
    }
}
