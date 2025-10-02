package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.chunk.ChunkExtractor;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.TrackOutput;

@UnstableApi
/* loaded from: classes2.dex */
public final class BundledChunkExtractor implements ExtractorOutput, ChunkExtractor {
    public SeekMap d;

    public static final class BindingTrackOutput implements TrackOutput {

        /* renamed from: a, reason: collision with root package name */
        public TrackOutput f3152a;

        @Override // androidx.media3.extractor.TrackOutput
        public final void a(ParsableByteArray parsableByteArray, int i, int i2) {
            TrackOutput trackOutput = this.f3152a;
            int i3 = Util.f2928a;
            trackOutput.c(i, parsableByteArray);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public final void e(Format format) {
            throw null;
        }

        @Override // androidx.media3.extractor.TrackOutput
        public final int f(DataReader dataReader, int i, boolean z) {
            TrackOutput trackOutput = this.f3152a;
            int i2 = Util.f2928a;
            return trackOutput.b(dataReader, i, z);
        }

        @Override // androidx.media3.extractor.TrackOutput
        public final void g(long j, int i, int i2, int i3, TrackOutput.CryptoData cryptoData) {
            if (j >= 0) {
                this.f3152a = null;
            }
            TrackOutput trackOutput = this.f3152a;
            int i4 = Util.f2928a;
            trackOutput.g(j, i, i2, i3, cryptoData);
        }
    }

    public static final class Factory implements ChunkExtractor.Factory {
    }

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
        this.d = seekMap;
    }
}
