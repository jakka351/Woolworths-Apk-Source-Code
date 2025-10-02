package androidx.media3.exoplayer.video;

import android.content.Context;
import android.os.Looper;
import android.util.Pair;
import android.util.SparseArray;
import android.view.Surface;
import androidx.annotation.RestrictTo;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.PreviewingVideoGraph;
import androidx.media3.common.VideoCompositorSettings;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.VideoGraph;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.video.VideoSink;
import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;

@RestrictTo
@UnstableApi
/* loaded from: classes2.dex */
public final class PlaybackVideoGraphWrapper implements VideoSinkProvider, VideoGraph.Listener {
    public static final a u = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Context f3198a;
    public final TimedValueQueue b = new TimedValueQueue();
    public final PreviewingVideoGraph.Factory c;
    public final SparseArray d;
    public final List e;
    public final VideoCompositorSettings f;
    public final VideoSink g;
    public final Clock h;
    public final CopyOnWriteArraySet i;
    public HandlerWrapper j;
    public PreviewingVideoGraph k;
    public Pair l;
    public int m;
    public int n;
    public Renderer.WakeupListener o;
    public long p;
    public boolean q;
    public long r;
    public int s;
    public int t;

    /* renamed from: androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper$1, reason: invalid class name */
    class AnonymousClass1 implements VideoSink.VideoFrameHandler {
        @Override // androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler
        public final void a() {
            throw null;
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler
        public final void b(long j) {
            throw null;
        }
    }

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final Context f3199a;
        public final VideoFrameReleaseControl b;
        public VideoFrameProcessor.Factory c;
        public PreviewingVideoGraph.Factory d;
        public final List e = ImmutableList.t();
        public final VideoCompositorSettings f = VideoCompositorSettings.f2886a;
        public Clock g = Clock.f2906a;
        public boolean h;

        public Builder(Context context, VideoFrameReleaseControl videoFrameReleaseControl) {
            this.f3199a = context.getApplicationContext();
            this.b = videoFrameReleaseControl;
        }
    }

    public final class DefaultVideoSinkListener implements VideoSink.Listener {
        public DefaultVideoSinkListener() {
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        public final void a(VideoSize videoSize) {
            Iterator it = PlaybackVideoGraphWrapper.this.i.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).a(videoSize);
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        public final void b() {
            Iterator it = PlaybackVideoGraphWrapper.this.i.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).b();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink.Listener
        public final void c() {
            Iterator it = PlaybackVideoGraphWrapper.this.i.iterator();
            while (it.hasNext()) {
                ((Listener) it.next()).c();
            }
        }
    }

    public final class InputVideoSink implements VideoSink, Listener {

        /* renamed from: a, reason: collision with root package name */
        public final int f3200a;
        public ImmutableList b;
        public VideoFrameProcessor c;
        public Format d;
        public long e;
        public long f;
        public VideoSink.Listener g;
        public Executor h;

