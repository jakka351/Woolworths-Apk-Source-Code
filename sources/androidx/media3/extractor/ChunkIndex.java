package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import java.util.Arrays;

@UnstableApi
/* loaded from: classes2.dex */
public final class ChunkIndex implements SeekMap {

    /* renamed from: a, reason: collision with root package name */
    public final int f3227a;
    public final int[] b;
    public final long[] c;
    public final long[] d;
    public final long[] e;
    public final long f;

    public ChunkIndex(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.b = iArr;
        this.c = jArr;
        this.d = jArr2;
        this.e = jArr3;
        int length = iArr.length;
        this.f3227a = length;
        if (length > 0) {
            this.f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f = 0L;
        }
    }

    @Override // androidx.media3.extractor.SeekMap
    public final SeekMap.SeekPoints b(long j) {
        long[] jArr = this.e;
        int iD = Util.d(jArr, j, true);
        long j2 = jArr[iD];
        long[] jArr2 = this.c;
        SeekPoint seekPoint = new SeekPoint(j2, jArr2[iD]);
        if (j2 >= j || iD == this.f3227a - 1) {
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        int i = iD + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(jArr[i], jArr2[i]));
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean d() {
        return true;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final long l() {
        return this.f;
    }

    public final String toString() {
        return "ChunkIndex(length=" + this.f3227a + ", sizes=" + Arrays.toString(this.b) + ", offsets=" + Arrays.toString(this.c) + ", timeUs=" + Arrays.toString(this.e) + ", durationsUs=" + Arrays.toString(this.d) + ")";
    }
}
