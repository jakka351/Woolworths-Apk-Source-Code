package androidx.media3.exoplayer.analytics;

import android.os.Looper;
import androidx.media3.common.Format;
import androidx.media3.common.Player;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public interface AnalyticsCollector extends Player.Listener, MediaSourceEventListener, BandwidthMeter.EventListener, DrmSessionEventListener {
    void A(List list, MediaSource.MediaPeriodId mediaPeriodId);

    void R(Player player, Looper looper);

    void V();

    void b(AudioSink.AudioTrackConfig audioTrackConfig);

    void c(String str);

    void d(String str);

    void e(DecoderCounters decoderCounters);

    void e0(MediaMetricsListener mediaMetricsListener);

    void f(DecoderCounters decoderCounters);

    void g(Format format, DecoderReuseEvaluation decoderReuseEvaluation);

    void h(long j, Object obj);

    void i(DecoderCounters decoderCounters);

    void j(long j, long j2, String str);

    void k(int i, long j);

    void l(int i, long j);

    void l0(int i, int i2, boolean z);

    void m(Exception exc);

    void n(AudioSink.AudioTrackConfig audioTrackConfig);

    void p(Exception exc);

    void r(long j);

    void release();

    void s(Exception exc);

    void v(Format format, DecoderReuseEvaluation decoderReuseEvaluation);

    void w(DecoderCounters decoderCounters);

    void x(long j, long j2, String str);

    void y(int i, long j, long j2);
}
