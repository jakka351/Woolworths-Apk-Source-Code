package androidx.media3.extractor.webp;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.DefaultExtractorInput;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SingleSampleExtractor;
import java.io.EOFException;
import java.io.InterruptedIOException;

@UnstableApi
/* loaded from: classes2.dex */
public final class WebpExtractor implements Extractor {

    /* renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f3451a = new ParsableByteArray(4);
    public final SingleSampleExtractor b = new SingleSampleExtractor(-1, -1, "image/webp");

    @Override // androidx.media3.extractor.Extractor
    public final void a(long j, long j2) {
        this.b.a(j, j2);
    }

    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) {
        return this.b.f(extractorInput, positionHolder);
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean i(ExtractorInput extractorInput) throws EOFException, InterruptedIOException {
        ParsableByteArray parsableByteArray = this.f3451a;
        parsableByteArray.D(4);
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        defaultExtractorInput.h(parsableByteArray.f2922a, 0, 4, false);
        if (parsableByteArray.w() == 1380533830) {
            defaultExtractorInput.m(4, false);
            parsableByteArray.D(4);
            defaultExtractorInput.h(parsableByteArray.f2922a, 0, 4, false);
            if (parsableByteArray.w() == 1464156752) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void j(ExtractorOutput extractorOutput) {
        this.b.j(extractorOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
