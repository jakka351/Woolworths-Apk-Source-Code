package androidx.media3.extractor.wav;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import java.math.RoundingMode;

@UnstableApi
/* loaded from: classes2.dex */
public final class WavExtractor implements Extractor {

    /* renamed from: a, reason: collision with root package name */
    public ExtractorOutput f3445a;
    public TrackOutput b;
    public OutputWriter e;
    public int c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    public static final class ImaAdPcmOutputWriter implements OutputWriter {
        public static final int[] m = {-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        public static final int[] n = {7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, 173, 190, 209, 230, 253, 279, 307, 337, 371, 408, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, 32767};

        /* renamed from: a, reason: collision with root package name */
        public final ExtractorOutput f3446a;
        public final TrackOutput b;
        public final WavFormat c;
        public final int d;
        public final byte[] e;
        public final ParsableByteArray f;
        public final int g;
        public final Format h;
        public int i;
        public long j;
        public int k;
        public long l;

        public ImaAdPcmOutputWriter(ExtractorOutput extractorOutput, TrackOutput trackOutput, WavFormat wavFormat) throws ParserException {
            this.f3446a = extractorOutput;
            this.b = trackOutput;
            this.c = wavFormat;
            int i = wavFormat.b;
            int iMax = Math.max(1, i / 10);
            this.g = iMax;
            ParsableByteArray parsableByteArray = new ParsableByteArray(wavFormat.e);
            parsableByteArray.n();
            int iN = parsableByteArray.n();
            this.d = iN;
            int i2 = wavFormat.f3448a;
            int i3 = wavFormat.c;
            int i4 = (((i3 - (i2 * 4)) * 8) / (wavFormat.d * i2)) + 1;
            if (iN != i4) {
                throw ParserException.a(null, "Expected frames per block: " + i4 + "; got: " + iN);
            }
            int iE = Util.e(iMax, iN);
            this.e = new byte[iE * i3];
            this.f = new ParsableByteArray(iN * 2 * i2 * iE);
            int i5 = ((i3 * i) * 8) / iN;
            Format.Builder builder = new Format.Builder();
            builder.m = MimeTypes.m("audio/raw");
            builder.h = i5;
            builder.i = i5;
            builder.n = iMax * 2 * i2;
            builder.C = i2;
            builder.D = i;
            builder.E = 2;
            this.h = new Format(builder);
        }

        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0045 A[ADDED_TO_REGION, EDGE_INSN: B:44:0x0045->B:14:0x0045 BREAK  A[LOOP:0: B:6:0x0023->B:13:0x003f], REMOVE, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x003c -> B:4:0x0020). Please report as a decompilation issue!!! */
        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(androidx.media3.extractor.ExtractorInput r25, long r26) {
            /*
                Method dump skipped, instructions count: 354
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.wav.WavExtractor.ImaAdPcmOutputWriter.a(androidx.media3.extractor.ExtractorInput, long):boolean");
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public final void b(int i, long j) {
            this.f3446a.q(new WavSeekMap(this.c, this.d, i, j));
            Format format = this.h;
            TrackOutput trackOutput = this.b;
            trackOutput.e(format);
            trackOutput.d();
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public final void c(long j) {
            this.i = 0;
            this.j = j;
            this.k = 0;
            this.l = 0L;
        }

        public final void d(int i) {
            long j = this.j;
            long j2 = this.l;
            WavFormat wavFormat = this.c;
            long j3 = wavFormat.b;
            int i2 = Util.f2928a;
            long jO = j + Util.O(j2, 1000000L, j3, RoundingMode.DOWN);
            int i3 = i * 2 * wavFormat.f3448a;
            this.b.g(jO, 1, i3, this.k - i3, null);
            this.l += i;
            this.k -= i3;
        }
    }

    public interface OutputWriter {
        boolean a(ExtractorInput extractorInput, long j);

        void b(int i, long j);

        void c(long j);
    }

    public static final class PassthroughOutputWriter implements OutputWriter {

        /* renamed from: a, reason: collision with root package name */
        public final ExtractorOutput f3447a;
        public final TrackOutput b;
        public final WavFormat c;
        public final Format d;
        public final int e;
        public long f;
        public int g;
        public long h;

        public PassthroughOutputWriter(ExtractorOutput extractorOutput, TrackOutput trackOutput, WavFormat wavFormat, String str, int i) throws ParserException {
            this.f3447a = extractorOutput;
            this.b = trackOutput;
            this.c = wavFormat;
            int i2 = wavFormat.f3448a;
            int i3 = wavFormat.b;
            int i4 = (wavFormat.d * i2) / 8;
            int i5 = wavFormat.c;
            if (i5 != i4) {
                throw ParserException.a(null, "Expected block size: " + i4 + "; got: " + i5);
            }
            int i6 = i3 * i4;
            int i7 = i6 * 8;
            int iMax = Math.max(i4, i6 / 10);
            this.e = iMax;
            Format.Builder builder = new Format.Builder();
            builder.l = MimeTypes.m("audio/wav");
            builder.m = MimeTypes.m(str);
            builder.h = i7;
            builder.i = i7;
            builder.n = iMax;
            builder.C = i2;
            builder.D = i3;
            builder.E = i;
            this.d = new Format(builder);
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public final boolean a(ExtractorInput extractorInput, long j) {
            int i;
            int i2;
            long j2 = j;
            while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
                int iB = this.b.b(extractorInput, (int) Math.min(i2 - i, j2), true);
                if (iB == -1) {
                    j2 = 0;
                } else {
                    this.g += iB;
                    j2 -= iB;
                }
            }
            WavFormat wavFormat = this.c;
            int i3 = wavFormat.c;
            int i4 = this.g / i3;
            if (i4 > 0) {
                long j3 = this.f;
                long j4 = this.h;
                long j5 = wavFormat.b;
                int i5 = Util.f2928a;
                long jO = j3 + Util.O(j4, 1000000L, j5, RoundingMode.DOWN);
                int i6 = i4 * i3;
                int i7 = this.g - i6;
                this.b.g(jO, 1, i6, i7, null);
                this.h += i4;
                this.g = i7;
            }
            return j2 <= 0;
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public final void b(int i, long j) {
            this.f3447a.q(new WavSeekMap(this.c, 1, i, j));
            Format format = this.d;
            TrackOutput trackOutput = this.b;
            trackOutput.e(format);
            trackOutput.d();
        }

        @Override // androidx.media3.extractor.wav.WavExtractor.OutputWriter
        public final void c(long j) {
            this.f = j;
            this.g = 0;
            this.h = 0L;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void a(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        OutputWriter outputWriter = this.e;
        if (outputWriter != null) {
            outputWriter.c(j2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x017c, code lost:
    
        if (r13 != 65534) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a5  */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(androidx.media3.extractor.ExtractorInput r26, androidx.media3.extractor.PositionHolder r27) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 543
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.wav.WavExtractor.f(androidx.media3.extractor.ExtractorInput, androidx.media3.extractor.PositionHolder):int");
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean i(ExtractorInput extractorInput) {
        return WavHeaderReader.a(extractorInput);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void j(ExtractorOutput extractorOutput) {
        this.f3445a = extractorOutput;
        this.b = extractorOutput.j(0, 1);
        extractorOutput.h();
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
