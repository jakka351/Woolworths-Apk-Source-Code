package androidx.camera.core;

import androidx.camera.core.CameraState;

/* loaded from: classes2.dex */
final class AutoValue_CameraState_StateError extends CameraState.StateError {

    /* renamed from: a, reason: collision with root package name */
    public final int f387a;
    public final Throwable b;

    public AutoValue_CameraState_StateError(int i, Throwable th) {
        this.f387a = i;
        this.b = th;
    }

    @Override // androidx.camera.core.CameraState.StateError
    public final Throwable c() {
        return this.b;
    }

    @Override // androidx.camera.core.CameraState.StateError
    public final int d() {
        return this.f387a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraState.StateError)) {
            return false;
        }
        CameraState.StateError stateError = (CameraState.StateError) obj;
        if (this.f387a != stateError.d()) {
            return false;
        }
        Throwable th = this.b;
        return th == null ? stateError.c() == null : th.equals(stateError.c());
    }

    public final int hashCode() {
        int i = (this.f387a ^ 1000003) * 1000003;
        Throwable th = this.b;
        return i ^ (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "StateError{code=" + this.f387a + ", cause=" + this.b + "}";
    }
}
