package androidx.camera.core.impl;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
final class AutoValue_CameraThreadConfig extends CameraThreadConfig {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f458a;
    public final Handler b;

    public AutoValue_CameraThreadConfig(Executor executor, Handler handler) {
        if (executor == null) {
            throw new NullPointerException("Null cameraExecutor");
        }
        this.f458a = executor;
        if (handler == null) {
            throw new NullPointerException("Null schedulerHandler");
        }
        this.b = handler;
    }

    @Override // androidx.camera.core.impl.CameraThreadConfig
    public final Executor b() {
        return this.f458a;
    }

    @Override // androidx.camera.core.impl.CameraThreadConfig
    public final Handler c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CameraThreadConfig)) {
            return false;
        }
        CameraThreadConfig cameraThreadConfig = (CameraThreadConfig) obj;
        return this.f458a.equals(cameraThreadConfig.b()) && this.b.equals(cameraThreadConfig.c());
    }

    public final int hashCode() {
        return ((this.f458a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.f458a + ", schedulerHandler=" + this.b + "}";
    }
}
