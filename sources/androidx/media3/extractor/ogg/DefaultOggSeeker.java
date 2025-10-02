package androidx.media3.extractor.ogg;

import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import java.math.BigInteger;

/* loaded from: classes2.dex */
final class DefaultOggSeeker implements OggSeeker {

    /* renamed from: a, reason: collision with root package name */
    public final OggPageHeader f3343a;
    public final long b;
    public final long c;
    public final StreamReader d;
    public int e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;

    public final class OggSeekMap implements SeekMap {
        public OggSeekMap() {
        }

        @Override // androidx.media3.extractor.SeekMap
        public final SeekMap.SeekPoints b(long j) {
            DefaultOggSeeker defaultOggSeeker = DefaultOggSeeker.this;
            long j2 = defaultOggSeeker.b;
            BigInteger bigIntegerValueOf = BigInteger.valueOf((defaultOggSeeker.d.i * j) / 1000000);
            long j3 = defaultOggSeeker.c;
            SeekPoint seekPoint = new SeekPoint(j, Util.j((bigIntegerValueOf.multiply(BigInteger.valueOf(j3 - j2)).divide(BigInteger.valueOf(defaultOggSeeker.f)).longValue() + j2) - 30000, defaultOggSeeker.b, j3 - 1));
            return new SeekMap.SeekPoints(seekPoint, seekPoint);
        }

        @Override // androidx.media3.extractor.SeekMap
        public final boolean d() {
            return true;
        }

        @Override // androidx.media3.extractor.SeekMap
        public final long l() {
            return (DefaultOggSeeker.this.f * 1000000) / r0.d.i;
        }
    }

    public DefaultOggSeeker(StreamReader streamReader, long j, long j2, long j3, long j4, boolean z) {
        Assertions.b(j >= 0 && j2 > j);
        this.d = streamReader;
        this.b = j;
        this.c = j2;
        if (j3 == j2 - j || z) {
            this.f = j4;
            this.e = 4;
        } else {
            this.e = 0;
        }
        this.f3343a = new OggPageHeader();
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00c3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    @Override // androidx.media3.extractor.ogg.OggSeeker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long a(androidx.media3.extractor.ExtractorInput r28) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 348
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ogg.DefaultOggSeeker.a(androidx.media3.extractor.ExtractorInput):long");
    }

    @Override // androidx.media3.extractor.ogg.OggSeeker
    public final SeekMap b() {
        if (this.f != 0) {
            return new OggSeekMap();
        }
        return null;
    }

    @Override // androidx.media3.extractor.ogg.OggSeeker
    public final void c(long j) {
        this.h = Util.j(j, 0L, this.f - 1);
        this.e = 2;
        this.i = this.b;
        this.j = this.c;
        this.k = 0L;
        this.l = this.f;
    }
}
