package androidx.media3.exoplayer.source.preload;

import android.support.v4.media.session.a;
import android.util.Pair;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.WrappingMediaSource;
import androidx.media3.exoplayer.upstream.Allocator;

@UnstableApi
/* loaded from: classes2.dex */
public final class PreloadMediaSource extends WrappingMediaSource {
    public boolean o;
    public Timeline p;
    public Pair q;
    public Pair r;
    public boolean s;

    public static final class Factory implements MediaSource.Factory {
        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public final MediaSource b(MediaItem mediaItem) {
            throw null;
        }
    }

    public static class MediaPeriodKey {

        /* renamed from: a, reason: collision with root package name */
        public final MediaSource.MediaPeriodId f3158a;
        public final Long b;

        public MediaPeriodKey(MediaSource.MediaPeriodId mediaPeriodId, long j) {
            this.f3158a = mediaPeriodId;
            this.b = Long.valueOf(j);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaPeriodKey)) {
                return false;
            }
            MediaPeriodKey mediaPeriodKey = (MediaPeriodKey) obj;
            return PreloadMediaSource.p0(this.f3158a, mediaPeriodKey.f3158a) && this.b.equals(mediaPeriodKey.b);
        }

        public final int hashCode() {
            MediaSource.MediaPeriodId mediaPeriodId = this.f3158a;
            return this.b.intValue() + ((((((a.e(527, 31, mediaPeriodId.f3130a) + mediaPeriodId.b) * 31) + mediaPeriodId.c) * 31) + mediaPeriodId.e) * 31);
        }
    }

    public interface PreloadControl {
    }

    public class PreloadMediaPeriodCallback implements MediaPeriod.Callback {
        @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
        public final void f(MediaPeriod mediaPeriod) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public final void g(SequenceableLoader sequenceableLoader) {
            throw null;
        }
    }

    public static boolean p0(MediaSource.MediaPeriodId mediaPeriodId, MediaSource.MediaPeriodId mediaPeriodId2) {
        return mediaPeriodId.f3130a.equals(mediaPeriodId2.f3130a) && mediaPeriodId.b == mediaPeriodId2.b && mediaPeriodId.c == mediaPeriodId2.c && mediaPeriodId.e == mediaPeriodId2.e;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final MediaPeriod E(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        MediaPeriodKey mediaPeriodKey = new MediaPeriodKey(mediaPeriodId, j);
        Pair pair = this.q;
        if (pair != null && mediaPeriodKey.equals(pair.second)) {
            Pair pair2 = this.q;
            pair2.getClass();
            PreloadMediaPeriod preloadMediaPeriod = (PreloadMediaPeriod) pair2.first;
            if (!o0()) {
                return preloadMediaPeriod;
            }
            this.q = null;
            this.r = new Pair(preloadMediaPeriod, mediaPeriodId);
            return preloadMediaPeriod;
        }
        Pair pair3 = this.q;
        MediaSource mediaSource = this.n;
        if (pair3 != null) {
            mediaSource.t(((PreloadMediaPeriod) pair3.first).d);
            this.q = null;
        }
        PreloadMediaPeriod preloadMediaPeriod2 = new PreloadMediaPeriod(mediaSource.E(mediaPeriodId, allocator, j));
        if (!o0()) {
            this.q = new Pair(preloadMediaPeriod2, mediaPeriodKey);
        }
        return preloadMediaPeriod2;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void T(Timeline timeline) {
        this.p = timeline;
        W(timeline);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void X() {
        if (o0()) {
            return;
        }
        this.s = false;
        this.p = null;
        this.o = false;
        super.X();
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    public final MediaSource.MediaPeriodId i0(MediaSource.MediaPeriodId mediaPeriodId) {
        Pair pair = this.r;
        if (pair == null) {
            return mediaPeriodId;
        }
        pair.getClass();
        if (!p0(mediaPeriodId, (MediaSource.MediaPeriodId) pair.second)) {
            return mediaPeriodId;
        }
        Pair pair2 = this.r;
        pair2.getClass();
        return (MediaSource.MediaPeriodId) pair2.second;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    public final void n0() {
        if (o0() && !this.s) {
            throw null;
        }
        Timeline timeline = this.p;
        if (timeline != null) {
            T(timeline);
            throw null;
        }
        if (this.o) {
            return;
        }
        this.o = true;
        m0();
    }

    public final boolean o0() {
        return !this.d.isEmpty();
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final void t(MediaPeriod mediaPeriod) {
        PreloadMediaPeriod preloadMediaPeriod = (PreloadMediaPeriod) mediaPeriod;
        Pair pair = this.q;
        if (pair == null || preloadMediaPeriod != pair.first) {
            Pair pair2 = this.r;
            if (pair2 != null && preloadMediaPeriod == pair2.first) {
                this.r = null;
            }
        } else {
            this.q = null;
        }
        this.n.t(preloadMediaPeriod.d);
    }
}
