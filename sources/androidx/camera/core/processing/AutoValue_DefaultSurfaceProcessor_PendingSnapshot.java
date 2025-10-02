package androidx.camera.core.processing;

import androidx.camera.core.processing.DefaultSurfaceProcessor;
import androidx.concurrent.futures.CallbackToFutureAdapter;

/* loaded from: classes2.dex */
final class AutoValue_DefaultSurfaceProcessor_PendingSnapshot extends DefaultSurfaceProcessor.PendingSnapshot {

    /* renamed from: a, reason: collision with root package name */
    public final int f546a;
    public final int b;
    public final CallbackToFutureAdapter.Completer c;

    public AutoValue_DefaultSurfaceProcessor_PendingSnapshot(int i, int i2, CallbackToFutureAdapter.Completer completer) {
        this.f546a = i;
        this.b = i2;
        this.c = completer;
    }

    @Override // androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot
    public final CallbackToFutureAdapter.Completer a() {
        return this.c;
    }

    @Override // androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot
    public final int b() {
        return this.f546a;
    }

    @Override // androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot
    public final int c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DefaultSurfaceProcessor.PendingSnapshot)) {
            return false;
        }
        DefaultSurfaceProcessor.PendingSnapshot pendingSnapshot = (DefaultSurfaceProcessor.PendingSnapshot) obj;
        return this.f546a == pendingSnapshot.b() && this.b == pendingSnapshot.c() && this.c.equals(pendingSnapshot.a());
    }

    public final int hashCode() {
        return ((((this.f546a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "PendingSnapshot{jpegQuality=" + this.f546a + ", rotationDegrees=" + this.b + ", completer=" + this.c + "}";
    }
}
