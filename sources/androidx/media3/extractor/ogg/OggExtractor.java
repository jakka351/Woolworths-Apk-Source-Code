package androidx.media3.extractor.ogg;

import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.VorbisUtil;

@UnstableApi
/* loaded from: classes2.dex */
public class OggExtractor implements Extractor {

    /* renamed from: a, reason: collision with root package name */
    public ExtractorOutput f3346a;
    public StreamReader b;
    public boolean c;

    @Override // androidx.media3.extractor.Extractor
    public final void a(long j, long j2) {
        StreamReader streamReader = this.b;
        if (streamReader != null) {
            OggPacket oggPacket = streamReader.f3349a;
            OggPageHeader oggPageHeader = oggPacket.f3347a;
            oggPageHeader.f3348a = 0;
            oggPageHeader.b = 0L;
            oggPageHeader.c = 0;
            oggPageHeader.d = 0;
            oggPageHeader.e = 0;
            oggPacket.b.D(0);
            oggPacket.c = -1;
            oggPacket.e = false;
            if (j == 0) {
                streamReader.d(!streamReader.l);
                return;
            }
            if (streamReader.h != 0) {
                long j3 = (streamReader.i * j2) / 1000000;
                streamReader.e = j3;
                OggSeeker oggSeeker = streamReader.d;
                int i = Util.f2928a;
                oggSeeker.c(j3);
                streamReader.h = 2;
            }
        }
    }

    public final boolean b(ExtractorInput extractorInput) {
        boolean zC;
        OggPageHeader oggPageHeader = new OggPageHeader();
        if (oggPageHeader.a(extractorInput, true) && (oggPageHeader.f3348a & 2) == 2) {
            int iMin = Math.min(oggPageHeader.e, 8);
            ParsableByteArray parsableByteArray = new ParsableByteArray(iMin);
            extractorInput.b(0, iMin, parsableByteArray.f2922a);
            parsableByteArray.G(0);
            if (parsableByteArray.a() >= 5 && parsableByteArray.u() == 127 && parsableByteArray.w() == 1179402563) {
                this.b = new FlacReader();
                return true;
            }
            parsableByteArray.G(0);
            try {
                zC = VorbisUtil.c(1, parsableByteArray, true);
            } catch (ParserException unused) {
                zC = false;
            }
            if (zC) {
                this.b = new VorbisReader();
            } else {
                parsableByteArray.G(0);
                if (OpusReader.e(parsableByteArray, OpusReader.o)) {
                    this.b = new OpusReader();
                }
            }
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x016f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0170  */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(androidx.media3.extractor.ExtractorInput r21, androidx.media3.extractor.PositionHolder r22) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.ogg.OggExtractor.f(androidx.media3.extractor.ExtractorInput, androidx.media3.extractor.PositionHolder):int");
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean i(ExtractorInput extractorInput) {
        try {
            return b(extractorInput);
        } catch (ParserException unused) {
            return false;
        }
    }

    @Override // androidx.media3.extractor.Extractor
    public final void j(ExtractorOutput extractorOutput) {
        this.f3346a = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