        public InputVideoSink(Context context) {
            this.f3200a = Util.G(context) ? 1 : 5;
            this.b = ImmutableList.t();
            this.f = -9223372036854775807L;
            this.g = VideoSink.Listener.f3209a;
            this.h = PlaybackVideoGraphWrapper.u;
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public final void a(VideoSize videoSize) {
            this.h.execute(new d(this, this.g, videoSize));
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public final void b() {
            this.h.execute(new f(this, this.g, 0));
        }

        @Override // androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.Listener
        public final void c() {
            this.h.execute(new f(this, this.g, 1));
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void d() {
            long j = this.f;
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
            if (playbackVideoGraphWrapper.p >= j) {
                ((DefaultVideoSink) playbackVideoGraphWrapper.g).d();
                playbackVideoGraphWrapper.q = true;
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void e(long j, long j2) {
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
            TimedValueQueue timedValueQueue = playbackVideoGraphWrapper.b;
            long j3 = this.f;
            timedValueQueue.a(j3 == -9223372036854775807L ? 0L : j3 + 1, Long.valueOf(j));
            this.e = j2;
            playbackVideoGraphWrapper.r = j2;
            ((DefaultVideoSink) playbackVideoGraphWrapper.g).e(0L, j2);
        }

        @Override // androidx.media3.exoplayer.video.VideoSink
        public final void f(Renderer.WakeupListener wakeupListener) {
            PlaybackVideoGraphWrapper.this.o = wakeupListener;
        }

        public final void g(boolean z) {
            if (i()) {
                this.c.flush();
            }
            this.f = -9223372036854775807L;
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
            VideoSink videoSink = playbackVideoGraphWrapper.g;
            TimedValueQueue timedValueQueue = playbackVideoGraphWrapper.b;
            if (playbackVideoGraphWrapper.n == 1) {
                playbackVideoGraphWrapper.m++;
                DefaultVideoSink defaultVideoSink = (DefaultVideoSink) videoSink;
                if (z) {
                    VideoFrameReleaseControl videoFrameReleaseControl = defaultVideoSink.f3191a;
                    VideoFrameReleaseHelper videoFrameReleaseHelper = videoFrameReleaseControl.b;
                    videoFrameReleaseHelper.m = 0L;
                    videoFrameReleaseHelper.p = -1L;
                    videoFrameReleaseHelper.n = -1L;
                    videoFrameReleaseControl.h = -9223372036854775807L;
                    videoFrameReleaseControl.f = -9223372036854775807L;
                    videoFrameReleaseControl.d(1);
                    videoFrameReleaseControl.i = -9223372036854775807L;
                }
                VideoFrameRenderControl videoFrameRenderControl = defaultVideoSink.c;
                TimedValueQueue timedValueQueue2 = videoFrameRenderControl.d;
                LongArrayQueue longArrayQueue = videoFrameRenderControl.f;
                longArrayQueue.f2916a = 0;
                longArrayQueue.b = 0;
                videoFrameRenderControl.g = -9223372036854775807L;
                videoFrameRenderControl.h = -9223372036854775807L;
                videoFrameRenderControl.i = -9223372036854775807L;
                TimedValueQueue timedValueQueue3 = videoFrameRenderControl.e;
                if (timedValueQueue3.h() > 0) {
                    Assertions.b(timedValueQueue3.h() > 0);
                    while (timedValueQueue3.h() > 1) {
                        timedValueQueue3.e();
                    }
                    Object objE = timedValueQueue3.e();
                    objE.getClass();
                    timedValueQueue3.a(0L, (Long) objE);
                }
                if (timedValueQueue2.h() > 0) {
                    Assertions.b(timedValueQueue2.h() > 0);
                    while (timedValueQueue2.h() > 1) {
                        timedValueQueue2.e();
                    }
                    Object objE2 = timedValueQueue2.e();
                    objE2.getClass();
                    timedValueQueue2.a(0L, (VideoSize) objE2);
                }
                defaultVideoSink.d.clear();
                while (timedValueQueue.h() > 1) {
                    timedValueQueue.e();
                }
                if (timedValueQueue.h() == 1) {
                    Long l = (Long) timedValueQueue.e();
                    l.getClass();
                    defaultVideoSink.e(l.longValue(), playbackVideoGraphWrapper.r);
                }
                playbackVideoGraphWrapper.p = -9223372036854775807L;
                playbackVideoGraphWrapper.q = false;
                HandlerWrapper handlerWrapper = playbackVideoGraphWrapper.j;
                Assertions.g(handlerWrapper);
                handlerWrapper.post(new c(playbackVideoGraphWrapper, 2));
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v2, types: [androidx.media3.exoplayer.video.e] */
        public final boolean h(Format format) throws VideoSink.VideoSinkException {
            Assertions.f(!i());
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
            VideoSink videoSink = playbackVideoGraphWrapper.g;
            Assertions.f(playbackVideoGraphWrapper.n == 0);
            ColorInfo colorInfoA = format.B;
            if (colorInfoA == null || !colorInfoA.d()) {
                colorInfoA = ColorInfo.h;
            }
            if (colorInfoA.c == 7 && Util.f2928a < 34) {
                ColorInfo.Builder builder = new ColorInfo.Builder();
                builder.f2850a = colorInfoA.f2849a;
                builder.b = colorInfoA.b;
                builder.d = colorInfoA.d;
                builder.e = colorInfoA.e;
                builder.f = colorInfoA.f;
                builder.c = 6;
                colorInfoA = builder.a();
            }
            ColorInfo colorInfo = colorInfoA;
            Clock clock = playbackVideoGraphWrapper.h;
            Looper looperMyLooper = Looper.myLooper();
            Assertions.g(looperMyLooper);
            final HandlerWrapper handlerWrapperB = clock.b(looperMyLooper, null);
            playbackVideoGraphWrapper.j = handlerWrapperB;
            try {
                PreviewingVideoGraph previewingVideoGraphA = ((ReflectivePreviewingSingleInputVideoGraphFactory) playbackVideoGraphWrapper.c).a(playbackVideoGraphWrapper.f3198a, colorInfo, playbackVideoGraphWrapper, new Executor() { // from class: androidx.media3.exoplayer.video.e
                    @Override // java.util.concurrent.Executor
                    public final void execute(Runnable runnable) {
                        handlerWrapperB.post(runnable);
                    }
                }, playbackVideoGraphWrapper.f, playbackVideoGraphWrapper.e);
                playbackVideoGraphWrapper.k = previewingVideoGraphA;
                previewingVideoGraphA.initialize();
                Pair pair = playbackVideoGraphWrapper.l;
                if (pair != null) {
                    Surface surface = (Surface) pair.first;
                    Size size = (Size) pair.second;
                    playbackVideoGraphWrapper.a(surface, size.f2923a, size.b);
                }
                videoSink.getClass();
                playbackVideoGraphWrapper.n = 1;
                try {
                    PreviewingVideoGraph previewingVideoGraph = playbackVideoGraphWrapper.k;
                    previewingVideoGraph.getClass();
                    previewingVideoGraph.c();
                    playbackVideoGraphWrapper.t++;
                    DefaultVideoSinkListener defaultVideoSinkListener = playbackVideoGraphWrapper.new DefaultVideoSinkListener();
                    final HandlerWrapper handlerWrapper = playbackVideoGraphWrapper.j;
                    handlerWrapper.getClass();
                    Executor executor = new Executor() { // from class: androidx.media3.exoplayer.video.e
                        @Override // java.util.concurrent.Executor
                        public final void execute(Runnable runnable) {
                            handlerWrapper.post(runnable);
                        }
                    };
                    DefaultVideoSink defaultVideoSink = (DefaultVideoSink) videoSink;
                    defaultVideoSink.h = defaultVideoSinkListener;
                    defaultVideoSink.i = executor;
                    VideoFrameProcessor videoFrameProcessorA = playbackVideoGraphWrapper.k.a();
                    this.c = videoFrameProcessorA;
                    return videoFrameProcessorA != null;
                } catch (VideoFrameProcessingException e) {
                    throw new VideoSink.VideoSinkException(e, format);
                }
            } catch (VideoFrameProcessingException e2) {
                throw new VideoSink.VideoSinkException(e2, format);
            }
        }

        public final boolean i() {
            return this.c != null;
        }

        public final void j(boolean z) {
            ((DefaultVideoSink) PlaybackVideoGraphWrapper.this.g).f3191a.c(z);
        }

        public final void k(Format format) {
            Format.Builder builderA = format.a();
            ColorInfo colorInfo = format.B;
            if (colorInfo == null || !colorInfo.d()) {
                colorInfo = ColorInfo.h;
            }
            builderA.A = colorInfo;
            builderA.a();
            VideoFrameProcessor videoFrameProcessor = this.c;
            Assertions.g(videoFrameProcessor);
            videoFrameProcessor.b();
        }

        public final void l(int i) {
            VideoFrameReleaseHelper videoFrameReleaseHelper = ((DefaultVideoSink) PlaybackVideoGraphWrapper.this.g).f3191a.b;
            if (videoFrameReleaseHelper.j == i) {
                return;
            }
            videoFrameReleaseHelper.j = i;
            videoFrameReleaseHelper.d(true);
        }

        public final void m(Surface surface, Size size) {
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
            Pair pair = playbackVideoGraphWrapper.l;
            if (pair != null && ((Surface) pair.first).equals(surface) && ((Size) playbackVideoGraphWrapper.l.second).equals(size)) {
                return;
            }
            playbackVideoGraphWrapper.l = Pair.create(surface, size);
            playbackVideoGraphWrapper.a(surface, size.f2923a, size.b);
        }

        public final void n(List list) {
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
            playbackVideoGraphWrapper.c.getClass();
            ImmutableList.Builder builder = new ImmutableList.Builder();
            builder.f(list);
            builder.f(playbackVideoGraphWrapper.e);
            this.b = builder.j();
        }

        public final void o(float f) {
            ((DefaultVideoSink) PlaybackVideoGraphWrapper.this.g).f3191a.h(f);
        }

        public final void p(List list) {
            if (this.b.equals(list)) {
                return;
            }
            n(list);
            Format format = this.d;
            if (format != null) {
                k(format);
            }
        }

        public final void q(VideoFrameMetadataListener videoFrameMetadataListener) {
            ((DefaultVideoSink) PlaybackVideoGraphWrapper.this.g).j = videoFrameMetadataListener;
        }
    }

    public interface Listener {
        void a(VideoSize videoSize);

        void b();

        void c();
    }

    public static final class ReflectiveDefaultVideoFrameProcessorFactory implements VideoFrameProcessor.Factory {

        /* renamed from: a, reason: collision with root package name */
        public static final Supplier f3201a = Suppliers.a(new g());
    }

    public static final class ReflectivePreviewingSingleInputVideoGraphFactory implements PreviewingVideoGraph.Factory {

        /* renamed from: a, reason: collision with root package name */
        public final VideoFrameProcessor.Factory f3202a;

        public ReflectivePreviewingSingleInputVideoGraphFactory(VideoFrameProcessor.Factory factory) {
            this.f3202a = factory;
        }

        @Override // androidx.media3.common.PreviewingVideoGraph.Factory
        public final PreviewingVideoGraph a(Context context, ColorInfo colorInfo, VideoGraph.Listener listener, e eVar, VideoCompositorSettings videoCompositorSettings, List list) throws VideoFrameProcessingException {
            try {
                return ((PreviewingVideoGraph.Factory) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(VideoFrameProcessor.Factory.class).newInstance(this.f3202a)).a(context, colorInfo, listener, eVar, videoCompositorSettings, list);
            } catch (Exception e) {
                if (!(e instanceof VideoFrameProcessingException)) {
                    throw new VideoFrameProcessingException(e);
                }
                int i = VideoFrameProcessingException.d;
                throw ((VideoFrameProcessingException) e);
            }
        }
    }

    public PlaybackVideoGraphWrapper(Builder builder) {
        this.f3198a = builder.f3199a;
        PreviewingVideoGraph.Factory factory = builder.d;
        Assertions.g(factory);
        this.c = factory;
        this.d = new SparseArray();
        this.e = builder.e;
        this.f = builder.f;
        Clock clock = builder.g;
        this.h = clock;
        this.g = new DefaultVideoSink(builder.b, clock);
        this.i = new CopyOnWriteArraySet();
        new Format.Builder().a();
        this.p = -9223372036854775807L;
        this.s = -1;
        this.n = 0;
    }

    public final void a(Surface surface, int i, int i2) {
        PreviewingVideoGraph previewingVideoGraph = this.k;
        if (previewingVideoGraph == null) {
            return;
        }
        VideoSink videoSink = this.g;
        if (surface == null) {
            previewingVideoGraph.b();
            DefaultVideoSink defaultVideoSink = (DefaultVideoSink) videoSink;
            defaultVideoSink.e = null;
            defaultVideoSink.f3191a.g(null);
            return;
        }
        previewingVideoGraph.b();
        new Size(i, i2);
        DefaultVideoSink defaultVideoSink2 = (DefaultVideoSink) videoSink;
        defaultVideoSink2.e = surface;
        defaultVideoSink2.f3191a.g(surface);
    }
}
