package androidx.media3.extractor.jpeg;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import androidx.media3.extractor.mp4.Mp4Extractor;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* loaded from: classes2.dex */
final class JpegMotionPhotoExtractor implements Extractor {
    public ExtractorOutput b;
    public int c;
    public int d;
    public int e;
    public MotionPhotoMetadata g;
    public ExtractorInput h;
    public StartOffsetExtractorInput i;
    public Mp4Extractor j;

    /* renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f3277a = new ParsableByteArray(6);
    public long f = -1;

    @Override // androidx.media3.extractor.Extractor
    public final void a(long j, long j2) {
        if (j == 0) {
            this.c = 0;
            this.j = null;
        } else if (this.c == 5) {
            Mp4Extractor mp4Extractor = this.j;
            mp4Extractor.getClass();
            mp4Extractor.a(j, j2);
        }
    }

    public final void b() {
        ExtractorOutput extractorOutput = this.b;
        extractorOutput.getClass();
        extractorOutput.h();
        this.b.q(new SeekMap.Unseekable(-9223372036854775807L));
        this.c = 6;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0189  */
    @Override // androidx.media3.extractor.Extractor
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int f(androidx.media3.extractor.ExtractorInput r25, androidx.media3.extractor.PositionHolder r26) throws androidx.media3.common.ParserException {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.jpeg.JpegMotionPhotoExtractor.f(androidx.media3.extractor.ExtractorInput, androidx.media3.extractor.PositionHolder):int");
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean i(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        ParsableByteArray parsableByteArray = this.f3277a;
        parsableByteArray.D(2);
        defaultExtractorInput.h(parsableByteArray.f2922a, 0, 2, false);
        if (parsableByteArray.A() == 65496) {
            parsableByteArray.D(2);
            defaultExtractorInput.h(parsableByteArray.f2922a, 0, 2, false);
            int iA = parsableByteArray.A();
            this.d = iA;
            if (iA == 65504) {
                parsableByteArray.D(2);
                defaultExtractorInput.h(parsableByteArray.f2922a, 0, 2, false);
                defaultExtractorInput.m(parsableByteArray.A() - 2, false);
                parsableByteArray.D(2);
                defaultExtractorInput.h(parsableByteArray.f2922a, 0, 2, false);
                this.d = parsableByteArray.A();
            }
            if (this.d == 65505) {
                defaultExtractorInput.m(2, false);
                parsableByteArray.D(6);
                defaultExtractorInput.h(parsableByteArray.f2922a, 0, 6, false);
                if (parsableByteArray.w() == 1165519206 && parsableByteArray.A() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void j(ExtractorOutput extractorOutput) {
        this.b = extractorOutput;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
        Mp4Extractor mp4Extractor = this.j;
        if (mp4Extractor != null) {
            mp4Extractor.getClass();
        }
    }
}
