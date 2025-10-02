package androidx.media3.extractor.flv;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.DiscardingTrackOutput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import java.io.EOFException;
import java.io.InterruptedIOException;

@UnstableApi
/* loaded from: classes2.dex */
public final class FlvExtractor implements Extractor {

    /* renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f3273a = new ParsableByteArray(4);
    public final ParsableByteArray b = new ParsableByteArray(9);
    public final ParsableByteArray c = new ParsableByteArray(11);
    public final ParsableByteArray d = new ParsableByteArray();
    public final ScriptTagPayloadReader e;
    public ExtractorOutput f;
    public int g;
    public boolean h;
    public long i;
    public int j;
    public int k;
    public int l;
    public long m;
    public boolean n;
    public AudioTagPayloadReader o;
    public VideoTagPayloadReader p;

    public FlvExtractor() {
        ScriptTagPayloadReader scriptTagPayloadReader = new ScriptTagPayloadReader(new DiscardingTrackOutput());
        scriptTagPayloadReader.b = -9223372036854775807L;
        scriptTagPayloadReader.c = new long[0];
        scriptTagPayloadReader.d = new long[0];
        this.e = scriptTagPayloadReader;
        this.g = 1;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void a(long j, long j2) {
        if (j == 0) {
            this.g = 1;
            this.h = false;
        } else {
            this.g = 3;
        }
        this.j = 0;
    }

    public final ParsableByteArray b(ExtractorInput extractorInput) {
        int i = this.l;
        ParsableByteArray parsableByteArray = this.d;
        byte[] bArr = parsableByteArray.f2922a;
        if (i > bArr.length) {
            parsableByteArray.E(0, new byte[Math.max(bArr.length * 2, i)]);
        } else {
            parsableByteArray.G(0);
        }
        parsableByteArray.F(this.l);
        extractorInput.readFully(parsableByteArray.f2922a, 0, this.l);
        return parsableByteArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03bb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0181  */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(androidx.media3.extractor.ExtractorInput r29, androidx.media3.extractor.PositionHolder r30) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 1127
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.flv.FlvExtractor.f(androidx.media3.extractor.ExtractorInput, androidx.media3.extractor.PositionHolder):int");
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean i(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
        ParsableByteArray parsableByteArray = this.f3273a;
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        defaultExtractorInput.h(parsableByteArray.f2922a, 0, 3, false);
        parsableByteArray.G(0);
        if (parsableByteArray.x() == 4607062) {
            defaultExtractorInput.h(parsableByteArray.f2922a, 0, 2, false);
            parsableByteArray.G(0);
            if ((parsableByteArray.A() & 250) == 0) {
                defaultExtractorInput.h(parsableByteArray.f2922a, 0, 4, false);
                parsableByteArray.G(0);
                int iG = parsableByteArray.g();
                defaultExtractorInput.f = 0;
                defaultExtractorInput.m(iG, false);
                defaultExtractorInput.h(parsableByteArray.f2922a, 0, 4, false);
                parsableByteArray.G(0);
                if (parsableByteArray.g() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void j(ExtractorOutput extractorOutput) {
        this.f = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
