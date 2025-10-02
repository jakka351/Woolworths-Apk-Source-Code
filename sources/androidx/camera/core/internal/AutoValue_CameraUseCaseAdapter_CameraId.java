package androidx.camera.core.internal;

import androidx.camera.core.impl.Identifier;
import androidx.camera.core.internal.CameraUseCaseAdapter;

/* loaded from: classes2.dex */
final class AutoValue_CameraUseCaseAdapter_CameraId extends CameraUseCaseAdapter.CameraId {

    /* renamed from: a, reason: collision with root package name */
    public final String f526a;
    public final Identifier b;

    public AutoValue_CameraUseCaseAdapter_CameraId(String str, Identifier identifier) {
        if (str == null) {
            throw new NullPointerException("Null cameraIdString");
        }
        this.f526a = str;
        if (identifier == null) {
            throw new NullPointerException("Null cameraConfigId");
        }
        this.b = identifier;
    }

    @Override // androidx.camera.core.internal.CameraUseCaseAdapter.CameraId
    public final Identifier b() {
        return this.b;
    }

    @Override // androidx.camera.core.internal.CameraUseCaseAdapter.CameraId
    public final String c() {
        return this.f526a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraUseCaseAdapter.CameraId)) {
            return false;
        }
        CameraUseCaseAdapter.CameraId cameraId = (CameraUseCaseAdapter.CameraId) obj;
        return this.f526a.equals(cameraId.c()) && this.b.equals(cameraId.b());
    }

    public final int hashCode() {
        return ((this.f526a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CameraId{cameraIdString=" + this.f526a + ", cameraConfigId=" + this.b + "}";
    }
}
