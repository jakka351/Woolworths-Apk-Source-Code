package androidx.media3.exoplayer;

import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.Clock;

/* loaded from: classes2.dex */
final class DefaultMediaClock implements MediaClock {
    public final StandaloneMediaClock d;
    public final PlaybackParametersListener e;
    public Renderer f;
    public MediaClock g;
    public boolean h = true;
    public boolean i;

    public interface PlaybackParametersListener {
    }

    public DefaultMediaClock(PlaybackParametersListener playbackParametersListener, Clock clock) {
        this.e = playbackParametersListener;
        this.d = new StandaloneMediaClock(clock);
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final long A() {
        if (this.h) {
            return this.d.A();
        }
        MediaClock mediaClock = this.g;
        mediaClock.getClass();
        return mediaClock.A();
    }

    public final void a(Renderer renderer) throws ExoPlaybackException {
        MediaClock mediaClock;
        MediaClock mediaClockQ = renderer.q();
        if (mediaClockQ == null || mediaClockQ == (mediaClock = this.g)) {
            return;
        }
        if (mediaClock != null) {
            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.g = mediaClockQ;
        this.f = renderer;
        mediaClockQ.c(this.d.h);
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final void c(PlaybackParameters playbackParameters) {
        MediaClock mediaClock = this.g;
        if (mediaClock != null) {
            mediaClock.c(playbackParameters);
            playbackParameters = this.g.d();
        }
        this.d.c(playbackParameters);
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final PlaybackParameters d() {
        MediaClock mediaClock = this.g;
        return mediaClock != null ? mediaClock.d() : this.d.h;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final boolean h() {
        if (this.h) {
            this.d.getClass();
            return false;
        }
        MediaClock mediaClock = this.g;
        mediaClock.getClass();
        return mediaClock.h();
    }
}
