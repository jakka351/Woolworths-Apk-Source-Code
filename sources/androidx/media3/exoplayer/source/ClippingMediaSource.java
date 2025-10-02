package androidx.media3.exoplayer.source;

import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

@UnstableApi
/* loaded from: classes2.dex */
public final class ClippingMediaSource extends WrappingMediaSource {
    public final long o;
    public final boolean p;
    public final ArrayList q;
    public final Timeline.Window r;
    public ClippingTimeline s;
    public IllegalClippingException t;
    public long u;
    public long v;

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final MediaSource f3120a;
        public long b;
        public boolean c;
        public boolean d;

        public Builder(MediaSource mediaSource) {
            mediaSource.getClass();
            this.f3120a = mediaSource;
            this.c = true;
            this.b = Long.MIN_VALUE;
        }
    }

    public static final class ClippingTimeline extends ForwardingTimeline {
        public final long c;
        public final long d;
        public final long e;
        public final boolean f;

        public ClippingTimeline(Timeline timeline, long j, long j2) throws IllegalClippingException {
            super(timeline);
            if (j2 != Long.MIN_VALUE && j2 < j) {
                throw new IllegalClippingException(2, j, j2);
            }
            boolean z = false;
            if (timeline.h() != 1) {
                throw new IllegalClippingException(0);
            }
            Timeline.Window windowM = timeline.m(0, new Timeline.Window(), 0L);
            long jMax = Math.max(0L, j);
            if (!windowM.j && jMax != 0 && !windowM.g) {
                throw new IllegalClippingException(1);
            }
            long jMax2 = j2 == Long.MIN_VALUE ? windowM.l : Math.max(0L, j2);
            long j3 = windowM.l;
            if (j3 != -9223372036854775807L) {
                jMax2 = jMax2 > j3 ? j3 : jMax2;
                if (jMax > jMax2) {
                    jMax = jMax2;
                }
            }
            this.c = jMax;
            this.d = jMax2;
            this.e = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
            if (windowM.h && (jMax2 == -9223372036854775807L || (j3 != -9223372036854775807L && jMax2 == j3))) {
                z = true;
            }
            this.f = z;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final Timeline.Period f(int i, Timeline.Period period, boolean z) {
            this.b.f(0, period, z);
            long j = period.e - this.c;
            long j2 = this.e;
            period.h(period.f2877a, period.b, 0, j2 != -9223372036854775807L ? j2 - j : -9223372036854775807L, j, AdPlaybackState.c, false);
            return period;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final Timeline.Window m(int i, Timeline.Window window, long j) {
            this.b.m(0, window, 0L);
            long j2 = window.o;
            long j3 = this.c;
            window.o = j2 + j3;
            window.l = this.e;
            window.h = this.f;
            long j4 = window.k;
            if (j4 != -9223372036854775807L) {
                long jMax = Math.max(j4, j3);
                window.k = jMax;
                long j5 = this.d;
                if (j5 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j5);
                }
                window.k = jMax - j3;
            }
            long jU = Util.U(j3);
            long j6 = window.d;
            if (j6 != -9223372036854775807L) {
                window.d = j6 + jU;
            }
            long j7 = window.e;
            if (j7 != -9223372036854775807L) {
                window.e = j7 + jU;
            }
            return window;
        }
    }

    public static final class IllegalClippingException extends IOException {

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        public IllegalClippingException(int i) {
            this(i, -9223372036854775807L, -9223372036854775807L);
        }

        public IllegalClippingException(int i, long j, long j2) {
            String str;
            StringBuilder sb = new StringBuilder("Illegal clipping: ");
            if (i != 0) {
                if (i == 1) {
                    str = "not seekable to start";
                } else if (i != 2) {
                    str = com.salesforce.marketingcloud.messages.iam.j.h;
                } else {
                    Assertions.f((j == -9223372036854775807L || j2 == -9223372036854775807L) ? false : true);
                    str = "start exceeds end. Start time: " + j + ", End time: " + j2;
                }
            } else {
                str = "invalid period count";
            }
            sb.append(str);
            super(sb.toString());
        }
    }

    public ClippingMediaSource(Builder builder) {
        super(builder.f3120a);
        this.o = builder.b;
        this.p = builder.c;
        this.q = new ArrayList();
        this.r = new Timeline.Window();
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final MediaPeriod E(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        ClippingMediaPeriod clippingMediaPeriod = new ClippingMediaPeriod(this.n.E(mediaPeriodId, allocator, j), this.p, this.u, this.v);
        this.q.add(clippingMediaPeriod);
        return clippingMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void T(Timeline timeline) {
        if (this.t != null) {
            return;
        }
        o0(timeline);
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    public final void X() {
        super.X();
        this.t = null;
        this.s = null;
    }

    public final void o0(Timeline timeline) {
        long j;
        Timeline.Window window = this.r;
        timeline.n(0, window);
        long j2 = window.o;
        ClippingTimeline clippingTimeline = this.s;
        long j3 = this.o;
        ArrayList arrayList = this.q;
        if (clippingTimeline == null || arrayList.isEmpty()) {
            this.u = j2;
            this.v = j3 != Long.MIN_VALUE ? j2 + j3 : Long.MIN_VALUE;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ClippingMediaPeriod clippingMediaPeriod = (ClippingMediaPeriod) arrayList.get(i);
                long j4 = this.u;
                long j5 = this.v;
                clippingMediaPeriod.h = j4;
                clippingMediaPeriod.i = j5;
            }
            j = 0;
        } else {
            j = this.u - j2;
            j3 = j3 == Long.MIN_VALUE ? Long.MIN_VALUE : this.v - j2;
        }
        try {
            ClippingTimeline clippingTimeline2 = new ClippingTimeline(timeline, j, j3);
            this.s = clippingTimeline2;
            W(clippingTimeline2);
        } catch (IllegalClippingException e) {
            this.t = e;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((ClippingMediaPeriod) arrayList.get(i2)).j = this.t;
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final void t(MediaPeriod mediaPeriod) {
        ArrayList arrayList = this.q;
        Assertions.f(arrayList.remove(mediaPeriod));
        this.n.t(((ClippingMediaPeriod) mediaPeriod).d);
        if (arrayList.isEmpty()) {
            ClippingTimeline clippingTimeline = this.s;
            clippingTimeline.getClass();
            o0(clippingTimeline.b);
        }
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.MediaSource
    public final void z() throws IllegalClippingException {
        IllegalClippingException illegalClippingException = this.t;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.z();
    }
}
