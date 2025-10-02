package androidx.media3.exoplayer;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.media.metrics.MediaMetricsManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.BasePlayer;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Format;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.BackgroundThreadStateHandler;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.AudioBecomingNoisyManager;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayerImplInternal;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.media3.exoplayer.PlayerMessage;
import androidx.media3.exoplayer.StreamVolumeManager;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.analytics.MediaMetricsListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.source.MaskingMediaSource;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.video.VideoDecoderOutputBufferRenderer;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionListener;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
final class ExoPlayerImpl extends BasePlayer implements ExoPlayer {
    public static final /* synthetic */ int k0 = 0;
    public final FrameMetadataListener A;
    public final AudioBecomingNoisyManager B;
    public final WakeLockManager C;
    public final WifiLockManager D;
    public final long E;
    public final BackgroundThreadStateHandler F;
    public int G;
    public boolean H;
    public int I;
    public int J;
    public boolean K;
    public final SeekParameters L;
    public ShuffleOrder M;
    public final ExoPlayer.PreloadConfiguration N;
    public Player.Commands O;
    public MediaMetadata P;
    public Object Q;
    public Surface R;
    public SurfaceHolder S;
    public SphericalGLSurfaceView T;
    public boolean U;
    public TextureView V;
    public final int W;
    public Size X;
    public final AudioAttributes Y;
    public float Z;
    public boolean a0;
    public final TrackSelectorResult b;
    public CueGroup b0;
    public final Player.Commands c;
    public final boolean c0;
    public final ConditionVariable d;
    public boolean d0;
    public final Context e;
    public final int e0;
    public final Player f;
    public VideoSize f0;
    public final Renderer[] g;
    public MediaMetadata g0;
    public final Renderer[] h;
    public PlaybackInfo h0;
    public final TrackSelector i;
    public int i0;
    public final HandlerWrapper j;
    public long j0;
    public final m k;
    public final ExoPlayerImplInternal l;
    public final ListenerSet m;
    public final CopyOnWriteArraySet n;
    public final Timeline.Period o;
    public final ArrayList p;
    public final boolean q;
    public final MediaSource.Factory r;
    public final AnalyticsCollector s;
    public final Looper t;
    public final BandwidthMeter u;
    public final long v;
    public final long w;
    public final long x;
    public final SystemClock y;
    public final ComponentListener z;

    @RequiresApi
    public static final class Api31 {
    }

    public final class ComponentListener implements VideoRendererEventListener, AudioRendererEventListener, TextOutput, MetadataOutput, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.VideoSurfaceListener, AudioBecomingNoisyManager.EventListener, StreamVolumeManager.Listener, ExoPlayer.AudioOffloadListener {
        public ComponentListener() {
        }

