package androidx.media3.extractor.ts;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.ts.TsPayloadReader;
import java.io.EOFException;
import java.io.InterruptedIOException;

@UnstableApi
/* loaded from: classes2.dex */
public final class Ac3Extractor implements Extractor {

    /* renamed from: a, reason: collision with root package name */
    public final Ac3Reader f3403a = new Ac3Reader("audio/ac3");
    public final ParsableByteArray b = new ParsableByteArray(2786);
    public boolean c;

    @Override // androidx.media3.extractor.Extractor
    public final void a(long j, long j2) {
        this.c = false;
        this.f3403a.b();
    }

    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) {
        ParsableByteArray parsableByteArray = this.b;
        int i = extractorInput.read(parsableByteArray.f2922a, 0, 2786);
        if (i == -1) {
            return -1;
        }
        parsableByteArray.G(0);
        parsableByteArray.F(i);
        boolean z = this.c;
        Ac3Reader ac3Reader = this.f3403a;
        if (!z) {
            ac3Reader.n = 0L;
            this.c = true;
        }
        ac3Reader.a(parsableByteArray);
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean i(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
        DefaultExtractorInput defaultExtractorInput;
        int iA;
        ParsableByteArray parsableByteArray = new ParsableByteArray(10);
        int i = 0;
        while (true) {
            defaultExtractorInput = (DefaultExtractorInput) extractorInput;
            defaultExtractorInput.h(parsableByteArray.f2922a, 0, 10, false);
            parsableByteArray.G(0);
            if (parsableByteArray.x() != 4801587) {
                break;
            }
            parsableByteArray.H(3);
            int iT = parsableByteArray.t();
            i += iT + 10;
            defaultExtractorInput.m(iT, false);
        }
        defaultExtractorInput.f = 0;
        defaultExtractorInput.m(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            defaultExtractorInput.h(parsableByteArray.f2922a, 0, 6, false);
            parsableByteArray.G(0);
            if (parsableByteArray.A() != 2935) {
                defaultExtractorInput.f = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                defaultExtractorInput.m(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = parsableByteArray.f2922a;
                if (bArr.length < 6) {
                    iA = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    iA = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    iA = Ac3Util.a((b & 192) >> 6, b & 63);
                }
                if (iA == -1) {
                    break;
                }
                defaultExtractorInput.m(iA - 6, false);
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void j(ExtractorOutput extractorOutput) {
        this.f3403a.c(extractorOutput, new TsPayloadReader.TrackIdGenerator(0, 1));
        extractorOutput.h();
        extractorOutput.q(new SeekMap.Unseekable(-9223372036854775807L));
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
