package androidx.camera.core.impl;

import androidx.camera.core.FocusMeteringAction;
import androidx.camera.core.impl.utils.SessionProcessorUtil;
import androidx.camera.core.impl.utils.futures.Futures;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: classes2.dex */
public class RestrictedCameraControl extends ForwardingCameraControl {
    public final CameraControlInternal c;
    public final SessionProcessor d;

    public RestrictedCameraControl(CameraControlInternal cameraControlInternal, SessionProcessor sessionProcessor) {
        super(cameraControlInternal);
        this.c = cameraControlInternal;
        this.d = sessionProcessor;
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public final ListenableFuture b(float f) {
        return !SessionProcessorUtil.a(this.d, 0) ? Futures.e(new IllegalStateException("Zoom is not supported")) : this.c.b(f);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public final ListenableFuture c(float f) {
        return !SessionProcessorUtil.a(this.d, 0) ? Futures.e(new IllegalStateException("Zoom is not supported")) : this.c.c(f);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public final ListenableFuture d(boolean z) {
        return !SessionProcessorUtil.a(this.d, 6) ? Futures.e(new IllegalStateException("Torch is not supported")) : this.c.d(z);
    }

    @Override // androidx.camera.core.impl.ForwardingCameraControl, androidx.camera.core.CameraControl
    public final ListenableFuture f(FocusMeteringAction focusMeteringAction) {
        boolean z;
        SessionProcessor sessionProcessor = this.d;
        if (sessionProcessor != null) {
            FocusMeteringAction.Builder builder = new FocusMeteringAction.Builder(focusMeteringAction);
            boolean z2 = true;
            if (focusMeteringAction.f401a.isEmpty() || SessionProcessorUtil.a(sessionProcessor, 1, 2)) {
                z = false;
            } else {
                builder.b(1);
                z = true;
            }
            if (!focusMeteringAction.b.isEmpty() && !SessionProcessorUtil.a(sessionProcessor, 3)) {
                builder.b(2);
                z = true;
            }
            if (focusMeteringAction.c.isEmpty() || SessionProcessorUtil.a(sessionProcessor, 4)) {
                z2 = z;
            } else {
                builder.b(4);
            }
            if (z2) {
                FocusMeteringAction focusMeteringAction2 = new FocusMeteringAction(builder);
                focusMeteringAction = (focusMeteringAction2.f401a.isEmpty() && focusMeteringAction2.b.isEmpty() && focusMeteringAction2.c.isEmpty()) ? null : new FocusMeteringAction(builder);
            }
        }
        return focusMeteringAction == null ? Futures.e(new IllegalStateException("FocusMetering is not supported")) : this.c.f(focusMeteringAction);
    }
}
