package androidx.media3.exoplayer.video;

import android.os.Handler;
import androidx.media3.common.Format;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;

@UnstableApi
/* loaded from: classes2.dex */
public interface VideoRendererEventListener {

    public static final class EventDispatcher {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f3208a;
        public final VideoRendererEventListener b;

        public EventDispatcher(Handler handler, VideoRendererEventListener videoRendererEventListener) {
            if (videoRendererEventListener != null) {
                handler.getClass();
            } else {
                handler = null;
            }
            this.f3208a = handler;
            this.b = videoRendererEventListener;
        }

        public final void a(VideoSize videoSize) {
            Handler handler = this.f3208a;
            if (handler != null) {
                handler.post(new d(2, this, videoSize));
            }
        }
    }

    default void a(VideoSize videoSize) {
    }

    default void c(String str) {
    }

    default void f(DecoderCounters decoderCounters) {
    }

    default void h(long j, Object obj) {
    }

    default void k(int i, long j) {
    }

    default void l(int i, long j) {
    }

    default void s(Exception exc) {
    }

    default void v(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    default void w(DecoderCounters decoderCounters) {
    }

    default void x(long j, long j2, String str) {
    }
}
