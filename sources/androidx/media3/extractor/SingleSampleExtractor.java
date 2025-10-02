package androidx.media3.extractor;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes2.dex */
public final class SingleSampleExtractor implements Extractor {

    /* renamed from: a, reason: collision with root package name */
    public final int f3252a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public ExtractorOutput f;
    public TrackOutput g;

    public SingleSampleExtractor(int i, int i2, String str) {
        this.f3252a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void a(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        TrackOutput trackOutput = this.g;
        trackOutput.getClass();
        int iB = trackOutput.b(extractorInput, 1024, true);
        if (iB != -1) {
            this.d += iB;
            return 0;
        }
        this.e = 2;
        this.g.g(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean i(ExtractorInput extractorInput) {
        int i = this.b;
        int i2 = this.f3252a;
        Assertions.f((i2 == -1 || i == -1) ? false : true);
        ParsableByteArray parsableByteArray = new ParsableByteArray(i);
        ((DefaultExtractorInput) extractorInput).h(parsableByteArray.f2922a, 0, i, false);
        return parsableByteArray.A() == i2;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void j(ExtractorOutput extractorOutput) {
        this.f = extractorOutput;
        TrackOutput trackOutputJ = extractorOutput.j(1024, 4);
        this.g = trackOutputJ;
        Format.Builder builder = new Format.Builder();
        String str = this.c;
        builder.l = MimeTypes.m(str);
        builder.m = MimeTypes.m(str);
        trackOutputJ.e(new Format(builder));
        this.f.h();
        this.f.q(new SingleSampleSeekMap());
        this.e = 1;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
