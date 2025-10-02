package androidx.camera.camera2.internal.compat;

import android.hardware.camera2.CameraAccessException;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes2.dex */
public class CameraAccessExceptionCompat extends Exception {
    public static final Set e = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));
    public static final Set f = Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));
    public final int d;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface AccessError {
    }

    public CameraAccessExceptionCompat(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.d = cameraAccessException.getReason();
    }

    public CameraAccessExceptionCompat(RuntimeException runtimeException) {
        super("Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.", runtimeException);
        this.d = 10001;
        if (e.contains(10001)) {
            new CameraAccessException(10001, null, runtimeException);
        }
    }

    public CameraAccessExceptionCompat(String str, AssertionError assertionError) {
        super(String.format("%s (%d): %s", "CAMERA_CHARACTERISTICS_CREATION_ERROR", 10002, str), assertionError);
        this.d = 10002;
        if (e.contains(10002)) {
            new CameraAccessException(10002, str, assertionError);
        }
    }
}
