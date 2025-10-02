package androidx.camera.core.internal.utils;

import androidx.camera.core.ImageInfo;
import androidx.camera.core.ImageProxy;
import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.internal.CameraCaptureResultImageInfo;
import androidx.camera.core.internal.utils.RingBuffer;

/* loaded from: classes2.dex */
public final class ZslRingBuffer extends ArrayRingBuffer<ImageProxy> {
    public final void c(ImageProxy imageProxy) {
        Object objA;
        ImageInfo imageInfoM0 = imageProxy.M0();
        CameraCaptureResult cameraCaptureResult = imageInfoM0 instanceof CameraCaptureResultImageInfo ? ((CameraCaptureResultImageInfo) imageInfoM0).f528a : null;
        if ((cameraCaptureResult.c() != CameraCaptureMetaData.AfState.i && cameraCaptureResult.c() != CameraCaptureMetaData.AfState.g) || cameraCaptureResult.e() != CameraCaptureMetaData.AeState.h || cameraCaptureResult.d() != CameraCaptureMetaData.AwbState.g) {
            this.d.b(imageProxy);
            return;
        }
        synchronized (this.c) {
            try {
                objA = this.b.size() >= this.f542a ? a() : null;
                this.b.addFirst(imageProxy);
            } catch (Throwable th) {
                throw th;
            }
        }
        RingBuffer.OnRemoveCallback onRemoveCallback = this.d;
        if (onRemoveCallback == null || objA == null) {
            return;
        }
        onRemoveCallback.b(objA);
    }
}
