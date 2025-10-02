package androidx.media3.extractor.text;

import android.util.SparseArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;

@UnstableApi
@Deprecated
/* loaded from: classes2.dex */
public class SubtitleTranscodingExtractor implements Extractor {

    /* renamed from: a, reason: collision with root package name */
    public SubtitleTranscodingExtractorOutput f3357a;

    @Override // androidx.media3.extractor.Extractor
    public final void a(long j, long j2) {
        SubtitleTranscodingExtractorOutput subtitleTranscodingExtractorOutput = this.f3357a;
        if (subtitleTranscodingExtractorOutput != null) {
            SparseArray sparseArray = subtitleTranscodingExtractorOutput.f;
            for (int i = 0; i < sparseArray.size(); i++) {
                SubtitleParser subtitleParser = ((SubtitleTranscodingTrackOutput) sparseArray.valueAt(i)).g;
                if (subtitleParser != null) {
                    subtitleParser.reset();
                }
            }
        }
        throw null;
    }

    @Override // androidx.media3.extractor.Extractor
    public final Extractor c() {
        return null;
    }

    @Override // androidx.media3.extractor.Extractor
    public final int f(ExtractorInput extractorInput, PositionHolder positionHolder) {
        throw null;
    }

    @Override // androidx.media3.extractor.Extractor
    public final boolean i(ExtractorInput extractorInput) {
        throw null;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void j(ExtractorOutput extractorOutput) {
        this.f3357a = new SubtitleTranscodingExtractorOutput(extractorOutput, null);
        throw null;
    }

    @Override // androidx.media3.extractor.Extractor
    public final void release() {
        throw null;
    }
}
