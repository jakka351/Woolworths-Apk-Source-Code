package androidx.media3.extractor.text;

import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.IndexSeekMap;
import androidx.media3.extractor.TrackOutput;
import java.util.ArrayList;

@UnstableApi
/* loaded from: classes2.dex */
public class SubtitleExtractor implements Extractor {

    /* renamed from: a, reason: collision with root package name */
    public final SubtitleParser f3354a;
    public TrackOutput f;
    public int g;
    public byte[] e = Util.c;
    public final ParsableByteArray d = new ParsableByteArray();
    public final Format b = null;
    public final ArrayList c = new ArrayList();
    public int h = 0;
    public long[] i = Util.d;
    public long j = -9223372036854775807L;

    public static class Sample implements Comparable<Sample> {
        public final long d;
        public final byte[] e;

        public Sample(long j, byte[] bArr) {
            this.d = j;
            this.e = bArr;
        }

        @Override // java.lang.Comparable
        public final int compareTo(Sample sample) {
            return Long.compare(this.d, sample.d);
        }
    }

    public SubtitleExtractor(SubtitleParser subtitleParser) {
        this.f3354a = subtitleParser;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void a(long j, long j2) {
        int i = this.h;
        Assertions.f((i == 0 || i == 5) ? false : true);
        this.j = j2;
        if (this.h == 2) {
            this.h = 1;
        }
        if (this.h == 4) {
            this.h = 3;
        }
    }

    public final void b(Sample sample) {
        Assertions.g(this.f);
        byte[] bArr = sample.e;
        int length = bArr.length;
        ParsableByteArray parsableByteArray = this.d;
        parsableByteArray.getClass();
        parsableByteArray.E(bArr.length, bArr);
        this.f.c(length, parsableByteArray);
        this.f.g(sample.d, 1, length, 0, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x007e A[EXC_TOP_SPLITTER, PHI: r22
  0x007e: PHI (r22v4 int) = (r22v5 int), (r22v6 int) binds: [B:32:0x007c, B:29:0x0077] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(androidx.media3.extractor.ExtractorInput r21, androidx.media3.extractor.PositionHolder r22) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.SubtitleExtractor.f(androidx.media3.extractor.ExtractorInput, androidx.media3.extractor.PositionHolder):int");
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean i(ExtractorInput extractorInput) {
        return true;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void j(ExtractorOutput extractorOutput) {
        Assertions.f(this.h == 0);
        TrackOutput trackOutputJ = extractorOutput.j(0, 3);
        this.f = trackOutputJ;
        Format format = this.b;
        if (format != null) {
            trackOutputJ.e(format);
            extractorOutput.h();
            extractorOutput.q(new IndexSeekMap(new long[]{0}, new long[]{0}, -9223372036854775807L));
        }
        this.h = 1;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
        if (this.h == 5) {
            return;
        }
        this.f3354a.reset();
        this.h = 5;
    }
}
