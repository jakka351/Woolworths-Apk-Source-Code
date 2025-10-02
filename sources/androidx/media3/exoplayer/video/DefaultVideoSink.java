package androidx.media3.exoplayer.video;

import android.view.Surface;
import androidx.media3.common.Format;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.exoplayer.Renderer;
import androidx.media3.exoplayer.video.VideoFrameRenderControl;
import androidx.media3.exoplayer.video.VideoSink;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class DefaultVideoSink implements VideoSink {

    /* renamed from: a, reason: collision with root package name */
    public final VideoFrameReleaseControl f3191a;
    public final Clock b;
    public final VideoFrameRenderControl c;
    public final ArrayDeque d;
    public Surface e;
    public final Format f;
    public long g;
    public VideoSink.Listener h;
    public Executor i;
    public VideoFrameMetadataListener j;

    public final class FrameRendererImpl implements VideoFrameRenderControl.FrameRenderer {

        /* renamed from: a, reason: collision with root package name */
        public Format f3192a;

        public FrameRendererImpl() {
        }
    }

    public DefaultVideoSink(VideoFrameReleaseControl videoFrameReleaseControl, Clock clock) {
        this.f3191a = videoFrameReleaseControl;
        videoFrameReleaseControl.l = clock;
        this.b = clock;
        this.c = new VideoFrameRenderControl(new FrameRendererImpl(), videoFrameReleaseControl);
        this.d = new ArrayDeque();
        this.f = new Format(new Format.Builder());
        this.g = -9223372036854775807L;
        this.h = VideoSink.Listener.f3209a;
        this.i = new a();
        this.j = new b();
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void d() {
        VideoFrameRenderControl videoFrameRenderControl = this.c;
        videoFrameRenderControl.i = videoFrameRenderControl.g;
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void e(long j, long j2) {
        if (j != this.g) {
            VideoFrameRenderControl videoFrameRenderControl = this.c;
            TimedValueQueue timedValueQueue = videoFrameRenderControl.e;
            long j3 = videoFrameRenderControl.g;
            timedValueQueue.a(j3 == -9223372036854775807L ? 0L : j3 + 1, Long.valueOf(j));
            this.g = j;
        }
    }

    @Override // androidx.media3.exoplayer.video.VideoSink
    public final void f(Renderer.WakeupListener wakeupListener) {
        throw new UnsupportedOperationException();
    }
}
