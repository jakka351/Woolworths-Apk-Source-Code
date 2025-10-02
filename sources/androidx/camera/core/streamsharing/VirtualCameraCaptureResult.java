package androidx.camera.core.streamsharing;

import androidx.camera.core.impl.CameraCaptureMetaData;
import androidx.camera.core.impl.CameraCaptureResult;
import androidx.camera.core.impl.TagBundle;

/* loaded from: classes2.dex */
public class VirtualCameraCaptureResult implements CameraCaptureResult {

    /* renamed from: a, reason: collision with root package name */
    public final CameraCaptureResult f570a;
    public final TagBundle b;
    public final long c;

    public VirtualCameraCaptureResult(CameraCaptureResult cameraCaptureResult, TagBundle tagBundle, long j) {
        this.f570a = cameraCaptureResult;
        this.b = tagBundle;
        this.c = j;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final TagBundle a() {
        return this.b;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final CameraCaptureMetaData.AfState c() {
        CameraCaptureResult cameraCaptureResult = this.f570a;
        return cameraCaptureResult != null ? cameraCaptureResult.c() : CameraCaptureMetaData.AfState.d;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final CameraCaptureMetaData.AwbState d() {
        CameraCaptureResult cameraCaptureResult = this.f570a;
        return cameraCaptureResult != null ? cameraCaptureResult.d() : CameraCaptureMetaData.AwbState.d;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final CameraCaptureMetaData.AeState e() {
        CameraCaptureResult cameraCaptureResult = this.f570a;
        return cameraCaptureResult != null ? cameraCaptureResult.e() : CameraCaptureMetaData.AeState.d;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final CameraCaptureMetaData.FlashState f() {
        CameraCaptureResult cameraCaptureResult = this.f570a;
        return cameraCaptureResult != null ? cameraCaptureResult.f() : CameraCaptureMetaData.FlashState.d;
    }

    @Override // androidx.camera.core.impl.CameraCaptureResult
    public final long getTimestamp() {
        CameraCaptureResult cameraCaptureResult = this.f570a;
        if (cameraCaptureResult != null) {
            return cameraCaptureResult.getTimestamp();
        }
        long j = this.c;
        if (j != -1) {
            return j;
        }
        throw new IllegalStateException("No timestamp is available.");
    }
}
