package androidx.media3.exoplayer;

import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;

@UnstableApi
/* loaded from: classes2.dex */
public final class StandaloneMediaClock implements MediaClock {
    public final Clock d;
    public boolean e;
    public long f;
    public long g;
    public PlaybackParameters h = PlaybackParameters.d;

    public StandaloneMediaClock(Clock clock) {
        this.d = clock;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final long A() {
        long j = this.f;
        if (!this.e) {
            return j;
        }
        long jElapsedRealtime = this.d.elapsedRealtime() - this.g;
        return (this.h.f2871a == 1.0f ? Util.I(jElapsedRealtime) : jElapsedRealtime * r4.c) + j;
    }

    public final void a(long j) {
        this.f = j;
        if (this.e) {
            this.g = this.d.elapsedRealtime();
        }
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final void c(PlaybackParameters playbackParameters) {
        if (this.e) {
            a(A());
        }
        this.h = playbackParameters;
    }

    @Override // androidx.media3.exoplayer.MediaClock
    public final PlaybackParameters d() {
        return this.h;
    }
}
