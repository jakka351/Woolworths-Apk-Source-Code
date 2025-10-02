package androidx.media3.extractor.jpeg;

import androidx.media3.common.util.Assertions;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ForwardingExtractorInput;

/* loaded from: classes2.dex */
final class StartOffsetExtractorInput extends ForwardingExtractorInput {
    public final long b;

    public StartOffsetExtractorInput(ExtractorInput extractorInput, long j) {
        super(extractorInput);
        Assertions.b(extractorInput.getPosition() >= j);
        this.b = j;
    }

    @Override // androidx.media3.extractor.ForwardingExtractorInput, androidx.media3.extractor.ExtractorInput
    public final long getLength() {
        return super.getLength() - this.b;
    }

    @Override // androidx.media3.extractor.ForwardingExtractorInput, androidx.media3.extractor.ExtractorInput
    public final long getPosition() {
        return super.getPosition() - this.b;
    }

    @Override // androidx.media3.extractor.ForwardingExtractorInput, androidx.media3.extractor.ExtractorInput
    public final long j() {
        return super.j() - this.b;
    }
}
