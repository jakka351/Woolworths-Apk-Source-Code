package androidx.camera.core;

import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.SurfaceRequest;

/* loaded from: classes2.dex */
final class AutoValue_SurfaceRequest_TransformationInfo extends SurfaceRequest.TransformationInfo {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f392a;
    public final int b;
    public final int c;
    public final boolean d;
    public final Matrix e;
    public final boolean f;

    public AutoValue_SurfaceRequest_TransformationInfo(Rect rect, int i, int i2, boolean z, Matrix matrix, boolean z2) {
        if (rect == null) {
            throw new NullPointerException("Null getCropRect");
        }
        this.f392a = rect;
        this.b = i;
        this.c = i2;
        this.d = z;
        if (matrix == null) {
            throw new NullPointerException("Null getSensorToBufferTransform");
        }
        this.e = matrix;
        this.f = z2;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public final Rect a() {
        return this.f392a;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public final int b() {
        return this.b;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public final Matrix c() {
        return this.e;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public final int d() {
        return this.c;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceRequest.TransformationInfo)) {
            return false;
        }
        SurfaceRequest.TransformationInfo transformationInfo = (SurfaceRequest.TransformationInfo) obj;
        return this.f392a.equals(transformationInfo.a()) && this.b == transformationInfo.b() && this.c == transformationInfo.d() && this.d == transformationInfo.e() && this.e.equals(transformationInfo.c()) && this.f == transformationInfo.f();
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public final boolean f() {
        return this.f;
    }

    public final int hashCode() {
        return ((((((((((this.f392a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (this.f ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransformationInfo{getCropRect=");
        sb.append(this.f392a);
        sb.append(", getRotationDegrees=");
        sb.append(this.b);
        sb.append(", getTargetRotation=");
        sb.append(this.c);
        sb.append(", hasCameraTransform=");
        sb.append(this.d);
        sb.append(", getSensorToBufferTransform=");
        sb.append(this.e);
        sb.append(", isMirroring=");
        return YU.a.k("}", sb, this.f);
    }
}
