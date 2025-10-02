package androidx.media3.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.AttachedSurfaceControl;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.u;
import androidx.media3.common.AdOverlayInfo;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.ErrorMessageProvider;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerView;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes2.dex */
public class PlayerView extends FrameLayout implements AdViewProvider {
    public static final /* synthetic */ int M = 0;
    public int A;
    public int B;
    public Drawable C;
    public int D;
    public boolean E;
    public ErrorMessageProvider F;
    public CharSequence G;
    public int H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public final ComponentListener d;
    public final AspectRatioFrameLayout e;
    public final View f;
    public final View g;
    public final boolean h;
    public final SurfaceSyncGroupCompatV34 i;
    public final ImageView j;
    public final ImageView k;
    public final SubtitleView l;
    public final View m;
    public final TextView n;
    public final PlayerControlView o;
    public final FrameLayout p;
    public final FrameLayout q;
    public final Handler r;
    public final Class s;
    public final Method t;
    public final Object u;
    public Player v;
    public boolean w;
    public ControllerVisibilityListener x;
    public PlayerControlView.VisibilityListener y;
    public FullscreenButtonClickListener z;

    @RequiresApi
    public static class Api34 {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    public @interface ArtworkDisplayMode {
    }

    public final class ComponentListener implements Player.Listener, View.OnClickListener, PlayerControlView.VisibilityListener, PlayerControlView.OnFullScreenModeChangedListener {
        public final Timeline.Period d = new Timeline.Period();
        public Object e;

        public ComponentListener() {
        }

        @Override // androidx.media3.ui.PlayerControlView.OnFullScreenModeChangedListener
        public final void C(boolean z) {
            FullscreenButtonClickListener fullscreenButtonClickListener = PlayerView.this.z;
            if (fullscreenButtonClickListener != null) {
                fullscreenButtonClickListener.a();
            }
        }

