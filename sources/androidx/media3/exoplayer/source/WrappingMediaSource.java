package androidx.media3.exoplayer.source;

import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class WrappingMediaSource extends CompositeMediaSource<Void> {
    public final MediaSource n;

    public WrappingMediaSource(MediaSource mediaSource) {
        this.n = mediaSource;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public Timeline B() {
        return this.n.B();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod E(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        return this.n.E(mediaPeriodId, allocator, j);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void L(MediaItem mediaItem) {
        this.n.L(mediaItem);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean O() {
        return this.n.O();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void U(TransferListener transferListener) {
        super.U(transferListener);
        n0();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final MediaSource.MediaPeriodId Y(Object obj, MediaSource.MediaPeriodId mediaPeriodId) {
        return i0(mediaPeriodId);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final long Z(Object obj, long j, MediaSource.MediaPeriodId mediaPeriodId) {
        return j;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final int c0(int i, Object obj) {
        return i;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final void f0(Object obj, BaseMediaSource baseMediaSource, Timeline timeline) {
        T(timeline);
    }

    public MediaSource.MediaPeriodId i0(MediaSource.MediaPeriodId mediaPeriodId) {
        return mediaPeriodId;
    }

    public final void m0() {
        g0(null, this.n);
    }

    public void n0() {
        m0();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final MediaItem o() {
        return this.n.o();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void t(MediaPeriod mediaPeriod) {
        this.n.t(mediaPeriod);
    }
}
