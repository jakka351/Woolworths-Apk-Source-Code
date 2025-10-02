package androidx.media3.exoplayer.source;

import android.os.Handler;
import android.util.Pair;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import com.google.common.collect.ImmutableList;

@UnstableApi
/* loaded from: classes2.dex */
public final class ConcatenatingMediaSource2 extends CompositeMediaSource<Integer> {
    public Handler n;
    public boolean o;
    public MediaItem p;

    public static final class Builder {
    }

    public static final class ConcatenatedTimeline extends Timeline {
        @Override // androidx.media3.common.Timeline
        public final int b(Object obj) {
            if (!(obj instanceof Pair)) {
                return -1;
            }
            Object obj2 = ((Pair) obj).first;
            if (!(obj2 instanceof Integer)) {
                return -1;
            }
            ((Integer) obj2).intValue();
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final Timeline.Period f(int i, Timeline.Period period, boolean z) {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final Timeline.Period g(Object obj, Timeline.Period period) {
            Pair pair = (Pair) obj;
            ((Integer) pair.first).intValue();
            Object obj2 = pair.second;
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final int h() {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final Object l(int i) {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final Timeline.Window m(int i, Timeline.Window window, long j) {
            Object obj = Timeline.Window.p;
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final int o() {
            return 1;
        }
    }

    public static final class MediaSourceHolder {
    }

    public static void i0() {
        new Timeline.Period();
        ImmutableList.m();
        ImmutableList.m();
        ImmutableList.m();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final Timeline B() {
        i0();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final MediaPeriod E(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        ((Integer) ((Pair) mediaPeriodId.f3130a).first).intValue();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final synchronized void L(MediaItem mediaItem) {
        this.p = mediaItem;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void S() {
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void U(TransferListener transferListener) {
        super.U(transferListener);
        this.n = new Handler(new b(this, 1));
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void X() {
        super.X();
        Handler handler = this.n;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.n = null;
        }
        this.o = false;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final MediaSource.MediaPeriodId Y(Object obj, MediaSource.MediaPeriodId mediaPeriodId) {
        long j = mediaPeriodId.d;
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final long Z(Object obj, long j, MediaSource.MediaPeriodId mediaPeriodId) {
        Integer num = (Integer) obj;
        if (j == -9223372036854775807L || mediaPeriodId == null || mediaPeriodId.b()) {
            return j;
        }
        num.intValue();
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final /* bridge */ /* synthetic */ int c0(int i, Object obj) {
        return 0;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public final void f0(Object obj, BaseMediaSource baseMediaSource, Timeline timeline) {
        if (this.o) {
            return;
        }
        Handler handler = this.n;
        handler.getClass();
        handler.obtainMessage(1).sendToTarget();
        this.o = true;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final synchronized MediaItem o() {
        return this.p;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void t(MediaPeriod mediaPeriod) {
        throw null;
    }
}
