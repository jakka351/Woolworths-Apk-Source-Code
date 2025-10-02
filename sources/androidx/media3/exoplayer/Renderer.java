package androidx.media3.exoplayer;

import androidx.media3.common.Format;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.PlayerMessage;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@UnstableApi
/* loaded from: classes2.dex */
public interface Renderer extends PlayerMessage.Target {

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MessageType {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    public interface WakeupListener {
        void a();

        void b();
    }

    default void B(float f, float f2) {
    }

    boolean b();

    void disable();

    int e();

    boolean f();

    String getName();

    int getState();

    boolean isReady();

    void j(Format[] formatArr, SampleStream sampleStream, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId);

    boolean k();

    void l(RendererConfiguration rendererConfiguration, Format[] formatArr, SampleStream sampleStream, boolean z, boolean z2, long j, long j2, MediaSource.MediaPeriodId mediaPeriodId);

    void m(long j, long j2);

    SampleStream n();

    long o();

    void p(long j);

    MediaClock q();

    default void release() {
    }

    void reset();

    void start();

    void stop();

    void t(int i, PlayerId playerId, Clock clock);

    default void u() {
    }

    void v();

    void w();

    void x(Timeline timeline);

    RendererCapabilities y();
}