        @Override // androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener
        public final void A() {
            int i = ExoPlayerImpl.k0;
            ExoPlayerImpl.this.z0();
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public final void B(Surface surface) {
            int i = ExoPlayerImpl.k0;
            ExoPlayerImpl.this.v0(surface);
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public final void C() {
            int i = ExoPlayerImpl.k0;
            ExoPlayerImpl.this.v0(null);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public final void a(VideoSize videoSize) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.f0 = videoSize;
            exoPlayerImpl.m.f(25, new f(videoSize, 7));
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public final void b(AudioSink.AudioTrackConfig audioTrackConfig) {
            ExoPlayerImpl.this.s.b(audioTrackConfig);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public final void c(String str) {
            ExoPlayerImpl.this.s.c(str);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public final void d(String str) {
            ExoPlayerImpl.this.s.d(str);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public final void e(DecoderCounters decoderCounters) {
            ExoPlayerImpl.this.s.e(decoderCounters);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public final void f(DecoderCounters decoderCounters) {
            ExoPlayerImpl.this.s.f(decoderCounters);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public final void g(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            ExoPlayerImpl.this.s.g(format, decoderReuseEvaluation);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public final void h(long j, Object obj) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.s.h(j, obj);
            if (exoPlayerImpl.Q == obj) {
                exoPlayerImpl.m.f(26, new i(2));
            }
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public final void i(DecoderCounters decoderCounters) {
            ExoPlayerImpl.this.s.i(decoderCounters);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public final void j(long j, long j2, String str) {
            ExoPlayerImpl.this.s.j(j, j2, str);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public final void k(int i, long j) {
            ExoPlayerImpl.this.s.k(i, j);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public final void l(int i, long j) {
            ExoPlayerImpl.this.s.l(i, j);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public final void m(Exception exc) {
            ExoPlayerImpl.this.s.m(exc);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public final void n(AudioSink.AudioTrackConfig audioTrackConfig) {
            ExoPlayerImpl.this.s.n(audioTrackConfig);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public final void o(boolean z) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            if (exoPlayerImpl.a0 == z) {
                return;
            }
            exoPlayerImpl.a0 = z;
            exoPlayerImpl.m.f(23, new k(z, 1));
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            int i3 = ExoPlayerImpl.k0;
            Surface surface = new Surface(surfaceTexture);
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.v0(surface);
            exoPlayerImpl.R = surface;
            exoPlayerImpl.r0(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            int i = ExoPlayerImpl.k0;
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.v0(null);
            exoPlayerImpl.r0(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            int i3 = ExoPlayerImpl.k0;
            ExoPlayerImpl.this.r0(i, i2);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public final void p(Exception exc) {
            ExoPlayerImpl.this.s.p(exc);
        }

        @Override // androidx.media3.exoplayer.text.TextOutput
        public final void q(List list) {
            ExoPlayerImpl.this.m.f(27, new f(list, 6));
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public final void r(long j) {
            ExoPlayerImpl.this.s.r(j);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public final void s(Exception exc) {
            ExoPlayerImpl.this.s.s(exc);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            int i4 = ExoPlayerImpl.k0;
            ExoPlayerImpl.this.r0(i2, i3);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            if (exoPlayerImpl.U) {
                exoPlayerImpl.v0(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            if (exoPlayerImpl.U) {
                exoPlayerImpl.v0(null);
            }
            exoPlayerImpl.r0(0, 0);
        }

        @Override // androidx.media3.exoplayer.text.TextOutput
        public final void t(CueGroup cueGroup) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.b0 = cueGroup;
            exoPlayerImpl.m.f(27, new f(cueGroup, 4));
        }

        @Override // androidx.media3.exoplayer.metadata.MetadataOutput
        public final void u(Metadata metadata) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            ListenerSet listenerSet = exoPlayerImpl.m;
            MediaMetadata.Builder builderA = exoPlayerImpl.g0.a();
            int i = 0;
            while (true) {
                Metadata.Entry[] entryArr = metadata.f2868a;
                if (i >= entryArr.length) {
                    break;
                }
                entryArr[i].c(builderA);
                i++;
            }
            exoPlayerImpl.g0 = new MediaMetadata(builderA);
            MediaMetadata mediaMetadataH0 = exoPlayerImpl.h0();
            if (!mediaMetadataH0.equals(exoPlayerImpl.P)) {
                exoPlayerImpl.P = mediaMetadataH0;
                listenerSet.c(14, new f(this, 2));
            }
            listenerSet.c(28, new f(metadata, 5));
            listenerSet.b();
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public final void v(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            ExoPlayerImpl.this.s.v(format, decoderReuseEvaluation);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public final void w(DecoderCounters decoderCounters) {
            ExoPlayerImpl.this.s.w(decoderCounters);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public final void x(long j, long j2, String str) {
            ExoPlayerImpl.this.s.x(j, j2, str);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public final void y(int i, long j, long j2) {
            ExoPlayerImpl.this.s.y(i, j, j2);
        }

        @Override // androidx.media3.exoplayer.AudioBecomingNoisyManager.EventListener
        public final void z() {
            int i = ExoPlayerImpl.k0;
            ExoPlayerImpl.this.x0(3, false);
        }
    }

    public static final class FrameMetadataListener implements VideoFrameMetadataListener, CameraMotionListener, PlayerMessage.Target {
        public VideoFrameMetadataListener d;
        public CameraMotionListener e;
        public VideoFrameMetadataListener f;
        public CameraMotionListener g;

        @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
        public final void a(float[] fArr, long j) {
            CameraMotionListener cameraMotionListener = this.g;
            if (cameraMotionListener != null) {
                cameraMotionListener.a(fArr, j);
            }
            CameraMotionListener cameraMotionListener2 = this.e;
            if (cameraMotionListener2 != null) {
                cameraMotionListener2.a(fArr, j);
            }
        }

        @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
        public final void c() {
            CameraMotionListener cameraMotionListener = this.g;
            if (cameraMotionListener != null) {
                cameraMotionListener.c();
            }
            CameraMotionListener cameraMotionListener2 = this.e;
            if (cameraMotionListener2 != null) {
                cameraMotionListener2.c();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
        public final void d(long j, long j2, Format format, MediaFormat mediaFormat) {
            long j3;
            long j4;
            Format format2;
            MediaFormat mediaFormat2;
            VideoFrameMetadataListener videoFrameMetadataListener = this.f;
            if (videoFrameMetadataListener != null) {
                videoFrameMetadataListener.d(j, j2, format, mediaFormat);
                mediaFormat2 = mediaFormat;
                format2 = format;
                j4 = j2;
                j3 = j;
            } else {
                j3 = j;
                j4 = j2;
                format2 = format;
                mediaFormat2 = mediaFormat;
            }
            VideoFrameMetadataListener videoFrameMetadataListener2 = this.d;
            if (videoFrameMetadataListener2 != null) {
                videoFrameMetadataListener2.d(j3, j4, format2, mediaFormat2);
            }
        }

        @Override // androidx.media3.exoplayer.PlayerMessage.Target
        public final void i(int i, Object obj) {
            if (i == 7) {
                this.d = (VideoFrameMetadataListener) obj;
                return;
            }
            if (i == 8) {
                this.e = (CameraMotionListener) obj;
                return;
            }
            if (i != 10000) {
                return;
            }
            SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.f = null;
                this.g = null;
            } else {
                this.f = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.g = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }
    }

    public static final class MediaSourceHolderSnapshot implements MediaSourceInfoHolder {

        /* renamed from: a, reason: collision with root package name */
        public final Object f3003a;
        public Timeline b;

        public MediaSourceHolderSnapshot(Object obj, MaskingMediaSource maskingMediaSource) {
            this.f3003a = obj;
            this.b = maskingMediaSource.r;
        }

        @Override // androidx.media3.exoplayer.MediaSourceInfoHolder
        public final Object a() {
            return this.f3003a;
        }

        @Override // androidx.media3.exoplayer.MediaSourceInfoHolder
        public final Timeline b() {
            return this.b;
        }
    }

    static {
        MediaLibraryInfo.a("media3.exoplayer");
    }

    public ExoPlayerImpl(ExoPlayer.Builder builder) {
        Context context = builder.f3001a;
        this.d = new ConditionVariable();
        try {
            Log.f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.7.1] [" + Util.b + "]");
            Looper looper = builder.g;
            SystemClock systemClock = builder.b;
            this.e = context.getApplicationContext();
            this.s = new DefaultAnalyticsCollector(systemClock);
            this.e0 = builder.h;
            this.Y = builder.i;
            this.W = builder.j;
            this.a0 = false;
            this.E = builder.r;
            ComponentListener componentListener = new ComponentListener();
            this.z = componentListener;
            this.A = new FrameMetadataListener();
            Handler handler = new Handler(looper);
            RenderersFactory renderersFactory = (RenderersFactory) builder.c.get();
            Renderer[] rendererArrA = renderersFactory.a(handler, componentListener, componentListener, componentListener, componentListener);
            this.g = rendererArrA;
            Assertions.f(rendererArrA.length > 0);
            this.h = new Renderer[rendererArrA.length];
            int i = 0;
            while (true) {
                Renderer[] rendererArr = this.h;
                if (i >= rendererArr.length) {
                    break;
                }
                renderersFactory.b(this.g[i]);
                rendererArr[i] = null;
                i++;
            }
            this.i = (TrackSelector) builder.e.get();
            this.r = (MediaSource.Factory) builder.d.get();
            this.u = (BandwidthMeter) builder.f.get();
            this.q = builder.k;
            this.L = builder.l;
            this.v = builder.m;
            this.w = builder.n;
            this.x = builder.o;
            this.t = looper;
            this.y = systemClock;
            this.f = this;
            this.m = new ListenerSet(looper, systemClock, new m(this));
            this.n = new CopyOnWriteArraySet();
            this.p = new ArrayList();
            this.M = new ShuffleOrder.DefaultShuffleOrder();
            this.N = ExoPlayer.PreloadConfiguration.f3002a;
            Renderer[] rendererArr2 = this.g;
            this.b = new TrackSelectorResult(new RendererConfiguration[rendererArr2.length], new ExoTrackSelection[rendererArr2.length], Tracks.b, null);
            this.o = new Timeline.Period();
            Player.Commands.Builder builder2 = new Player.Commands.Builder();
            FlagSet.Builder builder3 = builder2.f2873a;
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            builder3.getClass();
            for (int i2 = 0; i2 < 20; i2++) {
                builder3.a(iArr[i2]);
            }
            TrackSelector trackSelector = this.i;
            trackSelector.getClass();
            builder2.a(29, trackSelector instanceof DefaultTrackSelector);
            builder2.a(23, false);
            builder2.a(25, false);
            builder2.a(33, false);
            builder2.a(26, false);
            builder2.a(34, false);
            FlagSet flagSetB = builder3.b();
            this.c = new Player.Commands(flagSetB);
            FlagSet.Builder builder4 = new Player.Commands.Builder().f2873a;
            builder4.getClass();
            for (int i3 = 0; i3 < flagSetB.f2852a.size(); i3++) {
                builder4.a(flagSetB.a(i3));
            }
            builder4.a(4);
            builder4.a(10);
            this.O = new Player.Commands(builder4.b());
            this.j = this.y.b(this.t, null);
            m mVar = new m(this);
            this.k = mVar;
            this.h0 = PlaybackInfo.j(this.b);
            this.s.R(this.f, this.t);
            final PlayerId playerId = new PlayerId(builder.u);
            ExoPlayerImplInternal exoPlayerImplInternal = new ExoPlayerImplInternal(this.e, this.g, this.h, this.i, this.b, new DefaultLoadControl(), this.u, this.G, this.H, this.s, this.L, builder.p, builder.q, this.t, this.y, mVar, playerId, this.N);
            this.l = exoPlayerImplInternal;
            Looper looper2 = exoPlayerImplInternal.m;
            this.Z = 1.0f;
            this.G = 0;
            MediaMetadata mediaMetadata = MediaMetadata.B;
            this.P = mediaMetadata;
            this.g0 = mediaMetadata;
            this.i0 = -1;
            this.b0 = CueGroup.b;
            this.c0 = true;
            H(this.s);
            this.u.e(new Handler(this.t), this.s);
            this.n.add(this.z);
            if (Util.f2928a >= 31) {
                final Context context2 = this.e;
                final boolean z = builder.s;
                this.y.b(exoPlayerImplInternal.m, null).post(new Runnable() { // from class: androidx.media3.exoplayer.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        Context context3 = context2;
                        MediaMetricsManager mediaMetricsManagerB = androidx.media3.exoplayer.analytics.o.b(context3.getSystemService("media_metrics"));
                        MediaMetricsListener mediaMetricsListener = mediaMetricsManagerB == null ? null : new MediaMetricsListener(context3, mediaMetricsManagerB.createPlaybackSession());
                        if (mediaMetricsListener == null) {
                            Log.g("ExoPlayerImpl", "MediaMetricsService unavailable.");
                            return;
                        }
                        if (z) {
                            this.s.e0(mediaMetricsListener);
                        }
                        playerId.b(mediaMetricsListener.d.getSessionId());
                    }
                });
            }
            BackgroundThreadStateHandler backgroundThreadStateHandler = new BackgroundThreadStateHandler(0, looper2, this.t, this.y, new m(this));
            this.F = backgroundThreadStateHandler;
            backgroundThreadStateHandler.f2905a.post(new a(this, 2));
            AudioBecomingNoisyManager audioBecomingNoisyManager = new AudioBecomingNoisyManager(context, looper2, builder.g, this.z, this.y);
            this.B = audioBecomingNoisyManager;
            audioBecomingNoisyManager.a();
            this.C = new WakeLockManager(context, looper2, this.y);
            this.D = new WifiLockManager(context, looper2, this.y);
            int i4 = DeviceInfo.c;
            this.f0 = VideoSize.d;
            this.X = Size.c;
            exoPlayerImplInternal.k.f(31, 0, this.Y).a();
            t0(1, 3, this.Y);
            t0(2, 4, Integer.valueOf(this.W));
            t0(2, 5, 0);
            t0(1, 9, Boolean.valueOf(this.a0));
            t0(2, 7, this.A);
            t0(6, 8, this.A);
            t0(-1, 16, Integer.valueOf(this.e0));
            this.d.e();
        } catch (Throwable th) {
            this.d.e();
            throw th;
        }
    }

    public static long n0(PlaybackInfo playbackInfo) {
        Timeline.Window window = new Timeline.Window();
        Timeline.Period period = new Timeline.Period();
        playbackInfo.f3020a.g(playbackInfo.b.f3130a, period);
        long j = playbackInfo.c;
        return j == -9223372036854775807L ? playbackInfo.f3020a.m(period.c, window, 0L).k : period.e + j;
    }

    public static PlaybackInfo o0(PlaybackInfo playbackInfo, int i) {
        PlaybackInfo playbackInfoH = playbackInfo.h(i);
        return (i == 1 || i == 4) ? playbackInfoH.b(false) : playbackInfoH;
    }

    public final void A0() {
        this.d.c();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.t;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i = Util.f2928a;
            Locale locale = Locale.US;
            String strJ = YU.a.j("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.c0) {
                throw new IllegalStateException(strJ);
            }
            Log.h("ExoPlayerImpl", strJ, this.d0 ? null : new IllegalStateException());
            this.d0 = true;
        }
    }

    @Override // androidx.media3.common.Player
    public final void B(List list) {
        A0();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(this.r.b((MediaItem) list.get(i)));
        }
        A0();
        m0(this.h0);
        getCurrentPosition();
        this.I++;
        ArrayList arrayList2 = this.p;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i2 = size - 1; i2 >= 0; i2--) {
                arrayList2.remove(i2);
            }
            this.M = this.M.f(size);
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            MediaSourceList.MediaSourceHolder mediaSourceHolder = new MediaSourceList.MediaSourceHolder((MediaSource) arrayList.get(i3), this.q);
            arrayList3.add(mediaSourceHolder);
            arrayList2.add(i3, new MediaSourceHolderSnapshot(mediaSourceHolder.b, mediaSourceHolder.f3018a));
        }
        this.M = this.M.g(arrayList3.size());
        PlaylistTimeline playlistTimeline = new PlaylistTimeline(arrayList2, this.M);
        boolean zP = playlistTimeline.p();
        int i4 = playlistTimeline.e;
        if (!zP && -1 >= i4) {
            throw new IllegalSeekPositionException();
        }
        int iA = playlistTimeline.a(this.H);
        PlaybackInfo playbackInfoP0 = p0(this.h0, playlistTimeline, q0(playlistTimeline, iA, -9223372036854775807L));
        int i5 = playbackInfoP0.e;
        if (iA != -1 && i5 != 1) {
            i5 = (playlistTimeline.p() || iA >= i4) ? 4 : 2;
        }
        PlaybackInfo playbackInfoO0 = o0(playbackInfoP0, i5);
        this.l.k.d(17, new ExoPlayerImplInternal.MediaSourceListUpdateMessage(arrayList3, this.M, iA, Util.I(-9223372036854775807L))).a();
        y0(playbackInfoO0, 0, (this.h0.b.f3130a.equals(playbackInfoO0.b.f3130a) || this.h0.f3020a.p()) ? false : true, 4, l0(playbackInfoO0), -1, false);
    }

    @Override // androidx.media3.common.Player
    public final void E(boolean z) {
        A0();
        x0(1, z);
    }

    @Override // androidx.media3.common.Player
    public final CueGroup F() {
        A0();
        return this.b0;
    }

    @Override // androidx.media3.common.Player
    public final void G(Player.Listener listener) {
        A0();
        listener.getClass();
        this.m.e(listener);
    }

    @Override // androidx.media3.common.Player
    public final void H(Player.Listener listener) {
        listener.getClass();
        this.m.a(listener);
    }

    @Override // androidx.media3.common.Player
    public final int I() {
        A0();
        return this.h0.n;
    }

    @Override // androidx.media3.common.Player
    public final void J() {
        A0();
        final float fH = Util.h(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f);
        if (this.Z == fH) {
            return;
        }
        this.Z = fH;
        this.l.k.d(32, Float.valueOf(fH)).a();
        this.m.f(22, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.l
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                int i = ExoPlayerImpl.k0;
                ((Player.Listener) obj).i0(fH);
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final Timeline K() {
        A0();
        return this.h0.f3020a;
    }

    @Override // androidx.media3.common.Player
    public final Looper L() {
        return this.t;
    }

    @Override // androidx.media3.common.Player
    public final void N(TextureView textureView) {
        A0();
        if (textureView == null) {
            i0();
            return;
        }
        s0();
        this.V = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            Log.g("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.z);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            v0(null);
            r0(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            v0(surface);
            this.R = surface;
            r0(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // androidx.media3.common.Player
    public final Player.Commands P() {
        A0();
        return this.O;
    }

    @Override // androidx.media3.common.Player
    public final VideoSize Q() {
        A0();
        return this.f0;
    }

    @Override // androidx.media3.common.Player
    public final long R() {
        A0();
        return k0(this.h0);
    }

    @Override // androidx.media3.common.Player
    public final int S() {
        A0();
        int iM0 = m0(this.h0);
        if (iM0 == -1) {
            return 0;
        }
        return iM0;
    }

    @Override // androidx.media3.common.Player
    public final void T(int i) {
        A0();
        if (this.G != i) {
            this.G = i;
            this.l.k.e(11, i, 0).a();
            j jVar = new j(i, 0);
            ListenerSet listenerSet = this.m;
            listenerSet.c(8, jVar);
            w0();
            listenerSet.b();
        }
    }

    @Override // androidx.media3.common.Player
    public final void U(SurfaceView surfaceView) {
        A0();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        A0();
        if (holder == null || holder != this.S) {
            return;
        }
        i0();
    }

    @Override // androidx.media3.common.Player
    public final boolean V() {
        A0();
        return this.H;
    }

    @Override // androidx.media3.common.Player
    public final MediaMetadata X() {
        A0();
        return this.P;
    }

    @Override // androidx.media3.common.Player
    public final long Y() {
        A0();
        return this.v;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void b(MediaSource mediaSource) {
        A0();
        List listSingletonList = Collections.singletonList(mediaSource);
        A0();
        A0();
        m0(this.h0);
        getCurrentPosition();
        this.I++;
        ArrayList arrayList = this.p;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = size - 1; i >= 0; i--) {
                arrayList.remove(i);
            }
            this.M = this.M.f(size);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < listSingletonList.size(); i2++) {
            MediaSourceList.MediaSourceHolder mediaSourceHolder = new MediaSourceList.MediaSourceHolder((MediaSource) listSingletonList.get(i2), this.q);
            arrayList2.add(mediaSourceHolder);
            arrayList.add(i2, new MediaSourceHolderSnapshot(mediaSourceHolder.b, mediaSourceHolder.f3018a));
        }
        this.M = this.M.g(arrayList2.size());
        PlaylistTimeline playlistTimeline = new PlaylistTimeline(arrayList, this.M);
        boolean zP = playlistTimeline.p();
        int i3 = playlistTimeline.e;
        if (!zP && -1 >= i3) {
            throw new IllegalSeekPositionException();
        }
        int iA = playlistTimeline.a(this.H);
        PlaybackInfo playbackInfoP0 = p0(this.h0, playlistTimeline, q0(playlistTimeline, iA, -9223372036854775807L));
        int i4 = playbackInfoP0.e;
        if (iA != -1 && i4 != 1) {
            i4 = (playlistTimeline.p() || iA >= i3) ? 4 : 2;
        }
        PlaybackInfo playbackInfoO0 = o0(playbackInfoP0, i4);
        this.l.k.d(17, new ExoPlayerImplInternal.MediaSourceListUpdateMessage(arrayList2, this.M, iA, Util.I(-9223372036854775807L))).a();
        y0(playbackInfoO0, 0, (this.h0.b.f3130a.equals(playbackInfoO0.b.f3130a) || this.h0.f3020a.p()) ? false : true, 4, l0(playbackInfoO0), -1, false);
    }

    @Override // androidx.media3.common.Player
    public final void c(PlaybackParameters playbackParameters) {
        A0();
        if (this.h0.o.equals(playbackParameters)) {
            return;
        }
        PlaybackInfo playbackInfoG = this.h0.g(playbackParameters);
        this.I++;
        this.l.k.d(4, playbackParameters).a();
        y0(playbackInfoG, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // androidx.media3.common.Player
    public final PlaybackParameters d() {
        A0();
        return this.h0.o;
    }

    @Override // androidx.media3.common.Player
    public final boolean e() {
        A0();
        return this.h0.b.b();
    }

    @Override // androidx.media3.common.Player
    public final long f() {
        A0();
        return Util.U(this.h0.r);
    }

    @Override // androidx.media3.common.BasePlayer
    public final void f0(long j, int i, boolean z) {
        A0();
        if (i == -1) {
            return;
        }
        Assertions.b(i >= 0);
        Timeline timeline = this.h0.f3020a;
        if (timeline.p() || i < timeline.o()) {
            this.s.V();
            this.I++;
            if (e()) {
                Log.g("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate = new ExoPlayerImplInternal.PlaybackInfoUpdate(this.h0);
                playbackInfoUpdate.a(1);
                this.k.c(playbackInfoUpdate);
                return;
            }
            PlaybackInfo playbackInfoH = this.h0;
            int i2 = playbackInfoH.e;
            if (i2 == 3 || (i2 == 4 && !timeline.p())) {
                playbackInfoH = this.h0.h(2);
            }
            int iS = S();
            PlaybackInfo playbackInfoP0 = p0(playbackInfoH, timeline, q0(timeline, i, j));
            this.l.k.d(3, new ExoPlayerImplInternal.SeekPosition(timeline, i, Util.I(j))).a();
            y0(playbackInfoP0, 0, true, 1, l0(playbackInfoP0), iS, z);
        }
    }

    @Override // androidx.media3.common.Player
    public final void g(SurfaceView surfaceView) {
        A0();
        if (surfaceView instanceof VideoDecoderOutputBufferRenderer) {
            s0();
            v0(surfaceView);
            u0(surfaceView.getHolder());
            return;
        }
        boolean z = surfaceView instanceof SphericalGLSurfaceView;
        ComponentListener componentListener = this.z;
        if (z) {
            s0();
            this.T = (SphericalGLSurfaceView) surfaceView;
            PlayerMessage playerMessageJ0 = j0(this.A);
            Assertions.f(!playerMessageJ0.f);
            playerMessageJ0.c = ModuleDescriptor.MODULE_VERSION;
            SphericalGLSurfaceView sphericalGLSurfaceView = this.T;
            Assertions.f(true ^ playerMessageJ0.f);
            playerMessageJ0.d = sphericalGLSurfaceView;
            playerMessageJ0.b();
            this.T.d.add(componentListener);
            v0(this.T.getVideoSurface());
            u0(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        A0();
        if (holder == null) {
            i0();
            return;
        }
        s0();
        this.U = true;
        this.S = holder;
        holder.addCallback(componentListener);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            v0(null);
            r0(0, 0);
        } else {
            v0(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            r0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // androidx.media3.common.Player
    public final long getCurrentPosition() {
        A0();
        return Util.U(l0(this.h0));
    }

    @Override // androidx.media3.common.Player
    public final long getDuration() {
        A0();
        if (!e()) {
            return o();
        }
        PlaybackInfo playbackInfo = this.h0;
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.b;
        Timeline timeline = playbackInfo.f3020a;
        Object obj = mediaPeriodId.f3130a;
        Timeline.Period period = this.o;
        timeline.g(obj, period);
        return Util.U(period.a(mediaPeriodId.b, mediaPeriodId.c));
    }

    @Override // androidx.media3.common.Player
    public final Tracks h() {
        A0();
        return this.h0.i.d;
    }

    public final MediaMetadata h0() {
        Timeline timelineK = K();
        if (timelineK.p()) {
            return this.g0;
        }
        MediaItem mediaItem = timelineK.m(S(), this.f2847a, 0L).c;
        MediaMetadata.Builder builderA = this.g0.a();
        MediaMetadata mediaMetadata = mediaItem.d;
        builderA.getClass();
        if (mediaMetadata != null) {
            ImmutableList immutableList = mediaMetadata.A;
            byte[] bArr = mediaMetadata.f;
            CharSequence charSequence = mediaMetadata.f2866a;
            if (charSequence != null) {
                builderA.f2867a = charSequence;
            }
            CharSequence charSequence2 = mediaMetadata.b;
            if (charSequence2 != null) {
                builderA.b = charSequence2;
            }
            CharSequence charSequence3 = mediaMetadata.c;
            if (charSequence3 != null) {
                builderA.c = charSequence3;
            }
            CharSequence charSequence4 = mediaMetadata.d;
            if (charSequence4 != null) {
                builderA.d = charSequence4;
            }
            CharSequence charSequence5 = mediaMetadata.e;
            if (charSequence5 != null) {
                builderA.e = charSequence5;
            }
            if (bArr != null) {
                Integer num = mediaMetadata.g;
                builderA.f = bArr == null ? null : (byte[]) bArr.clone();
                builderA.g = num;
            }
            Integer num2 = mediaMetadata.h;
            if (num2 != null) {
                builderA.h = num2;
            }
            Integer num3 = mediaMetadata.i;
            if (num3 != null) {
                builderA.i = num3;
            }
            Integer num4 = mediaMetadata.j;
            if (num4 != null) {
                builderA.j = num4;
            }
            Boolean bool = mediaMetadata.k;
            if (bool != null) {
                builderA.k = bool;
            }
            Integer num5 = mediaMetadata.l;
            if (num5 != null) {
                builderA.l = num5;
            }
            Integer num6 = mediaMetadata.m;
            if (num6 != null) {
                builderA.l = num6;
            }
            Integer num7 = mediaMetadata.n;
            if (num7 != null) {
                builderA.m = num7;
            }
            Integer num8 = mediaMetadata.o;
            if (num8 != null) {
                builderA.n = num8;
            }
            Integer num9 = mediaMetadata.p;
            if (num9 != null) {
                builderA.o = num9;
            }
            Integer num10 = mediaMetadata.q;
            if (num10 != null) {
                builderA.p = num10;
            }
            Integer num11 = mediaMetadata.r;
            if (num11 != null) {
                builderA.q = num11;
            }
            CharSequence charSequence6 = mediaMetadata.s;
            if (charSequence6 != null) {
                builderA.r = charSequence6;
            }
            CharSequence charSequence7 = mediaMetadata.t;
            if (charSequence7 != null) {
                builderA.s = charSequence7;
            }
            CharSequence charSequence8 = mediaMetadata.u;
            if (charSequence8 != null) {
                builderA.t = charSequence8;
            }
            Integer num12 = mediaMetadata.v;
            if (num12 != null) {
                builderA.u = num12;
            }
            Integer num13 = mediaMetadata.w;
            if (num13 != null) {
                builderA.v = num13;
            }
            CharSequence charSequence9 = mediaMetadata.x;
            if (charSequence9 != null) {
                builderA.w = charSequence9;
            }
            CharSequence charSequence10 = mediaMetadata.y;
            if (charSequence10 != null) {
                builderA.x = charSequence10;
            }
            Integer num14 = mediaMetadata.z;
            if (num14 != null) {
                builderA.y = num14;
            }
            if (!immutableList.isEmpty()) {
                builderA.z = ImmutableList.o(immutableList);
            }
        }
        return new MediaMetadata(builderA);
    }

    @Override // androidx.media3.common.Player
    public final int i() {
        A0();
        if (e()) {
            return this.h0.b.b;
        }
        return -1;
    }

    public final void i0() {
        A0();
        s0();
        v0(null);
        r0(0, 0);
    }

    public final PlayerMessage j0(PlayerMessage.Target target) {
        int iM0 = m0(this.h0);
        Timeline timeline = this.h0.f3020a;
        if (iM0 == -1) {
            iM0 = 0;
        }
        SystemClock systemClock = this.y;
        ExoPlayerImplInternal exoPlayerImplInternal = this.l;
        return new PlayerMessage(exoPlayerImplInternal, target, timeline, iM0, systemClock, exoPlayerImplInternal.m);
    }

    @Override // androidx.media3.common.Player
    public final TrackSelectionParameters k() {
        A0();
        return this.i.b();
    }

    public final long k0(PlaybackInfo playbackInfo) {
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.b;
        long j = playbackInfo.c;
        Timeline timeline = playbackInfo.f3020a;
        if (!mediaPeriodId.b()) {
            return Util.U(l0(playbackInfo));
        }
        Object obj = playbackInfo.b.f3130a;
        Timeline.Period period = this.o;
        timeline.g(obj, period);
        if (j == -9223372036854775807L) {
            return Util.U(timeline.m(m0(playbackInfo), this.f2847a, 0L).k);
        }
        return Util.U(j) + Util.U(period.e);
    }

    @Override // androidx.media3.common.Player
    public final boolean l() {
        A0();
        return this.h0.l;
    }

    public final long l0(PlaybackInfo playbackInfo) {
        if (playbackInfo.f3020a.p()) {
            return Util.I(this.j0);
        }
        long jK = playbackInfo.p ? playbackInfo.k() : playbackInfo.s;
        if (playbackInfo.b.b()) {
            return jK;
        }
        Timeline timeline = playbackInfo.f3020a;
        Object obj = playbackInfo.b.f3130a;
        Timeline.Period period = this.o;
        timeline.g(obj, period);
        return jK + period.e;
    }

    @Override // androidx.media3.common.Player
    public final void m(boolean z) {
        A0();
        if (this.H != z) {
            this.H = z;
            this.l.k.e(12, z ? 1 : 0, 0).a();
            k kVar = new k(z, 0);
            ListenerSet listenerSet = this.m;
            listenerSet.c(9, kVar);
            w0();
            listenerSet.b();
        }
    }

    public final int m0(PlaybackInfo playbackInfo) {
        return playbackInfo.f3020a.p() ? this.i0 : playbackInfo.f3020a.g(playbackInfo.b.f3130a, this.o).c;
    }

    @Override // androidx.media3.common.Player
    public final long n() {
        A0();
        return this.x;
    }

    @Override // androidx.media3.common.Player
    public final void p() {
        A0();
        PlaybackInfo playbackInfo = this.h0;
        if (playbackInfo.e != 1) {
            return;
        }
        PlaybackInfo playbackInfoF = playbackInfo.f(null);
        PlaybackInfo playbackInfoO0 = o0(playbackInfoF, playbackInfoF.f3020a.p() ? 4 : 2);
        this.I++;
        this.l.k.b(29).a();
        y0(playbackInfoO0, 1, false, 5, -9223372036854775807L, -1, false);
    }

    public final PlaybackInfo p0(PlaybackInfo playbackInfo, Timeline timeline, Pair pair) {
        Assertions.b(timeline.p() || pair != null);
        Timeline timeline2 = playbackInfo.f3020a;
        long jK0 = k0(playbackInfo);
        PlaybackInfo playbackInfoI = playbackInfo.i(timeline);
        if (timeline.p()) {
            MediaSource.MediaPeriodId mediaPeriodId = PlaybackInfo.u;
            long jI = Util.I(this.j0);
            PlaybackInfo playbackInfoC = playbackInfoI.d(mediaPeriodId, jI, jI, jI, 0L, TrackGroupArray.d, this.b, ImmutableList.t()).c(mediaPeriodId);
            playbackInfoC.q = playbackInfoC.s;
            return playbackInfoC;
        }
        Object obj = playbackInfoI.b.f3130a;
        boolean zEquals = obj.equals(pair.first);
        MediaSource.MediaPeriodId mediaPeriodId2 = !zEquals ? new MediaSource.MediaPeriodId(pair.first) : playbackInfoI.b;
        long jLongValue = ((Long) pair.second).longValue();
        long jI2 = Util.I(jK0);
        if (!timeline2.p()) {
            jI2 -= timeline2.g(obj, this.o).e;
        }
        if (!zEquals || jLongValue < jI2) {
            MediaSource.MediaPeriodId mediaPeriodId3 = mediaPeriodId2;
            Assertions.f(!mediaPeriodId3.b());
            PlaybackInfo playbackInfoC2 = playbackInfoI.d(mediaPeriodId3, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? TrackGroupArray.d : playbackInfoI.h, !zEquals ? this.b : playbackInfoI.i, !zEquals ? ImmutableList.t() : playbackInfoI.j).c(mediaPeriodId3);
            playbackInfoC2.q = jLongValue;
            return playbackInfoC2;
        }
        if (jLongValue != jI2) {
            MediaSource.MediaPeriodId mediaPeriodId4 = mediaPeriodId2;
            Assertions.f(!mediaPeriodId4.b());
            long jMax = Math.max(0L, playbackInfoI.r - (jLongValue - jI2));
            long j = playbackInfoI.q;
            if (playbackInfoI.k.equals(playbackInfoI.b)) {
                j = jLongValue + jMax;
            }
            PlaybackInfo playbackInfoD = playbackInfoI.d(mediaPeriodId4, jLongValue, jLongValue, jLongValue, jMax, playbackInfoI.h, playbackInfoI.i, playbackInfoI.j);
            playbackInfoD.q = j;
            return playbackInfoD;
        }
        int iB = timeline.b(playbackInfoI.k.f3130a);
        if (iB != -1 && timeline.f(iB, this.o, false).c == timeline.g(mediaPeriodId2.f3130a, this.o).c) {
            return playbackInfoI;
        }
        timeline.g(mediaPeriodId2.f3130a, this.o);
        long jA = mediaPeriodId2.b() ? this.o.a(mediaPeriodId2.b, mediaPeriodId2.c) : this.o.d;
        MediaSource.MediaPeriodId mediaPeriodId5 = mediaPeriodId2;
        PlaybackInfo playbackInfoC3 = playbackInfoI.d(mediaPeriodId5, playbackInfoI.s, playbackInfoI.s, playbackInfoI.d, jA - playbackInfoI.s, playbackInfoI.h, playbackInfoI.i, playbackInfoI.j).c(mediaPeriodId5);
        playbackInfoC3.q = jA;
        return playbackInfoC3;
    }

    public final Pair q0(Timeline timeline, int i, long j) {
        if (timeline.p()) {
            this.i0 = i;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.j0 = j;
            return null;
        }
        if (i == -1 || i >= timeline.o()) {
            i = timeline.a(this.H);
            j = Util.U(timeline.m(i, this.f2847a, 0L).k);
        }
        return timeline.i(this.f2847a, this.o, i, Util.I(j));
    }

    @Override // androidx.media3.common.Player
    public final int r() {
        A0();
        return this.G;
    }

    public final void r0(final int i, final int i2) {
        Size size = this.X;
        if (i == size.f2923a && i2 == size.b) {
            return;
        }
        this.X = new Size(i, i2);
        this.m.f(24, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.h
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                int i3 = ExoPlayerImpl.k0;
                ((Player.Listener) obj).c0(i, i2);
            }
        });
        t0(2, 14, new Size(i, i2));
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void release() {
        String str;
        boolean z;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.7.1] [");
        sb.append(Util.b);
        sb.append("] [");
        HashSet hashSet = MediaLibraryInfo.f2865a;
        synchronized (MediaLibraryInfo.class) {
            str = MediaLibraryInfo.b;
        }
        sb.append(str);
        sb.append("]");
        Log.f("ExoPlayerImpl", sb.toString());
        A0();
        this.B.a();
        int i = 0;
        this.C.a(false);
        this.D.a(false);
        ExoPlayerImplInternal exoPlayerImplInternal = this.l;
        synchronized (exoPlayerImplInternal) {
            if (exoPlayerImplInternal.H || !exoPlayerImplInternal.m.getThread().isAlive()) {
                z = true;
            } else {
                exoPlayerImplInternal.k.j(7);
                exoPlayerImplInternal.x0(new q(exoPlayerImplInternal, i), exoPlayerImplInternal.y);
                z = exoPlayerImplInternal.H;
            }
        }
        if (!z) {
            this.m.f(10, new i(i));
        }
        this.m.d();
        this.j.c();
        this.u.a(this.s);
        PlaybackInfo playbackInfo = this.h0;
        if (playbackInfo.p) {
            this.h0 = playbackInfo.a();
        }
        PlaybackInfo playbackInfoO0 = o0(this.h0, 1);
        this.h0 = playbackInfoO0;
        PlaybackInfo playbackInfoC = playbackInfoO0.c(playbackInfoO0.b);
        this.h0 = playbackInfoC;
        playbackInfoC.q = playbackInfoC.s;
        this.h0.r = 0L;
        this.s.release();
        s0();
        Surface surface = this.R;
        if (surface != null) {
            surface.release();
            this.R = null;
        }
        this.b0 = CueGroup.b;
    }

    @Override // androidx.media3.common.Player
    public final int s() {
        A0();
        return this.h0.e;
    }

    public final void s0() {
        SphericalGLSurfaceView sphericalGLSurfaceView = this.T;
        ComponentListener componentListener = this.z;
        if (sphericalGLSurfaceView != null) {
            PlayerMessage playerMessageJ0 = j0(this.A);
            Assertions.f(!playerMessageJ0.f);
            playerMessageJ0.c = ModuleDescriptor.MODULE_VERSION;
            Assertions.f(!playerMessageJ0.f);
            playerMessageJ0.d = null;
            playerMessageJ0.b();
            this.T.d.remove(componentListener);
            this.T = null;
        }
        TextureView textureView = this.V;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != componentListener) {
                Log.g("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.V.setSurfaceTextureListener(null);
            }
            this.V = null;
        }
        SurfaceHolder surfaceHolder = this.S;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(componentListener);
            this.S = null;
        }
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        A0();
        t0(4, 15, imageOutput);
    }

    @Override // androidx.media3.common.Player
    public final int t() {
        A0();
        if (this.h0.f3020a.p()) {
            return 0;
        }
        PlaybackInfo playbackInfo = this.h0;
        return playbackInfo.f3020a.b(playbackInfo.b.f3130a);
    }

    public final void t0(int i, int i2, Object obj) {
        for (Renderer renderer : this.g) {
            if (i == -1 || renderer.e() == i) {
                PlayerMessage playerMessageJ0 = j0(renderer);
                Assertions.f(!playerMessageJ0.f);
                playerMessageJ0.c = i2;
                Assertions.f(!playerMessageJ0.f);
                playerMessageJ0.d = obj;
                playerMessageJ0.b();
            }
        }
        for (Renderer renderer2 : this.h) {
            if (renderer2 != null && (i == -1 || renderer2.e() == i)) {
                PlayerMessage playerMessageJ02 = j0(renderer2);
                Assertions.f(!playerMessageJ02.f);
                playerMessageJ02.c = i2;
                Assertions.f(!playerMessageJ02.f);
                playerMessageJ02.d = obj;
                playerMessageJ02.b();
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final void u(TextureView textureView) {
        A0();
        if (textureView == null || textureView != this.V) {
            return;
        }
        i0();
    }

    public final void u0(SurfaceHolder surfaceHolder) {
        this.U = false;
        this.S = surfaceHolder;
        surfaceHolder.addCallback(this.z);
        Surface surface = this.S.getSurface();
        if (surface == null || !surface.isValid()) {
            r0(0, 0);
        } else {
            Rect surfaceFrame = this.S.getSurfaceFrame();
            r0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // androidx.media3.common.Player
    public final int v() {
        A0();
        if (e()) {
            return this.h0.b.c;
        }
        return -1;
    }

    public final void v0(Object obj) {
        boolean z;
        Object obj2 = this.Q;
        boolean z2 = (obj2 == null || obj2 == obj) ? false : true;
        long j = z2 ? this.E : -9223372036854775807L;
        ExoPlayerImplInternal exoPlayerImplInternal = this.l;
        synchronized (exoPlayerImplInternal) {
            if (!exoPlayerImplInternal.H && exoPlayerImplInternal.m.getThread().isAlive()) {
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                exoPlayerImplInternal.k.d(30, new Pair(obj, atomicBoolean)).a();
                if (j != -9223372036854775807L) {
                    exoPlayerImplInternal.x0(new q(atomicBoolean, 1), j);
                    z = atomicBoolean.get();
                }
            }
            z = true;
        }
        if (z2) {
            Object obj3 = this.Q;
            Surface surface = this.R;
            if (obj3 == surface) {
                surface.release();
                this.R = null;
            }
        }
        this.Q = obj;
        if (z) {
            return;
        }
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(2, new ExoTimeoutException("Detaching surface timed out."), 1003);
        PlaybackInfo playbackInfo = this.h0;
        PlaybackInfo playbackInfoC = playbackInfo.c(playbackInfo.b);
        playbackInfoC.q = playbackInfoC.s;
        playbackInfoC.r = 0L;
        PlaybackInfo playbackInfoF = o0(playbackInfoC, 1).f(exoPlaybackException);
        this.I++;
        this.l.k.b(6).a();
        y0(playbackInfoF, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // androidx.media3.common.Player
    public final long w() {
        A0();
        return this.w;
    }

    public final void w0() {
        Player.Commands commands = this.O;
        int i = Util.f2928a;
        ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) this.f;
        boolean zE = exoPlayerImpl.e();
        boolean zE0 = exoPlayerImpl.e0();
        boolean zA0 = exoPlayerImpl.a0();
        boolean Z = exoPlayerImpl.Z();
        boolean zD0 = exoPlayerImpl.d0();
        boolean zC0 = exoPlayerImpl.c0();
        boolean zP = exoPlayerImpl.K().p();
        Player.Commands.Builder builder = new Player.Commands.Builder();
        FlagSet flagSet = this.c.f2872a;
        FlagSet.Builder builder2 = builder.f2873a;
        builder2.getClass();
        boolean z = false;
        for (int i2 = 0; i2 < flagSet.f2852a.size(); i2++) {
            builder2.a(flagSet.a(i2));
        }
        boolean z2 = !zE;
        builder.a(4, z2);
        builder.a(5, zE0 && !zE);
        builder.a(6, zA0 && !zE);
        builder.a(7, !zP && (zA0 || !zD0 || zE0) && !zE);
        builder.a(8, Z && !zE);
        builder.a(9, !zP && (Z || (zD0 && zC0)) && !zE);
        builder.a(10, z2);
        builder.a(11, zE0 && !zE);
        if (zE0 && !zE) {
            z = true;
        }
        builder.a(12, z);
        Player.Commands commands2 = new Player.Commands(builder2.b());
        this.O = commands2;
        if (commands2.equals(commands)) {
            return;
        }
        this.m.c(13, new m(this));
    }

    public final void x0(int i, boolean z) {
        PlaybackInfo playbackInfoA = this.h0;
        int i2 = playbackInfoA.n;
        int i3 = (i2 != 1 || z) ? 0 : 1;
        if (playbackInfoA.l == z && i2 == i3 && playbackInfoA.m == i) {
            return;
        }
        this.I++;
        if (playbackInfoA.p) {
            playbackInfoA = playbackInfoA.a();
        }
        PlaybackInfo playbackInfoE = playbackInfoA.e(i, i3, z);
        this.l.k.e(1, z ? 1 : 0, i | (i3 << 4)).a();
        y0(playbackInfoE, 0, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // androidx.media3.common.Player
    public final void y(TrackSelectionParameters trackSelectionParameters) {
        A0();
        TrackSelector trackSelector = this.i;
        trackSelector.getClass();
        if (!(trackSelector instanceof DefaultTrackSelector) || trackSelectionParameters.equals(trackSelector.b())) {
            return;
        }
        trackSelector.h(trackSelectionParameters);
        this.m.f(19, new f(trackSelectionParameters, 1));
    }

    public final void y0(final PlaybackInfo playbackInfo, final int i, boolean z, final int i2, long j, int i3, boolean z2) {
        Pair pair;
        int i4;
        final MediaItem mediaItem;
        boolean z3;
        boolean z4;
        boolean z5;
        int i5;
        Object obj;
        MediaItem mediaItem2;
        Object obj2;
        int i6;
        long j2;
        long j3;
        long jN0;
        long jN02;
        Object obj3;
        MediaItem mediaItem3;
        Object obj4;
        int i7;
        PlaybackInfo playbackInfo2 = this.h0;
        this.h0 = playbackInfo;
        boolean zEquals = playbackInfo2.f3020a.equals(playbackInfo.f3020a);
        Timeline.Window window = this.f2847a;
        Timeline.Period period = this.o;
        Timeline timeline = playbackInfo2.f3020a;
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo2.b;
        Timeline timeline2 = playbackInfo.f3020a;
        MediaSource.MediaPeriodId mediaPeriodId2 = playbackInfo.b;
        if (timeline2.p() && timeline.p()) {
            pair = new Pair(Boolean.FALSE, -1);
        } else if (timeline2.p() != timeline.p()) {
            pair = new Pair(Boolean.TRUE, 3);
        } else if (timeline.m(timeline.g(mediaPeriodId.f3130a, period).c, window, 0L).f2878a.equals(timeline2.m(timeline2.g(mediaPeriodId2.f3130a, period).c, window, 0L).f2878a)) {
            pair = (z && i2 == 0 && mediaPeriodId.d < mediaPeriodId2.d) ? new Pair(Boolean.TRUE, 0) : (z && i2 == 1 && z2) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
        } else {
            if (z && i2 == 0) {
                i4 = 1;
            } else if (z && i2 == 1) {
                i4 = 2;
            } else {
                if (zEquals) {
                    throw new IllegalStateException();
                }
                i4 = 3;
            }
            pair = new Pair(Boolean.TRUE, Integer.valueOf(i4));
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        final int iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            mediaItem = !playbackInfo.f3020a.p() ? playbackInfo.f3020a.m(playbackInfo.f3020a.g(playbackInfo.b.f3130a, this.o).c, this.f2847a, 0L).c : null;
            this.g0 = MediaMetadata.B;
        } else {
            mediaItem = null;
        }
        if (zBooleanValue || !playbackInfo2.j.equals(playbackInfo.j)) {
            MediaMetadata.Builder builderA = this.g0.a();
            List list = playbackInfo.j;
            for (int i8 = 0; i8 < list.size(); i8++) {
                Metadata metadata = (Metadata) list.get(i8);
                int i9 = 0;
                while (true) {
                    Metadata.Entry[] entryArr = metadata.f2868a;
                    if (i9 < entryArr.length) {
                        entryArr[i9].c(builderA);
                        i9++;
                    }
                }
            }
            this.g0 = new MediaMetadata(builderA);
        }
        MediaMetadata mediaMetadataH0 = h0();
        boolean zEquals2 = mediaMetadataH0.equals(this.P);
        this.P = mediaMetadataH0;
        boolean z6 = playbackInfo2.l != playbackInfo.l;
        boolean z7 = playbackInfo2.e != playbackInfo.e;
        if (z7 || z6) {
            z0();
        }
        boolean z8 = playbackInfo2.g != playbackInfo.g;
        if (!zEquals) {
            final int i10 = 0;
            this.m.c(0, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.e
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj5) {
                    int i11 = i10;
                    int i12 = i;
                    Object obj6 = playbackInfo;
                    switch (i11) {
                        case 0:
                            int i13 = ExoPlayerImpl.k0;
                            ((Player.Listener) obj5).N(((PlaybackInfo) obj6).f3020a, i12);
                            break;
                        default:
                            int i14 = ExoPlayerImpl.k0;
                            ((Player.Listener) obj5).Z((MediaItem) obj6, i12);
                            break;
                    }
                }
            });
        }
        if (z) {
            Timeline.Period period2 = new Timeline.Period();
            if (playbackInfo2.f3020a.p()) {
                z3 = zBooleanValue;
                z4 = zEquals2;
                z5 = z7;
                i5 = i3;
                obj = null;
                mediaItem2 = null;
                obj2 = null;
                i6 = -1;
            } else {
                Object obj5 = playbackInfo2.b.f3130a;
                playbackInfo2.f3020a.g(obj5, period2);
                int i11 = period2.c;
                int iB = playbackInfo2.f3020a.b(obj5);
                z3 = zBooleanValue;
                z4 = zEquals2;
                z5 = z7;
                obj = playbackInfo2.f3020a.m(i11, this.f2847a, 0L).f2878a;
                mediaItem2 = this.f2847a.c;
                obj2 = obj5;
                i5 = i11;
                i6 = iB;
            }
            if (i2 == 0) {
                if (playbackInfo2.b.b()) {
                    MediaSource.MediaPeriodId mediaPeriodId3 = playbackInfo2.b;
                    jN0 = period2.a(mediaPeriodId3.b, mediaPeriodId3.c);
                    jN02 = n0(playbackInfo2);
                } else if (playbackInfo2.b.e != -1) {
                    jN0 = n0(this.h0);
                    jN02 = jN0;
                } else {
                    j2 = period2.e;
                    j3 = period2.d;
                    jN0 = j2 + j3;
                    jN02 = jN0;
                }
            } else if (playbackInfo2.b.b()) {
                jN0 = playbackInfo2.s;
                jN02 = n0(playbackInfo2);
            } else {
                j2 = period2.e;
                j3 = playbackInfo2.s;
                jN0 = j2 + j3;
                jN02 = jN0;
            }
            long jU = Util.U(jN0);
            long jU2 = Util.U(jN02);
            MediaSource.MediaPeriodId mediaPeriodId4 = playbackInfo2.b;
            final Player.PositionInfo positionInfo = new Player.PositionInfo(obj, i5, mediaItem2, obj2, i6, jU, jU2, mediaPeriodId4.b, mediaPeriodId4.c);
            Timeline.Window window2 = this.f2847a;
            int iS = S();
            if (this.h0.f3020a.p()) {
                obj3 = null;
                mediaItem3 = null;
                obj4 = null;
                i7 = -1;
            } else {
                PlaybackInfo playbackInfo3 = this.h0;
                Object obj6 = playbackInfo3.b.f3130a;
                playbackInfo3.f3020a.g(obj6, this.o);
                int iB2 = this.h0.f3020a.b(obj6);
                Object obj7 = this.h0.f3020a.m(iS, window2, 0L).f2878a;
                mediaItem3 = window2.c;
                i7 = iB2;
                obj4 = obj6;
                obj3 = obj7;
            }
            long jU3 = Util.U(j);
            long jU4 = this.h0.b.b() ? Util.U(n0(this.h0)) : jU3;
            MediaSource.MediaPeriodId mediaPeriodId5 = this.h0.b;
            final Player.PositionInfo positionInfo2 = new Player.PositionInfo(obj3, iS, mediaItem3, obj4, i7, jU3, jU4, mediaPeriodId5.b, mediaPeriodId5.c);
            this.m.c(11, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.n
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj8) {
                    Player.Listener listener = (Player.Listener) obj8;
                    int i12 = ExoPlayerImpl.k0;
                    int i13 = i2;
                    listener.f0(i13);
                    listener.K(i13, positionInfo, positionInfo2);
                }
            });
        } else {
            z3 = zBooleanValue;
            z4 = zEquals2;
            z5 = z7;
        }
        if (z3) {
            final int i12 = 1;
            this.m.c(1, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.e
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj52) {
                    int i112 = i12;
                    int i122 = iIntValue;
                    Object obj62 = mediaItem;
                    switch (i112) {
                        case 0:
                            int i13 = ExoPlayerImpl.k0;
                            ((Player.Listener) obj52).N(((PlaybackInfo) obj62).f3020a, i122);
                            break;
                        default:
                            int i14 = ExoPlayerImpl.k0;
                            ((Player.Listener) obj52).Z((MediaItem) obj62, i122);
                            break;
                    }
                }
            });
        }
        if (playbackInfo2.f != playbackInfo.f) {
            final int i13 = 7;
            this.m.c(10, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.g
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj8) {
                    int i14 = i13;
                    PlaybackInfo playbackInfo4 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj8;
                    switch (i14) {
                        case 0:
                            int i15 = ExoPlayerImpl.k0;
                            listener.z(playbackInfo4.g);
                            listener.g0(playbackInfo4.g);
                            break;
                        case 1:
                            int i16 = ExoPlayerImpl.k0;
                            listener.P(playbackInfo4.e, playbackInfo4.l);
                            break;
                        case 2:
                            int i17 = ExoPlayerImpl.k0;
                            listener.U(playbackInfo4.e);
                            break;
                        case 3:
                            int i18 = ExoPlayerImpl.k0;
                            listener.h0(playbackInfo4.m, playbackInfo4.l);
                            break;
                        case 4:
                            int i19 = ExoPlayerImpl.k0;
                            listener.T(playbackInfo4.n);
                            break;
                        case 5:
                            int i20 = ExoPlayerImpl.k0;
                            listener.S(playbackInfo4.l());
                            break;
                        case 6:
                            int i21 = ExoPlayerImpl.k0;
                            listener.W(playbackInfo4.o);
                            break;
                        case 7:
                            int i22 = ExoPlayerImpl.k0;
                            listener.n0(playbackInfo4.f);
                            break;
                        case 8:
                            int i23 = ExoPlayerImpl.k0;
                            listener.G(playbackInfo4.f);
                            break;
                        default:
                            int i24 = ExoPlayerImpl.k0;
                            listener.O(playbackInfo4.i.d);
                            break;
                    }
                }
            });
            if (playbackInfo.f != null) {
                final int i14 = 8;
                this.m.c(10, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.g
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj8) {
                        int i142 = i14;
                        PlaybackInfo playbackInfo4 = playbackInfo;
                        Player.Listener listener = (Player.Listener) obj8;
                        switch (i142) {
                            case 0:
                                int i15 = ExoPlayerImpl.k0;
                                listener.z(playbackInfo4.g);
                                listener.g0(playbackInfo4.g);
                                break;
                            case 1:
                                int i16 = ExoPlayerImpl.k0;
                                listener.P(playbackInfo4.e, playbackInfo4.l);
                                break;
                            case 2:
                                int i17 = ExoPlayerImpl.k0;
                                listener.U(playbackInfo4.e);
                                break;
                            case 3:
                                int i18 = ExoPlayerImpl.k0;
                                listener.h0(playbackInfo4.m, playbackInfo4.l);
                                break;
                            case 4:
                                int i19 = ExoPlayerImpl.k0;
                                listener.T(playbackInfo4.n);
                                break;
                            case 5:
                                int i20 = ExoPlayerImpl.k0;
                                listener.S(playbackInfo4.l());
                                break;
                            case 6:
                                int i21 = ExoPlayerImpl.k0;
                                listener.W(playbackInfo4.o);
                                break;
                            case 7:
                                int i22 = ExoPlayerImpl.k0;
                                listener.n0(playbackInfo4.f);
                                break;
                            case 8:
                                int i23 = ExoPlayerImpl.k0;
                                listener.G(playbackInfo4.f);
                                break;
                            default:
                                int i24 = ExoPlayerImpl.k0;
                                listener.O(playbackInfo4.i.d);
                                break;
                        }
                    }
                });
            }
        }
        TrackSelectorResult trackSelectorResult = playbackInfo2.i;
        TrackSelectorResult trackSelectorResult2 = playbackInfo.i;
        if (trackSelectorResult != trackSelectorResult2) {
            this.i.d(trackSelectorResult2.e);
            final int i15 = 9;
            this.m.c(2, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.g
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj8) {
                    int i142 = i15;
                    PlaybackInfo playbackInfo4 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj8;
                    switch (i142) {
                        case 0:
                            int i152 = ExoPlayerImpl.k0;
                            listener.z(playbackInfo4.g);
                            listener.g0(playbackInfo4.g);
                            break;
                        case 1:
                            int i16 = ExoPlayerImpl.k0;
                            listener.P(playbackInfo4.e, playbackInfo4.l);
                            break;
                        case 2:
                            int i17 = ExoPlayerImpl.k0;
                            listener.U(playbackInfo4.e);
                            break;
                        case 3:
                            int i18 = ExoPlayerImpl.k0;
                            listener.h0(playbackInfo4.m, playbackInfo4.l);
                            break;
                        case 4:
                            int i19 = ExoPlayerImpl.k0;
                            listener.T(playbackInfo4.n);
                            break;
                        case 5:
                            int i20 = ExoPlayerImpl.k0;
                            listener.S(playbackInfo4.l());
                            break;
                        case 6:
                            int i21 = ExoPlayerImpl.k0;
                            listener.W(playbackInfo4.o);
                            break;
                        case 7:
                            int i22 = ExoPlayerImpl.k0;
                            listener.n0(playbackInfo4.f);
                            break;
                        case 8:
                            int i23 = ExoPlayerImpl.k0;
                            listener.G(playbackInfo4.f);
                            break;
                        default:
                            int i24 = ExoPlayerImpl.k0;
                            listener.O(playbackInfo4.i.d);
                            break;
                    }
                }
            });
        }
        if (!z4) {
            this.m.c(14, new f(this.P, 0));
        }
        if (z8) {
            final int i16 = 0;
            this.m.c(3, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.g
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj8) {
                    int i142 = i16;
                    PlaybackInfo playbackInfo4 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj8;
                    switch (i142) {
                        case 0:
                            int i152 = ExoPlayerImpl.k0;
                            listener.z(playbackInfo4.g);
                            listener.g0(playbackInfo4.g);
                            break;
                        case 1:
                            int i162 = ExoPlayerImpl.k0;
                            listener.P(playbackInfo4.e, playbackInfo4.l);
                            break;
                        case 2:
                            int i17 = ExoPlayerImpl.k0;
                            listener.U(playbackInfo4.e);
                            break;
                        case 3:
                            int i18 = ExoPlayerImpl.k0;
                            listener.h0(playbackInfo4.m, playbackInfo4.l);
                            break;
                        case 4:
                            int i19 = ExoPlayerImpl.k0;
                            listener.T(playbackInfo4.n);
                            break;
                        case 5:
                            int i20 = ExoPlayerImpl.k0;
                            listener.S(playbackInfo4.l());
                            break;
                        case 6:
                            int i21 = ExoPlayerImpl.k0;
                            listener.W(playbackInfo4.o);
                            break;
                        case 7:
                            int i22 = ExoPlayerImpl.k0;
                            listener.n0(playbackInfo4.f);
                            break;
                        case 8:
                            int i23 = ExoPlayerImpl.k0;
                            listener.G(playbackInfo4.f);
                            break;
                        default:
                            int i24 = ExoPlayerImpl.k0;
                            listener.O(playbackInfo4.i.d);
                            break;
                    }
                }
            });
        }
        if (z5 || z6) {
            final int i17 = 1;
            this.m.c(-1, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.g
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj8) {
                    int i142 = i17;
                    PlaybackInfo playbackInfo4 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj8;
                    switch (i142) {
                        case 0:
                            int i152 = ExoPlayerImpl.k0;
                            listener.z(playbackInfo4.g);
                            listener.g0(playbackInfo4.g);
                            break;
                        case 1:
                            int i162 = ExoPlayerImpl.k0;
                            listener.P(playbackInfo4.e, playbackInfo4.l);
                            break;
                        case 2:
                            int i172 = ExoPlayerImpl.k0;
                            listener.U(playbackInfo4.e);
                            break;
                        case 3:
                            int i18 = ExoPlayerImpl.k0;
                            listener.h0(playbackInfo4.m, playbackInfo4.l);
                            break;
                        case 4:
                            int i19 = ExoPlayerImpl.k0;
                            listener.T(playbackInfo4.n);
                            break;
                        case 5:
                            int i20 = ExoPlayerImpl.k0;
                            listener.S(playbackInfo4.l());
                            break;
                        case 6:
                            int i21 = ExoPlayerImpl.k0;
                            listener.W(playbackInfo4.o);
                            break;
                        case 7:
                            int i22 = ExoPlayerImpl.k0;
                            listener.n0(playbackInfo4.f);
                            break;
                        case 8:
                            int i23 = ExoPlayerImpl.k0;
                            listener.G(playbackInfo4.f);
                            break;
                        default:
                            int i24 = ExoPlayerImpl.k0;
                            listener.O(playbackInfo4.i.d);
                            break;
                    }
                }
            });
        }
        if (z5) {
            final int i18 = 2;
            this.m.c(4, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.g
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj8) {
                    int i142 = i18;
                    PlaybackInfo playbackInfo4 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj8;
                    switch (i142) {
                        case 0:
                            int i152 = ExoPlayerImpl.k0;
                            listener.z(playbackInfo4.g);
                            listener.g0(playbackInfo4.g);
                            break;
                        case 1:
                            int i162 = ExoPlayerImpl.k0;
                            listener.P(playbackInfo4.e, playbackInfo4.l);
                            break;
                        case 2:
                            int i172 = ExoPlayerImpl.k0;
                            listener.U(playbackInfo4.e);
                            break;
                        case 3:
                            int i182 = ExoPlayerImpl.k0;
                            listener.h0(playbackInfo4.m, playbackInfo4.l);
                            break;
                        case 4:
                            int i19 = ExoPlayerImpl.k0;
                            listener.T(playbackInfo4.n);
                            break;
                        case 5:
                            int i20 = ExoPlayerImpl.k0;
                            listener.S(playbackInfo4.l());
                            break;
                        case 6:
                            int i21 = ExoPlayerImpl.k0;
                            listener.W(playbackInfo4.o);
                            break;
                        case 7:
                            int i22 = ExoPlayerImpl.k0;
                            listener.n0(playbackInfo4.f);
                            break;
                        case 8:
                            int i23 = ExoPlayerImpl.k0;
                            listener.G(playbackInfo4.f);
                            break;
                        default:
                            int i24 = ExoPlayerImpl.k0;
                            listener.O(playbackInfo4.i.d);
                            break;
                    }
                }
            });
        }
        if (z6 || playbackInfo2.m != playbackInfo.m) {
            final int i19 = 3;
            this.m.c(5, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.g
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj8) {
                    int i142 = i19;
                    PlaybackInfo playbackInfo4 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj8;
                    switch (i142) {
                        case 0:
                            int i152 = ExoPlayerImpl.k0;
                            listener.z(playbackInfo4.g);
                            listener.g0(playbackInfo4.g);
                            break;
                        case 1:
                            int i162 = ExoPlayerImpl.k0;
                            listener.P(playbackInfo4.e, playbackInfo4.l);
                            break;
                        case 2:
                            int i172 = ExoPlayerImpl.k0;
                            listener.U(playbackInfo4.e);
                            break;
                        case 3:
                            int i182 = ExoPlayerImpl.k0;
                            listener.h0(playbackInfo4.m, playbackInfo4.l);
                            break;
                        case 4:
                            int i192 = ExoPlayerImpl.k0;
                            listener.T(playbackInfo4.n);
                            break;
                        case 5:
                            int i20 = ExoPlayerImpl.k0;
                            listener.S(playbackInfo4.l());
                            break;
                        case 6:
                            int i21 = ExoPlayerImpl.k0;
                            listener.W(playbackInfo4.o);
                            break;
                        case 7:
                            int i22 = ExoPlayerImpl.k0;
                            listener.n0(playbackInfo4.f);
                            break;
                        case 8:
                            int i23 = ExoPlayerImpl.k0;
                            listener.G(playbackInfo4.f);
                            break;
                        default:
                            int i24 = ExoPlayerImpl.k0;
                            listener.O(playbackInfo4.i.d);
                            break;
                    }
                }
            });
        }
        if (playbackInfo2.n != playbackInfo.n) {
            final int i20 = 4;
            this.m.c(6, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.g
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj8) {
                    int i142 = i20;
                    PlaybackInfo playbackInfo4 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj8;
                    switch (i142) {
                        case 0:
                            int i152 = ExoPlayerImpl.k0;
                            listener.z(playbackInfo4.g);
                            listener.g0(playbackInfo4.g);
                            break;
                        case 1:
                            int i162 = ExoPlayerImpl.k0;
                            listener.P(playbackInfo4.e, playbackInfo4.l);
                            break;
                        case 2:
                            int i172 = ExoPlayerImpl.k0;
                            listener.U(playbackInfo4.e);
                            break;
                        case 3:
                            int i182 = ExoPlayerImpl.k0;
                            listener.h0(playbackInfo4.m, playbackInfo4.l);
                            break;
                        case 4:
                            int i192 = ExoPlayerImpl.k0;
                            listener.T(playbackInfo4.n);
                            break;
                        case 5:
                            int i202 = ExoPlayerImpl.k0;
                            listener.S(playbackInfo4.l());
                            break;
                        case 6:
                            int i21 = ExoPlayerImpl.k0;
                            listener.W(playbackInfo4.o);
                            break;
                        case 7:
                            int i22 = ExoPlayerImpl.k0;
                            listener.n0(playbackInfo4.f);
                            break;
                        case 8:
                            int i23 = ExoPlayerImpl.k0;
                            listener.G(playbackInfo4.f);
                            break;
                        default:
                            int i24 = ExoPlayerImpl.k0;
                            listener.O(playbackInfo4.i.d);
                            break;
                    }
                }
            });
        }
        if (playbackInfo2.l() != playbackInfo.l()) {
            final int i21 = 5;
            this.m.c(7, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.g
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj8) {
                    int i142 = i21;
                    PlaybackInfo playbackInfo4 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj8;
                    switch (i142) {
                        case 0:
                            int i152 = ExoPlayerImpl.k0;
                            listener.z(playbackInfo4.g);
                            listener.g0(playbackInfo4.g);
                            break;
                        case 1:
                            int i162 = ExoPlayerImpl.k0;
                            listener.P(playbackInfo4.e, playbackInfo4.l);
                            break;
                        case 2:
                            int i172 = ExoPlayerImpl.k0;
                            listener.U(playbackInfo4.e);
                            break;
                        case 3:
                            int i182 = ExoPlayerImpl.k0;
                            listener.h0(playbackInfo4.m, playbackInfo4.l);
                            break;
                        case 4:
                            int i192 = ExoPlayerImpl.k0;
                            listener.T(playbackInfo4.n);
                            break;
                        case 5:
                            int i202 = ExoPlayerImpl.k0;
                            listener.S(playbackInfo4.l());
                            break;
                        case 6:
                            int i212 = ExoPlayerImpl.k0;
                            listener.W(playbackInfo4.o);
                            break;
                        case 7:
                            int i22 = ExoPlayerImpl.k0;
                            listener.n0(playbackInfo4.f);
                            break;
                        case 8:
                            int i23 = ExoPlayerImpl.k0;
                            listener.G(playbackInfo4.f);
                            break;
                        default:
                            int i24 = ExoPlayerImpl.k0;
                            listener.O(playbackInfo4.i.d);
                            break;
                    }
                }
            });
        }
        if (!playbackInfo2.o.equals(playbackInfo.o)) {
            final int i22 = 6;
            this.m.c(12, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.g
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj8) {
                    int i142 = i22;
                    PlaybackInfo playbackInfo4 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj8;
                    switch (i142) {
                        case 0:
                            int i152 = ExoPlayerImpl.k0;
                            listener.z(playbackInfo4.g);
                            listener.g0(playbackInfo4.g);
                            break;
                        case 1:
                            int i162 = ExoPlayerImpl.k0;
                            listener.P(playbackInfo4.e, playbackInfo4.l);
                            break;
                        case 2:
                            int i172 = ExoPlayerImpl.k0;
                            listener.U(playbackInfo4.e);
                            break;
                        case 3:
                            int i182 = ExoPlayerImpl.k0;
                            listener.h0(playbackInfo4.m, playbackInfo4.l);
                            break;
                        case 4:
                            int i192 = ExoPlayerImpl.k0;
                            listener.T(playbackInfo4.n);
                            break;
                        case 5:
                            int i202 = ExoPlayerImpl.k0;
                            listener.S(playbackInfo4.l());
                            break;
                        case 6:
                            int i212 = ExoPlayerImpl.k0;
                            listener.W(playbackInfo4.o);
                            break;
                        case 7:
                            int i222 = ExoPlayerImpl.k0;
                            listener.n0(playbackInfo4.f);
                            break;
                        case 8:
                            int i23 = ExoPlayerImpl.k0;
                            listener.G(playbackInfo4.f);
                            break;
                        default:
                            int i24 = ExoPlayerImpl.k0;
                            listener.O(playbackInfo4.i.d);
                            break;
                    }
                }
            });
        }
        w0();
        this.m.b();
        if (playbackInfo2.p != playbackInfo.p) {
            Iterator it = this.n.iterator();
            while (it.hasNext()) {
                ((ExoPlayer.AudioOffloadListener) it.next()).A();
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final long z() {
        A0();
        if (this.h0.f3020a.p()) {
            return this.j0;
        }
        PlaybackInfo playbackInfo = this.h0;
        long j = 0;
        if (playbackInfo.k.d != playbackInfo.b.d) {
            return Util.U(playbackInfo.f3020a.m(S(), this.f2847a, 0L).l);
        }
        long j2 = playbackInfo.q;
        if (this.h0.k.b()) {
            PlaybackInfo playbackInfo2 = this.h0;
            playbackInfo2.f3020a.g(playbackInfo2.k.f3130a, this.o).d(this.h0.k.b);
        } else {
            j = j2;
        }
        PlaybackInfo playbackInfo3 = this.h0;
        Timeline timeline = playbackInfo3.f3020a;
        Object obj = playbackInfo3.k.f3130a;
        Timeline.Period period = this.o;
        timeline.g(obj, period);
        return Util.U(j + period.e);
    }

    public final void z0() {
        int iS = s();
        WifiLockManager wifiLockManager = this.D;
        WakeLockManager wakeLockManager = this.C;
        boolean z = false;
        if (iS != 1) {
            if (iS == 2 || iS == 3) {
                A0();
                boolean z2 = this.h0.p;
                if (l() && !z2) {
                    z = true;
                }
                wakeLockManager.a(z);
                wifiLockManager.a(l());
                return;
            }
            if (iS != 4) {
                throw new IllegalStateException();
            }
        }
        wakeLockManager.a(false);
        wifiLockManager.a(false);
    }

    @Override // androidx.media3.common.Player
    public final ExoPlaybackException a() {
        A0();
        return this.h0.f;
    }
}
