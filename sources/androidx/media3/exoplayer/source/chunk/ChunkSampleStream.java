package androidx.media3.exoplayer.source.chunk;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.chunk.ChunkSource;
import androidx.media3.exoplayer.upstream.Loader;
import java.io.IOException;

@UnstableApi
/* loaded from: classes2.dex */
public class ChunkSampleStream<T extends ChunkSource> implements SampleStream, SequenceableLoader, Loader.Callback<Chunk>, Loader.ReleaseCallback {

    public final class EmbeddedSampleStream implements SampleStream {
        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int h(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final boolean isReady() {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final void j() {
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int q(long j) {
            throw null;
        }
    }

    public interface ReleaseCallback<T extends ChunkSource> {
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public final Loader.LoadErrorAction a(Loader.Loadable loadable, long j, long j2, IOException iOException, int i) {
        ((Chunk) loadable).getClass();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean b() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.ReleaseCallback
    public final void f() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public final void g(Loader.Loadable loadable, long j, long j2, int i) {
        Chunk chunk = (Chunk) loadable;
        if (i != 0) {
            chunk.getClass();
            throw null;
        }
        chunk.getClass();
        new LoadEventInfo(0L, (DataSpec) null);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public final int h(FormatHolder formatHolder, DecoderInputBuffer decoderInputBuffer, int i) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public final boolean isReady() {
        if (v()) {
            return false;
        }
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public final void j() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long k() {
        if (v()) {
            return 0L;
        }
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final void l(long j) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public final void m(Loader.Loadable loadable, long j, long j2, boolean z) {
        ((Chunk) loadable).getClass();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final boolean n(LoadingInfo loadingInfo) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader
    public final long o() {
        if (v()) {
            throw null;
        }
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.SampleStream
    public final int q(long j) {
        if (v()) {
            return 0;
        }
        throw null;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.Callback
    public final void t(Loader.Loadable loadable, long j, long j2) {
        throw null;
    }

    public final boolean v() {
        throw null;
    }
}
