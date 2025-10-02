package androidx.media3.exoplayer.source;

import androidx.annotation.VisibleForTesting;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public final class MaskingMediaSource extends WrappingMediaSource {
    public final boolean o;
    public final Timeline.Window p;
    public final Timeline.Period q;
    public MaskingTimeline r;
    public MaskingMediaPeriod s;
    public boolean t;
    public boolean u;
    public boolean v;

    public static final class MaskingTimeline extends ForwardingTimeline {
        public static final Object e = new Object();
        public final Object c;
        public final Object d;

        public MaskingTimeline(Timeline timeline, Object obj, Object obj2) {
            super(timeline);
            this.c = obj;
            this.d = obj2;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final int b(Object obj) {
            Object obj2;
            if (e.equals(obj) && (obj2 = this.d) != null) {
                obj = obj2;
            }
            return this.b.b(obj);
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final Timeline.Period f(int i, Timeline.Period period, boolean z) {
            this.b.f(i, period, z);
            if (Objects.equals(period.b, this.d) && z) {
                period.b = e;
            }
            return period;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final Object l(int i) {
            Object objL = this.b.l(i);
            return Objects.equals(objL, this.d) ? e : objL;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final Timeline.Window m(int i, Timeline.Window window, long j) {
            this.b.m(i, window, j);
            if (Objects.equals(window.f2878a, this.c)) {
                window.f2878a = Timeline.Window.p;
            }
            return window;
        }
    }

    @VisibleForTesting
    public static final class PlaceholderTimeline extends Timeline {
        public final MediaItem b;

        public PlaceholderTimeline(MediaItem mediaItem) {
            this.b = mediaItem;
        }

        @Override // androidx.media3.common.Timeline
        public final int b(Object obj) {
            return obj == MaskingTimeline.e ? 0 : -1;
        }

        @Override // androidx.media3.common.Timeline
        public final Timeline.Period f(int i, Timeline.Period period, boolean z) {
            period.h(z ? 0 : null, z ? MaskingTimeline.e : null, 0, -9223372036854775807L, 0L, AdPlaybackState.c, true);
            return period;
        }

        @Override // androidx.media3.common.Timeline
        public final int h() {
            return 1;
        }

        @Override // androidx.media3.common.Timeline
        public final Object l(int i) {
            return MaskingTimeline.e;
        }

        @Override // androidx.media3.common.Timeline
        public final Timeline.Window m(int i, Timeline.Window window, long j) {
            window.b(Timeline.Window.p, this.b, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            window.j = true;
            return window;
        }

        @Override // androidx.media3.common.Timeline
        public final int o() {
            return 1;
        }
    }

    public MaskingMediaSource(MediaSource mediaSource, boolean z) {
        super(mediaSource);
        this.o = z && mediaSource.O();
        this.p = new Timeline.Window();
        this.q = new Timeline.Period();
        Timeline timelineB = mediaSource.B();
        if (timelineB == null) {
            this.r = new MaskingTimeline(new PlaceholderTimeline(mediaSource.o()), Timeline.Window.p, MaskingTimeline.e);
        } else {
            this.r = new MaskingTimeline(timelineB, null, null);
            this.v = true;
        }
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final void L(MediaItem mediaItem) {
        if (this.v) {
            MaskingTimeline maskingTimeline = this.r;
            this.r = new MaskingTimeline(new TimelineWithUpdatedMediaItem(this.r.b, mediaItem), maskingTimeline.c, maskingTimeline.d);
        } else {
            this.r = new MaskingTimeline(new PlaceholderTimeline(mediaItem), Timeline.Window.p, MaskingTimeline.e);
        }
        this.n.L(mediaItem);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void T(androidx.media3.common.Timeline r12) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.MaskingMediaSource.T(androidx.media3.common.Timeline):void");
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void X() {
        this.u = false;
        this.t = false;
        super.X();
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    public final MediaSource.MediaPeriodId i0(MediaSource.MediaPeriodId mediaPeriodId) {
        Object obj = mediaPeriodId.f3130a;
        Object obj2 = this.r.d;
        if (obj2 != null && obj2.equals(obj)) {
            obj = MaskingTimeline.e;
        }
        return mediaPeriodId.a(obj);
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    public final void n0() {
        if (this.o) {
            return;
        }
        this.t = true;
        m0();
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public final MaskingMediaPeriod E(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        MaskingMediaPeriod maskingMediaPeriod = new MaskingMediaPeriod(mediaPeriodId, allocator, j);
        maskingMediaPeriod.j(this.n);
        if (!this.u) {
            this.s = maskingMediaPeriod;
            if (!this.t) {
                this.t = true;
                m0();
            }
            return maskingMediaPeriod;
        }
        Object obj = mediaPeriodId.f3130a;
        if (this.r.d != null && obj.equals(MaskingTimeline.e)) {
            obj = this.r.d;
        }
        maskingMediaPeriod.a(mediaPeriodId.a(obj));
        return maskingMediaPeriod;
    }

    public final boolean p0(long j) {
        MaskingMediaPeriod maskingMediaPeriod = this.s;
        int iB = this.r.b(maskingMediaPeriod.d.f3130a);
        if (iB == -1) {
            return false;
        }
        MaskingTimeline maskingTimeline = this.r;
        Timeline.Period period = this.q;
        maskingTimeline.f(iB, period, false);
        long j2 = period.d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        maskingMediaPeriod.l = j;
        return true;
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final void t(MediaPeriod mediaPeriod) {
        ((MaskingMediaPeriod) mediaPeriod).h();
        if (mediaPeriod == this.s) {
            this.s = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final void z() {
    }
}
