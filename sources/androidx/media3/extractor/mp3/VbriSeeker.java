package androidx.media3.extractor.mp3;

import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;

/* loaded from: classes2.dex */
final class VbriSeeker implements Seeker {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f3312a;
    public final long[] b;
    public final long c;
    public final long d;
    public final int e;

    public VbriSeeker(long[] jArr, long j, long j2, long[] jArr2, int i) {
        this.f3312a = jArr;
        this.b = jArr2;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final SeekMap.SeekPoints b(long j) {
        long[] jArr = this.f3312a;
        int iD = Util.d(jArr, j, true);
        long j2 = jArr[iD];
        long[] jArr2 = this.b;
        SeekPoint seekPoint = new SeekPoint(j2, jArr2[iD]);
        if (j2 >= j || iD == jArr.length - 1) {
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        int i = iD + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(jArr[i], jArr2[i]));
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean d() {
        return true;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final long g() {
        return this.d;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final long h(long j) {
        return this.f3312a[Util.d(this.b, j, true)];
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final int k() {
        return this.e;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final long l() {
        return this.c;
    }
}
