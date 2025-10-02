package androidx.media3.exoplayer;

import androidx.media3.common.Timeline;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.upstream.DefaultAllocator;

@UnstableApi
/* loaded from: classes2.dex */
public interface LoadControl {

    public static final class Parameters {

        /* renamed from: a, reason: collision with root package name */
        public final PlayerId f3010a;
        public final long b;
        public final float c;
        public final boolean d;
        public final long e;

        public Parameters(PlayerId playerId, Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, float f, boolean z, long j3) {
            this.f3010a = playerId;
            this.b = j2;
            this.c = f;
            this.d = z;
            this.e = j3;
        }
    }

    default boolean a() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    default void b(Parameters parameters, ExoTrackSelection[] exoTrackSelectionArr) {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    default void c(PlayerId playerId) {
        throw new IllegalStateException("onPrepared not implemented");
    }

    default boolean d(Parameters parameters) {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    default boolean e() {
        Log.g("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }

    default boolean f(Parameters parameters) {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }

    default long g() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    DefaultAllocator h();

    default void i(PlayerId playerId) {
        throw new IllegalStateException("onReleased not implemented");
    }

    default void j(PlayerId playerId) {
        throw new IllegalStateException("onStopped not implemented");
    }
}
