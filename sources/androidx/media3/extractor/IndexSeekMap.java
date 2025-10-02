package androidx.media3.extractor;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.LongArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;

@UnstableApi
/* loaded from: classes2.dex */
public final class IndexSeekMap implements SeekMap {

    /* renamed from: a, reason: collision with root package name */
    public final LongArray f3245a;
    public final LongArray b;
    public long c;

    public IndexSeekMap(long[] jArr, long[] jArr2, long j) {
        Assertions.b(jArr.length == jArr2.length);
        int length = jArr2.length;
        if (length <= 0 || jArr2[0] <= 0) {
            this.f3245a = new LongArray(length);
            this.b = new LongArray(length);
        } else {
            int i = length + 1;
            LongArray longArray = new LongArray(i);
            this.f3245a = longArray;
            LongArray longArray2 = new LongArray(i);
            this.b = longArray2;
            longArray.a(0L);
            longArray2.a(0L);
        }
        this.f3245a.b(jArr);
        this.b.b(jArr2);
        this.c = j;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final SeekMap.SeekPoints b(long j) {
        LongArray longArray = this.b;
        if (longArray.f2915a == 0) {
            SeekPoint seekPoint = SeekPoint.c;
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        int iB = Util.b(longArray, j);
        long jC = longArray.c(iB);
        LongArray longArray2 = this.f3245a;
        SeekPoint seekPoint2 = new SeekPoint(jC, longArray2.c(iB));
        if (jC == j || iB == longArray.f2915a - 1) {
            return new SeekMap.SeekPoints(seekPoint2, seekPoint2);
        }
        int i = iB + 1;
        return new SeekMap.SeekPoints(seekPoint2, new SeekPoint(longArray.c(i), longArray2.c(i)));
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean d() {
        return this.b.f2915a > 0;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final long l() {
        return this.c;
    }
}
