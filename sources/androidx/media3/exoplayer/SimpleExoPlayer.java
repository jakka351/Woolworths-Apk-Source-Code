package androidx.media3.exoplayer;

import android.content.Context;
import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.BasePlayer;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.source.MediaSource;
import java.util.List;

@UnstableApi
@Deprecated
/* loaded from: classes2.dex */
public class SimpleExoPlayer extends BasePlayer implements ExoPlayer {

    @Deprecated
    public static final class Builder {
        @Deprecated
        public Builder(Context context) {
            new ExoPlayer.Builder(context);
        }
    }

    @Override // androidx.media3.common.Player
    public final void B(List list) {
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
    public final void J() {
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
    public final void N(TextureView textureView) {
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

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void b(MediaSource mediaSource) {
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

    @Override // androidx.media3.common.BasePlayer
    public final void f0(long j, int i, boolean z) {
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
    public final long getDuration() {
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
    public final void p() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int r() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void release() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final int s() {
        throw null;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
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
    public final void y(TrackSelectionParameters trackSelectionParameters) {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final long z() {
        throw null;
    }

    @Override // androidx.media3.common.Player
    public final ExoPlaybackException a() {
        throw null;
    }
}
