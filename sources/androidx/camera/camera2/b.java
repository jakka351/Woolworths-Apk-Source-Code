package androidx.camera.camera2;

import android.content.Context;
import androidx.camera.camera2.internal.Camera2DeviceSurfaceManager;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.InitializationException;
import androidx.camera.core.impl.CameraDeviceSurfaceManager;
import java.util.Set;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements CameraDeviceSurfaceManager.Provider {
    @Override // androidx.camera.core.impl.CameraDeviceSurfaceManager.Provider
    public final Camera2DeviceSurfaceManager a(Context context, Object obj, Set set) throws InitializationException {
        try {
            return new Camera2DeviceSurfaceManager(context, obj, set);
        } catch (CameraUnavailableException e) {
            throw new InitializationException(e);
        }
    }
}
