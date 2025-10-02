package androidx.camera.camera2.internal;

import android.hardware.camera2.TotalCaptureResult;
import androidx.camera.camera2.internal.Camera2CapturePipeline;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.internal.utils.RingBuffer;

/* loaded from: classes2.dex */
public final /* synthetic */ class t implements Camera2CapturePipeline.ResultListener.Checker, RingBuffer.OnRemoveCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f378a;

    @Override // androidx.camera.camera2.internal.Camera2CapturePipeline.ResultListener.Checker
    public boolean a(TotalCaptureResult totalCaptureResult) {
        switch (this.f378a) {
            case 0:
                int i = Camera2CapturePipeline.Pipeline.l;
                return Camera2CapturePipeline.b(totalCaptureResult, false);
            case 1:
                int i2 = Camera2CapturePipeline.ScreenFlashTask.g;
                return Camera2CapturePipeline.b(totalCaptureResult, false);
            default:
                int i3 = Camera2CapturePipeline.TorchTask.h;
                return Camera2CapturePipeline.b(totalCaptureResult, true);
        }
    }

    @Override // androidx.camera.core.internal.utils.RingBuffer.OnRemoveCallback
    public void b(Object obj) throws Exception {
        ((ImageProxy) obj).close();
    }
}
