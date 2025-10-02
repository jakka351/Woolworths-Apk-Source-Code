package androidx.media3.extractor;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.FlacStreamMetadata;
import androidx.media3.extractor.SeekMap;

@UnstableApi
/* loaded from: classes2.dex */
public final class FlacSeekTableSeekMap implements SeekMap {

    /* renamed from: a, reason: collision with root package name */
    public final FlacStreamMetadata f3237a;
    public final long b;

    public FlacSeekTableSeekMap(FlacStreamMetadata flacStreamMetadata, long j) {
        this.f3237a = flacStreamMetadata;
        this.b = j;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final SeekMap.SeekPoints b(long j) {
        FlacStreamMetadata flacStreamMetadata = this.f3237a;
        Assertions.g(flacStreamMetadata.k);
        FlacStreamMetadata.SeekTable seekTable = flacStreamMetadata.k;
        long[] jArr = seekTable.f3239a;
        long[] jArr2 = seekTable.b;
        int iD = Util.d(jArr, Util.j((flacStreamMetadata.e * j) / 1000000, 0L, flacStreamMetadata.j - 1), false);
        long j2 = iD == -1 ? 0L : jArr[iD];
        long j3 = iD != -1 ? jArr2[iD] : 0L;
        int i = flacStreamMetadata.e;
        long j4 = (j2 * 1000000) / i;
        long j5 = this.b;
        SeekPoint seekPoint = new SeekPoint(j4, j3 + j5);
        if (j4 == j || iD == jArr.length - 1) {
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }
        int i2 = iD + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint((jArr[i2] * 1000000) / i, j5 + jArr2[i2]));
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean d() {
        return true;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final long l() {
        return this.f3237a.b();
    }
}
