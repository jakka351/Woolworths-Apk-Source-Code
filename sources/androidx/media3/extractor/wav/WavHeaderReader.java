package androidx.media3.extractor.wav;

import androidx.compose.ui.input.pointer.a;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.ExtractorInput;

/* loaded from: classes2.dex */
final class WavHeaderReader {

    public static final class ChunkHeader {

        /* renamed from: a, reason: collision with root package name */
        public final int f3449a;
        public final long b;

        public ChunkHeader(int i, long j) {
            this.f3449a = i;
            this.b = j;
        }

        public static ChunkHeader a(ExtractorInput extractorInput, ParsableByteArray parsableByteArray) {
            extractorInput.b(0, 8, parsableByteArray.f2922a);
            parsableByteArray.G(0);
            return new ChunkHeader(parsableByteArray.g(), parsableByteArray.l());
        }
    }

    public static boolean a(ExtractorInput extractorInput) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        int i = ChunkHeader.a(extractorInput, parsableByteArray).f3449a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        extractorInput.b(0, 4, parsableByteArray.f2922a);
        parsableByteArray.G(0);
        int iG = parsableByteArray.g();
        if (iG == 1463899717) {
            return true;
        }
        Log.c("WavHeaderReader", "Unsupported form type: " + iG);
        return false;
    }

    public static ChunkHeader b(int i, ExtractorInput extractorInput, ParsableByteArray parsableByteArray) throws ParserException {
        ChunkHeader chunkHeaderA = ChunkHeader.a(extractorInput, parsableByteArray);
        while (true) {
            int i2 = chunkHeaderA.f3449a;
            if (i2 == i) {
                return chunkHeaderA;
            }
            a.t(i2, "Ignoring unknown WAV chunk: ", "WavHeaderReader");
            long j = chunkHeaderA.b;
            long j2 = 8 + j;
            if (j % 2 != 0) {
                j2 = 9 + j;
            }
            if (j2 > 2147483647L) {
                throw ParserException.b("Chunk is too large (~2GB+) to skip; id: " + i2);
            }
            extractorInput.l((int) j2);
            chunkHeaderA = ChunkHeader.a(extractorInput, parsableByteArray);
        }
    }
}
