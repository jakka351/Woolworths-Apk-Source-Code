package androidx.media3.exoplayer.source;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;

@UnstableApi
/* loaded from: classes2.dex */
public final class EmptySampleStream implements SampleStream {
    @Override // androidx.media3.exoplayer.source.SampleStream
    public final int h(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
        decoderInputBuffer.d = 4;
        return -4;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public final boolean isReady() {
        return true;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public final void j() {
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public final int q(long j) {
        return 0;
    }
}
