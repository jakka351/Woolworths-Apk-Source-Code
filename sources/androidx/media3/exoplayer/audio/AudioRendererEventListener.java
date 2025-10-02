package androidx.media3.exoplayer.audio;

import android.os.Handler;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.audio.AudioSink;

@UnstableApi
/* loaded from: classes2.dex */
public interface AudioRendererEventListener {

    public static final class EventDispatcher {

        /* renamed from: a, reason: collision with root package name */
        public final Handler f3048a;
        public final AudioRendererEventListener b;

        public EventDispatcher(Handler handler, AudioRendererEventListener audioRendererEventListener) {
            this.f3048a = handler;
            this.b = audioRendererEventListener;
        }

        public final void a(DecoderCounters decoderCounters) {
            synchronized (decoderCounters) {
            }
            Handler handler = this.f3048a;
            if (handler != null) {
                handler.post(new b(this, decoderCounters, 1));
            }
        }
    }

    default void b(AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    default void d(String str) {
    }

    default void e(DecoderCounters decoderCounters) {
    }

    default void g(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
    }

    default void i(DecoderCounters decoderCounters) {
    }

    default void j(long j, long j2, String str) {
    }

    default void m(Exception exc) {
    }

    default void n(AudioSink.AudioTrackConfig audioTrackConfig) {
    }

    default void o(boolean z) {
    }

    default void p(Exception exc) {
    }

    default void r(long j) {
    }

    default void y(int i, long j, long j2) {
    }
}
