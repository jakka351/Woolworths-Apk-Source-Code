package androidx.camera.core.imagecapture;

import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.imagecapture.TakePictureManager;

/* loaded from: classes2.dex */
final class AutoValue_TakePictureManager_CaptureError extends TakePictureManager.CaptureError {

    /* renamed from: a, reason: collision with root package name */
    public final int f440a;
    public final ImageCaptureException b;

    public AutoValue_TakePictureManager_CaptureError(int i, ImageCaptureException imageCaptureException) {
        this.f440a = i;
        this.b = imageCaptureException;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager.CaptureError
    public final ImageCaptureException a() {
        return this.b;
    }

    @Override // androidx.camera.core.imagecapture.TakePictureManager.CaptureError
    public final int b() {
        return this.f440a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TakePictureManager.CaptureError)) {
            return false;
        }
        TakePictureManager.CaptureError captureError = (TakePictureManager.CaptureError) obj;
        return this.f440a == captureError.b() && this.b.equals(captureError.a());
    }

    public final int hashCode() {
        return ((this.f440a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CaptureError{requestId=" + this.f440a + ", imageCaptureException=" + this.b + "}";
    }
}
