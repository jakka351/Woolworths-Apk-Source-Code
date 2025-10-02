package androidx.media3.extractor.png;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SingleSampleExtractor;

@UnstableApi
/* loaded from: classes2.dex */
public final class PngExtractor implements Extractor {

    /* renamed from: a, reason: collision with root package name */
    public final SingleSampleExtractor f3352a = new SingleSampleExtractor(35152, 2, "image/png");

    @Override // androidx.media3.extractor.Extractor
    public final void a(long j, long j2) {
        this.f3352a.a(j, j2);
    }

    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) {
        return this.f3352a.f(extractorInput, positionHolder);
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean i(ExtractorInput extractorInput) {
        return this.f3352a.i(extractorInput);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void j(ExtractorOutput extractorOutput) {
        this.f3352a.j(extractorOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
    }
}
