package androidx.media3.exoplayer.analytics;

import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import com.google.android.gms.location.GeofenceStatusCodes;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.List;
import java.util.Objects;

@UnstableApi
/* loaded from: classes2.dex */
public class DefaultAnalyticsCollector implements AnalyticsCollector {
    public final Clock d;
    public final Timeline.Period e;
    public final Timeline.Window f;
    public final MediaPeriodQueueTracker g;
    public final SparseArray h;
    public ListenerSet i;
    public Player j;
    public HandlerWrapper k;
    public boolean l;

    public static final class MediaPeriodQueueTracker {

        /* renamed from: a, reason: collision with root package name */
        public final Timeline.Period f3030a;
        public ImmutableList b = ImmutableList.t();
        public ImmutableMap c = ImmutableMap.l();
        public MediaSource.MediaPeriodId d;
        public MediaSource.MediaPeriodId e;
        public MediaSource.MediaPeriodId f;

        public MediaPeriodQueueTracker(Timeline.Period period) {
            this.f3030a = period;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static MediaSource.MediaPeriodId b(Player player, ImmutableList immutableList, MediaSource.MediaPeriodId mediaPeriodId, Timeline.Period period) {
            Timeline timelineK = player.K();
            int iT = player.t();
            Object objL = timelineK.p() ? null : timelineK.l(iT);
            int iB = (player.e() || timelineK.p()) ? -1 : timelineK.f(iT, period, false).b(Util.I(player.getCurrentPosition()) - period.e);
            for (int i = 0; i < immutableList.size(); i++) {
                MediaSource.MediaPeriodId mediaPeriodId2 = (MediaSource.MediaPeriodId) immutableList.get(i);
                if (c(mediaPeriodId2, objL, player.e(), player.i(), player.v(), iB)) {
                    return mediaPeriodId2;
                }
            }
            if (immutableList.isEmpty() && mediaPeriodId != null && c(mediaPeriodId, objL, player.e(), player.i(), player.v(), iB)) {
                return mediaPeriodId;
            }
            return null;
        }

        public static boolean c(MediaSource.MediaPeriodId mediaPeriodId, Object obj, boolean z, int i, int i2, int i3) {
            Object obj2 = mediaPeriodId.f3130a;
            int i4 = mediaPeriodId.b;
            if (!obj2.equals(obj)) {
                return false;
            }
            if (z && i4 == i && mediaPeriodId.c == i2) {
                return true;
            }
            return !z && i4 == -1 && mediaPeriodId.e == i3;
        }

        public final void a(ImmutableMap.Builder builder, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            if (mediaPeriodId == null) {
                return;
            }
            if (timeline.b(mediaPeriodId.f3130a) != -1) {
                builder.c(mediaPeriodId, timeline);
                return;
            }
            Timeline timeline2 = (Timeline) this.c.get(mediaPeriodId);
            if (timeline2 != null) {
                builder.c(mediaPeriodId, timeline2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void d(Timeline timeline) {
            ImmutableMap.Builder builderA = ImmutableMap.a();
            if (this.b.isEmpty()) {
                a(builderA, this.e, timeline);
                if (!Objects.equals(this.f, this.e)) {
                    a(builderA, this.f, timeline);
                }
                if (!Objects.equals(this.d, this.e) && !Objects.equals(this.d, this.f)) {
                    a(builderA, this.d, timeline);
                }
            } else {
                for (int i = 0; i < this.b.size(); i++) {
                    a(builderA, (MediaSource.MediaPeriodId) this.b.get(i), timeline);
                }
                if (!this.b.contains(this.d)) {
                    a(builderA, this.d, timeline);
                }
            }
            this.c = builderA.a(true);
        }
    }

    public DefaultAnalyticsCollector(Clock clock) {
        clock.getClass();
        this.d = clock;
        int i = Util.f2928a;
        Looper looperMyLooper = Looper.myLooper();
        this.i = new ListenerSet(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, clock, new androidx.camera.core.internal.a(22));
        Timeline.Period period = new Timeline.Period();
        this.e = period;
        this.f = new Timeline.Window();
        this.g = new MediaPeriodQueueTracker(period);
        this.h = new SparseArray();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void A(List list, MediaSource.MediaPeriodId mediaPeriodId) {
        Player player = this.j;
        player.getClass();
        MediaPeriodQueueTracker mediaPeriodQueueTracker = this.g;
        mediaPeriodQueueTracker.getClass();
        mediaPeriodQueueTracker.b = ImmutableList.o(list);
        if (!((AbstractCollection) list).isEmpty()) {
            mediaPeriodQueueTracker.e = (MediaSource.MediaPeriodId) list.get(0);
            mediaPeriodId.getClass();
            mediaPeriodQueueTracker.f = mediaPeriodId;
        }
        if (mediaPeriodQueueTracker.d == null) {
            mediaPeriodQueueTracker.d = MediaPeriodQueueTracker.b(player, mediaPeriodQueueTracker.b, mediaPeriodQueueTracker.e, mediaPeriodQueueTracker.f3030a);
        }
        mediaPeriodQueueTracker.d(player.K());
    }

    @Override // androidx.media3.common.Player.Listener
    public final void B(int i) {
        AnalyticsListener.EventTime eventTimeS0 = s0();
        t0(eventTimeS0, 21, new b(eventTimeS0, i, 7));
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener
    public final void C(final int i, final long j, final long j2) {
        MediaPeriodQueueTracker mediaPeriodQueueTracker = this.g;
        final AnalyticsListener.EventTime eventTimeQ0 = q0(mediaPeriodQueueTracker.b.isEmpty() ? null : (MediaSource.MediaPeriodId) Iterables.c(mediaPeriodQueueTracker.b));
        t0(eventTimeQ0, 1006, new ListenerSet.Event(i, j, j2) { // from class: androidx.media3.exoplayer.analytics.e
            public final /* synthetic */ int e;
            public final /* synthetic */ long f;

            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).q(this.e, this.f, this.d);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void D(boolean z) {
        AnalyticsListener.EventTime eventTimeO0 = o0();
        t0(eventTimeO0, 9, new g(eventTimeO0, z, 2));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void E(MediaMetadata mediaMetadata) {
        AnalyticsListener.EventTime eventTimeO0 = o0();
        t0(eventTimeO0, 14, new androidx.camera.core.internal.a(eventTimeO0, mediaMetadata, 16));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void F(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime eventTimeR0 = r0(i, mediaPeriodId);
        t0(eventTimeR0, 1023, new d(eventTimeR0, 4));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void G(PlaybackException playbackException) {
        MediaSource.MediaPeriodId mediaPeriodId;
        AnalyticsListener.EventTime eventTimeO0 = (!(playbackException instanceof ExoPlaybackException) || (mediaPeriodId = ((ExoPlaybackException) playbackException).k) == null) ? o0() : q0(mediaPeriodId);
        t0(eventTimeO0, 10, new androidx.camera.camera2.interop.e(8, eventTimeO0, playbackException));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void H(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
        AnalyticsListener.EventTime eventTimeR0 = r0(i, mediaPeriodId);
        t0(eventTimeR0, 1003, new androidx.camera.core.processing.f(eventTimeR0, loadEventInfo, mediaLoadData, iOException, z));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void I(Player.Commands commands) {
        AnalyticsListener.EventTime eventTimeO0 = o0();
        t0(eventTimeO0, 13, new androidx.camera.core.internal.a(eventTimeO0, commands, 19));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void J(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeR0 = r0(i, mediaPeriodId);
        t0(eventTimeR0, 1002, new androidx.camera.core.internal.a(eventTimeR0, loadEventInfo, mediaLoadData, 11, (byte) 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void K(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2) {
        if (i == 1) {
            this.l = false;
        }
        Player player = this.j;
        player.getClass();
        MediaPeriodQueueTracker mediaPeriodQueueTracker = this.g;
        mediaPeriodQueueTracker.d = MediaPeriodQueueTracker.b(player, mediaPeriodQueueTracker.b, mediaPeriodQueueTracker.e, mediaPeriodQueueTracker.f3030a);
        AnalyticsListener.EventTime eventTimeO0 = o0();
        t0(eventTimeO0, 11, new l(i, positionInfo, positionInfo2, eventTimeO0));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void L(Player player, Player.Events events) {
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void M(int i, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeR0 = r0(i, mediaPeriodId);
        t0(eventTimeR0, GeofenceStatusCodes.GEOFENCE_INSUFFICIENT_LOCATION_PERMISSION, new androidx.camera.camera2.interop.e(5, eventTimeR0, mediaLoadData));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void N(Timeline timeline, int i) {
        Player player = this.j;
        player.getClass();
        MediaPeriodQueueTracker mediaPeriodQueueTracker = this.g;
        mediaPeriodQueueTracker.d = MediaPeriodQueueTracker.b(player, mediaPeriodQueueTracker.b, mediaPeriodQueueTracker.e, mediaPeriodQueueTracker.f3030a);
        mediaPeriodQueueTracker.d(player.K());
        AnalyticsListener.EventTime eventTimeO0 = o0();
        t0(eventTimeO0, 0, new b(eventTimeO0, i, 2));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void O(Tracks tracks) {
        AnalyticsListener.EventTime eventTimeO0 = o0();
        t0(eventTimeO0, 2, new androidx.camera.camera2.interop.e(4, eventTimeO0, tracks));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void P(int i, boolean z) {
        AnalyticsListener.EventTime eventTimeO0 = o0();
        t0(eventTimeO0, -1, new androidx.camera.core.internal.a(eventTimeO0, z, i));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void Q(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime eventTimeR0 = r0(i, mediaPeriodId);
        t0(eventTimeR0, 1027, new d(eventTimeR0, 2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void R(Player player, Looper looper) {
        Assertions.f(this.j == null || this.g.b.isEmpty());
        player.getClass();
        this.j = player;
        this.k = this.d.b(looper, null);
        ListenerSet listenerSet = this.i;
        this.i = new ListenerSet(listenerSet.d, looper, listenerSet.f2911a, new androidx.camera.camera2.interop.e(11, this, player), listenerSet.i);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void S(boolean z) {
        AnalyticsListener.EventTime eventTimeO0 = o0();
        t0(eventTimeO0, 7, new g(eventTimeO0, z, 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void T(int i) {
        AnalyticsListener.EventTime eventTimeO0 = o0();
        t0(eventTimeO0, 6, new b(eventTimeO0, i, 4));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void U(int i) {
        AnalyticsListener.EventTime eventTimeO0 = o0();
        t0(eventTimeO0, 4, new b(eventTimeO0, i, 5));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void V() {
        if (this.l) {
            return;
        }
        AnalyticsListener.EventTime eventTimeO0 = o0();
        this.l = true;
        t0(eventTimeO0, -1, new androidx.camera.core.internal.a((Object) eventTimeO0, 9));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void W(PlaybackParameters playbackParameters) {
        AnalyticsListener.EventTime eventTimeO0 = o0();
        t0(eventTimeO0, 12, new androidx.camera.camera2.interop.e(3, eventTimeO0, playbackParameters));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void X(TrackSelectionParameters trackSelectionParameters) {
        AnalyticsListener.EventTime eventTimeO0 = o0();
        t0(eventTimeO0, 19, new androidx.camera.core.internal.a(eventTimeO0, trackSelectionParameters, 17));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void Y() {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void Z(MediaItem mediaItem, int i) {
        AnalyticsListener.EventTime eventTimeO0 = o0();
        t0(eventTimeO0, 1, new b(eventTimeO0, mediaItem, i));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void a(VideoSize videoSize) {
        AnalyticsListener.EventTime eventTimeS0 = s0();
        t0(eventTimeS0, 25, new androidx.camera.camera2.interop.e(9, eventTimeS0, videoSize));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void a0(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, int i2) {
        AnalyticsListener.EventTime eventTimeR0 = r0(i, mediaPeriodId);
        t0(eventTimeR0, 1000, new androidx.camera.core.internal.a(eventTimeR0, loadEventInfo, mediaLoadData, i2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void b(AudioSink.AudioTrackConfig audioTrackConfig) {
        AnalyticsListener.EventTime eventTimeS0 = s0();
        t0(eventTimeS0, 1032, new n(eventTimeS0, audioTrackConfig, 1));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void b0(int i, MediaSource.MediaPeriodId mediaPeriodId, int i2) {
        AnalyticsListener.EventTime eventTimeR0 = r0(i, mediaPeriodId);
        t0(eventTimeR0, 1022, new b(eventTimeR0, i2, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void c(String str) {
        AnalyticsListener.EventTime eventTimeS0 = s0();
        t0(eventTimeS0, 1019, new a(eventTimeS0, str, 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void c0(int i, int i2) {
        AnalyticsListener.EventTime eventTimeS0 = s0();
        t0(eventTimeS0, 24, new m(i, i2, eventTimeS0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void d(String str) {
        AnalyticsListener.EventTime eventTimeS0 = s0();
        t0(eventTimeS0, 1012, new a(eventTimeS0, str, 3));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void d0(int i, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
        AnalyticsListener.EventTime eventTimeR0 = r0(i, mediaPeriodId);
        t0(eventTimeR0, 1024, new androidx.camera.camera2.interop.e(2, eventTimeR0, exc));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void e(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeS0 = s0();
        t0(eventTimeS0, 1007, new d(eventTimeS0, decoderCounters, 5));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void e0(MediaMetricsListener mediaMetricsListener) {
        this.i.a(mediaMetricsListener);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void f(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeS0 = s0();
        t0(eventTimeS0, 1015, new d(eventTimeS0, decoderCounters, 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void f0(int i) {
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void g(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        AnalyticsListener.EventTime eventTimeS0 = s0();
        t0(eventTimeS0, 1009, new f(eventTimeS0, format, decoderReuseEvaluation, 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void g0(boolean z) {
        AnalyticsListener.EventTime eventTimeO0 = o0();
        t0(eventTimeO0, 3, new g(eventTimeO0, z, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void h(long j, Object obj) {
        AnalyticsListener.EventTime eventTimeS0 = s0();
        t0(eventTimeS0, 26, new androidx.camera.camera2.interop.e(eventTimeS0, obj, j));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void h0(final int i, final boolean z) {
        final AnalyticsListener.EventTime eventTimeO0 = o0();
        t0(eventTimeO0, 5, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.j
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).b(eventTimeO0, z, i);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void i(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeQ0 = q0(this.g.e);
        t0(eventTimeQ0, 1013, new d(eventTimeQ0, decoderCounters, 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void i0(final float f) {
        final AnalyticsListener.EventTime eventTimeS0 = s0();
        t0(eventTimeS0, 22, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.h
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).J(eventTimeS0, f);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void j(long j, long j2, String str) {
        AnalyticsListener.EventTime eventTimeS0 = s0();
        t0(eventTimeS0, 1008, new a(eventTimeS0, str, j2, j, 0));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void j0(int i, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeR0 = r0(i, mediaPeriodId);
        t0(eventTimeR0, 1001, new androidx.camera.core.internal.a(eventTimeR0, loadEventInfo, mediaLoadData, 12, (byte) 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void k(int i, long j) {
        AnalyticsListener.EventTime eventTimeQ0 = q0(this.g.e);
        t0(eventTimeQ0, 1021, new androidx.camera.core.internal.a(i, j, eventTimeQ0));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void k0(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime eventTimeR0 = r0(i, mediaPeriodId);
        t0(eventTimeR0, 1025, new d(eventTimeR0, 3));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void l(int i, long j) {
        AnalyticsListener.EventTime eventTimeQ0 = q0(this.g.e);
        t0(eventTimeQ0, 1018, new b(i, j, eventTimeQ0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void l0(final int i, final int i2, final boolean z) {
        final AnalyticsListener.EventTime eventTimeS0 = s0();
        t0(eventTimeS0, 1033, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.c
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).O(eventTimeS0, i, i2, z);
            }
        });
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void m(Exception exc) {
        AnalyticsListener.EventTime eventTimeS0 = s0();
        t0(eventTimeS0, 1029, new androidx.camera.core.internal.a(eventTimeS0, exc, 13));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void m0(int i) {
        AnalyticsListener.EventTime eventTimeO0 = o0();
        t0(eventTimeO0, 8, new b(eventTimeO0, i, 6));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void n(AudioSink.AudioTrackConfig audioTrackConfig) {
        AnalyticsListener.EventTime eventTimeS0 = s0();
        t0(eventTimeS0, 1031, new n(eventTimeS0, audioTrackConfig, 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void n0(PlaybackException playbackException) {
        MediaSource.MediaPeriodId mediaPeriodId;
        AnalyticsListener.EventTime eventTimeO0 = (!(playbackException instanceof ExoPlaybackException) || (mediaPeriodId = ((ExoPlaybackException) playbackException).k) == null) ? o0() : q0(mediaPeriodId);
        t0(eventTimeO0, 10, new androidx.camera.core.internal.a(eventTimeO0, playbackException, 21));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void o(boolean z) {
        AnalyticsListener.EventTime eventTimeS0 = s0();
        t0(eventTimeS0, 23, new g(eventTimeS0, z, 3));
    }

    public final AnalyticsListener.EventTime o0() {
        return q0(this.g.d);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void p(Exception exc) {
        AnalyticsListener.EventTime eventTimeS0 = s0();
        t0(eventTimeS0, 1014, new androidx.camera.core.internal.a(eventTimeS0, exc, 14));
    }

    public final AnalyticsListener.EventTime p0(Timeline timeline, int i, MediaSource.MediaPeriodId mediaPeriodId) {
        MediaSource.MediaPeriodId mediaPeriodId2 = timeline.p() ? null : mediaPeriodId;
        long jElapsedRealtime = this.d.elapsedRealtime();
        boolean z = timeline.equals(this.j.K()) && i == this.j.S();
        long jU = 0;
        if (mediaPeriodId2 == null || !mediaPeriodId2.b()) {
            if (z) {
                jU = this.j.R();
            } else if (!timeline.p()) {
                jU = Util.U(timeline.m(i, this.f, 0L).k);
            }
        } else if (z && this.j.i() == mediaPeriodId2.b && this.j.v() == mediaPeriodId2.c) {
            jU = this.j.getCurrentPosition();
        }
        return new AnalyticsListener.EventTime(jElapsedRealtime, timeline, i, mediaPeriodId2, jU, this.j.K(), this.j.S(), this.g.d, this.j.getCurrentPosition(), this.j.f());
    }

    @Override // androidx.media3.common.Player.Listener
    public final void q(List list) {
        AnalyticsListener.EventTime eventTimeO0 = o0();
        t0(eventTimeO0, 27, new k(eventTimeO0, list));
    }

    public final AnalyticsListener.EventTime q0(MediaSource.MediaPeriodId mediaPeriodId) {
        this.j.getClass();
        Timeline timeline = mediaPeriodId == null ? null : (Timeline) this.g.c.get(mediaPeriodId);
        if (mediaPeriodId != null && timeline != null) {
            return p0(timeline, timeline.g(mediaPeriodId.f3130a, this.e).c, mediaPeriodId);
        }
        int iS = this.j.S();
        Timeline timelineK = this.j.K();
        if (iS >= timelineK.o()) {
            timelineK = Timeline.f2876a;
        }
        return p0(timelineK, iS, null);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void r(long j) {
        AnalyticsListener.EventTime eventTimeS0 = s0();
        t0(eventTimeS0, 1010, new androidx.camera.core.internal.a(eventTimeS0, j));
    }

    public final AnalyticsListener.EventTime r0(int i, MediaSource.MediaPeriodId mediaPeriodId) {
        this.j.getClass();
        if (mediaPeriodId != null) {
            return ((Timeline) this.g.c.get(mediaPeriodId)) != null ? q0(mediaPeriodId) : p0(Timeline.f2876a, i, mediaPeriodId);
        }
        Timeline timelineK = this.j.K();
        if (i >= timelineK.o()) {
            timelineK = Timeline.f2876a;
        }
        return p0(timelineK, i, null);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void release() {
        HandlerWrapper handlerWrapper = this.k;
        Assertions.g(handlerWrapper);
        handlerWrapper.post(new androidx.camera.camera2.interop.d(this, 11));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void s(Exception exc) {
        AnalyticsListener.EventTime eventTimeS0 = s0();
        t0(eventTimeS0, 1030, new androidx.camera.core.internal.a(eventTimeS0, exc, 24));
    }

    public final AnalyticsListener.EventTime s0() {
        return q0(this.g.f);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void t(CueGroup cueGroup) {
        AnalyticsListener.EventTime eventTimeO0 = o0();
        t0(eventTimeO0, 27, new androidx.camera.core.internal.a(eventTimeO0, cueGroup, 15));
    }

    public final void t0(AnalyticsListener.EventTime eventTime, int i, ListenerSet.Event event) {
        this.h.put(i, eventTime);
        this.i.f(i, event);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void u(Metadata metadata) {
        AnalyticsListener.EventTime eventTimeO0 = o0();
        t0(eventTimeO0, 28, new androidx.camera.camera2.interop.e(7, eventTimeO0, metadata));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void v(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        AnalyticsListener.EventTime eventTimeS0 = s0();
        t0(eventTimeS0, 1017, new f(eventTimeS0, format, decoderReuseEvaluation, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void w(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeQ0 = q0(this.g.e);
        t0(eventTimeQ0, 1020, new androidx.camera.camera2.interop.e(6, eventTimeQ0, decoderCounters));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void x(long j, long j2, String str) {
        AnalyticsListener.EventTime eventTimeS0 = s0();
        t0(eventTimeS0, 1016, new a(eventTimeS0, str, j2, j, 2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void y(final int i, final long j, final long j2) {
        final AnalyticsListener.EventTime eventTimeS0 = s0();
        t0(eventTimeS0, 1011, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.analytics.i
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((AnalyticsListener) obj).K(eventTimeS0, i, j, j2);
            }
        });
    }

    @Override // androidx.media3.common.Player.Listener
    public final void z(boolean z) {
    }
}
