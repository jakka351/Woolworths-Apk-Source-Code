package androidx.media3.exoplayer.video;

import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.TimedValueQueue;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.video.DefaultVideoSink;
import androidx.media3.exoplayer.video.VideoFrameReleaseControl;
import androidx.media3.exoplayer.video.VideoSink;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class VideoFrameRenderControl {

    /* renamed from: a, reason: collision with root package name */
    public final DefaultVideoSink.FrameRendererImpl f3207a;
    public final VideoFrameReleaseControl b;
    public final VideoFrameReleaseControl.FrameReleaseInfo c = new VideoFrameReleaseControl.FrameReleaseInfo();
    public final TimedValueQueue d = new TimedValueQueue();
    public final TimedValueQueue e = new TimedValueQueue();
    public final LongArrayQueue f;
    public long g;
    public long h;
    public long i;
    public VideoSize j;
    public long k;

    public interface FrameRenderer {
    }

    public VideoFrameRenderControl(DefaultVideoSink.FrameRendererImpl frameRendererImpl, VideoFrameReleaseControl videoFrameReleaseControl) {
        this.f3207a = frameRendererImpl;
        this.b = videoFrameReleaseControl;
        LongArrayQueue longArrayQueue = new LongArrayQueue();
        int iHighestOneBit = Integer.bitCount(16) != 1 ? Integer.highestOneBit(15) << 1 : 16;
        longArrayQueue.f2916a = 0;
        longArrayQueue.b = 0;
        longArrayQueue.c = new long[iHighestOneBit];
        longArrayQueue.d = iHighestOneBit - 1;
        this.f = longArrayQueue;
        this.g = -9223372036854775807L;
        this.j = VideoSize.d;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
    }

    public final void a(long j, long j2) {
        DefaultVideoSink.FrameRendererImpl frameRendererImpl = this.f3207a;
        DefaultVideoSink defaultVideoSink = DefaultVideoSink.this;
        while (true) {
            LongArrayQueue longArrayQueue = this.f;
            int i = longArrayQueue.b;
            if (i == 0) {
                return;
            }
            if (i == 0) {
                throw new NoSuchElementException();
            }
            long j3 = longArrayQueue.c[longArrayQueue.f2916a];
            Long l = (Long) this.e.f(j3);
            VideoFrameReleaseControl videoFrameReleaseControl = this.b;
            if (l != null && l.longValue() != this.k) {
                this.k = l.longValue();
                videoFrameReleaseControl.d(2);
            }
            long j4 = this.k;
            VideoFrameReleaseControl videoFrameReleaseControl2 = this.b;
            VideoFrameReleaseControl.FrameReleaseInfo frameReleaseInfo = this.c;
            int iA = videoFrameReleaseControl2.a(j3, j, j2, j4, false, false, frameReleaseInfo);
            if (iA == 0 || iA == 1) {
                this.h = j3;
                boolean z = iA == 0;
                long jA = longArrayQueue.a();
                VideoSize videoSize = (VideoSize) this.d.f(jA);
                if (videoSize != null && !videoSize.equals(VideoSize.d) && !videoSize.equals(this.j)) {
                    this.j = videoSize;
                    Format.Builder builder = new Format.Builder();
                    builder.t = videoSize.f2887a;
                    builder.u = videoSize.b;
                    builder.m = MimeTypes.m("video/raw");
                    frameRendererImpl.f3192a = new Format(builder);
                    defaultVideoSink.i.execute(new d(0, frameRendererImpl, videoSize));
                }
                long j5 = z ? -1L : frameReleaseInfo.b;
                boolean z2 = videoFrameReleaseControl.e != 3;
                videoFrameReleaseControl.e = 3;
                videoFrameReleaseControl.g = Util.I(videoFrameReleaseControl.l.elapsedRealtime());
                DefaultVideoSink defaultVideoSink2 = DefaultVideoSink.this;
                if (z2 && defaultVideoSink2.e != null) {
                    defaultVideoSink2.i.execute(new c(frameRendererImpl, 0));
                }
                Format format = frameRendererImpl.f3192a;
                defaultVideoSink2.j.d(jA, defaultVideoSink2.b.nanoTime(), format == null ? new Format(new Format.Builder()) : format, null);
                ((VideoSink.VideoFrameHandler) defaultVideoSink2.d.remove()).b(j5);
            } else if (iA == 2 || iA == 3) {
                this.h = j3;
                longArrayQueue.a();
                defaultVideoSink.i.execute(new c(frameRendererImpl, 1));
                ((VideoSink.VideoFrameHandler) defaultVideoSink.d.remove()).a();
            } else {
                if (iA != 4) {
                    if (iA != 5) {
                        throw new IllegalStateException(String.valueOf(iA));
                    }
                    return;
                }
                this.h = j3;
            }
        }
    }
}
