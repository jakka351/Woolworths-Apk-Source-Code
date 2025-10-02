package androidx.media3.extractor.jpeg;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.ForwardingSeekMap;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import androidx.media3.extractor.TrackOutput;

@UnstableApi
/* loaded from: classes2.dex */
public final class StartOffsetExtractorOutput implements ExtractorOutput {
    public final long d;
    public final ExtractorOutput e;

    public StartOffsetExtractorOutput(long j, ExtractorOutput extractorOutput) {
        this.d = j;
        this.e = extractorOutput;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final void h() {
        this.e.h();
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final TrackOutput j(int i, int i2) {
        return this.e.j(i, i2);
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final void q(final SeekMap seekMap) {
        this.e.q(new ForwardingSeekMap(seekMap) { // from class: androidx.media3.extractor.jpeg.StartOffsetExtractorOutput.1
            @Override // androidx.media3.extractor.ForwardingSeekMap, androidx.media3.extractor.SeekMap
            public final SeekMap.SeekPoints b(long j) {
                SeekMap.SeekPoints seekPointsB = seekMap.b(j);
                SeekPoint seekPoint = seekPointsB.f3249a;
                long j2 = seekPoint.f3251a;
                long j3 = seekPoint.b;
                long j4 = StartOffsetExtractorOutput.this.d;
                SeekPoint seekPoint2 = new SeekPoint(j2, j3 + j4);
                SeekPoint seekPoint3 = seekPointsB.b;
                return new SeekMap.SeekPoints(seekPoint2, new SeekPoint(seekPoint3.f3251a, seekPoint3.b + j4));
            }
        });
    }
}
