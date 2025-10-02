package androidx.media3.exoplayer.source;

import android.util.Pair;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.AbstractConcatenatedTimeline;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.upstream.Allocator;

@UnstableApi
@Deprecated
/* loaded from: classes2.dex */
public final class LoopingMediaSource extends WrappingMediaSource {

    public static final class InfinitelyLoopingTimeline extends ForwardingTimeline {
        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final int e(int i, int i2, boolean z) {
            Timeline timeline = this.b;
            int iE = timeline.e(i, i2, z);
            return iE == -1 ? timeline.a(z) : iE;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final int k(int i, int i2, boolean z) {
            Timeline timeline = this.b;
            int iK = timeline.k(i, i2, z);
            return iK == -1 ? timeline.c(z) : iK;
        }
    }

    public static final class LoopingTimeline extends AbstractConcatenatedTimeline {
        public final Timeline e;
        public final int f;
        public final int g;

        public LoopingTimeline(Timeline timeline) {
            super(new ShuffleOrder.UnshuffledShuffleOrder(0));
            this.e = timeline;
            int iH = timeline.h();
            this.f = iH;
            this.g = timeline.o();
            if (iH > 0) {
                Assertions.e("LoopingMediaSource contains too many periods", Integer.MAX_VALUE / iH >= 0);
            }
        }

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
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            return -1;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public final int r(int i) {
            return i / this.f;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public final int s(int i) {
            return i / this.g;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public final Object t(int i) {
            return Integer.valueOf(i);
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public final int u(int i) {
            return i * this.f;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public final int v(int i) {
            return i * this.g;
        }

        @Override // androidx.media3.exoplayer.AbstractConcatenatedTimeline
        public final Timeline x(int i) {
            return this.e;
        }
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final Timeline B() {
        return new LoopingTimeline(((MaskingMediaSource) this.n).r);
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final MediaPeriod E(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        Object obj = mediaPeriodId.f3130a;
        int i = AbstractConcatenatedTimeline.d;
        mediaPeriodId.a(((Pair) obj).second);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final boolean O() {
        return false;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void T(Timeline timeline) {
        W(new LoopingTimeline(timeline));
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    public final MediaSource.MediaPeriodId i0(MediaSource.MediaPeriodId mediaPeriodId) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final void t(MediaPeriod mediaPeriod) {
        this.n.t(mediaPeriod);
        throw null;
    }
}
