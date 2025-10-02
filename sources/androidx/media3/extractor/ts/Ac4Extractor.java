package androidx.media3.extractor.ts;

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

@UnstableApi
/* loaded from: classes2.dex */
public final class Ac4Extractor implements Extractor {

    /* renamed from: a, reason: collision with root package name */
    public final Ac4Reader f3405a = new Ac4Reader(null, 0, "audio/ac4");
    public final ParsableByteArray b = new ParsableByteArray(16384);
    public boolean c;

    @Override // androidx.media3.extractor.Extractor
    public final void a(long j, long j2) {
        this.c = false;
        this.f3405a.b();
    }

    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) {
        ParsableByteArray parsableByteArray = this.b;
        int i = extractorInput.read(parsableByteArray.f2922a, 0, 16384);
        if (i == -1) {
            return -1;
        }
        parsableByteArray.G(0);
        parsableByteArray.F(i);
        boolean z = this.c;
        Ac4Reader ac4Reader = this.f3405a;
        if (!z) {
            ac4Reader.n = 0L;
            this.c = true;
        }
        ac4Reader.a(parsableByteArray);
        return 0;
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean i(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
        DefaultExtractorInput defaultExtractorInput;
        int i;
        ParsableByteArray parsableByteArray = new ParsableByteArray(10);
        int i2 = 0;
        while (true) {
            defaultExtractorInput = (DefaultExtractorInput) extractorInput;
            defaultExtractorInput.h(parsableByteArray.f2922a, 0, 10, false);
            parsableByteArray.G(0);
            if (parsableByteArray.x() != 4801587) {
                break;
            }
            parsableByteArray.H(3);
            int iT = parsableByteArray.t();
            i2 += iT + 10;
            defaultExtractorInput.m(iT, false);
        }
        defaultExtractorInput.f = 0;
        defaultExtractorInput.m(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            defaultExtractorInput.h(parsableByteArray.f2922a, 0, 7, false);
            parsableByteArray.G(0);
            int iA = parsableByteArray.A();
            if (iA == 44096 || iA == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = parsableByteArray.f2922a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iA == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                defaultExtractorInput.m(i - 7, false);
            } else {
                defaultExtractorInput.f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                defaultExtractorInput.m(i4, false);
                i3 = 0;
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void j(ExtractorOutput extractorOutput) {
        this.f3405a.c(extractorOutput, new TsPayloadReader.TrackIdGenerator(0, 1));
        extractorOutput.h();
        extractorOutput.q(new SeekMap.Unseekable(-9223372036854775807L));
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
