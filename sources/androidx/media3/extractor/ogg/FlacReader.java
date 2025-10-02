package androidx.media3.extractor.ogg;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.FlacFrameReader;
import androidx.media3.extractor.FlacMetadataReader;
import androidx.media3.extractor.FlacSeekTableSeekMap;
import androidx.media3.extractor.FlacStreamMetadata;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.ogg.StreamReader;
import java.util.Arrays;

/* loaded from: classes2.dex */
final class FlacReader extends StreamReader {
    public FlacStreamMetadata n;
    public FlacOggSeeker o;

    public static final class FlacOggSeeker implements OggSeeker {

        /* renamed from: a, reason: collision with root package name */
        public FlacStreamMetadata f3345a;
        public FlacStreamMetadata.SeekTable b;
        public long c;
        public long d;

        @Override // androidx.media3.extractor.ogg.OggSeeker
        public final long a(ExtractorInput extractorInput) {
            long j = this.d;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.d = -1L;
            return j2;
        }

        @Override // androidx.media3.extractor.ogg.OggSeeker
        public final SeekMap b() {
            Assertions.f(this.c != -1);
            return new FlacSeekTableSeekMap(this.f3345a, this.c);
        }

        @Override // androidx.media3.extractor.ogg.OggSeeker
        public final void c(long j) {
            long[] jArr = this.b.f3239a;
            this.d = jArr[Util.d(jArr, j, true)];
        }
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final long b(ParsableByteArray parsableByteArray) {
        byte[] bArr = parsableByteArray.f2922a;
        if (bArr[0] != -1) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            parsableByteArray.H(4);
            parsableByteArray.B();
        }
        int iB = FlacFrameReader.b(i, parsableByteArray);
        parsableByteArray.G(0);
        return iB;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final boolean c(ParsableByteArray parsableByteArray, long j, StreamReader.SetupData setupData) {
        byte[] bArr = parsableByteArray.f2922a;
        FlacStreamMetadata flacStreamMetadata = this.n;
        if (flacStreamMetadata == null) {
            FlacStreamMetadata flacStreamMetadata2 = new FlacStreamMetadata(bArr, 17);
            this.n = flacStreamMetadata2;
            Format.Builder builderA = flacStreamMetadata2.c(Arrays.copyOfRange(bArr, 9, parsableByteArray.c), null).a();
            builderA.l = MimeTypes.m("audio/ogg");
            setupData.f3350a = new Format(builderA);
            return true;
        }
        byte b = bArr[0];
        if ((b & 127) != 3) {
            if (b != -1) {
                return true;
            }
            FlacOggSeeker flacOggSeeker = this.o;
            if (flacOggSeeker != null) {
                flacOggSeeker.c = j;
                setupData.b = flacOggSeeker;
            }
            setupData.f3350a.getClass();
            return false;
        }
        FlacStreamMetadata.SeekTable seekTableA = FlacMetadataReader.a(parsableByteArray);
        FlacStreamMetadata flacStreamMetadata3 = new FlacStreamMetadata(flacStreamMetadata.f3238a, flacStreamMetadata.b, flacStreamMetadata.c, flacStreamMetadata.d, flacStreamMetadata.e, flacStreamMetadata.g, flacStreamMetadata.h, flacStreamMetadata.j, seekTableA, flacStreamMetadata.l);
        this.n = flacStreamMetadata3;
        FlacOggSeeker flacOggSeeker2 = new FlacOggSeeker();
        flacOggSeeker2.f3345a = flacStreamMetadata3;
        flacOggSeeker2.b = seekTableA;
        flacOggSeeker2.c = -1L;
        flacOggSeeker2.d = -1L;
        this.o = flacOggSeeker2;
        return true;
    }

    @Override // androidx.media3.extractor.ogg.StreamReader
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
