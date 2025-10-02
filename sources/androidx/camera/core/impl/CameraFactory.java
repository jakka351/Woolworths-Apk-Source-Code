package androidx.camera.core.impl;

import android.content.Context;
import androidx.camera.camera2.internal.Camera2CameraFactory;
import androidx.camera.camera2.internal.compat.CameraManagerCompat;
import androidx.camera.camera2.internal.concurrent.Camera2CameraCoordinator;
import androidx.camera.core.CameraSelector;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public interface CameraFactory {

    public interface Provider {
        Camera2CameraFactory a(Context context, CameraThreadConfig cameraThreadConfig, CameraSelector cameraSelector, long j);
    }

    CameraManagerCompat a();

    CameraInternal b(String str);

    LinkedHashSet c();

    Camera2CameraCoordinator d();
}
