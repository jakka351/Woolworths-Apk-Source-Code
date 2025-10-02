package androidx.media3.common;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.UnstableApi;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class SimpleBasePlayer extends BasePlayer {

    public static final class LivePositionSupplier implements PositionSupplier {
    }

    public static final class MediaItemData {

        public static final class Builder {
        }

        public static Object a(MediaItemData mediaItemData, int i) {
            mediaItemData.getClass();
            throw null;
        }

        public static void b(MediaItemData mediaItemData, int i, int i2, Timeline.Period period) {
            mediaItemData.getClass();
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof MediaItemData) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            android.support.v4.media.session.a.e(217, 31, null);
            throw null;
        }
    }

    public static final class PeriodData {

        public static final class Builder {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof PeriodData) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            android.support.v4.media.session.a.e(217, 31, null);
            throw null;
        }
    }

    public static final class PlaceholderUid {
    }

    public static final class PlaylistTimeline extends Timeline {
        @Override // androidx.media3.common.Timeline
        public final int b(Object obj) {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final Timeline.Period f(int i, Timeline.Period period, boolean z) {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final Timeline.Period g(Object obj, Timeline.Period period) {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final int h() {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final Object l(int i) {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final Timeline.Window m(int i, Timeline.Window window, long j) {
            throw null;
        }

        @Override // androidx.media3.common.Timeline
        public final int o() {
            throw null;
        }
    }

    public interface PositionSupplier {
    }

    public static final class State {

        public static final class Builder {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof State) {
                throw null;
            }
            return false;
        }

        public final int hashCode() {
            throw null;
        }
    }

    @Override // androidx.media3.common.Player
    public final void B(List list) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void E(boolean z) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final CueGroup F() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void G(Player.Listener listener) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void H(Player.Listener listener) {
        listener.getClass();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int I() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final Timeline K() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final Looper L() {
        return null;
    }

    @Override // androidx.media3.common.Player
    public final void N(TextureView textureView) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final Player.Commands P() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final VideoSize Q() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long R() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int S() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void T(int i) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void U(SurfaceView surfaceView) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final boolean V() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final MediaMetadata X() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long Y() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final PlaybackException a() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void c(PlaybackParameters playbackParameters) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final PlaybackParameters d() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final boolean e() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long f() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.BasePlayer
    public final void f0(long j, int i, boolean z) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void g(SurfaceView surfaceView) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long getCurrentPosition() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long getDuration() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final Tracks h() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int i() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final TrackSelectionParameters k() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final boolean l() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void m(boolean z) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long n() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void p() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int r() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int s() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int t() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void u(TextureView textureView) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int v() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long w() {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void y(TrackSelectionParameters trackSelectionParameters) {
        Thread.currentThread();
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long z() {
        Thread.currentThread();
        throw null;
    }
}
