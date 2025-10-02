package androidx.media3.extractor.avi;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.NoOpExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.text.DefaultSubtitleParserFactory;
import androidx.media3.extractor.text.SubtitleTranscodingExtractorOutput;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
/* loaded from: classes2.dex */
public final class AviExtractor implements Extractor {

    /* renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f3260a;
    public final ChunkHeaderHolder b;
    public final boolean c;
    public final DefaultSubtitleParserFactory d;
    public int e;
    public ExtractorOutput f;
    public AviMainHeaderChunk g;
    public long h;
    public ChunkReader[] i;
    public long j;
    public ChunkReader k;
    public int l;
    public long m;
    public long n;
    public int o;
    public boolean p;

    public class AviSeekMap implements SeekMap {

        /* renamed from: a, reason: collision with root package name */
        public final long f3261a;

        public AviSeekMap(long j) {
            this.f3261a = j;
        }

        @Override // androidx.media3.extractor.SeekMap
        public final SeekMap.SeekPoints b(long j) {
            AviExtractor aviExtractor = AviExtractor.this;
            SeekMap.SeekPoints seekPointsB = aviExtractor.i[0].b(j);
            int i = 1;
            while (true) {
                ChunkReader[] chunkReaderArr = aviExtractor.i;
                if (i >= chunkReaderArr.length) {
                    return seekPointsB;
                }
                SeekMap.SeekPoints seekPointsB2 = chunkReaderArr[i].b(j);
                if (seekPointsB2.f3249a.b < seekPointsB.f3249a.b) {
                    seekPointsB = seekPointsB2;
                }
                i++;
            }
        }

        @Override // androidx.media3.extractor.SeekMap
        public final boolean d() {
            return true;
        }

        @Override // androidx.media3.extractor.SeekMap
        public final long l() {
            return this.f3261a;
        }
    }

    public static class ChunkHeaderHolder {

        /* renamed from: a, reason: collision with root package name */
        public int f3262a;
        public int b;
        public int c;
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public AviExtractor(int i, DefaultSubtitleParserFactory defaultSubtitleParserFactory) {
        this.d = defaultSubtitleParserFactory;
        this.c = (i & 1) == 0;
        this.f3260a = new ParsableByteArray(12);
        this.b = new ChunkHeaderHolder();
        this.f = new NoOpExtractorOutput();
        this.i = new ChunkReader[0];
        this.m = -1L;
        this.n = -1L;
        this.l = -1;
        this.h = -9223372036854775807L;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void a(long j, long j2) {
        this.j = -1L;
        this.k = null;
        for (ChunkReader chunkReader : this.i) {
            if (chunkReader.k == 0) {
                chunkReader.i = 0;
            } else {
                chunkReader.i = chunkReader.n[Util.d(chunkReader.m, j, true)];
            }
        }
        if (j != 0) {
            this.e = 6;
        } else if (this.i.length == 0) {
            this.e = 0;
        } else {
            this.e = 3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0111  */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(androidx.media3.extractor.ExtractorInput r24, androidx.media3.extractor.PositionHolder r25) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1144
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.avi.AviExtractor.f(androidx.media3.extractor.ExtractorInput, androidx.media3.extractor.PositionHolder):int");
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean i(ExtractorInput extractorInput) {
        ParsableByteArray parsableByteArray = this.f3260a;
        extractorInput.b(0, 12, parsableByteArray.f2922a);
        parsableByteArray.G(0);
        if (parsableByteArray.i() == 1179011410) {
            parsableByteArray.H(4);
            if (parsableByteArray.i() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void j(ExtractorOutput extractorOutput) {
        this.e = 0;
        if (this.c) {
            extractorOutput = new SubtitleTranscodingExtractorOutput(extractorOutput, this.d);
        }
        this.f = extractorOutput;
        this.j = -1L;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
