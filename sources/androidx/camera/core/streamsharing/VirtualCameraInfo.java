package androidx.camera.core.streamsharing;

import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.ForwardingCameraInfo;
import androidx.camera.core.impl.utils.TransformUtils;
import java.util.UUID;

/* loaded from: classes2.dex */
public class VirtualCameraInfo extends ForwardingCameraInfo {
    public final String b;
    public int c;

    public VirtualCameraInfo(CameraInfoInternal cameraInfoInternal) {
        super(cameraInfoInternal);
        this.b = "virtual-" + cameraInfoInternal.b() + "-" + UUID.randomUUID().toString();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.impl.CameraInfoInternal
    public final String b() {
        return this.b;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public final int f(int i) {
        return TransformUtils.h(this.f490a.f(i) - this.c);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public final int i() {
        return f(0);
    }
}
