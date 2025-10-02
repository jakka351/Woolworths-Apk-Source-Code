package androidx.media3.exoplayer.source;

import android.net.Uri;
import androidx.media3.common.MediaItem;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSource;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.upstream.Allocator;
import androidx.media3.exoplayer.upstream.DefaultLoadErrorHandlingPolicy;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;

@UnstableApi
@Deprecated
/* loaded from: classes2.dex */
public final class SingleSampleMediaSource extends BaseMediaSource {
    public final DataSource.Factory k;
    public final LoadErrorHandlingPolicy m;
    public TransferListener o;
    public final long l = -9223372036854775807L;
    public final boolean n = true;

    public static final class Factory {

        /* renamed from: a, reason: collision with root package name */
        public final DataSource.Factory f3146a;
        public final LoadErrorHandlingPolicy b;

        public Factory(DefaultDataSource.Factory factory) {
            factory.getClass();
            this.f3146a = factory;
            this.b = new DefaultLoadErrorHandlingPolicy();
        }
    }

    public SingleSampleMediaSource(MediaItem.SubtitleConfiguration subtitleConfiguration, DataSource.Factory factory, LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        this.k = factory;
        this.m = loadErrorHandlingPolicy;
        new MediaItem.Builder().b = Uri.EMPTY;
        subtitleConfiguration.getClass();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final MediaPeriod E(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        return new SingleSampleMediaPeriod(null, this.k, this.o, null, this.l, this.m, new MediaSourceEventListener.EventDispatcher(this.f.c, 0, mediaPeriodId), this.n, null);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void U(TransferListener transferListener) {
        this.o = transferListener;
        W(null);
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void X() {
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final MediaItem o() {
        return null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void t(MediaPeriod mediaPeriod) {
        ((SingleSampleMediaPeriod) mediaPeriod).l.d(null);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void z() {
    }
}
