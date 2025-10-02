package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.AudioFocusManager;
import androidx.media3.exoplayer.DefaultMediaClock;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.LoadControl;
import androidx.media3.exoplayer.LoadingInfo;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.PlayerMessage;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
final class ExoPlayerImplInternal implements Handler.Callback, MediaPeriod.Callback, TrackSelector.InvalidationListener, MediaSourceList.MediaSourceListInfoRefreshListener, DefaultMediaClock.PlaybackParametersListener, PlayerMessage.Sender, AudioFocusManager.PlayerControl {
    public static final long e0 = Util.U(10000);
    public static final /* synthetic */ int f0 = 0;
    public final AnalyticsCollector A;
    public final HandlerWrapper B;
    public final boolean C;
    public final AudioFocusManager D;
    public SeekParameters E;
    public PlaybackInfo F;
    public PlaybackInfoUpdate G;
    public boolean H;
    public boolean J;
    public boolean K;
    public boolean M;
    public int N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public int S;
    public SeekPosition T;
    public long U;
    public long V;
    public int W;
    public boolean X;
    public ExoPlaybackException Y;
    public ExoPlayer.PreloadConfiguration a0;
    public boolean c0;
    public final RendererHolder[] d;
    public final RendererCapabilities[] e;
    public final boolean[] f;
    public final TrackSelector g;
    public final TrackSelectorResult h;
    public final LoadControl i;
    public final BandwidthMeter j;
    public final HandlerWrapper k;
    public final PlaybackLooperProvider l;
    public final Looper m;
    public final Timeline.Window n;
    public final Timeline.Period o;
    public final long p;
    public final boolean q;
    public final DefaultMediaClock r;
    public final ArrayList s;
    public final Clock t;
    public final m u;
    public final MediaPeriodQueue v;
    public final MediaSourceList w;
    public final LivePlaybackSpeedControl x;
    public final long y;
    public final PlayerId z;
    public long b0 = -9223372036854775807L;
    public boolean I = false;
    public float d0 = 1.0f;
    public long Z = -9223372036854775807L;
    public long L = -9223372036854775807L;

    public static final class MediaSourceListUpdateMessage {

        /* renamed from: a, reason: collision with root package name */
        public final ArrayList f3005a;
        public final ShuffleOrder b;
        public final int c;
        public final long d;

        public MediaSourceListUpdateMessage(ArrayList arrayList, ShuffleOrder shuffleOrder, int i, long j) {
            this.f3005a = arrayList;
            this.b = shuffleOrder;
            this.c = i;
            this.d = j;
        }
    }

    public static class MoveMediaItemsMessage {
    }

    public static final class PendingMessageInfo implements Comparable<PendingMessageInfo> {
        @Override // java.lang.Comparable
        public final int compareTo(PendingMessageInfo pendingMessageInfo) {
            pendingMessageInfo.getClass();
            return 0;
        }
    }

    public static final class PlaybackInfoUpdate {

        /* renamed from: a, reason: collision with root package name */
        public boolean f3006a;
        public PlaybackInfo b;
        public int c;
        public boolean d;
        public int e;

        public PlaybackInfoUpdate(PlaybackInfo playbackInfo) {
            this.b = playbackInfo;
        }

        public final void a(int i) {
            this.f3006a |= i > 0;
            this.c += i;
        }
    }

    public interface PlaybackInfoUpdateListener {
    }

    public static final class PositionUpdateForPlaylistChange {

        /* renamed from: a, reason: collision with root package name */
        public final MediaSource.MediaPeriodId f3007a;
        public final long b;
        public final long c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public PositionUpdateForPlaylistChange(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, boolean z, boolean z2, boolean z3) {
            this.f3007a = mediaPeriodId;
            this.b = j;
            this.c = j2;
            this.d = z;
            this.e = z2;
            this.f = z3;
        }
    }

    public static final class SeekPosition {

        /* renamed from: a, reason: collision with root package name */
        public final Timeline f3008a;
        public final int b;
        public final long c;

        public SeekPosition(Timeline timeline, int i, long j) {
            this.f3008a = timeline;
            this.b = i;
            this.c = j;
        }
    }

