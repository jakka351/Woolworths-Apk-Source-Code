package androidx.media3.extractor;

import androidx.media3.common.util.UnstableApi;

@UnstableApi
@Deprecated
/* loaded from: classes2.dex */
public final class DummyExtractorOutput implements ExtractorOutput {
    @Override // androidx.media3.extractor.ExtractorOutput
    public final void h() {
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final TrackOutput j(int i, int i2) {
        return new DiscardingTrackOutput();
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final void q(SeekMap seekMap) {
    }
}
