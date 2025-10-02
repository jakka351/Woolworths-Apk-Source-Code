package androidx.camera.core;

import android.view.Surface;
import androidx.camera.core.SurfaceRequest;

/* loaded from: classes2.dex */
final class AutoValue_SurfaceRequest_Result extends SurfaceRequest.Result {

    /* renamed from: a, reason: collision with root package name */
    public final int f391a;
    public final Surface b;

    public AutoValue_SurfaceRequest_Result(int i, Surface surface) {
        this.f391a = i;
        if (surface == null) {
            throw new NullPointerException("Null surface");
        }
        this.b = surface;
    }

    @Override // androidx.camera.core.SurfaceRequest.Result
    public final int a() {
        return this.f391a;
    }

    @Override // androidx.camera.core.SurfaceRequest.Result
    public final Surface b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceRequest.Result)) {
            return false;
        }
        SurfaceRequest.Result result = (SurfaceRequest.Result) obj;
        return this.f391a == result.a() && this.b.equals(result.b());
    }

    public final int hashCode() {
        return ((this.f391a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "Result{resultCode=" + this.f391a + ", surface=" + this.b + "}";
    }
}
