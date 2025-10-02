package androidx.camera.core;

import androidx.camera.core.CameraState;

/* loaded from: classes2.dex */
final class AutoValue_CameraState extends CameraState {

    /* renamed from: a, reason: collision with root package name */
    public final CameraState.Type f386a;
    public final CameraState.StateError b;

    public AutoValue_CameraState(CameraState.Type type, CameraState.StateError stateError) {
        this.f386a = type;
        this.b = stateError;
    }

    @Override // androidx.camera.core.CameraState
    public final CameraState.StateError c() {
        return this.b;
    }

    @Override // androidx.camera.core.CameraState
    public final CameraState.Type d() {
        return this.f386a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraState)) {
            return false;
        }
        CameraState cameraState = (CameraState) obj;
        if (!this.f386a.equals(cameraState.d())) {
            return false;
        }
        CameraState.StateError stateError = this.b;
        return stateError == null ? cameraState.c() == null : stateError.equals(cameraState.c());
    }

    public final int hashCode() {
        int iHashCode = (this.f386a.hashCode() ^ 1000003) * 1000003;
        CameraState.StateError stateError = this.b;
        return iHashCode ^ (stateError == null ? 0 : stateError.hashCode());
    }

    public final String toString() {
        return "CameraState{type=" + this.f386a + ", error=" + this.b + "}";
    }
}
