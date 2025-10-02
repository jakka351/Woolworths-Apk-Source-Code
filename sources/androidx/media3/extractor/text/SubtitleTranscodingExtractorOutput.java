package androidx.media3.extractor.text;

import android.util.SparseArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.text.SubtitleParser;

@UnstableApi
/* loaded from: classes2.dex */
public final class SubtitleTranscodingExtractorOutput implements ExtractorOutput {
    public final ExtractorOutput d;
    public final SubtitleParser.Factory e;
    public final SparseArray f = new SparseArray();
    public boolean g;

    public SubtitleTranscodingExtractorOutput(ExtractorOutput extractorOutput, SubtitleParser.Factory factory) {
        this.d = extractorOutput;
        this.e = factory;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final void h() {
        this.d.h();
        if (!this.g) {
            return;
        }
        int i = 0;
        while (true) {
            SparseArray sparseArray = this.f;
            if (i >= sparseArray.size()) {
                return;
            }
            ((SubtitleTranscodingTrackOutput) sparseArray.valueAt(i)).i = true;
            i++;
        }
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final TrackOutput j(int i, int i2) {
        ExtractorOutput extractorOutput = this.d;
        if (i2 != 3) {
            this.g = true;
            return extractorOutput.j(i, i2);
        }
        SparseArray sparseArray = this.f;
        SubtitleTranscodingTrackOutput subtitleTranscodingTrackOutput = (SubtitleTranscodingTrackOutput) sparseArray.get(i);
        if (subtitleTranscodingTrackOutput != null) {
            return subtitleTranscodingTrackOutput;
        }
        SubtitleTranscodingTrackOutput subtitleTranscodingTrackOutput2 = new SubtitleTranscodingTrackOutput(extractorOutput.j(i, i2), this.e);
        sparseArray.put(i, subtitleTranscodingTrackOutput2);
        return subtitleTranscodingTrackOutput2;
    }

    @Override // androidx.media3.extractor.ExtractorOutput
    public final void q(SeekMap seekMap) {
        this.d.q(seekMap);
    }
}
