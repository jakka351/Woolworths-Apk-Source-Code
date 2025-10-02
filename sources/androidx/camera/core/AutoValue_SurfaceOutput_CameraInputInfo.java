package androidx.camera.core;

import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.SurfaceOutput;
import androidx.camera.core.impl.CameraInternal;

/* loaded from: classes2.dex */
final class AutoValue_SurfaceOutput_CameraInputInfo extends SurfaceOutput.CameraInputInfo {

    /* renamed from: a, reason: collision with root package name */
    public final Size f389a;
    public final Rect b;
    public final CameraInternal c;
    public final int d;
    public final boolean e;

    public AutoValue_SurfaceOutput_CameraInputInfo(Size size, Rect rect, CameraInternal cameraInternal, int i, boolean z) {
        if (size == null) {
            throw new NullPointerException("Null inputSize");
        }
        this.f389a = size;
        if (rect == null) {
            throw new NullPointerException("Null inputCropRect");
        }
        this.b = rect;
        this.c = cameraInternal;
        this.d = i;
        this.e = z;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    public final CameraInternal a() {
        return this.c;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    public final Rect b() {
        return this.b;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    public final Size c() {
        return this.f389a;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    public final boolean d() {
        return this.e;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    public final int e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceOutput.CameraInputInfo)) {
            return false;
        }
        SurfaceOutput.CameraInputInfo cameraInputInfo = (SurfaceOutput.CameraInputInfo) obj;
        if (!this.f389a.equals(cameraInputInfo.c()) || !this.b.equals(cameraInputInfo.b())) {
            return false;
        }
        CameraInternal cameraInternal = this.c;
        if (cameraInternal == null) {
            if (cameraInputInfo.a() != null) {
                return false;
            }
        } else if (!cameraInternal.equals(cameraInputInfo.a())) {
            return false;
        }
        return this.d == cameraInputInfo.e() && this.e == cameraInputInfo.d();
    }

    public final int hashCode() {
        int iHashCode = (((this.f389a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        CameraInternal cameraInternal = this.c;
        return ((((iHashCode ^ (cameraInternal == null ? 0 : cameraInternal.hashCode())) * 1000003) ^ this.d) * 1000003) ^ (this.e ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInputInfo{inputSize=");
        sb.append(this.f389a);
        sb.append(", inputCropRect=");
        sb.append(this.b);
        sb.append(", cameraInternal=");
        sb.append(this.c);
        sb.append(", rotationDegrees=");
        sb.append(this.d);
        sb.append(", mirroring=");
        return YU.a.k("}", sb, this.e);
    }
}
