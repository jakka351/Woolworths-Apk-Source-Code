package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraInternal;
import androidx.core.util.Consumer;
import com.google.auto.value.AutoValue;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public interface SurfaceOutput extends Closeable {

    @AutoValue
    @RestrictTo
    public static abstract class CameraInputInfo {
        public static CameraInputInfo f(Size size, Rect rect, CameraInternal cameraInternal, int i, boolean z) {
            return new AutoValue_SurfaceOutput_CameraInputInfo(size, rect, cameraInternal, i, z);
        }

        public abstract CameraInternal a();

        public abstract Rect b();

        public abstract Size c();

        public abstract boolean d();

        public abstract int e();
    }

    @AutoValue
    public static abstract class Event {

        @Retention(RetentionPolicy.SOURCE)
        @RestrictTo
        public @interface EventCode {
        }

        public static Event c(SurfaceOutput surfaceOutput) {
            return new AutoValue_SurfaceOutput_Event(surfaceOutput);
        }

        public abstract int a();

        public abstract SurfaceOutput b();
    }

    Surface Q1(Executor executor, Consumer consumer);

    default int getFormat() {
        return 34;
    }

    Size getSize();

    void q0(float[] fArr, float[] fArr2);

    default void y0(float[] fArr, float[] fArr2) {
    }
}
