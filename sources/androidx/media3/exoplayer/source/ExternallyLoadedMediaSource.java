package androidx.media3.exoplayer.source;

import androidx.media3.common.MediaItem;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;

@UnstableApi
/* loaded from: classes2.dex */
public final class ExternallyLoadedMediaSource extends BaseMediaSource {
    public MediaItem k;

    public static final class Factory implements MediaSource.Factory {
        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final MediaSource b(MediaItem mediaItem) {
            throw null;
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final MediaPeriod E(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        MediaItem mediaItemO = o();
        mediaItemO.b.getClass();
        MediaItem.LocalConfiguration localConfiguration = mediaItemO.b;
        if (localConfiguration.b != null) {
            return new ExternallyLoadedMediaPeriod(localConfiguration.f2863a, localConfiguration.b);
        }
        throw new NullPointerException("Externally loaded mediaItems require a MIME type.");
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final synchronized void L(MediaItem mediaItem) {
        this.k = mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void U(TransferListener transferListener) {
        W(new SinglePeriodTimeline(0L, true, false, o()));
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void X() {
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final synchronized MediaItem o() {
        return this.k;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void t(MediaPeriod mediaPeriod) {
        ((ExternallyLoadedMediaPeriod) mediaPeriod).getClass();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void z() {
    }
}
