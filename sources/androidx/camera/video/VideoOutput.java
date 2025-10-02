package androidx.camera.video;

import androidx.annotation.RestrictTo;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.ConstantObservable;
import androidx.camera.core.impl.Observable;
import androidx.camera.core.impl.Timebase;

/* loaded from: classes2.dex */
public interface VideoOutput {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @RestrictTo
    public static final class SourceState {
        public static final SourceState d;
        public static final SourceState e;
        public static final SourceState f;
        public static final /* synthetic */ SourceState[] g;

        static {
            SourceState sourceState = new SourceState("ACTIVE_STREAMING", 0);
            d = sourceState;
            SourceState sourceState2 = new SourceState("ACTIVE_NON_STREAMING", 1);
            e = sourceState2;
            SourceState sourceState3 = new SourceState("INACTIVE", 2);
            f = sourceState3;
            g = new SourceState[]{sourceState, sourceState2, sourceState3};
        }

        public static SourceState valueOf(String str) {
            return (SourceState) Enum.valueOf(SourceState.class, str);
        }

        public static SourceState[] values() {
            return (SourceState[]) g.clone();
        }
    }

    void a(SurfaceRequest surfaceRequest);

    default void b(SurfaceRequest surfaceRequest, Timebase timebase) {
        a(surfaceRequest);
    }

    default Observable c() {
        return ConstantObservable.b;
    }

    default Observable d() {
        return StreamInfo.c;
    }

    default void e(SourceState sourceState) {
    }

    default VideoCapabilities f(CameraInfo cameraInfo) {
        return VideoCapabilities.f596a;
    }

    default Observable g() {
        return new ConstantObservable(Boolean.FALSE);
    }
}
