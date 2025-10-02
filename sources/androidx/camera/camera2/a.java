package androidx.camera.camera2;

import android.content.Context;
import androidx.camera.camera2.internal.Camera2CameraFactory;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.impl.CameraFactory;
import androidx.camera.core.impl.CameraThreadConfig;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements CameraFactory.Provider {
    @Override // androidx.camera.core.impl.CameraFactory.Provider
    public final Camera2CameraFactory a(Context context, CameraThreadConfig cameraThreadConfig, CameraSelector cameraSelector, long j) {
        return new Camera2CameraFactory(context, cameraThreadConfig, cameraSelector, j);
    }
}
