package androidx.camera.core.imagecapture;

/* loaded from: classes2.dex */
final class AutoValue_TakePictureRequest extends TakePictureRequest {
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof TakePictureRequest) {
            throw null;
        }
        return false;
    }

    public final int hashCode() {
        throw null;
    }

    public final String toString() {
        return "TakePictureRequest{appExecutor=null, inMemoryCallback=null, onDiskCallback=null, outputFileOptions=null, cropRect=null, sensorToBufferTransform=null, rotationDegrees=0, jpegQuality=0, captureMode=0, sessionConfigCameraCaptureCallbacks=null}";
    }
}
