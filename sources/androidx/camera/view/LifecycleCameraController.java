package androidx.camera.view;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public final class LifecycleCameraController extends CameraController {
    public LifecycleCameraController(@NonNull Context context) {
        super(context);
    }

    @Override // androidx.camera.view.CameraController
    public final void j() {
        Log.d("CamLifecycleController", "Lifecycle is not set.");
    }
}
