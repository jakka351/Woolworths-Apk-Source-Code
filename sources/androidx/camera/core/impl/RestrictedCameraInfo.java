package androidx.camera.core.impl;

import androidx.camera.core.ExposureState;
import androidx.camera.core.impl.utils.SessionProcessorUtil;
import androidx.camera.core.internal.ImmutableZoomState;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public class RestrictedCameraInfo extends ForwardingCameraInfo {
    public final CameraInfoInternal b;
    public final SessionProcessor c;
    public final CameraConfig d;

    /* renamed from: androidx.camera.core.impl.RestrictedCameraInfo$1, reason: invalid class name */
    class AnonymousClass1 implements ExposureState {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface CameraOperation {
    }

    public RestrictedCameraInfo(CameraInfoInternal cameraInfoInternal, CameraConfig cameraConfig) {
        super(cameraInfoInternal);
        this.b = cameraInfoInternal;
        this.d = cameraConfig;
        this.c = cameraConfig.K();
        cameraConfig.y();
        cameraConfig.T();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.impl.CameraInfoInternal
    public final CameraInfoInternal getImplementation() {
        return this.b;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public final LiveData h() {
        return !SessionProcessorUtil.a(this.c, 0) ? new MutableLiveData(ImmutableZoomState.e()) : this.b.h();
    }

    @Override // androidx.camera.core.impl.ForwardingCameraInfo, androidx.camera.core.CameraInfo
    public final LiveData m() {
        return !SessionProcessorUtil.a(this.c, 6) ? new MutableLiveData(0) : this.b.m();
    }
}
