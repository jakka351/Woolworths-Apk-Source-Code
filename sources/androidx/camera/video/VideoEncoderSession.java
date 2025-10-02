package androidx.camera.video;

import android.view.Surface;
import androidx.camera.core.Logger;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.utils.futures.Futures;
import androidx.camera.video.internal.encoder.Encoder;
import androidx.camera.video.internal.encoder.EncoderFactory;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class VideoEncoderSession {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f603a;
    public final Executor b;
    public final EncoderFactory c;
    public Encoder d = null;
    public Surface e = null;
    public SurfaceRequest f = null;
    public Executor g = null;
    public b h = null;
    public VideoEncoderState i = VideoEncoderState.d;
    public ListenableFuture j = Futures.e(new IllegalStateException("Cannot close the encoder before configuring."));
    public CallbackToFutureAdapter.Completer k = null;
    public ListenableFuture l = Futures.e(new IllegalStateException("Cannot close the encoder before configuring."));
    public CallbackToFutureAdapter.Completer m = null;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class VideoEncoderState {
        public static final VideoEncoderState d;
        public static final VideoEncoderState e;
        public static final VideoEncoderState f;
        public static final VideoEncoderState g;
        public static final VideoEncoderState h;
        public static final /* synthetic */ VideoEncoderState[] i;

        static {
            VideoEncoderState videoEncoderState = new VideoEncoderState("NOT_INITIALIZED", 0);
            d = videoEncoderState;
            VideoEncoderState videoEncoderState2 = new VideoEncoderState("INITIALIZING", 1);
            e = videoEncoderState2;
            VideoEncoderState videoEncoderState3 = new VideoEncoderState("PENDING_RELEASE", 2);
            f = videoEncoderState3;
            VideoEncoderState videoEncoderState4 = new VideoEncoderState("READY", 3);
            g = videoEncoderState4;
            VideoEncoderState videoEncoderState5 = new VideoEncoderState("RELEASED", 4);
            h = videoEncoderState5;
            i = new VideoEncoderState[]{videoEncoderState, videoEncoderState2, videoEncoderState3, videoEncoderState4, videoEncoderState5};
        }

        public static VideoEncoderState valueOf(String str) {
            return (VideoEncoderState) Enum.valueOf(VideoEncoderState.class, str);
        }

        public static VideoEncoderState[] values() {
            return (VideoEncoderState[]) i.clone();
        }
    }

    public VideoEncoderSession(EncoderFactory encoderFactory, Executor executor, Executor executor2) {
        this.f603a = executor2;
        this.b = executor;
        this.c = encoderFactory;
    }

    public final void a() {
        int iOrdinal = this.i.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            b();
            return;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            Logger.a("VideoEncoderSession", "closeInternal in " + this.i + " state");
            this.i = VideoEncoderState.f;
            return;
        }
        if (iOrdinal == 4) {
            Logger.a("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
            return;
        }
        throw new IllegalStateException("State " + this.i + " is not handled");
    }

    public final void b() {
        int iOrdinal = this.i.ordinal();
        VideoEncoderState videoEncoderState = VideoEncoderState.h;
        if (iOrdinal == 0) {
            this.i = videoEncoderState;
            return;
        }
        if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new IllegalStateException("State " + this.i + " is not handled");
            }
            Logger.a("VideoEncoderSession", "terminateNow in " + this.i + ", No-op");
            return;
        }
        this.i = videoEncoderState;
        this.m.b(this.d);
        this.f = null;
        if (this.d == null) {
            Logger.e("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            this.k.b(null);
            return;
        }
        Logger.a("VideoEncoderSession", "VideoEncoder is releasing: " + this.d);
        this.d.release();
        this.d.d().addListener(new e(this, 1), this.b);
        this.d = null;
    }

    public final String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString(this.f, "SURFACE_REQUEST_NOT_CONFIGURED");
    }
}
