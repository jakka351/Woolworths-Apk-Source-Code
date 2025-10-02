package androidx.media3.extractor.flac;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.BinarySearchSeeker;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.FlacFrameReader;
import androidx.media3.extractor.FlacStreamMetadata;

/* loaded from: classes2.dex */
final class FlacBinarySearchSeeker extends BinarySearchSeeker {

    public static final class FlacTimestampSeeker implements BinarySearchSeeker.TimestampSeeker {

        /* renamed from: a, reason: collision with root package name */
        public final FlacStreamMetadata f3271a;
        public final int b;
        public final FlacFrameReader.SampleNumberHolder c = new FlacFrameReader.SampleNumberHolder();

        public FlacTimestampSeeker(FlacStreamMetadata flacStreamMetadata, int i) {
            this.f3271a = flacStreamMetadata;
            this.b = i;
        }

        @Override // androidx.media3.extractor.BinarySearchSeeker.TimestampSeeker
        public final BinarySearchSeeker.TimestampSearchResult a(ExtractorInput extractorInput, long j) {
            long position = extractorInput.getPosition();
            long jC = c(extractorInput);
            long j2 = extractorInput.j();
            extractorInput.k(Math.max(6, this.f3271a.c));
            long jC2 = c(extractorInput);
            return (jC > j || jC2 <= j) ? jC2 <= j ? new BinarySearchSeeker.TimestampSearchResult(-2, jC2, extractorInput.j()) : new BinarySearchSeeker.TimestampSearchResult(-1, jC, position) : new BinarySearchSeeker.TimestampSearchResult(0, -9223372036854775807L, j2);
        }

        public final long c(ExtractorInput extractorInput) {
            FlacFrameReader.SampleNumberHolder sampleNumberHolder;
            FlacStreamMetadata flacStreamMetadata;
            int iC;
            while (true) {
                long j = extractorInput.j();
                long length = extractorInput.getLength() - 6;
                sampleNumberHolder = this.c;
                flacStreamMetadata = this.f3271a;
                if (j >= length) {
                    break;
                }
                long j2 = extractorInput.j();
                byte[] bArr = new byte[2];
                int i = 0;
                boolean zA = false;
                extractorInput.b(0, 2, bArr);
                int i2 = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
                int i3 = this.b;
                if (i2 != i3) {
                    extractorInput.i();
                    extractorInput.k((int) (j2 - extractorInput.getPosition()));
                } else {
                    ParsableByteArray parsableByteArray = new ParsableByteArray(16);
                    System.arraycopy(bArr, 0, parsableByteArray.f2922a, 0, 2);
                    byte[] bArr2 = parsableByteArray.f2922a;
                    while (i < 14 && (iC = extractorInput.c(2 + i, 14 - i, bArr2)) != -1) {
                        i += iC;
                    }
                    parsableByteArray.F(i);
                    extractorInput.i();
                    extractorInput.k((int) (j2 - extractorInput.getPosition()));
                    zA = FlacFrameReader.a(parsableByteArray, flacStreamMetadata, i3, sampleNumberHolder);
                }
                if (zA) {
                    break;
                }
                extractorInput.k(1);
            }
            if (extractorInput.j() < extractorInput.getLength() - 6) {
                return sampleNumberHolder.f3235a;
            }
            extractorInput.k((int) (extractorInput.getLength() - extractorInput.j()));
            return flacStreamMetadata.j;
        }
    }
}
