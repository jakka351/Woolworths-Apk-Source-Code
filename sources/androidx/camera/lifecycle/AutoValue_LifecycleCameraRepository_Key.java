package androidx.camera.lifecycle;

import androidx.camera.core.internal.CameraUseCaseAdapter;
import androidx.camera.lifecycle.LifecycleCameraRepository;
import androidx.lifecycle.LifecycleOwner;

/* loaded from: classes2.dex */
final class AutoValue_LifecycleCameraRepository_Key extends LifecycleCameraRepository.Key {

    /* renamed from: a, reason: collision with root package name */
    public final LifecycleOwner f572a;
    public final CameraUseCaseAdapter.CameraId b;

    public AutoValue_LifecycleCameraRepository_Key(LifecycleOwner lifecycleOwner, CameraUseCaseAdapter.CameraId cameraId) {
        if (lifecycleOwner == null) {
            throw new NullPointerException("Null lifecycleOwner");
        }
        this.f572a = lifecycleOwner;
        if (cameraId == null) {
            throw new NullPointerException("Null cameraId");
        }
        this.b = cameraId;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.Key
    public final CameraUseCaseAdapter.CameraId a() {
        return this.b;
    }

    @Override // androidx.camera.lifecycle.LifecycleCameraRepository.Key
    public final LifecycleOwner b() {
        return this.f572a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LifecycleCameraRepository.Key)) {
            return false;
        }
        LifecycleCameraRepository.Key key = (LifecycleCameraRepository.Key) obj;
        return this.f572a.equals(key.b()) && this.b.equals(key.a());
    }

    public final int hashCode() {
        return ((this.f572a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "Key{lifecycleOwner=" + this.f572a + ", cameraId=" + this.b + "}";
    }
}