        @Override // androidx.media3.ui.PlayerControlView.VisibilityListener
        public final void F(int i) {
            int i2 = PlayerView.M;
            PlayerView playerView = PlayerView.this;
            playerView.l();
            ControllerVisibilityListener controllerVisibilityListener = playerView.x;
            if (controllerVisibilityListener != null) {
                controllerVisibilityListener.a(i);
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public final void K(int i, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2) {
            PlayerControlView playerControlView;
            int i2 = PlayerView.M;
            PlayerView playerView = PlayerView.this;
            if (playerView.d() && playerView.J && (playerControlView = playerView.o) != null) {
                playerControlView.f();
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public final void O(Tracks tracks) {
            PlayerView playerView = PlayerView.this;
            Player player = playerView.v;
            player.getClass();
            Timeline timelineK = player.j(17) ? player.K() : Timeline.f2876a;
            if (timelineK.p()) {
                this.e = null;
            } else {
                boolean zJ = player.j(30);
                Timeline.Period period = this.d;
                if (!zJ || player.h().f2884a.isEmpty()) {
                    Object obj = this.e;
                    if (obj != null) {
                        int iB = timelineK.b(obj);
                        if (iB != -1) {
                            if (player.S() == timelineK.f(iB, period, false).c) {
                                return;
                            }
                        }
                        this.e = null;
                    }
                } else {
                    this.e = timelineK.f(player.t(), period, true).b;
                }
            }
            playerView.n(false);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void U(int i) {
            int i2 = PlayerView.M;
            PlayerView playerView = PlayerView.this;
            playerView.k();
            playerView.m();
            if (!playerView.d() || !playerView.J) {
                playerView.e(false);
                return;
            }
            PlayerControlView playerControlView = playerView.o;
            if (playerControlView != null) {
                playerControlView.f();
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public final void Y() {
            PlayerView playerView = PlayerView.this;
            View view = playerView.f;
            if (view != null) {
                view.setVisibility(4);
                if (!playerView.b()) {
                    playerView.c();
                    return;
                }
                ImageView imageView = playerView.j;
                if (imageView != null) {
                    imageView.setVisibility(4);
                }
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public final void a(VideoSize videoSize) {
            PlayerView playerView;
            Player player;
            if (videoSize.equals(VideoSize.d) || (player = (playerView = PlayerView.this).v) == null || player.s() == 1) {
                return;
            }
            playerView.j();
        }

        @Override // androidx.media3.common.Player.Listener
        public final void c0(int i, int i2) {
            PlayerView playerView = PlayerView.this;
            View view = playerView.g;
            if (Util.f2928a == 34 && (view instanceof SurfaceView) && playerView.L) {
                final SurfaceSyncGroupCompatV34 surfaceSyncGroupCompatV34 = playerView.i;
                surfaceSyncGroupCompatV34.getClass();
                Handler handler = playerView.r;
                final SurfaceView surfaceView = (SurfaceView) view;
                final a aVar = new a(2, playerView);
                handler.post(new Runnable() { // from class: androidx.media3.ui.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        PlayerView.SurfaceSyncGroupCompatV34 surfaceSyncGroupCompatV342 = surfaceSyncGroupCompatV34;
                        surfaceSyncGroupCompatV342.getClass();
                        AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
                        if (rootSurfaceControl == null) {
                            return;
                        }
                        SurfaceSyncGroup surfaceSyncGroupN = androidx.media3.datasource.c.n();
                        surfaceSyncGroupCompatV342.f3458a = surfaceSyncGroupN;
                        Assertions.f(surfaceSyncGroupN.add(rootSurfaceControl, new u(1)));
                        aVar.run();
                        rootSurfaceControl.applyTransactionOnDraw(androidx.media3.exoplayer.source.mediaparser.a.p());
                    }
                });
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public final void h0(int i, boolean z) {
            int i2 = PlayerView.M;
            PlayerView playerView = PlayerView.this;
            playerView.k();
            if (!playerView.d() || !playerView.J) {
                playerView.e(false);
                return;
            }
            PlayerControlView playerControlView = playerView.o;
            if (playerControlView != null) {
                playerControlView.f();
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Callback.g(view);
            try {
                PlayerView playerView = PlayerView.this;
                int i = PlayerView.M;
                playerView.i();
            } finally {
                Callback.h();
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public final void t(CueGroup cueGroup) {
            SubtitleView subtitleView = PlayerView.this.l;
            if (subtitleView != null) {
                subtitleView.setCues(cueGroup.f2898a);
            }
        }
    }

    public interface ControllerVisibilityListener {
        void a(int i);
    }

    public interface FullscreenButtonClickListener {
        void a();
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    public @interface ImageDisplayMode {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    @UnstableApi
    public @interface ShowBuffering {
    }

    @RequiresApi
    public static final class SurfaceSyncGroupCompatV34 {

        /* renamed from: a, reason: collision with root package name */
        public SurfaceSyncGroup f3458a;
    }

    public PlayerView(Context context) {
        this(context, null);
    }

    public static void a(PlayerView playerView, Bitmap bitmap) {
        playerView.setImage(new BitmapDrawable(playerView.getResources(), bitmap));
        Player player = playerView.v;
        if (player != null && player.j(30) && player.h().a(2)) {
            return;
        }
        ImageView imageView = playerView.j;
        if (imageView != null) {
            imageView.setVisibility(0);
            playerView.o();
        }
        View view = playerView.f;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.j;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        o();
    }

    private void setImageOutput(Player player) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class cls = this.s;
        if (cls == null || !cls.isAssignableFrom(player.getClass())) {
            return;
        }
        try {
            Method method = this.t;
            method.getClass();
            Object obj = this.u;
            obj.getClass();
            method.invoke(player, obj);
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    public final boolean b() {
        Player player = this.v;
        return player != null && this.u != null && player.j(30) && player.h().a(4);
    }

    public final void c() {
        ImageView imageView = this.j;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    public final boolean d() {
        Player player = this.v;
        return player != null && player.j(16) && this.v.e() && this.v.l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SurfaceSyncGroupCompatV34 surfaceSyncGroupCompatV34;
        SurfaceSyncGroup surfaceSyncGroup;
        super.dispatchDraw(canvas);
        if (Util.f2928a != 34 || (surfaceSyncGroupCompatV34 = this.i) == null || !this.L || (surfaceSyncGroup = surfaceSyncGroupCompatV34.f3458a) == null) {
            return;
        }
        surfaceSyncGroup.markSyncReady();
        surfaceSyncGroupCompatV34.f3458a = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Player player = this.v;
        if (player != null && player.j(16) && this.v.e()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        PlayerControlView playerControlView = this.o;
        if (z && p() && !playerControlView.g()) {
            e(true);
            return true;
        }
        if ((p() && playerControlView.c(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            e(true);
            return true;
        }
        if (z && p()) {
            e(true);
        }
        return false;
    }

    public final void e(boolean z) {
        if (!(d() && this.J) && p()) {
            PlayerControlView playerControlView = this.o;
            boolean z2 = playerControlView.g() && playerControlView.getShowTimeoutMs() <= 0;
            boolean zG = g();
            if (z || z2 || zG) {
                h(zG);
            }
        }
    }

    public final boolean f(Drawable drawable) {
        ImageView imageView = this.k;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.A == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.e;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(width);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        Player player = this.v;
        if (player != null) {
            int iS = player.s();
            if (!this.I) {
                return false;
            }
            if (this.v.j(17) && this.v.K().p()) {
                return false;
            }
            if (iS != 1 && iS != 4) {
                Player player2 = this.v;
                player2.getClass();
                if (player2.l()) {
                    return false;
                }
            }
        }
        return true;
    }

    public List<AdOverlayInfo> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.q;
        if (frameLayout != null) {
            arrayList.add(new AdOverlayInfo(frameLayout));
        }
        PlayerControlView playerControlView = this.o;
        if (playerControlView != null) {
            arrayList.add(new AdOverlayInfo(playerControlView));
        }
        return ImmutableList.o(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.p;
        if (frameLayout != null) {
            return frameLayout;
        }
        throw new IllegalStateException("exo_ad_overlay must be present for ad playback");
    }

    @UnstableApi
    public int getArtworkDisplayMode() {
        return this.A;
    }

    @UnstableApi
    public boolean getControllerAutoShow() {
        return this.I;
    }

    @UnstableApi
    public boolean getControllerHideOnTouch() {
        return this.K;
    }

    @UnstableApi
    public int getControllerShowTimeoutMs() {
        return this.H;
    }

    @Nullable
    @UnstableApi
    public Drawable getDefaultArtwork() {
        return this.C;
    }

    @UnstableApi
    public int getImageDisplayMode() {
        return this.B;
    }

    @Nullable
    @UnstableApi
    public FrameLayout getOverlayFrameLayout() {
        return this.q;
    }

    @Nullable
    public Player getPlayer() {
        return this.v;
    }

    @UnstableApi
    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.e;
        Assertions.g(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    @Nullable
    @UnstableApi
    public SubtitleView getSubtitleView() {
        return this.l;
    }

    @UnstableApi
    @Deprecated
    public boolean getUseArtwork() {
        return this.A != 0;
    }

    public boolean getUseController() {
        return this.w;
    }

    @Nullable
    @UnstableApi
    public View getVideoSurfaceView() {
        return this.g;
    }

    public final void h(boolean z) {
        if (p()) {
            int i = z ? 0 : this.H;
            PlayerControlView playerControlView = this.o;
            playerControlView.setShowTimeoutMs(i);
            PlayerControlViewLayoutManager playerControlViewLayoutManager = playerControlView.d;
            PlayerControlView playerControlView2 = playerControlViewLayoutManager.f3457a;
            if (!playerControlView2.h()) {
                playerControlView2.setVisibility(0);
                playerControlView2.i();
                ImageView imageView = playerControlView2.r;
                if (imageView != null) {
                    imageView.requestFocus();
                }
            }
            playerControlViewLayoutManager.l();
        }
    }

    public final void i() {
        if (!p() || this.v == null) {
            return;
        }
        PlayerControlView playerControlView = this.o;
        if (!playerControlView.g()) {
            e(true);
        } else if (this.K) {
            playerControlView.f();
        }
    }

    public final void j() {
        Player player = this.v;
        VideoSize videoSizeQ = player != null ? player.Q() : VideoSize.d;
        int i = videoSizeQ.f2887a;
        int i2 = videoSizeQ.b;
        float f = BitmapDescriptorFactory.HUE_RED;
        float f2 = (i2 == 0 || i == 0) ? 0.0f : (i * videoSizeQ.c) / i2;
        if (!this.h) {
            f = f2;
        }
        AspectRatioFrameLayout aspectRatioFrameLayout = this.e;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    public final void k() {
        int i;
        View view = this.m;
        if (view != null) {
            Player player = this.v;
            view.setVisibility((player != null && player.s() == 2 && ((i = this.D) == 2 || (i == 1 && this.v.l()))) ? 0 : 8);
        }
    }

    public final void l() {
        PlayerControlView playerControlView = this.o;
        if (playerControlView == null || !this.w) {
            setContentDescription(null);
        } else if (playerControlView.g()) {
            setContentDescription(this.K ? getResources().getString(com.woolworths.R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(com.woolworths.R.string.exo_controls_show));
        }
    }

    public final void m() {
        ErrorMessageProvider errorMessageProvider;
        TextView textView = this.n;
        if (textView != null) {
            CharSequence charSequence = this.G;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            Player player = this.v;
            if ((player != null ? player.a() : null) == null || (errorMessageProvider = this.F) == null) {
                textView.setVisibility(8);
            } else {
                textView.setText((CharSequence) errorMessageProvider.getErrorMessage().second);
                textView.setVisibility(0);
            }
        }
    }

    public final void n(boolean z) {
        byte[] bArr;
        Drawable drawable;
        Player player = this.v;
        boolean zF = false;
        boolean z2 = (player == null || !player.j(30) || player.h().f2884a.isEmpty()) ? false : true;
        boolean z3 = this.E;
        ImageView imageView = this.k;
        View view = this.f;
        if (!z3 && (!z2 || z)) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            c();
        }
        if (z2) {
            Player player2 = this.v;
            boolean z4 = player2 != null && player2.j(30) && player2.h().a(2);
            boolean zB = b();
            if (!z4 && !zB) {
                if (view != null) {
                    view.setVisibility(0);
                }
                c();
            }
            ImageView imageView2 = this.j;
            boolean z5 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (zB && !z4 && z5) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    o();
                }
            } else if (z4 && !zB && z5) {
                c();
            }
            if (!z4 && !zB && this.A != 0) {
                Assertions.g(imageView);
                if (player != null && player.j(18) && (bArr = player.X().f) != null) {
                    zF = f(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (zF || f(this.C)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    public final void o() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.j;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.B == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.e) != null) {
            aspectRatioFrameLayout.setAspectRatio(width);
        }
        imageView.setScaleType(scaleType);
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!p() || this.v == null) {
            return false;
        }
        e(true);
        return true;
    }

    public final boolean p() {
        if (!this.w) {
            return false;
        }
        Assertions.g(this.o);
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        i();
        return super.performClick();
    }

    @UnstableApi
    public void setArtworkDisplayMode(int i) {
        Assertions.f(i == 0 || this.k != null);
        if (this.A != i) {
            this.A = i;
            n(false);
        }
    }

    @UnstableApi
    public void setAspectRatioListener(@Nullable AspectRatioFrameLayout.AspectRatioListener aspectRatioListener) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.e;
        Assertions.g(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(aspectRatioListener);
    }

    @UnstableApi
    public void setControllerAnimationEnabled(boolean z) {
        PlayerControlView playerControlView = this.o;
        Assertions.g(playerControlView);
        playerControlView.setAnimationEnabled(z);
    }

    @UnstableApi
    public void setControllerAutoShow(boolean z) {
        this.I = z;
    }

    @UnstableApi
    public void setControllerHideDuringAds(boolean z) {
        this.J = z;
    }

    @UnstableApi
    public void setControllerHideOnTouch(boolean z) {
        Assertions.g(this.o);
        this.K = z;
        l();
    }

    @UnstableApi
    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(@Nullable PlayerControlView.OnFullScreenModeChangedListener onFullScreenModeChangedListener) {
        PlayerControlView playerControlView = this.o;
        Assertions.g(playerControlView);
        this.z = null;
        playerControlView.setOnFullScreenModeChangedListener(onFullScreenModeChangedListener);
    }

    @UnstableApi
    public void setControllerShowTimeoutMs(int i) {
        PlayerControlView playerControlView = this.o;
        Assertions.g(playerControlView);
        this.H = i;
        if (playerControlView.g()) {
            h(g());
        }
    }

    public void setControllerVisibilityListener(@Nullable ControllerVisibilityListener controllerVisibilityListener) {
        this.x = controllerVisibilityListener;
        if (controllerVisibilityListener != null) {
            setControllerVisibilityListener((PlayerControlView.VisibilityListener) null);
        }
    }

    @UnstableApi
    public void setCustomErrorMessage(@Nullable CharSequence charSequence) {
        Assertions.f(this.n != null);
        this.G = charSequence;
        m();
    }

    @UnstableApi
    public void setDefaultArtwork(@Nullable Drawable drawable) {
        if (this.C != drawable) {
            this.C = drawable;
            n(false);
        }
    }

    @UnstableApi
    public void setEnableComposeSurfaceSyncWorkaround(boolean z) {
        this.L = z;
    }

    public void setErrorMessageProvider(@Nullable ErrorMessageProvider<? super PlaybackException> errorMessageProvider) {
        if (this.F != errorMessageProvider) {
            this.F = errorMessageProvider;
            m();
        }
    }

    public void setFullscreenButtonClickListener(@Nullable FullscreenButtonClickListener fullscreenButtonClickListener) {
        PlayerControlView playerControlView = this.o;
        Assertions.g(playerControlView);
        this.z = fullscreenButtonClickListener;
        playerControlView.setOnFullScreenModeChangedListener(this.d);
    }

    @UnstableApi
    public void setFullscreenButtonState(boolean z) {
        PlayerControlView playerControlView = this.o;
        Assertions.g(playerControlView);
        String str = playerControlView.l0;
        Drawable drawable = playerControlView.j0;
        String str2 = playerControlView.k0;
        Drawable drawable2 = playerControlView.i0;
        if (playerControlView.p0 == z) {
            return;
        }
        playerControlView.p0 = z;
        ImageView imageView = playerControlView.A;
        if (imageView != null) {
            if (z) {
                imageView.setImageDrawable(drawable2);
                imageView.setContentDescription(str2);
            } else {
                imageView.setImageDrawable(drawable);
                imageView.setContentDescription(str);
            }
        }
        ImageView imageView2 = playerControlView.B;
        if (imageView2 != null) {
            if (z) {
                imageView2.setImageDrawable(drawable2);
                imageView2.setContentDescription(str2);
            } else {
                imageView2.setImageDrawable(drawable);
                imageView2.setContentDescription(str);
            }
        }
        PlayerControlView.OnFullScreenModeChangedListener onFullScreenModeChangedListener = playerControlView.o0;
        if (onFullScreenModeChangedListener != null) {
            onFullScreenModeChangedListener.C(z);
        }
    }

    @UnstableApi
    public void setImageDisplayMode(int i) {
        Assertions.f(this.j != null);
        if (this.B != i) {
            this.B = i;
            o();
        }
    }

    @UnstableApi
    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.E != z) {
            this.E = z;
            n(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setPlayer(@androidx.annotation.Nullable androidx.media3.common.Player r10) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerView.setPlayer(androidx.media3.common.Player):void");
    }

    @UnstableApi
    public void setRepeatToggleModes(int i) {
        PlayerControlView playerControlView = this.o;
        Assertions.g(playerControlView);
        playerControlView.setRepeatToggleModes(i);
    }

    @UnstableApi
    public void setResizeMode(int i) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.e;
        Assertions.g(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i);
    }

    @UnstableApi
    public void setShowBuffering(int i) {
        if (this.D != i) {
            this.D = i;
            k();
        }
    }

    @UnstableApi
    public void setShowFastForwardButton(boolean z) {
        PlayerControlView playerControlView = this.o;
        Assertions.g(playerControlView);
        playerControlView.setShowFastForwardButton(z);
    }

    @UnstableApi
    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        PlayerControlView playerControlView = this.o;
        Assertions.g(playerControlView);
        playerControlView.setShowMultiWindowTimeBar(z);
    }

    @UnstableApi
    public void setShowNextButton(boolean z) {
        PlayerControlView playerControlView = this.o;
        Assertions.g(playerControlView);
        playerControlView.setShowNextButton(z);
    }

    @UnstableApi
    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        PlayerControlView playerControlView = this.o;
        Assertions.g(playerControlView);
        playerControlView.setShowPlayButtonIfPlaybackIsSuppressed(z);
    }

    @UnstableApi
    public void setShowPreviousButton(boolean z) {
        PlayerControlView playerControlView = this.o;
        Assertions.g(playerControlView);
        playerControlView.setShowPreviousButton(z);
    }

    @UnstableApi
    public void setShowRewindButton(boolean z) {
        PlayerControlView playerControlView = this.o;
        Assertions.g(playerControlView);
        playerControlView.setShowRewindButton(z);
    }

    @UnstableApi
    public void setShowShuffleButton(boolean z) {
        PlayerControlView playerControlView = this.o;
        Assertions.g(playerControlView);
        playerControlView.setShowShuffleButton(z);
    }

    @UnstableApi
    public void setShowSubtitleButton(boolean z) {
        PlayerControlView playerControlView = this.o;
        Assertions.g(playerControlView);
        playerControlView.setShowSubtitleButton(z);
    }

    @UnstableApi
    public void setShowVrButton(boolean z) {
        PlayerControlView playerControlView = this.o;
        Assertions.g(playerControlView);
        playerControlView.setShowVrButton(z);
    }

    @UnstableApi
    public void setShutterBackgroundColor(@ColorInt int i) {
        View view = this.f;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    @UnstableApi
    @Deprecated
    public void setUseArtwork(boolean z) {
        setArtworkDisplayMode(!z ? 1 : 0);
    }

    public void setUseController(boolean z) {
        boolean z2 = true;
        PlayerControlView playerControlView = this.o;
        Assertions.f((z && playerControlView == null) ? false : true);
        if (!z && !hasOnClickListeners()) {
            z2 = false;
        }
        setClickable(z2);
        if (this.w == z) {
            return;
        }
        this.w = z;
        if (p()) {
            playerControlView.setPlayer(this.v);
        } else if (playerControlView != null) {
            playerControlView.f();
            playerControlView.setPlayer(null);
        }
        l();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        View view = this.g;
        if (view instanceof SurfaceView) {
            view.setVisibility(i);
        }
    }

    public PlayerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, @Nullable AttributeSet attributeSet, int i) throws NoSuchMethodException, SecurityException, IllegalArgumentException {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z5;
        boolean z6;
        int i10;
        boolean z7;
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        int i11;
        super(context, attributeSet, i);
        ComponentListener componentListener = new ComponentListener();
        this.d = componentListener;
        this.r = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = false;
            this.i = null;
            this.j = null;
            this.k = null;
            this.l = null;
            this.m = null;
            this.n = null;
            this.o = null;
            this.p = null;
            this.q = null;
            this.s = null;
            this.t = null;
            this.u = null;
            ImageView imageView = new ImageView(context);
            if (Util.f2928a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(resources.getDrawable(2131231154, context.getTheme()));
                imageView.setBackgroundColor(resources.getColor(com.woolworths.R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(resources2.getDrawable(2131231154, context.getTheme()));
                imageView.setBackgroundColor(resources2.getColor(com.woolworths.R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.e, i, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(42);
                int color = typedArrayObtainStyledAttributes.getColor(42, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(22, com.woolworths.R.layout.exo_player_view);
                boolean z8 = typedArrayObtainStyledAttributes.getBoolean(49, true);
                int i12 = typedArrayObtainStyledAttributes.getInt(3, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(9, 0);
                int i13 = typedArrayObtainStyledAttributes.getInt(15, 0);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(50, true);
                int i14 = typedArrayObtainStyledAttributes.getInt(45, 1);
                int i15 = typedArrayObtainStyledAttributes.getInt(28, 0);
                z = z9;
                i2 = typedArrayObtainStyledAttributes.getInt(38, 5000);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(14, true);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(4, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(35, 0);
                this.E = typedArrayObtainStyledAttributes.getBoolean(16, this.E);
                boolean z12 = typedArrayObtainStyledAttributes.getBoolean(13, true);
                typedArrayObtainStyledAttributes.recycle();
                z4 = z12;
                z2 = z10;
                z6 = z8;
                i9 = color;
                i3 = resourceId;
                i5 = resourceId2;
                i7 = i15;
                z3 = z11;
                i4 = integer;
                i10 = i12;
                z5 = zHasValue;
                i8 = i14;
                i6 = i13;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = 5000;
            i3 = com.woolworths.R.layout.exo_player_view;
            z = true;
            z2 = true;
            z3 = true;
            z4 = true;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 1;
            i9 = 0;
            z5 = false;
            z6 = true;
            i10 = 1;
        }
        LayoutInflater.from(context).inflate(i3, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(com.woolworths.R.id.exo_content_frame);
        this.e = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(i7);
        }
        View viewFindViewById = findViewById(com.woolworths.R.id.exo_shutter);
        this.f = viewFindViewById;
        if (viewFindViewById != null && z5) {
            viewFindViewById.setBackgroundColor(i9);
        }
        if (aspectRatioFrameLayout != null && i8 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i8 == 2) {
                this.g = new TextureView(context);
            } else if (i8 == 3) {
                try {
                    int i16 = SphericalGLSurfaceView.o;
                    this.g = (View) SphericalGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                    z7 = true;
                    this.g.setLayoutParams(layoutParams);
                    this.g.setOnClickListener(componentListener);
                    this.g.setClickable(false);
                    aspectRatioFrameLayout.addView(this.g, 0);
                } catch (Exception e) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                }
            } else if (i8 != 4) {
                SurfaceView surfaceView = new SurfaceView(context);
                if (Util.f2928a >= 34) {
                    surfaceView.setSurfaceLifecycle(2);
                }
                this.g = surfaceView;
            } else {
                try {
                    int i17 = VideoDecoderGLSurfaceView.e;
                    this.g = (View) VideoDecoderGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e2) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                }
            }
            z7 = false;
            this.g.setLayoutParams(layoutParams);
            this.g.setOnClickListener(componentListener);
            this.g.setClickable(false);
            aspectRatioFrameLayout.addView(this.g, 0);
        } else {
            this.g = null;
            z7 = false;
        }
        this.h = z7;
        this.i = Util.f2928a == 34 ? new SurfaceSyncGroupCompatV34() : null;
        this.p = (FrameLayout) findViewById(com.woolworths.R.id.exo_ad_overlay);
        this.q = (FrameLayout) findViewById(com.woolworths.R.id.exo_overlay);
        this.j = (ImageView) findViewById(com.woolworths.R.id.exo_image);
        this.B = i6;
        try {
            cls = ExoPlayer.class;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: androidx.media3.ui.k
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    int i18 = PlayerView.M;
                    if (!method2.getName().equals("onImageAvailable")) {
                        return null;
                    }
                    Bitmap bitmap = (Bitmap) objArr[1];
                    PlayerView playerView = this.f3468a;
                    playerView.r.post(new androidx.camera.core.impl.utils.futures.e(15, playerView, bitmap));
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.s = cls;
        this.t = method;
        this.u = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(com.woolworths.R.id.exo_artwork);
        this.k = imageView2;
        this.A = (!z6 || i10 == 0 || imageView2 == null) ? 0 : i10;
        if (i5 != 0) {
            this.C = getContext().getDrawable(i5);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(com.woolworths.R.id.exo_subtitles);
        this.l = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View viewFindViewById2 = findViewById(com.woolworths.R.id.exo_buffering);
        this.m = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.D = i4;
        TextView textView = (TextView) findViewById(com.woolworths.R.id.exo_error_message);
        this.n = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        PlayerControlView playerControlView = (PlayerControlView) findViewById(com.woolworths.R.id.exo_controller);
        View viewFindViewById3 = findViewById(com.woolworths.R.id.exo_controller_placeholder);
        if (playerControlView != null) {
            this.o = playerControlView;
            i11 = 0;
        } else if (viewFindViewById3 != null) {
            i11 = 0;
            PlayerControlView playerControlView2 = new PlayerControlView(context, null, 0, attributeSet);
            this.o = playerControlView2;
            playerControlView2.setId(com.woolworths.R.id.exo_controller);
            playerControlView2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(playerControlView2, iIndexOfChild);
        } else {
            i11 = 0;
            this.o = null;
        }
        PlayerControlView playerControlView3 = this.o;
        this.H = playerControlView3 != null ? i2 : i11;
        this.K = z2;
        this.I = z3;
        this.J = z4;
        this.w = (!z || playerControlView3 == null) ? i11 : 1;
        if (playerControlView3 != null) {
            PlayerControlViewLayoutManager playerControlViewLayoutManager = playerControlView3.d;
            int i18 = playerControlViewLayoutManager.z;
            if (i18 != 3 && i18 != 2) {
                playerControlViewLayoutManager.g();
                playerControlViewLayoutManager.j(2);
            }
            PlayerControlView playerControlView4 = this.o;
            ComponentListener componentListener2 = this.d;
            playerControlView4.getClass();
            componentListener2.getClass();
            playerControlView4.g.add(componentListener2);
        }
        if (z) {
            setClickable(true);
        }
        l();
    }

    @UnstableApi
    @Deprecated
    public void setControllerVisibilityListener(@Nullable PlayerControlView.VisibilityListener visibilityListener) {
        PlayerControlView playerControlView = this.o;
        Assertions.g(playerControlView);
        CopyOnWriteArrayList copyOnWriteArrayList = playerControlView.g;
        PlayerControlView.VisibilityListener visibilityListener2 = this.y;
        if (visibilityListener2 == visibilityListener) {
            return;
        }
        if (visibilityListener2 != null) {
            copyOnWriteArrayList.remove(visibilityListener2);
        }
        this.y = visibilityListener;
        if (visibilityListener != null) {
            copyOnWriteArrayList.add(visibilityListener);
            setControllerVisibilityListener((ControllerVisibilityListener) null);
        }
    }
}
