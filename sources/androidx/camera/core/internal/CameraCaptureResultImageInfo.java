package androidx.camera.core.internal;

import androidx.camera.core.ImageInfo;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.TagBundle;
import androidx.camera.core.impl.utils.ExifData;

/* loaded from: classes2.dex */
public final class CameraCaptureResultImageInfo implements ImageInfo {

    /* renamed from: a, reason: collision with root package name */
    public final CameraCaptureResult f528a;

    public CameraCaptureResultImageInfo(CameraCaptureResult cameraCaptureResult) {
        this.f528a = cameraCaptureResult;
    }

    @Override // androidx.camera.core.ImageInfo
    public final TagBundle a() {
        return this.f528a.a();
    }

    @Override // androidx.camera.core.ImageInfo
    public final void b(ExifData.Builder builder) {
        this.f528a.b(builder);
    }

    @Override // androidx.camera.core.ImageInfo
    public final int c() {
        return 0;
    }

    @Override // androidx.camera.core.ImageInfo
    public final long getTimestamp() {
        return this.f528a.getTimestamp();
    }
}
