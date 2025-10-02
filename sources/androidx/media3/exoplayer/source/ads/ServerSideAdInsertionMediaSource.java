package androidx.media3.exoplayer.source.ads;

import android.util.Pair;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.SeekParameters;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.BaseMediaSource;
import androidx.media3.exoplayer.source.ForwardingTimeline;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.Allocator;
import java.io.IOException;

@UnstableApi
/* loaded from: classes2.dex */
public final class ServerSideAdInsertionMediaSource extends BaseMediaSource implements MediaSource.MediaSourceCaller, MediaSourceEventListener, DrmSessionEventListener {

    public interface AdPlaybackStateUpdater {
    }

    public static final class MediaPeriodImpl implements MediaPeriod {
        public MediaPeriod.Callback d;
        public boolean[] e;

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final boolean b() {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final long c(long j, SeekParameters seekParameters) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final long d(long j) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final long e() {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final TrackGroupArray i() {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final long k() {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final void l(long j) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final boolean n(LoadingInfo loadingInfo) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader
        public final long o() {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final long p(ExoTrackSelection[] exoTrackSelectionArr, boolean[] zArr, SampleStream[] sampleStreamArr, boolean[] zArr2, long j) {
            if (this.e.length == 0) {
                this.e = new boolean[sampleStreamArr.length];
            }
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final void r() {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final void s(MediaPeriod.Callback callback, long j) {
            this.d = callback;
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.MediaPeriod
        public final void u(long j, boolean z) {
            throw null;
        }
    }

    public static final class SampleStreamImpl implements SampleStream {
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
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.SampleStream
        public final int q(long j) {
            throw null;
        }
    }

    public static final class ServerSideAdInsertionTimeline extends ForwardingTimeline {
        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final Timeline.Period f(int i, Timeline.Period period, boolean z) {
            super.f(i, period, true);
            Object obj = period.b;
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public final Timeline.Window m(int i, Timeline.Window window, long j) {
            super.m(i, window, j);
            f(window.m, new Timeline.Period(), true);
            throw null;
        }
    }

    public static final class SharedMediaPeriod implements MediaPeriod.Callback {
        @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
        public final void f(MediaPeriod mediaPeriod) {
            throw null;
        }

        @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
        public final void g(SequenceableLoader sequenceableLoader) {
        }
    }

    public static void Y(MediaSource.MediaPeriodId mediaPeriodId) {
        if (mediaPeriodId == null) {
            return;
        }
        new Pair(Long.valueOf(mediaPeriodId.d), mediaPeriodId.f3130a);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource.MediaSourceCaller
    public final void C(BaseMediaSource baseMediaSource, Timeline timeline) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final MediaPeriod E(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j) {
        new Pair(Long.valueOf(mediaPeriodId.d), mediaPeriodId.f3130a);
        throw null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void F(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        Y(mediaPeriodId);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void H(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        Y(mediaPeriodId);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void J(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        Y(mediaPeriodId);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void L(MediaItem mediaItem) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void M(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        Y(mediaPeriodId);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void P() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void Q(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        Y(mediaPeriodId);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void S() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void U(TransferListener transferListener) {
        Util.m(null);
        synchronized (this) {
        }
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.BaseMediaSource
    public final void X() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void a0(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i2) {
        if (i2 != 0) {
            return;
        }
        Y(mediaPeriodId);
        throw null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void b0(int i, MediaSource.MediaPeriodId mediaPeriodId, int i2) {
        Y(mediaPeriodId);
        throw null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void d0(int i, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
        Y(mediaPeriodId);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void j0(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        Y(mediaPeriodId);
        throw null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void k0(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        Y(mediaPeriodId);
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final MediaItem o() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void t(MediaPeriod mediaPeriod) {
        throw null;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public final void z() {
        throw null;
    }
}
