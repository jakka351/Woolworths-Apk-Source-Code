package androidx.camera.core;

import androidx.camera.core.SurfaceOutput;

/* loaded from: classes2.dex */
final class AutoValue_SurfaceOutput_Event extends SurfaceOutput.Event {

    /* renamed from: a, reason: collision with root package name */
    public final SurfaceOutput f390a;

    public AutoValue_SurfaceOutput_Event(SurfaceOutput surfaceOutput) {
        this.f390a = surfaceOutput;
    }

    @Override // androidx.camera.core.SurfaceOutput.Event
    public final int a() {
        return 0;
    }

    @Override // androidx.camera.core.SurfaceOutput.Event
    public final SurfaceOutput b() {
        return this.f390a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SurfaceOutput.Event)) {
            return false;
        }
        SurfaceOutput.Event event = (SurfaceOutput.Event) obj;
        return event.a() == 0 && this.f390a.equals(event.b());
    }

    public final int hashCode() {
        return this.f390a.hashCode() ^ (-721379959);
    }

    public final String toString() {
        return "Event{eventCode=0, surfaceOutput=" + this.f390a + "}";
    }
}
