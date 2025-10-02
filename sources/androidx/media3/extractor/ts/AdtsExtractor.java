package androidx.media3.extractor.ts;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.ts.TsPayloadReader;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
/* loaded from: classes2.dex */
public final class AdtsExtractor implements Extractor {
    public final ParsableByteArray c;
    public final ParsableBitArray d;
    public ExtractorOutput e;
    public long f;
    public boolean h;
    public boolean i;

    /* renamed from: a, reason: collision with root package name */
    public final AdtsReader f3407a = new AdtsReader(true, null, 0, "audio/mp4a-latm");
    public final ParsableByteArray b = new ParsableByteArray(2048);
    public long g = -1;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public AdtsExtractor() {
        ParsableByteArray parsableByteArray = new ParsableByteArray(10);
        this.c = parsableByteArray;
        byte[] bArr = parsableByteArray.f2922a;
        this.d = new ParsableBitArray(bArr, bArr.length);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void a(long j, long j2) {
        this.h = false;
        this.f3407a.b();
        this.f = j2;
    }

    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) throws ParserException {
        Assertions.g(this.e);
        extractorInput.getLength();
        ParsableByteArray parsableByteArray = this.b;
        int i = extractorInput.read(parsableByteArray.f2922a, 0, 2048);
        boolean z = i == -1;
        if (!this.i) {
            this.e.q(new SeekMap.Unseekable(-9223372036854775807L));
            this.i = true;
        }
        if (z) {
            return -1;
        }
        parsableByteArray.G(0);
        parsableByteArray.F(i);
        boolean z2 = this.h;
        AdtsReader adtsReader = this.f3407a;
        if (!z2) {
            adtsReader.u = this.f;
            this.h = true;
        }
        adtsReader.a(parsableByteArray);
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean i(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
        int i = 0;
        while (true) {
            ParsableByteArray parsableByteArray = this.c;
            extractorInput.b(0, 10, parsableByteArray.f2922a);
            parsableByteArray.G(0);
            if (parsableByteArray.x() != 4801587) {
                break;
            }
            parsableByteArray.H(3);
            int iT = parsableByteArray.t();
            i += iT + 10;
            extractorInput.k(iT);
        }
        extractorInput.i();
        extractorInput.k(i);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            ParsableByteArray parsableByteArray2 = this.c;
            DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
            defaultExtractorInput.h(parsableByteArray2.f2922a, 0, 2, false);
            parsableByteArray2.G(0);
            if ((parsableByteArray2.A() & 65526) == 65520) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                defaultExtractorInput.h(parsableByteArray2.f2922a, 0, 4, false);
                ParsableBitArray parsableBitArray = this.d;
                parsableBitArray.m(14);
                int iG = parsableBitArray.g(13);
                if (iG <= 6) {
                    i2++;
                    defaultExtractorInput.f = 0;
                    defaultExtractorInput.m(i2, false);
                } else {
                    defaultExtractorInput.m(iG - 6, false);
                    i4 += iG;
                }
            } else {
                i2++;
                defaultExtractorInput.f = 0;
                defaultExtractorInput.m(i2, false);
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void j(ExtractorOutput extractorOutput) {
        this.e = extractorOutput;
        this.f3407a.c(extractorOutput, new TsPayloadReader.TrackIdGenerator(0, 1));
        extractorOutput.h();
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
