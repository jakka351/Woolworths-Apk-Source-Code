package androidx.camera.core.concurrent;

import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@RestrictTo
/* loaded from: classes2.dex */
public interface CameraCoordinator {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface CameraOperatingMode {
    }

    public interface ConcurrentCameraModeListener {
        void a(int i, int i2);
    }

    String a(String str);

    int b();
}
