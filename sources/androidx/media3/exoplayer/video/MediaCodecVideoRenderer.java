package androidx.media3.exoplayer.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import android.util.SparseArray;
import android.view.Display;
import android.view.Surface;
import androidx.annotation.RequiresApi;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.PreviewingVideoGraph;
import androidx.media3.common.Timeline;
import androidx.media3.common.VideoFrameProcessor;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.ObuParser;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.FormatHolder;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.RendererCapabilities;
import androidx.media3.exoplayer.RendererConfiguration;
import androidx.media3.exoplayer.mediacodec.DefaultMediaCodecAdapterFactory;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecSelector;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper;
import androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.InputVideoSink;
import androidx.media3.exoplayer.video.VideoFrameReleaseControl;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.VideoSink;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.MoreExecutors;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;
import java.util.concurrent.Executor;

@UnstableApi
/* loaded from: classes2.dex */
public class MediaCodecVideoRenderer extends MediaCodecRenderer implements VideoFrameReleaseControl.FrameTimingEvaluator {
    public static final int[] u1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};
    public static boolean v1;
    public static boolean w1;
    public final Context F0;
    public final boolean G0;
    public final VideoRendererEventListener.EventDispatcher H0;
    public final int I0;
    public final boolean J0;
    public final VideoFrameReleaseControl K0;
    public final VideoFrameReleaseControl.FrameReleaseInfo L0;
    public final Av1SampleDependencyParser M0;
    public final long N0;
    public final PriorityQueue O0;
    public CodecMaxValues P0;
    public boolean Q0;
    public boolean R0;
    public VideoSink S0;
    public boolean T0;
    public List U0;
    public Surface V0;
    public PlaceholderSurface W0;
    public Size X0;
    public boolean Y0;
    public int Z0;
    public int a1;
    public long b1;
    public int c1;
    public int d1;
    public int e1;
    public long f1;
    public int g1;
    public long h1;
    public VideoSize i1;
    public VideoSize j1;
    public int k1;
    public boolean l1;
    public int m1;
    public OnFrameRenderedListenerV23 n1;
    public VideoFrameMetadataListener o1;
    public long p1;
    public long q1;
    public boolean r1;
    public boolean s1;
    public int t1;

    @RequiresApi
    public static final class Api26 {
        public static boolean a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null && display.isHdr()) {
                for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                    if (i == 1) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public static final class Builder {

        /* renamed from: a, reason: collision with root package name */
        public final Context f3196a;
        public boolean b;
        public MediaCodecAdapter.Factory d;
        public long e;
        public Handler f;
        public VideoRendererEventListener g;
        public int h;
        public androidx.media3.exoplayer.mediacodec.d c = MediaCodecSelector.b;
        public final float i = 30.0f;
        public long j = -9223372036854775807L;

        public Builder(Context context) {
            this.f3196a = context;
            this.d = new DefaultMediaCodecAdapterFactory(context);
        }
    }

    public static final class CodecMaxValues {

        /* renamed from: a, reason: collision with root package name */
        public final int f3197a;
        public final int b;
        public final int c;

        public CodecMaxValues(int i, int i2, int i3) {
            this.f3197a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    @RequiresApi
    public final class OnFrameRenderedListenerV23 implements MediaCodecAdapter.OnFrameRenderedListener, Handler.Callback {
        public final Handler d;

        public OnFrameRenderedListenerV23(MediaCodecAdapter mediaCodecAdapter) {
            Handler handlerM = Util.m(this);
            this.d = handlerM;
            mediaCodecAdapter.i(this, handlerM);
        }

        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.OnFrameRenderedListener
        public final void a(long j) {
            if (Util.f2928a >= 30) {
                b(j);
            } else {
                Handler handler = this.d;
                handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j >> 32), (int) j));
            }
        }

        public final void b(long j) {
            Surface surface;
            MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
            if (this != mediaCodecVideoRenderer.n1 || mediaCodecVideoRenderer.N == null) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                mediaCodecVideoRenderer.y0 = true;
                return;
            }
            try {
                VideoRendererEventListener.EventDispatcher eventDispatcher = mediaCodecVideoRenderer.H0;
                mediaCodecVideoRenderer.J0(j);
                VideoSize videoSize = mediaCodecVideoRenderer.i1;
                if (!videoSize.equals(VideoSize.d) && !videoSize.equals(mediaCodecVideoRenderer.j1)) {
                    mediaCodecVideoRenderer.j1 = videoSize;
                    eventDispatcher.a(videoSize);
                }
                mediaCodecVideoRenderer.A0.e++;
                VideoFrameReleaseControl videoFrameReleaseControl = mediaCodecVideoRenderer.K0;
                boolean z = videoFrameReleaseControl.e != 3;
                videoFrameReleaseControl.e = 3;
                videoFrameReleaseControl.g = Util.I(videoFrameReleaseControl.l.elapsedRealtime());
                if (z && (surface = mediaCodecVideoRenderer.V0) != null) {
                    Handler handler = eventDispatcher.f3208a;
                    if (handler != null) {
                        handler.post(new i(eventDispatcher, surface, SystemClock.elapsedRealtime()));
                    }
                    mediaCodecVideoRenderer.Y0 = true;
                }
                mediaCodecVideoRenderer.q0(j);
            } catch (ExoPlaybackException e) {
                mediaCodecVideoRenderer.z0 = e;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            int i = message.arg1;
            int i2 = message.arg2;
            int i3 = Util.f2928a;
            b(((i & 4294967295L) << 32) | (4294967295L & i2));
            return true;
        }
    }

    public MediaCodecVideoRenderer(Builder builder) {
        super(2, builder.d, builder.c, builder.i);
        Context applicationContext = builder.f3196a.getApplicationContext();
        this.F0 = applicationContext;
        this.I0 = builder.h;
        this.S0 = null;
        this.H0 = new VideoRendererEventListener.EventDispatcher(builder.f, builder.g);
        this.G0 = this.S0 == null;
        this.K0 = new VideoFrameReleaseControl(applicationContext, this, builder.e);
        this.L0 = new VideoFrameReleaseControl.FrameReleaseInfo();
        this.J0 = "NVIDIA".equals(Build.MANUFACTURER);
        this.X0 = Size.c;
        this.Z0 = 1;
        this.a1 = 0;
        this.i1 = VideoSize.d;
        this.m1 = 0;
        this.j1 = null;
        this.k1 = -1000;
        this.p1 = -9223372036854775807L;
        this.q1 = -9223372036854775807L;
        this.M0 = null;
        this.O0 = new PriorityQueue();
        long j = builder.j;
        this.N0 = j != -9223372036854775807L ? -j : -9223372036854775807L;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean K0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 3206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.K0(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int L0(androidx.media3.exoplayer.mediacodec.MediaCodecInfo r11, androidx.media3.common.Format r12) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.L0(androidx.media3.exoplayer.mediacodec.MediaCodecInfo, androidx.media3.common.Format):int");
    }

    public static List M0(Context context, MediaCodecSelector mediaCodecSelector, Format format, boolean z, boolean z2) {
        String str = format.n;
        if (str == null) {
            return ImmutableList.t();
        }
        if (Util.f2928a >= 26 && "video/dolby-vision".equals(str) && !Api26.a(context)) {
            String strB = MediaCodecUtil.b(format);
            List listT = strB == null ? ImmutableList.t() : mediaCodecSelector.a(strB, z, z2);
            if (!listT.isEmpty()) {
                return listT;
            }
        }
        return MediaCodecUtil.g(mediaCodecSelector, format, z, z2);
    }

    public static int N0(MediaCodecInfo mediaCodecInfo, Format format) {
        int i = format.o;
        List list = format.q;
        if (i == -1) {
            return L0(mediaCodecInfo, format);
        }
        int size = list.size();
        int length = 0;
        for (int i2 = 0; i2 < size; i2++) {
            length += ((byte[]) list.get(i2)).length;
        }
        return format.o + length;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public final void B(float f, float f2) {
        super.B(f, f2);
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            ((PlaybackVideoGraphWrapper.InputVideoSink) videoSink).o(f);
        } else {
            this.K0.h(f);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean D0(DecoderInputBuffer decoderInputBuffer) {
        ByteBuffer byteBuffer;
        boolean z;
        ObuParser.SequenceHeader sequenceHeader;
        ObuParser.FrameHeader frameHeader;
        if (!f() && !decoderInputBuffer.f(536870912) && this.q1 != -9223372036854775807L) {
            if (this.q1 - (decoderInputBuffer.i - c0()) > 100000 && !decoderInputBuffer.f(1073741824)) {
                boolean z2 = decoderInputBuffer.i < this.o;
                if ((z2 || this.s1) && !decoderInputBuffer.f(268435456)) {
                    boolean zF = decoderInputBuffer.f(67108864);
                    PriorityQueue priorityQueue = this.O0;
                    if (zF) {
                        decoderInputBuffer.l();
                        if (z2) {
                            this.A0.d++;
                            return true;
                        }
                        if (this.s1) {
                            priorityQueue.add(Long.valueOf(decoderInputBuffer.i));
                            this.t1++;
                            return true;
                        }
                    } else {
                        Av1SampleDependencyParser av1SampleDependencyParser = this.M0;
                        if (av1SampleDependencyParser != null) {
                            MediaCodecInfo mediaCodecInfo = this.U;
                            mediaCodecInfo.getClass();
                            if (mediaCodecInfo.b.equals("video/av01") && (byteBuffer = decoderInputBuffer.g) != null) {
                                boolean z3 = z2 || this.t1 <= 0;
                                ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
                                byteBufferAsReadOnlyBuffer.flip();
                                ArrayList arrayListB = ObuParser.b(byteBufferAsReadOnlyBuffer);
                                av1SampleDependencyParser.a(arrayListB);
                                int size = arrayListB.size() - 1;
                                int i = 0;
                                while (true) {
                                    if (size < 0) {
                                        z = false;
                                        break;
                                    }
                                    ObuParser.Obu obu = (ObuParser.Obu) arrayListB.get(size);
                                    int i2 = obu.f2949a;
                                    z = false;
                                    if (i2 != 2 && i2 != 15) {
                                        if ((i2 == 3 && !z3) || ((i2 != 6 && i2 != 3) || (sequenceHeader = av1SampleDependencyParser.f3190a) == null)) {
                                            break;
                                        }
                                        try {
                                            frameHeader = new ObuParser.FrameHeader(sequenceHeader, obu);
                                        } catch (ObuParser.NotYetImplementedException unused) {
                                            frameHeader = null;
                                        }
                                        if (frameHeader == null || frameHeader.f2948a) {
                                            break;
                                        }
                                    }
                                    if (((ObuParser.Obu) arrayListB.get(size)).f2949a == 6 || ((ObuParser.Obu) arrayListB.get(size)).f2949a == 3) {
                                        i++;
                                    }
                                    size--;
                                }
                                int iLimit = (i > 1 || size + 1 >= 8) ? byteBufferAsReadOnlyBuffer.limit() : size >= 0 ? ((ObuParser.Obu) arrayListB.get(size)).b.limit() : byteBufferAsReadOnlyBuffer.position();
                                CodecMaxValues codecMaxValues = this.P0;
                                codecMaxValues.getClass();
                                boolean z4 = codecMaxValues.c + iLimit < byteBufferAsReadOnlyBuffer.capacity() ? true : z;
                                if (iLimit == byteBufferAsReadOnlyBuffer.limit() || !z4) {
                                    return z;
                                }
                                ByteBuffer byteBuffer2 = decoderInputBuffer.g;
                                byteBuffer2.getClass();
                                byteBuffer2.position(iLimit);
                                if (z2) {
                                    this.A0.d++;
                                } else if (this.s1) {
                                    priorityQueue.add(Long.valueOf(decoderInputBuffer.i));
                                    this.t1++;
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void E() {
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.H0;
        this.j1 = null;
        this.q1 = -9223372036854775807L;
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            ((DefaultVideoSink) PlaybackVideoGraphWrapper.this.g).f3191a.d(0);
        } else {
            this.K0.d(0);
        }
        R0();
        this.Y0 = false;
        this.n1 = null;
        try {
            super.E();
            DecoderCounters decoderCounters = this.A0;
            eventDispatcher.getClass();
            synchronized (decoderCounters) {
            }
            Handler handler = eventDispatcher.f3208a;
            if (handler != null) {
                handler.post(new j(eventDispatcher, decoderCounters, 1));
            }
            eventDispatcher.a(VideoSize.d);
        } catch (Throwable th) {
            DecoderCounters decoderCounters2 = this.A0;
            eventDispatcher.getClass();
            synchronized (decoderCounters2) {
                Handler handler2 = eventDispatcher.f3208a;
                if (handler2 != null) {
                    handler2.post(new j(eventDispatcher, decoderCounters2, 1));
                }
                eventDispatcher.a(VideoSize.d);
                throw th;
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean E0(MediaCodecInfo mediaCodecInfo) {
        return P0(mediaCodecInfo);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void F(boolean z, boolean z2) {
        super.F(z, z2);
        RendererConfiguration rendererConfiguration = this.g;
        rendererConfiguration.getClass();
        boolean z3 = rendererConfiguration.b;
        Assertions.f((z3 && this.m1 == 0) ? false : true);
        if (this.l1 != z3) {
            this.l1 = z3;
            x0();
        }
        DecoderCounters decoderCounters = this.A0;
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.H0;
        Handler handler = eventDispatcher.f3208a;
        if (handler != null) {
            handler.post(new j(eventDispatcher, decoderCounters, 0));
        }
        boolean z4 = this.T0;
        VideoFrameReleaseControl videoFrameReleaseControl = this.K0;
        if (!z4) {
            if (this.U0 != null && this.S0 == null) {
                PlaybackVideoGraphWrapper.Builder builder = new PlaybackVideoGraphWrapper.Builder(this.F0, videoFrameReleaseControl);
                Clock clock = this.j;
                clock.getClass();
                builder.g = clock;
                Assertions.f(!builder.h);
                if (builder.d == null) {
                    if (builder.c == null) {
                        builder.c = new PlaybackVideoGraphWrapper.ReflectiveDefaultVideoFrameProcessorFactory();
                    }
                    builder.d = new PlaybackVideoGraphWrapper.ReflectivePreviewingSingleInputVideoGraphFactory(builder.c);
                }
                PlaybackVideoGraphWrapper playbackVideoGraphWrapper = new PlaybackVideoGraphWrapper(builder);
                builder.h = true;
                playbackVideoGraphWrapper.s = 1;
                SparseArray sparseArray = playbackVideoGraphWrapper.d;
                Assertions.f(!Util.k(sparseArray, 0));
                PlaybackVideoGraphWrapper.InputVideoSink inputVideoSink = playbackVideoGraphWrapper.new InputVideoSink(playbackVideoGraphWrapper.f3198a);
                playbackVideoGraphWrapper.i.add(inputVideoSink);
                sparseArray.put(0, inputVideoSink);
                this.S0 = inputVideoSink;
            }
            this.T0 = true;
        }
        VideoSink videoSink = this.S0;
        if (videoSink == null) {
            Clock clock2 = this.j;
            clock2.getClass();
            videoFrameReleaseControl.l = clock2;
            videoFrameReleaseControl.e = z2 ? 1 : 0;
            return;
        }
        VideoSink.Listener listener = new VideoSink.Listener() { // from class: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.1
            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public final void a(VideoSize videoSize) {
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public final void b() {
                MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
                Surface surface = mediaCodecVideoRenderer.V0;
                if (surface != null) {
                    VideoRendererEventListener.EventDispatcher eventDispatcher2 = mediaCodecVideoRenderer.H0;
                    Handler handler2 = eventDispatcher2.f3208a;
                    if (handler2 != null) {
                        handler2.post(new i(eventDispatcher2, surface, SystemClock.elapsedRealtime()));
                    }
                    mediaCodecVideoRenderer.Y0 = true;
                }
            }

            @Override // androidx.media3.exoplayer.video.VideoSink.Listener
            public final void c() {
                MediaCodecVideoRenderer mediaCodecVideoRenderer = MediaCodecVideoRenderer.this;
                if (mediaCodecVideoRenderer.V0 != null) {
                    mediaCodecVideoRenderer.X0(0, 1);
                }
            }
        };
        Executor executorA = MoreExecutors.a();
        PlaybackVideoGraphWrapper.InputVideoSink inputVideoSink2 = (PlaybackVideoGraphWrapper.InputVideoSink) videoSink;
        inputVideoSink2.g = listener;
        inputVideoSink2.h = executorA;
        VideoFrameMetadataListener videoFrameMetadataListener = this.o1;
        if (videoFrameMetadataListener != null) {
            ((PlaybackVideoGraphWrapper.InputVideoSink) this.S0).q(videoFrameMetadataListener);
        }
        if (this.V0 != null && !this.X0.equals(Size.c)) {
            ((PlaybackVideoGraphWrapper.InputVideoSink) this.S0).m(this.V0, this.X0);
        }
        ((PlaybackVideoGraphWrapper.InputVideoSink) this.S0).l(this.a1);
        ((PlaybackVideoGraphWrapper.InputVideoSink) this.S0).o(this.L);
        List list = this.U0;
        if (list != null) {
            ((PlaybackVideoGraphWrapper.InputVideoSink) this.S0).p(list);
        }
        VideoSink videoSink2 = this.S0;
        ((DefaultVideoSink) PlaybackVideoGraphWrapper.this.g).f3191a.e = z2 ? 1 : 0;
        Renderer.WakeupListener wakeupListener = this.I;
        if (wakeupListener != null) {
            PlaybackVideoGraphWrapper.this.o = wakeupListener;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void G(long j, boolean z) {
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            if (!z) {
                ((PlaybackVideoGraphWrapper.InputVideoSink) videoSink).g(true);
            }
            ((PlaybackVideoGraphWrapper.InputVideoSink) this.S0).e(d0(), -this.p1);
            this.r1 = true;
        }
        super.G(j, z);
        VideoSink videoSink2 = this.S0;
        VideoFrameReleaseControl videoFrameReleaseControl = this.K0;
        if (videoSink2 == null) {
            VideoFrameReleaseHelper videoFrameReleaseHelper = videoFrameReleaseControl.b;
            videoFrameReleaseHelper.m = 0L;
            videoFrameReleaseHelper.p = -1L;
            videoFrameReleaseHelper.n = -1L;
            videoFrameReleaseControl.h = -9223372036854775807L;
            videoFrameReleaseControl.f = -9223372036854775807L;
            videoFrameReleaseControl.d(1);
            videoFrameReleaseControl.i = -9223372036854775807L;
        }
        if (z) {
            VideoSink videoSink3 = this.S0;
            if (videoSink3 != null) {
                ((PlaybackVideoGraphWrapper.InputVideoSink) videoSink3).j(false);
            } else {
                videoFrameReleaseControl.c(false);
            }
        }
        R0();
        this.d1 = 0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final int G0(MediaCodecSelector mediaCodecSelector, Format format) {
        boolean z;
        int i = 0;
        if (!MimeTypes.l(format.n)) {
            return RendererCapabilities.g(0, 0, 0, 0);
        }
        boolean z2 = format.r != null;
        Context context = this.F0;
        List listM0 = M0(context, mediaCodecSelector, format, z2, false);
        if (z2 && listM0.isEmpty()) {
            listM0 = M0(context, mediaCodecSelector, format, false, false);
        }
        if (listM0.isEmpty()) {
            return RendererCapabilities.g(1, 0, 0, 0);
        }
        int i2 = format.M;
        if (i2 != 0 && i2 != 2) {
            return RendererCapabilities.g(2, 0, 0, 0);
        }
        MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) listM0.get(0);
        boolean zE = mediaCodecInfo.e(format);
        if (zE) {
            z = true;
        } else {
            for (int i3 = 1; i3 < listM0.size(); i3++) {
                MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) listM0.get(i3);
                if (mediaCodecInfo2.e(format)) {
                    z = false;
                    zE = true;
                    mediaCodecInfo = mediaCodecInfo2;
                    break;
                }
            }
            z = true;
        }
        int i4 = zE ? 4 : 3;
        int i5 = mediaCodecInfo.f(format) ? 16 : 8;
        int i6 = mediaCodecInfo.g ? 64 : 0;
        int i7 = z ? 128 : 0;
        if (Util.f2928a >= 26 && "video/dolby-vision".equals(format.n) && !Api26.a(context)) {
            i7 = 256;
        }
        if (zE) {
            List listM02 = M0(context, mediaCodecSelector, format, z2, true);
            if (!listM02.isEmpty()) {
                HashMap map = MediaCodecUtil.f3110a;
                ArrayList arrayList = new ArrayList(listM02);
                Collections.sort(arrayList, new androidx.media3.exoplayer.mediacodec.f(new androidx.media3.exoplayer.mediacodec.e(format)));
                MediaCodecInfo mediaCodecInfo3 = (MediaCodecInfo) arrayList.get(0);
                if (mediaCodecInfo3.e(format) && mediaCodecInfo3.f(format)) {
                    i = 32;
                }
            }
        }
        return i4 | i5 | i | i6 | i7;
    }

    @Override // androidx.media3.exoplayer.BaseRenderer
    public final void H() {
        VideoSink videoSink = this.S0;
        if (videoSink == null || !this.G0) {
            return;
        }
        PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
        if (playbackVideoGraphWrapper.n == 2) {
            return;
        }
        HandlerWrapper handlerWrapper = playbackVideoGraphWrapper.j;
        if (handlerWrapper != null) {
            handlerWrapper.c();
        }
        PreviewingVideoGraph previewingVideoGraph = playbackVideoGraphWrapper.k;
        if (previewingVideoGraph != null) {
            previewingVideoGraph.release();
        }
        playbackVideoGraphWrapper.l = null;
        playbackVideoGraphWrapper.n = 2;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void I() {
        try {
            super.I();
        } finally {
            this.T0 = false;
            this.p1 = -9223372036854775807L;
            PlaceholderSurface placeholderSurface = this.W0;
            if (placeholderSurface != null) {
                placeholderSurface.release();
                this.W0 = null;
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void J() {
        this.c1 = 0;
        Clock clock = this.j;
        clock.getClass();
        this.b1 = clock.elapsedRealtime();
        this.f1 = 0L;
        this.g1 = 0;
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            ((DefaultVideoSink) PlaybackVideoGraphWrapper.this.g).f3191a.e();
        } else {
            this.K0.e();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void K() {
        Q0();
        int i = this.g1;
        if (i != 0) {
            long j = this.f1;
            VideoRendererEventListener.EventDispatcher eventDispatcher = this.H0;
            Handler handler = eventDispatcher.f3208a;
            if (handler != null) {
                handler.post(new h(eventDispatcher, j, i));
            }
            this.f1 = 0L;
            this.g1 = 0;
        }
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            ((DefaultVideoSink) PlaybackVideoGraphWrapper.this.g).f3191a.f();
        } else {
            this.K0.f();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer
    public final void L(Format[] formatArr, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId) {
        super.L(formatArr, j, j2, mediaPeriodId);
        if (this.p1 == -9223372036854775807L) {
            this.p1 = j;
        }
        Timeline timeline = this.s;
        if (timeline.p()) {
            this.q1 = -9223372036854775807L;
        } else {
            mediaPeriodId.getClass();
            this.q1 = timeline.g(mediaPeriodId.f3130a, new Timeline.Period()).d;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final DecoderReuseEvaluation O(MediaCodecInfo mediaCodecInfo, Format format, Format format2) {
        DecoderReuseEvaluation decoderReuseEvaluationB = mediaCodecInfo.b(format, format2);
        int i = decoderReuseEvaluationB.e;
        CodecMaxValues codecMaxValues = this.P0;
        codecMaxValues.getClass();
        if (format2.u > codecMaxValues.f3197a || format2.v > codecMaxValues.b) {
            i |= 256;
        }
        if (N0(mediaCodecInfo, format2) > codecMaxValues.c) {
            i |= 64;
        }
        int i2 = i;
        return new DecoderReuseEvaluation(mediaCodecInfo.f3106a, format, format2, i2 != 0 ? 0 : decoderReuseEvaluationB.d, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.Surface O0(androidx.media3.exoplayer.mediacodec.MediaCodecInfo r6) {
        /*
            r5 = this;
            androidx.media3.exoplayer.video.VideoSink r0 = r5.S0
            if (r0 == 0) goto L17
            androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper$InputVideoSink r0 = (androidx.media3.exoplayer.video.PlaybackVideoGraphWrapper.InputVideoSink) r0
            boolean r6 = r0.i()
            androidx.media3.common.util.Assertions.f(r6)
            androidx.media3.common.VideoFrameProcessor r6 = r0.c
            androidx.media3.common.util.Assertions.g(r6)
            android.view.Surface r6 = r6.a()
            return r6
        L17:
            android.view.Surface r0 = r5.V0
            if (r0 == 0) goto L1c
            return r0
        L1c:
            int r0 = androidx.media3.common.util.Util.f2928a
            r1 = 35
            r2 = 0
            if (r0 < r1) goto L28
            boolean r0 = r6.h
            if (r0 == 0) goto L28
            return r2
        L28:
            boolean r0 = r5.V0(r6)
            androidx.media3.common.util.Assertions.f(r0)
            androidx.media3.exoplayer.video.PlaceholderSurface r0 = r5.W0
            if (r0 == 0) goto L40
            boolean r1 = r0.d
            boolean r3 = r6.f
            if (r1 == r3) goto L40
            if (r0 == 0) goto L40
            r0.release()
            r5.W0 = r2
        L40:
            androidx.media3.exoplayer.video.PlaceholderSurface r0 = r5.W0
            if (r0 != 0) goto Lb9
            android.content.Context r0 = r5.F0
            boolean r6 = r6.f
            r1 = 1
            r2 = 0
            if (r6 == 0) goto L55
            boolean r0 = androidx.media3.exoplayer.video.PlaceholderSurface.a(r0)
            if (r0 == 0) goto L53
            goto L57
        L53:
            r0 = r2
            goto L58
        L55:
            int r0 = androidx.media3.exoplayer.video.PlaceholderSurface.g
        L57:
            r0 = r1
        L58:
            androidx.media3.common.util.Assertions.f(r0)
            androidx.media3.exoplayer.video.PlaceholderSurface$PlaceholderSurfaceThread r0 = new androidx.media3.exoplayer.video.PlaceholderSurface$PlaceholderSurfaceThread
            java.lang.String r3 = "ExoPlayer:PlaceholderSurface"
            r0.<init>(r3)
            if (r6 == 0) goto L67
            int r6 = androidx.media3.exoplayer.video.PlaceholderSurface.g
            goto L68
        L67:
            r6 = r2
        L68:
            r0.start()
            android.os.Handler r3 = new android.os.Handler
            android.os.Looper r4 = r0.getLooper()
            r3.<init>(r4, r0)
            r0.e = r3
            androidx.media3.common.util.EGLSurfaceTexture r4 = new androidx.media3.common.util.EGLSurfaceTexture
            r4.<init>(r3)
            r0.d = r4
            monitor-enter(r0)
            android.os.Handler r3 = r0.e     // Catch: java.lang.Throwable -> L97
            android.os.Message r6 = r3.obtainMessage(r1, r6, r2)     // Catch: java.lang.Throwable -> L97
            r6.sendToTarget()     // Catch: java.lang.Throwable -> L97
        L87:
            androidx.media3.exoplayer.video.PlaceholderSurface r6 = r0.h     // Catch: java.lang.Throwable -> L97
            if (r6 != 0) goto L9b
            java.lang.RuntimeException r6 = r0.g     // Catch: java.lang.Throwable -> L97
            if (r6 != 0) goto L9b
            java.lang.Error r6 = r0.f     // Catch: java.lang.Throwable -> L97
            if (r6 != 0) goto L9b
            r0.wait()     // Catch: java.lang.Throwable -> L97 java.lang.InterruptedException -> L99
            goto L87
        L97:
            r6 = move-exception
            goto Lb7
        L99:
            r2 = r1
            goto L87
        L9b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L97
            if (r2 == 0) goto La5
            java.lang.Thread r6 = java.lang.Thread.currentThread()
            r6.interrupt()
        La5:
            java.lang.RuntimeException r6 = r0.g
            if (r6 != 0) goto Lb6
            java.lang.Error r6 = r0.f
            if (r6 != 0) goto Lb5
            androidx.media3.exoplayer.video.PlaceholderSurface r6 = r0.h
            r6.getClass()
            r5.W0 = r6
            goto Lb9
        Lb5:
            throw r6
        Lb6:
            throw r6
        Lb7:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L97
            throw r6
        Lb9:
            androidx.media3.exoplayer.video.PlaceholderSurface r6 = r5.W0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.O0(androidx.media3.exoplayer.mediacodec.MediaCodecInfo):android.view.Surface");
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final MediaCodecDecoderException P(IllegalStateException illegalStateException, MediaCodecInfo mediaCodecInfo) {
        Surface surface = this.V0;
        MediaCodecVideoDecoderException mediaCodecVideoDecoderException = new MediaCodecVideoDecoderException(illegalStateException, mediaCodecInfo);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return mediaCodecVideoDecoderException;
    }

    public final boolean P0(MediaCodecInfo mediaCodecInfo) {
        if (this.S0 != null) {
            return true;
        }
        Surface surface = this.V0;
        if (surface == null || !surface.isValid()) {
            return (Util.f2928a >= 35 && mediaCodecInfo.h) || V0(mediaCodecInfo);
        }
        return true;
    }

    public final void Q0() {
        if (this.c1 > 0) {
            Clock clock = this.j;
            clock.getClass();
            long jElapsedRealtime = clock.elapsedRealtime();
            long j = jElapsedRealtime - this.b1;
            int i = this.c1;
            VideoRendererEventListener.EventDispatcher eventDispatcher = this.H0;
            Handler handler = eventDispatcher.f3208a;
            if (handler != null) {
                handler.post(new h(eventDispatcher, i, j));
            }
            this.c1 = 0;
            this.b1 = jElapsedRealtime;
        }
    }

    public final void R0() {
        int i;
        MediaCodecAdapter mediaCodecAdapter;
        if (!this.l1 || (i = Util.f2928a) < 23 || (mediaCodecAdapter = this.N) == null) {
            return;
        }
        this.n1 = new OnFrameRenderedListenerV23(mediaCodecAdapter);
        if (i >= 33) {
            Bundle bundle = new Bundle();
            bundle.putInt("tunnel-peek", 1);
            mediaCodecAdapter.b(bundle);
        }
    }

    public final void S0(MediaCodecAdapter mediaCodecAdapter, int i, long j) {
        Surface surface;
        Trace.beginSection("releaseOutputBuffer");
        mediaCodecAdapter.f(i, j);
        Trace.endSection();
        this.A0.e++;
        this.d1 = 0;
        if (this.S0 == null) {
            VideoSize videoSize = this.i1;
            boolean zEquals = videoSize.equals(VideoSize.d);
            VideoRendererEventListener.EventDispatcher eventDispatcher = this.H0;
            if (!zEquals && !videoSize.equals(this.j1)) {
                this.j1 = videoSize;
                eventDispatcher.a(videoSize);
            }
            VideoFrameReleaseControl videoFrameReleaseControl = this.K0;
            boolean z = videoFrameReleaseControl.e != 3;
            videoFrameReleaseControl.e = 3;
            videoFrameReleaseControl.g = Util.I(videoFrameReleaseControl.l.elapsedRealtime());
            if (!z || (surface = this.V0) == null) {
                return;
            }
            Handler handler = eventDispatcher.f3208a;
            if (handler != null) {
                handler.post(new i(eventDispatcher, surface, SystemClock.elapsedRealtime()));
            }
            this.Y0 = true;
        }
    }

    public final void T0(Object obj) {
        Handler handler;
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        Surface surface2 = this.V0;
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.H0;
        if (surface2 == surface) {
            if (surface != null) {
                VideoSize videoSize = this.j1;
                if (videoSize != null) {
                    eventDispatcher.a(videoSize);
                }
                Surface surface3 = this.V0;
                if (surface3 == null || !this.Y0 || (handler = eventDispatcher.f3208a) == null) {
                    return;
                }
                handler.post(new i(eventDispatcher, surface3, SystemClock.elapsedRealtime()));
                return;
            }
            return;
        }
        this.V0 = surface;
        VideoSink videoSink = this.S0;
        VideoFrameReleaseControl videoFrameReleaseControl = this.K0;
        if (videoSink == null) {
            videoFrameReleaseControl.g(surface);
        }
        this.Y0 = false;
        int i = this.k;
        MediaCodecAdapter mediaCodecAdapter = this.N;
        if (mediaCodecAdapter != null && this.S0 == null) {
            MediaCodecInfo mediaCodecInfo = this.U;
            mediaCodecInfo.getClass();
            boolean zP0 = P0(mediaCodecInfo);
            int i2 = Util.f2928a;
            if (i2 < 23 || !zP0 || this.Q0) {
                x0();
                h0();
            } else {
                Surface surfaceO0 = O0(mediaCodecInfo);
                if (i2 >= 23 && surfaceO0 != null) {
                    mediaCodecAdapter.m(surfaceO0);
                } else {
                    if (i2 < 35) {
                        throw new IllegalStateException();
                    }
                    mediaCodecAdapter.k();
                }
            }
        }
        if (surface != null) {
            VideoSize videoSize2 = this.j1;
            if (videoSize2 != null) {
                eventDispatcher.a(videoSize2);
            }
        } else {
            this.j1 = null;
            VideoSink videoSink2 = this.S0;
            if (videoSink2 != null) {
                PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
                Size size = Size.c;
                playbackVideoGraphWrapper.a(null, size.f2923a, size.b);
                playbackVideoGraphWrapper.l = null;
            }
        }
        if (i == 2) {
            VideoSink videoSink3 = this.S0;
            if (videoSink3 != null) {
                ((PlaybackVideoGraphWrapper.InputVideoSink) videoSink3).j(true);
            } else {
                videoFrameReleaseControl.c(true);
            }
        }
        R0();
    }

    public final boolean U0(long j, long j2, boolean z, boolean z2) {
        long j3 = this.N0;
        if (j3 != -9223372036854775807L) {
            this.s1 = j2 > this.o + 200000 && j < j3;
        }
        if (j < -500000 && !z) {
            SampleStream sampleStream = this.l;
            sampleStream.getClass();
            int iQ = sampleStream.q(j2 - this.n);
            if (iQ != 0) {
                PriorityQueue priorityQueue = this.O0;
                if (z2) {
                    DecoderCounters decoderCounters = this.A0;
                    int i = decoderCounters.d + iQ;
                    decoderCounters.d = i;
                    decoderCounters.f += this.e1;
                    decoderCounters.d = priorityQueue.size() + i;
                } else {
                    this.A0.j++;
                    X0(priorityQueue.size() + iQ, this.e1);
                }
                if (V()) {
                    h0();
                }
                VideoSink videoSink = this.S0;
                if (videoSink != null) {
                    ((PlaybackVideoGraphWrapper.InputVideoSink) videoSink).g(false);
                }
                return true;
            }
        }
        return false;
    }

    public final boolean V0(MediaCodecInfo mediaCodecInfo) {
        if (Util.f2928a < 23 || this.l1 || K0(mediaCodecInfo.f3106a)) {
            return false;
        }
        return !mediaCodecInfo.f || PlaceholderSurface.a(this.F0);
    }

    public final void W0(MediaCodecAdapter mediaCodecAdapter, int i) {
        Trace.beginSection("skipVideoBuffer");
        mediaCodecAdapter.e(i);
        Trace.endSection();
        this.A0.f++;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final int X(DecoderInputBuffer decoderInputBuffer) {
        return (Util.f2928a < 34 || !this.l1 || decoderInputBuffer.i >= this.o) ? 0 : 32;
    }

    public final void X0(int i, int i2) {
        DecoderCounters decoderCounters = this.A0;
        decoderCounters.h += i;
        int i3 = i + i2;
        decoderCounters.g += i3;
        this.c1 += i3;
        int i4 = this.d1 + i3;
        this.d1 = i4;
        decoderCounters.i = Math.max(i4, decoderCounters.i);
        int i5 = this.I0;
        if (i5 <= 0 || this.c1 < i5) {
            return;
        }
        Q0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean Y() {
        return this.l1 && Util.f2928a < 23;
    }

    public final void Y0(long j) {
        DecoderCounters decoderCounters = this.A0;
        decoderCounters.k += j;
        decoderCounters.l++;
        this.f1 += j;
        this.g1++;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final float Z(float f, Format[] formatArr) {
        float fMax = -1.0f;
        for (Format format : formatArr) {
            float f2 = format.w;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final ArrayList a0(MediaCodecSelector mediaCodecSelector, Format format, boolean z) {
        List listM0 = M0(this.F0, mediaCodecSelector, format, z, this.l1);
        HashMap map = MediaCodecUtil.f3110a;
        ArrayList arrayList = new ArrayList(listM0);
        Collections.sort(arrayList, new androidx.media3.exoplayer.mediacodec.f(new androidx.media3.exoplayer.mediacodec.e(format)));
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.Renderer
    public final boolean b() {
        if (!this.w0) {
            return false;
        }
        VideoSink videoSink = this.S0;
        if (videoSink == null) {
            return true;
        }
        PlaybackVideoGraphWrapper.InputVideoSink inputVideoSink = (PlaybackVideoGraphWrapper.InputVideoSink) videoSink;
        if (!inputVideoSink.i()) {
            return false;
        }
        PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
        if (playbackVideoGraphWrapper.m != 0 || !playbackVideoGraphWrapper.q) {
            return false;
        }
        VideoFrameRenderControl videoFrameRenderControl = ((DefaultVideoSink) playbackVideoGraphWrapper.g).c;
        long j = videoFrameRenderControl.i;
        return (j > (-9223372036854775807L) ? 1 : (j == (-9223372036854775807L) ? 0 : -1)) != 0 && (videoFrameRenderControl.h > j ? 1 : (videoFrameRenderControl.h == j ? 0 : -1)) == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x0135, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0138, code lost:
    
        r15 = r9;
     */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Configuration b0(androidx.media3.exoplayer.mediacodec.MediaCodecInfo r25, androidx.media3.common.Format r26, android.media.MediaCrypto r27, float r28) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.b0(androidx.media3.exoplayer.mediacodec.MediaCodecInfo, androidx.media3.common.Format, android.media.MediaCrypto, float):androidx.media3.exoplayer.mediacodec.MediaCodecAdapter$Configuration");
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void e0(DecoderInputBuffer decoderInputBuffer) {
        if (this.R0) {
            ByteBuffer byteBuffer = decoderInputBuffer.j;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        MediaCodecAdapter mediaCodecAdapter = this.N;
                        mediaCodecAdapter.getClass();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        mediaCodecAdapter.b(bundle);
                    }
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.Renderer, androidx.media3.exoplayer.RendererCapabilities
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.BaseRenderer, androidx.media3.exoplayer.PlayerMessage.Target
    public final void i(int i, Object obj) {
        if (i == 1) {
            T0(obj);
            return;
        }
        if (i == 7) {
            obj.getClass();
            VideoFrameMetadataListener videoFrameMetadataListener = (VideoFrameMetadataListener) obj;
            this.o1 = videoFrameMetadataListener;
            VideoSink videoSink = this.S0;
            if (videoSink != null) {
                ((PlaybackVideoGraphWrapper.InputVideoSink) videoSink).q(videoFrameMetadataListener);
                return;
            }
            return;
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (this.m1 != iIntValue) {
                this.m1 = iIntValue;
                if (this.l1) {
                    x0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            this.Z0 = iIntValue2;
            MediaCodecAdapter mediaCodecAdapter = this.N;
            if (mediaCodecAdapter != null) {
                mediaCodecAdapter.d(iIntValue2);
                return;
            }
            return;
        }
        if (i == 5) {
            obj.getClass();
            int iIntValue3 = ((Integer) obj).intValue();
            this.a1 = iIntValue3;
            VideoSink videoSink2 = this.S0;
            if (videoSink2 != null) {
                ((PlaybackVideoGraphWrapper.InputVideoSink) videoSink2).l(iIntValue3);
                return;
            }
            VideoFrameReleaseHelper videoFrameReleaseHelper = this.K0.b;
            if (videoFrameReleaseHelper.j == iIntValue3) {
                return;
            }
            videoFrameReleaseHelper.j = iIntValue3;
            videoFrameReleaseHelper.d(true);
            return;
        }
        if (i == 13) {
            obj.getClass();
            List list = (List) obj;
            this.U0 = list;
            VideoSink videoSink3 = this.S0;
            if (videoSink3 != null) {
                ((PlaybackVideoGraphWrapper.InputVideoSink) videoSink3).p(list);
                return;
            }
            return;
        }
        if (i == 14) {
            obj.getClass();
            Size size = (Size) obj;
            if (size.f2923a == 0 || size.b == 0) {
                return;
            }
            this.X0 = size;
            VideoSink videoSink4 = this.S0;
            if (videoSink4 != null) {
                Surface surface = this.V0;
                Assertions.g(surface);
                ((PlaybackVideoGraphWrapper.InputVideoSink) videoSink4).m(surface, size);
                return;
            }
            return;
        }
        if (i != 16) {
            if (i != 17) {
                super.i(i, obj);
                return;
            }
            Surface surface2 = this.V0;
            T0(null);
            obj.getClass();
            ((MediaCodecVideoRenderer) obj).i(1, surface2);
            return;
        }
        obj.getClass();
        this.k1 = ((Integer) obj).intValue();
        MediaCodecAdapter mediaCodecAdapter2 = this.N;
        if (mediaCodecAdapter2 != null && Util.f2928a >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.k1));
            mediaCodecAdapter2.b(bundle);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public final boolean isReady() {
        boolean zIsReady = super.isReady();
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            PlaybackVideoGraphWrapper.InputVideoSink inputVideoSink = (PlaybackVideoGraphWrapper.InputVideoSink) videoSink;
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
            boolean z = zIsReady && inputVideoSink.i();
            return ((DefaultVideoSink) playbackVideoGraphWrapper.g).f3191a.b(z && playbackVideoGraphWrapper.m == 0);
        }
        if (zIsReady && (this.N == null || this.l1)) {
            return true;
        }
        return this.K0.b(zIsReady);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean j0(Format format) throws ExoPlaybackException {
        VideoSink videoSink = this.S0;
        if (videoSink == null || ((PlaybackVideoGraphWrapper.InputVideoSink) videoSink).i()) {
            return true;
        }
        try {
            return ((PlaybackVideoGraphWrapper.InputVideoSink) this.S0).h(format);
        } catch (VideoSink.VideoSinkException e) {
            throw D(e, format, false, 7000);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void k0(Exception exc) {
        Log.d("MediaCodecVideoRenderer", "Video codec error", exc);
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.H0;
        Handler handler = eventDispatcher.f3208a;
        if (handler != null) {
            handler.post(new d(3, eventDispatcher, exc));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void l0(long j, long j2, String str) {
        String str2;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.H0;
        Handler handler = eventDispatcher.f3208a;
        if (handler != null) {
            str2 = str;
            handler.post(new androidx.media3.exoplayer.audio.e(eventDispatcher, str2, j, j2, 1));
        } else {
            str2 = str;
        }
        this.Q0 = K0(str2);
        androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo = this.U;
        mediaCodecInfo.getClass();
        boolean z = false;
        if (Util.f2928a >= 29 && "video/x-vnd.on2.vp9".equals(mediaCodecInfo.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = mediaCodecInfo.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                if (codecProfileLevelArr[i].profile == 16384) {
                    z = true;
                    break;
                }
                i++;
            }
        }
        this.R0 = z;
        R0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.Renderer
    public final void m(long j, long j2) throws VideoSink.VideoSinkException, ExoPlaybackException {
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            try {
                DefaultVideoSink defaultVideoSink = (DefaultVideoSink) PlaybackVideoGraphWrapper.this.g;
                defaultVideoSink.getClass();
                try {
                    defaultVideoSink.c.a(j, j2);
                } catch (ExoPlaybackException e) {
                    throw new VideoSink.VideoSinkException(e, defaultVideoSink.f);
                }
            } catch (VideoSink.VideoSinkException e2) {
                throw D(e2, e2.d, false, 7001);
            }
        }
        super.m(j, j2);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void m0(String str) {
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.H0;
        Handler handler = eventDispatcher.f3208a;
        if (handler != null) {
            handler.post(new d(4, eventDispatcher, str));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final DecoderReuseEvaluation n0(FormatHolder formatHolder) {
        DecoderReuseEvaluation decoderReuseEvaluationN0 = super.n0(formatHolder);
        Format format = formatHolder.b;
        format.getClass();
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.H0;
        Handler handler = eventDispatcher.f3208a;
        if (handler != null) {
            handler.post(new androidx.camera.core.processing.g(5, eventDispatcher, format, decoderReuseEvaluationN0));
        }
        return decoderReuseEvaluationN0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void o0(Format format, MediaFormat mediaFormat) {
        int integer;
        int i;
        MediaCodecAdapter mediaCodecAdapter = this.N;
        if (mediaCodecAdapter != null) {
            mediaCodecAdapter.d(this.Z0);
        }
        if (this.l1) {
            i = format.u;
            integer = format.v;
        } else {
            mediaFormat.getClass();
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
            i = integer2;
        }
        float f = format.y;
        int i2 = format.x;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.i1 = new VideoSize(i, integer, f);
        VideoSink videoSink = this.S0;
        if (videoSink == null || !this.r1) {
            float f2 = format.w;
            VideoFrameReleaseHelper videoFrameReleaseHelper = this.K0.b;
            videoFrameReleaseHelper.f = f2;
            FixedFrameRateEstimator fixedFrameRateEstimator = videoFrameReleaseHelper.f3205a;
            fixedFrameRateEstimator.f3193a.c();
            fixedFrameRateEstimator.b.c();
            fixedFrameRateEstimator.c = false;
            fixedFrameRateEstimator.d = -9223372036854775807L;
            fixedFrameRateEstimator.e = 0;
            videoFrameReleaseHelper.c();
        } else {
            Format.Builder builderA = format.a();
            builderA.t = i;
            builderA.u = integer;
            builderA.x = f;
            Format format2 = new Format(builderA);
            List listT = this.U0;
            if (listT == null) {
                listT = ImmutableList.t();
            }
            PlaybackVideoGraphWrapper.InputVideoSink inputVideoSink = (PlaybackVideoGraphWrapper.InputVideoSink) videoSink;
            Assertions.f(inputVideoSink.i());
            inputVideoSink.n(listT);
            inputVideoSink.d = format2;
            PlaybackVideoGraphWrapper.this.q = false;
            inputVideoSink.k(format2);
        }
        this.r1 = false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void q0(long j) {
        super.q0(j);
        if (this.l1) {
            return;
        }
        this.e1--;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void r0() {
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            videoSink.d();
            this.S0.e(d0(), -this.p1);
        } else {
            this.K0.d(2);
        }
        this.r1 = true;
        R0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void s0(DecoderInputBuffer decoderInputBuffer) {
        Surface surface;
        ByteBuffer byteBuffer;
        Av1SampleDependencyParser av1SampleDependencyParser = this.M0;
        if (av1SampleDependencyParser != null) {
            androidx.media3.exoplayer.mediacodec.MediaCodecInfo mediaCodecInfo = this.U;
            mediaCodecInfo.getClass();
            if (mediaCodecInfo.b.equals("video/av01") && (byteBuffer = decoderInputBuffer.g) != null) {
                av1SampleDependencyParser.a(ObuParser.b(byteBuffer));
            }
        }
        this.t1 = 0;
        boolean z = this.l1;
        if (!z) {
            this.e1++;
        }
        if (Util.f2928a >= 23 || !z) {
            return;
        }
        long j = decoderInputBuffer.i;
        J0(j);
        VideoSize videoSize = this.i1;
        boolean zEquals = videoSize.equals(VideoSize.d);
        VideoRendererEventListener.EventDispatcher eventDispatcher = this.H0;
        if (!zEquals && !videoSize.equals(this.j1)) {
            this.j1 = videoSize;
            eventDispatcher.a(videoSize);
        }
        this.A0.e++;
        VideoFrameReleaseControl videoFrameReleaseControl = this.K0;
        boolean z2 = videoFrameReleaseControl.e != 3;
        videoFrameReleaseControl.e = 3;
        videoFrameReleaseControl.g = Util.I(videoFrameReleaseControl.l.elapsedRealtime());
        if (z2 && (surface = this.V0) != null) {
            Handler handler = eventDispatcher.f3208a;
            if (handler != null) {
                handler.post(new i(eventDispatcher, surface, SystemClock.elapsedRealtime()));
            }
            this.Y0 = true;
        }
        q0(j);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void t0(Renderer.WakeupListener wakeupListener) {
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            videoSink.f(wakeupListener);
        }
    }

    @Override // androidx.media3.exoplayer.Renderer
    public final void u() {
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            VideoFrameReleaseControl videoFrameReleaseControl = ((DefaultVideoSink) PlaybackVideoGraphWrapper.this.g).f3191a;
            if (videoFrameReleaseControl.e == 0) {
                videoFrameReleaseControl.e = 1;
                return;
            }
            return;
        }
        VideoFrameReleaseControl videoFrameReleaseControl2 = this.K0;
        if (videoFrameReleaseControl2.e == 0) {
            videoFrameReleaseControl2.e = 1;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean v0(long j, long j2, MediaCodecAdapter mediaCodecAdapter, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, Format format) {
        mediaCodecAdapter.getClass();
        long jC0 = j3 - c0();
        int i4 = 0;
        while (true) {
            PriorityQueue priorityQueue = this.O0;
            Long l = (Long) priorityQueue.peek();
            if (l == null || l.longValue() >= j3) {
                break;
            }
            i4++;
            priorityQueue.poll();
        }
        X0(i4, 0);
        VideoSink videoSink = this.S0;
        if (videoSink == null) {
            int iA = this.K0.a(j3, j, j2, d0(), z, z2, this.L0);
            VideoFrameReleaseControl.FrameReleaseInfo frameReleaseInfo = this.L0;
            if (iA == 0) {
                Clock clock = this.j;
                clock.getClass();
                long jNanoTime = clock.nanoTime();
                VideoFrameMetadataListener videoFrameMetadataListener = this.o1;
                if (videoFrameMetadataListener != null) {
                    videoFrameMetadataListener.d(jC0, jNanoTime, format, this.P);
                }
                S0(mediaCodecAdapter, i, jNanoTime);
                Y0(frameReleaseInfo.f3204a);
                return true;
            }
            if (iA == 1) {
                long j4 = frameReleaseInfo.b;
                long j5 = frameReleaseInfo.f3204a;
                if (j4 == this.h1) {
                    W0(mediaCodecAdapter, i);
                } else {
                    VideoFrameMetadataListener videoFrameMetadataListener2 = this.o1;
                    if (videoFrameMetadataListener2 != null) {
                        videoFrameMetadataListener2.d(jC0, j4, format, this.P);
                    }
                    S0(mediaCodecAdapter, i, j4);
                }
                Y0(j5);
                this.h1 = j4;
                return true;
            }
            if (iA == 2) {
                Trace.beginSection("dropVideoBuffer");
                mediaCodecAdapter.e(i);
                Trace.endSection();
                X0(0, 1);
                Y0(frameReleaseInfo.f3204a);
                return true;
            }
            if (iA == 3) {
                W0(mediaCodecAdapter, i);
                Y0(frameReleaseInfo.f3204a);
                return true;
            }
            if (iA != 4 && iA != 5) {
                throw new IllegalStateException(String.valueOf(iA));
            }
        } else {
            if (z && !z2) {
                W0(mediaCodecAdapter, i);
                return true;
            }
            long j6 = j3 + (-this.p1);
            VideoSink.VideoFrameHandler videoFrameHandler = new VideoSink.VideoFrameHandler(mediaCodecAdapter, i, jC0) { // from class: androidx.media3.exoplayer.video.MediaCodecVideoRenderer.2

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ MediaCodecAdapter f3195a;
                public final /* synthetic */ int b;

                @Override // androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler
                public final void a() {
                    MediaCodecVideoRenderer.this.W0(this.f3195a, this.b);
                }

                @Override // androidx.media3.exoplayer.video.VideoSink.VideoFrameHandler
                public final void b(long j7) {
                    MediaCodecVideoRenderer.this.S0(this.f3195a, this.b, j7);
                }
            };
            PlaybackVideoGraphWrapper.InputVideoSink inputVideoSink = (PlaybackVideoGraphWrapper.InputVideoSink) videoSink;
            Assertions.f(inputVideoSink.i());
            PlaybackVideoGraphWrapper playbackVideoGraphWrapper = PlaybackVideoGraphWrapper.this;
            int i5 = playbackVideoGraphWrapper.s;
            if (i5 != -1 && i5 == playbackVideoGraphWrapper.t) {
                VideoFrameProcessor videoFrameProcessor = inputVideoSink.c;
                Assertions.g(videoFrameProcessor);
                if (videoFrameProcessor.d() < inputVideoSink.f3200a) {
                    VideoFrameProcessor videoFrameProcessor2 = inputVideoSink.c;
                    Assertions.g(videoFrameProcessor2);
                    if (videoFrameProcessor2.c()) {
                        inputVideoSink.f = j6 - inputVideoSink.e;
                        videoFrameHandler.b(j6 * 1000);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void y0() {
        VideoSink videoSink = this.S0;
        if (videoSink != null) {
            videoSink.d();
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void z0() {
        super.z0();
        this.O0.clear();
        this.s1 = false;
        this.e1 = 0;
        this.t1 = 0;
        Av1SampleDependencyParser av1SampleDependencyParser = this.M0;
        if (av1SampleDependencyParser != null) {
            av1SampleDependencyParser.f3190a = null;
        }
    }
}
