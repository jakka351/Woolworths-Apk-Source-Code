package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import android.util.Pair;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.AbstractConcatenatedTimeline;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;

@UnstableApi
@Deprecated
/* loaded from: classes2.dex */
public final class ConcatenatingMediaSource extends CompositeMediaSource<MediaSourceHolder> {
    public static final MediaItem q;
    public Handler n;
    public boolean o;
    public ShuffleOrder p;

    public static final class ConcatenatedTimeline extends AbstractConcatenatedTimeline {
        @Override // androidx.media3.common.Timeline
        public final int h() {
            return 0;
        }

        @Override // androidx.media3.common.Timeline
        public final int o() {
            return 0;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public final int q(Object obj) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public final int r(int i) {
            return Util.c(null, i + 1, false, false);
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public final int s(int i) {
            return Util.c(null, i + 1, false, false);
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public final Object t(int i) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public final int u(int i) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public final int v(int i) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public final Timeline x(int i) {
            throw null;
        }
    }

    public static final class FakeMediaSource extends BaseMediaSource {
        @Override // androidx.media3.exoplayer.source.MediaSource
        public final MediaPeriod E(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
            throw new UnsupportedOperationException();
        }

        @Override // androidx.media3.exoplayer.source.BaseMediaSource
        public final void U(TransferListener transferListener) {
        }

        @Override // androidx.media3.exoplayer.source.BaseMediaSource
        public final void X() {
        }

        @Override // androidx.media3.exoplayer.source.MediaSource
        public final MediaItem o() {
            return ConcatenatingMediaSource.q;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource
        public final void t(MediaPeriod mediaPeriod) {
        }

        @Override // androidx.media3.exoplayer.source.MediaSource
        public final void z() {
        }
    }

    public static final class HandlerAndRunnable {
    }

    public static final class MediaSourceHolder {
    }

    public static final class MessageData<T> {
    }

    static {
        MediaItem.Builder builder = new MediaItem.Builder();
        builder.b = Uri.EMPTY;
        q = builder.a();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final synchronized Timeline B() {
        this.p.getLength();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final MediaPeriod E(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        Object obj = mediaPeriodId.f3130a;
        int i = AbstractConcatenatedTimeline.d;
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        mediaPeriodId.a(pair.second);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void P() {
        super.P();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void S() {
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final synchronized void U(TransferListener transferListener) {
        super.U(transferListener);
        this.n = new Handler(new b(this, 0));
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final synchronized void X() {
        super.X();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final MediaSource.MediaPeriodId Y(Object obj, MediaSource.MediaPeriodId mediaPeriodId) {
        ((MediaSourceHolder) obj).getClass();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final int c0(int i, Object obj) {
        ((MediaSourceHolder) obj).getClass();
        return i;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final void f0(Object obj, BaseMediaSource baseMediaSource, Timeline timeline) {
        ((MediaSourceHolder) obj).getClass();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final MediaItem o() {
        return q;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void t(MediaPeriod mediaPeriod) {
        throw null;
    }
}
