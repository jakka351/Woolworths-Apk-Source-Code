package androidx.media3.extractor;

import androidx.media3.common.DataReader;
import androidx.media3.common.Format;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.TrackOutput;

@UnstableApi
@Deprecated
/* loaded from: classes2.dex */
public final class DummyTrackOutput implements TrackOutput {
    @Override // androidx.media3.extractor.TrackOutput
    public final void a(ParsableByteArray parsableByteArray, int i, int i2) {
        throw null;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final int b(DataReader dataReader, int i, boolean z) {
        throw null;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void c(int i, ParsableByteArray parsableByteArray) {
        throw null;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void e(Format format) {
        throw null;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final int f(DataReader dataReader, int i, boolean z) {
        throw null;
    }

    @Override // androidx.media3.extractor.TrackOutput
    public final void g(long j, int i, int i2, int i3, TrackOutput.CryptoData cryptoData) {
        throw null;
    }
}