    public ExoPlayerImplInternal(Context context, Renderer[] rendererArr, Renderer[] rendererArr2, TrackSelector trackSelector, TrackSelectorResult trackSelectorResult, LoadControl loadControl, BandwidthMeter bandwidthMeter, int i, boolean z, AnalyticsCollector analyticsCollector, SeekParameters seekParameters, DefaultLivePlaybackSpeedControl defaultLivePlaybackSpeedControl, long j, Looper looper, SystemClock systemClock, m mVar, PlayerId playerId, ExoPlayer.PreloadConfiguration preloadConfiguration) {
        Looper looper2;
        this.u = mVar;
        this.g = trackSelector;
        this.h = trackSelectorResult;
        this.i = loadControl;
        this.j = bandwidthMeter;
        this.N = i;
        this.O = z;
        this.E = seekParameters;
        this.x = defaultLivePlaybackSpeedControl;
        this.y = j;
        boolean z2 = false;
        this.t = systemClock;
        this.z = playerId;
        this.a0 = preloadConfiguration;
        this.A = analyticsCollector;
        this.p = loadControl.g();
        this.q = loadControl.a();
        Timeline timeline = Timeline.f2876a;
        PlaybackInfo playbackInfoJ = PlaybackInfo.j(trackSelectorResult);
        this.F = playbackInfoJ;
        this.G = new PlaybackInfoUpdate(playbackInfoJ);
        this.e = new RendererCapabilities[rendererArr.length];
        this.f = new boolean[rendererArr.length];
        RendererCapabilities.Listener listenerC = trackSelector.c();
        this.d = new RendererHolder[rendererArr.length];
        boolean z3 = false;
        for (int i2 = 0; i2 < rendererArr.length; i2++) {
            rendererArr[i2].t(i2, playerId, systemClock);
            this.e[i2] = rendererArr[i2].y();
            if (listenerC != null) {
                this.e[i2].z(listenerC);
            }
            Renderer renderer = rendererArr2[i2];
            if (renderer != null) {
                renderer.t(rendererArr.length + i2, playerId, systemClock);
                z3 = true;
            }
            this.d[i2] = new RendererHolder(rendererArr[i2], rendererArr2[i2], i2);
        }
        this.C = z3;
        this.r = new DefaultMediaClock(this, systemClock);
        this.s = new ArrayList();
        this.n = new Timeline.Window();
        this.o = new Timeline.Period();
        trackSelector.f3169a = this;
        trackSelector.b = bandwidthMeter;
        this.X = true;
        HandlerWrapper handlerWrapperB = systemClock.b(looper, null);
        this.B = handlerWrapperB;
        this.v = new MediaPeriodQueue(analyticsCollector, handlerWrapperB, new f(this, 3), preloadConfiguration);
        this.w = new MediaSourceList(this, analyticsCollector, handlerWrapperB, playerId);
        PlaybackLooperProvider playbackLooperProvider = new PlaybackLooperProvider();
        this.l = playbackLooperProvider;
        synchronized (playbackLooperProvider.f3021a) {
            try {
                if (playbackLooperProvider.b == null) {
                    if (playbackLooperProvider.d == 0 && playbackLooperProvider.c == null) {
                        z2 = true;
                    }
                    Assertions.f(z2);
                    HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
                    playbackLooperProvider.c = handlerThread;
                    handlerThread.start();
                    playbackLooperProvider.b = playbackLooperProvider.c.getLooper();
                }
                playbackLooperProvider.d++;
                looper2 = playbackLooperProvider.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.m = looper2;
        this.k = systemClock.b(looper2, this);
        this.D = new AudioFocusManager(context, looper2, this);
    }

    public static Pair Q(Timeline timeline, SeekPosition seekPosition, boolean z, int i, boolean z2, Timeline.Window window, Timeline.Period period) {
        int iR;
        Timeline timeline2 = seekPosition.f3008a;
        if (timeline.p()) {
            return null;
        }
        Timeline timeline3 = timeline2.p() ? timeline : timeline2;
        try {
            Pair pairI = timeline3.i(window, period, seekPosition.b, seekPosition.c);
            if (!timeline.equals(timeline3)) {
                if (timeline.b(pairI.first) == -1) {
                    if (!z || (iR = R(window, period, i, z2, pairI.first, timeline3, timeline)) == -1) {
                        return null;
                    }
                    return timeline.i(window, period, iR, -9223372036854775807L);
                }
                if (timeline3.g(pairI.first, period).f && timeline3.m(period.c, window, 0L).m == timeline3.b(pairI.first)) {
                    return timeline.i(window, period, timeline.g(pairI.first, period).c, seekPosition.c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int R(Timeline.Window window, Timeline.Period period, int i, boolean z, Object obj, Timeline timeline, Timeline timeline2) {
        Timeline.Window window2 = window;
        Timeline timeline3 = timeline;
        Object obj2 = timeline3.m(timeline3.g(obj, period).c, window, 0L).f2878a;
        for (int i2 = 0; i2 < timeline2.o(); i2++) {
            if (timeline2.m(i2, window, 0L).f2878a.equals(obj2)) {
                return i2;
            }
        }
        int iB = timeline3.b(obj);
        int iH = timeline3.h();
        int iB2 = -1;
        int i3 = 0;
        while (i3 < iH && iB2 == -1) {
            Timeline timeline4 = timeline3;
            int iD = timeline4.d(iB, period, window2, i, z);
            if (iD == -1) {
                break;
            }
            iB2 = timeline2.b(timeline4.l(iD));
            i3++;
            timeline3 = timeline4;
            iB = iD;
            window2 = window;
        }
        if (iB2 == -1) {
            return -1;
        }
        return timeline2.f(iB2, period, false).c;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader, java.lang.Object] */
    public static boolean z(MediaPeriodHolder mediaPeriodHolder) {
        if (mediaPeriodHolder != null) {
            try {
                ?? r1 = mediaPeriodHolder.f3013a;
                if (mediaPeriodHolder.e) {
                    for (SampleStream sampleStream : mediaPeriodHolder.c) {
                        if (sampleStream != null) {
                            sampleStream.j();
                        }
                    }
                } else {
                    r1.r();
                }
                if ((!mediaPeriodHolder.e ? 0L : r1.o()) != Long.MIN_VALUE) {
                    return true;
                }
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public final boolean A() {
        MediaPeriodHolder mediaPeriodHolder = this.v.j;
        long j = mediaPeriodHolder.g.e;
        if (mediaPeriodHolder.e) {
            return j == -9223372036854775807L || this.F.s < j || !l0();
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r1v11, types: [androidx.media3.exoplayer.source.MediaPeriod, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17, types: [androidx.media3.exoplayer.source.SequenceableLoader, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.media3.exoplayer.source.SequenceableLoader, java.lang.Object] */
    public final void B() {
        long j;
        long j2;
        boolean zD;
        if (z(this.v.m)) {
            MediaPeriodHolder mediaPeriodHolder = this.v.m;
            long jP = p(!mediaPeriodHolder.e ? 0L : mediaPeriodHolder.f3013a.o());
            if (mediaPeriodHolder == this.v.j) {
                j = this.U;
                j2 = mediaPeriodHolder.p;
            } else {
                j = this.U - mediaPeriodHolder.p;
                j2 = mediaPeriodHolder.g.b;
            }
            long j3 = j - j2;
            long jC = m0(this.F.f3020a, mediaPeriodHolder.g.f3014a) ? this.x.c() : -9223372036854775807L;
            PlayerId playerId = this.z;
            Timeline timeline = this.F.f3020a;
            MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodHolder.g.f3014a;
            float f = this.r.d().f2871a;
            boolean z = this.F.l;
            LoadControl.Parameters parameters = new LoadControl.Parameters(playerId, timeline, mediaPeriodId, j3, jP, f, this.K, jC);
            zD = this.i.d(parameters);
            MediaPeriodHolder mediaPeriodHolder2 = this.v.j;
            if (!zD && mediaPeriodHolder2.e && jP < 500000 && (this.p > 0 || this.q)) {
                mediaPeriodHolder2.f3013a.u(this.F.s, false);
                zD = this.i.d(parameters);
            }
        } else {
            zD = false;
        }
        this.M = zD;
        if (zD) {
            MediaPeriodHolder mediaPeriodHolder3 = this.v.m;
            mediaPeriodHolder3.getClass();
            LoadingInfo.Builder builder = new LoadingInfo.Builder();
            builder.f3012a = this.U - mediaPeriodHolder3.p;
            float f2 = this.r.d().f2871a;
            Assertions.b(f2 > BitmapDescriptorFactory.HUE_RED || f2 == -3.4028235E38f);
            builder.b = f2;
            long j4 = this.L;
            Assertions.b(j4 >= 0 || j4 == -9223372036854775807L);
            builder.c = j4;
            LoadingInfo loadingInfo = new LoadingInfo(builder);
            Assertions.f(mediaPeriodHolder3.m == null);
            mediaPeriodHolder3.f3013a.n(loadingInfo);
        }
        q0();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader, java.lang.Object] */
    public final void C() {
        MediaPeriodQueue mediaPeriodQueue = this.v;
        mediaPeriodQueue.k();
        MediaPeriodHolder mediaPeriodHolder = mediaPeriodQueue.n;
        if (mediaPeriodHolder != null) {
            ?? r1 = mediaPeriodHolder.f3013a;
            if ((!mediaPeriodHolder.d || mediaPeriodHolder.e) && !r1.b()) {
                Timeline timeline = this.F.f3020a;
                if (mediaPeriodHolder.e) {
                    r1.k();
                }
                if (this.i.e()) {
                    if (!mediaPeriodHolder.d) {
                        long j = mediaPeriodHolder.g.b;
                        mediaPeriodHolder.d = true;
                        r1.s(this, j);
                        return;
                    }
                    LoadingInfo.Builder builder = new LoadingInfo.Builder();
                    builder.f3012a = this.U - mediaPeriodHolder.p;
                    float f = this.r.d().f2871a;
                    Assertions.b(f > BitmapDescriptorFactory.HUE_RED || f == -3.4028235E38f);
                    builder.b = f;
                    long j2 = this.L;
                    Assertions.b(j2 >= 0 || j2 == -9223372036854775807L);
                    builder.c = j2;
                    LoadingInfo loadingInfo = new LoadingInfo(builder);
                    Assertions.f(mediaPeriodHolder.m == null);
                    r1.n(loadingInfo);
                }
            }
        }
    }

    public final void D() {
        PlaybackInfoUpdate playbackInfoUpdate = this.G;
        PlaybackInfo playbackInfo = this.F;
        boolean z = playbackInfoUpdate.f3006a | (playbackInfoUpdate.b != playbackInfo);
        playbackInfoUpdate.f3006a = z;
        playbackInfoUpdate.b = playbackInfo;
        if (z) {
            this.u.c(playbackInfoUpdate);
            this.G = new PlaybackInfoUpdate(this.F);
        }
    }

    public final void E(int i) {
        RendererHolder rendererHolder = this.d[i];
        try {
            MediaPeriodHolder mediaPeriodHolder = this.v.j;
            mediaPeriodHolder.getClass();
            Renderer rendererC = rendererHolder.c(mediaPeriodHolder);
            rendererC.getClass();
            rendererC.w();
        } catch (IOException | RuntimeException e) {
            int iE = rendererHolder.f3024a.e();
            if (iE != 3 && iE != 5) {
                throw e;
            }
            TrackSelectorResult trackSelectorResult = this.v.j.o;
            Log.d("ExoPlayerImplInternal", "Disabling track due to error: " + Format.c(trackSelectorResult.c[i].g()), e);
            TrackSelectorResult trackSelectorResult2 = new TrackSelectorResult((RendererConfiguration[]) trackSelectorResult.b.clone(), (ExoTrackSelection[]) trackSelectorResult.c.clone(), trackSelectorResult.d, trackSelectorResult.e);
            trackSelectorResult2.b[i] = null;
            trackSelectorResult2.c[i] = null;
            i(i);
            MediaPeriodHolder mediaPeriodHolder2 = this.v.j;
            mediaPeriodHolder2.a(trackSelectorResult2, this.F.s, false, new boolean[mediaPeriodHolder2.j.length]);
        }
    }

    public final void F(final int i, final boolean z) {
        boolean[] zArr = this.f;
        if (zArr[i] != z) {
            zArr[i] = z;
            this.B.post(new Runnable() { // from class: androidx.media3.exoplayer.p
                @Override // java.lang.Runnable
                public final void run() {
                    ExoPlayerImplInternal exoPlayerImplInternal = this.d;
                    AnalyticsCollector analyticsCollector = exoPlayerImplInternal.A;
                    RendererHolder[] rendererHolderArr = exoPlayerImplInternal.d;
                    int i2 = i;
                    analyticsCollector.l0(i2, rendererHolderArr[i2].f3024a.e(), z);
                }
            });
        }
    }

    public final void G() throws Throwable {
        v(this.w.b(), true);
    }

    public final void H(MoveMediaItemsMessage moveMediaItemsMessage) throws Throwable {
        this.G.a(1);
        moveMediaItemsMessage.getClass();
        MediaSourceList mediaSourceList = this.w;
        Assertions.b(mediaSourceList.b.size() >= 0);
        mediaSourceList.j = null;
        v(mediaSourceList.b(), false);
    }

    public final void I() {
        this.G.a(1);
        M(false, false, false, true);
        this.i.c(this.z);
        i0(this.F.f3020a.p() ? 4 : 2);
        PlaybackInfo playbackInfo = this.F;
        boolean z = playbackInfo.l;
        t0(this.D.c(playbackInfo.e, z), playbackInfo.n, playbackInfo.m, z);
        TransferListener transferListenerF = this.j.f();
        MediaSourceList mediaSourceList = this.w;
        ArrayList arrayList = mediaSourceList.b;
        Assertions.f(!mediaSourceList.k);
        mediaSourceList.l = transferListenerF;
        for (int i = 0; i < arrayList.size(); i++) {
            MediaSourceList.MediaSourceHolder mediaSourceHolder = (MediaSourceList.MediaSourceHolder) arrayList.get(i);
            mediaSourceList.e(mediaSourceHolder);
            mediaSourceList.g.add(mediaSourceHolder);
        }
        mediaSourceList.k = true;
        this.k.j(2);
    }

    public final void J() {
        try {
            M(true, false, true, false);
            RendererHolder[] rendererHolderArr = this.d;
            for (int i = 0; i < rendererHolderArr.length; i++) {
                this.e[i].r();
                RendererHolder rendererHolder = rendererHolderArr[i];
                rendererHolder.f3024a.release();
                rendererHolder.e = false;
                Renderer renderer = rendererHolder.c;
                if (renderer != null) {
                    renderer.release();
                    rendererHolder.f = false;
                }
            }
            this.i.i(this.z);
            AudioFocusManager audioFocusManager = this.D;
            audioFocusManager.c = null;
            audioFocusManager.a();
            audioFocusManager.b(0);
            this.g.e();
            i0(1);
            this.l.a();
            synchronized (this) {
                this.H = true;
                notifyAll();
            }
        } catch (Throwable th) {
            this.l.a();
            synchronized (this) {
                this.H = true;
                notifyAll();
                throw th;
            }
        }
    }

    public final void K(int i, int i2, ShuffleOrder shuffleOrder) throws Throwable {
        this.G.a(1);
        MediaSourceList mediaSourceList = this.w;
        mediaSourceList.getClass();
        Assertions.b(i >= 0 && i <= i2 && i2 <= mediaSourceList.b.size());
        mediaSourceList.j = shuffleOrder;
        mediaSourceList.g(i, i2);
        v(mediaSourceList.b(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void L() throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 373
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayerImplInternal.L():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void M(boolean r36, boolean r37, boolean r38, boolean r39) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayerImplInternal.M(boolean, boolean, boolean, boolean):void");
    }

    public final void N() {
        MediaPeriodHolder mediaPeriodHolder = this.v.j;
        this.J = mediaPeriodHolder != null && mediaPeriodHolder.g.i && this.I;
    }

    public final void O(long j) {
        MediaPeriodHolder mediaPeriodHolder = this.v.j;
        long j2 = j + (mediaPeriodHolder == null ? 1000000000000L : mediaPeriodHolder.p);
        this.U = j2;
        this.r.d.a(j2);
        for (RendererHolder rendererHolder : this.d) {
            long j3 = this.U;
            Renderer rendererC = rendererHolder.c(mediaPeriodHolder);
            if (rendererC != null) {
                rendererC.p(j3);
            }
        }
        for (MediaPeriodHolder mediaPeriodHolder2 = r0.j; mediaPeriodHolder2 != null; mediaPeriodHolder2 = mediaPeriodHolder2.m) {
            for (ExoTrackSelection exoTrackSelection : mediaPeriodHolder2.o.c) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.c();
                }
            }
        }
    }

    public final void P(Timeline timeline, Timeline timeline2) {
        if (timeline.p() && timeline2.p()) {
            return;
        }
        ArrayList arrayList = this.s;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            ((PendingMessageInfo) arrayList.get(size)).getClass();
            throw null;
        }
    }

    public final void S(long j) {
        this.k.i(j + ((this.F.e != 3 || l0()) ? e0 : 1000L));
    }

    public final void T(boolean z) throws ExoPlaybackException {
        MediaSource.MediaPeriodId mediaPeriodId = this.v.j.g.f3014a;
        long jV = V(mediaPeriodId, this.F.s, true, false);
        if (jV != this.F.s) {
            PlaybackInfo playbackInfo = this.F;
            this.F = y(mediaPeriodId, jV, playbackInfo.c, playbackInfo.d, z, 5);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:35|(10:(9:102|37|(1:45)(1:43)|46|(1:53)|54|55|56|57)(1:60)|95|78|79|104|80|81|82|56|57)|100|61|(1:63)(1:64)|65|(1:67)(1:69)|68|70|71|(1:73)(1:74)|75|98|76|77) */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0156, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0158, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0159, code lost:
    
        r5 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a0 A[Catch: all -> 0x00a3, TryCatch #1 {all -> 0x00a3, blocks: (B:21:0x0096, B:23:0x00a0, B:30:0x00ac, B:32:0x00b2, B:33:0x00b5, B:35:0x00bd, B:39:0x00cd, B:43:0x00d5), top: B:97:0x0096 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Type inference failed for: r0v16, types: [androidx.media3.exoplayer.source.MediaPeriod, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void U(androidx.media3.exoplayer.ExoPlayerImplInternal.SeekPosition r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayerImplInternal.U(androidx.media3.exoplayer.ExoPlayerImplInternal$SeekPosition):void");
    }

    /* JADX WARN: Type inference failed for: r10v8, types: [androidx.media3.exoplayer.source.MediaPeriod, java.lang.Object] */
    public final long V(MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z, boolean z2) throws ExoPlaybackException {
        RendererHolder[] rendererHolderArr;
        p0();
        w0(false, true);
        if (z2 || this.F.e == 3) {
            i0(2);
        }
        MediaPeriodQueue mediaPeriodQueue = this.v;
        MediaPeriodHolder mediaPeriodHolder = mediaPeriodQueue.j;
        MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodHolder;
        while (mediaPeriodHolder2 != null && !mediaPeriodId.equals(mediaPeriodHolder2.g.f3014a)) {
            mediaPeriodHolder2 = mediaPeriodHolder2.m;
        }
        if (z || mediaPeriodHolder != mediaPeriodHolder2 || (mediaPeriodHolder2 != null && mediaPeriodHolder2.p + j < 0)) {
            int i = 0;
            while (true) {
                rendererHolderArr = this.d;
                if (i >= rendererHolderArr.length) {
                    break;
                }
                i(i);
                i++;
            }
            this.b0 = -9223372036854775807L;
            if (mediaPeriodHolder2 != null) {
                while (mediaPeriodQueue.j != mediaPeriodHolder2) {
                    mediaPeriodQueue.a();
                }
                mediaPeriodQueue.o(mediaPeriodHolder2);
                mediaPeriodHolder2.p = 1000000000000L;
                l(new boolean[rendererHolderArr.length], mediaPeriodQueue.k.e());
                mediaPeriodHolder2.h = true;
            }
        }
        h();
        if (mediaPeriodHolder2 != null) {
            ?? r10 = mediaPeriodHolder2.f3013a;
            mediaPeriodQueue.o(mediaPeriodHolder2);
            if (!mediaPeriodHolder2.e) {
                mediaPeriodHolder2.g = mediaPeriodHolder2.g.b(j);
            } else if (mediaPeriodHolder2.f) {
                j = r10.d(j);
                r10.u(j - this.p, this.q);
            }
            O(j);
            B();
        } else {
            mediaPeriodQueue.b();
            O(j);
        }
        u(false);
        this.k.j(2);
        return j;
    }

    public final void W(PlayerMessage playerMessage) {
        playerMessage.getClass();
        HandlerWrapper handlerWrapper = this.k;
        if (playerMessage.e != this.m) {
            handlerWrapper.d(15, playerMessage).a();
            return;
        }
        synchronized (playerMessage) {
        }
        try {
            playerMessage.f3022a.i(playerMessage.c, playerMessage.d);
            playerMessage.a(true);
            int i = this.F.e;
            if (i == 3 || i == 2) {
                handlerWrapper.j(2);
            }
        } catch (Throwable th) {
            playerMessage.a(true);
            throw th;
        }
    }

    public final void X(PlayerMessage playerMessage) {
        Looper looper = playerMessage.e;
        if (looper.getThread().isAlive()) {
            this.t.b(looper, null).post(new a(this, playerMessage));
        } else {
            Log.g("TAG", "Trying to send message on a dead thread.");
            playerMessage.a(false);
        }
    }

    public final void Y(AudioAttributes audioAttributes, boolean z) {
        this.g.g(audioAttributes);
        if (!z) {
            audioAttributes = null;
        }
        AudioFocusManager audioFocusManager = this.D;
        if (!Objects.equals(audioFocusManager.d, audioAttributes)) {
            audioFocusManager.d = audioAttributes;
            int i = audioAttributes == null ? 0 : 1;
            audioFocusManager.f = i;
            Assertions.a("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", i == 1 || i == 0);
        }
        PlaybackInfo playbackInfo = this.F;
        boolean z2 = playbackInfo.l;
        t0(audioFocusManager.c(playbackInfo.e, z2), playbackInfo.n, playbackInfo.m, z2);
    }

    public final void Z(AtomicBoolean atomicBoolean, boolean z) {
        if (this.P != z) {
            this.P = z;
            if (!z) {
                for (RendererHolder rendererHolder : this.d) {
                    rendererHolder.k();
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
    public final void a() {
        this.k.j(10);
    }

    public final void a0(MediaSourceListUpdateMessage mediaSourceListUpdateMessage) throws Throwable {
        this.G.a(1);
        int i = mediaSourceListUpdateMessage.c;
        ShuffleOrder shuffleOrder = mediaSourceListUpdateMessage.b;
        ArrayList arrayList = mediaSourceListUpdateMessage.f3005a;
        if (i != -1) {
            this.T = new SeekPosition(new PlaylistTimeline(arrayList, shuffleOrder), mediaSourceListUpdateMessage.c, mediaSourceListUpdateMessage.d);
        }
        MediaSourceList mediaSourceList = this.w;
        ArrayList arrayList2 = mediaSourceList.b;
        mediaSourceList.g(0, arrayList2.size());
        v(mediaSourceList.a(arrayList2.size(), arrayList, shuffleOrder), false);
    }

    @Override // androidx.media3.exoplayer.PlayerMessage.Sender
    public final synchronized void b(PlayerMessage playerMessage) {
        if (!this.H && this.m.getThread().isAlive()) {
            this.k.d(14, playerMessage).a();
            return;
        }
        Log.g("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        playerMessage.a(false);
    }

    public final void b0(boolean z) throws ExoPlaybackException {
        this.I = z;
        N();
        if (this.J) {
            MediaPeriodQueue mediaPeriodQueue = this.v;
            if (mediaPeriodQueue.k != mediaPeriodQueue.j) {
                T(true);
                u(false);
            }
        }
    }

    public final void c(MediaSourceListUpdateMessage mediaSourceListUpdateMessage, int i) throws Throwable {
        this.G.a(1);
        MediaSourceList mediaSourceList = this.w;
        if (i == -1) {
            i = mediaSourceList.b.size();
        }
        v(mediaSourceList.a(i, mediaSourceListUpdateMessage.f3005a, mediaSourceListUpdateMessage.b), false);
    }

    public final void c0(PlaybackParameters playbackParameters) {
        this.k.k(16);
        DefaultMediaClock defaultMediaClock = this.r;
        defaultMediaClock.c(playbackParameters);
        PlaybackParameters playbackParametersD = defaultMediaClock.d();
        x(playbackParametersD, playbackParametersD.f2871a, true, true);
    }

    public final boolean d() {
        if (!this.C) {
            return false;
        }
        for (RendererHolder rendererHolder : this.d) {
            if (rendererHolder.e()) {
                return true;
            }
        }
        return false;
    }

    public final void d0(ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.a0 = preloadConfiguration;
        Timeline timeline = this.F.f3020a;
        MediaPeriodQueue mediaPeriodQueue = this.v;
        mediaPeriodQueue.i = preloadConfiguration;
        mediaPeriodQueue.i.getClass();
        if (mediaPeriodQueue.r.isEmpty()) {
            return;
        }
        mediaPeriodQueue.n(new ArrayList());
    }

    public final void e() throws ExoPlaybackException {
        L();
        T(true);
    }

    public final void e0(int i) throws ExoPlaybackException {
        this.N = i;
        Timeline timeline = this.F.f3020a;
        MediaPeriodQueue mediaPeriodQueue = this.v;
        mediaPeriodQueue.g = i;
        int iS = mediaPeriodQueue.s(timeline);
        if ((iS & 1) != 0) {
            T(true);
        } else if ((iS & 2) != 0) {
            h();
        }
        u(false);
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public final void f(MediaPeriod mediaPeriod) {
        this.k.d(8, mediaPeriod).a();
    }

    public final void f0(SeekParameters seekParameters) {
        this.E = seekParameters;
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public final void g(SequenceableLoader sequenceableLoader) {
        this.k.d(9, (MediaPeriod) sequenceableLoader).a();
    }

    public final void g0(boolean z) throws ExoPlaybackException {
        this.O = z;
        Timeline timeline = this.F.f3020a;
        MediaPeriodQueue mediaPeriodQueue = this.v;
        mediaPeriodQueue.h = z;
        int iS = mediaPeriodQueue.s(timeline);
        if ((iS & 1) != 0) {
            T(true);
        } else if ((iS & 2) != 0) {
            h();
        }
        u(false);
    }

    public final void h() {
        Renderer renderer;
        if (this.C && d()) {
            for (RendererHolder rendererHolder : this.d) {
                int iB = rendererHolder.b();
                if (rendererHolder.e()) {
                    int i = rendererHolder.d;
                    boolean z = i == 4 || i == 2;
                    int i2 = i != 4 ? 0 : 1;
                    if (z) {
                        renderer = rendererHolder.f3024a;
                    } else {
                        renderer = rendererHolder.c;
                        renderer.getClass();
                    }
                    rendererHolder.a(renderer, this.r);
                    rendererHolder.i(z);
                    rendererHolder.d = i2;
                }
                this.S -= iB - rendererHolder.b();
            }
            this.b0 = -9223372036854775807L;
        }
    }

    public final void h0(ShuffleOrder shuffleOrder) throws Throwable {
        this.G.a(1);
        MediaSourceList mediaSourceList = this.w;
        int size = mediaSourceList.b.size();
        if (shuffleOrder.getLength() != size) {
            shuffleOrder = shuffleOrder.d().g(size);
        }
        mediaSourceList.j = shuffleOrder;
        v(mediaSourceList.b(), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x022a  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean handleMessage(android.os.Message r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 738
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayerImplInternal.handleMessage(android.os.Message):boolean");
    }

    public final void i(int i) {
        RendererHolder[] rendererHolderArr = this.d;
        int iB = rendererHolderArr[i].b();
        RendererHolder rendererHolder = rendererHolderArr[i];
        Renderer renderer = rendererHolder.f3024a;
        DefaultMediaClock defaultMediaClock = this.r;
        rendererHolder.a(renderer, defaultMediaClock);
        Renderer renderer2 = rendererHolder.c;
        if (renderer2 != null) {
            boolean z = (renderer2.getState() == 0 || rendererHolder.d == 3) ? false : true;
            rendererHolder.a(renderer2, defaultMediaClock);
            rendererHolder.i(false);
            if (z) {
                Renderer renderer3 = rendererHolder.f3024a;
                renderer2.getClass();
                renderer2.i(17, renderer3);
            }
        }
        rendererHolder.d = 0;
        F(i, false);
        this.S -= iB;
    }

    public final void i0(int i) {
        PlaybackInfo playbackInfo = this.F;
        if (playbackInfo.e != i) {
            if (i != 2) {
                this.Z = -9223372036854775807L;
            }
            this.F = playbackInfo.h(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:409:0x0653  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x06df  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x06fc  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x07a7  */
    /* JADX WARN: Removed duplicated region for block: B:510:0x07f5  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x082f  */
    /* JADX WARN: Removed duplicated region for block: B:531:0x0832  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x083a  */
    /* JADX WARN: Removed duplicated region for block: B:542:0x086c  */
    /* JADX WARN: Removed duplicated region for block: B:549:0x0878  */
    /* JADX WARN: Removed duplicated region for block: B:552:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:554:0x08d8  */
    /* JADX WARN: Type inference failed for: r1v89, types: [androidx.media3.exoplayer.source.MediaPeriod, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v130, types: [androidx.media3.exoplayer.source.MediaPeriod, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.media3.exoplayer.source.MediaPeriod, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v42, types: [androidx.media3.exoplayer.source.MediaPeriod, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v59, types: [androidx.media3.exoplayer.source.MediaPeriod, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v64 */
    /* JADX WARN: Type inference failed for: r3v65, types: [int] */
    /* JADX WARN: Type inference failed for: r3v66 */
    /* JADX WARN: Type inference failed for: r4v55, types: [androidx.media3.exoplayer.PlayerMessage$Target, androidx.media3.exoplayer.Renderer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v31, types: [androidx.media3.exoplayer.PlayerMessage$Target, androidx.media3.exoplayer.Renderer, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j() throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 2307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayerImplInternal.j():void");
    }

    public final void j0(Object obj, AtomicBoolean atomicBoolean) {
        for (RendererHolder rendererHolder : this.d) {
            Renderer renderer = rendererHolder.f3024a;
            if (renderer.e() == 2) {
                int i = rendererHolder.d;
                if (i == 4 || i == 1) {
                    Renderer renderer2 = rendererHolder.c;
                    renderer2.getClass();
                    renderer2.i(1, obj);
                } else {
                    renderer.i(1, obj);
                }
            }
        }
        int i2 = this.F.e;
        if (i2 == 3 || i2 == 2) {
            this.k.j(2);
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void k(MediaPeriodHolder mediaPeriodHolder, int i, boolean z, long j) throws ExoPlaybackException {
        RendererHolder rendererHolder = this.d[i];
        if (rendererHolder.f()) {
            return;
        }
        boolean z2 = mediaPeriodHolder == this.v.j;
        TrackSelectorResult trackSelectorResult = mediaPeriodHolder.o;
        RendererConfiguration rendererConfiguration = trackSelectorResult.b[i];
        ExoTrackSelection exoTrackSelection = trackSelectorResult.c[i];
        boolean z3 = l0() && this.F.e == 3;
        boolean z4 = !z && z3;
        this.S++;
        SampleStream sampleStream = mediaPeriodHolder.c[i];
        long j2 = mediaPeriodHolder.p;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodHolder.g.f3014a;
        Renderer renderer = rendererHolder.c;
        int length = exoTrackSelection != null ? exoTrackSelection.length() : 0;
        Format[] formatArr = new Format[length];
        for (int i2 = 0; i2 < length; i2++) {
            exoTrackSelection.getClass();
            formatArr[i2] = exoTrackSelection.i(i2);
        }
        int i3 = rendererHolder.d;
        DefaultMediaClock defaultMediaClock = this.r;
        if (i3 == 0 || i3 == 2 || i3 == 4) {
            rendererHolder.e = true;
            rendererHolder.f3024a.l(rendererConfiguration, formatArr, sampleStream, z4, z2, j, j2, mediaPeriodId);
            defaultMediaClock.a(rendererHolder.f3024a);
        } else {
            rendererHolder.f = true;
            renderer.getClass();
            renderer.l(rendererConfiguration, formatArr, sampleStream, z4, z2, j, j2, mediaPeriodId);
            defaultMediaClock.a(renderer);
        }
        Renderer.WakeupListener wakeupListener = new Renderer.WakeupListener() { // from class: androidx.media3.exoplayer.ExoPlayerImplInternal.1
            @Override // androidx.media3.exoplayer.Renderer.WakeupListener
            public final void a() {
                ExoPlayerImplInternal.this.Q = true;
            }

            @Override // androidx.media3.exoplayer.Renderer.WakeupListener
            public final void b() {
                ExoPlayerImplInternal exoPlayerImplInternal = ExoPlayerImplInternal.this;
                if (exoPlayerImplInternal.R) {
                    exoPlayerImplInternal.k.j(2);
                }
            }
        };
        Renderer rendererC = rendererHolder.c(mediaPeriodHolder);
        rendererC.getClass();
        rendererC.i(11, wakeupListener);
        if (z3 && z2) {
            rendererHolder.m();
        }
    }

    public final void k0(float f) {
        this.d0 = f;
        float f2 = f * this.D.g;
        for (RendererHolder rendererHolder : this.d) {
            Renderer renderer = rendererHolder.f3024a;
            if (renderer.e() == 1) {
                renderer.i(2, Float.valueOf(f2));
                Renderer renderer2 = rendererHolder.c;
                if (renderer2 != null) {
                    renderer2.i(2, Float.valueOf(f2));
                }
            }
        }
    }

    public final void l(boolean[] zArr, long j) throws ExoPlaybackException {
        RendererHolder[] rendererHolderArr;
        long j2;
        MediaPeriodHolder mediaPeriodHolder = this.v.k;
        TrackSelectorResult trackSelectorResult = mediaPeriodHolder.o;
        int i = 0;
        while (true) {
            rendererHolderArr = this.d;
            if (i >= rendererHolderArr.length) {
                break;
            }
            if (!trackSelectorResult.b(i)) {
                rendererHolderArr[i].k();
            }
            i++;
        }
        int i2 = 0;
        while (i2 < rendererHolderArr.length) {
            if (trackSelectorResult.b(i2) && rendererHolderArr[i2].c(mediaPeriodHolder) == null) {
                j2 = j;
                k(mediaPeriodHolder, i2, zArr[i2], j2);
            } else {
                j2 = j;
            }
            i2++;
            j = j2;
        }
    }

    public final boolean l0() {
        PlaybackInfo playbackInfo = this.F;
        return playbackInfo.l && playbackInfo.n == 0;
    }

    public final long m(Timeline timeline, Object obj, long j) {
        Timeline.Period period = this.o;
        int i = timeline.g(obj, period).c;
        Timeline.Window window = this.n;
        timeline.n(i, window);
        if (window.e == -9223372036854775807L || !window.a() || !window.h) {
            return -9223372036854775807L;
        }
        long j2 = window.f;
        return Util.I((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + android.os.SystemClock.elapsedRealtime()) - window.e) - (j + period.e);
    }

    public final boolean m0(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        if (mediaPeriodId.b() || timeline.p()) {
            return false;
        }
        int i = timeline.g(mediaPeriodId.f3130a, this.o).c;
        Timeline.Window window = this.n;
        timeline.n(i, window);
        return window.a() && window.h && window.e != -9223372036854775807L;
    }

    public final long n(MediaPeriodHolder mediaPeriodHolder) {
        if (mediaPeriodHolder == null) {
            return 0L;
        }
        long jMax = mediaPeriodHolder.p;
        if (!mediaPeriodHolder.e) {
            return jMax;
        }
        int i = 0;
        while (true) {
            RendererHolder[] rendererHolderArr = this.d;
            if (i >= rendererHolderArr.length) {
                return jMax;
            }
            if (rendererHolderArr[i].c(mediaPeriodHolder) != null) {
                Renderer rendererC = rendererHolderArr[i].c(mediaPeriodHolder);
                Objects.requireNonNull(rendererC);
                long jO = rendererC.o();
                if (jO == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(jO, jMax);
            }
            i++;
        }
    }

    public final void n0() {
        MediaPeriodHolder mediaPeriodHolder = this.v.j;
        if (mediaPeriodHolder == null) {
            return;
        }
        TrackSelectorResult trackSelectorResult = mediaPeriodHolder.o;
        int i = 0;
        while (true) {
            RendererHolder[] rendererHolderArr = this.d;
            if (i >= rendererHolderArr.length) {
                return;
            }
            if (trackSelectorResult.b(i)) {
                rendererHolderArr[i].m();
            }
            i++;
        }
    }

    public final Pair o(Timeline timeline) {
        long j = 0;
        if (timeline.p()) {
            return Pair.create(PlaybackInfo.u, 0L);
        }
        int iA = timeline.a(this.O);
        Pair pairI = timeline.i(this.n, this.o, iA, -9223372036854775807L);
        MediaSource.MediaPeriodId mediaPeriodIdQ = this.v.q(timeline, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (mediaPeriodIdQ.b()) {
            Object obj = mediaPeriodIdQ.f3130a;
            Timeline.Period period = this.o;
            timeline.g(obj, period);
            if (mediaPeriodIdQ.c == period.e(mediaPeriodIdQ.b)) {
                period.g.getClass();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(mediaPeriodIdQ, Long.valueOf(j));
    }

    public final void o0(boolean z, boolean z2) {
        M(z || !this.P, false, true, false);
        this.G.a(z2 ? 1 : 0);
        this.i.j(this.z);
        this.D.c(1, this.F.l);
        i0(1);
    }

    public final long p(long j) {
        MediaPeriodHolder mediaPeriodHolder = this.v.m;
        if (mediaPeriodHolder == null) {
            return 0L;
        }
        return Math.max(0L, j - (this.U - mediaPeriodHolder.p));
    }

    public final void p0() {
        DefaultMediaClock defaultMediaClock = this.r;
        defaultMediaClock.i = false;
        StandaloneMediaClock standaloneMediaClock = defaultMediaClock.d;
        if (standaloneMediaClock.e) {
            standaloneMediaClock.a(standaloneMediaClock.A());
            standaloneMediaClock.e = false;
        }
        for (RendererHolder rendererHolder : this.d) {
            Renderer renderer = rendererHolder.c;
            Renderer renderer2 = rendererHolder.f3024a;
            if (RendererHolder.g(renderer2) && renderer2.getState() == 2) {
                renderer2.stop();
            }
            if (renderer != null && renderer.getState() != 0 && renderer.getState() == 2) {
                renderer.stop();
            }
        }
    }

    public final void q(int i) {
        PlaybackInfo playbackInfo = this.F;
        t0(i, playbackInfo.n, playbackInfo.m, playbackInfo.l);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [androidx.media3.exoplayer.source.SequenceableLoader, java.lang.Object] */
    public final void q0() {
        MediaPeriodHolder mediaPeriodHolder = this.v.m;
        boolean z = this.M || (mediaPeriodHolder != null && mediaPeriodHolder.f3013a.b());
        PlaybackInfo playbackInfo = this.F;
        if (z != playbackInfo.g) {
            this.F = playbackInfo.b(z);
        }
    }

    public final void r() {
        k0(this.d0);
    }

    public final void r0(MediaSource.MediaPeriodId mediaPeriodId, TrackGroupArray trackGroupArray, TrackSelectorResult trackSelectorResult) {
        long j;
        long j2;
        MediaPeriodQueue mediaPeriodQueue = this.v;
        MediaPeriodHolder mediaPeriodHolder = mediaPeriodQueue.m;
        mediaPeriodHolder.getClass();
        if (mediaPeriodHolder == mediaPeriodQueue.j) {
            j = this.U;
            j2 = mediaPeriodHolder.p;
        } else {
            j = this.U - mediaPeriodHolder.p;
            j2 = mediaPeriodHolder.g.b;
        }
        long j3 = j - j2;
        long jP = p(mediaPeriodHolder.d());
        long jC = m0(this.F.f3020a, mediaPeriodHolder.g.f3014a) ? this.x.c() : -9223372036854775807L;
        Timeline timeline = this.F.f3020a;
        float f = this.r.d().f2871a;
        boolean z = this.F.l;
        this.i.b(new LoadControl.Parameters(this.z, timeline, mediaPeriodId, j3, jP, f, this.K, jC), trackSelectorResult.c);
    }

    public final void s(MediaPeriod mediaPeriod) {
        MediaPeriodQueue mediaPeriodQueue = this.v;
        MediaPeriodHolder mediaPeriodHolder = mediaPeriodQueue.m;
        if (mediaPeriodHolder != null && mediaPeriodHolder.f3013a == mediaPeriod) {
            mediaPeriodQueue.m(this.U);
            B();
            return;
        }
        MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodQueue.n;
        if (mediaPeriodHolder2 == null || mediaPeriodHolder2.f3013a != mediaPeriod) {
            return;
        }
        C();
    }

    public final void s0(int i, int i2, List list) throws Throwable {
        this.G.a(1);
        MediaSourceList mediaSourceList = this.w;
        mediaSourceList.getClass();
        ArrayList arrayList = mediaSourceList.b;
        Assertions.b(i >= 0 && i <= i2 && i2 <= arrayList.size());
        Assertions.b(list.size() == i2 - i);
        for (int i3 = i; i3 < i2; i3++) {
            ((MediaSourceList.MediaSourceHolder) arrayList.get(i3)).f3018a.L((MediaItem) list.get(i3 - i));
        }
        v(mediaSourceList.b(), false);
    }

    public final void t(IOException iOException, int i) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i);
        MediaPeriodHolder mediaPeriodHolder = this.v.j;
        if (mediaPeriodHolder != null) {
            exoPlaybackException = exoPlaybackException.a(mediaPeriodHolder.g.f3014a);
        }
        Log.d("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
        o0(false, false);
        this.F = this.F.f(exoPlaybackException);
    }

    public final void t0(int i, int i2, int i3, boolean z) {
        boolean z2 = z && i != -1;
        if (i == -1) {
            i3 = 2;
        } else if (i3 == 2) {
            i3 = 1;
        }
        if (i == 0) {
            i2 = 1;
        } else if (i2 == 1) {
            i2 = 0;
        }
        PlaybackInfo playbackInfo = this.F;
        if (playbackInfo.l == z2 && playbackInfo.n == i2 && playbackInfo.m == i3) {
            return;
        }
        this.F = playbackInfo.e(i3, i2, z2);
        w0(false, false);
        MediaPeriodQueue mediaPeriodQueue = this.v;
        for (MediaPeriodHolder mediaPeriodHolder = mediaPeriodQueue.j; mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.m) {
            for (ExoTrackSelection exoTrackSelection : mediaPeriodHolder.o.c) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.k(z2);
                }
            }
        }
        if (!l0()) {
            p0();
            u0();
            mediaPeriodQueue.m(this.U);
            return;
        }
        int i4 = this.F.e;
        HandlerWrapper handlerWrapper = this.k;
        if (i4 != 3) {
            if (i4 == 2) {
                handlerWrapper.j(2);
                return;
            }
            return;
        }
        DefaultMediaClock defaultMediaClock = this.r;
        defaultMediaClock.i = true;
        StandaloneMediaClock standaloneMediaClock = defaultMediaClock.d;
        if (!standaloneMediaClock.e) {
            standaloneMediaClock.g = standaloneMediaClock.d.elapsedRealtime();
            standaloneMediaClock.e = true;
        }
        n0();
        handlerWrapper.j(2);
    }

    public final void u(boolean z) {
        MediaPeriodHolder mediaPeriodHolder = this.v.m;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodHolder == null ? this.F.b : mediaPeriodHolder.g.f3014a;
        boolean zEquals = this.F.k.equals(mediaPeriodId);
        if (!zEquals) {
            this.F = this.F.c(mediaPeriodId);
        }
        PlaybackInfo playbackInfo = this.F;
        playbackInfo.q = mediaPeriodHolder == null ? playbackInfo.s : mediaPeriodHolder.d();
        PlaybackInfo playbackInfo2 = this.F;
        playbackInfo2.r = p(playbackInfo2.q);
        if ((!zEquals || z) && mediaPeriodHolder != null && mediaPeriodHolder.e) {
            r0(mediaPeriodHolder.g.f3014a, mediaPeriodHolder.n, mediaPeriodHolder.o);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Type inference failed for: r2v30, types: [androidx.media3.exoplayer.source.MediaPeriod, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void u0() {
        /*
            Method dump skipped, instructions count: 541
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayerImplInternal.u0():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x03c7  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0414  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0420  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0446  */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v32 */
    /* JADX WARN: Type inference failed for: r15v35 */
    /* JADX WARN: Type inference failed for: r2v51, types: [androidx.media3.exoplayer.MediaPeriodQueue] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v30 */
    /* JADX WARN: Type inference failed for: r8v34, types: [androidx.media3.common.Timeline] */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void v(androidx.media3.common.Timeline r39, boolean r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1107
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayerImplInternal.v(androidx.media3.common.Timeline, boolean):void");
    }

    public final void v0(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline2, MediaSource.MediaPeriodId mediaPeriodId2, long j, boolean z) {
        boolean zM0 = m0(timeline, mediaPeriodId);
        Object obj = mediaPeriodId.f3130a;
        if (!zM0) {
            PlaybackParameters playbackParameters = mediaPeriodId.b() ? PlaybackParameters.d : this.F.o;
            DefaultMediaClock defaultMediaClock = this.r;
            if (defaultMediaClock.d().equals(playbackParameters)) {
                return;
            }
            this.k.k(16);
            defaultMediaClock.c(playbackParameters);
            x(this.F.o, playbackParameters.f2871a, false, false);
            return;
        }
        Timeline.Period period = this.o;
        int i = timeline.g(obj, period).c;
        Timeline.Window window = this.n;
        timeline.n(i, window);
        MediaItem.LiveConfiguration liveConfiguration = window.i;
        LivePlaybackSpeedControl livePlaybackSpeedControl = this.x;
        livePlaybackSpeedControl.a(liveConfiguration);
        if (j != -9223372036854775807L) {
            livePlaybackSpeedControl.e(m(timeline, obj, j));
            return;
        }
        if (!Objects.equals(!timeline2.p() ? timeline2.m(timeline2.g(mediaPeriodId2.f3130a, period).c, window, 0L).f2878a : null, window.f2878a) || z) {
            livePlaybackSpeedControl.e(-9223372036854775807L);
        }
    }

    public final void w(MediaPeriod mediaPeriod) throws ExoPlaybackException {
        MediaPeriodHolder mediaPeriodHolder;
        MediaPeriodQueue mediaPeriodQueue = this.v;
        MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodQueue.m;
        DefaultMediaClock defaultMediaClock = this.r;
        if (mediaPeriodHolder2 != null && mediaPeriodHolder2.f3013a == mediaPeriod) {
            mediaPeriodHolder2.getClass();
            if (!mediaPeriodHolder2.e) {
                float f = defaultMediaClock.d().f2871a;
                PlaybackInfo playbackInfo = this.F;
                mediaPeriodHolder2.f(f, playbackInfo.f3020a, playbackInfo.l);
            }
            r0(mediaPeriodHolder2.g.f3014a, mediaPeriodHolder2.n, mediaPeriodHolder2.o);
            if (mediaPeriodHolder2 == mediaPeriodQueue.j) {
                O(mediaPeriodHolder2.g.b);
                l(new boolean[this.d.length], mediaPeriodQueue.k.e());
                mediaPeriodHolder2.h = true;
                PlaybackInfo playbackInfo2 = this.F;
                MediaSource.MediaPeriodId mediaPeriodId = playbackInfo2.b;
                long j = mediaPeriodHolder2.g.b;
                this.F = y(mediaPeriodId, j, playbackInfo2.c, j, false, 5);
            }
            B();
            return;
        }
        int i = 0;
        while (true) {
            if (i >= mediaPeriodQueue.r.size()) {
                mediaPeriodHolder = null;
                break;
            }
            mediaPeriodHolder = (MediaPeriodHolder) mediaPeriodQueue.r.get(i);
            if (mediaPeriodHolder.f3013a == mediaPeriod) {
                break;
            } else {
                i++;
            }
        }
        if (mediaPeriodHolder != null) {
            Assertions.f(true ^ mediaPeriodHolder.e);
            float f2 = defaultMediaClock.d().f2871a;
            PlaybackInfo playbackInfo3 = this.F;
            mediaPeriodHolder.f(f2, playbackInfo3.f3020a, playbackInfo3.l);
            MediaPeriodHolder mediaPeriodHolder3 = mediaPeriodQueue.n;
            if (mediaPeriodHolder3 == null || mediaPeriodHolder3.f3013a != mediaPeriod) {
                return;
            }
            C();
        }
    }

    public final void w0(boolean z, boolean z2) {
        this.K = z;
        this.L = (!z || z2) ? -9223372036854775807L : this.t.elapsedRealtime();
    }

    public final void x(PlaybackParameters playbackParameters, float f, boolean z, boolean z2) {
        int i;
        if (z) {
            if (z2) {
                this.G.a(1);
            }
            this.F = this.F.g(playbackParameters);
        }
        float f2 = playbackParameters.f2871a;
        MediaPeriodHolder mediaPeriodHolder = this.v.j;
        while (true) {
            i = 0;
            if (mediaPeriodHolder == null) {
                break;
            }
            ExoTrackSelection[] exoTrackSelectionArr = mediaPeriodHolder.o.c;
            int length = exoTrackSelectionArr.length;
            while (i < length) {
                ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i];
                if (exoTrackSelection != null) {
                    exoTrackSelection.j(f2);
                }
                i++;
            }
            mediaPeriodHolder = mediaPeriodHolder.m;
        }
        RendererHolder[] rendererHolderArr = this.d;
        int length2 = rendererHolderArr.length;
        while (i < length2) {
            RendererHolder rendererHolder = rendererHolderArr[i];
            float f3 = playbackParameters.f2871a;
            rendererHolder.f3024a.B(f, f3);
            Renderer renderer = rendererHolder.c;
            if (renderer != null) {
                renderer.B(f, f3);
            }
            i++;
        }
    }

    public final synchronized void x0(Supplier supplier, long j) {
        long jElapsedRealtime = this.t.elapsedRealtime() + j;
        boolean z = false;
        while (!((Boolean) supplier.get()).booleanValue() && j > 0) {
            try {
                this.t.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z = true;
            }
            j = jElapsedRealtime - this.t.elapsedRealtime();
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public final PlaybackInfo y(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, long j3, boolean z, int i) {
        boolean z2;
        this.X = (!this.X && j == this.F.s && mediaPeriodId.equals(this.F.b)) ? false : true;
        N();
        PlaybackInfo playbackInfo = this.F;
        TrackGroupArray trackGroupArray = playbackInfo.h;
        TrackSelectorResult trackSelectorResult = playbackInfo.i;
        List listT = playbackInfo.j;
        if (this.w.k) {
            MediaPeriodHolder mediaPeriodHolder = this.v.j;
            trackGroupArray = mediaPeriodHolder == null ? TrackGroupArray.d : mediaPeriodHolder.n;
            trackSelectorResult = mediaPeriodHolder == null ? this.h : mediaPeriodHolder.o;
            ExoTrackSelection[] exoTrackSelectionArr = trackSelectorResult.c;
            ImmutableList.Builder builder = new ImmutableList.Builder();
            boolean z3 = false;
            for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
                if (exoTrackSelection != null) {
                    Metadata metadata = exoTrackSelection.i(0).l;
                    if (metadata == null) {
                        builder.h(new Metadata(new Metadata.Entry[0]));
                    } else {
                        builder.h(metadata);
                        z3 = true;
                    }
                }
            }
            listT = z3 ? builder.j() : ImmutableList.t();
            if (mediaPeriodHolder != null) {
                MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.g;
                if (mediaPeriodInfo.c != j2) {
                    mediaPeriodHolder.g = mediaPeriodInfo.a(j2);
                }
            }
            RendererHolder[] rendererHolderArr = this.d;
            MediaPeriodQueue mediaPeriodQueue = this.v;
            MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodQueue.j;
            if (mediaPeriodHolder2 == mediaPeriodQueue.k && mediaPeriodHolder2 != null) {
                TrackSelectorResult trackSelectorResult2 = mediaPeriodHolder2.o;
                int i2 = 0;
                boolean z4 = false;
                while (true) {
                    if (i2 >= rendererHolderArr.length) {
                        z2 = true;
                        break;
                    }
                    if (trackSelectorResult2.b(i2)) {
                        if (rendererHolderArr[i2].f3024a.e() != 1) {
                            z2 = false;
                            break;
                        }
                        if (trackSelectorResult2.b[i2].f3023a != 0) {
                            z4 = true;
                        }
                    }
                    i2++;
                }
                boolean z5 = z4 && z2;
                if (z5 != this.R) {
                    this.R = z5;
                    if (!z5 && this.F.p) {
                        this.k.j(2);
                    }
                }
            }
        } else if (!mediaPeriodId.equals(playbackInfo.b)) {
            trackGroupArray = TrackGroupArray.d;
            trackSelectorResult = this.h;
            listT = ImmutableList.t();
        }
        TrackGroupArray trackGroupArray2 = trackGroupArray;
        TrackSelectorResult trackSelectorResult3 = trackSelectorResult;
        List list = listT;
        if (z) {
            PlaybackInfoUpdate playbackInfoUpdate = this.G;
            if (!playbackInfoUpdate.d || playbackInfoUpdate.e == 5) {
                playbackInfoUpdate.f3006a = true;
                playbackInfoUpdate.d = true;
                playbackInfoUpdate.e = i;
            } else {
                Assertions.b(i == 5);
            }
        }
        PlaybackInfo playbackInfo2 = this.F;
        return playbackInfo2.d(mediaPeriodId, j, j2, j3, p(playbackInfo2.q), trackGroupArray2, trackSelectorResult3, list);
    }
}
