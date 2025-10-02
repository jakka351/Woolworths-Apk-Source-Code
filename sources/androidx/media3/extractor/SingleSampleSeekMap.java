package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.SeekMap;

@UnstableApi
/* loaded from: classes2.dex */
public final class SingleSampleSeekMap implements SeekMap {
    @Override // androidx.media3.extractor.SeekMap
    public final SeekMap.SeekPoints b(long j) {
        SeekPoint seekPoint = new SeekPoint(j, 0L);
        return new SeekMap.SeekPoints(seekPoint, seekPoint);
    }

    @Override // androidx.media3.extractor.SeekMap
    public final boolean d() {
        return true;
    }

    @Override // androidx.media3.extractor.SeekMap
    public final long l() {
        return -9223372036854775807L;
    }
}
