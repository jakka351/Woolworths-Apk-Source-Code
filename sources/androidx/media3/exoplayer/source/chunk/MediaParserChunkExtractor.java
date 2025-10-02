package androidx.media3.exoplayer.source.chunk;

import androidx.annotation.RequiresApi;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.chunk.ChunkExtractor;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;

@RequiresApi
@UnstableApi
/* loaded from: classes2.dex */
public final class MediaParserChunkExtractor implements ChunkExtractor {

    public static class Factory implements ChunkExtractor.Factory {
    }

    public class TrackOutputProviderAdapter implements ExtractorOutput {
        @Override // androidx.media3.extractor.ExtractorOutput
        public final void h() {
            throw null;
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public final TrackOutput j(int i, int i2) {
            throw null;
        }

        @Override // androidx.media3.extractor.ExtractorOutput
        public final void q(SeekMap seekMap) {
        }
    }
}
