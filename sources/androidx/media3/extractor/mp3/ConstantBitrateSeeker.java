package androidx.media3.extractor.mp3;

import androidx.media3.extractor.ConstantBitrateSeekMap;

/* loaded from: classes2.dex */
final class ConstantBitrateSeeker extends ConstantBitrateSeekMap implements Seeker {
    public final long h;
    public final int i;
    public final int j;
    public final boolean k;
    public final long l;

    public ConstantBitrateSeeker(long j, long j2, int i, int i2, boolean z) {
        super(j, j2, i, i2, z);
        long j3 = j;
        this.h = j2;
        this.i = i;
        this.j = i2;
        this.k = z;
        this.l = j3 == -1 ? -1L : j3;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final long g() {
        return this.l;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final long h(long j) {
        return (Math.max(0L, j - this.b) * 8000000) / this.e;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public final int k() {
        return this.i;
    }
}
