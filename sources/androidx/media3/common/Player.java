package androidx.media3.common;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.FlagSet;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public interface Player {

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Command {
    }

    public static final class Commands {

        /* renamed from: a, reason: collision with root package name */
        public final FlagSet f2872a;

        @UnstableApi
        public static final class Builder {

            /* renamed from: a, reason: collision with root package name */
            public final FlagSet.Builder f2873a = new FlagSet.Builder();

            public final void a(int i, boolean z) {
                FlagSet.Builder builder = this.f2873a;
                if (z) {
                    builder.a(i);
                } else {
                    builder.getClass();
                }
            }
        }

        static {
            new Builder().f2873a.b();
            Util.E(0);
        }

        public Commands(FlagSet flagSet) {
            this.f2872a = flagSet;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Commands) {
                return this.f2872a.equals(((Commands) obj).f2872a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f2872a.hashCode();
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DiscontinuityReason {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Event {
    }

    public static final class Events {

        /* renamed from: a, reason: collision with root package name */
        public final FlagSet f2874a;

        public Events(FlagSet flagSet) {
            this.f2874a = flagSet;
        }

        public final boolean a(int i) {
            return this.f2874a.f2852a.get(i);
        }

        public final boolean b(int... iArr) {
            for (int i : iArr) {
                if (this.f2874a.f2852a.get(i)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Events) {
                return this.f2874a.equals(((Events) obj).f2874a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f2874a.hashCode();
        }
    }

    public interface Listener {
        default void B(int i) {
        }

        default void D(boolean z) {
        }

        default void E(MediaMetadata mediaMetadata) {
        }

        default void G(PlaybackException playbackException) {
        }

        default void I(Commands commands) {
        }

        default void K(int i, PositionInfo positionInfo, PositionInfo positionInfo2) {
        }

        default void L(Player player, Events events) {
        }

        default void N(Timeline timeline, int i) {
        }

        default void O(Tracks tracks) {
        }

        default void P(int i, boolean z) {
        }

        default void S(boolean z) {
        }

        default void T(int i) {
        }

        default void U(int i) {
        }

        default void W(PlaybackParameters playbackParameters) {
        }

        default void X(TrackSelectionParameters trackSelectionParameters) {
        }

        default void Y() {
        }

        default void Z(MediaItem mediaItem, int i) {
        }

        default void a(VideoSize videoSize) {
        }

        default void c0(int i, int i2) {
        }

        default void f0(int i) {
        }

        default void g0(boolean z) {
        }

        default void h0(int i, boolean z) {
        }

        default void i0(float f) {
        }

        default void m0(int i) {
        }

        default void n0(PlaybackException playbackException) {
        }

        default void o(boolean z) {
        }

        default void q(List list) {
        }

        default void t(CueGroup cueGroup) {
        }

        default void u(Metadata metadata) {
        }

        default void z(boolean z) {
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface MediaItemTransitionReason {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlayWhenReadyChangeReason {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface PlaybackSuppressionReason {
    }

    public static final class PositionInfo {

        /* renamed from: a, reason: collision with root package name */
        public final Object f2875a;
        public final int b;
        public final MediaItem c;
        public final Object d;
        public final int e;
        public final long f;
        public final long g;
        public final int h;
        public final int i;

        static {
            androidx.compose.ui.input.pointer.a.r(0, 1, 2, 3, 4);
            Util.E(5);
            Util.E(6);
        }

        public PositionInfo(Object obj, int i, MediaItem mediaItem, Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.f2875a = obj;
            this.b = i;
            this.c = mediaItem;
            this.d = obj2;
            this.e = i2;
            this.f = j;
            this.g = j2;
            this.h = i3;
            this.i = i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && PositionInfo.class == obj.getClass()) {
                PositionInfo positionInfo = (PositionInfo) obj;
                if (this.b == positionInfo.b && this.e == positionInfo.e && this.f == positionInfo.f && this.g == positionInfo.g && this.h == positionInfo.h && this.i == positionInfo.i && Objects.equals(this.c, positionInfo.c) && Objects.equals(this.f2875a, positionInfo.f2875a) && Objects.equals(this.d, positionInfo.d)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.f2875a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface State {
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface TimelineChangeReason {
    }

    void A();

    void B(List list);

    void C();

    void D();

    void E(boolean z);

    CueGroup F();

    void G(Listener listener);

    void H(Listener listener);

    int I();

    void J();

    Timeline K();

    Looper L();

    void M();

    void N(TextureView textureView);

    void O(int i, long j);

    Commands P();

    VideoSize Q();

    long R();

    int S();

    void T(int i);

    void U(SurfaceView surfaceView);

    boolean V();

    void W();

    MediaMetadata X();

    long Y();

    PlaybackException a();

    void c(PlaybackParameters playbackParameters);

    PlaybackParameters d();

    boolean e();

    long f();

    void g(SurfaceView surfaceView);

    long getCurrentPosition();

    long getDuration();

    Tracks h();

    int i();

    boolean j(int i);

    TrackSelectionParameters k();

    boolean l();

    void m(boolean z);

    long n();

    long o();

    void p();

    void pause();

    void q();

    int r();

    int s();

    void seekTo(long j);

    int t();

    void u(TextureView textureView);

    int v();

    long w();

    boolean x();

    void y(TrackSelectionParameters trackSelectionParameters);

    long z();
}
