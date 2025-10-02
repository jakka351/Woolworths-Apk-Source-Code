package androidx.media3.common;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.Player;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.UnstableApi;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public class ForwardingPlayer implements Player {

    public static final class ForwardingListener implements Player.Listener {
        @Override // androidx.media3.common.Player.Listener
        public final void B(int i) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void D(boolean z) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void E(MediaMetadata mediaMetadata) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void G(PlaybackException playbackException) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void I(Player.Commands commands) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void K(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void L(Player player, Player.Events events) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void N(Timeline timeline, int i) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void O(Tracks tracks) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void P(int i, boolean z) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void S(boolean z) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void T(int i) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void U(int i) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void W(PlaybackParameters playbackParameters) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void X(TrackSelectionParameters trackSelectionParameters) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void Y() {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void Z(MediaItem mediaItem, int i) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void a(VideoSize videoSize) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void c0(int i, int i2) {
            throw null;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof ForwardingListener) {
                throw null;
            }
            return false;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void f0(int i) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void g0(boolean z) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void h0(int i, boolean z) {
            throw null;
        }

        public final int hashCode() {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void i0(float f) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void m0(int i) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void n0(PlaybackException playbackException) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void o(boolean z) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void q(List list) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void t(CueGroup cueGroup) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void u(Metadata metadata) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void z(boolean z) {
            throw null;
        }
    }

    @Override // androidx.media3.common.Player
    public final void A() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void C() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void D() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void E(boolean z) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final CueGroup F() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void G(Player.Listener listener) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void H(Player.Listener listener) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int I() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final Timeline K() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final Looper L() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void M() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void N(TextureView textureView) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void O(int i, long j) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final Player.Commands P() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final VideoSize Q() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long R() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int S() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void T(int i) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void U(SurfaceView surfaceView) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final boolean V() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void W() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final MediaMetadata X() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long Y() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final PlaybackException a() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void c(PlaybackParameters playbackParameters) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final PlaybackParameters d() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final boolean e() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long f() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void g(SurfaceView surfaceView) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long getCurrentPosition() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final Tracks h() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int i() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final boolean j(int i) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final TrackSelectionParameters k() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final boolean l() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void m(boolean z) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long n() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long o() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void p() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void pause() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void q() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int r() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int s() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void seekTo(long j) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int t() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void u(TextureView textureView) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int v() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long w() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final boolean x() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final void y(TrackSelectionParameters trackSelectionParameters) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long z() {
        throw null;
    }
}
