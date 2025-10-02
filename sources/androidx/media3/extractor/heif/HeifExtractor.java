package androidx.media3.extractor.heif;

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
public final class HeifExtractor implements Extractor {

    /* renamed from: a, reason: collision with root package name */
    public final ParsableByteArray f3275a = new ParsableByteArray(4);
    public final SingleSampleExtractor b = new SingleSampleExtractor(-1, -1, "image/heif");

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
        DefaultExtractorInput defaultExtractorInput = (DefaultExtractorInput) extractorInput;
        defaultExtractorInput.m(4, false);
        ParsableByteArray parsableByteArray = this.f3275a;
        parsableByteArray.D(4);
        defaultExtractorInput.h(parsableByteArray.f2922a, 0, 4, false);
        if (parsableByteArray.w() == 1718909296) {
            parsableByteArray.D(4);
            defaultExtractorInput.h(parsableByteArray.f2922a, 0, 4, false);
            if (parsableByteArray.w() == 1751476579) {
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
